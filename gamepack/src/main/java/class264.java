import java.util.Arrays;

public final class class264 {
	public static class264[] field2387;
	public static final class264 field2389;
	public float[] field2388;

	static {
		field2387 = new class264[0];
		class106.method681(100);
		field2389 = new class264();
	}

	public class264() {
		this.field2388 = new float[16];
		this.method1523();
	}

	public class264(class264 var1) {
		this.field2388 = new float[16];
		this.method1530(var1);
	}

	public class264(class42 var1, boolean var2) {
		this.field2388 = new float[16];
		this.method1531(var1, var2);
	}

	public void method1532() {
		synchronized(field2387) {
			if (class514.field4192 < class35.field497 - 1) {
				field2387[++class514.field4192 - 1] = this;
			}

		}
	}

	void method1531(class42 var1, boolean var2) {
		if (var2) {
			class265 var4 = new class265();
			int var7 = var1.method280();
			var7 &= 16383;
			float var6 = (float)(6.283185307179586D * (double)((float)var7 / 16384.0F));
			var4.method1537(var6);
			int var10 = var1.method280();
			var10 &= 16383;
			float var9 = (float)((double)((float)var10 / 16384.0F) * 6.283185307179586D);
			var4.method1540(var9);
			int var13 = var1.method280();
			var13 &= 16383;
			float var12 = (float)((double)((float)var13 / 16384.0F) * 6.283185307179586D);
			var4.method1538(var12);
			var4.method1539((float)var1.method280(), (float)var1.method280(), (float)var1.method280());
			this.method1520(var4);
		} else {
			for (int var14 = 0; var14 < 16; ++var14) {
				this.field2388[var14] = var1.method284();
			}
		}

	}

	float[] method1521() {
		float[] var2 = new float[3];
		if ((double)this.field2388[2] < 0.999D && (double)this.field2388[2] > -0.999D) {
			var2[1] = (float)(-Math.asin((double)this.field2388[2]));
			double var3 = Math.cos((double)var2[1]);
			var2[0] = (float)Math.atan2((double)this.field2388[6] / var3, (double)this.field2388[10] / var3);
			var2[2] = (float)Math.atan2((double)this.field2388[1] / var3, (double)this.field2388[0] / var3);
		} else {
			var2[0] = 0.0F;
			var2[1] = (float)Math.atan2((double)this.field2388[2], 0.0D);
			var2[2] = (float)Math.atan2((double)(-this.field2388[9]), (double)this.field2388[5]);
		}

		return var2;
	}

	public float[] method1522() {
		float[] var2 = new float[]{(float)(-Math.asin((double)this.field2388[6])), 0.0F, 0.0F};
		double var3 = Math.cos((double)var2[0]);
		double var5;
		double var7;
		if (Math.abs(var3) > 0.005D) {
			var5 = (double)this.field2388[2];
			var7 = (double)this.field2388[10];
			double var9 = (double)this.field2388[4];
			double var11 = (double)this.field2388[5];
			var2[1] = (float)Math.atan2(var5, var7);
			var2[2] = (float)Math.atan2(var9, var11);
		} else {
			var5 = (double)this.field2388[1];
			var7 = (double)this.field2388[0];
			if (this.field2388[6] < 0.0F) {
				var2[1] = (float)Math.atan2(var5, var7);
			} else {
				var2[1] = (float)(-Math.atan2(var5, var7));
			}

			var2[2] = 0.0F;
		}

		return var2;
	}

	public void method1523() {
		this.field2388[0] = 1.0F;
		this.field2388[1] = 0.0F;
		this.field2388[2] = 0.0F;
		this.field2388[3] = 0.0F;
		this.field2388[4] = 0.0F;
		this.field2388[5] = 1.0F;
		this.field2388[6] = 0.0F;
		this.field2388[7] = 0.0F;
		this.field2388[8] = 0.0F;
		this.field2388[9] = 0.0F;
		this.field2388[10] = 1.0F;
		this.field2388[11] = 0.0F;
		this.field2388[12] = 0.0F;
		this.field2388[13] = 0.0F;
		this.field2388[14] = 0.0F;
		this.field2388[15] = 1.0F;
	}

