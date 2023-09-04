public class class349 {
   static int[] field2769;

   static {
      new Object();
      field2769 = new int[33];
      field2769[0] = 0;
      int var0 = 2;

      for(int var1 = 1; var1 < 33; ++var1) {
         field2769[var1] = var0 - 1;
         var0 += var0;
      }

   }

   class349() throws Throwable {
   }

   public static int method1806(int var0, int var1) {
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

   public static int method1805(int var0) {
      return field2769[var0];
   }

   public static int method1807(int var0, int var1, int var2) {
      int var4 = method1805(var2 - var1 + 1);
      var4 <<= var1;
      return var0 & ~var4;
   }

   public static int method1809(int var0, int var1, int var2) {
      int var4 = method1805(var2 - var1 + 1);
      var4 <<= var1;
      var0 |= var4;
      return var0;
   }

   public static int method1808(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   public static int method1803(int var0) {
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

   public static int method1804(int var0, int var1) {
      int var3 = var0 >>> 31;
      return (var0 + var3) / var1 - var3;
   }
}
