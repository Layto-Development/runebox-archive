import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.concurrent.Callable;

@ObfInfo(name = "ae")
public class class345 implements Callable {
	@ObfInfo(name = "fp", desc = "Lnk;")
	static class505 field2708;
	@ObfInfo(name = "au", desc = "Ltm;")
	final class280 field2709;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lap;")
	final class463 this$0;
	@ObfInfo(name = "ae", desc = "Lat;")
	final class84 field2707;

	@ObfInfo(name = "<init>", desc = "(Lap;Ltm;Lat;)V")
	class345(class463 var1, class280 var2, class84 var3) {
		this.this$0 = var1;
		this.field2709 = var2;
		this.field2707 = var3;
	}

	@ObfInfo(name = "call", desc = "()Ljava/lang/Object;")
	public Object call() {
		return this.field2707.method560(this.field2709);
	}
}
