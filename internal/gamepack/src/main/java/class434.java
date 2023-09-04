import java.util.Comparator;

public abstract class class434 implements Comparator {
   static class296 field3450;
   Comparator field3451;

   protected class434() {
   }

   final void method2027(Comparator var1) {
      if (this.field3451 == null) {
         this.field3451 = var1;
      } else if (this.field3451 instanceof class434) {
         ((class434)this.field3451).method2027(var1);
      }

   }

   protected final int method2028(class57 var1, class57 var2) {
      return this.field3451 == null ? 0 : this.field3451.compare(var1, var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
