public class class513 {
   static int[] field3984;

   class513() throws Throwable {
   }

   static final void method2463(int var0, int var1) {
      if (var0 < 128) {
         var0 = 128;
      } else if (var0 > 383) {
         var0 = 383;
      }

      if (class382.field3061 < var0) {
         class382.field3061 += class444.field3385 * (var0 - class382.field3061) / 1000 + class180.field1809;
         if (class382.field3061 > var0) {
            class382.field3061 = var0;
         }
      } else if (class382.field3061 > var0) {
         class382.field3061 -= class180.field1809 + (class382.field3061 - var0) * class444.field3385 / 1000;
         if (class382.field3061 < var0) {
            class382.field3061 = var0;
         }
      }

      var1 &= 2047;
      int var3 = var1 - class333.field2680;
      if (var3 > 1024) {
         var3 -= 2048;
      } else if (var3 < -1024) {
         var3 += 2048;
      }

      if (var3 > 0) {
         class333.field2680 += var3 * class444.field3385 / 1000 + class180.field1809;
         class333.field2680 &= 2047;
      } else if (var3 < 0) {
         class333.field2680 -= -var3 * class444.field3385 / 1000 + class180.field1809;
         class333.field2680 &= 2047;
      }

      int var4 = var1 - class333.field2680;
      if (var4 > 1024) {
         var4 -= 2048;
      } else if (var4 < -1024) {
         var4 += 2048;
      }

      if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
         class333.field2680 = var1;
      }

   }
}
