import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class class145 implements Runnable {
   byte[] field1603;
   int field1601 = 0;
   int field1602;
   int field1604 = 0;
   IOException field1605;
   InputStream field1606;
   Thread field1600;

   class145(InputStream var1, int var2) {
      this.field1606 = var1;
      this.field1602 = var2 + 1;
      this.field1603 = new byte[this.field1602];
      this.field1600 = new Thread(this);
      this.field1600.setDaemon(true);
      this.field1600.start();
   }

   public void run() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if (null != this.field1605) {
                  return;
               }

               if (this.field1604 == 0) {
                  var1 = this.field1602 - this.field1601 - 1;
               } else if (this.field1604 <= this.field1601) {
                  var1 = this.field1602 - this.field1601;
               } else {
                  var1 = this.field1604 - this.field1601 - 1;
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
            var2 = this.field1606.read(this.field1603, this.field1601, var1);
            if (var2 == -1) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized(this) {
               this.field1605 = var3;
               return;
            }
         }

         synchronized(this) {
            this.field1601 = (this.field1601 + var2) % this.field1602;
         }
      }
   }

   boolean method920(int var1) throws IOException {
      if (var1 == 0) {
         return true;
      } else if (var1 > 0 && var1 < this.field1602) {
         synchronized(this) {
            int var4;
            if (this.field1604 <= this.field1601) {
               var4 = this.field1601 - this.field1604;
            } else {
               var4 = this.field1602 - this.field1604 + this.field1601;
            }

            if (var4 < var1) {
               if (this.field1605 != null) {
                  throw new IOException(this.field1605.toString());
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

   int method924() throws IOException {
      synchronized(this) {
         int var3;
         if (this.field1604 <= this.field1601) {
            var3 = this.field1601 - this.field1604;
         } else {
            var3 = this.field1602 - this.field1604 + this.field1601;
         }

         if (var3 <= 0 && this.field1605 != null) {
            throw new IOException(this.field1605.toString());
         } else {
            this.notifyAll();
            return var3;
         }
      }
   }

   int method921() throws IOException {
      synchronized(this) {
         if (this.field1604 == this.field1601) {
            if (this.field1605 != null) {
               throw new IOException(this.field1605.toString());
            } else {
               return -1;
            }
         } else {
            int var3 = this.field1603[this.field1604] & 255;
            this.field1604 = (this.field1604 + 1) % this.field1602;
            this.notifyAll();
            return var3;
         }
      }
   }

   int method922(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized(this) {
            int var6;
            if (this.field1604 <= this.field1601) {
               var6 = this.field1601 - this.field1604;
            } else {
               var6 = this.field1601 + (this.field1602 - this.field1604);
            }

            if (var3 > var6) {
               var3 = var6;
            }

            if (var3 == 0 && null != this.field1605) {
               throw new IOException(this.field1605.toString());
            } else {
               if (this.field1604 + var3 <= this.field1602) {
                  System.arraycopy(this.field1603, this.field1604, var1, var2, var3);
               } else {
                  int var7 = this.field1602 - this.field1604;
                  System.arraycopy(this.field1603, this.field1604, var1, var2, var7);
                  System.arraycopy(this.field1603, 0, var1, var7 + var2, var3 - var7);
               }

               this.field1604 = (this.field1604 + var3) % this.field1602;
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method923() {
      synchronized(this) {
         if (null == this.field1605) {
            this.field1605 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field1600.join();
      } catch (InterruptedException var4) {
      }

   }

   public static void method919(class298 var0) {
      class150.field1619 = var0;
   }
}
