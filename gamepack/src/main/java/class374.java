import java.util.Random;

public class class374 {
    static int[] field2704;
    static int[] field2710;
    static int[] field2711;
    static int[] field2712;
    static int[] field2714;
    static int[] field2715;
    static int[] field2716;
    static int[] field2717;

    static {
        field2710 = new int[32768];
        Random var0 = new Random(0L);

        int var1;
        for (var1 = 0; var1 < 32768; ++var1) {
            field2710[var1] = (var0.nextInt() & 2) - 1;
        }

        field2711 = new int[32768];

        for (var1 = 0; var1 < 32768; ++var1) {
            field2711[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }

        field2715 = new int[220500];
        field2712 = new int[5];
        field2714 = new int[5];
        field2717 = new int[5];
        field2716 = new int[5];
        field2704 = new int[5];
    }

    class211 field2705;
    class469 field2694;
    class469 field2695;
    class469 field2697;
    class469 field2698;
    class469 field2699;
    class469 field2701;
    class469 field2702;
    class469 field2706;
    class469 field2713;
    int field2700;
    int field2703;
    int field2707;
    int field2708;
    int[] field2693;
    int[] field2696;
    int[] field2709;

    class374() {
        this.field2696 = new int[]{0, 0, 0, 0, 0};
        this.field2693 = new int[]{0, 0, 0, 0, 0};
        this.field2709 = new int[]{0, 0, 0, 0, 0};
        this.field2703 = 0;
        this.field2707 = 100;
        this.field2700 = 500;
        this.field2708 = 0;
    }

    final int[] method1760(int var1, int var2) {
        class292.method1317(field2715, 0, var1);
        if (var2 < 10) {
            return field2715;
        } else {
            double var3 = (double) var1 / ((double) var2 + 0.0D);
            this.field2702.method2168();
            this.field2713.method2168();
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            if (this.field2694 != null) {
                this.field2694.method2168();
                this.field2695.method2168();
                var5 = (int) ((double) (this.field2694.field3348 - this.field2694.field3351) * 32.768D / var3);
                var6 = (int) ((double) this.field2694.field3351 * 32.768D / var3);
            }

            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            if (this.field2701 != null) {
                this.field2701.method2168();
                this.field2697.method2168();
                var8 = (int) ((double) (this.field2701.field3348 - this.field2701.field3351) * 32.768D / var3);
                var9 = (int) ((double) this.field2701.field3351 * 32.768D / var3);
            }

            int var11;
            for (var11 = 0; var11 < 5; ++var11) {
                if (this.field2696[var11] != 0) {
                    field2712[var11] = 0;
                    field2714[var11] = (int) ((double) this.field2709[var11] * var3);
                    field2717[var11] = (this.field2696[var11] << 14) / 100;
                    field2716[var11] = (int) ((double) (this.field2702.field3348 - this.field2702.field3351) * 32.768D * Math.pow(1.0057929410678534D, this.field2693[var11]) / var3);
                    field2704[var11] = (int) ((double) this.field2702.field3351 * 32.768D / var3);
                }
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int[] var10000;
            for (var11 = 0; var11 < var1; ++var11) {
                var12 = this.field2702.method2167(var1);
                var13 = this.field2713.method2167(var1);
                if (this.field2694 != null) {
                    var14 = this.field2694.method2167(var1);
                    var15 = this.field2695.method2167(var1);
                    var12 += this.method1762(var7, var15, this.field2694.field3352) >> 1;
                    var7 += (var14 * var5 >> 16) + var6;
                }

                if (this.field2701 != null) {
                    var14 = this.field2701.method2167(var1);
                    var15 = this.field2697.method2167(var1);
                    var13 = var13 * ((this.method1762(var10, var15, this.field2701.field3352) >> 1) + 32768) >> 15;
                    var10 += (var14 * var8 >> 16) + var9;
                }

                for (var14 = 0; var14 < 5; ++var14) {
                    if (this.field2696[var14] != 0) {
                        var15 = var11 + field2714[var14];
                        if (var15 < var1) {
                            var10000 = field2715;
                            var10000[var15] += this.method1762(field2712[var14], var13 * field2717[var14] >> 15, this.field2702.field3352);
                            var10000 = field2712;
                            var10000[var14] += (var12 * field2716[var14] >> 16) + field2704[var14];
                        }
                    }
                }
            }

            int var16;
            if (this.field2698 != null) {
                this.field2698.method2168();
                this.field2699.method2168();
                var11 = 0;
                boolean var19 = false;
                boolean var20 = true;

                for (var14 = 0; var14 < var1; ++var14) {
                    var15 = this.field2698.method2167(var1);
                    var16 = this.field2699.method2167(var1);
                    if (var20) {
                        var12 = this.field2698.field3351 + ((this.field2698.field3348 - this.field2698.field3351) * var15 >> 8);
                    } else {
                        var12 = this.field2698.field3351 + ((this.field2698.field3348 - this.field2698.field3351) * var16 >> 8);
                    }

                    var11 += 256;
                    if (var11 >= var12) {
                        var11 = 0;
                        var20 = !var20;
                    }

                    if (var20) {
                        field2715[var14] = 0;
                    }
                }
            }

            if (this.field2703 > 0 && this.field2707 > 0) {
                var11 = (int) ((double) this.field2703 * var3);

                for (var12 = var11; var12 < var1; ++var12) {
                    var10000 = field2715;
                    var10000[var12] += field2715[var12 - var11] * this.field2707 / 100;
                }
            }

            if (this.field2705.field1691[0] > 0 || this.field2705.field1691[1] > 0) {
                this.field2706.method2168();
                var11 = this.field2706.method2167(var1 + 1);
                var12 = this.field2705.method1008(0, (float) var11 / 65536.0F);
                var13 = this.field2705.method1008(1, (float) var11 / 65536.0F);
                if (var1 >= var12 + var13) {
                    var14 = 0;
                    var15 = var13;
                    if (var13 > var1 - var12) {
                        var15 = var1 - var12;
                    }

                    int var17;
                    while (var14 < var15) {
                        var16 = (int) ((long) field2715[var14 + var12] * (long) class211.field1694 >> 16);

                        for (var17 = 0; var17 < var12; ++var17) {
                            var16 += (int) ((long) field2715[var14 + var12 - 1 - var17] * (long) class211.field1688[0][var17] >> 16);
                        }

                        for (var17 = 0; var17 < var14; ++var17) {
                            var16 -= (int) ((long) field2715[var14 - 1 - var17] * (long) class211.field1688[1][var17] >> 16);
                        }

                        field2715[var14] = var16;
                        var11 = this.field2706.method2167(var1 + 1);
                        ++var14;
                    }

                    boolean var21 = true;
                    var15 = 128;

                    while (true) {
                        if (var15 > var1 - var12) {
                            var15 = var1 - var12;
                        }

                        int var18;
                        while (var14 < var15) {
                            var17 = (int) ((long) field2715[var14 + var12] * (long) class211.field1694 >> 16);

                            for (var18 = 0; var18 < var12; ++var18) {
                                var17 += (int) ((long) field2715[var14 + var12 - 1 - var18] * (long) class211.field1688[0][var18] >> 16);
                            }

                            for (var18 = 0; var18 < var13; ++var18) {
                                var17 -= (int) ((long) field2715[var14 - 1 - var18] * (long) class211.field1688[1][var18] >> 16);
                            }

                            field2715[var14] = var17;
                            var11 = this.field2706.method2167(var1 + 1);
                            ++var14;
                        }

                        if (var14 >= var1 - var12) {
                            while (var14 < var1) {
                                var17 = 0;

                                for (var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                                    var17 += (int) ((long) field2715[var14 + var12 - 1 - var18] * (long) class211.field1688[0][var18] >> 16);
                                }

                                for (var18 = 0; var18 < var13; ++var18) {
                                    var17 -= (int) ((long) field2715[var14 - 1 - var18] * (long) class211.field1688[1][var18] >> 16);
                                }

                                field2715[var14] = var17;
                                this.field2706.method2167(var1 + 1);
                                ++var14;
                            }
                            break;
                        }

                        var12 = this.field2705.method1008(0, (float) var11 / 65536.0F);
                        var13 = this.field2705.method1008(1, (float) var11 / 65536.0F);
                        var15 += 128;
                    }
                }
            }

            for (var11 = 0; var11 < var1; ++var11) {
                if (field2715[var11] < -32768) {
                    field2715[var11] = -32768;
                }

                if (field2715[var11] > 32767) {
                    field2715[var11] = 32767;
                }
            }

            return field2715;
        }
    }

    final int method1762(int var1, int var2, int var3) {
        if (var3 == 1) {
            return (var1 & 32767) < 16384 ? var2 : -var2;
        } else if (var3 == 2) {
            return field2711[var1 & 32767] * var2 >> 14;
        } else if (var3 == 3) {
            return ((var1 & 32767) * var2 >> 14) - var2;
        } else {
            return var3 == 4 ? field2710[var1 / 2607 & 32767] * var2 : 0;
        }
    }

    final void method1761(class78 var1) {
        this.field2702 = new class469();
        this.field2702.method2169(var1);
        this.field2713 = new class469();
        this.field2713.method2169(var1);
        int var2 = var1.method260();
        if (var2 != 0) {
            --var1.field697;
            this.field2694 = new class469();
            this.field2694.method2169(var1);
            this.field2695 = new class469();
            this.field2695.method2169(var1);
        }

        var2 = var1.method260();
        if (var2 != 0) {
            --var1.field697;
            this.field2701 = new class469();
            this.field2701.method2169(var1);
            this.field2697 = new class469();
            this.field2697.method2169(var1);
        }

        var2 = var1.method260();
        if (var2 != 0) {
            --var1.field697;
            this.field2698 = new class469();
            this.field2698.method2169(var1);
            this.field2699 = new class469();
            this.field2699.method2169(var1);
        }

        for (int var3 = 0; var3 < 10; ++var3) {
            int var4 = var1.method307();
            if (var4 == 0) {
                break;
            }

            this.field2696[var3] = var4;
            this.field2693[var3] = var1.method271();
            this.field2709[var3] = var1.method307();
        }

        this.field2703 = var1.method307();
        this.field2707 = var1.method307();
        this.field2700 = var1.method309();
        this.field2708 = var1.method309();
        this.field2705 = new class211();
        this.field2706 = new class469();
        this.field2705.method1004(var1, this.field2706);
    }
}
