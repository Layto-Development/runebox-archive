import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "ot")
public class class433 implements Iterator {
	@ObfInfo(name = "ae", desc = "Lsj;")
	class155 field3276;
	@ObfInfo(name = "ao", desc = "Lsj;")
	class155 field3277;
	@ObfInfo(name = "au", desc = "Loc;")
	class471 field3275;

	@ObfInfo(name = "<init>", desc = "(Loc;)V")
	class433(class471 var1) {
		this.field3277 = null;
		this.method2254(var1);
	}

	@ObfInfo(name = "au", desc = "(Loc;)V")
	void method2254(class471 var1) {
		this.field3275 = var1;
		this.method2253();
	}

	@ObfInfo(name = "ae", desc = "()V")
	void method2253() {
		this.field3276 = this.field3275 != null ? this.field3275.field3805.field1482 : null;
		this.field3277 = null;
	}

	@ObfInfo(name = "next", desc = "()Ljava/lang/Object;")
	public Object next() {
		class155 var1 = this.field3276;
		if (var1 == this.field3275.field3805) {
			var1 = null;
			this.field3276 = null;
		} else {
			this.field3276 = var1.field1482;
		}

		this.field3277 = var1;
		return var1;
	}

	@ObfInfo(name = "hasNext", desc = "()Z")
	public boolean hasNext() {
		return this.field3276 != this.field3275.field3805 && this.field3276 != null;
	}

	@ObfInfo(name = "remove", desc = "()V")
	public void remove() {
		if (this.field3277 == null) {
			throw new IllegalStateException();
		} else {
			this.field3277.method907();
			this.field3277 = null;
		}
	}
}
