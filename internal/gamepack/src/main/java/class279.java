public class class279 extends class124 {
   public static class509 field1952;
   byte field1950;
   int field1949;
   String field1951;
   // $FF: synthetic field
   final class398 this$0;

   class279(class398 var1) {
      this.this$0 = var1;
      this.field1951 = null;
   }

   void method472(class366 var1) {
      if (var1.method1654() != 255) {
         --var1.field2652;
         var1.method1659();
      }

      this.field1951 = var1.method1713();
      this.field1949 = var1.method1703();
      this.field1950 = var1.method1655();
      var1.method1659();
   }

   void method473(class417 var1) {
      class367 var3 = new class367();
      var3.field2656 = new class349(this.field1951);
      var3.field2658 = this.field1949;
      var3.field2657 = this.field1950;
      var1.method1905(var3);
   }
}
