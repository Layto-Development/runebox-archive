public class class535 implements class330 {
    public static final class535 field4252;
    public static final class535 field4253;
    static final class535 field4254;
    static final class535 field4255;
    static final class535 field4256;
    static class161 field4259;
    static String field4260;

    static {
        field4253 = new class535(0, "POST", true, true);
        field4252 = new class535(1, "GET", true, false);
        field4256 = new class535(2, "PUT", false, true);
        field4254 = new class535(3, "PATCH", false, true);
        field4255 = new class535(4, "DELETE", false, true);
    }

    boolean field4258;
    boolean field4261;
    int field4251;
    String field4257;

    class535(int var1, String var2, boolean var3, boolean var4) {
        this.field4251 = var1;
        this.field4257 = var2;
        this.field4261 = var3;
        this.field4258 = var4;
    }

    static final void method2579(class97[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        for (int var9 = 0; var9 < var0.length; ++var9) {
            class97 var10 = var0[var9];
            if (null != var10 && var1 == var10.field808 && (var10.method393() || Client.method2420(var10) != 0 || var10 == Client.field3978)) {
                if (var10.field871) {
                    if (Client.method2397(var10)) {
                        continue;
                    }
                } else if (var10.field793 == 0 && class423.field2915 != var10 && Client.method2397(var10)) {
                    continue;
                }

                if (var10.field793 == 11) {
                    if (var10.method414(class174.field1465)) {
                        if (var10.method416()) {
                            Client.method2424(var10);
                            Client.method2363(var10.field923, var10, true);
                        }

                        if (var10.field856 != null) {
                            class26 var11 = new class26();
                            var11.field138 = var10;
                            var11.field141 = var10.field856;
                            Client.field3990.method126(var11);
                        }
                    }
                } else if (var10.field793 == 12 && var10.method408()) {
                    Client.method2424(var10);
                }

                int var27 = var10.field792 + var6;
                int var12 = var7 + var10.field805;
                int var13;
                int var14;
                int var15;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var10.field793 == 9) {
                    var17 = var27;
                    var18 = var12;
                    var19 = var27 + var10.field806;
                    int var20 = var10.field783 + var12;
                    if (var19 < var27) {
                        var17 = var19;
                        var19 = var27;
                    }

                    if (var20 < var12) {
                        var18 = var20;
                        var20 = var12;
                    }

                    ++var19;
                    ++var20;
                    var13 = var17 > var2 ? var17 : var2;
                    var14 = var18 > var3 ? var18 : var3;
                    var15 = var19 < var4 ? var19 : var4;
                    var16 = var20 < var5 ? var20 : var5;
                } else {
                    var17 = var27 + var10.field806;
                    var18 = var10.field783 + var12;
                    var13 = var27 > var2 ? var27 : var2;
                    var14 = var12 > var3 ? var12 : var3;
                    var15 = var17 < var4 ? var17 : var4;
                    var16 = var18 < var5 ? var18 : var5;
                }

                if (Client.field3959 == var10) {
                    Client.field4011 = true;
                    Client.field3813 = var27;
                    Client.field3885 = var12;
                }

                boolean var28 = false;
                if (var10.field863) {
                    switch (Client.field3789) {
                        case 0:
                            var28 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var10.field791 >>> 16 == Client.field3950) {
                                var28 = true;
                            }
                            break;
                        case 3:
                            if (Client.field3950 == var10.field791) {
                                var28 = true;
                            }
                    }
                }

                if (var28 || !var10.field871 || var13 < var15 && var14 < var16) {
                    if (var10.field871) {
                        class26 var29;
                        if (var10.field933) {
                            if (class499.field3651 >= var13 && class499.field3634 >= var14 && class499.field3651 < var15 && class499.field3634 < var16) {
                                for (var29 = (class26) Client.field3990.method122(); var29 != null; var29 = (class26) Client.field3990.method124()) {
                                    if (var29.field149) {
                                        var29.method221();
                                        var29.field138.field811 = false;
                                    }
                                }

                                Client.method2495();
                                if (class493.field3624 == 0) {
                                    Client.field3959 = null;
                                    Client.field3978 = null;
                                }

                                if (!Client.field3888) {
                                    Client.method2464();
                                }
                            }
                        } else if (var10.field934 && class499.field3651 >= var13 && class499.field3634 >= var14 && class499.field3651 < var15 && class499.field3634 < var16) {
                            for (var29 = (class26) Client.field3990.method122(); null != var29; var29 = (class26) Client.field3990.method124()) {
                                if (var29.field149 && var29.field138.field816 == var29.field141) {
                                    var29.method221();
                                }
                            }
                        }
                    }

                    var18 = class499.field3651;
                    var19 = class499.field3634;
                    if (class499.field3645 != 0) {
                        var18 = class499.field3646;
                        var19 = class499.field3647;
                    }

                    boolean var30 = var18 >= var13 && var19 >= var14 && var18 < var15 && var19 < var16;
                    if (var10.field817 == 1337) {
                        if (!Client.field3788 && !Client.field3888 && var30) {
                            Client.method2394(var18, var19, var13, var14);
                        }
                    } else if (var10.field817 == 1338) {
                        Client.method2468(var10, var27, var12);
                    } else {
                        if (var10.field817 == 1400) {
                            class466.field3310.method480(class499.field3651, class499.field3634, var30, var27, var12, var10.field806, var10.field783);
                        }

                        if (!Client.field3888 && var30) {
                            if (var10.field817 == 1400) {
                                class466.field3310.method473(var27, var12, var10.field806, var10.field783, var18, var19);
                            } else {
                                Client.method2401(var10);
                            }
                        }

                        boolean var22;
                        int var24;
                        if (var28) {
                            for (int var21 = 0; var21 < var10.field840.length; ++var21) {
                                var22 = false;
                                boolean var23 = false;
                                if (null != var10.field840[var21]) {
                                    for (var24 = 0; var24 < var10.field840[var21].length; ++var24) {
                                        boolean var25 = false;
                                        if (null != var10.field932) {
                                            var25 = Client.field3923.method958(var10.field840[var21][var24]);
                                        }

                                        if (Client.method2477(var10.field840[var21][var24]) || var25) {
                                            var22 = true;
                                            if (var10.field932 != null && var10.field932[var21] > Client.field4078) {
                                                break;
                                            }

                                            byte var26 = var10.field936[var21][var24];
                                            if (var26 == 0 || ((var26 & 8) == 0 || !Client.field3923.method958(86) && !Client.field3923.method958(82) && !Client.field3923.method958(81)) && ((var26 & 2) == 0 || Client.field3923.method958(86)) && ((var26 & 1) == 0 || Client.field3923.method958(82)) && ((var26 & 4) == 0 || Client.field3923.method958(81))) {
                                                var23 = true;
                                                break;
                                            }
                                        }
                                    }
                                }

                                if (var23) {
                                    if (var21 < 10) {
                                        Client.method2353(var21 + 1, var10.field791, var10.field910, var10.field919, "");
                                    } else if (var21 == 10) {
                                        class276.method1244();
                                        Client.method2458(var10.field791, var10.field910, class383.method1776(Client.method2420(var10)), var10.field919);
                                        Client.field3958 = Client.method2450(var10);
                                        if (null == Client.field3958) {
                                            Client.field3958 = class32.field483;
                                        }

                                        Client.field3969 = var10.field795 + class49.method140(16777215);
                                    }

                                    var24 = var10.field866[var21];
                                    if (var10.field932 == null) {
                                        var10.field932 = new int[var10.field840.length];
                                    }

                                    if (var10.field867 == null) {
                                        var10.field867 = new int[var10.field840.length];
                                    }

                                    if (var24 != 0) {
                                        if (var10.field932[var21] == 0) {
                                            var10.field932[var21] = var10.field867[var21] + var24 + Client.field4078;
                                        } else {
                                            var10.field932[var21] = Client.field4078 + var24;
                                        }
                                    } else {
                                        var10.field932[var21] = Integer.MAX_VALUE;
                                    }
                                }

                                if (!var22 && null != var10.field932) {
                                    var10.field932[var21] = 0;
                                }
                            }
                        }

                        if (var10.field871) {
							var30 = class499.field3651 >= var13 && class499.field3634 >= var14 && class499.field3651 < var15 && class499.field3634 < var16;

                            boolean var31 = (class499.field3641 == 1 || !class218.field1747 && class499.field3641 == 4) && var30;
							var22 = (class499.field3645 == 1 || !class218.field1747 && class499.field3645 == 4) && class499.field3646 >= var13 && class499.field3647 >= var14 && class499.field3646 < var15 && class499.field3647 < var16;

                            if (var22) {
                                Client.method2427(var10, class499.field3646 - var27, class499.field3647 - var12);
                            }

                            if (var10.method394()) {
                                if (var22) {
                                    Client.field4029.method126(new class347(0, class499.field3651 - var27, class499.field3634 - var12, var10));
                                }

                                if (var31) {
                                    Client.field4029.method126(new class347(1, class499.field3651 - var27, class499.field3634 - var12, var10));
                                }
                            }

                            if (var10.field817 == 1400) {
                                class466.field3310.method434(var18, var19, var30 & var31, var30 & var22);
                            }

                            if (null != Client.field3959 && Client.field3959 != var10 && var30 && class383.method1777(Client.method2420(var10))) {
                                Client.field3963 = var10;
                            }

                            if (Client.field3978 == var10) {
                                Client.field3964 = true;
                                Client.field3965 = var27;
                                Client.field3966 = var12;
                            }

                            if (var10.field874) {
                                class26 var32;
                                if (var30 && Client.field3988 != 0 && var10.field816 != null) {
                                    var32 = new class26();
                                    var32.field149 = true;
                                    var32.field138 = var10;
                                    var32.field142 = Client.field3988;
                                    var32.field141 = var10.field816;
                                    Client.field3990.method126(var32);
                                }

                                if (Client.field3959 != null || Client.field3888) {
                                    var22 = false;
                                    var31 = false;
                                    var30 = false;
                                }

                                if (!var10.field925 && var22) {
                                    var10.field925 = true;
                                    if (var10.field843 != null) {
                                        var32 = new class26();
                                        var32.field149 = true;
                                        var32.field138 = var10;
                                        var32.field139 = class499.field3646 - var27;
                                        var32.field142 = class499.field3647 - var12;
                                        var32.field141 = var10.field843;
                                        Client.field3990.method126(var32);
                                    }
                                }

                                if (var10.field925 && var31 && var10.field789 != null) {
                                    var32 = new class26();
                                    var32.field149 = true;
                                    var32.field138 = var10;
                                    var32.field139 = class499.field3651 - var27;
                                    var32.field142 = class499.field3634 - var12;
                                    var32.field141 = var10.field789;
                                    Client.field3990.method126(var32);
                                }

                                if (var10.field925 && !var31) {
                                    var10.field925 = false;
                                    if (var10.field876 != null) {
                                        var32 = new class26();
                                        var32.field149 = true;
                                        var32.field138 = var10;
                                        var32.field139 = class499.field3651 - var27;
                                        var32.field142 = class499.field3634 - var12;
                                        var32.field141 = var10.field876;
                                        Client.field3992.method126(var32);
                                    }
                                }

                                if (var31 && null != var10.field879) {
                                    var32 = new class26();
                                    var32.field149 = true;
                                    var32.field138 = var10;
                                    var32.field139 = class499.field3651 - var27;
                                    var32.field142 = class499.field3634 - var12;
                                    var32.field141 = var10.field879;
                                    Client.field3990.method126(var32);
                                }

                                if (!var10.field811 && var30) {
                                    var10.field811 = true;
                                    if (null != var10.field880) {
                                        var32 = new class26();
                                        var32.field149 = true;
                                        var32.field138 = var10;
                                        var32.field139 = class499.field3651 - var27;
                                        var32.field142 = class499.field3634 - var12;
                                        var32.field141 = var10.field880;
                                        Client.field3990.method126(var32);
                                    }
                                }

                                if (var10.field811 && var30 && null != var10.field881) {
                                    var32 = new class26();
                                    var32.field149 = true;
                                    var32.field138 = var10;
                                    var32.field139 = class499.field3651 - var27;
                                    var32.field142 = class499.field3634 - var12;
                                    var32.field141 = var10.field881;
                                    Client.field3990.method126(var32);
                                }

                                if (var10.field811 && !var30) {
                                    var10.field811 = false;
                                    if (null != var10.field852) {
                                        var32 = new class26();
                                        var32.field149 = true;
                                        var32.field138 = var10;
                                        var32.field139 = class499.field3651 - var27;
                                        var32.field142 = class499.field3634 - var12;
                                        var32.field141 = var10.field852;
                                        Client.field3992.method126(var32);
                                    }
                                }

                                if (var10.field784 != null) {
                                    var32 = new class26();
                                    var32.field138 = var10;
                                    var32.field141 = var10.field784;
                                    Client.field3976.method126(var32);
                                }

                                int var35;
                                class26 var37;
                                int var38;
                                if (var10.field858 != null && Client.field3973 > var10.field927) {
                                    if (var10.field888 != null && Client.field3973 - var10.field927 <= 32) {
                                        label642:
                                        for (var38 = var10.field927; var38 < Client.field3973; ++var38) {
                                            var24 = Client.field3972[var38 & 31];

                                            for (var35 = 0; var35 < var10.field888.length; ++var35) {
                                                if (var10.field888[var35] == var24) {
                                                    var37 = new class26();
                                                    var37.field138 = var10;
                                                    var37.field141 = var10.field858;
                                                    Client.field3990.method126(var37);
                                                    break label642;
                                                }
                                            }
                                        }
                                    } else {
                                        var32 = new class26();
                                        var32.field138 = var10;
                                        var32.field141 = var10.field858;
                                        Client.field3990.method126(var32);
                                    }

                                    var10.field927 = Client.field3973;
                                }

                                if (null != var10.field889 && Client.field3975 > var10.field928) {
                                    if (null != var10.field820 && Client.field3975 - var10.field928 <= 32) {
                                        label618:
                                        for (var38 = var10.field928; var38 < Client.field3975; ++var38) {
                                            var24 = Client.field3974[var38 & 31];

                                            for (var35 = 0; var35 < var10.field820.length; ++var35) {
                                                if (var24 == var10.field820[var35]) {
                                                    var37 = new class26();
                                                    var37.field138 = var10;
                                                    var37.field141 = var10.field889;
                                                    Client.field3990.method126(var37);
                                                    break label618;
                                                }
                                            }
                                        }
                                    } else {
                                        var32 = new class26();
                                        var32.field138 = var10;
                                        var32.field141 = var10.field889;
                                        Client.field3990.method126(var32);
                                    }

                                    var10.field928 = Client.field3975;
                                }

                                if (null != var10.field891 && Client.field3977 > var10.field929) {
                                    if (null != var10.field892 && Client.field3977 - var10.field929 <= 32) {
                                        label594:
                                        for (var38 = var10.field929; var38 < Client.field3977; ++var38) {
                                            var24 = Client.field3899[var38 & 31];

                                            for (var35 = 0; var35 < var10.field892.length; ++var35) {
                                                if (var24 == var10.field892[var35]) {
                                                    var37 = new class26();
                                                    var37.field138 = var10;
                                                    var37.field141 = var10.field891;
                                                    Client.field3990.method126(var37);
                                                    break label594;
                                                }
                                            }
                                        }
                                    } else {
                                        var32 = new class26();
                                        var32.field138 = var10;
                                        var32.field141 = var10.field891;
                                        Client.field3990.method126(var32);
                                    }

                                    var10.field929 = Client.field3977;
                                }

                                if (Client.field3980 > var10.field860 && null != var10.field782) {
                                    var32 = new class26();
                                    var32.field138 = var10;
                                    var32.field141 = var10.field782;
                                    Client.field3990.method126(var32);
                                }

                                if (Client.field3981 > var10.field860 && var10.field848 != null) {
                                    var32 = new class26();
                                    var32.field138 = var10;
                                    var32.field141 = var10.field848;
                                    Client.field3990.method126(var32);
                                }

                                if (Client.field3982 > var10.field860 && var10.field902 != null) {
                                    var32 = new class26();
                                    var32.field138 = var10;
                                    var32.field141 = var10.field902;
                                    Client.field3990.method126(var32);
                                }

                                if (Client.field3983 > var10.field860 && var10.field903 != null) {
                                    var32 = new class26();
                                    var32.field138 = var10;
                                    var32.field141 = var10.field903;
                                    Client.field3990.method126(var32);
                                }

                                if (Client.field3984 > var10.field860 && var10.field904 != null) {
                                    var32 = new class26();
                                    var32.field138 = var10;
                                    var32.field141 = var10.field904;
                                    Client.field3990.method126(var32);
                                }

                                if (Client.field3985 > var10.field860 && var10.field909 != null) {
                                    var32 = new class26();
                                    var32.field138 = var10;
                                    var32.field141 = var10.field909;
                                    Client.field3990.method126(var32);
                                }

                                if (Client.field3846 > var10.field860 && var10.field924 != null) {
                                    var32 = new class26();
                                    var32.field138 = var10;
                                    var32.field141 = var10.field924;
                                    Client.field3990.method126(var32);
                                }

                                if (Client.field3827 > var10.field860 && null != var10.field905) {
                                    var32 = new class26();
                                    var32.field138 = var10;
                                    var32.field141 = var10.field905;
                                    Client.field3990.method126(var32);
                                }

                                var10.field860 = Client.field3777;
                                if (var10.field898 != null) {
                                    for (var38 = 0; var38 < Client.field4015; ++var38) {
                                        class26 var36 = new class26();
                                        var36.field138 = var10;
                                        var36.field140 = Client.field4017[var38];
                                        var36.field146 = Client.field4016[var38];
                                        var36.field141 = var10.field898;
                                        Client.field3990.method126(var36);
                                    }
                                }

                                class26 var39;
                                int[] var40;
                                if (null != var10.field908) {
                                    var40 = Client.field3923.method955();

                                    for (var24 = 0; var24 < var40.length; ++var24) {
                                        var39 = new class26();
                                        var39.field138 = var10;
                                        var39.field140 = var40[var24];
                                        var39.field141 = var10.field908;
                                        Client.field3990.method126(var39);
                                    }
                                }

                                if (var10.field865 != null) {
                                    var40 = Client.field3923.method956();

                                    for (var24 = 0; var24 < var40.length; ++var24) {
                                        var39 = new class26();
                                        var39.field138 = var10;
                                        var39.field140 = var40[var24];
                                        var39.field141 = var10.field865;
                                        Client.field3990.method126(var39);
                                    }
                                }
                            }
                        }

                        if (!var10.field871) {
                            if (null != Client.field3959 || Client.field3888) {
                                continue;
                            }

                            if ((var10.field915 >= 0 || var10.field818 != 0) && class499.field3651 >= var13 && class499.field3634 >= var14 && class499.field3651 < var15 && class499.field3634 < var16) {
                                if (var10.field915 >= 0) {
                                    class423.field2915 = var0[var10.field915];
                                } else {
                                    class423.field2915 = var10;
                                }
                            }

                            if (var10.field793 == 8 && class499.field3651 >= var13 && class499.field3634 >= var14 && class499.field3651 < var15 && class499.field3634 < var16) {
                                class390.field2779 = var10;
                            }

                            if (var10.field813 > var10.field783) {
                                Client.method2478(var10, var10.field806 + var27, var12, var10.field783, var10.field813, class499.field3651, class499.field3634);
                            }
                        }

                        if (var10.field793 == 0) {
                            method2579(var0, var10.field791, var13, var14, var15, var16, var27 - var10.field810, var12 - var10.field824);
                            if (var10.field923 != null) {
                                method2579(var10.field923, var10.field791, var13, var14, var15, var16, var27 - var10.field810, var12 - var10.field824);
                            }

                            class522 var33 = (class522) Client.field3796.method857(var10.field791);
                            if (null != var33) {
                                if (var33.field4200 == 0 && class499.field3651 >= var13 && class499.field3634 >= var14 && class499.field3651 < var15 && class499.field3634 < var16 && !Client.field3888) {
                                    for (class26 var34 = (class26) Client.field3990.method122(); var34 != null; var34 = (class26) Client.field3990.method124()) {
                                        if (var34.field149) {
                                            var34.method221();
                                            var34.field138.field811 = false;
                                        }
                                    }

                                    if (class493.field3624 == 0) {
                                        Client.field3959 = null;
                                        Client.field3978 = null;
                                    }

                                    if (!Client.field3888) {
                                        Client.method2464();
                                    }
                                }

                                Client.method2364(var33.field4202, var13, var14, var15, var16, var27, var12);
                            }
                        }
                    }
                }
            }
        }

    }

    boolean method2578() {
        return this.field4261;
    }

    public String method2576() {
        return this.field4257;
    }

    boolean method2577() {
        return this.field4258;
    }

    @Override
    public int method1533() {
        return this.field4251;
    }
}
