import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.awt.FontMetrics;

@ObfInfo(name = "da")
public class class447 {
	@ObfInfo(name = "dt", desc = "Luk;")
	static class398 field3385;
	@ObfInfo(name = "bk", desc = "Ljava/awt/FontMetrics;")
	static FontMetrics field3384;

	@ObfInfo(name = "<init>", desc = "()V")
	class447() throws Throwable {
	}

	@ObfInfo(name = "ir", desc = "(Ljava/lang/String;B)V", opaqueValue = "0")
	static final void method2351(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class281.field2262.method1744(!class281.field2262.method1745());
			if (class281.field2262.method1745()) {
				class159.method914(99, "", "Roofs are now all hidden");
			} else {
				class159.method914(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var2 = class455.method2372(var0.substring(5).trim()) == 1;
			class51.field585.method1894(var2);
			class276.method1454(var2);
		}

		if (var0.equalsIgnoreCase("z")) {
			Client.field91 = !Client.field91;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			class281.field2262.method1748();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.field265 = !Client.field265;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.field187 = !Client.field187;
		}

		if (Client.field115 >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				class34.field483.field2015 = !class34.field483.field2015;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				class281.field2262.method1747(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				class281.field2262.method1747(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				Client.method214();
			}
		}

		class121 var3 = class121.method689(class480.field3910, Client.field92.field2665);
		var3.field1141.method1481(var0.length() + 1);
		var3.field1141.method1484(var0);
		Client.field92.method1821(var3);
	}
}
