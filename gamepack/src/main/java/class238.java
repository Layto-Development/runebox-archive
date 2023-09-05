import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "rb")
public class class238 {
	@ObfInfo(name = "af", desc = "Lui;")
	static class150 field1988;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 377886279)
	public int field1984;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -1685027045)
	public int field1985;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -2074045623)
	public int field1986;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 1825313335)
	public int field1987;

	@ObfInfo(name = "<init>", desc = "(II)V")
	public class238(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfInfo(name = "<init>", desc = "(IIII)V")
	public class238(int var1, int var2, int var3, int var4) {
		this.method1249(var1, var2);
		this.method1250(var3, var4);
	}

	@ObfInfo(name = "au", desc = "(IIB)V")
	public void method1249(int var1, int var2) {
		this.field1987 = var1;
		this.field1985 = var2;
	}

	@ObfInfo(name = "ae", desc = "(IIB)V")
	public void method1250(int var1, int var2) {
		this.field1986 = var1;
		this.field1984 = var2;
	}

	@ObfInfo(name = "ao", desc = "(IIB)Z")
	public boolean method1251(int var1, int var2, byte var3) {
		boolean var10000;
		if (var1 >= this.field1987 && var1 < this.field1986 + this.field1987) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			if (var2 >= this.field1985) {
				if (var3 >= -1) {
					throw new IllegalStateException();
				}

				if (var2 < this.field1985 + this.field1984) {
					var10000 = true;
					return var10000;
				}
			}
		}

		var10000 = false;
		return var10000;
	}

	@ObfInfo(name = "toString", desc = "()Ljava/lang/String;")
	public String toString() {
		return null;
	}

	@ObfInfo(name = "at", desc = "(Lrb;Lrb;I)V")
	public void method1252(class238 var1, class238 var2) {
		this.method1253(var1, var2);
		this.method1254(var1, var2);
	}

	@ObfInfo(name = "ac", desc = "(Lrb;Lrb;I)V", opaqueValue = "-422176099")
	void method1253(class238 var1, class238 var2) {
		var2.field1987 = this.field1987;
		var2.field1986 = this.field1986;
		if (this.field1987 < var1.field1987) {
			var2.field1986 = (var2.field1986 * 2133643001 - (var1.field1987 * 2133643001 - this.field1987 * 2133643001)) * -2074045623;
			var2.field1987 = var1.field1987;
		}

		if (var2.method1255() > var1.method1255()) {
			var2.field1986 -= var2.method1255() - var1.method1255();
		}

		if (var2.field1986 < 0) {
			var2.field1986 = 0;
		}

	}

	@ObfInfo(name = "ai", desc = "(Lrb;Lrb;B)V", opaqueValue = "5")
	void method1254(class238 var1, class238 var2) {
		var2.field1985 = this.field1985;
		var2.field1984 = this.field1984;
		if (this.field1985 < var1.field1985) {
			var2.field1984 = (var2.field1984 * -584535177 - (var1.field1985 * -584535177 - this.field1985 * -584535177)) * 377886279;
			var2.field1985 = var1.field1985;
		}

		if (var2.method1257() > var1.method1257()) {
			var2.field1984 -= var2.method1257() - var1.method1257();
		}

		if (var2.field1984 < 0) {
			var2.field1984 = 0;
		}

	}

	@ObfInfo(name = "az", desc = "(B)I")
	int method1255() {
		return this.field1986 + this.field1987;
	}

	@ObfInfo(name = "ap", desc = "(I)I")
	int method1257() {
		return this.field1985 + this.field1984;
	}

	@ObfInfo(name = "nz", desc = "(Lmi;I)Z", opaqueValue = "-2754287")
	static final boolean method1256(class131 var0) {
		int var2 = var0.field1240;
		if (var2 == 205) {
			Client.field80 = 250;
			return true;
		} else {
			int var3;
			int var4;
			if (var2 >= 300 && var2 <= 313) {
				var3 = (var2 - 300) / 2;
				var4 = var2 & 1;
				Client.field313.method1127(var3, var4 == 1);
			}

			if (var2 >= 314 && var2 <= 323) {
				var3 = (var2 - 314) / 2;
				var4 = var2 & 1;
				Client.field313.method1128(var3, var4 == 1);
			}

			if (var2 == 324) {
				Client.field313.method1135(0);
			}

			if (var2 == 325) {
				Client.field313.method1135(1);
			}

			if (var2 == 326) {
				class121 var5 = class121.method689(class480.field3888, Client.field92.field2665);
				Client.field313.method1129(var5.field1141);
				Client.field92.method1821(var5);
				return true;
			} else {
				return false;
			}
		}
	}
}
