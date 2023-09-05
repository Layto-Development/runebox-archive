import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfInfo(name = "cc")
public class class260 {
	@ObfInfo(name = "au", desc = "Ljava/util/concurrent/ExecutorService;")
	ExecutorService field2116;
	@ObfInfo(name = "ae", desc = "Ljava/util/concurrent/Future;")
	Future field2117;

	@ObfInfo(name = "<init>", desc = "()V")
	class260() {
		this.field2116 = Executors.newSingleThreadExecutor();
		this.field2117 = this.field2116.submit(new class256());
	}

	@ObfInfo(name = "au", desc = "(I)V")
	void method1365() {
		this.field2116.shutdown();
		this.field2116 = null;
	}

	@ObfInfo(name = "ae", desc = "(I)Z")
	boolean method1363() {
		return this.field2117.isDone();
	}

	@ObfInfo(name = "ao", desc = "(B)Ljava/security/SecureRandom;")
	SecureRandom method1364() {
		try {
			return (SecureRandom)this.field2117.get();
		} catch (Exception var5) {
			SecureRandom var4 = new SecureRandom();
			var4.nextInt();
			return var4;
		}
	}
}
