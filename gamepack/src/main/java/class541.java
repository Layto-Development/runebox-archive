public class class541 {
   class425[] field4287;
   int field4278 = 0;
   int field4280 = 0;
   int field4281 = 0;
   int field4286 = 0;
   int field4292 = 0;
   int field4293 = 0;
   int[] field4279 = new int[256];
   int[] field4282;
   int[] field4283;
   int[] field4284;
   int[] field4285;
   int[] field4288;
   int[] field4289;
   int[] field4290;
   int[] field4291;

   class541(class425[] var1) {
      this.field4287 = var1;
      this.method2569();
   }

   void method2569() {
      this.field4282 = new int[256];

      int var2;
      for(var2 = 0; var2 < 64; ++var2) {
         this.field4282[var2] = var2 * 262144;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field4282[var2 + 64] = var2 * 1024 + 16711680;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field4282[var2 + 128] = 16776960 + var2 * 4;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field4282[var2 + 192] = 16777215;
      }

      this.field4283 = new int[256];

      for(var2 = 0; var2 < 64; ++var2) {
         this.field4283[var2] = var2 * 1024;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field4283[var2 + 64] = '\uff00' + var2 * 4;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field4283[var2 + 128] = var2 * 262144 + '\uffff';
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field4283[var2 + 192] = 16777215;
      }

      this.field4284 = new int[256];

      for(var2 = 0; var2 < 64; ++var2) {
         this.field4284[var2] = var2 * 4;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field4284[var2 + 64] = var2 * 262144 + 255;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field4284[var2 + 128] = var2 * 1024 + 16711935;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field4284[var2 + 192] = 16777215;
      }

      this.field4291 = new int[256];
      this.field4278 = 0;
      this.field4289 = new int['\u8000'];
      this.field4290 = new int['\u8000'];
      this.method2576((class425)null);
      this.field4285 = new int['\u8000'];
      this.field4288 = new int['\u8000'];
   }

   void method2570() {
      this.field4282 = null;
      this.field4283 = null;
      this.field4284 = null;
      this.field4291 = null;
      this.field4289 = null;
      this.field4290 = null;
      this.field4285 = null;
      this.field4288 = null;
      this.field4278 = 0;
      this.field4292 = 0;
   }

   void method2577(int var1, int var2) {
      if (this.field4285 == null) {
         this.method2569();
      }

      if (this.field4293 == 0) {
         this.field4293 = var2;
      }

      int var4 = var2 - this.field4293;
      if (var4 >= 256) {
         var4 = 0;
      }

      this.field4293 = var2;
      if (var4 > 0) {
         this.method2571(var4);
      }

      this.method2573(var1);
   }

   final void method2571(int var1) {
      this.field4278 += var1 * 128;
      int var3;
      if (this.field4278 > this.field4289.length) {
         this.field4278 -= this.field4289.length;
         var3 = (int)(Math.random() * 12.0);
         this.method2576(this.field4287[var3]);
      }

      var3 = 0;
      int var4 = var1 * 128;
      int var5 = (256 - var1) * 128;

      int var7;
      for(int var6 = 0; var6 < var5; ++var6) {
         var7 = this.field4285[var4 + var3] - this.field4289[this.field4278 + var3 & this.field4289.length - 1] * var1 / 6;
         if (var7 < 0) {
            var7 = 0;
         }

         this.field4285[var3++] = var7;
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
               this.field4285[var10 + var9] = 255;
            } else {
               this.field4285[var10 + var9] = 0;
            }
         }
      }

      if (this.field4286 > 0) {
         this.field4286 -= var1 * 4;
      }

      if (this.field4281 > 0) {
         this.field4281 -= var1 * 4;
      }

      if (this.field4286 == 0 && this.field4281 == 0) {
         var8 = (int)(Math.random() * (double)(2000 / var1));
         if (var8 == 0) {
            this.field4286 = 1024;
         }

         if (var8 == 1) {
            this.field4281 = 1024;
         }
      }

      for(var8 = 0; var8 < 256 - var1; ++var8) {
         this.field4279[var8] = this.field4279[var1 + var8];
      }

      for(var8 = 256 - var1; var8 < 256; ++var8) {
         this.field4279[var8] = (int)(Math.sin((double)this.field4280 / 14.0) * 16.0 + Math.sin((double)this.field4280 / 15.0) * 14.0 + Math.sin((double)this.field4280 / 16.0) * 12.0);
         ++this.field4280;
      }

      this.field4292 += var1;
      var8 = ((Client.field879 & 1) + var1) / 2;
      if (var8 > 0) {
         short var17 = 128;
         byte var18 = 2;
         var11 = 128 - var18 - var18;

         int var12;
         int var13;
         int var14;
         for(var12 = 0; var12 < this.field4292 * 100; ++var12) {
            var13 = (int)(Math.random() * (double)var11) + var18;
            var14 = (int)(Math.random() * (double)var17) + var17;
            this.field4285[(var14 << 7) + var13] = 192;
         }

         this.field4292 = 0;

         int var15;
         for(var12 = 0; var12 < 256; ++var12) {
            var13 = 0;
            var14 = var12 * 128;

            for(var15 = -var8; var15 < 128; ++var15) {
               if (var8 + var15 < 128) {
                  var13 += this.field4285[var8 + var15 + var14];
               }

               if (var15 - (var8 + 1) >= 0) {
                  var13 -= this.field4285[var14 + var15 - (var8 + 1)];
               }

               if (var15 >= 0) {
                  this.field4288[var15 + var14] = var13 / (var8 * 2 + 1);
               }
            }
         }

         for(var12 = 0; var12 < 128; ++var12) {
            var13 = 0;

            for(var14 = -var8; var14 < 256; ++var14) {
               var15 = var14 * 128;
               if (var8 + var14 < 256) {
                  var13 += this.field4288[var15 + var12 + var8 * 128];
               }

               if (var14 - (var8 + 1) >= 0) {
                  var13 -= this.field4288[var12 + var15 - (var8 + 1) * 128];
               }

               if (var14 >= 0) {
                  this.field4285[var12 + var15] = var13 / (var8 * 2 + 1);
               }
            }
         }
      }

   }

   final int method2572(int var1, int var2, int var3) {
      int var5 = 256 - var3;
      return (var3 * (var2 & '\uff00') + var5 * (var1 & '\uff00') & 16711680) + (var3 * (var2 & 16711935) + (var1 & 16711935) * var5 & -16711936) >> 8;
   }

   final void method2573(int var1) {
      int var3 = this.field4291.length;
      if (this.field4286 > 0) {
         this.method2574(this.field4286, this.field4283);
      } else if (this.field4281 > 0) {
         this.method2574(this.field4281, this.field4284);
      } else {
         for(int var4 = 0; var4 < var3; ++var4) {
            this.field4291[var4] = this.field4282[var4];
         }
      }

      this.method2575(var1);
   }

   final void method2574(int var1, int[] var2) {
      int var4 = this.field4291.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         if (var1 > 768) {
            this.field4291[var5] = this.method2572(this.field4282[var5], var2[var5], 1024 - var1);
         } else if (var1 > 256) {
            this.field4291[var5] = var2[var5];
         } else {
            this.field4291[var5] = this.method2572(var2[var5], this.field4282[var5], 256 - var1);
         }
      }

   }

   final void method2575(int var1) {
      int var3 = 0;

      for(int var4 = 1; var4 < 255; ++var4) {
         int var5 = (256 - var4) * this.field4279[var4] / 256;
         int var6 = var5 + var1;
         int var7 = 0;
         int var8 = 128;
         if (var6 < 0) {
            var7 = -var6;
            var6 = 0;
         }

         if (var6 + 128 >= class300.field2508.field1615) {
            var8 = class300.field2508.field1615 - var6;
         }

         int var9 = var6 + (var4 + 8) * class300.field2508.field1615;
         var3 += var7;

         for(int var10 = var7; var10 < var8; ++var10) {
            int var11 = this.field4285[var3++];
            int var12 = var9 % class156.field1648;
            if (var11 != 0 && var12 >= class156.field1653 && var12 < class156.field1647) {
               int var13 = var11;
               int var14 = 256 - var11;
               var11 = this.field4291[var11];
               int var15 = class300.field2508.field1616[var9];
               class300.field2508.field1616[var9++] = -16777216 | (var14 * (var15 & 16711935) + var13 * (var11 & 16711935) & -16711936) + ((var15 & '\uff00') * var14 + (var11 & '\uff00') * var13 & 16711680) >> 8;
            } else {
               ++var9;
            }
         }

         var3 += 128 - var8;
      }

   }

   final void method2576(class425 var1) {
      int var3;
      for(var3 = 0; var3 < this.field4289.length; ++var3) {
         this.field4289[var3] = 0;
      }

      int var4;
      for(var3 = 0; var3 < 5000; ++var3) {
         var4 = (int)(Math.random() * 128.0 * 256.0);
         this.field4289[var4] = (int)(Math.random() * 256.0);
      }

      int var5;
      int var6;
      for(var3 = 0; var3 < 20; ++var3) {
         for(var4 = 1; var4 < 255; ++var4) {
            for(var5 = 1; var5 < 127; ++var5) {
               var6 = (var4 << 7) + var5;
               this.field4290[var6] = (this.field4289[var6 + 1] + this.field4289[var6 - 1] + this.field4289[var6 - 128] + this.field4289[var6 + 128]) / 4;
            }
         }

         int[] var9 = this.field4289;
         this.field4289 = this.field4290;
         this.field4290 = var9;
      }

      if (var1 != null) {
         var3 = 0;

         for(var4 = 0; var4 < var1.field3223; ++var4) {
            for(var5 = 0; var5 < var1.field3222; ++var5) {
               if (var1.field3224[var3++] != 0) {
                  var6 = var5 + 16 + var1.field3220;
                  int var7 = var4 + 16 + var1.field3225;
                  int var8 = var6 + (var7 << 7);
                  this.field4289[var8] = 0;
               }
            }
         }
      }

   }
}
