import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "dv")
public final class class296 extends class155 {
	@ObfInfo(name = "ub", desc = "I", intMultiplier = 596737307)
	static int field2388;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 1068935697)
	int field2387;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1851896147)
	int field2389;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 757477475)
	int field2390;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 2102589387)
	int field2391;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -77659419)
	int field2392;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -517961703)
	int field2393;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -762118645)
	int field2394;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -29963369)
	int field2395;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -61676879)
	int field2396;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -1398168629)
	int field2397;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1120217811)
	int field2398;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = -649567293)
	int field2399;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -359817879)
	int field2400;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -1211585979)
	int field2401;

	@ObfInfo(name = "<init>", desc = "()V")
	class296() {
		this.field2397 = 31;
		this.field2398 = 0;
		this.field2399 = -1;
	}

	@ObfInfo(name = "au", desc = "(II)V")
	void method1636(int var1) {
		this.field2397 = var1;
	}

	@ObfInfo(name = "ae", desc = "(II)Z", opaqueValue = "-1725061454")
	boolean method1637(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field2397 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfInfo(name = "au", desc = "(J)V")
	public static final void method1638(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				class297.method1639(var0 - 1L);
				class297.method1639(1L);
			} else {
				class297.method1639(var0);
			}

		}
	}
}
