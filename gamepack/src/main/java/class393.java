import java.util.HashMap;
import java.util.Map;

public class class393 extends class218 {
	public static class344 field3290;
	public static class344 field3298;
	public static class344 field3299;
	static boolean field3288;
	boolean[] field3293;
	int field3294;
	int field3295;
	int[] field3297;
	int[] field3302;
	public boolean field3303;
	public boolean field3308;
	public int field3289;
	public int field3292;
	public int field3300;
	public int field3301;
	public int field3304;
	public int field3306;
	public int field3309;
	public int field3310;
	public int field3311;
	public int[] field3291;
	public int[] field3296;
	public int[] field3307;
	public Map field3305;

	static {
		field3288 = false;
		field3299 = new class344(64);
		field3290 = new class344(100);
		field3298 = new class344(100);
	}

	class393() {
		this.field3292 = -1;
		this.field3294 = 0;
		this.field3295 = 0;
		this.field3300 = -1;
		this.field3303 = false;
		this.field3304 = 5;
		this.field3301 = -1;
		this.field3306 = -1;
		this.field3289 = 99;
		this.field3308 = false;
		this.field3309 = -1;
		this.field3310 = -1;
		this.field3311 = 2;
	}

	void method2051(class42 var1) {
		while (true) {
			int var3 = var1.method278();
			if (var3 == 0) {
				return;
			}

			this.method2052(var1, var3);
		}
	}

	void method2052(class42 var1, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.method327();
			this.field3307 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field3307[var5] = var1.method327();
			}

