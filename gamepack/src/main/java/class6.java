public class class6 extends class538 {
	int field324;
	// $FF: synthetic field
	final class464 this$0;

	class6(class464 var1) {
		this.this$0 = var1;
		this.field324 = -1;
	}

	void method2583(class42 var1) {
		this.field324 = var1.method327();
	}

	void method2582(class379 var1) {
		var1.method2022(this.field324);
	}

	static final boolean method56(byte[] var0, int var1, int var2) {
		boolean var4 = true;
		class42 var5 = new class42(var0);
		int var6 = -1;

		label57:
		while (true) {
			int var7 = var5.method291();
			if (var7 == 0) {
				return var4;
			}

			var6 += var7;
			int var8 = 0;
			boolean var9 = false;

			while (true) {
				int var10;
				while (!var9) {
					var10 = var5.method325();
					if (var10 == 0) {
						continue label57;
					}

					var8 += var10 - 1;
					int var11 = var8 & 63;
					int var12 = var8 >> 6 & 63;
					int var13 = var5.method278() >> 2;
					int var14 = var12 + var1;
					int var15 = var11 + var2;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						class235 var16 = class96.method638(var6, (byte)-45);
						if (var13 != 22 || !Client.field7 || var16.field2130 != 0 || var16.field2123 == 1 || var16.field2110) {
							if (!var16.method1346()) {
								++Client.field75;
								var4 = false;
							}

							var9 = true;
						}
					}
				}

				var10 = var5.method325();
				if (var10 == 0) {
					break;
				}

				var5.method278();
			}
		}
	}
}
