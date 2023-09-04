import java.util.Comparator;

class class185 implements Comparator {
   static class509 field1484;
   // $FF: synthetic field
   final class172 this$0;

   class185(class172 var1) {
      this.this$0 = var1;
   }

   int method981(class186 var1, class186 var2) {
      if (var1.field1487 > var2.field1487) {
         return 1;
      } else {
         return var1.field1487 < var2.field1487 ? -1 : 0;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method981((class186)var1, (class186)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
