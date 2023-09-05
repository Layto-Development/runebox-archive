import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "im")
public class class38 {
	@ObfInfo(name = "gc", desc = "Lnk;")
	static class505 field506;
	@ObfInfo(name = "ac", desc = "[[[S")
	static short[][][] field505;
	@ObfInfo(name = "ae", desc = "[Leo;")
	class418[] field503;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1593218477)
	int field504;

	@ObfInfo(name = "<init>", desc = "(Ltm;I)V")
	class38(class280 var1, int var2) {
		this.field503 = new class418[var2];
		this.field504 = var1.method1492();

		for (int var3 = 0; var3 < this.field503.length; ++var3) {
			class418 var4 = new class418(this.field504, var1, false);
			this.field503[var3] = var4;
		}

		this.method425();
	}

	@ObfInfo(name = "au", desc = "(I)V", opaqueValue = "-1176805295")
	void method425() {
		class418[] var2 = this.field503;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class418 var4 = var2[var3];
			if (var4.field3207 >= 0) {
				var4.field3217 = this.field503[var4.field3207];
			}
		}

	}

	@ObfInfo(name = "ae", desc = "(I)I")
	public int method420() {
		return this.field503.length;
	}

	@ObfInfo(name = "ao", desc = "(II)Leo;", opaqueValue = "-1526328024")
	class418 method421(int var1) {
		return var1 >= this.method420() ? null : this.field503[var1];
	}

	@ObfInfo(name = "at", desc = "(I)[Leo;")
	class418[] method422() {
		return this.field503;
	}

	@ObfInfo(name = "ac", desc = "(Lfv;II)V")
	void method423(class89 var1, int var2) {
		this.method424(var1, var2, (boolean[])null, false);
	}

	@ObfInfo(name = "ai", desc = "(Lfv;I[ZZB)V", opaqueValue = "7")
	void method424(class89 var1, int var2, boolean[] var3, boolean var4) {
		int var6 = var1.method574();
		int var7 = 0;
		class418[] var8 = this.method422();

		for (int var9 = 0; var9 < var8.length; ++var9) {
			class418 var10 = var8[var9];
			if (null == var3 || var4 == var3[var7]) {
				var1.method576(var2, var10, var7, var6);
			}

			++var7;
		}

	}
}
