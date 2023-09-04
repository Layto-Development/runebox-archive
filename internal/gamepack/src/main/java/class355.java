import java.util.Comparator;

final class class355 implements Comparator {
   int method1609(class199 var1, class199 var2) {
      return var1.field1546 < var2.field1546 ? -1 : (var1.field1546 == var2.field1546 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method1609((class199)var1, (class199)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
