public class class148 {
   float[][] field946;
   int field945;
   int field947;
   int[] field942;
   int[] field943;
   int[] field944;

   class148() {
      class216 var1 = class365.field2624;
      var1.method1100(24);
      this.field947 = var1.method1100(16);
      this.field945 = var1.method1100(24);
      this.field944 = new int[this.field945];
      boolean var2 = var1.method1101() != 0;
      int var3;
      int var4;
      int var6;
      if (var2) {
         var3 = 0;

         for(var4 = var1.method1100(5) + 1; var3 < this.field945; ++var4) {
            int var5 = var1.method1100(class32.method138(this.field945 - var3));

            for(var6 = 0; var6 < var5; ++var6) {
               this.field944[var3++] = var4;
            }
         }
      } else {
         boolean var15 = var1.method1101() != 0;

         for(var4 = 0; var4 < this.field945; ++var4) {
            if (var15 && var1.method1101() == 0) {
               this.field944[var4] = 0;
            } else {
               this.field944[var4] = var1.method1100(5) + 1;
            }
         }
      }

      this.method563();
      var3 = var1.method1100(4);
      if (var3 > 0) {
         float var16 = class365.method1639(var1.method1100(32));
         float var17 = class365.method1639(var1.method1100(32));
         var6 = var1.method1100(4) + 1;
         boolean var7 = var1.method1101() != 0;
         int var8;
         if (var3 == 1) {
            var8 = method566(this.field945, this.field947);
         } else {
            var8 = this.field945 * this.field947;
         }

         this.field942 = new int[var8];

         int var9;
         for(var9 = 0; var9 < var8; ++var9) {
            this.field942[var9] = var1.method1100(var6);
         }

         this.field946 = new float[this.field945][this.field947];
         float var10;
         int var11;
         int var12;
         if (var3 == 1) {
            for(var9 = 0; var9 < this.field945; ++var9) {
               var10 = 0.0F;
               var11 = 1;

               for(var12 = 0; var12 < this.field947; ++var12) {
                  int var13 = var9 / var11 % var8;
                  float var14 = (float)this.field942[var13] * var17 + var16 + var10;
                  this.field946[var9][var12] = var14;
                  if (var7) {
                     var10 = var14;
                  }

                  var11 *= var8;
               }
            }
         } else {
            for(var9 = 0; var9 < this.field945; ++var9) {
               var10 = 0.0F;
               var11 = var9 * this.field947;

               for(var12 = 0; var12 < this.field947; ++var12) {
                  float var18 = (float)this.field942[var11] * var17 + var16 + var10;
                  this.field946[var9][var12] = var18;
                  if (var7) {
                     var10 = var18;
                  }

                  ++var11;
               }
            }
         }
      }

   }

   void method563() {
      int[] var1 = new int[this.field945];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.field945; ++var3) {
         var4 = this.field944[var3];
         if (var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if (var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.field943 = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.field945; ++var3) {
         var4 = this.field944[var3];
         if (var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if ((var5 & var8) != 0) {
                  if (this.field943[var6] == 0) {
                     this.field943[var6] = var11;
                  }

                  var6 = this.field943[var6];
               } else {
                  ++var6;
               }

               if (var6 >= this.field943.length) {
                  int[] var12 = new int[this.field943.length * 2];

                  for(var10 = 0; var10 < this.field943.length; ++var10) {
                     var12[var10] = this.field943[var10];
                  }

                  this.field943 = var12;
               }

               var8 >>>= 1;
            }

            this.field943[var6] = ~var3;
            if (var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   int method565(class216 var1) {
      int var2;
      for(var2 = 0; this.field943[var2] >= 0; var2 = var1.method1101() != 0 ? this.field943[var2] : var2 + 1) {
      }

      return ~this.field943[var2];
   }

   float[] method564(class216 var1) {
      return this.field946[this.method565(var1)];
   }

   static int method566(int var0, int var1) {
      int var2;
      for(var2 = (int)Math.pow((double)var0, 1.0 / (double)var1) + 1; class32.method141(var2, var1) > var0; --var2) {
      }

      return var2;
   }
}
