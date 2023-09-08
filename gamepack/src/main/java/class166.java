public class class166 {

	static class84 field1680;

	public int field1676;

	public int field1677;

	public int field1678;

	public int field1679;

	public class166(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	public class166(int var1, int var2, int var3, int var4) {
		this.method968(var1, var2);
		this.method969(var3, var4);
	}

	public void method968(int var1, int var2) {
		this.field1679 = var1;
		this.field1677 = var2;
	}

	public void method969(int var1, int var2) {
		this.field1678 = var1;
		this.field1676 = var2;
	}

	public boolean method970(int var1, int var2, byte var3) {
		return var1 >= this.field1679 && var1 < this.field1678 + this.field1679 && var2 >= this.field1677 && var2 < this.field1677 + this.field1676;
	}

	@Override
	public String toString() {
		return null;
	}

	public void method971(class166 var1, class166 var2) {
		this.method972(var1, var2);
		this.method973(var1, var2);
	}

	void method972(class166 var1, class166 var2) {
		var2.field1679 = this.field1679;
		var2.field1678 = this.field1678;
		if (this.field1679 < var1.field1679) {
			var2.field1678 = (var2.field1678 * 2133643001 - (var1.field1679 * 2133643001 - this.field1679 * 2133643001)) * -2074045623;
			var2.field1679 = var1.field1679;
		}
		if (var2.method974() > var1.method974()) {
			var2.field1678 -= var2.method974() - var1.method974();
		}
		if (var2.field1678 < 0) {
			var2.field1678 = 0;
		}
	}

	void method973(class166 var1, class166 var2) {
		var2.field1677 = this.field1677;
		var2.field1676 = this.field1676;
		if (this.field1677 < var1.field1677) {
			var2.field1676 = (var2.field1676 * -584535177 - (var1.field1677 * -584535177 - this.field1677 * -584535177)) * 377886279;
			var2.field1677 = var1.field1677;
		}
		if (var2.method976() > var1.method976()) {
			var2.field1676 -= var2.method976() - var1.method976();
		}
		if (var2.field1676 < 0) {
			var2.field1676 = 0;
		}
	}

	int method974() {
		return this.field1678 + this.field1679;
	}

	int method976() {
		return this.field1677 + this.field1676;
	}

	static final boolean method975(class354 var0) {
		int var2 = var0.field2714;
		if (var2 == 205) {
			Client.field951 = 250;
			return true;
		} else {
			int var3;
			int var4;
			if (var2 >= 300 && var2 <= 313) {
				var3 = (var2 - 300) / 2;
				var4 = var2 & 1;
				Client.field1184.method2445(var3, var4 == 1);
			}
			if (var2 >= 314 && var2 <= 323) {
				var3 = (var2 - 314) / 2;
				var4 = var2 & 1;
				Client.field1184.method2446(var3, var4 == 1);
			}
			if (var2 == 324) {
				Client.field1184.method2453(0);
			}
			if (var2 == 325) {
				Client.field1184.method2453(1);
			}
			if (var2 == 326) {
				class457 var5 = class457.method2237(class483.field3851, Client.field963.field1603);
				Client.field1184.method2447(var5.field3487);
				Client.field963.method911(var5);
				return true;
			} else {
				return false;
			}
		}
	}
}
