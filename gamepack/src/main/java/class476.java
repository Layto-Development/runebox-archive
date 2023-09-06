public class class476 extends class217 {
	class197 field4040;
	int field4037;
	int field4041;
	int field4042;
	final class87 field4039;
	final int field4038;

	class476(class29 var1, class29 var2, int var3, class87 var4) {
		super(var1, var2);
		this.field4038 = var3;
		this.field4039 = var4;
		this.method2303();
	}

	void method2303() {
		this.field4037 = class96.method638(this.field4038, (byte)-56).method1350().field2140;
		this.field4040 = this.field4039.method588(class158.method892(this.field4037));
		class96 var2 = class158.method892(this.method1244());
		class115 var3 = var2.method635(false);
		if (null != var3) {
			this.field4041 = var3.field1084;
			this.field4042 = var3.field1080;
		} else {
			this.field4041 = 0;
			this.field4042 = 0;
		}

	}

	public int method1244() {
		return this.field4037;
	}

	class197 method1250() {
		return this.field4040;
	}

	int method1251() {
		return this.field4041;
	}

	int method1245() {
		return this.field4042;
	}

	public static int method2304(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	static final void method2302() {
		class160 var1 = class85.method556(class129.field1184, Client.field68.field2426);
		Client.field68.method1570(var1);
		class139.field1339 = true;

		for (class534 var2 = (class534)Client.field24.method1493(); var2 != null; var2 = (class534)Client.field24.method1494()) {
			if (var2.field4268 == 0 || var2.field4268 == 3) {
				class366.method1969(var2, true);
			}
		}

		if (Client.field180 != null) {
			class185.method1024(Client.field180);
			Client.field180 = null;
		}

		class139.field1339 = false;
	}
}
