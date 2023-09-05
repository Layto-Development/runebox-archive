import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "hs")
public class class541 extends class180 {
	@ObfInfo(name = "au", desc = "Lnu;")
	public static class437 field4287;
	@ObfInfo(name = "ae", desc = "Lle;")
	public static class7 field4288;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1996012319)
	int field4289;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 1490313473)
	public int field4290;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 371900765)
	public int field4291;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1165742935)
	public int field4292;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1722213545)
	public int field4293;

	static {
		field4288 = new class7(64);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	public class541() {
		this.field4289 = 0;
	}

	@ObfInfo(name = "ae", desc = "(I)V")
	public void method2597() {
		this.method2600(this.field4289);
	}

	@ObfInfo(name = "ao", desc = "(Ltm;II)V", opaqueValue = "816329522")
	public void method2598(class280 var1, int var2) {
		while (true) {
			int var4 = var1.method1492();
			if (var4 == 0) {
				return;
			}

			this.method2599(var1, var4, var2);
		}
	}

	@ObfInfo(name = "at", desc = "(Ltm;IIB)V")
	void method2599(class280 var1, int var2, int var3) {
		if (var2 == 1) {
			this.field4289 = var1.method1548();
		}

	}

	@ObfInfo(name = "ac", desc = "(II)V", opaqueValue = "1559795083")
	void method2600(int var1) {
		double var3 = (double)(var1 >> 16 & 255) / 256.0D;
		double var5 = (double)(var1 >> 8 & 255) / 256.0D;
		double var7 = (double)(var1 & 255) / 256.0D;
		double var9 = var3;
		if (var5 < var3) {
			var9 = var5;
		}

		if (var7 < var9) {
			var9 = var7;
		}

		double var11 = var3;
		if (var5 > var3) {
			var11 = var5;
		}

		if (var7 > var11) {
			var11 = var7;
		}

		double var13 = 0.0D;
		double var15 = 0.0D;
		double var17 = (var9 + var11) / 2.0D;
		if (var11 != var9) {
			if (var17 < 0.5D) {
				var15 = (var11 - var9) / (var9 + var11);
			}

			if (var17 >= 0.5D) {
				var15 = (var11 - var9) / (2.0D - var11 - var9);
			}

			if (var3 == var11) {
				var13 = (var5 - var7) / (var11 - var9);
			} else if (var11 == var5) {
				var13 = (var7 - var3) / (var11 - var9) + 2.0D;
			} else if (var11 == var7) {
				var13 = 4.0D + (var3 - var5) / (var11 - var9);
			}
		}

		var13 /= 6.0D;
		this.field4291 = (int)(var15 * 256.0D);
		this.field4290 = (int)(var17 * 256.0D);
		if (this.field4291 < 0) {
			this.field4291 = 0;
		} else if (this.field4291 > 255) {
			this.field4291 = 255;
		}

		if (this.field4290 < 0) {
			this.field4290 = 0;
		} else if (this.field4290 > 255) {
			this.field4290 = 255;
		}

		if (var17 > 0.5D) {
			this.field4292 = (int)((1.0D - var17) * var15 * 512.0D);
		} else {
			this.field4292 = (int)(var15 * var17 * 512.0D);
		}

		if (this.field4292 < 1) {
			this.field4292 = 1;
		}

		this.field4293 = (int)(var13 * (double)this.field4292);
	}

	@ObfInfo(name = "au", desc = "(Lnu;I)V")
	public static void method2601(class437 var0) {
		field4287 = var0;
	}
}
