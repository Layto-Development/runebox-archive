public class class207 extends class310 {

	static class106 field1912;

	public int field1911;

	static {
		field1912 = new class106(64);
	}

	class207() {
		this.field1911 = 0;
	}

	void method1254(class187 var1) {
		while (true) {
			int var3 = var1.method1096();
			if (var3 == 0) {
				return;
			}
			this.method1255(var1, var3);
		}
	}

	void method1255(class187 var1, int var2) {
		if (var2 == 2) {
			this.field1911 = var1.method1145();
		}
	}

	public static void method1258(class338 var0) {
		class8.field27 = var0;
	}

	public static class207 method1257(int var0) {
		class207 var2 = (class207) field1912.method648((long) var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class8.field27.method1762(5, var0);
			var2 = new class207();
			if (var3 != null) {
				var2.method1254(new class187(var3));
			}
			field1912.method647(var2, (long) var0);
			return var2;
		}
	}

	static void method1256() {
		if (Client.field990) {
			class354 var1 = class354.method1857(class393.field3126, Client.field1066);
			if (null != var1 && var1.field2783 != null) {
				class165 var2 = new class165();
				var2.field1664 = var1;
				var2.field1667 = var1.field2783;
				class221.method1344(var2);
			}
			Client.field1032 = -1;
			Client.field990 = false;
			Client.method532(var1);
		}
	}
}
