public class class57 implements Comparable {
   static int field462;
   class349 field460;
   class349 field461;

   class57() {
   }

   public class349 method242() {
      return this.field460;
   }

   public String method243() {
      return this.field460 == null ? "" : this.field460.method1598();
   }

   public String method244() {
      return this.field461 == null ? "" : this.field461.method1598();
   }

   void method245(class349 var1, class349 var2) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.field460 = var1;
         this.field461 = var2;
      }
   }

   public int method246(class57 var1) {
      return this.field460.method1597(var1.field460);
   }

   public int compareTo(Object var1) {
      return this.method246((class57)var1);
   }
}
