public abstract class class440 extends class156 {
   boolean field3329 = false;
   boolean field3331 = false;
   class255 field3328;
   int[] field3330;

   class440(class255 var1) {
      this.field3330 = class399.field3106;
      this.field3328 = var1;
   }

   abstract void method2154(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   abstract void method2155(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

   abstract void method2156(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

   abstract void method2157(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   void method2151(int[] var1, int var2, int var3, float[] var4) {
      method947(var1, var2, var3, var4);
   }

   void method2153(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
      var10 = method2158(var10, var13, var14, var15, var16);
      var11 = method2158(var11, var13, var14, var15, var16);
      var12 = method2158(var12, var13, var14, var15, var16);
      this.method2155(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   void method2150(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
      int var15 = method2158(var10, var11, var12, var13, var14);
      var10 = this.field3330[var15];
      this.method2156(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   static int method2158(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 63;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & 127;
      int var8 = var4 & 255;
      if (var1 != -1) {
         var5 += (var1 - var5) * var8 >> 7;
      }

      if (var2 != -1) {
         var6 += (var2 - var6) * var8 >> 7;
      }

      if (var3 != -1) {
         var7 += (var3 - var7) * var8 >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & '\uffff';
   }

   static final int method2152(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }
}
