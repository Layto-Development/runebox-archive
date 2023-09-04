import java.util.Iterator;

public class class231 implements Iterator {
   class524 field1712;
   class70 field1713;
   class70 field1715 = null;
   int field1714;

   public class231(class524 var1) {
      this.field1712 = var1;
      this.method1126();
   }

   void method1126() {
      this.field1713 = this.field1712.field4167[0].field530;
      this.field1714 = 1;
      this.field1715 = null;
   }

   public class70 method1127() {
      this.method1126();
      return (class70)this.next();
   }

   public Object next() {
      class70 var1;
      if (this.field1713 != this.field1712.field4167[this.field1714 - 1]) {
         var1 = this.field1713;
         this.field1713 = var1.field530;
         this.field1715 = var1;
         return var1;
      } else {
         do {
            if (this.field1714 >= this.field1712.field4166) {
               return null;
            }

            var1 = this.field1712.field4167[this.field1714++].field530;
         } while(var1 == this.field1712.field4167[this.field1714 - 1]);

         this.field1713 = var1.field530;
         this.field1715 = var1;
         return var1;
      }
   }

   public boolean hasNext() {
      if (this.field1713 != this.field1712.field4167[this.field1714 - 1]) {
         return true;
      } else {
         while(this.field1714 < this.field1712.field4166) {
            if (this.field1712.field4167[this.field1714++].field530 != this.field1712.field4167[this.field1714 - 1]) {
               this.field1713 = this.field1712.field4167[this.field1714 - 1].field530;
               return true;
            }

            this.field1713 = this.field1712.field4167[this.field1714 - 1];
         }

         return false;
      }
   }

   public void remove() {
      if (this.field1715 == null) {
         throw new IllegalStateException();
      } else {
         this.field1715.method295();
         this.field1715 = null;
      }
   }
}
