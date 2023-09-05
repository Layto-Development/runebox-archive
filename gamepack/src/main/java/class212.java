public class class212 extends class531 {
   public static class298 field2011;
   byte field2009;
   int field2008;
   String field2010;
   // $FF: synthetic field
   final class474 this$0;

   class212(class474 var1) {
      this.this$0 = var1;
      this.field2010 = null;
   }

   void method2516(class184 var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.field1818;
         var1.method1130();
      }

      this.field2010 = var1.method1184();
      this.field2008 = var1.method1174();
      this.field2009 = var1.method1126();
      var1.method1130();
   }

   void method2517(class290 var1) {
      class219 var3 = new class219();
      var3.field2036 = new class251(this.field2010);
      var3.field2038 = this.field2008;
      var3.field2037 = this.field2009;
      var1.method1602(var3);
   }
}
