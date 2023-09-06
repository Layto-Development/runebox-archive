public class class352 extends class428 {
	int field3009;
	public boolean field3013;
	public byte[] field3010;
	public int field3011;
	public int field3012;

	class352(int var1, byte[] var2, int var3, int var4) {
		this.field3012 = var1;
		this.field3010 = var2;
		this.field3011 = var3;
		this.field3009 = var4;
	}

	class352(int var1, byte[] var2, int var3, int var4, boolean var5) {
		this.field3012 = var1;
		this.field3010 = var2;
		this.field3011 = var3;
		this.field3009 = var4;
		this.field3013 = var5;
	}

	public class352 method1922(class475 var1) {
		this.field3010 = var1.method2295(this.field3010);
		this.field3012 = var1.method2296(this.field3012);
		if (this.field3011 == this.field3009) {
			this.field3011 = this.field3009 = var1.method2294(this.field3011);
		} else {
			this.field3011 = var1.method2294(this.field3011);
			this.field3009 = var1.method2294(this.field3009);
			if (this.field3011 == this.field3009) {
				--this.field3011;
			}
		}

		return this;
	}
}
