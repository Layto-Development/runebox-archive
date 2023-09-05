import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfInfo(name = "ag")
public class class527 implements ThreadFactory {
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lar;")
	final class129 this$0;
	@ObfInfo(name = "au", desc = "Ljava/lang/ThreadGroup;")
	final ThreadGroup field4207;
	@ObfInfo(name = "ae", desc = "Ljava/util/concurrent/atomic/AtomicInteger;")
	final AtomicInteger field4206;

	@ObfInfo(name = "<init>", desc = "(Lar;)V")
	class527(class129 var1) {
		this.this$0 = var1;
		this.field4206 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field4207 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	@ObfInfo(name = "newThread", desc = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field4207, var1, this.this$0.field1166 + "-rest-request-" + this.field4206.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}
}
