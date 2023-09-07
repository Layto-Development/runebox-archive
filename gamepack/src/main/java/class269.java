import java.util.*;

public class class269 {
    static final double field1987;
    static final String[] field1982;
    static boolean field1983;
    static boolean field1989;
    static class94[] field1978;
    static int field1980;
    static int field1986;
    static int[] field1977;
    static int[] field1984;
    static int[] field1988;
    static int[][] field1979;
    static String[] field1975;
    static String[] field1976;
    static ArrayList<class259> field1985;
    static Calendar field1981;

    static {
        field1977 = new int[5];
        field1979 = new int[5][5000];
        field1988 = new int[1000];
        field1975 = new String[1000];
        field1980 = 0;
        field1978 = new class94[50];
        field1981 = Calendar.getInstance();
        field1982 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field1989 = false;
        field1983 = false;
        field1985 = new ArrayList<class259>();
        field1986 = 0;
        field1987 = Math.log(2.0D);
    }

    class269() throws Throwable {
    }

    public static void method1200(class26 var0) {
        class424.method1963(var0, 500000, 475000);
    }

    static void method1185(class26 var0, class443 var1, int var2, int var3) {
        Object[] var5 = var0.field141;
        class56.field597 = 0;
        class228.field1787 = 0;
        int var6 = -1;
        int[] var7 = var1.field3004;
        int[] var8 = var1.field3005;
        byte var9 = -1;
        field1980 = 0;
        field1989 = false;
        boolean var10 = false;
        int var11 = 0;
        boolean var23 = false;

        label836:
        {
            label837:
            {
                try {
                    int var14;
                    try {
                        var23 = true;
                        class10.field47 = new int[var1.field3007];
                        int var12 = 0;
                        field1976 = new String[var1.field3011];
                        int var28 = 0;

                        int var15;
                        String var38;
                        for (var14 = 1; var14 < var5.length; ++var14) {
                            if (var5[var14] instanceof Integer) {
                                var15 = (Integer) var5[var14];
                                if (var15 == -2147483647) {
                                    var15 = var0.field139;
                                }

                                if (var15 == -2147483646) {
                                    var15 = var0.field142;
                                }

                                if (var15 == -2147483645) {
                                    var15 = var0.field138 != null ? var0.field138.field791 : -1;
                                }

                                if (var15 == -2147483644) {
                                    var15 = var0.field143;
                                }

                                if (var15 == -2147483643) {
                                    var15 = var0.field138 != null ? -1714711969 * var0.field138.field910 * 1628260767 : -1;
                                }

                                if (var15 == -2147483642) {
                                    var15 = var0.field144 != null ? var0.field144.field791 : -1;
                                }

                                if (var15 == -2147483641) {
                                    var15 = null != var0.field144 ? -1714711969 * var0.field144.field910 * 1628260767 : -1;
                                }

                                if (var15 == -2147483640) {
                                    var15 = var0.field140;
                                }

                                if (var15 == -2147483639) {
                                    var15 = var0.field146;
                                }

                                class10.field47[var12++] = var15;
                            } else if (var5[var14] instanceof String) {
                                var38 = (String) var5[var14];
                                if (var38.equals("event_opbase")) {
                                    var38 = var0.field147;
                                }

                                field1976[var28++] = var38;
                            }
                        }

                        field1986 = var0.field148;

                        while (true) {
                            ++var11;
                            if (var11 > var2) {
                                throw new RuntimeException();
                            }

                            ++var6;
                            int var26 = var7[var6];
                            if (var26 >= 100) {
                                boolean var37;
                                var37 = var1.field3005[var6] == 1;

                                var15 = method1180(var26, var1, var37);
                                switch (var15) {
                                    case 0:
                                        var23 = false;
                                        break label837;
                                    case 1:
                                    default:
                                        break;
                                    case 2:
                                        throw new IllegalStateException();
                                }
                            } else if (var26 == 0) {
                                field1988[++class56.field597 - 1] = var8[var6];
                            } else if (var26 == 1) {
                                var14 = var8[var6];
                                field1988[++class56.field597 - 1] = class10.field46[var14];
                            } else if (var26 == 2) {
                                var14 = var8[var6];
                                class10.field46[var14] = field1988[--class56.field597];
                                Client.method2446(var14);
                            } else if (var26 == 3) {
                                field1975[++class228.field1787 - 1] = var1.field3006[var6];
                            } else if (var26 == 6) {
                                var6 += var8[var6];
                            } else if (var26 == 7) {
                                class56.field597 -= 2;
                                if (field1988[class56.field597] != field1988[1 + class56.field597]) {
                                    var6 += var8[var6];
                                }
                            } else if (var26 == 8) {
                                class56.field597 -= 2;
                                if (field1988[class56.field597] == field1988[class56.field597 + 1]) {
                                    var6 += var8[var6];
                                }
                            } else if (var26 == 9) {
                                class56.field597 -= 2;
                                if (field1988[class56.field597] < field1988[class56.field597 + 1]) {
                                    var6 += var8[var6];
                                }
                            } else if (var26 == 10) {
                                class56.field597 -= 2;
                                if (field1988[class56.field597] > field1988[class56.field597 + 1]) {
                                    var6 += var8[var6];
                                }
                            } else if (var26 == 21) {
                                if (field1980 == 0) {
                                    var23 = false;
                                    break label836;
                                }

                                class94 var36 = field1978[--field1980];
                                var1 = var36.field771;
                                var7 = var1.field3004;
                                var8 = var1.field3005;
                                var6 = var36.field774;
                                class10.field47 = var36.field772;
                                field1976 = var36.field773;
                            } else if (var26 == 25) {
                                var14 = var8[var6];
                                field1988[++class56.field597 - 1] = class10.method20(var14);
                            } else if (var26 == 27) {
                                var14 = var8[var6];
                                class516.method2512(var14, field1988[--class56.field597]);
                            } else if (var26 == 31) {
                                class56.field597 -= 2;
                                if (field1988[class56.field597] <= field1988[class56.field597 + 1]) {
                                    var6 += var8[var6];
                                }
                            } else if (var26 == 32) {
                                class56.field597 -= 2;
                                if (field1988[class56.field597] >= field1988[class56.field597 + 1]) {
                                    var6 += var8[var6];
                                }
                            } else if (var26 == 33) {
                                field1988[++class56.field597 - 1] = class10.field47[var8[var6]];
                            } else if (var26 == 34) {
                                class10.field47[var8[var6]] = field1988[--class56.field597];
                            } else if (var26 == 35) {
                                field1975[++class228.field1787 - 1] = field1976[var8[var6]];
                            } else if (var26 == 36) {
                                field1976[var8[var6]] = field1975[--class228.field1787];
                            } else if (var26 == 37) {
                                var14 = var8[var6];
                                class228.field1787 -= var14;
                                var38 = class95.method377(field1975, class228.field1787, var14);
                                field1975[++class228.field1787 - 1] = var38;
                            } else if (var26 == 38) {
                                --class56.field597;
                            } else if (var26 == 39) {
                                --class228.field1787;
                            } else {
                                int var18;
                                if (var26 != 40) {
                                    if (var26 == 42) {
                                        field1988[++class56.field597 - 1] = class305.field2233.method905(var8[var6]);
                                    } else if (var26 == 43) {
                                        class305.field2233.method916(var8[var6], field1988[--class56.field597]);
                                    } else if (var26 == 44) {
                                        var14 = var8[var6] >> 16;
                                        var15 = var8[var6] & 65535;
                                        int var29 = field1988[--class56.field597];
                                        if (var29 < 0 || var29 > 5000) {
                                            throw new RuntimeException();
                                        }

                                        field1977[var14] = var29;
                                        byte var32 = -1;
                                        if (var15 == 105) {
                                            var32 = 0;
                                        }

                                        for (var18 = 0; var18 < var29; ++var18) {
                                            field1979[var14][var18] = var32;
                                        }
                                    } else if (var26 == 45) {
                                        var14 = var8[var6];
                                        var15 = field1988[--class56.field597];
                                        if (var15 < 0 || var15 >= field1977[var14]) {
                                            throw new RuntimeException();
                                        }

                                        field1988[++class56.field597 - 1] = field1979[var14][var15];
                                    } else if (var26 == 46) {
                                        var14 = var8[var6];
                                        class56.field597 -= 2;
                                        var15 = field1988[class56.field597];
                                        if (var15 < 0 || var15 >= field1977[var14]) {
                                            throw new RuntimeException();
                                        }

                                        field1979[var14][var15] = field1988[1 + class56.field597];
                                    } else {
                                        String var30;
                                        if (var26 == 47) {
                                            var30 = class305.field2233.method907(var8[var6]);
                                            if (var30 == null) {
                                                var30 = class32.field483;
                                            }

                                            field1975[++class228.field1787 - 1] = var30;
                                        } else if (var26 == 48) {
                                            class305.field2233.method912(var8[var6], field1975[--class228.field1787]);
                                        } else if (var26 == 49) {
                                            var30 = class305.field2233.method906(var8[var6]);
                                            field1975[++class228.field1787 - 1] = var30;
                                        } else if (var26 == 50) {
                                            class305.field2233.method913(var8[var6], field1975[--class228.field1787]);
                                        } else if (var26 == 60) {
                                            class208 var33 = var1.field3012[var8[var6]];
                                            class170 var41 = (class170) var33.method990(field1988[--class56.field597]);
                                            if (var41 != null) {
                                                var6 += var41.field1437;
                                            }
                                        } else {
                                            Integer var34;
                                            if (var26 == 74) {
                                                var34 = class96.field777.method596(var8[var6]);
                                                if (var34 == null) {
                                                    field1988[++class56.field597 - 1] = -1;
                                                } else {
                                                    field1988[++class56.field597 - 1] = var34;
                                                }
                                            } else {
                                                if (var26 != 76) {
                                                    throw new IllegalStateException();
                                                }

                                                var34 = class360.field2584.method32(var8[var6]);
                                                if (var34 == null) {
                                                    field1988[++class56.field597 - 1] = -1;
                                                } else {
                                                    field1988[++class56.field597 - 1] = var34;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var14 = var8[var6];
                                    class443 var40 = class443.method2022(var14);
                                    int[] var16 = new int[var40.field3007];
                                    String[] var17 = new String[var40.field3011];

                                    for (var18 = 0; var18 < var40.field3009; ++var18) {
                                        var16[var18] = field1988[class56.field597 - var40.field3009 + var18];
                                    }

                                    for (var18 = 0; var18 < var40.field3010; ++var18) {
                                        var17[var18] = field1975[class228.field1787 - var40.field3010 + var18];
                                    }

                                    class56.field597 -= var40.field3009;
                                    class228.field1787 -= var40.field3010;
                                    class94 var35 = new class94();
                                    var35.field771 = var1;
                                    var35.field774 = var6;
                                    var35.field772 = class10.field47;
                                    var35.field773 = field1976;
                                    field1978[++field1980 - 1] = var35;
                                    var1 = var40;
                                    var7 = var40.field3004;
                                    var8 = var40.field3005;
                                    var6 = -1;
                                    class10.field47 = var16;
                                    field1976 = var17;
                                }
                            }
                        }
                    } catch (Exception var24) {
                        var10 = true;
                        StringBuilder var13 = new StringBuilder(30);
                        var13.append(var1.field658).append(" ");
                        var14 = field1980 - 1;

                        while (true) {
                            if (var14 < 0) {
                                var13.append(var9);
                                class157.method728(var13.toString(), var24);
                                var23 = false;
                                break;
                            }

                            var13.append(field1978[var14].field771.field658).append(" ");
                            --var14;
                        }
                    }
                } finally {
                    if (var23) {
                        while (field1985.size() > 0) {
                            class259 var20 = field1985.remove(0);
                            Client.method2353(var20.method1147(), var20.method1148(), var20.method1146(), var20.method1145(), "");
                        }

                        if (field1989) {
                            field1989 = false;
                            Client.method2441();
                        }

                        if (!var10 && var3 > 0 && var11 >= var3) {
                            class157.method728("Warning: Script " + var1.field3008 + " finished at op count " + var11 + " of max " + var2, null);
                        }

                    }
                }

                while (field1985.size() > 0) {
                    class259 var27 = field1985.remove(0);
                    Client.method2353(var27.method1147(), var27.method1148(), var27.method1146(), var27.method1145(), "");
                }

                if (field1989) {
                    field1989 = false;
                    Client.method2441();
                }

                return;
            }

            while (field1985.size() > 0) {
                class259 var31 = field1985.remove(0);
                Client.method2353(var31.method1147(), var31.method1148(), var31.method1146(), var31.method1145(), "");
            }

            if (field1989) {
                field1989 = false;
                Client.method2441();
            }

            if (var3 > 0 && var11 >= var3) {
                class157.method728("Warning: Script " + var1.field3008 + " finished at op count " + var11 + " of max " + var2, null);
            }

            return;
        }

        while (field1985.size() > 0) {
            class259 var39 = field1985.remove(0);
            Client.method2353(var39.method1147(), var39.method1148(), var39.method1146(), var39.method1145(), "");
        }

        if (field1989) {
            field1989 = false;
            Client.method2441();
        }

        if (var3 > 0 && var11 >= var3) {
            class157.method728("Warning: Script " + var1.field3008 + " finished at op count " + var11 + " of max " + var2, null);
        }

    }

    static int method1180(int var0, class443 var1, boolean var2) {
        if (var0 < 1000) {
            return method1196(var0, var1, var2);
        } else if (var0 < 1100) {
            return method1168(var0, var1, var2);
        } else if (var0 < 1200) {
            return method1178(var0, var1, var2);
        } else if (var0 < 1300) {
            return method1177(var0, var1, var2);
        } else if (var0 < 1400) {
            return method1163(var0, var1, var2);
        } else if (var0 < 1500) {
            return method1188(var0, var1, var2);
        } else if (var0 < 1600) {
            return method1184(var0, var1, var2);
        } else if (var0 < 1700) {
            return method1198(var0, var1, var2);
        } else if (var0 < 1800) {
            return class503.method2275(var0, var1, var2);
        } else if (var0 < 1900) {
            return method1169(var0, var1, var2);
        } else if (var0 < 2000) {
            return method1212(var0, var1, var2);
        } else if (var0 < 2100) {
            return method1168(var0, var1, var2);
        } else if (var0 < 2200) {
            return method1178(var0, var1, var2);
        } else if (var0 < 2300) {
            return method1177(var0, var1, var2);
        } else if (var0 < 2400) {
            return method1163(var0, var1, var2);
        } else if (var0 < 2500) {
            return method1188(var0, var1, var2);
        } else if (var0 < 2600) {
            return method1172(var0, var1, var2);
        } else if (var0 < 2700) {
            return method1206(var0, var1, var2);
        } else if (var0 < 2800) {
            return method1202(var0, var1, var2);
        } else if (var0 < 2900) {
            return method1174(var0, var1, var2);
        } else if (var0 < 3000) {
            return method1212(var0, var1, var2);
        } else if (var0 < 3200) {
            return method1209(var0, var1, var2);
        } else if (var0 < 3300) {
            return method1199(var0, var1, var2);
        } else if (var0 < 3400) {
            return class27.method79(var0, var1, var2, (byte) -1);
        } else if (var0 < 3500) {
            return method1208(var0, var1, var2);
        } else if (var0 < 3600) {
            return method1195(var0, var1, var2);
        } else if (var0 < 3700) {
            return method1162(var0, var1, var2);
        } else if (var0 < 3800) {
            return method1165(var0, var1, var2);
        } else if (var0 < 3900) {
            return method1167(var0, var1, var2);
        } else if (var0 < 4000) {
            return method1203(var0, var1, var2);
        } else if (var0 < 4100) {
            return method1204(var0, var1, var2);
        } else if (var0 < 4200) {
            return method1171(var0, var1, var2);
        } else if (var0 < 4300) {
            return method1173(var0, var1, var2);
        } else if (var0 < 5100) {
            return method1205(var0, var1, var2);
        } else if (var0 < 5400) {
            return method1189(var0, var1, var2);
        } else if (var0 < 5600) {
            return method1210(var0, var1, var2);
        } else if (var0 < 5700) {
            return method1160(var0, var1, var2);
        } else if (var0 < 6300) {
            return class351.method1646(var0, var1, var2);
        } else if (var0 < 6600) {
            return method1183(var0, var1, var2);
        } else if (var0 < 6700) {
            return method1161(var0, var1, var2);
        } else if (var0 < 6800) {
            return method1176(var0, var1, var2);
        } else if (var0 < 6900) {
            return method1191(var0, var1, var2);
        } else if (var0 < 7000) {
            return method1170(var0, var1, var2);
        } else if (var0 < 7100) {
            return method1164(var0, var1, var2);
        } else if (var0 < 7200) {
            return method1179(var0, var1, var2);
        } else if (var0 < 7300) {
            return method1186(var0, var1, var2);
        } else if (var0 < 7500) {
            return class522.method2517(var0, var1, var2);
        } else if (var0 < 7600) {
            return method1166(var0, var1, var2);
        } else if (var0 < 7700) {
            return method1187(var0, var1, var2);
        } else {
            return var0 < 8100 ? method1192(var0, var1, var2) : 2;
        }
    }

    static int method1196(int var0, class443 var1, boolean var2) {
        int var4;
        int var5;
        if (var0 == 100) {
            class56.field597 -= 3;
            var4 = field1988[class56.field597];
            var5 = field1988[class56.field597 + 1];
            int var12 = field1988[2 + class56.field597];
            if (var5 == 0) {
                throw new RuntimeException();
            } else {
                class97 var7 = class97.method424(var4);
                if (null == var7.field923) {
                    var7.field923 = new class97[var12 + 1];
                }

                if (var7.field923.length <= var12) {
                    class97[] var8 = new class97[var12 + 1];

                    System.arraycopy(var7.field923, 0, var8, 0, var7.field923.length);

                    var7.field923 = var8;
                }

                if (var12 > 0 && var7.field923[var12 - 1] == null) {
                    throw new RuntimeException(String.valueOf(var12 - 1));
                } else {
                    class97 var13 = new class97();
                    var13.field793 = var5;
                    var13.field808 = var13.field791 = var7.field791;
                    var13.field910 = var12;
                    var13.field871 = true;
                    if (var5 == 12) {
                        var13.method404();
                        var13.method419().method1478(new class402(var13));
                        var13.method419().method1477(new class332(var13));
                    }

                    var7.field923[var12] = var13;
                    if (var2) {
                        class325.field2365 = var13;
                    } else {
                        class140.field1233 = var13;
                    }

                    Client.method2424(var7);
                    return 1;
                }
            }
        } else {
            class97 var10;
            if (var0 == 101) {
                var10 = var2 ? class325.field2365 : class140.field1233;
                class97 var11 = class97.method424(var10.field791);
                var11.field923[var10.field910] = null;
                Client.method2424(var11);
                return 1;
            } else if (var0 == 102) {
                var10 = class97.method424(field1988[--class56.field597]);
                var10.field923 = null;
                Client.method2424(var10);
                return 1;
            } else if (var0 != 200) {
                if (var0 == 201) {
                    var10 = class97.method424(field1988[--class56.field597]);
                    if (null != var10) {
                        field1988[++class56.field597 - 1] = 1;
                        if (var2) {
                            class325.field2365 = var10;
                        } else {
                            class140.field1233 = var10;
                        }
                    } else {
                        field1988[++class56.field597 - 1] = 0;
                    }

                    return 1;
                } else {
                    return 2;
                }
            } else {
                class56.field597 -= 2;
                var4 = field1988[class56.field597];
                var5 = field1988[class56.field597 + 1];
                class97 var6 = class97.method421(var4, var5);
                if (null != var6 && var5 != -1) {
                    field1988[++class56.field597 - 1] = 1;
                    if (var2) {
                        class325.field2365 = var6;
                    } else {
                        class140.field1233 = var6;
                    }
                } else {
                    field1988[++class56.field597 - 1] = 0;
                }

                return 1;
            }
        }
    }

    static int method1168(int var0, class443 var1, boolean var2) {
        int var4 = -1;
        class97 var5;
        if (var0 >= 2000) {
            var0 -= 1000;
            var4 = field1988[--class56.field597];
            var5 = class97.method424(var4);
        } else {
            var5 = var2 ? class325.field2365 : class140.field1233;
        }

        if (var0 == 1000) {
            class56.field597 -= 4;
            var5.field800 = field1988[class56.field597];
            var5.field801 = field1988[1 + class56.field597];
            var5.field796 = field1988[2 + class56.field597];
            var5.field797 = field1988[3 + class56.field597];
            Client.method2424(var5);
            class268.field1973.method2318(var5);
            if (var4 != -1 && var5.field793 == 0) {
                Client.method2363(class46.field542[var4 >> 16], var5, false);
            }

            return 1;
        } else if (var0 == 1001) {
            class56.field597 -= 4;
            var5.field802 = field1988[class56.field597];
            var5.field803 = field1988[class56.field597 + 1];
            var5.field798 = field1988[2 + class56.field597];
            var5.field799 = field1988[class56.field597 + 3];
            Client.method2424(var5);
            class268.field1973.method2318(var5);
            if (var4 != -1 && var5.field793 == 0) {
                Client.method2363(class46.field542[var4 >> 16], var5, false);
            }

            return 1;
        } else if (var0 == 1003) {
            boolean var6 = field1988[--class56.field597] == 1;
            if (var5.field809 != var6) {
                var5.field809 = var6;
                Client.method2424(var5);
            }

            return 1;
        } else if (var0 == 1005) {
            var5.field933 = field1988[--class56.field597] == 1;
            return 1;
        } else if (var0 == 1006) {
            var5.field934 = field1988[--class56.field597] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    static int method1178(int var0, class443 var1, boolean var2) {
        int var5 = -1;
        class97 var4;
        if (var0 >= 2000) {
            var0 -= 1000;
            var5 = field1988[--class56.field597];
            var4 = class97.method424(var5);
        } else {
            var4 = var2 ? class325.field2365 : class140.field1233;
        }

        int var14;
        if (var0 == 1100) {
            class56.field597 -= 2;
            var14 = field1988[class56.field597];
            int var11 = field1988[1 + class56.field597];
            if (var4.field793 == 12) {
                class327 var8 = var4.method419();
                if (null != var8 && var8.method1451(var14, var11)) {
                    Client.method2424(var4);
                }
            } else {
                var4.field810 = var14;
                if (var4.field810 > var4.field878 - var4.field806) {
                    var4.field810 = var4.field878 - var4.field806;
                }

                if (var4.field810 < 0) {
                    var4.field810 = 0;
                }

                var4.field824 = var11;
                if (var4.field824 > var4.field813 - var4.field783) {
                    var4.field824 = var4.field813 - var4.field783;
                }

                if (var4.field824 < 0) {
                    var4.field824 = 0;
                }

                Client.method2424(var4);
            }

            return 1;
        } else if (var0 == 1101) {
            var4.field814 = field1988[--class56.field597];
            Client.method2424(var4);
            return 1;
        } else if (var0 == 1102) {
            var4.field853 = field1988[--class56.field597] == 1;
            Client.method2424(var4);
            return 1;
        } else if (var0 == 1103) {
            var4.field812 = field1988[--class56.field597];
            Client.method2424(var4);
            return 1;
        } else if (var0 == 1104) {
            var4.field822 = field1988[--class56.field597];
            Client.method2424(var4);
            return 1;
        } else if (var0 == 1105) {
            var4.field877 = field1988[--class56.field597];
            Client.method2424(var4);
            return 1;
        } else if (var0 == 1106) {
            var4.field827 = field1988[--class56.field597];
            Client.method2424(var4);
            return 1;
        } else if (var0 == 1107) {
            var4.field828 = field1988[--class56.field597] == 1;
            Client.method2424(var4);
            return 1;
        } else if (var0 == 1108) {
            var4.field833 = 1;
            var4.field834 = field1988[--class56.field597];
            Client.method2424(var4);
            return 1;
        } else if (var0 == 1109) {
            class56.field597 -= 6;
            var4.field839 = field1988[class56.field597];
            var4.field913 = field1988[class56.field597 + 1];
            var4.field841 = field1988[class56.field597 + 2];
            var4.field859 = field1988[class56.field597 + 3];
            var4.field906 = field1988[4 + class56.field597];
            var4.field844 = field1988[class56.field597 + 5];
            Client.method2424(var4);
            return 1;
        } else if (var0 == 1110) {
            var14 = field1988[--class56.field597];
            if (var14 != var4.field837) {
                var4.field837 = var14;
                var4.field921 = 0;
                var4.field922 = 0;
                Client.method2424(var4);
            }

            return 1;
        } else if (var0 == 1111) {
            var4.field864 = field1988[--class56.field597] == 1;
            Client.method2424(var4);
            return 1;
        } else if (var0 == 1112) {
            String var15 = field1975[--class228.field1787];
            if (!var15.equals(var4.field851)) {
                var4.field851 = var15;
                Client.method2424(var4);
            }

            return 1;
        } else {
            class327 var9;
            if (var0 == 1113) {
                var4.field896 = field1988[--class56.field597];
                if (var4.field793 == 12) {
                    var9 = var4.method419();
                    if (var9 != null) {
                        var9.method1455();
                    }
                }

                Client.method2424(var4);
                return 1;
            } else if (var0 == 1114) {
                class56.field597 -= 3;
                if (var4.field793 == 12) {
                    var9 = var4.method419();
                    if (null != var9) {
                        var9.method1508(field1988[class56.field597], field1988[1 + class56.field597]);
                        var9.method1452(field1988[2 + class56.field597]);
                    }
                } else {
                    var4.field854 = field1988[class56.field597];
                    var4.field912 = field1988[class56.field597 + 1];
                    var4.field887 = field1988[2 + class56.field597];
                }

                Client.method2424(var4);
                return 1;
            } else if (var0 == 1115) {
                var4.field781 = field1988[--class56.field597] == 1;
                Client.method2424(var4);
                return 1;
            } else if (var0 == 1116) {
                var4.field829 = field1988[--class56.field597];
                Client.method2424(var4);
                return 1;
            } else if (var0 == 1117) {
                var4.field830 = field1988[--class56.field597];
                Client.method2424(var4);
                return 1;
            } else if (var0 == 1118) {
                var4.field831 = field1988[--class56.field597] == 1;
                Client.method2424(var4);
                return 1;
            } else if (var0 == 1119) {
                var4.field832 = field1988[--class56.field597] == 1;
                Client.method2424(var4);
                return 1;
            } else if (var0 == 1120) {
                class56.field597 -= 2;
                var4.field878 = field1988[class56.field597];
                var4.field813 = field1988[1 + class56.field597];
                Client.method2424(var4);
                if (var5 != -1 && var4.field793 == 0) {
                    Client.method2363(class46.field542[var5 >> 16], var4, false);
                }

                return 1;
            } else if (var0 == 1121) {
                Client.method2490(var4.field791, var4.field910);
                Client.field3952 = var4;
                Client.method2424(var4);
                return 1;
            } else if (var0 == 1122) {
                var4.field825 = field1988[--class56.field597];
                Client.method2424(var4);
                return 1;
            } else if (var0 == 1123) {
                var4.field815 = field1988[--class56.field597];
                Client.method2424(var4);
                return 1;
            } else if (var0 == 1124) {
                var4.field821 = field1988[--class56.field597];
                Client.method2424(var4);
                return 1;
            } else if (var0 == 1125) {
                var14 = field1988[--class56.field597];
                class93 var10 = (class93) class27.method80(class93.method362(), var14);
                if (null != var10) {
                    var4.field819 = var10;
                    Client.method2424(var4);
                }

                return 1;
            } else {
                boolean var12;
                if (var0 == 1126) {
                    var12 = field1988[--class56.field597] == 1;
                    var4.field823 = var12;
                    return 1;
                } else if (var0 == 1127) {
                    var12 = field1988[--class56.field597] == 1;
                    var4.field849 = var12;
                    return 1;
                } else if (var0 == 1129) {
                    var4.field826 = field1975[--class228.field1787];
                    Client.method2424(var4);
                    return 1;
                } else if (var0 == 1130) {
                    var4.method417(field1975[--class228.field1787], class174.field1465, Client.method2386());
                    return 1;
                } else if (var0 == 1131) {
                    class56.field597 -= 2;
                    var4.method413(field1988[class56.field597], field1988[1 + class56.field597]);
                    return 1;
                } else if (var0 == 1132) {
                    var4.method396(field1975[--class228.field1787], field1988[--class56.field597]);
                    return 1;
                } else {
                    class346 var13;
                    if (var0 == 1133) {
                        --class56.field597;
                        var13 = var4.method405();
                        if (var13 != null) {
                            var13.field2516 = field1988[class56.field597];
                            Client.method2424(var4);
                        }

                        return 1;
                    } else if (var0 == 1134) {
                        --class56.field597;
                        var13 = var4.method405();
                        if (var13 != null) {
                            var13.field2517 = field1988[class56.field597];
                            Client.method2424(var4);
                        }

                        return 1;
                    } else if (var0 == 1135) {
                        --class228.field1787;
                        var9 = var4.method419();
                        if (null != var9) {
                            var4.field779 = field1975[class228.field1787];
                        }

                        return 1;
                    } else if (var0 == 1136) {
                        --class56.field597;
                        var13 = var4.method405();
                        if (null != var13) {
                            var13.field2518 = field1988[class56.field597];
                            Client.method2424(var4);
                        }

                        return 1;
                    } else if (var0 == 1137) {
                        --class56.field597;
                        var9 = var4.method419();
                        if (var9 != null && var9.method1448(field1988[class56.field597])) {
                            Client.method2424(var4);
                        }

                        return 1;
                    } else if (var0 == 1138) {
                        --class56.field597;
                        var9 = var4.method419();
                        if (null != var9 && var9.method1449(field1988[class56.field597])) {
                            Client.method2424(var4);
                        }

                        return 1;
                    } else if (var0 == 1139) {
                        --class56.field597;
                        var9 = var4.method419();
                        if (null != var9 && var9.method1516(field1988[class56.field597])) {
                            Client.method2424(var4);
                        }

                        return 1;
                    } else {
                        class327 var7;
                        if (var0 == 1140) {
                            var12 = field1988[--class56.field597] == 1;
                            Client.field4014.method2123();
                            var7 = var4.method419();
                            if (null != var7 && var7.method1443(var12)) {
                                if (var12) {
                                    Client.field4014.method2124(var4);
                                }

                                Client.method2424(var4);
                            }

                            return 1;
                        } else if (var0 == 1141) {
                            var12 = field1988[--class56.field597] == 1;
                            if (!var12 && Client.field4014.method2121() == var4) {
                                Client.field4014.method2123();
                                Client.method2424(var4);
                            }

                            var7 = var4.method419();
                            if (var7 != null) {
                                var7.method1473(var12);
                            }

                            return 1;
                        } else if (var0 == 1142) {
                            class56.field597 -= 2;
                            var9 = var4.method419();
                            if (var9 != null && var9.method1462(field1988[class56.field597], field1988[class56.field597 + 1])) {
                                Client.method2424(var4);
                            }

                            return 1;
                        } else if (var0 == 1143) {
                            --class56.field597;
                            var9 = var4.method419();
                            if (null != var9 && var9.method1462(field1988[class56.field597], field1988[class56.field597])) {
                                Client.method2424(var4);
                            }

                            return 1;
                        } else if (var0 == 1144) {
                            --class56.field597;
                            var9 = var4.method419();
                            if (var9 != null) {
                                var9.method1522(field1988[class56.field597]);
                                Client.method2424(var4);
                            }

                            return 1;
                        } else if (var0 == 1145) {
                            --class56.field597;
                            var9 = var4.method419();
                            if (var9 != null) {
                                var9.method1453(field1988[class56.field597]);
                            }

                            return 1;
                        } else if (var0 == 1146) {
                            --class56.field597;
                            var9 = var4.method419();
                            if (null != var9) {
                                var9.method1503(field1988[class56.field597]);
                            }

                            return 1;
                        } else if (var0 == 1147) {
                            --class56.field597;
                            var9 = var4.method419();
                            if (null != var9) {
                                var9.method1521(field1988[class56.field597]);
                                Client.method2424(var4);
                            }

                            return 1;
                        } else {
                            class323 var6;
                            if (var0 == 1148) {
                                class56.field597 -= 2;
                                var6 = var4.method395();
                                if (null != var6) {
                                    var6.method1428(field1988[class56.field597], field1988[class56.field597 + 1]);
                                }

                                return 1;
                            } else if (var0 == 1149) {
                                class56.field597 -= 2;
                                var6 = var4.method395();
                                if (var6 != null) {
                                    var6.method1431((char) field1988[class56.field597], field1988[class56.field597 + 1]);
                                }

                                return 1;
                            } else if (var0 == 1150) {
                                var4.method415(field1975[--class228.field1787], class174.field1465);
                                return 1;
                            } else {
                                return 2;
                            }
                        }
                    }
                }
            }
        }
    }

    static int method1177(int var0, class443 var1, boolean var2) {
        class97 var4;
        if (var0 >= 2000) {
            var0 -= 1000;
            var4 = class97.method424(field1988[--class56.field597]);
        } else {
            var4 = var2 ? class325.field2365 : class140.field1233;
        }

        Client.method2424(var4);
        int var5;
        int var6;
        if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
            if (var0 == 1201) {
                var4.field833 = 2;
                var4.field834 = field1988[--class56.field597];
                return 1;
            } else if (var0 == 1202) {
                var4.field833 = 3;
                var4.field834 = class180.field1528.field2054.method152();
                return 1;
            } else if (var0 == 1207) {
                boolean var8 = field1988[--class56.field597] == 1;
                class54.method161(var4, class180.field1528.field2054, var8);
                return 1;
            } else if (var0 == 1208) {
                var5 = field1988[--class56.field597];
                if (var4.field847 == null) {
                    throw new RuntimeException("");
                } else {
                    class97.method420(var4, var5);
                    return 1;
                }
            } else if (var0 == 1209) {
                class56.field597 -= 2;
                var5 = field1988[class56.field597];
                var6 = field1988[class56.field597 + 1];
                if (null == var4.field847) {
                    throw new RuntimeException("");
                } else {
                    class97.method423(var4, var5, var6);
                    return 1;
                }
            } else if (var0 == 1210) {
                var5 = field1988[--class56.field597];
                if (var4.field847 == null) {
                    throw new RuntimeException("");
                } else {
                    class97.method425(var4, class180.field1528.field2054.field578, var5);
                    return 1;
                }
            } else {
                return 2;
            }
        } else {
            class56.field597 -= 2;
            var5 = field1988[class56.field597];
            var6 = field1988[class56.field597 + 1];
            var4.field919 = var5;
            var4.field920 = var6;
            class508 var7 = class508.method2299(var5);
            var4.field841 = var7.field3712;
            var4.field859 = var7.field3728;
            var4.field906 = var7.field3714;
            var4.field839 = var7.field3713;
            var4.field913 = var7.field3730;
            var4.field844 = var7.field3735;
            if (var0 == 1205) {
                var4.field850 = 0;
            } else if (var0 == 1212 | var7.field3731 == 1) {
                var4.field850 = 1;
            } else {
                var4.field850 = 2;
            }

            if (var4.field845 > 0) {
                var4.field844 = var4.field844 * 32 / var4.field845;
            } else if (var4.field802 > 0) {
                var4.field844 = var4.field844 * 32 / var4.field802;
            }

            return 1;
        }
    }

    static int method1163(int var0, class443 var1, boolean var2) {
        boolean var4 = true;
        class97 var5;
        if (var0 >= 2000) {
            var0 -= 1000;
            var5 = class97.method424(field1988[--class56.field597]);
            var4 = false;
        } else {
            var5 = var2 ? class325.field2365 : class140.field1233;
        }

        int var10;
        if (var0 == 1300) {
            var10 = field1988[--class56.field597] - 1;
            if (var10 >= 0 && var10 <= 9) {
                var5.method392(var10, field1975[--class228.field1787]);
                return 1;
            } else {
                --class228.field1787;
                return 1;
            }
        } else {
            int var11;
            if (var0 == 1301) {
                class56.field597 -= 2;
                var10 = field1988[class56.field597];
                var11 = field1988[class56.field597 + 1];
                var5.field890 = class97.method421(var10, var11);
                return 1;
            } else if (var0 == 1302) {
                var5.field872 = field1988[--class56.field597] == 1;
                return 1;
            } else if (var0 == 1303) {
                var5.field804 = field1988[--class56.field597];
                return 1;
            } else if (var0 == 1304) {
                var5.field846 = field1988[--class56.field597];
                return 1;
            } else if (var0 == 1305) {
                var5.field795 = field1975[--class228.field1787];
                return 1;
            } else if (var0 == 1306) {
                var5.field873 = field1975[--class228.field1787];
                return 1;
            } else if (var0 == 1307) {
                var5.field869 = null;
                return 1;
            } else if (var0 == 1308) {
                var5.field935 = field1988[--class56.field597] == 1;
                return 1;
            } else if (var0 == 1309) {
                --class56.field597;
                return 1;
            } else {
                byte[] var7;
                int var8;
                if (var0 != 1350) {
                    boolean var9;
                    if (var0 == 1351) {
                        class56.field597 -= 2;
                        var9 = true;
                        var7 = new byte[]{(byte) field1988[class56.field597]};
                        byte[] var12 = new byte[]{(byte) field1988[1 + class56.field597]};
                        method1211(var5, 10, var7, var12);
                        return 1;
                    } else if (var0 == 1352) {
                        class56.field597 -= 3;
                        var10 = field1988[class56.field597] - 1;
                        var11 = field1988[class56.field597 + 1];
                        var8 = field1988[2 + class56.field597];
                        if (var10 >= 0 && var10 <= 9) {
                            method1181(var5, var10, var11, var8);
                            return 1;
                        } else {
                            throw new RuntimeException();
                        }
                    } else if (var0 == 1353) {
                        var9 = true;
                        var11 = field1988[--class56.field597];
                        var8 = field1988[--class56.field597];
                        method1181(var5, 10, var11, var8);
                        return 1;
                    } else if (var0 == 1354) {
                        --class56.field597;
                        var10 = field1988[class56.field597] - 1;
                        if (var10 >= 0 && var10 <= 9) {
                            method1175(var5, var10);
                            return 1;
                        } else {
                            throw new RuntimeException();
                        }
                    } else if (var0 == 1355) {
                        var9 = true;
                        method1175(var5, 10);
                        return 1;
                    } else {
                        return 2;
                    }
                } else {
                    byte[] var6 = null;
                    var7 = null;
                    if (var4) {
                        class56.field597 -= 10;

                        for (var8 = 0; var8 < 10 && field1988[class56.field597 + var8] >= 0; var8 += 2) {
                        }

                        if (var8 > 0) {
                            var6 = new byte[var8 / 2];
                            var7 = new byte[var8 / 2];

                            for (var8 -= 2; var8 >= 0; var8 -= 2) {
                                var6[var8 / 2] = (byte) field1988[class56.field597 + var8];
                                var7[var8 / 2] = (byte) field1988[1 + class56.field597 + var8];
                            }
                        }
                    } else {
                        class56.field597 -= 2;
                        var6 = new byte[]{(byte) field1988[class56.field597]};
                        var7 = new byte[]{(byte) field1988[1 + class56.field597]};
                    }

                    var8 = field1988[--class56.field597] - 1;
                    if (var8 >= 0 && var8 <= 9) {
                        method1211(var5, var8, var6, var7);
                        return 1;
                    } else {
                        throw new RuntimeException();
                    }
                }
            }
        }
    }

    static final void method1211(class97 var0, int var1, byte[] var2, byte[] var3) {
        if (var0.field840 == null) {
            if (var2 == null) {
                return;
            }

            var0.field840 = new byte[11][];
            var0.field936 = new byte[11][];
            var0.field866 = new int[11];
            var0.field867 = new int[11];
        }

        var0.field840[var1] = var2;
        if (null != var2) {
            var0.field863 = true;
        } else {
            var0.field863 = false;

            for (int var5 = 0; var5 < var0.field840.length; ++var5) {
                if (var0.field840[var5] != null) {
                    var0.field863 = true;
                    break;
                }
            }
        }

        var0.field936[var1] = var3;
    }

    static final void method1181(class97 var0, int var1, int var2, int var3) {
        if (null == var0.field866) {
            throw new RuntimeException();
        } else {
            var0.field866[var1] = var2;
            var0.field867[var1] = var3;
        }
    }

    static final void method1175(class97 var0, int var1) {
        if (null == var0.field840) {
            throw new RuntimeException();
        } else {
            if (null == var0.field932) {
                var0.field932 = new int[var0.field840.length];
            }

            var0.field932[var1] = Integer.MAX_VALUE;
        }
    }

    static int method1188(int var0, class443 var1, boolean var2) {
        class97 var4;
        if (var0 >= 2000) {
            var0 -= 1000;
            var4 = class97.method424(field1988[--class56.field597]);
        } else {
            var4 = var2 ? class325.field2365 : class140.field1233;
        }

        String var5 = field1975[--class228.field1787];
        int[] var6 = null;
        if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
            int var7 = field1988[--class56.field597];
            if (var7 > 0) {
                for (var6 = new int[var7]; var7-- > 0; var6[var7] = field1988[--class56.field597]) {
                }
            }

            var5 = var5.substring(0, var5.length() - 1);
        }

        Object[] var10 = new Object[var5.length() + 1];

        int var8;
        for (var8 = var10.length - 1; var8 >= 1; --var8) {
            if (var5.charAt(var8 - 1) == 's') {
                var10[var8] = field1975[--class228.field1787];
            } else {
                var10[var8] = Integer.valueOf(field1988[--class56.field597]);
            }
        }

        var8 = field1988[--class56.field597];
        if (var8 != -1) {
            var10[0] = Integer.valueOf(var8);
        } else {
            var10 = null;
        }

        if (var0 == 1400) {
            var4.field843 = var10;
        } else if (var0 == 1401) {
            var4.field879 = var10;
        } else if (var0 == 1402) {
            var4.field876 = var10;
        } else if (var0 == 1403) {
            var4.field880 = var10;
        } else if (var0 == 1404) {
            var4.field852 = var10;
        } else if (var0 == 1405) {
            var4.field883 = var10;
        } else if (var0 == 1406) {
            var4.field886 = var10;
        } else if (var0 == 1407) {
            var4.field858 = var10;
            var4.field888 = var6;
        } else if (var0 == 1408) {
            var4.field784 = var10;
        } else if (var0 == 1409) {
            var4.field894 = var10;
        } else if (var0 == 1410) {
            var4.field884 = var10;
        } else if (var0 == 1411) {
            var4.field789 = var10;
        } else if (var0 == 1412) {
            var4.field881 = var10;
        } else if (var0 == 1414) {
            var4.field889 = var10;
            var4.field820 = var6;
        } else if (var0 == 1415) {
            var4.field891 = var10;
            var4.field892 = var6;
        } else if (var0 == 1416) {
            var4.field885 = var10;
        } else if (var0 == 1417) {
            var4.field816 = var10;
        } else if (var0 == 1418) {
            var4.field782 = var10;
        } else if (var0 == 1419) {
            var4.field898 = var10;
        } else if (var0 == 1420) {
            var4.field848 = var10;
        } else if (var0 == 1421) {
            var4.field902 = var10;
        } else if (var0 == 1422) {
            var4.field905 = var10;
        } else if (var0 == 1423) {
            var4.field838 = var10;
        } else if (var0 == 1424) {
            var4.field870 = var10;
        } else if (var0 == 1425) {
            var4.field909 = var10;
        } else if (var0 == 1426) {
            var4.field924 = var10;
        } else if (var0 == 1427) {
            var4.field785 = var10;
        } else if (var0 == 1428) {
            var4.field903 = var10;
        } else if (var0 == 1429) {
            var4.field904 = var10;
        } else if (var0 == 1430) {
            var4.field908 = var10;
        } else if (var0 == 1431) {
            var4.field865 = var10;
        } else if (var0 == 1434) {
            var4.field856 = var10;
        } else if (var0 == 1435) {
            var4.field895 = var10;
        } else {
            if (var0 < 1436 || var0 > 1439) {
                return 2;
            }

            class265 var9 = var4.method406();
            if (var9 != null) {
                if (var0 == 1436) {
                    var9.field1959 = var10;
                } else if (var0 == 1437) {
                    var9.field1960 = var10;
                } else if (var0 == 1438) {
                    var9.field1955 = var10;
                } else if (var0 == 1439) {
                    var9.field1957 = var10;
                }
            }
        }

        var4.field874 = true;
        return 1;
    }

    static int method1184(int var0, class443 var1, boolean var2) {
        class97 var4 = var2 ? class325.field2365 : class140.field1233;
        if (var0 == 1500) {
            field1988[++class56.field597 - 1] = var4.field792;
            return 1;
        } else if (var0 == 1501) {
            field1988[++class56.field597 - 1] = var4.field805;
            return 1;
        } else if (var0 == 1502) {
            field1988[++class56.field597 - 1] = var4.field806;
            return 1;
        } else if (var0 == 1503) {
            field1988[++class56.field597 - 1] = var4.field783;
            return 1;
        } else if (var0 == 1504) {
            field1988[++class56.field597 - 1] = var4.field809 ? 1 : 0;
            return 1;
        } else if (var0 == 1505) {
            field1988[++class56.field597 - 1] = var4.field808;
            return 1;
        } else {
            return 2;
        }
    }

    static int method1198(int var0, class443 var1, boolean var2) {
        class97 var4 = var2 ? class325.field2365 : class140.field1233;
        if (var0 == 1600) {
            field1988[++class56.field597 - 1] = var4.field810;
            return 1;
        } else if (var0 == 1601) {
            field1988[++class56.field597 - 1] = var4.field824;
            return 1;
        } else {
            class327 var8;
            if (var0 == 1602) {
                if (var4.field793 == 12) {
                    var8 = var4.method419();
                    if (null != var8) {
                        field1975[++class228.field1787 - 1] = var8.method1505().method1653();
                        return 1;
                    }
                }

                field1975[++class228.field1787 - 1] = var4.field851;
                return 1;
            } else if (var0 == 1603) {
                field1988[++class56.field597 - 1] = var4.field878;
                return 1;
            } else if (var0 == 1604) {
                field1988[++class56.field597 - 1] = var4.field813;
                return 1;
            } else if (var0 == 1605) {
                field1988[++class56.field597 - 1] = var4.field844;
                return 1;
            } else if (var0 == 1606) {
                field1988[++class56.field597 - 1] = var4.field841;
                return 1;
            } else if (var0 == 1607) {
                field1988[++class56.field597 - 1] = var4.field906;
                return 1;
            } else if (var0 == 1608) {
                field1988[++class56.field597 - 1] = var4.field859;
                return 1;
            } else if (var0 == 1609) {
                field1988[++class56.field597 - 1] = var4.field812;
                return 1;
            } else if (var0 == 1610) {
                field1988[++class56.field597 - 1] = var4.field821;
                return 1;
            } else if (var0 == 1611) {
                field1988[++class56.field597 - 1] = var4.field814;
                return 1;
            } else if (var0 == 1612) {
                field1988[++class56.field597 - 1] = var4.field815;
                return 1;
            } else if (var0 == 1613) {
                field1988[++class56.field597 - 1] = var4.field819.method1533();
                return 1;
            } else if (var0 == 1614) {
                field1988[++class56.field597 - 1] = var4.field849 ? 1 : 0;
                return 1;
            } else {
                class346 var5;
                if (var0 == 1617) {
                    var5 = var4.method405();
                    field1988[++class56.field597 - 1] = null != var5 ? var5.field2516 : 0;
                }

                if (var0 == 1618) {
                    var5 = var4.method405();
                    field1988[++class56.field597 - 1] = var5 != null ? var5.field2517 : 0;
                    return 1;
                } else if (var0 == 1619) {
                    var8 = var4.method419();
                    field1975[++class228.field1787 - 1] = var8 != null ? var8.method1479().method1653() : "";
                    return 1;
                } else if (var0 == 1620) {
                    var5 = var4.method405();
                    field1988[++class56.field597 - 1] = null != var5 ? var5.field2518 : 0;
                    return 1;
                } else if (var0 == 1621) {
                    var8 = var4.method419();
                    field1988[++class56.field597 - 1] = null != var8 ? var8.method1517() : 0;
                    return 1;
                } else if (var0 == 1622) {
                    var8 = var4.method419();
                    field1988[++class56.field597 - 1] = var8 != null ? var8.method1513() : 0;
                    return 1;
                } else if (var0 == 1623) {
                    var8 = var4.method419();
                    field1988[++class56.field597 - 1] = var8 != null ? var8.method1519() : 0;
                    return 1;
                } else if (var0 == 1624) {
                    var8 = var4.method419();
                    field1988[++class56.field597 - 1] = var8 != null && var8.method1481() ? 1 : 0;
                    return 1;
                } else if (var0 != 1625) {
                    if (var0 == 1626) {
                        var8 = var4.method419();
                        field1975[++class228.field1787 - 1] = var8 != null ? var8.method1454().method664() : "";
                        return 1;
                    } else if (var0 == 1627) {
                        var8 = var4.method419();
                        int var6 = var8 != null ? var8.method1484() : 0;
                        int var7 = null != var8 ? var8.method1483() : 0;
                        field1988[++class56.field597 - 1] = Math.min(var6, var7);
                        field1988[++class56.field597 - 1] = Math.max(var6, var7);
                        return 1;
                    } else if (var0 == 1628) {
                        var8 = var4.method419();
                        field1988[++class56.field597 - 1] = var8 != null ? var8.method1483() : 0;
                        return 1;
                    } else if (var0 == 1629) {
                        var8 = var4.method419();
                        field1988[++class56.field597 - 1] = var8 != null ? var8.method1456() : 0;
                        return 1;
                    } else if (var0 == 1630) {
                        var8 = var4.method419();
                        field1988[++class56.field597 - 1] = null != var8 ? var8.method1488() : 0;
                        return 1;
                    } else if (var0 == 1631) {
                        var8 = var4.method419();
                        field1988[++class56.field597 - 1] = var8 != null ? var8.method1507() : 0;
                        return 1;
                    } else if (var0 == 1632) {
                        var8 = var4.method419();
                        field1988[++class56.field597 - 1] = var8 != null ? var8.method1450() : 0;
                        return 1;
                    } else {
                        class323 var9;
                        if (var0 == 1633) {
                            var9 = var4.method395();
                            field1988[class56.field597 - 1] = var9 != null ? var9.method1425(field1988[class56.field597 - 1]) : 0;
                            return 1;
                        } else if (var0 == 1634) {
                            var9 = var4.method395();
                            field1988[class56.field597 - 1] = null != var9 ? var9.method1429((char) field1988[class56.field597 - 1]) : 0;
                            return 1;
                        } else {
                            return 2;
                        }
                    }
                } else {
                    var8 = var4.method419();
                    field1988[++class56.field597 - 1] = null != var8 && var8.method1482() ? 1 : 0;
                    return 1;
                }
            }
        }
    }

    static int method1197(class97 var0) {
        if (var0.field793 != 11) {
            --class228.field1787;
            field1988[++class56.field597 - 1] = -1;
            return 1;
        } else {
            String var2 = field1975[--class228.field1787];
            field1988[++class56.field597 - 1] = var0.method398(var2);
            return 1;
        }
    }

    static int method1207(class97 var0) {
        if (var0.field793 != 11) {
            field1975[class228.field1787 - 1] = "";
            return 1;
        } else {
            String var2 = field1975[--class228.field1787];
            field1975[++class228.field1787 - 1] = var0.method399(var2);
            return 1;
        }
    }

    static int method1169(int var0, class443 var1, boolean var2) {
        class97 var4 = var2 ? class325.field2365 : class140.field1233;
        if (var0 == 1800) {
            field1988[++class56.field597 - 1] = class383.method1776(Client.method2420(var4));
            return 1;
        } else if (var0 != 1801) {
            if (var0 == 1802) {
                if (var4.field795 == null) {
                    field1975[++class228.field1787 - 1] = "";
                } else {
                    field1975[++class228.field1787 - 1] = var4.field795;
                }

                return 1;
            } else {
                return 2;
            }
        } else {
            int var5 = field1988[--class56.field597];
            --var5;
            if (null != var4.field869 && var5 < var4.field869.length && null != var4.field869[var5]) {
                field1975[++class228.field1787 - 1] = var4.field869[var5];
            } else {
                field1975[++class228.field1787 - 1] = "";
            }

            return 1;
        }
    }

    static int method1212(int var0, class443 var1, boolean var2) {
        class97 var4;
        if (var0 != 1927 && var0 != 2927) {
            int var9;
            if (var0 == 1928) {
                var4 = var2 ? class325.field2365 : class140.field1233;
                var9 = field1988[--class56.field597];
                if (var9 >= 1 && var9 <= 10) {
                    class259 var10 = new class259(var9, var4.field791, var4.field910, var4.field919);
                    field1985.add(var10);
                    return 1;
                } else {
                    throw new RuntimeException();
                }
            } else if (var0 == 2928) {
                class56.field597 -= 3;
                int var8 = field1988[class56.field597];
                var9 = field1988[class56.field597 + 1];
                int var6 = field1988[2 + class56.field597];
                if (var6 >= 1 && var6 <= 10) {
                    class259 var7 = new class259(var6, var8, var9, class97.method424(var8).field919);
                    field1985.add(var7);
                    return 1;
                } else {
                    throw new RuntimeException();
                }
            } else {
                return 2;
            }
        } else if (field1986 >= 10) {
            throw new RuntimeException();
        } else {
            if (var0 >= 2000) {
                var4 = class97.method424(field1988[--class56.field597]);
            } else {
                var4 = var2 ? class325.field2365 : class140.field1233;
            }

            if (null == var4.field785) {
                return 0;
            } else {
                class26 var5 = new class26();
                var5.field138 = var4;
                var5.field141 = var4.field785;
                var5.field148 = 1 + field1986;
                Client.field3990.method126(var5);
                return 1;
            }
        }
    }

    static int method1172(int var0, class443 var1, boolean var2) {
        class97 var4 = class97.method424(field1988[--class56.field597]);
        if (var0 == 2500) {
            field1988[++class56.field597 - 1] = var4.field792;
            return 1;
        } else if (var0 == 2501) {
            field1988[++class56.field597 - 1] = var4.field805;
            return 1;
        } else if (var0 == 2502) {
            field1988[++class56.field597 - 1] = var4.field806;
            return 1;
        } else if (var0 == 2503) {
            field1988[++class56.field597 - 1] = var4.field783;
            return 1;
        } else if (var0 == 2504) {
            field1988[++class56.field597 - 1] = var4.field809 ? 1 : 0;
            return 1;
        } else if (var0 == 2505) {
            field1988[++class56.field597 - 1] = var4.field808;
            return 1;
        } else {
            return 2;
        }
    }

    static int method1206(int var0, class443 var1, boolean var2) {
        class97 var4 = class97.method424(field1988[--class56.field597]);
        if (var0 == 2600) {
            field1988[++class56.field597 - 1] = var4.field810;
            return 1;
        } else if (var0 == 2601) {
            field1988[++class56.field597 - 1] = var4.field824;
            return 1;
        } else if (var0 == 2602) {
            field1975[++class228.field1787 - 1] = var4.field851;
            return 1;
        } else if (var0 == 2603) {
            field1988[++class56.field597 - 1] = var4.field878;
            return 1;
        } else if (var0 == 2604) {
            field1988[++class56.field597 - 1] = var4.field813;
            return 1;
        } else if (var0 == 2605) {
            field1988[++class56.field597 - 1] = var4.field844;
            return 1;
        } else if (var0 == 2606) {
            field1988[++class56.field597 - 1] = var4.field841;
            return 1;
        } else if (var0 == 2607) {
            field1988[++class56.field597 - 1] = var4.field906;
            return 1;
        } else if (var0 == 2608) {
            field1988[++class56.field597 - 1] = var4.field859;
            return 1;
        } else if (var0 == 2609) {
            field1988[++class56.field597 - 1] = var4.field812;
            return 1;
        } else if (var0 == 2610) {
            field1988[++class56.field597 - 1] = var4.field821;
            return 1;
        } else if (var0 == 2611) {
            field1988[++class56.field597 - 1] = var4.field814;
            return 1;
        } else if (var0 == 2612) {
            field1988[++class56.field597 - 1] = var4.field815;
            return 1;
        } else if (var0 == 2613) {
            field1988[++class56.field597 - 1] = var4.field819.method1533();
            return 1;
        } else if (var0 == 2614) {
            field1988[++class56.field597 - 1] = var4.field849 ? 1 : 0;
            return 1;
        } else {
            class346 var5;
            if (var0 == 2617) {
                var5 = var4.method405();
                field1988[++class56.field597 - 1] = var5 != null ? var5.field2516 : 0;
            }

            if (var0 == 2618) {
                var5 = var4.method405();
                field1988[++class56.field597 - 1] = null != var5 ? var5.field2517 : 0;
                return 1;
            } else {
                class327 var8;
                if (var0 == 2619) {
                    var8 = var4.method419();
                    field1975[++class228.field1787 - 1] = var8 != null ? var8.method1479().method1653() : "";
                    return 1;
                } else if (var0 == 2620) {
                    var5 = var4.method405();
                    field1988[++class56.field597 - 1] = var5 != null ? var5.field2518 : 0;
                    return 1;
                } else if (var0 == 2621) {
                    var8 = var4.method419();
                    field1988[++class56.field597 - 1] = var8 != null ? var8.method1517() : 0;
                    return 1;
                } else if (var0 == 2622) {
                    var8 = var4.method419();
                    field1988[++class56.field597 - 1] = null != var8 ? var8.method1513() : 0;
                    return 1;
                } else if (var0 == 2623) {
                    var8 = var4.method419();
                    field1988[++class56.field597 - 1] = null != var8 ? var8.method1519() : 0;
                    return 1;
                } else if (var0 == 2624) {
                    var8 = var4.method419();
                    field1988[++class56.field597 - 1] = null != var8 && var8.method1481() ? 1 : 0;
                    return 1;
                } else if (var0 != 2625) {
                    if (var0 == 2626) {
                        var8 = var4.method419();
                        field1975[++class228.field1787 - 1] = null != var8 ? var8.method1454().method664() : "";
                        return 1;
                    } else if (var0 == 2627) {
                        var8 = var4.method419();
                        int var6 = null != var8 ? var8.method1484() : 0;
                        int var7 = null != var8 ? var8.method1483() : 0;
                        field1988[++class56.field597 - 1] = Math.min(var6, var7);
                        field1988[++class56.field597 - 1] = Math.max(var6, var7);
                        return 1;
                    } else if (var0 == 2628) {
                        var8 = var4.method419();
                        field1988[++class56.field597 - 1] = var8 != null ? var8.method1483() : 0;
                        return 1;
                    } else if (var0 == 2629) {
                        var8 = var4.method419();
                        field1988[++class56.field597 - 1] = var8 != null ? var8.method1456() : 0;
                        return 1;
                    } else if (var0 == 2630) {
                        var8 = var4.method419();
                        field1988[++class56.field597 - 1] = null != var8 ? var8.method1488() : 0;
                        return 1;
                    } else if (var0 == 2631) {
                        var8 = var4.method419();
                        field1988[++class56.field597 - 1] = var8 != null ? var8.method1507() : 0;
                        return 1;
                    } else if (var0 == 2632) {
                        var8 = var4.method419();
                        field1988[++class56.field597 - 1] = var8 != null ? var8.method1450() : 0;
                        return 1;
                    } else {
                        class323 var9;
                        if (var0 == 2633) {
                            var9 = var4.method395();
                            field1988[class56.field597 - 1] = null != var9 ? var9.method1425(field1988[class56.field597 - 1]) : 0;
                            return 1;
                        } else if (var0 == 2634) {
                            var9 = var4.method395();
                            field1988[class56.field597 - 1] = null != var9 ? var9.method1429((char) field1988[class56.field597 - 1]) : 0;
                            return 1;
                        } else {
                            return 2;
                        }
                    }
                } else {
                    var8 = var4.method419();
                    field1988[++class56.field597 - 1] = var8 != null && var8.method1482() ? 1 : 0;
                    return 1;
                }
            }
        }
    }

    static int method1202(int var0, class443 var1, boolean var2) {
        class97 var4;
        if (var0 == 2700) {
            var4 = class97.method424(field1988[--class56.field597]);
            field1988[++class56.field597 - 1] = var4.field919;
            return 1;
        } else if (var0 == 2701) {
            var4 = class97.method424(field1988[--class56.field597]);
            if (var4.field919 != -1) {
                field1988[++class56.field597 - 1] = var4.field920;
            } else {
                field1988[++class56.field597 - 1] = 0;
            }

            return 1;
        } else if (var0 == 2702) {
            int var6 = field1988[--class56.field597];
            class522 var5 = (class522) Client.field3796.method857(var6);
            if (var5 != null) {
                field1988[++class56.field597 - 1] = 1;
            } else {
                field1988[++class56.field597 - 1] = 0;
            }

            return 1;
        } else if (var0 == 2706) {
            field1988[++class56.field597 - 1] = Client.field3947;
            return 1;
        } else if (var0 == 2707) {
            var4 = class97.method424(field1988[--class56.field597]);
            field1988[++class56.field597 - 1] = var4.method416() ? 1 : 0;
            return 1;
        } else if (var0 == 2708) {
            var4 = class97.method424(field1988[--class56.field597]);
            return method1197(var4);
        } else if (var0 == 2709) {
            var4 = class97.method424(field1988[--class56.field597]);
            return method1207(var4);
        } else {
            return 2;
        }
    }

    static int method1174(int var0, class443 var1, boolean var2) {
        class97 var4 = class97.method424(field1988[--class56.field597]);
        if (var0 == 2800) {
            field1988[++class56.field597 - 1] = class383.method1776(Client.method2420(var4));
            return 1;
        } else if (var0 != 2801) {
            if (var0 == 2802) {
                if (null == var4.field795) {
                    field1975[++class228.field1787 - 1] = "";
                } else {
                    field1975[++class228.field1787 - 1] = var4.field795;
                }

                return 1;
            } else {
                return 2;
            }
        } else {
            int var5 = field1988[--class56.field597];
            --var5;
            if (var4.field869 != null && var5 < var4.field869.length && null != var4.field869[var5]) {
                field1975[++class228.field1787 - 1] = var4.field869[var5];
            } else {
                field1975[++class228.field1787 - 1] = "";
            }

            return 1;
        }
    }

    static int method1209(int var0, class443 var1, boolean var2) {
        String var12;
        if (var0 == 3100) {
            var12 = field1975[--class228.field1787];
            class157.method729(0, "", var12);
            return 1;
        } else if (var0 == 3101) {
            class56.field597 -= 2;
            Client.method2493(class180.field1528, field1988[class56.field597], field1988[class56.field597 + 1]);
            return 1;
        } else if (var0 == 3103) {
            if (!field1983) {
                field1989 = true;
            }

            return 1;
        } else {
            int var11;
            if (var0 == 3104) {
                var12 = field1975[--class228.field1787];
                var11 = 0;
                if (class95.method374(var12)) {
                    var11 = class95.method368(var12);
                }

                class46 var15 = class46.method134(class488.field3591, Client.field3840.field2238);
                var15.field541.method315(var11);
                Client.field3840.method1359(var15);
                return 1;
            } else {
                class46 var9;
                if (var0 == 3105) {
                    var12 = field1975[--class228.field1787];
                    var9 = class46.method134(class488.field3499, Client.field3840.field2238);
                    var9.field541.method249(var12.length() + 1);
                    var9.field541.method252(var12);
                    Client.field3840.method1359(var9);
                    return 1;
                } else if (var0 == 3106) {
                    var12 = field1975[--class228.field1787];
                    var9 = class46.method134(class488.field3595, Client.field3840.field2238);
                    var9.field541.method249(var12.length() + 1);
                    var9.field541.method252(var12);
                    Client.field3840.method1359(var9);
                    return 1;
                } else {
                    int var4;
                    String var5;
                    if (var0 == 3107) {
                        var4 = field1988[--class56.field597];
                        var5 = field1975[--class228.field1787];
                        class127.method583(var4, var5);
                        return 1;
                    } else if (var0 == 3108) {
                        class56.field597 -= 3;
                        var4 = field1988[class56.field597];
                        var11 = field1988[1 + class56.field597];
                        int var14 = field1988[2 + class56.field597];
                        class97 var16 = class97.method424(var14);
                        Client.method2427(var16, var4, var11);
                        return 1;
                    } else if (var0 == 3109) {
                        class56.field597 -= 2;
                        var4 = field1988[class56.field597];
                        var11 = field1988[1 + class56.field597];
                        class97 var13 = var2 ? class325.field2365 : class140.field1233;
                        Client.method2427(var13, var4, var11);
                        return 1;
                    } else if (var0 == 3110) {
                        class218.field1747 = field1988[--class56.field597] == 1;
                        return 1;
                    } else if (var0 == 3111) {
                        field1988[++class56.field597 - 1] = class290.field2121.method2528() ? 1 : 0;
                        return 1;
                    } else if (var0 == 3112) {
                        class290.field2121.method2527(field1988[--class56.field597] == 1);
                        return 1;
                    } else if (var0 == 3113) {
                        var12 = field1975[--class228.field1787];
                        boolean var10 = field1988[--class56.field597] == 1;
                        class33.method96(var12, var10, false);
                        return 1;
                    } else if (var0 == 3115) {
                        var4 = field1988[--class56.field597];
                        var9 = class46.method134(class488.field3588, Client.field3840.field2238);
                        var9.field541.method290(var4);
                        Client.field3840.method1359(var9);
                        return 1;
                    } else if (var0 == 3116) {
                        var4 = field1988[--class56.field597];
                        class228.field1787 -= 2;
                        var5 = field1975[class228.field1787];
                        String var6 = field1975[class228.field1787 + 1];
                        if (var5.length() > 500) {
                            return 1;
                        } else if (var6.length() > 500) {
                            return 1;
                        } else {
                            class46 var7 = class46.method134(class488.field3519, Client.field3840.field2238);
                            var7.field541.method290(1 + class78.method323(var5) + class78.method323(var6));
                            var7.field541.method252(var6);
                            var7.field541.method249(var4);
                            var7.field541.method252(var5);
                            Client.field3840.method1359(var7);
                            return 1;
                        }
                    } else if (var0 == 3117) {
                        --class56.field597;
                        return 1;
                    } else if (var0 == 3118) {
                        Client.field3935 = field1988[--class56.field597] == 1;
                        return 1;
                    } else if (var0 == 3119) {
                        Client.field4013 = field1988[--class56.field597] == 1;
                        return 1;
                    } else if (var0 == 3120) {
                        if (field1988[--class56.field597] == 1) {
                            Client.field3778 |= 1;
                        } else {
                            Client.field3778 &= -2;
                        }

                        return 1;
                    } else if (var0 == 3121) {
                        if (field1988[--class56.field597] == 1) {
                            Client.field3778 |= 2;
                        } else {
                            Client.field3778 &= -3;
                        }

                        return 1;
                    } else if (var0 == 3122) {
                        if (field1988[--class56.field597] == 1) {
                            Client.field3778 |= 4;
                        } else {
                            Client.field3778 &= -5;
                        }

                        return 1;
                    } else if (var0 == 3123) {
                        if (field1988[--class56.field597] == 1) {
                            Client.field3778 |= 8;
                        } else {
                            Client.field3778 &= -9;
                        }

                        return 1;
                    } else if (var0 == 3124) {
                        Client.field3778 = 0;
                        return 1;
                    } else if (var0 == 3125) {
                        Client.field4064 = field1988[--class56.field597] == 1;
                        return 1;
                    } else if (var0 == 3126) {
                        Client.field3901 = field1988[--class56.field597] == 1;
                        return 1;
                    } else if (var0 == 3127) {
                        Client.method2338(field1988[--class56.field597] == 1);
                        return 1;
                    } else if (var0 == 3128) {
                        field1988[++class56.field597 - 1] = Client.method2352() ? 1 : 0;
                        return 1;
                    } else if (var0 == 3129) {
                        class56.field597 -= 2;
                        Client.field3873 = field1988[class56.field597];
                        Client.field3874 = field1988[class56.field597 + 1];
                        return 1;
                    } else if (var0 == 3130) {
                        class56.field597 -= 2;
                        return 1;
                    } else if (var0 == 3131) {
                        --class56.field597;
                        return 1;
                    } else if (var0 == 3132) {
                        field1988[++class56.field597 - 1] = class223.field1763;
                        field1988[++class56.field597 - 1] = class519.field4188;
                        return 1;
                    } else if (var0 == 3133) {
                        --class56.field597;
                        return 1;
                    } else if (var0 == 3134) {
                        return 1;
                    } else if (var0 == 3135) {
                        class56.field597 -= 2;
                        return 1;
                    } else if (var0 == 3136) {
                        Client.field3789 = 3;
                        Client.field3950 = field1988[--class56.field597];
                        return 1;
                    } else if (var0 == 3137) {
                        Client.field3789 = 2;
                        Client.field3950 = field1988[--class56.field597];
                        return 1;
                    } else if (var0 == 3138) {
                        Client.field3789 = 0;
                        return 1;
                    } else if (var0 == 3139) {
                        Client.field3789 = 1;
                        return 1;
                    } else if (var0 == 3140) {
                        Client.field3789 = 3;
                        Client.field3950 = var2 ? class325.field2365.field791 : class140.field1233.field791;
                        return 1;
                    } else {
                        boolean var8;
                        if (var0 == 3141) {
                            var8 = field1988[--class56.field597] == 1;
                            class290.field2121.method2549(var8);
                            return 1;
                        } else if (var0 == 3142) {
                            field1988[++class56.field597 - 1] = class290.field2121.method2532() ? 1 : 0;
                            return 1;
                        } else if (var0 == 3143) {
                            var8 = field1988[--class56.field597] == 1;
                            Client.field3829 = var8;
                            if (!var8) {
                                class290.field2121.method2539("");
                            }

                            return 1;
                        } else if (var0 == 3144) {
                            field1988[++class56.field597 - 1] = Client.field3829 ? 1 : 0;
                            return 1;
                        } else if (var0 == 3145) {
                            return 1;
                        } else if (var0 == 3146) {
                            var8 = field1988[--class56.field597] == 1;
                            class290.field2121.method2547(!var8);
                            return 1;
                        } else if (var0 == 3147) {
                            field1988[++class56.field597 - 1] = class290.field2121.method2548() ? 0 : 1;
                            return 1;
                        } else if (var0 == 3148) {
                            return 1;
                        } else if (var0 == 3149) {
                            field1988[++class56.field597 - 1] = 0;
                            return 1;
                        } else if (var0 == 3150) {
                            field1988[++class56.field597 - 1] = 0;
                            return 1;
                        } else if (var0 == 3151) {
                            field1988[++class56.field597 - 1] = 0;
                            return 1;
                        } else if (var0 == 3152) {
                            field1988[++class56.field597 - 1] = 0;
                            return 1;
                        } else if (var0 == 3153) {
                            field1988[++class56.field597 - 1] = class500.field3661;
                            return 1;
                        } else if (var0 == 3154) {
                            field1988[++class56.field597 - 1] = Client.method2359();
                            return 1;
                        } else if (var0 == 3155) {
                            --class228.field1787;
                            return 1;
                        } else if (var0 == 3156) {
                            return 1;
                        } else if (var0 == 3157) {
                            class56.field597 -= 2;
                            return 1;
                        } else if (var0 == 3158) {
                            field1988[++class56.field597 - 1] = 0;
                            return 1;
                        } else if (var0 == 3159) {
                            field1988[++class56.field597 - 1] = 0;
                            return 1;
                        } else if (var0 == 3160) {
                            field1988[++class56.field597 - 1] = 0;
                            return 1;
                        } else if (var0 == 3161) {
                            --class56.field597;
                            field1988[++class56.field597 - 1] = 0;
                            return 1;
                        } else if (var0 == 3162) {
                            --class56.field597;
                            field1988[++class56.field597 - 1] = 0;
                            return 1;
                        } else if (var0 == 3163) {
                            --class228.field1787;
                            field1988[++class56.field597 - 1] = 0;
                            return 1;
                        } else if (var0 == 3164) {
                            --class56.field597;
                            field1975[++class228.field1787 - 1] = "";
                            return 1;
                        } else if (var0 == 3165) {
                            --class56.field597;
                            field1988[++class56.field597 - 1] = 0;
                            return 1;
                        } else if (var0 == 3166) {
                            class56.field597 -= 2;
                            field1988[++class56.field597 - 1] = 0;
                            return 1;
                        } else if (var0 == 3167) {
                            class56.field597 -= 2;
                            field1988[++class56.field597 - 1] = 0;
                            return 1;
                        } else if (var0 == 3168) {
                            class56.field597 -= 2;
                            field1975[++class228.field1787 - 1] = "";
                            field1975[++class228.field1787 - 1] = "";
                            field1975[++class228.field1787 - 1] = "";
                            field1975[++class228.field1787 - 1] = "";
                            field1975[++class228.field1787 - 1] = "";
                            field1975[++class228.field1787 - 1] = "";
                            field1975[++class228.field1787 - 1] = "";
                            field1975[++class228.field1787 - 1] = "";
                            field1975[++class228.field1787 - 1] = "";
                            return 1;
                        } else if (var0 == 3169) {
                            return 1;
                        } else if (var0 == 3170) {
                            field1988[++class56.field597 - 1] = 0;
                            return 1;
                        } else if (var0 == 3171) {
                            field1988[++class56.field597 - 1] = 0;
                            return 1;
                        } else if (var0 == 3172) {
                            --class56.field597;
                            return 1;
                        } else if (var0 == 3173) {
                            --class56.field597;
                            field1988[++class56.field597 - 1] = 0;
                            return 1;
                        } else if (var0 == 3174) {
                            --class56.field597;
                            return 1;
                        } else if (var0 == 3175) {
                            field1988[++class56.field597 - 1] = 0;
                            return 1;
                        } else if (var0 == 3176) {
                            return 1;
                        } else if (var0 == 3177) {
                            return 1;
                        } else if (var0 == 3178) {
                            --class228.field1787;
                            return 1;
                        } else if (var0 == 3179) {
                            return 1;
                        } else if (var0 == 3180) {
                            --class228.field1787;
                            return 1;
                        } else if (var0 == 3181) {
                            Client.method2340(field1988[--class56.field597]);
                            return 1;
                        } else if (var0 == 3182) {
                            field1988[++class56.field597 - 1] = Client.method2465();
                            return 1;
                        } else if (var0 == 3189) {
                            var4 = field1988[--class56.field597];
                            Client.method2494(var4);
                            return 1;
                        } else {
                            return 2;
                        }
                    }
                }
            }
        }
    }

    static int method1199(int var0, class443 var1, boolean var2) {
        if (var0 == 3200) {
            class56.field597 -= 3;
            Client.method2346(field1988[class56.field597], field1988[1 + class56.field597], field1988[2 + class56.field597]);
            return 1;
        } else {
            int var6;
            int var7;
            int var8;
            int var13;
            int var16;
            if (var0 == 3201) {
                class56.field597 -= 5;
                var13 = field1988[class56.field597];
                var16 = field1988[class56.field597 + 1];
                var6 = field1988[2 + class56.field597];
                var7 = field1988[class56.field597 + 3];
                var8 = field1988[4 + class56.field597];
                ArrayList<Integer> var15 = new ArrayList<>();
                var15.add(var13);
                class165.method807(var15, var16, var6, var7, var8);
                return 1;
            } else if (var0 == 3202) {
                class56.field597 -= 2;
                Client.method2362(field1988[class56.field597], field1988[1 + class56.field597]);
                return 1;
            } else {
                class399 var4;
                class484 var5;
                String var12;
                if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
                    boolean var11;
                    if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
                        if (var0 == 3211) {
                            return 1;
                        } else if (var0 == 3216) {
                            var13 = field1988[--class56.field597];
                            var16 = 0;
                            class399 var19 = (class399) class27.method80(class399.method1839(), var13);
                            if (var19 != null) {
                                var16 = var19 != class399.field2829 ? 1 : 0;
                            }

                            field1988[++class56.field597 - 1] = var16;
                            return 1;
                        } else if (var0 == 3218) {
                            var13 = field1988[--class56.field597];
                            var16 = 0;
                            class484 var18 = (class484) class27.method80(class484.method2233(), var13);
                            if (var18 != null) {
                                var16 = class484.field3483 != var18 ? 1 : 0;
                            }

                            field1988[++class56.field597 - 1] = var16;
                            return 1;
                        } else if (var0 != 3217 && var0 != 3219) {
                            if (var0 == 3220) {
                                class56.field597 -= 2;
                                var13 = field1988[class56.field597];
                                var16 = field1988[class56.field597 + 1];
                                class443.method2021(var13, var16);
                                return 1;
                            } else if (var0 == 3221) {
                                class56.field597 -= 6;
                                var13 = field1988[class56.field597];
                                var16 = field1988[1 + class56.field597];
                                var6 = field1988[class56.field597 + 2];
                                var7 = field1988[3 + class56.field597];
                                var8 = field1988[class56.field597 + 4];
                                int var9 = field1988[class56.field597 + 5];
                                ArrayList<Integer> var10 = new ArrayList<Integer>();
                                var10.add(var13);
                                var10.add(var16);
                                class165.method807(var10, var6, var7, var8, var9);
                                return 1;
                            } else if (var0 == 3222) {
                                class56.field597 -= 4;
                                var13 = field1988[class56.field597];
                                var16 = field1988[class56.field597 + 1];
                                var6 = field1988[class56.field597 + 2];
                                var7 = field1988[class56.field597 + 3];
                                class141.method649(var13, var16, var6, var7);
                                return 1;
                            } else {
                                return 2;
                            }
                        } else {
                            var4 = class399.field2829;
                            var5 = class484.field3483;
                            var11 = true;
                            boolean var17 = true;
                            if (var0 == 3217) {
                                var8 = field1988[--class56.field597];
                                var4 = (class399) class27.method80(class399.method1839(), var8);
                                if (var4 == null) {
                                    throw new RuntimeException(String.format("Unrecognized device option %d", var8));
                                }
                            }

                            if (var0 == 3219) {
                                var8 = field1988[--class56.field597];
                                var5 = (class484) class27.method80(class484.method2233(), var8);
                                if (var5 == null) {
                                    throw new RuntimeException(String.format("Unrecognized game option %d", var8));
                                }
                            }

                            String var14;
                            if (class484.field3483 == var5) {
                                switch (var4.field2826) {
                                    case 1:
                                    case 2:
                                    case 3:
                                        var11 = false;
                                        var7 = 1;
                                        break;
                                    case 4:
                                        var11 = false;
                                        var7 = Integer.MAX_VALUE;
                                        break;
                                    case 5:
                                        var11 = false;
                                        var7 = 100;
                                        break;
                                    default:
                                        var14 = String.format("Unkown device option: %s.", var4);
                                        throw new RuntimeException(var14);
                                }
                            } else {
                                switch (var5.field3482) {
                                    case 1:
                                        var11 = false;
                                        var7 = 1;
                                        break;
                                    case 2:
                                    case 3:
                                    case 4:
                                        var11 = false;
                                        var7 = 100;
                                        break;
                                    default:
                                        var14 = String.format("Unkown game option: %s.", var5);
                                        throw new RuntimeException(var14);
                                }
                            }

                            field1988[++class56.field597 - 1] = 0;
                            field1988[++class56.field597 - 1] = var7;
                            return 1;
                        }
                    } else {
                        var4 = class399.field2829;
                        var5 = class484.field3483;
                        var11 = false;
                        if (var0 == 3214) {
                            var7 = field1988[--class56.field597];
                            var4 = (class399) class27.method80(class399.method1839(), var7);
                            if (null == var4) {
                                throw new RuntimeException(String.format("Unrecognized device option %d", var7));
                            }
                        }

                        if (var0 == 3215) {
                            var7 = field1988[--class56.field597];
                            var5 = (class484) class27.method80(class484.method2233(), var7);
                            if (var5 == null) {
                                throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                            }
                        }

                        if (var0 == 3210) {
                            var7 = field1988[--class56.field597];
                            var4 = (class399) class27.method80(class399.method1839(), var7);
                            if (var4 == null) {
                                var5 = (class484) class27.method80(class484.method2233(), var7);
                                if (var5 == null) {
                                    throw new RuntimeException(String.format("Unrecognized client option %d", var7));
                                }
                            }
                        } else if (var0 == 3182) {
                            var4 = class399.field2825;
                        } else if (var0 == 3204) {
                            var5 = class484.field3478;
                        } else if (var0 == 3206) {
                            var5 = class484.field3480;
                        } else if (var0 == 3208) {
                            var5 = class484.field3484;
                        }

                        if (class484.field3483 == var5) {
                            switch (var4.field2826) {
                                case 1:
                                    var6 = class290.field2121.method2532() ? 1 : 0;
                                    break;
                                case 2:
                                    var6 = class290.field2121.method2548() ? 1 : 0;
                                    break;
                                case 3:
                                    var6 = class290.field2121.method2538() ? 1 : 0;
                                    break;
                                case 4:
                                    var6 = class290.field2121.method2534();
                                    break;
                                case 5:
                                    var6 = Client.method2465();
                                    break;
                                default:
                                    var12 = String.format("Unkown device option: %s.", var4);
                                    throw new RuntimeException(var12);
                            }
                        } else {
                            switch (var5.field3482) {
                                case 1:
                                    var6 = class290.field2121.method2528() ? 1 : 0;
                                    break;
                                case 2:
                                    var7 = class290.field2121.method2529();
                                    var6 = Math.round((float) (var7 * 100) / 255.0F);
                                    break;
                                case 3:
                                    var7 = class290.field2121.method2537();
                                    var6 = Math.round((float) (var7 * 100) / 127.0F);
                                    break;
                                case 4:
                                    var7 = class290.field2121.method2555();
                                    var6 = Math.round((float) (var7 * 100) / 127.0F);
                                    break;
                                default:
                                    var12 = String.format("Unkown game option: %s.", var5);
                                    throw new RuntimeException(var12);
                            }
                        }

                        field1988[++class56.field597 - 1] = var6;
                        return 1;
                    }
                } else {
                    var4 = class399.field2829;
                    var5 = class484.field3483;
                    var6 = field1988[--class56.field597];
                    if (var0 == 3212) {
                        var7 = field1988[--class56.field597];
                        var4 = (class399) class27.method80(class399.method1839(), var7);
                        if (null == var4) {
                            throw new RuntimeException(String.format("Unrecognized device option %d", var7));
                        }
                    }

                    if (var0 == 3213) {
                        var7 = field1988[--class56.field597];
                        var5 = (class484) class27.method80(class484.method2233(), var7);
                        if (var5 == null) {
                            throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                        }
                    }

                    if (var0 == 3209) {
                        var7 = field1988[--class56.field597];
                        var4 = (class399) class27.method80(class399.method1839(), var7);
                        if (var4 == null) {
                            var5 = (class484) class27.method80(class484.method2233(), var7);
                            if (null == var5) {
                                throw new RuntimeException(String.format("Unrecognized client option %d", var7));
                            }
                        }
                    } else if (var0 == 3181) {
                        var4 = class399.field2825;
                    } else if (var0 == 3203) {
                        var5 = class484.field3478;
                    } else if (var0 == 3205) {
                        var5 = class484.field3480;
                    } else if (var0 == 3207) {
                        var5 = class484.field3484;
                    }

                    if (class484.field3483 == var5) {
                        switch (var4.field2826) {
                            case 1:
                                class290.field2121.method2549(var6 == 1);
                                break;
                            case 2:
                                class290.field2121.method2547(var6 == 1);
                                break;
                            case 3:
                                class290.field2121.method2530(var6 == 1);
                                break;
                            case 4:
                                if (var6 < 0) {
                                    var6 = 0;
                                }

                                class290.field2121.method2533(var6);
                                break;
                            case 5:
                                Client.method2340(var6);
                                break;
                            default:
                                var12 = String.format("Unkown device option: %s.", var4);
                                throw new RuntimeException(var12);
                        }
                    } else {
                        switch (var5.field3482) {
                            case 1:
                                class290.field2121.method2527(var6 == 1);
                                break;
                            case 2:
                                var6 = Math.min(Math.max(var6, 0), 100);
                                var7 = Math.round((float) (var6 * 255) / 100.0F);
                                Client.method2445(var7);
                                break;
                            case 3:
                                var6 = Math.min(Math.max(var6, 0), 100);
                                var7 = Math.round((float) (var6 * 127) / 100.0F);
                                Client.method2475(var7);
                                break;
                            case 4:
                                var6 = Math.min(Math.max(var6, 0), 100);
                                var7 = Math.round((float) (var6 * 127) / 100.0F);
                                Client.method2339(var7);
                                break;
                            default:
                                var12 = String.format("Unkown game option: %s.", var5);
                                throw new RuntimeException(var12);
                        }
                    }

                    return 1;
                }
            }
        }
    }

    static int method1208(int var0, class443 var1, boolean var2) {
        int var4;
        int var5;
        int var7;
        if (var0 == 3400) {
            class56.field597 -= 2;
            var4 = field1988[class56.field597];
            var5 = field1988[1 + class56.field597];
            class356 var11 = class356.method1696(var4);
            if (var11.field2562 != 's') {
            }

            for (var7 = 0; var7 < var11.field2565; ++var7) {
                if (var11.field2559[var7] == var5) {
                    field1975[++class228.field1787 - 1] = var11.field2566[var7];
                    var11 = null;
                    break;
                }
            }

            if (null != var11) {
                field1975[++class228.field1787 - 1] = var11.field2563;
            }

            return 1;
        } else if (var0 != 3408) {
            if (var0 == 3411) {
                var4 = field1988[--class56.field597];
                class356 var10 = class356.method1696(var4);
                field1988[++class56.field597 - 1] = var10.method1693();
                return 1;
            } else {
                return 2;
            }
        } else {
            class56.field597 -= 4;
            var4 = field1988[class56.field597];
            var5 = field1988[class56.field597 + 1];
            int var6 = field1988[class56.field597 + 2];
            var7 = field1988[class56.field597 + 3];
            class356 var8 = class356.method1696(var6);
            if (var8.field2561 == var4 && var8.field2562 == var5) {
                for (int var9 = 0; var9 < var8.field2565; ++var9) {
                    if (var8.field2559[var9] == var7) {
                        if (var5 == 115) {
                            field1975[++class228.field1787 - 1] = var8.field2566[var9];
                        } else {
                            field1988[++class56.field597 - 1] = var8.field2568[var9];
                        }

                        var8 = null;
                        break;
                    }
                }

                if (null != var8) {
                    if (var5 == 115) {
                        field1975[++class228.field1787 - 1] = var8.field2563;
                    } else {
                        field1988[++class56.field597 - 1] = var8.field2560;
                    }
                }

                return 1;
            } else {
                if (var5 == 115) {
                    field1975[++class228.field1787 - 1] = class32.field483;
                } else {
                    field1988[++class56.field597 - 1] = 0;
                }

                return 1;
            }
        }
    }

    static int method1195(int var0, class443 var1, boolean var2) {
        int var4;
        if (var0 == 3500) {
            var4 = field1988[--class56.field597];
            field1988[++class56.field597 - 1] = Client.field3923.method958(var4) ? 1 : 0;
            return 1;
        } else if (var0 == 3501) {
            var4 = field1988[--class56.field597];
            field1988[++class56.field597 - 1] = Client.field3923.method954(var4) ? 1 : 0;
            return 1;
        } else if (var0 == 3502) {
            var4 = field1988[--class56.field597];
            field1988[++class56.field597 - 1] = Client.field3923.method951(var4) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    static int method1162(int var0, class443 var1, boolean var2) {
        if (var0 == 3600) {
            if (class153.field1320.field2961 == 0) {
                field1988[++class56.field597 - 1] = -2;
            } else if (class153.field1320.field2961 == 1) {
                field1988[++class56.field597 - 1] = -1;
            } else {
                field1988[++class56.field597 - 1] = class153.field1320.field2963.method69();
            }

            return 1;
        } else {
            int var4;
            if (var0 == 3601) {
                var4 = field1988[--class56.field597];
                if (class153.field1320.method1982() && var4 >= 0 && var4 < class153.field1320.field2963.method69()) {
                    class467 var9 = (class467) class153.field1320.field2963.method56(var4);
                    field1975[++class228.field1787 - 1] = var9.method1248();
                    field1975[++class228.field1787 - 1] = var9.method1249();
                } else {
                    field1975[++class228.field1787 - 1] = "";
                    field1975[++class228.field1787 - 1] = "";
                }

                return 1;
            } else if (var0 == 3602) {
                var4 = field1988[--class56.field597];
                if (class153.field1320.method1982() && var4 >= 0 && var4 < class153.field1320.field2963.method69()) {
                    field1988[++class56.field597 - 1] = ((class324) class153.field1320.field2963.method56(var4)).field2349;
                } else {
                    field1988[++class56.field597 - 1] = 0;
                }

                return 1;
            } else if (var0 == 3603) {
                var4 = field1988[--class56.field597];
                if (class153.field1320.method1982() && var4 >= 0 && var4 < class153.field1320.field2963.method69()) {
                    field1988[++class56.field597 - 1] = ((class324) class153.field1320.field2963.method56(var4)).field2350;
                } else {
                    field1988[++class56.field597 - 1] = 0;
                }

                return 1;
            } else {
                String var10;
                if (var0 == 3604) {
                    var10 = field1975[--class228.field1787];
                    int var8 = field1988[--class56.field597];
                    class435.method1999(var10, var8);
                    return 1;
                } else if (var0 == 3605) {
                    var10 = field1975[--class228.field1787];
                    class153.field1320.method1988(var10);
                    return 1;
                } else if (var0 == 3606) {
                    var10 = field1975[--class228.field1787];
                    class153.field1320.method1991(var10);
                    return 1;
                } else if (var0 == 3607) {
                    var10 = field1975[--class228.field1787];
                    class153.field1320.method1990(var10);
                    return 1;
                } else if (var0 == 3608) {
                    var10 = field1975[--class228.field1787];
                    boolean var7 = true;
                    class153.field1320.method1992(var10, true);
                    return 1;
                } else if (var0 == 3609) {
                    var10 = field1975[--class228.field1787];
                    var10 = Client.method2419(var10);
                    field1988[++class56.field597 - 1] = class153.field1320.method1986(new class358(var10, class492.field3622), false) ? 1 : 0;
                    return 1;
                } else if (var0 == 3611) {
                    if (class527.field4208 != null) {
                        field1975[++class228.field1787 - 1] = class527.field4208.field1458;
                    } else {
                        field1975[++class228.field1787 - 1] = "";
                    }

                    return 1;
                } else if (var0 == 3612) {
                    if (class527.field4208 != null) {
                        field1988[++class56.field597 - 1] = class527.field4208.method69();
                    } else {
                        field1988[++class56.field597 - 1] = 0;
                    }

                    return 1;
                } else if (var0 == 3613) {
                    var4 = field1988[--class56.field597];
                    if (class527.field4208 != null && var4 < class527.field4208.method69()) {
                        field1975[++class228.field1787 - 1] = class527.field4208.method56(var4).method1247().method1706();
                    } else {
                        field1975[++class228.field1787 - 1] = "";
                    }

                    return 1;
                } else if (var0 == 3614) {
                    var4 = field1988[--class56.field597];
                    if (class527.field4208 != null && var4 < class527.field4208.method69()) {
                        field1988[++class56.field597 - 1] = ((class324) class527.field4208.method56(var4)).method1435();
                    } else {
                        field1988[++class56.field597 - 1] = 0;
                    }

                    return 1;
                } else if (var0 == 3615) {
                    var4 = field1988[--class56.field597];
                    if (class527.field4208 != null && var4 < class527.field4208.method69()) {
                        field1988[++class56.field597 - 1] = ((class324) class527.field4208.method56(var4)).field2350;
                    } else {
                        field1988[++class56.field597 - 1] = 0;
                    }

                    return 1;
                } else if (var0 == 3616) {
                    field1988[++class56.field597 - 1] = class527.field4208 != null ? class527.field4208.field1462 : 0;
                    return 1;
                } else if (var0 == 3617) {
                    var10 = field1975[--class228.field1787];
                    Client.method2400(var10);
                    return 1;
                } else if (var0 == 3618) {
                    field1988[++class56.field597 - 1] = class527.field4208 != null ? class527.field4208.field1463 : 0;
                    return 1;
                } else if (var0 == 3619) {
                    var10 = field1975[--class228.field1787];
                    Client.method2388(var10);
                    return 1;
                } else if (var0 == 3620) {
                    Client.method2367();
                    return 1;
                } else if (var0 == 3621) {
                    if (!class153.field1320.method1982()) {
                        field1988[++class56.field597 - 1] = -1;
                    } else {
                        field1988[++class56.field597 - 1] = class153.field1320.field2962.method69();
                    }

                    return 1;
                } else if (var0 == 3622) {
                    var4 = field1988[--class56.field597];
                    if (class153.field1320.method1982() && var4 >= 0 && var4 < class153.field1320.field2962.method69()) {
                        class431 var5 = (class431) class153.field1320.field2962.method56(var4);
                        field1975[++class228.field1787 - 1] = var5.method1248();
                        field1975[++class228.field1787 - 1] = var5.method1249();
                    } else {
                        field1975[++class228.field1787 - 1] = "";
                        field1975[++class228.field1787 - 1] = "";
                    }

                    return 1;
                } else if (var0 == 3623) {
                    var10 = field1975[--class228.field1787];
                    var10 = Client.method2419(var10);
                    field1988[++class56.field597 - 1] = class153.field1320.method1987(new class358(var10, class492.field3622)) ? 1 : 0;
                    return 1;
                } else if (var0 == 3624) {
                    var4 = field1988[--class56.field597];
                    if (null != class527.field4208 && var4 < class527.field4208.method69() && class527.field4208.method56(var4).method1247().equals(class180.field1528.field2070)) {
                        field1988[++class56.field597 - 1] = 1;
                    } else {
                        field1988[++class56.field597 - 1] = 0;
                    }

                    return 1;
                } else if (var0 == 3625) {
                    if (null != class527.field4208 && null != class527.field4208.field1461) {
                        field1975[++class228.field1787 - 1] = class527.field4208.field1461;
                    } else {
                        field1975[++class228.field1787 - 1] = "";
                    }

                    return 1;
                } else if (var0 == 3626) {
                    var4 = field1988[--class56.field597];
                    if (null != class527.field4208 && var4 < class527.field4208.method69() && ((class281) class527.field4208.method56(var4)).method1276()) {
                        field1988[++class56.field597 - 1] = 1;
                    } else {
                        field1988[++class56.field597 - 1] = 0;
                    }

                    return 1;
                } else if (var0 != 3627) {
                    if (var0 == 3628) {
                        class153.field1320.field2963.method68();
                        return 1;
                    } else {
                        boolean var6;
                        if (var0 == 3629) {
                            var6 = field1988[--class56.field597] == 1;
                            class153.field1320.field2963.method61(new class106(var6));
                            return 1;
                        } else if (var0 == 3630) {
                            var6 = field1988[--class56.field597] == 1;
                            class153.field1320.field2963.method61(new class515(var6));
                            return 1;
                        } else if (var0 == 3631) {
                            var6 = field1988[--class56.field597] == 1;
                            class153.field1320.field2963.method61(new class525(var6));
                            return 1;
                        } else if (var0 == 3632) {
                            var6 = field1988[--class56.field597] == 1;
                            class153.field1320.field2963.method61(new class382(var6));
                            return 1;
                        } else if (var0 == 3633) {
                            var6 = field1988[--class56.field597] == 1;
                            class153.field1320.field2963.method61(new class113(var6));
                            return 1;
                        } else if (var0 == 3634) {
                            var6 = field1988[--class56.field597] == 1;
                            class153.field1320.field2963.method61(new class335(var6));
                            return 1;
                        } else if (var0 == 3635) {
                            var6 = field1988[--class56.field597] == 1;
                            class153.field1320.field2963.method61(new class257(var6));
                            return 1;
                        } else if (var0 == 3636) {
                            var6 = field1988[--class56.field597] == 1;
                            class153.field1320.field2963.method61(new class251(var6));
                            return 1;
                        } else if (var0 == 3637) {
                            var6 = field1988[--class56.field597] == 1;
                            class153.field1320.field2963.method61(new class61(var6));
                            return 1;
                        } else if (var0 == 3638) {
                            var6 = field1988[--class56.field597] == 1;
                            class153.field1320.field2963.method61(new class225(var6));
                            return 1;
                        } else if (var0 == 3639) {
                            class153.field1320.field2963.method70();
                            return 1;
                        } else if (var0 == 3640) {
                            class153.field1320.field2962.method68();
                            return 1;
                        } else if (var0 == 3641) {
                            var6 = field1988[--class56.field597] == 1;
                            class153.field1320.field2962.method61(new class106(var6));
                            return 1;
                        } else if (var0 == 3642) {
                            var6 = field1988[--class56.field597] == 1;
                            class153.field1320.field2962.method61(new class515(var6));
                            return 1;
                        } else if (var0 == 3643) {
                            class153.field1320.field2962.method70();
                            return 1;
                        } else if (var0 == 3644) {
                            if (null != class527.field4208) {
                                class527.field4208.method68();
                            }

                            return 1;
                        } else if (var0 == 3645) {
                            var6 = field1988[--class56.field597] == 1;
                            if (null != class527.field4208) {
                                class527.field4208.method61(new class106(var6));
                            }

                            return 1;
                        } else if (var0 == 3646) {
                            var6 = field1988[--class56.field597] == 1;
                            if (null != class527.field4208) {
                                class527.field4208.method61(new class515(var6));
                            }

                            return 1;
                        } else if (var0 == 3647) {
                            var6 = field1988[--class56.field597] == 1;
                            if (class527.field4208 != null) {
                                class527.field4208.method61(new class525(var6));
                            }

                            return 1;
                        } else if (var0 == 3648) {
                            var6 = field1988[--class56.field597] == 1;
                            if (class527.field4208 != null) {
                                class527.field4208.method61(new class382(var6));
                            }

                            return 1;
                        } else if (var0 == 3649) {
                            var6 = field1988[--class56.field597] == 1;
                            if (class527.field4208 != null) {
                                class527.field4208.method61(new class113(var6));
                            }

                            return 1;
                        } else if (var0 == 3650) {
                            var6 = field1988[--class56.field597] == 1;
                            if (class527.field4208 != null) {
                                class527.field4208.method61(new class335(var6));
                            }

                            return 1;
                        } else if (var0 == 3651) {
                            var6 = field1988[--class56.field597] == 1;
                            if (null != class527.field4208) {
                                class527.field4208.method61(new class257(var6));
                            }

                            return 1;
                        } else if (var0 == 3652) {
                            var6 = field1988[--class56.field597] == 1;
                            if (class527.field4208 != null) {
                                class527.field4208.method61(new class251(var6));
                            }

                            return 1;
                        } else if (var0 == 3653) {
                            var6 = field1988[--class56.field597] == 1;
                            if (null != class527.field4208) {
                                class527.field4208.method61(new class61(var6));
                            }

                            return 1;
                        } else if (var0 == 3654) {
                            var6 = field1988[--class56.field597] == 1;
                            if (class527.field4208 != null) {
                                class527.field4208.method61(new class225(var6));
                            }

                            return 1;
                        } else if (var0 == 3655) {
                            if (null != class527.field4208) {
                                class527.field4208.method70();
                            }

                            return 1;
                        } else if (var0 == 3656) {
                            var6 = field1988[--class56.field597] == 1;
                            class153.field1320.field2963.method61(new class440(var6));
                            return 1;
                        } else if (var0 == 3657) {
                            var6 = field1988[--class56.field597] == 1;
                            if (class527.field4208 != null) {
                                class527.field4208.method61(new class440(var6));
                            }

                            return 1;
                        } else {
                            return 2;
                        }
                    }
                } else {
                    var4 = field1988[--class56.field597];
                    if (class527.field4208 != null && var4 < class527.field4208.method69() && ((class281) class527.field4208.method56(var4)).method1277()) {
                        field1988[++class56.field597 - 1] = 1;
                    } else {
                        field1988[++class56.field597 - 1] = 0;
                    }

                    return 1;
                }
            }
        }
    }

    static int method1165(int var0, class443 var1, boolean var2) {
        return 2;
    }

    static int method1167(int var0, class443 var1, boolean var2) {
        if (var0 == 3800) {
            if (class172.field1453 != null) {
                field1988[++class56.field597 - 1] = 1;
                class96.field777 = class172.field1453;
            } else {
                field1988[++class56.field597 - 1] = 0;
            }

            return 1;
        } else {
            int var4;
            if (var0 == 3801) {
                var4 = field1988[--class56.field597];
                if (null != Client.field4019[var4]) {
                    field1988[++class56.field597 - 1] = 1;
                    class96.field777 = Client.field4019[var4];
                } else {
                    field1988[++class56.field597 - 1] = 0;
                }

                return 1;
            } else if (var0 == 3802) {
                field1975[++class228.field1787 - 1] = class96.field777.field1166;
                return 1;
            } else if (var0 == 3803) {
                field1988[++class56.field597 - 1] = class96.field777.field1165 ? 1 : 0;
                return 1;
            } else if (var0 == 3804) {
                field1988[++class56.field597 - 1] = class96.field777.field1179;
                return 1;
            } else if (var0 == 3805) {
                field1988[++class56.field597 - 1] = class96.field777.field1167;
                return 1;
            } else if (var0 == 3806) {
                field1988[++class56.field597 - 1] = class96.field777.field1168;
                return 1;
            } else if (var0 == 3807) {
                field1988[++class56.field597 - 1] = class96.field777.field1169;
                return 1;
            } else if (var0 == 3809) {
                field1988[++class56.field597 - 1] = class96.field777.field1170;
                return 1;
            } else if (var0 == 3810) {
                var4 = field1988[--class56.field597];
                field1975[++class228.field1787 - 1] = class96.field777.field1181[var4];
                return 1;
            } else if (var0 == 3811) {
                var4 = field1988[--class56.field597];
                field1988[++class56.field597 - 1] = class96.field777.field1172[var4];
                return 1;
            } else if (var0 == 3812) {
                field1988[++class56.field597 - 1] = class96.field777.field1163;
                return 1;
            } else if (var0 == 3813) {
                var4 = field1988[--class56.field597];
                field1975[++class228.field1787 - 1] = class96.field777.field1182[var4];
                return 1;
            } else {
                int var6;
                int var7;
                if (var0 == 3814) {
                    class56.field597 -= 3;
                    var4 = field1988[class56.field597];
                    var7 = field1988[1 + class56.field597];
                    var6 = field1988[class56.field597 + 2];
                    field1988[++class56.field597 - 1] = class96.field777.method603(var4, var7, var6);
                    return 1;
                } else if (var0 == 3815) {
                    field1988[++class56.field597 - 1] = class96.field777.field1177;
                    return 1;
                } else if (var0 == 3816) {
                    field1988[++class56.field597 - 1] = class96.field777.field1162;
                    return 1;
                } else if (var0 == 3817) {
                    field1988[++class56.field597 - 1] = class96.field777.method601(field1975[--class228.field1787]);
                    return 1;
                } else if (var0 == 3818) {
                    field1988[class56.field597 - 1] = class96.field777.method597()[field1988[class56.field597 - 1]];
                    return 1;
                } else if (var0 == 3819) {
                    class56.field597 -= 2;
                    var4 = field1988[class56.field597];
                    var7 = field1988[class56.field597 + 1];
                    Client.method2472(var7, var4);
                    return 1;
                } else if (var0 == 3820) {
                    var4 = field1988[--class56.field597];
                    field1988[++class56.field597 - 1] = class96.field777.field1175[var4];
                    return 1;
                } else {
                    if (var0 == 3821) {
                        class56.field597 -= 3;
                        var4 = field1988[class56.field597];
                        boolean var5 = field1988[1 + class56.field597] == 1;
                        var6 = field1988[class56.field597 + 2];
                        class352.method1648(var6, var4, var5);
                    }

                    if (var0 == 3822) {
                        var4 = field1988[--class56.field597];
                        field1988[++class56.field597 - 1] = class96.field777.field1176[var4] ? 1 : 0;
                        return 1;
                    } else if (var0 == 3850) {
                        if (null != class375.field2724) {
                            field1988[++class56.field597 - 1] = 1;
                            class284.field2085 = class375.field2724;
                        } else {
                            field1988[++class56.field597 - 1] = 0;
                        }

                        return 1;
                    } else if (var0 == 3851) {
                        var4 = field1988[--class56.field597];
                        if (null != Client.field4020[var4]) {
                            field1988[++class56.field597 - 1] = 1;
                            class284.field2085 = Client.field4020[var4];
                            class223.field1765 = var4;
                        } else {
                            field1988[++class56.field597 - 1] = 0;
                        }

                        return 1;
                    } else if (var0 == 3852) {
                        field1975[++class228.field1787 - 1] = class284.field2085.field2266;
                        return 1;
                    } else if (var0 == 3853) {
                        field1988[++class56.field597 - 1] = class284.field2085.field2265;
                        return 1;
                    } else if (var0 == 3854) {
                        field1988[++class56.field597 - 1] = class284.field2085.field2261;
                        return 1;
                    } else if (var0 == 3855) {
                        field1988[++class56.field597 - 1] = class284.field2085.method1388();
                        return 1;
                    } else if (var0 == 3856) {
                        var4 = field1988[--class56.field597];
                        field1975[++class228.field1787 - 1] = class284.field2085.field2263.get(var4).field2862.method1706();
                        return 1;
                    } else if (var0 == 3857) {
                        var4 = field1988[--class56.field597];
                        field1988[++class56.field597 - 1] = class284.field2085.field2263.get(var4).field2863;
                        return 1;
                    } else if (var0 == 3858) {
                        var4 = field1988[--class56.field597];
                        field1988[++class56.field597 - 1] = class284.field2085.field2263.get(var4).field2864;
                        return 1;
                    } else if (var0 == 3859) {
                        var4 = field1988[--class56.field597];
                        Client.method2380(class223.field1765, var4);
                        return 1;
                    } else if (var0 == 3860) {
                        field1988[++class56.field597 - 1] = class284.field2085.method1389(field1975[--class228.field1787]);
                        return 1;
                    } else if (var0 == 3861) {
                        field1988[class56.field597 - 1] = class284.field2085.method1390()[field1988[class56.field597 - 1]];
                        return 1;
                    } else if (var0 == 3890) {
                        field1988[++class56.field597 - 1] = null != class360.field2584 ? 1 : 0;
                        return 1;
                    } else {
                        return 2;
                    }
                }
            }
        }
    }

    static int method1203(int var0, class443 var1, boolean var2) {
        int var4;
        if (var0 == 3903) {
            var4 = field1988[--class56.field597];
            field1988[++class56.field597 - 1] = Client.field4053[var4].method1115();
            return 1;
        } else if (var0 == 3904) {
            var4 = field1988[--class56.field597];
            field1988[++class56.field597 - 1] = Client.field4053[var4].field1897;
            return 1;
        } else if (var0 == 3905) {
            var4 = field1988[--class56.field597];
            field1988[++class56.field597 - 1] = Client.field4053[var4].field1901;
            return 1;
        } else if (var0 == 3906) {
            var4 = field1988[--class56.field597];
            field1988[++class56.field597 - 1] = Client.field4053[var4].field1899;
            return 1;
        } else if (var0 == 3907) {
            var4 = field1988[--class56.field597];
            field1988[++class56.field597 - 1] = Client.field4053[var4].field1900;
            return 1;
        } else if (var0 == 3908) {
            var4 = field1988[--class56.field597];
            field1988[++class56.field597 - 1] = Client.field4053[var4].field1896;
            return 1;
        } else {
            int var14;
            if (var0 == 3910) {
                var4 = field1988[--class56.field597];
                var14 = Client.field4053[var4].method1114();
                field1988[++class56.field597 - 1] = var14 == 0 ? 1 : 0;
                return 1;
            } else if (var0 == 3911) {
                var4 = field1988[--class56.field597];
                var14 = Client.field4053[var4].method1114();
                field1988[++class56.field597 - 1] = var14 == 2 ? 1 : 0;
                return 1;
            } else if (var0 == 3912) {
                var4 = field1988[--class56.field597];
                var14 = Client.field4053[var4].method1114();
                field1988[++class56.field597 - 1] = var14 == 5 ? 1 : 0;
                return 1;
            } else if (var0 == 3913) {
                var4 = field1988[--class56.field597];
                var14 = Client.field4053[var4].method1114();
                field1988[++class56.field597 - 1] = var14 == 1 ? 1 : 0;
                return 1;
            } else {
                boolean var12;
                if (var0 == 3914) {
                    var12 = field1988[--class56.field597] == 1;
                    if (class252.field1914 != null) {
                        class252.field1914.method874(class188.field1539, var12);
                    }

                    return 1;
                } else if (var0 == 3915) {
                    var12 = field1988[--class56.field597] == 1;
                    if (null != class252.field1914) {
                        class252.field1914.method874(class188.field1541, var12);
                    }

                    return 1;
                } else if (var0 == 3916) {
                    class56.field597 -= 2;
                    var12 = field1988[class56.field597] == 1;
                    boolean var13 = field1988[1 + class56.field597] == 1;
                    if (null != class252.field1914) {
                        Client.field4065.field163 = var13;
                        class252.field1914.method874(Client.field4065, var12);
                    }

                    return 1;
                } else if (var0 == 3917) {
                    var12 = field1988[--class56.field597] == 1;
                    if (null != class252.field1914) {
                        class252.field1914.method874(class188.field1537, var12);
                    }

                    return 1;
                } else if (var0 == 3918) {
                    var12 = field1988[--class56.field597] == 1;
                    if (null != class252.field1914) {
                        class252.field1914.method874(class188.field1540, var12);
                    }

                    return 1;
                } else if (var0 == 3919) {
                    field1988[++class56.field597 - 1] = class252.field1914 == null ? 0 : class252.field1914.field1538.size();
                    return 1;
                } else {
                    class142 var5;
                    if (var0 == 3920) {
                        var4 = field1988[--class56.field597];
                        var5 = (class142) class252.field1914.field1538.get(var4);
                        field1988[++class56.field597 - 1] = var5.field1252;
                        return 1;
                    } else if (var0 == 3921) {
                        var4 = field1988[--class56.field597];
                        var5 = (class142) class252.field1914.field1538.get(var4);
                        field1975[++class228.field1787 - 1] = var5.method657();
                        return 1;
                    } else if (var0 == 3922) {
                        var4 = field1988[--class56.field597];
                        var5 = (class142) class252.field1914.field1538.get(var4);
                        field1975[++class228.field1787 - 1] = var5.method656();
                        return 1;
                    } else if (var0 == 3923) {
                        var4 = field1988[--class56.field597];
                        var5 = (class142) class252.field1914.field1538.get(var4);
                        long var6 = class206.method982() - class245.field1887 - var5.field1250;
                        int var8 = (int) (var6 / 3600000L);
                        int var9 = (int) ((var6 - (var8 * 3600000L)) / 60000L);
                        int var10 = (int) ((var6 - (var8 * 3600000L) - (var9 * 60000L)) / 1000L);
                        String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
                        field1975[++class228.field1787 - 1] = var11;
                        return 1;
                    } else if (var0 == 3924) {
                        var4 = field1988[--class56.field597];
                        var5 = (class142) class252.field1914.field1538.get(var4);
                        field1988[++class56.field597 - 1] = var5.field1248.field1899;
                        return 1;
                    } else if (var0 == 3925) {
                        var4 = field1988[--class56.field597];
                        var5 = (class142) class252.field1914.field1538.get(var4);
                        field1988[++class56.field597 - 1] = var5.field1248.field1901;
                        return 1;
                    } else if (var0 == 3926) {
                        var4 = field1988[--class56.field597];
                        var5 = (class142) class252.field1914.field1538.get(var4);
                        field1988[++class56.field597 - 1] = var5.field1248.field1897;
                        return 1;
                    } else if (var0 == 3939) {
                        var4 = field1988[--class56.field597];
                        field1988[++class56.field597 - 1] = class508.method2299(var4).field3764 ? 1 : 0;
                        return 1;
                    } else {
                        return 2;
                    }
                }
            }
        }
    }

    static int method1204(int var0, class443 var1, boolean var2) {
        int var5;
        int var10;
        if (var0 == 4000) {
            class56.field597 -= 2;
            var10 = field1988[class56.field597];
            var5 = field1988[class56.field597 + 1];
            field1988[++class56.field597 - 1] = var10 + var5;
            return 1;
        } else if (var0 == 4001) {
            class56.field597 -= 2;
            var10 = field1988[class56.field597];
            var5 = field1988[1 + class56.field597];
            field1988[++class56.field597 - 1] = var10 - var5;
            return 1;
        } else if (var0 == 4002) {
            class56.field597 -= 2;
            var10 = field1988[class56.field597];
            var5 = field1988[1 + class56.field597];
            field1988[++class56.field597 - 1] = var10 * var5;
            return 1;
        } else if (var0 == 4003) {
            class56.field597 -= 2;
            var10 = field1988[class56.field597];
            var5 = field1988[1 + class56.field597];
            field1988[++class56.field597 - 1] = var10 / var5;
            return 1;
        } else if (var0 == 4004) {
            var10 = field1988[--class56.field597];
            field1988[++class56.field597 - 1] = (int) (Math.random() * (double) var10);
            return 1;
        } else if (var0 == 4005) {
            var10 = field1988[--class56.field597];
            field1988[++class56.field597 - 1] = (int) (Math.random() * (double) (var10 + 1));
            return 1;
        } else {
            int var6;
            int var7;
            int var8;
            if (var0 == 4006) {
                class56.field597 -= 5;
                var10 = field1988[class56.field597];
                var5 = field1988[class56.field597 + 1];
                var6 = field1988[2 + class56.field597];
                var7 = field1988[class56.field597 + 3];
                var8 = field1988[class56.field597 + 4];
                field1988[++class56.field597 - 1] = var10 + (var8 - var6) * (var5 - var10) / (var7 - var6);
                return 1;
            } else if (var0 == 4007) {
                class56.field597 -= 2;
                var10 = field1988[class56.field597];
                var5 = field1988[class56.field597 + 1];
                field1988[++class56.field597 - 1] = var5 * var10 / 100 + var10;
                return 1;
            } else if (var0 == 4008) {
                class56.field597 -= 2;
                var10 = field1988[class56.field597];
                var5 = field1988[class56.field597 + 1];
                field1988[++class56.field597 - 1] = var10 | 1 << var5;
                return 1;
            } else if (var0 == 4009) {
                class56.field597 -= 2;
                var10 = field1988[class56.field597];
                var5 = field1988[class56.field597 + 1];
                field1988[++class56.field597 - 1] = var10 & -1 - (1 << var5);
                return 1;
            } else if (var0 == 4010) {
                class56.field597 -= 2;
                var10 = field1988[class56.field597];
                var5 = field1988[1 + class56.field597];
                field1988[++class56.field597 - 1] = (var10 & 1 << var5) != 0 ? 1 : 0;
                return 1;
            } else if (var0 == 4011) {
                class56.field597 -= 2;
                var10 = field1988[class56.field597];
                var5 = field1988[class56.field597 + 1];
                field1988[++class56.field597 - 1] = var10 % var5;
                return 1;
            } else if (var0 == 4012) {
                class56.field597 -= 2;
                var10 = field1988[class56.field597];
                var5 = field1988[1 + class56.field597];
                if (var10 == 0) {
                    field1988[++class56.field597 - 1] = 0;
                } else {
                    field1988[++class56.field597 - 1] = (int) Math.pow(var10, var5);
                }

                return 1;
            } else if (var0 == 4013) {
                class56.field597 -= 2;
                var10 = field1988[class56.field597];
                var5 = field1988[class56.field597 + 1];
                if (var10 == 0) {
                    field1988[++class56.field597 - 1] = 0;
                    return 1;
                } else {
                    switch (var5) {
                        case 0:
                            field1988[++class56.field597 - 1] = Integer.MAX_VALUE;
                            break;
                        case 1:
                            field1988[++class56.field597 - 1] = var10;
                            break;
                        case 2:
                            field1988[++class56.field597 - 1] = (int) Math.sqrt(var10);
                            break;
                        case 3:
                            field1988[++class56.field597 - 1] = (int) Math.cbrt(var10);
                            break;
                        case 4:
                            field1988[++class56.field597 - 1] = (int) Math.sqrt(Math.sqrt(var10));
                            break;
                        default:
                            field1988[++class56.field597 - 1] = (int) Math.pow(var10, 1.0D / (double) var5);
                    }

                    return 1;
                }
            } else if (var0 == 4014) {
                class56.field597 -= 2;
                var10 = field1988[class56.field597];
                var5 = field1988[class56.field597 + 1];
                field1988[++class56.field597 - 1] = var10 & var5;
                return 1;
            } else if (var0 == 4015) {
                class56.field597 -= 2;
                var10 = field1988[class56.field597];
                var5 = field1988[class56.field597 + 1];
                field1988[++class56.field597 - 1] = var10 | var5;
                return 1;
            } else if (var0 == 4016) {
                class56.field597 -= 2;
                var10 = field1988[class56.field597];
                var5 = field1988[1 + class56.field597];
                field1988[++class56.field597 - 1] = var10 < var5 ? var10 : var5;
                return 1;
            } else if (var0 == 4017) {
                class56.field597 -= 2;
                var10 = field1988[class56.field597];
                var5 = field1988[class56.field597 + 1];
                field1988[++class56.field597 - 1] = var10 > var5 ? var10 : var5;
                return 1;
            } else if (var0 == 4018) {
                class56.field597 -= 3;
                long var11 = field1988[class56.field597];
                long var12 = field1988[1 + class56.field597];
                long var13 = field1988[class56.field597 + 2];
                field1988[++class56.field597 - 1] = (int) (var11 * var13 / var12);
                return 1;
            } else if (var0 == 4025) {
                var10 = class46.method133(field1988[--class56.field597]);
                field1988[++class56.field597 - 1] = var10;
                return 1;
            } else if (var0 == 4026) {
                class56.field597 -= 2;
                var10 = field1988[class56.field597];
                var5 = field1988[1 + class56.field597];
                field1988[++class56.field597 - 1] = var10 ^ 1 << var5;
                return 1;
            } else if (var0 == 4027) {
                class56.field597 -= 3;
                var10 = field1988[class56.field597];
                var5 = field1988[1 + class56.field597];
                var6 = field1988[2 + class56.field597];
                field1988[++class56.field597 - 1] = class82.method333(var10, var5, var6);
                return 1;
            } else if (var0 == 4028) {
                class56.field597 -= 3;
                var10 = field1988[class56.field597];
                var5 = field1988[class56.field597 + 1];
                var6 = field1988[2 + class56.field597];
                field1988[++class56.field597 - 1] = class82.method331(var10, var5, var6);
                return 1;
            } else if (var0 == 4029) {
                class56.field597 -= 3;
                var10 = field1988[class56.field597];
                var5 = field1988[class56.field597 + 1];
                var6 = field1988[class56.field597 + 2];
                var7 = 31 - var6;
                field1988[++class56.field597 - 1] = var10 << var7 >>> var7 + var5;
                return 1;
            } else if (var0 == 4030) {
                class56.field597 -= 4;
                var10 = field1988[class56.field597];
                var5 = field1988[class56.field597 + 1];
                var6 = field1988[2 + class56.field597];
                var7 = field1988[3 + class56.field597];
                var10 = class82.method331(var10, var6, var7);
                var8 = class82.method329(1 + (var7 - var6));
                if (var5 > var8) {
                    var5 = var8;
                }

                field1988[++class56.field597 - 1] = var10 | var5 << var6;
                return 1;
            } else if (var0 == 4032) {
                field1988[class56.field597 - 1] = class210.method1001(field1988[class56.field597 - 1]);
                return 1;
            } else if (var0 == 4033) {
                field1988[class56.field597 - 1] = class210.method1003(field1988[class56.field597 - 1]);
                return 1;
            } else if (var0 == 4034) {
                class56.field597 -= 2;
                var10 = field1988[class56.field597];
                var5 = field1988[class56.field597 + 1];
                var6 = class210.method1002(var10, var5);
                field1988[++class56.field597 - 1] = var6;
                return 1;
            } else if (var0 == 4035) {
                field1988[class56.field597 - 1] = Math.abs(field1988[class56.field597 - 1]);
                return 1;
            } else if (var0 == 4036) {
                String var4 = field1975[--class228.field1787];
                var5 = -1;
                if (class95.method374(var4)) {
                    var5 = class95.method368(var4);
                }

                field1988[++class56.field597 - 1] = var5;
                return 1;
            } else {
                return 2;
            }
        }
    }

    static int method1171(int var0, class443 var1, boolean var2) {
        String var4;
        int var10;
        if (var0 == 4100) {
            var4 = field1975[--class228.field1787];
            var10 = field1988[--class56.field597];
            field1975[++class228.field1787 - 1] = var4 + var10;
            return 1;
        } else {
            String var5;
            if (var0 == 4101) {
                class228.field1787 -= 2;
                var4 = field1975[class228.field1787];
                var5 = field1975[1 + class228.field1787];
                field1975[++class228.field1787 - 1] = var4 + var5;
                return 1;
            } else if (var0 == 4102) {
                var4 = field1975[--class228.field1787];
                var10 = field1988[--class56.field597];
                field1975[++class228.field1787 - 1] = var4 + class95.method364(var10, true);
                return 1;
            } else if (var0 == 4103) {
                var4 = field1975[--class228.field1787];
                field1975[++class228.field1787 - 1] = var4.toLowerCase();
                return 1;
            } else {
                int var7;
                int var13;
                if (var0 == 4104) {
                    var13 = field1988[--class56.field597];
                    long var16 = 86400000L * ((long) var13 + 11745L);
                    field1981.setTime(new Date(var16));
                    var7 = field1981.get(5);
                    int var18 = field1981.get(2);
                    int var9 = field1981.get(1);
                    field1975[++class228.field1787 - 1] = var7 + "-" + field1982[var18] + "-" + var9;
                    return 1;
                } else if (var0 != 4105) {
                    if (var0 == 4106) {
                        var13 = field1988[--class56.field597];
                        field1975[++class228.field1787 - 1] = Integer.toString(var13);
                        return 1;
                    } else if (var0 == 4107) {
                        class228.field1787 -= 2;
                        field1988[++class56.field597 - 1] = class95.method373(class120.method536(field1975[class228.field1787], field1975[1 + class228.field1787], class404.field2860));
                        return 1;
                    } else {
                        int var12;
                        byte[] var15;
                        class413 var17;
                        if (var0 == 4108) {
                            var4 = field1975[--class228.field1787];
                            class56.field597 -= 2;
                            var10 = field1988[class56.field597];
                            var12 = field1988[1 + class56.field597];
                            var15 = class283.field2082.method188(var12, 0);
                            var17 = new class413(var15);
                            field1988[++class56.field597 - 1] = var17.method923(var4, var10);
                            return 1;
                        } else if (var0 == 4109) {
                            var4 = field1975[--class228.field1787];
                            class56.field597 -= 2;
                            var10 = field1988[class56.field597];
                            var12 = field1988[1 + class56.field597];
                            var15 = class283.field2082.method188(var12, 0);
                            var17 = new class413(var15);
                            field1988[++class56.field597 - 1] = var17.method944(var4, var10);
                            return 1;
                        } else if (var0 == 4110) {
                            class228.field1787 -= 2;
                            var4 = field1975[class228.field1787];
                            var5 = field1975[class228.field1787 + 1];
                            if (field1988[--class56.field597] == 1) {
                                field1975[++class228.field1787 - 1] = var4;
                            } else {
                                field1975[++class228.field1787 - 1] = var5;
                            }

                            return 1;
                        } else if (var0 == 4111) {
                            var4 = field1975[--class228.field1787];
                            field1975[++class228.field1787 - 1] = class197.method934(var4);
                            return 1;
                        } else if (var0 == 4112) {
                            var4 = field1975[--class228.field1787];
                            var10 = field1988[--class56.field597];
                            field1975[++class228.field1787 - 1] = var4 + (char) var10;
                            return 1;
                        } else if (var0 == 4113) {
                            var13 = field1988[--class56.field597];
                            field1988[++class56.field597 - 1] = class95.method366((char) var13) ? 1 : 0;
                            return 1;
                        } else if (var0 == 4114) {
                            var13 = field1988[--class56.field597];
                            field1988[++class56.field597 - 1] = class95.method378((char) var13) ? 1 : 0;
                            return 1;
                        } else if (var0 == 4115) {
                            var13 = field1988[--class56.field597];
                            field1988[++class56.field597 - 1] = class95.method372((char) var13) ? 1 : 0;
                            return 1;
                        } else if (var0 == 4116) {
                            var13 = field1988[--class56.field597];
                            field1988[++class56.field597 - 1] = class237.method1067((char) var13) ? 1 : 0;
                            return 1;
                        } else if (var0 == 4117) {
                            var4 = field1975[--class228.field1787];
                            if (null != var4) {
                                field1988[++class56.field597 - 1] = var4.length();
                            } else {
                                field1988[++class56.field597 - 1] = 0;
                            }

                            return 1;
                        } else if (var0 == 4118) {
                            var4 = field1975[--class228.field1787];
                            class56.field597 -= 2;
                            var10 = field1988[class56.field597];
                            var12 = field1988[1 + class56.field597];
                            field1975[++class228.field1787 - 1] = var4.substring(var10, var12);
                            return 1;
                        } else if (var0 == 4119) {
                            var4 = field1975[--class228.field1787];
                            StringBuilder var11 = new StringBuilder(var4.length());
                            boolean var14 = false;

                            for (var7 = 0; var7 < var4.length(); ++var7) {
                                char var8 = var4.charAt(var7);
                                if (var8 == '<') {
                                    var14 = true;
                                } else if (var8 == '>') {
                                    var14 = false;
                                } else if (!var14) {
                                    var11.append(var8);
                                }
                            }

                            field1975[++class228.field1787 - 1] = var11.toString();
                            return 1;
                        } else if (var0 == 4120) {
                            var4 = field1975[--class228.field1787];
                            var10 = field1988[--class56.field597];
                            field1988[++class56.field597 - 1] = var4.indexOf(var10);
                            return 1;
                        } else if (var0 == 4121) {
                            class228.field1787 -= 2;
                            var4 = field1975[class228.field1787];
                            var5 = field1975[class228.field1787 + 1];
                            var12 = field1988[--class56.field597];
                            field1988[++class56.field597 - 1] = var4.indexOf(var5, var12);
                            return 1;
                        } else if (var0 == 4122) {
                            var4 = field1975[--class228.field1787];
                            field1975[++class228.field1787 - 1] = var4.toUpperCase();
                            return 1;
                        } else if (var0 == 4123) {
                            class228.field1787 -= 3;
                            var4 = field1975[class228.field1787];
                            var5 = field1975[1 + class228.field1787];
                            String var6 = field1975[class228.field1787 + 2];
                            if (null == class180.field1528.field2054) {
                                field1975[++class228.field1787 - 1] = var6;
                                return 1;
                            } else {
                                switch (class180.field1528.field2054.field580) {
                                    case 0:
                                        field1975[++class228.field1787 - 1] = var4;
                                        break;
                                    case 1:
                                        field1975[++class228.field1787 - 1] = var5;
                                        break;
                                    case 2:
                                    default:
                                        field1975[++class228.field1787 - 1] = var6;
                                }

                                return 1;
                            }
                        } else {
                            return 2;
                        }
                    }
                } else {
                    class228.field1787 -= 2;
                    var4 = field1975[class228.field1787];
                    var5 = field1975[class228.field1787 + 1];
                    if (null != class180.field1528.field2054 && class180.field1528.field2054.field578 != 0) {
                        field1975[++class228.field1787 - 1] = var5;
                    } else {
                        field1975[++class228.field1787 - 1] = var4;
                    }

                    return 1;
                }
            }
        }
    }

    static int method1173(int var0, class443 var1, boolean var2) {
        int var4;
        if (var0 == 4200) {
            var4 = field1988[--class56.field597];
            field1975[++class228.field1787 - 1] = class508.method2299(var4).field3736;
            return 1;
        } else {
            class508 var6;
            int var7;
            if (var0 == 4201) {
                class56.field597 -= 2;
                var4 = field1988[class56.field597];
                var7 = field1988[1 + class56.field597];
                var6 = class508.method2299(var4);
                if (var7 >= 1 && var7 <= 5 && var6.field3737[var7 - 1] != null) {
                    field1975[++class228.field1787 - 1] = var6.field3737[var7 - 1];
                } else {
                    field1975[++class228.field1787 - 1] = "";
                }

                return 1;
            } else if (var0 == 4202) {
                class56.field597 -= 2;
                var4 = field1988[class56.field597];
                var7 = field1988[1 + class56.field597];
                var6 = class508.method2299(var4);
                if (var7 >= 1 && var7 <= 5 && var6.field3738[var7 - 1] != null) {
                    field1975[++class228.field1787 - 1] = var6.field3738[var7 - 1];
                } else {
                    field1975[++class228.field1787 - 1] = "";
                }

                return 1;
            } else if (var0 == 4203) {
                var4 = field1988[--class56.field597];
                field1988[++class56.field597 - 1] = class508.method2299(var4).field3732;
                return 1;
            } else if (var0 == 4204) {
                var4 = field1988[--class56.field597];
                field1988[++class56.field597 - 1] = class508.method2299(var4).field3731 == 1 ? 1 : 0;
                return 1;
            } else {
                class508 var5;
                if (var0 == 4205) {
                    var4 = field1988[--class56.field597];
                    var5 = class508.method2299(var4);
                    if (var5.field3727 == -1 && var5.field3754 >= 0) {
                        field1988[++class56.field597 - 1] = var5.field3754;
                    } else {
                        field1988[++class56.field597 - 1] = var4;
                    }

                    return 1;
                } else if (var0 == 4206) {
                    var4 = field1988[--class56.field597];
                    var5 = class508.method2299(var4);
                    if (var5.field3727 >= 0 && var5.field3754 >= 0) {
                        field1988[++class56.field597 - 1] = var5.field3754;
                    } else {
                        field1988[++class56.field597 - 1] = var4;
                    }

                    return 1;
                } else if (var0 == 4207) {
                    var4 = field1988[--class56.field597];
                    field1988[++class56.field597 - 1] = class508.method2299(var4).field3724 ? 1 : 0;
                    return 1;
                } else if (var0 == 4208) {
                    var4 = field1988[--class56.field597];
                    var5 = class508.method2299(var4);
                    if (var5.field3767 == -1 && var5.field3726 >= 0) {
                        field1988[++class56.field597 - 1] = var5.field3726;
                    } else {
                        field1988[++class56.field597 - 1] = var4;
                    }

                    return 1;
                } else if (var0 == 4209) {
                    var4 = field1988[--class56.field597];
                    var5 = class508.method2299(var4);
                    if (var5.field3767 >= 0 && var5.field3726 >= 0) {
                        field1988[++class56.field597 - 1] = var5.field3726;
                    } else {
                        field1988[++class56.field597 - 1] = var4;
                    }

                    return 1;
                } else if (var0 == 4210) {
                    String var8 = field1975[--class228.field1787];
                    var7 = field1988[--class56.field597];
                    Client.method2414(var8, var7 == 1);
                    field1988[++class56.field597 - 1] = class215.field1740;
                    return 1;
                } else if (var0 != 4211) {
                    if (var0 == 4212) {
                        class27.field150 = 0;
                        return 1;
                    } else if (var0 == 4213) {
                        var4 = field1988[--class56.field597];
                        var7 = class508.method2299(var4).method2292();
                        if (var7 == -1) {
                            field1988[++class56.field597 - 1] = -1;
                        } else {
                            field1988[++class56.field597 - 1] = var7 + 1;
                        }

                        return 1;
                    } else if (var0 == 4214) {
                        var4 = field1988[--class56.field597];
                        field1988[++class56.field597 - 1] = class508.method2299(var4).field3733;
                        return 1;
                    } else if (var0 == 4215) {
                        var4 = field1988[--class56.field597];
                        field1988[++class56.field597 - 1] = class508.method2299(var4).field3718;
                        return 1;
                    } else if (var0 == 4216) {
                        var4 = field1988[--class56.field597];
                        field1988[++class56.field597 - 1] = class508.method2299(var4).field3734;
                        return 1;
                    } else if (var0 == 4217) {
                        var4 = field1988[--class56.field597];
                        var5 = class508.method2299(var4);
                        field1988[++class56.field597 - 1] = var5.field3722;
                        return 1;
                    } else {
                        return 2;
                    }
                } else {
                    if (class30.field169 != null && class27.field150 < class215.field1740) {
                        field1988[++class56.field597 - 1] = class30.field169[++class27.field150 - 1] & '\uffff';
                    } else {
                        field1988[++class56.field597 - 1] = -1;
                    }

                    return 1;
                }
            }
        }
    }

    static int method1205(int var0, class443 var1, boolean var2) {
        if (var0 == 5000) {
            field1988[++class56.field597 - 1] = Client.field4008;
            return 1;
        } else if (var0 == 5001) {
            class56.field597 -= 3;
            Client.field4008 = field1988[class56.field597];
            class410.field2896 = class427.method1965(field1988[class56.field597 + 1]);
            if (null == class410.field2896) {
                class410.field2896 = class427.field2933;
            }

            Client.field4009 = field1988[class56.field597 + 2];
            class46 var14 = class46.method134(class488.field3577, Client.field3840.field2238);
            var14.field541.method249(Client.field4008);
            var14.field541.method249(class410.field2896.field2932);
            var14.field541.method249(Client.field4009);
            Client.field3840.method1359(var14);
            return 1;
        } else {
            String var4;
            class46 var7;
            int var9;
            int var11;
            if (var0 == 5002) {
                var4 = field1975[--class228.field1787];
                class56.field597 -= 2;
                var9 = field1988[class56.field597];
                var11 = field1988[class56.field597 + 1];
                var7 = class46.method134(class488.field3581, Client.field3840.field2238);
                var7.field541.method249(class78.method323(var4) + 2);
                var7.field541.method252(var4);
                var7.field541.method249(var9 - 1);
                var7.field541.method249(var11);
                Client.field3840.method1359(var7);
                return 1;
            } else {
                class434 var6;
                int var8;
                if (var0 == 5003) {
                    class56.field597 -= 2;
                    var8 = field1988[class56.field597];
                    var9 = field1988[1 + class56.field597];
                    var6 = class157.method735(var8, var9);
                    if (null != var6) {
                        field1988[++class56.field597 - 1] = var6.field2954;
                        field1988[++class56.field597 - 1] = var6.field2950;
                        field1975[++class228.field1787 - 1] = null != var6.field2952 ? var6.field2952 : "";
                        field1975[++class228.field1787 - 1] = var6.field2956 != null ? var6.field2956 : "";
                        field1975[++class228.field1787 - 1] = var6.field2957 != null ? var6.field2957 : "";
                        field1988[++class56.field597 - 1] = var6.method1979() ? 1 : (var6.method1977() ? 2 : 0);
                    } else {
                        field1988[++class56.field597 - 1] = -1;
                        field1988[++class56.field597 - 1] = 0;
                        field1975[++class228.field1787 - 1] = "";
                        field1975[++class228.field1787 - 1] = "";
                        field1975[++class228.field1787 - 1] = "";
                        field1988[++class56.field597 - 1] = 0;
                    }

                    return 1;
                } else {
                    class434 var5;
                    if (var0 == 5004) {
                        var8 = field1988[--class56.field597];
                        var5 = class157.method730(var8);
                        if (var5 != null) {
                            field1988[++class56.field597 - 1] = var5.field2951;
                            field1988[++class56.field597 - 1] = var5.field2950;
                            field1975[++class228.field1787 - 1] = null != var5.field2952 ? var5.field2952 : "";
                            field1975[++class228.field1787 - 1] = null != var5.field2956 ? var5.field2956 : "";
                            field1975[++class228.field1787 - 1] = null != var5.field2957 ? var5.field2957 : "";
                            field1988[++class56.field597 - 1] = var5.method1979() ? 1 : (var5.method1977() ? 2 : 0);
                        } else {
                            field1988[++class56.field597 - 1] = -1;
                            field1988[++class56.field597 - 1] = 0;
                            field1975[++class228.field1787 - 1] = "";
                            field1975[++class228.field1787 - 1] = "";
                            field1975[++class228.field1787 - 1] = "";
                            field1988[++class56.field597 - 1] = 0;
                        }

                        return 1;
                    } else if (var0 == 5005) {
                        if (null == class410.field2896) {
                            field1988[++class56.field597 - 1] = -1;
                        } else {
                            field1988[++class56.field597 - 1] = class410.field2896.field2932;
                        }

                        return 1;
                    } else {
                        class46 var12;
                        if (var0 == 5008) {
                            var4 = field1975[--class228.field1787];
                            var9 = field1988[--class56.field597];
                            var12 = class450.method2078(var9, var4, class404.field2860, -1);
                            Client.field3840.method1359(var12);
                            return 1;
                        } else if (var0 == 5009) {
                            class228.field1787 -= 2;
                            var4 = field1975[class228.field1787];
                            String var10 = field1975[class228.field1787 + 1];
                            var12 = class46.method134(class488.field3582, Client.field3840.field2238);
                            var12.field541.method290(0);
                            int var13 = var12.field541.field697;
                            var12.field541.method252(var4);
                            class385.method1781(var12.field541, var10);
                            var12.field541.method257(var12.field541.field697 - var13);
                            Client.field3840.method1359(var12);
                            return 1;
                        } else if (var0 == 5010) {
                            var4 = field1975[--class228.field1787];
                            class56.field597 -= 2;
                            var9 = field1988[class56.field597];
                            var11 = field1988[class56.field597 + 1];
                            var7 = class450.method2078(var9, var4, class404.field2860, var11);
                            Client.field3840.method1359(var7);
                            return 1;
                        } else if (var0 != 5015) {
                            if (var0 == 5016) {
                                field1988[++class56.field597 - 1] = Client.field4009;
                                return 1;
                            } else if (var0 == 5017) {
                                var8 = field1988[--class56.field597];
                                field1988[++class56.field597 - 1] = class157.method733(var8);
                                return 1;
                            } else if (var0 == 5018) {
                                var8 = field1988[--class56.field597];
                                field1988[++class56.field597 - 1] = class157.method734(var8);
                                return 1;
                            } else if (var0 == 5019) {
                                var8 = field1988[--class56.field597];
                                field1988[++class56.field597 - 1] = class157.method732(var8);
                                return 1;
                            } else if (var0 == 5020) {
                                var4 = field1975[--class228.field1787];
                                class496.method2247(var4);
                                return 1;
                            } else if (var0 == 5021) {
                                Client.field3803 = field1975[--class228.field1787].toLowerCase().trim();
                                return 1;
                            } else if (var0 == 5022) {
                                field1975[++class228.field1787 - 1] = Client.field3803;
                                return 1;
                            } else if (var0 == 5023) {
                                var4 = field1975[--class228.field1787];
                                System.out.println(var4);
                                return 1;
                            } else if (var0 == 5030) {
                                class56.field597 -= 2;
                                var8 = field1988[class56.field597];
                                var9 = field1988[class56.field597 + 1];
                                var6 = class157.method735(var8, var9);
                                if (var6 != null) {
                                    field1988[++class56.field597 - 1] = var6.field2954;
                                    field1988[++class56.field597 - 1] = var6.field2950;
                                    field1975[++class228.field1787 - 1] = var6.field2952 != null ? var6.field2952 : "";
                                    field1975[++class228.field1787 - 1] = var6.field2956 != null ? var6.field2956 : "";
                                    field1975[++class228.field1787 - 1] = null != var6.field2957 ? var6.field2957 : "";
                                    field1988[++class56.field597 - 1] = var6.method1979() ? 1 : (var6.method1977() ? 2 : 0);
                                    field1975[++class228.field1787 - 1] = "";
                                    field1988[++class56.field597 - 1] = 0;
                                } else {
                                    field1988[++class56.field597 - 1] = -1;
                                    field1988[++class56.field597 - 1] = 0;
                                    field1975[++class228.field1787 - 1] = "";
                                    field1975[++class228.field1787 - 1] = "";
                                    field1975[++class228.field1787 - 1] = "";
                                    field1988[++class56.field597 - 1] = 0;
                                    field1975[++class228.field1787 - 1] = "";
                                    field1988[++class56.field597 - 1] = 0;
                                }

                                return 1;
                            } else if (var0 == 5031) {
                                var8 = field1988[--class56.field597];
                                var5 = class157.method730(var8);
                                if (var5 != null) {
                                    field1988[++class56.field597 - 1] = var5.field2951;
                                    field1988[++class56.field597 - 1] = var5.field2950;
                                    field1975[++class228.field1787 - 1] = null != var5.field2952 ? var5.field2952 : "";
                                    field1975[++class228.field1787 - 1] = var5.field2956 != null ? var5.field2956 : "";
                                    field1975[++class228.field1787 - 1] = null != var5.field2957 ? var5.field2957 : "";
                                    field1988[++class56.field597 - 1] = var5.method1979() ? 1 : (var5.method1977() ? 2 : 0);
                                    field1975[++class228.field1787 - 1] = "";
                                    field1988[++class56.field597 - 1] = 0;
                                } else {
                                    field1988[++class56.field597 - 1] = -1;
                                    field1988[++class56.field597 - 1] = 0;
                                    field1975[++class228.field1787 - 1] = "";
                                    field1975[++class228.field1787 - 1] = "";
                                    field1975[++class228.field1787 - 1] = "";
                                    field1988[++class56.field597 - 1] = 0;
                                    field1975[++class228.field1787 - 1] = "";
                                    field1988[++class56.field597 - 1] = 0;
                                }

                                return 1;
                            } else {
                                return 2;
                            }
                        } else {
                            if (null != class180.field1528 && null != class180.field1528.field2070) {
                                var4 = class180.field1528.field2070.method1706();
                            } else {
                                var4 = "";
                            }

                            field1975[++class228.field1787 - 1] = var4;
                            return 1;
                        }
                    }
                }
            }
        }
    }

    static int method1189(int var0, class443 var1, boolean var2) {
        if (var0 == 5306) {
            field1988[++class56.field597 - 1] = Client.method2423();
            return 1;
        } else {
            int var4;
            if (var0 == 5307) {
                var4 = field1988[--class56.field597];
                if (var4 == 1 || var4 == 2) {
                    class288.method1303(var4);
                }

                return 1;
            } else if (var0 == 5308) {
                field1988[++class56.field597 - 1] = class290.field2121.method2543();
                return 1;
            } else if (var0 != 5309) {
                if (var0 == 5310) {
                    --class56.field597;
                    return 1;
                } else {
                    return 2;
                }
            } else {
                var4 = field1988[--class56.field597];
                if (var4 == 1 || var4 == 2) {
                    class290.field2121.method2542(var4);
                }

                return 1;
            }
        }
    }

    static int method1210(int var0, class443 var1, boolean var2) {
        int var4;
        if (var0 == 5504) {
            class56.field597 -= 2;
            var4 = field1988[class56.field597];
            int var5 = field1988[class56.field597 + 1];
            if (!Client.field4036) {
                Client.field3814 = var4;
                Client.field3953 = var5;
            }

            return 1;
        } else if (var0 == 5505) {
            field1988[++class56.field597 - 1] = Client.field3814;
            return 1;
        } else if (var0 == 5506) {
            field1988[++class56.field597 - 1] = Client.field3953;
            return 1;
        } else if (var0 == 5530) {
            var4 = field1988[--class56.field597];
            if (var4 < 0) {
                var4 = 0;
            }

            Client.field3869 = var4;
            return 1;
        } else if (var0 == 5531) {
            field1988[++class56.field597 - 1] = Client.field3869;
            return 1;
        } else {
            return 2;
        }
    }

    static int method1160(int var0, class443 var1, boolean var2) {
        if (var0 == 5630) {
            Client.field3828 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    static int method1182(int var0) {
        return (int) Math.pow(2.0D, 7.0F + (float) var0 / 256.0F);
    }

    static int method1201(int var0) {
        return (int) ((Math.log(var0) / field1987 - 7.0D) * 256.0D);
    }

    static int method1183(int var0, class443 var1, boolean var2) {
        if (var0 == 6500) {
            field1988[++class56.field597 - 1] = class137.method633() ? 1 : 0;
            return 1;
        } else {
            class137 var9;
            if (var0 == 6501) {
                var9 = class137.method630();
                if (var9 != null) {
                    field1988[++class56.field597 - 1] = var9.field1214;
                    field1988[++class56.field597 - 1] = var9.field1210;
                    field1975[++class228.field1787 - 1] = var9.field1218;
                    field1988[++class56.field597 - 1] = var9.field1219;
                    field1988[++class56.field597 - 1] = var9.field1216;
                    field1975[++class228.field1787 - 1] = var9.field1217;
                } else {
                    field1988[++class56.field597 - 1] = -1;
                    field1988[++class56.field597 - 1] = 0;
                    field1975[++class228.field1787 - 1] = "";
                    field1988[++class56.field597 - 1] = 0;
                    field1988[++class56.field597 - 1] = 0;
                    field1975[++class228.field1787 - 1] = "";
                }

                return 1;
            } else if (var0 == 6502) {
                var9 = class137.method637();
                if (var9 != null) {
                    field1988[++class56.field597 - 1] = var9.field1214;
                    field1988[++class56.field597 - 1] = var9.field1210;
                    field1975[++class228.field1787 - 1] = var9.field1218;
                    field1988[++class56.field597 - 1] = var9.field1219;
                    field1988[++class56.field597 - 1] = var9.field1216;
                    field1975[++class228.field1787 - 1] = var9.field1217;
                } else {
                    field1988[++class56.field597 - 1] = -1;
                    field1988[++class56.field597 - 1] = 0;
                    field1975[++class228.field1787 - 1] = "";
                    field1988[++class56.field597 - 1] = 0;
                    field1988[++class56.field597 - 1] = 0;
                    field1975[++class228.field1787 - 1] = "";
                }

                return 1;
            } else {
                int var4;
                class137 var5;
                int var11;
                if (var0 == 6506) {
                    var4 = field1988[--class56.field597];
                    var5 = null;

                    for (var11 = 0; var11 < class137.field1215; ++var11) {
                        if (var4 == class521.field4197[var11].field1214) {
                            var5 = class521.field4197[var11];
                            break;
                        }
                    }

                    if (var5 != null) {
                        field1988[++class56.field597 - 1] = var5.field1214;
                        field1988[++class56.field597 - 1] = var5.field1210;
                        field1975[++class228.field1787 - 1] = var5.field1218;
                        field1988[++class56.field597 - 1] = var5.field1219;
                        field1988[++class56.field597 - 1] = var5.field1216;
                        field1975[++class228.field1787 - 1] = var5.field1217;
                    } else {
                        field1988[++class56.field597 - 1] = -1;
                        field1988[++class56.field597 - 1] = 0;
                        field1975[++class228.field1787 - 1] = "";
                        field1988[++class56.field597 - 1] = 0;
                        field1988[++class56.field597 - 1] = 0;
                        field1975[++class228.field1787 - 1] = "";
                    }

                    return 1;
                } else if (var0 == 6507) {
                    class56.field597 -= 4;
                    var4 = field1988[class56.field597];
                    boolean var10 = field1988[class56.field597 + 1] == 1;
                    var11 = field1988[class56.field597 + 2];
                    boolean var7 = field1988[class56.field597 + 3] == 1;
                    class137.method635(var4, var10, var11, var7);
                    return 1;
                } else if (var0 != 6511) {
                    if (var0 == 6512) {
                        Client.field3933 = field1988[--class56.field597] == 1;
                        return 1;
                    } else {
                        class243 var6;
                        int var8;
                        if (var0 == 6513) {
                            class56.field597 -= 2;
                            var4 = field1988[class56.field597];
                            var8 = field1988[1 + class56.field597];
                            var6 = class243.method1090(var8);
                            if (var6.method1087()) {
                                field1975[++class228.field1787 - 1] = class345.method1635(var4).method1632(var8, var6.field1858);
                            } else {
                                field1988[++class56.field597 - 1] = class345.method1635(var4).method1634(var8, var6.field1854);
                            }

                            return 1;
                        } else if (var0 == 6514) {
                            class56.field597 -= 2;
                            var4 = field1988[class56.field597];
                            var8 = field1988[class56.field597 + 1];
                            var6 = class243.method1090(var8);
                            if (var6.method1087()) {
                                field1975[++class228.field1787 - 1] = class192.method892(var4, (byte) -25).method1348(var8, var6.field1858);
                            } else {
                                field1988[++class56.field597 - 1] = class192.method892(var4, (byte) 32).method1347(var8, var6.field1854);
                            }

                            return 1;
                        } else if (var0 == 6515) {
                            class56.field597 -= 2;
                            var4 = field1988[class56.field597];
                            var8 = field1988[1 + class56.field597];
                            var6 = class243.method1090(var8);
                            if (var6.method1087()) {
                                field1975[++class228.field1787 - 1] = class508.method2299(var4).method2281(var8, var6.field1858);
                            } else {
                                field1988[++class56.field597 - 1] = class508.method2299(var4).method2290(var8, var6.field1854);
                            }

                            return 1;
                        } else if (var0 == 6516) {
                            class56.field597 -= 2;
                            var4 = field1988[class56.field597];
                            var8 = field1988[1 + class56.field597];
                            var6 = class243.method1090(var8);
                            if (var6.method1087()) {
                                field1975[++class228.field1787 - 1] = class86.method344(var4).method342(var8, var6.field1858);
                            } else {
                                field1988[++class56.field597 - 1] = class86.method344(var4).method341(var8, var6.field1854);
                            }

                            return 1;
                        } else if (var0 == 6518) {
                            field1988[++class56.field597 - 1] = Client.field4010 ? 1 : 0;
                            return 1;
                        } else if (var0 == 6519) {
                            field1988[++class56.field597 - 1] = Client.field3781;
                            return 1;
                        } else if (var0 == 6520) {
                            return 1;
                        } else if (var0 == 6521) {
                            return 1;
                        } else if (var0 == 6522) {
                            --class228.field1787;
                            --class56.field597;
                            return 1;
                        } else if (var0 == 6523) {
                            --class228.field1787;
                            --class56.field597;
                            return 1;
                        } else if (var0 == 6524) {
                            field1988[++class56.field597 - 1] = -1;
                            return 1;
                        } else if (var0 == 6525) {
                            field1988[++class56.field597 - 1] = 1;
                            return 1;
                        } else if (var0 == 6526) {
                            field1988[++class56.field597 - 1] = 1;
                            return 1;
                        } else if (var0 == 6527) {
                            field1988[++class56.field597 - 1] = Client.field3793;
                            return 1;
                        } else {
                            return 2;
                        }
                    }
                } else {
                    var4 = field1988[--class56.field597];
                    if (var4 >= 0 && var4 < class137.field1215) {
                        var5 = class521.field4197[var4];
                        field1988[++class56.field597 - 1] = var5.field1214;
                        field1988[++class56.field597 - 1] = var5.field1210;
                        field1975[++class228.field1787 - 1] = var5.field1218;
                        field1988[++class56.field597 - 1] = var5.field1219;
                        field1988[++class56.field597 - 1] = var5.field1216;
                        field1975[++class228.field1787 - 1] = var5.field1217;
                    } else {
                        field1988[++class56.field597 - 1] = -1;
                        field1988[++class56.field597 - 1] = 0;
                        field1975[++class228.field1787 - 1] = "";
                        field1988[++class56.field597 - 1] = 0;
                        field1988[++class56.field597 - 1] = 0;
                        field1975[++class228.field1787 - 1] = "";
                    }

                    return 1;
                }
            }
        }
    }

    static int method1161(int var0, class443 var1, boolean var2) {
        int var4;
        if (var0 == 6600) {
            var4 = class201.field1651;
            int var17 = class357.field2573 + (class180.field1528.field4121 >> 7);
            int var13 = (class180.field1528.field4092 >> 7) + class5.field28;
            Client.method2426().method437(var4, var17, var13, true);
            return 1;
        } else {
            class387 var8;
            if (var0 == 6601) {
                var4 = field1988[--class56.field597];
                String var16 = "";
                var8 = Client.method2426().method476(var4);
                if (var8 != null) {
                    var16 = var8.method1790();
                }

                field1975[++class228.field1787 - 1] = var16;
                return 1;
            } else if (var0 == 6602) {
                var4 = field1988[--class56.field597];
                Client.method2426().method441(var4);
                return 1;
            } else if (var0 == 6603) {
                field1988[++class56.field597 - 1] = Client.method2426().method452();
                return 1;
            } else if (var0 == 6604) {
                var4 = field1988[--class56.field597];
                Client.method2426().method450(var4);
                return 1;
            } else if (var0 == 6605) {
                field1988[++class56.field597 - 1] = Client.method2426().method482() ? 1 : 0;
                return 1;
            } else {
                class258 var15;
                if (var0 == 6606) {
                    var15 = new class258(field1988[--class56.field597]);
                    Client.method2426().method454(var15.field1929, var15.field1931);
                    return 1;
                } else if (var0 == 6607) {
                    var15 = new class258(field1988[--class56.field597]);
                    Client.method2426().method455(var15.field1929, var15.field1931);
                    return 1;
                } else if (var0 == 6608) {
                    var15 = new class258(field1988[--class56.field597]);
                    Client.method2426().method456(var15.field1930, var15.field1929, var15.field1931);
                    return 1;
                } else if (var0 == 6609) {
                    var15 = new class258(field1988[--class56.field597]);
                    Client.method2426().method457(var15.field1930, var15.field1929, var15.field1931);
                    return 1;
                } else if (var0 == 6610) {
                    field1988[++class56.field597 - 1] = Client.method2426().method458();
                    field1988[++class56.field597 - 1] = Client.method2426().method481();
                    return 1;
                } else {
                    class387 var12;
                    if (var0 == 6611) {
                        var4 = field1988[--class56.field597];
                        var12 = Client.method2426().method476(var4);
                        if (var12 == null) {
                            field1988[++class56.field597 - 1] = 0;
                        } else {
                            field1988[++class56.field597 - 1] = var12.method1798().method1144();
                        }

                        return 1;
                    } else if (var0 == 6612) {
                        var4 = field1988[--class56.field597];
                        var12 = Client.method2426().method476(var4);
                        if (null == var12) {
                            field1988[++class56.field597 - 1] = 0;
                            field1988[++class56.field597 - 1] = 0;
                        } else {
                            field1988[++class56.field597 - 1] = (var12.method1804() - var12.method1793() + 1) * 64;
                            field1988[++class56.field597 - 1] = (var12.method1800() - var12.method1802() + 1) * 64;
                        }

                        return 1;
                    } else if (var0 == 6613) {
                        var4 = field1988[--class56.field597];
                        var12 = Client.method2426().method476(var4);
                        if (var12 == null) {
                            field1988[++class56.field597 - 1] = 0;
                            field1988[++class56.field597 - 1] = 0;
                            field1988[++class56.field597 - 1] = 0;
                            field1988[++class56.field597 - 1] = 0;
                        } else {
                            field1988[++class56.field597 - 1] = var12.method1793() * 64;
                            field1988[++class56.field597 - 1] = var12.method1802() * 64;
                            field1988[++class56.field597 - 1] = var12.method1804() * 64 + 64 - 1;
                            field1988[++class56.field597 - 1] = var12.method1800() * 64 + 64 - 1;
                        }

                        return 1;
                    } else if (var0 == 6614) {
                        var4 = field1988[--class56.field597];
                        var12 = Client.method2426().method476(var4);
                        if (null == var12) {
                            field1988[++class56.field597 - 1] = -1;
                        } else {
                            field1988[++class56.field597 - 1] = var12.method1792();
                        }

                        return 1;
                    } else if (var0 == 6615) {
                        var15 = Client.method2426().method438();
                        if (null == var15) {
                            field1988[++class56.field597 - 1] = -1;
                            field1988[++class56.field597 - 1] = -1;
                        } else {
                            field1988[++class56.field597 - 1] = var15.field1929;
                            field1988[++class56.field597 - 1] = var15.field1931;
                        }

                        return 1;
                    } else if (var0 == 6616) {
                        field1988[++class56.field597 - 1] = Client.method2426().method442();
                        return 1;
                    } else if (var0 == 6617) {
                        var15 = new class258(field1988[--class56.field597]);
                        var12 = Client.method2426().method443();
                        if (null == var12) {
                            field1988[++class56.field597 - 1] = -1;
                            field1988[++class56.field597 - 1] = -1;
                            return 1;
                        } else {
                            int[] var11 = var12.method1799(var15.field1930, var15.field1929, var15.field1931);
                            if (var11 == null) {
                                field1988[++class56.field597 - 1] = -1;
                                field1988[++class56.field597 - 1] = -1;
                            } else {
                                field1988[++class56.field597 - 1] = var11[0];
                                field1988[++class56.field597 - 1] = var11[1];
                            }

                            return 1;
                        }
                    } else {
                        class258 var6;
                        if (var0 == 6618) {
                            var15 = new class258(field1988[--class56.field597]);
                            var12 = Client.method2426().method443();
                            if (var12 == null) {
                                field1988[++class56.field597 - 1] = -1;
                                field1988[++class56.field597 - 1] = -1;
                                return 1;
                            } else {
                                var6 = var12.method1787(var15.field1929, var15.field1931);
                                if (var6 == null) {
                                    field1988[++class56.field597 - 1] = -1;
                                } else {
                                    field1988[++class56.field597 - 1] = var6.method1144();
                                }

                                return 1;
                            }
                        } else {
                            class258 var9;
                            if (var0 == 6619) {
                                class56.field597 -= 2;
                                var4 = field1988[class56.field597];
                                var9 = new class258(field1988[1 + class56.field597]);
                                class173.method822(var4, var9, false);
                                return 1;
                            } else if (var0 == 6620) {
                                class56.field597 -= 2;
                                var4 = field1988[class56.field597];
                                var9 = new class258(field1988[1 + class56.field597]);
                                class173.method822(var4, var9, true);
                                return 1;
                            } else if (var0 == 6621) {
                                class56.field597 -= 2;
                                var4 = field1988[class56.field597];
                                var9 = new class258(field1988[class56.field597 + 1]);
                                var8 = Client.method2426().method476(var4);
                                if (null == var8) {
                                    field1988[++class56.field597 - 1] = 0;
                                    return 1;
                                } else {
                                    field1988[++class56.field597 - 1] = var8.method1786(var9.field1930, var9.field1929, var9.field1931) ? 1 : 0;
                                    return 1;
                                }
                            } else if (var0 == 6622) {
                                field1988[++class56.field597 - 1] = Client.method2426().method460();
                                field1988[++class56.field597 - 1] = Client.method2426().method461();
                                return 1;
                            } else if (var0 == 6623) {
                                var15 = new class258(field1988[--class56.field597]);
                                var12 = Client.method2426().method439(var15.field1930, var15.field1929, var15.field1931);
                                if (null == var12) {
                                    field1988[++class56.field597 - 1] = -1;
                                } else {
                                    field1988[++class56.field597 - 1] = var12.method1795();
                                }

                                return 1;
                            } else if (var0 == 6624) {
                                Client.method2426().method462(field1988[--class56.field597]);
                                return 1;
                            } else if (var0 == 6625) {
                                Client.method2426().method463();
                                return 1;
                            } else if (var0 == 6626) {
                                Client.method2426().method464(field1988[--class56.field597]);
                                return 1;
                            } else if (var0 == 6627) {
                                Client.method2426().method465();
                                return 1;
                            } else {
                                boolean var14;
                                if (var0 == 6628) {
                                    var14 = field1988[--class56.field597] == 1;
                                    Client.method2426().method466(var14);
                                    return 1;
                                } else if (var0 == 6629) {
                                    var4 = field1988[--class56.field597];
                                    Client.method2426().method448(var4);
                                    return 1;
                                } else if (var0 == 6630) {
                                    var4 = field1988[--class56.field597];
                                    Client.method2426().method467(var4);
                                    return 1;
                                } else if (var0 == 6631) {
                                    Client.method2426().method468();
                                    return 1;
                                } else if (var0 == 6632) {
                                    var14 = field1988[--class56.field597] == 1;
                                    Client.method2426().method469(var14);
                                    return 1;
                                } else {
                                    boolean var10;
                                    if (var0 == 6633) {
                                        class56.field597 -= 2;
                                        var4 = field1988[class56.field597];
                                        var10 = field1988[class56.field597 + 1] == 1;
                                        Client.method2426().method477(var4, var10);
                                        return 1;
                                    } else if (var0 == 6634) {
                                        class56.field597 -= 2;
                                        var4 = field1988[class56.field597];
                                        var10 = field1988[class56.field597 + 1] == 1;
                                        Client.method2426().method440(var4, var10);
                                        return 1;
                                    } else if (var0 == 6635) {
                                        field1988[++class56.field597 - 1] = Client.method2426().method470() ? 1 : 0;
                                        return 1;
                                    } else if (var0 == 6636) {
                                        var4 = field1988[--class56.field597];
                                        field1988[++class56.field597 - 1] = Client.method2426().method486(var4) ? 1 : 0;
                                        return 1;
                                    } else if (var0 == 6637) {
                                        var4 = field1988[--class56.field597];
                                        field1988[++class56.field597 - 1] = Client.method2426().method471(var4) ? 1 : 0;
                                        return 1;
                                    } else if (var0 == 6638) {
                                        class56.field597 -= 2;
                                        var4 = field1988[class56.field597];
                                        var9 = new class258(field1988[1 + class56.field597]);
                                        var6 = Client.method2426().method474(var4, var9);
                                        if (null == var6) {
                                            field1988[++class56.field597 - 1] = -1;
                                        } else {
                                            field1988[++class56.field597 - 1] = var6.method1144();
                                        }

                                        return 1;
                                    } else {
                                        class369 var7;
                                        if (var0 == 6639) {
                                            var7 = Client.method2426().method433();
                                            if (null == var7) {
                                                field1988[++class56.field597 - 1] = -1;
                                                field1988[++class56.field597 - 1] = -1;
                                            } else {
                                                field1988[++class56.field597 - 1] = var7.method1743();
                                                field1988[++class56.field597 - 1] = var7.field2637.method1144();
                                            }

                                            return 1;
                                        } else if (var0 == 6640) {
                                            var7 = Client.method2426().method475();
                                            if (null == var7) {
                                                field1988[++class56.field597 - 1] = -1;
                                                field1988[++class56.field597 - 1] = -1;
                                            } else {
                                                field1988[++class56.field597 - 1] = var7.method1743();
                                                field1988[++class56.field597 - 1] = var7.field2637.method1144();
                                            }

                                            return 1;
                                        } else {
                                            class192 var5;
                                            if (var0 == 6693) {
                                                var4 = field1988[--class56.field597];
                                                var5 = class192.method893(var4);
                                                if (null == var5.field1561) {
                                                    field1975[++class228.field1787 - 1] = "";
                                                } else {
                                                    field1975[++class228.field1787 - 1] = var5.field1561;
                                                }

                                                return 1;
                                            } else if (var0 == 6694) {
                                                var4 = field1988[--class56.field597];
                                                var5 = class192.method893(var4);
                                                field1988[++class56.field597 - 1] = var5.field1563;
                                                return 1;
                                            } else if (var0 == 6695) {
                                                var4 = field1988[--class56.field597];
                                                var5 = class192.method893(var4);
                                                if (var5 == null) {
                                                    field1988[++class56.field597 - 1] = -1;
                                                } else {
                                                    field1988[++class56.field597 - 1] = var5.field1576;
                                                }

                                                return 1;
                                            } else if (var0 == 6696) {
                                                var4 = field1988[--class56.field597];
                                                var5 = class192.method893(var4);
                                                if (var5 == null) {
                                                    field1988[++class56.field597 - 1] = -1;
                                                } else {
                                                    field1988[++class56.field597 - 1] = var5.field1559;
                                                }

                                                return 1;
                                            } else if (var0 == 6697) {
                                                field1988[++class56.field597 - 1] = class29.field162.field63;
                                                return 1;
                                            } else if (var0 == 6698) {
                                                field1988[++class56.field597 - 1] = class29.field162.field61.method1144();
                                                return 1;
                                            } else if (var0 == 6699) {
                                                field1988[++class56.field597 - 1] = class29.field162.field62.method1144();
                                                return 1;
                                            } else {
                                                return 2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static int method1176(int var0, class443 var1, boolean var2) {
        if (var0 == 6754) {
            int var6 = field1988[--class56.field597];
            class345 var7 = class345.method1635(var6);
            field1975[++class228.field1787 - 1] = null != var7 ? var7.field2475 : "";
            return 1;
        } else {
            class345 var4;
            if (var0 == 6764) {
                class56.field597 -= 2;
                var4 = class345.method1635(field1988[class56.field597]);
                int var5 = field1988[class56.field597 + 1];
                field1988[++class56.field597 - 1] = var4.method1626(var5);
                field1988[++class56.field597 - 1] = var4.method1631(var5);
                return 1;
            } else if (var0 == 6765) {
                var4 = class345.method1635(field1988[--class56.field597]);
                field1988[++class56.field597 - 1] = null != var4 ? var4.field2499 : 0;
                return 1;
            } else {
                return 2;
            }
        }
    }

    static int method1191(int var0, class443 var1, boolean var2) {
        if (var0 == 6809) {
            int var4 = field1988[--class56.field597];
            class304 var5 = class192.method892(var4, (byte) 104);
            field1975[++class228.field1787 - 1] = null != var5 ? var5.field2185 : "";
            return 1;
        } else {
            return 2;
        }
    }

    static int method1170(int var0, class443 var1, boolean var2) {
        return 2;
    }

    static int method1164(int var0, class443 var1, boolean var2) {
        return 2;
    }

    static int method1179(int var0, class443 var1, boolean var2) {
        if (var0 == 7108) {
            field1988[++class56.field597 - 1] = Client.method2486() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    static int method1186(int var0, class443 var1, boolean var2) {
        return 2;
    }

    static int method1166(int var0, class443 var1, boolean var2) {
        int var4;
        Object var5;
        int var6;
        class436 var7;
        int var8;
        if (var0 != 7500 && var0 != 7508) {
            if (var0 != 7501) {
                int var21;
                int var23;
                if (var0 == 7502) {
                    class56.field597 -= 3;
                    var4 = field1988[class56.field597];
                    var21 = field1988[1 + class56.field597];
                    var6 = field1988[class56.field597 + 2];
                    var23 = class497.method2249(var21);
                    var8 = class497.method2250(var21);
                    int var25 = class497.method2251(var21);
                    class148 var26 = class148.method713(var4);
                    class48 var27 = class48.method138(var23);
                    int[] var28 = var27.field546[var8];
                    int var13 = 0;
                    int var14 = var28.length;
                    if (var25 >= 0) {
                        if (var25 >= var14) {
                            throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var25 + ", Max: " + var14);
                        }

                        var13 = var25;
                        var14 = var25 + 1;
                    }

                    Object[] var15 = var26.method710(var8);
                    if (null == var15 && null != var27.field547) {
                        var15 = var27.field547[var8];
                    }

                    int var16;
                    int var17;
                    if (null == var15) {
                        for (var16 = var13; var16 < var14; ++var16) {
                            var17 = var28[var16];
                            class432 var29 = class406.method1856(var17);
                            if (var29 == class432.field2937) {
                                field1975[++class228.field1787 - 1] = "";
                            } else {
                                field1988[++class56.field597 - 1] = class406.method1855(var17);
                            }
                        }

                        return 1;
                    } else {
                        var16 = var15.length / var28.length;
                        if (var6 >= 0 && var6 < var16) {
                            for (var17 = var13; var17 < var14; ++var17) {
                                int var18 = var17 + var28.length * var6;
                                class432 var19 = class406.method1856(var28[var17]);
                                if (var19 == class432.field2937) {
                                    field1975[++class228.field1787 - 1] = (String) var15[var18];
                                } else {
                                    field1988[++class56.field597 - 1] = (Integer) var15[var18];
                                }
                            }

                            return 1;
                        } else {
                            throw new RuntimeException();
                        }
                    }
                } else if (var0 == 7503) {
                    class56.field597 -= 2;
                    var4 = field1988[class56.field597];
                    var21 = field1988[1 + class56.field597];
                    var6 = 0;
                    var23 = class497.method2249(var21);
                    var8 = class497.method2250(var21);
                    class148 var24 = class148.method713(var4);
                    class48 var10 = class48.method138(var23);
                    int[] var11 = var10.field546[var8];
                    Object[] var12 = var24.method710(var8);
                    if (null == var12 && null != var10.field547) {
                        var12 = var10.field547[var8];
                    }

                    if (null != var12) {
                        var6 = var12.length / var11.length;
                    }

                    field1988[++class56.field597 - 1] = var6;
                    return 1;
                } else if (var0 != 7504 && var0 != 7510) {
                    if (var0 == 7505) {
                        var4 = field1988[--class56.field597];
                        class148 var22 = class148.method713(var4);
                        field1988[++class56.field597 - 1] = var22.field1304;
                        return 1;
                    } else if (var0 == 7506) {
                        var4 = field1988[--class56.field597];
                        var21 = -1;
                        if (null != class102.field1004 && var4 >= 0 && var4 < class102.field1004.size()) {
                            var21 = class102.field1004.get(var4);
                        }

                        field1988[++class56.field597 - 1] = var21;
                        return 1;
                    } else if (var0 != 7507 && var0 != 7509) {
                        return 2;
                    } else {
                        var4 = field1988[--class56.field597];
                        var5 = method1194(var4);
                        var6 = field1988[--class56.field597];
                        var7 = Client.method2466(var6);
                        if (var7 == null) {
                            throw new RuntimeException();
                        } else if (class497.method2249(var6) != Client.field4069) {
                            throw new RuntimeException();
                        } else if (null == class102.field1004 && class102.field1004.isEmpty()) {
                            throw new RuntimeException();
                        } else {
                            var8 = class497.method2251(var6);
                            List<Integer> var9 = var7.method2004(var5, var8);
                            class102.field1004 = new LinkedList<>(class102.field1004);
                            if (var9 != null) {
                                class102.field1004.retainAll(var9);
                            } else {
                                class102.field1004.clear();
                            }

                            class107.field1033 = class102.field1004.iterator();
                            if (var0 == 7507) {
                                field1988[++class56.field597 - 1] = class102.field1004.size();
                            }

                            return 1;
                        }
                    }
                } else {
                    --class56.field597;
                    var4 = field1988[class56.field597];
                    class436 var20 = Client.method2485(var4);
                    if (var20 == null) {
                        throw new RuntimeException();
                    } else {
                        class102.field1004 = var20.method2004(0, 0);
                        var6 = 0;
                        if (class102.field1004 != null) {
                            Client.field4069 = var4;
                            class107.field1033 = class102.field1004.iterator();
                            var6 = class102.field1004.size();
                        }

                        if (var0 == 7504) {
                            field1988[++class56.field597 - 1] = var6;
                        }

                        return 1;
                    }
                }
            } else {
                if (class107.field1033 != null && class107.field1033.hasNext()) {
                    field1988[++class56.field597 - 1] = class107.field1033.next();
                } else {
                    field1988[++class56.field597 - 1] = -1;
                }

                return 1;
            }
        } else {
            var4 = field1988[--class56.field597];
            var5 = method1194(var4);
            var6 = field1988[--class56.field597];
            var7 = Client.method2466(var6);
            if (null == var7) {
                throw new RuntimeException();
            } else {
                var8 = class497.method2251(var6);
                class102.field1004 = var7.method2004(var5, var8);
                if (null != class102.field1004) {
                    Client.field4069 = class497.method2249(var6);
                    class107.field1033 = class102.field1004.iterator();
                    if (var0 == 7500) {
                        field1988[++class56.field597 - 1] = class102.field1004.size();
                    }
                } else {
                    Client.field4069 = -1;
                    class107.field1033 = null;
                    if (var0 == 7500) {
                        field1988[++class56.field597 - 1] = 0;
                    }
                }

                return 1;
            }
        }
    }

    static int method1187(int var0, class443 var1, boolean var2) {
        return 2;
    }

    static int method1192(int var0, class443 var1, boolean var2) {
        int var4;
        int var5;
        if (var0 == 8000) {
            --class56.field597;
            var4 = field1988[class56.field597];
            var5 = field1977[var4];
            class240.method1074(field1979[var4], new int[var5], 0, var5 - 1);
            return 1;
        } else if (var0 == 8001) {
            class56.field597 -= 3;
            var4 = field1988[class56.field597];
            var5 = field1988[1 + class56.field597];
            int var6 = field1988[2 + class56.field597];
            int var7 = field1977[var4];
            if (var7 <= 1) {
                return 1;
            } else {
                class292.method1316(field1979[var4], var7, var5, var6);
                return 1;
            }
        } else {
            return 2;
        }
    }

    static void method1193(int var0) {
        if (var0 != -1) {
            if (class97.method428(var0)) {
                class97[] var2 = class46.field542[var0];

                for (int var3 = 0; var3 < var2.length; ++var3) {
                    class97 var4 = var2[var3];
                    if (null != var4.field875) {
                        class26 var5 = new class26();
                        var5.field138 = var4;
                        var5.field141 = var4.field875;
                        class424.method1963(var5, 5000000, 0);
                    }
                }

            }
        }
    }

    static Object method1190(class432 var0) {
        if (var0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        } else {
            switch (var0.field2938) {
                case 1:
                    return field1988[--class56.field597];
                case 2:
                    return field1975[--class228.field1787];
                default:
                    throw new IllegalStateException("popValueOfType() failure - unsupported type");
            }
        }
    }

    static Object method1194(int var0) {
        return method1190((class432) class27.method80(class432.method1972(), var0));
    }
}
