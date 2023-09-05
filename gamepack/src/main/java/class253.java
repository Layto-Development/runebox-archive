import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "dz")
public class class253 {
	@ObfInfo(name = "aa", desc = "Ldz;")
	static final class253 field2091;
	@ObfInfo(name = "ae", desc = "Ldz;")
	static final class253 field2092;
	@ObfInfo(name = "ab", desc = "Ldz;")
	static final class253 field2093;
	@ObfInfo(name = "at", desc = "Ldz;")
	static final class253 field2094;
	@ObfInfo(name = "ac", desc = "Ldz;")
	static final class253 field2095;
	@ObfInfo(name = "an", desc = "Ldz;")
	static final class253 field2096;
	@ObfInfo(name = "az", desc = "Ldz;")
	static final class253 field2097;
	@ObfInfo(name = "ap", desc = "Ldz;")
	static final class253 field2098;
	@ObfInfo(name = "ai", desc = "Ldz;")
	static final class253 field2099;
	@ObfInfo(name = "ao", desc = "Ldz;")
	static final class253 field2100;
	@ObfInfo(name = "au", desc = "Ldz;")
	static final class253 field2101;
	@ObfInfo(name = "al", desc = "Ldz;")
	static final class253 field2102;
	@ObfInfo(name = "aq", desc = "Ldz;")
	static final class253 field2103;
	@ObfInfo(name = "ar", desc = "Ldz;")
	static final class253 field2104;
	@ObfInfo(name = "af", desc = "Ldz;")
	static final class253 field2105;
	@ObfInfo(name = "ad", desc = "Ldz;")
	static final class253 field2106;

	static {
		field2101 = new class253();
		field2092 = new class253();
		field2100 = new class253();
		field2094 = new class253();
		field2095 = new class253();
		field2099 = new class253();
		field2097 = new class253();
		field2098 = new class253();
		field2091 = new class253();
		field2105 = new class253();
		field2106 = new class253();
		field2103 = new class253();
		field2102 = new class253();
		field2096 = new class253();
		field2104 = new class253();
		field2093 = new class253();
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class253() {
	}

	@ObfInfo(name = "jl", desc = "(Ldf;ZB)V", opaqueValue = "1")
	static void method1345(class439 var0, boolean var1) {
		if (null != var0 && var0.method634() && !var0.field3318) {
			var0.field3316 = false;
			if ((Client.field31 && class183.field1652 > 50 || class183.field1652 > 200) && var1 && var0.field1037 == var0.field1044) {
				var0.field3316 = true;
			}

			int var3 = var0.field1061 >> 7;
			int var4 = var0.field1032 >> 7;
			if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
				long var5 = class487.method2467(0, 0, 0, false, var0.field3298);
				if (null != var0.field3311 && Client.field330 >= var0.field3307 && Client.field330 < var0.field3317) {
					var0.field3316 = false;
					var0.field3305 = Client.method131(var0.field1061, var0.field1032, class401.field3120);
					var0.field1067 = Client.field330;
					class27.field448.method1065(class401.field3120, var0.field1061, var0.field1032, var0.field3305, 60, var0, var0.field1033, var5, var0.field3323, var0.field3313, var0.field3314, var0.field3303);
				} else {
					if ((var0.field1061 & 127) == 64 && (var0.field1032 & 127) == 64) {
						if (Client.field197 == Client.field143[var3][var4]) {
							return;
						}

						Client.field143[var3][var4] = Client.field197;
					}

					var0.field3305 = Client.method131(var0.field1061, var0.field1032, class401.field3120);
					var0.field1067 = Client.field330;
					class27.field448.method1064(class401.field3120, var0.field1061, var0.field1032, var0.field3305, 60, var0, var0.field1033, var5, var0.field1039);
				}
			}
		}

	}
}
