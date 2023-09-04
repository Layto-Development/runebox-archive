public class class463 {
   public static int field3663 = 0;
   public static long[] field3665 = new long[1000];
   static boolean field3658 = false;
   static boolean field3660 = false;
   static int field3655;
   static int field3656 = 0;
   static int field3657;
   static int field3659 = 0;
   static int field3661;
   static int field3662;
   static int field3664;

   class463() throws Throwable {
   }

   public static long method2186(int var0) {
      return field3665[var0];
   }

   public static int method2180(int var0) {
      long var3 = field3665[var0];
      int var2 = (int)(var3 >>> 0 & 127L);
      return var2;
   }

   public static int method2179(int var0) {
      long var3 = field3665[var0];
      int var2 = (int)(var3 >>> 7 & 127L);
      return var2;
   }

   public static int method2184(long var0) {
      return (int)(var0 >>> 14 & 3L);
   }

   public static int method2185(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   public static long method2187(int var0, int var1, int var2, boolean var3, int var4) {
      long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if (var3) {
         var6 |= 65536L;
      }

      return var6;
   }

   public static final void method2182(int var0, int var1) {
      field3656 = var0;
      field3659 = var1;
      field3660 = true;
      field3663 = 0;
      field3658 = false;
   }

   public static final void method2183() {
      field3660 = false;
      field3663 = 0;
   }

   static final boolean method2181() {
      return field3660;
   }

   static final void method2178() {
      if (!field3658) {
         int var1 = class408.field2842;
         int var2 = class408.field2843;
         int var3 = class408.field2876;
         int var4 = class408.field2844;
         int var5 = 50;
         int var6 = 3500;
         int var7 = (field3656 - class480.method2263()) * var5 / class480.method2268();
         int var8 = (field3659 - class480.method2264()) * var5 / class480.method2268();
         int var9 = (field3656 - class480.method2263()) * var6 / class480.method2268();
         int var10 = (field3659 - class480.method2264()) * var6 / class480.method2268();
         int var11 = class370.method1731(var8, var5, var2, var1);
         int var12 = var5 * var2 - var1 * var8 >> 16;
         var8 = var11;
         var11 = class370.method1731(var10, var6, var2, var1);
         int var13 = var6 * var2 - var1 * var10 >> 16;
         var10 = var11;
         var11 = class370.method1732(var7, var12, var4, var3);
         var5 = class370.method1733(var7, var12, var4, var3);
         var7 = var11;
         var11 = class370.method1732(var9, var13, var4, var3);
         var6 = class370.method1733(var9, var13, var4, var3);
         field3655 = (var11 + var7) / 2;
         field3664 = (var8 + var10) / 2;
         field3661 = (var5 + var6) / 2;
         class309.field2092 = (var11 - var7) / 2;
         field3657 = (var10 - var8) / 2;
         class492.field3936 = (var6 - var5) / 2;
         field3662 = Math.abs(class309.field2092);
         class295.field2024 = Math.abs(field3657);
         class298.field2034 = Math.abs(class492.field3936);
      }
   }
}
