import java.util.Arrays;

public final class class475 {
   public static class475[] field3765 = new class475[0];
   public static final class475 field3767;
   public float[] field3766 = new float[16];

   static {
      method2246(100);
      field3767 = new class475();
   }

   public class475() {
      this.method2233();
   }

   public class475(class475 var1) {
      this.method2240(var1);
   }

   public class475(class366 var1, boolean var2) {
      this.method2241(var1, var2);
   }

   public void method2242() {
      synchronized(field3765) {
         if (class180.field1453 < class241.field1760 - 1) {
            field3765[++class180.field1453 - 1] = this;
         }

      }
   }

   void method2241(class366 var1, boolean var2) {
      if (var2) {
         class179 var4 = new class179();
         int var7 = var1.method1656();
         var7 &= 16383;
         float var6 = (float)(6.283185307179586 * (double)((float)var7 / 16384.0F));
         var4.method958(var6);
         int var10 = var1.method1656();
         var10 &= 16383;
         float var9 = (float)((double)((float)var10 / 16384.0F) * 6.283185307179586);
         var4.method961(var9);
         int var13 = var1.method1656();
         var13 &= 16383;
         float var12 = (float)((double)((float)var13 / 16384.0F) * 6.283185307179586);
         var4.method959(var12);
         var4.method960((float)var1.method1656(), (float)var1.method1656(), (float)var1.method1656());
         this.method2230(var4);
      } else {
         for(int var14 = 0; var14 < 16; ++var14) {
            this.field3766[var14] = var1.method1660();
         }
      }

   }

   float[] method2231() {
      float[] var2 = new float[3];
      if ((double)this.field3766[2] < 0.999 && (double)this.field3766[2] > -0.999) {
         var2[1] = (float)(-Math.asin((double)this.field3766[2]));
         double var3 = Math.cos((double)var2[1]);
         var2[0] = (float)Math.atan2((double)this.field3766[6] / var3, (double)this.field3766[10] / var3);
         var2[2] = (float)Math.atan2((double)this.field3766[1] / var3, (double)this.field3766[0] / var3);
      } else {
         var2[0] = 0.0F;
         var2[1] = (float)Math.atan2((double)this.field3766[2], 0.0);
         var2[2] = (float)Math.atan2((double)(-this.field3766[9]), (double)this.field3766[5]);
      }

      return var2;
   }

   public float[] method2232() {
      float[] var2 = new float[]{(float)(-Math.asin((double)this.field3766[6])), 0.0F, 0.0F};
      double var3 = Math.cos((double)var2[0]);
      double var5;
      double var7;
      if (Math.abs(var3) > 0.005) {
         var5 = (double)this.field3766[2];
         var7 = (double)this.field3766[10];
         double var9 = (double)this.field3766[4];
         double var11 = (double)this.field3766[5];
         var2[1] = (float)Math.atan2(var5, var7);
         var2[2] = (float)Math.atan2(var9, var11);
      } else {
         var5 = (double)this.field3766[1];
         var7 = (double)this.field3766[0];
         if (this.field3766[6] < 0.0F) {
            var2[1] = (float)Math.atan2(var5, var7);
         } else {
            var2[1] = (float)(-Math.atan2(var5, var7));
         }

         var2[2] = 0.0F;
      }

      return var2;
   }

   public void method2233() {
      this.field3766[0] = 1.0F;
      this.field3766[1] = 0.0F;
      this.field3766[2] = 0.0F;
      this.field3766[3] = 0.0F;
      this.field3766[4] = 0.0F;
      this.field3766[5] = 1.0F;
      this.field3766[6] = 0.0F;
      this.field3766[7] = 0.0F;
      this.field3766[8] = 0.0F;
      this.field3766[9] = 0.0F;
      this.field3766[10] = 1.0F;
      this.field3766[11] = 0.0F;
      this.field3766[12] = 0.0F;
      this.field3766[13] = 0.0F;
      this.field3766[14] = 0.0F;
      this.field3766[15] = 1.0F;
   }

   public void method2234() {
      this.field3766[0] = 0.0F;
      this.field3766[1] = 0.0F;
      this.field3766[2] = 0.0F;
      this.field3766[3] = 0.0F;
      this.field3766[4] = 0.0F;
      this.field3766[5] = 0.0F;
      this.field3766[6] = 0.0F;
      this.field3766[7] = 0.0F;
      this.field3766[8] = 0.0F;
      this.field3766[9] = 0.0F;
      this.field3766[10] = 0.0F;
      this.field3766[11] = 0.0F;
      this.field3766[12] = 0.0F;
      this.field3766[13] = 0.0F;
      this.field3766[14] = 0.0F;
      this.field3766[15] = 0.0F;
   }

