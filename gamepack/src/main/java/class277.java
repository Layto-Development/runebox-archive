public class class277 {
   static final class277 field2367 = new class277();
   static final class277 field2368 = new class277();
   static final class277 field2369 = new class277();
   static final class277 field2370 = new class277();
   static final class277 field2371 = new class277();
   static final class277 field2372 = new class277();
   static final class277 field2373 = new class277();
   static final class277 field2374 = new class277();
   static final class277 field2375 = new class277();
   static final class277 field2376 = new class277();
   static final class277 field2377 = new class277();
   static final class277 field2378 = new class277();
   static final class277 field2379 = new class277();
   static final class277 field2380 = new class277();
   static final class277 field2381 = new class277();
   static final class277 field2382 = new class277();

   class277() {
   }

   static void method1528(class522 var0, boolean var1) {
      if (null != var0 && var0.method2465() && !var0.field4115) {
         var0.field4113 = false;
         if ((Client.field580 && class190.field1866 > 50 || class190.field1866 > 200) && var1 && var0.field4004 == var0.field4011) {
            var0.field4113 = true;
         }

         int var3 = var0.field4028 >> 7;
         int var4 = var0.field3999 >> 7;
         if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
            long var5 = class256.method1473(0, 0, 0, false, var0.field4095);
            if (null != var0.field4108 && Client.field879 >= var0.field4104 && Client.field879 < var0.field4114) {
               var0.field4113 = false;
               var0.field4102 = Client.method403(var0.field4028, var0.field3999, class192.field1881);
               var0.field4034 = Client.field879;
               class75.field1223.method1035(class192.field1881, var0.field4028, var0.field3999, var0.field4102, 60, var0, var0.field4000, var5, var0.field4120, var0.field4110, var0.field4111, var0.field4100);
            } else {
               if ((var0.field4028 & 127) == 64 && (var0.field3999 & 127) == 64) {
                  if (Client.field746 == Client.field692[var3][var4]) {
                     return;
                  }

                  Client.field692[var3][var4] = Client.field746;
               }

               var0.field4102 = Client.method403(var0.field4028, var0.field3999, class192.field1881);
               var0.field4034 = Client.field879;
               class75.field1223.method1034(class192.field1881, var0.field4028, var0.field3999, var0.field4102, 60, var0, var0.field4000, var5, var0.field4006);
            }
         }
      }

   }
}
