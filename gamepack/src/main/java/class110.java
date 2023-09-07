public class class110 extends class310 {

	public static class338 field1294;

	public static class338 field1296;

	public static class338 field1311;

	static class106 field1297;

	static class106 field1307;

	static class106 field1315;

	int field1299;

	int field1302;

	int field1303;

	int field1304;

	int field1305;

	int field1313;

	int field1314;

	String field1309;

	public int field1295;

	public int field1298;

	public int field1300;

	public int field1301;

	public int field1306;

	public int field1308;

	public int field1310;

	public int[] field1312;

	static {
		field1315 = new class106(64);
		field1297 = new class106(64);
		field1307 = new class106(20);
	}

	class110() {
		this.field1299 = -1;
		this.field1298 = 16777215;
		this.field1308 = 70;
		this.field1302 = -1;
		this.field1303 = -1;
		this.field1304 = -1;
		this.field1305 = -1;
		this.field1306 = 0;
		this.field1300 = 0;
		this.field1295 = -1;
		this.field1309 = "";
		this.field1301 = -1;
		this.field1310 = 0;
		this.field1313 = -1;
		this.field1314 = -1;
	}

	void method659(class187 var1) {
		while (true) {
			int var3 = var1.method1096();
			if (var3 == 0) {
				return;
			}
			this.method665(var1, var3, (byte) -17);
		}
	}

	void method665(class187 var1, int var2, byte var3) {
		if (var2 == 1) {
			this.field1299 = var1.method1144();
		} else if (var2 == 2) {
			this.field1298 = var1.method1152();
		} else if (var2 == 3) {
			this.field1302 = var1.method1144();
		} else if (var2 == 4) {
			this.field1304 = var1.method1144();
		} else if (var2 == 5) {
			this.field1303 = var1.method1144();
		} else if (var2 == 6) {
			this.field1305 = var1.method1144();
		} else if (var2 == 7) {
			this.field1306 = var1.method1098();
		} else if (var2 == 8) {
			this.field1309 = var1.method1146();
		} else if (var2 == 9) {
			this.field1308 = var1.method1145();
		} else if (var2 == 10) {
			this.field1300 = var1.method1098();
		} else if (var2 == 11) {
			this.field1295 = 0;
		} else if (var2 == 12) {
			this.field1301 = var1.method1096();
		} else if (var2 == 13) {
			this.field1310 = var1.method1098();
		} else if (var2 == 14) {
			this.field1295 = var1.method1145();
		} else if (var2 == 17 || var2 == 18) {
			this.field1313 = var1.method1145();
			if (this.field1313 == 65535) {
				this.field1313 = -1;
			}
			this.field1314 = var1.method1145();
			if (this.field1314 == 65535) {
				this.field1314 = -1;
			}
			int var4 = -1;
			if (var2 == 18) {
				var4 = var1.method1145();
				if (var4 == 65535) {
					var4 = -1;
				}
			}
			int var5 = var1.method1096();
			this.field1312 = new int[var5 + 2];
			for (int var6 = 0; var6 <= var5; ++var6) {
				this.field1312[var6] = var1.method1145();
				if (this.field1312[var6] == 65535) {
					this.field1312[var6] = -1;
				}
			}
			this.field1312[var5 + 1] = var4;
		}
	}

	public final class110 method660() {
		int var2 = -1;
		if (this.field1313 != -1) {
			var2 = class410.method2082(this.field1313);
		} else if (this.field1314 != -1) {
			var2 = class410.field3198[this.field1314];
		}
		int var3;
		if (var2 >= 0 && var2 < this.field1312.length - 1) {
			var3 = this.field1312[var2];
		} else {
			var3 = this.field1312[this.field1312.length - 1];
		}
		return var3 != -1 ? method667(var3) : null;
	}

	public String method664(int var1) {
		String var3 = this.field1309;
		while (true) {
			int var4 = var3.indexOf("%1");
			if (var4 < 0) {
				return var3;
			}
			var3 = var3.substring(0, var4) + class514.method2466(var1, false) + var3.substring(var4 + 2);
		}
	}

	public class84 method661() {
		if (this.field1302 < 0) {
			return null;
		} else {
			class84 var2 = (class84) field1297.method648((long) this.field1302);
			if (null != var2) {
				return var2;
			} else {
				var2 = class502.method2418(field1294, this.field1302, 0);
				if (var2 != null) {
					field1297.method647(var2, (long) this.field1302);
				}
				return var2;
			}
		}
	}

	public class84 method658() {
		if (this.field1303 < 0) {
			return null;
		} else {
			class84 var2 = (class84) field1297.method648((long) this.field1303);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class502.method2418(field1294, this.field1303, 0);
				if (var2 != null) {
					field1297.method647(var2, (long) this.field1303);
				}
				return var2;
			}
		}
	}

	public class84 method662() {
		if (this.field1304 < 0) {
			return null;
		} else {
			class84 var2 = (class84) field1297.method648((long) this.field1304);
			if (null != var2) {
				return var2;
			} else {
				var2 = class502.method2418(field1294, this.field1304, 0);
				if (var2 != null) {
					field1297.method647(var2, (long) this.field1304);
				}
				return var2;
			}
		}
	}

	public class84 method663() {
		if (this.field1305 < 0) {
			return null;
		} else {
			class84 var2 = (class84) field1297.method648((long) this.field1305);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class502.method2418(field1294, this.field1305, 0);
				if (null != var2) {
					field1297.method647(var2, (long) this.field1305);
				}
				return var2;
			}
		}
	}

	public class61 method666() {
		if (this.field1299 == -1) {
			return null;
		} else {
			class61 var2 = (class61) field1307.method648((long) this.field1299);
			if (null != var2) {
				return var2;
			} else {
				var2 = class494.method2368(field1294, field1296, this.field1299, 0);
				if (var2 != null) {
					field1307.method647(var2, (long) this.field1299);
				}
				return var2;
			}
		}
	}

	public static class110 method667(int var0) {
		class110 var2 = (class110) field1315.method648((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field1311.method1762(32, var0);
			var2 = new class110();
			if (var3 != null) {
				var2.method659(new class187(var3));
			}
			field1315.method647(var2, (long) var0);
			return var2;
		}
	}

	public static void method668() {
		field1315.method645();
		field1297.method645();
		field1307.method645();
	}
}
