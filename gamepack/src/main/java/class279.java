import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "be")
public class class279 implements Runnable {
	@ObfInfo(name = "ad", desc = "Luk;")
	static class398 field2250;
	@ObfInfo(name = "au", desc = "[Lbb;")
	volatile class429[] field2251;

	@ObfInfo(name = "<init>", desc = "()V")
	class279() {
		this.field2251 = new class429[2];
	}

	@ObfInfo(name = "run", desc = "()V")
	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				class429 var2 = this.field2251[var1];
				if (var2 != null) {
					var2.method2241();
				}
			}
		} catch (Exception var3) {
			class159.method913((String)null, var3);
		}

	}

	@ObfInfo(name = "nx", desc = "(IIZB)V", opaqueValue = "0")
	static final void method1477(int var0, int var1, boolean var2) {
		if (Client.field272[var0] != null) {
			if (var1 >= 0 && var1 < Client.field272[var0].method834()) {
				class524 var4 = (class524)Client.field272[var0].field1434.get(var1);
				class121 var5 = class121.method689(class480.field3915, Client.field92.field2665);
				var5.field1141.method1481(4 + class280.method1555(var4.field4198.method1935()));
				var5.field1141.method1481(var0);
				var5.field1141.method1522(var1);
				var5.field1141.method1483(var2);
				var5.field1141.method1484(var4.field4198.method1935());
				Client.field92.method1821(var5);
			}
		}
	}
}
