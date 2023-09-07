public class class158 {
    static final int[] field1352;
    static final int[] field1382;
    static final int[] field1383;
    static final int[] field1385;
    static final int[] field1386;
    static final int[] field1387;
    static final int[] field1388;
    public static boolean field1375;
    public static int field1372;
    public static int field1373;
    static boolean field1360;
    static boolean field1374;
    static boolean[][] field1368;
    static boolean[][][][] field1392;
    static class325[] field1377;
    static class43 field1381;
    static class462[] field1380;
    static class462[][] field1376;
    static int field1344;
    static int field1347;
    static int field1353;
    static int field1354;
    static int field1355;
    static int field1356;
    static int field1357;
    static int field1358;
    static int field1359;
    static int field1361;
    static int field1362;
    static int field1363;
    static int field1364;
    static int field1365;
    static int field1366;
    static int field1367;
    static int field1370;
    static int field1371;
    static int field1378;
    static int field1379;
    static int field1389;
    static int field1390;
    static int field1394;
    static int field1395;
    static int field1396;
    static int field1398;
    static int field1399;
    static int[] field1397;

    static {
        field1375 = true;
        field1362 = 0;
        field1354 = 0;
        field1377 = new class325[100];
        field1360 = false;
        field1370 = 0;
        field1379 = 0;
        field1371 = 0;
        field1372 = -1;
        field1373 = -1;
        field1374 = false;
        field1353 = 4;
        field1397 = new int[field1353];
        field1376 = new class462[field1353][500];
        field1396 = 0;
        field1380 = new class462[500];
        field1381 = new class43();
        field1382 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
        field1383 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
        field1352 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
        field1385 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
        field1386 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
        field1387 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
        field1388 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
        field1392 = new boolean[8][32][51][51];
    }

    class325[] field1350;
    class471[][][] field1384;
    int field1343;
    int field1345;
    int field1348;
    int field1349;
    int field1369;
    int[][] field1391;
    int[][] field1393;
    int[][][] field1346;
    int[][][] field1351;

    public class158(int var1, int var2, int var3, int[][][] var4) {
        this.field1348 = 0;
        this.field1349 = 0;
        this.field1350 = new class325[5000];
        this.field1393 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
        this.field1391 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
        this.field1343 = var1;
        this.field1369 = var2;
        this.field1345 = var3;
        this.field1384 = new class471[var1][var2][var3];
        this.field1351 = new int[var1][var2 + 1][var3 + 1];
        this.field1346 = var4;
        this.method737();
    }

    public static void method740(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        class462 var8 = new class462();
        var8.field3179 = var2 / 128;
        var8.field3164 = var3 / 128;
        var8.field3165 = var4 / 128;
        var8.field3170 = var5 / 128;
        var8.field3167 = var1;
        var8.field3168 = var2;
        var8.field3169 = var3;
        var8.field3180 = var4;
        var8.field3176 = var5;
        var8.field3172 = var6;
        var8.field3173 = var7;
        field1376[var0][field1397[var0]++] = var8;
    }

    public static void method774(int[] var0, int var1, int var2, int var3, int var4) {
        field1344 = 0;
        field1378 = 0;
        field1398 = var3;
        field1356 = 334;
        field1394 = var3 / 2;
        field1395 = 167;
        boolean[][][][] var5 = new boolean[var0.length][32][53][53];

        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var12;
        for (var6 = 128; var6 <= 383; var6 += 32) {
            for (var7 = 0; var7 < 2048; var7 += 64) {
                field1365 = class334.field2429[var6];
                field1366 = class334.field2427[var6];
                field1399 = class334.field2429[var7];
                field1367 = class334.field2427[var7];
                var8 = (var6 - 128) / 32;
                var9 = var7 / 64;

                for (int var10 = -26; var10 < 26; ++var10) {
                    for (var11 = -26; var11 < 26; ++var11) {
                        var12 = var10 * 128;
                        int var13 = var11 * 128;
                        boolean var14 = false;

                        for (int var15 = -500; var15 <= 800; var15 += 128) {
                            if (method761(var12, var0[var8] + var15, var13)) {
                                var14 = true;
                                break;
                            }
                        }

                        var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
                    }
                }
            }
        }

        for (var6 = 0; var6 < 8; ++var6) {
            for (var7 = 0; var7 < 32; ++var7) {
                for (var8 = -25; var8 < 25; ++var8) {
                    for (var9 = -25; var9 < 25; ++var9) {
                        boolean var16 = false;

                        label76:
                        for (var11 = -1; var11 <= 1; ++var11) {
                            for (var12 = -1; var12 <= 1; ++var12) {
                                if (var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                                    var16 = true;
                                    break label76;
                                }

                                if (var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                                    var16 = true;
                                    break label76;
                                }

                                if (var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                                    var16 = true;
                                    break label76;
                                }

                                if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                                    var16 = true;
                                    break label76;
                                }
                            }
                        }

                        field1392[var6][var7][var8 + 25][var9 + 25] = var16;
                    }
                }
            }
        }

    }

    static boolean method761(int var0, int var1, int var2) {
        int var3 = var2 * field1399 + var0 * field1367 >> 16;
        int var4 = var2 * field1367 - var0 * field1399 >> 16;
        int var5 = var1 * field1365 + var4 * field1366 >> 16;
        int var6 = var1 * field1366 - var4 * field1365 >> 16;
        if (var5 >= 50 && var5 <= 3500) {
            int var7 = field1394 + var3 * 128 / var5;
            int var8 = field1395 + var6 * 128 / var5;
            return var7 >= field1344 && var7 <= field1398 && var8 >= field1378 && var8 <= field1356;
        } else {
            return false;
        }
    }

    public static boolean method763() {
        return field1374 && field1372 != -1;
    }

    public static void method786() {
        field1372 = -1;
        field1374 = false;
    }

    static final int method768(int var0, int var1) {
        var1 = var1 * (var0 & 127) >> 7;
        if (var1 < 2) {
            var1 = 2;
        } else if (var1 > 126) {
            var1 = 126;
        }

        return (var0 & 65408) + var1;
    }

    static boolean method769(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        if (var1 < var2 && var1 < var3 && var1 < var4) {
            return false;
        } else if (var1 > var2 && var1 > var3 && var1 > var4) {
            return false;
        } else if (var0 < var5 && var0 < var6 && var0 < var7) {
            return false;
        } else if (var0 > var5 && var0 > var6 && var0 > var7) {
            return false;
        } else {
            int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
            int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
            int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
            if (var8 == 0) {
                if (var9 != 0) {
                    return var9 < 0 ? var10 <= 0 : var10 >= 0;
                } else {
                    return true;
                }
            } else {
                return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
            }
        }
    }

    public void method737() {
        int var1;
        int var2;
        for (var1 = 0; var1 < this.field1343; ++var1) {
            for (var2 = 0; var2 < this.field1369; ++var2) {
                for (int var3 = 0; var3 < this.field1345; ++var3) {
                    this.field1384[var1][var2][var3] = null;
                }
            }
        }

        for (var1 = 0; var1 < field1353; ++var1) {
            for (var2 = 0; var2 < field1397[var1]; ++var2) {
                field1376[var1][var2] = null;
            }

            field1397[var1] = 0;
        }

        for (var1 = 0; var1 < this.field1349; ++var1) {
            this.field1350[var1] = null;
        }

        this.field1349 = 0;

        for (var1 = 0; var1 < field1377.length; ++var1) {
            field1377[var1] = null;
        }

    }

    public void method738(int var1) {
        this.field1348 = var1;

        for (int var2 = 0; var2 < this.field1369; ++var2) {
            for (int var3 = 0; var3 < this.field1345; ++var3) {
                if (this.field1384[var1][var2][var3] == null) {
                    this.field1384[var1][var2][var3] = new class471(var1, var2, var3);
                }
            }
        }

    }

    public void method739(int var1, int var2) {
        class471 var3 = this.field1384[0][var1][var2];

        for (int var4 = 0; var4 < 3; ++var4) {
            class471 var5 = this.field1384[var4][var1][var2] = this.field1384[var4 + 1][var1][var2];
            if (var5 != null) {
                --var5.field3385;

                for (int var6 = 0; var6 < var5.field3373; ++var6) {
                    class325 var7 = var5.field3384[var6];
                    long var9 = var7.field2363;
                    boolean var8 = class368.method1738(var9) == 2;
                    if (var8 && var7.field2357 == var1 && var7.field2359 == var2) {
                        --var7.field2362;
                    }
                }
            }
        }

        if (this.field1384[0][var1][var2] == null) {
            this.field1384[0][var1][var2] = new class471(0, var1, var2);
        }

        this.field1384[0][var1][var2].field3388 = var3;
        this.field1384[3][var1][var2] = null;
    }

    public void method791(int var1, int var2, int var3, int var4) {
        class471 var5 = this.field1384[var1][var2][var3];
        if (var5 != null) {
            this.field1384[var1][var2][var3].field3380 = var4;
        }
    }

    public void method776(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
        class140 var21;
        int var22;
        if (var4 == 0) {
            var21 = new class140(var11, var12, var13, var14, -1, var19, false);

            for (var22 = var1; var22 >= 0; --var22) {
                if (this.field1384[var22][var2][var3] == null) {
                    this.field1384[var22][var2][var3] = new class471(var22, var2, var3);
                }
            }

            this.field1384[var1][var2][var3].field3370 = var21;
        } else if (var4 != 1) {
            class105 var23 = new class105(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

            for (var22 = var1; var22 >= 0; --var22) {
                if (this.field1384[var22][var2][var3] == null) {
                    this.field1384[var22][var2][var3] = new class471(var22, var2, var3);
                }
            }

            this.field1384[var1][var2][var3].field3371 = var23;
        } else {
            var21 = new class140(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

            for (var22 = var1; var22 >= 0; --var22) {
                if (this.field1384[var22][var2][var3] == null) {
                    this.field1384[var22][var2][var3] = new class471(var22, var2, var3);
                }
            }

            this.field1384[var1][var2][var3].field3370 = var21;
        }
    }

    public void method742(int var1, int var2, int var3, int var4, class490 var5, long var6, int var8) {
        if (var5 != null) {
            class294 var9 = new class294();
            var9.field2132 = var5;
            var9.field2133 = var2 * 128 + 64;
            var9.field2135 = var3 * 128 + 64;
            var9.field2130 = var4;
            var9.field2131 = var6;
            var9.field2134 = var8;
            if (this.field1384[var1][var2][var3] == null) {
                this.field1384[var1][var2][var3] = new class471(var1, var2, var3);
            }

            this.field1384[var1][var2][var3].field3374 = var9;
        }
    }

    public void method743(int var1, int var2, int var3, int var4, class490 var5, long var6, class490 var8, class490 var9) {
        class36 var10 = new class36();
        var10.field495 = var5;
        var10.field499 = var2 * 128 + 64;
        var10.field496 = var3 * 128 + 64;
        var10.field493 = var4;
        var10.field498 = var6;
        var10.field494 = var8;
        var10.field497 = var9;
        int var11 = 0;
        class471 var12 = this.field1384[var1][var2][var3];
        if (var12 != null) {
            for (int var13 = 0; var13 < var12.field3373; ++var13) {
                if ((var12.field3384[var13].field2355 & 256) == 256 && var12.field3384[var13].field2358 instanceof class448) {
                    class448 var14 = (class448) var12.field3384[var13].field2358;
                    var14.method2045();
                    if (var14.field3601 > var11) {
                        var11 = var14.field3601;
                    }
                }
            }
        }

        var10.field492 = var11;
        if (this.field1384[var1][var2][var3] == null) {
            this.field1384[var1][var2][var3] = new class471(var1, var2, var3);
        }

        this.field1384[var1][var2][var3].field3367 = var10;
    }

    public void method764(int var1, int var2, int var3, int var4, class490 var5, class490 var6, int var7, int var8, long var9, int var11) {
        if (var5 != null || var6 != null) {
            class256 var12 = new class256();
            var12.field1925 = var9;
            var12.field1927 = var11;
            var12.field1919 = var2 * 128 + 64;
            var12.field1920 = var3 * 128 + 64;
            var12.field1922 = var4;
            var12.field1926 = var5;
            var12.field1924 = var6;
            var12.field1921 = var7;
            var12.field1923 = var8;

            for (int var13 = var1; var13 >= 0; --var13) {
                if (this.field1384[var13][var2][var3] == null) {
                    this.field1384[var13][var2][var3] = new class471(var13, var2, var3);
                }
            }

            this.field1384[var1][var2][var3].field3377 = var12;
        }
    }

    public void method779(int var1, int var2, int var3, int var4, class490 var5, class490 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
        if (var5 != null) {
            class224 var14 = new class224();
            var14.field1776 = var11;
            var14.field1777 = var13;
            var14.field1767 = var2 * 128 + 64;
            var14.field1768 = var3 * 128 + 64;
            var14.field1772 = var4;
            var14.field1773 = var5;
            var14.field1774 = var6;
            var14.field1769 = var7;
            var14.field1770 = var8;
            var14.field1771 = var9;
            var14.field1766 = var10;

            for (int var15 = var1; var15 >= 0; --var15) {
                if (this.field1384[var15][var2][var3] == null) {
                    this.field1384[var15][var2][var3] = new class471(var15, var2, var3);
                }
            }

            this.field1384[var1][var2][var3].field3376 = var14;
        }
    }

    public boolean method744(int var1, int var2, int var3, int var4, int var5, int var6, class490 var7, int var8, long var9, int var11) {
        if (var7 == null) {
            return true;
        } else {
            int var12 = var2 * 128 + var5 * 64;
            int var13 = var3 * 128 + var6 * 64;
            return this.method775(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
        }
    }

    public boolean method745(int var1, int var2, int var3, int var4, int var5, class490 var6, int var7, long var8, boolean var10) {
        if (var6 == null) {
            return true;
        } else {
            int var11 = var2 - var5;
            int var12 = var3 - var5;
            int var13 = var2 + var5;
            int var14 = var3 + var5;
            if (var10) {
                if (var7 > 640 && var7 < 1408) {
                    var14 += 128;
                }

                if (var7 > 1152 && var7 < 1920) {
                    var13 += 128;
                }

                if (var7 > 1664 || var7 < 384) {
                    var12 -= 128;
                }

                if (var7 > 128 && var7 < 896) {
                    var11 -= 128;
                }
            }

            var11 /= 128;
            var12 /= 128;
            var13 /= 128;
            var14 /= 128;
            return this.method775(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
        }
    }

    public boolean method746(int var1, int var2, int var3, int var4, int var5, class490 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
        return var6 == null || this.method775(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
    }

    boolean method775(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class490 var9, int var10, boolean var11, long var12, int var14) {
        int var16;
        for (int var15 = var2; var15 < var2 + var4; ++var15) {
            for (var16 = var3; var16 < var3 + var5; ++var16) {
                if (var15 < 0 || var16 < 0 || var15 >= this.field1369 || var16 >= this.field1345) {
                    return false;
                }

                class471 var17 = this.field1384[var1][var15][var16];
                if (var17 != null && var17.field3373 >= 5) {
                    return false;
                }
            }
        }

        class325 var21 = new class325();
        var21.field2363 = var12;
        var21.field2355 = var14;
        var21.field2362 = var1;
        var21.field2353 = var6;
        var21.field2364 = var7;
        var21.field2352 = var8;
        var21.field2358 = var9;
        var21.field2351 = var10;
        var21.field2357 = var2;
        var21.field2359 = var3;
        var21.field2354 = var2 + var4 - 1;
        var21.field2360 = var3 + var5 - 1;

        for (var16 = var2; var16 < var2 + var4; ++var16) {
            for (int var22 = var3; var22 < var3 + var5; ++var22) {
                int var18 = 0;
                if (var16 > var2) {
                    ++var18;
                }

                if (var16 < var2 + var4 - 1) {
                    var18 += 4;
                }

                if (var22 > var3) {
                    var18 += 8;
                }

                if (var22 < var3 + var5 - 1) {
                    var18 += 2;
                }

                for (int var19 = var1; var19 >= 0; --var19) {
                    if (this.field1384[var19][var16][var22] == null) {
                        this.field1384[var19][var16][var22] = new class471(var19, var16, var22);
                    }
                }

                class471 var23 = this.field1384[var1][var16][var22];
                var23.field3384[var23.field3373] = var21;
                var23.field3378[var23.field3373] = var18;
                var23.field3379 |= var18;
                ++var23.field3373;
            }
        }

        if (var11) {
            this.field1350[this.field1349++] = var21;
        }

        return true;
    }

    public void method784() {
        for (int var1 = 0; var1 < this.field1349; ++var1) {
            class325 var2 = this.field1350[var1];
            this.method749(var2);
            this.field1350[var1] = null;
        }

        this.field1349 = 0;
    }

    void method749(class325 var1) {
        for (int var2 = var1.field2357; var2 <= var1.field2354; ++var2) {
            for (int var3 = var1.field2359; var3 <= var1.field2360; ++var3) {
                class471 var4 = this.field1384[var1.field2362][var2][var3];
                if (var4 != null) {
                    int var5;
                    for (var5 = 0; var5 < var4.field3373; ++var5) {
                        if (var4.field3384[var5] == var1) {
                            --var4.field3373;

                            for (int var6 = var5; var6 < var4.field3373; ++var6) {
                                var4.field3384[var6] = var4.field3384[var6 + 1];
                                var4.field3378[var6] = var4.field3378[var6 + 1];
                            }

                            var4.field3384[var4.field3373] = null;
                            break;
                        }
                    }

                    var4.field3379 = 0;

                    for (var5 = 0; var5 < var4.field3373; ++var5) {
                        var4.field3379 |= var4.field3378[var5];
                    }
                }
            }
        }

    }

    public void method747(int var1, int var2, int var3, int var4) {
        class471 var5 = this.field1384[var1][var2][var3];
        if (var5 != null) {
            class224 var6 = var5.field3376;
            if (var6 != null) {
                var6.field1771 = var6.field1771 * var4 / 16;
                var6.field1766 = var6.field1766 * var4 / 16;
            }
        }
    }

    public void method780(int var1, int var2, int var3) {
        class471 var4 = this.field1384[var1][var2][var3];
        if (var4 != null) {
            var4.field3377 = null;
        }
    }

    public void method748(int var1, int var2, int var3) {
        class471 var4 = this.field1384[var1][var2][var3];
        if (var4 != null) {
            var4.field3376 = null;
        }
    }

    public void method781(int var1, int var2, int var3) {
        class471 var4 = this.field1384[var1][var2][var3];
        if (var4 != null) {
            for (int var5 = 0; var5 < var4.field3373; ++var5) {
                class325 var6 = var4.field3384[var5];
                long var8 = var6.field2363;
                boolean var7 = class368.method1738(var8) == 2;
                if (var7 && var6.field2357 == var2 && var6.field2359 == var3) {
                    this.method749(var6);
                    return;
                }
            }

        }
    }

    public void method750(int var1, int var2, int var3) {
        class471 var4 = this.field1384[var1][var2][var3];
        if (var4 != null) {
            var4.field3374 = null;
        }
    }

    public void method751(int var1, int var2, int var3) {
        class471 var4 = this.field1384[var1][var2][var3];
        if (var4 != null) {
            var4.field3367 = null;
        }
    }

    public class256 method752(int var1, int var2, int var3) {
        class471 var4 = this.field1384[var1][var2][var3];
        return var4 == null ? null : var4.field3377;
    }

    public class224 method753(int var1, int var2, int var3) {
        class471 var4 = this.field1384[var1][var2][var3];
        return var4 == null ? null : var4.field3376;
    }

    public class325 method790(int var1, int var2, int var3) {
        class471 var4 = this.field1384[var1][var2][var3];
        if (var4 == null) {
            return null;
        } else {
            for (int var5 = 0; var5 < var4.field3373; ++var5) {
                class325 var6 = var4.field3384[var5];
                long var8 = var6.field2363;
                boolean var7 = class368.method1738(var8) == 2;
                if (var7 && var6.field2357 == var2 && var6.field2359 == var3) {
                    return var6;
                }
            }

            return null;
        }
    }

    public class294 method777(int var1, int var2, int var3) {
        class471 var4 = this.field1384[var1][var2][var3];
        return var4 != null && var4.field3374 != null ? var4.field3374 : null;
    }

    public long method773(int var1, int var2, int var3) {
        class471 var4 = this.field1384[var1][var2][var3];
        return var4 != null && var4.field3377 != null ? var4.field3377.field1925 : 0L;
    }

    public long method778(int var1, int var2, int var3) {
        class471 var4 = this.field1384[var1][var2][var3];
        return var4 != null && var4.field3376 != null ? var4.field3376.field1776 : 0L;
    }

    public long method754(int var1, int var2, int var3) {
        class471 var4 = this.field1384[var1][var2][var3];
        if (var4 == null) {
            return 0L;
        } else {
            for (int var5 = 0; var5 < var4.field3373; ++var5) {
                class325 var6 = var4.field3384[var5];
                long var8 = var6.field2363;
                boolean var7 = class368.method1738(var8) == 2;
                if (var7 && var6.field2357 == var2 && var6.field2359 == var3) {
                    return var6.field2363;
                }
            }

            return 0L;
        }
    }

    public long method787(int var1, int var2, int var3) {
        class471 var4 = this.field1384[var1][var2][var3];
        return var4 != null && var4.field3374 != null ? var4.field3374.field2131 : 0L;
    }

    public int method755(int var1, int var2, int var3, long var4) {
        class471 var6 = this.field1384[var1][var2][var3];
        if (var6 == null) {
            return -1;
        } else if (var6.field3377 != null && var6.field3377.field1925 == var4) {
            return var6.field3377.field1927 & 255;
        } else if (var6.field3376 != null && var6.field3376.field1776 == var4) {
            return var6.field3376.field1777 & 255;
        } else if (var6.field3374 != null && var6.field3374.field2131 == var4) {
            return var6.field3374.field2134 & 255;
        } else {
            for (int var7 = 0; var7 < var6.field3373; ++var7) {
                if (var6.field3384[var7].field2363 == var4) {
                    return var6.field3384[var7].field2355 & 255;
                }
            }

            return -1;
        }
    }

    public void method756(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.field1343; ++var4) {
            for (int var5 = 0; var5 < this.field1369; ++var5) {
                for (int var6 = 0; var6 < this.field1345; ++var6) {
                    class471 var7 = this.field1384[var4][var5][var6];
                    if (var7 != null) {
                        class256 var8 = var7.field3377;
                        class175 var10;
                        if (var8 != null && var8.field1926 instanceof class175) {
                            class175 var9 = (class175) var8.field1926;
                            this.method757(var9, var4, var5, var6, 1, 1);
                            if (var8.field1924 instanceof class175) {
                                var10 = (class175) var8.field1924;
                                this.method757(var10, var4, var5, var6, 1, 1);
                                class175.method845(var9, var10, 0, 0, 0, false);
                                var8.field1924 = var10.method846(var10.field1507, var10.field1496, -50, -10, -50);
                            }

                            var8.field1926 = var9.method846(var9.field1507, var9.field1496, -50, -10, -50);
                        }

                        for (int var12 = 0; var12 < var7.field3373; ++var12) {
                            class325 var14 = var7.field3384[var12];
                            if (var14 != null && var14.field2358 instanceof class175) {
                                class175 var11 = (class175) var14.field2358;
                                this.method757(var11, var4, var5, var6, var14.field2354 - var14.field2357 + 1, var14.field2360 - var14.field2359 + 1);
                                var14.field2358 = var11.method846(var11.field1507, var11.field1496, -50, -10, -50);
                            }
                        }

                        class294 var13 = var7.field3374;
                        if (var13 != null && var13.field2132 instanceof class175) {
                            var10 = (class175) var13.field2132;
                            this.method788(var10, var4, var5, var6);
                            var13.field2132 = var10.method846(var10.field1507, var10.field1496, -50, -10, -50);
                        }
                    }
                }
            }
        }

    }

    void method788(class175 var1, int var2, int var3, int var4) {
        int var6 = var3 + 1;
        int var7 = var4 - 1;
        int var8 = var4 + 1;

        for (int var9 = var3; var9 <= var6; ++var9) {
            if (var9 >= 0 && var9 < this.field1369) {
                for (int var10 = var7; var10 <= var8; ++var10) {
                    if (var10 >= 0 && var10 < this.field1345 && (var9 >= var6 || var10 >= var8)) {
                        class471 var11 = this.field1384[var2][var9][var10];
                        if (var11 != null && var11.field3374 != null && var11.field3374.field2132 instanceof class175) {
                            int var12 = this.method758(var2, var9, var10, var2, var3, var4);
                            class175 var13 = (class175) var11.field3374.field2132;
                            class175.method845(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
                        }
                    }
                }
            }
        }

    }

    void method757(class175 var1, int var2, int var3, int var4, int var5, int var6) {
        boolean var7 = true;
        int var8 = var3;
        int var9 = var3 + var5;
        int var10 = var4 - 1;
        int var11 = var4 + var6;

        for (int var12 = var2; var12 <= var2 + 1; ++var12) {
            if (var12 != this.field1343) {
                for (int var13 = var8; var13 <= var9; ++var13) {
                    if (var13 >= 0 && var13 < this.field1369) {
                        for (int var14 = var10; var14 <= var11; ++var14) {
                            if (var14 >= 0 && var14 < this.field1345 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                                class471 var15 = this.field1384[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = this.method758(var12, var13, var14, var2, var3, var4);
                                    class256 var17 = var15.field3377;
                                    if (var17 != null) {
                                        class175 var18;
                                        if (var17.field1926 instanceof class175) {
                                            var18 = (class175) var17.field1926;
                                            class175.method845(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                                        }

                                        if (var17.field1924 instanceof class175) {
                                            var18 = (class175) var17.field1924;
                                            class175.method845(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                                        }
                                    }

                                    for (int var23 = 0; var23 < var15.field3373; ++var23) {
                                        class325 var19 = var15.field3384[var23];
                                        if (var19 != null && var19.field2358 instanceof class175) {
                                            class175 var20 = (class175) var19.field2358;
                                            int var21 = var19.field2354 - var19.field2357 + 1;
                                            int var22 = var19.field2360 - var19.field2359 + 1;
                                            class175.method845(var1, var20, (var19.field2357 - var3) * 128 + (var21 - var5) * 64, var16, (var19.field2359 - var4) * 128 + (var22 - var6) * 64, var7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                --var8;
                var7 = false;
            }
        }

    }

    int method758(int var1, int var2, int var3, int var4, int var5, int var6) {
        return this.method759(var1, var2, var3) - this.method759(var4, var5, var6);
    }

    int method759(int var1, int var2, int var3) {
        return (this.field1346[var1][var2][var3] + this.field1346[var1][var2 + 1][var3] + this.field1346[var1][var2][var3 + 1] + this.field1346[var1][var2 + 1][var3 + 1]) / 4;
    }

    public void method760(int[] var1, int var2, int var3, int var4, int var5, int var6) {
        class471 var7 = this.field1384[var4][var5][var6];
        if (var7 != null) {
            class140 var8 = var7.field3370;
            int var10;
            if (var8 != null) {
                int var18 = var8.field1232;
                if (var18 != 0) {
                    for (var10 = 0; var10 < 4; ++var10) {
                        var1[var2] = var18;
                        var1[var2 + 1] = var18;
                        var1[var2 + 2] = var18;
                        var1[var2 + 3] = var18;
                        var2 += 512;
                    }

                }
            } else {
                class105 var9 = var7.field3371;
                if (var9 != null) {
                    var10 = var9.field1018;
                    int var11 = var9.field1027;
                    int var12 = var9.field1020;
                    int var13 = var9.field1024;
                    int[] var14 = this.field1393[var10];
                    int[] var15 = this.field1391[var11];
                    int var16 = 0;
                    int var17;
                    if (var12 != 0) {
                        for (var17 = 0; var17 < 4; ++var17) {
                            var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                            var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                            var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                            var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                            var2 += 512;
                        }
                    } else {
                        for (var17 = 0; var17 < 4; ++var17) {
                            if (var14[var15[var16++]] != 0) {
                                var1[var2] = var13;
                            }

                            if (var14[var15[var16++]] != 0) {
                                var1[var2 + 1] = var13;
                            }

                            if (var14[var15[var16++]] != 0) {
                                var1[var2 + 2] = var13;
                            }

                            if (var14[var15[var16++]] != 0) {
                                var1[var2 + 3] = var13;
                            }

                            var2 += 512;
                        }
                    }

                }
            }
        }
    }

    public void method762(int var1, int var2, int var3, boolean var4) {
        if (!method763() || var4) {
            field1360 = true;
            field1374 = var4;
            field1370 = var1;
            field1379 = var2;
            field1371 = var3;
            field1372 = -1;
            field1373 = -1;
        }
    }

    public void method783() {
        field1374 = true;
    }

    public void method765(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 < 0) {
            var1 = 0;
        } else if (var1 >= this.field1369 * 128) {
            var1 = this.field1369 * 128 - 1;
        }

        if (var3 < 0) {
            var3 = 0;
        } else if (var3 >= this.field1345 * 128) {
            var3 = this.field1345 * 128 - 1;
        }

        if (var4 < 128) {
            var4 = 128;
        } else if (var4 > 383) {
            var4 = 383;
        }

        ++field1355;
        field1365 = class334.field2429[var4];
        field1366 = class334.field2427[var4];
        field1399 = class334.field2429[var5];
        field1367 = class334.field2427[var5];
        field1368 = field1392[(var4 - 128) / 32][var5 / 64];
        field1347 = var1;
        field1363 = var2;
        field1364 = var3;
        field1390 = var1 / 128;
        field1361 = var3 / 128;
        field1354 = var6;
        field1389 = field1390 - 25;
        if (field1389 < 0) {
            field1389 = 0;
        }

        field1358 = field1361 - 25;
        if (field1358 < 0) {
            field1358 = 0;
        }

        field1357 = field1390 + 25;
        if (field1357 > this.field1369) {
            field1357 = this.field1369;
        }

        field1359 = field1361 + 25;
        if (field1359 > this.field1345) {
            field1359 = this.field1345;
        }

        this.method770();
        field1362 = 0;

        int var7;
        class471[][] var8;
        int var9;
        int var10;
        for (var7 = this.field1348; var7 < this.field1343; ++var7) {
            var8 = this.field1384[var7];

            for (var9 = field1389; var9 < field1357; ++var9) {
                for (var10 = field1358; var10 < field1359; ++var10) {
                    class471 var11 = var8[var9][var10];
                    if (var11 != null) {
                        if (var11.field3380 > var6 || !field1368[var9 - field1390 + 25][var10 - field1361 + 25] && this.field1346[var7][var9][var10] - var2 < 2000) {
                            var11.field3381 = false;
                            var11.field3382 = false;
                            var11.field3375 = 0;
                        } else {
                            var11.field3381 = true;
                            var11.field3382 = true;
							var11.field3366 = var11.field3373 > 0;

                            ++field1362;
                        }
                    }
                }
            }
        }

        int var12;
        int var13;
        int var14;
        class471 var15;
        int var16;
        for (var7 = this.field1348; var7 < this.field1343; ++var7) {
            var8 = this.field1384[var7];

            for (var9 = -25; var9 <= 0; ++var9) {
                var10 = field1390 + var9;
                var16 = field1390 - var9;
                if (var10 >= field1389 || var16 < field1357) {
                    for (var12 = -25; var12 <= 0; ++var12) {
                        var13 = field1361 + var12;
                        var14 = field1361 - var12;
                        if (var10 >= field1389) {
                            if (var13 >= field1358) {
                                var15 = var8[var10][var13];
                                if (var15 != null && var15.field3381) {
                                    this.method766(var15, true);
                                }
                            }

                            if (var14 < field1359) {
                                var15 = var8[var10][var14];
                                if (var15 != null && var15.field3381) {
                                    this.method766(var15, true);
                                }
                            }
                        }

                        if (var16 < field1357) {
                            if (var13 >= field1358) {
                                var15 = var8[var16][var13];
                                if (var15 != null && var15.field3381) {
                                    this.method766(var15, true);
                                }
                            }

                            if (var14 < field1359) {
                                var15 = var8[var16][var14];
                                if (var15 != null && var15.field3381) {
                                    this.method766(var15, true);
                                }
                            }
                        }

                        if (field1362 == 0) {
                            field1360 = false;
                            return;
                        }
                    }
                }
            }
        }

        for (var7 = this.field1348; var7 < this.field1343; ++var7) {
            var8 = this.field1384[var7];

            for (var9 = -25; var9 <= 0; ++var9) {
                var10 = field1390 + var9;
                var16 = field1390 - var9;
                if (var10 >= field1389 || var16 < field1357) {
                    for (var12 = -25; var12 <= 0; ++var12) {
                        var13 = field1361 + var12;
                        var14 = field1361 - var12;
                        if (var10 >= field1389) {
                            if (var13 >= field1358) {
                                var15 = var8[var10][var13];
                                if (var15 != null && var15.field3381) {
                                    this.method766(var15, false);
                                }
                            }

                            if (var14 < field1359) {
                                var15 = var8[var10][var14];
                                if (var15 != null && var15.field3381) {
                                    this.method766(var15, false);
                                }
                            }
                        }

                        if (var16 < field1357) {
                            if (var13 >= field1358) {
                                var15 = var8[var16][var13];
                                if (var15 != null && var15.field3381) {
                                    this.method766(var15, false);
                                }
                            }

                            if (var14 < field1359) {
                                var15 = var8[var16][var14];
                                if (var15 != null && var15.field3381) {
                                    this.method766(var15, false);
                                }
                            }
                        }

                        if (field1362 == 0) {
                            field1360 = false;
                            return;
                        }
                    }
                }
            }
        }

        field1360 = false;
    }

    void method766(class471 var1, boolean var2) {
        field1381.method126(var1);

        while (true) {
            class471 var3;
            int var4;
            int var5;
            int var6;
            int var7;
            class471[][] var8;
            class471 var9;
            int var11;
            int var14;
            int var15;
            int var16;
            int var24;
            int var26;
            do {
                do {
                    do {
                        do {
                            do {
                                do {
                                    while (true) {
                                        class256 var10;
                                        class325 var12;
                                        int var17;
                                        int var18;
                                        int var21;
                                        boolean var22;
                                        class471 var33;
                                        while (true) {
                                            do {
                                                var3 = (class471) field1381.method120();
                                                if (var3 == null) {
                                                    return;
                                                }
                                            } while (!var3.field3382);

                                            var4 = var3.field3372;
                                            var5 = var3.field3368;
                                            var6 = var3.field3385;
                                            var7 = var3.field3369;
                                            var8 = this.field1384[var6];
                                            if (!var3.field3381) {
                                                break;
                                            }

                                            if (var2) {
                                                if (var6 > 0) {
                                                    var9 = this.field1384[var6 - 1][var4][var5];
                                                    if (var9 != null && var9.field3382) {
                                                        continue;
                                                    }
                                                }

                                                if (var4 <= field1390 && var4 > field1389) {
                                                    var9 = var8[var4 - 1][var5];
                                                    if (var9 != null && var9.field3382 && (var9.field3381 || (var3.field3379 & 1) == 0)) {
                                                        continue;
                                                    }
                                                }

                                                if (var4 >= field1390 && var4 < field1357 - 1) {
                                                    var9 = var8[var4 + 1][var5];
                                                    if (var9 != null && var9.field3382 && (var9.field3381 || (var3.field3379 & 4) == 0)) {
                                                        continue;
                                                    }
                                                }

                                                if (var5 <= field1361 && var5 > field1358) {
                                                    var9 = var8[var4][var5 - 1];
                                                    if (var9 != null && var9.field3382 && (var9.field3381 || (var3.field3379 & 8) == 0)) {
                                                        continue;
                                                    }
                                                }

                                                if (var5 >= field1361 && var5 < field1359 - 1) {
                                                    var9 = var8[var4][var5 + 1];
                                                    if (var9 != null && var9.field3382 && (var9.field3381 || (var3.field3379 & 2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                var2 = true;
                                            }

                                            var3.field3381 = false;
                                            if (var3.field3388 != null) {
                                                var9 = var3.field3388;
                                                if (var9.field3370 != null) {
                                                    if (!this.method789(0, var4, var5)) {
                                                        this.method767(var9.field3370, 0, field1365, field1366, field1399, field1367, var4, var5);
                                                    }
                                                } else if (var9.field3371 != null && !this.method789(0, var4, var5)) {
                                                    this.method785(var9.field3371, field1365, field1366, field1399, field1367, var4, var5);
                                                }

                                                var10 = var9.field3377;
                                                if (var10 != null) {
                                                    var10.field1926.method2237(0, field1365, field1366, field1399, field1367, var10.field1919 - field1347, var10.field1922 - field1363, var10.field1920 - field1364, var10.field1925);
                                                }

                                                for (var11 = 0; var11 < var9.field3373; ++var11) {
                                                    var12 = var9.field3384[var11];
                                                    if (var12 != null) {
                                                        var12.field2358.method2237(var12.field2351, field1365, field1366, field1399, field1367, var12.field2353 - field1347, var12.field2352 - field1363, var12.field2364 - field1364, var12.field2363);
                                                    }
                                                }
                                            }

                                            var22 = false;
                                            if (var3.field3370 != null) {
                                                if (!this.method789(var7, var4, var5)) {
                                                    var22 = true;
                                                    if (var3.field3370.field1228 != 12345678 || field1360 && var6 <= field1370) {
                                                        this.method767(var3.field3370, var7, field1365, field1366, field1399, field1367, var4, var5);
                                                    }
                                                }
                                            } else if (var3.field3371 != null && !this.method789(var7, var4, var5)) {
                                                var22 = true;
                                                this.method785(var3.field3371, field1365, field1366, field1399, field1367, var4, var5);
                                            }

                                            var21 = 0;
                                            var11 = 0;
                                            class256 var23 = var3.field3377;
                                            class224 var13 = var3.field3376;
                                            if (var23 != null || var13 != null) {
                                                if (field1390 == var4) {
                                                    ++var21;
                                                } else if (field1390 < var4) {
                                                    var21 += 2;
                                                }

                                                if (field1361 == var5) {
                                                    var21 += 3;
                                                } else if (field1361 > var5) {
                                                    var21 += 6;
                                                }

                                                var11 = field1382[var21];
                                                var3.field3387 = field1352[var21];
                                            }

                                            if (var23 != null) {
                                                if ((var23.field1921 & field1383[var21]) != 0) {
                                                    if (var23.field1921 == 16) {
                                                        var3.field3375 = 3;
                                                        var3.field3383 = field1385[var21];
                                                        var3.field3386 = 3 - var3.field3383;
                                                    } else if (var23.field1921 == 32) {
                                                        var3.field3375 = 6;
                                                        var3.field3383 = field1386[var21];
                                                        var3.field3386 = 6 - var3.field3383;
                                                    } else if (var23.field1921 == 64) {
                                                        var3.field3375 = 12;
                                                        var3.field3383 = field1387[var21];
                                                        var3.field3386 = 12 - var3.field3383;
                                                    } else {
                                                        var3.field3375 = 9;
                                                        var3.field3383 = field1388[var21];
                                                        var3.field3386 = 9 - var3.field3383;
                                                    }
                                                } else {
                                                    var3.field3375 = 0;
                                                }

                                                if ((var23.field1921 & var11) != 0 && !this.method771(var7, var4, var5, var23.field1921)) {
                                                    var23.field1926.method2237(0, field1365, field1366, field1399, field1367, var23.field1919 - field1347, var23.field1922 - field1363, var23.field1920 - field1364, var23.field1925);
                                                }

                                                if ((var23.field1923 & var11) != 0 && !this.method771(var7, var4, var5, var23.field1923)) {
                                                    var23.field1924.method2237(0, field1365, field1366, field1399, field1367, var23.field1919 - field1347, var23.field1922 - field1363, var23.field1920 - field1364, var23.field1925);
                                                }
                                            }

                                            if (var13 != null && !this.method772(var7, var4, var5, var13.field1773.field3601)) {
                                                if ((var13.field1769 & var11) != 0) {
                                                    var13.field1773.method2237(0, field1365, field1366, field1399, field1367, var13.field1767 - field1347 + var13.field1771, var13.field1772 - field1363, var13.field1768 - field1364 + var13.field1766, var13.field1776);
                                                } else if (var13.field1769 == 256) {
                                                    var14 = var13.field1767 - field1347;
                                                    var15 = var13.field1772 - field1363;
                                                    var16 = var13.field1768 - field1364;
                                                    var17 = var13.field1770;
                                                    if (var17 != 1 && var17 != 2) {
                                                        var18 = var14;
                                                    } else {
                                                        var18 = -var14;
                                                    }

                                                    int var19;
                                                    if (var17 != 2 && var17 != 3) {
                                                        var19 = var16;
                                                    } else {
                                                        var19 = -var16;
                                                    }

                                                    if (var19 < var18) {
                                                        var13.field1773.method2237(0, field1365, field1366, field1399, field1367, var14 + var13.field1771, var15, var16 + var13.field1766, var13.field1776);
                                                    } else if (var13.field1774 != null) {
                                                        var13.field1774.method2237(0, field1365, field1366, field1399, field1367, var14, var15, var16, var13.field1776);
                                                    }
                                                }
                                            }

                                            if (var22) {
                                                class294 var27 = var3.field3374;
                                                if (var27 != null) {
                                                    var27.field2132.method2237(0, field1365, field1366, field1399, field1367, var27.field2133 - field1347, var27.field2130 - field1363, var27.field2135 - field1364, var27.field2131);
                                                }

                                                class36 var31 = var3.field3367;
                                                if (var31 != null && var31.field492 == 0) {
                                                    if (var31.field494 != null) {
                                                        var31.field494.method2237(0, field1365, field1366, field1399, field1367, var31.field499 - field1347, var31.field493 - field1363, var31.field496 - field1364, var31.field498);
                                                    }

                                                    if (var31.field497 != null) {
                                                        var31.field497.method2237(0, field1365, field1366, field1399, field1367, var31.field499 - field1347, var31.field493 - field1363, var31.field496 - field1364, var31.field498);
                                                    }

                                                    if (var31.field495 != null) {
                                                        var31.field495.method2237(0, field1365, field1366, field1399, field1367, var31.field499 - field1347, var31.field493 - field1363, var31.field496 - field1364, var31.field498);
                                                    }
                                                }
                                            }

                                            var14 = var3.field3379;
                                            if (var14 != 0) {
                                                if (var4 < field1390 && (var14 & 4) != 0) {
                                                    var33 = var8[var4 + 1][var5];
                                                    if (var33 != null && var33.field3382) {
                                                        field1381.method126(var33);
                                                    }
                                                }

                                                if (var5 < field1361 && (var14 & 2) != 0) {
                                                    var33 = var8[var4][var5 + 1];
                                                    if (var33 != null && var33.field3382) {
                                                        field1381.method126(var33);
                                                    }
                                                }

                                                if (var4 > field1390 && (var14 & 1) != 0) {
                                                    var33 = var8[var4 - 1][var5];
                                                    if (var33 != null && var33.field3382) {
                                                        field1381.method126(var33);
                                                    }
                                                }

                                                if (var5 > field1361 && (var14 & 8) != 0) {
                                                    var33 = var8[var4][var5 - 1];
                                                    if (var33 != null && var33.field3382) {
                                                        field1381.method126(var33);
                                                    }
                                                }
                                            }
                                            break;
                                        }

                                        if (var3.field3375 != 0) {
                                            var22 = true;

                                            for (var21 = 0; var21 < var3.field3373; ++var21) {
                                                if (var3.field3384[var21].field2356 != field1355 && (var3.field3378[var21] & var3.field3375) == var3.field3383) {
                                                    var22 = false;
                                                    break;
                                                }
                                            }

                                            if (var22) {
                                                var10 = var3.field3377;
                                                if (!this.method771(var7, var4, var5, var10.field1921)) {
                                                    var10.field1926.method2237(0, field1365, field1366, field1399, field1367, var10.field1919 - field1347, var10.field1922 - field1363, var10.field1920 - field1364, var10.field1925);
                                                }

                                                var3.field3375 = 0;
                                            }
                                        }

                                        if (!var3.field3366) {
                                            break;
                                        }

                                        try {
                                            int var25 = var3.field3373;
                                            var3.field3366 = false;
                                            var21 = 0;

                                            label563:
                                            for (var11 = 0; var11 < var25; ++var11) {
                                                var12 = var3.field3384[var11];
                                                if (var12.field2356 != field1355) {
                                                    for (var26 = var12.field2357; var26 <= var12.field2354; ++var26) {
                                                        for (var14 = var12.field2359; var14 <= var12.field2360; ++var14) {
                                                            var33 = var8[var26][var14];
                                                            if (var33.field3381) {
                                                                var3.field3366 = true;
                                                                continue label563;
                                                            }

                                                            if (var33.field3375 != 0) {
                                                                var16 = 0;
                                                                if (var26 > var12.field2357) {
                                                                    ++var16;
                                                                }

                                                                if (var26 < var12.field2354) {
                                                                    var16 += 4;
                                                                }

                                                                if (var14 > var12.field2359) {
                                                                    var16 += 8;
                                                                }

                                                                if (var14 < var12.field2360) {
                                                                    var16 += 2;
                                                                }

                                                                if ((var16 & var33.field3375) == var3.field3386) {
                                                                    var3.field3366 = true;
                                                                    continue label563;
                                                                }
                                                            }
                                                        }
                                                    }

                                                    field1377[var21++] = var12;
                                                    var26 = field1390 - var12.field2357;
                                                    var14 = var12.field2354 - field1390;
                                                    if (var14 > var26) {
                                                        var26 = var14;
                                                    }

                                                    var15 = field1361 - var12.field2359;
                                                    var16 = var12.field2360 - field1361;
                                                    if (var16 > var15) {
                                                        var12.field2361 = var26 + var16;
                                                    } else {
                                                        var12.field2361 = var26 + var15;
                                                    }
                                                }
                                            }

                                            while (var21 > 0) {
                                                var11 = -50;
                                                var24 = -1;

                                                for (var26 = 0; var26 < var21; ++var26) {
                                                    class325 var34 = field1377[var26];
                                                    if (var34.field2356 != field1355) {
                                                        if (var34.field2361 > var11) {
                                                            var11 = var34.field2361;
                                                            var24 = var26;
                                                        } else if (var34.field2361 == var11) {
                                                            var15 = var34.field2353 - field1347;
                                                            var16 = var34.field2364 - field1364;
                                                            var17 = field1377[var24].field2353 - field1347;
                                                            var18 = field1377[var24].field2364 - field1364;
                                                            if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                                                var24 = var26;
                                                            }
                                                        }
                                                    }
                                                }

                                                if (var24 == -1) {
                                                    break;
                                                }

                                                class325 var35 = field1377[var24];
                                                var35.field2356 = field1355;
                                                if (!this.method741(var7, var35.field2357, var35.field2354, var35.field2359, var35.field2360, var35.field2358.field3601)) {
                                                    var35.field2358.method2237(var35.field2351, field1365, field1366, field1399, field1367, var35.field2353 - field1347, var35.field2352 - field1363, var35.field2364 - field1364, var35.field2363);
                                                }

                                                for (var14 = var35.field2357; var14 <= var35.field2354; ++var14) {
                                                    for (var15 = var35.field2359; var15 <= var35.field2360; ++var15) {
                                                        class471 var36 = var8[var14][var15];
                                                        if (var36.field3375 != 0) {
                                                            field1381.method126(var36);
                                                        } else if ((var14 != var4 || var15 != var5) && var36.field3382) {
                                                            field1381.method126(var36);
                                                        }
                                                    }
                                                }
                                            }

                                            if (!var3.field3366) {
                                                break;
                                            }
                                        } catch (Exception var20) {
                                            var3.field3366 = false;
                                            break;
                                        }
                                    }
                                } while (!var3.field3382);
                            } while (var3.field3375 != 0);

                            if (var4 > field1390 || var4 <= field1389) {
                                break;
                            }

                            var9 = var8[var4 - 1][var5];
                        } while (var9 != null && var9.field3382);

                        if (var4 < field1390 || var4 >= field1357 - 1) {
                            break;
                        }

                        var9 = var8[var4 + 1][var5];
                    } while (var9 != null && var9.field3382);

                    if (var5 > field1361 || var5 <= field1358) {
                        break;
                    }

                    var9 = var8[var4][var5 - 1];
                } while (var9 != null && var9.field3382);

                if (var5 < field1361 || var5 >= field1359 - 1) {
                    break;
                }

                var9 = var8[var4][var5 + 1];
            } while (var9 != null && var9.field3382);

            var3.field3382 = false;
            --field1362;
            class36 var29 = var3.field3367;
            if (var29 != null && var29.field492 != 0) {
                if (var29.field494 != null) {
                    var29.field494.method2237(0, field1365, field1366, field1399, field1367, var29.field499 - field1347, var29.field493 - field1363 - var29.field492, var29.field496 - field1364, var29.field498);
                }

                if (var29.field497 != null) {
                    var29.field497.method2237(0, field1365, field1366, field1399, field1367, var29.field499 - field1347, var29.field493 - field1363 - var29.field492, var29.field496 - field1364, var29.field498);
                }

                if (var29.field495 != null) {
                    var29.field495.method2237(0, field1365, field1366, field1399, field1367, var29.field499 - field1347, var29.field493 - field1363 - var29.field492, var29.field496 - field1364, var29.field498);
                }
            }

            if (var3.field3387 != 0) {
                class224 var30 = var3.field3376;
                if (var30 != null && !this.method772(var7, var4, var5, var30.field1773.field3601)) {
                    if ((var30.field1769 & var3.field3387) != 0) {
                        var30.field1773.method2237(0, field1365, field1366, field1399, field1367, var30.field1767 - field1347 + var30.field1771, var30.field1772 - field1363, var30.field1768 - field1364 + var30.field1766, var30.field1776);
                    } else if (var30.field1769 == 256) {
                        var11 = var30.field1767 - field1347;
                        var24 = var30.field1772 - field1363;
                        var26 = var30.field1768 - field1364;
                        var14 = var30.field1770;
                        if (var14 != 1 && var14 != 2) {
                            var15 = var11;
                        } else {
                            var15 = -var11;
                        }

                        if (var14 != 2 && var14 != 3) {
                            var16 = var26;
                        } else {
                            var16 = -var26;
                        }

                        if (var16 >= var15) {
                            var30.field1773.method2237(0, field1365, field1366, field1399, field1367, var11 + var30.field1771, var24, var26 + var30.field1766, var30.field1776);
                        } else if (var30.field1774 != null) {
                            var30.field1774.method2237(0, field1365, field1366, field1399, field1367, var11, var24, var26, var30.field1776);
                        }
                    }
                }

                class256 var28 = var3.field3377;
                if (var28 != null) {
                    if ((var28.field1923 & var3.field3387) != 0 && !this.method771(var7, var4, var5, var28.field1923)) {
                        var28.field1924.method2237(0, field1365, field1366, field1399, field1367, var28.field1919 - field1347, var28.field1922 - field1363, var28.field1920 - field1364, var28.field1925);
                    }

                    if ((var28.field1921 & var3.field3387) != 0 && !this.method771(var7, var4, var5, var28.field1921)) {
                        var28.field1926.method2237(0, field1365, field1366, field1399, field1367, var28.field1919 - field1347, var28.field1922 - field1363, var28.field1920 - field1364, var28.field1925);
                    }
                }
            }

            class471 var32;
            if (var6 < this.field1343 - 1) {
                var32 = this.field1384[var6 + 1][var4][var5];
                if (var32 != null && var32.field3382) {
                    field1381.method126(var32);
                }
            }

            if (var4 < field1390) {
                var32 = var8[var4 + 1][var5];
                if (var32 != null && var32.field3382) {
                    field1381.method126(var32);
                }
            }

            if (var5 < field1361) {
                var32 = var8[var4][var5 + 1];
                if (var32 != null && var32.field3382) {
                    field1381.method126(var32);
                }
            }

            if (var4 > field1390) {
                var32 = var8[var4 - 1][var5];
                if (var32 != null && var32.field3382) {
                    field1381.method126(var32);
                }
            }

            if (var5 > field1361) {
                var32 = var8[var4][var5 - 1];
                if (var32 != null && var32.field3382) {
                    field1381.method126(var32);
                }
            }
        }
    }

    void method767(class140 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        int var9;
        int var10 = var9 = (var7 << 7) - field1347;
        int var11;
        int var12 = var11 = (var8 << 7) - field1364;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = this.field1346[var2][var7][var8] - field1363;
        int var18 = this.field1346[var2][var7 + 1][var8] - field1363;
        int var19 = this.field1346[var2][var7 + 1][var8 + 1] - field1363;
        int var20 = this.field1346[var2][var7][var8 + 1] - field1363;
        int var21 = var12 * var5 + var10 * var6 >> 16;
        var12 = var12 * var6 - var10 * var5 >> 16;
        var10 = var21;
        var21 = var17 * var4 - var12 * var3 >> 16;
        var12 = var17 * var3 + var12 * var4 >> 16;
        var17 = var21;
        if (var12 >= 50) {
            var21 = var11 * var5 + var14 * var6 >> 16;
            var11 = var11 * var6 - var14 * var5 >> 16;
            var14 = var21;
            var21 = var18 * var4 - var11 * var3 >> 16;
            var11 = var18 * var3 + var11 * var4 >> 16;
            var18 = var21;
            if (var11 >= 50) {
                var21 = var16 * var5 + var13 * var6 >> 16;
                var16 = var16 * var6 - var13 * var5 >> 16;
                var13 = var21;
                var21 = var19 * var4 - var16 * var3 >> 16;
                var16 = var19 * var3 + var16 * var4 >> 16;
                var19 = var21;
                if (var16 >= 50) {
                    var21 = var15 * var5 + var9 * var6 >> 16;
                    var15 = var15 * var6 - var9 * var5 >> 16;
                    var9 = var21;
                    var21 = var20 * var4 - var15 * var3 >> 16;
                    var15 = var20 * var3 + var15 * var4 >> 16;
                    if (var15 >= 50) {
                        int var22 = class334.method1571() + var10 * class334.method1576() / var12;
                        int var23 = class334.method1572() + var17 * class334.method1576() / var12;
                        int var24 = class334.method1571() + var14 * class334.method1576() / var11;
                        int var25 = class334.method1572() + var18 * class334.method1576() / var11;
                        int var26 = class334.method1571() + var13 * class334.method1576() / var16;
                        int var27 = class334.method1572() + var19 * class334.method1576() / var16;
                        int var28 = class334.method1571() + var9 * class334.method1576() / var15;
                        int var29 = class334.method1572() + var21 * class334.method1576() / var15;
                        float var30 = class134.method616(var12);
                        float var31 = class134.method616(var11);
                        float var32 = class134.method616(var16);
                        float var33 = class134.method616(var15);
                        class334.field2431.field2611 = 0;
                        int var34;
                        int var35;
                        if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                            class334.field2431.field2608 = false;
                            var34 = class334.method1577();
                            if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > var34 || var28 > var34 || var24 > var34) {
                                class334.field2431.field2608 = true;
                            }

                            if (field1360 && method769(field1379, field1371, var27, var29, var25, var26, var28, var24)) {
                                field1372 = var7;
                                field1373 = var8;
                            }

                            if (var1.field1234 == -1) {
                                if (var1.field1228 != 12345678) {
                                    class334.method1585(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field1228, var1.field1230, var1.field1227);
                                }
                            } else if (!field1375) {
                                if (var1.field1231) {
                                    class334.method1584(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field1228, var1.field1230, var1.field1227, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field1234);
                                } else {
                                    class334.method1584(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field1228, var1.field1230, var1.field1227, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field1234);
                                }
                            } else {
                                var35 = class334.field2431.field2606.method1332(var1.field1234);
                                class334.method1585(var27, var29, var25, var26, var28, var24, var32, var33, var31, method768(var35, var1.field1228), method768(var35, var1.field1230), method768(var35, var1.field1227));
                            }
                        }

                        if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                            class334.field2431.field2608 = false;
                            var34 = class334.method1577();
                            if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > var34 || var24 > var34 || var28 > var34) {
                                class334.field2431.field2608 = true;
                            }

                            if (field1360 && method769(field1379, field1371, var23, var25, var29, var22, var24, var28)) {
                                field1372 = var7;
                                field1373 = var8;
                            }

                            if (var1.field1234 == -1) {
                                if (var1.field1229 != 12345678) {
                                    class334.method1585(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.field1229, var1.field1227, var1.field1230);
                                }
                            } else if (!field1375) {
                                class334.method1584(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.field1229, var1.field1227, var1.field1230, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field1234);
                            } else {
                                var35 = class334.field2431.field2606.method1332(var1.field1234);
                                class334.method1585(var23, var25, var29, var22, var24, var28, var30, var31, var33, method768(var35, var1.field1229), method768(var35, var1.field1227), method768(var35, var1.field1230));
                            }
                        }

                    }
                }
            }
        }
    }

    void method785(class105 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = var1.field1026.length;

        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        for (var9 = 0; var9 < var8; ++var9) {
            var10 = var1.field1026[var9] - field1347;
            var11 = var1.field1008[var9] - field1363;
            var12 = var1.field1009[var9] - field1364;
            var13 = var12 * var4 + var10 * var5 >> 16;
            var12 = var12 * var5 - var10 * var4 >> 16;
            var10 = var13;
            var13 = var11 * var3 - var12 * var2 >> 16;
            var12 = var11 * var2 + var12 * var3 >> 16;
            if (var12 < 50) {
                return;
            }

            if (var1.field1016 != null) {
                class105.field1025[var9] = var10;
                class105.field1022[var9] = var13;
                class105.field1014[var9] = var12;
            }

            class105.field1011[var9] = class334.method1571() + var10 * class334.method1576() / var12;
            class105.field1023[var9] = class334.method1572() + var13 * class334.method1576() / var12;
            class105.field1019[var9] = class134.method616(var12);
        }

        class334.field2431.field2611 = 0;
        var8 = var1.field1013.length;

        for (var9 = 0; var9 < var8; ++var9) {
            var10 = var1.field1013[var9];
            var11 = var1.field1021[var9];
            var12 = var1.field1028[var9];
            var13 = class105.field1011[var10];
            int var14 = class105.field1011[var11];
            int var15 = class105.field1011[var12];
            int var16 = class105.field1023[var10];
            int var17 = class105.field1023[var11];
            int var18 = class105.field1023[var12];
            float var19 = class105.field1019[var10];
            float var20 = class105.field1019[var11];
            float var21 = class105.field1019[var12];
            if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
                class334.field2431.field2608 = false;
                int var22 = class334.method1577();
                if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > var22 || var14 > var22 || var15 > var22) {
                    class334.field2431.field2608 = true;
                }

                if (field1360 && method769(field1379, field1371, var16, var17, var18, var13, var14, var15)) {
                    field1372 = var6;
                    field1373 = var7;
                }

                if (var1.field1016 != null && var1.field1016[var9] != -1) {
                    if (!field1375) {
                        if (var1.field1017) {
                            class334.method1584(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field1015[var9], var1.field1010[var9], var1.field1012[var9], class105.field1025[0], class105.field1025[1], class105.field1025[3], class105.field1022[0], class105.field1022[1], class105.field1022[3], class105.field1014[0], class105.field1014[1], class105.field1014[3], var1.field1016[var9]);
                        } else {
                            class334.method1584(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field1015[var9], var1.field1010[var9], var1.field1012[var9], class105.field1025[var10], class105.field1025[var11], class105.field1025[var12], class105.field1022[var10], class105.field1022[var11], class105.field1022[var12], class105.field1014[var10], class105.field1014[var11], class105.field1014[var12], var1.field1016[var9]);
                        }
                    } else {
                        int var23 = class334.field2431.field2606.method1332(var1.field1016[var9]);
                        class334.method1585(var16, var17, var18, var13, var14, var15, var19, var20, var21, method768(var23, var1.field1015[var9]), method768(var23, var1.field1010[var9]), method768(var23, var1.field1012[var9]));
                    }
                } else if (var1.field1015[var9] != 12345678) {
                    class334.method1585(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field1015[var9], var1.field1010[var9], var1.field1012[var9]);
                }
            }
        }

    }

    void method770() {
        int var1 = field1397[field1354];
        class462[] var2 = field1376[field1354];
        field1396 = 0;

        for (int var3 = 0; var3 < var1; ++var3) {
            class462 var4 = var2[var3];
            int var5;
            int var6;
            int var7;
            int var9;
            boolean var13;
            if (var4.field3167 == 1) {
                var5 = var4.field3179 - field1390 + 25;
                if (var5 >= 0 && var5 <= 50) {
                    var6 = var4.field3165 - field1361 + 25;
                    if (var6 < 0) {
                        var6 = 0;
                    }

                    var7 = var4.field3170 - field1361 + 25;
                    if (var7 > 50) {
                        var7 = 50;
                    }

                    var13 = false;

                    while (var6 <= var7) {
                        if (field1368[var5][var6++]) {
                            var13 = true;
                            break;
                        }
                    }

                    if (var13) {
                        var9 = field1347 - var4.field3168;
                        if (var9 > 32) {
                            var4.field3174 = 1;
                        } else {
                            if (var9 >= -32) {
                                continue;
                            }

                            var4.field3174 = 2;
                            var9 = -var9;
                        }

                        var4.field3177 = (var4.field3180 - field1364 << 8) / var9;
                        var4.field3181 = (var4.field3176 - field1364 << 8) / var9;
                        var4.field3171 = (var4.field3172 - field1363 << 8) / var9;
                        var4.field3163 = (var4.field3173 - field1363 << 8) / var9;
                        field1380[field1396++] = var4;
                    }
                }
            } else if (var4.field3167 == 2) {
                var5 = var4.field3165 - field1361 + 25;
                if (var5 >= 0 && var5 <= 50) {
                    var6 = var4.field3179 - field1390 + 25;
                    if (var6 < 0) {
                        var6 = 0;
                    }

                    var7 = var4.field3164 - field1390 + 25;
                    if (var7 > 50) {
                        var7 = 50;
                    }

                    var13 = false;

                    while (var6 <= var7) {
                        if (field1368[var6++][var5]) {
                            var13 = true;
                            break;
                        }
                    }

                    if (var13) {
                        var9 = field1364 - var4.field3180;
                        if (var9 > 32) {
                            var4.field3174 = 3;
                        } else {
                            if (var9 >= -32) {
                                continue;
                            }

                            var4.field3174 = 4;
                            var9 = -var9;
                        }

                        var4.field3175 = (var4.field3168 - field1347 << 8) / var9;
                        var4.field3178 = (var4.field3169 - field1347 << 8) / var9;
                        var4.field3171 = (var4.field3172 - field1363 << 8) / var9;
                        var4.field3163 = (var4.field3173 - field1363 << 8) / var9;
                        field1380[field1396++] = var4;
                    }
                }
            } else if (var4.field3167 == 4) {
                var5 = var4.field3172 - field1363;
                if (var5 > 128) {
                    var6 = var4.field3165 - field1361 + 25;
                    if (var6 < 0) {
                        var6 = 0;
                    }

                    var7 = var4.field3170 - field1361 + 25;
                    if (var7 > 50) {
                        var7 = 50;
                    }

                    if (var6 <= var7) {
                        int var8 = var4.field3179 - field1390 + 25;
                        if (var8 < 0) {
                            var8 = 0;
                        }

                        var9 = var4.field3164 - field1390 + 25;
                        if (var9 > 50) {
                            var9 = 50;
                        }

                        boolean var10 = false;

                        label145:
                        for (int var11 = var8; var11 <= var9; ++var11) {
                            for (int var12 = var6; var12 <= var7; ++var12) {
                                if (field1368[var11][var12]) {
                                    var10 = true;
                                    break label145;
                                }
                            }
                        }

                        if (var10) {
                            var4.field3174 = 5;
                            var4.field3175 = (var4.field3168 - field1347 << 8) / var5;
                            var4.field3178 = (var4.field3169 - field1347 << 8) / var5;
                            var4.field3177 = (var4.field3180 - field1364 << 8) / var5;
                            var4.field3181 = (var4.field3176 - field1364 << 8) / var5;
                            field1380[field1396++] = var4;
                        }
                    }
                }
            }
        }

    }

    boolean method789(int var1, int var2, int var3) {
        int var4 = this.field1351[var1][var2][var3];
        if (var4 == -field1355) {
            return false;
        } else if (var4 == field1355) {
            return true;
        } else {
            int var5 = var2 << 7;
            int var6 = var3 << 7;
            if (this.method782(var5 + 1, this.field1346[var1][var2][var3], var6 + 1) && this.method782(var5 + 128 - 1, this.field1346[var1][var2 + 1][var3], var6 + 1) && this.method782(var5 + 128 - 1, this.field1346[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method782(var5 + 1, this.field1346[var1][var2][var3 + 1], var6 + 128 - 1)) {
                this.field1351[var1][var2][var3] = field1355;
                return true;
            } else {
                this.field1351[var1][var2][var3] = -field1355;
                return false;
            }
        }
    }

    boolean method771(int var1, int var2, int var3, int var4) {
        if (!this.method789(var1, var2, var3)) {
            return false;
        } else {
            int var5 = var2 << 7;
            int var6 = var3 << 7;
            int var7 = this.field1346[var1][var2][var3] - 1;
            int var8 = var7 - 120;
            int var9 = var7 - 230;
            int var10 = var7 - 238;
            if (var4 < 16) {
                if (var4 == 1) {
                    if (var5 > field1347) {
                        if (!this.method782(var5, var7, var6)) {
                            return false;
                        }

                        if (!this.method782(var5, var7, var6 + 128)) {
                            return false;
                        }
                    }

                    if (var1 > 0) {
                        if (!this.method782(var5, var8, var6)) {
                            return false;
                        }

                        if (!this.method782(var5, var8, var6 + 128)) {
                            return false;
                        }
                    }

                    if (!this.method782(var5, var9, var6)) {
                        return false;
                    }

                    return this.method782(var5, var9, var6 + 128);
                }

                if (var4 == 2) {
                    if (var6 < field1364) {
                        if (!this.method782(var5, var7, var6 + 128)) {
                            return false;
                        }

                        if (!this.method782(var5 + 128, var7, var6 + 128)) {
                            return false;
                        }
                    }

                    if (var1 > 0) {
                        if (!this.method782(var5, var8, var6 + 128)) {
                            return false;
                        }

                        if (!this.method782(var5 + 128, var8, var6 + 128)) {
                            return false;
                        }
                    }

                    if (!this.method782(var5, var9, var6 + 128)) {
                        return false;
                    }

                    return this.method782(var5 + 128, var9, var6 + 128);
                }

                if (var4 == 4) {
                    if (var5 < field1347) {
                        if (!this.method782(var5 + 128, var7, var6)) {
                            return false;
                        }

                        if (!this.method782(var5 + 128, var7, var6 + 128)) {
                            return false;
                        }
                    }

                    if (var1 > 0) {
                        if (!this.method782(var5 + 128, var8, var6)) {
                            return false;
                        }

                        if (!this.method782(var5 + 128, var8, var6 + 128)) {
                            return false;
                        }
                    }

                    if (!this.method782(var5 + 128, var9, var6)) {
                        return false;
                    }

                    return this.method782(var5 + 128, var9, var6 + 128);
                }

                if (var4 == 8) {
                    if (var6 > field1364) {
                        if (!this.method782(var5, var7, var6)) {
                            return false;
                        }

                        if (!this.method782(var5 + 128, var7, var6)) {
                            return false;
                        }
                    }

                    if (var1 > 0) {
                        if (!this.method782(var5, var8, var6)) {
                            return false;
                        }

                        if (!this.method782(var5 + 128, var8, var6)) {
                            return false;
                        }
                    }

                    if (!this.method782(var5, var9, var6)) {
                        return false;
                    }

                    return this.method782(var5 + 128, var9, var6);
                }
            }

            if (!this.method782(var5 + 64, var10, var6 + 64)) {
                return false;
            } else if (var4 == 16) {
                return this.method782(var5, var9, var6 + 128);
            } else if (var4 == 32) {
                return this.method782(var5 + 128, var9, var6 + 128);
            } else if (var4 == 64) {
                return this.method782(var5 + 128, var9, var6);
            } else if (var4 == 128) {
                return this.method782(var5, var9, var6);
            } else {
                return true;
            }
        }
    }

    boolean method772(int var1, int var2, int var3, int var4) {
        if (!this.method789(var1, var2, var3)) {
            return false;
        } else {
            int var5 = var2 << 7;
            int var6 = var3 << 7;
            return this.method782(var5 + 1, this.field1346[var1][var2][var3] - var4, var6 + 1) && this.method782(var5 + 128 - 1, this.field1346[var1][var2 + 1][var3] - var4, var6 + 1) && this.method782(var5 + 128 - 1, this.field1346[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method782(var5 + 1, this.field1346[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
        }
    }

    boolean method741(int var1, int var2, int var3, int var4, int var5, int var6) {
        int var7;
        int var8;
        if (var2 == var3 && var4 == var5) {
            if (!this.method789(var1, var2, var4)) {
                return false;
            } else {
                var7 = var2 << 7;
                var8 = var4 << 7;
                return this.method782(var7 + 1, this.field1346[var1][var2][var4] - var6, var8 + 1) && this.method782(var7 + 128 - 1, this.field1346[var1][var2 + 1][var4] - var6, var8 + 1) && this.method782(var7 + 128 - 1, this.field1346[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method782(var7 + 1, this.field1346[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
            }
        } else {
            for (var7 = var2; var7 <= var3; ++var7) {
                for (var8 = var4; var8 <= var5; ++var8) {
                    if (this.field1351[var1][var7][var8] == -field1355) {
                        return false;
                    }
                }
            }

            var7 = (var2 << 7) + 1;
            var8 = (var4 << 7) + 2;
            int var9 = this.field1346[var1][var2][var4] - var6;
            if (!this.method782(var7, var9, var8)) {
                return false;
            } else {
                int var10 = (var3 << 7) - 1;
                if (!this.method782(var10, var9, var8)) {
                    return false;
                } else {
                    int var11 = (var5 << 7) - 1;
                    if (!this.method782(var7, var9, var11)) {
                        return false;
                    } else return this.method782(var10, var9, var11);
                }
            }
        }
    }

    boolean method782(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < field1396; ++var4) {
            class462 var5 = field1380[var4];
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            if (var5.field3174 == 1) {
                var6 = var5.field3168 - var1;
                if (var6 > 0) {
                    var7 = var5.field3180 + (var5.field3177 * var6 >> 8);
                    var8 = var5.field3176 + (var5.field3181 * var6 >> 8);
                    var9 = var5.field3172 + (var5.field3171 * var6 >> 8);
                    var10 = var5.field3173 + (var5.field3163 * var6 >> 8);
                    if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field3174 == 2) {
                var6 = var1 - var5.field3168;
                if (var6 > 0) {
                    var7 = var5.field3180 + (var5.field3177 * var6 >> 8);
                    var8 = var5.field3176 + (var5.field3181 * var6 >> 8);
                    var9 = var5.field3172 + (var5.field3171 * var6 >> 8);
                    var10 = var5.field3173 + (var5.field3163 * var6 >> 8);
                    if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field3174 == 3) {
                var6 = var5.field3180 - var3;
                if (var6 > 0) {
                    var7 = var5.field3168 + (var5.field3175 * var6 >> 8);
                    var8 = var5.field3169 + (var5.field3178 * var6 >> 8);
                    var9 = var5.field3172 + (var5.field3171 * var6 >> 8);
                    var10 = var5.field3173 + (var5.field3163 * var6 >> 8);
                    if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field3174 == 4) {
                var6 = var3 - var5.field3180;
                if (var6 > 0) {
                    var7 = var5.field3168 + (var5.field3175 * var6 >> 8);
                    var8 = var5.field3169 + (var5.field3178 * var6 >> 8);
                    var9 = var5.field3172 + (var5.field3171 * var6 >> 8);
                    var10 = var5.field3173 + (var5.field3163 * var6 >> 8);
                    if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field3174 == 5) {
                var6 = var2 - var5.field3172;
                if (var6 > 0) {
                    var7 = var5.field3168 + (var5.field3175 * var6 >> 8);
                    var8 = var5.field3169 + (var5.field3178 * var6 >> 8);
                    var9 = var5.field3180 + (var5.field3177 * var6 >> 8);
                    var10 = var5.field3176 + (var5.field3181 * var6 >> 8);
                    if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
