import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "qw")
class class56 implements Comparator {
	@ObfInfo(name = "ae", desc = "Lnu;")
	static class437 field723;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lqv;")
	final class339 this$0;

	@ObfInfo(name = "<init>", desc = "(Lqv;)V")
	class56(class339 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "au", desc = "(Lqj;Lqj;I)I", opaqueValue = "-1504884068")
	int method468(class275 var1, class275 var2) {
		if (var1.field2231 > var2.field2231) {
			return 1;
		} else {
			return var1.field2231 < var2.field2231 ? -1 : 0;
		}
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method468((class275)var1, (class275)var2);
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
