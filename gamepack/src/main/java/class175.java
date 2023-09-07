public class class175 extends class490 {
    static int field1484;
    static int[] field1467;
    static int[] field1486;
    static int[] field1490;
    static int[] field1504;

    static {
        field1486 = new int[10000];
        field1504 = new int[10000];
        field1484 = 0;
        field1467 = class334.field2429;
        field1490 = class334.field2427;
    }

    public short field1496;
    public short field1507;
    boolean field1497;
    byte field1481;
    byte[] field1466;
    byte[] field1476;
    byte[] field1477;
    byte[] field1495;
    byte[] field1498;
    class205[] field1492;
    class277[] field1478;
    class277[] field1494;
    int field1468;
    int field1475;
    int field1482;
    int field1499;
    int field1500;
    int field1501;
    int field1502;
    int field1505;
    int[] field1469;
    int[] field1470;
    int[] field1471;
    int[] field1472;
    int[] field1473;
    int[] field1474;
    int[] field1493;
    int[] field1506;
    int[][] field1487;
    int[][] field1488;
    int[][] field1489;
    int[][] field1491;
    short[] field1479;
    short[] field1480;
    short[] field1483;
    short[] field1485;
    short[] field1503;

    class175() {
        this.field1468 = 0;
        this.field1500 = 0;
        this.field1481 = 0;
        this.field1497 = false;
    }

    class175(byte[] var1) {
        this.field1468 = 0;
        this.field1500 = 0;
        this.field1481 = 0;
        this.field1497 = false;
        class78 var2 = new class78(10);
        var2.method290(-2);
        if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
            this.method852(var1);
        } else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
            this.method848(var1);
        } else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
            this.method854(var1);
        } else {
            this.method853(var1);
        }

    }

    public class175(class175[] var1, int var2) {
        this.field1468 = 0;
        this.field1500 = 0;
        this.field1481 = 0;
        this.field1497 = false;
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field1468 = 0;
        this.field1500 = 0;
        this.field1482 = 0;
        this.field1481 = -1;

        int var10;
        class175 var11;
        for (var10 = 0; var10 < var2; ++var10) {
            var11 = var1[var10];
            if (var11 != null) {
                this.field1468 += var11.field1468;
                this.field1500 += var11.field1500;
                this.field1482 += var11.field1482;
                if (var11.field1476 != null) {
                    var4 = true;
                } else {
                    if (this.field1481 == -1) {
                        this.field1481 = var11.field1481;
                    }

                    if (this.field1481 != var11.field1481) {
                        var4 = true;
                    }
                }

                var3 |= var11.field1498 != null;
                var5 |= var11.field1477 != null;
                var6 |= var11.field1506 != null;
                var7 |= var11.field1480 != null;
                var8 |= var11.field1466 != null;
                var9 |= var11.field1487 != null;
            }
        }

        this.field1469 = new int[this.field1468];
        this.field1470 = new int[this.field1468];
        this.field1471 = new int[this.field1468];
        this.field1493 = new int[this.field1468];
        this.field1472 = new int[this.field1500];
        this.field1473 = new int[this.field1500];
        this.field1474 = new int[this.field1500];
        if (var3) {
            this.field1498 = new byte[this.field1500];
        }

        if (var4) {
            this.field1476 = new byte[this.field1500];
        }

        if (var5) {
            this.field1477 = new byte[this.field1500];
        }

        if (var6) {
            this.field1506 = new int[this.field1500];
        }

        if (var7) {
            this.field1480 = new short[this.field1500];
        }

        if (var8) {
            this.field1466 = new byte[this.field1500];
        }

        if (var9) {
            this.field1487 = new int[this.field1468][];
            this.field1491 = new int[this.field1468][];
        }

        this.field1479 = new short[this.field1500];
        if (this.field1482 > 0) {
            this.field1495 = new byte[this.field1482];
            this.field1483 = new short[this.field1482];
            this.field1485 = new short[this.field1482];
            this.field1503 = new short[this.field1482];
        }

        this.field1468 = 0;
        this.field1500 = 0;
        this.field1482 = 0;

        for (var10 = 0; var10 < var2; ++var10) {
            var11 = var1[var10];
            if (var11 != null) {
                int var12;
                for (var12 = 0; var12 < var11.field1500; ++var12) {
                    if (var3 && var11.field1498 != null) {
                        this.field1498[this.field1500] = var11.field1498[var12];
                    }

                    if (var4) {
                        if (var11.field1476 != null) {
                            this.field1476[this.field1500] = var11.field1476[var12];
                        } else {
                            this.field1476[this.field1500] = var11.field1481;
                        }
                    }

                    if (var5 && var11.field1477 != null) {
                        this.field1477[this.field1500] = var11.field1477[var12];
                    }

                    if (var6 && var11.field1506 != null) {
                        this.field1506[this.field1500] = var11.field1506[var12];
                    }

                    if (var7) {
                        if (var11.field1480 != null) {
                            this.field1480[this.field1500] = var11.field1480[var12];
                        } else {
                            this.field1480[this.field1500] = -1;
                        }
                    }

                    if (var8) {
                        if (var11.field1466 != null && var11.field1466[var12] != -1) {
                            this.field1466[this.field1500] = (byte) (var11.field1466[var12] + this.field1482);
                        } else {
                            this.field1466[this.field1500] = -1;
                        }
                    }

                    this.field1479[this.field1500] = var11.field1479[var12];
                    this.field1472[this.field1500] = this.method830(var11, var11.field1472[var12]);
                    this.field1473[this.field1500] = this.method830(var11, var11.field1473[var12]);
                    this.field1474[this.field1500] = this.method830(var11, var11.field1474[var12]);
                    ++this.field1500;
                }

                for (var12 = 0; var12 < var11.field1482; ++var12) {
                    byte var13 = this.field1495[this.field1482] = var11.field1495[var12];
                    if (var13 == 0) {
                        this.field1483[this.field1482] = (short) this.method830(var11, var11.field1483[var12]);
                        this.field1485[this.field1482] = (short) this.method830(var11, var11.field1485[var12]);
                        this.field1503[this.field1482] = (short) this.method830(var11, var11.field1503[var12]);
                    }

                    ++this.field1482;
                }
            }
        }

    }

    public class175(class175 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
        this.field1468 = 0;
        this.field1500 = 0;
        this.field1481 = 0;
        this.field1497 = false;
        this.field1468 = var1.field1468;
        this.field1500 = var1.field1500;
        this.field1482 = var1.field1482;
        int var6;
        if (var2) {
            this.field1469 = var1.field1469;
            this.field1470 = var1.field1470;
            this.field1471 = var1.field1471;
        } else {
            this.field1469 = new int[this.field1468];
            this.field1470 = new int[this.field1468];
            this.field1471 = new int[this.field1468];

            for (var6 = 0; var6 < this.field1468; ++var6) {
                this.field1469[var6] = var1.field1469[var6];
                this.field1470[var6] = var1.field1470[var6];
                this.field1471[var6] = var1.field1471[var6];
            }
        }

        if (var3) {
            this.field1479 = var1.field1479;
        } else {
            this.field1479 = new short[this.field1500];

            for (var6 = 0; var6 < this.field1500; ++var6) {
                this.field1479[var6] = var1.field1479[var6];
            }
        }

        if (!var4 && var1.field1480 != null) {
            this.field1480 = new short[this.field1500];

            for (var6 = 0; var6 < this.field1500; ++var6) {
                this.field1480[var6] = var1.field1480[var6];
            }
        } else {
            this.field1480 = var1.field1480;
        }

        this.field1477 = var1.field1477;
        this.field1472 = var1.field1472;
        this.field1473 = var1.field1473;
        this.field1474 = var1.field1474;
        this.field1498 = var1.field1498;
        this.field1476 = var1.field1476;
        this.field1466 = var1.field1466;
        this.field1481 = var1.field1481;
        this.field1495 = var1.field1495;
        this.field1483 = var1.field1483;
        this.field1485 = var1.field1485;
        this.field1503 = var1.field1503;
        this.field1493 = var1.field1493;
        this.field1506 = var1.field1506;
        this.field1488 = var1.field1488;
        this.field1489 = var1.field1489;
        this.field1478 = var1.field1478;
        this.field1492 = var1.field1492;
        this.field1494 = var1.field1494;
        this.field1487 = var1.field1487;
        this.field1491 = var1.field1491;
        this.field1507 = var1.field1507;
        this.field1496 = var1.field1496;
    }

    public static class175 method850(class68 var0, int var1, int var2) {
        byte[] var3 = var0.method188(var1, 0);
        return var3 == null ? null : new class175(var3);
    }

    static void method845(class175 var0, class175 var1, int var2, int var3, int var4, boolean var5) {
        var0.method844();
        var0.method842();
        var1.method844();
        var1.method842();
        ++field1484;
        int var6 = 0;
        int[] var7 = var1.field1469;
        int var8 = var1.field1468;

        int var9;
        for (var9 = 0; var9 < var0.field1468; ++var9) {
            class277 var10 = var0.field1478[var9];
            if (var10.field2026 != 0) {
                int var11 = var0.field1470[var9] - var3;
                if (var11 <= var1.field1505) {
                    int var12 = var0.field1469[var9] - var2;
                    if (var12 >= var1.field1499 && var12 <= var1.field1475) {
                        int var13 = var0.field1471[var9] - var4;
                        if (var13 >= var1.field1502 && var13 <= var1.field1501) {
                            for (int var14 = 0; var14 < var8; ++var14) {
                                class277 var15 = var1.field1478[var14];
                                if (var12 == var7[var14] && var13 == var1.field1471[var14] && var11 == var1.field1470[var14] && var15.field2026 != 0) {
                                    if (var0.field1494 == null) {
                                        var0.field1494 = new class277[var0.field1468];
                                    }

                                    if (var1.field1494 == null) {
                                        var1.field1494 = new class277[var8];
                                    }

                                    class277 var16 = var0.field1494[var9];
                                    if (var16 == null) {
                                        var16 = var0.field1494[var9] = new class277(var10);
                                    }

                                    class277 var17 = var1.field1494[var14];
                                    if (var17 == null) {
                                        var17 = var1.field1494[var14] = new class277(var15);
                                    }

                                    var16.field2024 += var15.field2024;
                                    var16.field2023 += var15.field2023;
                                    var16.field2025 += var15.field2025;
                                    var16.field2026 += var15.field2026;
                                    var17.field2024 += var10.field2024;
                                    var17.field2023 += var10.field2023;
                                    var17.field2025 += var10.field2025;
                                    var17.field2026 += var10.field2026;
                                    ++var6;
                                    field1486[var9] = field1484;
                                    field1504[var14] = field1484;
                                }
                            }
                        }
                    }
                }
            }
        }

        if (var6 >= 3 && var5) {
            for (var9 = 0; var9 < var0.field1500; ++var9) {
                if (field1486[var0.field1472[var9]] == field1484 && field1486[var0.field1473[var9]] == field1484 && field1486[var0.field1474[var9]] == field1484) {
                    if (var0.field1498 == null) {
                        var0.field1498 = new byte[var0.field1500];
                    }

                    var0.field1498[var9] = 2;
                }
            }

            for (var9 = 0; var9 < var1.field1500; ++var9) {
                if (field1504[var1.field1472[var9]] == field1484 && field1504[var1.field1473[var9]] == field1484 && field1504[var1.field1474[var9]] == field1484) {
                    if (var1.field1498 == null) {
                        var1.field1498 = new byte[var1.field1500];
                    }

                    var1.field1498[var9] = 2;
                }
            }

        }
    }

    static final int method851(int var0, int var1) {
        var1 = var1 * (var0 & 127) >> 7;
        if (var1 < 2) {
            var1 = 2;
        } else if (var1 > 126) {
            var1 = 126;
        }

        return (var0 & 65408) + var1;
    }

    static final int method847(int var0) {
        if (var0 < 2) {
            var0 = 2;
        } else if (var0 > 126) {
            var0 = 126;
        }

        return var0;
    }

    void method852(byte[] var1) {
        class78 var2 = new class78(var1);
        class78 var3 = new class78(var1);
        class78 var4 = new class78(var1);
        class78 var5 = new class78(var1);
        class78 var6 = new class78(var1);
        class78 var7 = new class78(var1);
        class78 var8 = new class78(var1);
        var2.field697 = var1.length - 26;
        int var9 = var2.method309();
        int var10 = var2.method309();
        int var11 = var2.method260();
        int var12 = var2.method260();
        int var13 = var2.method260();
        int var14 = var2.method260();
        int var15 = var2.method260();
        int var16 = var2.method260();
        int var17 = var2.method260();
        int var18 = var2.method260();
        int var19 = var2.method309();
        int var20 = var2.method309();
        int var21 = var2.method309();
        int var22 = var2.method309();
        int var23 = var2.method309();
        int var24 = var2.method309();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28;
        if (var11 > 0) {
            this.field1495 = new byte[var11];
            var2.field697 = 0;

            for (var28 = 0; var28 < var11; ++var28) {
                byte var29 = this.field1495[var28] = var2.method261();
                if (var29 == 0) {
                    ++var25;
                }

                if (var29 >= 1 && var29 <= 3) {
                    ++var26;
                }

                if (var29 == 2) {
                    ++var27;
                }
            }
        }

        var28 = var11 + var9;
        int var30 = var28;
        if (var12 == 1) {
            var28 += var10;
        }

        int var31 = var28;
        var28 += var10;
        int var32 = var28;
        if (var13 == 255) {
            var28 += var10;
        }

        int var33 = var28;
        if (var15 == 1) {
            var28 += var10;
        }

        int var34 = var28;
        var28 += var24;
        int var35 = var28;
        if (var14 == 1) {
            var28 += var10;
        }

        int var36 = var28;
        var28 += var22;
        int var37 = var28;
        if (var16 == 1) {
            var28 += var10 * 2;
        }

        int var38 = var28;
        var28 += var23;
        int var39 = var28;
        var28 += var10 * 2;
        int var40 = var28;
        var28 += var19;
        int var41 = var28;
        var28 += var20;
        int var42 = var28;
        var28 += var21;
        int var43 = var28;
        var28 += var25 * 6;
        int var44 = var28;
        var28 += var26 * 6;
        int var45 = var28;
        var28 += var26 * 6;
        int var46 = var28;
        var28 += var26 * 2;
        int var47 = var28;
        var28 += var26;
        int var48 = var28;
        var28 += var26 * 2 + var27 * 2;
        this.field1468 = var9;
        this.field1500 = var10;
        this.field1482 = var11;
        this.field1469 = new int[var9];
        this.field1470 = new int[var9];
        this.field1471 = new int[var9];
        this.field1472 = new int[var10];
        this.field1473 = new int[var10];
        this.field1474 = new int[var10];
        if (var17 == 1) {
            this.field1493 = new int[var9];
        }

        if (var12 == 1) {
            this.field1498 = new byte[var10];
        }

        if (var13 == 255) {
            this.field1476 = new byte[var10];
        } else {
            this.field1481 = (byte) var13;
        }

        if (var14 == 1) {
            this.field1477 = new byte[var10];
        }

        if (var15 == 1) {
            this.field1506 = new int[var10];
        }

        if (var16 == 1) {
            this.field1480 = new short[var10];
        }

        if (var16 == 1 && var11 > 0) {
            this.field1466 = new byte[var10];
        }

        if (var18 == 1) {
            this.field1487 = new int[var9][];
            this.field1491 = new int[var9][];
        }

        this.field1479 = new short[var10];
        if (var11 > 0) {
            this.field1483 = new short[var11];
            this.field1485 = new short[var11];
            this.field1503 = new short[var11];
        }

        var2.field697 = var11;
        var3.field697 = var40;
        var4.field697 = var41;
        var5.field697 = var42;
        var6.field697 = var34;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;

        int var53;
        int var54;
        int var55;
        int var56;
        int var57;
        for (var53 = 0; var53 < var9; ++var53) {
            var54 = var2.method260();
            var55 = 0;
            if ((var54 & 1) != 0) {
                var55 = var3.method271();
            }

            var56 = 0;
            if ((var54 & 2) != 0) {
                var56 = var4.method271();
            }

            var57 = 0;
            if ((var54 & 4) != 0) {
                var57 = var5.method271();
            }

            this.field1469[var53] = var50 + var55;
            this.field1470[var53] = var51 + var56;
            this.field1471[var53] = var52 + var57;
            var50 = this.field1469[var53];
            var51 = this.field1470[var53];
            var52 = this.field1471[var53];
            if (var17 == 1) {
                this.field1493[var53] = var6.method260();
            }
        }

        if (var18 == 1) {
            for (var53 = 0; var53 < var9; ++var53) {
                var54 = var6.method260();
                this.field1487[var53] = new int[var54];
                this.field1491[var53] = new int[var54];

                for (var55 = 0; var55 < var54; ++var55) {
                    this.field1487[var53][var55] = var6.method260();
                    this.field1491[var53][var55] = var6.method260();
                }
            }
        }

        var2.field697 = var39;
        var3.field697 = var30;
        var4.field697 = var32;
        var5.field697 = var35;
        var6.field697 = var33;
        var7.field697 = var37;
        var8.field697 = var38;

        for (var53 = 0; var53 < var10; ++var53) {
            this.field1479[var53] = (short) var2.method309();
            if (var12 == 1) {
                this.field1498[var53] = var3.method261();
            }

            if (var13 == 255) {
                this.field1476[var53] = var4.method261();
            }

            if (var14 == 1) {
                this.field1477[var53] = var5.method261();
            }

            if (var15 == 1) {
                this.field1506[var53] = var6.method260();
            }

            if (var16 == 1) {
                this.field1480[var53] = (short) (var7.method309() - 1);
            }

            if (this.field1466 != null && this.field1480[var53] != -1) {
                this.field1466[var53] = (byte) (var8.method260() - 1);
            }
        }

        var2.field697 = var36;
        var3.field697 = var31;
        var53 = 0;
        var54 = 0;
        var55 = 0;
        var56 = 0;

        int var58;
        for (var57 = 0; var57 < var10; ++var57) {
            var58 = var3.method260();
            if (var58 == 1) {
                var53 = var2.method271() + var56;
                var54 = var2.method271() + var53;
                var55 = var2.method271() + var54;
                var56 = var55;
                this.field1472[var57] = var53;
                this.field1473[var57] = var54;
                this.field1474[var57] = var55;
            }

            if (var58 == 2) {
                var54 = var55;
                var55 = var2.method271() + var56;
                var56 = var55;
                this.field1472[var57] = var53;
                this.field1473[var57] = var54;
                this.field1474[var57] = var55;
            }

            if (var58 == 3) {
                var53 = var55;
                var55 = var2.method271() + var56;
                var56 = var55;
                this.field1472[var57] = var53;
                this.field1473[var57] = var54;
                this.field1474[var57] = var55;
            }

            if (var58 == 4) {
                int var59 = var53;
                var53 = var54;
                var54 = var59;
                var55 = var2.method271() + var56;
                var56 = var55;
                this.field1472[var57] = var53;
                this.field1473[var57] = var59;
                this.field1474[var57] = var55;
            }
        }

        var2.field697 = var43;
        var3.field697 = var44;
        var4.field697 = var45;
        var5.field697 = var46;
        var6.field697 = var47;
        var7.field697 = var48;

        for (var57 = 0; var57 < var11; ++var57) {
            var58 = this.field1495[var57] & 255;
            if (var58 == 0) {
                this.field1483[var57] = (short) var2.method309();
                this.field1485[var57] = (short) var2.method309();
                this.field1503[var57] = (short) var2.method309();
            }
        }

        var2.field697 = var28;
        var57 = var2.method260();
        if (var57 != 0) {
            new class449();
            var2.method309();
            var2.method309();
            var2.method309();
            var2.method264();
        }

    }

    void method848(byte[] var1) {
        boolean var2 = false;
        boolean var3 = false;
        class78 var4 = new class78(var1);
        class78 var5 = new class78(var1);
        class78 var6 = new class78(var1);
        class78 var7 = new class78(var1);
        class78 var8 = new class78(var1);
        var4.field697 = var1.length - 23;
        int var9 = var4.method309();
        int var10 = var4.method309();
        int var11 = var4.method260();
        int var12 = var4.method260();
        int var13 = var4.method260();
        int var14 = var4.method260();
        int var15 = var4.method260();
        int var16 = var4.method260();
        int var17 = var4.method260();
        int var18 = var4.method309();
        int var19 = var4.method309();
        int var20 = var4.method309();
        int var21 = var4.method309();
        int var22 = var4.method309();
        boolean var23 = false;
        boolean var24 = false;
        int var47 = var9;
        int var25 = var47;
        var47 += var10;
        int var26 = var47;
        if (var13 == 255) {
            var47 += var10;
        }

        int var27 = var47;
        if (var15 == 1) {
            var47 += var10;
        }

        int var28 = var47;
        if (var12 == 1) {
            var47 += var10;
        }

        int var29 = var47;
        var47 += var22;
        int var30 = var47;
        if (var14 == 1) {
            var47 += var10;
        }

        int var31 = var47;
        var47 += var21;
        int var32 = var47;
        var47 += var10 * 2;
        int var33 = var47;
        var47 += var11 * 6;
        int var34 = var47;
        var47 += var18;
        int var35 = var47;
        var47 += var19;
        int var10000 = var47 + var20;
        this.field1468 = var9;
        this.field1500 = var10;
        this.field1482 = var11;
        this.field1469 = new int[var9];
        this.field1470 = new int[var9];
        this.field1471 = new int[var9];
        this.field1472 = new int[var10];
        this.field1473 = new int[var10];
        this.field1474 = new int[var10];
        if (var11 > 0) {
            this.field1495 = new byte[var11];
            this.field1483 = new short[var11];
            this.field1485 = new short[var11];
            this.field1503 = new short[var11];
        }

        if (var16 == 1) {
            this.field1493 = new int[var9];
        }

        if (var12 == 1) {
            this.field1498 = new byte[var10];
            this.field1466 = new byte[var10];
            this.field1480 = new short[var10];
        }

        if (var13 == 255) {
            this.field1476 = new byte[var10];
        } else {
            this.field1481 = (byte) var13;
        }

        if (var14 == 1) {
            this.field1477 = new byte[var10];
        }

        if (var15 == 1) {
            this.field1506 = new int[var10];
        }

        if (var17 == 1) {
            this.field1487 = new int[var9][];
            this.field1491 = new int[var9][];
        }

        this.field1479 = new short[var10];
        var4.field697 = 0;
        var5.field697 = var34;
        var6.field697 = var35;
        var7.field697 = var47;
        var8.field697 = var29;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;

        int var40;
        int var41;
        int var42;
        int var43;
        int var44;
        for (var40 = 0; var40 < var9; ++var40) {
            var41 = var4.method260();
            var42 = 0;
            if ((var41 & 1) != 0) {
                var42 = var5.method271();
            }

            var43 = 0;
            if ((var41 & 2) != 0) {
                var43 = var6.method271();
            }

            var44 = 0;
            if ((var41 & 4) != 0) {
                var44 = var7.method271();
            }

            this.field1469[var40] = var37 + var42;
            this.field1470[var40] = var38 + var43;
            this.field1471[var40] = var39 + var44;
            var37 = this.field1469[var40];
            var38 = this.field1470[var40];
            var39 = this.field1471[var40];
            if (var16 == 1) {
                this.field1493[var40] = var8.method260();
            }
        }

        if (var17 == 1) {
            for (var40 = 0; var40 < var9; ++var40) {
                var41 = var8.method260();
                this.field1487[var40] = new int[var41];
                this.field1491[var40] = new int[var41];

                for (var42 = 0; var42 < var41; ++var42) {
                    this.field1487[var40][var42] = var8.method260();
                    this.field1491[var40][var42] = var8.method260();
                }
            }
        }

        var4.field697 = var32;
        var5.field697 = var28;
        var6.field697 = var26;
        var7.field697 = var30;
        var8.field697 = var27;

        for (var40 = 0; var40 < var10; ++var40) {
            this.field1479[var40] = (short) var4.method309();
            if (var12 == 1) {
                var41 = var5.method260();
                if ((var41 & 1) == 1) {
                    this.field1498[var40] = 1;
                    var2 = true;
                } else {
                    this.field1498[var40] = 0;
                }

                if ((var41 & 2) == 2) {
                    this.field1466[var40] = (byte) (var41 >> 2);
                    this.field1480[var40] = this.field1479[var40];
                    this.field1479[var40] = 127;
                    if (this.field1480[var40] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1466[var40] = -1;
                    this.field1480[var40] = -1;
                }
            }

            if (var13 == 255) {
                this.field1476[var40] = var6.method261();
            }

            if (var14 == 1) {
                this.field1477[var40] = var7.method261();
            }

            if (var15 == 1) {
                this.field1506[var40] = var8.method260();
            }
        }

        var4.field697 = var31;
        var5.field697 = var25;
        var40 = 0;
        var41 = 0;
        var42 = 0;
        var43 = 0;

        int var45;
        int var46;
        for (var44 = 0; var44 < var10; ++var44) {
            var45 = var5.method260();
            if (var45 == 1) {
                var40 = var4.method271() + var43;
                var41 = var4.method271() + var40;
                var42 = var4.method271() + var41;
                var43 = var42;
                this.field1472[var44] = var40;
                this.field1473[var44] = var41;
                this.field1474[var44] = var42;
            }

            if (var45 == 2) {
                var41 = var42;
                var42 = var4.method271() + var43;
                var43 = var42;
                this.field1472[var44] = var40;
                this.field1473[var44] = var41;
                this.field1474[var44] = var42;
            }

            if (var45 == 3) {
                var40 = var42;
                var42 = var4.method271() + var43;
                var43 = var42;
                this.field1472[var44] = var40;
                this.field1473[var44] = var41;
                this.field1474[var44] = var42;
            }

            if (var45 == 4) {
                var46 = var40;
                var40 = var41;
                var41 = var46;
                var42 = var4.method271() + var43;
                var43 = var42;
                this.field1472[var44] = var40;
                this.field1473[var44] = var46;
                this.field1474[var44] = var42;
            }
        }

        var4.field697 = var33;

        for (var44 = 0; var44 < var11; ++var44) {
            this.field1495[var44] = 0;
            this.field1483[var44] = (short) var4.method309();
            this.field1485[var44] = (short) var4.method309();
            this.field1503[var44] = (short) var4.method309();
        }

        if (this.field1466 != null) {
            boolean var48 = false;

            for (var45 = 0; var45 < var10; ++var45) {
                var46 = this.field1466[var45] & 255;
                if (var46 != 255) {
                    if ((this.field1483[var46] & '\uffff') == this.field1472[var45] && (this.field1485[var46] & '\uffff') == this.field1473[var45] && (this.field1503[var46] & '\uffff') == this.field1474[var45]) {
                        this.field1466[var45] = -1;
                    } else {
                        var48 = true;
                    }
                }
            }

            if (!var48) {
                this.field1466 = null;
            }
        }

        if (!var3) {
            this.field1480 = null;
        }

        if (!var2) {
            this.field1498 = null;
        }

    }

    void method854(byte[] var1) {
        class78 var2 = new class78(var1);
        class78 var3 = new class78(var1);
        class78 var4 = new class78(var1);
        class78 var5 = new class78(var1);
        class78 var6 = new class78(var1);
        class78 var7 = new class78(var1);
        class78 var8 = new class78(var1);
        var2.field697 = var1.length - 23;
        int var9 = var2.method309();
        int var10 = var2.method309();
        int var11 = var2.method260();
        int var12 = var2.method260();
        int var13 = var2.method260();
        int var14 = var2.method260();
        int var15 = var2.method260();
        int var16 = var2.method260();
        int var17 = var2.method260();
        int var18 = var2.method309();
        int var19 = var2.method309();
        int var20 = var2.method309();
        int var21 = var2.method309();
        int var22 = var2.method309();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26;
        if (var11 > 0) {
            this.field1495 = new byte[var11];
            var2.field697 = 0;

            for (var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field1495[var26] = var2.method261();
                if (var27 == 0) {
                    ++var23;
                }

                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }

                if (var27 == 2) {
                    ++var25;
                }
            }
        }

        var26 = var11 + var9;
        int var28 = var26;
        if (var12 == 1) {
            var26 += var10;
        }

        int var29 = var26;
        var26 += var10;
        int var30 = var26;
        if (var13 == 255) {
            var26 += var10;
        }

        int var31 = var26;
        if (var15 == 1) {
            var26 += var10;
        }

        int var32 = var26;
        if (var17 == 1) {
            var26 += var9;
        }

        int var33 = var26;
        if (var14 == 1) {
            var26 += var10;
        }

        int var34 = var26;
        var26 += var21;
        int var35 = var26;
        if (var16 == 1) {
            var26 += var10 * 2;
        }

        int var36 = var26;
        var26 += var22;
        int var37 = var26;
        var26 += var10 * 2;
        int var38 = var26;
        var26 += var18;
        int var39 = var26;
        var26 += var19;
        int var40 = var26;
        var26 += var20;
        int var41 = var26;
        var26 += var23 * 6;
        int var42 = var26;
        var26 += var24 * 6;
        int var43 = var26;
        var26 += var24 * 6;
        int var44 = var26;
        var26 += var24 * 2;
        int var45 = var26;
        var26 += var24;
        int var46 = var26;
        var26 += var24 * 2 + var25 * 2;
        this.field1468 = var9;
        this.field1500 = var10;
        this.field1482 = var11;
        this.field1469 = new int[var9];
        this.field1470 = new int[var9];
        this.field1471 = new int[var9];
        this.field1472 = new int[var10];
        this.field1473 = new int[var10];
        this.field1474 = new int[var10];
        if (var17 == 1) {
            this.field1493 = new int[var9];
        }

        if (var12 == 1) {
            this.field1498 = new byte[var10];
        }

        if (var13 == 255) {
            this.field1476 = new byte[var10];
        } else {
            this.field1481 = (byte) var13;
        }

        if (var14 == 1) {
            this.field1477 = new byte[var10];
        }

        if (var15 == 1) {
            this.field1506 = new int[var10];
        }

        if (var16 == 1) {
            this.field1480 = new short[var10];
        }

        if (var16 == 1 && var11 > 0) {
            this.field1466 = new byte[var10];
        }

        this.field1479 = new short[var10];
        if (var11 > 0) {
            this.field1483 = new short[var11];
            this.field1485 = new short[var11];
            this.field1503 = new short[var11];
        }

        var2.field697 = var11;
        var3.field697 = var38;
        var4.field697 = var39;
        var5.field697 = var40;
        var6.field697 = var32;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;

        int var51;
        int var52;
        int var53;
        int var54;
        int var55;
        for (var51 = 0; var51 < var9; ++var51) {
            var52 = var2.method260();
            var53 = 0;
            if ((var52 & 1) != 0) {
                var53 = var3.method271();
            }

            var54 = 0;
            if ((var52 & 2) != 0) {
                var54 = var4.method271();
            }

            var55 = 0;
            if ((var52 & 4) != 0) {
                var55 = var5.method271();
            }

            this.field1469[var51] = var48 + var53;
            this.field1470[var51] = var49 + var54;
            this.field1471[var51] = var50 + var55;
            var48 = this.field1469[var51];
            var49 = this.field1470[var51];
            var50 = this.field1471[var51];
            if (var17 == 1) {
                this.field1493[var51] = var6.method260();
            }
        }

        var2.field697 = var37;
        var3.field697 = var28;
        var4.field697 = var30;
        var5.field697 = var33;
        var6.field697 = var31;
        var7.field697 = var35;
        var8.field697 = var36;

        for (var51 = 0; var51 < var10; ++var51) {
            this.field1479[var51] = (short) var2.method309();
            if (var12 == 1) {
                this.field1498[var51] = var3.method261();
            }

            if (var13 == 255) {
                this.field1476[var51] = var4.method261();
            }

            if (var14 == 1) {
                this.field1477[var51] = var5.method261();
            }

            if (var15 == 1) {
                this.field1506[var51] = var6.method260();
            }

            if (var16 == 1) {
                this.field1480[var51] = (short) (var7.method309() - 1);
            }

            if (this.field1466 != null && this.field1480[var51] != -1) {
                this.field1466[var51] = (byte) (var8.method260() - 1);
            }
        }

        var2.field697 = var34;
        var3.field697 = var29;
        var51 = 0;
        var52 = 0;
        var53 = 0;
        var54 = 0;

        int var56;
        for (var55 = 0; var55 < var10; ++var55) {
            var56 = var3.method260();
            if (var56 == 1) {
                var51 = var2.method271() + var54;
                var52 = var2.method271() + var51;
                var53 = var2.method271() + var52;
                var54 = var53;
                this.field1472[var55] = var51;
                this.field1473[var55] = var52;
                this.field1474[var55] = var53;
            }

            if (var56 == 2) {
                var52 = var53;
                var53 = var2.method271() + var54;
                var54 = var53;
                this.field1472[var55] = var51;
                this.field1473[var55] = var52;
                this.field1474[var55] = var53;
            }

            if (var56 == 3) {
                var51 = var53;
                var53 = var2.method271() + var54;
                var54 = var53;
                this.field1472[var55] = var51;
                this.field1473[var55] = var52;
                this.field1474[var55] = var53;
            }

            if (var56 == 4) {
                int var57 = var51;
                var51 = var52;
                var52 = var57;
                var53 = var2.method271() + var54;
                var54 = var53;
                this.field1472[var55] = var51;
                this.field1473[var55] = var57;
                this.field1474[var55] = var53;
            }
        }

        var2.field697 = var41;
        var3.field697 = var42;
        var4.field697 = var43;
        var5.field697 = var44;
        var6.field697 = var45;
        var7.field697 = var46;

        for (var55 = 0; var55 < var11; ++var55) {
            var56 = this.field1495[var55] & 255;
            if (var56 == 0) {
                this.field1483[var55] = (short) var2.method309();
                this.field1485[var55] = (short) var2.method309();
                this.field1503[var55] = (short) var2.method309();
            }
        }

        var2.field697 = var26;
        var55 = var2.method260();
        if (var55 != 0) {
            new class449();
            var2.method309();
            var2.method309();
            var2.method309();
            var2.method264();
        }

    }

    void method853(byte[] var1) {
        boolean var2 = false;
        boolean var3 = false;
        class78 var4 = new class78(var1);
        class78 var5 = new class78(var1);
        class78 var6 = new class78(var1);
        class78 var7 = new class78(var1);
        class78 var8 = new class78(var1);
        var4.field697 = var1.length - 18;
        int var9 = var4.method309();
        int var10 = var4.method309();
        int var11 = var4.method260();
        int var12 = var4.method260();
        int var13 = var4.method260();
        int var14 = var4.method260();
        int var15 = var4.method260();
        int var16 = var4.method260();
        int var17 = var4.method309();
        int var18 = var4.method309();
        int var19 = var4.method309();
        int var20 = var4.method309();
        boolean var21 = false;
        boolean var22 = false;
        int var45 = var9;
        int var23 = var45;
        var45 += var10;
        int var24 = var45;
        if (var13 == 255) {
            var45 += var10;
        }

        int var25 = var45;
        if (var15 == 1) {
            var45 += var10;
        }

        int var26 = var45;
        if (var12 == 1) {
            var45 += var10;
        }

        int var27 = var45;
        if (var16 == 1) {
            var45 += var9;
        }

        int var28 = var45;
        if (var14 == 1) {
            var45 += var10;
        }

        int var29 = var45;
        var45 += var20;
        int var30 = var45;
        var45 += var10 * 2;
        int var31 = var45;
        var45 += var11 * 6;
        int var32 = var45;
        var45 += var17;
        int var33 = var45;
        var45 += var18;
        int var10000 = var45 + var19;
        this.field1468 = var9;
        this.field1500 = var10;
        this.field1482 = var11;
        this.field1469 = new int[var9];
        this.field1470 = new int[var9];
        this.field1471 = new int[var9];
        this.field1472 = new int[var10];
        this.field1473 = new int[var10];
        this.field1474 = new int[var10];
        if (var11 > 0) {
            this.field1495 = new byte[var11];
            this.field1483 = new short[var11];
            this.field1485 = new short[var11];
            this.field1503 = new short[var11];
        }

        if (var16 == 1) {
            this.field1493 = new int[var9];
        }

        if (var12 == 1) {
            this.field1498 = new byte[var10];
            this.field1466 = new byte[var10];
            this.field1480 = new short[var10];
        }

        if (var13 == 255) {
            this.field1476 = new byte[var10];
        } else {
            this.field1481 = (byte) var13;
        }

        if (var14 == 1) {
            this.field1477 = new byte[var10];
        }

        if (var15 == 1) {
            this.field1506 = new int[var10];
        }

        this.field1479 = new short[var10];
        var4.field697 = 0;
        var5.field697 = var32;
        var6.field697 = var33;
        var7.field697 = var45;
        var8.field697 = var27;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;

        int var38;
        int var39;
        int var40;
        int var41;
        int var42;
        for (var38 = 0; var38 < var9; ++var38) {
            var39 = var4.method260();
            var40 = 0;
            if ((var39 & 1) != 0) {
                var40 = var5.method271();
            }

            var41 = 0;
            if ((var39 & 2) != 0) {
                var41 = var6.method271();
            }

            var42 = 0;
            if ((var39 & 4) != 0) {
                var42 = var7.method271();
            }

            this.field1469[var38] = var35 + var40;
            this.field1470[var38] = var36 + var41;
            this.field1471[var38] = var37 + var42;
            var35 = this.field1469[var38];
            var36 = this.field1470[var38];
            var37 = this.field1471[var38];
            if (var16 == 1) {
                this.field1493[var38] = var8.method260();
            }
        }

        var4.field697 = var30;
        var5.field697 = var26;
        var6.field697 = var24;
        var7.field697 = var28;
        var8.field697 = var25;

        for (var38 = 0; var38 < var10; ++var38) {
            this.field1479[var38] = (short) var4.method309();
            if (var12 == 1) {
                var39 = var5.method260();
                if ((var39 & 1) == 1) {
                    this.field1498[var38] = 1;
                    var2 = true;
                } else {
                    this.field1498[var38] = 0;
                }

                if ((var39 & 2) == 2) {
                    this.field1466[var38] = (byte) (var39 >> 2);
                    this.field1480[var38] = this.field1479[var38];
                    this.field1479[var38] = 127;
                    if (this.field1480[var38] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1466[var38] = -1;
                    this.field1480[var38] = -1;
                }
            }

            if (var13 == 255) {
                this.field1476[var38] = var6.method261();
            }

            if (var14 == 1) {
                this.field1477[var38] = var7.method261();
            }

            if (var15 == 1) {
                this.field1506[var38] = var8.method260();
            }
        }

        var4.field697 = var29;
        var5.field697 = var23;
        var38 = 0;
        var39 = 0;
        var40 = 0;
        var41 = 0;

        int var43;
        int var44;
        for (var42 = 0; var42 < var10; ++var42) {
            var43 = var5.method260();
            if (var43 == 1) {
                var38 = var4.method271() + var41;
                var39 = var4.method271() + var38;
                var40 = var4.method271() + var39;
                var41 = var40;
                this.field1472[var42] = var38;
                this.field1473[var42] = var39;
                this.field1474[var42] = var40;
            }

            if (var43 == 2) {
                var39 = var40;
                var40 = var4.method271() + var41;
                var41 = var40;
                this.field1472[var42] = var38;
                this.field1473[var42] = var39;
                this.field1474[var42] = var40;
            }

            if (var43 == 3) {
                var38 = var40;
                var40 = var4.method271() + var41;
                var41 = var40;
                this.field1472[var42] = var38;
                this.field1473[var42] = var39;
                this.field1474[var42] = var40;
            }

            if (var43 == 4) {
                var44 = var38;
                var38 = var39;
                var39 = var44;
                var40 = var4.method271() + var41;
                var41 = var40;
                this.field1472[var42] = var38;
                this.field1473[var42] = var44;
                this.field1474[var42] = var40;
            }
        }

        var4.field697 = var31;

        for (var42 = 0; var42 < var11; ++var42) {
            this.field1495[var42] = 0;
            this.field1483[var42] = (short) var4.method309();
            this.field1485[var42] = (short) var4.method309();
            this.field1503[var42] = (short) var4.method309();
        }

        if (this.field1466 != null) {
            boolean var46 = false;

            for (var43 = 0; var43 < var10; ++var43) {
                var44 = this.field1466[var43] & 255;
                if (var44 != 255) {
                    if ((this.field1483[var44] & '\uffff') == this.field1472[var43] && (this.field1485[var44] & '\uffff') == this.field1473[var43] && (this.field1503[var44] & '\uffff') == this.field1474[var43]) {
                        this.field1466[var43] = -1;
                    } else {
                        var46 = true;
                    }
                }
            }

            if (!var46) {
                this.field1466 = null;
            }
        }

        if (!var3) {
            this.field1480 = null;
        }

        if (!var2) {
            this.field1498 = null;
        }

    }

    final int method830(class175 var1, int var2) {
        int var3 = -1;
        int var4 = var1.field1469[var2];
        int var5 = var1.field1470[var2];
        int var6 = var1.field1471[var2];

        for (int var7 = 0; var7 < this.field1468; ++var7) {
            if (var4 == this.field1469[var7] && var5 == this.field1470[var7] && var6 == this.field1471[var7]) {
                var3 = var7;
                break;
            }
        }

        if (var3 == -1) {
            this.field1469[this.field1468] = var4;
            this.field1470[this.field1468] = var5;
            this.field1471[this.field1468] = var6;
            if (var1.field1493 != null) {
                this.field1493[this.field1468] = var1.field1493[var2];
            }

            if (var1.field1487 != null) {
                this.field1487[this.field1468] = var1.field1487[var2];
                this.field1491[this.field1468] = var1.field1491[var2];
            }

            var3 = this.field1468++;
        }

        return var3;
    }

    public class175 method831() {
        class175 var1 = new class175();
        if (this.field1498 != null) {
            var1.field1498 = new byte[this.field1500];

			System.arraycopy(this.field1498, 0, var1.field1498, 0, this.field1500);
        }

        var1.field1468 = this.field1468;
        var1.field1500 = this.field1500;
        var1.field1482 = this.field1482;
        var1.field1469 = this.field1469;
        var1.field1470 = this.field1470;
        var1.field1471 = this.field1471;
        var1.field1472 = this.field1472;
        var1.field1473 = this.field1473;
        var1.field1474 = this.field1474;
        var1.field1476 = this.field1476;
        var1.field1477 = this.field1477;
        var1.field1466 = this.field1466;
        var1.field1479 = this.field1479;
        var1.field1480 = this.field1480;
        var1.field1481 = this.field1481;
        var1.field1495 = this.field1495;
        var1.field1483 = this.field1483;
        var1.field1485 = this.field1485;
        var1.field1503 = this.field1503;
        var1.field1493 = this.field1493;
        var1.field1506 = this.field1506;
        var1.field1488 = this.field1488;
        var1.field1489 = this.field1489;
        var1.field1478 = this.field1478;
        var1.field1492 = this.field1492;
        var1.field1507 = this.field1507;
        var1.field1496 = this.field1496;
        return var1;
    }

    public class175 method832(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
        this.method844();
        int var7 = var2 + this.field1499;
        int var8 = var2 + this.field1475;
        int var9 = var4 + this.field1502;
        int var10 = var4 + this.field1501;
        if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
            var7 >>= 7;
            var8 = var8 + 127 >> 7;
            var9 >>= 7;
            var10 = var10 + 127 >> 7;
            if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
                return this;
            } else {
                class175 var11 = new class175();
                var11.field1468 = this.field1468;
                var11.field1500 = this.field1500;
                var11.field1482 = this.field1482;
                var11.field1469 = this.field1469;
                var11.field1471 = this.field1471;
                var11.field1472 = this.field1472;
                var11.field1473 = this.field1473;
                var11.field1474 = this.field1474;
                var11.field1498 = this.field1498;
                var11.field1476 = this.field1476;
                var11.field1477 = this.field1477;
                var11.field1466 = this.field1466;
                var11.field1479 = this.field1479;
                var11.field1480 = this.field1480;
                var11.field1481 = this.field1481;
                var11.field1495 = this.field1495;
                var11.field1483 = this.field1483;
                var11.field1485 = this.field1485;
                var11.field1503 = this.field1503;
                var11.field1493 = this.field1493;
                var11.field1506 = this.field1506;
                var11.field1488 = this.field1488;
                var11.field1489 = this.field1489;
                var11.field1507 = this.field1507;
                var11.field1496 = this.field1496;
                var11.field1470 = new int[var11.field1468];
                int var12;
                int var13;
                int var14;
                int var15;
                int var16;
                int var17;
                int var18;
                int var19;
                int var20;
                int var21;
                if (var6 == 0) {
                    for (var12 = 0; var12 < var11.field1468; ++var12) {
                        var13 = this.field1469[var12] + var2;
                        var14 = this.field1471[var12] + var4;
                        var15 = var13 & 127;
                        var16 = var14 & 127;
                        var17 = var13 >> 7;
                        var18 = var14 >> 7;
                        var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                        var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                        var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                        var11.field1470[var12] = this.field1470[var12] + var21 - var3;
                    }
                } else {
                    for (var12 = 0; var12 < var11.field1468; ++var12) {
                        var13 = (-this.field1470[var12] << 16) / super.field3601;
                        if (var13 < var6) {
                            var14 = this.field1469[var12] + var2;
                            var15 = this.field1471[var12] + var4;
                            var16 = var14 & 127;
                            var17 = var15 & 127;
                            var18 = var14 >> 7;
                            var19 = var15 >> 7;
                            var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                            var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                            int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                            var11.field1470[var12] = this.field1470[var12] + (var22 - var3) * (var6 - var13) / var6;
                        }
                    }
                }

                var11.method843();
                return var11;
            }
        } else {
            return this;
        }
    }

    void method833() {
        int[] var1;
        int var2;
        int var10002;
        int var3;
        int var4;
        if (this.field1493 != null) {
            var1 = new int[256];
            var2 = 0;

            for (var3 = 0; var3 < this.field1468; ++var3) {
                var4 = this.field1493[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }

            this.field1488 = new int[var2 + 1][];

            for (var3 = 0; var3 <= var2; ++var3) {
                this.field1488[var3] = new int[var1[var3]];
                var1[var3] = 0;
            }

            for (var3 = 0; var3 < this.field1468; this.field1488[var4][var1[var4]++] = var3++) {
                var4 = this.field1493[var3];
            }

            this.field1493 = null;
        }

        if (this.field1506 != null) {
            var1 = new int[256];
            var2 = 0;

            for (var3 = 0; var3 < this.field1500; ++var3) {
                var4 = this.field1506[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }

            this.field1489 = new int[var2 + 1][];

            for (var3 = 0; var3 <= var2; ++var3) {
                this.field1489[var3] = new int[var1[var3]];
                var1[var3] = 0;
            }

            for (var3 = 0; var3 < this.field1500; this.field1489[var4][var1[var4]++] = var3++) {
                var4 = this.field1506[var3];
            }

            this.field1506 = null;
        }

    }

    public void method834() {
        for (int var1 = 0; var1 < this.field1468; ++var1) {
            int var2 = this.field1469[var1];
            this.field1469[var1] = this.field1471[var1];
            this.field1471[var1] = -var2;
        }

        this.method843();
    }

    public void method835() {
        for (int var1 = 0; var1 < this.field1468; ++var1) {
            this.field1469[var1] = -this.field1469[var1];
            this.field1471[var1] = -this.field1471[var1];
        }

        this.method843();
    }

    public void method836() {
        for (int var1 = 0; var1 < this.field1468; ++var1) {
            int var2 = this.field1471[var1];
            this.field1471[var1] = this.field1469[var1];
            this.field1469[var1] = -var2;
        }

        this.method843();
    }

    public void method837(int var1) {
        int var2 = field1467[256];
        int var3 = field1490[256];

        for (int var4 = 0; var4 < this.field1468; ++var4) {
            int var5 = this.field1471[var4] * var2 + this.field1469[var4] * var3 >> 16;
            this.field1471[var4] = this.field1471[var4] * var3 - this.field1469[var4] * var2 >> 16;
            this.field1469[var4] = var5;
        }

        this.method843();
    }

    public void method838(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.field1468; ++var4) {
            int[] var10000 = this.field1469;
            var10000[var4] += var1;
            var10000 = this.field1470;
            var10000[var4] += var2;
            var10000 = this.field1471;
            var10000[var4] += var3;
        }

        this.method843();
    }

    public void method849(short var1, short var2) {
        for (int var3 = 0; var3 < this.field1500; ++var3) {
            if (this.field1479[var3] == var1) {
                this.field1479[var3] = var2;
            }
        }

    }

    public void method840(short var1, short var2) {
        if (this.field1480 != null) {
            for (int var3 = 0; var3 < this.field1500; ++var3) {
                if (this.field1480[var3] == var1) {
                    this.field1480[var3] = var2;
                }
            }

        }
    }

    public void method839() {
        int var1;
        for (var1 = 0; var1 < this.field1468; ++var1) {
            this.field1471[var1] = -this.field1471[var1];
        }

        for (var1 = 0; var1 < this.field1500; ++var1) {
            int var2 = this.field1472[var1];
            this.field1472[var1] = this.field1474[var1];
            this.field1474[var1] = var2;
        }

        this.method843();
    }

    public void method841(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.field1468; ++var4) {
            this.field1469[var4] = this.field1469[var4] * var1 / 128;
            this.field1470[var4] = this.field1470[var4] * var2 / 128;
            this.field1471[var4] = this.field1471[var4] * var3 / 128;
        }

        this.method843();
    }

    public void method842() {
        if (this.field1478 == null) {
            this.field1478 = new class277[this.field1468];

            int var1;
            for (var1 = 0; var1 < this.field1468; ++var1) {
                this.field1478[var1] = new class277();
            }

            for (var1 = 0; var1 < this.field1500; ++var1) {
                int var2 = this.field1472[var1];
                int var3 = this.field1473[var1];
                int var4 = this.field1474[var1];
                int var5 = this.field1469[var3] - this.field1469[var2];
                int var6 = this.field1470[var3] - this.field1470[var2];
                int var7 = this.field1471[var3] - this.field1471[var2];
                int var8 = this.field1469[var4] - this.field1469[var2];
                int var9 = this.field1470[var4] - this.field1470[var2];
                int var10 = this.field1471[var4] - this.field1471[var2];
                int var11 = var6 * var10 - var9 * var7;
                int var12 = var7 * var8 - var10 * var5;

                int var13;
                for (var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
                    var11 >>= 1;
                    var12 >>= 1;
                }

                int var14 = (int) Math.sqrt(var11 * var11 + var12 * var12 + var13 * var13);
                if (var14 <= 0) {
                    var14 = 1;
                }

                var11 = var11 * 256 / var14;
                var12 = var12 * 256 / var14;
                var13 = var13 * 256 / var14;
                byte var15;
                if (this.field1498 == null) {
                    var15 = 0;
                } else {
                    var15 = this.field1498[var1];
                }

                if (var15 == 0) {
                    class277 var16 = this.field1478[var2];
                    var16.field2024 += var11;
                    var16.field2023 += var12;
                    var16.field2025 += var13;
                    ++var16.field2026;
                    var16 = this.field1478[var3];
                    var16.field2024 += var11;
                    var16.field2023 += var12;
                    var16.field2025 += var13;
                    ++var16.field2026;
                    var16 = this.field1478[var4];
                    var16.field2024 += var11;
                    var16.field2023 += var12;
                    var16.field2025 += var13;
                    ++var16.field2026;
                } else if (var15 == 1) {
                    if (this.field1492 == null) {
                        this.field1492 = new class205[this.field1500];
                    }

                    class205 var17 = this.field1492[var1] = new class205();
                    var17.field1674 = var11;
                    var17.field1673 = var12;
                    var17.field1675 = var13;
                }
            }

        }
    }

    void method843() {
        this.field1478 = null;
        this.field1494 = null;
        this.field1492 = null;
        this.field1497 = false;
    }

    void method844() {
        if (!this.field1497) {
            super.field3601 = 0;
            this.field1505 = 0;
            this.field1499 = 999999;
            this.field1475 = -999999;
            this.field1501 = -99999;
            this.field1502 = 99999;

            for (int var1 = 0; var1 < this.field1468; ++var1) {
                int var2 = this.field1469[var1];
                int var3 = this.field1470[var1];
                int var4 = this.field1471[var1];
                if (var2 < this.field1499) {
                    this.field1499 = var2;
                }

                if (var2 > this.field1475) {
                    this.field1475 = var2;
                }

                if (var4 < this.field1502) {
                    this.field1502 = var4;
                }

                if (var4 > this.field1501) {
                    this.field1501 = var4;
                }

                if (-var3 > super.field3601) {
                    super.field3601 = -var3;
                }

                if (var3 > this.field1505) {
                    this.field1505 = var3;
                }
            }

            this.field1497 = true;
        }
    }

    public final class448 method846(int var1, int var2, int var3, int var4, int var5) {
        this.method842();
        int var6 = (int) Math.sqrt(var3 * var3 + var4 * var4 + var5 * var5);
        int var7 = var2 * var6 >> 8;
        class448 var8 = new class448();
        var8.field3046 = new int[this.field1500];
        var8.field3047 = new int[this.field1500];
        var8.field3048 = new int[this.field1500];
        if (this.field1482 > 0 && this.field1466 != null) {
            int[] var9 = new int[this.field1482];

            int var10;
            for (var10 = 0; var10 < this.field1500; ++var10) {
                if (this.field1466[var10] != -1) {
                    ++var9[this.field1466[var10] & 255];
                }
            }

            var8.field3054 = 0;

            for (var10 = 0; var10 < this.field1482; ++var10) {
                if (var9[var10] > 0 && this.field1495[var10] == 0) {
                    ++var8.field3054;
                }
            }

            var8.field3055 = new int[var8.field3054];
            var8.field3056 = new int[var8.field3054];
            var8.field3049 = new int[var8.field3054];
            var10 = 0;

            int var11;
            for (var11 = 0; var11 < this.field1482; ++var11) {
                if (var9[var11] > 0 && this.field1495[var11] == 0) {
                    var8.field3055[var10] = this.field1483[var11] & '\uffff';
                    var8.field3056[var10] = this.field1485[var11] & '\uffff';
                    var8.field3049[var10] = this.field1503[var11] & '\uffff';
                    var9[var11] = var10++;
                } else {
                    var9[var11] = -1;
                }
            }

            var8.field3051 = new byte[this.field1500];

            for (var11 = 0; var11 < this.field1500; ++var11) {
                if (this.field1466[var11] != -1) {
                    var8.field3051[var11] = (byte) var9[this.field1466[var11] & 255];
                } else {
                    var8.field3051[var11] = -1;
                }
            }
        }

        for (int var16 = 0; var16 < this.field1500; ++var16) {
            byte var17;
            if (this.field1498 == null) {
                var17 = 0;
            } else {
                var17 = this.field1498[var16];
            }

            byte var18;
            if (this.field1477 == null) {
                var18 = 0;
            } else {
                var18 = this.field1477[var16];
            }

            short var12;
            if (this.field1480 == null) {
                var12 = -1;
            } else {
                var12 = this.field1480[var16];
            }

            if (var18 == -2) {
                var17 = 3;
            }

            if (var18 == -1) {
                var17 = 2;
            }

            class277 var13;
            int var14;
            class205 var19;
            if (var12 == -1) {
                if (var17 != 0) {
                    if (var17 == 1) {
                        var19 = this.field1492[var16];
                        var14 = var1 + (var3 * var19.field1674 + var4 * var19.field1673 + var5 * var19.field1675) / (var7 + var7 / 2);
                        var8.field3046[var16] = method851(this.field1479[var16] & '\uffff', var14);
                        var8.field3048[var16] = -1;
                    } else if (var17 == 3) {
                        var8.field3046[var16] = 128;
                        var8.field3048[var16] = -1;
                    } else {
                        var8.field3048[var16] = -2;
                    }
                } else {
                    int var15 = this.field1479[var16] & '\uffff';
                    if (this.field1494 != null && this.field1494[this.field1472[var16]] != null) {
                        var13 = this.field1494[this.field1472[var16]];
                    } else {
                        var13 = this.field1478[this.field1472[var16]];
                    }

                    var14 = var1 + (var3 * var13.field2024 + var4 * var13.field2023 + var5 * var13.field2025) / (var7 * var13.field2026);
                    var8.field3046[var16] = method851(var15, var14);
                    if (this.field1494 != null && this.field1494[this.field1473[var16]] != null) {
                        var13 = this.field1494[this.field1473[var16]];
                    } else {
                        var13 = this.field1478[this.field1473[var16]];
                    }

                    var14 = var1 + (var3 * var13.field2024 + var4 * var13.field2023 + var5 * var13.field2025) / (var7 * var13.field2026);
                    var8.field3047[var16] = method851(var15, var14);
                    if (this.field1494 != null && this.field1494[this.field1474[var16]] != null) {
                        var13 = this.field1494[this.field1474[var16]];
                    } else {
                        var13 = this.field1478[this.field1474[var16]];
                    }

                    var14 = var1 + (var3 * var13.field2024 + var4 * var13.field2023 + var5 * var13.field2025) / (var7 * var13.field2026);
                    var8.field3048[var16] = method851(var15, var14);
                }
            } else if (var17 != 0) {
                if (var17 == 1) {
                    var19 = this.field1492[var16];
                    var14 = var1 + (var3 * var19.field1674 + var4 * var19.field1673 + var5 * var19.field1675) / (var7 + var7 / 2);
                    var8.field3046[var16] = method847(var14);
                    var8.field3048[var16] = -1;
                } else {
                    var8.field3048[var16] = -2;
                }
            } else {
                if (this.field1494 != null && this.field1494[this.field1472[var16]] != null) {
                    var13 = this.field1494[this.field1472[var16]];
                } else {
                    var13 = this.field1478[this.field1472[var16]];
                }

                var14 = var1 + (var3 * var13.field2024 + var4 * var13.field2023 + var5 * var13.field2025) / (var7 * var13.field2026);
                var8.field3046[var16] = method847(var14);
                if (this.field1494 != null && this.field1494[this.field1473[var16]] != null) {
                    var13 = this.field1494[this.field1473[var16]];
                } else {
                    var13 = this.field1478[this.field1473[var16]];
                }

                var14 = var1 + (var3 * var13.field2024 + var4 * var13.field2023 + var5 * var13.field2025) / (var7 * var13.field2026);
                var8.field3047[var16] = method847(var14);
                if (this.field1494 != null && this.field1494[this.field1474[var16]] != null) {
                    var13 = this.field1494[this.field1474[var16]];
                } else {
                    var13 = this.field1478[this.field1474[var16]];
                }

                var14 = var1 + (var3 * var13.field2024 + var4 * var13.field2023 + var5 * var13.field2025) / (var7 * var13.field2026);
                var8.field3048[var16] = method847(var14);
            }
        }

        this.method833();
        var8.field3094 = this.field1468;
        var8.field3040 = this.field1469;
        var8.field3041 = this.field1470;
        var8.field3045 = this.field1471;
        var8.field3042 = this.field1500;
        var8.field3057 = this.field1472;
        var8.field3044 = this.field1473;
        var8.field3102 = this.field1474;
        var8.field3101 = this.field1476;
        var8.field3050 = this.field1477;
        var8.field3053 = this.field1481;
        var8.field3058 = this.field1488;
        var8.field3059 = this.field1489;
        var8.field3052 = this.field1480;
        var8.field3060 = this.field1487;
        var8.field3084 = this.field1491;
        return var8;
    }
}
