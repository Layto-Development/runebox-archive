public class class384 implements Runnable {
	static int field3237;
	boolean field3236;
	int field3232;
	int[] field3233;
	int[] field3234;
	Object field3231;
	long[] field3235;

	class384() {
		this.field3236 = true;
		this.field3231 = new Object();
		this.field3232 = 0;
		this.field3233 = new int[500];
		this.field3234 = new int[500];
		this.field3235 = new long[500];
	}

	public void run() {
		for (; this.field3236; class353.method1925(50L)) {
			synchronized(this.field3231) {
				if (this.field3232 < 500) {
					this.field3233[this.field3232] = class184.field1745;
					this.field3234[this.field3232] = class184.field1728;
					this.field3235[this.field3232] = class184.field1736;
					++this.field3232;
				}
			}
		}

	}
}
