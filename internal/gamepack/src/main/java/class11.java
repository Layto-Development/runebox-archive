public class class11 extends class332 {
   int field110;

   class11() {
   }

   int method125(class11 var1) {
      return this.field110 - var1.field110;
   }

   public int method1769(class332 var1) {
      return this.method125((class11)var1);
   }

   public int compareTo(Object var1) {
      return this.method125((class11)var1);
   }
}
