public class class367 {
   static class103 field2654;
   static class534 field2655;
   public byte field2657;
   public class349 field2656;
   public int field2658;

   class367() {
   }

   static final void method1718(class433 var0) {
      int var3;
      int var4;
      int var5;
      int var7;
      if (-1 != var0.field3408) {
         Object var2 = null;
         var3 = 65536;
         if (var0.field3408 < var3) {
            var2 = Client.field1176[var0.field3408];
         } else {
            var2 = Client.field1289[var0.field3408 - var3];
         }

         if (var2 != null) {
            var4 = var0.field3403 - ((class433)var2).field3403;
            var5 = var0.field3374 - ((class433)var2).field3374;
            if (var4 != 0 || var5 != 0) {
               var7 = (int)(Math.atan2((double)var4, (double)var5) * 325.94932345220167) & 2047;
               var0.field3414 = var7;
            }
         } else if (var0.field3378) {
            var0.field3408 = -1;
            var0.field3378 = false;
         }
      }

      int var8;
      if (0 == var0.field3421 || var0.field3447 > 0) {
         var8 = -1;
         if (var0.field3411 != -1 && -1 != var0.field3412) {
            var3 = 64 + (var0.field3411 * 128 - class36.field314 * 128);
            var4 = var0.field3412 * 128 - class525.field4175 * 128 + 64;
            var5 = var0.field3403 - var3;
            int var6 = var0.field3374 - var4;
            if (var5 != 0 || var6 != 0) {
               var7 = (int)(Math.atan2((double)var5, (double)var6) * 325.94932345220167) & 2047;
               var8 = var7;
            }
         } else if (var0.field3410 != -1) {
            var8 = var0.field3410;
         }

         if (var8 != -1) {
            var0.field3414 = var8;
            if (var0.field3413) {
               var0.field3375 = var0.field3414;
            }
         }

         var0.method2026();
      }

      var8 = var0.field3414 - var0.field3375 & 2047;
      if (var8 != 0) {
         boolean var9 = true;
         boolean var10 = true;
         ++var0.field3415;
         var5 = var8 > 1024 ? -1 : 1;
         var0.field3375 += var0.field3442 * var5;
         boolean var11 = true;
         if (var8 < var0.field3442 || var8 > 2048 - var0.field3442) {
            var0.field3375 = var0.field3414;
            var11 = false;
         }

         if (var0.field3442 > 0 && var0.field3386 == var0.field3379 && (var0.field3415 > 25 || var11)) {
            if (var5 == -1 && var0.field3380 != -1) {
               var0.field3386 = var0.field3380;
            } else if (var5 == 1 && -1 != var0.field3441) {
               var0.field3386 = var0.field3441;
            } else {
               var0.field3386 = var0.field3382;
            }
         }

         var0.field3375 &= 2047;
      } else {
         if (var0.field3378) {
            var0.field3408 = -1;
            var0.field3378 = false;
         }

         var0.field3415 = 0;
      }

   }
}
