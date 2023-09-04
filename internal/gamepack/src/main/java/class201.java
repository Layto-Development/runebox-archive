public class class201 extends class285 {
   int field1556 = 0;
   int field1557 = 0;
   int field1558 = 0;
   int field1559 = 0;
   int field1560 = 0;
   int field1561 = 0;

   public class201(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super(var7, var8);
      this.field1560 = var1;
      this.field1557 = var2;
      this.field1558 = var3;
      this.field1559 = var4;
      this.field1556 = var5;
      this.field1561 = var6;
   }

   public int method1305() {
      double var2 = this.method77();
      return (int)Math.round((double)(this.field1559 - this.field1560) * var2 + (double)this.field1560);
   }

   public int method1306() {
      double var2 = this.method77();
      return (int)Math.round(var2 * (double)(this.field1556 - this.field1557) + (double)this.field1557);
   }

   public int method1307() {
      double var2 = this.method77();
      return (int)Math.round((double)this.field1558 + (double)(this.field1561 - this.field1558) * var2);
   }
}
