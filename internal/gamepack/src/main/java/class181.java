public class class181 {
   static class427[] field1814;
   int field1813 = 0;
   final class22 field1811;
   final int field1812;

   class181(class22 var1, String var2) {
      this.field1811 = var1;
      this.field1812 = var1.method1641();
   }

   boolean method1110() {
      this.field1813 = 0;

      for(int var2 = 0; var2 < this.field1812; ++var2) {
         if (!this.field1811.method248(var2) || this.field1811.method247(var2)) {
            ++this.field1813;
         }
      }

      return this.field1813 >= this.field1812;
   }
}
