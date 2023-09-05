import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "nx")
final class class434 implements Comparator {
	@ObfInfo(name = "au", desc = "(Loz;Loz;I)I", opaqueValue = "627972225")
	int method2255(class158 var1, class158 var2) {
		return var1.field1498.field3711 < var2.field1498.field3711 ? -1 : (var1.field1498.field3711 == var2.field1498.field3711 ? 0 : 1);
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method2255((class158)var1, (class158)var2);
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
