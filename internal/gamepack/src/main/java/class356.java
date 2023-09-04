import java.util.Iterator;

public class class356 implements Iterator {
   class197 field2796;
   class55 field2797;
   class55 field2799 = null;
   int field2798;

   public class356(class197 var1) {
      this.field2796 = var1;
      this.method1827();
   }

   void method1827() {
      this.field2797 = this.field2796.field1921[0].field1077;
      this.field2798 = 1;
      this.field2799 = null;
   }

   public class55 method1828() {
      this.method1827();
      return (class55)this.next();
   }

   public Object next() {
      class55 var1;
      if (this.field2797 != this.field2796.field1921[this.field2798 - 1]) {
         var1 = this.field2797;
         this.field2797 = var1.field1077;
         this.field2799 = var1;
         return var1;
      } else {
         do {
            if (this.field2798 >= this.field2796.field1920) {
               return null;
            }

            var1 = this.field2796.field1921[this.field2798++].field1077;
         } while(var1 == this.field2796.field1921[this.field2798 - 1]);

         this.field2797 = var1.field1077;
         this.field2799 = var1;
         return var1;
      }
   }

   public boolean hasNext() {
      if (this.field2797 != this.field2796.field1921[this.field2798 - 1]) {
         return true;
      } else {
         while(this.field2798 < this.field2796.field1920) {
            if (this.field2796.field1921[this.field2798++].field1077 != this.field2796.field1921[this.field2798 - 1]) {
               this.field2797 = this.field2796.field1921[this.field2798 - 1].field1077;
               return true;
            }

            this.field2797 = this.field2796.field1921[this.field2798 - 1];
         }

         return false;
      }
   }

   public void remove() {
      if (this.field2799 == null) {
         throw new IllegalStateException();
      } else {
         this.field2799.method605();
         this.field2799 = null;
      }
   }
}
