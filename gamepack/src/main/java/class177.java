public class class177 extends class462 {
	static class253 field1705;
	static int[] field1707;
	int field1702;
	int field1703;
	int field1704;
	int field1706;

	class177(int var1, int var2, int var3, int var4) {
		this.field1706 = var1;
		this.field1702 = var2;
		this.field1703 = var3;
		this.field1704 = var4;
	}

	void method1002(int var1, int var2, int var3, int var4) {
		this.field1706 = var1;
		this.field1702 = var2;
		this.field1703 = var3;
		this.field1704 = var4;
	}

	public static int method1005(CharSequence var0) {
		return class492.method2408(var0, 10, true);
	}

	static int method1004(class12 var0, class12 var1, int var2, boolean var3, int var4, boolean var5) {
		int var7 = class196.method1073(var0, var1, var2, var3);
		if (var7 != 0) {
			return var3 ? -var7 : var7;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var8 = class196.method1073(var0, var1, var4, var5);
			return var5 ? -var8 : var8;
		}
	}

	static final void method1003(double var0) {
		class133.method781(var0);
		((class348)class133.field1293.field389).method1909(var0);
		class296.method1691();
		class176.field1701.method2513(var0);
	}
}
