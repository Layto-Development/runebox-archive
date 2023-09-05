import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ut")
public class class83 extends class180 {
	@ObfInfo(name = "bh", desc = "[F")
	public static float[] field873;
	@ObfInfo(name = "bd", desc = "I")
	public static int field869;
	@ObfInfo(name = "aw", desc = "I")
	public static int field870;
	@ObfInfo(name = "ak", desc = "I")
	public static int field871;
	@ObfInfo(name = "bv", desc = "I")
	public static int field874;
	@ObfInfo(name = "bt", desc = "I")
	public static int field875;
	@ObfInfo(name = "bk", desc = "I")
	public static int field876;
	@ObfInfo(name = "av", desc = "[I")
	public static int[] field872;

	static {
		field876 = 0;
		field874 = 0;
		field875 = 0;
		field869 = 0;
	}

	@ObfInfo(name = "<init>", desc = "()V")
	protected class83() {
	}

	@ObfInfo(name = "em", desc = "([III[F)V")
	protected static void method535(int[] var0, int var1, int var2, float[] var3) {
		field872 = var0;
		field870 = var1;
		field871 = var2;
		field873 = var3;
		method549(0, 0, var1, var2);
	}

	@ObfInfo(name = "ef", desc = "()V")
	public static void method536() {
		field875 = 0;
		field876 = 0;
		field869 = field870;
		field874 = field871;
	}

	@ObfInfo(name = "ek", desc = "(IIII)V")
	public static void method549(int var0, int var1, int var2, int var3) {
		if (var0 < 0) {
			var0 = 0;
		}

		if (var1 < 0) {
			var1 = 0;
		}

		if (var2 > field870) {
			var2 = field870;
		}

		if (var3 > field871) {
			var3 = field871;
		}

		field875 = var0;
		field876 = var1;
		field869 = var2;
		field874 = var3;
	}

	@ObfInfo(name = "ec", desc = "(IIII)V")
	public static void method555(int var0, int var1, int var2, int var3) {
		if (field875 < var0) {
			field875 = var0;
		}

		if (field876 < var1) {
			field876 = var1;
		}

		if (field869 > var2) {
			field869 = var2;
		}

		if (field874 > var3) {
			field874 = var3;
		}

	}

	@ObfInfo(name = "eu", desc = "([I)V")
	public static void method538(int[] var0) {
		var0[0] = field875;
		var0[1] = field876;
		var0[2] = field869;
		var0[3] = field874;
	}

	@ObfInfo(name = "eg", desc = "([I)V")
	public static void method558(int[] var0) {
		field875 = var0[0];
		field876 = var0[1];
		field869 = var0[2];
		field874 = var0[3];
	}

	@ObfInfo(name = "ft", desc = "()V")
	public static void method539() {
		int var0 = 0;

		int var1;
		for (var1 = field870 * field871 - 7; var0 < var1; field872[var0++] = 0) {
			field872[var0++] = 0;
			field872[var0++] = 0;
			field872[var0++] = 0;
			field872[var0++] = 0;
			field872[var0++] = 0;
			field872[var0++] = 0;
			field872[var0++] = 0;
		}

		for (var1 += 7; var0 < var1; field872[var0++] = 0) {
		}

		method551();
	}

