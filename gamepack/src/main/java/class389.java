import java.util.Iterator;

class class389 implements Iterator {
   int field3075;
   // $FF: synthetic field
   final class299 this$0;

   class389(class299 var1) {
      this.this$0 = var1;
   }

   public boolean hasNext() {
      return this.field3075 < this.this$0.method118();
   }

   public Object next() {
      int var1 = ++this.field3075 - 1;
      class350 var2 = (class350)this.this$0.field2502.method255((long)var1);
      return null != var2 ? var2 : this.this$0.method1659(var1);
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }
}
