import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "nd")
public class class189 {
	@ObfInfo(name = "gk", desc = "I", intMultiplier = 988916283)
	static int field1715;

	@ObfInfo(name = "<init>", desc = "()V")
	class189() throws Throwable {
	}

	@ObfInfo(name = "lo", desc = "(III)V", opaqueValue = "-238343814")
	static void method1047(int var0, int var1) {
		int var3 = class319.field2584.method1646(class453.field3564);

		int var4;
		int var5;
		for (var4 = 0; var4 < Client.field176; ++var4) {
			var5 = class319.field2584.method1646(Client.method199(var4));
			if (var5 > var3) {
				var3 = var5;
			}
		}

		var3 += 8;
		var4 = Client.field176 * 15 + 22;
		var5 = var0 - var3 / 2;
		if (var5 + var3 > class537.field4270) {
			var5 = class537.field4270 - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		int var6 = var1;
		if (var1 + var4 > class396.field3101) {
			var6 = class396.field3101 - var4;
		}

		if (var6 < 0) {
			var6 = 0;
		}

		class304.field2456 = var5;
		class59.field731 = var6;
		class302.field2441 = var3;
		class494.field4013 = Client.field176 * 15 + 22;
	}
}
