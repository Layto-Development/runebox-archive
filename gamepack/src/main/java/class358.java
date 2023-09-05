import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Arrays;

@ObfInfo(name = "rz")
public final class class358 {
	@ObfInfo(name = "ae", desc = "[Lrz;")
	public static class358[] field2813;
	@ObfInfo(name = "ai", desc = "Lrz;")
	public static final class358 field2815;
	@ObfInfo(name = "ac", desc = "[F")
	public float[] field2814;

	static {
		field2813 = new class358[0];
		method1968(100);
		field2815 = new class358();
	}

	@ObfInfo(name = "<init>", desc = "()V")
	public class358() {
		this.field2814 = new float[16];
		this.method1955();
	}

	@ObfInfo(name = "<init>", desc = "(Lrz;)V")
	public class358(class358 var1) {
		this.field2814 = new float[16];
		this.method1962(var1);
	}

	@ObfInfo(name = "<init>", desc = "(Ltm;Z)V")
	public class358(class280 var1, boolean var2) {
		this.field2814 = new float[16];
		this.method1963(var1, var2);
	}

	@ObfInfo(name = "ae", desc = "(I)V", opaqueValue = "1155212755")
	public void method1964() {
		synchronized(field2813) {
			if (class531.field4238 < class151.field1465 - 1) {
				field2813[++class531.field4238 - 1] = this;
			}

		}
	}

	@ObfInfo(name = "ao", desc = "(Ltm;ZI)V", opaqueValue = "492770555")
	void method1963(class280 var1, boolean var2) {
		if (var2) {
			class197 var4 = new class197();
			int var7 = var1.method1494();
			var7 &= 16383;
			float var6 = (float)(6.283185307179586D * (double)((float)var7 / 16384.0F));
			var4.method1112(var6);
			int var10 = var1.method1494();
			var10 &= 16383;
			float var9 = (float)((double)((float)var10 / 16384.0F) * 6.283185307179586D);
			var4.method1115(var9);
			int var13 = var1.method1494();
			var13 &= 16383;
			float var12 = (float)((double)((float)var13 / 16384.0F) * 6.283185307179586D);
			var4.method1113(var12);
			var4.method1114((float)var1.method1494(), (float)var1.method1494(), (float)var1.method1494());
			this.method1952(var4);
		} else {
			for (int var14 = 0; var14 < 16; ++var14) {
				this.field2814[var14] = var1.method1498();
			}
		}

	}

	@ObfInfo(name = "at", desc = "(B)[F", opaqueValue = "-1")
	float[] method1953() {
		float[] var2 = new float[3];
		if ((double)this.field2814[2] < 0.999D && (double)this.field2814[2] > -0.999D) {
			var2[1] = (float)(-Math.asin((double)this.field2814[2]));
			double var3 = Math.cos((double)var2[1]);
			var2[0] = (float)Math.atan2((double)this.field2814[6] / var3, (double)this.field2814[10] / var3);
			var2[2] = (float)Math.atan2((double)this.field2814[1] / var3, (double)this.field2814[0] / var3);
		} else {
			var2[0] = 0.0F;
			var2[1] = (float)Math.atan2((double)this.field2814[2], 0.0D);
			var2[2] = (float)Math.atan2((double)(-this.field2814[9]), (double)this.field2814[5]);
		}

		return var2;
	}

	@ObfInfo(name = "ac", desc = "(I)[F", opaqueValue = "491693329")
	public float[] method1954() {
		float[] var2 = new float[]{(float)(-Math.asin((double)this.field2814[6])), 0.0F, 0.0F};
		double var3 = Math.cos((double)var2[0]);
		double var5;
		double var7;
		if (Math.abs(var3) > 0.005D) {
			var5 = (double)this.field2814[2];
			var7 = (double)this.field2814[10];
			double var9 = (double)this.field2814[4];
			double var11 = (double)this.field2814[5];
			var2[1] = (float)Math.atan2(var5, var7);
			var2[2] = (float)Math.atan2(var9, var11);
		} else {
			var5 = (double)this.field2814[1];
			var7 = (double)this.field2814[0];
			if (this.field2814[6] < 0.0F) {
				var2[1] = (float)Math.atan2(var5, var7);
			} else {
				var2[1] = (float)(-Math.atan2(var5, var7));
			}

			var2[2] = 0.0F;
		}

		return var2;
	}

