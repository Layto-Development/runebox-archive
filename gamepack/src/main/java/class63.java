public class class63 extends class218 {
	public static class215 field806;
	public static class344 field807;
	static int[] field804;
	class526 field805;

	static {
		field807 = new class344(64);
	}

	class63() {
	}

	void method476() {
	}

	void method477(class42 var1) {
		while (true) {
			int var3 = var1.method278();
			if (var3 == 0) {
				return;
			}

			this.method480(var1, var3);
		}
	}

	void method480(class42 var1, int var2) {
		if (var2 == 249) {
			this.field805 = class475.method2299(var1, this.field805);
		}

	}

	public int method478(int var1, int var2) {
		return class57.method420(this.field805, var1, var2);
	}

	public String method479(int var1, String var2) {
		class526 var5 = this.field805;
		String var4;
		if (var5 == null) {
			var4 = var2;
		} else {
			class509 var6 = (class509)var5.method2543((long)var1);
			if (null == var6) {
				var4 = var2;
			} else {
				var4 = (String)var6.field4186;
			}
		}

		return var4;
	}

	public static class409 method481(int var0) {
		class409 var2 = (class409)class409.field3413.method1890((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class409.field3425.method1212(13, var0);
			var2 = new class409();
			var2.field3415 = var0;
			if (var3 != null) {
				var2.method2108(new class42(var3));
			}

			class409.field3413.method1889(var2, (long)var0);
			return var2;
		}
	}

	static final int method483() {
		if (class176.field1701.method2487()) {
			return class358.field3038;
		} else {
			int var1 = class454.method2262(class375.field3180, class196.field1796, class358.field3038);
			return var1 - class463.field3989 < 800 && (class38.field513[class358.field3038][class375.field3180 >> 7][class196.field1796 >> 7] & 4) != 0 ? class358.field3038 : 3;
		}
	}

	static final void method482(class60 var0) {
		int var2 = var0.field670;
		if (var2 == 324) {
			if (Client.field109 == -1) {
				Client.field109 = var0.field730;
				Client.field291 = var0.field678;
			}

			if (Client.field289.field3054 == 1) {
				var0.field730 = Client.field109;
			} else {
				var0.field730 = Client.field291;
			}

		} else if (var2 == 325) {
			if (Client.field109 == -1) {
				Client.field109 = var0.field730;
				Client.field291 = var0.field678;
			}

			if (Client.field289.field3054 == 1) {
				var0.field730 = Client.field291;
			} else {
				var0.field730 = Client.field109;
			}

		} else if (var2 == 327) {
			var0.field694 = 150;
			var0.field712 = (int)(Math.sin((double)Client.field306 / 40.0D) * 256.0D) & 2047;
			var0.field686 = 5;
			var0.field687 = 0;
		} else if (var2 == 328) {
			var0.field694 = 150;
			var0.field712 = (int)(Math.sin((double)Client.field306 / 40.0D) * 256.0D) & 2047;
			var0.field686 = 5;
			var0.field687 = 1;
		}
	}
}
