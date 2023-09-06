import java.util.Iterator;

public class class276 implements Iterator {
	class218 field2450;
	class218 field2451;
	class282 field2449;

	class276(class282 var1) {
		this.field2451 = null;
		this.field2449 = var1;
		this.field2450 = this.field2449.field2509.field2029;
		this.field2451 = null;
	}

	public Object next() {
		class218 var1 = this.field2450;
		if (var1 == this.field2449.field2509) {
			var1 = null;
			this.field2450 = null;
		} else {
			this.field2450 = var1.field2029;
		}

		this.field2451 = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.field2450 != this.field2449.field2509;
	}

	public void remove() {
		if (this.field2451 == null) {
			throw new IllegalStateException();
		} else {
			this.field2451.method1252();
			this.field2451 = null;
		}
	}
}
