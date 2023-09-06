import java.util.Iterator;

class class346 implements Iterator {
	int field2989;
	// $FF: synthetic field
	final class453 this$0;

	class346(class453 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field2989 < this.this$0.method2170();
	}

	public Object next() {
		int var1 = ++this.field2989 - 1;
		class523 var2 = (class523)this.this$0.field3960.method1580((long)var1);
		return null != var2 ? var2 : this.this$0.method2254(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
