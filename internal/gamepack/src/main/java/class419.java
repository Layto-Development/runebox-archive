import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class class419 implements ThreadFactory {
   // $FF: synthetic field
   final class248 this$0;
   final ThreadGroup field3200;
   final AtomicInteger field3199;

   class419(class248 var1) {
      this.this$0 = var1;
      this.field3199 = new AtomicInteger(1);
      SecurityManager var2 = System.getSecurityManager();
      this.field3200 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
   }

   public Thread newThread(Runnable var1) {
      Thread var2 = new Thread(this.field3200, var1, this.this$0.field2226 + "-rest-request-" + this.field3199.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }
}
