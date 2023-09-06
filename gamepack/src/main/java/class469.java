public final class class469 {
	class480 field4017;
	class480 field4018;
	class480 field4020;
	int field4015;
	int field4016;
	int field4019;
	int field4022;
	long field4021;

	class469() {
	}

	static Class method2285(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			Class out;
			try {
				out = var0.equals("void") ? Void.TYPE : Class.forName(var0);
				System.out.println("loadClass("+var0+") = "+out);
			} catch (ClassNotFoundException e) {
				try {
					out = class469.class.getClassLoader().loadClass(var0);
				} catch (Throwable e2) {
					e2.printStackTrace();
					throw e;
				}
				throw e;
			}
			return out;
		}
	}

	static void method2287(class102 var0) {
		var0.field1529 = var0.field1018.field3150;
		var0.field1594 = var0.field1018.field3179;
		var0.field1534 = var0.field1018.field3170;
		var0.field1535 = var0.field1018.field3157;
		var0.field1536 = var0.field1018.field3158;
		var0.field1584 = var0.field1018.field3159;
		var0.field1531 = var0.field1018.field3153;
		var0.field1532 = var0.field1018.field3154;
		var0.field1593 = var0.field1018.field3155;
		var0.field1595 = var0.field1018.field3160;
		var0.field1539 = var0.field1018.field3161;
		var0.field1580 = var0.field1018.field3162;
		var0.field1541 = var0.field1018.field3187;
		var0.field1542 = var0.field1018.field3156;
		var0.field1543 = var0.field1018.field3165;
		var0.field1544 = var0.field1018.field3171;
		var0.field1574 = var0.field1018.field3188;
	}

	static final void method2286(class287 var0, int var1, int var2, int var3) {
		if (class82.field863 != var0) {
			if (Client.field152 < 400) {
				String var5;
				if (var0.field2536 == 0) {
					var5 = var0.field2526[0] + var0.field2539 + var0.field2526[1] + class57.method425(var0.field2528, class82.field863.field2528) + " " + class278.field2463 + class433.field3550 + var0.field2528 + class278.field2465 + var0.field2526[2];
				} else {
					var5 = var0.field2526[0] + var0.field2539 + var0.field2526[1] + " " + class278.field2463 + class433.field3714 + var0.field2536 + class278.field2465 + var0.field2526[2];
				}

				int var6;
				if (Client.field168 == 1) {
					class465.method2277(class433.field3704, Client.field169 + " " + class278.field2468 + " " + class394.method2064(16777215) + var5, 14, var1, var2, var3);
				} else if (Client.field95) {
					if ((class306.field2773 & 8) == 8) {
						class465.method2277(Client.field186, Client.field197 + " " + class278.field2468 + " " + class394.method2064(16777215) + var5, 15, var1, var2, var3);
					}
				} else {
					for (var6 = 7; var6 >= 0; --var6) {
						if (null != Client.field26[var6]) {
							short var7 = 0;
							if (Client.field26[var6].equalsIgnoreCase(class433.field3706)) {
								if (class94.field934 == Client.field32) {
									continue;
								}

								if (class94.field933 == Client.field32 || Client.field32 == class94.field938 && var0.field2528 > class82.field863.field2528) {
									var7 = 2000;
								}

								if (class82.field863.field2549 != 0 && var0.field2549 != 0) {
									if (class82.field863.field2549 == var0.field2549) {
										var7 = 2000;
									} else {
										var7 = 0;
									}
								} else if (Client.field32 == class94.field935 && var0.method1642()) {
									var7 = 2000;
								}
							} else if (Client.field140[var6]) {
								var7 = 2000;
							}

							boolean var8 = false;
							int var9 = var7 + Client.field138[var6];
							class465.method2277(Client.field26[var6], class394.method2064(16777215) + var5, var9, var1, var2, var3);
						}
					}
				}

				for (var6 = 0; var6 < Client.field152; ++var6) {
					if (Client.field196[var6] == 23) {
						Client.field277[var6] = class394.method2064(16777215) + var5;
						break;
					}
				}

			}
		}
	}
}
