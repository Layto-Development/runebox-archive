import java.util.Calendar;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

class class64 implements Callable {
	// $FF: synthetic field
	final class18 this$0;
	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	class64(class18 var1, AtomicBoolean var2) {
		this.this$0 = var1;
		this.val$cancelled = var2;
	}

	public Object call() {
		PriorityQueue var1 = this.this$0.field411;

		while (true) {
			class351 var2 = null;
			synchronized(var1) {
				if (var1.isEmpty() || this.val$cancelled.get()) {
					return null;
				}

				var2 = (class351)var1.remove();
			}

			var2.field3008.method544();
		}
	}

	static final int method484(int var0, int var1) {
		int var3 = class433.method2199(var0 - 1, var1 - 1) + class433.method2199(var0 + 1, var1 - 1) + class433.method2199(var0 - 1, var1 + 1) + class433.method2199(var0 + 1, var1 + 1);
		int var4 = class433.method2199(var0 - 1, var1) + class433.method2199(var0 + 1, var1) + class433.method2199(var0, var1 - 1) + class433.method2199(var0, var1 + 1);
		int var5 = class433.method2199(var0, var1);
		return var3 / 16 + var4 / 8 + var5 / 4;
	}

	static Date method485() {
		Calendar var1 = Calendar.getInstance();
		var1.set(2, 0);
		var1.set(5, 1);
		var1.set(1, 1900);
		return var1.getTime();
	}
}
