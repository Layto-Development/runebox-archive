public class class193 extends class356 {

	int field1852;

	int field1853;

	int field1855;

	int field1857;

	long field1854;

	long[] field1856;

	public class193() {
		this.field1856 = new long[10];
		this.field1853 = 256;
		this.field1855 = 1;
		this.field1852 = 0;
		this.field1854 = class48.method197();
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1856[var1] = this.field1854;
		}
	}

	@Override
	public void method1868() {
		for (int var2 = 0; var2 < 10; ++var2) {
			this.field1856[var2] = 0L;
		}
	}

	@Override
	public int method1869(int var1, int var2) {
		int var4 = this.field1853;
		int var5 = this.field1855;
		this.field1853 = 300;
		this.field1855 = 1;
		this.field1854 = class48.method197();
		if (0L == this.field1856[this.field1857]) {
			this.field1853 = var4;
			this.field1855 = var5;
		} else if (this.field1854 > this.field1856[this.field1857]) {
			this.field1853 = (int) ((long) (var1 * 2560) / (this.field1854 - this.field1856[this.field1857]));
		}
		if (this.field1853 < 25) {
			this.field1853 = 25;
		}
		if (this.field1853 > 256) {
			this.field1853 = 256;
			this.field1855 = (int) ((long) var1 - (this.field1854 - this.field1856[this.field1857]) / 10L);
		}
		if (this.field1855 > var1) {
			this.field1855 = var1;
		}
		this.field1856[this.field1857] = this.field1854;
		this.field1857 = (1 + this.field1857) % 10;
		int var6;
		if (this.field1855 > 1) {
			for (var6 = 0; var6 < 10; ++var6) {
				if (0L != this.field1856[var6]) {
					this.field1856[var6] += (long) this.field1855;
				}
			}
		}
		if (this.field1855 < var2) {
			this.field1855 = var2;
		}
		class39.method171((long) this.field1855);
		for (var6 = 0; this.field1852 < 256; this.field1852 += this.field1853) {
			++var6;
		}
		this.field1852 &= 255;
		return var6;
	}
}
