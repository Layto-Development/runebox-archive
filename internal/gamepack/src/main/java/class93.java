public class class93 extends class434 {
   final boolean field660;

   public class93(boolean var1) {
      this.field660 = var1;
   }

   int method362(class538 var1, class538 var2) {
      if (var1.field4284 == Client.field1116) {
         if (Client.field1116 != var2.field4284) {
            return this.field660 ? -1 : 1;
         }
      } else if (Client.field1116 == var2.field4284) {
         return this.field660 ? 1 : -1;
      }

      return this.method2028(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method362((class538)var1, (class538)var2);
   }
}
