import java.util.Arrays;

public final class class31 {

	public static class31[] field149;

	public static final class31 field151;

	public float[] field150;

	static {
		field149 = new class31[0];
		method107(100);
		field151 = new class31();
	}

	public class31() {
		this.field150 = new float[16];
		this.method94();
	}

	public class31(class31 var1) {
		this.field150 = new float[16];
		this.method101(var1);
	}

	public class31(class187 var1, boolean var2) {
		this.field150 = new float[16];
		this.method102(var1, var2);
	}

	public void method103() {
		synchronized (field149) {
			if (class217.field1948 < class204.field1893 - 1) {
				field149[++class217.field1948 - 1] = this;
			}
		}
	}

	void method102(class187 var1, boolean var2) {
		for (int var4 = 0; var4 < 16; ++var4) {
			this.field150[var4] = var1.method1102();
		}
	}

	float[] method92() {
		float[] var2 = new float[3];
		if ((double) this.field150[2] < 0.999D && (double) this.field150[2] > -0.999D) {
			var2[1] = (float) -Math.asin((double) this.field150[2]);
			double var3 = Math.cos((double) var2[1]);
			var2[0] = (float) Math.atan2((double) this.field150[6] / var3, (double) this.field150[10] / var3);
			var2[2] = (float) Math.atan2((double) this.field150[1] / var3, (double) this.field150[0] / var3);
		} else {
			var2[0] = 0.0F;
			var2[1] = (float) Math.atan2((double) this.field150[2], 0.0D);
			var2[2] = (float) Math.atan2((double) -this.field150[9], (double) this.field150[5]);
		}
		return var2;
	}

	public float[] method93() {
		float[] var2 = new float[] { (float) -Math.asin((double) this.field150[6]), 0.0F, 0.0F };
		double var3 = Math.cos((double) var2[0]);
		double var5;
		double var7;
		if (Math.abs(var3) > 0.005D) {
			var5 = (double) this.field150[2];
			var7 = (double) this.field150[10];
			double var9 = (double) this.field150[4];
			double var11 = (double) this.field150[5];
			var2[1] = (float) Math.atan2(var5, var7);
			var2[2] = (float) Math.atan2(var9, var11);
		} else {
			var5 = (double) this.field150[1];
			var7 = (double) this.field150[0];
			if (this.field150[6] < 0.0F) {
				var2[1] = (float) Math.atan2(var5, var7);
			} else {
				var2[1] = (float) -Math.atan2(var5, var7);
			}
			var2[2] = 0.0F;
		}
		return var2;
	}

	public void method94() {
		this.field150[0] = 1.0F;
		this.field150[1] = 0.0F;
		this.field150[2] = 0.0F;
		this.field150[3] = 0.0F;
		this.field150[4] = 0.0F;
		this.field150[5] = 1.0F;
		this.field150[6] = 0.0F;
		this.field150[7] = 0.0F;
		this.field150[8] = 0.0F;
		this.field150[9] = 0.0F;
		this.field150[10] = 1.0F;
		this.field150[11] = 0.0F;
		this.field150[12] = 0.0F;
		this.field150[13] = 0.0F;
		this.field150[14] = 0.0F;
		this.field150[15] = 1.0F;
	}

	public void method95() {
		this.field150[0] = 0.0F;
		this.field150[1] = 0.0F;
		this.field150[2] = 0.0F;
		this.field150[3] = 0.0F;
		this.field150[4] = 0.0F;
		this.field150[5] = 0.0F;
		this.field150[6] = 0.0F;
		this.field150[7] = 0.0F;
		this.field150[8] = 0.0F;
		this.field150[9] = 0.0F;
		this.field150[10] = 0.0F;
		this.field150[11] = 0.0F;
		this.field150[12] = 0.0F;
		this.field150[13] = 0.0F;
		this.field150[14] = 0.0F;
		this.field150[15] = 0.0F;
	}

	public void method101(class31 var1) {
		System.arraycopy(var1.field150, 0, this.field150, 0, 16);
	}

