import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "is")
public class class77 {
	@ObfInfo(name = "bq", desc = "I", intMultiplier = 1787133985)
	int field826;
	@ObfInfo(name = "bs", desc = "I", intMultiplier = -586193895)
	int field827;
	@ObfInfo(name = "bm", desc = "I", intMultiplier = -1216130805)
	int field828;
	@ObfInfo(name = "bf", desc = "I", intMultiplier = -356929081)
	int field829;
	@ObfInfo(name = "ba", desc = "[[I")
	public int[][] field830;

	@ObfInfo(name = "<init>", desc = "(II)V")
	public class77(int var1, int var2) {
		this.field827 = 0;
		this.field828 = 0;
		this.field829 = var1;
		this.field826 = var2;
		this.field830 = new int[this.field829][this.field826];
		this.method526();
	}

	@ObfInfo(name = "au", desc = "(I)V", opaqueValue = "1807552655")
	public void method526() {
		for (int var2 = 0; var2 < this.field829; ++var2) {
			for (int var3 = 0; var3 < this.field826; ++var3) {
				if (var2 != 0 && var3 != 0 && var2 < this.field829 - 5 && var3 < this.field826 - 5) {
					this.field830[var2][var3] = 16777216;
				} else {
					this.field830[var2][var3] = 16777215;
				}
			}
		}

	}

