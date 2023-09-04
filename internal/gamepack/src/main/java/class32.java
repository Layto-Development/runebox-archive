public class class32 {
   static int[] field304;

   static {
      new Object();
      field304 = new int[33];
      field304[0] = 0;
      int var0 = 2;

      for(int var1 = 1; var1 < 33; ++var1) {
         field304[var1] = var0 - 1;
         var0 += var0;
      }

   }

   class32() throws Throwable {
   }

   public static int method141(int var0, int var1) {
      int var3;
      for(var3 = 1; var1 > 1; var1 >>= 1) {
         if ((var1 & 1) != 0) {
            var3 *= var0;
         }

         var0 *= var0;
      }

      if (var1 == 1) {
         return var0 * var3;
      } else {
         return var3;
      }
   }

   public static int method140(int var0) {
      return field304[var0];
   }

   public static int method142(int var0, int var1, int var2) {
      int var4 = method140(var2 - var1 + 1);
      var4 <<= var1;
      return var0 & ~var4;
   }

   public static int method144(int var0, int var1, int var2) {
      int var4 = method140(var2 - var1 + 1);
      var4 <<= var1;
      var0 |= var4;
      return var0;
   }

   public static int method143(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   public static int method138(int var0) {
      int var2 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var2 += 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var2 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var2 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var2 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         ++var2;
      }

      return var2 + var0;
   }

   public static int method139(int var0, int var1) {
      int var3 = var0 >>> 31;
      return (var0 + var3) / var1 - var3;
   }
}
