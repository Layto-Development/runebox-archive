public class class474 implements Runnable {
	static class25 field4030;
	volatile class337[] field4031;

	class474() {
		this.field4031 = new class337[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				class337 var2 = this.field4031[var1];
				if (var2 != null) {
					var2.method1863();
				}
			}
		} catch (Exception var3) {
			class41.method263((String)null, var3);
		}

	}

	static final void method2293(int var0, int var1, boolean var2) {
		if (Client.field248[var0] != null) {
			if (var1 >= 0 && var1 < Client.field248[var0].method2157()) {
				class395 var4 = (class395)Client.field248[var0].field3498.get(var1);
				class160 var5 = class85.method556(class129.field1264, Client.field68.field2426);
				var5.field1483.method267(4 + class431.method2196(var4.field3320.method2214()));
				var5.field1483.method267(var0);
				var5.field1483.method308(var1);
				var5.field1483.method269(var2);
				var5.field1483.method270(var4.field3320.method2214());
				Client.field68.method1570(var5);
			}
		}
	}
}
