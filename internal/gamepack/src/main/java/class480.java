public class class480 {
   public static class515 field3797;
   public static int[] field3792 = new int[65536];
   public static int[] field3793 = new int[2048];
   public static int[] field3795 = new int[2048];
   static class471 field3798;
   static int[] field3794 = new int[2048];
   static int[] field3796 = new int[512];
   static final class471 field3799;
   static final class471 field3800;

   static {
      int var0;
      for(var0 = 1; var0 < 512; ++var0) {
         field3796[var0] = '\u8000' / var0;
      }

      for(var0 = 1; var0 < 2048; ++var0) {
         field3794[var0] = 65536 / var0;
      }

      for(var0 = 0; var0 < 2048; ++var0) {
         field3795[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
         field3793[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
      }

      field3797 = new class515();
      field3799 = new class362(field3797);
      field3800 = new class305(field3797);
      field3798 = field3799;
   }

   class480() throws Throwable {
   }

   public static void method2272(boolean var0) {
      if (var0 && class427.field3334 != null) {
         field3798 = field3800;
      } else {
         field3798 = field3799;
      }

   }

   public static void method2260(class214 var0) {
      field3797.field4112 = var0;
   }

   public static void method2261(double var0) {
      method2279(var0, 0, 512);
   }

   static void method2279(double var0, int var2, int var3) {
      int var4 = var2 * 128;

      for(int var5 = var2; var5 < var3; ++var5) {
         double var6 = (double)(var5 >> 3) / 64.0 + 0.0078125;
         double var8 = (double)(var5 & 7) / 8.0 + 0.0625;

         for(int var10 = 0; var10 < 128; ++var10) {
            double var11 = (double)var10 / 128.0;
            double var13 = var11;
            double var15 = var11;
            double var17 = var11;
            if (var8 != 0.0) {
               double var19;
               if (var11 < 0.5) {
                  var19 = var11 * (var8 + 1.0);
               } else {
                  var19 = var11 + var8 - var11 * var8;
               }

               double var21 = var11 * 2.0 - var19;
               double var23 = var6 + 0.3333333333333333;
               if (var23 > 1.0) {
                  --var23;
               }

               double var27 = var6 - 0.3333333333333333;
               if (var27 < 0.0) {
                  ++var27;
               }

               if (var23 * 6.0 < 1.0) {
                  var13 = var21 + (var19 - var21) * 6.0 * var23;
               } else if (var23 * 2.0 < 1.0) {
                  var13 = var19;
               } else if (var23 * 3.0 < 2.0) {
                  var13 = var21 + (var19 - var21) * (0.6666666666666666 - var23) * 6.0;
               } else {
                  var13 = var21;
               }

               if (var6 * 6.0 < 1.0) {
                  var15 = var21 + (var19 - var21) * 6.0 * var6;
               } else if (var6 * 2.0 < 1.0) {
                  var15 = var19;
               } else if (var6 * 3.0 < 2.0) {
                  var15 = var21 + (var19 - var21) * (0.6666666666666666 - var6) * 6.0;
               } else {
                  var15 = var21;
               }

               if (var27 * 6.0 < 1.0) {
                  var17 = var21 + (var19 - var21) * 6.0 * var27;
               } else if (var27 * 2.0 < 1.0) {
                  var17 = var19;
               } else if (var27 * 3.0 < 2.0) {
                  var17 = var21 + (var19 - var21) * (0.6666666666666666 - var27) * 6.0;
               } else {
                  var17 = var21;
               }
            }

            int var30 = (int)(var13 * 256.0);
            int var20 = (int)(var15 * 256.0);
            int var29 = (int)(var17 * 256.0);
            int var22 = (var30 << 16) + (var20 << 8) + var29;
            var22 = method2278(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            field3792[var4++] = var22;
         }
      }

   }

   static int method2278(int var0, double var1) {
      double var3 = (double)(var0 >> 16) / 256.0;
      double var5 = (double)(var0 >> 8 & 255) / 256.0;
      double var7 = (double)(var0 & 255) / 256.0;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0);
      int var10 = (int)(var5 * 256.0);
      int var11 = (int)(var7 * 256.0);
      return (var9 << 16) + (var10 << 8) + var11;
   }

   static int method2263() {
      return field3797.field4110;
   }

   static int method2264() {
      return field3797.field4119;
   }

   static int method2265() {
      return field3797.field4115;
   }

   static int method2262() {
      return field3797.field4121;
   }

   static int method2266() {
      return field3797.field4123;
   }

   static int method2267() {
      return field3797.field4122;
   }

   public static int method2268() {
      return field3797.field4113;
   }

   static int method2269() {
      return field3797.field4118;
   }

   public static void method2270(int[] var0, int var1, int var2, float[] var3) {
      if (var3 == null && field3798 == field3800) {
         field3798 = field3799;
      }

      field3798.method2221(var0, var1, var2, var3);
   }

   public static void method2271() {
      method2280(class427.field3336, class427.field3337, class427.field3330, class427.field3335);
   }

   static void method2280(int var0, int var1, int var2, int var3) {
      field3797.field4118 = var2 - var0;
      field3797.field4116 = var3 - var1;
      method2273();
      if (field3797.field4120.length < field3797.field4116) {
         field3797.field4120 = new int[class32.method143(field3797.field4116)];
      }

      int var4 = var1 * class427.field3331 + var0;

      for(int var5 = 0; var5 < field3797.field4116; ++var5) {
         field3797.field4120[var5] = var4;
         var4 += class427.field3331;
      }

   }

   public static void method2273() {
      field3797.method2472();
   }

   public static void method2282(int var0, int var1) {
      int var2 = field3797.field4120[0];
      int var3 = var2 / class427.field3331;
      int var4 = var2 - var3 * class427.field3331;
      field3797.method2474(var0, var4, var1, var3);
   }

   public static void method2274(int var0, int var1, int var2) {
      field3797.method2473(var0, var1, var2);
   }

   static void method2277(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      field3798.method2225(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public static void method2284(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      field3798.method2226(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   static void method2275(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      field3798.method2227(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   static void method2276(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      field3798.method2224(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   static void method2281(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
      field3798.method2223(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
   }

   static void method2283(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
      field3798.method2220(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }
}
