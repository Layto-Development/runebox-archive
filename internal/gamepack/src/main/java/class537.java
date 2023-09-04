public class class537 extends class3 {
   static class425 field4256;
   final boolean field4255;

   public class537(boolean var1) {
      this.field4255 = var1;
   }

   int method2560(class410 var1, class410 var2) {
      if (var1.field3157 != 0 && var2.field3157 != 0) {
         return this.field4255 ? var1.method1765().method1457(var2.method1765()) : var2.method1765().method1457(var1.method1765());
      } else {
         return this.method6(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method2560((class410)var1, (class410)var2);
   }
}
