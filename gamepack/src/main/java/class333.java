public class class333 {

	int field2548;

	int field2551;

	int field2552;

	int field2553;

	int field2554;

	int field2555;

	int field2556;

	int field2557;

	int field2558;

	int[] field2549;

	int[] field2550;

	class333() {
		this.field2553 = 2;
		this.field2549 = new int[2];
		this.field2550 = new int[2];
		this.field2549[0] = 0;
		this.field2549[1] = 65535;
		this.field2550[0] = 0;
		this.field2550[1] = 65535;
	}

	final void method1750(class187 var1) {
		this.field2552 = var1.method1096();
		this.field2551 = var1.method1100();
		this.field2548 = var1.method1100();
		this.method1751(var1);
	}

	final void method1751(class187 var1) {
		this.field2553 = var1.method1096();
		this.field2549 = new int[this.field2553];
		this.field2550 = new int[this.field2553];
		for (int var2 = 0; var2 < this.field2553; ++var2) {
			this.field2549[var2] = var1.method1145();
			this.field2550[var2] = var1.method1145();
		}
	}

	final void method1749() {
		this.field2555 = 0;
		this.field2557 = 0;
		this.field2556 = 0;
		this.field2554 = 0;
		this.field2558 = 0;
	}

	final int method1748(int var1) {
		if (this.field2558 >= this.field2555) {
			this.field2554 = this.field2550[this.field2557++] << 15;
			if (this.field2557 >= this.field2553) {
				this.field2557 = this.field2553 - 1;
			}
			this.field2555 = (int) ((double) this.field2549[this.field2557] / 65536.0D * (double) var1);
			if (this.field2555 > this.field2558) {
				this.field2556 = ((this.field2550[this.field2557] << 15) - this.field2554) / (this.field2555 - this.field2558);
			}
		}
		this.field2554 += this.field2556;
		++this.field2558;
		return this.field2554 - this.field2556 >> 15;
	}
}
