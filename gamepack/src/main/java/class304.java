public final class class304 {
   class151 field2521 = new class151();

   public class304() {
      this.field2521.field1623 = this.field2521;
      this.field2521.field1624 = this.field2521;
   }

   public void method1666(class151 var1) {
      if (var1.field1624 != null) {
         var1.method938();
      }

      var1.field1624 = this.field2521.field1624;
      var1.field1623 = this.field2521;
      var1.field1624.field1623 = var1;
      var1.field1623.field1624 = var1;
   }

   public void method1664(class151 var1) {
      if (var1.field1624 != null) {
         var1.method938();
      }

      var1.field1624 = this.field2521;
      var1.field1623 = this.field2521.field1623;
      var1.field1624.field1623 = var1;
      var1.field1623.field1624 = var1;
   }

   public class151 method1665() {
      class151 var1 = this.field2521.field1623;
      return var1 == this.field2521 ? null : var1;
   }
}
