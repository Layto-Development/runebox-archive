import java.util.Comparator;

final class class88 implements Comparator {
   int method718(class82 var1, class82 var2) {
      return var1.field1255 < var2.field1255 ? -1 : (var1.field1255 == var2.field1255 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method718((class82)var1, (class82)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
