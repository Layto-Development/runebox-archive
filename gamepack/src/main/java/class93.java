import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class class93 implements Runnable {
   public static String field1298;
   boolean field1297 = false;
   class294 field1294 = null;
   class294 field1295 = null;
   Thread field1296;

   public class93() {
      field1298 = "Unknown";
      class523.field4125 = "1.6";

      try {
         field1298 = System.getProperty("java.vendor");
         class523.field4125 = System.getProperty("java.version");
      } catch (Exception var2) {
      }

      this.field1297 = false;
      this.field1296 = new Thread(this);
      this.field1296.setPriority(10);
      this.field1296.setDaemon(true);
      this.field1296.start();
   }

   public final void method729() {
      synchronized(this) {
         this.field1297 = true;
         this.notifyAll();
      }

      try {
         this.field1296.join();
      } catch (InterruptedException var4) {
      }

   }

   public final void run() {
      while(true) {
         class294 var1;
         synchronized(this) {
            while(true) {
               if (this.field1297) {
                  return;
               }

               if (this.field1294 != null) {
                  var1 = this.field1294;
                  this.field1294 = this.field1294.field2476;
                  if (null == this.field1294) {
                     this.field1295 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var7) {
               }
            }
         }

         try {
            int var2 = var1.field2475;
            if (var2 == 1) {
               var1.field2474 = new Socket(InetAddress.getByName((String)var1.field2477), var1.field2478);
            } else if (var2 == 2) {
               Thread var3 = new Thread((Runnable)var1.field2477);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.field2478);
               var1.field2474 = var3;
            } else if (var2 == 4) {
               var1.field2474 = new DataInputStream(((URL)var1.field2477).openStream());
            }

            var1.field2473 = 1;
         } catch (ThreadDeath var5) {
            throw var5;
         } catch (Throwable var6) {
            var1.field2473 = 2;
         }
      }
   }

   final class294 method728(int var1, int var2, int var3, Object var4) {
      class294 var6 = new class294();
      var6.field2475 = var1;
      var6.field2478 = var2;
      var6.field2477 = var4;
      synchronized(this) {
         if (null != this.field1295) {
            this.field1295.field2476 = var6;
            this.field1295 = var6;
         } else {
            this.field1295 = this.field1294 = var6;
         }

         this.notify();
         return var6;
      }
   }

   public final class294 method726(String var1, int var2) {
      return this.method728(1, var2, 0, var1);
   }

   public final class294 method727(Runnable var1, int var2) {
      return this.method728(2, var2, 0, var1);
   }
}
