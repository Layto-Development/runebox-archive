import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "gr")
public class class419 extends class325 {
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 1786287119)
	int field3220;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 215476723)
	int field3221;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -868536703)
	int field3223;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 1522261221)
	int field3225;
	@ObfInfo(name = "at", desc = "J", longMultiplier = 798114243387116605L)
	long field3222;
	@ObfInfo(name = "au", desc = "[J")
	long[] field3224;

	@ObfInfo(name = "<init>", desc = "()V")
	public class419() {
		this.field3224 = new long[10];
		this.field3221 = 256;
		this.field3223 = 1;
		this.field3220 = 0;
		this.field3222 = class43.method443();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field3224[var1] = this.field3222;
		}

	}

	@ObfInfo(name = "au", desc = "(I)V", opaqueValue = "739310381")
	public void method1800() {
		for (int var2 = 0; var2 < 10; ++var2) {
			this.field3224[var2] = 0L;
		}

	}

	@ObfInfo(name = "ae", desc = "(IIB)I", opaqueValue = "20")
	public int method1801(int var1, int var2) {
		int var4 = this.field3221;
		int var5 = this.field3223;
		this.field3221 = 300;
		this.field3223 = 1;
		this.field3222 = class43.method443();
		if (0L == this.field3224[this.field3225]) {
			this.field3221 = var4;
			this.field3223 = var5;
		} else if (this.field3222 > this.field3224[this.field3225]) {
			this.field3221 = (int)((long)(var1 * 2560) / (this.field3222 - this.field3224[this.field3225]));
		}

		if (this.field3221 < 25) {
			this.field3221 = 25;
		}

		if (this.field3221 > 256) {
			this.field3221 = 256;
			this.field3223 = (int)((long)var1 - (this.field3222 - this.field3224[this.field3225]) / 10L);
		}

		if (this.field3223 > var1) {
			this.field3223 = var1;
		}

		this.field3224[this.field3225] = this.field3222;
		this.field3225 = (1 + this.field3225) % 10;
		int var6;
		if (this.field3223 > 1) {
			for (var6 = 0; var6 < 10; ++var6) {
				if (0L != this.field3224[var6]) {
					this.field3224[var6] += (long)this.field3223;
				}
			}
		}

		if (this.field3223 < var2) {
			this.field3223 = var2;
		}

		class296.method1638((long)this.field3223);

		for (var6 = 0; this.field3220 < 256; this.field3220 += this.field3221) {
			++var6;
		}

		this.field3220 &= 255;
		return var6;
	}
}
