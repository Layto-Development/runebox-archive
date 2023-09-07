import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class class398 {
    public static int field2800;
    protected static boolean field2815;
    static class372 field2811;
    static int field2803;
    static ScheduledExecutorService field2802;
    protected int[] field2805;
    boolean field2817;
    class391 field2806;
    class391[] field2819;
    class391[] field2820;
    int field2801;
    int field2807;
    int field2809;
    int field2810;
    int field2813;
    int field2814;
    int field2816;
    int field2818;
    long field2804;
    long field2808;
    long field2812;

    protected class398() {
        this.field2807 = 32;
        this.field2808 = class206.method982();
        this.field2812 = 0L;
        this.field2813 = 0;
        this.field2814 = 0;
        this.field2816 = 0;
        this.field2804 = 0L;
        this.field2817 = true;
        this.field2801 = 0;
        this.field2819 = new class391[8];
        this.field2820 = new class391[8];
    }

    public static final void method1838(int var0, boolean var1, int var2) {
        field2800 = 22050;
        field2815 = var1;
        field2803 = 2;
    }

    public static final class398 method1837(class108 var0, int var1, int var2) {
        if (field2800 == 0) {
            throw new IllegalStateException();
        } else {
            try {
                class398 var4 = class294.field2129.method1708();
                var4.field2805 = new int[256 * (field2815 ? 2 : 1)];
                var4.field2810 = 2048;
                var4.method1834();
                var4.field2809 = 3072;
                if (var4.field2809 > 16384) {
                    var4.field2809 = 16384;
                }

                var4.method1828(var4.field2809);
                if (field2803 > 0 && null == class466.field3313) {
                    class466.field3313 = new class352();
                    field2802 = Executors.newScheduledThreadPool(1);
                    field2802.scheduleAtFixedRate(class466.field3313, 0L, 10L, TimeUnit.MILLISECONDS);
                }

                if (class466.field3313 != null) {
                    if (null != class466.field3313.field2546[0]) {
                        throw new IllegalArgumentException();
                    }

                    class466.field3313.field2546[0] = var4;
                }

                return var4;
            } catch (Throwable var5) {
                return new class398();
            }
        }
    }

    static final void method1836(class391 var0) {
        var0.field2783 = false;
        if (var0.field2784 != null) {
            var0.field2784.field1941 = 0;
        }

        for (class391 var2 = var0.method1811(); null != var2; var2 = var0.method1812()) {
            method1836(var2);
        }

    }

    static final void method1835(class514 var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
        if (null != var0 && var0.method2501()) {
            if (var0 instanceof class424) {
                class345 var7 = ((class424) var0).field2920;
                if (var7.field2503 != null) {
                    var7 = var7.method1625();
                }

                if (null == var7) {
                    return;
                }
            }

            int var76 = class172.field1443;
            int[] var8 = class172.field1444;
            boolean var9 = var1 < var76;
            int var10 = -2;
            if (var0.field4162 != null && (!var9 || !var0.field4114 && (Client.field4008 == 4 || !var0.field4113 && (Client.field4008 == 0 || Client.field4008 == 3 || Client.field4008 == 1 && ((class283) var0).method1282())))) {
                Client.method2356(var0, var0.field4151);
                if (Client.field3893 > -1 && Client.field3880 < Client.field3812) {
                    Client.field4059[Client.field3880] = class303.field2170.method921(var0.field4162) / 2;
                    Client.field3834[Client.field3880] = class303.field2170.field1617;
                    Client.field3882[Client.field3880] = Client.field3893;
                    Client.field3883[Client.field3880] = Client.field3894 - -2;
                    Client.field3886[Client.field3880] = var0.field4116;
                    Client.field3887[Client.field3880] = var0.field4117;
                    Client.field4035[Client.field3880] = var0.field4115;
                    Client.field3784[Client.field3880] = var0.field4158;
                    Client.field3890[Client.field3880] = var0.field4162;
                    ++Client.field3880;
                    var10 += 12;
                }
            }

            int var16;
            int var23;
            int var24;
            if (!var0.field4125.method1104()) {
                Client.method2356(var0, 15 + var0.field4151);

                for (class201 var11 = (class201) var0.field4125.method1106(); null != var11; var11 = (class201) var0.field4125.method1102()) {
                    class58 var12 = var11.method968(Client.field4078);
                    if (null == var12) {
                        if (var11.method969()) {
                            var11.method221();
                        }
                    } else {
                        class379 var13 = var11.field1649;
                        class331 var14 = var13.method1769();
                        class331 var15 = var13.method1768();
                        int var17 = 0;
                        if (null != var14 && null != var15) {
                            if (var13.field2756 * 2 < var15.field2423) {
                                var17 = var13.field2756;
                            }

                            var16 = var15.field2423 - var17 * 2;
                        } else {
                            var16 = var13.field2755;
                        }

                        int var18 = 255;
                        boolean var19 = true;
                        int var20 = Client.field4078 - var12.field606;
                        int var21 = var12.field603 * var16 / var13.field2755;
                        int var22;
                        int var91;
                        if (var12.field604 > var20) {
                            var22 = var13.field2751 == 0 ? 0 : var13.field2751 * (var20 / var13.field2751);
                            var23 = var16 * var12.field602 / var13.field2755;
                            var91 = (var21 - var23) * var22 / var12.field604 + var23;
                        } else {
                            var91 = var21;
                            var22 = var12.field604 + var13.field2748 - var20;
                            if (var13.field2752 >= 0) {
                                var18 = (var22 << 8) / (var13.field2748 - var13.field2752);
                            }
                        }

                        if (var12.field603 > 0 && var91 < 1) {
                            var91 = 1;
                        }

                        if (null != var14 && var15 != null) {
                            if (var16 == var91) {
                                var91 += var17 * 2;
                            } else {
                                var91 += var17;
                            }

                            var22 = var14.field2419;
                            var10 += var22;
                            var23 = var2 + Client.field3893 - (var16 >> 1);
                            var24 = var3 + Client.field3894 - var10;
                            var23 -= var17;
                            if (var18 >= 0 && var18 < 255) {
                                var14.method1561(var23, var24, var18);
                                class415.method1927(var23, var24, var23 + var91, var24 + var22);
                                var15.method1561(var23, var24, var18);
                            } else {
                                var14.method1563(var23, var24);
                                class415.method1927(var23, var24, var23 + var91, var22 + var24);
                                var15.method1563(var23, var24);
                            }

                            class415.method1921(var2, var3, var2 + var4, var3 + var5);
                            var10 += 2;
                        } else {
                            var10 += 5;
                            if (Client.field3893 > -1) {
                                var22 = var2 + Client.field3893 - (var16 >> 1);
                                var23 = var3 + Client.field3894 - var10;
                                class415.method1914(var22, var23, var91, 5, 65280);
                                class415.method1914(var91 + var22, var23, var16 - var91, 5, 16711680);
                            }

                            var10 += 2;
                        }
                    }
                }
            }

            if (var10 == -2) {
                var10 += 7;
            }

            class283 var77;
            if (var9 && Client.field4078 == var0.field4127 && Client.method2435((class283) var0)) {
                var77 = (class283) var0;
                if (var9) {
                    Client.method2356(var0, 15 + var0.field4151);
                    class197 var78 = Client.field3844.get(class24.field126);
                    var10 += 4;
                    var78.method928(var77.field2070.method1706(), Client.field3893 + var2, var3 + Client.field3894 - var10, 16777215, 0);
                    var10 += 18;
                }
            }

            if (var9) {
                var77 = (class283) var0;
                if (var77.field2073) {
                    return;
                }

                if (var77.field2055 != -1 || var77.field2056 != -1) {
                    Client.method2356(var0, 15 + var0.field4151);
                    if (Client.field3893 > -1) {
                        if (var77.field2055 != -1) {
                            var10 += 25;
                            class494.field3626[var77.field2055].method1563(var2 + Client.field3893 - 12, var3 + Client.field3894 - var10);
                        }

                        if (var77.field2056 != -1) {
                            var10 += 25;
                            class432.field2936[var77.field2056].method1563(var2 + Client.field3893 - 12, Client.field3894 + var3 - var10);
                        }
                    }
                }

                if (var1 >= 0 && Client.field3853 == 10 && var8[var1] == Client.field3816) {
                    Client.method2356(var0, var0.field4151 + 15);
                    if (Client.field3893 > -1) {
                        var10 += class99.field941[1].field2419;
                        class99.field941[1].method1563(Client.field3893 + var2 - 12, Client.field3894 + var3 - var10);
                    }
                }
            } else {
                class424 var79 = (class424) var0;
                int[] var80 = var79.method1954();
                short[] var83 = var79.method1961();
                if (null != var83 && null != var80) {
                    for (int var85 = 0; var85 < var83.length; ++var85) {
                        if (var83[var85] >= 0 && var80[var85] >= 0) {
                            long var87 = (long) var80[var85] << 8 | (long) var83[var85];
                            class331 var89 = (class331) Client.field4066.method1609(var87, (byte) 48);
                            if (var89 == null) {
                                class331[] var90 = class274.method1231(field2811, var80[var85], 0);
                                if (var90 != null && var83[var85] < var90.length) {
                                    var89 = var90[var83[var85]];
                                    Client.field4066.method1610(var87, var89);
                                }
                            }

                            if (var89 != null) {
                                Client.method2356(var0, 15 + var0.field4151);
                                if (Client.field3893 > -1) {
                                    var89.method1563(Client.field3893 + var2 - (var89.field2423 >> 1), Client.field3894 + (var3 - var89.field2419) - 4);
                                }
                            }
                        }
                    }
                }

                if (Client.field3853 == 1 && Client.field3774[var1 - var76] == Client.field3797 && Client.field4078 % 20 < 10) {
                    Client.method2356(var0, 15 + var0.field4151);
                    if (Client.field3893 > -1) {
                        class99.field941[0].method1563(Client.field3893 + var2 - 12, Client.field3894 + var3 - 28);
                    }
                }
            }

            for (int var81 = 0; var81 < 4; ++var81) {
                int var82 = var0.field4122[var81];
                int var84 = var0.field4120[var81];
                class401 var86 = null;
                int var88 = 0;
                if (var84 >= 0) {
                    if (var82 <= Client.field4078) {
                        continue;
                    }

                    var86 = class401.method1849(var0.field4120[var81]);
                    var88 = var86.field2849;
                    if (var86 != null && null != var86.field2853) {
                        var86 = var86.method1842();
                        if (null == var86) {
                            var0.field4122[var81] = -1;
                            continue;
                        }
                    }
                } else if (var82 < 0) {
                    continue;
                }

                var16 = var0.field4123[var81];
                class401 var93 = null;
                if (var16 >= 0) {
                    var93 = class401.method1849(var16);
                    if (var93 != null && var93.field2853 != null) {
                        var93 = var93.method1842();
                    }
                }

                if (var82 - var88 <= Client.field4078) {
                    if (var86 == null) {
                        var0.field4122[var81] = -1;
                    } else {
                        Client.method2356(var0, var0.field4151 / 2);
                        if (Client.field3893 > -1) {
                            boolean var92 = true;
                            if (var81 == 1) {
                                Client.field3894 -= 20;
                            }

                            if (var81 == 2) {
                                Client.field3893 -= 15;
                                Client.field3894 -= 10;
                            }

                            if (var81 == 3) {
                                Client.field3893 += 15;
                                Client.field3894 -= 10;
                            }

                            class331 var96 = null;
                            class331 var94 = null;
                            class331 var95 = null;
                            class331 var97 = null;
                            var23 = 0;
                            var24 = 0;
                            int var25 = 0;
                            int var26 = 0;
                            int var27 = 0;
                            int var28 = 0;
                            int var29 = 0;
                            int var30 = 0;
                            class331 var31 = null;
                            class331 var32 = null;
                            class331 var33 = null;
                            class331 var34 = null;
                            int var35 = 0;
                            int var36 = 0;
                            int var37 = 0;
                            int var38 = 0;
                            int var39 = 0;
                            int var40 = 0;
                            int var41 = 0;
                            int var42 = 0;
                            int var43 = 0;
                            var96 = var86.method1843();
                            int var44;
                            if (var96 != null) {
                                var23 = var96.field2423;
                                var44 = var96.field2419;
                                if (var44 > 0) {
                                    var43 = var44;
                                }

                                var27 = var96.field2417;
                            }

                            var94 = var86.method1840();
                            if (null != var94) {
                                var24 = var94.field2423;
                                var44 = var94.field2419;
                                if (var44 > var43) {
                                    var43 = var44;
                                }

                                var28 = var94.field2417;
                            }

                            var95 = var86.method1844();
                            if (var95 != null) {
                                var25 = var95.field2423;
                                var44 = var95.field2419;
                                if (var44 > var43) {
                                    var43 = var44;
                                }

                                var29 = var95.field2417;
                            }

                            var97 = var86.method1845();
                            if (null != var97) {
                                var26 = var97.field2423;
                                var44 = var97.field2419;
                                if (var44 > var43) {
                                    var43 = var44;
                                }

                                var30 = var97.field2417;
                            }

                            if (var93 != null) {
                                var31 = var93.method1843();
                                if (null != var31) {
                                    var35 = var31.field2423;
                                    var44 = var31.field2419;
                                    if (var44 > var43) {
                                        var43 = var44;
                                    }

                                    var39 = var31.field2417;
                                }

                                var32 = var93.method1840();
                                if (null != var32) {
                                    var36 = var32.field2423;
                                    var44 = var32.field2419;
                                    if (var44 > var43) {
                                        var43 = var44;
                                    }

                                    var40 = var32.field2417;
                                }

                                var33 = var93.method1844();
                                if (var33 != null) {
                                    var37 = var33.field2423;
                                    var44 = var33.field2419;
                                    if (var44 > var43) {
                                        var43 = var44;
                                    }

                                    var41 = var33.field2417;
                                }

                                var34 = var93.method1845();
                                if (null != var34) {
                                    var38 = var34.field2423;
                                    var44 = var34.field2419;
                                    if (var44 > var43) {
                                        var43 = var44;
                                    }

                                    var42 = var34.field2417;
                                }
                            }

                            class413 var98 = var86.method1848();
                            if (var98 == null) {
                                var98 = class58.field605;
                            }

                            class413 var45;
                            if (var93 != null) {
                                var45 = var93.method1848();
                                if (var45 == null) {
                                    var45 = class58.field605;
                                }
                            } else {
                                var45 = class58.field605;
                            }

                            String var46 = null;
                            String var47 = null;
                            boolean var48 = false;
                            int var49 = 0;
                            var46 = var86.method1846(var0.field4103[var81]);
                            int var99 = var98.method921(var46);
                            if (null != var93) {
                                var47 = var93.method1846(var0.field4124[var81]);
                                var49 = var45.method921(var47);
                            }

                            int var50 = 0;
                            int var51 = 0;
                            if (var24 > 0) {
                                if (null == var95 && var97 == null) {
                                    var50 = 1;
                                } else {
                                    var50 = var99 / var24 + 1;
                                }
                            }

                            if (null != var93 && var36 > 0) {
                                if (var33 == null && var34 == null) {
                                    var51 = 1;
                                } else {
                                    var51 = var49 / var36 + 1;
                                }
                            }

                            int var52 = 0;
                            boolean var53 = false;
                            if (var23 > 0) {
                                var52 = var23;
                            }

                            var52 += 2;
                            int var54 = var52;
                            if (var25 > 0) {
                                var52 += var25;
                            }

                            int var55 = var52;
                            int var56 = var52;
                            int var57;
                            if (var24 > 0) {
                                var57 = var24 * var50;
                                var52 += var57;
                                var56 += (var57 - var99) / 2;
                            } else {
                                var52 += var99;
                            }

                            var57 = var52;
                            if (var26 > 0) {
                                var52 += var26;
                            }

                            int var58 = 0;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            int var62 = 0;
                            int var63;
                            if (var93 != null) {
                                var52 += 2;
                                var58 = var52;
                                if (var35 > 0) {
                                    var52 += var35;
                                }

                                var52 += 2;
                                var59 = var52;
                                if (var37 > 0) {
                                    var52 += var37;
                                }

                                var60 = var52;
                                var62 = var52;
                                if (var36 > 0) {
                                    var63 = var51 * var36;
                                    var52 += var63;
                                    var62 += (var63 - var49) / 2;
                                } else {
                                    var52 += var49;
                                }

                                var61 = var52;
                                if (var38 > 0) {
                                    var52 += var38;
                                }
                            }

                            var63 = var0.field4122[var81] - Client.field4078;
                            int var64 = var86.field2847 - var86.field2847 * var63 / var86.field2849;
                            int var65 = var63 * var86.field2841 / var86.field2849 + -var86.field2841;
                            int var66 = var2 + Client.field3893 - (var52 >> 1) + var64;
                            int var67 = Client.field3894 + var3 - 12 + var65;
                            int var68 = var67;
                            int var69 = var43 + var67;
                            int var70 = var86.field2851 + var67 + 15;
                            int var71 = var70 - var98.field1621;
                            int var72 = var70 + var98.field1622;
                            if (var71 < var67) {
                                var68 = var71;
                            }

                            if (var72 > var69) {
                                var69 = var72;
                            }

                            int var73 = 0;
                            int var74;
                            int var75;
                            if (var93 != null) {
                                var73 = var93.field2851 + var67 + 15;
                                var74 = var73 - var45.field1621;
                                var75 = var73 + var45.field1622;
                                if (var74 < var68) {
                                }

                                if (var75 > var69) {
                                }
                            }

                            var74 = 255;
                            if (var86.field2836 >= 0) {
                                var74 = (var63 << 8) / (var86.field2849 - var86.field2836);
                            }

                            if (var74 >= 0 && var74 < 255) {
                                if (var96 != null) {
                                    var96.method1561(var66 - var27, var67, var74);
                                }

                                if (var95 != null) {
                                    var95.method1561(var66 + var54 - var29, var67, var74);
                                }

                                if (var94 != null) {
                                    for (var75 = 0; var75 < var50; ++var75) {
                                        var94.method1561(var75 * var24 + (var55 + var66 - var28), var67, var74);
                                    }
                                }

                                if (null != var97) {
                                    var97.method1561(var66 + var57 - var30, var67, var74);
                                }

                                var98.method926(var46, var66 + var56, var70, var86.field2839, 0, var74);
                                if (var93 != null) {
                                    if (null != var31) {
                                        var31.method1561(var58 + var66 - var39, var67, var74);
                                    }

                                    if (var33 != null) {
                                        var33.method1561(var59 + var66 - var41, var67, var74);
                                    }

                                    if (null != var32) {
                                        for (var75 = 0; var75 < var51; ++var75) {
                                            var32.method1561(var75 * var36 + (var60 + var66 - var40), var67, var74);
                                        }
                                    }

                                    if (null != var34) {
                                        var34.method1561(var66 + var61 - var42, var67, var74);
                                    }

                                    var45.method926(var47, var62 + var66, var73, var93.field2839, 0, var74);
                                }
                            } else {
                                if (var96 != null) {
                                    var96.method1563(var66 - var27, var67);
                                }

                                if (var95 != null) {
                                    var95.method1563(var66 + var54 - var29, var67);
                                }

                                if (null != var94) {
                                    for (var75 = 0; var75 < var50; ++var75) {
                                        var94.method1563(var24 * var75 + (var66 + var55 - var28), var67);
                                    }
                                }

                                if (var97 != null) {
                                    var97.method1563(var57 + var66 - var30, var67);
                                }

                                var98.method949(var46, var66 + var56, var70, var86.field2839 | -16777216, 0);
                                if (null != var93) {
                                    if (null != var31) {
                                        var31.method1563(var58 + var66 - var39, var67);
                                    }

                                    if (var33 != null) {
                                        var33.method1563(var59 + var66 - var41, var67);
                                    }

                                    if (null != var32) {
                                        for (var75 = 0; var75 < var51; ++var75) {
                                            var32.method1563(var66 + var60 - var40 + var75 * var36, var67);
                                        }
                                    }

                                    if (null != var34) {
                                        var34.method1563(var66 + var61 - var42, var67);
                                    }

                                    var45.method949(var47, var66 + var62, var73, var93.field2839 | -16777216, 0);
                                }
                            }
                        }
                    }
                }
            }

        }
    }

    public final synchronized void method1821(class391 var1) {
        this.field2806 = var1;
    }

    public final synchronized void method1833() {
        if (this.field2805 != null) {
            long var2 = class206.method982();

            try {
                if (0L != this.field2812) {
                    if (var2 < this.field2812) {
                        return;
                    }

                    this.method1828(this.field2809);
                    this.field2812 = 0L;
                    this.field2817 = true;
                }

                int var4 = this.method1829();
                if (this.field2816 - var4 > this.field2813) {
                    this.field2813 = this.field2816 - var4;
                }

                int var5 = this.field2818 + this.field2810;
                if (var5 + 256 > 16384) {
                    var5 = 16128;
                }

                if (var5 + 256 > this.field2809) {
                    this.field2809 += 1024;
                    if (this.field2809 > 16384) {
                        this.field2809 = 16384;
                    }

                    this.method1830();
                    this.method1828(this.field2809);
                    var4 = 0;
                    this.field2817 = true;
                    if (var5 + 256 > this.field2809) {
                        var5 = this.field2809 - 256;
                        this.field2818 = var5 - this.field2810;
                    }
                }

                while (var4 < var5) {
                    this.method1826(this.field2805, 256);
                    this.method1822();
                    var4 += 256;
                }

                if (var2 > this.field2804) {
                    if (!this.field2817) {
                        if (this.field2813 == 0 && this.field2814 == 0) {
                            this.method1830();
                            this.field2812 = var2 + 2000L;
                            return;
                        }

                        this.field2818 = Math.min(this.field2814, this.field2813);
                        this.field2814 = this.field2813;
                    } else {
                        this.field2817 = false;
                    }

                    this.field2813 = 0;
                    this.field2804 = var2 + 2000L;
                }

                this.field2816 = var4;
            } catch (Exception var7) {
                this.method1830();
                this.field2812 = var2 + 2000L;
            }

            try {
                if (var2 > 500000L + this.field2808) {
                    var2 = this.field2808;
                }

                while (var2 > this.field2808 + 5000L) {
                    this.method1825(256);
                    this.field2808 += 256000 / field2800;
                }
            } catch (Exception var6) {
                this.field2808 = var2;
            }

        }
    }

    public final void method1823() {
        this.field2817 = true;
    }

    public final synchronized void method1832() {
        this.field2817 = true;

        try {
            this.method1831();
        } catch (Exception var3) {
            this.method1830();
            this.field2812 = class206.method982() + 2000L;
        }

    }

    public final synchronized void method1824() {
        if (class466.field3313 != null) {
            boolean var2 = true;

            for (int var3 = 0; var3 < 2; ++var3) {
                if (class466.field3313.field2546[var3] == this) {
                    class466.field3313.field2546[var3] = null;
                }

                if (null != class466.field3313.field2546[var3]) {
                    var2 = false;
                }
            }

            if (var2) {
                field2802.shutdownNow();
                field2802 = null;
                class466.field3313 = null;
            }
        }

        this.method1830();
        this.field2805 = null;
    }

    final void method1825(int var1) {
        this.field2801 -= 256;
        if (this.field2801 < 0) {
            this.field2801 = 0;
        }

        if (this.field2806 != null) {
            this.field2806.method1813(256);
        }

    }

    final void method1826(int[] var1, int var2) {
        short var3 = 256;
        if (field2815) {
            var3 = 512;
        }

        class292.method1317(var1, 0, var3);
        this.field2801 -= 256;
        if (null != this.field2806 && this.field2801 <= 0) {
            this.field2801 += field2800 >> 4;
            method1836(this.field2806);
            this.method1827(this.field2806, this.field2806.method1810());
            int var4 = 0;
            int var5 = 255;

            int var6;
            class391 var10;
            label104:
            for (var6 = 7; var5 != 0; --var6) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }

                for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
                    if ((var9 & 1) != 0) {
                        var5 &= ~(1 << var7);
                        var10 = null;
                        class391 var11 = this.field2819[var7];

                        label98:
                        while (true) {
                            while (true) {
                                if (null == var11) {
                                    break label98;
                                }

                                class261 var12 = var11.field2784;
                                if (null != var12 && var12.field1941 > var8) {
                                    var5 |= 1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2781;
                                } else {
                                    var11.field2783 = true;
                                    int var13 = var11.method1809();
                                    var4 += var13;
                                    if (null != var12) {
                                        var12.field1941 += var13;
                                    }

                                    if (var4 >= this.field2807) {
                                        break label104;
                                    }

                                    class391 var14 = var11.method1811();
                                    if (null != var14) {
                                        for (int var15 = var11.field2782; var14 != null; var14 = var11.method1812()) {
                                            this.method1827(var14, var15 * var14.method1810() >> 8);
                                        }
                                    }

                                    class391 var18 = var11.field2781;
                                    var11.field2781 = null;
                                    if (var10 == null) {
                                        this.field2819[var7] = var18;
                                    } else {
                                        var10.field2781 = var18;
                                    }

                                    if (var18 == null) {
                                        this.field2820[var7] = var10;
                                    }

                                    var11 = var18;
                                }
                            }
                        }
                    }

                    var7 += 4;
                    ++var8;
                }
            }

            for (var6 = 0; var6 < 8; ++var6) {
                class391 var16 = this.field2819[var6];
                class391[] var17 = this.field2819;
                this.field2820[var6] = null;

                for (var17[var6] = null; var16 != null; var16 = var10) {
                    var10 = var16.field2781;
                    var16.field2781 = null;
                }
            }
        }

        if (this.field2801 < 0) {
            this.field2801 = 0;
        }

        if (this.field2806 != null) {
            this.field2806.method1814(var1, 0, 256);
        }

        this.field2808 = class206.method982();
    }

    final void method1827(class391 var1, int var2) {
        int var4 = var2 >> 5;
        class391 var5 = this.field2820[var4];
        if (var5 == null) {
            this.field2819[var4] = var1;
        } else {
            var5.field2781 = var1;
        }

        this.field2820[var4] = var1;
        var1.field2782 = var2;
    }

    protected void method1834() throws Exception {
    }

    protected void method1828(int var1) throws Exception {
    }

    protected int method1829() throws Exception {
        return this.field2809;
    }

    protected void method1822() throws Exception {
    }

    protected void method1830() {
    }

    protected void method1831() throws Exception {
    }
}
