public class class326 {
	byte[] field2903;
	int field2902;
	int field2904;

	class326() {
		this.field2903 = null;
		this.field2902 = 0;
		this.field2904 = 0;
	}

	int method1829(int var1) {
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = 0; var1 >= 8 - this.field2904; var1 -= var5) {
			var5 = 8 - this.field2904;
			int var6 = (1 << var5) - 1;
			var3 += (this.field2903[this.field2902] >> this.field2904 & var6) << var4;
			this.field2904 = 0;
			++this.field2902;
			var4 += var5;
		}

		if (var1 > 0) {
			var5 = (1 << var1) - 1;
			var3 += (this.field2903[this.field2902] >> this.field2904 & var5) << var4;
			this.field2904 += var1;
		}

		return var3;
	}

	int method1830() {
		int var2 = this.field2903[this.field2902] >> this.field2904 & 1;
		++this.field2904;
		this.field2902 += this.field2904 >> 3;
		this.field2904 &= 7;
		return var2;
	}

	void method1831(byte[] var1, int var2) {
		this.field2903 = var1;
		this.field2902 = var2;
		this.field2904 = 0;
	}

	public static String method1832(int var0, boolean var1) {
		return var1 && var0 >= 0 ? class434.method2205(var0, 10, var1) : Integer.toString(var0);
	}
}
