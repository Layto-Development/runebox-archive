import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class class468 extends class391 {
    static ThreadPoolExecutor field3342;
    static AtomicBoolean field3345;

    static {
        field3345 = null;
        field3342 = null;
    }

    public int field3347;
    boolean field3338;
    class178 field3346;
    class213[][] field3332;
    class213[][] field3336;
    class280 field3337;
    class338 field3343;
    int field3318;
    int field3326;
    int field3339;
    int field3340;
    int[] field3317;
    int[] field3319;
    int[] field3320;
    int[] field3321;
    int[] field3322;
    int[] field3323;
    int[] field3324;
    int[] field3325;
    int[] field3328;
    int[] field3329;
    int[] field3330;
    int[] field3331;
    int[] field3333;
    int[] field3335;
    int[] field3344;
    PriorityQueue field3327;
    long field3334;
    long field3341;

    public class468() {
        this.field3318 = 256;
        this.field3326 = 1000000;
        this.field3320 = new int[16];
        this.field3321 = new int[16];
        this.field3322 = new int[16];
        this.field3323 = new int[16];
        this.field3324 = new int[16];
        this.field3329 = new int[16];
        this.field3335 = new int[16];
        this.field3325 = new int[16];
        this.field3328 = new int[16];
        this.field3317 = new int[16];
        this.field3330 = new int[16];
        this.field3331 = new int[16];
        this.field3319 = new int[16];
        this.field3333 = new int[16];
        this.field3344 = new int[16];
        this.field3332 = new class213[16][128];
        this.field3336 = new class213[16][128];
        this.field3337 = new class280();
        this.field3343 = new class338(this);
        this.field3327 = new PriorityQueue(5, new class19());
        this.field3347 = 0;
        this.field3346 = new class178(128);
        this.method2149();
    }

    public synchronized void method2134(int var1) {
        this.field3318 = var1;
    }

    public int method2157() {
        return this.field3318;
    }

    public synchronized boolean method2135(class506 var1, class68 var2, class56 var3) {
        boolean var5 = true;
        synchronized (this.field3327) {
            this.field3327.clear();
        }

        for (class65 var6 = (class65) var1.field3705.method858(); var6 != null; var6 = (class65) var1.field3705.method859()) {
            int var7 = (int) var6.field658;
            class491 var8 = (class491) this.field3346.method857(var7);
            if (null == var8) {
                byte[] var10 = var2.method195(var7);
                class491 var9;
                if (var10 == null) {
                    var9 = null;
                } else {
                    var9 = new class491(var10);
                }

                var8 = var9;
                if (null == var9) {
                    var5 = false;
                    continue;
                }

                this.field3346.method860(var9, var7);
            }

            if (!var8.method2239(var3, var6.field632)) {
                var5 = false;
            } else if (null != this.field3327) {
                synchronized (this.field3327) {
                    Iterator<class389> var15 = var8.field3610.iterator();

                    while (var15.hasNext()) {
                        class389 var11 = var15.next();
                        this.field3327.add(new class384(var6.field633, var11));
                    }
                }
            }
        }

        return var5;
    }

    public void method2136() {
        if (null != this.field3327) {
            if (field3345 != null) {
                field3345.set(true);
            }

            field3345 = new AtomicBoolean(false);
            AtomicBoolean var2 = field3345;
            if (field3342 == null) {
                int var3 = Runtime.getRuntime().availableProcessors();
                field3342 = new ThreadPoolExecutor(0, var3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(), new class426(this));
            }

            field3342.submit(new class47(this, var2));
        }
    }

    public synchronized void method2137() {
        for (class491 var2 = (class491) this.field3346.method858(); null != var2; var2 = (class491) this.field3346.method859()) {
            var2.method2240();
        }

    }

    public synchronized void method2164() {
        for (class491 var2 = (class491) this.field3346.method858(); var2 != null; var2 = (class491) this.field3346.method859()) {
            var2.method221();
        }

    }

    public synchronized void method2138(class506 var1, boolean var2) {
        this.method2166();
        this.field3337.method1273(var1.field3704);
        this.field3338 = var2;
        this.field3341 = 0L;
        int var4 = this.field3337.method1261();

        for (int var5 = 0; var5 < var4; ++var5) {
            this.field3337.method1262(var5);
            this.field3337.method1265(var5);
            this.field3337.method1263(var5);
        }

        this.field3339 = this.field3337.method1269();
        this.field3340 = this.field3337.field2045[this.field3339];
        this.field3334 = this.field3337.method1272(this.field3340);
    }

    public synchronized void method2166() {
        this.field3337.method1260();
        this.method2149();
    }

    public synchronized boolean method2162() {
        return this.field3337.method1274();
    }

    public synchronized boolean method2139() {
        return this.field3346.method856() > 0;
    }

    public synchronized void method2154(int var1, int var2) {
        this.method2158(9, 128);
    }

    void method2158(int var1, int var2) {
        this.field3323[9] = 128;
        this.field3329[9] = 128;
        this.method2140(9, 128);
    }

    void method2140(int var1, int var2) {
        if (var2 != this.field3324[var1]) {
            this.field3324[var1] = var2;

            for (int var4 = 0; var4 < 128; ++var4) {
                this.field3336[var1][var4] = null;
            }
        }

    }

    void method2141(int var1, int var2, int var3) {
        this.method2142(var1, var2, 64);
        if ((this.field3317[var1] & 2) != 0) {
            for (class213 var5 = (class213) this.field3343.field2449.method123(); var5 != null; var5 = (class213) this.field3343.field2449.method128()) {
                if (var5.field1720 == var1 && var5.field1724 < 0) {
                    this.field3332[var1][var5.field1715] = null;
                    this.field3332[var1][var2] = var5;
                    int var6 = var5.field1714 + (var5.field1719 * var5.field1722 >> 12);
                    var5.field1714 += var2 - var5.field1715 << 8;
                    var5.field1719 = var6 - var5.field1714;
                    var5.field1722 = 4096;
                    var5.field1715 = var2;
                    return;
                }
            }
        }

        class491 var9 = (class491) this.field3346.method857(this.field3324[var1]);
        if (null != var9) {
            if (null != var9.field3603[var2]) {
                class433 var10 = var9.field3603[var2].method1807();
                if (var10 != null) {
                    class213 var7 = new class213();
                    var7.field1720 = var1;
                    var7.field1711 = var9;
                    var7.field1712 = var10;
                    var7.field1713 = var9.field3607[var2];
                    var7.field1726 = var9.field3608[var2];
                    var7.field1715 = var2;
                    var7.field1716 = var9.field3605[var2] * var9.field3609 * var3 * var3 + 1024 >> 11;
                    var7.field1717 = var9.field3606[var2] & 255;
                    var7.field1714 = (var2 << 8) - (var9.field3604[var2] & 32767);
                    var7.field1721 = 0;
                    var7.field1728 = 0;
                    var7.field1723 = 0;
                    var7.field1724 = -1;
                    var7.field1725 = 0;
                    if (this.field3319[var1] == 0) {
                        var7.field1718 = class409.method1861(var10, this.method2160(var7), this.method2161(var7), this.method2153(var7));
                    } else {
                        var7.field1718 = class409.method1861(var10, this.method2160(var7), 0, this.method2153(var7));
                        this.method2152(var7, var9.field3604[var2] < 0);
                    }

                    if (var9.field3604[var2] < 0) {
                        var7.field1718.method1862(-1);
                    }

                    if (var7.field1726 >= 0) {
                        class213 var8 = this.field3336[var1][var7.field1726];
                        if (null != var8 && var8.field1724 < 0) {
                            this.field3332[var1][var8.field1715] = null;
                            var8.field1724 = 0;
                        }

                        this.field3336[var1][var7.field1726] = var7;
                    }

                    this.field3343.field2449.method126(var7);
                    this.field3332[var1][var2] = var7;
                }
            }
        }
    }

    void method2152(class213 var1, boolean var2) {
        int var4 = var1.field1712.field2945.length;
        int var5;
        if (var2 && var1.field1712.field2948) {
            int var6 = var4 + var4 - var1.field1712.field2946;
            var5 = (int) ((long) var6 * (long) this.field3319[var1.field1720] >> 6);
            var4 <<= 8;
            if (var5 >= var4) {
                var5 = var4 + var4 - 1 - var5;
                var1.field1718.method1891(true);
            }
        } else {
            var5 = (int) ((long) var4 * (long) this.field3319[var1.field1720] >> 6);
        }

        var1.field1718.method1867(var5);
    }

    void method2142(int var1, int var2, int var3) {
        class213 var5 = this.field3332[var1][var2];
        if (var5 != null) {
            this.field3332[var1][var2] = null;
            if ((this.field3317[var1] & 2) != 0) {
                for (class213 var6 = (class213) this.field3343.field2449.method122(); var6 != null; var6 = (class213) this.field3343.field2449.method124()) {
                    if (var6.field1720 == var5.field1720 && var6.field1724 < 0 && var5 != var6) {
                        var5.field1724 = 0;
                        break;
                    }
                }
            } else {
                var5.field1724 = 0;
            }

        }
    }

    void method2143(int var1, int var2, int var3) {
    }

    void method2144(int var1, int var2) {
    }

    void method2145(int var1, int var2) {
        this.field3335[var1] = var2;
    }

    void method2163(int var1) {
        for (class213 var3 = (class213) this.field3343.field2449.method122(); var3 != null; var3 = (class213) this.field3343.field2449.method124()) {
            if (var1 < 0 || var1 == var3.field1720) {
                if (null != var3.field1718) {
                    var3.field1718.method1869(class398.field2800 / 100);
                    if (var3.field1718.method1873()) {
                        this.field3343.field2447.method1730(var3.field1718);
                    }

                    var3.method1016();
                }

                if (var3.field1724 < 0) {
                    this.field3332[var3.field1720][var3.field1715] = null;
                }

                var3.method221();
            }
        }

    }

    void method2146(int var1) {
        if (var1 >= 0) {
            this.field3320[var1] = 12800;
            this.field3321[var1] = 8192;
            this.field3322[var1] = 16383;
            this.field3335[var1] = 8192;
            this.field3325[var1] = 0;
            this.field3328[var1] = 8192;
            this.method2148(var1);
            this.method2159(var1);
            this.field3317[var1] = 0;
            this.field3330[var1] = 32767;
            this.field3331[var1] = 256;
            this.field3319[var1] = 0;
            this.method2150(var1, 8192);
        } else {
            for (var1 = 0; var1 < 16; ++var1) {
                this.method2146(var1);
            }

        }
    }

    void method2147(int var1) {
        for (class213 var3 = (class213) this.field3343.field2449.method122(); null != var3; var3 = (class213) this.field3343.field2449.method124()) {
            if ((var1 < 0 || var3.field1720 == var1) && var3.field1724 < 0) {
                this.field3332[var3.field1720][var3.field1715] = null;
                var3.field1724 = 0;
            }
        }

    }

    void method2149() {
        this.method2163(-1);
        this.method2146(-1);

        int var2;
        for (var2 = 0; var2 < 16; ++var2) {
            this.field3324[var2] = this.field3323[var2];
        }

        for (var2 = 0; var2 < 16; ++var2) {
            this.field3329[var2] = this.field3323[var2] & -128;
        }

    }

    void method2148(int var1) {
        if ((this.field3317[var1] & 2) != 0) {
            for (class213 var3 = (class213) this.field3343.field2449.method122(); var3 != null; var3 = (class213) this.field3343.field2449.method124()) {
                if (var3.field1720 == var1 && null == this.field3332[var1][var3.field1715] && var3.field1724 < 0) {
                    var3.field1724 = 0;
                }
            }
        }

    }

    void method2159(int var1) {
        if ((this.field3317[var1] & 4) != 0) {
            for (class213 var3 = (class213) this.field3343.field2449.method122(); var3 != null; var3 = (class213) this.field3343.field2449.method124()) {
                if (var1 == var3.field1720) {
                    var3.field1730 = 0;
                }
            }
        }

    }

    void method2151(int var1) {
        int var3 = var1 & 240;
        int var4;
        int var5;
        int var6;
        if (var3 == 128) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            var6 = var1 >> 16 & 127;
            this.method2142(var4, var5, var6);
        } else if (var3 == 144) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            var6 = var1 >> 16 & 127;
            if (var6 > 0) {
                this.method2141(var4, var5, var6);
            } else {
                this.method2142(var4, var5, 64);
            }

        } else if (var3 == 160) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            var6 = var1 >> 16 & 127;
            this.method2143(var4, var5, var6);
        } else if (var3 == 176) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            var6 = var1 >> 16 & 127;
            if (var5 == 0) {
                this.field3329[var4] = (this.field3329[var4] & -2080769) + (var6 << 14);
            }

            if (var5 == 32) {
                this.field3329[var4] = (var6 << 7) + (this.field3329[var4] & -16257);
            }

            if (var5 == 1) {
                this.field3325[var4] = (var6 << 7) + (this.field3325[var4] & -16257);
            }

            if (var5 == 33) {
                this.field3325[var4] = var6 + (this.field3325[var4] & -128);
            }

            if (var5 == 5) {
                this.field3328[var4] = (var6 << 7) + (this.field3328[var4] & -16257);
            }

            if (var5 == 37) {
                this.field3328[var4] = var6 + (this.field3328[var4] & -128);
            }

            if (var5 == 7) {
                this.field3320[var4] = (this.field3320[var4] & -16257) + (var6 << 7);
            }

            if (var5 == 39) {
                this.field3320[var4] = (this.field3320[var4] & -128) + var6;
            }

            if (var5 == 10) {
                this.field3321[var4] = (this.field3321[var4] & -16257) + (var6 << 7);
            }

            if (var5 == 42) {
                this.field3321[var4] = var6 + (this.field3321[var4] & -128);
            }

            if (var5 == 11) {
                this.field3322[var4] = (this.field3322[var4] & -16257) + (var6 << 7);
            }

            if (var5 == 43) {
                this.field3322[var4] = var6 + (this.field3322[var4] & -128);
            }

            int[] var10000;
            if (var5 == 64) {
                if (var6 >= 64) {
                    var10000 = this.field3317;
                    var10000[var4] |= 1;
                } else {
                    var10000 = this.field3317;
                    var10000[var4] &= -2;
                }
            }

            if (var5 == 65) {
                if (var6 >= 64) {
                    var10000 = this.field3317;
                    var10000[var4] |= 2;
                } else {
                    this.method2148(var4);
                    var10000 = this.field3317;
                    var10000[var4] &= -3;
                }
            }

            if (var5 == 99) {
                this.field3330[var4] = (var6 << 7) + (this.field3330[var4] & 127);
            }

            if (var5 == 98) {
                this.field3330[var4] = var6 + (this.field3330[var4] & 16256);
            }

            if (var5 == 101) {
                this.field3330[var4] = (var6 << 7) + (this.field3330[var4] & 127) + 16384;
            }

            if (var5 == 100) {
                this.field3330[var4] = 16384 + (this.field3330[var4] & 16256) + var6;
            }

            if (var5 == 120) {
                this.method2163(var4);
            }

            if (var5 == 121) {
                this.method2146(var4);
            }

            if (var5 == 123) {
                this.method2147(var4);
            }

            int var7;
            if (var5 == 6) {
                var7 = this.field3330[var4];
                if (var7 == 16384) {
                    this.field3331[var4] = (var6 << 7) + (this.field3331[var4] & -16257);
                }
            }

            if (var5 == 38) {
                var7 = this.field3330[var4];
                if (var7 == 16384) {
                    this.field3331[var4] = (this.field3331[var4] & -128) + var6;
                }
            }

            if (var5 == 16) {
                this.field3319[var4] = (var6 << 7) + (this.field3319[var4] & -16257);
            }

            if (var5 == 48) {
                this.field3319[var4] = (this.field3319[var4] & -128) + var6;
            }

            if (var5 == 81) {
                if (var6 >= 64) {
                    var10000 = this.field3317;
                    var10000[var4] |= 4;
                } else {
                    this.method2159(var4);
                    var10000 = this.field3317;
                    var10000[var4] &= -5;
                }
            }

            if (var5 == 17) {
                this.method2150(var4, (this.field3333[var4] & -16257) + (var6 << 7));
            }

            if (var5 == 49) {
                this.method2150(var4, (this.field3333[var4] & -128) + var6);
            }

        } else if (var3 == 192) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            this.method2140(var4, this.field3329[var4] + var5);
        } else if (var3 == 208) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            this.method2144(var4, var5);
        } else if (var3 == 224) {
            var4 = var1 & 15;
            var5 = (var1 >> 9 & 16256) + (var1 >> 8 & 127);
            this.method2145(var4, var5);
        } else {
            var3 = var1 & 255;
            if (var3 == 255) {
                this.method2149();
            }
        }
    }

    void method2150(int var1, int var2) {
        this.field3333[var1] = var2;
        this.field3344[var1] = (int) (2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double) var2) + 0.5D);
    }

    int method2160(class213 var1) {
        int var3 = var1.field1714 + (var1.field1722 * var1.field1719 >> 12);
        var3 += (this.field3335[var1.field1720] - 8192) * this.field3331[var1.field1720] >> 12;
        class23 var4 = var1.field1713;
        int var5;
        if (var4.field120 > 0 && (var4.field119 > 0 || this.field3325[var1.field1720] > 0)) {
            var5 = var4.field119 << 2;
            int var6 = var4.field121 << 1;
            if (var1.field1710 < var6) {
                var5 = var5 * var1.field1710 / var6;
            }

            var5 += this.field3325[var1.field1720] >> 7;
            double var7 = Math.sin(0.01227184630308513D * (double) (var1.field1727 & 511));
            var3 += (int) ((double) var5 * var7);
        }

        var5 = (int) ((double) (var1.field1712.field2947 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) class398.field2800 + 0.5D);
        return var5 < 1 ? 1 : var5;
    }

    int method2161(class213 var1) {
        class23 var3 = var1.field1713;
        int var4 = 4096 + this.field3320[var1.field1720] * this.field3322[var1.field1720] >> 13;
        var4 = 16384 + var4 * var4 >> 15;
        var4 = var4 * var1.field1716 + 16384 >> 15;
        var4 = var4 * this.field3318 + 128 >> 8;
        if (var3.field116 > 0) {
            var4 = (int) ((double) var4 * Math.pow(0.5D, 1.953125E-5D * (double) var1.field1721 * (double) var3.field116) + 0.5D);
        }

        int var5;
        int var6;
        int var7;
        int var8;
        if (var3.field118 != null) {
            var5 = var1.field1728;
            var6 = var3.field118[var1.field1723 + 1];
            if (var1.field1723 < var3.field118.length - 2) {
                var7 = (var3.field118[var1.field1723] & 255) << 8;
                var8 = (var3.field118[var1.field1723 + 2] & 255) << 8;
                var6 += (var3.field118[3 + var1.field1723] - var6) * (var5 - var7) / (var8 - var7);
            }

            var4 = var6 * var4 + 32 >> 6;
        }

        if (var1.field1724 > 0 && null != var3.field123) {
            var5 = var1.field1724;
            var6 = var3.field123[var1.field1725 + 1];
            if (var1.field1725 < var3.field123.length - 2) {
                var7 = (var3.field123[var1.field1725] & 255) << 8;
                var8 = (var3.field123[var1.field1725 + 2] & 255) << 8;
                var6 += (var5 - var7) * (var3.field123[3 + var1.field1725] - var6) / (var8 - var7);
            }

            var4 = 32 + var4 * var6 >> 6;
        }

        return var4;
    }

    int method2153(class213 var1) {
        int var3 = this.field3321[var1.field1720];
        return var3 < 8192 ? var1.field1717 * var3 + 32 >> 6 : 16384 - (32 + (16384 - var3) * (128 - var1.field1717) >> 6);
    }

    @Override
    protected synchronized class391 method1811() {
        return this.field3343;
    }

    @Override
    protected synchronized class391 method1812() {
        return null;
    }

    @Override
    protected synchronized int method1809() {
        return 0;
    }

    @Override
    protected synchronized void method1814(int[] var1, int var2, int var3) {
        if (this.field3337.method1274()) {
            int var4 = this.field3337.field2042 * this.field3326 / class398.field2800;

            do {
                long var5 = (long) var4 * (long) var3 + this.field3341;
                if (this.field3334 - var5 >= 0L) {
                    this.field3341 = var5;
                    break;
                }

                int var7 = (int) (((long) var4 + (this.field3334 - this.field3341) - 1L) / (long) var4);
                this.field3341 += (long) var4 * (long) var7;
                this.field3343.method1814(var1, var2, var7);
                var2 += var7;
                var3 -= var7;
                this.method2155();
            } while (this.field3337.method1274());
        }

        this.field3343.method1814(var1, var2, var3);
    }

    @Override
    protected synchronized void method1813(int var1) {
        if (this.field3337.method1274()) {
            int var2 = this.field3326 * this.field3337.field2042 / class398.field2800;

            do {
                long var3 = this.field3341 + (long) var1 * (long) var2;
                if (this.field3334 - var3 >= 0L) {
                    this.field3341 = var3;
                    break;
                }

                int var5 = (int) (((long) var2 + (this.field3334 - this.field3341) - 1L) / (long) var2);
                this.field3341 += (long) var2 * (long) var5;
                this.field3343.method1813(var5);
                var1 -= var5;
                this.method2155();
            } while (this.field3337.method1274());
        }

        this.field3343.method1813(var1);
    }

    void method2155() {
        int var2 = this.field3339;
        int var3 = this.field3340;

        long var4;
        for (var4 = this.field3334; this.field3340 == var3; var4 = this.field3337.method1272(var3)) {
            while (this.field3337.field2045[var2] == var3) {
                this.field3337.method1262(var2);
                int var6 = this.field3337.method1266(var2);
                if (var6 == 1) {
                    this.field3337.method1264();
                    this.field3337.method1263(var2);
                    if (this.field3337.method1270()) {
                        if (!this.field3338 || var3 == 0) {
                            this.method2149();
                            this.field3337.method1260();
                            return;
                        }

                        this.field3337.method1271(var4);
                    }
                    break;
                }

                if ((var6 & 128) != 0) {
                    this.method2151(var6);
                }

                this.field3337.method1265(var2);
                this.field3337.method1263(var2);
            }

            var2 = this.field3337.method1269();
            var3 = this.field3337.field2045[var2];
        }

        this.field3339 = var2;
        this.field3340 = var3;
        this.field3334 = var4;
    }

    boolean method2165(class213 var1) {
        if (null == var1.field1718) {
            if (var1.field1724 >= 0) {
                var1.method221();
                if (var1.field1726 > 0 && this.field3336[var1.field1720][var1.field1726] == var1) {
                    this.field3336[var1.field1720][var1.field1726] = null;
                }
            }

            return true;
        } else {
            return false;
        }
    }

    boolean method2156(class213 var1, int[] var2, int var3, int var4) {
        var1.field1729 = class398.field2800 / 100;
        if (var1.field1724 < 0 || null != var1.field1718 && !var1.field1718.method1872()) {
            int var6 = var1.field1722;
            if (var6 > 0) {
                var6 -= (int) (16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double) this.field3328[var1.field1720]) + 0.5D);
                if (var6 < 0) {
                    var6 = 0;
                }

                var1.field1722 = var6;
            }

            var1.field1718.method1870(this.method2160(var1));
            class23 var7 = var1.field1713;
            boolean var8 = false;
            ++var1.field1710;
            var1.field1727 += var7.field120;
            double var9 = 5.086263020833333E-6D * (double) ((var1.field1719 * var1.field1722 >> 12) + (var1.field1715 - 60 << 8));
            if (var7.field116 > 0) {
                if (var7.field114 > 0) {
                    var1.field1721 += (int) (128.0D * Math.pow(2.0D, (double) var7.field114 * var9) + 0.5D);
                } else {
                    var1.field1721 += 128;
                }
            }

            if (var7.field118 != null) {
                if (var7.field115 > 0) {
                    var1.field1728 += (int) (128.0D * Math.pow(2.0D, var9 * (double) var7.field115) + 0.5D);
                } else {
                    var1.field1728 += 128;
                }

                while (var1.field1723 < var7.field118.length - 2 && var1.field1728 > (var7.field118[var1.field1723 + 2] & 255) << 8) {
                    var1.field1723 += 2;
                }

                if (var1.field1723 == var7.field118.length - 2 && var7.field118[var1.field1723 + 1] == 0) {
                    var8 = true;
                }
            }

            if (var1.field1724 >= 0 && var7.field123 != null && (this.field3317[var1.field1720] & 1) == 0 && (var1.field1726 < 0 || var1 != this.field3336[var1.field1720][var1.field1726])) {
                if (var7.field117 > 0) {
                    var1.field1724 += (int) (128.0D * Math.pow(2.0D, var9 * (double) var7.field117) + 0.5D);
                } else {
                    var1.field1724 += 128;
                }

                while (var1.field1725 < var7.field123.length - 2 && var1.field1724 > (var7.field123[2 + var1.field1725] & 255) << 8) {
                    var1.field1725 += 2;
                }

                if (var1.field1725 == var7.field123.length - 2) {
                    var8 = true;
                }
            }

            if (var8) {
                var1.field1718.method1869(var1.field1729);
                if (null != var2) {
                    var1.field1718.method1814(var2, var3, var4);
                } else {
                    var1.field1718.method1813(var4);
                }

                if (var1.field1718.method1873()) {
                    this.field3343.field2447.method1730(var1.field1718);
                }

                var1.method1016();
                if (var1.field1724 >= 0) {
                    var1.method221();
                    if (var1.field1726 > 0 && this.field3336[var1.field1720][var1.field1726] == var1) {
                        this.field3336[var1.field1720][var1.field1726] = null;
                    }
                }

                return true;
            } else {
                var1.field1718.method1874(var1.field1729, this.method2161(var1), this.method2153(var1));
                return false;
            }
        } else {
            var1.method1016();
            var1.method221();
            if (var1.field1726 > 0 && this.field3336[var1.field1720][var1.field1726] == var1) {
                this.field3336[var1.field1720][var1.field1726] = null;
            }

            return true;
        }
    }
}
