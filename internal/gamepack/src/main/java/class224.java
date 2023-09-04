public class class224 {
   int field2076;
   int field2077;
   int field2078;
   int field2079;
   int field2080;
   int field2081;
   int[] field2082;

   class224() {
      class225 var1 = class223.field2050;
      this.field2079 = var1.method1332(16);
      this.field2077 = var1.method1332(24);
      this.field2076 = var1.method1332(24);
      this.field2078 = var1.method1332(24) + 1;
      this.field2080 = var1.method1332(6) + 1;
      this.field2081 = var1.method1332(8);
      int[] var2 = new int[this.field2080];

      int var3;
      for(var3 = 0; var3 < this.field2080; ++var3) {
         int var4 = 0;
         int var5 = var1.method1332(3);
         boolean var6 = var1.method1333() != 0;
         if (var6) {
            var4 = var1.method1332(5);
         }

         var2[var3] = var4 << 3 | var5;
      }

      this.field2082 = new int[this.field2080 * 8];

      for(var3 = 0; var3 < this.field2080 * 8; ++var3) {
         this.field2082[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? var1.method1332(8) : -1;
      }

   }

   void method1331(float[] var1, int var2, boolean var3, class225 var4) {
      int var5;
      for(var5 = 0; var5 < var2; ++var5) {
         var1[var5] = 0.0F;
      }

      if (!var3) {
         var5 = class223.field2053[this.field2081].field886;
         int var6 = this.field2076 - this.field2077;
         int var7 = var6 / this.field2078;
         int[] var8 = new int[var7];

         for(int var9 = 0; var9 < 8; ++var9) {
            int var10 = 0;

            while(var10 < var7) {
               int var11;
               int var12;
               if (var9 == 0) {
                  var11 = class223.field2053[this.field2081].method561(var4);

                  for(var12 = var5 - 1; var12 >= 0; --var12) {
                     if (var10 + var12 < var7) {
                        var8[var10 + var12] = var11 % this.field2080;
                     }

                     var11 /= this.field2080;
                  }
               }

               for(var11 = 0; var11 < var5; ++var11) {
                  var12 = var8[var10];
                  int var13 = this.field2082[var12 * 8 + var9];
                  if (var13 >= 0) {
                     int var14 = this.field2077 + var10 * this.field2078;
                     class36 var15 = class223.field2053[var13];
                     int var16;
                     if (this.field2079 == 0) {
                        var16 = this.field2078 / var15.field886;

                        for(int var20 = 0; var20 < var16; ++var20) {
                           float[] var21 = var15.method560(var4);

                           for(int var19 = 0; var19 < var15.field886; ++var19) {
                              var1[var14 + var20 + var19 * var16] += var21[var19];
                           }
                        }
                     } else {
                        var16 = 0;

                        while(var16 < this.field2078) {
                           float[] var17 = var15.method560(var4);

                           for(int var18 = 0; var18 < var15.field886; ++var18) {
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
