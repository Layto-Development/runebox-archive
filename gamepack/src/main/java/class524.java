import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "fu")
public class class524 {
	@ObfInfo(name = "fa", desc = "Lnk;")
	static class505 field4197;
	@ObfInfo(name = "cd", desc = "Lon;")
	static class67 field4196;
	@ObfInfo(name = "au", desc = "B")
	public byte field4199;
	@ObfInfo(name = "ao", desc = "Luc;")
	public class353 field4198;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 1687463019)
	public int field4200;

	@ObfInfo(name = "<init>", desc = "()V")
	class524() {
	}

	@ObfInfo(name = "iu", desc = "(Ldr;I)V", opaqueValue = "897334566")
	static final void method2557(class114 var0) {
		int var3;
		int var4;
		int var5;
		int var7;
		if (var0.field1066 != -1) {
			Object var2 = null;
			var3 = 65536;
			if (var0.field1066 < var3) {
				var2 = Client.field87[var0.field1066];
			} else {
				var2 = Client.field200[var0.field1066 - var3];
			}

			if (var2 != null) {
				var4 = var0.field1061 - ((class114)var2).field1061;
				var5 = var0.field1032 - ((class114)var2).field1032;
				if (var4 != 0 || var5 != 0) {
					var7 = (int)(Math.atan2((double)var4, (double)var5) * 325.94932345220167D) & 2047;
					var0.field1072 = var7;
				}
			} else if (var0.field1036) {
				var0.field1066 = -1;
				var0.field1036 = false;
			}
		}

		int var8;
		if (var0.field1079 == 0 || var0.field1105 > 0) {
			var8 = -1;
			if (var0.field1069 != -1 && var0.field1070 != -1) {
				var3 = 64 + (var0.field1069 * 128 - class265.field2147 * 128);
				var4 = var0.field1070 * 128 - class508.field4092 * 128 + 64;
				var5 = var0.field1061 - var3;
				int var6 = var0.field1032 - var4;
				if (var5 != 0 || var6 != 0) {
					var7 = (int)(Math.atan2((double)var5, (double)var6) * 325.94932345220167D) & 2047;
					var8 = var7;
				}
			} else if (var0.field1068 != -1) {
				var8 = var0.field1068;
			}

			if (var8 != -1) {
				var0.field1072 = var8;
				if (var0.field1071) {
					var0.field1033 = var0.field1072;
				}
			}

			var0.method643();
		}

		var8 = var0.field1072 - var0.field1033 & 2047;
		if (var8 != 0) {
			boolean var9 = true;
			boolean var10 = true;
			++var0.field1073;
			var5 = var8 > 1024 ? -1 : 1;
			var0.field1033 += var0.field1100 * var5;
			boolean var11 = true;
			if (var8 < var0.field1100 || var8 > 2048 - var0.field1100) {
				var0.field1033 = var0.field1072;
				var11 = false;
			}

			if (var0.field1100 > 0 && var0.field1044 == var0.field1037 && (var0.field1073 > 25 || var11)) {
				if (var5 == -1 && var0.field1038 != -1) {
					var0.field1044 = var0.field1038;
				} else if (var5 == 1 && var0.field1099 != -1) {
					var0.field1044 = var0.field1099;
				} else {
					var0.field1044 = var0.field1040;
				}
			}

			var0.field1033 &= 2047;
		} else {
			if (var0.field1036) {
				var0.field1066 = -1;
				var0.field1036 = false;
			}

			var0.field1073 = 0;
		}

	}
}