	@ObfInfo(name = "ai", desc = "(I)V")
	public void method1955() {
		this.field2814[0] = 1.0F;
		this.field2814[1] = 0.0F;
		this.field2814[2] = 0.0F;
		this.field2814[3] = 0.0F;
		this.field2814[4] = 0.0F;
		this.field2814[5] = 1.0F;
		this.field2814[6] = 0.0F;
		this.field2814[7] = 0.0F;
		this.field2814[8] = 0.0F;
		this.field2814[9] = 0.0F;
		this.field2814[10] = 1.0F;
		this.field2814[11] = 0.0F;
		this.field2814[12] = 0.0F;
		this.field2814[13] = 0.0F;
		this.field2814[14] = 0.0F;
		this.field2814[15] = 1.0F;
	}

	@ObfInfo(name = "az", desc = "(B)V")
	public void method1956() {
		this.field2814[0] = 0.0F;
		this.field2814[1] = 0.0F;
		this.field2814[2] = 0.0F;
		this.field2814[3] = 0.0F;
		this.field2814[4] = 0.0F;
		this.field2814[5] = 0.0F;
		this.field2814[6] = 0.0F;
		this.field2814[7] = 0.0F;
		this.field2814[8] = 0.0F;
		this.field2814[9] = 0.0F;
		this.field2814[10] = 0.0F;
		this.field2814[11] = 0.0F;
		this.field2814[12] = 0.0F;
		this.field2814[13] = 0.0F;
		this.field2814[14] = 0.0F;
		this.field2814[15] = 0.0F;
	}

	@ObfInfo(name = "ap", desc = "(Lrz;I)V")
	public void method1962(class358 var1) {
		System.arraycopy(var1.field2814, 0, this.field2814, 0, 16);
	}

	@ObfInfo(name = "aa", desc = "(FB)V")
	public void method1957(float var1) {
		this.method1958(var1, var1, var1);
	}

	@ObfInfo(name = "af", desc = "(FFFB)V")
	public void method1958(float var1, float var2, float var3) {
		this.method1955();
		this.field2814[0] = var1;
		this.field2814[5] = var2;
		this.field2814[10] = var3;
	}

	@ObfInfo(name = "ad", desc = "(Lrz;I)V", opaqueValue = "1420506541")
	public void method1959(class358 var1) {
		for (int var3 = 0; var3 < this.field2814.length; ++var3) {
			float[] var10000 = this.field2814;
			var10000[var3] += var1.field2814[var3];
		}

	}

