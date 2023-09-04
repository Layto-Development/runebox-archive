import java.util.Comparator;

final class class53 implements Comparator {
   int method604(class82 var1, class82 var2) {
      return var1.field1257 < var2.field1257 ? -1 : (var2.field1257 == var1.field1257 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method604((class82)var1, (class82)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
