public class class184 {
   static class296[] field1483;
   int field1482 = 0;
   final class534 field1480;
   final int field1481;

   class184(class534 var1, String var2) {
      this.field1480 = var1;
      this.field1481 = var1.method2434();
   }

   boolean method980() {
      this.field1482 = 0;

      for(int var2 = 0; var2 < this.field1481; ++var2) {
         if (!this.field1480.method2530(var2) || this.field1480.method2529(var2)) {
            ++this.field1482;
         }
      }

      return this.field1482 >= this.field1481;
   }
}
