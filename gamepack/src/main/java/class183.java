public class class183 implements class367 {
	public static final class183 field1726;
	static final class183 field1722;
	static final class183 field1723;
	static final class183 field1724;
	static final class183 field1725;
	final int field1727;

	static {
		field1725 = new class183(0);
		field1723 = new class183(1);
		field1724 = new class183(2);
		field1726 = new class183(3);
		field1722 = new class183(4);
	}

	class183(int var1) {
		this.field1727 = var1;
	}

	public int method1970() {
		return this.field1727;
	}

	static final class534 method1014(int var0, int var1, int var2) {
		class534 var4 = new class534();
		var4.field4270 = var1;
		var4.field4268 = var2;
		Client.field24.method1495(var4, (long)var0);
		class426.method2177(var1);
		class60 var5 = class366.method1967(var0);
		class185.method1024(var5);
		if (null != Client.field180) {
			class185.method1024(Client.field180);
			Client.field180 = null;
		}

		class116.method738(class160.field1484[var0 >> 16], var5, false);
		class394.method2066(var1);
		if (Client.field175 != -1) {
			class465.method2276(Client.field175, 1);
		}

		return var4;
	}

	static void method1016(int var0) {
		for (class380 var2 = (class380)Client.field222.method1493(); null != var2; var2 = (class380)Client.field222.method1494()) {
			if ((var2.field3987 >> 48 & 65535L) == (long)var0) {
				var2.method2269();
			}
		}

	}
}
