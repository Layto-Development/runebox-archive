public class class230 implements class367 {
	static final class230 field2089;
	static final class230 field2090;
	static final class230 field2093;
	final int field2092;
	public final int field2091;

	static {
		field2090 = new class230(0, 0);
		field2093 = new class230(2, 1);
		field2089 = new class230(1, 2);
	}

	class230(int var1, int var2) {
		this.field2091 = var1;
		this.field2092 = var2;
	}

	public int method1970() {
		return this.field2092;
	}

	public static void method1324(class382 var0) {
		class92.field906.remove(var0);
	}

	static int method1325(int var0) {
		class121 var2 = (class121)class41.field520.get(var0);
		return null == var2 ? 0 : var2.method750();
	}

	public static String method1323(String var0) {
		return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
	}

	static String method1326(String var0, boolean var1) {
		String var3 = var1 ? "https://" : "http://";
		if (Client.field28 == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.field28 == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.field28 == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.field28 == 5) {
			var0 = var0 + "-wti";
		} else if (Client.field28 == 4) {
			var0 = "local";
		}

		String var4 = "";
		if (null != class354.field3029) {
			var4 = "/p=" + class354.field3029;
		}

		String var5 = "runescape.com";
		return var3 + var0 + "." + var5 + "/l=" + class395.field3318 + "/a=" + class498.field4147 + var4 + "/";
	}
}
