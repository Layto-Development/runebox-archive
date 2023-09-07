public class class400 {

	static class354 field3169;

	class292 field3171;

	long field3172;

	public int field3170;

	public class400(class187 var1) {
		this.field3170 = -1;
		this.field3171 = new class292();
		this.method2059(var1);
	}

	void method2059(class187 var1) {
		this.field3172 = var1.method1101();
		this.field3170 = var1.method1100();
		for (int var3 = var1.method1096(); var3 != 0; var3 = var1.method1096()) {
			Object var4;
			if (var3 == 3) {
				var4 = new class340(this);
			} else if (var3 == 1) {
				var4 = new class126(this);
			} else if (var3 == 13) {
				var4 = new class412(this);
			} else if (var3 == 4) {
				var4 = new class411(this);
			} else if (var3 == 6) {
				var4 = new class81(this);
			} else if (var3 == 5) {
				var4 = new class218(this);
			} else if (var3 == 2) {
				var4 = new class23(this);
			} else if (var3 == 7) {
				var4 = new class425(this);
			} else if (var3 == 14) {
				var4 = new class387(this);
			} else if (var3 == 8) {
				var4 = new class311(this);
			} else if (var3 == 9) {
				var4 = new class443(this);
			} else if (var3 == 10) {
				var4 = new class256(this);
			} else if (var3 == 11) {
				var4 = new class117(this);
			} else if (var3 == 12) {
				var4 = new class43(this);
			} else {
				if (var3 != 15) {
					throw new RuntimeException("");
				}
				var4 = new class236(this);
			}
			((class417) var4).method2095(var1);
			this.field3171.method1579((class77) var4);
		}
	}

	public void method2058(class518 var1) {
		if (var1.field4102 == this.field3172 && this.field3170 == var1.field4119) {
			for (class417 var3 = (class417) this.field3171.method1585(); null != var3; var3 = (class417) this.field3171.method1581()) {
				var3.method2094(var1);
			}
			++var1.field4119;
		} else {
			throw new RuntimeException("");
		}
	}

	public static class457 method2060(byte var0) {
		return class457.field3486 == 0 ? new class457() : class457.field3485[--class457.field3486];
	}
}
