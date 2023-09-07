public abstract class class54 extends class189 {

	boolean field247;

	boolean field250;

	boolean field264;

	boolean field265;

	boolean field282;

	byte field257;

	byte field263;

	byte field270;

	byte field295;

	byte field305;

	class292 field276;

	class343[] field315;

	class419 field308;

	int field242;

	int field243;

	int field244;

	int field245;

	int field246;

	int field248;

	int field249;

	int field251;

	int field252;

	int field253;

	int field255;

	int field256;

	int field258;

	int field259;

	int field260;

	int field261;

	int field262;

	int field266;

	int field267;

	int field268;

	int field269;

	int field272;

	int field277;

	int field278;

	int field279;

	int field280;

	int field281;

	int field283;

	int field284;

	int field285;

	int field286;

	int field287;

	int field288;

	int field289;

	int field290;

	int field291;

	int field292;

	int field293;

	int field294;

	int field296;

	int field297;

	int field298;

	int field299;

	int field300;

	int field301;

	int field302;

	int field303;

	int field304;

	int field306;

	int field307;

	int field310;

	int field311;

	int field312;

	int field316;

	int field318;

	int[] field254;

	int[] field271;

	int[] field273;

	int[] field274;

	int[] field275;

	int[] field309;

	int[] field314;

	int[] field317;

	String field313;

	class54() {
		this.field250 = false;
		this.field246 = 1;
		this.field248 = -1;
		this.field249 = -1;
		this.field310 = -1;
		this.field251 = -1;
		this.field252 = -1;
		this.field253 = -1;
		this.field301 = -1;
		this.field312 = -1;
		this.field256 = -1;
		this.field297 = -1;
		this.field258 = -1;
		this.field259 = -1;
		this.field260 = -1;
		this.field261 = -1;
		this.field291 = -1;
		this.field313 = null;
		this.field265 = false;
		this.field266 = 100;
		this.field267 = 0;
		this.field268 = 0;
		this.field309 = null;
		this.field270 = 0;
		this.field271 = new int[4];
		this.field254 = new int[4];
		this.field273 = new int[4];
		this.field274 = new int[4];
		this.field275 = new int[4];
		this.field276 = new class292();
		this.field277 = -1;
		this.field247 = false;
		this.field279 = -1;
		this.field280 = -1;
		this.field281 = -1;
		this.field255 = -1;
		this.field242 = 0;
		this.field285 = 0;
		this.field286 = 0;
		this.field287 = -1;
		this.field288 = 0;
		this.field289 = 0;
		this.field304 = 0;
		this.field269 = 0;
		this.field308 = new class419(4);
		this.field293 = 0;
		this.field307 = 0;
		this.field302 = 200;
		this.field303 = -1;
		this.field245 = -1;
		this.field284 = 0;
		this.field311 = 32;
		this.field290 = 0;
		this.field317 = new int[10];
		this.field314 = new int[10];
		this.field315 = new class343[10];
		this.field316 = 0;
		this.field306 = 0;
		this.field318 = -1;
	}

	final void method218() {
		this.field290 = 0;
		this.field306 = 0;
	}

	boolean method217() {
		return false;
	}

	final void method223(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var8 = true;
		boolean var9 = true;
		int var10;
		for (var10 = 0; var10 < 4; ++var10) {
			if (this.field273[var10] > var5) {
				var8 = false;
			} else {
				var9 = false;
			}
		}
		var10 = -1;
		int var11 = -1;
		int var12 = 0;
		if (var1 >= 0) {
			class110 var13 = class110.method667(var1);
			var11 = var13.field1301;
			var12 = var13.field1308;
		}
		int var15;
		if (var9) {
			if (var11 == -1) {
				return;
			}
			var10 = 0;
			var15 = 0;
			if (var11 == 0) {
				var15 = this.field273[0];
			} else if (var11 == 1) {
				var15 = this.field254[0];
			}
			for (int var14 = 1; var14 < 4; ++var14) {
				if (var11 == 0) {
					if (this.field273[var14] < var15) {
						var10 = var14;
						var15 = this.field273[var14];
					}
				} else if (var11 == 1 && this.field254[var14] < var15) {
					var10 = var14;
					var15 = this.field254[var14];
				}
			}
			if (var11 == 1 && var15 >= var2) {
				return;
			}
		} else {
			if (var8) {
				this.field270 = 0;
			}
			for (var15 = 0; var15 < 4; ++var15) {
				byte var16 = this.field270;
				this.field270 = (byte) ((this.field270 + 1) % 4);
				if (this.field273[var16] <= var5) {
					var10 = var16;
					break;
				}
			}
		}
		if (var10 >= 0) {
			this.field271[var10] = var1;
			this.field254[var10] = var2;
			this.field274[var10] = var3;
			this.field275[var10] = var4;
			this.field273[var10] = var6 + var5 + var12;
		}
	}

	final void method219(int var1, int var2, int var3, int var4, int var5, int var6) {
		class199 var9 = (class199) class199.field1870.method648((long) var1);
		class199 var8;
		if (null != var9) {
			var8 = var9;
		} else {
			byte[] var10 = class199.field1869.method1762(33, var1);
			var9 = new class199();
			var9.field1872 = var1;
			if (null != var10) {
				var9.method1208(new class187(var10));
			}
			class199.field1870.method647(var9, (long) var1);
			var8 = var9;
		}
		var9 = var8;
		class121 var15 = null;
		class121 var11 = null;
		int var12 = var8.field1874;
		int var13 = 0;
		class121 var14;
		for (var14 = (class121) this.field276.method1585(); null != var14; var14 = (class121) this.field276.method1581()) {
			++var13;
			if (var9.field1872 == var14.field1434.field1872) {
				var14.method837(var2 + var4, var5, var6, var3);
				return;
			}
			if (var14.field1434.field1875 <= var9.field1875) {
				var15 = var14;
			}
			if (var14.field1434.field1874 > var12) {
				var11 = var14;
				var12 = var14.field1434.field1874;
			}
		}
		if (var11 != null || var13 < 4) {
			var14 = new class121(var9);
			if (var15 == null) {
				this.field276.method1588(var14);
			} else {
				class292.method1586(var14, var15);
			}
			var14.method837(var2 + var4, var5, var6, var3);
			if (var13 >= 4) {
				var11.method318();
			}
		}
	}

	final void method224(int var1) {
		class199 var4 = (class199) class199.field1870.method648((long) var1);
		class199 var3;
		if (null != var4) {
			var3 = var4;
		} else {
			byte[] var5 = class199.field1869.method1762(33, var1);
			var4 = new class199();
			var4.field1872 = var1;
			if (null != var5) {
				var4.method1208(new class187(var5));
			}
			class199.field1870.method647(var4, (long) var1);
			var3 = var4;
		}
		var4 = var3;
		for (class121 var6 = (class121) this.field276.method1585(); var6 != null; var6 = (class121) this.field276.method1581()) {
			if (var6.field1434 == var4) {
				var6.method318();
				return;
			}
		}
	}

	void method220(int var1, int var2, int var3, int var4) {
		int var6 = var4 + Client.field1201;
		class347 var7 = (class347) this.field308.method2105((long) var1);
		if (null != var7) {
			var7.method318();
			--this.field293;
		}
		if (var2 != 65535 && var2 != -1) {
			byte var8 = 0;
			if (var4 > 0) {
				var8 = -1;
			}
			this.field308.method2109(new class347(var2, var3, var6, var8), (long) var1);
			++this.field293;
		}
	}

	class419 method221() {
		return this.field308;
	}

	void method225() {
		class331 var2 = new class331(this.field308);
		for (class347 var3 = (class347) var2.method1735(); null != var3; var3 = (class347) var2.next()) {
			var3.method318();
		}
		this.field293 = 0;
	}

	class113 method222(class113 var1) {
		if (this.field293 == 0) {
			return var1;
		} else {
			class331 var3 = new class331(this.field308);
			int var4 = var1.field1379;
			int var5 = var1.field1327;
			int var6 = var1.field1339;
			byte var7 = var1.field1338;
			for (class347 var8 = (class347) var3.method1735(); var8 != null; var8 = (class347) var3.next()) {
				if (var8.field2626 != -1) {
					class113 var9 = class138.method872(var8.field2629).method869();
					if (null != var9) {
						var4 += var9.field1379;
						var5 += var9.field1327;
						var6 += var9.field1339;
					}
				}
			}
			class113 var11 = new class113(var4, var5, var6, var7);
			var11.method702(var1);
			for (class347 var12 = (class347) var3.method1735(); var12 != null; var12 = (class347) var3.next()) {
				if (var12.field2626 != -1) {
					class113 var10 = class138.method872(var12.field2629).method868(var12.field2626);
					if (var10 != null) {
						var10.method680(0, -var12.field2627, 0);
						var11.method702(var10);
					}
				}
			}
			return var11;
		}
	}

	void method226() {
		this.field282 = false;
		this.field279 = -1;
		this.field280 = -1;
		this.field281 = -1;
	}
}
