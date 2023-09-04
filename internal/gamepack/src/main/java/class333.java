import java.util.List;

public class class333 extends class306 {
   public static class509 field2506;
   static class245 field2503 = new class245(64);
   static class388 field2507;
   static class501 field2502;
   static List field2505;
   public boolean field2504 = false;

   class333() {
   }

   void method1565(class366 var1) {
      while(true) {
         int var3 = var1.method1654();
         if (var3 == 0) {
            return;
         }

         this.method1564(var1, var3);
      }
   }

   void method1564(class366 var1, int var2) {
      if (var2 == 2) {
         this.field2504 = true;
      }

   }

   public static class333 method1566(int var0) {
      class333 var2 = (class333)field2503.method1183((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = field2506.method2422(19, var0);
         var2 = new class333();
         if (null != var3) {
            var2.method1565(new class366(var3));
         }

         field2503.method1182(var2, (long)var0);
         return var2;
      }
   }
}
