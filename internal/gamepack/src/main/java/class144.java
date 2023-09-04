import java.util.Comparator;

final class class144 implements Comparator {
   int method540(class199 var1, class199 var2) {
      return var1.field1544.field4140 < var2.field1544.field4140 ? -1 : (var1.field1544.field4140 == var2.field1544.field4140 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method540((class199)var1, (class199)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
