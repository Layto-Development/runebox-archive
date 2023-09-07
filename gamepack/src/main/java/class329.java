public class class329 {
    static class158 field2414;
    boolean field2394;
    boolean field2396;
    boolean field2408;
    boolean field2409;
    class410 field2395;
    class410 field2415;
    class518[] field2397;
    float field2393;
    float field2398;
    float field2399;
    float field2400;
    float field2401;
    float field2402;
    float field2403;
    float field2404;
    float field2405;
    float field2406;
    float field2413;
    float field2416;
    float[] field2410;
    int field2407;
    int field2411;
    int field2412;

    class329() {
        this.field2409 = true;
        this.field2407 = 0;
    }

    int method1525(class78 var1, int var2, byte var3) {
        int var4 = var1.method309();
        int var5 = var1.method260();
        class85[] var6 = new class85[]{class85.field727, class85.field725, class85.field726, class85.field730, class85.field728, class85.field729, class85.field724, class85.field731, class85.field732};
        class85 var7 = (class85) class27.method80(var6, var5);
        if (null == var7) {
            var7 = class85.field732;
        }

        this.field2395 = class410.method1900(var1.method260());
        this.field2415 = class410.method1900(var1.method260());
        this.field2408 = var1.method260() != 0;
        this.field2397 = new class518[var4];
        class518 var9 = null;

        for (int var10 = 0; var10 < var4; ++var10) {
            class518 var8 = new class518();
            var8.method2515(var1, var2);
            this.field2397[var10] = var8;
            if (null != var9) {
                var9.field4180 = var8;
            }

            var9 = var8;
        }

        return var4;
    }

    void method1526() {
        this.field2411 = this.field2397[0].field4174;
        this.field2412 = this.field2397[this.method1530() - 1].field4174;
        this.field2410 = new float[this.method1532() + 1];

        for (int var2 = this.method1528(); var2 <= this.method1524(); ++var2) {
            this.field2410[var2 - this.method1528()] = class151.method718(this, (float) var2);
        }

        this.field2397 = null;
        this.field2413 = class151.method718(this, (float) (this.method1528() - 1));
        this.field2404 = class151.method718(this, (float) (this.method1524() + 1));
    }

    public float method1527(int var1) {
        if (var1 < this.method1528()) {
            return this.field2413;
        } else {
            return var1 > this.method1524() ? this.field2404 : this.field2410[var1 - this.method1528()];
        }
    }

    int method1528() {
        return this.field2411;
    }

    int method1524() {
        return this.field2412;
    }

    int method1532() {
        return this.method1524() - this.method1528();
    }

    int method1531(float var1) {
        if (this.field2407 < 0 || (float) this.field2397[this.field2407].field4174 > var1 || this.field2397[this.field2407].field4180 != null && (float) this.field2397[this.field2407].field4180.field4174 <= var1) {
            if (var1 >= (float) this.method1528() && var1 <= (float) this.method1524()) {
                int var3 = this.method1530();
                int var4 = this.field2407;
                if (var3 > 0) {
                    int var5 = 0;
                    int var6 = var3 - 1;

                    do {
                        int var7 = var6 + var5 >> 1;
                        if (var1 < (float) this.field2397[var7].field4174) {
                            if (var1 > (float) this.field2397[var7 - 1].field4174) {
                                var4 = var7 - 1;
                                break;
                            }

                            var6 = var7 - 1;
                        } else {
                            if (var1 <= (float) this.field2397[var7].field4174) {
                                var4 = var7;
                                break;
                            }

                            if (var1 < (float) this.field2397[var7 + 1].field4174) {
                                var4 = var7;
                                break;
                            }

                            var5 = var7 + 1;
                        }
                    } while (var5 <= var6);
                }

                if (this.field2407 != var4) {
                    this.field2407 = var4;
                    this.field2409 = true;
                }

                return this.field2407;
            } else {
                return -1;
            }
        } else {
            return this.field2407;
        }
    }

    class518 method1529(float var1) {
        int var3 = this.method1531(var1);
        return var3 >= 0 && var3 < this.field2397.length ? this.field2397[var3] : null;
    }

    int method1530() {
        return null == this.field2397 ? 0 : this.field2397.length;
    }
}
