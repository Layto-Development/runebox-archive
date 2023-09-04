public class class296 extends class3 {
   final boolean field2479;

   public class296(boolean var1) {
      this.field2479 = var1;
   }

   int method1617(class410 var1, class410 var2) {
      if (var1.field3157 != var2.field3157) {
         return this.field2479 ? var1.field3157 - var2.field3157 : var2.field3157 - var1.field3157;
      } else {
         return this.method6(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method1617((class410)var1, (class410)var2);
   }
}
