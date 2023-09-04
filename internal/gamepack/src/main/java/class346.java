import java.util.Comparator;

public class class346 implements Comparator {
   static class298 field2748;
   final boolean field2747;

   public class346(boolean var1) {
      this.field2747 = var1;
   }

   int method1792(class332 var1, class332 var2) {
      return this.field2747 ? var1.method1765().method1457(var2.method1765()) : var2.method1765().method1457(var1.method1765());
   }

   public int compare(Object var1, Object var2) {
      return this.method1792((class332)var1, (class332)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
