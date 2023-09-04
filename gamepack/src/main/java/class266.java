public class class266 extends class221 {
   int field2292 = 0;
   int field2293 = 0;
   int field2294 = 0;
   int field2295 = 0;
   int field2296 = 0;
   int field2297 = 0;

   public class266(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super(var7, var8);
      this.field2296 = var1;
      this.field2293 = var2;
      this.field2294 = var3;
      this.field2295 = var4;
      this.field2292 = var5;
      this.field2297 = var6;
   }

   public int method1320() {
      double var2 = this.method722();
      return (int)Math.round((double)(this.field2295 - this.field2296) * var2 + (double)this.field2296);
   }

   public int method1321() {
      double var2 = this.method722();
      return (int)Math.round(var2 * (double)(this.field2292 - this.field2293) + (double)this.field2293);
   }

   public int method1322() {
      double var2 = this.method722();
      return (int)Math.round((double)this.field2294 + (double)(this.field2297 - this.field2294) * var2);
   }
}
