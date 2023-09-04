public class class319 extends class124 {
   byte field2140;
   int field2141;
   int field2143;
   String field2142;
   // $FF: synthetic field
   final class398 this$0;

   class319(class398 var1) {
      this.this$0 = var1;
      this.field2143 = -1;
   }

   void method472(class366 var1) {
      this.field2143 = var1.method1703();
      this.field2140 = var1.method1655();
      this.field2141 = var1.method1703();
      var1.method1659();
      this.field2142 = var1.method1662();
   }

   void method473(class417 var1) {
      class367 var3 = (class367)var1.field2933.get(this.field2143);
      var3.field2657 = this.field2140;
      var3.field2658 = this.field2141;
      var3.field2656 = new class349(this.field2142);
   }
}
