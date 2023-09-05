import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "it")
public class class51 implements Comparator {
	@ObfInfo(name = "bw", desc = "Lclient;")
	static Client field585;
	@ObfInfo(name = "ai", desc = "Luk;")
	static class398 field586;

	@ObfInfo(name = "<init>", desc = "()V")
	class51() {
	}

	@ObfInfo(name = "au", desc = "(Lio;Lio;I)I")
	int method456(class406 var1, class406 var2) {
		return var1.method2133() - var2.method2133();
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method456((class406)var1, (class406)var2);
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
