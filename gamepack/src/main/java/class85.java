public class class85 extends class502 {
	class85() {
	}

	protected boolean method2421(int var1, int var2, int var3, class76 var4) {
		return super.field4162 == var2 && var3 == super.field4161;
	}

	static int method557(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1 + (var0 & 65408);
		}
	}

	public static class243 method555(int var0) {
		class243 var2 = (class243)class243.field2216.method1890((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class243.field2217.method1212(16, var0);
			var2 = new class243();
			if (null != var3) {
				var2.method1388(new class42(var3));
			}

			class243.field2216.method1889(var2, (long)var0);
			return var2;
		}
	}

	public static class160 method556(class129 var0, class126 var1) {
		class160 var3 = class464.method2275((byte)-1);
		var3.field1478 = var0;
		var3.field1479 = var0.field1246;
		if (var3.field1479 == -1) {
			var3.field1483 = new class347(260);
		} else if (var3.field1479 == -2) {
			var3.field1483 = new class347(10000);
		} else if (var3.field1479 <= 18) {
			var3.field1483 = new class347(20);
		} else if (var3.field1479 <= 98) {
			var3.field1483 = new class347(100);
		} else {
			var3.field1483 = new class347(260);
		}

		var3.field1483.method1897(var1);
		var3.field1483.method1899(var3.field1478.field1195);
		var3.field1480 = 0;
		return var3;
	}

	static boolean method558(class215 var0, int var1, int var2) {
		byte[] var4 = var0.method1212(var1, var2);
		if (null == var4) {
			return false;
		} else {
			class429.method2186(var4);
			return true;
		}
	}
}
