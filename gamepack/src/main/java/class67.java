import java.util.HashMap;
import java.util.Map;

public class class67 extends class310 {

	public static class106 field695;

	public static class106 field703;

	public static class106 field704;

	static boolean field693;

	boolean[] field698;

	int field699;

	int field700;

	int[] field702;

	int[] field707;

	public boolean field708;

	public boolean field713;

	public int field694;

	public int field697;

	public int field705;

	public int field706;

	public int field709;

	public int field711;

	public int field714;

	public int field715;

	public int field716;

	public int[] field696;

	public int[] field701;

	public int[] field712;

	public Map field710;

	static {
		field693 = false;
		field704 = new class106(64);
		field695 = new class106(100);
		field703 = new class106(100);
	}

	class67() {
		this.field697 = -1;
		this.field699 = 0;
		this.field700 = 0;
		this.field705 = -1;
		this.field708 = false;
		this.field709 = 5;
		this.field706 = -1;
		this.field711 = -1;
		this.field694 = 99;
		this.field713 = false;
		this.field714 = -1;
		this.field715 = -1;
		this.field716 = 2;
	}

	void method296(class187 var1) {
		while (true) {
			int var3 = var1.method1096();
			if (var3 == 0) {
				return;
			}
			this.method297(var1, var3);
		}
	}

