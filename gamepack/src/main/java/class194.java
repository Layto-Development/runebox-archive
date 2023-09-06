public class class194 extends class50 {
	int field1781;
	int field1782;
	int field1784;
	int field1786;
	long field1783;
	long[] field1785;

	public class194() {
		this.field1785 = new long[10];
		this.field1782 = 256;
		this.field1784 = 1;
		this.field1781 = 0;
		this.field1783 = class172.method977();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1785[var1] = this.field1783;
		}

	}

	public void method378() {
		for (int var2 = 0; var2 < 10; ++var2) {
			this.field1785[var2] = 0L;
		}

	}

	public int method379(int var1, int var2) {
		int var4 = this.field1782;
		int var5 = this.field1784;
		this.field1782 = 300;
		this.field1784 = 1;
		this.field1783 = class172.method977();
		if (0L == this.field1785[this.field1786]) {
			this.field1782 = var4;
			this.field1784 = var5;
		} else if (this.field1783 > this.field1785[this.field1786]) {
			this.field1782 = (int)((long)(var1 * 2560) / (this.field1783 - this.field1785[this.field1786]));
		}

		if (this.field1782 < 25) {
			this.field1782 = 25;
		}

		if (this.field1782 > 256) {
			this.field1782 = 256;
			this.field1784 = (int)((long)var1 - (this.field1783 - this.field1785[this.field1786]) / 10L);
		}

		if (this.field1784 > var1) {
			this.field1784 = var1;
		}

		this.field1785[this.field1786] = this.field1783;
		this.field1786 = (1 + this.field1786) % 10;
		int var6;
		if (this.field1784 > 1) {
			for (var6 = 0; var6 < 10; ++var6) {
				if (0L != this.field1785[var6]) {
					this.field1785[var6] += (long)this.field1784;
				}
			}
		}

		if (this.field1784 < var2) {
			this.field1784 = var2;
		}

		class353.method1925((long)this.field1784);

		for (var6 = 0; this.field1781 < 256; this.field1781 += this.field1782) {
			++var6;
		}

		this.field1781 &= 255;
		return var6;
	}
}