	public void method1524() {
		this.field2388[0] = 0.0F;
		this.field2388[1] = 0.0F;
		this.field2388[2] = 0.0F;
		this.field2388[3] = 0.0F;
		this.field2388[4] = 0.0F;
		this.field2388[5] = 0.0F;
		this.field2388[6] = 0.0F;
		this.field2388[7] = 0.0F;
		this.field2388[8] = 0.0F;
		this.field2388[9] = 0.0F;
		this.field2388[10] = 0.0F;
		this.field2388[11] = 0.0F;
		this.field2388[12] = 0.0F;
		this.field2388[13] = 0.0F;
		this.field2388[14] = 0.0F;
		this.field2388[15] = 0.0F;
	}

	public void method1530(class264 var1) {
		System.arraycopy(var1.field2388, 0, this.field2388, 0, 16);
	}

	public void method1525(float var1) {
		this.method1526(var1, var1, var1);
	}

	public void method1526(float var1, float var2, float var3) {
		this.method1523();
		this.field2388[0] = var1;
		this.field2388[5] = var2;
		this.field2388[10] = var3;
	}

	public void method1527(class264 var1) {
		for (int var3 = 0; var3 < this.field2388.length; ++var3) {
			float[] var10000 = this.field2388;
			var10000[var3] += var1.field2388[var3];
		}

	}

	public void method1533(class264 var1) {
		float var3 = this.field2388[2] * var1.field2388[8] + var1.field2388[0] * this.field2388[0] + var1.field2388[4] * this.field2388[1] + var1.field2388[12] * this.field2388[3];
		float var4 = this.field2388[0] * var1.field2388[1] + var1.field2388[5] * this.field2388[1] + var1.field2388[9] * this.field2388[2] + this.field2388[3] * var1.field2388[13];
		float var5 = var1.field2388[14] * this.field2388[3] + this.field2388[2] * var1.field2388[10] + var1.field2388[6] * this.field2388[1] + var1.field2388[2] * this.field2388[0];
		float var6 = this.field2388[0] * var1.field2388[3] + var1.field2388[7] * this.field2388[1] + this.field2388[2] * var1.field2388[11] + this.field2388[3] * var1.field2388[15];
		float var7 = this.field2388[7] * var1.field2388[12] + this.field2388[4] * var1.field2388[0] + this.field2388[5] * var1.field2388[4] + var1.field2388[8] * this.field2388[6];
		float var8 = this.field2388[6] * var1.field2388[9] + var1.field2388[1] * this.field2388[4] + var1.field2388[5] * this.field2388[5] + this.field2388[7] * var1.field2388[13];
		float var9 = this.field2388[7] * var1.field2388[14] + this.field2388[5] * var1.field2388[6] + this.field2388[4] * var1.field2388[2] + var1.field2388[10] * this.field2388[6];
		float var10 = var1.field2388[15] * this.field2388[7] + this.field2388[6] * var1.field2388[11] + this.field2388[4] * var1.field2388[3] + this.field2388[5] * var1.field2388[7];
		float var11 = var1.field2388[12] * this.field2388[11] + this.field2388[10] * var1.field2388[8] + var1.field2388[4] * this.field2388[9] + this.field2388[8] * var1.field2388[0];
		float var12 = this.field2388[11] * var1.field2388[13] + this.field2388[9] * var1.field2388[5] + var1.field2388[1] * this.field2388[8] + var1.field2388[9] * this.field2388[10];
		float var13 = var1.field2388[14] * this.field2388[11] + this.field2388[9] * var1.field2388[6] + var1.field2388[2] * this.field2388[8] + this.field2388[10] * var1.field2388[10];
		float var14 = var1.field2388[15] * this.field2388[11] + var1.field2388[11] * this.field2388[10] + var1.field2388[7] * this.field2388[9] + this.field2388[8] * var1.field2388[3];
		float var15 = this.field2388[14] * var1.field2388[8] + var1.field2388[0] * this.field2388[12] + this.field2388[13] * var1.field2388[4] + this.field2388[15] * var1.field2388[12];
		float var16 = var1.field2388[13] * this.field2388[15] + var1.field2388[5] * this.field2388[13] + this.field2388[12] * var1.field2388[1] + var1.field2388[9] * this.field2388[14];
		float var17 = this.field2388[14] * var1.field2388[10] + var1.field2388[6] * this.field2388[13] + this.field2388[12] * var1.field2388[2] + var1.field2388[14] * this.field2388[15];
		float var18 = var1.field2388[15] * this.field2388[15] + var1.field2388[3] * this.field2388[12] + this.field2388[13] * var1.field2388[7] + var1.field2388[11] * this.field2388[14];
		this.field2388[0] = var3;
		this.field2388[1] = var4;
		this.field2388[2] = var5;
		this.field2388[3] = var6;
		this.field2388[4] = var7;
		this.field2388[5] = var8;
		this.field2388[6] = var9;
		this.field2388[7] = var10;
		this.field2388[8] = var11;
		this.field2388[9] = var12;
		this.field2388[10] = var13;
		this.field2388[11] = var14;
		this.field2388[12] = var15;
		this.field2388[13] = var16;
		this.field2388[14] = var17;
		this.field2388[15] = var18;
	}

