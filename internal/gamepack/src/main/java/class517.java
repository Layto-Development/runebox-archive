import java.lang.ref.SoftReference;

public class class517 extends class109 {
   SoftReference field3997;

   class517(Object var1, int var2) {
      super(var2);
      this.field3997 = new SoftReference(var1);
   }

   Object method804() {
      return this.field3997.get();
   }

   boolean method803() {
      return true;
   }
}
