public class class345 extends class510 {
    public static class289 field2472;
    public static class289 field2478;
    public static class68 field2470;
    public static class68 field2471;
    static int field2506;

    static {
        field2472 = new class289(64);
        field2478 = new class289(50);
    }

    public boolean field2469;
    public boolean field2498;
    public boolean field2502;
    public boolean field2509;
    public boolean field2511;
    public int field2474;
    public int field2476;
    public int field2479;
    public int field2480;
    public int field2481;
    public int field2482;
    public int field2483;
    public int field2484;
    public int field2485;
    public int field2486;
    public int field2487;
    public int field2488;
    public int field2491;
    public int field2496;
    public int field2497;
    public int field2499;
    public int field2505;
    public int field2513;
    public int field2514;
    public int[] field2503;
    public String field2475;
    public String[] field2473;
    public short[] field2490;
    public short[] field2494;
    class208 field2489;
    int field2492;
    int field2500;
    int field2501;
    int field2504;
    int field2507;
    int field2508;
    int[] field2477;
    int[] field2493;
    int[] field2512;
    short[] field2495;
    short[] field2510;
    short[] field2515;

    class345() {
        this.field2475 = class32.field483;
        this.field2476 = 1;
        this.field2479 = -1;
        this.field2480 = -1;
        this.field2481 = -1;
        this.field2496 = -1;
        this.field2483 = -1;
        this.field2484 = -1;
        this.field2485 = -1;
        this.field2486 = -1;
        this.field2487 = -1;
        this.field2488 = -1;
        this.field2513 = -1;
        this.field2482 = -1;
        this.field2491 = -1;
        this.field2497 = -1;
        this.field2514 = -1;
        this.field2473 = new String[5];
        this.field2498 = true;
        this.field2499 = -1;
        this.field2500 = 128;
        this.field2492 = 128;
        this.field2502 = false;
        this.field2501 = 0;
        this.field2504 = 0;
        this.field2505 = 32;
        this.field2507 = -1;
        this.field2508 = -1;
        this.field2509 = true;
        this.field2469 = true;
        this.field2511 = false;
        this.field2512 = null;
        this.field2510 = null;
    }

    public static class345 method1635(int var0) {
        class345 var2 = (class345) field2472.method1307(var0);
        if (null != var2) {
            return var2;
        } else {
            byte[] var3 = field2470.method188(9, var0);
            var2 = new class345();
            var2.field2474 = var0;
            if (null != var3) {
                var2.method1621(new class78(var3), (byte) 61);
            }

            var2.method1620();
            field2472.method1306(var2, var0);
            return var2;
        }
    }

    void method1620() {
    }

    void method1621(class78 var1, byte var2) {
        while (true) {
            int var3 = var1.method260();
            if (var3 == 0) {
                return;
            }

            this.method1622(var1, var3);
        }
    }

