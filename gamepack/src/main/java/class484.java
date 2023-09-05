import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "qe")
public class class484 {
	@ObfInfo(name = "ag", desc = "[I")
	static int[] field3944;

	@ObfInfo(name = "<init>", desc = "()V")
	class484() throws Throwable {
	}

	@ObfInfo(name = "ia", desc = "(III)V", opaqueValue = "-740003129")
	static final void method2453(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (class91.field926 < var0) {
			class91.field926 += class185.field1689 * (var0 - class91.field926) / 1000 + class117.field1121;
			if (class91.field926 > var0) {
				class91.field926 = var0;
			}
		} else if (class91.field926 > var0) {
			class91.field926 -= class117.field1121 + (class91.field926 - var0) * class185.field1689 / 1000;
			if (class91.field926 < var0) {
				class91.field926 = var0;
			}
		}

		var1 &= 2047;
		int var3 = var1 - class181.field1636;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 > 0) {
			class181.field1636 += var3 * class185.field1689 / 1000 + class117.field1121;
			class181.field1636 &= 2047;
		} else if (var3 < 0) {
			class181.field1636 -= -var3 * class185.field1689 / 1000 + class117.field1121;
			class181.field1636 &= 2047;
		}

		int var4 = var1 - class181.field1636;
		if (var4 > 1024) {
			var4 -= 2048;
		} else if (var4 < -1024) {
			var4 += 2048;
		}

		if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
			class181.field1636 = var1;
		}

	}
}