	@ObfInfo(name = "aq", desc = "(Lrz;I)V")
	public void method1965(class358 var1) {
		float var3 = this.field2814[2] * var1.field2814[8] + var1.field2814[0] * this.field2814[0] + var1.field2814[4] * this.field2814[1] + var1.field2814[12] * this.field2814[3];
		float var4 = this.field2814[0] * var1.field2814[1] + var1.field2814[5] * this.field2814[1] + var1.field2814[9] * this.field2814[2] + this.field2814[3] * var1.field2814[13];
		float var5 = var1.field2814[14] * this.field2814[3] + this.field2814[2] * var1.field2814[10] + var1.field2814[6] * this.field2814[1] + var1.field2814[2] * this.field2814[0];
		float var6 = this.field2814[0] * var1.field2814[3] + var1.field2814[7] * this.field2814[1] + this.field2814[2] * var1.field2814[11] + this.field2814[3] * var1.field2814[15];
		float var7 = this.field2814[7] * var1.field2814[12] + this.field2814[4] * var1.field2814[0] + this.field2814[5] * var1.field2814[4] + var1.field2814[8] * this.field2814[6];
		float var8 = this.field2814[6] * var1.field2814[9] + var1.field2814[1] * this.field2814[4] + var1.field2814[5] * this.field2814[5] + this.field2814[7] * var1.field2814[13];
		float var9 = this.field2814[7] * var1.field2814[14] + this.field2814[5] * var1.field2814[6] + this.field2814[4] * var1.field2814[2] + var1.field2814[10] * this.field2814[6];
		float var10 = var1.field2814[15] * this.field2814[7] + this.field2814[6] * var1.field2814[11] + this.field2814[4] * var1.field2814[3] + this.field2814[5] * var1.field2814[7];
		float var11 = var1.field2814[12] * this.field2814[11] + this.field2814[10] * var1.field2814[8] + var1.field2814[4] * this.field2814[9] + this.field2814[8] * var1.field2814[0];
		float var12 = this.field2814[11] * var1.field2814[13] + this.field2814[9] * var1.field2814[5] + var1.field2814[1] * this.field2814[8] + var1.field2814[9] * this.field2814[10];
		float var13 = var1.field2814[14] * this.field2814[11] + this.field2814[9] * var1.field2814[6] + var1.field2814[2] * this.field2814[8] + this.field2814[10] * var1.field2814[10];
		float var14 = var1.field2814[15] * this.field2814[11] + var1.field2814[11] * this.field2814[10] + var1.field2814[7] * this.field2814[9] + this.field2814[8] * var1.field2814[3];
		float var15 = this.field2814[14] * var1.field2814[8] + var1.field2814[0] * this.field2814[12] + this.field2814[13] * var1.field2814[4] + this.field2814[15] * var1.field2814[12];
		float var16 = var1.field2814[13] * this.field2814[15] + var1.field2814[5] * this.field2814[13] + this.field2814[12] * var1.field2814[1] + var1.field2814[9] * this.field2814[14];
		float var17 = this.field2814[14] * var1.field2814[10] + var1.field2814[6] * this.field2814[13] + this.field2814[12] * var1.field2814[2] + var1.field2814[14] * this.field2814[15];
		float var18 = var1.field2814[15] * this.field2814[15] + var1.field2814[3] * this.field2814[12] + this.field2814[13] * var1.field2814[7] + var1.field2814[11] * this.field2814[14];
		this.field2814[0] = var3;
		this.field2814[1] = var4;
		this.field2814[2] = var5;
		this.field2814[3] = var6;
		this.field2814[4] = var7;
		this.field2814[5] = var8;
		this.field2814[6] = var9;
		this.field2814[7] = var10;
		this.field2814[8] = var11;
		this.field2814[9] = var12;
		this.field2814[10] = var13;
		this.field2814[11] = var14;
		this.field2814[12] = var15;
		this.field2814[13] = var16;
		this.field2814[14] = var17;
		this.field2814[15] = var18;
	}

	@ObfInfo(name = "al", desc = "(Lro;I)V")
	public void method1966(class281 var1) {
		float var3 = var1.field2256 * var1.field2256;
		float var4 = var1.field2260 * var1.field2256;
		float var5 = var1.field2256 * var1.field2259;
		float var6 = var1.field2261 * var1.field2256;
		float var7 = var1.field2260 * var1.field2260;
		float var8 = var1.field2260 * var1.field2259;
		float var9 = var1.field2261 * var1.field2260;
		float var10 = var1.field2259 * var1.field2259;
		float var11 = var1.field2259 * var1.field2261;
		float var12 = var1.field2261 * var1.field2261;
		this.field2814[0] = var7 + var3 - var12 - var10;
		this.field2814[1] = var8 + var6 + var8 + var6;
		this.field2814[2] = var9 - var5 - var5 + var9;
		this.field2814[4] = var8 - var6 - var6 + var8;
		this.field2814[5] = var3 + var10 - var7 - var12;
		this.field2814[6] = var4 + var11 + var4 + var11;
		this.field2814[8] = var9 + var5 + var9 + var5;
		this.field2814[9] = var11 - var4 - var4 + var11;
		this.field2814[10] = var12 + var3 - var10 - var7;
	}

