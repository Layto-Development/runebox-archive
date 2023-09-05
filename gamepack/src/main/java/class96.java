import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "tk")
public class class96 extends class180 {
	@ObfInfo(name = "au", desc = "Lnu;")
	static class437 field962;
	@ObfInfo(name = "ae", desc = "Lle;")
	static class7 field961;
	@ObfInfo(name = "ap", desc = "[I")
	static int[] field965;
	@ObfInfo(name = "ao", desc = "[[I")
	public int[][] field963;
	@ObfInfo(name = "at", desc = "[[Ljava/lang/Object;")
	public Object[][] field964;

	static {
		field961 = new class7(64);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class96() {
	}

	@ObfInfo(name = "ao", desc = "(Ltm;B)V", opaqueValue = "2")
	void method589(class280 var1) {
		while (true) {
			int var3 = var1.method1492();
			if (var3 == 0) {
				return;
			}

			this.method590(var1, var3);
		}
	}

	@ObfInfo(name = "at", desc = "(Ltm;II)V", opaqueValue = "216418306")
	void method590(class280 var1, int var2) {
		if (var2 == 1) {
			int var4 = var1.method1492();
			if (this.field963 == null) {
				this.field963 = new int[var4][];
			}

			for (int var5 = var1.method1492(); var5 != 255; var5 = var1.method1492()) {
				int var6 = var5 & 127;
				boolean var7 = (var5 & 128) != 0;
				int[] var8 = new int[var1.method1492()];

				for (int var9 = 0; var9 < var8.length; ++var9) {
					var8[var9] = var1.method1539();
				}

				this.field963[var6] = var8;
				if (var7) {
					if (null == this.field964) {
						this.field964 = new Object[this.field963.length][];
					}

					this.field964[var6] = class316.method1737(var1, var8);
				}
			}
		}

	}

	@ObfInfo(name = "ac", desc = "(I)V")
	void method591() {
	}

	@ObfInfo(name = "ae", desc = "(IB)Ltk;")
	public static class96 method592(int var0) {
		class96 var2 = (class96)field961.method294((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field962.method2267(39, var0);
			var2 = new class96();
			if (var3 != null) {
				var2.method589(new class280(var3));
			}

			var2.method591();
			field961.method293(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(name = "ai", desc = "(B)V")
	public static void method593() {
		field961.method291();
	}
}
