import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ij")
public class class286 {
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1394945579)
	int field2279;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 190927925)
	int field2280;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1383698847)
	final int field2281;
	@ObfInfo(name = "ai", desc = "[I")
	final int[] field2277;
	@ObfInfo(name = "ac", desc = "[I")
	final int[] field2283;
	@ObfInfo(name = "ae", desc = "[[I")
	final int[][] field2278;
	@ObfInfo(name = "au", desc = "[[I")
	final int[][] field2282;

	@ObfInfo(name = "<init>", desc = "(II)V")
	public class286(int var1, int var2) {
		this.field2282 = new int[var1][var2];
		this.field2278 = new int[var1][var2];
		int var3 = var1 * var2;
		int var4 = class497.method2492(var3 / 4);
		this.field2283 = new int[var4];
		this.field2277 = new int[var4];
		this.field2281 = var4 - 1;
	}

	@ObfInfo(name = "au", desc = "(B)V", opaqueValue = "63")
	void method1584() {
		for (int var2 = 0; var2 < this.field2282.length; ++var2) {
			for (int var3 = 0; var3 < this.field2282[var2].length; ++var3) {
				this.field2282[var2][var3] = 0;
				this.field2278[var2][var3] = 99999999;
			}
		}

	}

	@ObfInfo(name = "ae", desc = "(III)V")
	void method1574(int var1, int var2) {
		this.field2279 = var1;
		this.field2280 = var2;
	}

	@ObfInfo(name = "ao", desc = "(B)I")
	int method1575() {
		return this.field2279;
	}

	@ObfInfo(name = "at", desc = "(B)I")
	int method1576() {
		return this.field2280;
	}

	@ObfInfo(name = "ac", desc = "(I)I")
	int method1577() {
		return this.field2282.length;
	}

	@ObfInfo(name = "ai", desc = "(B)I")
	int method1582() {
		return this.field2282[0].length;
	}

	@ObfInfo(name = "az", desc = "(I)[[I")
	int[][] method1583() {
		return this.field2282;
	}

	@ObfInfo(name = "ap", desc = "(I)[[I")
	int[][] method1578() {
		return this.field2278;
	}

	@ObfInfo(name = "aa", desc = "(I)[I")
	int[] method1579() {
		return this.field2283;
	}

	@ObfInfo(name = "af", desc = "(I)[I")
	int[] method1580() {
		return this.field2277;
	}

	@ObfInfo(name = "ad", desc = "(B)I")
	int method1581() {
		return this.field2281;
	}
}
