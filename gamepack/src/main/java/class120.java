import java.util.Arrays;

public final class class120 {
   public static class120[] field1487 = new class120[0];
   public static final class120 field1489;
   public float[] field1488 = new float[16];

   static {
      method850(100);
      field1489 = new class120();
   }

   public class120() {
      this.method837();
   }

   public class120(class120 var1) {
      this.method844(var1);
   }

   public class120(class184 var1, boolean var2) {
      this.method845(var1, var2);
   }

   public void method846() {
      synchronized(field1487) {
         if (class261.field2286 < class126.field1522 - 1) {
            field1487[++class261.field2286 - 1] = this;
         }

      }
   }

   void method845(class184 var1, boolean var2) {
      if (var2) {
         class48 var4 = new class48();
         int var7 = var1.method1127();
         var7 &= 16383;
         float var6 = (float)(6.283185307179586 * (double)((float)var7 / 16384.0F));
         var4.method593(var6);
         int var10 = var1.method1127();
         var10 &= 16383;
         float var9 = (float)((double)((float)var10 / 16384.0F) * 6.283185307179586);
         var4.method596(var9);
         int var13 = var1.method1127();
         var13 &= 16383;
         float var12 = (float)((double)((float)var13 / 16384.0F) * 6.283185307179586);
         var4.method594(var12);
         var4.method595((float)var1.method1127(), (float)var1.method1127(), (float)var1.method1127());
         this.method834(var4);
      } else {
         for(int var14 = 0; var14 < 16; ++var14) {
            this.field1488[var14] = var1.method1131();
         }
      }

   }

   float[] method835() {
      float[] var2 = new float[3];
      if ((double)this.field1488[2] < 0.999 && (double)this.field1488[2] > -0.999) {
         var2[1] = (float)(-Math.asin((double)this.field1488[2]));
         double var3 = Math.cos((double)var2[1]);
         var2[0] = (float)Math.atan2((double)this.field1488[6] / var3, (double)this.field1488[10] / var3);
         var2[2] = (float)Math.atan2((double)this.field1488[1] / var3, (double)this.field1488[0] / var3);
      } else {
         var2[0] = 0.0F;
         var2[1] = (float)Math.atan2((double)this.field1488[2], 0.0);
         var2[2] = (float)Math.atan2((double)(-this.field1488[9]), (double)this.field1488[5]);
      }

      return var2;
   }

   public float[] method836() {
      float[] var2 = new float[]{(float)(-Math.asin((double)this.field1488[6])), 0.0F, 0.0F};
      double var3 = Math.cos((double)var2[0]);
      double var5;
      double var7;
      if (Math.abs(var3) > 0.005) {
         var5 = (double)this.field1488[2];
         var7 = (double)this.field1488[10];
         double var9 = (double)this.field1488[4];
         double var11 = (double)this.field1488[5];
         var2[1] = (float)Math.atan2(var5, var7);
         var2[2] = (float)Math.atan2(var9, var11);
      } else {
         var5 = (double)this.field1488[1];
         var7 = (double)this.field1488[0];
         if (this.field1488[6] < 0.0F) {
            var2[1] = (float)Math.atan2(var5, var7);
         } else {
            var2[1] = (float)(-Math.atan2(var5, var7));
         }

         var2[2] = 0.0F;
      }

      return var2;
   }

   public void method837() {
      this.field1488[0] = 1.0F;
      this.field1488[1] = 0.0F;
      this.field1488[2] = 0.0F;
      this.field1488[3] = 0.0F;
      this.field1488[4] = 0.0F;
      this.field1488[5] = 1.0F;
      this.field1488[6] = 0.0F;
      this.field1488[7] = 0.0F;
      this.field1488[8] = 0.0F;
      this.field1488[9] = 0.0F;
      this.field1488[10] = 1.0F;
      this.field1488[11] = 0.0F;
      this.field1488[12] = 0.0F;
      this.field1488[13] = 0.0F;
      this.field1488[14] = 0.0F;
      this.field1488[15] = 1.0F;
   }

   public void method838() {
      this.field1488[0] = 0.0F;
      this.field1488[1] = 0.0F;
      this.field1488[2] = 0.0F;
      this.field1488[3] = 0.0F;
      this.field1488[4] = 0.0F;
      this.field1488[5] = 0.0F;
      this.field1488[6] = 0.0F;
      this.field1488[7] = 0.0F;
      this.field1488[8] = 0.0F;
      this.field1488[9] = 0.0F;
      this.field1488[10] = 0.0F;
      this.field1488[11] = 0.0F;
      this.field1488[12] = 0.0F;
      this.field1488[13] = 0.0F;
      this.field1488[14] = 0.0F;
      this.field1488[15] = 0.0F;
   }

