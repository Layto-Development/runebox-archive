import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "om")
final class class148 implements Comparator {
	@ObfInfo(name = "au", desc = "(Loz;Loz;I)I", opaqueValue = "822428190")
	int method847(class158 var1, class158 var2) {
		return var1.field1502 < var2.field1502 ? -1 : (var2.field1502 == var1.field1502 ? 0 : 1);
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method847((class158)var1, (class158)var2);
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
