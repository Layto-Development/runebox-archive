import java.io.IOException;
import java.io.OutputStream;

public class class358 implements Runnable {
   boolean field2593;
   byte[] field2594;
   int field2591;
   int field2595 = 0;
   int field2596 = 0;
   IOException field2597;
   OutputStream field2592;
   Thread field2598;

   class358(OutputStream var1, int var2) {
      this.field2592 = var1;
      this.field2591 = var2 + 1;
      this.field2594 = new byte[this.field2591];
      this.field2598 = new Thread(this);
      this.field2598.setDaemon(true);
      this.field2598.start();
   }

   boolean method1617() {
      if (this.field2593) {
         try {
            this.field2592.close();
            if (null == this.field2597) {
               this.field2597 = new IOException("");
            }
         } catch (IOException var3) {
            if (null == this.field2597) {
               this.field2597 = new IOException(var3);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void run() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if (this.field2597 != null) {
                  return;
               }

               if (this.field2595 <= this.field2596) {
                  var1 = this.field2596 - this.field2595;
               } else {
                  var1 = this.field2596 + (this.field2591 - this.field2595);
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.field2592.flush();
               } catch (IOException var10) {
                  this.field2597 = var10;
                  return;
               }

               if (this.method1617()) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
               }
            }
         }

         try {
            if (var1 + this.field2595 <= this.field2591) {
               this.field2592.write(this.field2594, this.field2595, var1);
            } else {
               int var13 = this.field2591 - this.field2595;
               this.field2592.write(this.field2594, this.field2595, var13);
               this.field2592.write(this.field2594, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized(this) {
               this.field2597 = var2;
               return;
            }
         }

         synchronized(this) {
            this.field2595 = (var1 + this.field2595) % this.field2591;
         }
      } while(!this.method1617());

   }

   void method1616(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized(this) {
            if (this.field2597 != null) {
               throw new IOException(this.field2597.toString());
            } else {
               int var6;
               if (this.field2595 <= this.field2596) {
                  var6 = this.field2591 - this.field2596 + this.field2595 - 1;
               } else {
                  var6 = this.field2595 - this.field2596 - 1;
               }

               if (var6 < var3) {
                  throw new IOException("");
               } else {
                  if (this.field2596 + var3 <= this.field2591) {
                     System.arraycopy(var1, var2, this.field2594, this.field2596, var3);
                  } else {
                     int var7 = this.field2591 - this.field2596;
                     System.arraycopy(var1, var2, this.field2594, this.field2596, var7);
                     System.arraycopy(var1, var7 + var2, this.field2594, 0, var3 - var7);
                  }

                  this.field2596 = (this.field2596 + var3) % this.field2591;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method1615() {
      synchronized(this) {
         this.field2593 = true;
         this.notifyAll();
      }

      try {
         this.field2598.join();
      } catch (InterruptedException var4) {
      }

   }
}
