public class class254 extends class434 {
   final boolean field1840;

   public class254(boolean var1) {
      this.field1840 = var1;
   }

   int method1197(class538 var1, class538 var2) {
      if (0 != var1.field4284 && var2.field4284 != 0) {
         return this.field1840 ? var1.field4283 - var2.field4283 : var2.field4283 - var1.field4283;
      } else {
         return this.method2028(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method1197((class538)var1, (class538)var2);
   }
}
