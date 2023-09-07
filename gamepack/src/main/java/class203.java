import java.util.Comparator;
import java.util.Map.Entry;

class class203 implements Comparator {

	static int field1892;

	// $FF: synthetic field
	final class324 this$0;

	class203(class324 var1) {
		this.this$0 = var1;
	}

	int method1219(Entry var1, Entry var2) {
		return ((Float) var2.getValue()).compareTo((Float) var1.getValue());
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method1219((Entry) var1, (Entry) var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
