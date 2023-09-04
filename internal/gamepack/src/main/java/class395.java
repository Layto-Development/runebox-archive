import java.util.List;

public class class395 extends class151 {
   public static class298 field3088;
   static class294 field3089;
   static class364 field3085 = new class364(64);
   static class425 field3084;
   static List field3087;
   public boolean field3086 = false;

   class395() {
   }

   void method1906(class184 var1) {
      while(true) {
         int var3 = var1.method1125();
         if (var3 == 0) {
            return;
         }

         this.method1905(var1, var3);
      }
   }

   void method1905(class184 var1, int var2) {
      if (var2 == 2) {
         this.field3086 = true;
      }

   }

   public static class395 method1907(int var0) {
      class395 var2 = (class395)field3085.method1851((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = field3088.method1629(19, var0);
         var2 = new class395();
         if (null != var3) {
            var2.method1906(new class184(var3));
         }

         field3085.method1850(var2, (long)var0);
         return var2;
      }
   }
}
