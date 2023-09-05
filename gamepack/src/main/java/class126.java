import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "hb")
public class class126 extends class180 {
	@ObfInfo(name = "ae", desc = "Lle;")
	public static class7 field1158;
	@ObfInfo(name = "au", desc = "Lnu;")
	static class437 field1162;
	@ObfInfo(name = "mo", desc = "Ldf;")
	static class439 field1164;
	@ObfInfo(name = "us", desc = "I", intMultiplier = -1186066389)
	static int field1161;
	@ObfInfo(name = "ai", desc = "[I")
	static final int[] field1157;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 144903653)
	public int field1159;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 225410143)
	public int field1160;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 1882806955)
	public int field1163;

	static {
		field1158 = new class7(64);
		field1157 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field1157[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfInfo(name = "<init>", desc = "()V")
	class126() {
	}

	@ObfInfo(name = "ao", desc = "(Ltm;I)V", opaqueValue = "1263558544")
	void method698(class280 var1) {
		while (true) {
			int var3 = var1.method1492();
			if (var3 == 0) {
				return;
			}

			this.method699(var1, var3);
		}
	}

	@ObfInfo(name = "at", desc = "(Ltm;II)V")
	void method699(class280 var1, int var2) {
		if (var2 == 1) {
			this.field1159 = var1.method1541();
			this.field1160 = var1.method1492();
			this.field1163 = var1.method1492();
		}

	}

	@ObfInfo(name = "au", desc = "(Lnu;I)V")
	public static void method700(class437 var0) {
		field1162 = var0;
	}

	@ObfInfo(name = "ae", desc = "(II)Lhb;")
	public static class126 method701(int var0) {
		class126 var2 = (class126)field1158.method294((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field1162.method2267(14, var0);
			var2 = new class126();
			if (var3 != null) {
				var2.method698(new class280(var3));
			}

			field1158.method293(var2, (long)var0);
			return var2;
		}
	}
}
