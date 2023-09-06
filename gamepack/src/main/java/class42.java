import java.math.BigInteger;

public class class42 extends class462 {
	public static int[] field526;
	static long[] field528;
	public byte[] field525;
	public int field527;

	static {
		field526 = new int[256];

		int var2;
		for (int var1 = 0; var1 < 256; ++var1) {
			int var0 = var1;

			for (var2 = 0; var2 < 8; ++var2) {
				if ((var0 & 1) == 1) {
					var0 = var0 >>> 1 ^ -306674912;
				} else {
					var0 >>>= 1;
				}
			}

			field526[var1] = var0;
		}

		field528 = new long[256];

		for (var2 = 0; var2 < 256; ++var2) {
			long var4 = (long)var2;

			for (int var3 = 0; var3 < 8; ++var3) {
				if ((var4 & 1L) == 1L) {
					var4 = var4 >>> 1 ^ -3932672073523589310L;
				} else {
					var4 >>>= 1;
				}
			}

			field528[var2] = var4;
		}

	}

	public class42(int var1) {
		this.field525 = class98.method646(var1);
		this.field527 = 0;
	}

	public class42(int var1, boolean var2) {
		this.field525 = class312.method1748(var1, var2);
	}

	public class42(byte[] var1) {
		this.field525 = var1;
		this.field527 = 0;
	}

	public void method266() {
		if (this.field525 != null) {
			class397.method2074(this.field525);
		}

		this.field525 = null;
	}

	public void method267(int var1) {
		this.field525[++this.field527 - 1] = (byte)var1;
	}

	public void method308(int var1) {
		this.field525[++this.field527 - 1] = (byte)(var1 >> 8);
		this.field525[++this.field527 - 1] = (byte)var1;
	}

	public void method319(int var1) {
		this.field525[++this.field527 - 1] = (byte)(var1 >> 16);
		this.field525[++this.field527 - 1] = (byte)(var1 >> 8);
		this.field525[++this.field527 - 1] = (byte)var1;
	}

	public void method333(int var1) {
		this.field525[++this.field527 - 1] = (byte)(var1 >> 24);
		this.field525[++this.field527 - 1] = (byte)(var1 >> 16);
		this.field525[++this.field527 - 1] = (byte)(var1 >> 8);
		this.field525[++this.field527 - 1] = (byte)var1;
	}

	public void method268(long var1) {
		this.field525[++this.field527 - 1] = (byte)((int)(var1 >> 40));
		this.field525[++this.field527 - 1] = (byte)((int)(var1 >> 32));
		this.field525[++this.field527 - 1] = (byte)((int)(var1 >> 24));
		this.field525[++this.field527 - 1] = (byte)((int)(var1 >> 16));
		this.field525[++this.field527 - 1] = (byte)((int)(var1 >> 8));
		this.field525[++this.field527 - 1] = (byte)((int)var1);
	}

	public void method304(long var1) {
		this.field525[++this.field527 - 1] = (byte)((int)(var1 >> 56));
		this.field525[++this.field527 - 1] = (byte)((int)(var1 >> 48));
		this.field525[++this.field527 - 1] = (byte)((int)(var1 >> 40));
		this.field525[++this.field527 - 1] = (byte)((int)(var1 >> 32));
		this.field525[++this.field527 - 1] = (byte)((int)(var1 >> 24));
		this.field525[++this.field527 - 1] = (byte)((int)(var1 >> 16));
		this.field525[++this.field527 - 1] = (byte)((int)(var1 >> 8));
		this.field525[++this.field527 - 1] = (byte)((int)var1);
	}

	public void method269(boolean var1) {
		this.method267(var1 ? 1 : 0);
	}

