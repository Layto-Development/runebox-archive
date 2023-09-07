public class class243 {

	static class214[] field2064;

	float field2052;

	float field2053;

	float field2054;

	float field2055;

	float field2056;

	float field2057;

	float field2058;

	float field2059;

	float field2060;

	float field2061;

	float field2062;

	float field2063;

	static {
		new class243();
	}

	class243() {
		this.method1424();
	}

	void method1424() {
		this.field2063 = 0.0F;
		this.field2060 = 0.0F;
		this.field2061 = 0.0F;
		this.field2059 = 0.0F;
		this.field2062 = 0.0F;
		this.field2052 = 0.0F;
		this.field2055 = 0.0F;
		this.field2054 = 0.0F;
		this.field2053 = 0.0F;
		this.field2056 = 1.0F;
		this.field2057 = 1.0F;
		this.field2058 = 1.0F;
	}

	void method1425(float var1) {
		float var3 = (float) Math.cos((double) var1);
		float var4 = (float) Math.sin((double) var1);
		float var5 = this.field2053;
		float var6 = this.field2057;
		float var7 = this.field2059;
		float var8 = this.field2060;
		this.field2053 = var5 * var3 - var4 * this.field2054;
		this.field2054 = var3 * this.field2054 + var5 * var4;
		this.field2057 = var6 * var3 - this.field2052 * var4;
		this.field2052 = var6 * var4 + this.field2052 * var3;
		this.field2059 = var3 * var7 - var4 * this.field2056;
		this.field2056 = var7 * var4 + this.field2056 * var3;
		this.field2060 = var3 * var8 - var4 * this.field2063;
		this.field2063 = var8 * var4 + this.field2063 * var3;
	}

	void method1428(float var1) {
		float var3 = (float) Math.cos((double) var1);
		float var4 = (float) Math.sin((double) var1);
		float var5 = this.field2058;
		float var6 = this.field2055;
		float var7 = this.field2062;
		float var8 = this.field2061;
		this.field2058 = var4 * this.field2054 + var3 * var5;
		this.field2054 = this.field2054 * var3 - var5 * var4;
		this.field2055 = var4 * this.field2052 + var3 * var6;
		this.field2052 = this.field2052 * var3 - var4 * var6;
		this.field2062 = var7 * var3 + this.field2056 * var4;
		this.field2056 = this.field2056 * var3 - var4 * var7;
		this.field2061 = var3 * var8 + this.field2063 * var4;
		this.field2063 = this.field2063 * var3 - var8 * var4;
	}

	void method1426(float var1) {
		float var3 = (float) Math.cos((double) var1);
		float var4 = (float) Math.sin((double) var1);
		float var5 = this.field2058;
		float var6 = this.field2055;
		float var7 = this.field2062;
		float var8 = this.field2061;
		this.field2058 = var3 * var5 - var4 * this.field2053;
		this.field2053 = var3 * this.field2053 + var4 * var5;
		this.field2055 = var6 * var3 - var4 * this.field2057;
		this.field2057 = var4 * var6 + var3 * this.field2057;
		this.field2062 = var3 * var7 - var4 * this.field2059;
		this.field2059 = this.field2059 * var3 + var4 * var7;
		this.field2061 = var3 * var8 - this.field2060 * var4;
		this.field2060 = this.field2060 * var3 + var8 * var4;
	}

	void method1427(float var1, float var2, float var3) {
		this.field2061 += var1;
		this.field2060 += var2;
		this.field2063 += var3;
	}

	@Override
	public String toString() {
		return this.field2058 + "," + this.field2055 + "," + this.field2062 + "," + this.field2061 + "\n" + this.field2053 + "," + this.field2057 + "," + this.field2059 + "," + this.field2060 + "\n" + this.field2054 + "," + this.field2052 + "," + this.field2056 + "," + this.field2063;
	}
}
