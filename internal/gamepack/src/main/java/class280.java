public class class280 extends class434 {
   final boolean field1953;

   public class280(boolean var1) {
      this.field1953 = var1;
   }

   int method1292(class538 var1, class538 var2) {
      if (Client.field1116 == var1.field4284 && var2.field4284 == Client.field1116) {
         return this.field1953 ? var1.method242().method1597(var2.method242()) : var2.method242().method1597(var1.method242());
      } else {
         return this.method2028(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method1292((class538)var1, (class538)var2);
   }

   public static void method1293() {
      class458.field3597.method1180();
      class458.field3624.method1180();
      class458.field3600.method1180();
      class458.field3618.method1180();
   }
}