	public void method270(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.field527 += class528.method2552(var1, 0, var1.length(), this.field525, this.field527);
			this.field525[++this.field527 - 1] = 0;
		}
	}

	public void method271(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.field525[++this.field527 - 1] = 0;
			this.field527 += class528.method2552(var1, 0, var1.length(), this.field525, this.field527);
			this.field525[++this.field527 - 1] = 0;
		}
	}

	public void method264(CharSequence var1) {
		int var3 = class67.method495(var1);
		this.field525[++this.field527 - 1] = 0;
		this.method277(var3);
		this.field527 += class400.method2080(this.field525, this.field527, var1);
	}

	public void method272(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var2 + var3; ++var5) {
			this.field525[++this.field527 - 1] = var1[var5];
		}

	}

	public void method273(class42 var1) {
		this.method272(var1.field525, 0, var1.field527);
	}

	public void method274(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.field525[this.field527 - var1 - 4] = (byte)(var1 >> 24);
			this.field525[this.field527 - var1 - 3] = (byte)(var1 >> 16);
			this.field525[this.field527 - var1 - 2] = (byte)(var1 >> 8);
			this.field525[this.field527 - var1 - 1] = (byte)var1;
		}
	}

	public void method275(int var1) {
		if (var1 >= 0 && var1 <= 65535) {
			this.field525[this.field527 - var1 - 2] = (byte)(var1 >> 8);
			this.field525[this.field527 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method276(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.field525[this.field527 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method322(int var1) {
		if (var1 >= 0 && var1 < 128) {
			this.method267(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			this.method308(var1 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method277(int var1) {
		if ((var1 & -128) != 0) {
			if ((var1 & -16384) != 0) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0) {
						this.method267(var1 >>> 28 | 128);
					}

					this.method267(var1 >>> 21 | 128);
				}

				this.method267(var1 >>> 14 | 128);
			}

			this.method267(var1 >>> 7 | 128);
		}

		this.method267(var1 & 127);
	}

	public int method278() {
		return this.field525[++this.field527 - 1] & 255;
	}

	public byte method279() {
		return this.field525[++this.field527 - 1];
	}

	public int method327() {
		this.field527 += 2;
		return (this.field525[this.field527 - 1] & 255) + ((this.field525[this.field527 - 2] & 255) << 8);
	}

	public int method280() {
		this.field527 += 2;
		int var2 = (this.field525[this.field527 - 1] & 255) + ((this.field525[this.field527 - 2] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int method334() {
		this.field527 += 3;
		return ((this.field525[this.field527 - 2] & 255) << 8) + ((this.field525[this.field527 - 3] & 255) << 16) + (this.field525[this.field527 - 1] & 255);
	}

	public int method324() {
		this.field527 += 3;
		int var2 = (this.field525[this.field527 - 1] & 255) + ((this.field525[this.field527 - 2] & 255) << 8) + ((this.field525[this.field527 - 3] & 255) << 16);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	public int method282() {
		this.field527 += 4;
		return ((this.field525[this.field527 - 3] & 255) << 16) + ((this.field525[this.field527 - 4] & 255) << 24) + ((this.field525[this.field527 - 2] & 255) << 8) + (this.field525[this.field527 - 1] & 255);
	}

	public long method283() {
		long var2 = (long)this.method282() & 4294967295L;
		long var4 = (long)this.method282() & 4294967295L;
		return var4 + (var2 << 32);
	}

	public float method284() {
		return Float.intBitsToFloat(this.method282());
	}

	public boolean method285() {
		return (this.method278() & 1) == 1;
	}

	public String method337() {
		if (this.field525[this.field527] == 0) {
			++this.field527;
			return null;
		} else {
			return this.method286();
		}
	}

	public String method286() {
		int var2 = this.field527;

		while (this.field525[++this.field527 - 1] != 0) {
		}

		int var3 = this.field527 - var2 - 1;
		return var3 == 0 ? "" : class313.method1750(this.field525, var2, var3);
	}

	public String method328() {
		byte var2 = this.field525[++this.field527 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.field527;

			while (this.field525[++this.field527 - 1] != 0) {
			}

			int var4 = this.field527 - var3 - 1;
			return var4 == 0 ? "" : class313.method1750(this.field525, var3, var4);
		}
	}

	public String method320() {
		byte var2 = this.field525[++this.field527 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.method265();
			if (this.field527 + var3 > this.field525.length) {
				throw new IllegalStateException("");
			} else {
				byte[] var5 = this.field525;
				int var6 = this.field527;
				char[] var7 = new char[var3];
				int var8 = 0;
				int var9 = var6;

				int var12;
				for (int var10 = var3 + var6; var9 < var10; var7[var8++] = (char)var12) {
					int var11 = var5[var9++] & 255;
					if (var11 < 128) {
						if (var11 == 0) {
							var12 = 65533;
						} else {
							var12 = var11;
						}
					} else if (var11 < 192) {
						var12 = 65533;
					} else if (var11 < 224) {
						if (var9 < var10 && (var5[var9] & 192) == 128) {
							var12 = (var11 & 31) << 6 | var5[var9++] & 63;
							if (var12 < 128) {
								var12 = 65533;
							}
						} else {
							var12 = 65533;
						}
					} else if (var11 < 240) {
						if (var9 + 1 < var10 && (var5[var9] & 192) == 128 && (var5[var9 + 1] & 192) == 128) {
							var12 = (var11 & 15) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
							if (var12 < 2048) {
								var12 = 65533;
							}
						} else {
							var12 = 65533;
						}
					} else if (var11 < 248) {
						if (var9 + 2 < var10 && (var5[var9] & 192) == 128 && (var5[var9 + 1] & 192) == 128 && (var5[var9 + 2] & 192) == 128) {
							var12 = (var11 & 7) << 18 | (var5[var9++] & 63) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
							if (var12 >= 65536 && var12 <= 1114111) {
								var12 = 65533;
							} else {
								var12 = 65533;
							}
						} else {
							var12 = 65533;
						}
					} else {
						var12 = 65533;
					}
				}

				String var4 = new String(var7, 0, var8);
				this.field527 += var3;
				return var4;
			}
		}
	}

	public void method288(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var3 + var2; ++var5) {
			var1[var5] = this.field525[++this.field527 - 1];
		}

	}

	public int method289() {
		int var2 = this.field525[this.field527] & 255;
		return var2 < 128 ? this.method278() - 64 : this.method327() - 49152;
	}

	public int method325() {
		int var2 = this.field525[this.field527] & 255;
		return var2 < 128 ? this.method278() : this.method327() - 32768;
	}

	public int method290() {
		int var2 = this.field525[this.field527] & 255;
		return var2 < 128 ? this.method278() - 1 : this.method327() - 32769;
	}

	public int method291() {
		int var2 = 0;

		int var3;
		for (var3 = this.method325(); var3 == 32767; var3 = this.method325()) {
			var2 += 32767;
		}

		var2 += var3;
		return var2;
	}

	public int method292() {
		return this.field525[this.field527] < 0 ? this.method282() & Integer.MAX_VALUE : this.method327();
	}

	public int method326() {
		if (this.field525[this.field527] < 0) {
			return this.method282() & Integer.MAX_VALUE;
		} else {
			int var2 = this.method327();
			return var2 == 32767 ? -1 : var2;
		}
	}

	public int method265() {
		byte var2 = this.field525[++this.field527 - 1];

		int var3;
		for (var3 = 0; var2 < 0; var2 = this.field525[++this.field527 - 1]) {
			var3 = (var3 | var2 & 127) << 7;
		}

		return var3 | var2;
	}

	public int method294() {
		int var3 = 0;
		int var4 = 0;

		int var2;
		do {
			var2 = this.method278();
			var3 |= (var2 & 127) << var4;
			var4 += 7;
		} while(var2 > 127);

		return var3;
	}

	public void method295(int[] var1) {
		int var3 = this.field527 / 8;
		this.field527 = 0;

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = this.method282();
			int var6 = this.method282();
			int var7 = 0;
			int var8 = -1640531527;

			for (int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3]) {
				var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
				var7 += var8;
			}

			this.field527 -= 8;
			this.method333(var5);
			this.method333(var6);
		}

	}

	public void method339(int[] var1) {
		int var3 = this.field527 / 8;
		this.field527 = 0;

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = this.method282();
			int var6 = this.method282();
			int var7 = -957401312;
			int var8 = -1640531527;

			for (int var9 = 32; var9-- > 0; var5 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + var1[var7 & 3]) {
				var6 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var7 + var1[var7 >>> 11 & 3];
				var7 -= var8;
			}

			this.field527 -= 8;
			this.method333(var5);
			this.method333(var6);
		}

	}

	public void method321(int[] var1, int var2, int var3) {
		int var5 = this.field527;
		this.field527 = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = this.method282();
			int var9 = this.method282();
			int var10 = 0;
			int var11 = -1640531527;

			for (int var12 = 32; var12-- > 0; var9 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10) {
				var8 += (var9 << 4 ^ var9 >>> 5) + var9 ^ var1[var10 & 3] + var10;
				var10 += var11;
			}

			this.field527 -= 8;
			this.method333(var8);
			this.method333(var9);
		}

		this.field527 = var5;
	}

	public void method329(int[] var1, int var2, int var3) {
		int var5 = this.field527;
		this.field527 = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = this.method282();
			int var9 = this.method282();
			int var10 = -957401312;
			int var11 = -1640531527;

			for (int var12 = 32; var12-- > 0; var8 -= var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3]) {
				var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10;
				var10 -= var11;
			}

			this.field527 -= 8;
			this.method333(var8);
			this.method333(var9);
		}

		this.field527 = var5;
	}

	public void method311(BigInteger var1, BigInteger var2) {
		int var4 = this.field527;
		this.field527 = 0;
		byte[] var5 = new byte[var4];
		this.method288(var5, 0, var4);
		BigInteger var6 = new BigInteger(var5);
		BigInteger var7 = var6.modPow(var1, var2);
		byte[] var8 = var7.toByteArray();
		this.field527 = 0;
		this.method308(var8.length);
		this.method272(var8, 0, var8.length);
	}

	public int method296(int var1) {
		byte[] var4 = this.field525;
		int var5 = this.field527;
		int var6 = -1;

		for (int var7 = var1; var7 < var5; ++var7) {
			var6 = var6 >>> 8 ^ field526[(var6 ^ var4[var7]) & 255];
		}

		var6 = ~var6;
		this.method333(var6);
		return var6;
	}

	public boolean method297() {
		this.field527 -= 4;
		byte[] var3 = this.field525;
		int var4 = this.field527;
		int var5 = -1;

		int var6;
		for (var6 = 0; var6 < var4; ++var6) {
			var5 = var5 >>> 8 ^ field526[(var5 ^ var3[var6]) & 255];
		}

		var5 = ~var5;
		var6 = this.method282();
		return var6 == var5;
	}

	public void method298(int var1) {
		this.field525[++this.field527 - 1] = (byte)(var1 + 128);
	}

	public void method340(int var1) {
		this.field525[++this.field527 - 1] = (byte)(0 - var1);
	}

	public void method314(int var1) {
		this.field525[++this.field527 - 1] = (byte)(128 - var1);
	}

	public int method299() {
		return this.field525[++this.field527 - 1] - 128 & 255;
	}

	public int method338() {
		return 0 - this.field525[++this.field527 - 1] & 255;
	}

	public int method300() {
		return 128 - this.field525[++this.field527 - 1] & 255;
	}

	public byte method293() {
		return (byte)(this.field525[++this.field527 - 1] - 128);
	}

	public byte method301() {
		return (byte)(0 - this.field525[++this.field527 - 1]);
	}

	public byte method302() {
		return (byte)(128 - this.field525[++this.field527 - 1]);
	}

	public void method336(int var1) {
		this.field525[++this.field527 - 1] = (byte)var1;
		this.field525[++this.field527 - 1] = (byte)(var1 >> 8);
	}

	public void method303(int var1) {
		this.field525[++this.field527 - 1] = (byte)(var1 >> 8);
		this.field525[++this.field527 - 1] = (byte)(var1 + 128);
	}

	public void method330(int var1) {
		this.field525[++this.field527 - 1] = (byte)(var1 + 128);
		this.field525[++this.field527 - 1] = (byte)(var1 >> 8);
	}

	public int method305() {
		this.field527 += 2;
		return (this.field525[this.field527 - 2] & 255) + ((this.field525[this.field527 - 1] & 255) << 8);
	}

	public int method306() {
		this.field527 += 2;
		return (this.field525[this.field527 - 1] - 128 & 255) + ((this.field525[this.field527 - 2] & 255) << 8);
	}

	public int method307() {
		this.field527 += 2;
		return (this.field525[this.field527 - 2] - 128 & 255) + ((this.field525[this.field527 - 1] & 255) << 8);
	}

	public int method281() {
		this.field527 += 2;
		int var2 = (this.field525[this.field527 - 2] & 255) + ((this.field525[this.field527 - 1] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int method309() {
		this.field527 += 2;
		int var2 = (this.field525[this.field527 - 1] - 128 & 255) + ((this.field525[this.field527 - 2] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public void method310(int var1) {
		this.field525[++this.field527 - 1] = (byte)var1;
		this.field525[++this.field527 - 1] = (byte)(var1 >> 8);
		this.field525[++this.field527 - 1] = (byte)(var1 >> 16);
	}

	public int method335() {
		this.field527 += 3;
		return ((this.field525[this.field527 - 1] & 255) << 8) + ((this.field525[this.field527 - 3] & 255) << 16) + (this.field525[this.field527 - 2] & 255);
	}

	public int method331() {
		this.field527 += 3;
		return ((this.field525[this.field527 - 3] & 255) << 8) + ((this.field525[this.field527 - 2] & 255) << 16) + (this.field525[this.field527 - 1] & 255);
	}

	public int method312() {
		this.field527 += 3;
		int var2 = ((this.field525[this.field527 - 1] & 255) << 16) + ((this.field525[this.field527 - 2] & 255) << 8) + (this.field525[this.field527 - 3] & 255);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	public int method313() {
		this.field527 += 3;
		int var2 = ((this.field525[this.field527 - 3] & 255) << 16) + ((this.field525[this.field527 - 1] & 255) << 8) + (this.field525[this.field527 - 2] & 255);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	public void method287(int var1) {
		this.field525[++this.field527 - 1] = (byte)var1;
		this.field525[++this.field527 - 1] = (byte)(var1 >> 8);
		this.field525[++this.field527 - 1] = (byte)(var1 >> 16);
		this.field525[++this.field527 - 1] = (byte)(var1 >> 24);
	}

	public void method315(int var1) {
		this.field525[++this.field527 - 1] = (byte)(var1 >> 8);
		this.field525[++this.field527 - 1] = (byte)var1;
		this.field525[++this.field527 - 1] = (byte)(var1 >> 24);
		this.field525[++this.field527 - 1] = (byte)(var1 >> 16);
	}

	public void method316(int var1) {
		this.field525[++this.field527 - 1] = (byte)(var1 >> 16);
		this.field525[++this.field527 - 1] = (byte)(var1 >> 24);
		this.field525[++this.field527 - 1] = (byte)var1;
		this.field525[++this.field527 - 1] = (byte)(var1 >> 8);
	}

	public int method323() {
		this.field527 += 4;
		return (this.field525[this.field527 - 4] & 255) + ((this.field525[this.field527 - 2] & 255) << 16) + ((this.field525[this.field527 - 1] & 255) << 24) + ((this.field525[this.field527 - 3] & 255) << 8);
	}

	public int method317() {
		this.field527 += 4;
		return (this.field525[this.field527 - 3] & 255) + ((this.field525[this.field527 - 1] & 255) << 16) + ((this.field525[this.field527 - 2] & 255) << 24) + ((this.field525[this.field527 - 4] & 255) << 8);
	}

	public int method318() {
		this.field527 += 4;
		return ((this.field525[this.field527 - 4] & 255) << 16) + ((this.field525[this.field527 - 3] & 255) << 24) + ((this.field525[this.field527 - 1] & 255) << 8) + (this.field525[this.field527 - 2] & 255);
	}

	public void method332(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var2 + var3; ++var5) {
			var1[var5] = (byte)(this.field525[++this.field527 - 1] - 128);
		}

	}
}
