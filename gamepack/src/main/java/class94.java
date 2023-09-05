import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.lang.ref.SoftReference;

@ObfInfo(name = "lx")
public class class94 extends class370 {
	@ObfInfo(name = "au", desc = "Ljava/lang/ref/SoftReference;")
	SoftReference field952;

	@ObfInfo(name = "<init>", desc = "(Ljava/lang/Object;I)V")
	class94(Object var1, int var2) {
		super(var2);
		this.field952 = new SoftReference(var1);
	}

	@ObfInfo(name = "au", desc = "()Ljava/lang/Object;")
	Object method1999() {
		return this.field952.get();
	}

	@ObfInfo(name = "ae", desc = "()Z")
	boolean method1998() {
		return true;
	}
}