   public void method2240(class475 var1) {
      System.arraycopy(var1.field3766, 0, this.field3766, 0, 16);
   }

   public void method2235(float var1) {
      this.method2236(var1, var1, var1);
   }

   public void method2236(float var1, float var2, float var3) {
      this.method2233();
      this.field3766[0] = var1;
      this.field3766[5] = var2;
      this.field3766[10] = var3;
   }

   public void method2237(class475 var1) {
      for(int var3 = 0; var3 < this.field3766.length; ++var3) {
         float[] var10000 = this.field3766;
         var10000[var3] += var1.field3766[var3];
      }

   }

   public void method2243(class475 var1) {
      float var3 = this.field3766[2] * var1.field3766[8] + var1.field3766[0] * this.field3766[0] + var1.field3766[4] * this.field3766[1] + var1.field3766[12] * this.field3766[3];
      float var4 = this.field3766[0] * var1.field3766[1] + var1.field3766[5] * this.field3766[1] + var1.field3766[9] * this.field3766[2] + this.field3766[3] * var1.field3766[13];
      float var5 = var1.field3766[14] * this.field3766[3] + this.field3766[2] * var1.field3766[10] + var1.field3766[6] * this.field3766[1] + var1.field3766[2] * this.field3766[0];
      float var6 = this.field3766[0] * var1.field3766[3] + var1.field3766[7] * this.field3766[1] + this.field3766[2] * var1.field3766[11] + this.field3766[3] * var1.field3766[15];
      float var7 = this.field3766[7] * var1.field3766[12] + this.field3766[4] * var1.field3766[0] + this.field3766[5] * var1.field3766[4] + var1.field3766[8] * this.field3766[6];
      float var8 = this.field3766[6] * var1.field3766[9] + var1.field3766[1] * this.field3766[4] + var1.field3766[5] * this.field3766[5] + this.field3766[7] * var1.field3766[13];
      float var9 = this.field3766[7] * var1.field3766[14] + this.field3766[5] * var1.field3766[6] + this.field3766[4] * var1.field3766[2] + var1.field3766[10] * this.field3766[6];
      float var10 = var1.field3766[15] * this.field3766[7] + this.field3766[6] * var1.field3766[11] + this.field3766[4] * var1.field3766[3] + this.field3766[5] * var1.field3766[7];
      float var11 = var1.field3766[12] * this.field3766[11] + this.field3766[10] * var1.field3766[8] + var1.field3766[4] * this.field3766[9] + this.field3766[8] * var1.field3766[0];
      float var12 = this.field3766[11] * var1.field3766[13] + this.field3766[9] * var1.field3766[5] + var1.field3766[1] * this.field3766[8] + var1.field3766[9] * this.field3766[10];
      float var13 = var1.field3766[14] * this.field3766[11] + this.field3766[9] * var1.field3766[6] + var1.field3766[2] * this.field3766[8] + this.field3766[10] * var1.field3766[10];
      float var14 = var1.field3766[15] * this.field3766[11] + var1.field3766[11] * this.field3766[10] + var1.field3766[7] * this.field3766[9] + this.field3766[8] * var1.field3766[3];
      float var15 = this.field3766[14] * var1.field3766[8] + var1.field3766[0] * this.field3766[12] + this.field3766[13] * var1.field3766[4] + this.field3766[15] * var1.field3766[12];
      float var16 = var1.field3766[13] * this.field3766[15] + var1.field3766[5] * this.field3766[13] + this.field3766[12] * var1.field3766[1] + var1.field3766[9] * this.field3766[14];
      float var17 = this.field3766[14] * var1.field3766[10] + var1.field3766[6] * this.field3766[13] + this.field3766[12] * var1.field3766[2] + var1.field3766[14] * this.field3766[15];
      float var18 = var1.field3766[15] * this.field3766[15] + var1.field3766[3] * this.field3766[12] + this.field3766[13] * var1.field3766[7] + var1.field3766[11] * this.field3766[14];
      this.field3766[0] = var3;
      this.field3766[1] = var4;
      this.field3766[2] = var5;
      this.field3766[3] = var6;
      this.field3766[4] = var7;
      this.field3766[5] = var8;
      this.field3766[6] = var9;
      this.field3766[7] = var10;
      this.field3766[8] = var11;
      this.field3766[9] = var12;
      this.field3766[10] = var13;
      this.field3766[11] = var14;
      this.field3766[12] = var15;
      this.field3766[13] = var16;
      this.field3766[14] = var17;
      this.field3766[15] = var18;
   }

