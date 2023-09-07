public class class481 {

	boolean field3777;

	boolean field3781;

	class31 field3768;

	class31 field3774;

	class31 field3776;

	class31[] field3772;

	class31[] field3773;

	float[][] field3770;

	float[][] field3775;

	float[][] field3778;

	float[][] field3780;

	final class31[] field3771;

	public class481 field3779;

	public final int field3769;

	public class481(int var1, class187 var2, boolean var3) {
		this.field3774 = new class31();
		this.field3777 = true;
		this.field3776 = new class31();
		this.field3781 = true;
		this.field3768 = new class31();
		this.field3769 = var2.method1098();
		this.field3771 = new class31[var1];
		this.field3772 = new class31[this.field3771.length];
		this.field3773 = new class31[this.field3771.length];
		this.field3770 = new float[this.field3771.length][3];
		for (int var4 = 0; var4 < this.field3771.length; ++var4) {
			this.field3771[var4] = new class31(var2, var3);
			this.field3770[var4][0] = var2.method1102();
			this.field3770[var4][1] = var2.method1102();
			this.field3770[var4][2] = var2.method1102();
		}
		this.method2327();
	}

	void method2327() {
		this.field3778 = new float[this.field3771.length][3];
		this.field3775 = new float[this.field3771.length][3];
		this.field3780 = new float[this.field3771.length][3];
		class31 var2;
		synchronized (class31.field149) {
			if (class217.field1948 == 0) {
				var2 = new class31();
			} else {
				class31.field149[--class217.field1948].method94();
				var2 = class31.field149[class217.field1948];
			}
		}
		class31 var3 = var2;
		for (int var4 = 0; var4 < this.field3771.length; ++var4) {
			class31 var5 = this.method2337(var4);
			var3.method101(var5);
			var3.method106();
			this.field3778[var4] = var3.method93();
			this.field3775[var4][0] = var5.field150[12];
			this.field3775[var4][1] = var5.field150[13];
			this.field3775[var4][2] = var5.field150[14];
			this.field3780[var4] = var5.method100();
		}
		var3.method103();
	}

	class31 method2337(int var1) {
		return this.field3771[var1];
	}

	class31 method2329(int var1) {
		if (this.field3772[var1] == null) {
			this.field3772[var1] = new class31(this.method2337(var1));
			if (null != this.field3779) {
				this.field3772[var1].method104(this.field3779.method2329(var1));
			} else {
				this.field3772[var1].method104(class31.field151);
			}
		}
		return this.field3772[var1];
	}

	class31 method2336(int var1) {
		if (this.field3773[var1] == null) {
			this.field3773[var1] = new class31(this.method2329(var1));
			this.field3773[var1].method106();
		}
		return this.field3773[var1];
	}

	void method2330(class31 var1) {
		this.field3774.method101(var1);
		this.field3777 = true;
		this.field3781 = true;
	}

	class31 method2331() {
		return this.field3774;
	}

	class31 method2332() {
		if (this.field3777) {
			this.field3776.method101(this.method2331());
			if (null != this.field3779) {
				this.field3776.method104(this.field3779.method2332());
			}
			this.field3777 = false;
		}
		return this.field3776;
	}

	public class31 method2328(int var1) {
		if (this.field3781) {
			this.field3768.method101(this.method2336(var1));
			this.field3768.method104(this.method2332());
			this.field3781 = false;
		}
		return this.field3768;
	}

	float[] method2333(int var1) {
		return this.field3778[var1];
	}

	float[] method2334(int var1) {
		return this.field3775[var1];
	}

	float[] method2335(int var1) {
		return this.field3780[var1];
	}
}
