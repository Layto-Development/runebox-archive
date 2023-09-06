public class class335 extends class538 {
	boolean field2931;
	int field2932;
	// $FF: synthetic field
	final class464 this$0;

	class335(class464 var1) {
		this.this$0 = var1;
		this.field2932 = -1;
	}

	void method2583(class42 var1) {
		this.field2932 = var1.method327();
		this.field2931 = var1.method278() == 1;
	}

	void method2582(class379 var1) {
		var1.method2035(this.field2932, this.field2931);
	}

	public static int method1850(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}
}
