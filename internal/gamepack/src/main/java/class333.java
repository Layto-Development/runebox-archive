public class class333 extends class3 {
   static int field2680;
   final boolean field2679;

   public class333(boolean var1) {
      this.field2679 = var1;
   }

   int method1770(class410 var1, class410 var2) {
      if (var1.field3157 == Client.field576 && var2.field3157 == Client.field576) {
         return this.field2679 ? var1.field3156 - var2.field3156 : var2.field3156 - var1.field3156;
      } else {
         return this.method6(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method1770((class410)var1, (class410)var2);
   }
}
