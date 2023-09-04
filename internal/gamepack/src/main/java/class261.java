import java.util.Comparator;

final class class261 implements Comparator {
   int method1205(class199 var1, class199 var2) {
      return var1.field1548 < var2.field1548 ? -1 : (var2.field1548 == var1.field1548 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method1205((class199)var1, (class199)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
