public class class247 extends class192 {
	int field2235;
	int field2236;

	public class247(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field2235 = 0;
		this.field2236 = 0;
		this.field2235 = var1;
		this.field2236 = var2;
	}

	public int method1439() {
		double var2 = this.method1047();
		return (int)Math.round((double)this.field2235 + var2 * (double)(this.field2236 - this.field2235));
	}

	static void method1440(String var0) {
		class116.field1104 = class230.method1323(var0);
	}
}
