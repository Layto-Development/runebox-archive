import java.util.Comparator;

public abstract class class3 implements Comparator {
   static class427 field28;
   Comparator field29;

   protected class3() {
   }

   final void method5(Comparator var1) {
      if (this.field29 == null) {
         this.field29 = var1;
      } else if (this.field29 instanceof class3) {
         ((class3)this.field29).method5(var1);
      }

   }

   protected final int method6(class332 var1, class332 var2) {
      return this.field29 == null ? 0 : this.field29.compare(var1, var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
