import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.concurrent.Callable;

@ObfInfo(name = "ep")
public class class91 implements Callable {
	@ObfInfo(name = "mt", desc = "Ljk;")
	static class458 field925;
	@ObfInfo(name = "kz", desc = "I", intMultiplier = 1065394883)
	static int field926;
	@ObfInfo(name = "gf", desc = "I", intMultiplier = -1026582299)
	static int field927;
	@ObfInfo(name = "ao", desc = "Lfs;")
	final class214 field922;
	@ObfInfo(name = "au", desc = "Lfh;")
	final class27 field924;
	@ObfInfo(name = "ae", desc = "Lft;")
	final class416 field921;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfv;")
	final class89 this$0;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 1155375763)
	final int field923;

	@ObfInfo(name = "<init>", desc = "(Lfv;Lfh;Lft;Lfs;I)V")
	class91(class89 var1, class27 var2, class416 var3, class214 var4, int var5) {
		this.this$0 = var1;
		this.field924 = var2;
		this.field921 = var3;
		this.field922 = var4;
		this.field923 = var5;
	}

	@ObfInfo(name = "call", desc = "()Ljava/lang/Object;")
	public Object call() {
		this.field924.method358();
		class27[][] var1;
		if (class416.field3199 == this.field921) {
			var1 = this.this$0.field889;
		} else {
			var1 = this.this$0.field895;
		}

		var1[this.field923][this.field922.method1192()] = this.field924;
		return null;
	}
}
