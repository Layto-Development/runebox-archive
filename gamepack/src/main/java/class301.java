import java.util.Iterator;

public class class301 implements Iterator {
	class462 field2754;
	class462 field2756;
	class526 field2753;
	int field2755;

	public class301(class526 var1) {
		this.field2756 = null;
		this.field2753 = var1;
		this.method1697();
	}

	void method1697() {
		this.field2754 = this.field2753.field4247[0].field3986;
		this.field2755 = 1;
		this.field2756 = null;
	}

	public class462 method1698() {
		this.method1697();
		return (class462)this.next();
	}

	public Object next() {
		class462 var1;
		if (this.field2754 != this.field2753.field4247[this.field2755 - 1]) {
			var1 = this.field2754;
			this.field2754 = var1.field3986;
			this.field2756 = var1;
			return var1;
		} else {
			do {
				if (this.field2755 >= this.field2753.field4246) {
					return null;
				}

				var1 = this.field2753.field4247[this.field2755++].field3986;
			} while(var1 == this.field2753.field4247[this.field2755 - 1]);

			this.field2754 = var1.field3986;
			this.field2756 = var1;
			return var1;
		}
	}

	public boolean hasNext() {
		if (this.field2754 != this.field2753.field4247[this.field2755 - 1]) {
			return true;
		} else {
			while (this.field2755 < this.field2753.field4246) {
				if (this.field2753.field4247[this.field2755++].field3986 != this.field2753.field4247[this.field2755 - 1]) {
					this.field2754 = this.field2753.field4247[this.field2755 - 1].field3986;
					return true;
				}

				this.field2754 = this.field2753.field4247[this.field2755 - 1];
			}

			return false;
		}
	}

	public void remove() {
		if (this.field2756 == null) {
			throw new IllegalStateException();
		} else {
			this.field2756.method2269();
			this.field2756 = null;
		}
	}
}
