import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

@ObfInfo(name = "fv")
public class class89 extends class180 {
	@ObfInfo(name = "ap", desc = "Ljava/util/concurrent/ThreadPoolExecutor;")
	public static ThreadPoolExecutor field893;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 296985237)
	static int field892;
	@ObfInfo(name = "ai", desc = "Z")
	boolean field897;
	@ObfInfo(name = "ao", desc = "[[Lfh;")
	class27[][] field889;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -354796061)
	int field891;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 1090891029)
	int field896;
	@ObfInfo(name = "af", desc = "Ljava/util/List;")
	List field888;
	@ObfInfo(name = "aa", desc = "Ljava/util/concurrent/Future;")
	Future field894;
	@ObfInfo(name = "at", desc = "Liu;")
	public class188 field890;
	@ObfInfo(name = "ae", desc = "[[Lfh;")
	public class27[][] field895;

	@ObfInfo(name = "<init>", desc = "(Lnu;Lnu;IZ)V")
	public class89(class437 var1, class437 var2, int var3, boolean var4) {
		this.field895 = (class27[][])null;
		this.field889 = (class27[][])null;
		this.field891 = 0;
		this.field896 = var3;
		byte[] var5 = var1.method2267(this.field896 >> 16 & 65535, this.field896 & 65535);
		class280 var6 = new class280(var5);
		int var7 = var6.method1492();
		int var8 = var6.method1541();
		byte[] var9;
		if (var4) {
			var9 = var2.method2275(0, var8);
		} else {
			var9 = var2.method2275(var8, 0);
		}

		this.field890 = new class188(var8, var9);
		this.field888 = new ArrayList();
		this.field894 = field893.submit(new class441(this, var6, var7));
	}

	@ObfInfo(name = "au", desc = "(Ltm;IB)V", opaqueValue = "100")
	void method573(class280 var1, int var2) {
		var1.method1541();
		var1.method1541();
		this.field891 = var1.method1492();
		int var4 = var1.method1541();
		this.field889 = new class27[this.field890.method1045().method420()][];
		this.field895 = new class27[this.field890.method1046()][];
		class91[] var5 = new class91[var4];

		int var6;
		int var8;
		int var10;
		for (var6 = 0; var6 < var4; ++var6) {
			var8 = var1.method1492();
			class416 var9 = (class416)class216.method1198(class416.method2196(), var8);
			if (var9 == null) {
				var9 = class416.field3196;
			}

			var10 = var1.method1503();
			int var12 = var1.method1492();
			class214[] var13 = new class214[]{class214.field1910, class214.field1906, class214.field1907, class214.field1908, class214.field1914, class214.field1924, class214.field1911, class214.field1912, class214.field1922, class214.field1916, class214.field1915, class214.field1913, class214.field1917, class214.field1909, class214.field1918, class214.field1919, class214.field1920};
			class214 var14 = (class214)class216.method1198(var13, var12);
			if (var14 == null) {
				var14 = class214.field1910;
			}

			class27 var19 = new class27();
			var19.method357(var1, var2, (byte)-47);
			var5[var6] = new class91(this, var19, var9, var14, var10);
			int var15 = var9.method2194();
			class27[][] var16;
			if (class416.field3199 == var9) {
				var16 = this.field889;
			} else {
				var16 = this.field895;
			}

			if (null == var16[var10]) {
				var16[var10] = new class27[var15];
			}

			if (var9 == class416.field3195) {
				this.field897 = true;
			}
		}

		var6 = var4 / class536.field4269;
		int var7 = var4 % class536.field4269;
		int var17 = 0;

		for (var10 = 0; var10 < class536.field4269; ++var10) {
			var8 = var17;
			var17 += var6;
			if (var7 > 0) {
				++var17;
				--var7;
			}

			if (var17 == var8) {
				break;
			}

			this.field888.add(field893.submit(new class61(this, var8, var17, var5)));
		}

	}

	@ObfInfo(name = "ae", desc = "(I)Z", opaqueValue = "-1940861936")
	public boolean method579() {
		if (null == this.field894 && null == this.field888) {
			return true;
		} else {
			if (this.field894 != null) {
				if (!this.field894.isDone()) {
					return false;
				}

				this.field894 = null;
			}

			boolean var2 = true;

			for (int var3 = 0; var3 < this.field888.size(); ++var3) {
				if (!((Future)this.field888.get(var3)).isDone()) {
					var2 = false;
				} else {
					this.field888.remove(var3);
					--var3;
				}
			}

			if (!var2) {
				return false;
			} else {
				this.field888 = null;
				return true;
			}
		}
	}

	@ObfInfo(name = "ao", desc = "(I)I")
	public int method574() {
		return this.field891;
	}

	@ObfInfo(name = "at", desc = "(I)Z")
	public boolean method575() {
		return this.field897;
	}

	@ObfInfo(name = "ac", desc = "(ILeo;IIB)V")
	public void method576(int var1, class418 var2, int var3, int var4) {
		class358 var6;
		synchronized(class358.field2813) {
			if (class531.field4238 == 0) {
				var6 = new class358();
			} else {
				class358.field2813[--class531.field4238].method1955();
				var6 = class358.field2813[class531.field4238];
			}
		}

		this.method572(var6, var3, var2, var1);
		this.method578(var6, var3, var2, var1);
		this.method577(var6, var3, var2, var1);
		var2.method2201(var6);
		var6.method1964();
	}

	@ObfInfo(name = "ai", desc = "(Lrz;ILeo;II)V", opaqueValue = "1937438486")
	void method572(class358 var1, int var2, class418 var3, int var4) {
		float[] var6 = var3.method2204(this.field891);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (this.field889[var2] != null) {
			class27 var10 = this.field889[var2][0];
			class27 var11 = this.field889[var2][1];
			class27 var12 = this.field889[var2][2];
			if (null != var10) {
				var7 = var10.method359(var4);
			}

			if (var11 != null) {
				var8 = var11.method359(var4);
			}

			if (null != var12) {
				var9 = var12.method359(var4);
			}
		}

		class281 var18 = class281.method1561();
		var18.method1557(1.0F, 0.0F, 0.0F, var7);
		class281 var19 = class281.method1561();
		var19.method1557(0.0F, 1.0F, 0.0F, var8);
		class281 var20 = class281.method1561();
		var20.method1557(0.0F, 0.0F, 1.0F, var9);
		class281 var13 = class281.method1561();
		var13.method1559(var20);
		var13.method1559(var18);
		var13.method1559(var19);
		class358 var14;
		synchronized(class358.field2813) {
			if (class531.field4238 == 0) {
				var14 = new class358();
			} else {
				class358.field2813[--class531.field4238].method1955();
				var14 = class358.field2813[class531.field4238];
			}
		}

		var14.method1966(var13);
		var1.method1965(var14);
		var18.method1560();
		var19.method1560();
		var20.method1560();
		var13.method1560();
		var14.method1964();
	}

	@ObfInfo(name = "az", desc = "(Lrz;ILeo;II)V", opaqueValue = "28701007")
	void method577(class358 var1, int var2, class418 var3, int var4) {
		float[] var6 = var3.method2205(this.field891);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (this.field889[var2] != null) {
			class27 var10 = this.field889[var2][3];
			class27 var11 = this.field889[var2][4];
			class27 var12 = this.field889[var2][5];
			if (var10 != null) {
				var7 = var10.method359(var4);
			}

			if (null != var11) {
				var8 = var11.method359(var4);
			}

			if (null != var12) {
				var9 = var12.method359(var4);
			}
		}

		var1.field2814[12] = var7;
		var1.field2814[13] = var8;
		var1.field2814[14] = var9;
	}

	@ObfInfo(name = "ap", desc = "(Lrz;ILeo;II)V", opaqueValue = "-1696881053")
	void method578(class358 var1, int var2, class418 var3, int var4) {
		float[] var6 = var3.method2206(this.field891);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (this.field889[var2] != null) {
			class27 var10 = this.field889[var2][6];
			class27 var11 = this.field889[var2][7];
			class27 var12 = this.field889[var2][8];
			if (var10 != null) {
				var7 = var10.method359(var4);
			}

			if (var11 != null) {
				var8 = var11.method359(var4);
			}

			if (var12 != null) {
				var9 = var12.method359(var4);
			}
		}

		class358 var15;
		synchronized(class358.field2813) {
			if (class531.field4238 == 0) {
				var15 = new class358();
			} else {
				class358.field2813[--class531.field4238].method1955();
				var15 = class358.field2813[class531.field4238];
			}
		}

		var15.method1958(var7, var8, var9);
		var1.method1965(var15);
		var15.method1964();
	}
}