    void method1622(class78 var1, int var2) {
        int var4;
        int var5;
        if (var2 == 1) {
            var4 = var1.method260();
            this.field2493 = new int[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field2493[var5] = var1.method309();
            }
        } else if (var2 == 2) {
            this.field2475 = var1.method268();
        } else if (var2 == 12) {
            this.field2476 = var1.method260();
        } else if (var2 == 13) {
            this.field2479 = var1.method309();
        } else if (var2 == 14) {
            this.field2496 = var1.method309();
        } else if (var2 == 15) {
            this.field2480 = var1.method309();
        } else if (var2 == 16) {
            this.field2481 = var1.method309();
        } else if (var2 == 17) {
            this.field2496 = var1.method309();
            this.field2483 = var1.method309();
            this.field2484 = var1.method309();
            this.field2485 = var1.method309();
        } else if (var2 == 18) {
            var1.method309();
        } else if (var2 >= 30 && var2 < 35) {
            this.field2473[var2 - 30] = var1.method268();
            if (this.field2473[var2 - 30].equalsIgnoreCase(class32.field425)) {
                this.field2473[var2 - 30] = null;
            }
        } else if (var2 == 40) {
            var4 = var1.method260();
            this.field2515 = new short[var4];
            this.field2494 = new short[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field2515[var5] = (short) var1.method309();
                this.field2494[var5] = (short) var1.method309();
            }
        } else if (var2 == 41) {
            var4 = var1.method260();
            this.field2495 = new short[var4];
            this.field2490 = new short[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field2495[var5] = (short) var1.method309();
                this.field2490[var5] = (short) var1.method309();
            }
        } else if (var2 == 60) {
            var4 = var1.method260();
            this.field2477 = new int[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field2477[var5] = var1.method309();
            }
        } else if (var2 == 93) {
            this.field2498 = false;
        } else if (var2 == 95) {
            this.field2499 = var1.method309();
        } else if (var2 == 97) {
            this.field2500 = var1.method309();
        } else if (var2 == 98) {
            this.field2492 = var1.method309();
        } else if (var2 == 99) {
            this.field2502 = true;
        } else if (var2 == 100) {
            this.field2501 = var1.method261();
        } else if (var2 == 101) {
            this.field2504 = var1.method261() * 5;
        } else {
            int var6;
            if (var2 == 102) {
                var4 = var1.method260();
                var5 = 0;

                for (var6 = var4; var6 != 0; var6 >>= 1) {
                    ++var5;
                }

                this.field2512 = new int[var5];
                this.field2510 = new short[var5];

                for (int var7 = 0; var7 < var5; ++var7) {
                    if ((var4 & 1 << var7) == 0) {
                        this.field2512[var7] = -1;
                        this.field2510[var7] = -1;
                    } else {
                        this.field2512[var7] = var1.method308();
                        this.field2510[var7] = (short) var1.method272();
                    }
                }
            } else if (var2 == 103) {
                this.field2505 = var1.method309();
            } else if (var2 != 106 && var2 != 118) {
                if (var2 == 107) {
                    this.field2509 = false;
                } else if (var2 == 109) {
                    this.field2469 = false;
                } else if (var2 == 111) {
                    this.field2511 = true;
                } else if (var2 == 114) {
                    this.field2486 = var1.method309();
                } else if (var2 == 115) {
                    this.field2486 = var1.method309();
                    this.field2487 = var1.method309();
                    this.field2488 = var1.method309();
                    this.field2513 = var1.method309();
                } else if (var2 == 116) {
                    this.field2482 = var1.method309();
                } else if (var2 == 117) {
                    this.field2482 = var1.method309();
                    this.field2491 = var1.method309();
                    this.field2497 = var1.method309();
                    this.field2514 = var1.method309();
                } else if (var2 == 249) {
                    this.field2489 = class381.method1774(var1, this.field2489);
                }
            } else {
                this.field2507 = var1.method309();
                if (this.field2507 == 65535) {
                    this.field2507 = -1;
                }

                this.field2508 = var1.method309();
                if (this.field2508 == 65535) {
                    this.field2508 = -1;
                }

                var4 = -1;
                if (var2 == 118) {
                    var4 = var1.method309();
                    if (var4 == 65535) {
                        var4 = -1;
                    }
                }

                var5 = var1.method260();
                this.field2503 = new int[var5 + 2];

                for (var6 = 0; var6 <= var5; ++var6) {
                    this.field2503[var6] = var1.method309();
                    if (this.field2503[var6] == 65535) {
                        this.field2503[var6] = -1;
                    }
                }

                this.field2503[var5 + 1] = var4;
            }
        }

    }

    public final class448 method1623(class124 var1, int var2, class124 var3, int var4, class307 var5) {
        if (null != this.field2503) {
            class345 var12 = this.method1625();
            return null == var12 ? null : var12.method1623(var1, var2, var3, var4, var5);
        } else {
            long var7 = this.field2474;
            if (var5 != null) {
                var7 |= var5.field2251 << 16;
            }

            class448 var9 = (class448) field2478.method1307(var7);
            if (var9 == null) {
                class175 var10 = this.method1633(this.field2493, var5);
                if (null == var10) {
                    return null;
                }

                var9 = var10.method846(this.field2501 + 64, this.field2504 + 850, -30, -50, -30);
                field2478.method1306(var9, var7);
            }

            class448 var11;
            if (var1 != null && var3 != null) {
                var11 = var1.method568(var9, var2, var3, var4);
            } else if (null != var1) {
                var11 = var1.method566(var9, var2);
            } else if (var3 != null) {
                var11 = var3.method566(var9, var4);
            } else {
                var11 = var9.method2044(true);
            }

            if (this.field2500 != 128 || this.field2492 != 128) {
                var11.method2058(this.field2500, this.field2492, this.field2500);
            }

            return var11;
        }
    }

