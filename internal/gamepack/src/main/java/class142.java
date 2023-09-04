import java.util.Iterator;

public class class142 implements Iterator {
   class45 field1593;
   class55 field1594;
   class55 field1595 = null;

   class142(class45 var1) {
      this.method914(var1);
   }

   void method914(class45 var1) {
      this.field1593 = var1;
      this.method913();
   }

   void method913() {
      this.field1594 = this.field1593 != null ? this.field1593.field929.field1077 : null;
      this.field1595 = null;
   }

   public Object next() {
      class55 var1 = this.field1594;
      if (var1 == this.field1593.field929) {
         var1 = null;
         this.field1594 = null;
      } else {
         this.field1594 = var1.field1077;
      }

      this.field1595 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field1594 != this.field1593.field929 && this.field1594 != null;
   }

   public void remove() {
      if (this.field1595 == null) {
         throw new IllegalStateException();
      } else {
         this.field1595.method605();
         this.field1595 = null;
      }
   }
}
