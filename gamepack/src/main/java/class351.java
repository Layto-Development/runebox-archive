import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ck")
public final class class351 extends class510 {
	@ObfInfo(name = "ab", desc = "Z")
	boolean field2769;
	@ObfInfo(name = "bh", desc = "Lib;")
	class202 field2793;
	@ObfInfo(name = "av", desc = "D")
	double field2779;
	@ObfInfo(name = "am", desc = "D")
	double field2784;
	@ObfInfo(name = "ax", desc = "D")
	double field2785;
	@ObfInfo(name = "ah", desc = "D")
	double field2786;
	@ObfInfo(name = "as", desc = "D")
	double field2787;
	@ObfInfo(name = "ay", desc = "D")
	double field2788;
	@ObfInfo(name = "aj", desc = "D")
	double field2789;
	@ObfInfo(name = "ag", desc = "D")
	double field2791;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1807665337)
	int field2767;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -1311387965)
	int field2768;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1543991229)
	int field2770;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = -556808089)
	int field2771;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -171002147)
	int field2772;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1921111453)
	int field2773;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 31638363)
	int field2774;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -1267075461)
	int field2775;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -1307089547)
	int field2776;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 855194403)
	int field2777;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1087687777)
	int field2778;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -549374795)
	int field2780;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = -731923483)
	int field2781;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 48542785)
	int field2782;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1710661901)
	int field2783;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -600416715)
	int field2790;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1420572405)
	int field2792;
	@ObfInfo(name = "bj", desc = "I", intMultiplier = 1245655713)
	int field2794;
	@ObfInfo(name = "bk", desc = "I", intMultiplier = 832169)
	int field2795;

	@ObfInfo(name = "<init>", desc = "(IIIIIIIIIII)V")
	class351(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.field2769 = false;
		this.field2794 = 0;
		this.field2795 = 0;
		this.field2780 = var1;
		this.field2768 = var2;
		this.field2778 = var3;
		this.field2767 = var4;
		this.field2776 = var5;
		this.field2792 = var6;
		this.field2777 = var7;
		this.field2770 = var8;
		this.field2782 = var9;
		this.field2781 = var10;
		this.field2772 = var11;
		this.field2769 = false;
		int var12 = class460.method2393(this.field2780).field3734;
		if (var12 != -1) {
			this.field2793 = class202.method1149(var12);
		} else {
			this.field2793 = null;
		}

	}

	@ObfInfo(name = "<init>", desc = "(IIIIIIIIIIII)V")
	class351(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field2783 = var10;
	}

	@ObfInfo(name = "au", desc = "(IIIII)V", opaqueValue = "-340313660")
	final void method1929(int var1, int var2, int var3, int var4) {
		this.field2773 = var1;
		this.field2774 = var2;
		this.field2775 = var3;
		double var6;
		if (!this.field2769) {
			var6 = (double)(this.field2773 - this.field2778);
			double var8 = (double)(this.field2774 - this.field2767);
			double var10 = Math.sqrt(var6 * var6 + var8 * var8);
			this.field2791 = (double)this.field2778 + (double)this.field2782 * var6 / var10;
			this.field2784 = (double)this.field2767 + (double)this.field2782 * var8 / var10;
			this.field2785 = (double)this.field2776;
		}

		var6 = (double)(this.field2777 + 1 - var4);
		this.field2786 = ((double)this.field2773 - this.field2791) / var6;
		this.field2787 = ((double)this.field2774 - this.field2784) / var6;
		this.field2788 = Math.sqrt(this.field2787 * this.field2787 + this.field2786 * this.field2786);
		if (!this.field2769) {
			this.field2789 = -this.field2788 * Math.tan((double)this.field2770 * 0.02454369D);
		}

		this.field2779 = ((double)this.field2775 - this.field2785 - this.field2789 * var6) * 2.0D / (var6 * var6);
	}

	@ObfInfo(name = "ao", desc = "(IB)V", opaqueValue = "-1")
	final void method1930(int var1) {
		this.field2769 = true;
		this.field2791 += this.field2786 * (double)var1;
		this.field2784 += (double)var1 * this.field2787;
		this.field2785 += this.field2779 * 0.5D * (double)var1 * (double)var1 + (double)var1 * this.field2789;
		this.field2789 += this.field2779 * (double)var1;
		this.field2771 = (int)(Math.atan2(this.field2786, this.field2787) * 325.949D) + 1024 & 2047;
		this.field2790 = (int)(Math.atan2(this.field2789, this.field2788) * 325.949D) & 2047;
		if (this.field2793 != null) {
			if (!this.field2793.method1148()) {
				this.field2795 += var1;

				while (true) {
					do {
						do {
							if (this.field2795 <= this.field2793.field1850[this.field2794]) {
								return;
							}

							this.field2795 -= this.field2793.field1850[this.field2794];
							++this.field2794;
						} while(this.field2794 < this.field2793.field1839.length);

						this.field2794 -= this.field2793.field1843;
					} while(this.field2794 >= 0 && this.field2794 < this.field2793.field1839.length);

					this.field2794 = 0;
				}
			} else {
				this.field2794 += var1;
				int var3 = this.field2793.method1145();
				if (this.field2794 >= var3) {
					this.field2794 = var3 - this.field2793.field1843;
				}
			}
		}

	}

	@ObfInfo(name = "ae", desc = "(I)Ljr;")
	protected final class384 method2515() {
		class460 var2 = class460.method2393(this.field2780);
		class384 var3 = var2.method2389(this.field2794);
		if (null == var3) {
			return null;
		} else {
			var3.method2066(this.field2790);
			return var3;
		}
	}
}
