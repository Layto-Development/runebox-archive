import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.concurrent.Callable;

@ObfInfo(name = "fj")
class class61 implements Callable {
	@ObfInfo(name = "cg", desc = "I", intMultiplier = -1603225811)
	static int field736;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfv;")
	final class89 this$0;
	// $FF: synthetic field
	@ObfInfo(name = "val$curveLoadJobs", desc = "[Lep;")
	final class91[] val$curveLoadJobs;
	// $FF: synthetic field
	@ObfInfo(name = "val$workEnd", desc = "I")
	final int val$workEnd;
	// $FF: synthetic field
	@ObfInfo(name = "val$workStart", desc = "I")
	final int val$workStart;

	@ObfInfo(name = "<init>", desc = "(Lfv;II[Lep;)V")
	class61(class89 var1, int var2, int var3, class91[] var4) {
		this.this$0 = var1;
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	@ObfInfo(name = "call", desc = "()Ljava/lang/Object;")
	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
			this.val$curveLoadJobs[var1].call();
		}

		return null;
	}
}
