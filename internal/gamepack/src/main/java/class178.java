public class class178 extends class368 {
   static boolean field1438;
   final class260 field1437;
   final int field1434;
   final int field1435;
   final int field1436;

   class178(class113 var1, class113 var2, int var3, class260 var4) {
      super(var1, var2);
      this.field1434 = var3;
      this.field1437 = var4;
      class430 var5 = class430.method2005(this.method1720());
      class296 var6 = var5.method2001(false);
      if (null != var6) {
         this.field1436 = var6.field2032;
         this.field1435 = var6.field2028;
      } else {
         this.field1436 = 0;
         this.field1435 = 0;
      }

   }

   public int method1720() {
      return this.field1434;
   }

   class260 method1725() {
      return this.field1437;
   }

   int method1726() {
      return this.field1436;
   }

   int method1721() {
      return this.field1435;
   }
}
