public class class83 {
   static int[] field1258;

   class83() throws Throwable {
   }

   static final class197 method717(class184 var0, class197 var1) {
      int var3 = var0.method1125();
      int var4;
      if (null == var1) {
         var4 = class349.method1808(var3);
         var1 = new class197(var4);
      }

      for(var4 = 0; var4 < var3; ++var4) {
         boolean var5 = var0.method1125() == 1;
         int var6 = var0.method1181();
         Object var7;
         if (var5) {
            var7 = new class183(var0.method1133());
         } else {
            var7 = new class118(var0.method1129());
         }

         var1.method1226((class55)var7, (long)var6);
      }

      return var1;
   }

   static int method716(class197 var0, int var1, int var2) {
      if (null == var0) {
         return var2;
      } else {
         class118 var4 = (class118)var0.method1222((long)var1);
         return var4 == null ? var2 : var4.field1481;
      }
   }
}
