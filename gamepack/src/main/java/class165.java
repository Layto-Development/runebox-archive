public class class165 extends class56 {
   int field1701;
   String field1700;
   long field1702;
   // $FF: synthetic field
   final class315 this$0;

   class165(class315 var1) {
      this.this$0 = var1;
      this.field1702 = -1L;
      this.field1700 = null;
      this.field1701 = 0;
   }

   void method608(class184 var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.field1818;
         this.field1702 = var1.method1130();
      }

      this.field1700 = var1.method1184();
      this.field1701 = var1.method1174();
   }

   void method607(class15 var1) {
      var1.method158(this.field1702, this.field1700, this.field1701);
   }
}
