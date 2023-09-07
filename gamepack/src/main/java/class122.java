public final class class122 {
    static final int[] field1102;
    static final int[] field1103;
    static final int[] field1104;
    static final int[] field1105;
    static final int[] field1108;
    static final int[] field1110;
    static byte[][][] field1109;
    static class372 field1098;
    static int field1097;
    static int field1099;
    static int field1106;
    static int field1111;
    static int[] field1101;
    static int[][][] field1107;
    static short[][][] field1100;

    static {
        field1107 = new int[4][105][105];
        field1109 = new byte[4][104][104];
        field1099 = 99;
        field1102 = new int[]{1, 2, 4, 8};
        field1103 = new int[]{16, 32, 64, 128};
        field1104 = new int[]{1, 0, -1, 0};
        field1105 = new int[]{0, -1, 0, 1};
        field1110 = new int[]{1, -1, -1, 1};
        field1108 = new int[]{-1, -1, 1, 1};
        field1106 = (int) (Math.random() * 17.0D) - 8;
        field1111 = (int) (Math.random() * 33.0D) - 16;
    }

    class122() throws Throwable {
    }

    public static class331 method539(class68 var0, int var1, int var2) {
        return !class274.method1222(var0, var1, 0) ? null : class274.method1224();
    }

    static void method555() {
        field1099 = 99;
        field1100 = new short[4][104][104];
        class139.field1225 = new short[4][104][104];
        class313.field2260 = new byte[4][104][104];
        class449.field3106 = new byte[4][104][104];
        class530.field4225 = new int[4][105][105];
        class447.field3032 = new byte[4][105][105];
        class173.field1455 = new int[105][105];
        class129.field1149 = new int[104];
        class96.field778 = new int[104];
        field1101 = new int[104];
        class410.field2894 = new int[104];
        class269.field1984 = new int[104];
    }

    static void method542() {
        field1100 = null;
        class139.field1225 = null;
        class313.field2260 = null;
        class449.field3106 = null;
        class530.field4225 = null;
        class447.field3032 = null;
        class173.field1455 = null;
        class129.field1149 = null;
        class96.field778 = null;
        field1101 = null;
        class410.field2894 = null;
        class269.field1984 = null;
    }

    static void method541(int var0, int var1, int var2, int var3) {
        for (int var5 = var1; var5 <= var1 + var3; ++var5) {
            for (int var6 = var0; var6 <= var0 + var2; ++var6) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class447.field3032[0][var6][var5] = 127;
                    if (var6 == var0 && var6 > 0) {
                        field1107[0][var6][var5] = field1107[0][var6 - 1][var5];
                    }

                    if (var6 == var2 + var0 && var6 < 103) {
                        field1107[0][var6][var5] = field1107[0][var6 + 1][var5];
                    }

                    if (var5 == var1 && var5 > 0) {
                        field1107[0][var6][var5] = field1107[0][var6][var5 - 1];
                    }

                    if (var5 == var3 + var1 && var5 < 103) {
                        field1107[0][var6][var5] = field1107[0][var6][var5 + 1];
                    }
                }
            }
        }

    }

    static void method551(byte[] var0, int var1, int var2, int var3, int var4, class11[] var5) {
        int var8;
        int var9;
        for (int var7 = 0; var7 < 4; ++var7) {
            for (var8 = 0; var8 < 64; ++var8) {
                for (var9 = 0; var9 < 64; ++var9) {
                    if (var8 + var1 > 0 && var1 + var8 < 103 && var9 + var2 > 0 && var2 + var9 < 103) {
                        int[] var10000 = var5[var7].field53[var8 + var1];
                        var10000[var2 + var9] &= -16777217;
                    }
                }
            }
        }

        class78 var13 = new class78(var0);

        for (var8 = 0; var8 < 4; ++var8) {
            for (var9 = 0; var9 < 64; ++var9) {
                for (int var10 = 0; var10 < 64; ++var10) {
                    int var11 = var1 + var9;
                    int var12 = var2 + var10;
                    method543(var13, var8, var11, var12, var3 + var11, var12 + var4, 0);
                }
            }
        }

    }

    static void method554(int var0, int var1, int var2) {
        int var4;
        for (var4 = 0; var4 < 8; ++var4) {
            for (int var5 = 0; var5 < 8; ++var5) {
                field1107[var0][var4 + var1][var5 + var2] = 0;
            }
        }

        if (var1 > 0) {
            for (var4 = 1; var4 < 8; ++var4) {
                field1107[var0][var1][var2 + var4] = field1107[var0][var1 - 1][var4 + var2];
            }
        }

        if (var2 > 0) {
            for (var4 = 1; var4 < 8; ++var4) {
                field1107[var0][var1 + var4][var2] = field1107[var0][var4 + var1][var2 - 1];
            }
        }

        if (var1 > 0 && field1107[var0][var1 - 1][var2] != 0) {
            field1107[var0][var1][var2] = field1107[var0][var1 - 1][var2];
        } else if (var2 > 0 && field1107[var0][var1][var2 - 1] != 0) {
            field1107[var0][var1][var2] = field1107[var0][var1][var2 - 1];
        } else if (var1 > 0 && var2 > 0 && field1107[var0][var1 - 1][var2 - 1] != 0) {
            field1107[var0][var1][var2] = field1107[var0][var1 - 1][var2 - 1];
        }

    }

    static void method543(class78 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        int var8;
        if (class458.method2116(var1, var2, var3)) {
            field1109[var1][var2][var3] = 0;

            while (true) {
                var8 = var0.method309();
                if (var8 == 0) {
                    if (var1 == 0) {
                        int[] var15 = field1107[0][var2];
                        int var12 = var4 + 932731;
                        int var13 = var5 + 556238;
                        int var14 = method549(var12 + 45365, var13 + 91923, 4) - 128 + (method549(var12 + 10294, var13 + 37821, 2) - 128 >> 1) + (method549(var12, var13, 1) - 128 >> 2);
                        var14 = (int) ((double) var14 * 0.3D) + 35;
                        if (var14 < 10) {
                            var14 = 10;
                        } else if (var14 > 60) {
                            var14 = 60;
                        }

                        var15[var3] = -var14 * 8;
                    } else {
                        field1107[var1][var2][var3] = field1107[var1 - 1][var2][var3] - 240;
                    }
                    break;
                }

                if (var8 == 1) {
                    int var9 = var0.method260();
                    if (var9 == 1) {
                        var9 = 0;
                    }

                    if (var1 == 0) {
                        field1107[0][var2][var3] = -var9 * 8;
                    } else {
                        field1107[var1][var2][var3] = field1107[var1 - 1][var2][var3] - var9 * 8;
                    }
                    break;
                }

                if (var8 <= 49) {
                    class139.field1225[var1][var2][var3] = (short) var0.method262();
                    class313.field2260[var1][var2][var3] = (byte) ((var8 - 2) / 4);
                    class449.field3106[var1][var2][var3] = (byte) (var8 - 2 + var6 & 3);
                } else if (var8 <= 81) {
                    field1109[var1][var2][var3] = (byte) (var8 - 49);
                } else {
                    field1100[var1][var2][var3] = (short) (var8 - 81);
                }
            }
        } else {
            while (true) {
                var8 = var0.method309();
                if (var8 == 0) {
                    break;
                }

                if (var8 == 1) {
                    var0.method260();
                    break;
                }

                if (var8 <= 49) {
                    var0.method262();
                }
            }
        }

    }

    static boolean method548(byte[] var0, int var1, int var2) {
        boolean var4 = true;
        class78 var5 = new class78(var0);
        int var6 = -1;

        label57:
        while (true) {
            int var7 = var5.method273();
            if (var7 == 0) {
                return var4;
            }

            var6 += var7;
            int var8 = 0;
            boolean var9 = false;

            while (true) {
                int var10;
                while (!var9) {
                    var10 = var5.method307();
                    if (var10 == 0) {
                        continue label57;
                    }

                    var8 += var10 - 1;
                    int var11 = var8 & 63;
                    int var12 = var8 >> 6 & 63;
                    int var13 = var5.method260() >> 2;
                    int var14 = var12 + var1;
                    int var15 = var11 + var2;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class304 var16 = class192.method892(var6, (byte) -45);
                        if (var13 != 22 || !Client.field3779 || var16.field2199 != 0 || var16.field2192 == 1 || var16.field2179) {
                            if (!var16.method1342()) {
                                ++Client.field3847;
                                var4 = false;
                            }

                            var9 = true;
                        }
                    }
                }

                var10 = var5.method307();
                if (var10 == 0) {
                    break;
                }

                var5.method260();
            }
        }
    }

    static void method556(byte[] var0, int var1, int var2, class158 var3, class11[] var4) {
        class78 var6 = new class78(var0);
        int var7 = -1;

        while (true) {
            int var8 = var6.method273();
            if (var8 == 0) {
                return;
            }

            var7 += var8;
            int var9 = 0;

            while (true) {
                int var10 = var6.method307();
                if (var10 == 0) {
                    break;
                }

                var9 += var10 - 1;
                int var11 = var9 & 63;
                int var12 = var9 >> 6 & 63;
                int var13 = var9 >> 12;
                int var14 = var6.method260();
                int var15 = var14 >> 2;
                int var16 = var14 & 3;
                int var17 = var1 + var12;
                int var18 = var11 + var2;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    int var19 = var13;
                    if ((field1109[1][var17][var18] & 2) == 2) {
                        var19 = var13 - 1;
                    }

                    class11 var20 = null;
                    if (var19 >= 0) {
                        var20 = var4[var19];
                    }

                    class410.method1899(var13, var17, var18, var7, var16, var15, var3, var20);
                }
            }
        }
    }

    static void method538(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class158 var8, class11[] var9) {
        class78 var10 = new class78(var0);
        int var11 = -1;

        while (true) {
            int var12 = var10.method273();
            if (var12 == 0) {
                return;
            }

            var11 += var12;
            int var13 = 0;

            while (true) {
                int var14 = var10.method307();
                if (var14 == 0) {
                    break;
                }

                var13 += var14 - 1;
                int var15 = var13 & 63;
                int var16 = var13 >> 6 & 63;
                int var17 = var13 >> 12;
                int var18 = var10.method260();
                int var19 = var18 >> 2;
                int var20 = var18 & 3;
                if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
                    class304 var21 = class192.method892(var11, (byte) -48);
                    int var24 = var16 & 7;
                    int var25 = var15 & 7;
                    int var27 = var21.field2190;
                    int var28 = var21.field2175;
                    int var29;
                    if ((var20 & 1) == 1) {
                        var29 = var27;
                        var27 = var28;
                        var28 = var29;
                    }

                    int var26 = var7 & 3;
                    int var23;
                    if (var26 == 0) {
                        var23 = var24;
                    } else if (var26 == 1) {
                        var23 = var25;
                    } else if (var26 == 2) {
                        var23 = 7 - var24 - (var27 - 1);
                    } else {
                        var23 = 7 - var25 - (var28 - 1);
                    }

                    var29 = var2 + var23;
                    int var30 = var3 + class457.method2114(var16 & 7, var15 & 7, var7, var21.field2190, var21.field2175, var20);
                    if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) {
                        int var31 = var1;
                        if ((field1109[1][var29][var30] & 2) == 2) {
                            var31 = var1 - 1;
                        }

                        class11 var32 = null;
                        if (var31 >= 0) {
                            var32 = var9[var31];
                        }

                        class410.method1899(var1, var29, var30, var11, var7 + var20 & 3, var19, var8, var32);
                    }
                }
            }
        }
    }

    static void method546(class158 var0, class11[] var1) {
        int var3;
        int var4;
        int var5;
        int var6;
        for (var3 = 0; var3 < 4; ++var3) {
            for (var4 = 0; var4 < 104; ++var4) {
                for (var5 = 0; var5 < 104; ++var5) {
                    if ((field1109[var3][var4][var5] & 1) == 1) {
                        var6 = var3;
                        if ((field1109[1][var4][var5] & 2) == 2) {
                            var6 = var3 - 1;
                        }

                        if (var6 >= 0) {
                            var1[var6].method24(var4, var5);
                        }
                    }
                }
            }
        }

        field1106 += (int) (Math.random() * 5.0D) - 2;
        if (field1106 < -8) {
            field1106 = -8;
        }

        if (field1106 > 8) {
            field1106 = 8;
        }

        field1111 += (int) (Math.random() * 5.0D) - 2;
        if (field1111 < -16) {
            field1111 = -16;
        }

        if (field1111 > 16) {
            field1111 = 16;
        }

        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int[] var10000;
        int var17;
        int var18;
        int var19;
        for (var3 = 0; var3 < 4; ++var3) {
            byte[][] var48 = class447.field3032[var3];
            boolean var49 = true;
            boolean var50 = true;
            boolean var7 = true;
            boolean var8 = true;
            boolean var9 = true;
            var10 = (int) Math.sqrt(5100.0D);
            var11 = var10 * 768 >> 8;

            int var20;
            int var21;
            for (var12 = 1; var12 < 103; ++var12) {
                for (var13 = 1; var13 < 103; ++var13) {
                    var14 = field1107[var3][var13 + 1][var12] - field1107[var3][var13 - 1][var12];
                    var15 = field1107[var3][var13][var12 + 1] - field1107[var3][var13][var12 - 1];
                    var16 = (int) Math.sqrt(var15 * var15 + 65536 + var14 * var14);
                    var17 = (var14 << 8) / var16;
                    var18 = 65536 / var16;
                    var19 = (var15 << 8) / var16;
                    var20 = (var19 * -50 + var18 * -10 + var17 * -50) / var11 + 96;
                    var21 = (var48[var13][var12] >> 1) + (var48[var13][var12 + 1] >> 3) + (var48[var13 - 1][var12] >> 2) + (var48[var13 + 1][var12] >> 3) + (var48[var13][var12 - 1] >> 2);
                    class173.field1455[var13][var12] = var20 - var21;
                }
            }

            for (var12 = 0; var12 < 104; ++var12) {
                class129.field1149[var12] = 0;
                class96.field778[var12] = 0;
                field1101[var12] = 0;
                class410.field2894[var12] = 0;
                class269.field1984[var12] = 0;
            }

            for (var12 = -5; var12 < 109; ++var12) {
                for (var13 = 0; var13 < 104; ++var13) {
                    var14 = var12 + 5;
                    int var10002;
                    if (var14 >= 0 && var14 < 104) {
                        long var54 = (long) Math.pow(2.0D, 15.0D) - 1L;
                        var17 = (int) var54;
                        var18 = field1100[var3][var14][var13] & var17;
                        if (var18 > 0) {
                            var20 = var18 - 1;
                            class470 var59 = (class470) class470.field3360.method1307(var20);
                            class470 var57;
                            if (var59 != null) {
                                var57 = var59;
                            } else {
                                byte[] var22 = class470.field3359.method188(1, var20);
                                var59 = new class470();
                                if (null != var22) {
                                    var59.method2172(new class78(var22), var20);
                                }

                                var59.method2171();
                                class470.field3360.method1306(var59, var20);
                                var57 = var59;
                            }

                            var10000 = class129.field1149;
                            var10000[var13] += var57.field3365;
                            var10000 = class96.field778;
                            var10000[var13] += var57.field3363;
                            var10000 = field1101;
                            var10000[var13] += var57.field3362;
                            var10000 = class410.field2894;
                            var10000[var13] += var57.field3364;
                            var10002 = class269.field1984[var13]++;
                        }
                    }

                    var15 = var12 - 5;
                    if (var15 >= 0 && var15 < 104) {
                        long var55 = (long) Math.pow(2.0D, 15.0D) - 1L;
                        var18 = (int) var55;
                        var19 = field1100[var3][var15][var13] & var18;
                        if (var19 > 0) {
                            var21 = var19 - 1;
                            class470 var60 = (class470) class470.field3360.method1307(var21);
                            class470 var58;
                            if (null != var60) {
                                var58 = var60;
                            } else {
                                byte[] var23 = class470.field3359.method188(1, var21);
                                var60 = new class470();
                                if (null != var23) {
                                    var60.method2172(new class78(var23), var21);
                                }

                                var60.method2171();
                                class470.field3360.method1306(var60, var21);
                                var58 = var60;
                            }

                            var10000 = class129.field1149;
                            var10000[var13] -= var58.field3365;
                            var10000 = class96.field778;
                            var10000[var13] -= var58.field3363;
                            var10000 = field1101;
                            var10000[var13] -= var58.field3362;
                            var10000 = class410.field2894;
                            var10000[var13] -= var58.field3364;
                            var10002 = class269.field1984[var13]--;
                        }
                    }
                }

                if (var12 >= 1 && var12 < 103) {
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    var17 = 0;

                    for (var18 = -5; var18 < 109; ++var18) {
                        var19 = var18 + 5;
                        if (var19 >= 0 && var19 < 104) {
                            var13 += class129.field1149[var19];
                            var14 += class96.field778[var19];
                            var15 += field1101[var19];
                            var16 += class410.field2894[var19];
                            var17 += class269.field1984[var19];
                        }

                        var20 = var18 - 5;
                        if (var20 >= 0 && var20 < 104) {
                            var13 -= class129.field1149[var20];
                            var14 -= class96.field778[var20];
                            var15 -= field1101[var20];
                            var16 -= class410.field2894[var20];
                            var17 -= class269.field1984[var20];
                        }

                        if (var18 >= 1 && var18 < 103 && (!Client.field3779 || (field1109[0][var12][var18] & 2) != 0 || (field1109[var3][var12][var18] & 16) == 0)) {
                            if (var3 < field1099) {
                                field1099 = var3;
                            }

                            long var61 = (long) Math.pow(2.0D, 15.0D) - 1L;
                            int var62 = (int) var61;
                            int var24 = field1100[var3][var12][var18] & var62;
                            int var25 = class139.field1225[var3][var12][var18] & var62;
                            if (var24 > 0 || var25 > 0) {
                                int var26 = field1107[var3][var12][var18];
                                int var27 = field1107[var3][var12 + 1][var18];
                                int var28 = field1107[var3][var12 + 1][var18 + 1];
                                int var29 = field1107[var3][var12][var18 + 1];
                                int var30 = class173.field1455[var12][var18];
                                int var31 = class173.field1455[var12 + 1][var18];
                                int var32 = class173.field1455[var12 + 1][var18 + 1];
                                int var33 = class173.field1455[var12][var18 + 1];
                                int var34 = -1;
                                int var35 = -1;
                                int var36;
                                int var37;
                                int var38;
                                if (var24 > 0) {
                                    var36 = var13 * 256 / var16;
                                    var37 = var14 / var17;
                                    var38 = var15 / var17;
                                    var34 = method547(var36, var37, var38);
                                    var36 = var36 + field1106 & 255;
                                    var38 += field1111;
                                    if (var38 < 0) {
                                        var38 = 0;
                                    } else if (var38 > 255) {
                                        var38 = 255;
                                    }

                                    var35 = method547(var36, var37, var38);
                                }

                                class475 var39;
                                if (var3 > 0) {
                                    boolean var63 = var24 != 0 || class313.field2260[var3][var12][var18] == 0;

									if (var25 > 0) {
                                        var38 = var25 - 1;
                                        var39 = (class475) class475.field3404.method1307(var38);
                                        class475 var64;
                                        if (null != var39) {
                                            var64 = var39;
                                        } else {
                                            byte[] var40 = class475.field3409.method188(4, var38);
                                            var39 = new class475();
                                            if (var40 != null) {
                                                var39.method2179(new class78(var40), var38);
                                            }

                                            var39.method2178();
                                            class475.field3404.method1306(var39, var38);
                                            var64 = var39;
                                        }

                                        if (!var64.field3400) {
                                            var63 = false;
                                        }
                                    }

                                    if (var63 && var27 == var26 && var28 == var26 && var26 == var29) {
                                        var10000 = class530.field4225[var3][var12];
                                        var10000[var18] |= 2340;
                                    }
                                }

                                var36 = 0;
                                if (var35 != -1) {
                                    var36 = class334.field2426[method545(var35, 96)];
                                }

                                if (var25 == 0) {
                                    var0.method776(var3, var12, var18, 0, 0, -1, var26, var27, var28, var29, method545(var34, var30), method545(var34, var31), method545(var34, var32), method545(var34, var33), 0, 0, 0, 0, var36, 0);
                                } else {
                                    var37 = 1 + class313.field2260[var3][var12][var18];
                                    byte var65 = class449.field3106[var3][var12][var18];
                                    int var66 = var25 - 1;
                                    class475 var41 = (class475) class475.field3404.method1307(var66);
                                    if (null != var41) {
                                        var39 = var41;
                                    } else {
                                        byte[] var42 = class475.field3409.method188(4, var66);
                                        var41 = new class475();
                                        if (var42 != null) {
                                            var41.method2179(new class78(var42), var66);
                                        }

                                        var41.method2178();
                                        class475.field3404.method1306(var41, var66);
                                        var39 = var41;
                                    }

                                    int var67 = var39.field3397;
                                    int var43;
                                    int var44;
                                    int var45;
                                    int var46;
                                    if (var67 >= 0) {
                                        var44 = class334.field2431.field2606.method1332(var67);
                                        var43 = -1;
                                    } else if (var39.field3398 == 16711935) {
                                        var43 = -2;
                                        var67 = -1;
                                        var44 = -2;
                                    } else {
                                        var43 = method547(var39.field3402, var39.field3403, var39.field3408);
                                        var45 = field1106 + var39.field3402 & 255;
                                        var46 = var39.field3408 + field1111;
                                        if (var46 < 0) {
                                            var46 = 0;
                                        } else if (var46 > 255) {
                                            var46 = 255;
                                        }

                                        var44 = method547(var45, var39.field3403, var46);
                                    }

                                    var45 = 0;
                                    if (var44 != -2) {
                                        var45 = class334.field2426[method544(var44, 96)];
                                    }

                                    if (var39.field3401 != -1) {
                                        var46 = field1106 + var39.field3406 & 255;
                                        int var47 = field1111 + var39.field3407;
                                        if (var47 < 0) {
                                            var47 = 0;
                                        } else if (var47 > 255) {
                                            var47 = 255;
                                        }

                                        var44 = method547(var46, var39.field3405, var47);
                                        var45 = class334.field2426[method544(var44, 96)];
                                    }

                                    var0.method776(var3, var12, var18, var37, var65, var67, var26, var27, var28, var29, method545(var34, var30), method545(var34, var31), method545(var34, var32), method545(var34, var33), method544(var43, var30), method544(var43, var31), method544(var43, var32), method544(var43, var33), var36, var45);
                                }
                            }
                        }
                    }
                }
            }

            for (var12 = 1; var12 < 103; ++var12) {
                for (var13 = 1; var13 < 103; ++var13) {
                    var0.method791(var3, var13, var12, method550(var3, var13, var12));
                }
            }

            field1100[var3] = null;
            class139.field1225[var3] = null;
            class313.field2260[var3] = null;
            class449.field3106[var3] = null;
            class447.field3032[var3] = null;
        }

        var0.method756(-50, -10, -50);

        for (var3 = 0; var3 < 104; ++var3) {
            for (var4 = 0; var4 < 104; ++var4) {
                if ((field1109[1][var3][var4] & 2) == 2) {
                    var0.method739(var3, var4);
                }
            }
        }

        var3 = 1;
        var4 = 2;
        var5 = 4;

        for (var6 = 0; var6 < 4; ++var6) {
            if (var6 > 0) {
                var3 <<= 3;
                var4 <<= 3;
                var5 <<= 3;
            }

            for (int var51 = 0; var51 <= var6; ++var51) {
                for (int var52 = 0; var52 <= 104; ++var52) {
                    for (int var53 = 0; var53 <= 104; ++var53) {
                        boolean var56;
                        if ((class530.field4225[var51][var53][var52] & var3) != 0) {
                            var10 = var52;
                            var11 = var52;
                            var12 = var51;

                            for (var13 = var51; var10 > 0 && (class530.field4225[var51][var53][var10 - 1] & var3) != 0; --var10) {
                            }

                            while (var11 < 104 && (class530.field4225[var51][var53][var11 + 1] & var3) != 0) {
                                ++var11;
                            }

                            label367:
                            while (var12 > 0) {
                                for (var14 = var10; var14 <= var11; ++var14) {
                                    if ((class530.field4225[var12 - 1][var53][var14] & var3) == 0) {
                                        break label367;
                                    }
                                }

                                --var12;
                            }

                            label356:
                            while (var13 < var6) {
                                for (var14 = var10; var14 <= var11; ++var14) {
                                    if ((class530.field4225[var13 + 1][var53][var14] & var3) == 0) {
                                        break label356;
                                    }
                                }

                                ++var13;
                            }

                            var14 = (var13 + 1 - var12) * (1 + (var11 - var10));
                            if (var14 >= 8) {
                                var56 = true;
                                var16 = field1107[var13][var53][var10] - 240;
                                var17 = field1107[var12][var53][var10];
                                class158.method740(var6, 1, var53 * 128, var53 * 128, var10 * 128, var11 * 128 + 128, var16, var17);

                                for (var18 = var12; var18 <= var13; ++var18) {
                                    for (var19 = var10; var19 <= var11; ++var19) {
                                        var10000 = class530.field4225[var18][var53];
                                        var10000[var19] &= ~var3;
                                    }
                                }
                            }
                        }

                        if ((class530.field4225[var51][var53][var52] & var4) != 0) {
                            var10 = var53;
                            var11 = var53;
                            var12 = var51;

                            for (var13 = var51; var10 > 0 && (class530.field4225[var51][var10 - 1][var52] & var4) != 0; --var10) {
                            }

                            while (var11 < 104 && (class530.field4225[var51][var11 + 1][var52] & var4) != 0) {
                                ++var11;
                            }

                            label420:
                            while (var12 > 0) {
                                for (var14 = var10; var14 <= var11; ++var14) {
                                    if ((class530.field4225[var12 - 1][var14][var52] & var4) == 0) {
                                        break label420;
                                    }
                                }

                                --var12;
                            }

                            label409:
                            while (var13 < var6) {
                                for (var14 = var10; var14 <= var11; ++var14) {
                                    if ((class530.field4225[var13 + 1][var14][var52] & var4) == 0) {
                                        break label409;
                                    }
                                }

                                ++var13;
                            }

                            var14 = (1 + (var11 - var10)) * (var13 + 1 - var12);
                            if (var14 >= 8) {
                                var56 = true;
                                var16 = field1107[var13][var10][var52] - 240;
                                var17 = field1107[var12][var10][var52];
                                class158.method740(var6, 2, var10 * 128, 128 + var11 * 128, var52 * 128, var52 * 128, var16, var17);

                                for (var18 = var12; var18 <= var13; ++var18) {
                                    for (var19 = var10; var19 <= var11; ++var19) {
                                        var10000 = class530.field4225[var18][var19];
                                        var10000[var52] &= ~var4;
                                    }
                                }
                            }
                        }

                        if ((class530.field4225[var51][var53][var52] & var5) != 0) {
                            var10 = var53;
                            var11 = var53;
                            var12 = var52;

                            for (var13 = var52; var12 > 0 && (class530.field4225[var51][var53][var12 - 1] & var5) != 0; --var12) {
                            }

                            while (var13 < 104 && (class530.field4225[var51][var53][var13 + 1] & var5) != 0) {
                                ++var13;
                            }

                            label473:
                            while (var10 > 0) {
                                for (var14 = var12; var14 <= var13; ++var14) {
                                    if ((class530.field4225[var51][var10 - 1][var14] & var5) == 0) {
                                        break label473;
                                    }
                                }

                                --var10;
                            }

                            label462:
                            while (var11 < 104) {
                                for (var14 = var12; var14 <= var13; ++var14) {
                                    if ((class530.field4225[var51][var11 + 1][var14] & var5) == 0) {
                                        break label462;
                                    }
                                }

                                ++var11;
                            }

                            if ((var13 - var12 + 1) * (var11 - var10 + 1) >= 4) {
                                var14 = field1107[var51][var10][var12];
                                class158.method740(var6, 4, var10 * 128, var11 * 128 + 128, var12 * 128, var13 * 128 + 128, var14, var14);

                                for (var15 = var10; var15 <= var11; ++var15) {
                                    for (var16 = var12; var16 <= var13; ++var16) {
                                        var10000 = class530.field4225[var51][var15];
                                        var10000[var16] &= ~var5;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    static int method550(int var0, int var1, int var2) {
        if ((field1109[var0][var1][var2] & 8) != 0) {
            return 0;
        } else {
            return var0 > 0 && (field1109[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
        }
    }

    static int method549(int var0, int var1, int var2) {
        int var4 = var0 / var2;
        int var5 = var0 & var2 - 1;
        int var6 = var1 / var2;
        int var7 = var1 & var2 - 1;
        int var8 = method552(var4, var6);
        int var9 = method552(var4 + 1, var6);
        int var10 = method552(var4, var6 + 1);
        int var11 = method552(var4 + 1, var6 + 1);
        int var12 = method540(var8, var9, var5, var2);
        int var13 = method540(var10, var11, var5, var2);
        return method540(var12, var13, var7, var2);
    }

    static int method540(int var0, int var1, int var2, int var3) {
        int var5 = 65536 - class334.field2427[var2 * 1024 / var3] >> 1;
        return (var0 * (65536 - var5) >> 16) + (var5 * var1 >> 16);
    }

    static int method552(int var0, int var1) {
        int var3 = method553(var0 - 1, var1 - 1) + method553(var0 + 1, var1 - 1) + method553(var0 - 1, var1 + 1) + method553(var0 + 1, var1 + 1);
        int var4 = method553(var0 - 1, var1) + method553(var0 + 1, var1) + method553(var0, var1 - 1) + method553(var0, var1 + 1);
        int var5 = method553(var0, var1);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    static int method553(int var0, int var1) {
        int var3 = var1 * 57 + var0;
        var3 ^= var3 << 13;
        int var4 = (789221 + var3 * var3 * 15731) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 255;
    }

    static int method545(int var0, int var1) {
        if (var0 == -1) {
            return 12345678;
        } else {
            var1 = (var0 & 127) * var1 / 128;
            if (var1 < 2) {
                var1 = 2;
            } else if (var1 > 126) {
                var1 = 126;
            }

            return (var0 & 65408) + var1;
        }
    }

    static int method544(int var0, int var1) {
        if (var0 == -2) {
            return 12345678;
        } else if (var0 == -1) {
            if (var1 < 2) {
                var1 = 2;
            } else if (var1 > 126) {
                var1 = 126;
            }

            return var1;
        } else {
            var1 = (var0 & 127) * var1 / 128;
            if (var1 < 2) {
                var1 = 2;
            } else if (var1 > 126) {
                var1 = 126;
            }

            return (var0 & 65408) + var1;
        }
    }

    static int method547(int var0, int var1, int var2) {
        if (var2 > 179) {
            var1 /= 2;
        }

        if (var2 > 192) {
            var1 /= 2;
        }

        if (var2 > 217) {
            var1 /= 2;
        }

        if (var2 > 243) {
            var1 /= 2;
        }

        int var4 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
        return var4;
    }
}
