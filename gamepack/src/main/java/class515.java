public class class515 extends class187 {

	static final int[] field4091;

	class504 field4090;

	int field4092;

	static {
		field4091 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
	}

	public class515(int var1) {
		super(var1);
	}

	public void method2481(int[] var1) {
		this.field4090 = new class504(var1);
	}

	public void method2482(class504 var1) {
		this.field4090 = var1;
	}

	public void method2484(int var1) {
		super.field1830[++super.field1832 - 1] = (byte) (var1 + this.field4090.method2436());
	}

	public int method2483() {
		return super.field1830[++super.field1832 - 1] - this.field4090.method2436() & 255;
	}

	public boolean method2485() {
		int var2 = super.field1830[super.field1832] - this.field4090.method2437() & 255;
		return var2 >= 128;
	}

	public int method2487() {
		int var2 = super.field1830[++super.field1832 - 1] - this.field4090.method2436() & 255;
		return var2 < 128 ? var2 : (var2 - 128 << 8) + (super.field1830[++super.field1832 - 1] - this.field4090.method2436() & 255);
	}

	public void method2486(byte[] var1, int var2, int var3) {
		for (int var5 = 0; var5 < var3; ++var5) {
			var1[var5 + 0] = (byte) (super.field1830[++super.field1832 - 1] - this.field4090.method2436());
		}
	}

	public void method2490() {
		this.field4092 = super.field1832 * 8;
	}

	public int method2488(int var1) {
		int var3 = this.field4092 >> 3;
		int var4 = 8 - (this.field4092 & 7);
		int var5 = 0;
		for (this.field4092 += var1; var1 > var4; var4 = 8) {
			var5 += (super.field1830[var3++] & field4091[var4]) << var1 - var4;
			var1 -= var4;
		}
		if (var4 == var1) {
			var5 += super.field1830[var3] & field4091[var4];
		} else {
			var5 += super.field1830[var3] >> var4 - var1 & field4091[var1];
		}
		return var5;
	}

	public void method2491() {
		super.field1832 = (this.field4092 + 7) / 8;
	}

	public int method2489(int var1) {
		return var1 * 8 - this.field4092;
	}
}
