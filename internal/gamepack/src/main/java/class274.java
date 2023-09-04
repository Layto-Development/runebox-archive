import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

class class274 implements Callable {
   // $FF: synthetic field
   final class448 this$0;
   // $FF: synthetic field
   final AtomicBoolean val$cancelled;

   class274(class448 var1, AtomicBoolean var2) {
      this.this$0 = var1;
      this.val$cancelled = var2;
   }

   public Object call() {
      PriorityQueue var1 = this.this$0.field3413;

      while(true) {
         class172 var2 = null;
         synchronized(var1) {
            if (var1.isEmpty() || this.val$cancelled.get()) {
               return null;
            }

            var2 = (class172)var1.remove();
         }

         var2.field1728.method910();
      }
   }
}
