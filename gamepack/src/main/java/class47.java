import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

class class47 implements Callable {
    // $FF: synthetic field
    final class468 this$0;
    // $FF: synthetic field
    final AtomicBoolean val$cancelled;

    class47(class468 var1, AtomicBoolean var2) {
        this.this$0 = var1;
        this.val$cancelled = var2;
    }

    @Override
    public Object call() {
        PriorityQueue var1 = this.this$0.field3327;

        while (true) {
            class384 var2 = null;
            synchronized (var1) {
                if (var1.isEmpty() || this.val$cancelled.get()) {
                    return null;
                }

                var2 = (class384) var1.remove();
            }

            var2.field2762.method1808();
        }
    }
}
