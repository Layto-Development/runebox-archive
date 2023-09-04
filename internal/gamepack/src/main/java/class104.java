import java.util.Iterator;

public class class104 implements Iterator {
   class306 field697;
   class306 field698 = null;
   class72 field696;

   class104(class72 var1) {
      this.field696 = var1;
      this.field697 = this.field696.field543.field2067;
      this.field698 = null;
   }

   public Object next() {
      class306 var1 = this.field697;
      if (var1 == this.field696.field543) {
         var1 = null;
         this.field697 = null;
      } else {
         this.field697 = var1.field2067;
      }

      this.field698 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field697 != this.field696.field543;
   }

   public void remove() {
      if (this.field698 == null) {
         throw new IllegalStateException();
      } else {
         this.field698.method1406();
         this.field698 = null;
      }
   }
}
