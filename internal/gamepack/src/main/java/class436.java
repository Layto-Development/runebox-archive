public class class436 {
   static final class436 field3455 = new class436();
   static final class436 field3456 = new class436();
   static final class436 field3457 = new class436();
   static final class436 field3458 = new class436();
   static final class436 field3459 = new class436();
   static final class436 field3460 = new class436();
   static final class436 field3461 = new class436();
   static final class436 field3462 = new class436();
   static final class436 field3463 = new class436();
   static final class436 field3464 = new class436();
   static final class436 field3465 = new class436();
   static final class436 field3466 = new class436();
   static final class436 field3467 = new class436();
   static final class436 field3468 = new class436();
   static final class436 field3469 = new class436();
   static final class436 field3470 = new class436();

   class436() {
   }

   static void method2040(class443 var0, boolean var1) {
      if (null != var0 && var0.method2017() && !var0.field3513) {
         var0.field3511 = false;
         if ((Client.field1120 && class470.field3728 > 50 || class470.field3728 > 200) && var1 && var0.field3379 == var0.field3386) {
            var0.field3511 = true;
         }

         int var3 = var0.field3403 >> 7;
         int var4 = var0.field3374 >> 7;
         if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
            long var5 = class463.method2187(0, 0, 0, false, var0.field3493);
            if (null != var0.field3506 && Client.field1419 >= var0.field3502 && Client.field1419 < var0.field3512) {
               var0.field3511 = false;
               var0.field3500 = Client.method787(var0.field3403, var0.field3374, class156.field980);
               var0.field3409 = Client.field1419;
               class137.field875.method1844(class156.field980, var0.field3403, var0.field3374, var0.field3500, 60, var0, var0.field3375, var5, var0.field3518, var0.field3508, var0.field3509, var0.field3498);
            } else {
               if (64 == (var0.field3403 & 127) && 64 == (var0.field3374 & 127)) {
                  if (Client.field1286 == Client.field1232[var3][var4]) {
                     return;
                  }

                  Client.field1232[var3][var4] = Client.field1286;
               }

               var0.field3500 = Client.method787(var0.field3403, var0.field3374, class156.field980);
               var0.field3409 = Client.field1419;
               class137.field875.method1843(class156.field980, var0.field3403, var0.field3374, var0.field3500, 60, var0, var0.field3375, var5, var0.field3381);
            }
         }
      }

   }
}
