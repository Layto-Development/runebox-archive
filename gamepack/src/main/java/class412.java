import java.util.Iterator;

public class class412 implements Iterator {
	class462 field3443;
	class462 field3444;
	class55 field3442;

	class412(class55 var1) {
		this.field3444 = null;
		this.method2124(var1);
	}

	void method2124(class55 var1) {
		this.field3442 = var1;
		this.method2123();
	}

	void method2123() {
		this.field3443 = this.field3442 != null ? this.field3442.field606.field3986 : null;
		this.field3444 = null;
	}

	public Object next() {
		class462 var1 = this.field3443;
		if (var1 == this.field3442.field606) {
			var1 = null;
			this.field3443 = null;
		} else {
			this.field3443 = var1.field3986;
		}

		this.field3444 = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.field3443 != this.field3442.field606 && this.field3443 != null;
	}

	public void remove() {
		if (this.field3444 == null) {
			throw new IllegalStateException();
		} else {
			this.field3444.method2269();
			this.field3444 = null;
		}
	}
}
