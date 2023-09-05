import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "nh")
final class class361 implements Comparator {
	@ObfInfo(name = "au", desc = "(Loz;Loz;I)I")
	int method1977(class158 var1, class158 var2) {
		return var1.method912().compareTo(var2.method912());
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method1977((class158)var1, (class158)var2);
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
