public class class58 extends class306 {
   static class245 field466 = new class245(64);
   static class509 field468;
   static int field469;
   boolean field464 = true;
   char field465;
   public int field463;
   public String field467;

   class58() {
   }

   void method247() {
   }

   void method248(class366 var1) {
      while(true) {
         int var3 = var1.method1654();
         if (var3 == 0) {
            return;
         }

         this.method249(var1, var3);
      }
   }

   void method249(class366 var1, int var2) {
      if (var2 == 1) {
         this.field465 = class459.method2161(var1.method1655());
      } else if (var2 == 2) {
         this.field463 = var1.method1658();
      } else if (var2 == 4) {
         this.field464 = false;
      } else if (var2 == 5) {
         this.field467 = var1.method1662();
      }

   }

   public boolean method250() {
      return this.field465 == 's';
   }

   public static void method252(class509 var0) {
      field468 = var0;
   }

   public static class58 method253(int var0) {
      class58 var2 = (class58)field466.method1183((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = field468.method2422(11, var0);
         var2 = new class58();
         if (var3 != null) {
            var2.method248(new class366(var3));
         }

         var2.method247();
         field466.method1182(var2, (long)var0);
         return var2;
      }
   }

   public static void method251() {
      field466.method1180();
   }
}
