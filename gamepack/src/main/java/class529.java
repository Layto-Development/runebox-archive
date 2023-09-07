public class class529 extends class423 {

	int field4187;

	public boolean field4191;

	public byte[] field4188;

	public int field4189;

	public int field4190;

	class529(int var1, byte[] var2, int var3, int var4) {
		this.field4190 = var1;
		this.field4188 = var2;
		this.field4189 = var3;
		this.field4187 = var4;
	}

	class529(int var1, byte[] var2, int var3, int var4, boolean var5) {
		this.field4190 = var1;
		this.field4188 = var2;
		this.field4189 = var3;
		this.field4187 = var4;
		this.field4191 = var5;
	}

	public class529 method2564(class496 var1) {
		this.field4188 = var1.method2375(this.field4188);
		this.field4190 = var1.method2376(this.field4190);
		if (this.field4189 == this.field4187) {
			this.field4189 = this.field4187 = var1.method2374(this.field4189);
		} else {
			this.field4189 = var1.method2374(this.field4189);
			this.field4187 = var1.method2374(this.field4187);
			if (this.field4189 == this.field4187) {
				--this.field4189;
			}
		}
		return this;
	}
}
