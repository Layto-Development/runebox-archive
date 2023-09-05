import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.concurrent.ThreadFactory;

@ObfInfo(name = "lh")
class class176 implements ThreadFactory {
	@ObfInfo(name = "wc", desc = "Lnf;")
	static class41 field1623;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Llf;")
	final class137 this$0;

	@ObfInfo(name = "<init>", desc = "(Llf;)V")
	class176(class137 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "newThread", desc = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}
}
