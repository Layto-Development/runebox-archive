import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "dm")
public class class401 extends class155 {
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -74001321)
	public static int field3121;
	@ObfInfo(name = "mn", desc = "I", intMultiplier = 1873768041)
	static int field3120;
	@ObfInfo(name = "ls", desc = "I", intMultiplier = 860411603)
	static int field3122;
	@ObfInfo(name = "ao", desc = "Lhl;")
	class468 field3118;
	@ObfInfo(name = "at", desc = "Loc;")
	class471 field3119;

	@ObfInfo(name = "<init>", desc = "(Lhl;)V")
	class401(class468 var1) {
		this.field3119 = new class471();
		this.field3118 = var1;
	}

	@ObfInfo(name = "au", desc = "(IIIIB)V", opaqueValue = "0")
	void method2119(int var1, int var2, int var3, int var4) {
		class209 var6 = null;
		int var7 = 0;

		for (class209 var8 = (class209)this.field3119.method2423(); var8 != null; var8 = (class209)this.field3119.method2419()) {
			++var7;
			if (var8.field1871 == var1) {
				var8.method1159(var1, var2, var3, var4);
				return;
			}

			if (var8.field1871 <= var1) {
				var6 = var8;
			}
		}

		if (null == var6) {
			if (var7 < 4) {
				this.field3119.method2426(new class209(var1, var2, var3, var4));
			}

		} else {
			class471.method2424(new class209(var1, var2, var3, var4), var6);
			if (var7 >= 4) {
				this.field3119.method2423().method907();
			}

		}
	}

	@ObfInfo(name = "ae", desc = "(IB)Ldo;", opaqueValue = "2")
	class209 method2120(int var1) {
		class209 var3 = (class209)this.field3119.method2423();
		if (null != var3 && var3.field1871 <= var1) {
			for (class209 var4 = (class209)this.field3119.method2419(); null != var4 && var4.field1871 <= var1; var4 = (class209)this.field3119.method2419()) {
				var3.method907();
				var3 = var4;
			}

			if (var3.field1871 + var3.field1869 + this.field3118.field3777 > var1) {
				return var3;
			} else {
				var3.method907();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfInfo(name = "ao", desc = "(B)Z")
	boolean method2121() {
		return this.field3119.method2421();
	}
}
