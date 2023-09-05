public class class235 extends class531 {
   static short[] field2147;
   byte field2144;
   int field2143;
   int field2145;
   String field2146;
   // $FF: synthetic field
   final class474 this$0;

   class235(class474 var1) {
      this.this$0 = var1;
      this.field2145 = -1;
   }

   void method2516(class184 var1) {
      var1.readUnsignedByte();
      this.field2145 = var1.method1174();
      this.field2144 = var1.method1126();
      this.field2143 = var1.method1174();
      var1.method1130();
      this.field2146 = var1.readString();
      var1.readUnsignedByte();
   }

   void method2517(class290 var1) {
      class219 var3 = (class219)var1.field2457.get(this.field2145);
      var3.field2037 = this.field2144;
      var3.field2038 = this.field2143;
      var3.field2036 = new class251(this.field2146);
   }
}
