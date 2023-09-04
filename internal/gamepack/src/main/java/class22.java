import java.util.Iterator;

public class class22 implements Iterator {
   class457 field227;
   class70 field228;
   class70 field229 = null;

   class22(class457 var1) {
      this.method119(var1);
   }

   void method119(class457 var1) {
      this.field227 = var1;
      this.method118();
   }

   void method118() {
      this.field228 = this.field227 != null ? this.field227.field3592.field530 : null;
      this.field229 = null;
   }

   public Object next() {
      class70 var1 = this.field228;
      if (var1 == this.field227.field3592) {
         var1 = null;
         this.field228 = null;
      } else {
         this.field228 = var1.field530;
      }

      this.field229 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field228 != this.field227.field3592 && this.field228 != null;
   }

   public void remove() {
      if (this.field229 == null) {
         throw new IllegalStateException();
      } else {
         this.field229.method295();
         this.field229 = null;
      }
   }
}
