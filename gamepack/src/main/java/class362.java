public class class362 {
	final int field3048;
	final int field3049;
	final String field3050;

	class362(int var1, int var2, String var3) {
		this.field3048 = var1;
		this.field3049 = var2;
		this.field3050 = var3;
	}

	class362(class42 var1) {
		this(var1.method278(), var1.method278(), var1.method286());
	}

	String method1950() {
		return Integer.toHexString(this.field3048) + Integer.toHexString(this.field3049) + this.field3050;
	}

	int method1949() {
		return this.field3049;
	}
}
