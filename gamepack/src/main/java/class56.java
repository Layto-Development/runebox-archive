import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class56 {
	static int field611;
	ExecutorService field609;
	Future field612;
	final class130 field608;
	final class42 field610;

	public class56(class42 var1, class130 var2) {
		this.field609 = Executors.newSingleThreadExecutor();
		this.field610 = var1;
		this.field608 = var2;
		this.method414();
	}

	public boolean method416() {
		return this.field612.isDone();
	}

	public void method413() {
		this.field609.shutdown();
		this.field609 = null;
	}

	public class42 method415() {
		try {
			return (class42)this.field612.get();
		} catch (Exception var3) {
			return null;
		}
	}

	void method414() {
		this.field612 = this.field609.submit(new class26(this, this.field610, this.field608));
	}

	static final int method417(int var0) {
		return Math.abs(var0 - class175.field1694) > 1024 ? var0 + 2048 * (var0 < class175.field1694 ? 1 : -1) : var0;
	}
}
