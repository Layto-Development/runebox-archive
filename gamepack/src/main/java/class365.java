public class class365 implements Runnable {

	static class214 field2924;

	volatile class537[] field2925;

	class365() {
		this.field2925 = new class537[2];
	}

	@Override
	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				class537 var2 = this.field2925[var1];
				if (var2 != null) {
					var2.method2598();
				}
			}
		} catch (Exception var3) {
			class156.method917((String) null, var3);
		}
	}

	static final void method1899(int var0, int var1, boolean var2) {
		if (Client.field1143[var0] != null) {
			if (var1 >= 0 && var1 < Client.field1143[var0].method1800()) {
				class162 var4 = (class162) Client.field1143[var0].field2614.get(var1);
				class457 var5 = class457.method2237(class483.field3878, Client.field963.field1603);
				var5.field3487.method1085(4 + class187.method1159(var4.field1647.method322()));
				var5.field3487.method1085(var0);
				var5.field3487.method1126(var1);
				var5.field3487.method1087(var2);
				var5.field3487.method1088(var4.field1647.method322());
				Client.field963.method911(var5);
			}
		}
	}
}
