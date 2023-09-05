import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "mq")
public class class302 implements Comparator {
	@ObfInfo(name = "bh", desc = "[Z")
	public static boolean[] field2440;
	@ObfInfo(name = "nh", desc = "I", intMultiplier = 617707969)
	static int field2441;

	@ObfInfo(name = "<init>", desc = "()V")
	class302() {
	}

	@ObfInfo(name = "au", desc = "(Lli;Lli;I)I")
	int method1676(class252 var1, class252 var2) {
		return var1.field2089 - var2.field2089;
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method1676((class252)var1, (class252)var2);
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
