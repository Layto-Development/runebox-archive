public class class129 {

	byte[] field1468;

	int field1467;

	int field1469;

	class129() {
		this.field1468 = null;
		this.field1467 = 0;
		this.field1469 = 0;
	}

	int method856(int var1) {
		int var3 = 0;
		int var4;
		int var5;
		for (var4 = 0; var1 >= 8 - this.field1469; var1 -= var5) {
			var5 = 8 - this.field1469;
			int var6 = (1 << var5) - 1;
			var3 += (this.field1468[this.field1467] >> this.field1469 & var6) << var4;
			this.field1469 = 0;
			++this.field1467;
			var4 += var5;
		}
		if (var1 > 0) {
			var5 = (1 << var1) - 1;
			var3 += (this.field1468[this.field1467] >> this.field1469 & var5) << var4;
			this.field1469 += var1;
		}
		return var3;
	}

	int method857() {
		int var2 = this.field1468[this.field1467] >> this.field1469 & 1;
		++this.field1469;
		this.field1467 += this.field1469 >> 3;
		this.field1469 &= 7;
		return var2;
	}

	void method858(byte[] var1, int var2) {
		this.field1468 = var1;
		this.field1467 = 0;
		this.field1469 = 0;
	}
}
