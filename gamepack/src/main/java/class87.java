import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "ua")
public class class87 implements Comparator {
	@ObfInfo(name = "au", desc = "Z")
	final boolean field883;

	@ObfInfo(name = "<init>", desc = "(Z)V")
	public class87(boolean var1) {
		this.field883 = var1;
	}

	@ObfInfo(name = "au", desc = "(Lqs;Lqs;B)I")
	int method565(class179 var1, class179 var2) {
		return this.field883 ? var1.method1023(var2) : var2.method1023(var1);
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method565((class179)var1, (class179)var2);
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
