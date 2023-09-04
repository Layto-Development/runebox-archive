public class class445 {
   class501[] field3532;
   int field3523 = 0;
   int field3525 = 0;
   int field3526 = 0;
   int field3531 = 0;
   int field3537 = 0;
   int field3538 = 0;
   int[] field3524 = new int[256];
   int[] field3527;
   int[] field3528;
   int[] field3529;
   int[] field3530;
   int[] field3533;
   int[] field3534;
   int[] field3535;
   int[] field3536;

   class445(class501[] var1) {
      this.field3532 = var1;
      this.method2064();
   }

   void method2064() {
      this.field3527 = new int[256];

      int var2;
      for(var2 = 0; var2 < 64; ++var2) {
         this.field3527[var2] = var2 * 262144;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3527[var2 + 64] = var2 * 1024 + 16711680;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3527[var2 + 128] = 16776960 + var2 * 4;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3527[var2 + 192] = 16777215;
      }

      this.field3528 = new int[256];

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3528[var2] = var2 * 1024;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3528[var2 + 64] = '\uff00' + var2 * 4;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3528[var2 + 128] = var2 * 262144 + '\uffff';
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3528[var2 + 192] = 16777215;
      }

      this.field3529 = new int[256];

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3529[var2] = var2 * 4;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3529[var2 + 64] = var2 * 262144 + 255;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3529[var2 + 128] = var2 * 1024 + 16711935;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3529[var2 + 192] = 16777215;
      }

      this.field3536 = new int[256];
      this.field3523 = 0;
      this.field3534 = new int['\u8000'];
      this.field3535 = new int['\u8000'];
      this.method2071((class501)null);
      this.field3530 = new int['\u8000'];
      this.field3533 = new int['\u8000'];
   }

   void method2065() {
      this.field3527 = null;
      this.field3528 = null;
      this.field3529 = null;
      this.field3536 = null;
      this.field3534 = null;
      this.field3535 = null;
      this.field3530 = null;
      this.field3533 = null;
      this.field3523 = 0;
      this.field3537 = 0;
   }

   void method2072(int var1, int var2) {
      if (this.field3530 == null) {
         this.method2064();
      }

      if (0 == this.field3538) {
         this.field3538 = var2;
      }

      int var4 = var2 - this.field3538;
      if (var4 >= 256) {
         var4 = 0;
      }

      this.field3538 = var2;
      if (var4 > 0) {
         this.method2066(var4);
      }

      this.method2068(var1);
   }

   final void method2066(int var1) {
      this.field3523 += var1 * 128;
      int var3;
      if (this.field3523 > this.field3534.length) {
         this.field3523 -= this.field3534.length;
         var3 = (int)(Math.random() * 12.0);
         this.method2071(this.field3532[var3]);
      }

      var3 = 0;
      int var4 = var1 * 128;
      int var5 = (256 - var1) * 128;

      int var7;
      for(int var6 = 0; var6 < var5; ++var6) {
         var7 = this.field3530[var4 + var3] - this.field3534[this.field3523 + var3 & this.field3534.length - 1] * var1 / 6;
         if (var7 < 0) {
            var7 = 0;
         }

         this.field3530[var3++] = var7;
      }

      byte var16 = 10;
      var7 = 128 - var16;

      int var8;
      int var11;
      for(var8 = 256 - var1; var8 < 256; ++var8) {
         int var9 = var8 * 128;

         for(int var10 = 0; var10 < 128; ++var10) {
            var11 = (int)(Math.random() * 100.0);
            if (var11 < 50 && var10 > var16 && var10 < var7) {
               this.field3530[var10 + var9] = 255;
            } else {
               this.field3530[var10 + var9] = 0;
            }
         }
      }

      if (this.field3531 > 0) {
         this.field3531 -= var1 * 4;
      }

      if (this.field3526 > 0) {
         this.field3526 -= var1 * 4;
      }

      if (this.field3531 == 0 && 0 == this.field3526) {
         var8 = (int)(Math.random() * (double)(2000 / var1));
         if (var8 == 0) {
            this.field3531 = 1024;
         }

         if (var8 == 1) {
            this.field3526 = 1024;
         }
      }

      for(var8 = 0; var8 < 256 - var1; ++var8) {
         this.field3524[var8] = this.field3524[var1 + var8];
      }

      for(var8 = 256 - var1; var8 < 256; ++var8) {
         this.field3524[var8] = (int)(Math.sin((double)this.field3525 / 14.0) * 16.0 + Math.sin((double)this.field3525 / 15.0) * 14.0 + Math.sin((double)this.field3525 / 16.0) * 12.0);
         ++this.field3525;
      }

      this.field3537 += var1;
      var8 = ((Client.field1419 & 1) + var1) / 2;
      if (var8 > 0) {
         short var17 = 128;
         byte var18 = 2;
         var11 = 128 - var18 - var18;

         int var12;
         int var13;
         int var14;
         for(var12 = 0; var12 < this.field3537 * 100; ++var12) {
            var13 = (int)(Math.random() * (double)var11) + var18;
            var14 = (int)(Math.random() * (double)var17) + var17;
            this.field3530[(var14 << 7) + var13] = 192;
         }

         this.field3537 = 0;

         int var15;
         for(var12 = 0; var12 < 256; ++var12) {
            var13 = 0;
            var14 = var12 * 128;

            for(var15 = -var8; var15 < 128; ++var15) {
               if (var8 + var15 < 128) {
                  var13 += this.field3530[var8 + var15 + var14];
               }

               if (var15 - (var8 + 1) >= 0) {
                  var13 -= this.field3530[var14 + var15 - (var8 + 1)];
               }

               if (var15 >= 0) {
                  this.field3533[var15 + var14] = var13 / (var8 * 2 + 1);
               }
            }
         }

         for(var12 = 0; var12 < 128; ++var12) {
            var13 = 0;

            for(var14 = -var8; var14 < 256; ++var14) {
               var15 = var14 * 128;
               if (var8 + var14 < 256) {
                  var13 += this.field3533[var15 + var12 + var8 * 128];
               }

               if (var14 - (var8 + 1) >= 0) {
                  var13 -= this.field3533[var12 + var15 - (var8 + 1) * 128];
               }

               if (var14 >= 0) {
                  this.field3530[var12 + var15] = var13 / (var8 * 2 + 1);
               }
            }
         }
      }

   }

   final int method2067(int var1, int var2, int var3) {
      int var5 = 256 - var3;
      return (var3 * (var2 & '\uff00') + var5 * (var1 & '\uff00') & 16711680) + (var3 * (var2 & 16711935) + (var1 & 16711935) * var5 & -16711936) >> 8;
   }

   final void method2068(int var1) {
      int var3 = this.field3536.length;
      if (this.field3531 > 0) {
         this.method2069(this.field3531, this.field3528);
      } else if (this.field3526 > 0) {
         this.method2069(this.field3526, this.field3529);
      } else {
         for(int var4 = 0; var4 < var3; ++var4) {
            this.field3536[var4] = this.field3527[var4];
         }
      }

      this.method2070(var1);
   }

   final void method2069(int var1, int[] var2) {
      int var4 = this.field3536.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         if (var1 > 768) {
            this.field3536[var5] = this.method2067(this.field3527[var5], var2[var5], 1024 - var1);
         } else if (var1 > 256) {
            this.field3536[var5] = var2[var5];
         } else {
            this.field3536[var5] = this.method2067(var2[var5], this.field3527[var5], 256 - var1);
         }
      }

   }

   final void method2070(int var1) {
      int var3 = 0;

      for(int var4 = 1; var4 < 255; ++var4) {
         int var5 = (256 - var4) * this.field3524[var4] / 256;
         int var6 = var5 + var1;
         int var7 = 0;
         int var8 = 128;
         if (var6 < 0) {
            var7 = -var6;
            var6 = 0;
         }

         if (var6 + 128 >= class143.field899.field2135) {
            var8 = class143.field899.field2135 - var6;
         }

         int var9 = var6 + (var4 + 8) * class143.field899.field2135;
         var3 += var7;

         for(int var10 = var7; var10 < var8; ++var10) {
            int var11 = this.field3530[var3++];
            int var12 = var9 % class427.field3331;
            if (var11 != 0 && var12 >= class427.field3336 && var12 < class427.field3330) {
               int var13 = var11;
               int var14 = 256 - var11;
               var11 = this.field3536[var11];
               int var15 = class143.field899.field2136[var9];
               class143.field899.field2136[var9++] = -16777216 | (var14 * (var15 & 16711935) + var13 * (var11 & 16711935) & -16711936) + ((var15 & '\uff00') * var14 + (var11 & '\uff00') * var13 & 16711680) >> 8;
            } else {
               ++var9;
            }
         }

         var3 += 128 - var8;
      }

   }

   final void method2071(class501 var1) {
      int var3;
      for(var3 = 0; var3 < this.field3534.length; ++var3) {
         this.field3534[var3] = 0;
      }

      int var4;
      for(var3 = 0; var3 < 5000; ++var3) {
         var4 = (int)(Math.random() * 128.0 * 256.0);
         this.field3534[var4] = (int)(Math.random() * 256.0);
      }

      int var5;
      int var6;
      for(var3 = 0; var3 < 20; ++var3) {
         for(var4 = 1; var4 < 255; ++var4) {
            for(var5 = 1; var5 < 127; ++var5) {
               var6 = (var4 << 7) + var5;
               this.field3535[var6] = (this.field3534[var6 + 1] + this.field3534[var6 - 1] + this.field3534[var6 - 128] + this.field3534[var6 + 128]) / 4;
            }
         }

         int[] var9 = this.field3534;
         this.field3534 = this.field3535;
         this.field3535 = var9;
      }

      if (var1 != null) {
         var3 = 0;

         for(var4 = 0; var4 < var1.field4006; ++var4) {
            for(var5 = 0; var5 < var1.field4005; ++var5) {
               if (var1.field4007[var3++] != 0) {
                  var6 = var5 + 16 + var1.field4003;
                  int var7 = var4 + 16 + var1.field4008;
                  int var8 = var6 + (var7 << 7);
                  this.field3534[var8] = 0;
               }
            }
         }
      }

   }
}
