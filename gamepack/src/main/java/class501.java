import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "kb")
public class class501 implements class415 {
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -2129815779)
	int field4041;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -1872540819)
	int field4042;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -120285101)
	int field4043;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -300833613)
	int field4044;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -660080113)
	int field4045;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -232289343)
	int field4046;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 104005691)
	int field4047;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -785068803)
	int field4048;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1582215601)
	int field4049;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1693090715)
	int field4050;

	@ObfInfo(name = "<init>", desc = "()V")
	class501() {
	}

	@ObfInfo(name = "au", desc = "(Ljf;I)V", opaqueValue = "-474032336")
	public void method2193(class305 var1) {
		if (var1.field2465 > this.field4045) {
			var1.field2465 = this.field4045;
		}

		if (var1.field2459 < this.field4045) {
			var1.field2459 = this.field4045;
		}

		if (var1.field2467 > this.field4046) {
			var1.field2467 = this.field4046;
		}

		if (var1.field2461 < this.field4046) {
			var1.field2461 = this.field4046;
		}

	}

	@ObfInfo(name = "ae", desc = "(IIII)Z", opaqueValue = "1293653198")
	public boolean method2188(int var1, int var2, int var3) {
		if (var1 >= this.field4048 && var1 < this.field4048 + this.field4041) {
			return var2 >= (this.field4043 << 3) + (this.field4050 << 6) && var2 <= (this.field4050 << 6) + (this.field4043 << 3) + 7 && var3 >= (this.field4044 << 6) + (this.field4047 << 3) && var3 <= (this.field4044 << 6) + (this.field4047 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ao", desc = "(IIB)Z", opaqueValue = "31")
	public boolean method2189(int var1, int var2) {
		return var1 >= (this.field4045 << 6) + (this.field4042 << 3) && var1 <= (this.field4042 << 3) + (this.field4045 << 6) + 7 && var2 >= (this.field4046 << 6) + (this.field4049 << 3) && var2 <= (this.field4049 << 3) + (this.field4046 << 6) + 7;
	}

	@ObfInfo(name = "at", desc = "(IIII)[I", opaqueValue = "-181167712")
	public int[] method2191(int var1, int var2, int var3) {
		if (!this.method2188(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{var2 + (this.field4045 * 64 - this.field4050 * 64) + (this.field4042 * 8 - this.field4043 * 8), this.field4049 * 8 - this.field4047 * 8 + this.field4046 * 64 - this.field4044 * 64 + var3};
			return var5;
		}
	}

	@ObfInfo(name = "ac", desc = "(III)Lmc;", opaqueValue = "-1281040923")
	public class50 method2192(int var1, int var2) {
		if (!this.method2189(var1, var2)) {
			return null;
		} else {
			int var4 = this.field4050 * 64 - this.field4045 * 64 + var1 + (this.field4043 * 8 - this.field4042 * 8);
			int var5 = this.field4047 * 8 - this.field4049 * 8 + var2 + (this.field4044 * 64 - this.field4046 * 64);
			return new class50(this.field4048, var4, var5);
		}
	}

	@ObfInfo(name = "ai", desc = "(Ltm;B)V")
	public void method2190(class280 var1) {
		this.field4048 = var1.method1492();
		this.field4041 = var1.method1492();
		this.field4050 = var1.method1541();
		this.field4043 = var1.method1492();
		this.field4044 = var1.method1541();
		this.field4047 = var1.method1492();
		this.field4045 = var1.method1541();
		this.field4042 = var1.method1492();
		this.field4046 = var1.method1541();
		this.field4049 = var1.method1492();
		this.method2496();
	}

	@ObfInfo(name = "az", desc = "(I)V")
	void method2496() {
	}
}
