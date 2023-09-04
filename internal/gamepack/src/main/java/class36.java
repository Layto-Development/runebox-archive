import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public abstract class class36 implements Runnable {
   static int field314;
   int field312;
   Queue field310 = new LinkedList();
   final Thread field313 = new Thread(this);
   volatile boolean field311;

   class36(int var1) {
      this.field313.setPriority(1);
      this.field313.start();
      this.field312 = var1;
   }

   abstract void method150(class208 var1) throws IOException;

   public void run() {
      while(!this.field311) {
         try {
            class208 var1;
            synchronized(this) {
               var1 = (class208)this.field310.poll();
               if (var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                  }
                  continue;
               }
            }

            this.method150(var1);
         } catch (Exception var7) {
            class431.method2006((String)null, var7);
         }
      }

   }

   int method154(URLConnection var1) {
      int var3 = class208.field1602;
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

   void method155(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field312);
   }

   void method151(URLConnection var1, class208 var2) {
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
            byte[] var7 = class159.method610(5000);

            byte[] var9;
            for(int var8 = var4.read(var7, 0, var7.length); var8 > -1; var5 = var9) {
               var9 = new byte[var5.length + var8];
               System.arraycopy(var5, 0, var9, 0, var5.length);
               System.arraycopy(var7, 0, var9, var5.length, var8);
            }

            class159.method612(var7);
         }

         var2.field1604 = var5;
      } catch (IOException var15) {
         var2.field1604 = null;
      } finally {
         var2.field1603 = this.method154(var1);
      }

      if (var4 != null) {
         try {
            var4.close();
         } catch (IOException var14) {
         }
      }

   }

   public class208 method152(URL var1) {
      class208 var3 = new class208(var1);
      synchronized(this) {
         this.field310.add(var3);
         this.notify();
         return var3;
      }
   }

   public void method153() {
      this.field311 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field313.join();
      } catch (InterruptedException var5) {
      }

   }

   public static void method156() {
      class469.field3717.clear();
   }
}
