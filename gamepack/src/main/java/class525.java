import java.util.Iterator;

class class525 implements Iterator {

	int field4172;

	// $FF: synthetic field
	final class335 this$0;

	class525(class335 var1) {
		this.this$0 = var1;
	}

	@Override
	public boolean hasNext() {
		return this.field4172 < this.this$0.method2230();
	}

	@Override
	public Object next() {
		int var1 = ++this.field4172 - 1;
		class56 var2 = (class56) this.this$0.field2561.method1166((long) var1);
		return null != var2 ? var2 : this.this$0.method1755(var1);
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
