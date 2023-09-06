public class class109 implements class367 {
	static final class109 field1047;
	static final class109 field1049;
	static final class109 field1050;
	static final class109 field1051;
	static final class109 field1052;
	static final class109 field1055;
	final int field1048;
	final int field1053;
	final int field1054;

	static {
		field1052 = new class109(0, 0, (String)null, 0);
		field1055 = new class109(1, 1, (String)null, 9);
		field1049 = new class109(2, 2, (String)null, 3);
		field1050 = new class109(3, 3, (String)null, 6);
		field1051 = new class109(4, 4, (String)null, 1);
		field1047 = new class109(5, 5, (String)null, 3);
	}

	class109(int var1, int var2, String var3, int var4) {
		this.field1053 = var1;
		this.field1054 = var2;
		this.field1048 = var4;
	}

	int method682() {
		return this.field1048;
	}

	public int method1970() {
		return this.field1054;
	}

	static void method684(int var0, int var1, int var2, int var3) {
		for (class154 var5 = (class154)class154.field1438.method563(); var5 != null; var5 = (class154)class154.field1438.method565()) {
			if (var5.field1442 != -1 || var5.field1445 != null) {
				int var6 = 0;
				if (var1 > var5.field1439) {
					var6 += var1 - var5.field1439;
				} else if (var1 < var5.field1437) {
					var6 += var5.field1437 - var1;
				}

				if (var2 > var5.field1440) {
					var6 += var2 - var5.field1440;
				} else if (var2 < var5.field1449) {
					var6 += var5.field1449 - var2;
				}

				if (var6 - 64 <= var5.field1441 && class176.field1701.method2517() != 0 && var0 == var5.field1436) {
					var6 -= 64;
					if (var6 < 0) {
						var6 = 0;
					}

					int var7 = (var5.field1441 - var6) * class176.field1701.method2517() / var5.field1441;
					if (var5.field1447 == null) {
						if (var5.field1442 >= 0) {
							class84 var8 = class84.method552(class15.field383, var5.field1442, 0);
							if (var8 != null) {
								class352 var9 = var8.method550().method1922(class231.field2098);
								class515 var10 = class515.method2477(var9, 100, var7);
								var10.method2447(-1);
								class539.field4277.method2045(var10);
								var5.field1447 = var10;
							}
						}
					} else {
						var5.field1447.method2448(var7);
					}

					if (var5.field1443 == null) {
						if (null != var5.field1445 && (var5.field1452 -= var3) <= 0) {
							int var12 = (int)(Math.random() * (double)var5.field1445.length);
							class84 var13 = class84.method552(class15.field383, var5.field1445[var12], 0);
							if (null != var13) {
								class352 var14 = var13.method550().method1922(class231.field2098);
								class515 var11 = class515.method2477(var14, 100, var7);
								var11.method2447(0);
								class539.field4277.method2045(var11);
								var5.field1443 = var11;
								var5.field1452 = var5.field1446 + (int)(Math.random() * (double)(var5.field1444 - var5.field1446));
							}
						}
					} else {
						var5.field1443.method2448(var7);
						if (!var5.field1443.method2270()) {
							var5.field1443 = null;
						}
					}
				} else {
					if (null != var5.field1447) {
						class539.field4277.method2040(var5.field1447);
						var5.field1447 = null;
					}

					if (var5.field1443 != null) {
						class539.field4277.method2040(var5.field1443);
						var5.field1443 = null;
					}
				}
			}
		}

	}

	static void method686(int var0, boolean var1, int var2, boolean var3) {
		if (null != class225.field2044) {
			class446.method2234(0, class225.field2044.length - 1, var0, var1, var2, var3);
		}

	}

	static final void method685(String var0) {
		if (class141.field1358 != null) {
			class160 var2 = class85.method556(class129.field1263, Client.field68.field2426);
			var2.field1483.method267(class431.method2196(var0));
			var2.field1483.method270(var0);
			Client.field68.method1570(var2);
		}
	}
}
