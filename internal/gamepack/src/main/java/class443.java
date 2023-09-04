public final class class443 extends class496 {
   int field3359;
   int field3360;
   int field3361 = 31;

   class443() {
   }

   void method2164(int var1) {
      this.field3361 = var1;
   }

   boolean method2163(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field3361 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   protected final class104 method2401() {
      return class71.method682(this.field3359).method667(this.field3360);
   }
}
