import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfInfo(name = "ap")
public class class463 {
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1299157837)
	static int field3759;
	@ObfInfo(name = "au", desc = "Ljava/util/concurrent/ExecutorService;")
	ExecutorService field3757;
	@ObfInfo(name = "ae", desc = "Ljava/util/concurrent/Future;")
	Future field3760;
	@ObfInfo(name = "ao", desc = "Ltm;")
	final class280 field3758;
	@ObfInfo(name = "at", desc = "Lat;")
	final class84 field3756;

	@ObfInfo(name = "<init>", desc = "(Ltm;Lat;)V")
	public class463(class280 var1, class84 var2) {
		this.field3757 = Executors.newSingleThreadExecutor();
		this.field3758 = var1;
		this.field3756 = var2;
		this.method2398();
	}

	@ObfInfo(name = "au", desc = "(I)Z")
	public boolean method2400() {
		return this.field3760.isDone();
	}

	@ObfInfo(name = "ae", desc = "(I)V")
	public void method2397() {
		this.field3757.shutdown();
		this.field3757 = null;
	}

	@ObfInfo(name = "ao", desc = "(B)Ltm;")
	public class280 method2399() {
		try {
			return (class280)this.field3760.get();
		} catch (Exception var3) {
			return null;
		}
	}

	@ObfInfo(name = "at", desc = "(I)V")
	void method2398() {
		this.field3760 = this.field3757.submit(new class345(this, this.field3758, this.field3756));
	}
}
