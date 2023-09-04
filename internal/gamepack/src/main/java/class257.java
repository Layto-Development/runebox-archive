import java.io.IOException;
import java.io.OutputStream;

public class class257 implements Runnable {
   boolean field2264;
   byte[] field2265;
   int field2262;
   int field2266 = 0;
   int field2267 = 0;
   IOException field2268;
   OutputStream field2263;
   Thread field2269;

   class257(OutputStream var1, int var2) {
      this.field2263 = var1;
      this.field2262 = var2 + 1;
      this.field2265 = new byte[this.field2262];
      this.field2269 = new Thread(this);
      this.field2269.setDaemon(true);
      this.field2269.start();
   }

   boolean method1476() {
      if (this.field2264) {
         try {
            this.field2263.close();
            if (null == this.field2268) {
               this.field2268 = new IOException("");
            }
         } catch (IOException var3) {
            if (null == this.field2268) {
               this.field2268 = new IOException(var3);
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
               if (this.field2268 != null) {
                  return;
               }

               if (this.field2266 <= this.field2267) {
                  var1 = this.field2267 - this.field2266;
               } else {
                  var1 = this.field2267 + (this.field2262 - this.field2266);
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.field2263.flush();
               } catch (IOException var10) {
                  this.field2268 = var10;
                  return;
               }

               if (this.method1476()) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
               }
            }
         }

         try {
            if (var1 + this.field2266 <= this.field2262) {
               this.field2263.write(this.field2265, this.field2266, var1);
            } else {
               int var13 = this.field2262 - this.field2266;
               this.field2263.write(this.field2265, this.field2266, var13);
               this.field2263.write(this.field2265, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized(this) {
               this.field2268 = var2;
               return;
            }
         }

         synchronized(this) {
            this.field2266 = (var1 + this.field2266) % this.field2262;
         }
      } while(!this.method1476());

   }

   void method1475(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized(this) {
            if (this.field2268 != null) {
               throw new IOException(this.field2268.toString());
            } else {
               int var6;
               if (this.field2266 <= this.field2267) {
                  var6 = this.field2262 - this.field2267 + this.field2266 - 1;
               } else {
                  var6 = this.field2266 - this.field2267 - 1;
               }

               if (var6 < var3) {
                  throw new IOException("");
               } else {
                  if (this.field2267 + var3 <= this.field2262) {
                     System.arraycopy(var1, var2, this.field2265, this.field2267, var3);
                  } else {
                     int var7 = this.field2262 - this.field2267;
                     System.arraycopy(var1, var2, this.field2265, this.field2267, var7);
                     System.arraycopy(var1, var7 + var2, this.field2265, 0, var3 - var7);
                  }

                  this.field2267 = (this.field2267 + var3) % this.field2262;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method1474() {
      synchronized(this) {
         this.field2264 = true;
         this.notifyAll();
      }

      try {
         this.field2269.join();
      } catch (InterruptedException var4) {
      }

   }
}
