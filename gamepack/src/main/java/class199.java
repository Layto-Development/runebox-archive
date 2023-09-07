public class class199 extends class310 {

	public static class106 field1870;

	public static class106 field1871;

	public static class338 field1869;

	int field1878;

	int field1879;

	public int field1872;

	public int field1873;

	public int field1874;

	public int field1875;

	public int field1876;

	public int field1877;

	public int field1880;

	public int field1881;

	static {
		field1870 = new class106(64);
		field1871 = new class106(64);
	}

	public class199() {
		this.field1875 = 255;
		this.field1874 = 255;
		this.field1877 = -1;
		this.field1876 = 1;
		this.field1873 = 70;
		this.field1878 = -1;
		this.field1879 = -1;
		this.field1880 = 30;
		this.field1881 = 0;
	}

	public void method1208(class187 var1) {
		while (true) {
			int var3 = var1.method1096();
			if (var3 == 0) {
				return;
			}
			this.method1205(var1, var3);
		}
	}

	void method1205(class187 var1, int var2) {
		if (var2 == 1) {
			var1.method1145();
		} else if (var2 == 2) {
			this.field1875 = var1.method1096();
		} else if (var2 == 3) {
			this.field1874 = var1.method1096();
		} else if (var2 == 4) {
			this.field1877 = 0;
		} else if (var2 == 5) {
			this.field1873 = var1.method1145();
		} else if (var2 == 6) {
			var1.method1096();
		} else if (var2 == 7) {
			this.field1878 = var1.method1144();
		} else if (var2 == 8) {
			this.field1879 = var1.method1144();
		} else if (var2 == 11) {
			this.field1877 = var1.method1145();
		} else if (var2 == 14) {
			this.field1880 = var1.method1096();
		} else if (var2 == 15) {
			this.field1881 = var1.method1096();
		}
	}

	public class84 method1206() {
		if (this.field1878 < 0) {
			return null;
		} else {
			class84 var2 = (class84) field1871.method648((long) this.field1878);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class502.method2418(class49.field235, this.field1878, 0);
				if (null != var2) {
					field1871.method647(var2, (long) this.field1878);
				}
				return var2;
			}
		}
	}

	public class84 method1207() {
		if (this.field1879 < 0) {
			return null;
		} else {
			class84 var2 = (class84) field1871.method648((long) this.field1879);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class502.method2418(class49.field235, this.field1879, 0);
				if (null != var2) {
					field1871.method647(var2, (long) this.field1879);
				}
				return var2;
			}
		}
	}

	public static void method1209(class338 var0, class338 var1) {
		field1869 = var0;
		class49.field235 = var1;
	}
}
