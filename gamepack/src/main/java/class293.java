public class class293 {
    int field2122;
    int field2123;
    int field2124;
    int field2125;
    int field2126;
    int field2127;
    int[] field2128;

    class293() {
        class480 var1 = class442.field2977;
        this.field2125 = var1.method2225(16);
        this.field2123 = var1.method2225(24);
        this.field2122 = var1.method2225(24);
        this.field2124 = var1.method2225(24) + 1;
        this.field2126 = var1.method2225(6) + 1;
        this.field2127 = var1.method2225(8);
        int[] var2 = new int[this.field2126];

        int var3;
        for (var3 = 0; var3 < this.field2126; ++var3) {
            int var4 = 0;
            int var5 = var1.method2225(3);
            boolean var6 = var1.method2226() != 0;
            if (var6) {
                var4 = var1.method2225(5);
            }

            var2[var3] = var4 << 3 | var5;
        }

        this.field2128 = new int[this.field2126 * 8];

        for (var3 = 0; var3 < this.field2126 * 8; ++var3) {
            this.field2128[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? var1.method2225(8) : -1;
        }

    }

    void method1318(float[] var1, int var2, boolean var3, class480 var4) {
        int var5;
        for (var5 = 0; var5 < var2; ++var5) {
            var1[var5] = 0.0F;
        }

        if (!var3) {
            var5 = class442.field2980[this.field2127].field4090;
            int var6 = this.field2122 - this.field2123;
            int var7 = var6 / this.field2124;
            int[] var8 = new int[var7];

            for (int var9 = 0; var9 < 8; ++var9) {
                int var10 = 0;

                while (var10 < var7) {
                    int var11;
                    int var12;
                    if (var9 == 0) {
                        var11 = class442.field2980[this.field2127].method2499(var4);

                        for (var12 = var5 - 1; var12 >= 0; --var12) {
                            if (var10 + var12 < var7) {
                                var8[var10 + var12] = var11 % this.field2126;
                            }

                            var11 /= this.field2126;
                        }
                    }

                    for (var11 = 0; var11 < var5; ++var11) {
                        var12 = var8[var10];
                        int var13 = this.field2128[var12 * 8 + var9];
                        if (var13 >= 0) {
                            int var14 = this.field2123 + var10 * this.field2124;
                            class513 var15 = class442.field2980[var13];
                            int var16;
                            if (this.field2125 == 0) {
                                var16 = this.field2124 / var15.field4090;

                                for (int var20 = 0; var20 < var16; ++var20) {
                                    float[] var21 = var15.method2498(var4);

                                    for (int var19 = 0; var19 < var15.field4090; ++var19) {
                                        var1[var14 + var20 + var19 * var16] += var21[var19];
                                    }
                                }
                            } else {
                                var16 = 0;

                                while (var16 < this.field2124) {
                                    float[] var17 = var15.method2498(var4);

                                    for (int var18 = 0; var18 < var15.field4090; ++var18) {
                                        var1[var14 + var16] += var17[var18];
                                        ++var16;
                                    }
                                }
                            }
                        }

                        ++var10;
                        if (var10 >= var7) {
                            break;
                        }
                    }
                }
            }

        }
    }
}
