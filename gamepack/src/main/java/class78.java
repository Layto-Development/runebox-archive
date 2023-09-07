import java.math.BigInteger;

public class class78 extends class70 {
    public static int[] field696;
    static long[] field698;

    static {
        field696 = new int[256];

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

            field696[var1] = var0;
        }

        field698 = new long[256];

        for (var2 = 0; var2 < 256; ++var2) {
            long var4 = var2;

            for (int var3 = 0; var3 < 8; ++var3) {
                if ((var4 & 1L) == 1L) {
                    var4 = var4 >>> 1 ^ -3932672073523589310L;
                } else {
                    var4 >>>= 1;
                }
            }

            field698[var2] = var4;
        }

    }

    public byte[] field695;
    public int field697;

    public class78(int var1) {
        this.field695 = class63.method183(var1);
        this.field697 = 0;
    }

    public class78(int var1, boolean var2) {
        this.field695 = class63.method181(var1, var2);
    }

    public class78(byte[] var1) {
        this.field695 = var1;
        this.field697 = 0;
    }

    public static int method323(String var0) {
        return var0.length() + 1;
    }

    public void method248() {
        if (this.field695 != null) {
            class63.method185(this.field695);
        }

        this.field695 = null;
    }

    public void method249(int var1) {
        this.field695[++this.field697 - 1] = (byte) var1;
    }

    public void method290(int var1) {
        this.field695[++this.field697 - 1] = (byte) (var1 >> 8);
        this.field695[++this.field697 - 1] = (byte) var1;
    }

    public void method301(int var1) {
        this.field695[++this.field697 - 1] = (byte) (var1 >> 16);
        this.field695[++this.field697 - 1] = (byte) (var1 >> 8);
        this.field695[++this.field697 - 1] = (byte) var1;
    }

    public void method315(int var1) {
        this.field695[++this.field697 - 1] = (byte) (var1 >> 24);
        this.field695[++this.field697 - 1] = (byte) (var1 >> 16);
        this.field695[++this.field697 - 1] = (byte) (var1 >> 8);
        this.field695[++this.field697 - 1] = (byte) var1;
    }

    public void method250(long var1) {
        this.field695[++this.field697 - 1] = (byte) ((int) (var1 >> 40));
        this.field695[++this.field697 - 1] = (byte) ((int) (var1 >> 32));
        this.field695[++this.field697 - 1] = (byte) ((int) (var1 >> 24));
        this.field695[++this.field697 - 1] = (byte) ((int) (var1 >> 16));
        this.field695[++this.field697 - 1] = (byte) ((int) (var1 >> 8));
        this.field695[++this.field697 - 1] = (byte) ((int) var1);
    }

    public void method286(long var1) {
        this.field695[++this.field697 - 1] = (byte) ((int) (var1 >> 56));
        this.field695[++this.field697 - 1] = (byte) ((int) (var1 >> 48));
        this.field695[++this.field697 - 1] = (byte) ((int) (var1 >> 40));
        this.field695[++this.field697 - 1] = (byte) ((int) (var1 >> 32));
        this.field695[++this.field697 - 1] = (byte) ((int) (var1 >> 24));
        this.field695[++this.field697 - 1] = (byte) ((int) (var1 >> 16));
        this.field695[++this.field697 - 1] = (byte) ((int) (var1 >> 8));
        this.field695[++this.field697 - 1] = (byte) ((int) var1);
    }

    public void method251(boolean var1) {
        this.method249(var1 ? 1 : 0);
    }

    public void method252(String var1) {
        int var3 = var1.indexOf(0);
        if (var3 >= 0) {
            throw new IllegalArgumentException("");
        } else {
            this.field697 += class209.method998(var1, 0, var1.length(), this.field695, this.field697);
            this.field695[++this.field697 - 1] = 0;
        }
    }

    public void method253(String var1) {
        int var3 = var1.indexOf(0);
        if (var3 >= 0) {
            throw new IllegalArgumentException("");
        } else {
            this.field695[++this.field697 - 1] = 0;
            this.field697 += class209.method998(var1, 0, var1.length(), this.field695, this.field697);
            this.field695[++this.field697 - 1] = 0;
        }
    }

    public void method246(CharSequence var1) {
        int var3 = class104.method495(var1);
        this.field695[++this.field697 - 1] = 0;
        this.method259(var3);
        this.field697 += class104.method496(this.field695, this.field697, var1);
    }

    public void method254(byte[] var1, int var2, int var3) {
        for (int var5 = 0; var5 < var3; ++var5) {
            this.field695[++this.field697 - 1] = var1[var5];
        }

    }

    public void method255(class78 var1) {
        this.method254(var1.field695, 0, var1.field697);
    }

    public void method256(int var1) {
        if (var1 < 0) {
            throw new IllegalArgumentException();
        } else {
            this.field695[this.field697 - var1 - 4] = (byte) (var1 >> 24);
            this.field695[this.field697 - var1 - 3] = (byte) (var1 >> 16);
            this.field695[this.field697 - var1 - 2] = (byte) (var1 >> 8);
            this.field695[this.field697 - var1 - 1] = (byte) var1;
        }
    }

    public void method257(int var1) {
        if (var1 >= 0 && var1 <= 65535) {
            this.field695[this.field697 - var1 - 2] = (byte) (var1 >> 8);
            this.field695[this.field697 - var1 - 1] = (byte) var1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void method258(int var1) {
        if (var1 >= 0 && var1 <= 255) {
            this.field695[this.field697 - var1 - 1] = (byte) var1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void method304(int var1) {
        if (var1 >= 0 && var1 < 128) {
            this.method249(var1);
        } else if (var1 >= 0 && var1 < 32768) {
            this.method290(var1 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void method259(int var1) {
        if ((var1 & -128) != 0) {
            if ((var1 & -16384) != 0) {
                if ((var1 & -2097152) != 0) {
                    if ((var1 & -268435456) != 0) {
                        this.method249(var1 >>> 28 | 128);
                    }

                    this.method249(var1 >>> 21 | 128);
                }

                this.method249(var1 >>> 14 | 128);
            }

            this.method249(var1 >>> 7 | 128);
        }

        this.method249(var1 & 127);
    }

    public int method260() {
        return this.field695[++this.field697 - 1] & 255;
    }

    public byte method261() {
        return this.field695[++this.field697 - 1];
    }

    public int method309() {
        this.field697 += 2;
        return (this.field695[this.field697 - 1] & 255) + ((this.field695[this.field697 - 2] & 255) << 8);
    }

    public int method262() {
        this.field697 += 2;
        int var2 = (this.field695[this.field697 - 1] & 255) + ((this.field695[this.field697 - 2] & 255) << 8);
        if (var2 > 32767) {
            var2 -= 65536;
        }

        return var2;
    }

    public int method316() {
        this.field697 += 3;
        return ((this.field695[this.field697 - 2] & 255) << 8) + ((this.field695[this.field697 - 3] & 255) << 16) + (this.field695[this.field697 - 1] & 255);
    }

    public int method306() {
        this.field697 += 3;
        int var2 = (this.field695[this.field697 - 1] & 255) + ((this.field695[this.field697 - 2] & 255) << 8) + ((this.field695[this.field697 - 3] & 255) << 16);
        if (var2 > 8388607) {
            var2 -= 16777216;
        }

        return var2;
    }

    public int method264() {
        this.field697 += 4;
        return ((this.field695[this.field697 - 3] & 255) << 16) + ((this.field695[this.field697 - 4] & 255) << 24) + ((this.field695[this.field697 - 2] & 255) << 8) + (this.field695[this.field697 - 1] & 255);
    }

    public long method265() {
        long var2 = (long) this.method264() & 4294967295L;
        long var4 = (long) this.method264() & 4294967295L;
        return var4 + (var2 << 32);
    }

    public float method266() {
        return Float.intBitsToFloat(this.method264());
    }

    public boolean method267() {
        return (this.method260() & 1) == 1;
    }

    public String method319() {
        if (this.field695[this.field697] == 0) {
            ++this.field697;
            return null;
        } else {
            return this.method268();
        }
    }

    public String method268() {
        int var2 = this.field697;

        while (this.field695[++this.field697 - 1] != 0) {
        }

        int var3 = this.field697 - var2 - 1;
        return var3 == 0 ? "" : class209.method999(this.field695, var2, var3);
    }

    public String method310() {
        byte var2 = this.field695[++this.field697 - 1];
        if (var2 != 0) {
            throw new IllegalStateException("");
        } else {
            int var3 = this.field697;

            while (this.field695[++this.field697 - 1] != 0) {
            }

            int var4 = this.field697 - var3 - 1;
            return var4 == 0 ? "" : class209.method999(this.field695, var3, var4);
        }
    }

    public String method302() {
        byte var2 = this.field695[++this.field697 - 1];
        if (var2 != 0) {
            throw new IllegalStateException("");
        } else {
            int var3 = this.method247();
            if (this.field697 + var3 > this.field695.length) {
                throw new IllegalStateException("");
            } else {
                byte[] var5 = this.field695;
                int var6 = this.field697;
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
                this.field697 += var3;
                return var4;
            }
        }
    }

    public void method270(byte[] var1, int var2, int var3) {
        for (int var5 = 0; var5 < var3; ++var5) {
            var1[var5] = this.field695[++this.field697 - 1];
        }

    }

    public int method271() {
        int var2 = this.field695[this.field697] & 255;
        return var2 < 128 ? this.method260() - 64 : this.method309() - 49152;
    }

    public int method307() {
        int var2 = this.field695[this.field697] & 255;
        return var2 < 128 ? this.method260() : this.method309() - 32768;
    }

    public int method272() {
        int var2 = this.field695[this.field697] & 255;
        return var2 < 128 ? this.method260() - 1 : this.method309() - 32769;
    }

    public int method273() {
        int var2 = 0;

        int var3;
        for (var3 = this.method307(); var3 == 32767; var3 = this.method307()) {
            var2 += 32767;
        }

        var2 += var3;
        return var2;
    }

    public int method274() {
        return this.field695[this.field697] < 0 ? this.method264() & Integer.MAX_VALUE : this.method309();
    }

    public int method308() {
        if (this.field695[this.field697] < 0) {
            return this.method264() & Integer.MAX_VALUE;
        } else {
            int var2 = this.method309();
            return var2 == 32767 ? -1 : var2;
        }
    }

    public int method247() {
        byte var2 = this.field695[++this.field697 - 1];

        int var3;
        for (var3 = 0; var2 < 0; var2 = this.field695[++this.field697 - 1]) {
            var3 = (var3 | var2 & 127) << 7;
        }

        return var3 | var2;
    }

    public int method276() {
        int var3 = 0;
        int var4 = 0;

        int var2;
        do {
            var2 = this.method260();
            var3 |= (var2 & 127) << var4;
            var4 += 7;
        } while (var2 > 127);

        return var3;
    }

    public void method277(int[] var1) {
        int var3 = this.field697 / 8;
        this.field697 = 0;

        for (int var4 = 0; var4 < var3; ++var4) {
            int var5 = this.method264();
            int var6 = this.method264();
            int var7 = 0;
            int var8 = -1640531527;

            for (int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3]) {
                var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
                var7 += -1640531527;
            }

            this.field697 -= 8;
            this.method315(var5);
            this.method315(var6);
        }

    }

    public void method321(int[] var1) {
        int var3 = this.field697 / 8;
        this.field697 = 0;

        for (int var4 = 0; var4 < var3; ++var4) {
            int var5 = this.method264();
            int var6 = this.method264();
            int var7 = -957401312;
            int var8 = -1640531527;

            for (int var9 = 32; var9-- > 0; var5 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + var1[var7 & 3]) {
                var6 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var7 + var1[var7 >>> 11 & 3];
                var7 -= -1640531527;
            }

            this.field697 -= 8;
            this.method315(var5);
            this.method315(var6);
        }

    }

    public void method303(int[] var1, int var2, int var3) {
        int var5 = this.field697;
        this.field697 = var2;
        int var6 = (var3 - var2) / 8;

        for (int var7 = 0; var7 < var6; ++var7) {
            int var8 = this.method264();
            int var9 = this.method264();
            int var10 = 0;
            int var11 = -1640531527;

            for (int var12 = 32; var12-- > 0; var9 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10) {
                var8 += (var9 << 4 ^ var9 >>> 5) + var9 ^ var1[var10 & 3] + var10;
                var10 += -1640531527;
            }

            this.field697 -= 8;
            this.method315(var8);
            this.method315(var9);
        }

        this.field697 = var5;
    }

    public void method311(int[] var1, int var2, int var3) {
        int var5 = this.field697;
        this.field697 = 5;
        int var6 = (var3 - 5) / 8;

        for (int var7 = 0; var7 < var6; ++var7) {
            int var8 = this.method264();
            int var9 = this.method264();
            int var10 = -957401312;
            int var11 = -1640531527;

            for (int var12 = 32; var12-- > 0; var8 -= var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3]) {
                var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10;
                var10 -= -1640531527;
            }

            this.field697 -= 8;
            this.method315(var8);
            this.method315(var9);
        }

        this.field697 = var5;
    }

    public void method293(BigInteger var1, BigInteger var2) {
        int var4 = this.field697;
        this.field697 = 0;
        byte[] var5 = new byte[var4];
        this.method270(var5, 0, var4);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(var1, var2);
        byte[] var8 = var7.toByteArray();
        this.field697 = 0;
        this.method290(var8.length);
        this.method254(var8, 0, var8.length);
    }

    public int method278(int var1) {
        byte[] var4 = this.field695;
        int var5 = this.field697;
        int var6 = -1;

        for (int var7 = var1; var7 < var5; ++var7) {
            var6 = var6 >>> 8 ^ field696[(var6 ^ var4[var7]) & 255];
        }

        var6 = ~var6;
        this.method315(var6);
        return var6;
    }

    public boolean method279() {
        this.field697 -= 4;
        byte[] var3 = this.field695;
        int var4 = this.field697;
        int var5 = -1;

        int var6;
        for (var6 = 0; var6 < var4; ++var6) {
            var5 = var5 >>> 8 ^ field696[(var5 ^ var3[var6]) & 255];
        }

        var5 = ~var5;
        var6 = this.method264();
        return var6 == var5;
    }

    public void method280(int var1) {
        this.field695[++this.field697 - 1] = (byte) (var1 + 128);
    }

    public void method322(int var1) {
        this.field695[++this.field697 - 1] = (byte) (-var1);
    }

    public void method296(int var1) {
        this.field695[++this.field697 - 1] = (byte) (128 - var1);
    }

    public int method281() {
        return this.field695[++this.field697 - 1] - 128 & 255;
    }

    public int method320() {
        return -this.field695[++this.field697 - 1] & 255;
    }

    public int method282() {
        return 128 - this.field695[++this.field697 - 1] & 255;
    }

    public byte method275() {
        return (byte) (this.field695[++this.field697 - 1] - 128);
    }

    public byte method283() {
        return (byte) (-this.field695[++this.field697 - 1]);
    }

    public byte method284() {
        return (byte) (128 - this.field695[++this.field697 - 1]);
    }

    public void method318(int var1) {
        this.field695[++this.field697 - 1] = (byte) var1;
        this.field695[++this.field697 - 1] = (byte) (var1 >> 8);
    }

    public void method285(int var1) {
        this.field695[++this.field697 - 1] = (byte) (var1 >> 8);
        this.field695[++this.field697 - 1] = (byte) (var1 + 128);
    }

    public void method312(int var1) {
        this.field695[++this.field697 - 1] = (byte) (var1 + 128);
        this.field695[++this.field697 - 1] = (byte) (var1 >> 8);
    }

    public int method287() {
        this.field697 += 2;
        return (this.field695[this.field697 - 2] & 255) + ((this.field695[this.field697 - 1] & 255) << 8);
    }

    public int method288() {
        this.field697 += 2;
        return (this.field695[this.field697 - 1] - 128 & 255) + ((this.field695[this.field697 - 2] & 255) << 8);
    }

    public int method289() {
        this.field697 += 2;
        return (this.field695[this.field697 - 2] - 128 & 255) + ((this.field695[this.field697 - 1] & 255) << 8);
    }

    public int method263() {
        this.field697 += 2;
        int var2 = (this.field695[this.field697 - 2] & 255) + ((this.field695[this.field697 - 1] & 255) << 8);
        if (var2 > 32767) {
            var2 -= 65536;
        }

        return var2;
    }

    public int method291() {
        this.field697 += 2;
        int var2 = (this.field695[this.field697 - 1] - 128 & 255) + ((this.field695[this.field697 - 2] & 255) << 8);
        if (var2 > 32767) {
            var2 -= 65536;
        }

        return var2;
    }

    public void method292(int var1) {
        this.field695[++this.field697 - 1] = (byte) var1;
        this.field695[++this.field697 - 1] = (byte) (var1 >> 8);
        this.field695[++this.field697 - 1] = (byte) (var1 >> 16);
    }

    public int method317() {
        this.field697 += 3;
        return ((this.field695[this.field697 - 1] & 255) << 8) + ((this.field695[this.field697 - 3] & 255) << 16) + (this.field695[this.field697 - 2] & 255);
    }

    public int method313() {
        this.field697 += 3;
        return ((this.field695[this.field697 - 3] & 255) << 8) + ((this.field695[this.field697 - 2] & 255) << 16) + (this.field695[this.field697 - 1] & 255);
    }

    public int method294() {
        this.field697 += 3;
        int var2 = ((this.field695[this.field697 - 1] & 255) << 16) + ((this.field695[this.field697 - 2] & 255) << 8) + (this.field695[this.field697 - 3] & 255);
        if (var2 > 8388607) {
            var2 -= 16777216;
        }

        return var2;
    }

    public int method295() {
        this.field697 += 3;
        int var2 = ((this.field695[this.field697 - 3] & 255) << 16) + ((this.field695[this.field697 - 1] & 255) << 8) + (this.field695[this.field697 - 2] & 255);
        if (var2 > 8388607) {
            var2 -= 16777216;
        }

        return var2;
    }

    public void method269(int var1) {
        this.field695[++this.field697 - 1] = (byte) var1;
        this.field695[++this.field697 - 1] = (byte) (var1 >> 8);
        this.field695[++this.field697 - 1] = (byte) (var1 >> 16);
        this.field695[++this.field697 - 1] = (byte) (var1 >> 24);
    }

    public void method297(int var1) {
        this.field695[++this.field697 - 1] = (byte) (var1 >> 8);
        this.field695[++this.field697 - 1] = (byte) var1;
        this.field695[++this.field697 - 1] = (byte) (var1 >> 24);
        this.field695[++this.field697 - 1] = (byte) (var1 >> 16);
    }

    public void method298(int var1) {
        this.field695[++this.field697 - 1] = (byte) (var1 >> 16);
        this.field695[++this.field697 - 1] = (byte) (var1 >> 24);
        this.field695[++this.field697 - 1] = (byte) var1;
        this.field695[++this.field697 - 1] = (byte) (var1 >> 8);
    }

    public int method305() {
        this.field697 += 4;
        return (this.field695[this.field697 - 4] & 255) + ((this.field695[this.field697 - 2] & 255) << 16) + ((this.field695[this.field697 - 1] & 255) << 24) + ((this.field695[this.field697 - 3] & 255) << 8);
    }

    public int method299() {
        this.field697 += 4;
        return (this.field695[this.field697 - 3] & 255) + ((this.field695[this.field697 - 1] & 255) << 16) + ((this.field695[this.field697 - 2] & 255) << 24) + ((this.field695[this.field697 - 4] & 255) << 8);
    }

    public int method300() {
        this.field697 += 4;
        return ((this.field695[this.field697 - 4] & 255) << 16) + ((this.field695[this.field697 - 3] & 255) << 24) + ((this.field695[this.field697 - 1] & 255) << 8) + (this.field695[this.field697 - 2] & 255);
    }

    public void method314(byte[] var1, int var2, int var3) {
        for (int var5 = 0; var5 < var3; ++var5) {
            var1[var5] = (byte) (this.field695[++this.field697 - 1] - 128);
        }

    }
}
