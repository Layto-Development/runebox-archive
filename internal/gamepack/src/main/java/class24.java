public class class24 {
   static int field229;

   class24() throws Throwable {
   }

   static void method262(int var0, int var1) {
      int var3 = class112.field1452.method1566(class27.field401);

      int var4;
      int var5;
      for(var4 = 0; var4 < Client.field725; ++var4) {
         var5 = class112.field1452.method1566(Client.method471(var4));
         if (var5 > var3) {
            var3 = var5;
         }
      }

      var3 += 8;
      var4 = Client.field725 * 15 + 22;
      var5 = var0 - var3 / 2;
      if (var5 + var3 > class426.field3228) {
         var5 = class426.field3228 - var3;
      }

      if (var5 < 0) {
         var5 = 0;
      }

      int var6 = var1;
      if (var1 + var4 > class456.field3562) {
         var6 = class456.field3562 - var4;
      }

      if (var6 < 0) {
         var6 = 0;
      }

      class317.field2582 = var5;
      class98.field1320 = var6;
      class484.field3839 = var3;
      class185.field1823 = Client.field725 * 15 + 22;
   }
}