	@ObfInfo(name = "an", desc = "(Lrm;I)V")
	void method1952(class197 var1) {
		this.field2814[0] = var1.field1799;
		this.field2814[1] = var1.field1794;
		this.field2814[2] = var1.field1795;
		this.field2814[3] = 0.0F;
		this.field2814[4] = var1.field1796;
		this.field2814[5] = var1.field1798;
		this.field2814[6] = var1.field1793;
		this.field2814[7] = 0.0F;
		this.field2814[8] = var1.field1803;
		this.field2814[9] = var1.field1800;
		this.field2814[10] = var1.field1797;
		this.field2814[11] = 0.0F;
		this.field2814[12] = var1.field1802;
		this.field2814[13] = var1.field1801;
		this.field2814[14] = var1.field1804;
		this.field2814[15] = 1.0F;
	}

	@ObfInfo(name = "ar", desc = "(I)F")
	float method1960() {
		return this.field2814[12] * this.field2814[9] * this.field2814[6] * this.field2814[3] + (this.field2814[8] * this.field2814[7] * this.field2814[2] * this.field2814[13] + this.field2814[8] * this.field2814[1] * this.field2814[6] * this.field2814[15] + this.field2814[14] * this.field2814[11] * this.field2814[4] * this.field2814[1] + (this.field2814[0] * this.field2814[7] * this.field2814[9] * this.field2814[14] + this.field2814[15] * this.field2814[5] * this.field2814[0] * this.field2814[10] - this.field2814[0] * this.field2814[5] * this.field2814[11] * this.field2814[14] - this.field2814[15] * this.field2814[0] * this.field2814[6] * this.field2814[9] + this.field2814[13] * this.field2814[0] * this.field2814[6] * this.field2814[11] - this.field2814[10] * this.field2814[0] * this.field2814[7] * this.field2814[13] - this.field2814[15] * this.field2814[4] * this.field2814[1] * this.field2814[10]) - this.field2814[12] * this.field2814[1] * this.field2814[6] * this.field2814[11] - this.field2814[7] * this.field2814[1] * this.field2814[8] * this.field2814[14] + this.field2814[12] * this.field2814[10] * this.field2814[7] * this.field2814[1] + this.field2814[15] * this.field2814[4] * this.field2814[2] * this.field2814[9] - this.field2814[13] * this.field2814[11] * this.field2814[4] * this.field2814[2] - this.field2814[15] * this.field2814[8] * this.field2814[2] * this.field2814[5] + this.field2814[11] * this.field2814[2] * this.field2814[5] * this.field2814[12] - this.field2814[9] * this.field2814[7] * this.field2814[2] * this.field2814[12] - this.field2814[14] * this.field2814[3] * this.field2814[4] * this.field2814[9] + this.field2814[13] * this.field2814[10] * this.field2814[4] * this.field2814[3] + this.field2814[14] * this.field2814[8] * this.field2814[5] * this.field2814[3] - this.field2814[12] * this.field2814[3] * this.field2814[5] * this.field2814[10] - this.field2814[6] * this.field2814[3] * this.field2814[8] * this.field2814[13]);
	}

