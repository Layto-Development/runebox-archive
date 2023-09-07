import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class429 {

	ExecutorService field3354;

	Future field3355;

	class429() {
		this.field3354 = Executors.newSingleThreadExecutor();
		this.field3355 = this.field3354.submit(new class281());
	}

	void method2159() {
		this.field3354.shutdown();
		this.field3354 = null;
	}

	boolean method2157() {
		return this.field3355.isDone();
	}

	SecureRandom method2158() {
		try {
			return (SecureRandom) this.field3355.get();
		} catch (Exception var5) {
			SecureRandom var4 = new SecureRandom();
			var4.nextInt();
			return var4;
		}
	}
}