   public void method844(class120 var1) {
      System.arraycopy(var1.field1488, 0, this.field1488, 0, 16);
   }

   public void method839(float var1) {
      this.method840(var1, var1, var1);
   }

   public void method840(float var1, float var2, float var3) {
      this.method837();
      this.field1488[0] = var1;
      this.field1488[5] = var2;
      this.field1488[10] = var3;
   }

   public void method841(class120 var1) {
      for(int var3 = 0; var3 < this.field1488.length; ++var3) {
         float[] var10000 = this.field1488;
         var10000[var3] += var1.field1488[var3];
      }

   }

   public void method847(class120 var1) {
      float var3 = this.field1488[2] * var1.field1488[8] + var1.field1488[0] * this.field1488[0] + var1.field1488[4] * this.field1488[1] + var1.field1488[12] * this.field1488[3];
      float var4 = this.field1488[0] * var1.field1488[1] + var1.field1488[5] * this.field1488[1] + var1.field1488[9] * this.field1488[2] + this.field1488[3] * var1.field1488[13];
      float var5 = var1.field1488[14] * this.field1488[3] + this.field1488[2] * var1.field1488[10] + var1.field1488[6] * this.field1488[1] + var1.field1488[2] * this.field1488[0];
      float var6 = this.field1488[0] * var1.field1488[3] + var1.field1488[7] * this.field1488[1] + this.field1488[2] * var1.field1488[11] + this.field1488[3] * var1.field1488[15];
      float var7 = this.field1488[7] * var1.field1488[12] + this.field1488[4] * var1.field1488[0] + this.field1488[5] * var1.field1488[4] + var1.field1488[8] * this.field1488[6];
      float var8 = this.field1488[6] * var1.field1488[9] + var1.field1488[1] * this.field1488[4] + var1.field1488[5] * this.field1488[5] + this.field1488[7] * var1.field1488[13];
      float var9 = this.field1488[7] * var1.field1488[14] + this.field1488[5] * var1.field1488[6] + this.field1488[4] * var1.field1488[2] + var1.field1488[10] * this.field1488[6];
      float var10 = var1.field1488[15] * this.field1488[7] + this.field1488[6] * var1.field1488[11] + this.field1488[4] * var1.field1488[3] + this.field1488[5] * var1.field1488[7];
      float var11 = var1.field1488[12] * this.field1488[11] + this.field1488[10] * var1.field1488[8] + var1.field1488[4] * this.field1488[9] + this.field1488[8] * var1.field1488[0];
      float var12 = this.field1488[11] * var1.field1488[13] + this.field1488[9] * var1.field1488[5] + var1.field1488[1] * this.field1488[8] + var1.field1488[9] * this.field1488[10];
      float var13 = var1.field1488[14] * this.field1488[11] + this.field1488[9] * var1.field1488[6] + var1.field1488[2] * this.field1488[8] + this.field1488[10] * var1.field1488[10];
      float var14 = var1.field1488[15] * this.field1488[11] + var1.field1488[11] * this.field1488[10] + var1.field1488[7] * this.field1488[9] + this.field1488[8] * var1.field1488[3];
      float var15 = this.field1488[14] * var1.field1488[8] + var1.field1488[0] * this.field1488[12] + this.field1488[13] * var1.field1488[4] + this.field1488[15] * var1.field1488[12];
      float var16 = var1.field1488[13] * this.field1488[15] + var1.field1488[5] * this.field1488[13] + this.field1488[12] * var1.field1488[1] + var1.field1488[9] * this.field1488[14];
      float var17 = this.field1488[14] * var1.field1488[10] + var1.field1488[6] * this.field1488[13] + this.field1488[12] * var1.field1488[2] + var1.field1488[14] * this.field1488[15];
      float var18 = var1.field1488[15] * this.field1488[15] + var1.field1488[3] * this.field1488[12] + this.field1488[13] * var1.field1488[7] + var1.field1488[11] * this.field1488[14];
      this.field1488[0] = var3;
      this.field1488[1] = var4;
      this.field1488[2] = var5;
      this.field1488[3] = var6;
      this.field1488[4] = var7;
      this.field1488[5] = var8;
      this.field1488[6] = var9;
      this.field1488[7] = var10;
      this.field1488[8] = var11;
      this.field1488[9] = var12;
      this.field1488[10] = var13;
      this.field1488[11] = var14;
      this.field1488[12] = var15;
      this.field1488[13] = var16;
      this.field1488[14] = var17;
      this.field1488[15] = var18;
   }

