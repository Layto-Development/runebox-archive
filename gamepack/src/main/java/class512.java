import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ko")
public class class512 implements class425 {
	@ObfInfo(name = "cn", desc = "Lns;")
	static class174 field4103;
	@ObfInfo(name = "cp", desc = "I", intMultiplier = 1440170753)
	static int field4102;
	@ObfInfo(name = "ae", desc = "Lko;")
	static final class512 field4097;
	@ObfInfo(name = "ao", desc = "Lko;")
	static final class512 field4098;
	@ObfInfo(name = "au", desc = "Lko;")
	static final class512 field4099;
	@ObfInfo(name = "at", desc = "Lko;")
	static final class512 field4104;
	@ObfInfo(name = "ai", desc = "B")
	final byte field4101;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 679347335)
	final int field4100;

	static {
		field4099 = new class512(2, (byte)0);
		field4097 = new class512(3, (byte)1);
		field4098 = new class512(1, (byte)2);
		field4104 = new class512(0, (byte)3);
	}

	@ObfInfo(name = "<init>", desc = "(IB)V")
	class512(int var1, byte var2) {
		this.field4100 = var1;
		this.field4101 = var2;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field4101;
	}
}
