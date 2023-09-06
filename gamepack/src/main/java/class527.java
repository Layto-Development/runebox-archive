public class class527 extends class538 {
	static class115 field4251;
	static Thread field4254;
	int field4253;
	long field4252;
	// $FF: synthetic field
	final class464 this$0;

	class527(class464 var1) {
		this.this$0 = var1;
	}

	void method2583(class42 var1) {
		this.field4253 = var1.method282();
		this.field4252 = var1.method283();
	}

	void method2582(class379 var1) {
		var1.method2030(this.field4253, this.field4252);
	}

	static final void method2550() {
		for (class402 var1 = (class402)Client.field273.method563(); var1 != null; var1 = (class402)Client.field273.method565()) {
			if (var1.field3373 == class358.field3038 && !var1.field3379) {
				if (Client.field306 >= var1.field3372) {
					var1.method2082(Client.field82);
					if (var1.field3379) {
						var1.method2269();
					} else {
						class415.field3487.method1762(var1.field3373, var1.field3374, var1.field3375, var1.field3371, 60, var1, 0, -1L, false);
					}
				}
			} else {
				var1.method2269();
			}
		}

	}
}
