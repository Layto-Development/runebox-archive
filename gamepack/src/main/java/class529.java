public class class529 extends class538 {
	int field4264;
	String field4263;
	// $FF: synthetic field
	final class464 this$0;

	class529(class464 var1) {
		this.this$0 = var1;
	}

	void method2583(class42 var1) {
		this.field4264 = var1.method282();
		this.field4263 = var1.method286();
	}

	void method2582(class379 var1) {
		var1.method2031(this.field4264, this.field4263);
	}

	static void method2555(int var0, int var1) {
		int[] var3 = new int[4];
		int[] var4 = new int[4];
		var3[0] = var0;
		var4[0] = var1;
		int var5 = 1;

		for (int var6 = 0; var6 < 4; ++var6) {
			if (var0 != class12.field367[var6]) {
				var3[var5] = class12.field367[var6];
				var4[var5] = class12.field366[var6];
				++var5;
			}
		}

		class12.field367 = var3;
		class12.field366 = var4;
		class172.method978(class225.field2044, 0, class225.field2044.length - 1, class12.field367, class12.field366);
	}

	public static void method2558() {
		class404.field3392.method1887();
	}

	static final void method2557(int var0, int var1, int var2, int var3) {
		Client.field128 = 0;
		int var5 = (class82.field863.field1555 >> 7) + class296.field2735;
		int var6 = class164.field1606 + (class82.field863.field1526 >> 7);
		if (var5 >= 3053 && var5 <= 3156 && var6 >= 3056 && var6 <= 3136) {
			Client.field128 = 1;
		}

		if (var5 >= 3072 && var5 <= 3118 && var6 >= 9492 && var6 <= 9535) {
			Client.field128 = 1;
		}

		if (Client.field128 == 1 && var5 >= 3139 && var5 <= 3199 && var6 >= 3008 && var6 <= 3062) {
			Client.field128 = 0;
		}

	}
}
