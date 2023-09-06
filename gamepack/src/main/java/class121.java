public class class121 {
	class445[] field1133;
	int field1132;

	class121() {
		this.field1133 = new class445[100];
	}

	class445 method751(int var1, String var2, String var3, String var4) {
		class445 var6 = this.field1133[99];

		for (int var7 = this.field1132; var7 > 0; --var7) {
			if (var7 != 100) {
				this.field1133[var7] = this.field1133[var7 - 1];
			}
		}

		if (null == var6) {
			var6 = new class445(var1, var2, var4, var3);
		} else {
			var6.method2269();
			var6.method1252();
			var6.method2226(var1, var2, var4, var3);
		}

		this.field1133[0] = var6;
		if (this.field1132 < 100) {
			++this.field1132;
		}

		return var6;
	}

	class445 method752(int var1) {
		return var1 >= 0 && var1 < this.field1132 ? this.field1133[var1] : null;
	}

	int method750() {
		return this.field1132;
	}

	static void method754() {
		class41.field520.clear();
		class41.field521.method2544();
		class41.field522.method1607();
		class41.field523 = 0;
	}

	static boolean method753() {
		if (null != Client.field300 && Client.field301 < Client.field300.size()) {
			while (Client.field301 < Client.field300.size()) {
				class398 var1 = (class398)Client.field300.get(Client.field301);
				if (!var1.method2076()) {
					return false;
				}

				++Client.field301;
			}

			return true;
		} else {
			return true;
		}
	}
}
