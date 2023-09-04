public class class35 extends class3 {
   final boolean field880;

   public class35(boolean var1) {
      this.field880 = var1;
   }

   int method557(class410 var1, class410 var2) {
      if (Client.field576 == var1.field3157 && var2.field3157 == Client.field576) {
         return this.field880 ? var1.method1765().method1457(var2.method1765()) : var2.method1765().method1457(var1.method1765());
      } else {
         return this.method6(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method557((class410)var1, (class410)var2);
   }

   public static void method558() {
      class449.field3437.method1848();
      class449.field3464.method1848();
      class449.field3440.method1848();
      class449.field3458.method1848();
   }
}
