public class class455 extends class434 {
   static int field3578;
   final boolean field3577;

   public class455(boolean var1) {
      this.field3577 = var1;
   }

   int method2115(class538 var1, class538 var2) {
      if (var1.field4284 == Client.field1116 && var2.field4284 == Client.field1116) {
         return this.field3577 ? var1.field4283 - var2.field4283 : var2.field4283 - var1.field4283;
      } else {
         return this.method2028(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method2115((class538)var1, (class538)var2);
   }
}
