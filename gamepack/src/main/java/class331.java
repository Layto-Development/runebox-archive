import java.util.Iterator;

public class class331 implements Iterator {

	class419 field2542;

	class77 field2543;

	class77 field2545;

	int field2544;

	public class331(class419 var1) {
		this.field2545 = null;
		this.field2542 = var1;
		this.method1734();
	}

	void method1734() {
		this.field2543 = this.field2542.field3234[0].field784;
		this.field2544 = 1;
		this.field2545 = null;
	}

	public class77 method1735() {
		this.method1734();
		return (class77) this.next();
	}

	@Override
	public Object next() {
		class77 var1;
		if (this.field2543 != this.field2542.field3234[this.field2544 - 1]) {
			var1 = this.field2543;
			this.field2543 = var1.field784;
			this.field2545 = var1;
			return var1;
		} else {
			do {
				if (this.field2544 >= this.field2542.field3233) {
					return null;
				}
				var1 = this.field2542.field3234[this.field2544++].field784;
			} while (var1 == this.field2542.field3234[this.field2544 - 1]);
			this.field2543 = var1.field784;
			this.field2545 = var1;
			return var1;
		}
	}

	@Override
	public boolean hasNext() {
		if (this.field2543 != this.field2542.field3234[this.field2544 - 1]) {
			return true;
		} else {
			while (this.field2544 < this.field2542.field3233) {
				if (this.field2542.field3234[this.field2544++].field784 != this.field2542.field3234[this.field2544 - 1]) {
					this.field2543 = this.field2542.field3234[this.field2544 - 1].field784;
					return true;
				}
				this.field2543 = this.field2542.field3234[this.field2544 - 1];
			}
			return false;
		}
	}

	@Override
	public void remove() {
		if (this.field2545 == null) {
			throw new IllegalStateException();
		} else {
			this.field2545.method318();
			this.field2545 = null;
		}
	}
}
