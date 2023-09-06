public class class136 extends class303 {
	static class296 field1326;
	int field1321;
	final class262 field1325;
	final class392 field1320;
	public byte field1323;
	public int field1324;
	public String field1319;
	public String field1322;

	public class136(class392 var1, class262 var2) {
		super(500);
		this.field1319 = null;
		this.field1322 = null;
		this.field1321 = 1;
		this.field1320 = var1;
		this.field1325 = var2;
	}

	class71 method1721() {
		return new class166();
	}

	class71[] method1715(int var1) {
		return new class166[var1];
	}

	final void method819(String var1) {
		this.field1319 = class465.method2279(var1);
	}

	final void method820(String var1) {
		this.field1322 = class465.method2279(var1);
	}

	public final void method821(class42 var1, int var2) {
		this.method820(var1.method286());
		long var4 = var1.method283();
		long var7 = var4;
		String var6;
		int var9;
		if (var4 > 0L && var4 < 6582952005840035281L) {
			if (var4 % 37L == 0L) {
				var6 = null;
			} else {
				var9 = 0;

				for (long var10 = var4; 0L != var10; var10 /= 37L) {
					++var9;
				}

				StringBuilder var12 = new StringBuilder(var9);

				while (var7 != 0L) {
					long var13 = var7;
					var7 /= 37L;
					var12.append(class79.field841[(int)(var13 - var7 * 37L)]);
				}

				var6 = var12.reverse().toString();
			}
		} else {
			var6 = null;
		}

		this.method819(var6);
		this.field1323 = var1.method279();
		short var15;
		if (var2 == 1) {
			var9 = var1.method278();
			var15 = 255;
		} else {
			if (var2 != 2) {
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
			}

			var9 = var1.method290();
			var15 = -1;
		}

		if (var15 != var9) {
			int var11 = var9;
			this.method1703();

			for (int var16 = 0; var16 < var11; ++var16) {
				class166 var17 = (class166)this.method1718(new class440(var1.method286(), this.field1320));
				int var14 = var1.method327();
				var17.method1728(var14, ++this.field1321 - 1);
				var17.field2770 = var1.method279();
				var1.method286();
				this.method824(var17);
			}

		}
	}

	public final void method822(class42 var1, byte var2) {
		class440 var3 = new class440(var1.method286(), this.field1320);
		int var4 = var1.method327();
		byte var5 = var1.method279();
		boolean var6 = false;
		if (var5 == -128) {
			if (var2 == -1) {
				return;
			}

			var6 = true;
		}

		class166 var7;
		if (var6) {
			if (var2 == -1) {
				throw new IllegalStateException();
			}

			if (this.method1724() == 0) {
				if (var2 == -1) {
					throw new IllegalStateException();
				}

				return;
			}

			var7 = (class166)this.method1706(var3);
			if (var7 != null) {
				if (var2 == -1) {
					return;
				}

				if (var7.method1729() == var4) {
					if (var2 == -1) {
						throw new IllegalStateException();
					}

					this.method1707(var7);
				}
			}
		} else {
			var1.method286();
			var7 = (class166)this.method1706(var3);
			if (null == var7) {
				if (var2 == -1) {
					throw new IllegalStateException();
				}

				if (this.method1724() > super.field2764) {
					return;
				}

				var7 = (class166)this.method1718(var3);
			}

			var7.method1728(var4, ++this.field1321 - 1);
			var7.field2770 = var5;
			this.method824(var7);
		}

	}

	public final void method823() {
		for (int var2 = 0; var2 < this.method1724(); ++var2) {
			((class166)this.method1711(var2)).method916();
		}

	}

	public final void method818(byte var1) {
		for (int var2 = 0; var2 < this.method1724(); ++var2) {
			if (var1 != -1) {
				throw new IllegalStateException();
			}

			((class166)this.method1711(var2)).method921();
		}

	}

	final void method824(class166 var1) {
		if (var1.method508().equals(this.field1325.method1518())) {
			this.field1324 = var1.field2770;
		}

	}

	static void method827(int var0, int var1, int var2, int var3) {
		class281 var5 = (class281)class281.field2506.method1492((long)var0);
		if (var5 == null) {
			var5 = new class281();
			class281.field2506.method1495(var5, (long)var0);
		}

		if (var5.field2505.length <= var1) {
			int[] var6 = new int[var1 + 1];
			int[] var7 = new int[var1 + 1];

			int var8;
			for (var8 = 0; var8 < var5.field2505.length; ++var8) {
				var6[var8] = var5.field2505[var8];
				var7[var8] = var5.field2504[var8];
			}

			for (var8 = var5.field2505.length; var8 < var1; ++var8) {
				var6[var8] = -1;
				var7[var8] = 0;
			}

			var5.field2505 = var6;
			var5.field2504 = var7;
		}

		var5.field2505[var1] = var2;
		var5.field2504[var1] = var3;
	}

	static final void method828(byte[] var0, int var1, int var2, class317 var3, class76[] var4) {
		class42 var6 = new class42(var0);
		int var7 = -1;

		while (true) {
			int var8 = var6.method291();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;

			while (true) {
				int var10 = var6.method325();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 63;
				int var12 = var9 >> 6 & 63;
				int var13 = var9 >> 12;
				int var14 = var6.method278();
				int var15 = var14 >> 2;
				int var16 = var14 & 3;
				int var17 = var1 + var12;
				int var18 = var11 + var2;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((class38.field513[1][var17][var18] & 2) == 2) {
						var19 = var13 - 1;
					}

					class76 var20 = null;
					if (var19 >= 0) {
						var20 = var4[var19];
					}

					class224.method1264(var13, var17, var18, var7, var16, var15, var3, var20);
				}
			}
		}
	}
}
