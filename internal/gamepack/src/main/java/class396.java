public final class class396 extends class419 {
   public class396(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   public class396(byte[] var1) {
      super(var1);
   }

   final void method1912(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * class427.field3331;
      int var8 = class427.field3331 - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var3 < class427.field3337) {
         var11 = class427.field3337 - var3;
         var5 -= var11;
         var3 = class427.field3337;
         var10 += var11 * var4;
         var7 += var11 * class427.field3331;
      }

      if (var3 + var5 > class427.field3335) {
         var5 -= var3 + var5 - class427.field3335;
      }

      if (var2 < class427.field3336) {
         var11 = class427.field3336 - var2;
         var4 -= var11;
         var2 = class427.field3336;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var2 + var4 > class427.field3330) {
         var11 = var2 + var4 - class427.field3330;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var4 > 0 && var5 > 0) {
         method1933(class427.field3333, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   final void method1932(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var3 * class427.field3331;
      int var9 = class427.field3331 - var4;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if (var3 < class427.field3337) {
         var12 = class427.field3337 - var3;
         var5 -= var12;
         var3 = class427.field3337;
         var11 += var12 * var4;
         var8 += var12 * class427.field3331;
      }

      if (var3 + var5 > class427.field3335) {
         var5 -= var3 + var5 - class427.field3335;
      }

      if (var2 < class427.field3336) {
         var12 = class427.field3336 - var2;
         var4 -= var12;
         var2 = class427.field3336;
         var11 += var12;
         var8 += var12;
         var10 += var12;
         var9 += var12;
      }

      if (var2 + var4 > class427.field3330) {
         var12 = var2 + var4 - class427.field3330;
         var4 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if (var4 > 0 && var5 > 0) {
         method1935(class427.field3333, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }
}
