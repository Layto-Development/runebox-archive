import java.io.EOFException;
import java.io.IOException;

public class class493 {
   byte[] field3940;
   byte[] field3943;
   class390 field3947;
   int field3939 = 0;
   int field3942;
   long field3938 = -1L;
   long field3941;
   long field3944 = -1L;
   long field3945;
   long field3946;
   long field3948;

   public class493(class390 var1, int var2, int var3) throws IOException {
      this.field3947 = var1;
      this.field3941 = this.field3946 = var1.method1781();
      this.field3940 = new byte[var2];
      this.field3943 = new byte[var3];
      this.field3945 = 0L;
   }

   public void method2331() throws IOException {
      this.method2337();
      this.field3947.method1783();
   }

   public void method2332(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.field3945 = var1;
      }
   }

   public long method2338() {
      return this.field3941;
   }

   public void method2333(byte[] var1) throws IOException {
      this.method2334(var1, 0, var1.length);
   }

   public void method2334(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var2 + var3 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if (-1L != this.field3944 && this.field3945 >= this.field3944 && this.field3945 + (long)var3 <= this.field3944 + (long)this.field3939) {
            System.arraycopy(this.field3943, (int)(this.field3945 - this.field3944), var1, var2, var3);
            this.field3945 += (long)var3;
            return;
         }

         long var5 = this.field3945;
         int var8 = var3;
         int var9;
         if (this.field3945 >= this.field3938 && this.field3945 < this.field3938 + (long)this.field3942) {
            var9 = (int)((long)this.field3942 - (this.field3945 - this.field3938));
            if (var9 > var3) {
               var9 = var3;
            }

            System.arraycopy(this.field3940, (int)(this.field3945 - this.field3938), var1, var2, var9);
            this.field3945 += (long)var9;
            var2 += var9;
            var3 -= var9;
         }

         if (var3 > this.field3940.length) {
            this.field3947.method1779(this.field3945);

            for(this.field3948 = this.field3945; var3 > 0; var3 -= var9) {
               var9 = this.field3947.method1782(var1, var2, var3);
               if (var9 == -1) {
                  break;
               }

               this.field3948 += (long)var9;
               this.field3945 += (long)var9;
               var2 += var9;
            }
         } else if (var3 > 0) {
            this.method2335();
            var9 = var3;
            if (var3 > this.field3942) {
               var9 = this.field3942;
            }

            System.arraycopy(this.field3940, 0, var1, var2, var9);
            var2 += var9;
            var3 -= var9;
            this.field3945 += (long)var9;
         }

         if (-1L != this.field3944) {
            if (this.field3944 > this.field3945 && var3 > 0) {
               var9 = var2 + (int)(this.field3944 - this.field3945);
               if (var9 > var2 + var3) {
                  var9 = var2 + var3;
               }

               while(var2 < var9) {
                  var1[var2++] = 0;
                  --var3;
                  ++this.field3945;
               }
            }

            long var15 = -1L;
            long var11 = -1L;
            if (this.field3944 >= var5 && this.field3944 < (long)var8 + var5) {
               var15 = this.field3944;
            } else if (var5 >= this.field3944 && var5 < this.field3944 + (long)this.field3939) {
               var15 = var5;
            }

            if (this.field3944 + (long)this.field3939 > var5 && (long)this.field3939 + this.field3944 <= (long)var8 + var5) {
               var11 = this.field3944 + (long)this.field3939;
            } else if (var5 + (long)var8 > this.field3944 && var5 + (long)var8 <= (long)this.field3939 + this.field3944) {
               var11 = (long)var8 + var5;
            }

            if (var15 > -1L && var11 > var15) {
               int var13 = (int)(var11 - var15);
               System.arraycopy(this.field3943, (int)(var15 - this.field3944), var1, (int)(var15 - var5) + var2, var13);
               if (var11 > this.field3945) {
                  var3 = (int)((long)var3 - (var11 - this.field3945));
                  this.field3945 = var11;
               }
            }
         }
      } catch (IOException var14) {
         this.field3948 = -1L;
         throw var14;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   void method2335() throws IOException {
      this.field3942 = 0;
      if (this.field3945 != this.field3948) {
         this.field3947.method1779(this.field3945);
         this.field3948 = this.field3945;
      }

      int var3;
      for(this.field3938 = this.field3945; this.field3942 < this.field3940.length; this.field3942 += var3) {
         int var2 = this.field3940.length - this.field3942;
         if (var2 > 200000000) {
            var2 = 200000000;
         }

         var3 = this.field3947.method1782(this.field3940, this.field3942, var2);
         if (var3 == -1) {
            break;
         }

         this.field3948 += (long)var3;
      }

   }

   public void method2336(byte[] var1, int var2, int var3) throws IOException {
      try {
         if ((long)var3 + this.field3945 > this.field3941) {
            this.field3941 = this.field3945 + (long)var3;
         }

         if (-1L != this.field3944 && (this.field3945 < this.field3944 || this.field3945 > (long)this.field3939 + this.field3944)) {
            this.method2337();
         }

         if (-1L != this.field3944 && (long)var3 + this.field3945 > (long)this.field3943.length + this.field3944) {
            int var5 = (int)((long)this.field3943.length - (this.field3945 - this.field3944));
            System.arraycopy(var1, var2, this.field3943, (int)(this.field3945 - this.field3944), var5);
            this.field3945 += (long)var5;
            var2 += var5;
            var3 -= var5;
            this.field3939 = this.field3943.length;
            this.method2337();
         }

         if (var3 <= this.field3943.length) {
            if (var3 > 0) {
               if (-1L == this.field3944) {
                  this.field3944 = this.field3945;
               }

               System.arraycopy(var1, var2, this.field3943, (int)(this.field3945 - this.field3944), var3);
               this.field3945 += (long)var3;
               if (this.field3945 - this.field3944 > (long)this.field3939) {
                  this.field3939 = (int)(this.field3945 - this.field3944);
               }

            }
         } else {
            if (this.field3945 != this.field3948) {
               this.field3947.method1779(this.field3945);
               this.field3948 = this.field3945;
            }

            this.field3947.method1780(var1, var2, var3);
            this.field3948 += (long)var3;
            if (this.field3948 > this.field3946) {
               this.field3946 = this.field3948;
            }

            long var11 = -1L;
            long var7 = -1L;
            if (this.field3945 >= this.field3938 && this.field3945 < this.field3938 + (long)this.field3942) {
               var11 = this.field3945;
            } else if (this.field3938 >= this.field3945 && this.field3938 < (long)var3 + this.field3945) {
               var11 = this.field3938;
            }

            if ((long)var3 + this.field3945 > this.field3938 && (long)var3 + this.field3945 <= this.field3938 + (long)this.field3942) {
               var7 = this.field3945 + (long)var3;
            } else if ((long)this.field3942 + this.field3938 > this.field3945 && this.field3938 + (long)this.field3942 <= (long)var3 + this.field3945) {
               var7 = this.field3938 + (long)this.field3942;
            }

            if (var11 > -1L && var7 > var11) {
               int var9 = (int)(var7 - var11);
               System.arraycopy(var1, (int)(var11 + (long)var2 - this.field3945), this.field3940, (int)(var11 - this.field3938), var9);
            }

            this.field3945 += (long)var3;
         }
      } catch (IOException var10) {
         this.field3948 = -1L;
         throw var10;
      }
   }

   void method2337() throws IOException {
      if (this.field3944 != -1L) {
         if (this.field3944 != this.field3948) {
            this.field3947.method1779(this.field3944);
            this.field3948 = this.field3944;
         }

         this.field3947.method1780(this.field3943, 0, this.field3939);
         this.field3948 += (long)this.field3939;
         if (this.field3948 > this.field3946) {
            this.field3946 = this.field3948;
         }

         long var2 = -1L;
         long var4 = -1L;
         if (this.field3944 >= this.field3938 && this.field3944 < (long)this.field3942 + this.field3938) {
            var2 = this.field3944;
         } else if (this.field3938 >= this.field3944 && this.field3938 < this.field3944 + (long)this.field3939) {
            var2 = this.field3938;
         }

         if (this.field3944 + (long)this.field3939 > this.field3938 && this.field3944 + (long)this.field3939 <= this.field3938 + (long)this.field3942) {
            var4 = this.field3944 + (long)this.field3939;
         } else if (this.field3938 + (long)this.field3942 > this.field3944 && (long)this.field3942 + this.field3938 <= this.field3944 + (long)this.field3939) {
            var4 = this.field3938 + (long)this.field3942;
         }

         if (var2 > -1L && var4 > var2) {
            int var6 = (int)(var4 - var2);
            System.arraycopy(this.field3943, (int)(var2 - this.field3944), this.field3940, (int)(var2 - this.field3938), var6);
         }

         this.field3944 = -1L;
         this.field3939 = 0;
      }

   }
}
