import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "tc")
public class class360 extends class180 {
	@ObfInfo(name = "au", desc = "Lnu;")
	static class437 field2817;
	@ObfInfo(name = "ae", desc = "Lle;")
	static class7 field2816;
	@ObfInfo(name = "at", desc = "[[I")
	int[][] field2818;
	@ObfInfo(name = "ao", desc = "[[Ljava/lang/Object;")
	Object[][] field2820;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 1839365757)
	public int field2819;

	static {
		field2816 = new class7(64);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class360() {
		this.field2819 = -1;
	}

	@ObfInfo(name = "ao", desc = "(Ltm;I)V", opaqueValue = "988292852")
	void method1973(class280 var1) {
		while (true) {
			int var3 = var1.method1492();
			if (var3 == 0) {
				return;
			}

			this.method1970(var1, var3);
		}
	}

	@ObfInfo(name = "at", desc = "(II)[Ljava/lang/Object;", opaqueValue = "1646688910")
	public Object[] method1972(int var1) {
		return null == this.field2820 ? null : this.field2820[var1];
	}

	@ObfInfo(name = "ac", desc = "(Ltm;II)V")
	void method1970(class280 var1, int var2) {
		if (var2 == 3) {
			int var4 = var1.method1492();
			if (null == this.field2820) {
				this.field2820 = new Object[var4][];
				this.field2818 = new int[var4][];
			}

			for (int var5 = var1.method1492(); var5 != 255; var5 = var1.method1492()) {
				int var6 = var1.method1492();
				int[] var7 = new int[var6];

				for (int var8 = 0; var8 < var6; ++var8) {
					var7[var8] = var1.method1539();
				}

				this.field2820[var5] = class316.method1737(var1, var7);
				this.field2818[var5] = var7;
			}
		} else if (var2 == 4) {
			this.field2819 = var1.method1508();
		}

	}

	@ObfInfo(name = "ai", desc = "(B)V")
	void method1971() {
	}

	@ObfInfo(name = "au", desc = "(Lnu;B)V")
	public static void method1976(class437 var0) {
		field2817 = var0;
	}

	@ObfInfo(name = "ae", desc = "(II)Ltc;")
	public static class360 method1975(int var0) {
		class360 var2 = (class360)field2816.method294((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field2817.method2267(38, var0);
			var2 = new class360();
			if (null != var3) {
				var2.method1973(new class280(var3));
			}

			var2.method1971();
			field2816.method293(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(name = "az", desc = "(I)V")
	public static void method1974() {
		field2816.method291();
	}
}
