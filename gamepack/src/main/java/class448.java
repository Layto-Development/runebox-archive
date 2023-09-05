import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfInfo(name = "md")
class class448 implements Callable {
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Llf;")
	final class137 this$0;
	// $FF: synthetic field
	@ObfInfo(name = "val$cancelled", desc = "Ljava/util/concurrent/atomic/AtomicBoolean;")
	final AtomicBoolean val$cancelled;

	@ObfInfo(name = "<init>", desc = "(Llf;Ljava/util/concurrent/atomic/AtomicBoolean;)V")
	class448(class137 var1, AtomicBoolean var2) {
		this.this$0 = var1;
		this.val$cancelled = var2;
	}

	@ObfInfo(name = "call", desc = "()Ljava/lang/Object;")
	public Object call() {
		PriorityQueue var1 = this.this$0.field1393;

		while (true) {
			class252 var2 = null;
			synchronized(var1) {
				if (var1.isEmpty() || this.val$cancelled.get()) {
					return null;
				}

				var2 = (class252)var1.remove();
			}

			var2.field2090.method2228();
		}
	}
}
