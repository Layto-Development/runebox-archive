public class class265 {
	static class25[] field2402;
	float field2390;
	float field2391;
	float field2392;
	float field2393;
	float field2394;
	float field2395;
	float field2396;
	float field2397;
	float field2398;
	float field2399;
	float field2400;
	float field2401;

	static {
		new class265();
	}

	class265() {
		this.method1536();
	}

	void method1536() {
		this.field2401 = 0.0F;
		this.field2398 = 0.0F;
		this.field2399 = 0.0F;
		this.field2397 = 0.0F;
		this.field2400 = 0.0F;
		this.field2390 = 0.0F;
		this.field2393 = 0.0F;
		this.field2392 = 0.0F;
		this.field2391 = 0.0F;
		this.field2394 = 1.0F;
		this.field2395 = 1.0F;
		this.field2396 = 1.0F;
	}

	void method1537(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field2391;
		float var6 = this.field2395;
		float var7 = this.field2397;
		float var8 = this.field2398;
		this.field2391 = var5 * var3 - var4 * this.field2392;
		this.field2392 = var3 * this.field2392 + var5 * var4;
		this.field2395 = var6 * var3 - this.field2390 * var4;
		this.field2390 = var6 * var4 + this.field2390 * var3;
		this.field2397 = var3 * var7 - var4 * this.field2394;
		this.field2394 = var7 * var4 + this.field2394 * var3;
		this.field2398 = var3 * var8 - var4 * this.field2401;
		this.field2401 = var8 * var4 + this.field2401 * var3;
	}

	void method1540(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field2396;
		float var6 = this.field2393;
		float var7 = this.field2400;
		float var8 = this.field2399;
		this.field2396 = var4 * this.field2392 + var3 * var5;
		this.field2392 = this.field2392 * var3 - var5 * var4;
		this.field2393 = var4 * this.field2390 + var3 * var6;
		this.field2390 = this.field2390 * var3 - var4 * var6;
		this.field2400 = var7 * var3 + this.field2394 * var4;
		this.field2394 = this.field2394 * var3 - var4 * var7;
		this.field2399 = var3 * var8 + this.field2401 * var4;
		this.field2401 = this.field2401 * var3 - var8 * var4;
	}

	void method1538(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field2396;
		float var6 = this.field2393;
		float var7 = this.field2400;
		float var8 = this.field2399;
		this.field2396 = var3 * var5 - var4 * this.field2391;
		this.field2391 = var3 * this.field2391 + var4 * var5;
		this.field2393 = var6 * var3 - var4 * this.field2395;
		this.field2395 = var4 * var6 + var3 * this.field2395;
		this.field2400 = var3 * var7 - var4 * this.field2397;
		this.field2397 = this.field2397 * var3 + var4 * var7;
		this.field2399 = var3 * var8 - this.field2398 * var4;
		this.field2398 = this.field2398 * var3 + var8 * var4;
	}

	void method1539(float var1, float var2, float var3) {
		this.field2399 += var1;
		this.field2398 += var2;
		this.field2401 += var3;
	}

	public String toString() {
		return this.field2396 + "," + this.field2393 + "," + this.field2400 + "," + this.field2399 + "\n" + this.field2391 + "," + this.field2395 + "," + this.field2397 + "," + this.field2398 + "\n" + this.field2392 + "," + this.field2390 + "," + this.field2394 + "," + this.field2401;
	}
}
