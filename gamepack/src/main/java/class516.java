public class class516 {

	static class13 field4099;

	byte field4095;

	public int field4093;

	public int field4094;

	public int field4096;

	public int field4097;

	public int field4098;

	public class516() {
	}

	public class516(class187 var1, boolean var2) {
		this.field4095 = var1.method1097();
		this.field4094 = var1.method1145();
		this.field4098 = var1.method1100();
		this.field4096 = var1.method1100();
		this.field4097 = var1.method1100();
		this.field4093 = var1.method1100();
	}

	void method2493(Integer var1) {
	}

	public int method2494() {
		return this.field4095 & 7;
	}

	public int method2495() {
		return (this.field4095 & 8) == 8 ? 1 : 0;
	}

	void method2492(int var1) {
		this.field4095 &= -8;
		this.field4095 = (byte) (this.field4095 | 2);
	}

	void method2496(int var1) {
		this.field4095 &= -9;
		if (var1 == 1) {
			this.field4095 = (byte) (this.field4095 | 8);
		}
	}
}
