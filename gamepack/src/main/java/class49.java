import java.util.Comparator;

class class49 implements Comparator {

	static class338 field235;

	// $FF: synthetic field
	final class185 this$0;

	class49(class185 var1) {
		this.this$0 = var1;
	}

	int method198(class231 var1, class231 var2) {
		if (var1.field2009 > var2.field2009) {
			return 1;
		} else {
			return var1.field2009 < var2.field2009 ? -1 : 0;
		}
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method198((class231) var1, (class231) var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
