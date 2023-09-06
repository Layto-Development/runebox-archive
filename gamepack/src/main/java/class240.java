import java.util.Arrays;

public class class240 {
	static String field2210;
	int[] field2208;
	int[] field2209;

	public class240() {
		this.field2208 = new int[112];
		this.field2209 = new int[192];
		Arrays.fill(this.field2208, 3);
		Arrays.fill(this.field2209, 3);
	}

	public void method1372(int var1, int var2) {
		if (this.method1377(var1) && this.method1374(var2)) {
			this.field2208[var1] = var2;
		}

	}

	public void method1375(char var1, int var2) {
		if (this.method1370(var1) && this.method1374(var2)) {
			this.field2209[var1] = var2;
		}

	}

	public int method1369(int var1) {
		return this.method1377(var1) ? this.field2208[var1] : 0;
	}

	public int method1373(char var1) {
		return this.method1370(var1) ? this.field2209[var1] : 0;
	}

	public boolean method1366(int var1) {
		return this.method1377(var1) && (this.field2208[var1] == 1 || this.field2208[var1] == 3);
	}

	public boolean method1371(char var1) {
		return this.method1370(var1) && (this.field2209[var1] == 1 || this.field2209[var1] == 3);
	}

	public boolean method1376(int var1) {
		return this.method1377(var1) && (this.field2208[var1] == 2 || this.field2208[var1] == 3);
	}

	public boolean method1368(char var1) {
		return this.method1370(var1) && (this.field2209[var1] == 2 || this.field2209[var1] == 3);
	}

	boolean method1377(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	boolean method1370(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	boolean method1374(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	static void method1367(int var0, int var1, int var2) {
		if (class176.field1701.method2496() != 0 && var1 != 0 && Client.field258 < 50) {
			Client.field259[Client.field258] = var0;
			Client.field260[Client.field258] = var1;
			Client.field215[Client.field258] = var2;
			Client.field47[Client.field258] = null;
			Client.field10[Client.field258] = 0;
			++Client.field258;
		}

	}

	static final boolean method1378(class60 var0) {
		if (null == var0.field779) {
			return false;
		} else {
			for (int var2 = 0; var2 < var0.field779.length; ++var2) {
				int var3 = class521.method2530(var0, var2);
				int var4 = var0.field767[var2];
				if (var0.field779[var2] == 2) {
					if (var3 >= var4) {
						return false;
					}
				} else if (var0.field779[var2] == 3) {
					if (var3 <= var4) {
						return false;
					}
				} else if (var0.field779[var2] == 4) {
					if (var4 == var3) {
						return false;
					}
				} else if (var3 != var4) {
					return false;
				}
			}

			return true;
		}
	}

	static void method1379(class42 var0, int var1) {
		byte[] var3 = var0.field525;
		if (Client.field286 == null) {
			Client.field286 = new byte[24];
		}

		class422.method2165(var3, var1, Client.field286, 0, 24);
		class149.method860(var0, var1);
	}
}
