import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import javax.imageio.ImageIO;

public class class289 {
	static int field2578;
	static String field2577;

	static {
		ImageIO.setUseCache(false);
	}

	class289() throws Throwable {
	}

	static boolean method1662(int var0, int var1, int var2) {
		return var0 >= 0 && var0 < 4 && var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104;
	}

	public static void method1661(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (!var2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}

			if (class504.field4173.startsWith("win") && !var2) {
				class267.method1566(var0, 0);
			} else if (class504.field4173.startsWith("mac")) {
				class316.method1753(var0, 1, "openjs");
			} else {
				class267.method1566(var0, 2);
			}
		} else {
			class267.method1566(var0, 3);
		}

	}

	static class25[] method1663() {
		class25[] var1 = new class25[class49.field589];

		for (int var2 = 0; var2 < class49.field589; ++var2) {
			class25 var3 = var1[var2] = new class25();
			var3.field449 = class49.field590;
			var3.field454 = class340.field2957;
			var3.field448 = class49.field588[var2];
			var3.field453 = class517.field4221[var2];
			var3.field450 = class177.field1707[var2];
			var3.field451 = class420.field3504[var2];
			var3.field455 = class101.field1016;
			var3.field452 = class29.field463[var2];
		}

		class49.field588 = null;
		class517.field4221 = null;
		class177.field1707 = null;
		class420.field3504 = null;
		class101.field1016 = null;
		class29.field463 = (byte[][])null;
		return var1;
	}

	public static class86 method1659() {
		return Client.field218;
	}

	static boolean method1660() {
		return Client.field136;
	}
}
