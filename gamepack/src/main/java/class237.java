import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class class237 implements ThreadFactory {

	// $FF: synthetic field
	final class171 this$0;

	final ThreadGroup field2033;

	final AtomicInteger field2032;

	class237(class171 var1) {
		this.this$0 = var1;
		this.field2032 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field2033 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	@Override
	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field2033, var1, this.this$0.field1694 + "-rest-request-" + this.field2032.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}
}
