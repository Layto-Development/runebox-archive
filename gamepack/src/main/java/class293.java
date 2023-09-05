import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "bi")
public class class293 {
	@ObfInfo(name = "dd", desc = "[Luk;")
	static class398[] field2379;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 1529858789)
	static int field2375;
	@ObfInfo(name = "ao", desc = "Lso;")
	class405 field2377;
	@ObfInfo(name = "ae", desc = "Lnu;")
	class437 field2376;
	@ObfInfo(name = "au", desc = "Lnu;")
	class437 field2378;

	@ObfInfo(name = "<init>", desc = "(Lnu;Lnu;)V")
	public class293(class437 var1, class437 var2) {
		new class405(256);
		this.field2377 = new class405(256);
		this.field2378 = var1;
		this.field2376 = var2;
	}

	@ObfInfo(name = "au", desc = "(II[II)Lbu;", opaqueValue = "-1858861655")
	class62 method1621(int var1, int var2, int[] var3) {
		long var5 = this.method1625(var1, var2, false);
		class428 var7 = (class428)this.field2377.method2129(var5);
		if (null != var7) {
			return var7.method2227();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			class538 var8 = class538.method2590(this.field2378, var1, var2);
			if (null == var8) {
				return null;
			} else {
				class62 var9 = var8.method2588();
				this.field2377.method2132(new class428(var9), var5);
				if (var3 != null) {
					var3[0] -= var9.field738.length;
				}

				return var9;
			}
		}
	}

	@ObfInfo(name = "ae", desc = "(IIB)Lcf;", opaqueValue = "-1")
	class428 method1620(int var1, int var2) {
		long var4 = this.method1625(var1, var2, true);
		class428 var6 = (class428)this.field2377.method2129(var4);
		if (var6 != null) {
			return var6;
		} else {
			class130 var7 = class130.method712(this.field2376, var1, var2);
			if (var7 == null) {
				return new class428();
			} else {
				class428 var8 = new class428(var7);
				this.field2377.method2132(var8, var4);
				return var8;
			}
		}
	}

	@ObfInfo(name = "ao", desc = "(I[II)Lbu;", opaqueValue = "88728645")
	class62 method1622(int var1, int[] var2) {
		if (this.field2378.method2279() == 1) {
			return this.method1621(0, var1, var2);
		} else if (this.field2378.method2293(var1) == 1) {
			return this.method1621(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfInfo(name = "at", desc = "(II)Lcf;", opaqueValue = "-1353408951")
	public class428 method1623(int var1) {
		if (this.field2376.method2279() == 1) {
			return this.method1620(0, var1);
		} else if (this.field2376.method2293(var1) == 1) {
			return this.method1620(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfInfo(name = "ac", desc = "(II)Lbu;")
	public class62 method1624(int var1) {
		return this.method1622(var1, (int[])null);
	}

	@ObfInfo(name = "ai", desc = "(IIZI)J", opaqueValue = "1190461425")
	long method1625(int var1, int var2, boolean var3) {
		int var5 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var5 |= var1 << 16;
		return var3 ? (long)var5 ^ 4294967296L : (long)var5;
	}
}
