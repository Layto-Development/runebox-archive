import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "lu")
public class class476 extends class370 {
	@ObfInfo(name = "au", desc = "Ljava/lang/Object;")
	Object field3813;

	@ObfInfo(name = "<init>", desc = "(Ljava/lang/Object;I)V")
	class476(Object var1, int var2) {
		super(var2);
		this.field3813 = var1;
	}

	@ObfInfo(name = "au", desc = "()Ljava/lang/Object;")
	Object method1999() {
		return this.field3813;
	}

	@ObfInfo(name = "ae", desc = "()Z")
	boolean method1998() {
		return false;
	}
}
