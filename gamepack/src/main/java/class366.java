public class class366 {
	static final class366 field3083;
	static final class366 field3084;
	static final class366 field3085;
	static final class366 field3086;
	static final class366 field3087;
	static final class366 field3088;
	static final class366 field3089;
	static final class366 field3090;
	static final class366 field3091;
	static final class366 field3092;
	static final class366 field3093;
	static final class366 field3094;
	static final class366 field3095;
	static final class366 field3096;
	static final class366 field3097;
	static final class366 field3098;

	static {
		field3093 = new class366();
		field3084 = new class366();
		field3092 = new class366();
		field3086 = new class366();
		field3087 = new class366();
		field3091 = new class366();
		field3089 = new class366();
		field3090 = new class366();
		field3083 = new class366();
		field3097 = new class366();
		field3098 = new class366();
		field3095 = new class366();
		field3094 = new class366();
		field3088 = new class366();
		field3096 = new class366();
		field3085 = new class366();
	}

	class366() {
	}

	public static class60 method1967(int var0) {
		int var2 = var0 >> 16;
		int var3 = var0 & 65535;
		if (null == class160.field1484[var2] || class160.field1484[var2][var3] == null) {
			boolean var4 = class292.method1669(var2);
			if (!var4) {
				return null;
			}
		}

		return class160.field1484[var2][var3];
	}

	static void method1968(class287 var0, boolean var1) {
		if (null != var0 && var0.method899() && !var0.field2542) {
			var0.field2540 = false;
			if ((Client.field7 && class481.field4085 > 50 || class481.field4085 > 200) && var1 && var0.field1531 == var0.field1538) {
				var0.field2540 = true;
			}

			int var3 = var0.field1555 >> 7;
			int var4 = var0.field1526 >> 7;
			if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
				long var5 = class182.method1013(0, 0, 0, false, var0.field2522);
				if (null != var0.field2535 && Client.field306 >= var0.field2531 && Client.field306 < var0.field2541) {
					var0.field2540 = false;
					var0.field2529 = class454.method2262(var0.field1555, var0.field1526, class358.field3038);
					var0.field1561 = Client.field306;
					class415.field3487.method1763(class358.field3038, var0.field1555, var0.field1526, var0.field2529, 60, var0, var0.field1527, var5, var0.field2547, var0.field2537, var0.field2538, var0.field2527);
				} else {
					if ((var0.field1555 & 127) == 64 && (var0.field1526 & 127) == 64) {
						if (Client.field173 == Client.field119[var3][var4]) {
							return;
						}

						Client.field119[var3][var4] = Client.field173;
					}

					var0.field2529 = class454.method2262(var0.field1555, var0.field1526, class358.field3038);
					var0.field1561 = Client.field306;
					class415.field3487.method1762(class358.field3038, var0.field1555, var0.field1526, var0.field2529, 60, var0, var0.field1527, var5, var0.field1533);
				}
			}
		}

	}

	static final void method1969(class534 var0, boolean var1) {
		int var3 = var0.field4270;
		int var4 = (int)var0.field3987;
		var0.method2269();
		if (var1) {
			class43.method344(var3);
		}

		class183.method1016(var3);
		class60 var5 = method1967(var4);
		if (var5 != null) {
			class185.method1024(var5);
		}

		if (Client.field175 != -1) {
			class465.method2276(Client.field175, 1);
		}

	}
}
