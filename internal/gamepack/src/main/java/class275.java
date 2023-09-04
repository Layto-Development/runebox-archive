public final class class275 {
   class306 field1927 = new class306();

   public class275() {
      this.field1927.field2067 = this.field1927;
      this.field1927.field2068 = this.field1927;
   }

   public void method1289(class306 var1) {
      if (var1.field2068 != null) {
         var1.method1406();
      }

      var1.field2068 = this.field1927.field2068;
      var1.field2067 = this.field1927;
      var1.field2068.field2067 = var1;
      var1.field2067.field2068 = var1;
   }

   public void method1287(class306 var1) {
      if (var1.field2068 != null) {
         var1.method1406();
      }

      var1.field2068 = this.field1927;
      var1.field2067 = this.field1927.field2067;
      var1.field2068.field2067 = var1;
      var1.field2067.field2068 = var1;
   }

   public class306 method1288() {
      class306 var1 = this.field1927.field2067;
      return var1 == this.field1927 ? null : var1;
   }
}
