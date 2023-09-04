public class class304 extends class434 {
   final boolean field2066;

   public class304(boolean var1) {
      this.field2066 = var1;
   }

   int method1388(class538 var1, class538 var2) {
      if (var1.field4284 != var2.field4284) {
         return this.field2066 ? var1.field4284 - var2.field4284 : var2.field4284 - var1.field4284;
      } else {
         return this.method2028(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method1388((class538)var1, (class538)var2);
   }
}
