public class class50 {
   int field422;
   int field423;
   int field424;
   int field425;
   int field426;
   int field427;
   int[] field428;

   class50() {
      class216 var1 = class365.field2624;
      this.field425 = var1.method1100(16);
      this.field423 = var1.method1100(24);
      this.field422 = var1.method1100(24);
      this.field424 = var1.method1100(24) + 1;
      this.field426 = var1.method1100(6) + 1;
      this.field427 = var1.method1100(8);
      int[] var2 = new int[this.field426];

      int var3;
      for(var3 = 0; var3 < this.field426; ++var3) {
         int var4 = 0;
         int var5 = var1.method1100(3);
         boolean var6 = var1.method1101() != 0;
         if (var6) {
            var4 = var1.method1100(5);
         }

         var2[var3] = var4 << 3 | var5;
      }

      this.field428 = new int[this.field426 * 8];

      for(var3 = 0; var3 < this.field426 * 8; ++var3) {
         this.field428[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? var1.method1100(8) : -1;
      }

   }

   void method217(float[] var1, int var2, boolean var3, class216 var4) {
      int var5;
      for(var5 = 0; var5 < var2; ++var5) {
         var1[var5] = 0.0F;
      }

      if (!var3) {
         var5 = class365.field2627[this.field427].field947;
         int var6 = this.field422 - this.field423;
         int var7 = var6 / this.field424;
         int[] var8 = new int[var7];

         for(int var9 = 0; var9 < 8; ++var9) {
            int var10 = 0;

            while(var10 < var7) {
               int var11;
               int var12;
               if (var9 == 0) {
                  var11 = class365.field2627[this.field427].method565(var4);

                  for(var12 = var5 - 1; var12 >= 0; --var12) {
                     if (var10 + var12 < var7) {
                        var8[var10 + var12] = var11 % this.field426;
                     }

                     var11 /= this.field426;
                  }
               }

               for(var11 = 0; var11 < var5; ++var11) {
                  var12 = var8[var10];
                  int var13 = this.field428[var12 * 8 + var9];
                  if (var13 >= 0) {
                     int var14 = this.field423 + var10 * this.field424;
                     class148 var15 = class365.field2627[var13];
                     int var16;
                     if (this.field425 == 0) {
                        var16 = this.field424 / var15.field947;

                        for(int var20 = 0; var20 < var16; ++var20) {
                           float[] var21 = var15.method564(var4);

                           for(int var19 = 0; var19 < var15.field947; ++var19) {
                              var1[var14 + var20 + var19 * var16] += var21[var19];
                           }
                        }
                     } else {
                        var16 = 0;

                        while(var16 < this.field424) {
                           float[] var17 = var15.method564(var4);

                           for(int var18 = 0; var18 < var15.field947; ++var18) {
                              var1[var14 + var16] += var17[var18];
                              ++var16;
                           }
                        }
                     }
                  }

                  ++var10;
                  if (var10 >= var7) {
                     break;
                  }
               }
            }
         }

      }
   }
}
