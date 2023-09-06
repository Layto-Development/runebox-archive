public class class524 extends class217 {
	static boolean field4239;
	final class197 field4238;
	final int field4235;
	final int field4236;
	final int field4237;

	class524(class29 var1, class29 var2, int var3, class197 var4) {
		super(var1, var2);
		this.field4235 = var3;
		this.field4238 = var4;
		class96 var5 = class158.method892(this.method1244());
		class115 var6 = var5.method635(false);
		if (null != var6) {
			this.field4237 = var6.field1084;
			this.field4236 = var6.field1080;
		} else {
			this.field4237 = 0;
			this.field4236 = 0;
		}

	}

	public int method1244() {
		return this.field4235;
	}

	class197 method1250() {
		return this.field4238;
	}

	int method1251() {
		return this.field4237;
	}

	int method1245() {
		return this.field4236;
	}
}
