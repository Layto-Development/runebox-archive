public class class404 extends class218 {
	public static class215 field3383;
	public static class215 field3384;
	public static int field3386;
	static class344 field3392;
	int[] field3388;
	int[] field3394;
	short[] field3385;
	short[] field3389;
	short[] field3390;
	short[] field3391;
	public boolean field3393;
	public int field3387;

	static {
		field3392 = new class344(64);
	}

	class404() {
		this.field3387 = -1;
		this.field3394 = new int[]{-1, -1, -1, -1, -1};
		this.field3393 = false;
	}

	void method2089(class42 var1) {
		while (true) {
			int var3 = var1.method278();
			if (var3 == 0) {
				return;
			}

			this.method2088(var1, var3);
		}
	}

	void method2088(class42 var1, int var2) {
		if (var2 == 1) {
			this.field3387 = var1.method278();
		} else {
			int var4;
			int var5;
			if (var2 == 2) {
				var4 = var1.method278();
				this.field3388 = new int[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field3388[var5] = var1.method327();
				}
			} else if (var2 == 3) {
				this.field3393 = true;
			} else if (var2 == 40) {
				var4 = var1.method278();
				this.field3389 = new short[var4];
				this.field3390 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field3389[var5] = (short)var1.method327();
					this.field3390[var5] = (short)var1.method327();
				}
			} else if (var2 == 41) {
				var4 = var1.method278();
				this.field3391 = new short[var4];
				this.field3385 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field3391[var5] = (short)var1.method327();
					this.field3385[var5] = (short)var1.method327();
				}
			} else if (var2 >= 60 && var2 < 70) {
				this.field3394[var2 - 60] = var1.method327();
			}
		}

	}

	public boolean method2086() {
		if (null == this.field3388) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.field3388.length; ++var3) {
				if (!field3384.method1214(this.field3388[var3], 0)) {
					var2 = false;
				}
			}

			return var2;
		}
	}

	public class48 method2087() {
		if (this.field3388 == null) {
			return null;
		} else {
			class48[] var2 = new class48[this.field3388.length];

			for (int var3 = 0; var3 < this.field3388.length; ++var3) {
				var2[var3] = class48.method373(field3384, this.field3388[var3], 0);
			}

			class48 var5;
			if (var2.length == 1) {
				var5 = var2[0];
			} else {
				var5 = new class48(var2, var2.length);
			}

			int var4;
			if (null != this.field3389) {
				for (var4 = 0; var4 < this.field3389.length; ++var4) {
					var5.method372(this.field3389[var4], this.field3390[var4]);
				}
			}

			if (this.field3391 != null) {
				for (var4 = 0; var4 < this.field3391.length; ++var4) {
					var5.method363(this.field3391[var4], this.field3385[var4]);
				}
			}

			return var5;
		}
	}

	public boolean method2091() {
		boolean var2 = true;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.field3394[var3] != -1 && !field3384.method1214(this.field3394[var3], 0)) {
				var2 = false;
			}
		}

		return var2;
	}

	public class48 method2090() {
		class48[] var2 = new class48[5];
		int var3 = 0;

		for (int var4 = 0; var4 < 5; ++var4) {
			if (this.field3394[var4] != -1) {
				var2[var3++] = class48.method373(field3384, this.field3394[var4], 0);
			}
		}

		class48 var6 = new class48(var2, var3);
		int var5;
		if (this.field3389 != null) {
			for (var5 = 0; var5 < this.field3389.length; ++var5) {
				var6.method372(this.field3389[var5], this.field3390[var5]);
			}
		}

		if (null != this.field3391) {
			for (var5 = 0; var5 < this.field3391.length; ++var5) {
				var6.method363(this.field3391[var5], this.field3385[var5]);
			}
		}

		return var6;
	}

	static boolean method2092(class347 var0, int var1) {
		int var3 = var0.method1903(2);
		int var4;
		int var5;
		int var8;
		int var9;
		int var10;
		int var11;
		if (var3 == 0) {
			if (var0.method1903(1) != 0) {
				method2092(var0, var1);
			}

			var4 = var0.method1903(13);
			var5 = var0.method1903(13);
			boolean var12 = var0.method1903(1) == 1;
			if (var12) {
				class481.field4084[++class481.field4091 - 1] = var1;
			}

			if (Client.field176[var1] != null) {
				throw new RuntimeException();
			} else {
				class287 var13 = Client.field176[var1] = new class287();
				var13.field2522 = var1;
				if (null != class481.field4093[var1]) {
					var13.method1631(class481.field4093[var1]);
				}

				var13.field1566 = class481.field4089[var1];
				var13.field1560 = class481.field4090[var1];
				var8 = class481.field4088[var1];
				var9 = var8 >> 28;
				var10 = var8 >> 14 & 255;
				var11 = var8 & 255;
				var13.field1598[0] = class481.field4083[var1];
				var13.field2543 = (byte)var9;
				var13.method1641((var10 << 13) + var4 - class296.field2735, var5 + (var11 << 13) - class164.field1606);
				var13.field2548 = false;
				return true;
			}
		} else if (var3 == 1) {
			var4 = var0.method1903(2);
			var5 = class481.field4088[var1];
			class481.field4088[var1] = (((var5 >> 28) + var4 & 3) << 28) + (var5 & 268435455);
			return false;
		} else {
			int var6;
			int var7;
			if (var3 == 2) {
				var4 = var0.method1903(5);
				var5 = var4 >> 3;
				var6 = var4 & 7;
				var7 = class481.field4088[var1];
				var8 = (var7 >> 28) + var5 & 3;
				var9 = var7 >> 14 & 255;
				var10 = var7 & 255;
				if (var6 == 0) {
					--var9;
					--var10;
				}

				if (var6 == 1) {
					--var10;
				}

				if (var6 == 2) {
					++var9;
					--var10;
				}

				if (var6 == 3) {
					--var9;
				}

				if (var6 == 4) {
					++var9;
				}

				if (var6 == 5) {
					--var9;
					++var10;
				}

				if (var6 == 6) {
					++var10;
				}

				if (var6 == 7) {
					++var9;
					++var10;
				}

				class481.field4088[var1] = (var8 << 28) + (var9 << 14) + var10;
				return false;
			} else {
				var4 = var0.method1903(18);
				var5 = var4 >> 16;
				var6 = var4 >> 8 & 255;
				var7 = var4 & 255;
				var8 = class481.field4088[var1];
				var9 = var5 + (var8 >> 28) & 3;
				var10 = (var8 >> 14) + var6 & 255;
				var11 = var8 + var7 & 255;
				class481.field4088[var1] = var11 + (var9 << 28) + (var10 << 14);
				return false;
			}
		}
	}
}
