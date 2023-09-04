public class class302 {
   static int field2051;

   class302() throws Throwable {
   }

   static void method1379(int var0, int var1) {
      int var3 = class274.field1923.method1915(class424.field3168);

      int var4;
      int var5;
      for(var4 = 0; var4 < Client.field1265; ++var4) {
         var5 = class274.field1923.method1915(Client.method855(var4));
         if (var5 > var3) {
            var3 = var5;
         }
      }

      var3 += 8;
      var4 = Client.field1265 * 15 + 22;
      var5 = var0 - var3 / 2;
      if (var5 + var3 > class114.field730) {
         var5 = class114.field730 - var3;
      }

      if (var5 < 0) {
         var5 = 0;
      }

      int var6 = var1;
      if (var1 + var4 > class394.field2761) {
         var6 = class394.field2761 - var4;
      }

      if (var6 < 0) {
         var6 = 0;
      }

      class268.field1878 = var5;
      class233.field1719 = var6;
      class364.field2617 = var3;
      class414.field2900 = Client.field1265 * 15 + 22;
   }
}
