import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class class143 implements Iterator {

	class505 field1545;

	int field1546;

	int field1547;

	class143(class505 var1) {
		this.field1546 = 0;
		this.field1547 = this.field1545.field4049;
		this.field1545 = var1;
	}

	@Override
	public boolean hasNext() {
		return this.field1546 < this.field1545.field4053;
	}

	@Override
	public Object next() {
		if (this.field1547 != this.field1545.field4049) {
			throw new ConcurrentModificationException();
		} else if (this.field1546 < this.field1545.field4053) {
			Object var1 = this.field1545.field4051[this.field1546].field2922;
			++this.field1546;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
