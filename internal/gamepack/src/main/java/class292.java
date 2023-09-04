public class class292 {
   class117 field2468;
   class117 field2469 = new class117();

   public class292() {
      this.field2469.field1480 = this.field2469;
      this.field2469.field1479 = this.field2469;
   }

   public void method1612(class117 var1) {
      if (var1.field1479 != null) {
         var1.method824();
      }

      var1.field1479 = this.field2469.field1479;
      var1.field1480 = this.field2469;
      var1.field1479.field1480 = var1;
      var1.field1480.field1479 = var1;
   }

   public class117 method1614() {
      class117 var1 = this.field2469.field1480;
      if (var1 == this.field2469) {
         this.field2468 = null;
         return null;
      } else {
         this.field2468 = var1.field1480;
         return var1;
      }
   }

   public class117 method1613() {
      class117 var1 = this.field2468;
      if (var1 == this.field2469) {
         this.field2468 = null;
         return null;
      } else {
         this.field2468 = var1.field1480;
         return var1;
      }
   }
}
