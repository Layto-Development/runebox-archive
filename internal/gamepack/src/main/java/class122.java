import java.io.EOFException;
import java.io.IOException;

public class class122 {
   byte[] field1505;
   byte[] field1508;
   class472 field1512;
   int field1504 = 0;
   int field1507;
   long field1503 = -1L;
   long field1506;
   long field1509 = -1L;
   long field1510;
   long field1511;
   long field1513;

   public class122(class472 var1, int var2, int var3) throws IOException {
      this.field1512 = var1;
      this.field1506 = this.field1511 = var1.method2282();
      this.field1505 = new byte[var2];
      this.field1508 = new byte[var3];
      this.field1510 = 0L;
   }

   public void method855() throws IOException {
      this.method861();
      this.field1512.method2284();
   }

   public void method856(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.field1510 = var1;
      }
   }

   public long method862() {
      return this.field1506;
   }

   public void method857(byte[] var1) throws IOException {
      this.method858(var1, 0, var1.length);
   }

   public void method858(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var2 + var3 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if (-1L != this.field1509 && this.field1510 >= this.field1509 && this.field1510 + (long)var3 <= this.field1509 + (long)this.field1504) {
            System.arraycopy(this.field1508, (int)(this.field1510 - this.field1509), var1, var2, var3);
            this.field1510 += (long)var3;
            return;
         }

         long var5 = this.field1510;
         int var8 = var3;
         int var9;
         if (this.field1510 >= this.field1503 && this.field1510 < this.field1503 + (long)this.field1507) {
            var9 = (int)((long)this.field1507 - (this.field1510 - this.field1503));
            if (var9 > var3) {
               var9 = var3;
            }

            System.arraycopy(this.field1505, (int)(this.field1510 - this.field1503), var1, var2, var9);
            this.field1510 += (long)var9;
            var2 += var9;
            var3 -= var9;
         }

         if (var3 > this.field1505.length) {
            this.field1512.method2280(this.field1510);

            for(this.field1513 = this.field1510; var3 > 0; var3 -= var9) {
               var9 = this.field1512.method2283(var1, var2, var3);
               if (var9 == -1) {
                  break;
               }

               this.field1513 += (long)var9;
               this.field1510 += (long)var9;
               var2 += var9;
            }
         } else if (var3 > 0) {
            this.method859();
            var9 = var3;
            if (var3 > this.field1507) {
               var9 = this.field1507;
            }

            System.arraycopy(this.field1505, 0, var1, var2, var9);
            var2 += var9;
            var3 -= var9;
            this.field1510 += (long)var9;
         }

         if (-1L != this.field1509) {
            if (this.field1509 > this.field1510 && var3 > 0) {
               var9 = var2 + (int)(this.field1509 - this.field1510);
               if (var9 > var2 + var3) {
                  var9 = var2 + var3;
               }

               while(var2 < var9) {
                  var1[var2++] = 0;
                  --var3;
                  ++this.field1510;
               }
            }

            long var15 = -1L;
            long var11 = -1L;
            if (this.field1509 >= var5 && this.field1509 < (long)var8 + var5) {
               var15 = this.field1509;
            } else if (var5 >= this.field1509 && var5 < this.field1509 + (long)this.field1504) {
               var15 = var5;
            }

            if (this.field1509 + (long)this.field1504 > var5 && (long)this.field1504 + this.field1509 <= (long)var8 + var5) {
               var11 = this.field1509 + (long)this.field1504;
            } else if (var5 + (long)var8 > this.field1509 && var5 + (long)var8 <= (long)this.field1504 + this.field1509) {
               var11 = (long)var8 + var5;
            }

            if (var15 > -1L && var11 > var15) {
               int var13 = (int)(var11 - var15);
               System.arraycopy(this.field1508, (int)(var15 - this.field1509), var1, (int)(var15 - var5) + var2, var13);
               if (var11 > this.field1510) {
                  var3 = (int)((long)var3 - (var11 - this.field1510));
                  this.field1510 = var11;
               }
            }
         }
      } catch (IOException var14) {
         this.field1513 = -1L;
         throw var14;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   void method859() throws IOException {
      this.field1507 = 0;
      if (this.field1510 != this.field1513) {
         this.field1512.method2280(this.field1510);
         this.field1513 = this.field1510;
      }

      int var3;
      for(this.field1503 = this.field1510; this.field1507 < this.field1505.length; this.field1507 += var3) {
         int var2 = this.field1505.length - this.field1507;
         if (var2 > 200000000) {
            var2 = 200000000;
         }

         var3 = this.field1512.method2283(this.field1505, this.field1507, var2);
         if (var3 == -1) {
            break;
         }

         this.field1513 += (long)var3;
      }

   }

   public void method860(byte[] var1, int var2, int var3) throws IOException {
      try {
         if ((long)var3 + this.field1510 > this.field1506) {
            this.field1506 = this.field1510 + (long)var3;
         }

         if (-1L != this.field1509 && (this.field1510 < this.field1509 || this.field1510 > (long)this.field1504 + this.field1509)) {
            this.method861();
         }

         if (-1L != this.field1509 && (long)var3 + this.field1510 > (long)this.field1508.length + this.field1509) {
            int var5 = (int)((long)this.field1508.length - (this.field1510 - this.field1509));
            System.arraycopy(var1, var2, this.field1508, (int)(this.field1510 - this.field1509), var5);
            this.field1510 += (long)var5;
            var2 += var5;
            var3 -= var5;
            this.field1504 = this.field1508.length;
            this.method861();
         }

         if (var3 <= this.field1508.length) {
            if (var3 > 0) {
               if (-1L == this.field1509) {
                  this.field1509 = this.field1510;
               }

               System.arraycopy(var1, var2, this.field1508, (int)(this.field1510 - this.field1509), var3);
               this.field1510 += (long)var3;
               if (this.field1510 - this.field1509 > (long)this.field1504) {
                  this.field1504 = (int)(this.field1510 - this.field1509);
               }

            }
         } else {
            if (this.field1510 != this.field1513) {
               this.field1512.method2280(this.field1510);
               this.field1513 = this.field1510;
            }

            this.field1512.method2281(var1, var2, var3);
            this.field1513 += (long)var3;
            if (this.field1513 > this.field1511) {
               this.field1511 = this.field1513;
            }

            long var11 = -1L;
            long var7 = -1L;
            if (this.field1510 >= this.field1503 && this.field1510 < this.field1503 + (long)this.field1507) {
               var11 = this.field1510;
            } else if (this.field1503 >= this.field1510 && this.field1503 < (long)var3 + this.field1510) {
               var11 = this.field1503;
            }

            if ((long)var3 + this.field1510 > this.field1503 && (long)var3 + this.field1510 <= this.field1503 + (long)this.field1507) {
               var7 = this.field1510 + (long)var3;
            } else if ((long)this.field1507 + this.field1503 > this.field1510 && this.field1503 + (long)this.field1507 <= (long)var3 + this.field1510) {
               var7 = this.field1503 + (long)this.field1507;
            }

            if (var11 > -1L && var7 > var11) {
               int var9 = (int)(var7 - var11);
               System.arraycopy(var1, (int)(var11 + (long)var2 - this.field1510), this.field1505, (int)(var11 - this.field1503), var9);
            }

            this.field1510 += (long)var3;
         }
      } catch (IOException var10) {
         this.field1513 = -1L;
         throw var10;
      }
   }

   void method861() throws IOException {
      if (this.field1509 != -1L) {
         if (this.field1509 != this.field1513) {
            this.field1512.method2280(this.field1509);
            this.field1513 = this.field1509;
         }

         this.field1512.method2281(this.field1508, 0, this.field1504);
         this.field1513 += (long)this.field1504;
         if (this.field1513 > this.field1511) {
            this.field1511 = this.field1513;
         }

         long var2 = -1L;
         long var4 = -1L;
         if (this.field1509 >= this.field1503 && this.field1509 < (long)this.field1507 + this.field1503) {
            var2 = this.field1509;
         } else if (this.field1503 >= this.field1509 && this.field1503 < this.field1509 + (long)this.field1504) {
            var2 = this.field1503;
         }

         if (this.field1509 + (long)this.field1504 > this.field1503 && this.field1509 + (long)this.field1504 <= this.field1503 + (long)this.field1507) {
            var4 = this.field1509 + (long)this.field1504;
         } else if (this.field1503 + (long)this.field1507 > this.field1509 && (long)this.field1507 + this.field1503 <= this.field1509 + (long)this.field1504) {
            var4 = this.field1503 + (long)this.field1507;
         }

         if (var2 > -1L && var4 > var2) {
            int var6 = (int)(var4 - var2);
            System.arraycopy(this.field1508, (int)(var2 - this.field1509), this.field1505, (int)(var2 - this.field1503), var6);
         }

         this.field1509 = -1L;
         this.field1504 = 0;
      }

   }
}
