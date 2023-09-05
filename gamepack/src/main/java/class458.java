import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "jk")
public class class458 implements class65 {
	@ObfInfo(name = "ae", desc = "Low;")
	class113 field3724;
	@ObfInfo(name = "au", desc = "[Lif;")
	class182[] field3723;
	@ObfInfo(name = "az", desc = "Lnu;")
	class437 field3721;
	@ObfInfo(name = "ac", desc = "D")
	double field3722;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -997416033)
	int field3719;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1854212709)
	int field3720;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 1457440821)
	int field3725;

	@ObfInfo(name = "<init>", desc = "(Lnu;Lnu;IDI)V")
	public class458(class437 var1, class437 var2, int var3, double var4, int var6) {
		this.field3724 = new class113();
		this.field3720 = 0;
		this.field3722 = 1.0D;
		this.field3725 = 128;
		this.field3721 = var2;
		this.field3719 = var3;
		this.field3720 = this.field3719;
		this.field3722 = var4;
		this.field3725 = var6;
		int[] var7 = var1.method2278(0);
		if (var7 != null) {
			int var8 = var7.length;
			this.field3723 = new class182[var1.method2293(0)];

			for (int var9 = 0; var9 < var8; ++var9) {
				class280 var10 = new class280(var1.method2267(0, var7[var9]));
				this.field3723[var7[var9]] = new class182(var10);
			}
		} else {
			this.field3723 = new class182[0];
		}

	}

	@ObfInfo(name = "au", desc = "(B)I", opaqueValue = "1")
	public int method2384() {
		if (this.field3723.length == 0) {
			return 100;
		} else {
			int var2 = 0;
			int var3 = 0;
			class182[] var4 = this.field3723;

			for (int var5 = 0; var5 < var4.length; ++var5) {
				class182 var6 = var4[var5];
				if (var6 != null && var6.field1639 != null) {
					var2 += var6.field1639.length;
					int[] var7 = var6.field1639;

					for (int var8 = 0; var8 < var7.length; ++var8) {
						int var9 = var7[var8];
						if (this.field3721.method2270(var9)) {
							++var3;
						}
					}
				}
			}

			if (var2 == 0) {
				return 0;
			} else {
				return var3 * 100 / var2;
			}
		}
	}

	@ObfInfo(name = "ae", desc = "(D)V")
	public void method2385(double var1) {
		this.field3722 = var1;
		this.method2387();
	}

	@ObfInfo(name = "ao", desc = "(II)[I", opaqueValue = "124191567")
	public int[] method495(int var1) {
		class182 var3 = this.field3723[var1];
		if (null != var3) {
			if (var3.field1645 != null) {
				this.field3724.method632(var3);
				var3.field1644 = true;
				return var3.field1645;
			}

			boolean var4 = var3.method1028(this.field3722, this.field3725, this.field3721);
			if (var4) {
				if (this.field3720 == 0) {
					class182 var5 = (class182)this.field3724.method626();
					var5.method1026();
				} else {
					--this.field3720;
				}

				this.field3724.method632(var3);
				var3.field1644 = true;
				return var3.field1645;
			}
		}

		return null;
	}

	@ObfInfo(name = "at", desc = "(II)I", opaqueValue = "-1272197337")
	public int method492(int var1) {
		return this.field3723[var1] != null ? this.field3723[var1].field1637 : 0;
	}

	@ObfInfo(name = "ac", desc = "(IB)Z")
	public boolean method494(int var1) {
		return this.field3723[var1].field1638;
	}

	@ObfInfo(name = "ai", desc = "(II)Z", opaqueValue = "1736927364")
	public boolean method493(int var1) {
		return this.field3725 == 64;
	}

	@ObfInfo(name = "az", desc = "(I)V", opaqueValue = "-1655781551")
	public void method2387() {
		for (int var2 = 0; var2 < this.field3723.length; ++var2) {
			if (null != this.field3723[var2]) {
				this.field3723[var2].method1026();
			}
		}

		this.field3724 = new class113();
		this.field3720 = this.field3719;
	}

	@ObfInfo(name = "ap", desc = "(II)V", opaqueValue = "577047330")
	public void method2386(int var1) {
		for (int var3 = 0; var3 < this.field3723.length; ++var3) {
			class182 var4 = this.field3723[var3];
			if (null != var4 && var4.field1643 != 0 && var4.field1644) {
				var4.method1027(var1);
				var4.field1644 = false;
			}
		}

	}
}