	public void method1534(class176 var1) {
		float var3 = var1.field1695 * var1.field1695;
		float var4 = var1.field1699 * var1.field1695;
		float var5 = var1.field1695 * var1.field1698;
		float var6 = var1.field1700 * var1.field1695;
		float var7 = var1.field1699 * var1.field1699;
		float var8 = var1.field1699 * var1.field1698;
		float var9 = var1.field1700 * var1.field1699;
		float var10 = var1.field1698 * var1.field1698;
		float var11 = var1.field1698 * var1.field1700;
		float var12 = var1.field1700 * var1.field1700;
		this.field2388[0] = var7 + var3 - var12 - var10;
		this.field2388[1] = var8 + var6 + var8 + var6;
		this.field2388[2] = var9 - var5 - var5 + var9;
		this.field2388[4] = var8 - var6 - var6 + var8;
		this.field2388[5] = var3 + var10 - var7 - var12;
		this.field2388[6] = var4 + var11 + var4 + var11;
		this.field2388[8] = var9 + var5 + var9 + var5;
		this.field2388[9] = var11 - var4 - var4 + var11;
		this.field2388[10] = var12 + var3 - var10 - var7;
	}

	void method1520(class265 var1) {
		this.field2388[0] = var1.field2396;
		this.field2388[1] = var1.field2391;
		this.field2388[2] = var1.field2392;
		this.field2388[3] = 0.0F;
		this.field2388[4] = var1.field2393;
		this.field2388[5] = var1.field2395;
		this.field2388[6] = var1.field2390;
		this.field2388[7] = 0.0F;
		this.field2388[8] = var1.field2400;
		this.field2388[9] = var1.field2397;
		this.field2388[10] = var1.field2394;
		this.field2388[11] = 0.0F;
		this.field2388[12] = var1.field2399;
		this.field2388[13] = var1.field2398;
		this.field2388[14] = var1.field2401;
		this.field2388[15] = 1.0F;
	}

	float method1528() {
		return this.field2388[12] * this.field2388[9] * this.field2388[6] * this.field2388[3] + (this.field2388[8] * this.field2388[7] * this.field2388[2] * this.field2388[13] + this.field2388[8] * this.field2388[1] * this.field2388[6] * this.field2388[15] + this.field2388[14] * this.field2388[11] * this.field2388[4] * this.field2388[1] + (this.field2388[0] * this.field2388[7] * this.field2388[9] * this.field2388[14] + this.field2388[15] * this.field2388[5] * this.field2388[0] * this.field2388[10] - this.field2388[0] * this.field2388[5] * this.field2388[11] * this.field2388[14] - this.field2388[15] * this.field2388[0] * this.field2388[6] * this.field2388[9] + this.field2388[13] * this.field2388[0] * this.field2388[6] * this.field2388[11] - this.field2388[10] * this.field2388[0] * this.field2388[7] * this.field2388[13] - this.field2388[15] * this.field2388[4] * this.field2388[1] * this.field2388[10]) - this.field2388[12] * this.field2388[1] * this.field2388[6] * this.field2388[11] - this.field2388[7] * this.field2388[1] * this.field2388[8] * this.field2388[14] + this.field2388[12] * this.field2388[10] * this.field2388[7] * this.field2388[1] + this.field2388[15] * this.field2388[4] * this.field2388[2] * this.field2388[9] - this.field2388[13] * this.field2388[11] * this.field2388[4] * this.field2388[2] - this.field2388[15] * this.field2388[8] * this.field2388[2] * this.field2388[5] + this.field2388[11] * this.field2388[2] * this.field2388[5] * this.field2388[12] - this.field2388[9] * this.field2388[7] * this.field2388[2] * this.field2388[12] - this.field2388[14] * this.field2388[3] * this.field2388[4] * this.field2388[9] + this.field2388[13] * this.field2388[10] * this.field2388[4] * this.field2388[3] + this.field2388[14] * this.field2388[8] * this.field2388[5] * this.field2388[3] - this.field2388[12] * this.field2388[3] * this.field2388[5] * this.field2388[10] - this.field2388[6] * this.field2388[3] * this.field2388[8] * this.field2388[13]);
	}

