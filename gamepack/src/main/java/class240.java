import java.awt.FontMetrics;

public class class240 {

	static class214 field2045;

	static FontMetrics field2044;

	class240() throws Throwable {
	}

	static final void method1411(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class83.field841.method999(!class83.field841.method1000());
			if (class83.field841.method1000()) {
				class156.method918(99, "", "Roofs are now all hidden");
			} else {
				class156.method918(99, "", "Roofs will only be removed selectively");
			}
		}
		if (var0.startsWith("zbuf")) {
			boolean var2 = class514.method2470(var0.substring(5).trim()) == 1;
			class501.field4023.method2533(var2);
			class238.method1398(var2);
		}
		if (var0.equalsIgnoreCase("z")) {
			Client.field962 = !Client.field962;
		}
		if (var0.equalsIgnoreCase("displayfps")) {
			class83.field841.method1003();
		}
		if (var0.equalsIgnoreCase("renderself")) {
			Client.field1136 = !Client.field1136;
		}
		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.field1058 = !Client.field1058;
		}
		if (Client.field986 >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (var0.equalsIgnoreCase("showcoord")) {
				class26.field125.field2372 = !class26.field125.field2372;
			}
			if (var0.equalsIgnoreCase("fpson")) {
				class83.field841.method1002(true);
			}
			if (var0.equalsIgnoreCase("fpsoff")) {
				class83.field841.method1002(false);
			}
			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}
			if (var0.equalsIgnoreCase("clientdrop")) {
				Client.method533();
			}
		}
		class457 var3 = class457.method2237(class483.field3873, Client.field963.field1603);
		var3.field3487.method1085(var0.length() + 1);
		var3.field3487.method1088(var0);
		Client.field963.method911(var3);
	}
}
