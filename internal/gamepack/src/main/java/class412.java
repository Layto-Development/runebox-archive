public class class412 extends class308 {
   class412() {
   }

   protected boolean method1411(int var1, int var2, int var3, class378 var4) {
      return super.field2089 == var2 && var3 == super.field2088;
   }

   static int method1898(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 0) {
            var1 = 0;
         } else if (var1 > 127) {
            var1 = 127;
         }

         var1 = 127 - var1;
         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & '\uff80');
      }
   }

   public static class107 method1897(int var0) {
      class107 var2 = (class107)class107.field701.method1183((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class107.field702.method2422(16, var0);
         var2 = new class107();
         if (null != var3) {
            var2.method390(new class366(var3));
         }

         class107.field701.method1182(var2, (long)var0);
         return var2;
      }
   }
}
