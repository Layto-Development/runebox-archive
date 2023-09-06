public class class371 extends class538 {
	static class342 field3106;
	String field3104;
	long field3105;
	// $FF: synthetic field
	final class464 this$0;

	class371(class464 var1) {
		this.this$0 = var1;
		this.field3105 = -1L;
		this.field3104 = null;
	}

	void method2583(class42 var1) {
		if (var1.method278() != 255) {
			--var1.field527;
			this.field3105 = var1.method283();
		}

		this.field3104 = var1.method337();
	}

	void method2582(class379 var1) {
		var1.method2033(this.field3105, this.field3104, 0);
	}

	static final int method1977(int var0, int var1, int var2) {
		int var4 = var0 / var2;
		int var5 = var0 & var2 - 1;
		int var6 = var1 / var2;
		int var7 = var1 & var2 - 1;
		int var8 = class64.method484(var4, var6);
		int var9 = class64.method484(var4 + 1, var6);
		int var10 = class64.method484(var4, var6 + 1);
		int var11 = class64.method484(var4 + 1, var6 + 1);
		int var12 = class426.method2178(var8, var9, var5, var2);
		int var13 = class426.method2178(var10, var11, var5, var2);
		return class426.method2178(var12, var13, var7, var2);
	}
}
