public class class443 extends class417 {

	static class84 field3443;

	static Thread field3446;

	int field3445;

	long field3444;

	// $FF: synthetic field
	final class400 this$0;

	class443(class400 var1) {
		this.this$0 = var1;
	}

	@Override
	void method2095(class187 var1) {
		this.field3445 = var1.method1100();
		this.field3444 = var1.method1101();
	}

	@Override
	void method2094(class518 var1) {
		var1.method2510(this.field3445, this.field3444);
	}

	static final void method2196() {
		for (class435 var1 = (class435) Client.field1168.method2218(); var1 != null; var1 = (class435) Client.field1168.method2220()) {
			if (var1.field3412 == class121.field1436 && !var1.field3418) {
				if (Client.field1201 >= var1.field3411) {
					var1.method2169(Client.field977);
					if (var1.field3418) {
						var1.method318();
					} else {
						class377.field3061.method1924(var1.field3412, var1.field3413, var1.field3414, var1.field3410, 60, var1, 0, -1L, false);
					}
				}
			} else {
				var1.method318();
			}
		}
	}
}
