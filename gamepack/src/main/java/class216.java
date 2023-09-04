public class class216 extends class56 {
   String field2018;
   long field2019;
   // $FF: synthetic field
   final class315 this$0;

   class216(class315 var1) {
      this.this$0 = var1;
      this.field2019 = -1L;
      this.field2018 = null;
   }

   void method608(class184 var1) {
      if (var1.method1125() != 255) {
         --var1.field1818;
         this.field2019 = var1.method1130();
      }

      this.field2018 = var1.method1184();
   }

   void method607(class15 var1) {
      var1.method148(this.field2019, this.field2018);
   }
}
