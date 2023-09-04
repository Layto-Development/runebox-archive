public class class259 extends class151 {
   public static class364 field2275 = new class364(64);
   static class298 field2279;
   static class522 field2281;
   static int field2278;
   static final int[] field2274 = new int[32];
   public int field2276;
   public int field2277;
   public int field2280;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field2274[var1] = var0 - 1;
         var0 += var0;
      }

   }

   class259() {
   }

   void method1498(class184 var1) {
      while(true) {
         int var3 = var1.method1125();
         if (var3 == 0) {
            return;
         }

         this.method1499(var1, var3);
      }
   }

   void method1499(class184 var1, int var2) {
      if (var2 == 1) {
         this.field2276 = var1.method1174();
         this.field2277 = var1.method1125();
         this.field2280 = var1.method1125();
      }

   }

   public static void method1500(class298 var0) {
      field2279 = var0;
   }

   public static class259 method1501(int var0) {
      class259 var2 = (class259)field2275.method1851((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = field2279.method1629(14, var0);
         var2 = new class259();
         if (var3 != null) {
            var2.method1498(new class184(var3));
         }

         field2275.method1850(var2, (long)var0);
         return var2;
      }
   }
}
