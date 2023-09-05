public class class244 extends class56 {
   boolean field2205;
   byte field2201;
   byte field2202;
   byte field2203;
   byte field2204;
   // $FF: synthetic field
   final class315 this$0;

   class244(class315 var1) {
      this.this$0 = var1;
   }

   void method608(class184 var1) {
      this.field2205 = var1.readUnsignedByte() == 1;
      this.field2202 = var1.method1126();
      this.field2203 = var1.method1126();
      this.field2201 = var1.method1126();
      this.field2204 = var1.method1126();
   }

   void method607(class15 var1) {
      var1.field149 = this.field2205;
      var1.field163 = this.field2202;
      var1.field151 = this.field2203;
      var1.field152 = this.field2201;
      var1.field153 = this.field2204;
   }
}
