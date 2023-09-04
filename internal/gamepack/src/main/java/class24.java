public class class24 {
   static int[] field253;

   class24() throws Throwable {
   }

   static final class524 method121(class366 var0, class524 var1) {
      int var3 = var0.method1654();
      int var4;
      if (null == var1) {
         var4 = class32.method143(var3);
         var1 = new class524(var4);
      }

      for(var4 = 0; var4 < var3; ++var4) {
         boolean var5 = var0.method1654() == 1;
         int var6 = var0.method1710();
         Object var7;
         if (var5) {
            var7 = new class88(var0.method1662());
         } else {
            var7 = new class323(var0.method1658());
         }

         var1.method2513((class70)var7, (long)var6);
      }

      return var1;
   }

   static int method120(class524 var0, int var1, int var2) {
      if (null == var0) {
         return var2;
      } else {
         class323 var4 = (class323)var0.method2509((long)var1);
         return var4 == null ? var2 : var4.field2304;
      }
   }
}
