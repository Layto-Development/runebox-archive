import java.awt.Font;

public final class class46 extends class77 {

	static class13 field231;

	static class449 field218;

	static int field215;

	static Font field230;

	class32 field223;

	class32 field227;

	class362 field228;

	int field216;

	int field217;

	int field219;

	int field220;

	int field221;

	int field222;

	int field224;

	int field226;

	int field229;

	int field232;

	int[] field225;

	static {
		field218 = new class449();
	}

	class46() {
	}

	void method193() {
		int var2 = this.field222;
		class362 var3 = this.field228.method1893();
		if (var3 != null) {
			this.field222 = var3.field2912;
			this.field221 = var3.field2913 * 128;
			this.field226 = var3.field2914;
			this.field224 = var3.field2915;
			this.field225 = var3.field2906;
		} else {
			this.field222 = -1;
			this.field221 = 0;
			this.field226 = 0;
			this.field224 = 0;
			this.field225 = null;
		}
		if (var2 != this.field222 && this.field227 != null) {
			class236.field2028.method883(this.field227);
			this.field227 = null;
		}
	}

	static void method196() {
		for (class46 var1 = (class46) field218.method2218(); var1 != null; var1 = (class46) field218.method2220()) {
			if (null != var1.field227) {
				class236.field2028.method883(var1.field227);
				var1.field227 = null;
			}
			if (var1.field223 != null) {
				class236.field2028.method883(var1.field223);
				var1.field223 = null;
			}
		}
		field218.method2214();
	}

	static void method195(int var0, int var1, int var2, class362 var3, int var4) {
		class46 var6 = new class46();
		var6.field216 = var0;
		var6.field217 = var1 * 128;
		var6.field229 = var2 * 128;
		int var7 = var3.field2883;
		int var8 = var3.field2868;
		if (var4 == 1 || var4 == 3) {
			var7 = var3.field2868;
			var8 = var3.field2883;
		}
		var6.field219 = 128 * (var7 + var1);
		var6.field220 = (var2 + var8) * 128;
		var6.field222 = var3.field2912;
		var6.field221 = var3.field2913 * 128;
		var6.field226 = var3.field2914;
		var6.field224 = var3.field2915;
		var6.field225 = var3.field2906;
		if (null != var3.field2909) {
			var6.field228 = var3;
			var6.method193();
		}
		field218.method2222(var6);
		if (null != var6.field225) {
			var6.field232 = var6.field226 + (int) (Math.random() * (double) (var6.field224 - var6.field226));
		}
	}

	static void method194(int var0, int var1, int var2, int var3) {
		for (class46 var5 = (class46) field218.method2218(); var5 != null; var5 = (class46) field218.method2220()) {
			if (var5.field222 != -1 || var5.field225 != null) {
				int var6 = 0;
				if (var1 > var5.field219) {
					var6 = 0 + (var1 - var5.field219);
				} else if (var1 < var5.field217) {
					var6 = 0 + (var5.field217 - var1);
				}
				if (var2 > var5.field220) {
					var6 += var2 - var5.field220;
				} else if (var2 < var5.field229) {
					var6 += var5.field229 - var2;
				}
				if (var6 - 64 <= var5.field221 && class83.field841.method1027() != 0 && var0 == var5.field216) {
					var6 -= 64;
					if (var6 < 0) {
						var6 = 0;
					}
					int var7 = (var5.field221 - var6) * class83.field841.method1027() / var5.field221;
					if (var5.field227 == null) {
						if (var5.field222 >= 0) {
							class487 var8 = class487.method2346(class73.field730, var5.field222, 0);
							if (var8 != null) {
								class529 var9 = var8.method2344().method2564(class414.field3219);
								class32 var10 = class32.method147(var9, 100, var7);
								var10.method113(-1);
								class236.field2028.method893(var10);
								var5.field227 = var10;
							}
						}
					} else {
						var5.field227.method114(var7);
					}
					if (var5.field223 == null) {
						if (null != var5.field225 && (var5.field232 -= var3) <= 0) {
							int var12 = (int) (Math.random() * (double) var5.field225.length);
							class487 var13 = class487.method2346(class73.field730, var5.field225[var12], 0);
							if (null != var13) {
								class529 var14 = var13.method2344().method2564(class414.field3219);
								class32 var11 = class32.method147(var14, 100, var7);
								var11.method113(0);
								class236.field2028.method893(var11);
								var5.field223 = var11;
								var5.field232 = var5.field226 + (int) (Math.random() * (double) (var5.field224 - var5.field226));
							}
						}
					} else {
						var5.field223.method114(var7);
						if (!var5.field223.method319()) {
							var5.field223 = null;
						}
					}
				} else {
					if (null != var5.field227) {
						class236.field2028.method883(var5.field227);
						var5.field227 = null;
					}
					if (var5.field223 != null) {
						class236.field2028.method883(var5.field223);
						var5.field223 = null;
					}
				}
			}
		}
	}
}