	@ObfInfo(name = "ae", desc = "(IIIIZI)V", opaqueValue = "-1654307107")
	public void method519(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.field827;
		var2 -= this.field828;
		if (var3 == 0) {
			if (var4 == 0) {
				this.method518(var1, var2, 128);
				this.method518(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.method518(var1, var2, 2);
				this.method518(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.method518(var1, var2, 8);
				this.method518(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.method518(var1, var2, 32);
				this.method518(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.method518(var1, var2, 1);
				this.method518(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.method518(var1, var2, 4);
				this.method518(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.method518(var1, var2, 16);
				this.method518(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.method518(var1, var2, 64);
				this.method518(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.method518(var1, var2, 130);
				this.method518(var1 - 1, var2, 8);
				this.method518(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.method518(var1, var2, 10);
				this.method518(var1, var2 + 1, 32);
				this.method518(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.method518(var1, var2, 40);
				this.method518(var1 + 1, var2, 128);
				this.method518(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.method518(var1, var2, 160);
				this.method518(var1, var2 - 1, 2);
				this.method518(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.method518(var1, var2, 65536);
					this.method518(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.method518(var1, var2, 1024);
					this.method518(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.method518(var1, var2, 4096);
					this.method518(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.method518(var1, var2, 16384);
					this.method518(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.method518(var1, var2, 512);
					this.method518(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.method518(var1, var2, 2048);
					this.method518(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.method518(var1, var2, 8192);
					this.method518(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.method518(var1, var2, 32768);
					this.method518(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.method518(var1, var2, 66560);
					this.method518(var1 - 1, var2, 4096);
					this.method518(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.method518(var1, var2, 5120);
					this.method518(var1, var2 + 1, 16384);
					this.method518(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.method518(var1, var2, 20480);
					this.method518(var1 + 1, var2, 65536);
					this.method518(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.method518(var1, var2, 81920);
					this.method518(var1, var2 - 1, 1024);
					this.method518(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfInfo(name = "ao", desc = "(IIIIZB)V", opaqueValue = "9")
	public void method520(int var1, int var2, int var3, int var4, boolean var5) {
		int var7 = 256;
		if (var5) {
			var7 += 131072;
		}

		var1 -= this.field827;
		var2 -= this.field828;

		for (int var8 = var1; var8 < var1 + var3; ++var8) {
			if (var8 >= 0 && var8 < this.field829) {
				for (int var9 = var2; var9 < var2 + var4; ++var9) {
					if (var9 >= 0 && var9 < this.field826) {
						this.method518(var8, var9, var7);
					}
				}
			}
		}

	}

	@ObfInfo(name = "at", desc = "(IIB)V")
	public void method521(int var1, int var2) {
		var1 -= this.field827;
		var2 -= this.field828;
		int[] var10000 = this.field830[var1];
		var10000[var2] |= 2097152;
	}

	@ObfInfo(name = "ac", desc = "(III)V")
	public void method522(int var1, int var2) {
		var1 -= this.field827;
		var2 -= this.field828;
		int[] var10000 = this.field830[var1];
		var10000[var2] |= 262144;
	}

	@ObfInfo(name = "ai", desc = "(IIIB)V")
	void method518(int var1, int var2, int var3) {
		int[] var10000 = this.field830[var1];
		var10000[var2] |= var3;
	}

	@ObfInfo(name = "az", desc = "(IIIIZI)V", opaqueValue = "-220958041")
	public void method523(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.field827;
		var2 -= this.field828;
		if (var3 == 0) {
			if (var4 == 0) {
				this.method524(var1, var2, 128);
				this.method524(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.method524(var1, var2, 2);
				this.method524(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.method524(var1, var2, 8);
				this.method524(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.method524(var1, var2, 32);
				this.method524(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.method524(var1, var2, 1);
				this.method524(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.method524(var1, var2, 4);
				this.method524(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.method524(var1, var2, 16);
				this.method524(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.method524(var1, var2, 64);
				this.method524(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.method524(var1, var2, 130);
				this.method524(var1 - 1, var2, 8);
				this.method524(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.method524(var1, var2, 10);
				this.method524(var1, var2 + 1, 32);
				this.method524(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.method524(var1, var2, 40);
				this.method524(var1 + 1, var2, 128);
				this.method524(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.method524(var1, var2, 160);
				this.method524(var1, var2 - 1, 2);
				this.method524(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.method524(var1, var2, 65536);
					this.method524(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.method524(var1, var2, 1024);
					this.method524(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.method524(var1, var2, 4096);
					this.method524(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.method524(var1, var2, 16384);
					this.method524(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.method524(var1, var2, 512);
					this.method524(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.method524(var1, var2, 2048);
					this.method524(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.method524(var1, var2, 8192);
					this.method524(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.method524(var1, var2, 32768);
					this.method524(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.method524(var1, var2, 66560);
					this.method524(var1 - 1, var2, 4096);
					this.method524(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.method524(var1, var2, 5120);
					this.method524(var1, var2 + 1, 16384);
					this.method524(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.method524(var1, var2, 20480);
					this.method524(var1 + 1, var2, 65536);
					this.method524(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.method524(var1, var2, 81920);
					this.method524(var1, var2 - 1, 1024);
					this.method524(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfInfo(name = "ap", desc = "(IIIIIZI)V", opaqueValue = "-372066072")
	public void method527(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var8 = 256;
		if (var6) {
			var8 += 131072;
		}

		var1 -= this.field827;
		var2 -= this.field828;
		int var9;
		if (var5 == 1 || var5 == 3) {
			var9 = var3;
			var3 = var4;
			var4 = var9;
		}

		for (var9 = var1; var9 < var1 + var3; ++var9) {
			if (var9 >= 0 && var9 < this.field829) {
				for (int var10 = var2; var10 < var2 + var4; ++var10) {
					if (var10 >= 0 && var10 < this.field826) {
						this.method524(var9, var10, var8);
					}
				}
			}
		}

	}

	@ObfInfo(name = "aa", desc = "(IIII)V")
	void method524(int var1, int var2, int var3) {
		int[] var10000 = this.field830[var1];
		var10000[var2] &= ~var3;
	}

	@ObfInfo(name = "af", desc = "(III)V")
	public void method525(int var1, int var2) {
		var1 -= this.field827;
		var2 -= this.field828;
		int[] var10000 = this.field830[var1];
		var10000[var2] &= -262145;
	}

	@ObfInfo(name = "oo", desc = "(B)Lnf;")
	static class41 method528() {
		return class176.field1623;
	}
}