	public void method1535() {
		float var2 = 1.0F / this.method1528();
		float var3 = (this.field2388[11] * this.field2388[6] * this.field2388[13] + (this.field2388[15] * this.field2388[5] * this.field2388[10] - this.field2388[14] * this.field2388[11] * this.field2388[5] - this.field2388[9] * this.field2388[6] * this.field2388[15]) + this.field2388[14] * this.field2388[7] * this.field2388[9] - this.field2388[7] * this.field2388[10] * this.field2388[13]) * var2;
		float var4 = (this.field2388[13] * this.field2388[3] * this.field2388[10] + (this.field2388[15] * -this.field2388[1] * this.field2388[10] + this.field2388[14] * this.field2388[11] * this.field2388[1] + this.field2388[9] * this.field2388[2] * this.field2388[15] - this.field2388[11] * this.field2388[2] * this.field2388[13] - this.field2388[14] * this.field2388[9] * this.field2388[3])) * var2;
		float var5 = (this.field2388[15] * this.field2388[6] * this.field2388[1] - this.field2388[1] * this.field2388[7] * this.field2388[14] - this.field2388[15] * this.field2388[2] * this.field2388[5] + this.field2388[2] * this.field2388[7] * this.field2388[13] + this.field2388[3] * this.field2388[5] * this.field2388[14] - this.field2388[13] * this.field2388[6] * this.field2388[3]) * var2;
		float var6 = (this.field2388[9] * this.field2388[3] * this.field2388[6] + (this.field2388[7] * this.field2388[1] * this.field2388[10] + this.field2388[11] * -this.field2388[1] * this.field2388[6] + this.field2388[11] * this.field2388[2] * this.field2388[5] - this.field2388[7] * this.field2388[2] * this.field2388[9] - this.field2388[5] * this.field2388[3] * this.field2388[10])) * var2;
		float var7 = (this.field2388[12] * this.field2388[10] * this.field2388[7] + (this.field2388[6] * this.field2388[8] * this.field2388[15] + this.field2388[15] * this.field2388[10] * -this.field2388[4] + this.field2388[4] * this.field2388[11] * this.field2388[14] - this.field2388[11] * this.field2388[6] * this.field2388[12] - this.field2388[14] * this.field2388[8] * this.field2388[7])) * var2;
		float var8 = (this.field2388[2] * this.field2388[11] * this.field2388[12] + (this.field2388[0] * this.field2388[10] * this.field2388[15] - this.field2388[14] * this.field2388[0] * this.field2388[11] - this.field2388[15] * this.field2388[2] * this.field2388[8]) + this.field2388[14] * this.field2388[8] * this.field2388[3] - this.field2388[3] * this.field2388[10] * this.field2388[12]) * var2;
		float var9 = (this.field2388[15] * this.field2388[2] * this.field2388[4] + this.field2388[15] * this.field2388[6] * -this.field2388[0] + this.field2388[0] * this.field2388[7] * this.field2388[14] - this.field2388[7] * this.field2388[2] * this.field2388[12] - this.field2388[3] * this.field2388[4] * this.field2388[14] + this.field2388[12] * this.field2388[3] * this.field2388[6]) * var2;
		float var10 = (this.field2388[10] * this.field2388[4] * this.field2388[3] + this.field2388[0] * this.field2388[6] * this.field2388[11] - this.field2388[10] * this.field2388[0] * this.field2388[7] - this.field2388[2] * this.field2388[4] * this.field2388[11] + this.field2388[7] * this.field2388[2] * this.field2388[8] - this.field2388[8] * this.field2388[6] * this.field2388[3]) * var2;
		float var11 = (this.field2388[15] * this.field2388[4] * this.field2388[9] - this.field2388[13] * this.field2388[4] * this.field2388[11] - this.field2388[15] * this.field2388[5] * this.field2388[8] + this.field2388[11] * this.field2388[5] * this.field2388[12] + this.field2388[13] * this.field2388[8] * this.field2388[7] - this.field2388[12] * this.field2388[9] * this.field2388[7]) * var2;
		float var12 = var2 * (this.field2388[15] * this.field2388[9] * -this.field2388[0] + this.field2388[13] * this.field2388[0] * this.field2388[11] + this.field2388[1] * this.field2388[8] * this.field2388[15] - this.field2388[11] * this.field2388[1] * this.field2388[12] - this.field2388[8] * this.field2388[3] * this.field2388[13] + this.field2388[9] * this.field2388[3] * this.field2388[12]);
		float var13 = (this.field2388[4] * this.field2388[3] * this.field2388[13] + this.field2388[12] * this.field2388[1] * this.field2388[7] + (this.field2388[15] * this.field2388[5] * this.field2388[0] - this.field2388[13] * this.field2388[0] * this.field2388[7] - this.field2388[1] * this.field2388[4] * this.field2388[15]) - this.field2388[12] * this.field2388[3] * this.field2388[5]) * var2;
		float var14 = var2 * (this.field2388[8] * this.field2388[3] * this.field2388[5] + (-this.field2388[0] * this.field2388[5] * this.field2388[11] + this.field2388[9] * this.field2388[7] * this.field2388[0] + this.field2388[4] * this.field2388[1] * this.field2388[11] - this.field2388[8] * this.field2388[1] * this.field2388[7] - this.field2388[3] * this.field2388[4] * this.field2388[9]));
		float var15 = (this.field2388[12] * this.field2388[6] * this.field2388[9] + (this.field2388[14] * this.field2388[9] * -this.field2388[4] + this.field2388[13] * this.field2388[10] * this.field2388[4] + this.field2388[8] * this.field2388[5] * this.field2388[14] - this.field2388[12] * this.field2388[10] * this.field2388[5] - this.field2388[8] * this.field2388[6] * this.field2388[13])) * var2;
		float var16 = (this.field2388[13] * this.field2388[8] * this.field2388[2] + this.field2388[0] * this.field2388[9] * this.field2388[14] - this.field2388[13] * this.field2388[0] * this.field2388[10] - this.field2388[1] * this.field2388[8] * this.field2388[14] + this.field2388[1] * this.field2388[10] * this.field2388[12] - this.field2388[12] * this.field2388[2] * this.field2388[9]) * var2;
		float var17 = var2 * (-this.field2388[0] * this.field2388[5] * this.field2388[14] + this.field2388[6] * this.field2388[0] * this.field2388[13] + this.field2388[14] * this.field2388[1] * this.field2388[4] - this.field2388[6] * this.field2388[1] * this.field2388[12] - this.field2388[4] * this.field2388[2] * this.field2388[13] + this.field2388[2] * this.field2388[5] * this.field2388[12]);
		float var18 = (this.field2388[5] * this.field2388[0] * this.field2388[10] - this.field2388[0] * this.field2388[6] * this.field2388[9] - this.field2388[1] * this.field2388[4] * this.field2388[10] + this.field2388[1] * this.field2388[6] * this.field2388[8] + this.field2388[2] * this.field2388[4] * this.field2388[9] - this.field2388[8] * this.field2388[2] * this.field2388[5]) * var2;
		this.field2388[0] = var3;
		this.field2388[1] = var4;
		this.field2388[2] = var5;
		this.field2388[3] = var6;
		this.field2388[4] = var7;
		this.field2388[5] = var8;
		this.field2388[6] = var9;
		this.field2388[7] = var10;
		this.field2388[8] = var11;
		this.field2388[9] = var12;
		this.field2388[10] = var13;
		this.field2388[11] = var14;
		this.field2388[12] = var15;
		this.field2388[13] = var16;
		this.field2388[14] = var17;
		this.field2388[15] = var18;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method1522();
		this.method1521();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field2388[var2 * 4 + var3];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
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
		byte var2 = 1;
		int var3 = var2 * 31 + Arrays.hashCode(this.field2388);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class264)) {
			return false;
		} else {
			class264 var2 = (class264)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field2388[var3] != var2.field2388[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	public float[] method1529() {
		float[] var2 = new float[3];
		class310 var3 = new class310(this.field2388[0], this.field2388[1], this.field2388[2]);
		class310 var4 = new class310(this.field2388[4], this.field2388[5], this.field2388[6]);
		class310 var5 = new class310(this.field2388[8], this.field2388[9], this.field2388[10]);
		var2[0] = var3.method1744();
		var2[1] = var4.method1744();
		var2[2] = var5.method1744();
		return var2;
	}
}
