import java.util.Comparator;

public class class147 implements Comparator {
   final boolean field1613;

   public class147(boolean var1) {
      this.field1613 = var1;
   }

   int method928(class332 var1, class332 var2) {
      return this.field1613 ? var1.method1769(var2) : var2.method1769(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method928((class332)var1, (class332)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
