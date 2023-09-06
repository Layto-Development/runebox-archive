import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class class429 extends class218 {
	public static ThreadPoolExecutor field3530;
	static int field3529;
	boolean field3534;
	class415[][] field3526;
	int field3528;
	int field3533;
	List field3525;
	Future field3531;
	public class415[][] field3532;
	public class43 field3527;

	public class429(class215 var1, class215 var2, int var3, boolean var4) {
		this.field3532 = (class415[][])null;
		this.field3526 = (class415[][])null;
		this.field3528 = 0;
		this.field3533 = var3;
		byte[] var5 = var1.method1212(this.field3533 >> 16 & 65535, this.field3533 & 65535);
		class42 var6 = new class42(var5);
		int var7 = var6.method278();
		int var8 = var6.method327();
		byte[] var9;
		if (var4) {
			var9 = var2.method1220(0, var8);
		} else {
			var9 = var2.method1220(var8, 0);
		}

		this.field3527 = new class43(var8, var9);
		this.field3525 = new ArrayList();
		this.field3531 = field3530.submit(new class128(this, var6, var7));
	}

	void method2181(class42 var1, int var2) {
		var1.method327();
		var1.method327();
		this.field3528 = var1.method278();
		int var4 = var1.method327();
		this.field3526 = new class415[this.field3527.method342().method392()][];
		this.field3532 = new class415[this.field3527.method343()][];
		class452[] var5 = new class452[var4];

		int var6;
		int var8;
		int var10;
		for (var6 = 0; var6 < var4; ++var6) {
			var8 = var1.method278();
			class109 var9 = (class109)class451.method2249(class223.method1261(), var8);
			if (var9 == null) {
				var9 = class109.field1052;
			}

			var10 = var1.method289();
			int var12 = var1.method278();
			class93[] var13 = new class93[]{class93.field916, class93.field912, class93.field913, class93.field914, class93.field920, class93.field930, class93.field917, class93.field918, class93.field928, class93.field922, class93.field921, class93.field919, class93.field923, class93.field915, class93.field924, class93.field925, class93.field926};
			class93 var14 = (class93)class451.method2249(var13, var12);
			if (var14 == null) {
				var14 = class93.field916;
			}

			class415 var19 = new class415();
			var19.method2136(var1, var2, (byte)-47);
			var5[var6] = new class452(this, var19, var9, var14, var10);
			int var15 = var9.method682();
			class415[][] var16;
			if (class109.field1055 == var9) {
				var16 = this.field3526;
			} else {
				var16 = this.field3532;
			}

			if (null == var16[var10]) {
				var16[var10] = new class415[var15];
			}

			if (var9 == class109.field1051) {
				this.field3534 = true;
			}
		}

		var6 = var4 / class201.field1864;
		int var7 = var4 % class201.field1864;
		int var17 = 0;

		for (var10 = 0; var10 < class201.field1864; ++var10) {
			var8 = var17;
			var17 += var6;
			if (var7 > 0) {
				++var17;
				--var7;
			}

			if (var17 == var8) {
				break;
			}

			this.field3525.add(field3530.submit(new class458(this, var8, var17, var5)));
		}

	}

	public boolean method2188() {
		if (null == this.field3531 && null == this.field3525) {
			return true;
		} else {
			if (this.field3531 != null) {
				if (!this.field3531.isDone()) {
					return false;
				}

				this.field3531 = null;
			}

			boolean var2 = true;

			for (int var3 = 0; var3 < this.field3525.size(); ++var3) {
				if (!((Future)this.field3525.get(var3)).isDone()) {
					var2 = false;
				} else {
					this.field3525.remove(var3);
					--var3;
				}
			}

			if (!var2) {
				return false;
			} else {
				this.field3525 = null;
				return true;
			}
		}
	}

	public int method2182() {
		return this.field3528;
	}

	public boolean method2183() {
		return this.field3534;
	}

	public void method2184(int var1, class34 var2, int var3, int var4) {
		class264 var6;
		synchronized(class264.field2387) {
			if (class514.field4192 == 0) {
				var6 = new class264();
			} else {
				class264.field2387[--class514.field4192].method1523();
				var6 = class264.field2387[class514.field4192];
			}
		}

		this.method2180(var6, var3, var2, var1);
		this.method2187(var6, var3, var2, var1);
		this.method2185(var6, var3, var2, var1);
		var2.method230(var6);
		var6.method1532();
	}

	void method2180(class264 var1, int var2, class34 var3, int var4) {
		float[] var6 = var3.method233(this.field3528);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (this.field3526[var2] != null) {
			class415 var10 = this.field3526[var2][0];
			class415 var11 = this.field3526[var2][1];
			class415 var12 = this.field3526[var2][2];
			if (null != var10) {
				var7 = var10.method2138(var4);
			}

			if (var11 != null) {
				var8 = var11.method2138(var4);
			}

			if (null != var12) {
				var9 = var12.method2138(var4);
			}
		}

		class176 var18 = class116.method737();
		var18.method998(1.0F, 0.0F, 0.0F, var7);
		class176 var19 = class116.method737();
		var19.method998(0.0F, 1.0F, 0.0F, var8);
		class176 var20 = class116.method737();
		var20.method998(0.0F, 0.0F, 1.0F, var9);
		class176 var13 = class116.method737();
		var13.method1000(var20);
		var13.method1000(var18);
		var13.method1000(var19);
		class264 var14;
		synchronized(class264.field2387) {
			if (class514.field4192 == 0) {
				var14 = new class264();
			} else {
				class264.field2387[--class514.field4192].method1523();
				var14 = class264.field2387[class514.field4192];
			}
		}

		var14.method1534(var13);
		var1.method1533(var14);
		var18.method1001();
		var19.method1001();
		var20.method1001();
		var13.method1001();
		var14.method1532();
	}

	void method2185(class264 var1, int var2, class34 var3, int var4) {
		float[] var6 = var3.method234(this.field3528);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (this.field3526[var2] != null) {
			class415 var10 = this.field3526[var2][3];
			class415 var11 = this.field3526[var2][4];
			class415 var12 = this.field3526[var2][5];
			if (var10 != null) {
				var7 = var10.method2138(var4);
			}

			if (null != var11) {
				var8 = var11.method2138(var4);
			}

			if (null != var12) {
				var9 = var12.method2138(var4);
			}
		}

		var1.field2388[12] = var7;
		var1.field2388[13] = var8;
		var1.field2388[14] = var9;
	}

	void method2187(class264 var1, int var2, class34 var3, int var4) {
		float[] var6 = var3.method235(this.field3528);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (this.field3526[var2] != null) {
			class415 var10 = this.field3526[var2][6];
			class415 var11 = this.field3526[var2][7];
			class415 var12 = this.field3526[var2][8];
			if (var10 != null) {
				var7 = var10.method2138(var4);
			}

			if (var11 != null) {
				var8 = var11.method2138(var4);
			}

			if (var12 != null) {
				var9 = var12.method2138(var4);
			}
		}

		class264 var15;
		synchronized(class264.field2387) {
			if (class514.field4192 == 0) {
				var15 = new class264();
			} else {
				class264.field2387[--class514.field4192].method1523();
				var15 = class264.field2387[class514.field4192];
			}
		}

		var15.method1526(var7, var8, var9);
		var1.method1533(var15);
		var15.method1532();
	}

	static void method2186(byte[] var0) {
		class42 var2 = new class42(var0);
		var2.field527 = var0.length - 2;
		class49.field589 = var2.method327();
		class49.field588 = new int[class49.field589];
		class517.field4221 = new int[class49.field589];
		class177.field1707 = new int[class49.field589];
		class420.field3504 = new int[class49.field589];
		class29.field463 = new byte[class49.field589][];
		var2.field527 = var0.length - 7 - class49.field589 * 8;
		class49.field590 = var2.method327();
		class340.field2957 = var2.method327();
		int var3 = (var2.method278() & 255) + 1;

		int var4;
		for (var4 = 0; var4 < class49.field589; ++var4) {
			class49.field588[var4] = var2.method327();
		}

		for (var4 = 0; var4 < class49.field589; ++var4) {
			class517.field4221[var4] = var2.method327();
		}

		for (var4 = 0; var4 < class49.field589; ++var4) {
			class177.field1707[var4] = var2.method327();
		}

		for (var4 = 0; var4 < class49.field589; ++var4) {
			class420.field3504[var4] = var2.method327();
		}

		var2.field527 = var0.length - 7 - class49.field589 * 8 - (var3 - 1) * 3;
		class101.field1016 = new int[var3];

		for (var4 = 1; var4 < var3; ++var4) {
			class101.field1016[var4] = var2.method334();
			if (class101.field1016[var4] == 0) {
				class101.field1016[var4] = 1;
			}
		}

		var2.field527 = 0;

		for (var4 = 0; var4 < class49.field589; ++var4) {
			int var5 = class177.field1707[var4];
			int var6 = class420.field3504[var4];
			int var7 = var5 * var6;
			byte[] var8 = new byte[var7];
			class29.field463[var4] = var8;
			int var9 = var2.method278();
			int var10;
			if (var9 == 0) {
				for (var10 = 0; var10 < var7; ++var10) {
					var8[var10] = var2.method279();
				}
			} else if (var9 == 1) {
				for (var10 = 0; var10 < var5; ++var10) {
					for (int var11 = 0; var11 < var6; ++var11) {
						var8[var10 + var5 * var11] = var2.method279();
					}
				}
			}
		}

	}
}
