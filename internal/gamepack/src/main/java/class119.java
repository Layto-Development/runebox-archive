public class class119 extends class285 {
   double field735 = 0.0;
   double field736 = 0.0;
   double field737 = 0.0;
   double field738 = 0.0;
   double field739 = 0.0;
   int field733 = 0;
   int field734 = 0;

   public class119(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(var9, var10);
      this.field733 = var3;
      this.field734 = var6;
      if ((var7 - var1) * (var5 - var8) == (var4 - var7) * (var8 - var2)) {
         this.field735 = (double)var4;
         this.field736 = (double)var5;
      } else {
         double var11 = (double)((float)(var1 + var7)) / 2.0;
         double var13 = (double)((float)(var2 + var8)) / 2.0;
         double var15 = (double)((float)(var7 + var4)) / 2.0;
         double var17 = (double)((float)(var5 + var8)) / 2.0;
         double var19 = -1.0 * (double)(var7 - var1) / (double)(var8 - var2);
         double var21 = (double)(var4 - var7) * -1.0 / (double)(var5 - var8);
         this.field735 = (var19 * var11 - var21 * var15 + var17 - var13) / (var19 - var21);
         this.field736 = var13 + var19 * (this.field735 - var11);
         this.field737 = Math.sqrt(Math.pow(this.field735 - (double)var1, 2.0) + Math.pow(this.field736 - (double)var2, 2.0));
         this.field739 = Math.atan2((double)var2 - this.field736, (double)var1 - this.field735);
         double var23 = Math.atan2((double)var8 - this.field736, (double)var7 - this.field735);
         this.field738 = Math.atan2((double)var5 - this.field736, (double)var4 - this.field735);
         boolean var25 = this.field739 <= var23 && var23 <= this.field738 || this.field738 <= var23 && var23 <= this.field739;
         if (!var25) {
            this.field738 += (double)(this.field739 - this.field738 > 0.0 ? 2 : -2) * Math.PI;
         }

      }
   }

   public int method1305() {
      double var2 = this.method77();
      double var4 = this.field739 + (this.field738 - this.field739) * var2;
      return (int)Math.round(this.field735 + this.field737 * Math.cos(var4));
   }

   public int method1306() {
      double var2 = this.method77();
      double var4 = this.field739 + var2 * (this.field738 - this.field739);
      return (int)Math.round(this.field736 + this.field737 * Math.sin(var4));
   }

   public int method1307() {
      double var2 = this.method77();
      return (int)Math.round((double)this.field733 + var2 * (double)(this.field734 - this.field733));
   }
}
