import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class520 {

	static int field4128;

	ExecutorService field4126;

	Future field4129;

	final class168 field4125;

	final class187 field4127;

	public class520(class187 var1, class168 var2) {
		this.field4126 = Executors.newSingleThreadExecutor();
		this.field4127 = var1;
		this.field4125 = var2;
		this.method2518();
	}

	public boolean method2520() {
		return this.field4129.isDone();
	}

	public void method2517() {
		this.field4126.shutdown();
		this.field4126 = null;
	}

	public class187 method2519() {
		try {
			return (class187) this.field4129.get();
		} catch (Exception var3) {
			return null;
		}
	}

	void method2518() {
		this.field4129 = this.field4126.submit(new class478(this, this.field4127, this.field4125));
	}
}
