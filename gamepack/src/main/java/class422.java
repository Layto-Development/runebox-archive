public class class422 extends class531 {
   byte field3201;
   int field3202;
   int field3204;
   String field3203;
   // $FF: synthetic field
   final class474 this$0;

   class422(class474 var1) {
      this.this$0 = var1;
      this.field3204 = -1;
   }

   void method2516(class184 var1) {
      this.field3204 = var1.method1174();
      this.field3201 = var1.method1126();
      this.field3202 = var1.method1174();
      var1.method1130();
      this.field3203 = var1.method1133();
   }

   void method2517(class290 var1) {
      class219 var3 = (class219)var1.field2457.get(this.field3204);
      var3.field2037 = this.field3201;
      var3.field2038 = this.field3202;
      var3.field2036 = new class251(this.field3203);
   }
}
