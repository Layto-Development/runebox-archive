public class class41 extends class3 {
   final boolean field924;

   public class41(boolean var1) {
      this.field924 = var1;
   }

   int method572(class410 var1, class410 var2) {
      if (var1.field3157 == Client.field576) {
         if (Client.field576 != var2.field3157) {
            return this.field924 ? -1 : 1;
         }
      } else if (Client.field576 == var2.field3157) {
         return this.field924 ? 1 : -1;
      }

      return this.method6(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method572((class410)var1, (class410)var2);
   }
}
