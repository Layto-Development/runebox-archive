import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "qu")
public class class462 extends class179 {
	@ObfInfo(name = "au", desc = "I", intMultiplier = -1984190391)
	int field3755;

	@ObfInfo(name = "<init>", desc = "()V")
	class462() {
	}

	@ObfInfo(name = "au", desc = "(Lqu;I)I")
	int method2396(class462 var1) {
		return this.field3755 - var1.field3755;
	}

	@ObfInfo(name = "ae", desc = "(Lqs;I)I")
	public int method1023(class179 var1) {
		return this.method2396((class462)var1);
	}

	@ObfInfo(name = "compareTo", desc = "(Ljava/lang/Object;)I")
	public int compareTo(Object var1) {
		return this.method2396((class462)var1);
	}
}
