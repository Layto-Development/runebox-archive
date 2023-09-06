public class class350 extends class71 {
	int field3006;

	class350() {
	}

	int method1921(class350 var1) {
		return this.field3006 - var1.field3006;
	}

	public int method512(class71 var1) {
		return this.method1921((class350)var1);
	}

	public int compareTo(Object var1) {
		return this.method1921((class350)var1);
	}

	static final void method1920() {
		for (class353 var1 = (class353)Client.field144.method563(); var1 != null; var1 = (class353)Client.field144.method565()) {
			if (var1.field3026 > 0) {
				--var1.field3026;
			}

			boolean var2;
			int var3;
			int var4;
			class235 var5;
			if (var1.field3026 == 0) {
				if (var1.field3017 >= 0) {
					var3 = var1.field3017;
					var4 = var1.field3019;
					var5 = class96.method638(var3, (byte)-69);
					if (var4 == 11) {
						var4 = 10;
					}

					if (var4 >= 5 && var4 <= 8) {
						var4 = 4;
					}

					var2 = var5.method1345(var4);
					if (!var2) {
						continue;
					}
				}

				class199.method1138(var1.field3028, var1.field3014, var1.field3021, var1.field3027, var1.field3017, var1.field3018, var1.field3019, var1.field3023);
				var1.method2269();
			} else {
				if (var1.field3025 > 0) {
					--var1.field3025;
				}

				if (var1.field3025 == 0 && var1.field3021 >= 1 && var1.field3027 >= 1 && var1.field3021 <= 102 && var1.field3027 <= 102) {
					if (var1.field3020 >= 0) {
						var3 = var1.field3020;
						var4 = var1.field3016;
						var5 = class96.method638(var3, (byte)-10);
						if (var4 == 11) {
							var4 = 10;
						}

						if (var4 >= 5 && var4 <= 8) {
							var4 = 4;
						}

						var2 = var5.method1345(var4);
						if (!var2) {
							continue;
						}
					}

					class199.method1138(var1.field3028, var1.field3014, var1.field3021, var1.field3027, var1.field3020, var1.field3022, var1.field3016, var1.field3023);
					var1.field3025 = -1;
					if (var1.field3020 == var1.field3017 && var1.field3017 == -1) {
						var1.method2269();
					} else if (var1.field3020 == var1.field3017 && var1.field3022 == var1.field3018 && var1.field3019 == var1.field3016) {
						var1.method2269();
					}
				}
			}
		}

	}
}
