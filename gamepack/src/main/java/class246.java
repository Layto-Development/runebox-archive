import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "tn")
class class246 implements Iterator {
	@ObfInfo(name = "au", desc = "I", intMultiplier = 1383103345)
	int field2070;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lth;")
	final class267 this$0;

	@ObfInfo(name = "<init>", desc = "(Lth;)V")
	class246(class267 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "hasNext", desc = "()Z")
	public boolean hasNext() {
		return this.field2070 < this.this$0.method2088();
	}

	@ObfInfo(name = "next", desc = "()Ljava/lang/Object;")
	public Object next() {
		int var1 = ++this.field2070 - 1;
		class309 var2 = (class309)this.this$0.field2159.method1219((long)var1);
		return null != var2 ? var2 : this.this$0.method1391(var1);
	}

	@ObfInfo(name = "remove", desc = "()V")
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
