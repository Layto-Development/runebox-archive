import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class class528 implements ThreadFactory {
   // $FF: synthetic field
   final class151 this$0;
   final ThreadGroup field4179;
   final AtomicInteger field4178;

   class528(class151 var1) {
      this.this$0 = var1;
      this.field4178 = new AtomicInteger(1);
      SecurityManager var2 = System.getSecurityManager();
      this.field4179 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
   }

   public Thread newThread(Runnable var1) {
      Thread var2 = new Thread(this.field4179, var1, this.this$0.field962 + "-rest-request-" + this.field4178.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }
}
