import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "kp")
public abstract class class223 {
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 492608601)
	int field1941;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -2039666003)
	int field1942;
	@ObfInfo(name = "az", desc = "Lmc;")
	public final class50 field1939;
	@ObfInfo(name = "ap", desc = "Lmc;")
	public final class50 field1940;

	@ObfInfo(name = "<init>", desc = "(Lmc;Lmc;)V")
	class223(class50 var1, class50 var2) {
		this.field1940 = var1;
		this.field1939 = var2;
	}

	@ObfInfo(name = "ao", desc = "(I)Lkq;")
	abstract class465 method1213();

	@ObfInfo(name = "ac", desc = "(I)I")
	abstract int method1209();

	@ObfInfo(name = "at", desc = "(I)I")
	abstract int method1214();

	@ObfInfo(name = "ae", desc = "(I)I")
	public abstract int method1208();

	@ObfInfo(name = "bh", desc = "(III)Z", opaqueValue = "-2139794687")
	boolean method1207(int var1, int var2) {
		if (this.method1211(var1, var2)) {
			return true;
		} else {
			return this.method1212(var1, var2);
		}
	}

	@ObfInfo(name = "bj", desc = "(I)Z", opaqueValue = "751970943")
	boolean method1210() {
		return this.method1208() >= 0;
	}

	@ObfInfo(name = "bk", desc = "(III)Z", opaqueValue = "-1283166598")
	boolean method1211(int var1, int var2) {
		if (!this.method1210()) {
			return false;
		} else {
			class185 var4 = class185.method1044(this.method1208());
			int var5 = this.method1214();
			int var6 = this.method1209();
			switch(var4.field1691.field570) {
			case 0:
				if (var1 <= this.field1941 - var5 || var1 > this.field1941) {
					return false;
				}
				break;
			case 1:
				if (var1 < this.field1941 || var1 >= var5 + this.field1941) {
					return false;
				}
				break;
			case 2:
				if (var1 < this.field1941 - var5 / 2 || var1 > var5 / 2 + this.field1941) {
					return false;
				}
			}

			switch(var4.field1686.field2120) {
			case 0:
				if (var2 < this.field1942 - var6 / 2 || var2 > var6 / 2 + this.field1942) {
					return false;
				}
				break;
			case 1:
				if (var2 > this.field1942 - var6 && var2 <= this.field1942) {
					break;
				}

				return false;
			case 2:
				if (var2 < this.field1942 || var2 >= this.field1942 + var6) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfInfo(name = "bv", desc = "(III)Z", opaqueValue = "-2104218015")
	boolean method1212(int var1, int var2) {
		class465 var4 = this.method1213();
		if (null == var4) {
			return false;
		} else if (var1 >= this.field1941 - var4.field3765 / 2 && var1 <= var4.field3765 / 2 + this.field1941) {
			return var2 >= this.field1942 && var2 <= var4.field3763 + this.field1942;
		} else {
			return false;
		}
	}
}
