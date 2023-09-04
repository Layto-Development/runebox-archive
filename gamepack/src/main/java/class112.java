public class class112 {
   static class168 field1450;
   static class460 field1452;
   static int[] field1453;
   boolean field1448;
   boolean[] field1451;
   class436 field1454;
   int[] field1449;
   int[] field1455;

   class112(class436 var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
      this.field1454 = var1;
      this.field1448 = var2;
      this.field1449 = var3;
      this.field1455 = var4;
      this.field1451 = var5;
   }

   void method806(float[] var1, int var2) {
      int var4 = this.field1454.field3314.length;
      class436 var10000 = this.field1454;
      int var5 = class436.field3313[this.field1454.field3312 - 1];
      boolean[] var6 = this.field1451;
      this.field1451[1] = true;
      var6[0] = true;

      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      for(var7 = 2; var7 < var4; ++var7) {
         var8 = this.field1454.method2141(this.field1449, var7);
         var9 = this.field1454.method2138(this.field1449, var7);
         var10 = this.field1454.method2139(this.field1449[var8], this.field1455[var8], this.field1449[var9], this.field1455[var9], this.field1449[var7]);
         var11 = this.field1455[var7];
         int var12 = var5 - var10;
         int var14 = (var12 < var10 ? var12 : var10) << 1;
         if (var11 != 0) {
            boolean[] var15 = this.field1451;
            this.field1451[var9] = true;
            var15[var8] = true;
            this.field1451[var7] = true;
            if (var11 >= var14) {
               this.field1455[var7] = var12 > var10 ? var11 - var10 + var10 : var12 + (var10 - var11) - 1;
            } else {
               this.field1455[var7] = (var11 & 1) != 0 ? var10 - (var11 + 1) / 2 : var10 + var11 / 2;
            }
         } else {
            this.field1451[var7] = false;
            this.field1455[var7] = var10;
         }
      }

      this.method808(0, var4 - 1);
      var7 = 0;
      var8 = this.field1454.field3312 * this.field1455[0];

      for(var9 = 1; var9 < var4; ++var9) {
         if (this.field1451[var9]) {
            var10 = this.field1449[var9];
            var11 = this.field1455[var9] * this.field1454.field3312;
            this.field1454.method2137(var7, var8, var10, var11, var1, var2);
            if (var10 >= var2) {
               return;
            }

            var7 = var10;
            var8 = var11;
         }
      }

      var10000 = this.field1454;
      float var17 = class436.field3315[var8];

      for(var10 = var7; var10 < var2; ++var10) {
         var1[var10] *= var17;
      }

   }

   boolean method807() {
      return this.field1448;
   }

   void method808(int var1, int var2) {
      if (var1 < var2) {
         int var4 = var1;
         int var5 = this.field1449[var1];
         int var6 = this.field1455[var1];
         boolean var7 = this.field1451[var1];

         for(int var8 = var1 + 1; var8 <= var2; ++var8) {
            int var9 = this.field1449[var8];
            if (var9 < var5) {
               this.field1449[var4] = var9;
               this.field1455[var4] = this.field1455[var8];
               this.field1451[var4] = this.field1451[var8];
               ++var4;
               this.field1449[var8] = this.field1449[var4];
               this.field1455[var8] = this.field1455[var4];
               this.field1451[var8] = this.field1451[var4];
            }
         }

         this.field1449[var4] = var5;
         this.field1455[var4] = var6;
         this.field1451[var4] = var7;
         this.method808(var1, var4 - 1);
         this.method808(var4 + 1, var2);
      }
   }
}
