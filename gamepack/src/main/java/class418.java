import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "eo")
public class class418 {
	@ObfInfo(name = "ap", desc = "Z")
	boolean field3215;
	@ObfInfo(name = "af", desc = "Z")
	boolean field3219;
	@ObfInfo(name = "ad", desc = "Lrz;")
	class358 field3206;
	@ObfInfo(name = "az", desc = "Lrz;")
	class358 field3212;
	@ObfInfo(name = "aa", desc = "Lrz;")
	class358 field3214;
	@ObfInfo(name = "ac", desc = "[Lrz;")
	class358[] field3210;
	@ObfInfo(name = "ai", desc = "[Lrz;")
	class358[] field3211;
	@ObfInfo(name = "ao", desc = "[[F")
	float[][] field3208;
	@ObfInfo(name = "al", desc = "[[F")
	float[][] field3213;
	@ObfInfo(name = "aq", desc = "[[F")
	float[][] field3216;
	@ObfInfo(name = "an", desc = "[[F")
	float[][] field3218;
	@ObfInfo(name = "at", desc = "[Lrz;")
	final class358[] field3209;
	@ObfInfo(name = "ae", desc = "Leo;")
	public class418 field3217;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 422812915)
	public final int field3207;

	@ObfInfo(name = "<init>", desc = "(ILtm;Z)V")
	public class418(int var1, class280 var2, boolean var3) {
		this.field3212 = new class358();
		this.field3215 = true;
		this.field3214 = new class358();
		this.field3219 = true;
		this.field3206 = new class358();
		this.field3207 = var2.method1494();
		this.field3209 = new class358[var1];
		this.field3210 = new class358[this.field3209.length];
		this.field3211 = new class358[this.field3209.length];
		this.field3208 = new float[this.field3209.length][3];

		for (int var4 = 0; var4 < this.field3209.length; ++var4) {
			this.field3209[var4] = new class358(var2, var3);
			this.field3208[var4][0] = var2.method1498();
			this.field3208[var4][1] = var2.method1498();
			this.field3208[var4][2] = var2.method1498();
		}

		this.method2198();
	}

	@ObfInfo(name = "au", desc = "(I)V", opaqueValue = "1022490213")
	void method2198() {
		this.field3216 = new float[this.field3209.length][3];
		this.field3213 = new float[this.field3209.length][3];
		this.field3218 = new float[this.field3209.length][3];
		class358 var2;
		synchronized(class358.field2813) {
			if (class531.field4238 == 0) {
				var2 = new class358();
			} else {
				class358.field2813[--class531.field4238].method1955();
				var2 = class358.field2813[class531.field4238];
			}
		}

		class358 var3 = var2;

		for (int var4 = 0; var4 < this.field3209.length; ++var4) {
			class358 var5 = this.method2208(var4);
			var3.method1962(var5);
			var3.method1967();
			this.field3216[var4] = var3.method1954();
			this.field3213[var4][0] = var5.field2814[12];
			this.field3213[var4][1] = var5.field2814[13];
			this.field3213[var4][2] = var5.field2814[14];
			this.field3218[var4] = var5.method1961();
		}

		var3.method1964();
	}

	@ObfInfo(name = "ae", desc = "(IB)Lrz;")
	class358 method2208(int var1) {
		return this.field3209[var1];
	}

	@ObfInfo(name = "ao", desc = "(IS)Lrz;", opaqueValue = "2614")
	class358 method2200(int var1) {
		if (this.field3210[var1] == null) {
			this.field3210[var1] = new class358(this.method2208(var1));
			if (null != this.field3217) {
				this.field3210[var1].method1965(this.field3217.method2200(var1));
			} else {
				this.field3210[var1].method1965(class358.field2815);
			}
		}

		return this.field3210[var1];
	}

	@ObfInfo(name = "at", desc = "(II)Lrz;", opaqueValue = "-1528137612")
	class358 method2207(int var1) {
		if (this.field3211[var1] == null) {
			this.field3211[var1] = new class358(this.method2200(var1));
			this.field3211[var1].method1967();
		}

		return this.field3211[var1];
	}

	@ObfInfo(name = "ac", desc = "(Lrz;I)V")
	void method2201(class358 var1) {
		this.field3212.method1962(var1);
		this.field3215 = true;
		this.field3219 = true;
	}

	@ObfInfo(name = "ai", desc = "(B)Lrz;")
	class358 method2202() {
		return this.field3212;
	}

	@ObfInfo(name = "az", desc = "(I)Lrz;", opaqueValue = "1812215658")
	class358 method2203() {
		if (this.field3215) {
			this.field3214.method1962(this.method2202());
			if (null != this.field3217) {
				this.field3214.method1965(this.field3217.method2203());
			}

			this.field3215 = false;
		}

		return this.field3214;
	}

	@ObfInfo(name = "ap", desc = "(II)Lrz;", opaqueValue = "-388534856")
	public class358 method2199(int var1) {
		if (this.field3219) {
			this.field3206.method1962(this.method2207(var1));
			this.field3206.method1965(this.method2203());
			this.field3219 = false;
		}

		return this.field3206;
	}

	@ObfInfo(name = "aa", desc = "(II)[F")
	float[] method2204(int var1) {
		return this.field3216[var1];
	}

	@ObfInfo(name = "af", desc = "(IB)[F")
	float[] method2205(int var1) {
		return this.field3213[var1];
	}

	@ObfInfo(name = "ad", desc = "(II)[F")
	float[] method2206(int var1) {
		return this.field3218[var1];
	}
}
