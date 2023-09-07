public final class class299 {
    int field2154;
    int field2155;
    int field2156;
    int field2159;
    int[] field2157;
    int[] field2158;

    public class299(int[] var1) {
        this.field2158 = new int[256];
        this.field2157 = new int[256];

        System.arraycopy(var1, 0, this.field2157, 0, var1.length);

        this.method1329();
    }

    public int method1326() {
        if (this.field2156 == 0) {
            this.method1328();
            this.field2156 = 256;
        }

        return this.field2157[--this.field2156];
    }

    public int method1327() {
        if (this.field2156 == 0) {
            this.method1328();
            this.field2156 = 256;
        }

        return this.field2157[this.field2156 - 1];
    }

    void method1328() {
        this.field2154 += ++this.field2155;

        for (int var2 = 0; var2 < 256; ++var2) {
            int var3 = this.field2158[var2];
            if ((var2 & 2) == 0) {
                if ((var2 & 1) == 0) {
                    this.field2159 ^= this.field2159 << 13;
                } else {
                    this.field2159 ^= this.field2159 >>> 6;
                }
            } else if ((var2 & 1) == 0) {
                this.field2159 ^= this.field2159 << 2;
            } else {
                this.field2159 ^= this.field2159 >>> 16;
            }

            this.field2159 += this.field2158[var2 + 128 & 255];
            int var4;
            this.field2158[var2] = var4 = this.field2154 + this.field2158[(var3 & 1020) >> 2] + this.field2159;
            this.field2157[var2] = this.field2154 = this.field2158[(var4 >> 8 & 1020) >> 2] + var3;
        }

    }

    void method1329() {
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
            var3 += this.field2157[var2];
            var4 += this.field2157[var2 + 1];
            var5 += this.field2157[var2 + 2];
            var6 += this.field2157[var2 + 3];
            var7 += this.field2157[var2 + 4];
            var8 += this.field2157[var2 + 5];
            var9 += this.field2157[var2 + 6];
            var10 += this.field2157[var2 + 7];
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
            this.field2158[var2] = var3;
            this.field2158[var2 + 1] = var4;
            this.field2158[var2 + 2] = var5;
            this.field2158[var2 + 3] = var6;
            this.field2158[var2 + 4] = var7;
            this.field2158[var2 + 5] = var8;
            this.field2158[var2 + 6] = var9;
            this.field2158[var2 + 7] = var10;
        }

        for (var2 = 0; var2 < 256; var2 += 8) {
            var3 += this.field2158[var2];
            var4 += this.field2158[var2 + 1];
            var5 += this.field2158[var2 + 2];
            var6 += this.field2158[var2 + 3];
            var7 += this.field2158[var2 + 4];
            var8 += this.field2158[var2 + 5];
            var9 += this.field2158[var2 + 6];
            var10 += this.field2158[var2 + 7];
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
            this.field2158[var2] = var3;
            this.field2158[var2 + 1] = var4;
            this.field2158[var2 + 2] = var5;
            this.field2158[var2 + 3] = var6;
            this.field2158[var2 + 4] = var7;
            this.field2158[var2 + 5] = var8;
            this.field2158[var2 + 6] = var9;
            this.field2158[var2 + 7] = var10;
        }

        this.method1328();
        this.field2156 = 256;
    }
}
