public final class class504 {

	int field4043;

	int field4044;

	int field4045;

	int field4048;

	int[] field4046;

	int[] field4047;

	public class504(int[] var1) {
		this.field4047 = new int[256];
		this.field4046 = new int[256];
		for (int var2 = 0; var2 < var1.length; ++var2) {
			this.field4046[var2] = var1[var2];
		}
		this.method2439();
	}

	public final int method2436() {
		if (this.field4045 == 0) {
			this.method2438();
			this.field4045 = 256;
		}
		return this.field4046[--this.field4045];
	}

	public final int method2437() {
		if (this.field4045 == 0) {
			this.method2438();
			this.field4045 = 256;
		}
		return this.field4046[this.field4045 - 1];
	}

	final void method2438() {
		this.field4043 += ++this.field4044;
		for (int var2 = 0; var2 < 256; ++var2) {
			int var3 = this.field4047[var2];
			if ((var2 & 2) == 0) {
				if ((var2 & 1) == 0) {
					this.field4048 ^= this.field4048 << 13;
				} else {
					this.field4048 ^= this.field4048 >>> 6;
				}
			} else if ((var2 & 1) == 0) {
				this.field4048 ^= this.field4048 << 2;
			} else {
				this.field4048 ^= this.field4048 >>> 16;
			}
			this.field4048 += this.field4047[var2 + 128 & 255];
			int var4;
			this.field4047[var2] = var4 = this.field4043 + this.field4047[(var3 & 1020) >> 2] + this.field4048;
			this.field4046[var2] = this.field4043 = this.field4047[(var4 >> 8 & 1020) >> 2] + var3;
		}
	}

	final void method2439() {
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
			var3 += this.field4046[var2];
			var4 += this.field4046[var2 + 1];
			var5 += this.field4046[var2 + 2];
			var6 += this.field4046[var2 + 3];
			var7 += this.field4046[var2 + 4];
			var8 += this.field4046[var2 + 5];
			var9 += this.field4046[var2 + 6];
			var10 += this.field4046[var2 + 7];
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
			this.field4047[var2] = var3;
			this.field4047[var2 + 1] = var4;
			this.field4047[var2 + 2] = var5;
			this.field4047[var2 + 3] = var6;
			this.field4047[var2 + 4] = var7;
			this.field4047[var2 + 5] = var8;
			this.field4047[var2 + 6] = var9;
			this.field4047[var2 + 7] = var10;
		}
		for (var2 = 0; var2 < 256; var2 += 8) {
			var3 += this.field4047[var2];
			var4 += this.field4047[var2 + 1];
			var5 += this.field4047[var2 + 2];
			var6 += this.field4047[var2 + 3];
			var7 += this.field4047[var2 + 4];
			var8 += this.field4047[var2 + 5];
			var9 += this.field4047[var2 + 6];
			var10 += this.field4047[var2 + 7];
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
			this.field4047[var2] = var3;
			this.field4047[var2 + 1] = var4;
			this.field4047[var2 + 2] = var5;
			this.field4047[var2 + 3] = var6;
			this.field4047[var2 + 4] = var7;
			this.field4047[var2 + 5] = var8;
			this.field4047[var2 + 6] = var9;
			this.field4047[var2 + 7] = var10;
		}
		this.method2438();
		this.field4045 = 256;
	}
}
