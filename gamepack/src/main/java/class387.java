import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class class387 implements Iterator {
	class2 field3264;
	int field3265;
	int field3266;

	class387(class2 var1) {
		this.field3265 = 0;
		this.field3266 = this.field3264.field307;
		this.field3264 = var1;
	}

	public boolean hasNext() {
		return this.field3265 < this.field3264.field311;
	}

	public Object next() {
		if (this.field3266 != this.field3264.field307) {
			throw new ConcurrentModificationException();
		} else if (this.field3265 < this.field3264.field311) {
			Object var1 = this.field3264.field309[this.field3265].field3538;
			++this.field3265;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
