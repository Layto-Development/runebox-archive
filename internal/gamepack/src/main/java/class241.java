import java.util.Comparator;

public class class241 implements Comparator {
   static class192 field1761;
   static class501[] field1763;
   static int field1760;
   boolean field1762;

   class241() {
   }

   int method1165(class199 var1, class199 var2) {
      if (var2.field1548 == var1.field1548) {
         return 0;
      } else {
         if (this.field1762) {
            if (var1.field1548 == Client.field1116) {
               return -1;
            }

            if (var2.field1548 == Client.field1116) {
               return 1;
            }
         }

         return var1.field1548 < var2.field1548 ? -1 : 1;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method1165((class199)var1, (class199)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static final void method1164(int var0, int var1, int var2, int var3, boolean var4) {
      if (var2 < 1) {
         var2 = 1;
      }

      if (var3 < 1) {
         var3 = 1;
      }

      int var6 = var3 - 334;
      int var7;
      if (var6 < 0) {
         var7 = Client.field1389;
      } else if (var6 >= 100) {
         var7 = Client.field1275;
      } else {
         var7 = Client.field1389 + var6 * (Client.field1275 - Client.field1389) / 100;
      }

      int var8 = 512 * var3 * var7 / (var2 * 334);
      int var9;
      int var10;
      short var17;
      if (var8 < Client.field1395) {
         var17 = Client.field1395;
         var7 = var2 * var17 * 334 / (var3 * 512);
         if (var7 > Client.field1225) {
            var7 = Client.field1225;
            var9 = var3 * var7 * 512 / (var17 * 334);
            var10 = (var2 - var9) / 2;
            if (var4) {
               class427.method1962();
               class427.method1968(var0, var1, var10, var3, -16777216);
               class427.method1968(var0 + var2 - var10, var1, var10, var3, -16777216);
            }

            var0 += var10;
            var2 -= var10 * 2;
         }
      } else if (var8 > Client.field1396) {
         var17 = Client.field1396;
         var7 = var17 * var2 * 334 / (var3 * 512);
         if (var7 < Client.field1393) {
            var7 = Client.field1393;
            var9 = var17 * var2 * 334 / (var7 * 512);
            var10 = (var3 - var9) / 2;
            if (var4) {
               class427.method1962();
               class427.method1968(var0, var1, var2, var10, -16777216);
               class427.method1968(var0, var3 + var1 - var10, var2, var10, -16777216);
            }

            var1 += var10;
            var3 -= var10 * 2;
         }
      }

      Client.field1401 = var7 * var3 / 334;
      if (var2 != Client.field1332 || Client.field1207 != var3) {
         int[] var18 = new int[9];

         for(var10 = 0; var10 < var18.length; ++var10) {
            int var11 = var10 * 32 + 128 + 15;
            int var12 = Client.method860(var11);
            int var13 = class480.field3795[var11];
            int var15 = var3 - 334;
            if (var15 < 0) {
               var15 = 0;
            } else if (var15 > 100) {
               var15 = 100;
            }

            int var16 = Client.field1391 + var15 * (Client.field1392 - Client.field1391) / 100;
            int var14 = var16 * var12 / 256;
            var18[var10] = var14 * var13 >> 16;
         }

         class408.method1872(var18, 500, 800, var2 * 334 / var3, 334);
      }

      Client.field1397 = var0;
      Client.field1398 = var1;
      Client.field1332 = var2;
      Client.field1207 = var3;
   }
}
