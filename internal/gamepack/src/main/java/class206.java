public class class206 extends class151 {
   static class298 field1946;
   static class364 field1944 = new class364(64);
   static int field1947;
   boolean field1942 = true;
   char field1943;
   public int field1941;
   public String field1945;

   class206() {
   }

   void method1254() {
   }

   void method1255(class184 var1) {
      while(true) {
         int var3 = var1.method1125();
         if (var3 == 0) {
            return;
         }

         this.method1256(var1, var3);
      }
   }

   void method1256(class184 var1, int var2) {
      if (var2 == 1) {
         this.field1943 = class162.method991(var1.method1126());
      } else if (var2 == 2) {
         this.field1941 = var1.method1129();
      } else if (var2 == 4) {
         this.field1942 = false;
      } else if (var2 == 5) {
         this.field1945 = var1.method1133();
      }

   }

   public boolean method1257() {
      return this.field1943 == 's';
   }

   public static void method1259(class298 var0) {
      field1946 = var0;
   }

   public static class206 method1260(int var0) {
      class206 var2 = (class206)field1944.method1851((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = field1946.method1629(11, var0);
         var2 = new class206();
         if (var3 != null) {
            var2.method1255(new class184(var3));
         }

         var2.method1254();
         field1944.method1850(var2, (long)var0);
         return var2;
      }
   }

   public static void method1258() {
      field1944.method1848();
   }
}
