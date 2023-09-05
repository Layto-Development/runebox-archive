import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "jp")
public class class461 implements class415 {
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1601793997)
	int field3745;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -171385949)
	int field3746;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1752254321)
	int field3747;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -665302455)
	int field3748;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -1360390451)
	int field3749;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -2119149505)
	int field3750;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 1909255191)
	int field3751;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 989493471)
	int field3752;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 1680318827)
	int field3753;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -311203443)
	int field3754;

	@ObfInfo(name = "<init>", desc = "()V")
	class461() {
	}

	@ObfInfo(name = "au", desc = "(Ljf;I)V", opaqueValue = "-474032336")
	public void method2193(class305 var1) {
		if (var1.field2465 > this.field3752) {
			var1.field2465 = this.field3752;
		}

		if (var1.field2459 < this.field3753) {
			var1.field2459 = this.field3753;
		}

		if (var1.field2467 > this.field3746) {
			var1.field2467 = this.field3746;
		}

		if (var1.field2461 < this.field3745) {
			var1.field2461 = this.field3745;
		}

	}

	@ObfInfo(name = "ae", desc = "(IIII)Z", opaqueValue = "1293653198")
	public boolean method2188(int var1, int var2, int var3) {
		if (var1 >= this.field3751 && var1 < this.field3751 + this.field3754) {
			return var2 >> 6 >= this.field3747 && var2 >> 6 <= this.field3749 && var3 >> 6 >= this.field3748 && var3 >> 6 <= this.field3750;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ao", desc = "(IIB)Z", opaqueValue = "31")
	public boolean method2189(int var1, int var2) {
		return var1 >> 6 >= this.field3752 && var1 >> 6 <= this.field3753 && var2 >> 6 >= this.field3746 && var2 >> 6 <= this.field3745;
	}

	@ObfInfo(name = "at", desc = "(IIII)[I")
	public int[] method2191(int var1, int var2, int var3) {
		if (!this.method2188(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field3752 * 64 - this.field3747 * 64 + var2, this.field3746 * 64 - this.field3748 * 64 + var3};
			return var5;
		}
	}

	@ObfInfo(name = "ac", desc = "(III)Lmc;")
	public class50 method2192(int var1, int var2) {
		if (!this.method2189(var1, var2)) {
			return null;
		} else {
			int var4 = var1 + (this.field3747 * 64 - this.field3752 * 64);
			int var5 = var2 + (this.field3748 * 64 - this.field3746 * 64);
			return new class50(this.field3751, var4, var5);
		}
	}

	@ObfInfo(name = "ai", desc = "(Ltm;B)V")
	public void method2190(class280 var1) {
		this.field3751 = var1.method1492();
		this.field3754 = var1.method1492();
		this.field3747 = var1.method1541();
		this.field3748 = var1.method1541();
		this.field3749 = var1.method1541();
		this.field3750 = var1.method1541();
		this.field3752 = var1.method1541();
		this.field3746 = var1.method1541();
		this.field3753 = var1.method1541();
		this.field3745 = var1.method1541();
		this.method2394();
	}

	@ObfInfo(name = "az", desc = "(B)V")
	void method2394() {
	}

	@ObfInfo(name = "ny", desc = "(B)V")
	static final void method2395() {
		Client.field235 = Client.field29;
		class169.field1587 = true;
	}
}
