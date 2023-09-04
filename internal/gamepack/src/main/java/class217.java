public class class217 extends class368 {
   class260 field1658;
   int field1655;
   int field1659;
   int field1660;
   final class328 field1657;
   final int field1656;

   class217(class113 var1, class113 var2, int var3, class328 var4) {
      super(var1, var2);
      this.field1656 = var3;
      this.field1657 = var4;
      this.method1107();
   }

   void method1107() {
      this.field1655 = class430.method2004(this.field1656, (byte)-56).method2155().field3629;
      this.field1658 = this.field1657.method1537(class430.method2005(this.field1655));
      class430 var2 = class430.method2005(this.method1720());
      class296 var3 = var2.method2001(false);
      if (null != var3) {
         this.field1659 = var3.field2032;
         this.field1660 = var3.field2028;
      } else {
         this.field1659 = 0;
         this.field1660 = 0;
      }

   }

   public int method1720() {
      return this.field1655;
   }

   class260 method1725() {
      return this.field1658;
   }

   int method1726() {
      return this.field1659;
   }

   int method1721() {
      return this.field1660;
   }
}
