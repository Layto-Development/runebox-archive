public class class359 {
	final int field3041;
	final int field3042;
	final int field3043;

	class359(int var1, int var2, int var3) {
		this.field3042 = var1;
		this.field3041 = var2;
		this.field3043 = var3;
	}

	static int method1943(class60 var0) {
		if (var0.field646 != 11) {
			--class429.field3529;
			class139.field1344[++class203.field1903 - 1] = -1;
			return 1;
		} else {
			String var2 = class139.field1331[--class429.field3529];
			class139.field1344[++class203.field1903 - 1] = var0.method451(var2);
			return 1;
		}
	}

	static final void method1944(int var0) {
		class237.method1361();

		for (class154 var2 = (class154)class154.field1438.method563(); var2 != null; var2 = (class154)class154.field1438.method565()) {
			if (var2.field1448 != null) {
				var2.method883();
			}
		}

		int var4 = class85.method555(var0).field2214;
		if (var4 != 0) {
			int var3 = class23.field443[var0];
			if (var4 == 1) {
				if (var3 == 1) {
					class133.method781(0.9D);
					((class348)class133.field1293.field389).method1909(0.9D);
					class296.method1691();
					class176.field1701.method2513(0.9D);
				}

				if (var3 == 2) {
					class133.method781(0.8D);
					((class348)class133.field1293.field389).method1909(0.8D);
					class296.method1691();
					class176.field1701.method2513(0.8D);
				}

				if (var3 == 3) {
					class177.method1003(0.7D);
				}

				if (var3 == 4) {
					class177.method1003(0.6D);
				}
			}

			if (var4 == 3) {
				if (var3 == 0) {
					class113.method698(255);
				}

				if (var3 == 1) {
					class113.method698(192);
				}

				if (var3 == 2) {
					class113.method698(128);
				}

				if (var3 == 3) {
					class113.method698(64);
				}

				if (var3 == 4) {
					class113.method698(0);
				}
			}

			if (var4 == 4) {
				if (var3 == 0) {
					class465.method2278(127);
				}

				if (var3 == 1) {
					class465.method2278(96);
				}

				if (var3 == 2) {
					class465.method2278(64);
				}

				if (var3 == 3) {
					class465.method2278(32);
				}

				if (var3 == 4) {
					class465.method2278(0);
				}
			}

			if (var4 == 5) {
				Client.field150 = var3 == 1;
			}

			if (var4 == 6) {
				Client.field179 = var3;
			}

			if (var4 == 9) {
			}

			if (var4 == 10) {
				if (var3 == 0) {
					class57.method418(127);
				}

				if (var3 == 1) {
					class57.method418(96);
				}

				if (var3 == 2) {
					class57.method418(64);
				}

				if (var3 == 3) {
					class57.method418(32);
				}

				if (var3 == 4) {
					class57.method418(0);
				}
			}

			if (var4 == 17) {
				Client.field38 = var3 & 65535;
			}

			if (var4 == 18) {
				Client.field32 = (class94)class451.method2249(class288.method1658(), var3);
				if (Client.field32 == null) {
					Client.field32 = class94.field938;
				}
			}

			if (var4 == 19) {
				if (var3 == -1) {
					Client.field142 = -1;
				} else {
					Client.field142 = var3 & 2047;
				}
			}

			if (var4 == 22) {
				Client.field33 = (class94)class451.method2249(class288.method1658(), var3);
				if (null == Client.field33) {
					Client.field33 = class94.field938;
				}
			}

		}
	}
}
