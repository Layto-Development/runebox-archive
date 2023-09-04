public class class274 {
   static class331 field1921;
   static class396 field1923;
   static int[] field1924;
   boolean field1919;
   boolean[] field1922;
   class310 field1925;
   int[] field1920;
   int[] field1926;

   class274(class310 var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
      this.field1925 = var1;
      this.field1919 = var2;
      this.field1920 = var3;
      this.field1926 = var4;
      this.field1922 = var5;
   }

   void method1284(float[] var1, int var2) {
      int var4 = this.field1925.field2095.length;
      class310 var10000 = this.field1925;
      int var5 = class310.field2094[this.field1925.field2093 - 1];
      boolean[] var6 = this.field1922;
      this.field1922[1] = true;
      var6[0] = true;

      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      for(var7 = 2; var7 < var4; ++var7) {
         var8 = this.field1925.method1417(this.field1920, var7);
         var9 = this.field1925.method1414(this.field1920, var7);
         var10 = this.field1925.method1415(this.field1920[var8], this.field1926[var8], this.field1920[var9], this.field1926[var9], this.field1920[var7]);
         var11 = this.field1926[var7];
         int var12 = var5 - var10;
         int var14 = (var12 < var10 ? var12 : var10) << 1;
         if (var11 != 0) {
            boolean[] var15 = this.field1922;
            this.field1922[var9] = true;
            var15[var8] = true;
            this.field1922[var7] = true;
            if (var11 >= var14) {
               this.field1926[var7] = var12 > var10 ? var11 - var10 + var10 : var12 + (var10 - var11) - 1;
            } else {
               this.field1926[var7] = (var11 & 1) != 0 ? var10 - (var11 + 1) / 2 : var10 + var11 / 2;
            }
         } else {
            this.field1922[var7] = false;
            this.field1926[var7] = var10;
         }
      }

      this.method1286(0, var4 - 1);
      var7 = 0;
      var8 = this.field1925.field2093 * this.field1926[0];

      for(var9 = 1; var9 < var4; ++var9) {
         if (this.field1922[var9]) {
            var10 = this.field1920[var9];
            var11 = this.field1926[var9] * this.field1925.field2093;
            this.field1925.method1413(var7, var8, var10, var11, var1, var2);
            if (var10 >= var2) {
               return;
            }

            var7 = var10;
            var8 = var11;
         }
      }

      var10000 = this.field1925;
      float var17 = class310.field2096[var8];

      for(var10 = var7; var10 < var2; ++var10) {
         var1[var10] *= var17;
      }

   }

   boolean method1285() {
      return this.field1919;
   }

   void method1286(int var1, int var2) {
      if (var1 < var2) {
         int var4 = var1;
         int var5 = this.field1920[var1];
         int var6 = this.field1926[var1];
         boolean var7 = this.field1922[var1];

         for(int var8 = var1 + 1; var8 <= var2; ++var8) {
            int var9 = this.field1920[var8];
            if (var9 < var5) {
               this.field1920[var4] = var9;
               this.field1926[var4] = this.field1926[var8];
               this.field1922[var4] = this.field1922[var8];
               ++var4;
               this.field1920[var8] = this.field1920[var4];
               this.field1926[var8] = this.field1926[var4];
               this.field1922[var8] = this.field1922[var4];
            }
         }

         this.field1920[var4] = var5;
         this.field1926[var4] = var6;
         this.field1922[var4] = var7;
         this.method1286(var1, var4 - 1);
         this.method1286(var4 + 1, var2);
      }
   }
}