   public void method2244(class158 var1) {
      float var3 = var1.field998 * var1.field998;
      float var4 = var1.field1002 * var1.field998;
      float var5 = var1.field998 * var1.field1001;
      float var6 = var1.field1003 * var1.field998;
      float var7 = var1.field1002 * var1.field1002;
      float var8 = var1.field1002 * var1.field1001;
      float var9 = var1.field1003 * var1.field1002;
      float var10 = var1.field1001 * var1.field1001;
      float var11 = var1.field1001 * var1.field1003;
      float var12 = var1.field1003 * var1.field1003;
      this.field3766[0] = var7 + var3 - var12 - var10;
      this.field3766[1] = var8 + var6 + var8 + var6;
      this.field3766[2] = var9 - var5 - var5 + var9;
      this.field3766[4] = var8 - var6 - var6 + var8;
      this.field3766[5] = var3 + var10 - var7 - var12;
      this.field3766[6] = var4 + var11 + var4 + var11;
      this.field3766[8] = var9 + var5 + var9 + var5;
      this.field3766[9] = var11 - var4 - var4 + var11;
      this.field3766[10] = var12 + var3 - var10 - var7;
   }

   void method2230(class179 var1) {
      this.field3766[0] = var1.field1445;
      this.field3766[1] = var1.field1440;
      this.field3766[2] = var1.field1441;
      this.field3766[3] = 0.0F;
      this.field3766[4] = var1.field1442;
      this.field3766[5] = var1.field1444;
      this.field3766[6] = var1.field1439;
      this.field3766[7] = 0.0F;
      this.field3766[8] = var1.field1449;
      this.field3766[9] = var1.field1446;
      this.field3766[10] = var1.field1443;
      this.field3766[11] = 0.0F;
      this.field3766[12] = var1.field1448;
      this.field3766[13] = var1.field1447;
      this.field3766[14] = var1.field1450;
      this.field3766[15] = 1.0F;
   }

   float method2238() {
      return this.field3766[12] * this.field3766[9] * this.field3766[6] * this.field3766[3] + (this.field3766[8] * this.field3766[7] * this.field3766[2] * this.field3766[13] + this.field3766[8] * this.field3766[1] * this.field3766[6] * this.field3766[15] + this.field3766[14] * this.field3766[11] * this.field3766[4] * this.field3766[1] + (this.field3766[0] * this.field3766[7] * this.field3766[9] * this.field3766[14] + this.field3766[15] * this.field3766[5] * this.field3766[0] * this.field3766[10] - this.field3766[0] * this.field3766[5] * this.field3766[11] * this.field3766[14] - this.field3766[15] * this.field3766[0] * this.field3766[6] * this.field3766[9] + this.field3766[13] * this.field3766[0] * this.field3766[6] * this.field3766[11] - this.field3766[10] * this.field3766[0] * this.field3766[7] * this.field3766[13] - this.field3766[15] * this.field3766[4] * this.field3766[1] * this.field3766[10]) - this.field3766[12] * this.field3766[1] * this.field3766[6] * this.field3766[11] - this.field3766[7] * this.field3766[1] * this.field3766[8] * this.field3766[14] + this.field3766[12] * this.field3766[10] * this.field3766[7] * this.field3766[1] + this.field3766[15] * this.field3766[4] * this.field3766[2] * this.field3766[9] - this.field3766[13] * this.field3766[11] * this.field3766[4] * this.field3766[2] - this.field3766[15] * this.field3766[8] * this.field3766[2] * this.field3766[5] + this.field3766[11] * this.field3766[2] * this.field3766[5] * this.field3766[12] - this.field3766[9] * this.field3766[7] * this.field3766[2] * this.field3766[12] - this.field3766[14] * this.field3766[3] * this.field3766[4] * this.field3766[9] + this.field3766[13] * this.field3766[10] * this.field3766[4] * this.field3766[3] + this.field3766[14] * this.field3766[8] * this.field3766[5] * this.field3766[3] - this.field3766[12] * this.field3766[3] * this.field3766[5] * this.field3766[10] - this.field3766[6] * this.field3766[3] * this.field3766[8] * this.field3766[13]);
   }