	void method297(class187 var1, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.method1145();
			this.field712 = new int[var4];
			for (var5 = 0; var5 < var4; ++var5) {
				this.field712[var5] = var1.method1145();
			}
			this.field701 = new int[var4];
			for (var5 = 0; var5 < var4; ++var5) {
				this.field701[var5] = var1.method1145();
			}
			for (var5 = 0; var5 < var4; ++var5) {
				this.field701[var5] += var1.method1145() << 16;
			}
		} else if (var2 == 2) {
			this.field705 = var1.method1145();
		} else if (var2 == 3) {
			var4 = var1.method1096();
			this.field707 = new int[var4 + 1];
			for (var5 = 0; var5 < var4; ++var5) {
				this.field707[var5] = var1.method1096();
			}
			this.field707[var4] = 9999999;
		} else if (var2 == 4) {
			this.field708 = true;
		} else if (var2 == 5) {
			this.field709 = var1.method1096();
		} else if (var2 == 6) {
			this.field706 = var1.method1145();
		} else if (var2 == 7) {
			this.field711 = var1.method1145();
		} else if (var2 == 8) {
			this.field694 = var1.method1096();
			this.field713 = true;
		} else if (var2 == 9) {
			this.field714 = var1.method1096();
		} else if (var2 == 10) {
			this.field715 = var1.method1096();
		} else if (var2 == 11) {
			this.field716 = var1.method1096();
		} else if (var2 == 12) {
			var4 = var1.method1096();
			this.field702 = new int[var4];
			for (var5 = 0; var5 < var4; ++var5) {
				this.field702[var5] = var1.method1145();
			}
			for (var5 = 0; var5 < var4; ++var5) {
				this.field702[var5] += var1.method1145() << 16;
			}
		} else if (var2 == 13) {
			var4 = var1.method1096();
			this.field696 = new int[var4];
			for (var5 = 0; var5 < var4; ++var5) {
				this.field696[var5] = var1.method1152();
			}
		} else if (var2 == 14) {
			this.field697 = var1.method1100();
		} else if (var2 == 15) {
			var4 = var1.method1145();
			this.field710 = new HashMap();
			for (var5 = 0; var5 < var4; ++var5) {
				int var6 = var1.method1145();
				int var7 = var1.method1152();
				this.field710.put(var6, var7);
			}
		} else if (var2 == 16) {
			this.field699 = var1.method1145();
			this.field700 = var1.method1145();
		} else if (var2 == 17) {
			this.field698 = new boolean[256];
			for (var4 = 0; var4 < this.field698.length; ++var4) {
				this.field698[var4] = false;
			}
			var4 = var1.method1096();
			for (var5 = 0; var5 < var4; ++var5) {
				this.field698[var1.method1096()] = true;
			}
		}
	}

	void method306() {
		if (this.field714 == -1) {
			if (this.field707 == null && null == this.field698) {
				this.field714 = 0;
			} else {
				this.field714 = 2;
			}
		}
		if (this.field715 == -1) {
			if (null == this.field707 && this.field698 == null) {
				this.field715 = 0;
			} else {
				this.field715 = 2;
			}
		}
	}

	public class113 method299(class113 var1, int var2) {
		class113 var5;
		if (!this.method307()) {
			var2 = this.field701[var2];
			class513 var6 = method311(var2 >> 16);
			var2 &= 65535;
			if (var6 == null) {
				return var1.method678(true);
			} else {
				var5 = var1.method678(!var6.method2463(var2));
				var5.method704(var6, var2);
				return var5;
			}
		} else {
			class421 var4 = method309(this.field697);
			if (null == var4) {
				return var1.method678(true);
			} else {
				var5 = var1.method678(!var4.method2117());
				var5.method683(var4, var2);
				return var5;
			}
		}
	}

	class113 method298(class113 var1, int var2, int var3) {
		class113 var6;
		if (!this.method307()) {
			var2 = this.field701[var2];
			class513 var7 = method311(var2 >> 16);
			var2 &= 65535;
			if (null == var7) {
				return var1.method678(true);
			} else {
				var6 = var1.method678(!var7.method2463(var2));
				var3 &= 3;
				if (var3 == 1) {
					var6.method691();
				} else if (var3 == 2) {
					var6.method690();
				} else if (var3 == 3) {
					var6.method689();
				}
				var6.method704(var7, var2);
				if (var3 == 1) {
					var6.method689();
				} else if (var3 == 2) {
					var6.method690();
				} else if (var3 == 3) {
					var6.method691();
				}
				return var6;
			}
		} else {
			class421 var5 = method309(this.field697);
			if (null == var5) {
				return var1.method678(true);
			} else {
				var6 = var1.method678(!var5.method2117());
				var3 &= 3;
				if (var3 == 1) {
					var6.method691();
				} else if (var3 == 2) {
					var6.method690();
				} else if (var3 == 3) {
					var6.method689();
				}
				var6.method683(var5, var2);
				if (var3 == 1) {
					var6.method689();
				} else if (var3 == 2) {
					var6.method690();
				} else if (var3 == 3) {
					var6.method691();
				}
				return var6;
			}
		}
	}

	class113 method300(class113 var1, int var2) {
		class113 var5;
		if (!this.method307()) {
			var2 = this.field701[var2];
			class513 var6 = method311(var2 >> 16);
			var2 &= 65535;
			if (null == var6) {
				return var1.method705(true);
			} else {
				var5 = var1.method705(!var6.method2463(var2));
				var5.method704(var6, var2);
				return var5;
			}
		} else {
			class421 var4 = method309(this.field697);
			if (var4 == null) {
				return var1.method705(true);
			} else {
				var5 = var1.method705(!var4.method2117());
				var5.method683(var4, var2);
				return var5;
			}
		}
	}

	public class113 method301(class113 var1, int var2, class67 var3, int var4) {
		if (field693 && !this.method307() && !var3.method307()) {
			return this.method302(var1, var2, var3, var4);
		} else {
			class113 var6 = var1.method678(false);
			boolean var7 = false;
			class513 var8 = null;
			class413 var9 = null;
			class421 var10;
			if (this.method307()) {
				var10 = this.method305();
				if (var10 == null) {
					return var6;
				}
				if (var3.method307() && null == this.field698) {
					var6.method683(var10, var2);
					return var6;
				}
				var9 = var10.field3245;
				var6.method686(var9, var10, var2, this.field698, false, !var3.method307());
			} else {
				var2 = this.field701[var2];
				var8 = method311(var2 >> 16);
				var2 &= 65535;
				if (null == var8) {
					return var3.method299(var1, var4);
				}
				if (!var3.method307() && (null == this.field707 || var4 == -1)) {
					var6.method704(var8, var2);
					return var6;
				}
				if (null == this.field707 || var4 == -1) {
					var6.method704(var8, var2);
					return var6;
				}
				var7 = var3.method307();
				if (!var7) {
					var6.method687(var8, var2, this.field707, false);
				}
			}
			if (var3.method307()) {
				var10 = var3.method305();
				if (var10 == null) {
					return var6;
				}
				if (null == var9) {
					var9 = var10.field3245;
				}
				var6.method686(var9, var10, var4, this.field698, true, true);
			} else {
				var4 = var3.field701[var4];
				class513 var11 = method311(var4 >> 16);
				var4 &= 65535;
				if (var11 == null) {
					return this.method299(var1, var2);
				}
				var6.method687(var11, var4, this.field707, true);
			}
			if (var7 && var8 != null) {
				var6.method687(var8, var2, this.field707, false);
			}
			var6.method682();
			return var6;
		}
	}

	class113 method302(class113 var1, int var2, class67 var3, int var4) {
		var2 = this.field701[var2];
		class513 var6 = method311(var2 >> 16);
		var2 &= 65535;
		if (null == var6) {
			return var3.method299(var1, var4);
		} else {
			var4 = var3.field701[var4];
			class513 var7 = method311(var4 >> 16);
			var4 &= 65535;
			class113 var8;
			if (var7 == null) {
				var8 = var1.method678(!var6.method2463(var2));
				var8.method704(var6, var2);
				return var8;
			} else {
				var8 = var1.method678(!var6.method2463(var2) & !var7.method2463(var4));
				var8.method696(var6, var2, var7, var4, this.field707);
				return var8;
			}
		}
	}

	public class113 method303(class113 var1, int var2) {
		if (!this.method307()) {
			int var4 = this.field701[var2];
			class513 var5 = method311(var4 >> 16);
			var4 &= 65535;
			if (null == var5) {
				return var1.method678(true);
			} else {
				class513 var6 = null;
				int var7 = 0;
				if (this.field702 != null && var2 < this.field702.length) {
					var7 = this.field702[var2];
					var6 = method311(var7 >> 16);
					var7 &= 65535;
				}
				class113 var8;
				if (null != var6 && var7 != 65535) {
					var8 = var1.method678(!var5.method2463(var4) & !var6.method2463(var7));
					var8.method704(var5, var4);
					var8.method704(var6, var7);
					return var8;
				} else {
					var8 = var1.method678(!var5.method2463(var4));
					var8.method704(var5, var4);
					return var8;
				}
			}
		} else {
			return this.method299(var1, var2);
		}
	}

	public boolean method307() {
		return this.field697 >= 0;
	}

	public int method304() {
		return this.field700 - this.field699;
	}

	class421 method305() {
		return this.method307() ? method309(this.field697) : null;
	}

	public static void method310(class338 var0, class338 var1, class338 var2) {
		class497.field3994 = var0;
		class136.field1491 = var1;
		class59.field640 = var2;
	}

	public static class67 method308(int var0) {
		class67 var2 = (class67) field704.method648((long) var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class497.field3994.method1762(12, var0);
			var2 = new class67();
			if (var3 != null) {
				var2.method296(new class187(var3));
			}
			var2.method306();
			field704.method647(var2, (long) var0);
			return var2;
		}
	}

	static class513 method311(int var0) {
		class513 var2 = (class513) field695.method648((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			var2 = class513.method2464(class136.field1491, class59.field640, var0, false);
			if (var2 != null) {
				field695.method647(var2, (long) var0);
			}
			return var2;
		}
	}

	static class421 method309(int var0) {
		return class173.method1026(var0, (byte) 6) != 0 ? null : class392.method2031(var0);
	}
}
