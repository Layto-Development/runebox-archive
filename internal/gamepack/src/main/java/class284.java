import java.util.Comparator;

public class class284 implements Comparator {
   final boolean field1965;

   public class284(boolean var1) {
      this.field1965 = var1;
   }

   int method1304(class57 var1, class57 var2) {
      return this.field1965 ? var1.method246(var2) : var2.method246(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method1304((class57)var1, (class57)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
