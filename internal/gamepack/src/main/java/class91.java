import java.util.Comparator;

public class class91 implements Comparator {
   static class509 field658;
   final boolean field657;

   public class91(boolean var1) {
      this.field657 = var1;
   }

   int method360(class57 var1, class57 var2) {
      return this.field657 ? var1.method242().method1597(var2.method242()) : var2.method242().method1597(var1.method242());
   }

   public int compare(Object var1, Object var2) {
      return this.method360((class57)var1, (class57)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
