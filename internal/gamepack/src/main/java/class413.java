public class class413 extends class434 {
   static class501 field2896;
   final boolean field2895;

   public class413(boolean var1) {
      this.field2895 = var1;
   }

   int method1899(class538 var1, class538 var2) {
      if (var1.field4284 != 0 && var2.field4284 != 0) {
         return this.field2895 ? var1.method242().method1597(var2.method242()) : var2.method242().method1597(var1.method242());
      } else {
         return this.method2028(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method1899((class538)var1, (class538)var2);
   }
}