	public void method96(float var1) {
		this.method97(var1, var1, var1);
	}

	public void method97(float var1, float var2, float var3) {
		this.method94();
		this.field150[0] = var1;
		this.field150[5] = var2;
		this.field150[10] = var3;
	}

	public void method98(class31 var1) {
		for (int var3 = 0; var3 < this.field150.length; ++var3) {
			float[] var10000 = this.field150;
			var10000[var3] += var1.field150[var3];
		}
	}

	public void method104(class31 var1) {
		float var3 = this.field150[2] * var1.field150[8] + var1.field150[0] * this.field150[0] + var1.field150[4] * this.field150[1] + var1.field150[12] * this.field150[3];
		float var4 = this.field150[0] * var1.field150[1] + var1.field150[5] * this.field150[1] + var1.field150[9] * this.field150[2] + this.field150[3] * var1.field150[13];
		float var5 = var1.field150[14] * this.field150[3] + this.field150[2] * var1.field150[10] + var1.field150[6] * this.field150[1] + var1.field150[2] * this.field150[0];
		float var6 = this.field150[0] * var1.field150[3] + var1.field150[7] * this.field150[1] + this.field150[2] * var1.field150[11] + this.field150[3] * var1.field150[15];
		float var7 = this.field150[7] * var1.field150[12] + this.field150[4] * var1.field150[0] + this.field150[5] * var1.field150[4] + var1.field150[8] * this.field150[6];
		float var8 = this.field150[6] * var1.field150[9] + var1.field150[1] * this.field150[4] + var1.field150[5] * this.field150[5] + this.field150[7] * var1.field150[13];
		float var9 = this.field150[7] * var1.field150[14] + this.field150[5] * var1.field150[6] + this.field150[4] * var1.field150[2] + var1.field150[10] * this.field150[6];
		float var10 = var1.field150[15] * this.field150[7] + this.field150[6] * var1.field150[11] + this.field150[4] * var1.field150[3] + this.field150[5] * var1.field150[7];
		float var11 = var1.field150[12] * this.field150[11] + this.field150[10] * var1.field150[8] + var1.field150[4] * this.field150[9] + this.field150[8] * var1.field150[0];
		float var12 = this.field150[11] * var1.field150[13] + this.field150[9] * var1.field150[5] + var1.field150[1] * this.field150[8] + var1.field150[9] * this.field150[10];
		float var13 = var1.field150[14] * this.field150[11] + this.field150[9] * var1.field150[6] + var1.field150[2] * this.field150[8] + this.field150[10] * var1.field150[10];
		float var14 = var1.field150[15] * this.field150[11] + var1.field150[11] * this.field150[10] + var1.field150[7] * this.field150[9] + this.field150[8] * var1.field150[3];
		float var15 = this.field150[14] * var1.field150[8] + var1.field150[0] * this.field150[12] + this.field150[13] * var1.field150[4] + this.field150[15] * var1.field150[12];
		float var16 = var1.field150[13] * this.field150[15] + var1.field150[5] * this.field150[13] + this.field150[12] * var1.field150[1] + var1.field150[9] * this.field150[14];
		float var17 = this.field150[14] * var1.field150[10] + var1.field150[6] * this.field150[13] + this.field150[12] * var1.field150[2] + var1.field150[14] * this.field150[15];
		float var18 = var1.field150[15] * this.field150[15] + var1.field150[3] * this.field150[12] + this.field150[13] * var1.field150[7] + var1.field150[11] * this.field150[14];
		this.field150[0] = var3;
		this.field150[1] = var4;
		this.field150[2] = var5;
		this.field150[3] = var6;
		this.field150[4] = var7;
		this.field150[5] = var8;
		this.field150[6] = var9;
		this.field150[7] = var10;
		this.field150[8] = var11;
		this.field150[9] = var12;
		this.field150[10] = var13;
		this.field150[11] = var14;
		this.field150[12] = var15;
		this.field150[13] = var16;
		this.field150[14] = var17;
		this.field150[15] = var18;
	}

