public abstract class class1 {
	String field1;
	// $FF: synthetic field
	final class226 this$0;

	class1(class226 var1, String var2) {
		this.this$0 = var1;
		this.field1 = var2;
	}

	public abstract int method4();

	public String method1() {
		return this.field1;
	}

	public String method2() {
		return null;
	}

	public int method3() {
		return -1;
	}

	static String method5(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return Client.field277[var0].length() > 0 ? Client.field158[var0] + class433.field3588 + Client.field277[var0] : Client.field158[var0];
		}
	}
}
