import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

class class222 implements Callable {

	// $FF: synthetic field
	final class62 this$0;

	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	class222(class62 var1, AtomicBoolean var2) {
		this.this$0 = var1;
		this.val$cancelled = var2;
	}

	@Override
	public Object call() {
		PriorityQueue var1 = this.this$0.field659;
		while (true) {
			class363 var2 = null;
			synchronized (var1) {
				if (var1.isEmpty() || this.val$cancelled.get()) {
					return null;
				}
				var2 = (class363) var1.remove();
			}
			var2.field2920.method849();
		}
	}
}