   public void method848(class4 var1) {
      float var3 = var1.field30 * var1.field30;
      float var4 = var1.field34 * var1.field30;
      float var5 = var1.field30 * var1.field33;
      float var6 = var1.field35 * var1.field30;
      float var7 = var1.field34 * var1.field34;
      float var8 = var1.field34 * var1.field33;
      float var9 = var1.field35 * var1.field34;
      float var10 = var1.field33 * var1.field33;
      float var11 = var1.field33 * var1.field35;
      float var12 = var1.field35 * var1.field35;
      this.field1488[0] = var7 + var3 - var12 - var10;
      this.field1488[1] = var8 + var6 + var8 + var6;
      this.field1488[2] = var9 - var5 - var5 + var9;
      this.field1488[4] = var8 - var6 - var6 + var8;
      this.field1488[5] = var3 + var10 - var7 - var12;
      this.field1488[6] = var4 + var11 + var4 + var11;
      this.field1488[8] = var9 + var5 + var9 + var5;
      this.field1488[9] = var11 - var4 - var4 + var11;
      this.field1488[10] = var12 + var3 - var10 - var7;
   }

   void method834(class48 var1) {
      this.field1488[0] = var1.field1038;
      this.field1488[1] = var1.field1033;
      this.field1488[2] = var1.field1034;
      this.field1488[3] = 0.0F;
      this.field1488[4] = var1.field1035;
      this.field1488[5] = var1.field1037;
      this.field1488[6] = var1.field1032;
      this.field1488[7] = 0.0F;
      this.field1488[8] = var1.field1042;
      this.field1488[9] = var1.field1039;
      this.field1488[10] = var1.field1036;
      this.field1488[11] = 0.0F;
      this.field1488[12] = var1.field1041;
      this.field1488[13] = var1.field1040;
      this.field1488[14] = var1.field1043;
      this.field1488[15] = 1.0F;
   }

   float method842() {
      return this.field1488[12] * this.field1488[9] * this.field1488[6] * this.field1488[3] + (this.field1488[8] * this.field1488[7] * this.field1488[2] * this.field1488[13] + this.field1488[8] * this.field1488[1] * this.field1488[6] * this.field1488[15] + this.field1488[14] * this.field1488[11] * this.field1488[4] * this.field1488[1] + (this.field1488[0] * this.field1488[7] * this.field1488[9] * this.field1488[14] + this.field1488[15] * this.field1488[5] * this.field1488[0] * this.field1488[10] - this.field1488[0] * this.field1488[5] * this.field1488[11] * this.field1488[14] - this.field1488[15] * this.field1488[0] * this.field1488[6] * this.field1488[9] + this.field1488[13] * this.field1488[0] * this.field1488[6] * this.field1488[11] - this.field1488[10] * this.field1488[0] * this.field1488[7] * this.field1488[13] - this.field1488[15] * this.field1488[4] * this.field1488[1] * this.field1488[10]) - this.field1488[12] * this.field1488[1] * this.field1488[6] * this.field1488[11] - this.field1488[7] * this.field1488[1] * this.field1488[8] * this.field1488[14] + this.field1488[12] * this.field1488[10] * this.field1488[7] * this.field1488[1] + this.field1488[15] * this.field1488[4] * this.field1488[2] * this.field1488[9] - this.field1488[13] * this.field1488[11] * this.field1488[4] * this.field1488[2] - this.field1488[15] * this.field1488[8] * this.field1488[2] * this.field1488[5] + this.field1488[11] * this.field1488[2] * this.field1488[5] * this.field1488[12] - this.field1488[9] * this.field1488[7] * this.field1488[2] * this.field1488[12] - this.field1488[14] * this.field1488[3] * this.field1488[4] * this.field1488[9] + this.field1488[13] * this.field1488[10] * this.field1488[4] * this.field1488[3] + this.field1488[14] * this.field1488[8] * this.field1488[5] * this.field1488[3] - this.field1488[12] * this.field1488[3] * this.field1488[5] * this.field1488[10] - this.field1488[6] * this.field1488[3] * this.field1488[8] * this.field1488[13]);
   }

