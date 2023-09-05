import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.math.BigInteger;

@ObfInfo(name = "tm")
public class class280 extends class155 {
	@ObfInfo(name = "af", desc = "[I")
	public static int[] field2253;
	@ObfInfo(name = "aq", desc = "[J")
	static long[] field2255;
	@ObfInfo(name = "ap", desc = "[B")
	public byte[] field2252;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 1646688909)
	public int field2254;

	static {
		field2253 = new int[256];

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

			field2253[var1] = var0;
		}

		field2255 = new long[256];

		for (var2 = 0; var2 < 256; ++var2) {
			long var4 = (long)var2;

			for (int var3 = 0; var3 < 8; ++var3) {
				if ((var4 & 1L) == 1L) {
					var4 = var4 >>> 1 ^ -3932672073523589310L;
				} else {
					var4 >>>= 1;
				}
			}

			field2255[var2] = var4;
		}

	}

	@ObfInfo(name = "<init>", desc = "(I)V")
	public class280(int var1) {
		this.field2252 = class481.method2446(var1);
		this.field2254 = 0;
	}

	@ObfInfo(name = "<init>", desc = "(IZ)V")
	public class280(int var1, boolean var2) {
		this.field2252 = class481.method2444(var1, var2);
	}

	@ObfInfo(name = "<init>", desc = "([B)V")
	public class280(byte[] var1) {
		this.field2252 = var1;
		this.field2254 = 0;
	}

	@ObfInfo(name = "bb", desc = "(I)V", opaqueValue = "-59455686")
	public void method1480() {
		if (this.field2252 != null) {
			class481.method2448(this.field2252);
		}

		this.field2252 = null;
	}

	@ObfInfo(name = "br", desc = "(II)V")
	public void method1481(int var1) {
		this.field2252[++this.field2254 - 1] = (byte)var1;
	}

	@ObfInfo(name = "be", desc = "(II)V")
	public void method1522(int var1) {
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 8);
		this.field2252[++this.field2254 - 1] = (byte)var1;
	}

	@ObfInfo(name = "bi", desc = "(IB)V")
	public void method1533(int var1) {
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 16);
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 8);
		this.field2252[++this.field2254 - 1] = (byte)var1;
	}

	@ObfInfo(name = "bz", desc = "(II)V")
	public void method1547(int var1) {
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 24);
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 16);
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 8);
		this.field2252[++this.field2254 - 1] = (byte)var1;
	}

	@ObfInfo(name = "bx", desc = "(J)V")
	public void method1482(long var1) {
		this.field2252[++this.field2254 - 1] = (byte)((int)(var1 >> 40));
		this.field2252[++this.field2254 - 1] = (byte)((int)(var1 >> 32));
		this.field2252[++this.field2254 - 1] = (byte)((int)(var1 >> 24));
		this.field2252[++this.field2254 - 1] = (byte)((int)(var1 >> 16));
		this.field2252[++this.field2254 - 1] = (byte)((int)(var1 >> 8));
		this.field2252[++this.field2254 - 1] = (byte)((int)var1);
	}

	@ObfInfo(name = "bn", desc = "(J)V")
	public void method1518(long var1) {
		this.field2252[++this.field2254 - 1] = (byte)((int)(var1 >> 56));
		this.field2252[++this.field2254 - 1] = (byte)((int)(var1 >> 48));
		this.field2252[++this.field2254 - 1] = (byte)((int)(var1 >> 40));
		this.field2252[++this.field2254 - 1] = (byte)((int)(var1 >> 32));
		this.field2252[++this.field2254 - 1] = (byte)((int)(var1 >> 24));
		this.field2252[++this.field2254 - 1] = (byte)((int)(var1 >> 16));
		this.field2252[++this.field2254 - 1] = (byte)((int)(var1 >> 8));
		this.field2252[++this.field2254 - 1] = (byte)((int)var1);
	}

	@ObfInfo(name = "bw", desc = "(ZI)V", opaqueValue = "-466589059")
	public void method1483(boolean var1) {
		this.method1481(var1 ? 1 : 0);
	}

	@ObfInfo(name = "bg", desc = "(Ljava/lang/String;I)V", opaqueValue = "1525841096")
	public void method1484(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.field2254 += class244.method1268(var1, 0, var1.length(), this.field2252, this.field2254);
			this.field2252[++this.field2254 - 1] = 0;
		}
	}

	@ObfInfo(name = "cw", desc = "(Ljava/lang/String;I)V", opaqueValue = "2010597854")
	public void method1485(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.field2252[++this.field2254 - 1] = 0;
			this.field2254 += class244.method1268(var1, 0, var1.length(), this.field2252, this.field2254);
			this.field2252[++this.field2254 - 1] = 0;
		}
	}

	@ObfInfo(name = "cf", desc = "(Ljava/lang/CharSequence;I)V")
	public void method1478(CharSequence var1) {
		int var3 = class255.method1348(var1);
		this.field2252[++this.field2254 - 1] = 0;
		this.method1491(var3);
		this.field2254 += class255.method1349(this.field2252, this.field2254, var1);
	}

	@ObfInfo(name = "cm", desc = "([BIII)V", opaqueValue = "424288466")
	public void method1486(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var2 + var3; ++var5) {
			this.field2252[++this.field2254 - 1] = var1[var5];
		}

	}

	@ObfInfo(name = "cn", desc = "(Ltm;I)V")
	public void method1487(class280 var1) {
		this.method1486(var1.field2252, 0, var1.field2254);
	}

	@ObfInfo(name = "cs", desc = "(IB)V", opaqueValue = "1")
	public void method1488(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.field2252[this.field2254 - var1 - 4] = (byte)(var1 >> 24);
			this.field2252[this.field2254 - var1 - 3] = (byte)(var1 >> 16);
			this.field2252[this.field2254 - var1 - 2] = (byte)(var1 >> 8);
			this.field2252[this.field2254 - var1 - 1] = (byte)var1;
		}
	}

	@ObfInfo(name = "cx", desc = "(II)V", opaqueValue = "-44738618")
	public void method1489(int var1) {
		if (var1 >= 0 && var1 <= 65535) {
			this.field2252[this.field2254 - var1 - 2] = (byte)(var1 >> 8);
			this.field2252[this.field2254 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfInfo(name = "cr", desc = "(II)V", opaqueValue = "-1799868177")
	public void method1490(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.field2252[this.field2254 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfInfo(name = "cd", desc = "(IS)V", opaqueValue = "1025")
	public void method1536(int var1) {
		if (var1 >= 0 && var1 < 128) {
			this.method1481(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			this.method1522(var1 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfInfo(name = "ce", desc = "(IB)V", opaqueValue = "2")
	public void method1491(int var1) {
		if ((var1 & -128) != 0) {
			if ((var1 & -16384) != 0) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0) {
						this.method1481(var1 >>> 28 | 128);
					}

					this.method1481(var1 >>> 21 | 128);
				}

				this.method1481(var1 >>> 14 | 128);
			}

			this.method1481(var1 >>> 7 | 128);
		}

		this.method1481(var1 & 127);
	}

	@ObfInfo(name = "cq", desc = "(I)I")
	public int method1492() {
		return this.field2252[++this.field2254 - 1] & 255;
	}

	@ObfInfo(name = "cp", desc = "(I)B")
	public byte method1493() {
		return this.field2252[++this.field2254 - 1];
	}

	@ObfInfo(name = "cv", desc = "(B)I")
	public int method1541() {
		this.field2254 += 2;
		return (this.field2252[this.field2254 - 1] & 255) + ((this.field2252[this.field2254 - 2] & 255) << 8);
	}

	@ObfInfo(name = "co", desc = "(I)I", opaqueValue = "-641176235")
	public int method1494() {
		this.field2254 += 2;
		int var2 = (this.field2252[this.field2254 - 1] & 255) + ((this.field2252[this.field2254 - 2] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	@ObfInfo(name = "cl", desc = "(B)I")
	public int method1548() {
		this.field2254 += 3;
		return ((this.field2252[this.field2254 - 2] & 255) << 8) + ((this.field2252[this.field2254 - 3] & 255) << 16) + (this.field2252[this.field2254 - 1] & 255);
	}

	@ObfInfo(name = "cu", desc = "(I)I", opaqueValue = "618141055")
	public int method1538() {
		this.field2254 += 3;
		int var2 = (this.field2252[this.field2254 - 1] & 255) + ((this.field2252[this.field2254 - 2] & 255) << 8) + ((this.field2252[this.field2254 - 3] & 255) << 16);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	@ObfInfo(name = "ch", desc = "(I)I")
	public int method1496() {
		this.field2254 += 4;
		return ((this.field2252[this.field2254 - 3] & 255) << 16) + ((this.field2252[this.field2254 - 4] & 255) << 24) + ((this.field2252[this.field2254 - 2] & 255) << 8) + (this.field2252[this.field2254 - 1] & 255);
	}

	@ObfInfo(name = "ci", desc = "(I)J")
	public long method1497() {
		long var2 = (long)this.method1496() & 4294967295L;
		long var4 = (long)this.method1496() & 4294967295L;
		return var4 + (var2 << 32);
	}

	@ObfInfo(name = "ca", desc = "(B)F")
	public float method1498() {
		return Float.intBitsToFloat(this.method1496());
	}

	@ObfInfo(name = "cb", desc = "(B)Z", opaqueValue = "3")
	public boolean method1499() {
		return (this.method1492() & 1) == 1;
	}

	@ObfInfo(name = "cg", desc = "(I)Ljava/lang/String;", opaqueValue = "1848740572")
	public String method1551() {
		if (this.field2252[this.field2254] == 0) {
			++this.field2254;
			return null;
		} else {
			return this.method1500();
		}
	}

	@ObfInfo(name = "cj", desc = "(I)Ljava/lang/String;", opaqueValue = "-1006771627")
	public String method1500() {
		int var2 = this.field2254;

		while (this.field2252[++this.field2254 - 1] != 0) {
		}

		int var3 = this.field2254 - var2 - 1;
		return var3 == 0 ? "" : class244.method1269(this.field2252, var2, var3);
	}

	@ObfInfo(name = "cz", desc = "(I)Ljava/lang/String;", opaqueValue = "-413349723")
	public String method1542() {
		byte var2 = this.field2252[++this.field2254 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.field2254;

			while (this.field2252[++this.field2254 - 1] != 0) {
			}

			int var4 = this.field2254 - var3 - 1;
			return var4 == 0 ? "" : class244.method1269(this.field2252, var3, var4);
		}
	}

	@ObfInfo(name = "ct", desc = "(I)Ljava/lang/String;", opaqueValue = "-935649711")
	public String method1534() {
		byte var2 = this.field2252[++this.field2254 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.method1479();
			if (this.field2254 + var3 > this.field2252.length) {
				throw new IllegalStateException("");
			} else {
				byte[] var5 = this.field2252;
				int var6 = this.field2254;
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
				this.field2254 += var3;
				return var4;
			}
		}
	}

	@ObfInfo(name = "cy", desc = "([BIIB)V", opaqueValue = "2")
	public void method1502(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var3 + var2; ++var5) {
			var1[var5] = this.field2252[++this.field2254 - 1];
		}

	}

	@ObfInfo(name = "ck", desc = "(I)I", opaqueValue = "-2038004225")
	public int method1503() {
		int var2 = this.field2252[this.field2254] & 255;
		return var2 < 128 ? this.method1492() - 64 : this.method1541() - 49152;
	}

	@ObfInfo(name = "cc", desc = "(I)I", opaqueValue = "54197738")
	public int method1539() {
		int var2 = this.field2252[this.field2254] & 255;
		return var2 < 128 ? this.method1492() : this.method1541() - 32768;
	}

	@ObfInfo(name = "dh", desc = "(I)I", opaqueValue = "-1240529695")
	public int method1504() {
		int var2 = this.field2252[this.field2254] & 255;
		return var2 < 128 ? this.method1492() - 1 : this.method1541() - 32769;
	}

	@ObfInfo(name = "dj", desc = "(B)I", opaqueValue = "1")
	public int method1505() {
		int var2 = 0;

		int var3;
		for (var3 = this.method1539(); var3 == 32767; var3 = this.method1539()) {
			var2 += 32767;
		}

		var2 += var3;
		return var2;
	}

	@ObfInfo(name = "di", desc = "(I)I", opaqueValue = "776176450")
	public int method1506() {
		return this.field2252[this.field2254] < 0 ? this.method1496() & Integer.MAX_VALUE : this.method1541();
	}

	@ObfInfo(name = "du", desc = "(I)I", opaqueValue = "533056720")
	public int method1540() {
		if (this.field2252[this.field2254] < 0) {
			return this.method1496() & Integer.MAX_VALUE;
		} else {
			int var2 = this.method1541();
			return var2 == 32767 ? -1 : var2;
		}
	}

	@ObfInfo(name = "dn", desc = "(B)I", opaqueValue = "21")
	public int method1479() {
		byte var2 = this.field2252[++this.field2254 - 1];

		int var3;
		for (var3 = 0; var2 < 0; var2 = this.field2252[++this.field2254 - 1]) {
			var3 = (var3 | var2 & 127) << 7;
		}

		return var3 | var2;
	}

	@ObfInfo(name = "dg", desc = "(S)I", opaqueValue = "255")
	public int method1508() {
		int var3 = 0;
		int var4 = 0;

		int var2;
		do {
			var2 = this.method1492();
			var3 |= (var2 & 127) << var4;
			var4 += 7;
		} while(var2 > 127);

		return var3;
	}

	@ObfInfo(name = "dd", desc = "([IB)V", opaqueValue = "14")
	public void method1509(int[] var1) {
		int var3 = this.field2254 / 8;
		this.field2254 = 0;

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = this.method1496();
			int var6 = this.method1496();
			int var7 = 0;
			int var8 = -1640531527;

			for (int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3]) {
				var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
				var7 += var8;
			}

			this.field2254 -= 8;
			this.method1547(var5);
			this.method1547(var6);
		}

	}

	@ObfInfo(name = "da", desc = "([II)V", opaqueValue = "-964747071")
	public void method1553(int[] var1) {
		int var3 = this.field2254 / 8;
		this.field2254 = 0;

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = this.method1496();
			int var6 = this.method1496();
			int var7 = -957401312;
			int var8 = -1640531527;

			for (int var9 = 32; var9-- > 0; var5 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + var1[var7 & 3]) {
				var6 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var7 + var1[var7 >>> 11 & 3];
				var7 -= var8;
			}

			this.field2254 -= 8;
			this.method1547(var5);
			this.method1547(var6);
		}

	}

	@ObfInfo(name = "ds", desc = "([IIII)V", opaqueValue = "-1694110180")
	public void method1535(int[] var1, int var2, int var3) {
		int var5 = this.field2254;
		this.field2254 = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = this.method1496();
			int var9 = this.method1496();
			int var10 = 0;
			int var11 = -1640531527;

			for (int var12 = 32; var12-- > 0; var9 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10) {
				var8 += (var9 << 4 ^ var9 >>> 5) + var9 ^ var1[var10 & 3] + var10;
				var10 += var11;
			}

			this.field2254 -= 8;
			this.method1547(var8);
			this.method1547(var9);
		}

		this.field2254 = var5;
	}

	@ObfInfo(name = "dy", desc = "([IIIB)V", opaqueValue = "15")
	public void method1543(int[] var1, int var2, int var3) {
		int var5 = this.field2254;
		this.field2254 = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = this.method1496();
			int var9 = this.method1496();
			int var10 = -957401312;
			int var11 = -1640531527;

			for (int var12 = 32; var12-- > 0; var8 -= var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3]) {
				var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10;
				var10 -= var11;
			}

			this.field2254 -= 8;
			this.method1547(var8);
			this.method1547(var9);
		}

		this.field2254 = var5;
	}

	@ObfInfo(name = "dt", desc = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method1525(BigInteger var1, BigInteger var2) {
		int var4 = this.field2254;
		this.field2254 = 0;
		byte[] var5 = new byte[var4];
		this.method1502(var5, 0, var4);
		BigInteger var6 = new BigInteger(var5);
		BigInteger var7 = var6.modPow(var1, var2);
		byte[] var8 = var7.toByteArray();
		this.field2254 = 0;
		this.method1522(var8.length);
		this.method1486(var8, 0, var8.length);
	}

	@ObfInfo(name = "dl", desc = "(II)I", opaqueValue = "-1866799856")
	public int method1510(int var1) {
		byte[] var4 = this.field2252;
		int var5 = this.field2254;
		int var6 = -1;

		for (int var7 = var1; var7 < var5; ++var7) {
			var6 = var6 >>> 8 ^ field2253[(var6 ^ var4[var7]) & 255];
		}

		var6 = ~var6;
		this.method1547(var6);
		return var6;
	}

	@ObfInfo(name = "dk", desc = "(I)Z", opaqueValue = "-1217975210")
	public boolean method1511() {
		this.field2254 -= 4;
		byte[] var3 = this.field2252;
		int var4 = this.field2254;
		int var5 = -1;

		int var6;
		for (var6 = 0; var6 < var4; ++var6) {
			var5 = var5 >>> 8 ^ field2253[(var5 ^ var3[var6]) & 255];
		}

		var5 = ~var5;
		var6 = this.method1496();
		return var6 == var5;
	}

	@ObfInfo(name = "df", desc = "(II)V")
	public void method1512(int var1) {
		this.field2252[++this.field2254 - 1] = (byte)(var1 + 128);
	}

	@ObfInfo(name = "dz", desc = "(IB)V")
	public void method1554(int var1) {
		this.field2252[++this.field2254 - 1] = (byte)(0 - var1);
	}

	@ObfInfo(name = "dw", desc = "(II)V")
	public void method1528(int var1) {
		this.field2252[++this.field2254 - 1] = (byte)(128 - var1);
	}

	@ObfInfo(name = "dv", desc = "(I)I")
	public int method1513() {
		return this.field2252[++this.field2254 - 1] - 128 & 255;
	}

	@ObfInfo(name = "dr", desc = "(I)I")
	public int method1552() {
		return 0 - this.field2252[++this.field2254 - 1] & 255;
	}

	@ObfInfo(name = "do", desc = "(I)I")
	public int method1514() {
		return 128 - this.field2252[++this.field2254 - 1] & 255;
	}

	@ObfInfo(name = "db", desc = "(I)B")
	public byte method1507() {
		return (byte)(this.field2252[++this.field2254 - 1] - 128);
	}

	@ObfInfo(name = "dp", desc = "(B)B")
	public byte method1515() {
		return (byte)(0 - this.field2252[++this.field2254 - 1]);
	}

	@ObfInfo(name = "dm", desc = "(I)B")
	public byte method1516() {
		return (byte)(128 - this.field2252[++this.field2254 - 1]);
	}

	@ObfInfo(name = "dx", desc = "(II)V")
	public void method1550(int var1) {
		this.field2252[++this.field2254 - 1] = (byte)var1;
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 8);
	}

	@ObfInfo(name = "dq", desc = "(II)V")
	public void method1517(int var1) {
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 8);
		this.field2252[++this.field2254 - 1] = (byte)(var1 + 128);
	}

	@ObfInfo(name = "de", desc = "(II)V")
	public void method1544(int var1) {
		this.field2252[++this.field2254 - 1] = (byte)(var1 + 128);
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 8);
	}

	@ObfInfo(name = "dc", desc = "(I)I")
	public int method1519() {
		this.field2254 += 2;
		return (this.field2252[this.field2254 - 2] & 255) + ((this.field2252[this.field2254 - 1] & 255) << 8);
	}

	@ObfInfo(name = "ed", desc = "(I)I")
	public int method1520() {
		this.field2254 += 2;
		return (this.field2252[this.field2254 - 1] - 128 & 255) + ((this.field2252[this.field2254 - 2] & 255) << 8);
	}

	@ObfInfo(name = "eh", desc = "(B)I")
	public int method1521() {
		this.field2254 += 2;
		return (this.field2252[this.field2254 - 2] - 128 & 255) + ((this.field2252[this.field2254 - 1] & 255) << 8);
	}

	@ObfInfo(name = "ey", desc = "(I)I", opaqueValue = "-250054061")
	public int method1495() {
		this.field2254 += 2;
		int var2 = (this.field2252[this.field2254 - 2] & 255) + ((this.field2252[this.field2254 - 1] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	@ObfInfo(name = "ee", desc = "(I)I")
	public int method1523() {
		this.field2254 += 2;
		int var2 = (this.field2252[this.field2254 - 1] - 128 & 255) + ((this.field2252[this.field2254 - 2] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	@ObfInfo(name = "eq", desc = "(II)V")
	public void method1524(int var1) {
		this.field2252[++this.field2254 - 1] = (byte)var1;
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 8);
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 16);
	}

	@ObfInfo(name = "ej", desc = "(I)I")
	public int method1549() {
		this.field2254 += 3;
		return ((this.field2252[this.field2254 - 1] & 255) << 8) + ((this.field2252[this.field2254 - 3] & 255) << 16) + (this.field2252[this.field2254 - 2] & 255);
	}

	@ObfInfo(name = "ea", desc = "(B)I")
	public int method1545() {
		this.field2254 += 3;
		return ((this.field2252[this.field2254 - 3] & 255) << 8) + ((this.field2252[this.field2254 - 2] & 255) << 16) + (this.field2252[this.field2254 - 1] & 255);
	}

	@ObfInfo(name = "er", desc = "(B)I")
	public int method1526() {
		this.field2254 += 3;
		int var2 = ((this.field2252[this.field2254 - 1] & 255) << 16) + ((this.field2252[this.field2254 - 2] & 255) << 8) + (this.field2252[this.field2254 - 3] & 255);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	@ObfInfo(name = "ev", desc = "(B)I", opaqueValue = "9")
	public int method1527() {
		this.field2254 += 3;
		int var2 = ((this.field2252[this.field2254 - 3] & 255) << 16) + ((this.field2252[this.field2254 - 1] & 255) << 8) + (this.field2252[this.field2254 - 2] & 255);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	@ObfInfo(name = "ez", desc = "(II)V")
	public void method1501(int var1) {
		this.field2252[++this.field2254 - 1] = (byte)var1;
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 8);
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 16);
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 24);
	}

	@ObfInfo(name = "et", desc = "(IB)V")
	public void method1529(int var1) {
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 8);
		this.field2252[++this.field2254 - 1] = (byte)var1;
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 24);
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 16);
	}

	@ObfInfo(name = "en", desc = "(II)V")
	public void method1530(int var1) {
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 16);
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 24);
		this.field2252[++this.field2254 - 1] = (byte)var1;
		this.field2252[++this.field2254 - 1] = (byte)(var1 >> 8);
	}

	@ObfInfo(name = "eb", desc = "(B)I")
	public int method1537() {
		this.field2254 += 4;
		return (this.field2252[this.field2254 - 4] & 255) + ((this.field2252[this.field2254 - 2] & 255) << 16) + ((this.field2252[this.field2254 - 1] & 255) << 24) + ((this.field2252[this.field2254 - 3] & 255) << 8);
	}

	@ObfInfo(name = "ei", desc = "(I)I")
	public int method1531() {
		this.field2254 += 4;
		return (this.field2252[this.field2254 - 3] & 255) + ((this.field2252[this.field2254 - 1] & 255) << 16) + ((this.field2252[this.field2254 - 2] & 255) << 24) + ((this.field2252[this.field2254 - 4] & 255) << 8);
	}

	@ObfInfo(name = "es", desc = "(B)I")
	public int method1532() {
		this.field2254 += 4;
		return ((this.field2252[this.field2254 - 4] & 255) << 16) + ((this.field2252[this.field2254 - 3] & 255) << 24) + ((this.field2252[this.field2254 - 1] & 255) << 8) + (this.field2252[this.field2254 - 2] & 255);
	}

	@ObfInfo(name = "el", desc = "([BIII)V", opaqueValue = "1107296257")
	public void method1546(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var2 + var3; ++var5) {
			var1[var5] = (byte)(this.field2252[++this.field2254 - 1] - 128);
		}

	}

	@ObfInfo(name = "bc", desc = "(Ljava/lang/String;I)I")
	public static int method1555(String var0) {
		return var0.length() + 1;
	}
}
