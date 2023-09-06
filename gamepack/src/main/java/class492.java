public class class492 implements class311 {
	class492() {
	}

	public class337 method1746() {
		return new class361();
	}

	public static class459 method2409(int var0) {
		class459[] var2 = class244.method1393();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class459 var4 = var2[var3];
			if (var4.field3974 == var0) {
				return var4;
			}
		}

		return null;
	}

	public static int method2408(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var4 = false;
			boolean var5 = false;
			int var6 = 0;
			int var7 = var0.length();

			for (int var8 = 0; var8 < var7; ++var8) {
				char var9 = var0.charAt(var8);
				if (var8 == 0) {
					if (var9 == '-') {
						var4 = true;
						continue;
					}

					if (var9 == '+' && var2) {
						continue;
					}
				}

				int var11;
				if (var9 >= '0' && var9 <= '9') {
					var11 = var9 - '0';
				} else if (var9 >= 'A' && var9 <= 'Z') {
					var11 = var9 - '7';
				} else {
					if (var9 < 'a' || var9 > 'z') {
						throw new NumberFormatException();
					}

					var11 = var9 - 'W';
				}

				if (var11 >= var1) {
					throw new NumberFormatException();
				}

				if (var4) {
					var11 = -var11;
				}

				int var10 = var6 * var1 + var11;
				if (var6 != var10 / var1) {
					throw new NumberFormatException();
				}

				var6 = var10;
				var5 = true;
			}

			if (!var5) {
				throw new NumberFormatException();
			} else {
				return var6;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	static final void method2410(int var0, int var1, int var2, int var3) {
		for (int var5 = 0; var5 < Client.field174; ++var5) {
			if (Client.field230[var5] + Client.field228[var5] > var0 && Client.field228[var5] < var2 + var0 && Client.field231[var5] + Client.field229[var5] > var1 && Client.field229[var5] < var3 + var1) {
				Client.field226[var5] = true;
			}
		}

	}
}
