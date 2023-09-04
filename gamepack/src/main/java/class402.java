public class class402 extends class326 {
   class402() {
   }

   protected boolean method1714(int var1, int var2, int var3, class278 var4) {
      return super.field2631 == var2 && var3 == super.field2630;
   }

   static int method1968(int var0, int var1) {
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

   public static class12 method1967(int var0) {
      class12 var2 = (class12)class12.field113.method1851((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class12.field114.method1629(16, var0);
         var2 = new class12();
         if (null != var3) {
            var2.method127(new class184(var3));
         }

         class12.field113.method1850(var2, (long)var0);
         return var2;
      }
   }
}
