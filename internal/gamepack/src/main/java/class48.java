public class class48 {
   static class425[] field1044;
   float field1032;
   float field1033;
   float field1034;
   float field1035;
   float field1036;
   float field1037;
   float field1038;
   float field1039;
   float field1040;
   float field1041;
   float field1042;
   float field1043;

   static {
      new class48();
   }

   class48() {
      this.method592();
   }

   void method592() {
      this.field1043 = 0.0F;
      this.field1040 = 0.0F;
      this.field1041 = 0.0F;
      this.field1039 = 0.0F;
      this.field1042 = 0.0F;
      this.field1032 = 0.0F;
      this.field1035 = 0.0F;
      this.field1034 = 0.0F;
      this.field1033 = 0.0F;
      this.field1036 = 1.0F;
      this.field1037 = 1.0F;
      this.field1038 = 1.0F;
   }

   void method593(float var1) {
      float var3 = (float)Math.cos((double)var1);
      float var4 = (float)Math.sin((double)var1);
      float var5 = this.field1033;
      float var6 = this.field1037;
      float var7 = this.field1039;
      float var8 = this.field1040;
      this.field1033 = var5 * var3 - var4 * this.field1034;
      this.field1034 = var3 * this.field1034 + var5 * var4;
      this.field1037 = var6 * var3 - this.field1032 * var4;
      this.field1032 = var6 * var4 + this.field1032 * var3;
      this.field1039 = var3 * var7 - var4 * this.field1036;
      this.field1036 = var7 * var4 + this.field1036 * var3;
      this.field1040 = var3 * var8 - var4 * this.field1043;
      this.field1043 = var8 * var4 + this.field1043 * var3;
   }

   void method596(float var1) {
      float var3 = (float)Math.cos((double)var1);
      float var4 = (float)Math.sin((double)var1);
      float var5 = this.field1038;
      float var6 = this.field1035;
      float var7 = this.field1042;
      float var8 = this.field1041;
      this.field1038 = var4 * this.field1034 + var3 * var5;
      this.field1034 = this.field1034 * var3 - var5 * var4;
      this.field1035 = var4 * this.field1032 + var3 * var6;
      this.field1032 = this.field1032 * var3 - var4 * var6;
      this.field1042 = var7 * var3 + this.field1036 * var4;
      this.field1036 = this.field1036 * var3 - var4 * var7;
      this.field1041 = var3 * var8 + this.field1043 * var4;
      this.field1043 = this.field1043 * var3 - var8 * var4;
   }

   void method594(float var1) {
      float var3 = (float)Math.cos((double)var1);
      float var4 = (float)Math.sin((double)var1);
      float var5 = this.field1038;
      float var6 = this.field1035;
      float var7 = this.field1042;
      float var8 = this.field1041;
      this.field1038 = var3 * var5 - var4 * this.field1033;
      this.field1033 = var3 * this.field1033 + var4 * var5;
      this.field1035 = var6 * var3 - var4 * this.field1037;
      this.field1037 = var4 * var6 + var3 * this.field1037;
      this.field1042 = var3 * var7 - var4 * this.field1039;
      this.field1039 = this.field1039 * var3 + var4 * var7;
      this.field1041 = var3 * var8 - this.field1040 * var4;
      this.field1040 = this.field1040 * var3 + var8 * var4;
   }

   void method595(float var1, float var2, float var3) {
      this.field1041 += var1;
      this.field1040 += var2;
      this.field1043 += var3;
   }

   public String toString() {
      return this.field1038 + "," + this.field1035 + "," + this.field1042 + "," + this.field1041 + "\n" + this.field1033 + "," + this.field1037 + "," + this.field1039 + "," + this.field1040 + "\n" + this.field1034 + "," + this.field1032 + "," + this.field1036 + "," + this.field1043;
   }
}
