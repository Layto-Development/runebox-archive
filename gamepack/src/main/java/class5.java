import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "nc")
final class class5 implements Comparator {
	@ObfInfo(name = "au", desc = "(Loz;Loz;I)I", opaqueValue = "1942939549")
	int method285(class158 var1, class158 var2) {
		return var1.field1500 < var2.field1500 ? -1 : (var1.field1500 == var2.field1500 ? 0 : 1);
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method285((class158)var1, (class158)var2);
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