   public void method849() {
      float var2 = 1.0F / this.method842();
      float var3 = (this.field1488[11] * this.field1488[6] * this.field1488[13] + (this.field1488[15] * this.field1488[5] * this.field1488[10] - this.field1488[14] * this.field1488[11] * this.field1488[5] - this.field1488[9] * this.field1488[6] * this.field1488[15]) + this.field1488[14] * this.field1488[7] * this.field1488[9] - this.field1488[7] * this.field1488[10] * this.field1488[13]) * var2;
      float var4 = (this.field1488[13] * this.field1488[3] * this.field1488[10] + (this.field1488[15] * -this.field1488[1] * this.field1488[10] + this.field1488[14] * this.field1488[11] * this.field1488[1] + this.field1488[9] * this.field1488[2] * this.field1488[15] - this.field1488[11] * this.field1488[2] * this.field1488[13] - this.field1488[14] * this.field1488[9] * this.field1488[3])) * var2;
      float var5 = (this.field1488[15] * this.field1488[6] * this.field1488[1] - this.field1488[1] * this.field1488[7] * this.field1488[14] - this.field1488[15] * this.field1488[2] * this.field1488[5] + this.field1488[2] * this.field1488[7] * this.field1488[13] + this.field1488[3] * this.field1488[5] * this.field1488[14] - this.field1488[13] * this.field1488[6] * this.field1488[3]) * var2;
      float var6 = (this.field1488[9] * this.field1488[3] * this.field1488[6] + (this.field1488[7] * this.field1488[1] * this.field1488[10] + this.field1488[11] * -this.field1488[1] * this.field1488[6] + this.field1488[11] * this.field1488[2] * this.field1488[5] - this.field1488[7] * this.field1488[2] * this.field1488[9] - this.field1488[5] * this.field1488[3] * this.field1488[10])) * var2;
      float var7 = (this.field1488[12] * this.field1488[10] * this.field1488[7] + (this.field1488[6] * this.field1488[8] * this.field1488[15] + this.field1488[15] * this.field1488[10] * -this.field1488[4] + this.field1488[4] * this.field1488[11] * this.field1488[14] - this.field1488[11] * this.field1488[6] * this.field1488[12] - this.field1488[14] * this.field1488[8] * this.field1488[7])) * var2;
      float var8 = (this.field1488[2] * this.field1488[11] * this.field1488[12] + (this.field1488[0] * this.field1488[10] * this.field1488[15] - this.field1488[14] * this.field1488[0] * this.field1488[11] - this.field1488[15] * this.field1488[2] * this.field1488[8]) + this.field1488[14] * this.field1488[8] * this.field1488[3] - this.field1488[3] * this.field1488[10] * this.field1488[12]) * var2;
      float var9 = (this.field1488[15] * this.field1488[2] * this.field1488[4] + this.field1488[15] * this.field1488[6] * -this.field1488[0] + this.field1488[0] * this.field1488[7] * this.field1488[14] - this.field1488[7] * this.field1488[2] * this.field1488[12] - this.field1488[3] * this.field1488[4] * this.field1488[14] + this.field1488[12] * this.field1488[3] * this.field1488[6]) * var2;
      float var10 = (this.field1488[10] * this.field1488[4] * this.field1488[3] + this.field1488[0] * this.field1488[6] * this.field1488[11] - this.field1488[10] * this.field1488[0] * this.field1488[7] - this.field1488[2] * this.field1488[4] * this.field1488[11] + this.field1488[7] * this.field1488[2] * this.field1488[8] - this.field1488[8] * this.field1488[6] * this.field1488[3]) * var2;
      float var11 = (this.field1488[15] * this.field1488[4] * this.field1488[9] - this.field1488[13] * this.field1488[4] * this.field1488[11] - this.field1488[15] * this.field1488[5] * this.field1488[8] + this.field1488[11] * this.field1488[5] * this.field1488[12] + this.field1488[13] * this.field1488[8] * this.field1488[7] - this.field1488[12] * this.field1488[9] * this.field1488[7]) * var2;
      float var12 = var2 * (this.field1488[15] * this.field1488[9] * -this.field1488[0] + this.field1488[13] * this.field1488[0] * this.field1488[11] + this.field1488[1] * this.field1488[8] * this.field1488[15] - this.field1488[11] * this.field1488[1] * this.field1488[12] - this.field1488[8] * this.field1488[3] * this.field1488[13] + this.field1488[9] * this.field1488[3] * this.field1488[12]);
      float var13 = (this.field1488[4] * this.field1488[3] * this.field1488[13] + this.field1488[12] * this.field1488[1] * this.field1488[7] + (this.field1488[15] * this.field1488[5] * this.field1488[0] - this.field1488[13] * this.field1488[0] * this.field1488[7] - this.field1488[1] * this.field1488[4] * this.field1488[15]) - this.field1488[12] * this.field1488[3] * this.field1488[5]) * var2;
      float var14 = var2 * (this.field1488[8] * this.field1488[3] * this.field1488[5] + (-this.field1488[0] * this.field1488[5] * this.field1488[11] + this.field1488[9] * this.field1488[7] * this.field1488[0] + this.field1488[4] * this.field1488[1] * this.field1488[11] - this.field1488[8] * this.field1488[1] * this.field1488[7] - this.field1488[3] * this.field1488[4] * this.field1488[9]));
      float var15 = (this.field1488[12] * this.field1488[6] * this.field1488[9] + (this.field1488[14] * this.field1488[9] * -this.field1488[4] + this.field1488[13] * this.field1488[10] * this.field1488[4] + this.field1488[8] * this.field1488[5] * this.field1488[14] - this.field1488[12] * this.field1488[10] * this.field1488[5] - this.field1488[8] * this.field1488[6] * this.field1488[13])) * var2;
      float var16 = (this.field1488[13] * this.field1488[8] * this.field1488[2] + this.field1488[0] * this.field1488[9] * this.field1488[14] - this.field1488[13] * this.field1488[0] * this.field1488[10] - this.field1488[1] * this.field1488[8] * this.field1488[14] + this.field1488[1] * this.field1488[10] * this.field1488[12] - this.field1488[12] * this.field1488[2] * this.field1488[9]) * var2;
      float var17 = var2 * (-this.field1488[0] * this.field1488[5] * this.field1488[14] + this.field1488[6] * this.field1488[0] * this.field1488[13] + this.field1488[14] * this.field1488[1] * this.field1488[4] - this.field1488[6] * this.field1488[1] * this.field1488[12] - this.field1488[4] * this.field1488[2] * this.field1488[13] + this.field1488[2] * this.field1488[5] * this.field1488[12]);
      float var18 = (this.field1488[5] * this.field1488[0] * this.field1488[10] - this.field1488[0] * this.field1488[6] * this.field1488[9] - this.field1488[1] * this.field1488[4] * this.field1488[10] + this.field1488[1] * this.field1488[6] * this.field1488[8] + this.field1488[2] * this.field1488[4] * this.field1488[9] - this.field1488[8] * this.field1488[2] * this.field1488[5]) * var2;
      this.field1488[0] = var3;
      this.field1488[1] = var4;
      this.field1488[2] = var5;
      this.field1488[3] = var6;
      this.field1488[4] = var7;
      this.field1488[5] = var8;
      this.field1488[6] = var9;
      this.field1488[7] = var10;
      this.field1488[8] = var11;
      this.field1488[9] = var12;
      this.field1488[10] = var13;
      this.field1488[11] = var14;
      this.field1488[12] = var15;
      this.field1488[13] = var16;
      this.field1488[14] = var17;
      this.field1488[15] = var18;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      this.method836();
      this.method835();

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.field1488[var2 * 4 + var3];
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
      var2 = var2 * 31 + Arrays.hashCode(this.field1488);
      return var2;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class120)) {
         return false;
      } else {
         class120 var2 = (class120)var1;

         for(int var3 = 0; var3 < 16; ++var3) {
            if (this.field1488[var3] != var2.field1488[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   public float[] method843() {
      float[] var2 = new float[3];
      class492 var3 = new class492(this.field1488[0], this.field1488[1], this.field1488[2]);
      class492 var4 = new class492(this.field1488[4], this.field1488[5], this.field1488[6]);
      class492 var5 = new class492(this.field1488[8], this.field1488[9], this.field1488[10]);
      var2[0] = var3.method2387();
      var2[1] = var4.method2387();
      var2[2] = var5.method2387();
      return var2;
   }

   static void method850(int var0) {
      class126.field1522 = var0;
      field1487 = new class120[var0];
      class261.field2286 = 0;
   }
}
