import java.math.BigInteger;

public class class187 extends class77 {

	public static int[] field1831;

	static long[] field1833;

	public byte[] field1830;

	public int field1832;

	static {
		field1831 = new int[256];
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
			field1831[var1] = var0;
		}
		field1833 = new long[256];
		for (var2 = 0; var2 < 256; ++var2) {
			long var4 = (long) var2;
			for (int var3 = 0; var3 < 8; ++var3) {
				if ((var4 & 1L) == 1L) {
					var4 = var4 >>> 1 ^ -3932672073523589310L;
				} else {
					var4 >>>= 1;
				}
			}
			field1833[var2] = var4;
		}
	}

	public class187(int var1) {
		this.field1830 = class248.method1433(var1);
		this.field1832 = 0;
	}

	public class187(int var1, boolean var2) {
		this.field1830 = class248.method1431(var1, var2);
	}

	public class187(byte[] var1) {
		this.field1830 = var1;
		this.field1832 = 0;
	}

	public void method1084() {
		if (this.field1830 != null) {
			class248.method1435(this.field1830);
		}
		this.field1830 = null;
	}

	public void method1085(int var1) {
		this.field1830[++this.field1832 - 1] = (byte) var1;
	}

	public void method1126(int var1) {
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 8);
		this.field1830[++this.field1832 - 1] = (byte) var1;
	}

	public void method1137(int var1) {
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 16);
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 8);
		this.field1830[++this.field1832 - 1] = (byte) var1;
	}

	public void method1151(int var1) {
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 24);
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 16);
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 8);
		this.field1830[++this.field1832 - 1] = (byte) var1;
	}

	public void method1086(long var1) {
		this.field1830[++this.field1832 - 1] = (byte) (int) (var1 >> 40);
		this.field1830[++this.field1832 - 1] = (byte) (int) (var1 >> 32);
		this.field1830[++this.field1832 - 1] = (byte) (int) (var1 >> 24);
		this.field1830[++this.field1832 - 1] = (byte) (int) (var1 >> 16);
		this.field1830[++this.field1832 - 1] = (byte) (int) (var1 >> 8);
		this.field1830[++this.field1832 - 1] = (byte) (int) var1;
	}

	public void method1122(long var1) {
		this.field1830[++this.field1832 - 1] = (byte) (int) (var1 >> 56);
		this.field1830[++this.field1832 - 1] = (byte) (int) (var1 >> 48);
		this.field1830[++this.field1832 - 1] = (byte) (int) (var1 >> 40);
		this.field1830[++this.field1832 - 1] = (byte) (int) (var1 >> 32);
		this.field1830[++this.field1832 - 1] = (byte) (int) (var1 >> 24);
		this.field1830[++this.field1832 - 1] = (byte) (int) (var1 >> 16);
		this.field1830[++this.field1832 - 1] = (byte) (int) (var1 >> 8);
		this.field1830[++this.field1832 - 1] = (byte) (int) var1;
	}

	public void method1087(boolean var1) {
		this.method1085(var1 ? 1 : 0);
	}

	public void method1088(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.field1832 += class111.method672(var1, 0, var1.length(), this.field1830, this.field1832);
			this.field1830[++this.field1832 - 1] = 0;
		}
	}

	public void method1089(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.field1830[++this.field1832 - 1] = 0;
			this.field1832 += class111.method672(var1, 0, var1.length(), this.field1830, this.field1832);
			this.field1830[++this.field1832 - 1] = 0;
		}
	}

	public void method1082(CharSequence var1) {
		int var3 = class36.method159(var1);
		this.field1830[++this.field1832 - 1] = 0;
		this.method1095(var3);
		this.field1832 += class36.method160(this.field1830, this.field1832, var1);
	}

	public void method1090(byte[] var1, int var2, int var3) {
		for (int var5 = 0; var5 < 0 + var3; ++var5) {
			this.field1830[++this.field1832 - 1] = var1[var5];
		}
	}

	public void method1091(class187 var1) {
		this.method1090(var1.field1830, 0, var1.field1832);
	}

	public void method1092(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.field1830[this.field1832 - var1 - 4] = (byte) (var1 >> 24);
			this.field1830[this.field1832 - var1 - 3] = (byte) (var1 >> 16);
			this.field1830[this.field1832 - var1 - 2] = (byte) (var1 >> 8);
			this.field1830[this.field1832 - var1 - 1] = (byte) var1;
		}
	}

	public void method1093(int var1) {
		if (var1 >= 0 && var1 <= 65535) {
			this.field1830[this.field1832 - var1 - 2] = (byte) (var1 >> 8);
			this.field1830[this.field1832 - var1 - 1] = (byte) var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method1094(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.field1830[this.field1832 - var1 - 1] = (byte) var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method1140(int var1) {
		if (var1 >= 0 && var1 < 128) {
			this.method1085(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			this.method1126(var1 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method1095(int var1) {
		if ((var1 & -128) != 0) {
			if ((var1 & -16384) != 0) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0) {
						this.method1085(var1 >>> 28 | 128);
					}
					this.method1085(var1 >>> 21 | 128);
				}
				this.method1085(var1 >>> 14 | 128);
			}
			this.method1085(var1 >>> 7 | 128);
		}
		this.method1085(var1 & 127);
	}

	public int method1096() {
		return this.field1830[++this.field1832 - 1] & 255;
	}

	public byte method1097() {
		return this.field1830[++this.field1832 - 1];
	}

	public int method1145() {
		this.field1832 += 2;
		return (this.field1830[this.field1832 - 1] & 255) + ((this.field1830[this.field1832 - 2] & 255) << 8);
	}

	public int method1098() {
		this.field1832 += 2;
		int var2 = (this.field1830[this.field1832 - 1] & 255) + ((this.field1830[this.field1832 - 2] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}
		return var2;
	}

	public int method1152() {
		this.field1832 += 3;
		return ((this.field1830[this.field1832 - 2] & 255) << 8) + ((this.field1830[this.field1832 - 3] & 255) << 16) + (this.field1830[this.field1832 - 1] & 255);
	}

	public int method1142() {
		this.field1832 += 3;
		int var2 = (this.field1830[this.field1832 - 1] & 255) + ((this.field1830[this.field1832 - 2] & 255) << 8) + ((this.field1830[this.field1832 - 3] & 255) << 16);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}
		return var2;
	}

	public int method1100() {
		this.field1832 += 4;
		return ((this.field1830[this.field1832 - 3] & 255) << 16) + ((this.field1830[this.field1832 - 4] & 255) << 24) + ((this.field1830[this.field1832 - 2] & 255) << 8) + (this.field1830[this.field1832 - 1] & 255);
	}

	public long method1101() {
		long var2 = (long) this.method1100() & 4294967295L;
		long var4 = (long) this.method1100() & 4294967295L;
		return var4 + (var2 << 32);
	}

	public float method1102() {
		return Float.intBitsToFloat(this.method1100());
	}

	public boolean method1103() {
		return (this.method1096() & 1) == 1;
	}

	public String method1155() {
		if (this.field1830[this.field1832] == 0) {
			++this.field1832;
			return null;
		} else {
			return this.method1104();
		}
	}

	public String method1104() {
		int var2 = this.field1832;
		while (this.field1830[++this.field1832 - 1] != 0) {
		}
		int var3 = this.field1832 - var2 - 1;
		return var3 == 0 ? "" : class111.method673(this.field1830, var2, var3);
	}

	public String method1146() {
		byte var2 = this.field1830[++this.field1832 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.field1832;
			while (this.field1830[++this.field1832 - 1] != 0) {
			}
			int var4 = this.field1832 - var3 - 1;
			return var4 == 0 ? "" : class111.method673(this.field1830, var3, var4);
		}
	}

	public String method1138() {
		byte var2 = this.field1830[++this.field1832 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.method1083();
			if (this.field1832 + var3 > this.field1830.length) {
				throw new IllegalStateException("");
			} else {
				byte[] var5 = this.field1830;
				int var6 = this.field1832;
				char[] var7 = new char[var3];
				int var8 = 0;
				int var9 = var6;
				int var12;
				for (int var10 = var3 + var6; var9 < var10; var7[var8++] = (char) var12) {
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
				this.field1832 += var3;
				return var4;
			}
		}
	}

	public void method1106(byte[] var1, int var2, int var3) {
		for (int var5 = 0; var5 < var3 + 0; ++var5) {
			var1[var5] = this.field1830[++this.field1832 - 1];
		}
	}

	public int method1107() {
		int var2 = this.field1830[this.field1832] & 255;
		return var2 < 128 ? this.method1096() - 64 : this.method1145() - 49152;
	}

	public int method1143() {
		int var2 = this.field1830[this.field1832] & 255;
		return var2 < 128 ? this.method1096() : this.method1145() - 32768;
	}

	public int method1108() {
		int var2 = this.field1830[this.field1832] & 255;
		return var2 < 128 ? this.method1096() - 1 : this.method1145() - 32769;
	}

	public int method1109() {
		int var2 = 0;
		int var3;
		for (var3 = this.method1143(); var3 == 32767; var3 = this.method1143()) {
			var2 += 32767;
		}
		var2 += var3;
		return var2;
	}

	public int method1110() {
		return this.field1830[this.field1832] < 0 ? this.method1100() & Integer.MAX_VALUE : this.method1145();
	}

	public int method1144() {
		if (this.field1830[this.field1832] < 0) {
			return this.method1100() & Integer.MAX_VALUE;
		} else {
			int var2 = this.method1145();
			return var2 == 32767 ? -1 : var2;
		}
	}

	public int method1083() {
		byte var2 = this.field1830[++this.field1832 - 1];
		int var3;
		for (var3 = 0; var2 < 0; var2 = this.field1830[++this.field1832 - 1]) {
			var3 = (var3 | var2 & 127) << 7;
		}
		return var3 | var2;
	}

	public int method1112() {
		int var3 = 0;
		int var4 = 0;
		int var2;
		do {
			var2 = this.method1096();
			var3 |= (var2 & 127) << var4;
			var4 += 7;
		} while (var2 > 127);
		return var3;
	}

	public void method1113(int[] var1) {
		int var3 = this.field1832 / 8;
		this.field1832 = 0;
		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = this.method1100();
			int var6 = this.method1100();
			int var7 = 0;
			int var8 = -1640531527;
			for (int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3]) {
				var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
				var7 += -1640531527;
			}
			this.field1832 -= 8;
			this.method1151(var5);
			this.method1151(var6);
		}
	}

	public void method1157(int[] var1) {
		int var3 = this.field1832 / 8;
		this.field1832 = 0;
		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = this.method1100();
			int var6 = this.method1100();
			int var7 = -957401312;
			int var8 = -1640531527;
			for (int var9 = 32; var9-- > 0; var5 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + var1[var7 & 3]) {
				var6 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var7 + var1[var7 >>> 11 & 3];
				var7 -= -1640531527;
			}
			this.field1832 -= 8;
			this.method1151(var5);
			this.method1151(var6);
		}
	}

	public void method1139(int[] var1, int var2, int var3) {
		int var5 = this.field1832;
		this.field1832 = var2;
		int var6 = (var3 - var2) / 8;
		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = this.method1100();
			int var9 = this.method1100();
			int var10 = 0;
			int var11 = -1640531527;
			for (int var12 = 32; var12-- > 0; var9 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10) {
				var8 += (var9 << 4 ^ var9 >>> 5) + var9 ^ var1[var10 & 3] + var10;
				var10 += -1640531527;
			}
			this.field1832 -= 8;
			this.method1151(var8);
			this.method1151(var9);
		}
		this.field1832 = var5;
	}

	public void method1147(int[] var1, int var2, int var3) {
		int var5 = this.field1832;
		this.field1832 = 5;
		int var6 = (var3 - 5) / 8;
		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = this.method1100();
			int var9 = this.method1100();
			int var10 = -957401312;
			int var11 = -1640531527;
			for (int var12 = 32; var12-- > 0; var8 -= var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3]) {
				var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10;
				var10 -= -1640531527;
			}
			this.field1832 -= 8;
			this.method1151(var8);
			this.method1151(var9);
		}
		this.field1832 = var5;
	}

	public void method1129(BigInteger var1, BigInteger var2) {
		int var4 = this.field1832;
		this.field1832 = 0;
		byte[] var5 = new byte[var4];
		this.method1106(var5, 0, var4);
		BigInteger var6 = new BigInteger(var5);
		BigInteger var7 = var6.modPow(var1, var2);
		byte[] var8 = var7.toByteArray();
		this.field1832 = 0;
		this.method1126(var8.length);
		this.method1090(var8, 0, var8.length);
	}

	public int method1114(int var1) {
		byte[] var4 = this.field1830;
		int var5 = this.field1832;
		int var6 = -1;
		for (int var7 = var1; var7 < var5; ++var7) {
			var6 = var6 >>> 8 ^ field1831[(var6 ^ var4[var7]) & 255];
		}
		var6 = ~var6;
		this.method1151(var6);
		return var6;
	}

	public boolean method1115() {
		this.field1832 -= 4;
		byte[] var3 = this.field1830;
		int var4 = this.field1832;
		int var5 = -1;
		int var6;
		for (var6 = 0; var6 < var4; ++var6) {
			var5 = var5 >>> 8 ^ field1831[(var5 ^ var3[var6]) & 255];
		}
		var5 = ~var5;
		var6 = this.method1100();
		return var6 == var5;
	}

	public void method1116(int var1) {
		this.field1830[++this.field1832 - 1] = (byte) (var1 + 128);
	}

	public void method1158(int var1) {
		this.field1830[++this.field1832 - 1] = (byte) (0 - var1);
	}

	public void method1132(int var1) {
		this.field1830[++this.field1832 - 1] = (byte) (128 - var1);
	}

	public int method1117() {
		return this.field1830[++this.field1832 - 1] - 128 & 255;
	}

	public int method1156() {
		return 0 - this.field1830[++this.field1832 - 1] & 255;
	}

	public int method1118() {
		return 128 - this.field1830[++this.field1832 - 1] & 255;
	}

	public byte method1111() {
		return (byte) (this.field1830[++this.field1832 - 1] - 128);
	}

	public byte method1119() {
		return (byte) (0 - this.field1830[++this.field1832 - 1]);
	}

	public byte method1120() {
		return (byte) (128 - this.field1830[++this.field1832 - 1]);
	}

	public void method1154(int var1) {
		this.field1830[++this.field1832 - 1] = (byte) var1;
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 8);
	}

	public void method1121(int var1) {
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 8);
		this.field1830[++this.field1832 - 1] = (byte) (var1 + 128);
	}

	public void method1148(int var1) {
		this.field1830[++this.field1832 - 1] = (byte) (var1 + 128);
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 8);
	}

	public int method1123() {
		this.field1832 += 2;
		return (this.field1830[this.field1832 - 2] & 255) + ((this.field1830[this.field1832 - 1] & 255) << 8);
	}

	public int method1124() {
		this.field1832 += 2;
		return (this.field1830[this.field1832 - 1] - 128 & 255) + ((this.field1830[this.field1832 - 2] & 255) << 8);
	}

	public int method1125() {
		this.field1832 += 2;
		return (this.field1830[this.field1832 - 2] - 128 & 255) + ((this.field1830[this.field1832 - 1] & 255) << 8);
	}

	public int method1099() {
		this.field1832 += 2;
		int var2 = (this.field1830[this.field1832 - 2] & 255) + ((this.field1830[this.field1832 - 1] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}
		return var2;
	}

	public int method1127() {
		this.field1832 += 2;
		int var2 = (this.field1830[this.field1832 - 1] - 128 & 255) + ((this.field1830[this.field1832 - 2] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}
		return var2;
	}

	public void method1128(int var1) {
		this.field1830[++this.field1832 - 1] = (byte) var1;
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 8);
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 16);
	}

	public int method1153() {
		this.field1832 += 3;
		return ((this.field1830[this.field1832 - 1] & 255) << 8) + ((this.field1830[this.field1832 - 3] & 255) << 16) + (this.field1830[this.field1832 - 2] & 255);
	}

	public int method1149() {
		this.field1832 += 3;
		return ((this.field1830[this.field1832 - 3] & 255) << 8) + ((this.field1830[this.field1832 - 2] & 255) << 16) + (this.field1830[this.field1832 - 1] & 255);
	}

	public int method1130() {
		this.field1832 += 3;
		int var2 = ((this.field1830[this.field1832 - 1] & 255) << 16) + ((this.field1830[this.field1832 - 2] & 255) << 8) + (this.field1830[this.field1832 - 3] & 255);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}
		return var2;
	}

	public int method1131() {
		this.field1832 += 3;
		int var2 = ((this.field1830[this.field1832 - 3] & 255) << 16) + ((this.field1830[this.field1832 - 1] & 255) << 8) + (this.field1830[this.field1832 - 2] & 255);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}
		return var2;
	}

	public void method1105(int var1) {
		this.field1830[++this.field1832 - 1] = (byte) var1;
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 8);
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 16);
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 24);
	}

	public void method1133(int var1) {
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 8);
		this.field1830[++this.field1832 - 1] = (byte) var1;
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 24);
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 16);
	}

	public void method1134(int var1) {
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 16);
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 24);
		this.field1830[++this.field1832 - 1] = (byte) var1;
		this.field1830[++this.field1832 - 1] = (byte) (var1 >> 8);
	}

	public int method1141() {
		this.field1832 += 4;
		return (this.field1830[this.field1832 - 4] & 255) + ((this.field1830[this.field1832 - 2] & 255) << 16) + ((this.field1830[this.field1832 - 1] & 255) << 24) + ((this.field1830[this.field1832 - 3] & 255) << 8);
	}

	public int method1135() {
		this.field1832 += 4;
		return (this.field1830[this.field1832 - 3] & 255) + ((this.field1830[this.field1832 - 1] & 255) << 16) + ((this.field1830[this.field1832 - 2] & 255) << 24) + ((this.field1830[this.field1832 - 4] & 255) << 8);
	}

	public int method1136() {
		this.field1832 += 4;
		return ((this.field1830[this.field1832 - 4] & 255) << 16) + ((this.field1830[this.field1832 - 3] & 255) << 24) + ((this.field1830[this.field1832 - 1] & 255) << 8) + (this.field1830[this.field1832 - 2] & 255);
	}

	public void method1150(byte[] var1, int var2, int var3) {
		for (int var5 = 0; var5 < 0 + var3; ++var5) {
			var1[var5] = (byte) (this.field1830[++this.field1832 - 1] - 128);
		}
	}

	public static int method1159(String var0) {
		return var0.length() + 1;
	}
}
