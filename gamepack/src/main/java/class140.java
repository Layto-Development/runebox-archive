import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "id")
public abstract class class140 extends class83 {
	@ObfInfo(name = "ae", desc = "Z")
	boolean field1421;
	@ObfInfo(name = "au", desc = "Z")
	boolean field1423;
	@ObfInfo(name = "ap", desc = "Ljl;")
	class529 field1420;
	@ObfInfo(name = "az", desc = "[I")
	int[] field1422;

	@ObfInfo(name = "<init>", desc = "(Ljl;)V")
	class140(class529 var1) {
		this.field1423 = false;
		this.field1421 = false;
		this.field1422 = class276.field2233;
		this.field1420 = var1;
	}

	@ObfInfo(name = "aa", desc = "(IIIIIIFFFIIIIIIIIIIIII)V")
	abstract void method821(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfInfo(name = "ai", desc = "(IIIIIIFFFIII)V")
	abstract void method822(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfInfo(name = "az", desc = "(IIIIIIFFFI)V")
	abstract void method823(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

	@ObfInfo(name = "ap", desc = "(IIIIIIFFFIIIIIIIIIIIII)V")
	abstract void method824(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfInfo(name = "au", desc = "([III[F)V")
	void method818(int[] var1, int var2, int var3, float[] var4) {
		method535(var1, var2, var3, var4);
	}

	@ObfInfo(name = "at", desc = "(IIIIIIFFFIIIBBBB)V")
	void method820(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
		var10 = method825(var10, var13, var14, var15, var16);
		var11 = method825(var11, var13, var14, var15, var16);
		var12 = method825(var12, var13, var14, var15, var16);
		this.method822(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfInfo(name = "ac", desc = "(IIIIIIFFFIBBBB)V")
	void method817(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
		int var15 = method825(var10, var11, var12, var13, var14);
		var10 = this.field1422[var15];
		this.method823(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	@ObfInfo(name = "ae", desc = "(IBBBB)I")
	static int method825(int var0, byte var1, byte var2, byte var3, byte var4) {
		int var5 = var0 >> 10 & 63;
		int var6 = var0 >> 7 & 7;
		int var7 = var0 & 127;
		int var8 = var4 & 255;
		if (var1 != -1) {
			var5 += (var1 - var5) * var8 >> 7;
		}

		if (var2 != -1) {
			var6 += (var2 - var6) * var8 >> 7;
		}

		if (var3 != -1) {
			var7 += (var3 - var7) * var8 >> 7;
		}

		return (var5 << 10 | var6 << 7 | var7) & 65535;
	}

	@ObfInfo(name = "ao", desc = "(II)I")
	static final int method819(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}
}
