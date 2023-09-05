import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "iu")
public class class188 extends class155 {
	@ObfInfo(name = "dl", desc = "Luk;")
	static class398 field1714;
	@ObfInfo(name = "af", desc = "Lim;")
	class38 field1713;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 759892495)
	int field1709;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 766318001)
	int field1710;
	@ObfInfo(name = "ap", desc = "[I")
	int[] field1711;
	@ObfInfo(name = "aa", desc = "[[I")
	int[][] field1712;

	@ObfInfo(name = "<init>", desc = "(I[B)V")
	public class188(int var1, byte[] var2) {
		this.field1709 = var1;
		class280 var3 = new class280(var2);
		this.field1710 = var3.method1492();
		this.field1711 = new int[this.field1710];
		this.field1712 = new int[this.field1710][];

		int var4;
		for (var4 = 0; var4 < this.field1710; ++var4) {
			this.field1711[var4] = var3.method1492();
		}

		for (var4 = 0; var4 < this.field1710; ++var4) {
			this.field1712[var4] = new int[var3.method1492()];
		}

		for (var4 = 0; var4 < this.field1710; ++var4) {
			for (int var5 = 0; var5 < this.field1712[var4].length; ++var5) {
				this.field1712[var4][var5] = var3.method1492();
			}
		}

		if (var3.field2254 < var3.field2252.length) {
			var4 = var3.method1541();
			if (var4 > 0) {
				this.field1713 = new class38(var3, var4);
			}
		}

	}

	@ObfInfo(name = "au", desc = "(I)I")
	public int method1046() {
		return this.field1710;
	}

	@ObfInfo(name = "ae", desc = "(I)Lim;")
	public class38 method1045() {
		return this.field1713;
	}
}
