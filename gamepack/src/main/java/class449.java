public class class449 {
	class449() throws Throwable {
	}

	static final void method2240(boolean var0, class347 var1) {
		while (true) {
			byte var3 = 16;
			int var4 = 1 << var3;
			if (var1.method1904(Client.field68.field2429) >= var3 + 12) {
				int var5 = var1.method1903(var3);
				if (var5 != var4 - 1) {
					boolean var6 = false;
					if (null == Client.field63[var5]) {
						Client.field63[var5] = new class102();
						var6 = true;
					}

					class102 var7 = Client.field63[var5];
					Client.field2[++Client.field64 - 1] = var5;
					var7.field1590 = Client.field306;
					int var9;
					if (var0) {
						var9 = var1.method1903(8);
						if (var9 > 127) {
							var9 -= 256;
						}
					} else {
						var9 = var1.method1903(5);
						if (var9 > 15) {
							var9 -= 32;
						}
					}

					boolean var11 = var1.method1903(1) == 1;
					if (var11) {
						var1.method1903(32);
					}

					int var8 = var1.method1903(1);
					int var12 = Client.field184[var1.method1903(3)];
					if (var6) {
						var7.field1566 = var7.field1527 = var12;
					}

					var7.field1018 = class150.method861(var1.method1903(14));
					int var13 = var1.method1903(1);
					if (var13 == 1) {
						Client.field214[++Client.field117 - 1] = var5;
					}

					int var10;
					if (var0) {
						var10 = var1.method1903(8);
						if (var10 > 127) {
							var10 -= 256;
						}
					} else {
						var10 = var1.method1903(5);
						if (var10 > 15) {
							var10 -= 32;
						}
					}

					class469.method2287(var7);
					if (var7.field1594 == 0) {
						var7.field1527 = 0;
					}

					var7.method658(class82.field863.field1600[0] + var9, class82.field863.field1597[0] + var10, var8 == 1);
					continue;
				}
			}

			var1.method1906();
			return;
		}
	}

	static void method2239() {
		class22.method185();
		Client.field158[0] = class433.field3783;
		Client.field277[0] = "";
		Client.field196[0] = 1006;
		Client.field160[0] = false;
		Client.field152 = 1;
	}
}