	@ObfInfo(name = "fs", desc = "(IIII)V")
	static void method554(int var0, int var1, int var2, int var3) {
		if (var2 == 0) {
			method557(var0, var1, var3);
		} else {
			if (var2 < 0) {
				var2 = -var2;
			}

			int var4 = var1 - var2;
			if (var4 < field876) {
				var4 = field876;
			}

			int var5 = var1 + var2 + 1;
			if (var5 > field874) {
				var5 = field874;
			}

			int var6 = var4;
			int var7 = var2 * var2;
			int var8 = 0;
			int var9 = var1 - var4;
			int var10 = var9 * var9;
			int var11 = var10 - var9;
			if (var1 > var5) {
				var1 = var5;
			}

			int var12;
			int var13;
			int var14;
			int var15;
			while (var6 < var1) {
				while (var11 <= var7 || var10 <= var7) {
					var10 += var8 + var8;
					var11 += var8++ + var8;
				}

				var12 = var0 - var8 + 1;
				if (var12 < field875) {
					var12 = field875;
				}

				var13 = var0 + var8;
				if (var13 > field869) {
					var13 = field869;
				}

				var14 = var12 + var6 * field870;

				for (var15 = var12; var15 < var13; ++var15) {
					field872[var14++] = var3;
				}

				++var6;
				var10 -= var9-- + var9;
				var11 -= var9 + var9;
			}

			var8 = var2;
			var9 = var6 - var1;
			var11 = var9 * var9 + var7;
			var10 = var11 - var2;

			for (var11 -= var9; var6 < var5; var10 += var9++ + var9) {
				while (var11 > var7 && var10 > var7) {
					var11 -= var8-- + var8;
					var10 -= var8 + var8;
				}

				var12 = var0 - var8;
				if (var12 < field875) {
					var12 = field875;
				}

				var13 = var0 + var8;
				if (var13 > field869 - 1) {
					var13 = field869 - 1;
				}

				var14 = var12 + var6 * field870;

				for (var15 = var12; var15 <= var13; ++var15) {
					field872[var14++] = var3;
				}

				++var6;
				var11 += var9 + var9;
			}

		}
	}

	@ObfInfo(name = "fl", desc = "(IIIII)V")
	public static void method540(int var0, int var1, int var2, int var3, int var4) {
		if (var4 != 0) {
			if (var4 == 256) {
				method554(var0, var1, var2, var3);
			} else {
				if (var2 < 0) {
					var2 = -var2;
				}

				int var5 = 256 - var4;
				int var6 = (var3 >> 16 & 255) * var4;
				int var7 = (var3 >> 8 & 255) * var4;
				int var8 = (var3 & 255) * var4;
				int var12 = var1 - var2;
				if (var12 < field876) {
					var12 = field876;
				}

				int var13 = var1 + var2 + 1;
				if (var13 > field874) {
					var13 = field874;
				}

				int var14 = var12;
				int var15 = var2 * var2;
				int var16 = 0;
				int var17 = var1 - var12;
				int var18 = var17 * var17;
				int var19 = var18 - var17;
				if (var1 > var13) {
					var1 = var13;
				}

				int var9;
				int var10;
				int var11;
				int var20;
				int var21;
				int var22;
				int var23;
				int var24;
				while (var14 < var1) {
					while (var19 <= var15 || var18 <= var15) {
						var18 += var16 + var16;
						var19 += var16++ + var16;
					}

					var20 = var0 - var16 + 1;
					if (var20 < field875) {
						var20 = field875;
					}

					var21 = var0 + var16;
					if (var21 > field869) {
						var21 = field869;
					}

					var22 = var20 + var14 * field870;

					for (var23 = var20; var23 < var21; ++var23) {
						var9 = (field872[var22] >> 16 & 255) * var5;
						var10 = (field872[var22] >> 8 & 255) * var5;
						var11 = (field872[var22] & 255) * var5;
						var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
						field872[var22++] = var24;
					}

					++var14;
					var18 -= var17-- + var17;
					var19 -= var17 + var17;
				}

				var16 = var2;
				var17 = -var17;
				var19 = var17 * var17 + var15;
				var18 = var19 - var2;

				for (var19 -= var17; var14 < var13; var18 += var17++ + var17) {
					while (var19 > var15 && var18 > var15) {
						var19 -= var16-- + var16;
						var18 -= var16 + var16;
					}

					var20 = var0 - var16;
					if (var20 < field875) {
						var20 = field875;
					}

					var21 = var0 + var16;
					if (var21 > field869 - 1) {
						var21 = field869 - 1;
					}

					var22 = var20 + var14 * field870;

					for (var23 = var20; var23 <= var21; ++var23) {
						var9 = (field872[var22] >> 16 & 255) * var5;
						var10 = (field872[var22] >> 8 & 255) * var5;
						var11 = (field872[var22] & 255) * var5;
						var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
						field872[var22++] = var24;
					}

					++var14;
					var19 += var17 + var17;
				}

			}
		}
	}

