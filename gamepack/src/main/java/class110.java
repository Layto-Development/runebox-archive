import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "en")
public class class110 implements Comparator {
	@ObfInfo(name = "vv", desc = "I", intMultiplier = -466596103)
	static int field1024;
	@ObfInfo(name = "au", desc = "Z")
	final boolean field1025;

	@ObfInfo(name = "<init>", desc = "(Z)V")
	public class110(boolean var1) {
		this.field1025 = var1;
	}

	@ObfInfo(name = "au", desc = "(Lqb;Lqb;I)I", opaqueValue = "309797302")
	int method614(class424 var1, class424 var2) {
		return this.field1025 ? var1.field3234 - var2.field3234 : var2.field3234 - var1.field3234;
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method614((class424)var1, (class424)var2);
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