	public void method105(class83 var1) {
		float var3 = var1.field835 * var1.field835;
		float var4 = var1.field839 * var1.field835;
		float var5 = var1.field835 * var1.field838;
		float var6 = var1.field840 * var1.field835;
		float var7 = var1.field839 * var1.field839;
		float var8 = var1.field839 * var1.field838;
		float var9 = var1.field840 * var1.field839;
		float var10 = var1.field838 * var1.field838;
		float var11 = var1.field838 * var1.field840;
		float var12 = var1.field840 * var1.field840;
		this.field150[0] = var7 + var3 - var12 - var10;
		this.field150[1] = var8 + var6 + var8 + var6;
		this.field150[2] = var9 - var5 - var5 + var9;
		this.field150[4] = var8 - var6 - var6 + var8;
		this.field150[5] = var3 + var10 - var7 - var12;
		this.field150[6] = var4 + var11 + var4 + var11;
		this.field150[8] = var9 + var5 + var9 + var5;
		this.field150[9] = var11 - var4 - var4 + var11;
		this.field150[10] = var12 + var3 - var10 - var7;
	}

	void method91(class243 var1) {
		this.field150[0] = var1.field2058;
		this.field150[1] = var1.field2053;
		this.field150[2] = var1.field2054;
		this.field150[3] = 0.0F;
		this.field150[4] = var1.field2055;
		this.field150[5] = var1.field2057;
		this.field150[6] = var1.field2052;
		this.field150[7] = 0.0F;
		this.field150[8] = var1.field2062;
		this.field150[9] = var1.field2059;
		this.field150[10] = var1.field2056;
		this.field150[11] = 0.0F;
		this.field150[12] = var1.field2061;
		this.field150[13] = var1.field2060;
		this.field150[14] = var1.field2063;
		this.field150[15] = 1.0F;
	}

	float method99() {
		return this.field150[12] * this.field150[9] * this.field150[6] * this.field150[3] + (this.field150[8] * this.field150[7] * this.field150[2] * this.field150[13] + this.field150[8] * this.field150[1] * this.field150[6] * this.field150[15] + this.field150[14] * this.field150[11] * this.field150[4] * this.field150[1] + (this.field150[0] * this.field150[7] * this.field150[9] * this.field150[14] + this.field150[15] * this.field150[5] * this.field150[0] * this.field150[10] - this.field150[0] * this.field150[5] * this.field150[11] * this.field150[14] - this.field150[15] * this.field150[0] * this.field150[6] * this.field150[9] + this.field150[13] * this.field150[0] * this.field150[6] * this.field150[11] - this.field150[10] * this.field150[0] * this.field150[7] * this.field150[13] - this.field150[15] * this.field150[4] * this.field150[1] * this.field150[10]) - this.field150[12] * this.field150[1] * this.field150[6] * this.field150[11] - this.field150[7] * this.field150[1] * this.field150[8] * this.field150[14] + this.field150[12] * this.field150[10] * this.field150[7] * this.field150[1] + this.field150[15] * this.field150[4] * this.field150[2] * this.field150[9] - this.field150[13] * this.field150[11] * this.field150[4] * this.field150[2] - this.field150[15] * this.field150[8] * this.field150[2] * this.field150[5] + this.field150[11] * this.field150[2] * this.field150[5] * this.field150[12] - this.field150[9] * this.field150[7] * this.field150[2] * this.field150[12] - this.field150[14] * this.field150[3] * this.field150[4] * this.field150[9] + this.field150[13] * this.field150[10] * this.field150[4] * this.field150[3] + this.field150[14] * this.field150[8] * this.field150[5] * this.field150[3] - this.field150[12] * this.field150[3] * this.field150[5] * this.field150[10] - this.field150[6] * this.field150[3] * this.field150[8] * this.field150[13]);
	}

