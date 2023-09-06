public final class class126 {
	int field1169;
	int field1170;
	int field1171;
	int field1174;
	int[] field1172;
	int[] field1173;

	public class126(int[] var1) {
		this.field1173 = new int[256];
		this.field1172 = new int[256];

		for (int var2 = 0; var2 < var1.length; ++var2) {
			this.field1172[var2] = var1[var2];
		}

		this.method767();
	}

	public final int method764() {
		if (this.field1171 == 0) {
			this.method766();
			this.field1171 = 256;
		}

		return this.field1172[--this.field1171];
	}

	public final int method765() {
		if (this.field1171 == 0) {
			this.method766();
			this.field1171 = 256;
		}

		return this.field1172[this.field1171 - 1];
	}

	final void method766() {
		this.field1169 += ++this.field1170;

		for (int var2 = 0; var2 < 256; ++var2) {
			int var3 = this.field1173[var2];
			if ((var2 & 2) == 0) {
				if ((var2 & 1) == 0) {
					this.field1174 ^= this.field1174 << 13;
				} else {
					this.field1174 ^= this.field1174 >>> 6;
				}
			} else if ((var2 & 1) == 0) {
				this.field1174 ^= this.field1174 << 2;
			} else {
				this.field1174 ^= this.field1174 >>> 16;
			}

			this.field1174 += this.field1173[var2 + 128 & 255];
			int var4;
			this.field1173[var2] = var4 = this.field1169 + this.field1173[(var3 & 1020) >> 2] + this.field1174;
			this.field1172[var2] = this.field1169 = this.field1173[(var4 >> 8 & 1020) >> 2] + var3;
		}

	}

	final void method767() {
		int var10 = -1640531527;
		int var9 = -1640531527;
		int var8 = -1640531527;
		int var7 = -1640531527;
		int var6 = -1640531527;
		int var5 = -1640531527;
		int var4 = -1640531527;
		int var3 = -1640531527;

		int var2;
		for (var2 = 0; var2 < 4; ++var2) {
			var3 ^= var4 << 11;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 >>> 2;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 << 8;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 >>> 16;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 << 10;
			var10 += var7;
			var8 += var9;
			var8 ^= var9 >>> 4;
			var3 += var8;
			var9 += var10;
			var9 ^= var10 << 8;
			var4 += var9;
			var10 += var3;
			var10 ^= var3 >>> 9;
			var5 += var10;
			var3 += var4;
		}

		for (var2 = 0; var2 < 256; var2 += 8) {
			var3 += this.field1172[var2];
			var4 += this.field1172[var2 + 1];
			var5 += this.field1172[var2 + 2];
			var6 += this.field1172[var2 + 3];
			var7 += this.field1172[var2 + 4];
			var8 += this.field1172[var2 + 5];
			var9 += this.field1172[var2 + 6];
			var10 += this.field1172[var2 + 7];
			var3 ^= var4 << 11;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 >>> 2;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 << 8;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 >>> 16;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 << 10;
			var10 += var7;
			var8 += var9;
			var8 ^= var9 >>> 4;
			var3 += var8;
			var9 += var10;
			var9 ^= var10 << 8;
			var4 += var9;
			var10 += var3;
			var10 ^= var3 >>> 9;
			var5 += var10;
			var3 += var4;
			this.field1173[var2] = var3;
			this.field1173[var2 + 1] = var4;
			this.field1173[var2 + 2] = var5;
			this.field1173[var2 + 3] = var6;
			this.field1173[var2 + 4] = var7;
			this.field1173[var2 + 5] = var8;
			this.field1173[var2 + 6] = var9;
			this.field1173[var2 + 7] = var10;
		}

		for (var2 = 0; var2 < 256; var2 += 8) {
			var3 += this.field1173[var2];
			var4 += this.field1173[var2 + 1];
			var5 += this.field1173[var2 + 2];
			var6 += this.field1173[var2 + 3];
			var7 += this.field1173[var2 + 4];
			var8 += this.field1173[var2 + 5];
			var9 += this.field1173[var2 + 6];
			var10 += this.field1173[var2 + 7];
			var3 ^= var4 << 11;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 >>> 2;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 << 8;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 >>> 16;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 << 10;
			var10 += var7;
			var8 += var9;
			var8 ^= var9 >>> 4;
			var3 += var8;
			var9 += var10;
			var9 ^= var10 << 8;
			var4 += var9;
			var10 += var3;
			var10 ^= var3 >>> 9;
			var5 += var10;
			var3 += var4;
			this.field1173[var2] = var3;
			this.field1173[var2 + 1] = var4;
			this.field1173[var2 + 2] = var5;
			this.field1173[var2 + 3] = var6;
			this.field1173[var2 + 4] = var7;
			this.field1173[var2 + 5] = var8;
			this.field1173[var2 + 6] = var9;
			this.field1173[var2 + 7] = var10;
		}

		this.method766();
		this.field1171 = 256;
	}
}
