import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ux")
public final class class199 {
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1548627741)
	int field1808;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 2093770935)
	int field1809;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -147977437)
	int field1810;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 45081735)
	int field1813;
	@ObfInfo(name = "ac", desc = "[I")
	int[] field1811;
	@ObfInfo(name = "ai", desc = "[I")
	int[] field1812;

	@ObfInfo(name = "<init>", desc = "([I)V")
	public class199(int[] var1) {
		this.field1812 = new int[256];
		this.field1811 = new int[256];

		for (int var2 = 0; var2 < var1.length; ++var2) {
			this.field1811[var2] = var1[var2];
		}

		this.method1121();
	}

	@ObfInfo(name = "au", desc = "(I)I", opaqueValue = "-714646066")
	public final int method1118() {
		if (this.field1810 == 0) {
			this.method1120();
			this.field1810 = 256;
		}

		return this.field1811[--this.field1810];
	}

	@ObfInfo(name = "ae", desc = "(I)I", opaqueValue = "1374032282")
	public final int method1119() {
		if (this.field1810 == 0) {
			this.method1120();
			this.field1810 = 256;
		}

		return this.field1811[this.field1810 - 1];
	}

	@ObfInfo(name = "ao", desc = "(I)V", opaqueValue = "-1701367844")
	final void method1120() {
		this.field1808 += ++this.field1809;

		for (int var2 = 0; var2 < 256; ++var2) {
			int var3 = this.field1812[var2];
			if ((var2 & 2) == 0) {
				if ((var2 & 1) == 0) {
					this.field1813 ^= this.field1813 << 13;
				} else {
					this.field1813 ^= this.field1813 >>> 6;
				}
			} else if ((var2 & 1) == 0) {
				this.field1813 ^= this.field1813 << 2;
			} else {
				this.field1813 ^= this.field1813 >>> 16;
			}

			this.field1813 += this.field1812[var2 + 128 & 255];
			int var4;
			this.field1812[var2] = var4 = this.field1808 + this.field1812[(var3 & 1020) >> 2] + this.field1813;
			this.field1811[var2] = this.field1808 = this.field1812[(var4 >> 8 & 1020) >> 2] + var3;
		}

	}

	@ObfInfo(name = "at", desc = "(B)V", opaqueValue = "1")
	final void method1121() {
		int var10 = -1640531527;
		int var9 = -1640531527;
		int var8 = -1640531527;
		int var7 = -1640531527;
		int var6 = -1640531527;
		int var5 = -1640531527;
		int var4 = -1640531527;
		int var3 = -1640531527;

		int var2;
		for (var2 = 0; var2 < 4; ++var2) {
			var3 ^= var4 << 11;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 >>> 2;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 << 8;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 >>> 16;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 << 10;
			var10 += var7;
			var8 += var9;
			var8 ^= var9 >>> 4;
			var3 += var8;
			var9 += var10;
			var9 ^= var10 << 8;
			var4 += var9;
			var10 += var3;
			var10 ^= var3 >>> 9;
			var5 += var10;
			var3 += var4;
		}

		for (var2 = 0; var2 < 256; var2 += 8) {
			var3 += this.field1811[var2];
			var4 += this.field1811[var2 + 1];
			var5 += this.field1811[var2 + 2];
			var6 += this.field1811[var2 + 3];
			var7 += this.field1811[var2 + 4];
			var8 += this.field1811[var2 + 5];
			var9 += this.field1811[var2 + 6];
			var10 += this.field1811[var2 + 7];
			var3 ^= var4 << 11;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 >>> 2;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 << 8;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 >>> 16;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 << 10;
			var10 += var7;
			var8 += var9;
			var8 ^= var9 >>> 4;
			var3 += var8;
			var9 += var10;
			var9 ^= var10 << 8;
			var4 += var9;
			var10 += var3;
			var10 ^= var3 >>> 9;
			var5 += var10;
			var3 += var4;
			this.field1812[var2] = var3;
			this.field1812[var2 + 1] = var4;
			this.field1812[var2 + 2] = var5;
			this.field1812[var2 + 3] = var6;
			this.field1812[var2 + 4] = var7;
			this.field1812[var2 + 5] = var8;
			this.field1812[var2 + 6] = var9;
			this.field1812[var2 + 7] = var10;
		}

		for (var2 = 0; var2 < 256; var2 += 8) {
			var3 += this.field1812[var2];
			var4 += this.field1812[var2 + 1];
			var5 += this.field1812[var2 + 2];
			var6 += this.field1812[var2 + 3];
			var7 += this.field1812[var2 + 4];
			var8 += this.field1812[var2 + 5];
			var9 += this.field1812[var2 + 6];
			var10 += this.field1812[var2 + 7];
			var3 ^= var4 << 11;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 >>> 2;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 << 8;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 >>> 16;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 << 10;
			var10 += var7;
			var8 += var9;
			var8 ^= var9 >>> 4;
			var3 += var8;
			var9 += var10;
			var9 ^= var10 << 8;
			var4 += var9;
			var10 += var3;
			var10 ^= var3 >>> 9;
			var5 += var10;
			var3 += var4;
			this.field1812[var2] = var3;
			this.field1812[var2 + 1] = var4;
			this.field1812[var2 + 2] = var5;
			this.field1812[var2 + 3] = var6;
			this.field1812[var2 + 4] = var7;
			this.field1812[var2 + 5] = var8;
			this.field1812[var2 + 6] = var9;
			this.field1812[var2 + 7] = var10;
		}

		this.method1120();
		this.field1810 = 256;
	}
}
