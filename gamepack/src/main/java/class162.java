public class class162 {

	static class13 field1646;

	static class267 field1645;

	public byte field1648;

	public class78 field1647;

	public int field1649;

	class162() {
	}

	static final void method960(class54 var0) {
		int var3;
		int var4;
		int var5;
		int var7;
		if (var0.field277 != -1) {
			Object var2 = null;
			var3 = 65536;
			if (var0.field277 < 65536) {
				var2 = Client.field958[var0.field277];
			} else {
				var2 = Client.field1071[var0.field277 - 65536];
			}
			if (var2 != null) {
				var4 = var0.field272 - ((class54) var2).field272;
				var5 = var0.field243 - ((class54) var2).field243;
				if (var4 != 0 || var5 != 0) {
					var7 = (int) (Math.atan2((double) var4, (double) var5) * 325.94932345220167D) & 2047;
					var0.field283 = var7;
				}
			} else if (var0.field247) {
				var0.field277 = -1;
				var0.field247 = false;
			}
		}
		int var8;
		if (var0.field290 == 0 || var0.field316 > 0) {
			var8 = -1;
			if (var0.field280 != -1 && var0.field281 != -1) {
				var3 = 64 + (var0.field280 * 128 - class346.field2624 * 128);
				var4 = var0.field281 * 128 - class211.field1922 * 128 + 64;
				var5 = var0.field272 - var3;
				int var6 = var0.field243 - var4;
				if (var5 != 0 || var6 != 0) {
					var7 = (int) (Math.atan2((double) var5, (double) var6) * 325.94932345220167D) & 2047;
					var8 = var7;
				}
			} else if (var0.field279 != -1) {
				var8 = var0.field279;
			}
			if (var8 != -1) {
				var0.field283 = var8;
				if (var0.field282) {
					var0.field244 = var0.field283;
				}
			}
			var0.method226();
		}
		var8 = var0.field283 - var0.field244 & 2047;
		if (var8 != 0) {
			boolean var9 = true;
			boolean var10 = true;
			++var0.field284;
			var5 = var8 > 1024 ? -1 : 1;
			var0.field244 += var0.field311 * var5;
			boolean var11 = true;
			if (var8 < var0.field311 || var8 > 2048 - var0.field311) {
				var0.field244 = var0.field283;
				var11 = false;
			}
			if (var0.field311 > 0 && var0.field255 == var0.field248 && (var0.field284 > 25 || var11)) {
				if (var5 == -1 && var0.field249 != -1) {
					var0.field255 = var0.field249;
				} else if (var5 == 1 && var0.field310 != -1) {
					var0.field255 = var0.field310;
				} else {
					var0.field255 = var0.field251;
				}
			}
			var0.field244 &= 2047;
		} else {
			if (var0.field247) {
				var0.field277 = -1;
				var0.field247 = false;
			}
			var0.field284 = 0;
		}
	}
}
