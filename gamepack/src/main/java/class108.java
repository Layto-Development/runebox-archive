public class class108 extends class373 {
   static boolean field1440;
   final class174 field1439;
   final int field1436;
   final int field1437;
   final int field1438;

   class108(class89 var1, class89 var2, int var3, class174 var4) {
      super(var1, var2);
      this.field1436 = var3;
      this.field1439 = var4;
      class444 var5 = class444.method2173(this.method1871());
      class427 var6 = var5.method2169(false);
      if (null != var6) {
         this.field1438 = var6.field3237;
         this.field1437 = var6.field3233;
      } else {
         this.field1438 = 0;
         this.field1437 = 0;
      }

   }

   public int method1871() {
      return this.field1436;
   }

   class174 method1876() {
      return this.field1439;
   }

   int method1877() {
      return this.field1438;
   }

   int method1872() {
      return this.field1437;
   }
}
