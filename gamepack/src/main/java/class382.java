import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "py")
public class class382 {
	@ObfInfo(name = "az", desc = "I", intMultiplier = -264016203)
	int field2935;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 436925731)
	int field2937;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -1568859201)
	int field2938;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 140876143)
	int field2939;
	@ObfInfo(name = "ae", desc = "J", longMultiplier = -7356339213300068871L)
	long field2931;
	@ObfInfo(name = "au", desc = "J", longMultiplier = 6454939314304867917L)
	long field2932;
	@ObfInfo(name = "at", desc = "J", longMultiplier = 8401720768134439495L)
	long field2933;
	@ObfInfo(name = "ac", desc = "J", longMultiplier = -287005139873916205L)
	long field2934;
	@ObfInfo(name = "ai", desc = "J", longMultiplier = 1145719069338779159L)
	long field2940;
	@ObfInfo(name = "ao", desc = "Z")
	public boolean field2936;

	@ObfInfo(name = "<init>", desc = "()V")
	public class382() {
		this.field2932 = -1L;
		this.field2931 = -1L;
		this.field2936 = false;
		this.field2933 = 0L;
		this.field2934 = 0L;
		this.field2940 = 0L;
		this.field2935 = 0;
		this.field2937 = 0;
		this.field2938 = 0;
		this.field2939 = 0;
	}

	@ObfInfo(name = "au", desc = "(S)V")
	public void method2033() {
		this.field2932 = class43.method443();
	}

	@ObfInfo(name = "ae", desc = "(I)V")
	public void method2038() {
		if (-1L != this.field2932) {
			this.field2934 = class43.method443() - this.field2932;
			this.field2932 = -1L;
		}

	}

	@ObfInfo(name = "ao", desc = "(II)V")
	public void method2034(int var1) {
		this.field2931 = class43.method443();
		this.field2935 = var1;
	}

	@ObfInfo(name = "at", desc = "(I)V", opaqueValue = "468331239")
	public void method2035() {
		if (-1L != this.field2931) {
			this.field2933 = class43.method443() - this.field2931;
			this.field2931 = -1L;
		}

		++this.field2938;
		this.field2936 = true;
	}

	@ObfInfo(name = "ac", desc = "(I)V")
	public void method2036() {
		this.field2936 = false;
		this.field2937 = 0;
	}

	@ObfInfo(name = "ai", desc = "(I)V")
	public void method2032() {
		this.method2035();
	}

	@ObfInfo(name = "az", desc = "(Ltm;I)V")
	public void method2037(class280 var1) {
		method2039(var1, this.field2934);
		method2039(var1, this.field2933);
		method2039(var1, this.field2940);
		var1.method1522(this.field2935);
		var1.method1522(this.field2937);
		var1.method1522(this.field2938);
		var1.method1522(this.field2939);
	}

	@ObfInfo(name = "ap", desc = "(Ltm;J)V")
	static void method2039(class280 var0, long var1) {
		var1 /= 10L;
		if (var1 < 0L) {
			var1 = 0L;
		} else if (var1 > 65535L) {
			var1 = 65535L;
		}

		var0.method1522((int)var1);
	}
}
