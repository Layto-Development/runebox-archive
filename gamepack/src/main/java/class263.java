import java.util.Iterator;

public class class263 implements Iterator {

	class292 field2170;

	class77 field2171;

	class77 field2172;

	class263(class292 var1) {
		this.field2172 = null;
		this.method1463(var1);
	}

	void method1463(class292 var1) {
		this.field2170 = var1;
		this.method1462();
	}

	void method1462() {
		this.field2171 = this.field2170 != null ? this.field2170.field2335.field784 : null;
		this.field2172 = null;
	}

	@Override
	public Object next() {
		class77 var1 = this.field2171;
		if (var1 == this.field2170.field2335) {
			var1 = null;
			this.field2171 = null;
		} else {
			this.field2171 = var1.field784;
		}
		this.field2172 = var1;
		return var1;
	}

	@Override
	public boolean hasNext() {
		return this.field2171 != this.field2170.field2335 && this.field2171 != null;
	}

	@Override
	public void remove() {
		if (this.field2172 == null) {
			throw new IllegalStateException();
		} else {
			this.field2172.method318();
			this.field2172 = null;
		}
	}
}
