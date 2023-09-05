import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "hr")
public class class102 extends class180 {
	@ObfInfo(name = "au", desc = "Lnu;")
	public static class437 field999;
	@ObfInfo(name = "ae", desc = "Lle;")
	public static class7 field994;
	@ObfInfo(name = "kq", desc = "[Lui;")
	static class150[] field989;
	@ObfInfo(name = "ac", desc = "Z")
	public boolean field990;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 749238791)
	public int field987;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1585644567)
	public int field988;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -256809039)
	public int field991;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 62160947)
	public int field992;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1090295773)
	public int field993;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 440214237)
	public int field995;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1243789243)
	public int field996;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 301762917)
	public int field997;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -1895937717)
	public int field998;

	static {
		field994 = new class7(64);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	public class102() {
		this.field988 = 0;
		this.field987 = -1;
		this.field990 = true;
		this.field991 = -1;
	}

	@ObfInfo(name = "ae", desc = "(B)V", opaqueValue = "0")
	public void method603() {
		if (this.field991 != -1) {
			this.method605(this.field991);
			this.field996 = this.field992;
			this.field995 = this.field993;
			this.field997 = this.field998;
		}

		this.method605(this.field988);
	}

	@ObfInfo(name = "ao", desc = "(Ltm;IB)V", opaqueValue = "7")
	public void method604(class280 var1, int var2) {
		while (true) {
			int var4 = var1.method1492();
			if (var4 == 0) {
				return;
			}

			this.method602(var1, var4, var2);
		}
	}

	@ObfInfo(name = "at", desc = "(Ltm;IIB)V", opaqueValue = "103")
	void method602(class280 var1, int var2, int var3) {
		if (var2 == 1) {
			this.field988 = var1.method1548();
		} else if (var2 == 2) {
			this.field987 = var1.method1492();
		} else if (var2 == 5) {
			this.field990 = false;
		} else if (var2 == 7) {
			this.field991 = var1.method1548();
		} else if (var2 == 8) {
		}

	}

	@ObfInfo(name = "ac", desc = "(II)V", opaqueValue = "-1222070092")
	void method605(int var1) {
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
				var15 = (var11 - var9) / (var11 + var9);
			}

			if (var17 >= 0.5D) {
				var15 = (var11 - var9) / (2.0D - var11 - var9);
			}

			if (var11 == var3) {
				var13 = (var5 - var7) / (var11 - var9);
			} else if (var11 == var5) {
				var13 = 2.0D + (var7 - var3) / (var11 - var9);
			} else if (var11 == var7) {
				var13 = (var3 - var5) / (var11 - var9) + 4.0D;
			}
		}

		var13 /= 6.0D;
		this.field992 = (int)(var13 * 256.0D);
		this.field993 = (int)(var15 * 256.0D);
		this.field998 = (int)(var17 * 256.0D);
		if (this.field993 < 0) {
			this.field993 = 0;
		} else if (this.field993 > 255) {
			this.field993 = 255;
		}

		if (this.field998 < 0) {
			this.field998 = 0;
		} else if (this.field998 > 255) {
			this.field998 = 255;
		}

	}

	@ObfInfo(name = "au", desc = "(Lnu;I)V")
	public static void method607(class437 var0) {
		field999 = var0;
	}

	@ObfInfo(name = "ai", desc = "(I)V")
	public static void method606() {
		field994.method291();
	}
}
