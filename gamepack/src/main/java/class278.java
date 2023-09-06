public class class278 {
	static String field2463;
	static String field2464;
	static String field2465;
	static String field2466;
	static String field2467;
	static String field2468;
	static String field2469;
	static String field2470;

	static {
		field2464 = "true";
		field2467 = ",";
		field2466 = "|";
		field2463 = " (";
		field2465 = ")";
		field2468 = "->";
		field2469 = "<br>";
		field2470 = "</col>";
	}

	class278() throws Throwable {
	}

	public static boolean method1593(int var0) {
		return var0 >= class236.field2162.field2165 && var0 <= class236.field2160.field2165 || var0 == class236.field2178.field2165;
	}

	static void method1594() {
		class312.field2812.clear();
		class312.field2812.add(100);
		class312.field2812.add(5000);
		class312.field2812.add(10000);
		class312.field2812.add(30000);
	}

	static int method1595(int var0, class167 var1, boolean var2) {
		if (var0 == 6754) {
			int var6 = class139.field1344[--class203.field1903];
			class375 var7 = class150.method861(var6);
			class139.field1331[++class429.field3529 - 1] = null != var7 ? var7.field3149 : "";
			return 1;
		} else {
			class375 var4;
			if (var0 == 6764) {
				class203.field1903 -= 2;
				var4 = class150.method861(class139.field1344[class203.field1903]);
				int var5 = class139.field1344[class203.field1903 + 1];
				class139.field1344[++class203.field1903 - 1] = var4.method2002(var5);
				class139.field1344[++class203.field1903 - 1] = var4.method2007(var5);
				return 1;
			} else if (var0 == 6765) {
				var4 = class150.method861(class139.field1344[--class203.field1903]);
				class139.field1344[++class203.field1903 - 1] = null != var4 ? var4.field3173 : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}
}
