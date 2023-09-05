import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "gs")
public class class440 extends class325 {
	@ObfInfo(name = "au", desc = "J", longMultiplier = 3591557108304151949L)
	long field3328;

	@ObfInfo(name = "<init>", desc = "()V")
	public class440() {
		this.field3328 = System.nanoTime();
	}

	@ObfInfo(name = "au", desc = "(I)V")
	public void method1800() {
		this.field3328 = System.nanoTime();
	}

	@ObfInfo(name = "ae", desc = "(IIB)I", opaqueValue = "20")
	public int method1801(int var1, int var2) {
		long var4 = 1000000L * (long)var2;
		long var6 = this.field3328 - System.nanoTime();
		if (var6 < var4) {
			var6 = var4;
		}

		class296.method1638(var6 / 1000000L);
		long var8 = System.nanoTime();

		int var10;
		for (var10 = 0; var10 < 10 && (var10 < 1 || this.field3328 < var8); this.field3328 += 1000000L * (long)var1) {
			++var10;
		}

		if (this.field3328 < var8) {
			this.field3328 = var8;
		}

		return var10;
	}
}
