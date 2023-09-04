public class class266 extends class306 {
   public static class245 field1868 = new class245(64);
   static class443 field1874;
   static class509 field1872;
   static int field1871;
   static final int[] field1867 = new int[32];
   public int field1869;
   public int field1870;
   public int field1873;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field1867[var1] = var0 - 1;
         var0 += var0;
      }

   }

   class266() {
   }

   void method1212(class366 var1) {
      while(true) {
         int var3 = var1.method1654();
         if (var3 == 0) {
            return;
         }

         this.method1213(var1, var3);
      }
   }

   void method1213(class366 var1, int var2) {
      if (var2 == 1) {
         this.field1869 = var1.method1703();
         this.field1870 = var1.method1654();
         this.field1873 = var1.method1654();
      }

   }

   public static void method1214(class509 var0) {
      field1872 = var0;
   }

   public static class266 method1215(int var0) {
      class266 var2 = (class266)field1868.method1183((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = field1872.method2422(14, var0);
         var2 = new class266();
         if (var3 != null) {
            var2.method1212(new class366(var3));
         }

         field1868.method1182(var2, (long)var0);
         return var2;
      }
   }
}