    public final class175 method1624(class307 var1) {
        if (null != this.field2503) {
            class345 var3 = this.method1625();
            return null == var3 ? null : var3.method1624(var1);
        } else {
            return this.method1633(this.field2477, var1);
        }
    }

    class175 method1633(int[] var1, class307 var2) {
        int[] var4 = var1;
        if (var2 != null && null != var2.field2249) {
            var4 = var2.field2249;
        }

        if (var4 == null) {
            return null;
        } else {
            boolean var5 = false;

            for (int var6 = 0; var6 < var4.length; ++var6) {
                if (var4[var6] != -1 && !field2471.method190(var4[var6], 0)) {
                    var5 = true;
                }
            }

            if (var5) {
                return null;
            } else {
                class175[] var10 = new class175[var4.length];

                for (int var7 = 0; var7 < var4.length; ++var7) {
                    var10[var7] = class175.method850(field2471, var4[var7], 0);
                }

                class175 var11;
                if (var10.length == 1) {
                    var11 = var10[0];
                    if (var11 == null) {
                        var11 = new class175(var10, var10.length);
                    }
                } else {
                    var11 = new class175(var10, var10.length);
                }

                short[] var8;
                int var9;
                if (this.field2515 != null) {
                    var8 = this.field2494;
                    if (var2 != null && null != var2.field2250) {
                        var8 = var2.field2250;
                    }

                    for (var9 = 0; var9 < this.field2515.length; ++var9) {
                        var11.method849(this.field2515[var9], var8[var9]);
                    }
                }

                if (this.field2495 != null) {
                    var8 = this.field2490;
                    if (var2 != null && null != var2.field2252) {
                        var8 = var2.field2252;
                    }

                    for (var9 = 0; var9 < this.field2495.length; ++var9) {
                        var11.method840(this.field2495[var9], var8[var9]);
                    }
                }

                return var11;
            }
        }
    }

    public final class345 method1625() {
        int var2 = -1;
        if (this.field2507 != -1) {
            var2 = class10.method20(this.field2507);
        } else if (this.field2508 != -1) {
            var2 = class10.field46[this.field2508];
        }

        int var3;
        if (var2 >= 0 && var2 < this.field2503.length - 1) {
            var3 = this.field2503[var2];
        } else {
            var3 = this.field2503[this.field2503.length - 1];
        }

        return var3 != -1 ? method1635(var3) : null;
    }

    public boolean method1629() {
        if (null == this.field2503) {
            return true;
        } else {
            int var2 = -1;
            if (this.field2507 != -1) {
                var2 = class10.method20(this.field2507);
            } else if (this.field2508 != -1) {
                var2 = class10.field46[this.field2508];
            }

            if (var2 >= 0 && var2 < this.field2503.length) {
                return this.field2503[var2] != -1;
            } else {
                return this.field2503[this.field2503.length - 1] != -1;
            }
        }
    }

    public int method1634(int var1, int var2) {
        class208 var5 = this.field2489;
        int var4;
        if (var5 == null) {
            var4 = var2;
        } else {
            class170 var6 = (class170) var5.method990(var1);
            if (var6 == null) {
                var4 = var2;
            } else {
                var4 = var6.field1437;
            }
        }

        return var4;
    }

    public String method1632(int var1, String var2) {
        class208 var5 = this.field2489;
        String var4;
        if (var5 == null) {
            var4 = var2;
        } else {
            class371 var6 = (class371) var5.method990(var1);
            if (null == var6) {
                var4 = var2;
            } else {
                var4 = (String) var6.field2646;
            }
        }

        return var4;
    }

    public boolean method1627() {
        return this.field2512 != null && this.field2510 != null;
    }

    public int[] method1628() {
        return this.field2512;
    }

    public int method1626(int var1) {
        return this.field2512 != null && var1 < this.field2512.length ? this.field2512[var1] : -1;
    }

    public short[] method1630() {
        return this.field2510;
    }

    public short method1631(int var1) {
        return null != this.field2510 && var1 < this.field2510.length ? this.field2510[var1] : -1;
    }
}
