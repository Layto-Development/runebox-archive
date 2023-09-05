import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "uk")
public final class class398 extends class83 {
	@ObfInfo(name = "au", desc = "[B")
	public byte[] field3107;
	@ObfInfo(name = "ac", desc = "I")
	public int field3103;
	@ObfInfo(name = "az", desc = "I")
	public int field3104;
	@ObfInfo(name = "ao", desc = "I")
	public int field3105;
	@ObfInfo(name = "at", desc = "I")
	public int field3106;
	@ObfInfo(name = "ai", desc = "I")
	public int field3108;
	@ObfInfo(name = "ap", desc = "I")
	public int field3109;
	@ObfInfo(name = "ae", desc = "[I")
	public int[] field3110;

	@ObfInfo(name = "<init>", desc = "()V")
	class398() {
	}

	@ObfInfo(name = "au", desc = "()V")
	public void method2110() {
		if (this.field3105 != this.field3104 || this.field3106 != this.field3109) {
			byte[] var1 = new byte[this.field3104 * this.field3109];
			int var2 = 0;

			for (int var3 = 0; var3 < this.field3106; ++var3) {
				for (int var4 = 0; var4 < this.field3105; ++var4) {
					var1[var4 + this.field3103 + (var3 + this.field3108) * this.field3104] = this.field3107[var2++];
				}
			}

			this.field3107 = var1;
			this.field3105 = this.field3104;
			this.field3106 = this.field3109;
			this.field3103 = 0;
			this.field3108 = 0;
		}
	}

	@ObfInfo(name = "ae", desc = "(III)V")
	public void method2111(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field3110.length; ++var4) {
			int var5 = this.field3110[var4] >> 16 & 255;
			var5 += var1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = this.field3110[var4] >> 8 & 255;
			var6 += var2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = this.field3110[var4] & 255;
			var7 += var3;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			this.field3110[var4] = (var5 << 16) + (var6 << 8) + var7;
		}

	}

	@ObfInfo(name = "ao", desc = "(II)V")
	public void method2115(int var1, int var2) {
		var1 += this.field3103;
		var2 += this.field3108;
		int var3 = var1 + var2 * class83.field870;
		int var4 = 0;
		int var5 = this.field3106;
		int var6 = this.field3105;
		int var7 = class83.field870 - var6;
		int var8 = 0;
		int var9;
		if (var2 < class83.field876) {
			var9 = class83.field876 - var2;
			var5 -= var9;
			var2 = class83.field876;
			var4 += var9 * var6;
			var3 += var9 * class83.field870;
		}

		if (var2 + var5 > class83.field874) {
			var5 -= var2 + var5 - class83.field874;
		}

		if (var1 < class83.field875) {
			var9 = class83.field875 - var1;
			var6 -= var9;
			var1 = class83.field875;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}

		if (var1 + var6 > class83.field869) {
			var9 = var1 + var6 - class83.field869;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 > 0 && var5 > 0) {
			method2112(class83.field872, this.field3107, this.field3110, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfInfo(name = "ac", desc = "(IIII)V")
	public void method2114(int var1, int var2, int var3, int var4) {
		int var5 = this.field3105;
		int var6 = this.field3106;
		int var7 = 0;
		int var8 = 0;
		int var9 = this.field3104;
		int var10 = this.field3109;
		int var11 = (var9 << 16) / var3;
		int var12 = (var10 << 16) / var4;
		int var13;
		if (this.field3103 > 0) {
			var13 = ((this.field3103 << 16) + var11 - 1) / var11;
			var1 += var13;
			var7 += var13 * var11 - (this.field3103 << 16);
		}

		if (this.field3108 > 0) {
			var13 = ((this.field3108 << 16) + var12 - 1) / var12;
			var2 += var13;
			var8 += var13 * var12 - (this.field3108 << 16);
		}

		if (var5 < var9) {
			var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
		}

		if (var6 < var10) {
			var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
		}

		var13 = var1 + var2 * class83.field870;
		int var14 = class83.field870 - var3;
		if (var2 + var4 > class83.field874) {
			var4 -= var2 + var4 - class83.field874;
		}

		int var15;
		if (var2 < class83.field876) {
			var15 = class83.field876 - var2;
			var4 -= var15;
			var13 += var15 * class83.field870;
			var8 += var12 * var15;
		}

		if (var1 + var3 > class83.field869) {
			var15 = var1 + var3 - class83.field869;
			var3 -= var15;
			var14 += var15;
		}

		if (var1 < class83.field875) {
			var15 = class83.field875 - var1;
			var3 -= var15;
			var13 += var15;
			var7 += var11 * var15;
			var14 += var15;
		}

		method2113(class83.field872, this.field3107, this.field3110, var7, var8, var13, var14, var3, var4, var11, var12, var5);
	}

	@ObfInfo(name = "at", desc = "([I[B[IIIIIII)V")
	static void method2112(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			byte var12;
			for (var11 = var9; var11 < 0; ++var11) {
				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; ++var11) {
				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	@ObfInfo(name = "ai", desc = "([I[B[IIIIIIIIII)V")
	static void method2113(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3;

		for (int var13 = -var8; var13 < 0; ++var13) {
			int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; ++var15) {
				byte var16 = var1[(var3 >> 16) + var14];
				if (var16 != 0) {
					var0[var5++] = var2[var16 & 255];
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var12;
			var5 += var6;
		}

	}
}
