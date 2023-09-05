import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "hh")
public class class446 extends class180 {
	@ObfInfo(name = "ae", desc = "Lle;")
	static class7 field3383;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1622195423)
	public int field3382;

	static {
		field3383 = new class7(64);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class446() {
		this.field3382 = 0;
	}

	@ObfInfo(name = "ao", desc = "(Ltm;B)V", opaqueValue = "2")
	void method2346(class280 var1) {
		while (true) {
			int var3 = var1.method1492();
			if (var3 == 0) {
				return;
			}

			this.method2347(var1, var3);
		}
	}

	@ObfInfo(name = "at", desc = "(Ltm;II)V", opaqueValue = "-158916066")
	void method2347(class280 var1, int var2) {
		if (var2 == 2) {
			this.field3382 = var1.method1541();
		}

	}

	@ObfInfo(name = "au", desc = "(Lnu;I)V")
	public static void method2350(class437 var0) {
		class161.field1517 = var0;
	}

	@ObfInfo(name = "ae", desc = "(II)Lhh;")
	public static class446 method2349(int var0) {
		class446 var2 = (class446)field3383.method294((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class161.field1517.method2267(5, var0);
			var2 = new class446();
			if (var3 != null) {
				var2.method2346(new class280(var3));
			}

			field3383.method293(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(name = "lw", desc = "(B)V", opaqueValue = "-1")
	static void method2348() {
		if (Client.field119) {
			class131 var1 = class131.method753(class515.field4126, Client.field195);
			if (null != var1 && var1.field1309 != null) {
				class20 var2 = new class20();
				var2.field377 = var1;
				var2.field380 = var1.field1309;
				class175.method1006(var2);
			}

			Client.field161 = -1;
			Client.field119 = false;
			Client.method213(var1);
		}
	}
}
