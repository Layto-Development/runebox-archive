public final class class18 extends class165 {
   int field207;
   int field208;
   int field209 = 31;

   class18() {
   }

   void method105(int var1) {
      this.field209 = var1;
   }

   boolean method104(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field209 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   protected final class485 method632() {
      return class47.method213(this.field207).method198(this.field208);
   }
}
