import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

class class81 implements Callable {
   // $FF: synthetic field
   final class5 this$0;
   // $FF: synthetic field
   final AtomicBoolean val$cancelled;

   class81(class5 var1, AtomicBoolean var2) {
      this.this$0 = var1;
      this.val$cancelled = var2;
   }

   public Object call() {
      PriorityQueue var1 = this.this$0.field21;

      while(true) {
         class229 var2 = null;
         synchronized(var1) {
            if (var1.isEmpty() || this.val$cancelled.get()) {
               return null;
            }

            var2 = (class229)var1.remove();
         }

         var2.field1709.method1059();
      }
   }
}
