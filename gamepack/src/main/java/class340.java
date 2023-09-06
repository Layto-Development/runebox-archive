import java.util.Comparator;
import java.util.Map.Entry;

class class340 implements Comparator {
	static int field2957;
	// $FF: synthetic field
	final class321 this$0;

	class340(class321 var1) {
		this.this$0 = var1;
	}

	int method1873(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public int compare(Object var1, Object var2) {
		return this.method1873((Entry)var1, (Entry)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
