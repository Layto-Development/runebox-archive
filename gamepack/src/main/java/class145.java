import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "hz")
public class class145 extends class180 {
	@ObfInfo(name = "au", desc = "Lnu;")
	public static class437 field1440;
	@ObfInfo(name = "ae", desc = "Lnu;")
	public static class437 field1441;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 2017127235)
	public static int field1443;
	@ObfInfo(name = "at", desc = "Lle;")
	static class7 field1449;
	@ObfInfo(name = "ai", desc = "[I")
	int[] field1445;
	@ObfInfo(name = "ad", desc = "[I")
	int[] field1451;
	@ObfInfo(name = "af", desc = "[S")
	short[] field1442;
	@ObfInfo(name = "az", desc = "[S")
	short[] field1446;
	@ObfInfo(name = "ap", desc = "[S")
	short[] field1447;
	@ObfInfo(name = "aa", desc = "[S")
	short[] field1448;
	@ObfInfo(name = "aq", desc = "Z")
	public boolean field1450;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -194305975)
	public int field1444;

	static {
		field1449 = new class7(64);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class145() {
		this.field1444 = -1;
		this.field1451 = new int[]{-1, -1, -1, -1, -1};
		this.field1450 = false;
	}

	@ObfInfo(name = "ae", desc = "(Ltm;B)V", opaqueValue = "-115")
	void method841(class280 var1) {
		while (true) {
			int var3 = var1.method1492();
			if (var3 == 0) {
				return;
			}

			this.method840(var1, var3);
		}
	}

	@ObfInfo(name = "ao", desc = "(Ltm;II)V", opaqueValue = "1601852868")
	void method840(class280 var1, int var2) {
		if (var2 == 1) {
			this.field1444 = var1.method1492();
		} else {
			int var4;
			int var5;
			if (var2 == 2) {
				var4 = var1.method1492();
				this.field1445 = new int[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field1445[var5] = var1.method1541();
				}
			} else if (var2 == 3) {
				this.field1450 = true;
			} else if (var2 == 40) {
				var4 = var1.method1492();
				this.field1446 = new short[var4];
				this.field1447 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field1446[var5] = (short)var1.method1541();
					this.field1447[var5] = (short)var1.method1541();
				}
			} else if (var2 == 41) {
				var4 = var1.method1492();
				this.field1448 = new short[var4];
				this.field1442 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field1448[var5] = (short)var1.method1541();
					this.field1442[var5] = (short)var1.method1541();
				}
			} else if (var2 >= 60 && var2 < 70) {
				this.field1451[var2 - 60] = var1.method1541();
			}
		}

	}

	@ObfInfo(name = "at", desc = "(I)Z", opaqueValue = "656036233")
	public boolean method838() {
		if (null == this.field1445) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.field1445.length; ++var3) {
				if (!field1441.method2269(this.field1445[var3], 0)) {
					var2 = false;
				}
			}

			return var2;
		}
	}

	@ObfInfo(name = "ac", desc = "(B)Lic;", opaqueValue = "-1")
	public class445 method839() {
		if (this.field1445 == null) {
			return null;
		} else {
			class445[] var2 = new class445[this.field1445.length];

			for (int var3 = 0; var3 < this.field1445.length; ++var3) {
				var2[var3] = class445.method2341(field1441, this.field1445[var3], 0);
			}

			class445 var5;
			if (var2.length == 1) {
				var5 = var2[0];
			} else {
				var5 = new class445(var2, var2.length);
			}

			int var4;
			if (null != this.field1446) {
				for (var4 = 0; var4 < this.field1446.length; ++var4) {
					var5.method2340(this.field1446[var4], this.field1447[var4]);
				}
			}

			if (this.field1448 != null) {
				for (var4 = 0; var4 < this.field1448.length; ++var4) {
					var5.method2331(this.field1448[var4], this.field1442[var4]);
				}
			}

			return var5;
		}
	}

	@ObfInfo(name = "ai", desc = "(I)Z", opaqueValue = "-153460036")
	public boolean method843() {
		boolean var2 = true;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.field1451[var3] != -1 && !field1441.method2269(this.field1451[var3], 0)) {
				var2 = false;
			}
		}

		return var2;
	}

	@ObfInfo(name = "az", desc = "(I)Lic;", opaqueValue = "-1595711476")
	public class445 method842() {
		class445[] var2 = new class445[5];
		int var3 = 0;

		for (int var4 = 0; var4 < 5; ++var4) {
			if (this.field1451[var4] != -1) {
				var2[var3++] = class445.method2341(field1441, this.field1451[var4], 0);
			}
		}

		class445 var6 = new class445(var2, var3);
		int var5;
		if (this.field1446 != null) {
			for (var5 = 0; var5 < this.field1446.length; ++var5) {
				var6.method2340(this.field1446[var5], this.field1447[var5]);
			}
		}

		if (null != this.field1448) {
			for (var5 = 0; var5 < this.field1448.length; ++var5) {
				var6.method2331(this.field1448[var5], this.field1442[var5]);
			}
		}

		return var6;
	}

	@ObfInfo(name = "au", desc = "(II)Lhz;")
	public static class145 method845(int var0) {
		class145 var2 = (class145)field1449.method294((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field1440.method2267(3, var0);
			var2 = new class145();
			if (var3 != null) {
				var2.method841(new class280(var3));
			}

			field1449.method293(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(name = "ap", desc = "(B)V")
	public static void method844() {
		field1449.method291();
	}
}
