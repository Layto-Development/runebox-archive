public class class261 extends class268 {
	final boolean field2379;

	public class261(boolean var1) {
		this.field2379 = var1;
	}

	int method1517(class304 var1, class304 var2) {
		if (var1.field2769 != 0 && var2.field2769 != 0) {
			return this.field2379 ? var1.field2768 - var2.field2768 : var2.field2768 - var1.field2768;
		} else {
			return this.method1568(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method1517((class304)var1, (class304)var2);
	}

	static final int method1516(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
