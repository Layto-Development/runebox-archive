public class class58 extends class151 {
   static class364 field1084 = new class364(64);
   public int field1083 = 0;

   class58() {
   }

   void method611(class184 var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method612(var1, var3);
      }
   }

   void method612(class184 var1, int var2) {
      if (var2 == 2) {
         this.field1083 = var1.method1174();
      }

   }

   public static void method615(class298 var0) {
      class199.field1929 = var0;
   }

   public static class58 method614(int var0) {
      class58 var2 = (class58)field1084.method1851((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class199.field1929.method1629(5, var0);
         var2 = new class58();
         if (var3 != null) {
            var2.method611(new class184(var3));
         }

         field1084.method1850(var2, (long)var0);
         return var2;
      }
   }

   static void method613() {
      if (Client.field668) {
         class480 var1 = class480.method2352(class325.field2628, Client.field744);
         if (null != var1 && var1.field3769 != null) {
            class208 var2 = new class208();
            var2.field1951 = var1;
            var2.field1954 = var1.field3769;
            class18.method216(var2);
         }

         Client.field710 = -1;
         Client.field668 = false;
         Client.method485(var1);
      }
   }
}
