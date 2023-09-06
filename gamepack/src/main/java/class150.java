public class class150 implements class367 {
	static class169 field1402;
	static final class150 field1403;
	static final class150 field1404;
	static final class150 field1405;
	static final class150 field1406;
	static final class150 field1409;
	static final class150 field1410;
	final int field1407;
	final int field1408;

	static {
		field1410 = new class150(0, -1);
		field1403 = new class150(1, 2);
		field1404 = new class150(2, 3);
		field1405 = new class150(3, 4);
		field1409 = new class150(4, 5);
		field1406 = new class150(5, 6);
	}

	class150(int var1, int var2) {
		this.field1407 = var1;
		this.field1408 = var2;
	}

	public int method1970() {
		return this.field1408;
	}

	public static class375 method861(int var0) {
		class375 var2 = (class375)class375.field3146.method1890((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class375.field3144.method1212(9, var0);
			var2 = new class375();
			var2.field3148 = var0;
			if (null != var3) {
				var2.method1997(new class42(var3), (byte)61);
			}

			var2.method1996();
			class375.field3146.method1889(var2, (long)var0);
			return var2;
		}
	}
}
