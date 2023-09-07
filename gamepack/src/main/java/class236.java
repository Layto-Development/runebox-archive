public class class236 extends class417 {

	static class144 field2028;

	static class354[] field2030;

	static int[][] field2029;

	int field2031;

	// $FF: synthetic field
	final class400 this$0;

	class236(class400 var1) {
		this.this$0 = var1;
		this.field2031 = -1;
	}

	@Override
	void method2095(class187 var1) {
		this.field2031 = var1.method1145();
	}

	@Override
	void method2094(class518 var1) {
		var1.method2506(this.field2031);
	}

	static void method1385(int var0, class402 var1, boolean var2) {
		class277 var4 = Client.method534().method1656(var0);
		int var5 = class431.field3378.field826;
		int var6 = class346.field2624 + (class431.field3378.field272 >> 7);
		int var7 = (class431.field3378.field243 >> 7) + class211.field1922;
		class402 var8 = new class402(var5, var6, var7);
		Client.method534().method1626(var4, var8, var1, var2);
	}
}