	@ObfInfo(name = "fe", desc = "(IIIIII)V")
	public static void method541(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 < field875) {
			var2 -= field875 - var0;
			var0 = field875;
		}

		if (var1 < field876) {
			var3 -= field876 - var1;
			var1 = field876;
		}

		if (var0 + var2 > field869) {
			var2 = field869 - var0;
		}

		if (var1 + var3 > field874) {
			var3 = field874 - var1;
		}

		var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & 65280) * var5 >> 8 & 65280);
		int var6 = 256 - var5;
		int var7 = field870 - var2;
		int var8 = var0 + var1 * field870;

		for (int var9 = 0; var9 < var3; ++var9) {
			for (int var10 = -var2; var10 < 0; ++var10) {
				int var11 = field872[var8];
				var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 65280) * var6 >> 8 & 65280);
				field872[var8++] = var4 + var11;
			}

			var8 += var7;
		}

	}

	@ObfInfo(name = "fd", desc = "(IIIII)V")
	public static void method542(int var0, int var1, int var2, int var3, int var4) {
		if (var0 < field875) {
			var2 -= field875 - var0;
			var0 = field875;
		}

		if (var1 < field876) {
			var3 -= field876 - var1;
			var1 = field876;
		}

		if (var0 + var2 > field869) {
			var2 = field869 - var0;
		}

		if (var1 + var3 > field874) {
			var3 = field874 - var1;
		}

		int var5 = field870 - var2;
		int var6 = var0 + var1 * field870;

		for (int var7 = -var3; var7 < 0; ++var7) {
			for (int var8 = -var2; var8 < 0; ++var8) {
				field872[var6++] = var4;
			}

			var6 += var5;
		}

	}

	@ObfInfo(name = "fj", desc = "(IIIIII)V")
	public static void method543(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var2 > 0 && var3 > 0) {
			int var6 = 0;
			int var7 = 65536 / var3;
			if (var0 < field875) {
				var2 -= field875 - var0;
				var0 = field875;
			}

			if (var1 < field876) {
				var6 += (field876 - var1) * var7;
				var3 -= field876 - var1;
				var1 = field876;
			}

			if (var0 + var2 > field869) {
				var2 = field869 - var0;
			}

			if (var1 + var3 > field874) {
				var3 = field874 - var1;
			}

			int var8 = field870 - var2;
			int var9 = var0 + var1 * field870;

			for (int var10 = -var3; var10 < 0; ++var10) {
				int var11 = 65536 - var6 >> 8;
				int var12 = var6 >> 8;
				int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & 65280) * var11 + (var5 & 65280) * var12 & 16711680) >>> 8;

				for (int var14 = -var2; var14 < 0; ++var14) {
					field872[var9++] = var13;
				}

				var9 += var8;
				var6 += var7;
			}

		}
	}

	@ObfInfo(name = "fv", desc = "(IIIIIIII)V")
	public static void method556(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 > 0 && var3 > 0) {
			int var8 = 0;
			int var9 = 65536 / var3;
			if (var0 < field875) {
				var2 -= field875 - var0;
				var0 = field875;
			}

			if (var1 < field876) {
				var8 += (field876 - var1) * var9;
				var3 -= field876 - var1;
				var1 = field876;
			}

			if (var0 + var2 > field869) {
				var2 = field869 - var0;
			}

			if (var1 + var3 > field874) {
				var3 = field874 - var1;
			}

			int var10 = field870 - var2;
			int var11 = var0 + var1 * field870;

			for (int var12 = -var3; var12 < 0; ++var12) {
				int var13 = 65536 - var8 >> 8;
				int var14 = var8 >> 8;
				int var15 = (var6 * var13 + var7 * var14 & 65280) >>> 8;
				if (var15 == 0) {
					var11 += field870;
					var8 += var9;
				} else {
					int var16 = ((var4 & 16711935) * var13 + (var5 & 16711935) * var14 & -16711936) + ((var4 & 65280) * var13 + (var5 & 65280) * var14 & 16711680) >>> 8;
					int var17 = 255 - var15;
					int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + ((var16 & 65280) * var15 >> 8 & 65280);

					for (int var19 = -var2; var19 < 0; ++var19) {
						int var20 = field872[var11];
						if (var20 == 0) {
							field872[var11++] = var18;
						} else {
							var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + ((var20 & 65280) * var17 >> 8 & 65280);
							field872[var11++] = var18 + var20;
						}
					}

					var11 += var10;
					var8 += var9;
				}
			}

		}
	}

	@ObfInfo(name = "fb", desc = "(IIIIII[BIZ)V")
	public static void method559(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
		if (var0 + var2 >= 0 && var1 + var3 >= 0) {
			if (var0 < field870 && var1 < field871) {
				int var9 = 0;
				int var10 = 0;
				if (var0 < 0) {
					var9 -= var0;
					var2 += var0;
				}

				if (var1 < 0) {
					var10 -= var1;
					var3 += var1;
				}

				if (var0 + var2 > field870) {
					var2 = field870 - var0;
				}

				if (var1 + var3 > field871) {
					var3 = field871 - var1;
				}

				int var11 = var6.length / var7;
				int var12 = field870 - var2;
				int var13 = var4 >>> 24;
				int var14 = var5 >>> 24;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				if (var8 && (var13 != 255 || var14 != 255)) {
					var15 = (var1 + var10) * field870 + var0 + var9;

					for (var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
						for (var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
							var18 = (var16 - var1) % var11;
							var19 = (var17 - var0) % var7;
							int var20 = var4;
							if (var6[var18 * var7 + var19] != 0) {
								var20 = var5;
							}

							int var21 = var20 >>> 24;
							int var22 = 255 - var21;
							int var23 = field872[var15];
							int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + ((var20 & 65280) * var21 + (var23 & 65280) * var22 & 16711680) >> 8;
							field872[var15++] = var24;
						}

						var15 += var12;
					}
				} else {
					var15 = (var1 + var10) * field870 + var0 + var9;

					for (var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
						for (var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
							var18 = (var16 - var1) % var11;
							var19 = (var17 - var0) % var7;
							if (var6[var18 * var7 + var19] != 0) {
								field872[var15++] = var5;
							} else {
								field872[var15++] = var4;
							}
						}

						var15 += var12;
					}
				}

			}
		}
	}

	@ObfInfo(name = "fr", desc = "(IIIII)V")
	public static void method545(int var0, int var1, int var2, int var3, int var4) {
		method553(var0, var1, var2, var4);
		method553(var0, var1 + var3 - 1, var2, var4);
		method548(var0, var1, var3, var4);
		method548(var0 + var2 - 1, var1, var3, var4);
	}

	@ObfInfo(name = "fq", desc = "(IIIIII)V")
	public static void method546(int var0, int var1, int var2, int var3, int var4, int var5) {
		method547(var0, var1, var2, var4, var5);
		method547(var0, var1 + var3 - 1, var2, var4, var5);
		if (var3 >= 3) {
			method537(var0, var1 + 1, var3 - 2, var4, var5);
			method537(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
		}

	}

	@ObfInfo(name = "fp", desc = "(IIII)V")
	public static void method553(int var0, int var1, int var2, int var3) {
		if (var1 >= field876 && var1 < field874) {
			if (var0 < field875) {
				var2 -= field875 - var0;
				var0 = field875;
			}

			if (var0 + var2 > field869) {
				var2 = field869 - var0;
			}

			int var4 = var0 + var1 * field870;

			for (int var5 = 0; var5 < var2; ++var5) {
				field872[var4 + var5] = var3;
			}

		}
	}

	@ObfInfo(name = "fg", desc = "(IIIII)V")
	static void method547(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= field876 && var1 < field874) {
			if (var0 < field875) {
				var2 -= field875 - var0;
				var0 = field875;
			}

			if (var0 + var2 > field869) {
				var2 = field869 - var0;
			}

			int var5 = 256 - var4;
			int var6 = (var3 >> 16 & 255) * var4;
			int var7 = (var3 >> 8 & 255) * var4;
			int var8 = (var3 & 255) * var4;
			int var12 = var0 + var1 * field870;

			for (int var13 = 0; var13 < var2; ++var13) {
				int var9 = (field872[var12] >> 16 & 255) * var5;
				int var10 = (field872[var12] >> 8 & 255) * var5;
				int var11 = (field872[var12] & 255) * var5;
				int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
				field872[var12++] = var14;
			}

		}
	}

	@ObfInfo(name = "fo", desc = "(IIII)V")
	public static void method548(int var0, int var1, int var2, int var3) {
		if (var0 >= field875 && var0 < field869) {
			if (var1 < field876) {
				var2 -= field876 - var1;
				var1 = field876;
			}

			if (var1 + var2 > field874) {
				var2 = field874 - var1;
			}

			int var4 = var0 + var1 * field870;

			for (int var5 = 0; var5 < var2; ++var5) {
				field872[var4 + var5 * field870] = var3;
			}

		}
	}

	@ObfInfo(name = "fz", desc = "(IIIII)V")
	static void method537(int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= field875 && var0 < field869) {
			if (var1 < field876) {
				var2 -= field876 - var1;
				var1 = field876;
			}

			if (var1 + var2 > field874) {
				var2 = field874 - var1;
			}

			int var5 = 256 - var4;
			int var6 = (var3 >> 16 & 255) * var4;
			int var7 = (var3 >> 8 & 255) * var4;
			int var8 = (var3 & 255) * var4;
			int var12 = var0 + var1 * field870;

			for (int var13 = 0; var13 < var2; ++var13) {
				int var9 = (field872[var12] >> 16 & 255) * var5;
				int var10 = (field872[var12] >> 8 & 255) * var5;
				int var11 = (field872[var12] & 255) * var5;
				int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
				field872[var12] = var14;
				var12 += field870;
			}

		}
	}

	@ObfInfo(name = "fu", desc = "(IIIII)V")
	public static void method544(int var0, int var1, int var2, int var3, int var4) {
		var2 -= var0;
		var3 -= var1;
		if (var3 == 0) {
			if (var2 >= 0) {
				method553(var0, var1, var2 + 1, var4);
			} else {
				method553(var0 + var2, var1, -var2 + 1, var4);
			}

		} else if (var2 == 0) {
			if (var3 >= 0) {
				method548(var0, var1, var3 + 1, var4);
			} else {
				method548(var0, var1 + var3, -var3 + 1, var4);
			}

		} else {
			if (var2 + var3 < 0) {
				var0 += var2;
				var2 = -var2;
				var1 += var3;
				var3 = -var3;
			}

			int var5;
			int var6;
			if (var2 > var3) {
				var1 <<= 16;
				var1 += 32768;
				var3 <<= 16;
				var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
				var2 += var0;
				if (var0 < field875) {
					var1 += var5 * (field875 - var0);
					var0 = field875;
				}

				if (var2 >= field869) {
					var2 = field869 - 1;
				}

				while (var0 <= var2) {
					var6 = var1 >> 16;
					if (var6 >= field876 && var6 < field874) {
						field872[var0 + var6 * field870] = var4;
					}

					var1 += var5;
					++var0;
				}
			} else {
				var0 <<= 16;
				var0 += 32768;
				var2 <<= 16;
				var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
				var3 += var1;
				if (var1 < field876) {
					var0 += var5 * (field876 - var1);
					var1 = field876;
				}

				if (var3 >= field874) {
					var3 = field874 - 1;
				}

				while (var1 <= var3) {
					var6 = var0 >> 16;
					if (var6 >= field875 && var6 < field869) {
						field872[var6 + var1 * field870] = var4;
					}

					var0 += var5;
					++var1;
				}
			}

		}
	}

	@ObfInfo(name = "fn", desc = "(III)V")
	static void method557(int var0, int var1, int var2) {
		if (var0 >= field875 && var1 >= field876 && var0 < field869 && var1 < field874) {
			field872[var0 + var1 * field870] = var2;
		}
	}

	@ObfInfo(name = "fx", desc = "(III[I[I)V")
	public static void method550(int var0, int var1, int var2, int[] var3, int[] var4) {
		int var5 = var0 + var1 * field870;

		for (var1 = 0; var1 < var3.length; ++var1) {
			int var6 = var5 + var3[var1];

			for (var0 = -var4[var1]; var0 < 0; ++var0) {
				field872[var6++] = var2;
			}

			var5 += field870;
		}

	}

	@ObfInfo(name = "ff", desc = "()V")
	public static void method551() {
		if (field873 != null) {
			int var0;
			int var1;
			int var2;
			if (field875 == 0 && field869 == field870 && field876 == 0 && field874 == field871) {
				var0 = field873.length;
				var1 = var0 - (var0 & 7);

				for (var2 = 0; var2 < var1; field873[var2++] = 0.0F) {
					field873[var2++] = 0.0F;
					field873[var2++] = 0.0F;
					field873[var2++] = 0.0F;
					field873[var2++] = 0.0F;
					field873[var2++] = 0.0F;
					field873[var2++] = 0.0F;
					field873[var2++] = 0.0F;
				}

				while (var2 < var0) {
					field873[var2++] = 0.0F;
				}
			} else {
				var0 = field869 - field875;
				var1 = field874 - field876;
				var2 = field870 - var0;
				int var3 = field875 + field876 * field870;
				int var4 = var0 >> 3;
				int var5 = var0 & 7;
				var0 = var3 - 1;

				for (int var7 = -var1; var7 < 0; ++var7) {
					int var6;
					if (var4 > 0) {
						var6 = var4;

						do {
							++var0;
							field873[var0] = 0.0F;
							++var0;
							field873[var0] = 0.0F;
							++var0;
							field873[var0] = 0.0F;
							++var0;
							field873[var0] = 0.0F;
							++var0;
							field873[var0] = 0.0F;
							++var0;
							field873[var0] = 0.0F;
							++var0;
							field873[var0] = 0.0F;
							++var0;
							field873[var0] = 0.0F;
							--var6;
						} while(var6 > 0);
					}

					if (var5 > 0) {
						var6 = var5;

						do {
							++var0;
							field873[var0] = 0.0F;
							--var6;
						} while(var6 > 0);
					}

					var0 += var2;
				}
			}

		}
	}

	@ObfInfo(name = "fc", desc = "()V")
	public static void method552() {
		if (field873 != null) {
			int var0 = field873.length;

			for (int var1 = 0; var1 < var0; ++var1) {
				if (var1 % field870 < field870 / 2 && field873[var1] > 0.0F) {
					float var3 = field873[var1];
					float var4 = 75.0F;
					float var5 = 10000.0F;
					float var6 = 750000.0F / (10000.0F - var3 * 9925.0F);
					float var2 = (var6 - 75.0F) / 9925.0F;
					int var7 = (int)(var2 * 255.0F);
					field872[var1] = var7 << 16 | var7 << 8 | var7;
				}
			}

		}
	}
}
