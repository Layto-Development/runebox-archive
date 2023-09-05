import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "fx")
public class class242 extends class313 {
	@ObfInfo(name = "ff", desc = "Lnk;")
	static class505 field2008;
	@ObfInfo(name = "ae", desc = "B")
	byte field2009;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -1887192453)
	int field2010;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfn;")
	final class220 this$0;

	@ObfInfo(name = "<init>", desc = "(Lfn;)V")
	class242(class220 var1) {
		this.this$0 = var1;
		this.field2010 = -1;
	}

	@ObfInfo(name = "au", desc = "(Ltm;I)V")
	void method1731(class280 var1) {
		this.field2010 = var1.method1541();
		this.field2009 = var1.method1493();
	}

	@ObfInfo(name = "ae", desc = "(Lfi;B)V")
	void method1730(class291 var1) {
		var1.method1604(this.field2010, this.field2009);
	}
}
