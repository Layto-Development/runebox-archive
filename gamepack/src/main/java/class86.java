import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfInfo(name = "pr")
public class class86 implements Iterator {
	@ObfInfo(name = "au", desc = "Lpa;")
	class332 field880;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 150272453)
	int field881;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1979527987)
	int field882;

	@ObfInfo(name = "<init>", desc = "(Lpa;)V")
	class86(class332 var1) {
		this.field881 = 0;
		this.field882 = this.field880.field2635;
		this.field880 = var1;
	}

	@ObfInfo(name = "hasNext", desc = "()Z")
	public boolean hasNext() {
		return this.field881 < this.field880.field2639;
	}

	@ObfInfo(name = "next", desc = "()Ljava/lang/Object;")
	public Object next() {
		if (this.field882 != this.field880.field2635) {
			throw new ConcurrentModificationException();
		} else if (this.field881 < this.field880.field2639) {
			Object var1 = this.field880.field2637[this.field881].field2223;
			++this.field881;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	@ObfInfo(name = "remove", desc = "()V")
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
