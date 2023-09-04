public class class65 extends class3 {
   final boolean field1122;

   public class65(boolean var1) {
      this.field1122 = var1;
   }

   int method648(class410 var1, class410 var2) {
      if (var1.field3157 != 0 && var2.field3157 != 0) {
         return this.field1122 ? var1.field3156 - var2.field3156 : var2.field3156 - var1.field3156;
      } else {
         return this.method6(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method648((class410)var1, (class410)var2);
   }
}