	@ObfInfo(name = "ab", desc = "(B)V")
	public void method1967() {
		float var2 = 1.0F / this.method1960();
		float var3 = (this.field2814[11] * this.field2814[6] * this.field2814[13] + (this.field2814[15] * this.field2814[5] * this.field2814[10] - this.field2814[14] * this.field2814[11] * this.field2814[5] - this.field2814[9] * this.field2814[6] * this.field2814[15]) + this.field2814[14] * this.field2814[7] * this.field2814[9] - this.field2814[7] * this.field2814[10] * this.field2814[13]) * var2;
		float var4 = (this.field2814[13] * this.field2814[3] * this.field2814[10] + (this.field2814[15] * -this.field2814[1] * this.field2814[10] + this.field2814[14] * this.field2814[11] * this.field2814[1] + this.field2814[9] * this.field2814[2] * this.field2814[15] - this.field2814[11] * this.field2814[2] * this.field2814[13] - this.field2814[14] * this.field2814[9] * this.field2814[3])) * var2;
		float var5 = (this.field2814[15] * this.field2814[6] * this.field2814[1] - this.field2814[1] * this.field2814[7] * this.field2814[14] - this.field2814[15] * this.field2814[2] * this.field2814[5] + this.field2814[2] * this.field2814[7] * this.field2814[13] + this.field2814[3] * this.field2814[5] * this.field2814[14] - this.field2814[13] * this.field2814[6] * this.field2814[3]) * var2;
		float var6 = (this.field2814[9] * this.field2814[3] * this.field2814[6] + (this.field2814[7] * this.field2814[1] * this.field2814[10] + this.field2814[11] * -this.field2814[1] * this.field2814[6] + this.field2814[11] * this.field2814[2] * this.field2814[5] - this.field2814[7] * this.field2814[2] * this.field2814[9] - this.field2814[5] * this.field2814[3] * this.field2814[10])) * var2;
		float var7 = (this.field2814[12] * this.field2814[10] * this.field2814[7] + (this.field2814[6] * this.field2814[8] * this.field2814[15] + this.field2814[15] * this.field2814[10] * -this.field2814[4] + this.field2814[4] * this.field2814[11] * this.field2814[14] - this.field2814[11] * this.field2814[6] * this.field2814[12] - this.field2814[14] * this.field2814[8] * this.field2814[7])) * var2;
		float var8 = (this.field2814[2] * this.field2814[11] * this.field2814[12] + (this.field2814[0] * this.field2814[10] * this.field2814[15] - this.field2814[14] * this.field2814[0] * this.field2814[11] - this.field2814[15] * this.field2814[2] * this.field2814[8]) + this.field2814[14] * this.field2814[8] * this.field2814[3] - this.field2814[3] * this.field2814[10] * this.field2814[12]) * var2;
		float var9 = (this.field2814[15] * this.field2814[2] * this.field2814[4] + this.field2814[15] * this.field2814[6] * -this.field2814[0] + this.field2814[0] * this.field2814[7] * this.field2814[14] - this.field2814[7] * this.field2814[2] * this.field2814[12] - this.field2814[3] * this.field2814[4] * this.field2814[14] + this.field2814[12] * this.field2814[3] * this.field2814[6]) * var2;
		float var10 = (this.field2814[10] * this.field2814[4] * this.field2814[3] + this.field2814[0] * this.field2814[6] * this.field2814[11] - this.field2814[10] * this.field2814[0] * this.field2814[7] - this.field2814[2] * this.field2814[4] * this.field2814[11] + this.field2814[7] * this.field2814[2] * this.field2814[8] - this.field2814[8] * this.field2814[6] * this.field2814[3]) * var2;
		float var11 = (this.field2814[15] * this.field2814[4] * this.field2814[9] - this.field2814[13] * this.field2814[4] * this.field2814[11] - this.field2814[15] * this.field2814[5] * this.field2814[8] + this.field2814[11] * this.field2814[5] * this.field2814[12] + this.field2814[13] * this.field2814[8] * this.field2814[7] - this.field2814[12] * this.field2814[9] * this.field2814[7]) * var2;
		float var12 = var2 * (this.field2814[15] * this.field2814[9] * -this.field2814[0] + this.field2814[13] * this.field2814[0] * this.field2814[11] + this.field2814[1] * this.field2814[8] * this.field2814[15] - this.field2814[11] * this.field2814[1] * this.field2814[12] - this.field2814[8] * this.field2814[3] * this.field2814[13] + this.field2814[9] * this.field2814[3] * this.field2814[12]);
		float var13 = (this.field2814[4] * this.field2814[3] * this.field2814[13] + this.field2814[12] * this.field2814[1] * this.field2814[7] + (this.field2814[15] * this.field2814[5] * this.field2814[0] - this.field2814[13] * this.field2814[0] * this.field2814[7] - this.field2814[1] * this.field2814[4] * this.field2814[15]) - this.field2814[12] * this.field2814[3] * this.field2814[5]) * var2;
		float var14 = var2 * (this.field2814[8] * this.field2814[3] * this.field2814[5] + (-this.field2814[0] * this.field2814[5] * this.field2814[11] + this.field2814[9] * this.field2814[7] * this.field2814[0] + this.field2814[4] * this.field2814[1] * this.field2814[11] - this.field2814[8] * this.field2814[1] * this.field2814[7] - this.field2814[3] * this.field2814[4] * this.field2814[9]));
		float var15 = (this.field2814[12] * this.field2814[6] * this.field2814[9] + (this.field2814[14] * this.field2814[9] * -this.field2814[4] + this.field2814[13] * this.field2814[10] * this.field2814[4] + this.field2814[8] * this.field2814[5] * this.field2814[14] - this.field2814[12] * this.field2814[10] * this.field2814[5] - this.field2814[8] * this.field2814[6] * this.field2814[13])) * var2;
		float var16 = (this.field2814[13] * this.field2814[8] * this.field2814[2] + this.field2814[0] * this.field2814[9] * this.field2814[14] - this.field2814[13] * this.field2814[0] * this.field2814[10] - this.field2814[1] * this.field2814[8] * this.field2814[14] + this.field2814[1] * this.field2814[10] * this.field2814[12] - this.field2814[12] * this.field2814[2] * this.field2814[9]) * var2;
		float var17 = var2 * (-this.field2814[0] * this.field2814[5] * this.field2814[14] + this.field2814[6] * this.field2814[0] * this.field2814[13] + this.field2814[14] * this.field2814[1] * this.field2814[4] - this.field2814[6] * this.field2814[1] * this.field2814[12] - this.field2814[4] * this.field2814[2] * this.field2814[13] + this.field2814[2] * this.field2814[5] * this.field2814[12]);
		float var18 = (this.field2814[5] * this.field2814[0] * this.field2814[10] - this.field2814[0] * this.field2814[6] * this.field2814[9] - this.field2814[1] * this.field2814[4] * this.field2814[10] + this.field2814[1] * this.field2814[6] * this.field2814[8] + this.field2814[2] * this.field2814[4] * this.field2814[9] - this.field2814[8] * this.field2814[2] * this.field2814[5]) * var2;
		this.field2814[0] = var3;
		this.field2814[1] = var4;
		this.field2814[2] = var5;
		this.field2814[3] = var6;
		this.field2814[4] = var7;
		this.field2814[5] = var8;
		this.field2814[6] = var9;
		this.field2814[7] = var10;
		this.field2814[8] = var11;
		this.field2814[9] = var12;
		this.field2814[10] = var13;
		this.field2814[11] = var14;
		this.field2814[12] = var15;
		this.field2814[13] = var16;
		this.field2814[14] = var17;
		this.field2814[15] = var18;
	}

	@ObfInfo(name = "toString", desc = "()Ljava/lang/String;")
	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method1954();
		this.method1953();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field2814[var2 * 4 + var3];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	@ObfInfo(name = "hashCode", desc = "()I")
	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + Arrays.hashCode(this.field2814);
		return var3;
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		if (!(var1 instanceof class358)) {
			return false;
		} else {
			class358 var2 = (class358)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field2814[var3] != var2.field2814[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfInfo(name = "ag", desc = "(B)[F")
	public float[] method1961() {
		float[] var2 = new float[3];
		class278 var3 = new class278(this.field2814[0], this.field2814[1], this.field2814[2]);
		class278 var4 = new class278(this.field2814[4], this.field2814[5], this.field2814[6]);
		class278 var5 = new class278(this.field2814[8], this.field2814[9], this.field2814[10]);
		var2[0] = var3.method1474();
		var2[1] = var4.method1474();
		var2[2] = var5.method1474();
		return var2;
	}

	@ObfInfo(name = "au", desc = "(IB)V")
	static void method1968(int var0) {
		class151.field1465 = var0;
		field2813 = new class358[var0];
		class531.field4238 = 0;
	}
}
