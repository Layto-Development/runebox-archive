import java.util.Iterator;

public class class376 implements Iterator {

	class139 field3037;

	class310 field3038;

	class310 field3039;

	class376(class139 var1) {
		this.field3039 = null;
		this.field3037 = var1;
		this.field3038 = this.field3037.field1534.field2427;
		this.field3039 = null;
	}

	@Override
	public Object next() {
		class310 var1 = this.field3038;
		if (var1 == this.field3037.field1534) {
			var1 = null;
			this.field3038 = null;
		} else {
			this.field3038 = var1.field2427;
		}
		this.field3039 = var1;
		return var1;
	}

	@Override
	public boolean hasNext() {
		return this.field3038 != this.field3037.field1534;
	}

	@Override
	public void remove() {
		if (this.field3039 == null) {
			throw new IllegalStateException();
		} else {
			this.field3039.method1674();
			this.field3039 = null;
		}
	}
}
