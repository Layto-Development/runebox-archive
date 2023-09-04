public class class519 extends class306 {
   static class245 field4155 = new class245(64);
   public int field4154 = 0;

   class519() {
   }

   void method2500(class366 var1) {
      while(true) {
         int var3 = var1.method1654();
         if (var3 == 0) {
            return;
         }

         this.method2501(var1, var3);
      }
   }

   void method2501(class366 var1, int var2) {
      if (var2 == 2) {
         this.field4154 = var1.method1703();
      }

   }

   public static void method2504(class509 var0) {
      class128.field804 = var0;
   }

   public static class519 method2503(int var0) {
      class519 var2 = (class519)field4155.method1183((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class128.field804.method2422(5, var0);
         var2 = new class519();
         if (var3 != null) {
            var2.method2500(new class366(var3));
         }

         field4155.method1182(var2, (long)var0);
         return var2;
      }
   }

   static void method2502() {
      if (Client.field1208) {
         class322 var1 = class322.method1485(class451.field3573, Client.field1284);
         if (null != var1 && var1.field2253 != null) {
            class64 var2 = new class64();
            var2.field504 = var1;
            var2.field507 = var1.field2253;
            class197.method1038(var2);
         }

         Client.field1250 = -1;
         Client.field1208 = false;
         Client.method869(var1);
      }
   }
}
