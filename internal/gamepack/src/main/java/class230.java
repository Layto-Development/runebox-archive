public class class230 extends class12 {
   int field1710 = 0;
   int field1711 = 0;

   public class230(int var1, int var2, int var3, int var4) {
      super(var3, var4);
      this.field1710 = var1;
      this.field1711 = var2;
   }

   public int method1125() {
      double var2 = this.method77();
      return (int)Math.round((double)this.field1710 + var2 * (double)(this.field1711 - this.field1710));
   }
}
