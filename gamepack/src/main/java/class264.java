import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "db")
public class class264 {
	@ObfInfo(name = "au", desc = "[Luk;")
	class398[] field2136;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = 1357457163)
	int field2127;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -1978520895)
	int field2129;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -1366541383)
	int field2130;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 721543991)
	int field2135;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -1177793169)
	int field2141;
	@ObfInfo(name = "as", desc = "I", intMultiplier = -837944935)
	int field2142;
	@ObfInfo(name = "az", desc = "[I")
	int[] field2128;
	@ObfInfo(name = "af", desc = "[I")
	int[] field2131;
	@ObfInfo(name = "ad", desc = "[I")
	int[] field2132;
	@ObfInfo(name = "aq", desc = "[I")
	int[] field2133;
	@ObfInfo(name = "ar", desc = "[I")
	int[] field2134;
	@ObfInfo(name = "ab", desc = "[I")
	int[] field2137;
	@ObfInfo(name = "ag", desc = "[I")
	int[] field2138;
	@ObfInfo(name = "am", desc = "[I")
	int[] field2139;
	@ObfInfo(name = "aa", desc = "[I")
	int[] field2140;

	@ObfInfo(name = "<init>", desc = "([Luk;)V")
	class264(class398[] var1) {
		this.field2128 = new int[256];
		this.field2129 = 0;
		this.field2135 = 0;
		this.field2130 = 0;
		this.field2127 = 0;
		this.field2141 = 0;
		this.field2142 = 0;
		this.field2136 = var1;
		this.method1373();
	}

	@ObfInfo(name = "au", desc = "(B)V", opaqueValue = "-111")
	void method1373() {
		this.field2131 = new int[256];

		int var2;
		for (var2 = 0; var2 < 64; ++var2) {
			this.field2131[var2] = var2 * 262144;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field2131[var2 + 64] = var2 * 1024 + 16711680;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field2131[var2 + 128] = 16776960 + var2 * 4;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field2131[var2 + 192] = 16777215;
		}

		this.field2132 = new int[256];

		for (var2 = 0; var2 < 64; ++var2) {
			this.field2132[var2] = var2 * 1024;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field2132[var2 + 64] = 65280 + var2 * 4;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field2132[var2 + 128] = var2 * 262144 + 65535;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field2132[var2 + 192] = 16777215;
		}

		this.field2133 = new int[256];

		for (var2 = 0; var2 < 64; ++var2) {
			this.field2133[var2] = var2 * 4;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field2133[var2 + 64] = var2 * 262144 + 255;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field2133[var2 + 128] = var2 * 1024 + 16711935;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field2133[var2 + 192] = 16777215;
		}

		this.field2140 = new int[256];
		this.field2127 = 0;
		this.field2138 = new int[32768];
		this.field2139 = new int[32768];
		this.method1380((class398)null);
		this.field2134 = new int[32768];
		this.field2137 = new int[32768];
	}

	@ObfInfo(name = "ae", desc = "(I)V")
	void method1374() {
		this.field2131 = null;
		this.field2132 = null;
		this.field2133 = null;
		this.field2140 = null;
		this.field2138 = null;
		this.field2139 = null;
		this.field2134 = null;
		this.field2137 = null;
		this.field2127 = 0;
		this.field2141 = 0;
	}

	@ObfInfo(name = "ao", desc = "(IIB)V", opaqueValue = "-65")
	void method1381(int var1, int var2) {
		if (this.field2134 == null) {
			this.method1373();
		}

		if (this.field2142 == 0) {
			this.field2142 = var2;
		}

		int var4 = var2 - this.field2142;
		if (var4 >= 256) {
			var4 = 0;
		}

		this.field2142 = var2;
		if (var4 > 0) {
			this.method1375(var4);
		}

		this.method1377(var1);
	}

	@ObfInfo(name = "at", desc = "(IB)V", opaqueValue = "0")
	final void method1375(int var1) {
		this.field2127 += var1 * 128;
		int var3;
		if (this.field2127 > this.field2138.length) {
			this.field2127 -= this.field2138.length;
			var3 = (int)(Math.random() * 12.0D);
			this.method1380(this.field2136[var3]);
		}

		var3 = 0;
		int var4 = var1 * 128;
		int var5 = (256 - var1) * 128;

		int var7;
		for (int var6 = 0; var6 < var5; ++var6) {
			var7 = this.field2134[var4 + var3] - this.field2138[this.field2127 + var3 & this.field2138.length - 1] * var1 / 6;
			if (var7 < 0) {
				var7 = 0;
			}

			this.field2134[var3++] = var7;
		}

		byte var16 = 10;
		var7 = 128 - var16;

		int var8;
		int var11;
		for (var8 = 256 - var1; var8 < 256; ++var8) {
			int var9 = var8 * 128;

			for (int var10 = 0; var10 < 128; ++var10) {
				var11 = (int)(Math.random() * 100.0D);
				if (var11 < 50 && var10 > var16 && var10 < var7) {
					this.field2134[var10 + var9] = 255;
				} else {
					this.field2134[var10 + var9] = 0;
				}
			}
		}

		if (this.field2135 > 0) {
			this.field2135 -= var1 * 4;
		}

		if (this.field2130 > 0) {
			this.field2130 -= var1 * 4;
		}

		if (this.field2135 == 0 && this.field2130 == 0) {
			var8 = (int)(Math.random() * (double)(2000 / var1));
			if (var8 == 0) {
				this.field2135 = 1024;
			}

			if (var8 == 1) {
				this.field2130 = 1024;
			}
		}

		for (var8 = 0; var8 < 256 - var1; ++var8) {
			this.field2128[var8] = this.field2128[var1 + var8];
		}

		for (var8 = 256 - var1; var8 < 256; ++var8) {
			this.field2128[var8] = (int)(Math.sin((double)this.field2129 / 14.0D) * 16.0D + Math.sin((double)this.field2129 / 15.0D) * 14.0D + Math.sin((double)this.field2129 / 16.0D) * 12.0D);
			++this.field2129;
		}

		this.field2141 += var1;
		var8 = ((Client.field330 & 1) + var1) / 2;
		if (var8 > 0) {
			short var17 = 128;
			byte var18 = 2;
			var11 = 128 - var18 - var18;

			int var12;
			int var13;
			int var14;
			for (var12 = 0; var12 < this.field2141 * 100; ++var12) {
				var13 = (int)(Math.random() * (double)var11) + var18;
				var14 = (int)(Math.random() * (double)var17) + var17;
				this.field2134[(var14 << 7) + var13] = 192;
			}

			this.field2141 = 0;

			int var15;
			for (var12 = 0; var12 < 256; ++var12) {
				var13 = 0;
				var14 = var12 * 128;

				for (var15 = -var8; var15 < 128; ++var15) {
					if (var8 + var15 < 128) {
						var13 += this.field2134[var8 + var15 + var14];
					}

					if (var15 - (var8 + 1) >= 0) {
						var13 -= this.field2134[var14 + var15 - (var8 + 1)];
					}

					if (var15 >= 0) {
						this.field2137[var15 + var14] = var13 / (var8 * 2 + 1);
					}
				}
			}

			for (var12 = 0; var12 < 128; ++var12) {
				var13 = 0;

				for (var14 = -var8; var14 < 256; ++var14) {
					var15 = var14 * 128;
					if (var8 + var14 < 256) {
						var13 += this.field2137[var15 + var12 + var8 * 128];
					}

					if (var14 - (var8 + 1) >= 0) {
						var13 -= this.field2137[var12 + var15 - (var8 + 1) * 128];
					}

					if (var14 >= 0) {
						this.field2134[var12 + var15] = var13 / (var8 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfInfo(name = "ac", desc = "(IIIS)I")
	final int method1376(int var1, int var2, int var3) {
		int var5 = 256 - var3;
		return (var3 * (var2 & 65280) + var5 * (var1 & 65280) & 16711680) + (var3 * (var2 & 16711935) + (var1 & 16711935) * var5 & -16711936) >> 8;
	}

	@ObfInfo(name = "ai", desc = "(II)V", opaqueValue = "-507785861")
	final void method1377(int var1) {
		int var3 = this.field2140.length;
		if (this.field2135 > 0) {
			this.method1378(this.field2135, this.field2132);
		} else if (this.field2130 > 0) {
			this.method1378(this.field2130, this.field2133);
		} else {
			for (int var4 = 0; var4 < var3; ++var4) {
				this.field2140[var4] = this.field2131[var4];
			}
		}

		this.method1379(var1);
	}

	@ObfInfo(name = "az", desc = "(I[IB)V")
	final void method1378(int var1, int[] var2) {
		int var4 = this.field2140.length;

		for (int var5 = 0; var5 < var4; ++var5) {
			if (var1 > 768) {
				this.field2140[var5] = this.method1376(this.field2131[var5], var2[var5], 1024 - var1);
			} else if (var1 > 256) {
				this.field2140[var5] = var2[var5];
			} else {
				this.field2140[var5] = this.method1376(var2[var5], this.field2131[var5], 256 - var1);
			}
		}

	}

	@ObfInfo(name = "ap", desc = "(II)V", opaqueValue = "-1411516781")
	final void method1379(int var1) {
		int var3 = 0;

		for (int var4 = 1; var4 < 255; ++var4) {
			int var5 = (256 - var4) * this.field2128[var4] / 256;
			int var6 = var5 + var1;
			int var7 = 0;
			int var8 = 128;
			if (var6 < 0) {
				var7 = -var6;
				var6 = 0;
			}

			if (var6 + 128 >= class535.field4266.field3941) {
				var8 = class535.field4266.field3941 - var6;
			}

			int var9 = var6 + (var4 + 8) * class535.field4266.field3941;
			var3 += var7;

			for (int var10 = var7; var10 < var8; ++var10) {
				int var11 = this.field2134[var3++];
				int var12 = var9 % class83.field870;
				if (var11 != 0 && var12 >= class83.field875 && var12 < class83.field869) {
					int var13 = var11;
					int var14 = 256 - var11;
					var11 = this.field2140[var11];
					int var15 = class535.field4266.field3942[var9];
					class535.field4266.field3942[var9++] = -16777216 | (var14 * (var15 & 16711935) + var13 * (var11 & 16711935) & -16711936) + ((var15 & 65280) * var14 + (var11 & 65280) * var13 & 16711680) >> 8;
				} else {
					++var9;
				}
			}

			var3 += 128 - var8;
		}

	}

	@ObfInfo(name = "aa", desc = "(Luk;I)V", opaqueValue = "-452683446")
	final void method1380(class398 var1) {
		int var3;
		for (var3 = 0; var3 < this.field2138.length; ++var3) {
			this.field2138[var3] = 0;
		}

		int var4;
		for (var3 = 0; var3 < 5000; ++var3) {
			var4 = (int)(Math.random() * 128.0D * 256.0D);
			this.field2138[var4] = (int)(Math.random() * 256.0D);
		}

		int var5;
		int var6;
		for (var3 = 0; var3 < 20; ++var3) {
			for (var4 = 1; var4 < 255; ++var4) {
				for (var5 = 1; var5 < 127; ++var5) {
					var6 = (var4 << 7) + var5;
					this.field2139[var6] = (this.field2138[var6 + 1] + this.field2138[var6 - 1] + this.field2138[var6 - 128] + this.field2138[var6 + 128]) / 4;
				}
			}

			int[] var9 = this.field2138;
			this.field2138 = this.field2139;
			this.field2139 = var9;
		}

		if (var1 != null) {
			var3 = 0;

			for (var4 = 0; var4 < var1.field3106; ++var4) {
				for (var5 = 0; var5 < var1.field3105; ++var5) {
					if (var1.field3107[var3++] != 0) {
						var6 = var5 + 16 + var1.field3103;
						int var7 = var4 + 16 + var1.field3108;
						int var8 = var6 + (var7 << 7);
						this.field2138[var8] = 0;
					}
				}
			}
		}

	}
}
