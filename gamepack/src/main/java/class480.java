public abstract class class480 extends class218 {
	public int field4080;

	protected class480() {
		this.field4080 = 1000;
	}

	void method2392(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		class250 var11 = this.method2393();
		if (var11 != null) {
			this.field4080 = var11.field4080;
			var11.method2392(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}

	}

	protected class250 method2393() {
		return null;
	}

	public static void method2395() {
		class207.field1917.method1887();
	}

	static final void method2394() {
		if (Client.field56 > 0) {
			class124.method763();
		} else {
			Client.field71.method64();
			class104.method675(40);
			class431.field3536 = Client.field68.method1573();
			Client.field68.method1572();
		}
	}
}
