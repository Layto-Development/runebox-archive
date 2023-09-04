public class class399 {
   public static class255 field3111;
   public static int[] field3106 = new int[65536];
   public static int[] field3107 = new int[2048];
   public static int[] field3109 = new int[2048];
   static class440 field3112;
   static int[] field3108 = new int[2048];
   static int[] field3110 = new int[512];
   static final class440 field3113;
   static final class440 field3114;

   static {
      int var0;
      for(var0 = 1; var0 < 512; ++var0) {
         field3110[var0] = '\u8000' / var0;
      }

      for(var0 = 1; var0 < 2048; ++var0) {
         field3108[var0] = 65536 / var0;
      }

      for(var0 = 0; var0 < 2048; ++var0) {
         field3109[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
         field3107[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
      }

      field3111 = new class255();
      field3113 = new class400(field3111);
      field3114 = new class176(field3111);
      field3112 = field3113;
   }

   class399() throws Throwable {
   }

   public static void method1945(boolean var0) {
      if (var0 && class156.field1651 != null) {
         field3112 = field3114;
      } else {
         field3112 = field3113;
      }

   }

   public static void method1933(class155 var0) {
      field3111.field2239 = var0;
   }

   public static void method1934(double var0) {
      method1952(var0, 0, 512);
   }

   static void method1952(double var0, int var2, int var3) {
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
            var22 = method1951(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            field3106[var4++] = var22;
         }
      }

   }

   static int method1951(int var0, double var1) {
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

   static int method1936() {
      return field3111.field2237;
   }

   static int method1937() {
      return field3111.field2246;
   }

   static int method1938() {
      return field3111.field2242;
   }

   static int method1935() {
      return field3111.field2248;
   }

   static int method1939() {
      return field3111.field2250;
   }

   static int method1940() {
      return field3111.field2249;
   }

   public static int method1941() {
      return field3111.field2240;
   }

   static int method1942() {
      return field3111.field2245;
   }

   public static void method1943(int[] var0, int var1, int var2, float[] var3) {
      if (var3 == null && field3112 == field3114) {
         field3112 = field3113;
      }

      field3112.method2151(var0, var1, var2, var3);
   }

   public static void method1944() {
      method1953(class156.field1653, class156.field1654, class156.field1647, class156.field1652);
   }

   static void method1953(int var0, int var1, int var2, int var3) {
      field3111.field2245 = var2 - var0;
      field3111.field2243 = var3 - var1;
      method1946();
      if (field3111.field2247.length < field3111.field2243) {
         field3111.field2247 = new int[class349.method1808(field3111.field2243)];
      }

      int var4 = var1 * class156.field1648 + var0;

      for(int var5 = 0; var5 < field3111.field2243; ++var5) {
         field3111.field2247[var5] = var4;
         var4 += class156.field1648;
      }

   }

   public static void method1946() {
      field3111.method1461();
   }

   public static void method1955(int var0, int var1) {
      int var2 = field3111.field2247[0];
      int var3 = var2 / class156.field1648;
      int var4 = var2 - var3 * class156.field1648;
      field3111.method1463(var0, var4, var1, var3);
   }

   public static void method1947(int var0, int var1, int var2) {
      field3111.method1462(var0, var1, var2);
   }

   static void method1950(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      field3112.method2155(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public static void method1957(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      field3112.method2156(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   static void method1948(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      field3112.method2157(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   static void method1949(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      field3112.method2154(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   static void method1954(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
      field3112.method2153(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
   }

   static void method1956(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
      field3112.method2150(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }
}
