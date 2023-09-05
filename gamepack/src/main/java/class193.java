import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "kj")
public class class193 implements class415 {
	@ObfInfo(name = "au", desc = "I", intMultiplier = 1792280127)
	int field1720;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -896878445)
	int field1721;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -746964345)
	int field1722;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -993644741)
	int field1723;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 1662310837)
	int field1724;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1810659993)
	int field1725;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -109610817)
	int field1726;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1299825047)
	int field1727;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 1410904803)
	int field1728;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1503844023)
	int field1729;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 1959218127)
	int field1730;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -699661283)
	int field1731;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 1890782763)
	int field1732;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1961552345)
	int field1733;

	@ObfInfo(name = "<init>", desc = "()V")
	class193() {
	}

	@ObfInfo(name = "au", desc = "(Ljf;I)V", opaqueValue = "-474032336")
	public void method2193(class305 var1) {
		if (var1.field2465 > this.field1724) {
			var1.field2465 = this.field1724;
		}

		if (var1.field2459 < this.field1724) {
			var1.field2459 = this.field1724;
		}

		if (var1.field2467 > this.field1732) {
			var1.field2467 = this.field1732;
		}

		if (var1.field2461 < this.field1732) {
			var1.field2461 = this.field1732;
		}

	}

	@ObfInfo(name = "ae", desc = "(IIII)Z", opaqueValue = "1293653198")
	public boolean method2188(int var1, int var2, int var3) {
		if (var1 >= this.field1720 && var1 < this.field1722 + this.field1720) {
			return var2 >= (this.field1726 << 6) + (this.field1721 << 3) && var2 <= (this.field1728 << 3) + (this.field1726 << 6) + 7 && var3 >= (this.field1727 << 3) + (this.field1730 << 6) && var3 <= (this.field1730 << 6) + (this.field1729 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ao", desc = "(IIB)Z", opaqueValue = "31")
	public boolean method2189(int var1, int var2) {
		return var1 >= (this.field1725 << 3) + (this.field1724 << 6) && var1 <= 7 + (this.field1724 << 6) + (this.field1723 << 3) && var2 >= (this.field1731 << 3) + (this.field1732 << 6) && var2 <= (this.field1732 << 6) + (this.field1733 << 3) + 7;
	}

	@ObfInfo(name = "at", desc = "(IIII)[I")
	public int[] method2191(int var1, int var2, int var3) {
		if (!this.method2188(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field1725 * 8 - this.field1721 * 8 + this.field1724 * 64 - this.field1726 * 64 + var2, var3 + (this.field1732 * 64 - this.field1730 * 64) + (this.field1731 * 8 - this.field1727 * 8)};
			return var5;
		}
	}

	@ObfInfo(name = "ac", desc = "(III)Lmc;", opaqueValue = "-1281040923")
	public class50 method2192(int var1, int var2) {
		if (!this.method2189(var1, var2)) {
			return null;
		} else {
			int var4 = this.field1726 * 64 - this.field1724 * 64 + var1 + (this.field1721 * 8 - this.field1725 * 8);
			int var5 = this.field1730 * 64 - this.field1732 * 64 + var2 + (this.field1727 * 8 - this.field1731 * 8);
			return new class50(this.field1720, var4, var5);
		}
	}

	@ObfInfo(name = "ai", desc = "(Ltm;B)V")
	public void method2190(class280 var1) {
		this.field1720 = var1.method1492();
		this.field1722 = var1.method1492();
		this.field1726 = var1.method1541();
		this.field1721 = var1.method1492();
		this.field1728 = var1.method1492();
		this.field1730 = var1.method1541();
		this.field1727 = var1.method1492();
		this.field1729 = var1.method1492();
		this.field1724 = var1.method1541();
		this.field1725 = var1.method1492();
		this.field1723 = var1.method1492();
		this.field1732 = var1.method1541();
		this.field1731 = var1.method1492();
		this.field1733 = var1.method1492();
		this.method1054();
	}

	@ObfInfo(name = "az", desc = "(I)V")
	void method1054() {
	}
}
