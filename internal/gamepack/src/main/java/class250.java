import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class class250 implements Runnable {
   public static String field1802;
   boolean field1801 = false;
   class388 field1798 = null;
   class388 field1799 = null;
   Thread field1800;

   public class250() {
      field1802 = "Unknown";
      class529.field4180 = "1.6";

      try {
         field1802 = System.getProperty("java.vendor");
         class529.field4180 = System.getProperty("java.version");
      } catch (Exception var2) {
      }

      this.field1801 = false;
      this.field1800 = new Thread(this);
      this.field1800.setPriority(10);
      this.field1800.setDaemon(true);
      this.field1800.start();
   }

   public final void method1193() {
      synchronized(this) {
         this.field1801 = true;
         this.notifyAll();
      }

      try {
         this.field1800.join();
      } catch (InterruptedException var4) {
      }

   }

   public final void run() {
      while(true) {
         class388 var1;
         synchronized(this) {
            while(true) {
               if (this.field1801) {
                  return;
               }

               if (this.field1798 != null) {
                  var1 = this.field1798;
                  this.field1798 = this.field1798.field2742;
                  if (null == this.field1798) {
                     this.field1799 = null;
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
            int var2 = var1.field2741;
            if (var2 == 1) {
               var1.field2740 = new Socket(InetAddress.getByName((String)var1.field2743), var1.field2744);
            } else if (var2 == 2) {
               Thread var3 = new Thread((Runnable)var1.field2743);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.field2744);
               var1.field2740 = var3;
            } else if (var2 == 4) {
               var1.field2740 = new DataInputStream(((URL)var1.field2743).openStream());
            }

            var1.field2739 = 1;
         } catch (ThreadDeath var5) {
            throw var5;
         } catch (Throwable var6) {
            var1.field2739 = 2;
         }
      }
   }

   final class388 method1192(int var1, int var2, int var3, Object var4) {
      class388 var6 = new class388();
      var6.field2741 = var1;
      var6.field2744 = var2;
      var6.field2743 = var4;
      synchronized(this) {
         if (null != this.field1799) {
            this.field1799.field2742 = var6;
            this.field1799 = var6;
         } else {
            this.field1799 = this.field1798 = var6;
         }

         this.notify();
         return var6;
      }
   }

   public final class388 method1190(String var1, int var2) {
      return this.method1192(1, var2, 0, var1);
   }

   public final class388 method1191(Runnable var1, int var2) {
      return this.method1192(2, var2, 0, var1);
   }
}
