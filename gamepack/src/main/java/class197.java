import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "rm")
public class class197 {
	@ObfInfo(name = "kf", desc = "[Luk;")
	static class398[] field1805;
	@ObfInfo(name = "ai", desc = "F")
	float field1793;
	@ObfInfo(name = "ae", desc = "F")
	float field1794;
	@ObfInfo(name = "ao", desc = "F")
	float field1795;
	@ObfInfo(name = "at", desc = "F")
	float field1796;
	@ObfInfo(name = "aa", desc = "F")
	float field1797;
	@ObfInfo(name = "ac", desc = "F")
	float field1798;
	@ObfInfo(name = "au", desc = "F")
	float field1799;
	@ObfInfo(name = "ap", desc = "F")
	float field1800;
	@ObfInfo(name = "ad", desc = "F")
	float field1801;
	@ObfInfo(name = "af", desc = "F")
	float field1802;
	@ObfInfo(name = "az", desc = "F")
	float field1803;
	@ObfInfo(name = "aq", desc = "F")
	float field1804;

	static {
		new class197();
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class197() {
		this.method1111();
	}

	@ObfInfo(name = "au", desc = "(I)V")
	void method1111() {
		this.field1804 = 0.0F;
		this.field1801 = 0.0F;
		this.field1802 = 0.0F;
		this.field1800 = 0.0F;
		this.field1803 = 0.0F;
		this.field1793 = 0.0F;
		this.field1796 = 0.0F;
		this.field1795 = 0.0F;
		this.field1794 = 0.0F;
		this.field1797 = 1.0F;
		this.field1798 = 1.0F;
		this.field1799 = 1.0F;
	}

	@ObfInfo(name = "ae", desc = "(FB)V")
	void method1112(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field1794;
		float var6 = this.field1798;
		float var7 = this.field1800;
		float var8 = this.field1801;
		this.field1794 = var5 * var3 - var4 * this.field1795;
		this.field1795 = var3 * this.field1795 + var5 * var4;
		this.field1798 = var6 * var3 - this.field1793 * var4;
		this.field1793 = var6 * var4 + this.field1793 * var3;
		this.field1800 = var3 * var7 - var4 * this.field1797;
		this.field1797 = var7 * var4 + this.field1797 * var3;
		this.field1801 = var3 * var8 - var4 * this.field1804;
		this.field1804 = var8 * var4 + this.field1804 * var3;
	}

	@ObfInfo(name = "ao", desc = "(FB)V")
	void method1115(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field1799;
		float var6 = this.field1796;
		float var7 = this.field1803;
		float var8 = this.field1802;
		this.field1799 = var4 * this.field1795 + var3 * var5;
		this.field1795 = this.field1795 * var3 - var5 * var4;
		this.field1796 = var4 * this.field1793 + var3 * var6;
		this.field1793 = this.field1793 * var3 - var4 * var6;
		this.field1803 = var7 * var3 + this.field1797 * var4;
		this.field1797 = this.field1797 * var3 - var4 * var7;
		this.field1802 = var3 * var8 + this.field1804 * var4;
		this.field1804 = this.field1804 * var3 - var8 * var4;
	}

	@ObfInfo(name = "at", desc = "(FI)V")
	void method1113(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field1799;
		float var6 = this.field1796;
		float var7 = this.field1803;
		float var8 = this.field1802;
		this.field1799 = var3 * var5 - var4 * this.field1794;
		this.field1794 = var3 * this.field1794 + var4 * var5;
		this.field1796 = var6 * var3 - var4 * this.field1798;
		this.field1798 = var4 * var6 + var3 * this.field1798;
		this.field1803 = var3 * var7 - var4 * this.field1800;
		this.field1800 = this.field1800 * var3 + var4 * var7;
		this.field1802 = var3 * var8 - this.field1801 * var4;
		this.field1801 = this.field1801 * var3 + var8 * var4;
	}

	@ObfInfo(name = "ac", desc = "(FFFI)V")
	void method1114(float var1, float var2, float var3) {
		this.field1802 += var1;
		this.field1801 += var2;
		this.field1804 += var3;
	}

	@ObfInfo(name = "toString", desc = "()Ljava/lang/String;")
	public String toString() {
		return this.field1799 + "," + this.field1796 + "," + this.field1803 + "," + this.field1802 + "\n" + this.field1794 + "," + this.field1798 + "," + this.field1800 + "," + this.field1801 + "\n" + this.field1795 + "," + this.field1793 + "," + this.field1797 + "," + this.field1804;
	}
}
