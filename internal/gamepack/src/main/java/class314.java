public class class314 {
   class503[] field2123 = new class503[10];
   int field2124;
   int field2125;

   class314(class366 var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.method1654();
         if (var3 != 0) {
            --var1.field2652;
            this.field2123[var2] = new class503();
            this.field2123[var2].method2396(var1);
         }
      }

      this.field2124 = var1.method1703();
      this.field2125 = var1.method1703();
   }

   public class404 method1435() {
      byte[] var1 = this.method1438();
      return new class404(22050, var1, this.field2124 * 22050 / 1000, this.field2125 * 22050 / 1000);
   }

   public final int method1436() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field2123[var2] != null && this.field2123[var2].field4028 / 20 < var1) {
            var1 = this.field2123[var2].field4028 / 20;
         }
      }

      if (this.field2124 < this.field2125 && this.field2124 / 20 < var1) {
         var1 = this.field2124 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.field2123[var2] != null) {
               class503 var10000 = this.field2123[var2];
               var10000.field4028 -= var1 * 20;
            }
         }

         if (this.field2124 < this.field2125) {
            this.field2124 -= var1 * 20;
            this.field2125 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   final byte[] method1438() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field2123[var2] != null && this.field2123[var2].field4020 + this.field2123[var2].field4028 > var1) {
            var1 = this.field2123[var2].field4020 + this.field2123[var2].field4028;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = var1 * 22050 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.field2123[var4] != null) {
               int var5 = this.field2123[var4].field4020 * 22050 / 1000;
               int var6 = this.field2123[var4].field4028 * 22050 / 1000;
               int[] var7 = this.field2123[var4].method2395(var5, this.field2123[var4].field4020);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if ((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   public static class314 method1437(class509 var0, int var1, int var2) {
      byte[] var3 = var0.method2422(var1, var2);
      return var3 == null ? null : new class314(new class366(var3));
   }
}
