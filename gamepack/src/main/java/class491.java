import java.util.Iterator;

public class class491 implements Iterator {
   class151 field3862;
   class151 field3863 = null;
   class361 field3861;

   class491(class361 var1) {
      this.field3861 = var1;
      this.field3862 = this.field3861.field2827.field1623;
      this.field3863 = null;
   }

   public Object next() {
      class151 var1 = this.field3862;
      if (var1 == this.field3861.field2827) {
         var1 = null;
         this.field3862 = null;
      } else {
         this.field3862 = var1.field1623;
      }

      this.field3863 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field3862 != this.field3861.field2827;
   }

   public void remove() {
      if (this.field3863 == null) {
         throw new IllegalStateException();
      } else {
         this.field3863.method938();
         this.field3863 = null;
      }
   }
}
