import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class class176 implements ThreadFactory {
    // $FF: synthetic field
    final class127 this$0;
    final ThreadGroup field1509;
    final AtomicInteger field1508;

    class176(class127 var1) {
        this.this$0 = var1;
        this.field1508 = new AtomicInteger(1);
        SecurityManager var2 = System.getSecurityManager();
        this.field1509 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
    }

    @Override
    public Thread newThread(Runnable var1) {
        Thread var2 = new Thread(this.field1509, var1, this.this$0.field1140 + "-rest-request-" + this.field1508.getAndIncrement(), 0L);
        var2.setDaemon(true);
        var2.setPriority(5);
        return var2;
    }
}
