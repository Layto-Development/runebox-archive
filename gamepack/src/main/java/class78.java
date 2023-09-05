import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.IOException;
import java.util.concurrent.Callable;

@ObfInfo(name = "ah")
public class class78 implements Callable {
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lar;")
	final class129 this$0;
	@ObfInfo(name = "au", desc = "Lad;")
	final class540 field831;

	@ObfInfo(name = "<init>", desc = "(Lar;Lad;)V")
	class78(class129 var1, class540 var2) {
		this.this$0 = var1;
		this.field831 = var2;
	}

	@ObfInfo(name = "call", desc = "()Ljava/lang/Object;")
	public Object call() throws Exception {
		try {
			while (this.field831.method2595()) {
				class296.method1638(10L);
			}
		} catch (IOException var2) {
			return new class403("Error servicing REST query: " + var2.getMessage());
		}

		return this.field831.method2594();
	}
}
