import java.io.DataInputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class class156 {

	public static String field1618;

	static int field1617;

	static final class139 field1616;

	static final class419 field1615;

	static final Map field1614;

	static {
		field1614 = new HashMap();
		field1615 = new class419(1024);
		field1616 = new class139();
		field1617 = 0;
	}

	class156() throws Throwable {
	}

	static void method918(int var0, String var1, String var2) {
		method925(var0, var1, var2, (String) null);
	}

	static void method925(int var0, String var1, String var2, String var3) {
		class3 var5 = (class3) field1614.get(var0);
		if (var5 == null) {
			var5 = new class3();
			field1614.put(var0, var5);
		}
		class374 var6 = var5.method8(var0, var1, var2, var3);
		field1615.method2109(var6, (long) var6.field3031);
		field1616.method873(var6);
		Client.field1103 = Client.field900;
	}

	public static void method917(String var0, Throwable var1) {
		try {
			String var3 = "";
			if (var1 != null) {
				var3 = class472.method2300(var1);
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
			if (null == class472.field3721) {
				return;
			}
			URL var4 = new URL(class472.field3721.getCodeBase(), "clienterror.ws?cv=" + class472.field3727 + "&cs=" + class472.field3723 + "&u=" + class472.field3720 + "&v1=" + class420.field3242 + "&v2=" + class385.field3081 + "&ct=" + class472.field3724 + "&e=" + var3);
			DataInputStream var5 = new DataInputStream(var4.openStream());
			var5.read();
			var5.close();
		} catch (Exception var6) {
		}
	}

	static class374 method924(int var0, int var1) {
		class3 var3 = (class3) field1614.get(var0);
		return var3.method9(var1);
	}

	static class374 method919(int var0) {
		return (class374) field1615.method2105((long) var0);
	}

	static int method922(int var0) {
		class3 var2 = (class3) field1614.get(var0);
		return null == var2 ? 0 : var2.method7();
	}

	static void method920() {
		field1614.clear();
		field1615.method2106();
		field1616.method879();
		field1617 = 0;
	}

	static int method921(int var0) {
		class374 var2 = (class374) field1615.method2105((long) var0);
		if (null == var2) {
			return -1;
		} else {
			return var2.field2428 == field1616.field1534 ? -1 : ((class374) var2.field2428).field3031;
		}
	}

	static int method923(int var0) {
		class374 var2 = (class374) field1615.method2105((long) var0);
		if (null == var2) {
			return -1;
		} else {
			return var2.field2427 == field1616.field1534 ? -1 : ((class374) var2.field2427).field3031;
		}
	}
}
