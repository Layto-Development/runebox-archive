import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "mu")
public class class503 {
	@ObfInfo(name = "ai", desc = "Z")
	public boolean field4061;
	@ObfInfo(name = "az", desc = "Z")
	public boolean field4062;
	@ObfInfo(name = "ap", desc = "Z")
	public boolean field4064;
	@ObfInfo(name = "af", desc = "Z")
	public boolean field4065;
	@ObfInfo(name = "aa", desc = "Z")
	public boolean field4068;
	@ObfInfo(name = "ad", desc = "Llf;")
	public class137 field4063;
	@ObfInfo(name = "aq", desc = "Lbi;")
	public class293 field4066;
	@ObfInfo(name = "al", desc = "Lmv;")
	public class352 field4067;
	@ObfInfo(name = "au", desc = "Lnu;")
	public class437 field4060;
	@ObfInfo(name = "ac", desc = "F")
	public float field4056;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 1168215327)
	public int field4057;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -109873503)
	public int field4058;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 982072253)
	public int field4059;

	@ObfInfo(name = "<init>", desc = "(Lnu;Ljava/lang/String;Ljava/lang/String;IZ)V")
	public class503(class437 var1, String var2, String var3, int var4, boolean var5) {
		this.field4057 = -1;
		this.field4058 = -1;
		this.field4059 = 0;
		this.field4056 = 0.0F;
		this.field4061 = false;
		this.field4068 = false;
		this.field4065 = false;
		this.field4057 = var1.method2292(var2);
		this.field4058 = var1.method2284(this.field4057, var3);
		this.method2501(var1, this.field4057, this.field4058, var4, var5);
	}

	@ObfInfo(name = "<init>", desc = "(Lnu;IIIZ)V")
	public class503(class437 var1, int var2, int var3, int var4, boolean var5) {
		this.field4057 = -1;
		this.field4058 = -1;
		this.field4059 = 0;
		this.field4056 = 0.0F;
		this.field4061 = false;
		this.field4068 = false;
		this.field4065 = false;
		this.method2501(var1, var2, var3, var4, var5);
	}

	@ObfInfo(name = "au", desc = "(Lnu;IIIZB)V")
	void method2501(class437 var1, int var2, int var3, int var4, boolean var5) {
		this.field4060 = var1;
		this.field4057 = var2;
		this.field4058 = var3;
		this.field4059 = var4;
		this.field4061 = var5;
	}
}
