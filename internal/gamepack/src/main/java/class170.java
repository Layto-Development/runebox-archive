public class class170 {
   static int[] field1081;

   class170() throws Throwable {
   }

   static final void method656(int var0, int var1) {
      if (var0 < 128) {
         var0 = 128;
      } else if (var0 > 383) {
         var0 = 383;
      }

      if (class249.field1796 < var0) {
         class249.field1796 += class430.field3364 * (var0 - class249.field1796) / 1000 + class79.field553;
         if (class249.field1796 > var0) {
            class249.field1796 = var0;
         }
      } else if (class249.field1796 > var0) {
         class249.field1796 -= class79.field553 + (class249.field1796 - var0) * class430.field3364 / 1000;
         if (class249.field1796 < var0) {
            class249.field1796 = var0;
         }
      }

      var1 &= 2047;
      int var3 = var1 - class455.field3578;
      if (var3 > 1024) {
         var3 -= 2048;
      } else if (var3 < -1024) {
         var3 += 2048;
      }

      if (var3 > 0) {
         class455.field3578 += var3 * class430.field3364 / 1000 + class79.field553;
         class455.field3578 &= 2047;
      } else if (var3 < 0) {
         class455.field3578 -= -var3 * class430.field3364 / 1000 + class79.field553;
         class455.field3578 &= 2047;
      }

      int var4 = var1 - class455.field3578;
      if (var4 > 1024) {
         var4 -= 2048;
      } else if (var4 < -1024) {
         var4 += 2048;
      }

      if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
         class455.field3578 = var1;
      }

   }
}
