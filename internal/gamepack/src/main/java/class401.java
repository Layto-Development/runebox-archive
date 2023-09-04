import java.util.Iterator;

class class401 implements Iterator {
   int field2782;
   // $FF: synthetic field
   final class483 this$0;

   class401(class483 var1) {
      this.this$0 = var1;
   }

   public boolean hasNext() {
      return this.field2782 < this.this$0.method312();
   }

   public Object next() {
      int var1 = ++this.field2782 - 1;
      class118 var2 = (class118)this.this$0.field3804.method97((long)var1);
      return null != var2 ? var2 : this.this$0.method2286(var1);
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }
}
