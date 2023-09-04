public class class73 extends class221 {
   double field1195 = 0.0;
   double field1196 = 0.0;
   double field1197 = 0.0;
   double field1198 = 0.0;
   double field1199 = 0.0;
   int field1193 = 0;
   int field1194 = 0;

   public class73(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(var9, var10);
      this.field1193 = var3;
      this.field1194 = var6;
      if ((var7 - var1) * (var5 - var8) == (var4 - var7) * (var8 - var2)) {
         this.field1195 = (double)var4;
         this.field1196 = (double)var5;
      } else {
         double var11 = (double)((float)(var1 + var7)) / 2.0;
         double var13 = (double)((float)(var2 + var8)) / 2.0;
         double var15 = (double)((float)(var7 + var4)) / 2.0;
         double var17 = (double)((float)(var5 + var8)) / 2.0;
         double var19 = -1.0 * (double)(var7 - var1) / (double)(var8 - var2);
         double var21 = (double)(var4 - var7) * -1.0 / (double)(var5 - var8);
         this.field1195 = (var19 * var11 - var21 * var15 + var17 - var13) / (var19 - var21);
         this.field1196 = var13 + var19 * (this.field1195 - var11);
         this.field1197 = Math.sqrt(Math.pow(this.field1195 - (double)var1, 2.0) + Math.pow(this.field1196 - (double)var2, 2.0));
         this.field1199 = Math.atan2((double)var2 - this.field1196, (double)var1 - this.field1195);
         double var23 = Math.atan2((double)var8 - this.field1196, (double)var7 - this.field1195);
         this.field1198 = Math.atan2((double)var5 - this.field1196, (double)var4 - this.field1195);
         boolean var25 = this.field1199 <= var23 && var23 <= this.field1198 || this.field1198 <= var23 && var23 <= this.field1199;
         if (!var25) {
            this.field1198 += (double)(this.field1199 - this.field1198 > 0.0 ? 2 : -2) * Math.PI;
         }

      }
   }

   public int method1320() {
      double var2 = this.method722();
      double var4 = this.field1199 + (this.field1198 - this.field1199) * var2;
      return (int)Math.round(this.field1195 + this.field1197 * Math.cos(var4));
   }

   public int method1321() {
      double var2 = this.method722();
      double var4 = this.field1199 + var2 * (this.field1198 - this.field1199);
      return (int)Math.round(this.field1196 + this.field1197 * Math.sin(var4));
   }

   public int method1322() {
      double var2 = this.method722();
      return (int)Math.round((double)this.field1193 + var2 * (double)(this.field1194 - this.field1193));
   }
}