			this.field3296 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field3296[var5] = var1.method327();
			}

			for (var5 = 0; var5 < var4; ++var5) {
				this.field3296[var5] += var1.method327() << 16;
			}
		} else if (var2 == 2) {
			this.field3300 = var1.method327();
		} else if (var2 == 3) {
			var4 = var1.method278();
			this.field3302 = new int[var4 + 1];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field3302[var5] = var1.method278();
			}

			this.field3302[var4] = 9999999;
		} else if (var2 == 4) {
			this.field3303 = true;
		} else if (var2 == 5) {
			this.field3304 = var1.method278();
		} else if (var2 == 6) {
			this.field3301 = var1.method327();
		} else if (var2 == 7) {
			this.field3306 = var1.method327();
		} else if (var2 == 8) {
			this.field3289 = var1.method278();
			this.field3308 = true;
		} else if (var2 == 9) {
			this.field3309 = var1.method278();
		} else if (var2 == 10) {
			this.field3310 = var1.method278();
		} else if (var2 == 11) {
			this.field3311 = var1.method278();
		} else if (var2 == 12) {
			var4 = var1.method278();
			this.field3297 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field3297[var5] = var1.method327();
			}

			for (var5 = 0; var5 < var4; ++var5) {
				this.field3297[var5] += var1.method327() << 16;
			}
		} else if (var2 == 13) {
			var4 = var1.method278();
			this.field3291 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field3291[var5] = var1.method334();
			}
		} else if (var2 == 14) {
			this.field3292 = var1.method282();
		} else if (var2 == 15) {
			var4 = var1.method327();
			this.field3305 = new HashMap();

			for (var5 = 0; var5 < var4; ++var5) {
				int var6 = var1.method327();
				int var7 = var1.method334();
				this.field3305.put(var6, var7);
			}
		} else if (var2 == 16) {
			this.field3294 = var1.method327();
			this.field3295 = var1.method327();
		} else if (var2 == 17) {
			this.field3293 = new boolean[256];

			for (var4 = 0; var4 < this.field3293.length; ++var4) {
				this.field3293[var4] = false;
			}

			var4 = var1.method278();

			for (var5 = 0; var5 < var4; ++var5) {
				this.field3293[var1.method278()] = true;
			}
		}

	}

	void method2061() {
		if (this.field3309 == -1) {
			if (this.field3302 == null && null == this.field3293) {
				this.field3309 = 0;
			} else {
				this.field3309 = 2;
			}
		}

		if (this.field3310 == -1) {
			if (null == this.field3302 && this.field3293 == null) {
				this.field3310 = 0;
			} else {
				this.field3310 = 2;
			}
		}

	}

	public class250 method2054(class250 var1, int var2) {
		class250 var5;
		if (!this.method2062()) {
			var2 = this.field3296[var2];
			class22 var6 = class18.method169(var2 >> 16);
			var2 &= 65535;
			if (var6 == null) {
				return var1.method1451(true);
			} else {
				var5 = var1.method1451(!var6.method190(var2));
				var5.method1477(var6, var2);
				return var5;
			}
		} else {
			class429 var4 = class249.method1446(this.field3292);
			if (null == var4) {
				return var1.method1451(true);
			} else {
				var5 = var1.method1451(!var4.method2183());
				var5.method1456(var4, var2);
				return var5;
			}
		}
	}

	class250 method2053(class250 var1, int var2, int var3) {
		class250 var6;
		if (!this.method2062()) {
			var2 = this.field3296[var2];
			class22 var7 = class18.method169(var2 >> 16);
			var2 &= 65535;
			if (null == var7) {
				return var1.method1451(true);
			} else {
				var6 = var1.method1451(!var7.method190(var2));
				var3 &= 3;
				if (var3 == 1) {
					var6.method1464();
				} else if (var3 == 2) {
					var6.method1463();
				} else if (var3 == 3) {
					var6.method1462();
				}

				var6.method1477(var7, var2);
				if (var3 == 1) {
					var6.method1462();
				} else if (var3 == 2) {
					var6.method1463();
				} else if (var3 == 3) {
					var6.method1464();
				}

				return var6;
			}
		} else {
			class429 var5 = class249.method1446(this.field3292);
			if (null == var5) {
				return var1.method1451(true);
			} else {
				var6 = var1.method1451(!var5.method2183());
				var3 &= 3;
				if (var3 == 1) {
					var6.method1464();
				} else if (var3 == 2) {
					var6.method1463();
				} else if (var3 == 3) {
					var6.method1462();
				}

				var6.method1456(var5, var2);
				if (var3 == 1) {
					var6.method1462();
				} else if (var3 == 2) {
					var6.method1463();
				} else if (var3 == 3) {
					var6.method1464();
				}

				return var6;
			}
		}
	}

	class250 method2055(class250 var1, int var2) {
		class250 var5;
		if (!this.method2062()) {
			var2 = this.field3296[var2];
			class22 var6 = class18.method169(var2 >> 16);
			var2 &= 65535;
			if (null == var6) {
				return var1.method1478(true);
			} else {
				var5 = var1.method1478(!var6.method190(var2));
				var5.method1477(var6, var2);
				return var5;
			}
		} else {
			class429 var4 = class249.method1446(this.field3292);
			if (var4 == null) {
				return var1.method1478(true);
			} else {
				var5 = var1.method1478(!var4.method2183());
				var5.method1456(var4, var2);
				return var5;
			}
		}
	}

	public class250 method2056(class250 var1, int var2, class393 var3, int var4) {
		if (field3288 && !this.method2062() && !var3.method2062()) {
			return this.method2057(var1, var2, var3, var4);
		} else {
			class250 var6 = var1.method1451(false);
			boolean var7 = false;
			class22 var8 = null;
			class43 var9 = null;
			class429 var10;
			if (this.method2062()) {
				var10 = this.method2060();
				if (var10 == null) {
					return var6;
				}

				if (var3.method2062() && null == this.field3293) {
					var6.method1456(var10, var2);
					return var6;
				}

				var9 = var10.field3527;
				var6.method1459(var9, var10, var2, this.field3293, false, !var3.method2062());
			} else {
				var2 = this.field3296[var2];
				var8 = class18.method169(var2 >> 16);
				var2 &= 65535;
				if (null == var8) {
					return var3.method2054(var1, var4);
				}

				if (!var3.method2062() && (null == this.field3302 || var4 == -1)) {
					var6.method1477(var8, var2);
					return var6;
				}

				if (null == this.field3302 || var4 == -1) {
					var6.method1477(var8, var2);
					return var6;
				}

				var7 = var3.method2062();
				if (!var7) {
					var6.method1460(var8, var2, this.field3302, false);
				}
			}

			if (var3.method2062()) {
				var10 = var3.method2060();
				if (var10 == null) {
					return var6;
				}

				if (null == var9) {
					var9 = var10.field3527;
				}

				var6.method1459(var9, var10, var4, this.field3293, true, true);
			} else {
				var4 = var3.field3296[var4];
				class22 var11 = class18.method169(var4 >> 16);
				var4 &= 65535;
				if (var11 == null) {
					return this.method2054(var1, var2);
				}

				var6.method1460(var11, var4, this.field3302, true);
			}

			if (var7 && var8 != null) {
				var6.method1460(var8, var2, this.field3302, false);
			}

			var6.method1455();
			return var6;
		}
	}

	class250 method2057(class250 var1, int var2, class393 var3, int var4) {
		var2 = this.field3296[var2];
		class22 var6 = class18.method169(var2 >> 16);
		var2 &= 65535;
		if (null == var6) {
			return var3.method2054(var1, var4);
		} else {
			var4 = var3.field3296[var4];
			class22 var7 = class18.method169(var4 >> 16);
			var4 &= 65535;
			class250 var8;
			if (var7 == null) {
				var8 = var1.method1451(!var6.method190(var2));
				var8.method1477(var6, var2);
				return var8;
			} else {
				var8 = var1.method1451(!var6.method190(var2) & !var7.method190(var4));
				var8.method1469(var6, var2, var7, var4, this.field3302);
				return var8;
			}
		}
	}

	public class250 method2058(class250 var1, int var2) {
		if (!this.method2062()) {
			int var4 = this.field3296[var2];
			class22 var5 = class18.method169(var4 >> 16);
			var4 &= 65535;
			if (null == var5) {
				return var1.method1451(true);
			} else {
				class22 var6 = null;
				int var7 = 0;
				if (this.field3297 != null && var2 < this.field3297.length) {
					var7 = this.field3297[var2];
					var6 = class18.method169(var7 >> 16);
					var7 &= 65535;
				}

				class250 var8;
				if (null != var6 && var7 != 65535) {
					var8 = var1.method1451(!var5.method190(var4) & !var6.method190(var7));
					var8.method1477(var5, var4);
					var8.method1477(var6, var7);
					return var8;
				} else {
					var8 = var1.method1451(!var5.method190(var4));
					var8.method1477(var5, var4);
					return var8;
				}
			}
		} else {
			return this.method2054(var1, var2);
		}
	}

	public boolean method2062() {
		return this.field3292 >= 0;
	}

	public int method2059() {
		return this.field3295 - this.field3294;
	}

	class429 method2060() {
		return this.method2062() ? class249.method1446(this.field3292) : null;
	}

	public static class140 method2063(int var0) {
		int var2 = class486.field4106[var0];
		if (var2 == 1) {
			return class140.field1352;
		} else if (var2 == 2) {
			return class140.field1347;
		} else {
			return var2 == 3 ? class140.field1353 : null;
		}
	}
}
