import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class class431 implements Iterator {
   class489 field3260;
   int field3261 = 0;
   int field3262;

   class431(class489 var1) {
      this.field3262 = this.field3260.field3854;
      this.field3260 = var1;
   }

   public boolean hasNext() {
      return this.field3261 < this.field3260.field3858;
   }

   public Object next() {
      if (this.field3262 != this.field3260.field3854) {
         throw new ConcurrentModificationException();
      } else if (this.field3261 < this.field3260.field3858) {
         Object var1 = this.field3260.field3856[this.field3261].field2586;
         ++this.field3261;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }
}
