import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "uv")
public class class452 {
	@ObfInfo(name = "au", desc = "[I")
	static final int[] field3396;

	static {
		field3396 = new int[]{16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472};
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class452() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(ILjava/lang/String;Lon;IB)Lly;")
	public static class121 method2360(int var0, String var1, class67 var2, int var3) {
		class121 var5 = class121.method689(class480.field3864, Client.field92.field2665);
		var5.field1141.method1481(0);
		int var6 = var5.field1141.field2254;
		var5.field1141.method1481(var0);
		String var7 = var1.toLowerCase();
		int var8 = 0;
		byte[] var9 = null;
		if (var7.startsWith(class453.field3497)) {
			var8 = 0;
			var1 = var1.substring(class453.field3497.length());
		} else if (var7.startsWith(class453.field3588)) {
			var8 = 1;
			var1 = var1.substring(class453.field3588.length());
		} else if (var7.startsWith(class453.field3499)) {
			var8 = 2;
			var1 = var1.substring(class453.field3499.length());
		} else if (var7.startsWith(class453.field3590)) {
			var8 = 3;
			var1 = var1.substring(class453.field3590.length());
		} else if (var7.startsWith(class453.field3469)) {
			var8 = 4;
			var1 = var1.substring(class453.field3469.length());
		} else if (var7.startsWith(class453.field3592)) {
			var8 = 5;
			var1 = var1.substring(class453.field3592.length());
		} else if (var7.startsWith(class453.field3593)) {
			var8 = 6;
			var1 = var1.substring(class453.field3593.length());
		} else if (var7.startsWith(class453.field3404)) {
			var8 = 7;
			var1 = var1.substring(class453.field3404.length());
		} else if (var7.startsWith(class453.field3439)) {
			var8 = 8;
			var1 = var1.substring(class453.field3439.length());
		} else if (var7.startsWith(class453.field3461)) {
			var8 = 9;
			var1 = var1.substring(class453.field3461.length());
		} else if (var7.startsWith(class453.field3505)) {
			var8 = 10;
			var1 = var1.substring(class453.field3505.length());
		} else if (var7.startsWith(class453.field3598)) {
			var8 = 11;
			var1 = var1.substring(class453.field3598.length());
		} else if (var7.startsWith(class453.field3515)) {
			var8 = 12;
			var1 = var1.substring(class453.field3515.length());
		} else if (var7.startsWith(class453.field3600)) {
			var9 = method2359(var7);
			if (null != var9) {
				var8 = var9.length + 12;
				var1 = var1.substring(class453.field3600.length() + var9.length + 1);
			}
		}

		var7 = var1.toLowerCase();
		byte var10 = 0;
		if (var7.startsWith(class453.field3601)) {
			var10 = 1;
			var1 = var1.substring(class453.field3601.length());
		} else if (var7.startsWith(class453.field3602)) {
			var10 = 2;
			var1 = var1.substring(class453.field3602.length());
		} else if (var7.startsWith(class453.field3451)) {
			var10 = 3;
			var1 = var1.substring(class453.field3451.length());
		} else if (var7.startsWith(class453.field3604)) {
			var10 = 4;
			var1 = var1.substring(class453.field3604.length());
		} else if (var7.startsWith(class453.field3488)) {
			var10 = 5;
			var1 = var1.substring(class453.field3488.length());
		}

		var5.field1141.method1481(var8);
		var5.field1141.method1481(var10);
		if (null != var9 && Client.field209 >= 214) {
			for (int var11 = 0; var11 < var9.length; ++var11) {
				var5.field1141.method1481(var9[var11]);
			}
		}

		class217.method1201(var5.field1141, var1);
		if (var0 == class283.field2271.method2222()) {
			var5.field1141.method1481(var3);
		}

		var5.field1141.method1490(var5.field1141.field2254 - var6);
		return var5;
	}

	@ObfInfo(name = "ae", desc = "(Ljava/lang/String;I)[B")
	static byte[] method2359(String var0) {
		boolean var2 = true;
		boolean var3 = true;
		int var4 = class453.field3600.length();
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
				var8 = (char)(var8 - '0');
			} else {
				if (var8 < 'a' || var8 > 'z') {
					return null;
				}

				var8 = (char)(var8 - 'W');
			}

			var6[var5++] = (byte)var8;
		}
	}

	@ObfInfo(name = "ao", desc = "([BI)[I")
	public static int[] method2361(byte[] var0) {
		if (var0 != null && var0.length != 0 && var0.length <= 8) {
			int[] var2 = new int[var0.length];

			for (int var3 = 0; var3 < var0.length; ++var3) {
				if (var0[var3] < 0 || var0[var3] > field3396.length) {
					return null;
				}

				var2[var3] = field3396[var0[var3]];
			}

			return var2;
		} else {
			return null;
		}
	}
}
