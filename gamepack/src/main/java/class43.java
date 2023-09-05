import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "lv")
public final class class43 {
	@ObfInfo(name = "au", desc = "J", longMultiplier = 7339559813345552623L)
	static long field557;

	@ObfInfo(name = "<init>", desc = "()V")
	class43() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(I)J")
	public static final synchronized long method443() {
		long var1 = System.currentTimeMillis();
		if (var1 < field557) {
			class34.field484 += field557 - var1;
		}

		field557 = var1;
		return var1 + class34.field484;
	}
}
