import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "uj")
public class class251 implements Comparator {
	@ObfInfo(name = "ac", desc = "Lnu;")
	static class437 field2088;
	@ObfInfo(name = "au", desc = "Z")
	final boolean field2087;

	@ObfInfo(name = "<init>", desc = "(Z)V")
	public class251(boolean var1) {
		this.field2087 = var1;
	}

	@ObfInfo(name = "au", desc = "(Lqs;Lqs;I)I", opaqueValue = "-1128837545")
	int method1344(class179 var1, class179 var2) {
		return this.field2087 ? var1.method1019().method1934(var2.method1019()) : var2.method1019().method1934(var1.method1019());
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method1344((class179)var1, (class179)var2);
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
