import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class class421 extends class310 {

	public static ThreadPoolExecutor field3248;

	static int field3247;

	boolean field3252;

	class377[][] field3244;

	int field3246;

	int field3251;

	List field3243;

	Future field3249;

	public class377[][] field3250;

	public class413 field3245;

	public class421(class338 var1, class338 var2, int var3, boolean var4) {
		this.field3250 = (class377[][]) null;
		this.field3244 = (class377[][]) null;
		this.field3246 = 0;
		this.field3251 = var3;
		byte[] var5 = var1.method1762(this.field3251 >> 16 & 65535, this.field3251 & 65535);
		class187 var6 = new class187(var5);
		int var7 = var6.method1096();
		int var8 = var6.method1145();
		byte[] var9 = var2.method1770(var8, 0);
		this.field3245 = new class413(var8, var9);
		this.field3243 = new ArrayList();
		this.field3249 = field3248.submit(new class16(this, var6, var7));
	}

	void method2115(class187 var1, int var2) {
		var1.method1145();
		var1.method1145();
		this.field3246 = var1.method1096();
		int var4 = var1.method1145();
		this.field3244 = new class377[this.field3245.method2087().method1871()][];
		this.field3250 = new class377[this.field3245.method2088()][];
		class283[] var5 = new class283[var4];
		int var6;
		int var8;
		int var10;
		for (var6 = 0; var6 < var4; ++var6) {
			var8 = var1.method1096();
			class369 var9 = (class369) class433.method2167(class369.method1904(), var8);
			if (var9 == null) {
				var9 = class369.field2948;
			}
			var10 = var1.method1107();
			int var12 = var1.method1096();
			class259[] var13 = new class259[] { class259.field2151, class259.field2147, class259.field2148, class259.field2149, class259.field2155, class259.field2165, class259.field2152, class259.field2153, class259.field2163, class259.field2157, class259.field2156, class259.field2154, class259.field2158, class259.field2150, class259.field2159, class259.field2160, class259.field2161 };
			class259 var14 = (class259) class433.method2167(var13, var12);
			if (var14 == null) {
				var14 = class259.field2151;
			}
			class377 var19 = new class377();
			var19.method1997(var1, var2, (byte) -47);
			var5[var6] = new class283(this, var19, var9, var14, var10);
			int var15 = var9.method1903();
			class377[][] var16;
			if (class369.field2951 == var9) {
				var16 = this.field3244;
			} else {
				var16 = this.field3250;
			}
			if (null == var16[var10]) {
				var16[var10] = new class377[var15];
			}
			if (var9 == class369.field2947) {
				this.field3252 = true;
			}
		}
		var6 = var4 / class307.field2370;
		int var7 = var4 % class307.field2370;
		int var17 = 0;
		for (var10 = 0; var10 < class307.field2370; ++var10) {
			var8 = var17;
			var17 += var6;
			if (var7 > 0) {
				++var17;
				--var7;
			}
			if (var17 == var8) {
				break;
			}
			this.field3243.add(field3248.submit(new class459(this, var8, var17, var5)));
		}
	}

	public boolean method2121() {
		if (null == this.field3249 && null == this.field3243) {
			return true;
		} else {
			if (this.field3249 != null) {
				if (!this.field3249.isDone()) {
					return false;
				}
				this.field3249 = null;
			}
			boolean var2 = true;
			for (int var3 = 0; var3 < this.field3243.size(); ++var3) {
				if (!((Future) this.field3243.get(var3)).isDone()) {
					var2 = false;
				} else {
					this.field3243.remove(var3);
					--var3;
				}
			}
			if (!var2) {
				return false;
			} else {
				this.field3243 = null;
				return true;
			}
		}
	}

	public int method2116() {
		return this.field3246;
	}

	public boolean method2117() {
		return this.field3252;
	}

	public void method2118(int var1, class481 var2, int var3, int var4) {
		class31 var6;
		synchronized (class31.field149) {
			if (class217.field1948 == 0) {
				var6 = new class31();
			} else {
				class31.field149[--class217.field1948].method94();
				var6 = class31.field149[class217.field1948];
			}
		}
		this.method2114(var6, var3, var2, var1);
		this.method2120(var6, var3, var2, var1);
		this.method2119(var6, var3, var2, var1);
		var2.method2330(var6);
		var6.method103();
	}

	void method2114(class31 var1, int var2, class481 var3, int var4) {
		float[] var6 = var3.method2333(this.field3246);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (this.field3244[var2] != null) {
			class377 var10 = this.field3244[var2][0];
			class377 var11 = this.field3244[var2][1];
			class377 var12 = this.field3244[var2][2];
			if (null != var10) {
				var7 = var10.method1999(var4);
			}
			if (var11 != null) {
				var8 = var11.method1999(var4);
			}
			if (null != var12) {
				var9 = var12.method1999(var4);
			}
		}
		class83 var18 = class83.method349();
		var18.method345(1.0F, 0.0F, 0.0F, var7);
		class83 var19 = class83.method349();
		var19.method345(0.0F, 1.0F, 0.0F, var8);
		class83 var20 = class83.method349();
		var20.method345(0.0F, 0.0F, 1.0F, var9);
		class83 var13 = class83.method349();
		var13.method347(var20);
		var13.method347(var18);
		var13.method347(var19);
		class31 var14;
		synchronized (class31.field149) {
			if (class217.field1948 == 0) {
				var14 = new class31();
			} else {
				class31.field149[--class217.field1948].method94();
				var14 = class31.field149[class217.field1948];
			}
		}
		var14.method105(var13);
		var1.method104(var14);
		var18.method348();
		var19.method348();
		var20.method348();
		var13.method348();
		var14.method103();
	}

	void method2119(class31 var1, int var2, class481 var3, int var4) {
		float[] var6 = var3.method2334(this.field3246);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (this.field3244[var2] != null) {
			class377 var10 = this.field3244[var2][3];
			class377 var11 = this.field3244[var2][4];
			class377 var12 = this.field3244[var2][5];
			if (var10 != null) {
				var7 = var10.method1999(var4);
			}
			if (null != var11) {
				var8 = var11.method1999(var4);
			}
			if (null != var12) {
				var9 = var12.method1999(var4);
			}
		}
		var1.field150[12] = var7;
		var1.field150[13] = var8;
		var1.field150[14] = var9;
	}

	void method2120(class31 var1, int var2, class481 var3, int var4) {
		float[] var6 = var3.method2335(this.field3246);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (this.field3244[var2] != null) {
			class377 var10 = this.field3244[var2][6];
			class377 var11 = this.field3244[var2][7];
			class377 var12 = this.field3244[var2][8];
			if (var10 != null) {
				var7 = var10.method1999(var4);
			}
			if (var11 != null) {
				var8 = var11.method1999(var4);
			}
			if (var12 != null) {
				var9 = var12.method1999(var4);
			}
		}
		class31 var15;
		synchronized (class31.field149) {
			if (class217.field1948 == 0) {
				var15 = new class31();
			} else {
				class31.field149[--class217.field1948].method94();
				var15 = class31.field149[class217.field1948];
			}
		}
		var15.method97(var7, var8, var9);
		var1.method104(var15);
		var15.method103();
	}
}
