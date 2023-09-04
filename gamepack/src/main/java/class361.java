import java.util.Iterator;

public class class361 implements Iterable {
   class151 field2826;
   public class151 field2827 = new class151();

   public class361() {
      this.field2827.field1623 = this.field2827;
      this.field2827.field1624 = this.field2827;
   }

   public void method1845() {
      while(this.field2827.field1623 != this.field2827) {
         this.field2827.field1623.method938();
      }

   }

   public void method1839(class151 var1) {
      if (var1.field1624 != null) {
         var1.method938();
      }

      var1.field1624 = this.field2827.field1624;
      var1.field1623 = this.field2827;
      var1.field1624.field1623 = var1;
      var1.field1623.field1624 = var1;
   }

   public class151 method1841() {
      class151 var1 = this.field2827.field1623;
      if (var1 == this.field2827) {
         return null;
      } else {
         var1.method938();
         return var1;
      }
   }

   public class151 method1842() {
      return this.method1843((class151)null);
   }

   class151 method1843(class151 var1) {
      class151 var2;
      if (var1 == null) {
         var2 = this.field2827.field1623;
      } else {
         var2 = var1;
      }

      if (var2 == this.field2827) {
         this.field2826 = null;
         return null;
      } else {
         this.field2826 = var2.field1623;
         return var2;
      }
   }

   public class151 method1844() {
      class151 var1 = this.field2826;
      if (var1 == this.field2827) {
         this.field2826 = null;
         return null;
      } else {
         this.field2826 = var1.field1623;
         return var1;
      }
   }

   public Iterator iterator() {
      return new class491(this);
   }

   public static void method1840(class151 var0, class151 var1) {
      if (var0.field1624 != null) {
         var0.method938();
      }

      var0.field1624 = var1;
      var0.field1623 = var1.field1623;
      var0.field1624.field1623 = var0;
      var0.field1623.field1624 = var0;
   }
}
