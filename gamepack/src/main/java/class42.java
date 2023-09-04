public class class42 extends class3 {
   final boolean field925;

   public class42(boolean var1) {
      this.field925 = var1;
   }

   int method573(class410 var1, class410 var2) {
      if (var2.field3158 != var1.field3158) {
         return this.field925 ? var1.field3158 - var2.field3158 : var2.field3158 - var1.field3158;
      } else {
         return this.method6(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method573((class410)var1, (class410)var2);
   }
}
