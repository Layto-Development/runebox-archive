import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "qz")
public abstract class class381 implements Comparator {
	@ObfInfo(name = "tk", desc = "Lui;")
	static class150 field2929;
	@ObfInfo(name = "ae", desc = "Ljava/util/Comparator;")
	Comparator field2930;

	@ObfInfo(name = "<init>", desc = "()V")
	protected class381() {
	}

	@ObfInfo(name = "aa", desc = "(Ljava/util/Comparator;I)V", opaqueValue = "-2038221000")
	final void method2030(Comparator var1) {
		if (this.field2930 == null) {
			this.field2930 = var1;
		} else if (this.field2930 instanceof class381) {
			((class381)this.field2930).method2030(var1);
		}

	}

	@ObfInfo(name = "af", desc = "(Lqs;Lqs;I)I", opaqueValue = "1529858790")
	protected final int method2031(class179 var1, class179 var2) {
		return this.field2930 == null ? 0 : this.field2930.compare(var1, var2);
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
