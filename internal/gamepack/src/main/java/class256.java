public class class256 {
   public static int field2259 = 0;
   public static long[] field2261 = new long[1000];
   static boolean field2254 = false;
   static boolean field2256 = false;
   static int field2251;
   static int field2252 = 0;
   static int field2253;
   static int field2255 = 0;
   static int field2257;
   static int field2258;
   static int field2260;

   class256() throws Throwable {
   }

   public static long method1472(int var0) {
      return field2261[var0];
   }

   public static int method1466(int var0) {
      long var3 = field2261[var0];
      int var2 = (int)(var3 >>> 0 & 127L);
      return var2;
   }

   public static int method1465(int var0) {
      long var3 = field2261[var0];
      int var2 = (int)(var3 >>> 7 & 127L);
      return var2;
   }

   public static int method1470(long var0) {
      return (int)(var0 >>> 14 & 3L);
   }

   public static int method1471(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   public static long method1473(int var0, int var1, int var2, boolean var3, int var4) {
      long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if (var3) {
         var6 |= 65536L;
      }

      return var6;
   }

   public static final void method1468(int var0, int var1) {
      field2252 = var0;
      field2255 = var1;
      field2256 = true;
      field2259 = 0;
      field2254 = false;
   }

   public static final void method1469() {
      field2256 = false;
      field2259 = 0;
   }

   static final boolean method1467() {
      return field2256;
   }

   static final void method1464() {
      if (!field2254) {
         int var1 = class175.field1758;
         int var2 = class175.field1759;
         int var3 = class175.field1792;
         int var4 = class175.field1760;
         int var5 = 50;
         int var6 = 3500;
         int var7 = (field2252 - class399.method1936()) * var5 / class399.method1941();
         int var8 = (field2255 - class399.method1937()) * var5 / class399.method1941();
         int var9 = (field2252 - class399.method1936()) * var6 / class399.method1941();
         int var10 = (field2255 - class399.method1937()) * var6 / class399.method1941();
         int var11 = class243.method1444(var8, var5, var2, var1);
         int var12 = var5 * var2 - var1 * var8 >> 16;
         var8 = var11;
         var11 = class243.method1444(var10, var6, var2, var1);
         int var13 = var6 * var2 - var1 * var10 >> 16;
         var10 = var11;
         var11 = class243.method1445(var7, var12, var4, var3);
         var5 = class243.method1446(var7, var12, var4, var3);
         var7 = var11;
         var11 = class243.method1445(var9, var13, var4, var3);
         var6 = class243.method1446(var9, var13, var4, var3);
         field2251 = (var11 + var7) / 2;
         field2260 = (var8 + var10) / 2;
         field2257 = (var5 + var6) / 2;
         class287.field2444 = (var11 - var7) / 2;
         field2253 = (var10 - var8) / 2;
         class488.field3852 = (var6 - var5) / 2;
         field2258 = Math.abs(class287.field2444);
         class403.field3119 = Math.abs(field2253);
         class462.field3592 = Math.abs(class488.field3852);
      }
   }
}
