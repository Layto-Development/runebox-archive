public class class486 {
   static float field3846;
   static float[][] field3842 = new float[2][8];
   static int field3847;
   static int[][] field3841 = new int[2][8];
   int[] field3844 = new int[2];
   int[] field3845 = new int[2];
   int[][][] field3843 = new int[2][2][4];
   int[][][] field3848 = new int[2][2][4];

   class486() {
   }

   float method2376(int var1, int var2, float var3) {
      float var4 = (float)this.field3843[var1][0][var2] + var3 * (float)(this.field3843[var1][1][var2] - this.field3843[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0, (double)(-var4 / 20.0F));
   }

   float method2377(int var1, int var2, float var3) {
      float var4 = (float)this.field3848[var1][0][var2] + var3 * (float)(this.field3848[var1][1][var2] - this.field3848[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return method2378(var4);
   }

   int method2379(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = (float)this.field3845[0] + (float)(this.field3845[1] - this.field3845[0]) * var2;
         var3 *= 0.0030517578F;
         field3846 = (float)Math.pow(0.1, (double)(var3 / 20.0F));
         field3847 = (int)(field3846 * 65536.0F);
      }

      if (this.field3844[var1] == 0) {
         return 0;
      } else {
         var3 = this.method2376(var1, 0, var2);
         field3842[var1][0] = var3 * -2.0F * (float)Math.cos((double)this.method2377(var1, 0, var2));
         field3842[var1][1] = var3 * var3;

         float[] var10000;
         int var4;
         for(var4 = 1; var4 < this.field3844[var1]; ++var4) {
            var3 = this.method2376(var1, var4, var2);
            float var5 = var3 * -2.0F * (float)Math.cos((double)this.method2377(var1, var4, var2));
            float var6 = var3 * var3;
            field3842[var1][var4 * 2 + 1] = field3842[var1][var4 * 2 - 1] * var6;
            field3842[var1][var4 * 2] = field3842[var1][var4 * 2 - 1] * var5 + field3842[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               var10000 = field3842[var1];
               var10000[var7] += field3842[var1][var7 - 1] * var5 + field3842[var1][var7 - 2] * var6;
            }

            var10000 = field3842[var1];
            var10000[1] += field3842[var1][0] * var5 + var6;
            var10000 = field3842[var1];
            var10000[0] += var5;
         }

         if (var1 == 0) {
            for(var4 = 0; var4 < this.field3844[0] * 2; ++var4) {
               var10000 = field3842[0];
               var10000[var4] *= field3846;
            }
         }

         for(var4 = 0; var4 < this.field3844[var1] * 2; ++var4) {
            field3841[var1][var4] = (int)(field3842[var1][var4] * 65536.0F);
         }

         return this.field3844[var1] * 2;
      }
   }

   final void method2375(class184 var1, class471 var2) {
      int var3 = var1.readUnsignedByte();
      this.field3844[0] = var3 >> 4;
      this.field3844[1] = var3 & 15;
      if (var3 != 0) {
         this.field3845[0] = var1.method1174();
         this.field3845[1] = var1.method1174();
         int var4 = var1.readUnsignedByte();

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field3844[var5]; ++var6) {
               this.field3848[var5][0][var6] = var1.method1174();
               this.field3843[var5][0][var6] = var1.method1174();
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field3844[var5]; ++var6) {
               if ((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.field3848[var5][1][var6] = var1.method1174();
                  this.field3843[var5][1][var6] = var1.method1174();
               } else {
                  this.field3848[var5][1][var6] = this.field3848[var5][0][var6];
                  this.field3843[var5][1][var6] = this.field3843[var5][0][var6];
               }
            }
         }

         if (var4 != 0 || this.field3845[1] != this.field3845[0]) {
            var2.method2279(var1);
         }
      } else {
         int[] var7 = this.field3845;
         this.field3845[1] = 0;
         var7[0] = 0;
      }

   }

   static float method2378(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }
}
