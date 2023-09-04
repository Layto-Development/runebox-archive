import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class class329 implements Iterator {
   class351 field2489;
   int field2490 = 0;
   int field2491;

   class329(class351 var1) {
      this.field2491 = this.field2489.field2576;
      this.field2489 = var1;
   }

   public boolean hasNext() {
      return this.field2490 < this.field2489.field2580;
   }

   public Object next() {
      if (this.field2491 != this.field2489.field2576) {
         throw new ConcurrentModificationException();
      } else if (this.field2490 < this.field2489.field2580) {
         Object var1 = this.field2489.field2578[this.field2490].field2019;
         ++this.field2490;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }
}
