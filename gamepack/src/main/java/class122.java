import java.awt.FontMetrics;

public class class122 {
	static class25 field1135;
	static FontMetrics field1134;

	class122() throws Throwable {
	}

	public static int method755(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	static final void method757(class347 var0) {
		for (int var2 = 0; var2 < class481.field4091; ++var2) {
			int var3 = class481.field4084[var2];
			class287 var4 = Client.field176[var3];
			int var5 = var0.method278();
			if ((var5 & 1) != 0) {
				var5 += var0.method278() << 8;
			}

			if ((var5 & 32768) != 0) {
				var5 += var0.method278() << 16;
			}

			class81.method540(var0, var3, var4, var5);
		}

	}

	static final void method756(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class176.field1701.method2486(!class176.field1701.method2487());
			if (class176.field1701.method2487()) {
				class184.method1019(99, "", "Roofs are now all hidden");
			} else {
				class184.method1019(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var2 = class177.method1005(var0.substring(5).trim()) == 1;
			class466.field3999.method953(var2);
			class133.method792(var2);
		}

		if (var0.equalsIgnoreCase("z")) {
			Client.field67 = !Client.field67;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			class176.field1701.method2490();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.field241 = !Client.field241;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.field163 = !Client.field163;
		}

		if (Client.field91 >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				class306.field2771.field1807 = !class306.field2771.field1807;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				class176.field1701.method2489(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				class176.field1701.method2489(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				class480.method2394();
			}
		}

		class160 var3 = class85.method556(class129.field1259, Client.field68.field2426);
		var3.field1483.method267(var0.length() + 1);
		var3.field1483.method270(var0);
		Client.field68.method1570(var3);
	}
}