	public void method106() {
		float var2 = 1.0F / this.method99();
		float var3 = (this.field150[11] * this.field150[6] * this.field150[13] + (this.field150[15] * this.field150[5] * this.field150[10] - this.field150[14] * this.field150[11] * this.field150[5] - this.field150[9] * this.field150[6] * this.field150[15]) + this.field150[14] * this.field150[7] * this.field150[9] - this.field150[7] * this.field150[10] * this.field150[13]) * var2;
		float var4 = (this.field150[13] * this.field150[3] * this.field150[10] + (this.field150[15] * -this.field150[1] * this.field150[10] + this.field150[14] * this.field150[11] * this.field150[1] + this.field150[9] * this.field150[2] * this.field150[15] - this.field150[11] * this.field150[2] * this.field150[13] - this.field150[14] * this.field150[9] * this.field150[3])) * var2;
		float var5 = (this.field150[15] * this.field150[6] * this.field150[1] - this.field150[1] * this.field150[7] * this.field150[14] - this.field150[15] * this.field150[2] * this.field150[5] + this.field150[2] * this.field150[7] * this.field150[13] + this.field150[3] * this.field150[5] * this.field150[14] - this.field150[13] * this.field150[6] * this.field150[3]) * var2;
		float var6 = (this.field150[9] * this.field150[3] * this.field150[6] + (this.field150[7] * this.field150[1] * this.field150[10] + this.field150[11] * -this.field150[1] * this.field150[6] + this.field150[11] * this.field150[2] * this.field150[5] - this.field150[7] * this.field150[2] * this.field150[9] - this.field150[5] * this.field150[3] * this.field150[10])) * var2;
		float var7 = (this.field150[12] * this.field150[10] * this.field150[7] + (this.field150[6] * this.field150[8] * this.field150[15] + this.field150[15] * this.field150[10] * -this.field150[4] + this.field150[4] * this.field150[11] * this.field150[14] - this.field150[11] * this.field150[6] * this.field150[12] - this.field150[14] * this.field150[8] * this.field150[7])) * var2;
		float var8 = (this.field150[2] * this.field150[11] * this.field150[12] + (this.field150[0] * this.field150[10] * this.field150[15] - this.field150[14] * this.field150[0] * this.field150[11] - this.field150[15] * this.field150[2] * this.field150[8]) + this.field150[14] * this.field150[8] * this.field150[3] - this.field150[3] * this.field150[10] * this.field150[12]) * var2;
		float var9 = (this.field150[15] * this.field150[2] * this.field150[4] + this.field150[15] * this.field150[6] * -this.field150[0] + this.field150[0] * this.field150[7] * this.field150[14] - this.field150[7] * this.field150[2] * this.field150[12] - this.field150[3] * this.field150[4] * this.field150[14] + this.field150[12] * this.field150[3] * this.field150[6]) * var2;
		float var10 = (this.field150[10] * this.field150[4] * this.field150[3] + this.field150[0] * this.field150[6] * this.field150[11] - this.field150[10] * this.field150[0] * this.field150[7] - this.field150[2] * this.field150[4] * this.field150[11] + this.field150[7] * this.field150[2] * this.field150[8] - this.field150[8] * this.field150[6] * this.field150[3]) * var2;
		float var11 = (this.field150[15] * this.field150[4] * this.field150[9] - this.field150[13] * this.field150[4] * this.field150[11] - this.field150[15] * this.field150[5] * this.field150[8] + this.field150[11] * this.field150[5] * this.field150[12] + this.field150[13] * this.field150[8] * this.field150[7] - this.field150[12] * this.field150[9] * this.field150[7]) * var2;
		float var12 = var2 * (this.field150[15] * this.field150[9] * -this.field150[0] + this.field150[13] * this.field150[0] * this.field150[11] + this.field150[1] * this.field150[8] * this.field150[15] - this.field150[11] * this.field150[1] * this.field150[12] - this.field150[8] * this.field150[3] * this.field150[13] + this.field150[9] * this.field150[3] * this.field150[12]);
		float var13 = (this.field150[4] * this.field150[3] * this.field150[13] + this.field150[12] * this.field150[1] * this.field150[7] + (this.field150[15] * this.field150[5] * this.field150[0] - this.field150[13] * this.field150[0] * this.field150[7] - this.field150[1] * this.field150[4] * this.field150[15]) - this.field150[12] * this.field150[3] * this.field150[5]) * var2;
		float var14 = var2 * (this.field150[8] * this.field150[3] * this.field150[5] + (-this.field150[0] * this.field150[5] * this.field150[11] + this.field150[9] * this.field150[7] * this.field150[0] + this.field150[4] * this.field150[1] * this.field150[11] - this.field150[8] * this.field150[1] * this.field150[7] - this.field150[3] * this.field150[4] * this.field150[9]));
		float var15 = (this.field150[12] * this.field150[6] * this.field150[9] + (this.field150[14] * this.field150[9] * -this.field150[4] + this.field150[13] * this.field150[10] * this.field150[4] + this.field150[8] * this.field150[5] * this.field150[14] - this.field150[12] * this.field150[10] * this.field150[5] - this.field150[8] * this.field150[6] * this.field150[13])) * var2;
		float var16 = (this.field150[13] * this.field150[8] * this.field150[2] + this.field150[0] * this.field150[9] * this.field150[14] - this.field150[13] * this.field150[0] * this.field150[10] - this.field150[1] * this.field150[8] * this.field150[14] + this.field150[1] * this.field150[10] * this.field150[12] - this.field150[12] * this.field150[2] * this.field150[9]) * var2;
		float var17 = var2 * (-this.field150[0] * this.field150[5] * this.field150[14] + this.field150[6] * this.field150[0] * this.field150[13] + this.field150[14] * this.field150[1] * this.field150[4] - this.field150[6] * this.field150[1] * this.field150[12] - this.field150[4] * this.field150[2] * this.field150[13] + this.field150[2] * this.field150[5] * this.field150[12]);
		float var18 = (this.field150[5] * this.field150[0] * this.field150[10] - this.field150[0] * this.field150[6] * this.field150[9] - this.field150[1] * this.field150[4] * this.field150[10] + this.field150[1] * this.field150[6] * this.field150[8] + this.field150[2] * this.field150[4] * this.field150[9] - this.field150[8] * this.field150[2] * this.field150[5]) * var2;
		this.field150[0] = var3;
		this.field150[1] = var4;
		this.field150[2] = var5;
		this.field150[3] = var6;
		this.field150[4] = var7;
		this.field150[5] = var8;
		this.field150[6] = var9;
		this.field150[7] = var10;
		this.field150[8] = var11;
		this.field150[9] = var12;
		this.field150[10] = var13;
		this.field150[11] = var14;
		this.field150[12] = var15;
		this.field150[13] = var16;
		this.field150[14] = var17;
		this.field150[15] = var18;
	}

	@Override
	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method93();
		this.method92();
		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}
				float var4 = this.field150[var2 * 4 + var3];
				if (Math.sqrt((double) (var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}
				var1.append(var4);
			}
			var1.append("\n");
		}
		return var1.toString();
	}

	@Override
	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + Arrays.hashCode(this.field150);
		return var3;
	}

	@Override
	public boolean equals(Object var1) {
		if (!(var1 instanceof class31)) {
			return false;
		} else {
			class31 var2 = (class31) var1;
			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field150[var3] != var2.field150[var3]) {
					return false;
				}
			}
			return true;
		}
	}

	public float[] method100() {
		float[] var2 = new float[3];
		class405 var3 = new class405(this.field150[0], this.field150[1], this.field150[2]);
		class405 var4 = new class405(this.field150[4], this.field150[5], this.field150[6]);
		class405 var5 = new class405(this.field150[8], this.field150[9], this.field150[10]);
		var2[0] = var3.method2065();
		var2[1] = var4.method2065();
		var2[2] = var5.method2065();
		return var2;
	}

	static void method107(int var0) {
		class204.field1893 = 100;
		field149 = new class31[100];
		class217.field1948 = 0;
	}
}
