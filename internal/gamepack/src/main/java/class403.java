public class class403 extends class434 {
   final boolean field2806;

   public class403(boolean var1) {
      this.field2806 = var1;
   }

   int method1828(class538 var1, class538 var2) {
      if (var2.field4285 != var1.field4285) {
         return this.field2806 ? var1.field4285 - var2.field4285 : var2.field4285 - var1.field4285;
      } else {
         return this.method2028(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method1828((class538)var1, (class538)var2);
   }
}
