import java.io.DataInputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class class41 {
	public static String field524;
	static int field523;
	static final class282 field522;
	static final class526 field521;
	static final Map field520;

	static {
		field520 = new HashMap();
		field521 = new class526(1024);
		field522 = new class282();
		field523 = 0;
	}

	class41() throws Throwable {
	}

	public static void method263(String var0, Throwable var1) {
		try {
			String var3 = "";
			if (var1 != null) {
				var3 = class442.method2218(var1);
			}

			if (null != var0) {
				if (var1 != null) {
					var3 = var3 + " | ";
				}

				var3 = var3 + var0;
			}

			System.out.println("Error: " + var3);
			var3 = var3.replace(':', '.');
			var3 = var3.replace('@', '_');
			var3 = var3.replace('&', '_');
			var3 = var3.replace('#', '_');
			if (null == class280.field2497) {
				return;
			}

			URL var4 = new URL(class280.field2497.getCodeBase(), "clienterror.ws?cv=" + class280.field2503 + "&cs=" + class280.field2499 + "&u=" + class280.field2496 + "&v1=" + class302.field2761 + "&v2=" + class188.field1754 + "&ct=" + class280.field2500 + "&e=" + var3);
			DataInputStream var5 = new DataInputStream(var4.openStream());
			var5.read();
			var5.close();
		} catch (Exception var6) {
		}

	}

	static int method262(int var0, class167 var1, boolean var2) {
		if (var0 == 7108) {
			class139.field1344[++class203.field1903 - 1] = class303.method1727() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
