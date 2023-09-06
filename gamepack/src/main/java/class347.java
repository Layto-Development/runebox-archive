public class class347 extends class42 {
	static final int[] field2991;
	class126 field2990;
	int field2992;

	static {
		field2991 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	public class347(int var1) {
		super(var1);
	}

	public void method1896(int[] var1) {
		this.field2990 = new class126(var1);
	}

	public void method1897(class126 var1) {
		this.field2990 = var1;
	}

	public void method1899(int var1) {
		super.field525[++super.field527 - 1] = (byte)(var1 + this.field2990.method764());
	}

	public int method1898() {
		return super.field525[++super.field527 - 1] - this.field2990.method764() & 255;
	}

	public boolean method1900() {
		int var2 = super.field525[super.field527] - this.field2990.method765() & 255;
		return var2 >= 128;
	}

	public int method1902() {
		int var2 = super.field525[++super.field527 - 1] - this.field2990.method764() & 255;
		return var2 < 128 ? var2 : (var2 - 128 << 8) + (super.field525[++super.field527 - 1] - this.field2990.method764() & 255);
	}

	public void method1901(byte[] var1, int var2, int var3) {
		for (int var5 = 0; var5 < var3; ++var5) {
			var1[var5 + var2] = (byte)(super.field525[++super.field527 - 1] - this.field2990.method764());
		}

	}

	public void method1905() {
		this.field2992 = super.field527 * 8;
	}

	public int method1903(int var1) {
		int var3 = this.field2992 >> 3;
		int var4 = 8 - (this.field2992 & 7);
		int var5 = 0;

		for (this.field2992 += var1; var1 > var4; var4 = 8) {
			var5 += (super.field525[var3++] & field2991[var4]) << var1 - var4;
			var1 -= var4;
		}

		if (var4 == var1) {
			var5 += super.field525[var3] & field2991[var4];
		} else {
			var5 += super.field525[var3] >> var4 - var1 & field2991[var1];
		}

		return var5;
	}

	public void method1906() {
		super.field527 = (this.field2992 + 7) / 8;
	}

	public int method1904(int var1) {
		return var1 * 8 - this.field2992;
	}
}
