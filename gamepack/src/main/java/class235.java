import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ky")
public class class235 implements class415 {
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -346385577)
	int field1970;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 2137123145)
	int field1971;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 993818461)
	int field1972;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 1041584515)
	int field1973;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 192640145)
	int field1974;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 588126651)
	int field1975;

	@ObfInfo(name = "<init>", desc = "()V")
	class235() {
	}

	@ObfInfo(name = "au", desc = "(Ljf;I)V", opaqueValue = "-474032336")
	public void method2193(class305 var1) {
		if (var1.field2465 > this.field1975) {
			var1.field2465 = this.field1975;
		}

		if (var1.field2459 < this.field1975) {
			var1.field2459 = this.field1975;
		}

		if (var1.field2467 > this.field1970) {
			var1.field2467 = this.field1970;
		}

		if (var1.field2461 < this.field1970) {
			var1.field2461 = this.field1970;
		}

	}

	@ObfInfo(name = "ae", desc = "(IIII)Z", opaqueValue = "1293653198")
	public boolean method2188(int var1, int var2, int var3) {
		if (var1 >= this.field1972 && var1 < this.field1972 + this.field1974) {
			return this.field1971 == var2 >> 6 && this.field1973 == var3 >> 6;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ao", desc = "(IIB)Z", opaqueValue = "31")
	public boolean method2189(int var1, int var2) {
		return var1 >> 6 == this.field1975 && var2 >> 6 == this.field1970;
	}

	@ObfInfo(name = "at", desc = "(IIII)[I", opaqueValue = "-181167712")
	public int[] method2191(int var1, int var2, int var3) {
		if (!this.method2188(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field1975 * 64 - this.field1971 * 64 + var2, var3 + (this.field1970 * 64 - this.field1973 * 64)};
			return var5;
		}
	}

	@ObfInfo(name = "ac", desc = "(III)Lmc;", opaqueValue = "-1281040923")
	public class50 method2192(int var1, int var2) {
		if (!this.method2189(var1, var2)) {
			return null;
		} else {
			int var4 = this.field1971 * 64 - this.field1975 * 64 + var1;
			int var5 = this.field1973 * 64 - this.field1970 * 64 + var2;
			return new class50(this.field1972, var4, var5);
		}
	}

	@ObfInfo(name = "ai", desc = "(Ltm;B)V")
	public void method2190(class280 var1) {
		this.field1972 = var1.method1492();
		this.field1974 = var1.method1492();
		this.field1971 = var1.method1541();
		this.field1973 = var1.method1541();
		this.field1975 = var1.method1541();
		this.field1970 = var1.method1541();
		this.method1238();
	}

	@ObfInfo(name = "az", desc = "(B)V")
	void method1238() {
	}
}
