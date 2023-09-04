import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class class373 implements Runnable {
   byte[] field2671;
   int field2669 = 0;
   int field2670;
   int field2672 = 0;
   IOException field2673;
   InputStream field2674;
   Thread field2668;

   class373(InputStream var1, int var2) {
      this.field2674 = var1;
      this.field2670 = var2 + 1;
      this.field2671 = new byte[this.field2670];
      this.field2668 = new Thread(this);
      this.field2668.setDaemon(true);
      this.field2668.start();
   }

   public void run() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if (null != this.field2673) {
                  return;
               }

               if (0 == this.field2672) {
                  var1 = this.field2670 - this.field2669 - 1;
               } else if (this.field2672 <= this.field2669) {
                  var1 = this.field2670 - this.field2669;
               } else {
                  var1 = this.field2672 - this.field2669 - 1;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
               }
            }
         }

         int var2;
         try {
            var2 = this.field2674.read(this.field2671, this.field2669, var1);
            if (var2 == -1) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized(this) {
               this.field2673 = var3;
               return;
            }
         }

         synchronized(this) {
            this.field2669 = (this.field2669 + var2) % this.field2670;
         }
      }
   }

   boolean method1736(int var1) throws IOException {
      if (var1 == 0) {
         return true;
      } else if (var1 > 0 && var1 < this.field2670) {
         synchronized(this) {
            int var4;
            if (this.field2672 <= this.field2669) {
               var4 = this.field2669 - this.field2672;
            } else {
               var4 = this.field2670 - this.field2672 + this.field2669;
            }

            if (var4 < var1) {
               if (this.field2673 != null) {
                  throw new IOException(this.field2673.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   int method1740() throws IOException {
      synchronized(this) {
         int var3;
         if (this.field2672 <= this.field2669) {
            var3 = this.field2669 - this.field2672;
         } else {
            var3 = this.field2670 - this.field2672 + this.field2669;
         }

         if (var3 <= 0 && this.field2673 != null) {
            throw new IOException(this.field2673.toString());
         } else {
            this.notifyAll();
            return var3;
         }
      }
   }

   int method1737() throws IOException {
      synchronized(this) {
         if (this.field2672 == this.field2669) {
            if (this.field2673 != null) {
               throw new IOException(this.field2673.toString());
            } else {
               return -1;
            }
         } else {
            int var3 = this.field2671[this.field2672] & 255;
            this.field2672 = (this.field2672 + 1) % this.field2670;
            this.notifyAll();
            return var3;
         }
      }
   }

   int method1738(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized(this) {
            int var6;
            if (this.field2672 <= this.field2669) {
               var6 = this.field2669 - this.field2672;
            } else {
               var6 = this.field2669 + (this.field2670 - this.field2672);
            }

            if (var3 > var6) {
               var3 = var6;
            }

            if (var3 == 0 && null != this.field2673) {
               throw new IOException(this.field2673.toString());
            } else {
               if (this.field2672 + var3 <= this.field2670) {
                  System.arraycopy(this.field2671, this.field2672, var1, var2, var3);
               } else {
                  int var7 = this.field2670 - this.field2672;
                  System.arraycopy(this.field2671, this.field2672, var1, var2, var7);
                  System.arraycopy(this.field2671, 0, var1, var7 + var2, var3 - var7);
               }

               this.field2672 = (this.field2672 + var3) % this.field2670;
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method1739() {
      synchronized(this) {
         if (null == this.field2673) {
            this.field2673 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field2668.join();
      } catch (InterruptedException var4) {
      }

   }

   public static void method1735(class509 var0) {
      class449.field3549 = var0;
   }
}
