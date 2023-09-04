import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public abstract class class69 implements Runnable {
   static int field1134;
   int field1132;
   Queue field1130 = new LinkedList();
   final Thread field1133 = new Thread(this);
   volatile boolean field1131;

   class69(int var1) {
      this.field1133.setPriority(1);
      this.field1133.start();
      this.field1132 = var1;
   }

   abstract void method655(class539 var1) throws IOException;

   public void run() {
      while(!this.field1131) {
         try {
            class539 var1;
            synchronized(this) {
               var1 = (class539)this.field1130.poll();
               if (var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                  }
                  continue;
               }
            }

            this.method655(var1);
         } catch (Exception var7) {
            class194.method1208((String)null, var7);
         }
      }

   }

   int method659(URLConnection var1) {
      int var3 = class539.field4261;
      if (var1 != null) {
         try {
            if (var1 instanceof HttpURLConnection) {
               var3 = ((HttpURLConnection)var1).getResponseCode();
            }
         } catch (IOException var5) {
         }
      }

      return var3;
   }

   void method660(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1132);
   }

   void method656(URLConnection var1, class539 var2) {
      DataInputStream var4 = null;

      try {
         int var6 = var1.getContentLength();
         var4 = new DataInputStream(var1.getInputStream());
         byte[] var5;
         if (var6 >= 0) {
            var5 = new byte[var6];
            var4.readFully(var5);
         } else {
            var5 = new byte[0];
            byte[] var7 = class218.method1316(5000);

            byte[] var9;
            for(int var8 = var4.read(var7, 0, var7.length); var8 > -1; var5 = var9) {
               var9 = new byte[var5.length + var8];
               System.arraycopy(var5, 0, var9, 0, var5.length);
               System.arraycopy(var7, 0, var9, var5.length, var8);
            }

            class218.method1318(var7);
         }

         var2.field4263 = var5;
      } catch (IOException var15) {
         var2.field4263 = null;
      } finally {
         var2.field4262 = this.method659(var1);
      }

      if (var4 != null) {
         try {
            var4.close();
         } catch (IOException var14) {
         }
      }

   }

   public class539 method657(URL var1) {
      class539 var3 = new class539(var1);
      synchronized(this) {
         this.field1130.add(var3);
         this.notify();
         return var3;
      }
   }

   public void method658() {
      this.field1131 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field1133.join();
      } catch (InterruptedException var5) {
      }

   }

   public static void method661() {
      class228.field2106.clear();
   }
}
