import java.util.Random;

public class class434 {
   static int[] field3297;
   static int[] field3303 = new int['\u8000'];
   static int[] field3304;
   static int[] field3305;
   static int[] field3307;
   static int[] field3308;
   static int[] field3309;
   static int[] field3310;
   class471 field3287;
   class471 field3288;
   class471 field3290;
   class471 field3291;
   class471 field3292;
   class471 field3294;
   class471 field3295;
   class471 field3299;
   class471 field3306;
   class486 field3298;
   int field3293 = 500;
   int field3296 = 0;
   int field3300 = 100;
   int field3301 = 0;
   int[] field3286 = new int[]{0, 0, 0, 0, 0};
   int[] field3289 = new int[]{0, 0, 0, 0, 0};
   int[] field3302 = new int[]{0, 0, 0, 0, 0};

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < 32768; ++var1) {
         field3303[var1] = (var0.nextInt() & 2) - 1;
      }

      field3304 = new int['\u8000'];

      for(var1 = 0; var1 < 32768; ++var1) {
         field3304[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
      }

      field3308 = new int[220500];
      field3305 = new int[5];
      field3307 = new int[5];
      field3310 = new int[5];
      field3309 = new int[5];
      field3297 = new int[5];
   }

   class434() {
   }

   final int[] method2131(int var1, int var2) {
      class324.method1711(field3308, 0, var1);
      if (var2 < 10) {
         return field3308;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0);
         this.field3295.method2277();
         this.field3306.method2277();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.field3287 != null) {
            this.field3287.method2277();
            this.field3288.method2277();
            var5 = (int)((double)(this.field3287.field3620 - this.field3287.field3623) * 32.768 / var3);
            var6 = (int)((double)this.field3287.field3623 * 32.768 / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.field3294 != null) {
            this.field3294.method2277();
            this.field3290.method2277();
            var8 = (int)((double)(this.field3294.field3620 - this.field3294.field3623) * 32.768 / var3);
            var9 = (int)((double)this.field3294.field3623 * 32.768 / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.field3289[var11] != 0) {
               field3305[var11] = 0;
               field3307[var11] = (int)((double)this.field3302[var11] * var3);
               field3310[var11] = (this.field3289[var11] << 14) / 100;
               field3309[var11] = (int)((double)(this.field3295.field3620 - this.field3295.field3623) * 32.768 * Math.pow(1.0057929410678534, (double)this.field3286[var11]) / var3);
               field3297[var11] = (int)((double)this.field3295.field3623 * 32.768 / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         int[] var10000;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field3295.method2276(var1);
            var13 = this.field3306.method2276(var1);
            if (this.field3287 != null) {
               var14 = this.field3287.method2276(var1);
               var15 = this.field3288.method2276(var1);
               var12 += this.method2133(var7, var15, this.field3287.field3624) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.field3294 != null) {
               var14 = this.field3294.method2276(var1);
               var15 = this.field3290.method2276(var1);
               var13 = var13 * ((this.method2133(var10, var15, this.field3294.field3624) >> 1) + '\u8000') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.field3289[var14] != 0) {
                  var15 = var11 + field3307[var14];
                  if (var15 < var1) {
                     var10000 = field3308;
                     var10000[var15] += this.method2133(field3305[var14], var13 * field3310[var14] >> 15, this.field3295.field3624);
                     var10000 = field3305;
                     var10000[var14] += (var12 * field3309[var14] >> 16) + field3297[var14];
                  }
               }
            }
         }

         int var16;
         if (this.field3291 != null) {
            this.field3291.method2277();
            this.field3292.method2277();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field3291.method2276(var1);
               var16 = this.field3292.method2276(var1);
               if (var20) {
                  var12 = this.field3291.field3623 + ((this.field3291.field3620 - this.field3291.field3623) * var15 >> 8);
               } else {
                  var12 = this.field3291.field3623 + ((this.field3291.field3620 - this.field3291.field3623) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if (var20) {
                  field3308[var14] = 0;
               }
            }
         }

         if (this.field3296 > 0 && this.field3300 > 0) {
            var11 = (int)((double)this.field3296 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               var10000 = field3308;
               var10000[var12] += field3308[var12 - var11] * this.field3300 / 100;
            }
         }

         if (this.field3298.field3844[0] > 0 || this.field3298.field3844[1] > 0) {
            this.field3299.method2277();
            var11 = this.field3299.method2276(var1 + 1);
            var12 = this.field3298.method2379(0, (float)var11 / 65536.0F);
            var13 = this.field3298.method2379(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)field3308[var14 + var12] * (long)class486.field3847 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)field3308[var14 + var12 - 1 - var17] * (long)class486.field3841[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)field3308[var14 - 1 - var17] * (long)class486.field3841[1][var17] >> 16);
                  }

                  field3308[var14] = var16;
                  var11 = this.field3299.method2276(var1 + 1);
                  ++var14;
               }

               boolean var21 = true;
               var15 = 128;

               while(true) {
                  if (var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)field3308[var14 + var12] * (long)class486.field3847 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)field3308[var14 + var12 - 1 - var18] * (long)class486.field3841[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)field3308[var14 - 1 - var18] * (long)class486.field3841[1][var18] >> 16);
                     }

                     field3308[var14] = var17;
                     var11 = this.field3299.method2276(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)field3308[var14 + var12 - 1 - var18] * (long)class486.field3841[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)field3308[var14 - 1 - var18] * (long)class486.field3841[1][var18] >> 16);
                        }

                        field3308[var14] = var17;
                        this.field3299.method2276(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field3298.method2379(0, (float)var11 / 65536.0F);
                  var13 = this.field3298.method2379(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (field3308[var11] < -32768) {
               field3308[var11] = -32768;
            }

            if (field3308[var11] > 32767) {
               field3308[var11] = 32767;
            }
         }

         return field3308;
      }
   }

   final int method2133(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return field3304[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? field3303[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   final void method2132(class184 var1) {
      this.field3295 = new class471();
      this.field3295.method2278(var1);
      this.field3306 = new class471();
      this.field3306.method2278(var1);
      int var2 = var1.method1125();
      if (var2 != 0) {
         --var1.field1818;
         this.field3287 = new class471();
         this.field3287.method2278(var1);
         this.field3288 = new class471();
         this.field3288.method2278(var1);
      }

      var2 = var1.method1125();
      if (var2 != 0) {
         --var1.field1818;
         this.field3294 = new class471();
         this.field3294.method2278(var1);
         this.field3290 = new class471();
         this.field3290.method2278(var1);
      }

      var2 = var1.method1125();
      if (var2 != 0) {
         --var1.field1818;
         this.field3291 = new class471();
         this.field3291.method2278(var1);
         this.field3292 = new class471();
         this.field3292.method2278(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.method1172();
         if (var4 == 0) {
            break;
         }

         this.field3289[var3] = var4;
         this.field3286[var3] = var1.method1136();
         this.field3302[var3] = var1.method1172();
      }

      this.field3296 = var1.method1172();
      this.field3300 = var1.method1172();
      this.field3293 = var1.method1174();
      this.field3301 = var1.method1174();
      this.field3298 = new class486();
      this.field3299 = new class471();
      this.field3298.method2375(var1, this.field3299);
   }
}
