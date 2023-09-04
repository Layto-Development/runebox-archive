public class class179 {
   static class501[] field1451;
   float field1439;
   float field1440;
   float field1441;
   float field1442;
   float field1443;
   float field1444;
   float field1445;
   float field1446;
   float field1447;
   float field1448;
   float field1449;
   float field1450;

   static {
      new class179();
   }

   class179() {
      this.method957();
   }

   void method957() {
      this.field1450 = 0.0F;
      this.field1447 = 0.0F;
      this.field1448 = 0.0F;
      this.field1446 = 0.0F;
      this.field1449 = 0.0F;
      this.field1439 = 0.0F;
      this.field1442 = 0.0F;
      this.field1441 = 0.0F;
      this.field1440 = 0.0F;
      this.field1443 = 1.0F;
      this.field1444 = 1.0F;
      this.field1445 = 1.0F;
   }

   void method958(float var1) {
      float var3 = (float)Math.cos((double)var1);
      float var4 = (float)Math.sin((double)var1);
      float var5 = this.field1440;
      float var6 = this.field1444;
      float var7 = this.field1446;
      float var8 = this.field1447;
      this.field1440 = var5 * var3 - var4 * this.field1441;
      this.field1441 = var3 * this.field1441 + var5 * var4;
      this.field1444 = var6 * var3 - this.field1439 * var4;
      this.field1439 = var6 * var4 + this.field1439 * var3;
      this.field1446 = var3 * var7 - var4 * this.field1443;
      this.field1443 = var7 * var4 + this.field1443 * var3;
      this.field1447 = var3 * var8 - var4 * this.field1450;
      this.field1450 = var8 * var4 + this.field1450 * var3;
   }

   void method961(float var1) {
      float var3 = (float)Math.cos((double)var1);
      float var4 = (float)Math.sin((double)var1);
      float var5 = this.field1445;
      float var6 = this.field1442;
      float var7 = this.field1449;
      float var8 = this.field1448;
      this.field1445 = var4 * this.field1441 + var3 * var5;
      this.field1441 = this.field1441 * var3 - var5 * var4;
      this.field1442 = var4 * this.field1439 + var3 * var6;
      this.field1439 = this.field1439 * var3 - var4 * var6;
      this.field1449 = var7 * var3 + this.field1443 * var4;
      this.field1443 = this.field1443 * var3 - var4 * var7;
      this.field1448 = var3 * var8 + this.field1450 * var4;
      this.field1450 = this.field1450 * var3 - var8 * var4;
   }

   void method959(float var1) {
      float var3 = (float)Math.cos((double)var1);
      float var4 = (float)Math.sin((double)var1);
      float var5 = this.field1445;
      float var6 = this.field1442;
      float var7 = this.field1449;
      float var8 = this.field1448;
      this.field1445 = var3 * var5 - var4 * this.field1440;
      this.field1440 = var3 * this.field1440 + var4 * var5;
      this.field1442 = var6 * var3 - var4 * this.field1444;
      this.field1444 = var4 * var6 + var3 * this.field1444;
      this.field1449 = var3 * var7 - var4 * this.field1446;
      this.field1446 = this.field1446 * var3 + var4 * var7;
      this.field1448 = var3 * var8 - this.field1447 * var4;
      this.field1447 = this.field1447 * var3 + var8 * var4;
   }

   void method960(float var1, float var2, float var3) {
      this.field1448 += var1;
      this.field1447 += var2;
      this.field1450 += var3;
   }

   public String toString() {
      return this.field1445 + "," + this.field1442 + "," + this.field1449 + "," + this.field1448 + "\n" + this.field1440 + "," + this.field1444 + "," + this.field1446 + "," + this.field1447 + "\n" + this.field1441 + "," + this.field1439 + "," + this.field1443 + "," + this.field1450;
   }
}
