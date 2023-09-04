public class class74 extends class91 {
   int field1200 = 0;
   int field1201 = 0;

   public class74(int var1, int var2, int var3, int var4) {
      super(var3, var4);
      this.field1200 = var1;
      this.field1201 = var2;
   }

   public int method686() {
      double var2 = this.method722();
      return (int)Math.round((double)this.field1200 + var2 * (double)(this.field1201 - this.field1200));
   }
}
