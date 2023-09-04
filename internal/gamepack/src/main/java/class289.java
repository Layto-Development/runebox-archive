public class class289 {
   class188 field1977;
   class188 field1978 = new class188();

   public class289() {
      this.field1978.field1491 = this.field1978;
      this.field1978.field1490 = this.field1978;
   }

   public void method1312(class188 var1) {
      if (var1.field1490 != null) {
         var1.method987();
      }

      var1.field1490 = this.field1978.field1490;
      var1.field1491 = this.field1978;
      var1.field1490.field1491 = var1;
      var1.field1491.field1490 = var1;
   }

   public class188 method1314() {
      class188 var1 = this.field1978.field1491;
      if (var1 == this.field1978) {
         this.field1977 = null;
         return null;
      } else {
         this.field1977 = var1.field1491;
         return var1;
      }
   }

   public class188 method1313() {
      class188 var1 = this.field1977;
      if (var1 == this.field1978) {
         this.field1977 = null;
         return null;
      } else {
         this.field1977 = var1.field1491;
         return var1;
      }
   }
}
