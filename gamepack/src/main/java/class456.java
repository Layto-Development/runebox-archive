public class class456 extends class268 {
	final boolean field3971;

	public class456(boolean var1) {
		this.field3971 = var1;
	}

	int method2265(class304 var1, class304 var2) {
		if (var1.field2769 != var2.field2769) {
			return this.field3971 ? var1.field2769 - var2.field2769 : var2.field2769 - var1.field2769;
		} else {
			return this.method1568(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2265((class304)var1, (class304)var2);
	}

	public static int method2266(int var0) {
		return var0 >>> 12;
	}
}
