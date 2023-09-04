public class class332 implements Comparable {
   static int field2678;
   class251 field2676;
   class251 field2677;

   class332() {
   }

   public class251 method1765() {
      return this.field2676;
   }

   public String method1766() {
      return this.field2676 == null ? "" : this.field2676.method1458();
   }

   public String method1767() {
      return this.field2677 == null ? "" : this.field2677.method1458();
   }

   void method1768(class251 var1, class251 var2) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.field2676 = var1;
         this.field2677 = var2;
      }
   }

   public int method1769(class332 var1) {
      return this.field2676.method1457(var1.field2676);
   }

   public int compareTo(Object var1) {
      return this.method1769((class332)var1);
   }
}
