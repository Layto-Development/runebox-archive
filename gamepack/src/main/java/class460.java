public final class class460 extends class282 {
   public class460(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   public class460(byte[] var1) {
      super(var1);
   }

   final void method1563(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * class156.field1648;
      int var8 = class156.field1648 - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var3 < class156.field1654) {
         var11 = class156.field1654 - var3;
         var5 -= var11;
         var3 = class156.field1654;
         var10 += var11 * var4;
         var7 += var11 * class156.field1648;
      }

      if (var3 + var5 > class156.field1652) {
         var5 -= var3 + var5 - class156.field1652;
      }

      if (var2 < class156.field1653) {
         var11 = class156.field1653 - var2;
         var4 -= var11;
         var2 = class156.field1653;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var2 + var4 > class156.field1647) {
         var11 = var2 + var4 - class156.field1647;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var4 > 0 && var5 > 0) {
         method1584(class156.field1650, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   final void method1583(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var3 * class156.field1648;
      int var9 = class156.field1648 - var4;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if (var3 < class156.field1654) {
         var12 = class156.field1654 - var3;
         var5 -= var12;
         var3 = class156.field1654;
         var11 += var12 * var4;
         var8 += var12 * class156.field1648;
      }

      if (var3 + var5 > class156.field1652) {
         var5 -= var3 + var5 - class156.field1652;
      }

      if (var2 < class156.field1653) {
         var12 = class156.field1653 - var2;
         var4 -= var12;
         var2 = class156.field1653;
         var11 += var12;
         var8 += var12;
         var10 += var12;
         var9 += var12;
      }

      if (var2 + var4 > class156.field1647) {
         var12 = var2 + var4 - class156.field1647;
         var4 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if (var4 > 0 && var5 > 0) {
         method1586(class156.field1650, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }
}
