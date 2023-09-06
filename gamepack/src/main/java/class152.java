public class class152 extends class212 {
	class152() {
	}

	void method877(class42 var1) {
		int var3 = var1.method278();
		if (var3 != class368.field3099.field3101) {
			throw new IllegalStateException("");
		} else {
			super.field1991 = var1.method278();
			super.field1992 = var1.method278();
			super.field1996 = var1.method327();
			super.field1994 = var1.method327();
			super.field1990 = var1.method327();
			super.field1997 = var1.method327();
			super.field1998 = var1.method326();
			super.field1988 = var1.method326();
		}
	}

	void method1202(class42 var1) {
		super.field1992 = Math.min(super.field1992, 4);
		super.field1995 = new short[1][64][64];
		super.field1993 = new short[super.field1992][64][64];
		super.field2002 = new byte[super.field1992][64][64];
		super.field1989 = new byte[super.field1992][64][64];
		super.field1999 = new class359[super.field1992][64][64][];
		int var3 = var1.method278();
		if (class295.field2727.field2728 != var3) {
			throw new IllegalStateException("");
		} else {
			int var4 = var1.method278();
			int var5 = var1.method278();
			if (var4 == super.field1990 && var5 == super.field1997) {
				for (int var6 = 0; var6 < 64; ++var6) {
					for (int var7 = 0; var7 < 64; ++var7) {
						this.method1204(var6, var7, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class152)) {
			return false;
		} else {
			class152 var2 = (class152)var1;
			return super.field1990 == var2.field1990 && super.field1997 == var2.field1997;
		}
	}

	public int hashCode() {
		return super.field1990 | super.field1997 << 8;
	}

	static final void method875(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}

	}

	static final void method876(boolean var0) {
		for (int var2 = 0; var2 < Client.field64; ++var2) {
			class102 var3 = Client.field63[Client.field2[var2]];
			if (null != var3 && var3.method899() && var0 == var3.field1018.field3176 && var3.field1018.method2005()) {
				int var4 = var3.field1555 >> 7;
				int var5 = var3.field1526 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var3.field1529 == 1 && (var3.field1555 & 127) == 64 && (var3.field1526 & 127) == 64) {
						if (Client.field119[var4][var5] == Client.field173) {
							continue;
						}

						Client.field119[var4][var5] = Client.field173;
					}

					long var6 = class182.method1013(0, 0, 1, !var3.field1018.field3183, Client.field2[var2]);
					var3.field1561 = Client.field306;
					class415.field3487.method1762(class358.field3038, var3.field1555, var3.field1526, class454.method2262(var3.field1529 * 64 - 64 + var3.field1555, var3.field1529 * 64 - 64 + var3.field1526, class358.field3038), var3.field1529 * 64 - 64 + 60, var3, var3.field1527, var6, var3.field1533);
				}
			}
		}

	}

	static final String method878(int var0) {
		String var2 = Integer.toString(var0);

		for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
			var2 = var2.substring(0, var3) + class278.field2467 + var2.substring(var3);
		}

		if (var2.length() > 9) {
			return " " + class394.method2064(65408) + var2.substring(0, var2.length() - 8) + class433.field3609 + " " + class278.field2463 + var2 + class278.field2465 + class278.field2470;
		} else {
			return var2.length() > 6 ? " " + class394.method2064(16777215) + var2.substring(0, var2.length() - 4) + class433.field3717 + " " + class278.field2463 + var2 + class278.field2465 + class278.field2470 : " " + class394.method2064(16776960) + var2 + class278.field2470;
		}
	}
}
