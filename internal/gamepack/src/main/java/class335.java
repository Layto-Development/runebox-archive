import java.lang.ref.SoftReference;

public class class335 extends class69 {
   SoftReference field2514;

   class335(Object var1, int var2) {
      super(var2);
      this.field2514 = new SoftReference(var1);
   }

   Object method294() {
      return this.field2514.get();
   }

   boolean method293() {
      return true;
   }
}
