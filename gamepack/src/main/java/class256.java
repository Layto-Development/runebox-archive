import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfInfo(name = "dn")
public class class256 implements Callable {
	@ObfInfo(name = "iq", desc = "Lpi;")
	static class258 field2112;
	@ObfInfo(name = "ds", desc = "[Luk;")
	static class398[] field2111;

	@ObfInfo(name = "<init>", desc = "()V")
	class256() {
	}

	@ObfInfo(name = "call", desc = "()Ljava/lang/Object;")
	public Object call() {
		SecureRandom var2 = new SecureRandom();
		var2.nextInt();
		return var2;
	}
}
