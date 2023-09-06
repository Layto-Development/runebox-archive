public class class17 {
	boolean field391;
	int field387;
	int field392;
	int field393;
	int field394;
	int field395;
	int field396;
	int field398;
	int field399;
	int field400;
	int[] field397;
	public boolean field388;
	public class360 field389;
	public int field390;

	class17() {
		this.field391 = false;
		this.field388 = true;
		this.field394 = 0;
		this.field390 = 512;
		this.field397 = new int[1024];
	}

	void method127() {
		this.field387 = this.field395 / 2;
		this.field396 = this.field393 / 2;
		this.field392 = -this.field387;
		this.field398 = this.field395 - this.field387;
		this.field399 = -this.field396;
		this.field400 = this.field393 - this.field396;
	}

	void method129(int var1, int var2, int var3, int var4) {
		this.field387 = var1 - var2;
		this.field396 = var3 - var4;
		this.field392 = -this.field387;
		this.field398 = this.field395 - this.field387;
		this.field399 = -this.field396;
		this.field400 = this.field393 - this.field396;
	}

	void method128(int var1, int var2, int var3) {
		this.field391 = var1 < 0 || var1 > this.field395 || var2 < 0 || var2 > this.field395 || var3 < 0 || var3 > this.field395;
	}
}
