public class class164 {
   static float field1055;
   static float[][] field1051 = new float[2][8];
   static int field1056;
   static int[][] field1050 = new int[2][8];
   int[] field1053 = new int[2];
   int[] field1054 = new int[2];
   int[][][] field1052 = new int[2][2][4];
   int[][][] field1057 = new int[2][2][4];

   class164() {
   }

   float method627(int var1, int var2, float var3) {
      float var4 = (float)this.field1052[var1][0][var2] + var3 * (float)(this.field1052[var1][1][var2] - this.field1052[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0, (double)(-var4 / 20.0F));
   }

   float method628(int var1, int var2, float var3) {
      float var4 = (float)this.field1057[var1][0][var2] + var3 * (float)(this.field1057[var1][1][var2] - this.field1057[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return method629(var4);
   }

   int method630(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = (float)this.field1054[0] + (float)(this.field1054[1] - this.field1054[0]) * var2;
         var3 *= 0.0030517578F;
         field1055 = (float)Math.pow(0.1, (double)(var3 / 20.0F));
         field1056 = (int)(field1055 * 65536.0F);
      }

      if (this.field1053[var1] == 0) {
         return 0;
      } else {
         var3 = this.method627(var1, 0, var2);
         field1051[var1][0] = var3 * -2.0F * (float)Math.cos((double)this.method628(var1, 0, var2));
         field1051[var1][1] = var3 * var3;

         float[] var10000;
         int var4;
         for(var4 = 1; var4 < this.field1053[var1]; ++var4) {
            var3 = this.method627(var1, var4, var2);
            float var5 = var3 * -2.0F * (float)Math.cos((double)this.method628(var1, var4, var2));
            float var6 = var3 * var3;
            field1051[var1][var4 * 2 + 1] = field1051[var1][var4 * 2 - 1] * var6;
            field1051[var1][var4 * 2] = field1051[var1][var4 * 2 - 1] * var5 + field1051[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               var10000 = field1051[var1];
               var10000[var7] += field1051[var1][var7 - 1] * var5 + field1051[var1][var7 - 2] * var6;
            }

            var10000 = field1051[var1];
            var10000[1] += field1051[var1][0] * var5 + var6;
            var10000 = field1051[var1];
            var10000[0] += var5;
         }

         if (var1 == 0) {
            for(var4 = 0; var4 < this.field1053[0] * 2; ++var4) {
               var10000 = field1051[0];
               var10000[var4] *= field1055;
            }
         }

         for(var4 = 0; var4 < this.field1053[var1] * 2; ++var4) {
            field1050[var1][var4] = (int)(field1051[var1][var4] * 65536.0F);
         }

         return this.field1053[var1] * 2;
      }
   }

   final void method626(class366 var1, class7 var2) {
      int var3 = var1.method1654();
      this.field1053[0] = var3 >> 4;
      this.field1053[1] = var3 & 15;
      if (var3 != 0) {
         this.field1054[0] = var1.method1703();
         this.field1054[1] = var1.method1703();
         int var4 = var1.method1654();

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field1053[var5]; ++var6) {
               this.field1057[var5][0][var6] = var1.method1703();
               this.field1052[var5][0][var6] = var1.method1703();
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field1053[var5]; ++var6) {
               if ((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.field1057[var5][1][var6] = var1.method1703();
                  this.field1052[var5][1][var6] = var1.method1703();
               } else {
                  this.field1057[var5][1][var6] = this.field1057[var5][0][var6];
                  this.field1052[var5][1][var6] = this.field1052[var5][0][var6];
               }
            }
         }

         if (var4 != 0 || this.field1054[1] != this.field1054[0]) {
            var2.method54(var1);
         }
      } else {
         int[] var7 = this.field1054;
         this.field1054[1] = 0;
         var7[0] = 0;
      }

   }

   static float method629(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }
}
