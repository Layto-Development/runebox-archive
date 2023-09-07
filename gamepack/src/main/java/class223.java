public class class223 {

	static final int[] field1984;

	static {
		field1984 = new int[] { 16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472 };
	}

	class223() throws Throwable {
	}

	public static class457 method1358(int var0, String var1, class267 var2, int var3) {
		class457 var5 = class457.method2237(class483.field3827, Client.field963.field1603);
		var5.field3487.method1085(0);
		int var6 = var5.field3487.field1832;
		var5.field3487.method1085(var0);
		String var7 = var1.toLowerCase();
		int var8 = 0;
		byte[] var9 = null;
		if (var7.startsWith(class55.field419)) {
			var8 = 0;
			var1 = var1.substring(class55.field419.length());
		} else if (var7.startsWith(class55.field510)) {
			var8 = 1;
			var1 = var1.substring(class55.field510.length());
		} else if (var7.startsWith(class55.field421)) {
			var8 = 2;
			var1 = var1.substring(class55.field421.length());
		} else if (var7.startsWith(class55.field512)) {
			var8 = 3;
			var1 = var1.substring(class55.field512.length());
		} else if (var7.startsWith(class55.field391)) {
			var8 = 4;
			var1 = var1.substring(class55.field391.length());
		} else if (var7.startsWith(class55.field514)) {
			var8 = 5;
			var1 = var1.substring(class55.field514.length());
		} else if (var7.startsWith(class55.field515)) {
			var8 = 6;
			var1 = var1.substring(class55.field515.length());
		} else if (var7.startsWith(class55.field326)) {
			var8 = 7;
			var1 = var1.substring(class55.field326.length());
		} else if (var7.startsWith(class55.field361)) {
			var8 = 8;
			var1 = var1.substring(class55.field361.length());
		} else if (var7.startsWith(class55.field383)) {
			var8 = 9;
			var1 = var1.substring(class55.field383.length());
		} else if (var7.startsWith(class55.field427)) {
			var8 = 10;
			var1 = var1.substring(class55.field427.length());
		} else if (var7.startsWith(class55.field520)) {
			var8 = 11;
			var1 = var1.substring(class55.field520.length());
		} else if (var7.startsWith(class55.field437)) {
			var8 = 12;
			var1 = var1.substring(class55.field437.length());
		} else if (var7.startsWith(class55.field522)) {
			var9 = method1357(var7);
			if (null != var9) {
				var8 = var9.length + 12;
				var1 = var1.substring(class55.field522.length() + var9.length + 1);
			}
		}
		var7 = var1.toLowerCase();
		byte var10 = 0;
		if (var7.startsWith(class55.field523)) {
			var10 = 1;
			var1 = var1.substring(class55.field523.length());
		} else if (var7.startsWith(class55.field524)) {
			var10 = 2;
			var1 = var1.substring(class55.field524.length());
		} else if (var7.startsWith(class55.field373)) {
			var10 = 3;
			var1 = var1.substring(class55.field373.length());
		} else if (var7.startsWith(class55.field526)) {
			var10 = 4;
			var1 = var1.substring(class55.field526.length());
		} else if (var7.startsWith(class55.field410)) {
			var10 = 5;
			var1 = var1.substring(class55.field410.length());
		}
		var5.field3487.method1085(var8);
		var5.field3487.method1085(var10);
		if (null != var9 && Client.field1080 >= 214) {
			for (int var11 = 0; var11 < var9.length; ++var11) {
				var5.field3487.method1085(var9[var11]);
			}
		}
		class291.method1576(var5.field3487, var1);
		if (var0 == class415.field3224.method1362()) {
			var5.field3487.method1085(var3);
		}
		var5.field3487.method1094(var5.field3487.field1832 - var6);
		return var5;
	}

	static byte[] method1357(String var0) {
		boolean var2 = true;
		boolean var3 = true;
		int var4 = class55.field522.length();
		int var5 = 0;
		byte[] var6 = new byte[8];
		while (true) {
			int var7 = var5 + var4;
			if (var7 >= var0.length()) {
				return null;
			}
			char var8 = var0.charAt(var7);
			if (var8 == ':') {
				if (var5 == 0) {
					return null;
				}
				byte[] var9 = new byte[var5];
				System.arraycopy(var6, 0, var9, 0, var5);
				return var9;
			}
			if (var6.length == var5) {
				return null;
			}
			if (var8 >= '0' && var8 <= '9') {
				var8 = (char) (var8 - '0');
			} else {
				if (var8 < 'a' || var8 > 'z') {
					return null;
				}
				var8 = (char) (var8 - 'W');
			}
			var6[var5++] = (byte) var8;
		}
	}

	public static int[] method1359(byte[] var0) {
		if (var0 != null && var0.length != 0 && var0.length <= 8) {
			int[] var2 = new int[var0.length];
			for (int var3 = 0; var3 < var0.length; ++var3) {
				if (var0[var3] < 0 || var0[var3] > field1984.length) {
					return null;
				}
				var2[var3] = field1984[var0[var3]];
			}
			return var2;
		} else {
			return null;
		}
	}
}