   public void method2245() {
      float var2 = 1.0F / this.method2238();
      float var3 = (this.field3766[11] * this.field3766[6] * this.field3766[13] + (this.field3766[15] * this.field3766[5] * this.field3766[10] - this.field3766[14] * this.field3766[11] * this.field3766[5] - this.field3766[9] * this.field3766[6] * this.field3766[15]) + this.field3766[14] * this.field3766[7] * this.field3766[9] - this.field3766[7] * this.field3766[10] * this.field3766[13]) * var2;
      float var4 = (this.field3766[13] * this.field3766[3] * this.field3766[10] + (this.field3766[15] * -this.field3766[1] * this.field3766[10] + this.field3766[14] * this.field3766[11] * this.field3766[1] + this.field3766[9] * this.field3766[2] * this.field3766[15] - this.field3766[11] * this.field3766[2] * this.field3766[13] - this.field3766[14] * this.field3766[9] * this.field3766[3])) * var2;
      float var5 = (this.field3766[15] * this.field3766[6] * this.field3766[1] - this.field3766[1] * this.field3766[7] * this.field3766[14] - this.field3766[15] * this.field3766[2] * this.field3766[5] + this.field3766[2] * this.field3766[7] * this.field3766[13] + this.field3766[3] * this.field3766[5] * this.field3766[14] - this.field3766[13] * this.field3766[6] * this.field3766[3]) * var2;
      float var6 = (this.field3766[9] * this.field3766[3] * this.field3766[6] + (this.field3766[7] * this.field3766[1] * this.field3766[10] + this.field3766[11] * -this.field3766[1] * this.field3766[6] + this.field3766[11] * this.field3766[2] * this.field3766[5] - this.field3766[7] * this.field3766[2] * this.field3766[9] - this.field3766[5] * this.field3766[3] * this.field3766[10])) * var2;
      float var7 = (this.field3766[12] * this.field3766[10] * this.field3766[7] + (this.field3766[6] * this.field3766[8] * this.field3766[15] + this.field3766[15] * this.field3766[10] * -this.field3766[4] + this.field3766[4] * this.field3766[11] * this.field3766[14] - this.field3766[11] * this.field3766[6] * this.field3766[12] - this.field3766[14] * this.field3766[8] * this.field3766[7])) * var2;
      float var8 = (this.field3766[2] * this.field3766[11] * this.field3766[12] + (this.field3766[0] * this.field3766[10] * this.field3766[15] - this.field3766[14] * this.field3766[0] * this.field3766[11] - this.field3766[15] * this.field3766[2] * this.field3766[8]) + this.field3766[14] * this.field3766[8] * this.field3766[3] - this.field3766[3] * this.field3766[10] * this.field3766[12]) * var2;
      float var9 = (this.field3766[15] * this.field3766[2] * this.field3766[4] + this.field3766[15] * this.field3766[6] * -this.field3766[0] + this.field3766[0] * this.field3766[7] * this.field3766[14] - this.field3766[7] * this.field3766[2] * this.field3766[12] - this.field3766[3] * this.field3766[4] * this.field3766[14] + this.field3766[12] * this.field3766[3] * this.field3766[6]) * var2;
      float var10 = (this.field3766[10] * this.field3766[4] * this.field3766[3] + this.field3766[0] * this.field3766[6] * this.field3766[11] - this.field3766[10] * this.field3766[0] * this.field3766[7] - this.field3766[2] * this.field3766[4] * this.field3766[11] + this.field3766[7] * this.field3766[2] * this.field3766[8] - this.field3766[8] * this.field3766[6] * this.field3766[3]) * var2;
      float var11 = (this.field3766[15] * this.field3766[4] * this.field3766[9] - this.field3766[13] * this.field3766[4] * this.field3766[11] - this.field3766[15] * this.field3766[5] * this.field3766[8] + this.field3766[11] * this.field3766[5] * this.field3766[12] + this.field3766[13] * this.field3766[8] * this.field3766[7] - this.field3766[12] * this.field3766[9] * this.field3766[7]) * var2;
      float var12 = var2 * (this.field3766[15] * this.field3766[9] * -this.field3766[0] + this.field3766[13] * this.field3766[0] * this.field3766[11] + this.field3766[1] * this.field3766[8] * this.field3766[15] - this.field3766[11] * this.field3766[1] * this.field3766[12] - this.field3766[8] * this.field3766[3] * this.field3766[13] + this.field3766[9] * this.field3766[3] * this.field3766[12]);
      float var13 = (this.field3766[4] * this.field3766[3] * this.field3766[13] + this.field3766[12] * this.field3766[1] * this.field3766[7] + (this.field3766[15] * this.field3766[5] * this.field3766[0] - this.field3766[13] * this.field3766[0] * this.field3766[7] - this.field3766[1] * this.field3766[4] * this.field3766[15]) - this.field3766[12] * this.field3766[3] * this.field3766[5]) * var2;
      float var14 = var2 * (this.field3766[8] * this.field3766[3] * this.field3766[5] + (-this.field3766[0] * this.field3766[5] * this.field3766[11] + this.field3766[9] * this.field3766[7] * this.field3766[0] + this.field3766[4] * this.field3766[1] * this.field3766[11] - this.field3766[8] * this.field3766[1] * this.field3766[7] - this.field3766[3] * this.field3766[4] * this.field3766[9]));
      float var15 = (this.field3766[12] * this.field3766[6] * this.field3766[9] + (this.field3766[14] * this.field3766[9] * -this.field3766[4] + this.field3766[13] * this.field3766[10] * this.field3766[4] + this.field3766[8] * this.field3766[5] * this.field3766[14] - this.field3766[12] * this.field3766[10] * this.field3766[5] - this.field3766[8] * this.field3766[6] * this.field3766[13])) * var2;
      float var16 = (this.field3766[13] * this.field3766[8] * this.field3766[2] + this.field3766[0] * this.field3766[9] * this.field3766[14] - this.field3766[13] * this.field3766[0] * this.field3766[10] - this.field3766[1] * this.field3766[8] * this.field3766[14] + this.field3766[1] * this.field3766[10] * this.field3766[12] - this.field3766[12] * this.field3766[2] * this.field3766[9]) * var2;
      float var17 = var2 * (-this.field3766[0] * this.field3766[5] * this.field3766[14] + this.field3766[6] * this.field3766[0] * this.field3766[13] + this.field3766[14] * this.field3766[1] * this.field3766[4] - this.field3766[6] * this.field3766[1] * this.field3766[12] - this.field3766[4] * this.field3766[2] * this.field3766[13] + this.field3766[2] * this.field3766[5] * this.field3766[12]);
      float var18 = (this.field3766[5] * this.field3766[0] * this.field3766[10] - this.field3766[0] * this.field3766[6] * this.field3766[9] - this.field3766[1] * this.field3766[4] * this.field3766[10] + this.field3766[1] * this.field3766[6] * this.field3766[8] + this.field3766[2] * this.field3766[4] * this.field3766[9] - this.field3766[8] * this.field3766[2] * this.field3766[5]) * var2;
      this.field3766[0] = var3;
      this.field3766[1] = var4;
      this.field3766[2] = var5;
      this.field3766[3] = var6;
      this.field3766[4] = var7;
      this.field3766[5] = var8;
      this.field3766[6] = var9;
      this.field3766[7] = var10;
      this.field3766[8] = var11;
      this.field3766[9] = var12;
      this.field3766[10] = var13;
      this.field3766[11] = var14;
      this.field3766[12] = var15;
      this.field3766[13] = var16;
      this.field3766[14] = var17;
      this.field3766[15] = var18;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      this.method2232();
      this.method2231();

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.field3766[var2 * 4 + var3];
            if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5) {
               var4 = 0.0F;
            }

            var1.append(var4);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   public int hashCode() {
      boolean var1 = true;
      int var2 = 1;
      var2 = var2 * 31 + Arrays.hashCode(this.field3766);
      return var2;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class475)) {
         return false;
      } else {
         class475 var2 = (class475)var1;

         for(int var3 = 0; var3 < 16; ++var3) {
            if (this.field3766[var3] != var2.field3766[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   public float[] method2239() {
      float[] var2 = new float[3];
      class3 var3 = new class3(this.field3766[0], this.field3766[1], this.field3766[2]);
      class3 var4 = new class3(this.field3766[4], this.field3766[5], this.field3766[6]);
      class3 var5 = new class3(this.field3766[8], this.field3766[9], this.field3766[10]);
      var2[0] = var3.method5();
      var2[1] = var4.method5();
      var2[2] = var5.method5();
      return var2;
   }

   static void method2246(int var0) {
      class241.field1760 = var0;
      field3765 = new class475[var0];
      class180.field1453 = 0;
   }
}
