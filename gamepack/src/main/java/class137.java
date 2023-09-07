import java.net.URL;

public class class137 {
    static int field1211;
    static int field1215;
    static int[] field1212;
    static int[] field1213;

    static {
        field1215 = 0;
        field1211 = 0;
        field1212 = new int[]{1, 1, 1, 1};
        field1213 = new int[]{0, 1, 2, 3};
    }

    int field1210;
    int field1214;
    int field1216;
    int field1219;
    int field1220;
    String field1217;
    String field1218;
    String field1221;

    class137() {
    }

    static boolean method633() {
        try {
            if (class529.field4221 == null) {
                class529.field4221 = class174.field1465.method1699(new URL(class365.field2618));
            } else if (class529.field4221.method1091()) {
                byte[] var1 = class529.field4221.method1093();
                class78 var2 = new class78(var1);
                var2.method264();
                field1215 = var2.method309();
                class521.field4197 = new class137[field1215];

                class137 var4;
                for (int var3 = 0; var3 < field1215; var4.field1220 = var3++) {
                    var4 = class521.field4197[var3] = new class137();
                    var4.field1214 = var2.method309();
                    var4.field1210 = var2.method264();
                    var4.field1217 = var2.method268();
                    var4.field1218 = var2.method268();
                    var4.field1219 = var2.method260();
                    var4.field1216 = var2.method262();
                }

                method631(class521.field4197, 0, class521.field4197.length - 1, field1213, field1212);
                class529.field4221 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class529.field4221 = null;
        }

        return false;
    }

    static void method636(int var0, int var1) {
        int[] var3 = new int[4];
        int[] var4 = new int[4];
        var3[0] = var0;
        var4[0] = var1;
        int var5 = 1;

        for (int var6 = 0; var6 < 4; ++var6) {
            if (var0 != field1213[var6]) {
                var3[var5] = field1213[var6];
                var4[var5] = field1212[var6];
                ++var5;
            }
        }

        field1213 = var3;
        field1212 = var4;
        method631(class521.field4197, 0, class521.field4197.length - 1, field1213, field1212);
    }

    static void method631(class137[] var0, int var1, int var2, int[] var3, int[] var4) {
        if (var1 < var2) {
            int var6 = var1 - 1;
            int var7 = var2 + 1;
            int var8 = (var1 + var2) / 2;
            class137 var9 = var0[var8];
            var0[var8] = var0[var1];
            var0[var1] = var9;

            while (var6 < var7) {
                boolean var10 = true;

                int var11;
                int var12;
                int var13;
                do {
                    --var7;

                    for (var11 = 0; var11 < 4; ++var11) {
                        if (var3[var11] == 2) {
                            var12 = var0[var7].field1220;
                            var13 = var9.field1220;
                        } else if (var3[var11] == 1) {
                            var12 = var0[var7].field1216;
                            var13 = var9.field1216;
                            if (var12 == -1 && var4[var11] == 1) {
                                var12 = 2001;
                            }

                            if (var13 == -1 && var4[var11] == 1) {
                                var13 = 2001;
                            }
                        } else if (var3[var11] == 3) {
                            var12 = var0[var7].method619() ? 1 : 0;
                            var13 = var9.method619() ? 1 : 0;
                        } else {
                            var12 = var0[var7].field1214;
                            var13 = var9.field1214;
                        }

                        if (var12 != var13) {
                            if ((var4[var11] != 1 || var12 <= var13) && (var4[var11] != 0 || var12 >= var13)) {
                                var10 = false;
                            }
                            break;
                        }

                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);

                var10 = true;

                do {
                    ++var6;

                    for (var11 = 0; var11 < 4; ++var11) {
                        if (var3[var11] == 2) {
                            var12 = var0[var6].field1220;
                            var13 = var9.field1220;
                        } else if (var3[var11] == 1) {
                            var12 = var0[var6].field1216;
                            var13 = var9.field1216;
                            if (var12 == -1 && var4[var11] == 1) {
                                var12 = 2001;
                            }

                            if (var13 == -1 && var4[var11] == 1) {
                                var13 = 2001;
                            }
                        } else if (var3[var11] == 3) {
                            var12 = var0[var6].method619() ? 1 : 0;
                            var13 = var9.method619() ? 1 : 0;
                        } else {
                            var12 = var0[var6].field1214;
                            var13 = var9.field1214;
                        }

                        if (var12 != var13) {
                            if ((var4[var11] != 1 || var12 >= var13) && (var4[var11] != 0 || var12 <= var13)) {
                                var10 = false;
                            }
                            break;
                        }

                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);

                if (var6 < var7) {
                    class137 var14 = var0[var6];
                    var0[var6] = var0[var7];
                    var0[var7] = var14;
                }
            }

            method631(var0, var1, var7, var3, var4);
            method631(var0, var7 + 1, var2, var3, var4);
        }

    }

    static void method635(int var0, boolean var1, int var2, boolean var3) {
        if (null != class521.field4197) {
            method638(0, class521.field4197.length - 1, var0, var1, var2, var3);
        }

    }

    static void method638(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
        if (var0 < var1) {
            int var7 = (var0 + var1) / 2;
            int var8 = var0;
            class137 var9 = class521.field4197[var7];
            class521.field4197[var7] = class521.field4197[var1];
            class521.field4197[var1] = var9;

            for (int var10 = var0; var10 < var1; ++var10) {
                if (method632(class521.field4197[var10], var9, var2, var3, var4, var5) <= 0) {
                    class137 var11 = class521.field4197[var10];
                    class521.field4197[var10] = class521.field4197[var8];
                    class521.field4197[var8++] = var11;
                }
            }

            class521.field4197[var1] = class521.field4197[var8];
            class521.field4197[var8] = var9;
            method638(var0, var8 - 1, var2, var3, var4, var5);
            method638(var8 + 1, var1, var2, var3, var4, var5);
        }

    }

    static int method632(class137 var0, class137 var1, int var2, boolean var3, int var4, boolean var5) {
        int var7 = method634(var0, var1, var2, var3);
        if (var7 != 0) {
            return var3 ? -var7 : var7;
        } else if (var4 == -1) {
            return 0;
        } else {
            int var8 = method634(var0, var1, var4, var5);
            return var5 ? -var8 : var8;
        }
    }

    static int method634(class137 var0, class137 var1, int var2, boolean var3) {
        if (var2 == 1) {
            int var5 = var0.field1216;
            int var6 = var1.field1216;
            if (!var3) {
                if (var5 == -1) {
                    var5 = 2001;
                }

                if (var6 == -1) {
                    var6 = 2001;
                }
            }

            return var5 - var6;
        } else if (var2 == 2) {
            return var0.field1219 - var1.field1219;
        } else if (var2 == 3) {
            if (var0.field1218.equals("-")) {
                if (var1.field1218.equals("-")) {
                    return 0;
                } else {
                    return var3 ? -1 : 1;
                }
            } else if (var1.field1218.equals("-")) {
                return var3 ? 1 : -1;
            } else {
                return var0.field1218.compareTo(var1.field1218);
            }
        } else if (var2 == 4) {
            return var0.method627() ? (var1.method627() ? 0 : 1) : (var1.method627() ? -1 : 0);
        } else if (var2 == 5) {
            return var0.method621() ? (var1.method621() ? 0 : 1) : (var1.method621() ? -1 : 0);
        } else if (var2 == 6) {
            return var0.method629() ? (var1.method629() ? 0 : 1) : (var1.method629() ? -1 : 0);
        } else if (var2 == 7) {
            return var0.method619() ? (var1.method619() ? 0 : 1) : (var1.method619() ? -1 : 0);
        } else {
            return var0.field1214 - var1.field1214;
        }
    }

    static class137 method630() {
        field1211 = 0;
        return method637();
    }

    static class137 method637() {
        return field1211 < field1215 ? class521.field4197[++field1211 - 1] : null;
    }

    static final void method622(class378 var0) {
        class320 var2 = Client.field3840.field2239;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        if (class378.field2737 == var0) {
            var3 = var2.method299();
            var4 = var2.method300();
            var5 = var2.method260();
            var6 = (var5 >> 4 & 7) + class51.field557;
            var7 = class518.field4181 + (var5 & 7);
            var8 = var2.method288();
            if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                class43 var41 = Client.field3915[class201.field1651][var6][var7];
                if (var41 != null) {
                    for (class272 var37 = (class272) var41.method122(); var37 != null; var37 = (class272) var41.method124()) {
                        if ((var8 & 32767) == var37.field1992 && var37.field1993 == var4) {
                            var37.field1993 = var3;
                            break;
                        }
                    }

                    Client.method2392(var6, var7);
                }
            }

        } else {
            int var9;
            int var10;
            byte var11;
            int var13;
            int var14;
            if (class378.field2740 == var0) {
                var3 = var2.method281();
                var4 = var3 >> 2;
                var5 = var3 & 3;
                var6 = Client.field3960[var4];
                var7 = var2.method320();
                var8 = class51.field557 + (var7 >> 4 & 7);
                var9 = (var7 & 7) + class518.field4181;
                var10 = var2.method289();
                var11 = var2.method275();
                byte var12 = var2.method283();
                var13 = var2.method287();
                var14 = var2.method287();
                byte var15 = var2.method284();
                byte var16 = var2.method261();
                int var17 = var2.method289();
                class283 var18;
                if (Client.field3903 == var10) {
                    var18 = class180.field1528;
                } else {
                    var18 = Client.field3948[var10];
                }

                if (var18 != null) {
                    class304 var19 = class192.method892(var14, (byte) -34);
                    int var20;
                    int var21;
                    if (var5 != 1 && var5 != 3) {
                        var20 = var19.field2190;
                        var21 = var19.field2175;
                    } else {
                        var20 = var19.field2175;
                        var21 = var19.field2190;
                    }

                    int var22 = var8 + (var20 >> 1);
                    int var23 = var8 + (var20 + 1 >> 1);
                    int var24 = var9 + (var21 >> 1);
                    int var25 = (var21 + 1 >> 1) + var9;
                    int[][] var26 = class122.field1107[class201.field1651];
                    int var27 = var26[var23][var25] + var26[var22][var25] + var26[var23][var24] + var26[var22][var24] >> 2;
                    int var28 = (var8 << 7) + (var20 << 6);
                    int var29 = (var21 << 6) + (var9 << 7);
                    class448 var30 = var19.method1345(var4, var5, var26, var28, var27, var29);
                    if (var30 != null) {
                        Client.method2371(class201.field1651, var8, var9, var6, -1, 0, 0, 31, var13 + 1, var17 + 1);
                        var18.field2062 = Client.field4078 + var13;
                        var18.field2072 = var17 + Client.field4078;
                        var18.field2066 = var30;
                        var18.field2063 = var8 * 128 + var20 * 64;
                        var18.field2065 = var9 * 128 + var21 * 64;
                        var18.field2064 = var27;
                        byte var31;
                        if (var15 > var11) {
                            var31 = var15;
                            var15 = var11;
                            var11 = var31;
                        }

                        if (var12 > var16) {
                            var31 = var12;
                            var12 = var16;
                            var16 = var31;
                        }

                        var18.field2078 = var8 + var15;
                        var18.field2069 = var11 + var8;
                        var18.field2068 = var12 + var9;
                        var18.field2058 = var16 + var9;
                    }
                }
            }

            if (var0 == class378.field2733) {
                var3 = var2.method320();
                var4 = (var3 >> 4 & 7) + class51.field557;
                var5 = class518.field4181 + (var3 & 7);
                var6 = var2.method309();
                var7 = var2.method320();
                var8 = var2.method288();
                if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                    var4 = 64 + var4 * 128;
                    var5 = 64 + var5 * 128;
                    class83 var39 = new class83(var8, class201.field1651, var4, var5, Client.method2342(var4, var5, class201.field1651) - var7, var6, Client.field4078);
                    Client.field4045.method126(var39);
                }

            } else {
                int var38;
                if (class378.field2741 == var0) {
                    var3 = var2.method281();
                    var4 = var2.method320();
                    var5 = var4 >> 2;
                    var6 = var4 & 3;
                    var7 = Client.field3960[var5];
                    var8 = var2.method289();
                    var9 = var2.method282();
                    var10 = class51.field557 + (var9 >> 4 & 7);
                    var38 = class518.field4181 + (var9 & 7);
                    if (var10 >= 0 && var38 >= 0 && var10 < 104 && var38 < 104) {
                        Client.method2371(class201.field1651, var10, var38, var7, var8, var5, var6, var3, 0, -1);
                    }

                } else {
                    int var40;
                    if (class378.field2734 == var0) {
                        var3 = var2.method320();
                        var4 = var3 >> 2;
                        var5 = var3 & 3;
                        var6 = Client.field3960[var4];
                        var7 = var2.method287();
                        var8 = var2.method320();
                        var9 = (var8 >> 4 & 7) + class51.field557;
                        var10 = (var8 & 7) + class518.field4181;
                        if (var9 >= 0 && var10 >= 0 && var9 < 103 && var10 < 103) {
                            if (var6 == 0) {
                                class256 var42 = class329.field2414.method752(class201.field1651, var9, var10);
                                if (var42 != null) {
                                    var40 = class368.method1739(var42.field1925);
                                    if (var4 == 2) {
                                        var42.field1926 = new class503(var40, 2, var5 + 4, class201.field1651, var9, var10, var7, false, var42.field1926);
                                        var42.field1924 = new class503(var40, 2, var5 + 1 & 3, class201.field1651, var9, var10, var7, false, var42.field1924);
                                    } else {
                                        var42.field1926 = new class503(var40, var4, var5, class201.field1651, var9, var10, var7, false, var42.field1926);
                                    }

                                    return;
                                }
                            }

                            if (var6 == 1) {
                                class224 var43 = class329.field2414.method753(class201.field1651, var9, var10);
                                if (null != var43) {
                                    var40 = class368.method1739(var43.field1776);
                                    if (var4 != 4 && var4 != 5) {
                                        if (var4 == 6) {
                                            var43.field1773 = new class503(var40, 4, var5 + 4, class201.field1651, var9, var10, var7, false, var43.field1773);
                                        } else if (var4 == 7) {
                                            var43.field1773 = new class503(var40, 4, (var5 + 2 & 3) + 4, class201.field1651, var9, var10, var7, false, var43.field1773);
                                        } else if (var4 == 8) {
                                            var43.field1773 = new class503(var40, 4, var5 + 4, class201.field1651, var9, var10, var7, false, var43.field1773);
                                            var43.field1774 = new class503(var40, 4, 4 + (var5 + 2 & 3), class201.field1651, var9, var10, var7, false, var43.field1774);
                                        }
                                    } else {
                                        var43.field1773 = new class503(var40, 4, var5, class201.field1651, var9, var10, var7, false, var43.field1773);
                                    }

                                    return;
                                }
                            }

                            if (var6 == 2) {
                                class325 var44 = class329.field2414.method790(class201.field1651, var9, var10);
                                if (var4 == 11) {
                                    var4 = 10;
                                }

                                if (null != var44) {
                                    var44.field2358 = new class503(class368.method1739(var44.field2363), var4, var5, class201.field1651, var9, var10, var7, false, var44.field2358);
                                    return;
                                }
                            }

                            if (var6 == 3) {
                                class294 var45 = class329.field2414.method777(class201.field1651, var9, var10);
                                if (var45 != null) {
                                    var45.field2132 = new class503(class368.method1739(var45.field2131), 22, var5, class201.field1651, var9, var10, var7, false, var45.field2132);
                                    return;
                                }
                            }

                            Client.method2488(class201.field1651, var9, var10, var6, var7);
                        }

                    } else {
                        class272 var36;
                        if (class378.field2738 == var0) {
                            var2.method281();
                            var3 = var2.method281();
                            var4 = (var3 >> 4 & 7) + class51.field557;
                            var5 = (var3 & 7) + class518.field4181;
                            var6 = var2.method260();
                            var7 = var2.method264();
                            var2.method289();
                            var2.method287();
                            var2.method281();
                            var8 = var2.method309();
                            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                                var36 = new class272();
                                var36.field1992 = var8;
                                var36.field1993 = var7;
                                var36.method1217(var6);
                                if (Client.field3915[class201.field1651][var4][var5] == null) {
                                    Client.field3915[class201.field1651][var4][var5] = new class43();
                                }

                                Client.field3915[class201.field1651][var4][var5].method126(var36);
                                Client.method2392(var4, var5);
                            }

                        } else if (class378.field2743 == var0) {
                            var3 = var2.method260();
                            var4 = (var3 >> 4 & 7) + class51.field557;
                            var5 = (var3 & 7) + class518.field4181;
                            var6 = var2.method320();
                            var7 = var6 >> 2;
                            var8 = var6 & 3;
                            var9 = Client.field3960[var7];
                            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                                Client.method2371(class201.field1651, var4, var5, var9, -1, var7, var8, 31, 0, -1);
                            }

                        } else {
                            class43 var34;
                            if (class378.field2742 == var0) {
                                var3 = var2.method289();
                                var4 = var2.method299();
                                var5 = var2.method260();
                                var6 = class51.field557 + (var5 >> 4 & 7);
                                var7 = class518.field4181 + (var5 & 7);
                                if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                                    var34 = Client.field3915[class201.field1651][var6][var7];
                                    if (var34 != null) {
                                        for (var36 = (class272) var34.method122(); null != var36; var36 = (class272) var34.method124()) {
                                            if ((var3 & 32767) == var36.field1992 && var36.field1993 == var4) {
                                                var36.method221();
                                                break;
                                            }
                                        }

                                        if (var34.method122() == null) {
                                            Client.field3915[class201.field1651][var6][var7] = null;
                                        }

                                        Client.method2392(var6, var7);
                                    }
                                }

                            } else {
                                if (var0 == class378.field2739) {
                                    var3 = var2.method281();
                                    var4 = class51.field557 + (var3 >> 4 & 7);
                                    var5 = (var3 & 7) + class518.field4181;
                                    var6 = var2.method282();
                                    var7 = var6 >> 4 & 15;
                                    var8 = var6 & 7;
                                    var9 = var2.method260();
                                    var10 = var2.method289();
                                    if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                                        var38 = var7 + 1;
                                        if (class180.field1528.field4166[0] >= var4 - var38 && class180.field1528.field4166[0] <= var38 + var4 && class180.field1528.field4163[0] >= var5 - var38 && class180.field1528.field4163[0] <= var38 + var5 && class290.field2121.method2555() != 0 && var8 > 0 && Client.field4030 < 50) {
                                            Client.field4031[Client.field4030] = var10;
                                            Client.field4032[Client.field4030] = var8;
                                            Client.field3987[Client.field4030] = var9;
                                            Client.field3819[Client.field4030] = null;
                                            Client.field3782[Client.field4030] = var7 + (var4 << 16) + (var5 << 8);
                                            ++Client.field4030;
                                        }
                                    }
                                }

                                int var46;
                                if (class378.field2736 == var0) {
                                    var3 = var2.method288();
                                    var4 = var2.method309();
                                    byte var32 = var2.method284();
                                    var6 = var2.method320();
                                    var7 = var2.method294();
                                    byte var35 = var2.method261();
                                    var9 = var2.method281() * 4;
                                    var10 = var2.method320();
                                    var38 = var2.method282() * 4;
                                    var40 = var2.method295();
                                    var13 = var2.method260();
                                    var14 = (var13 >> 4 & 7) + class51.field557;
                                    var46 = (var13 & 7) + class518.field4181;
                                    int var48 = var2.method289();
                                    var5 = var32 + var14;
                                    var8 = var35 + var46;
                                    if (var14 >= 0 && var46 >= 0 && var14 < 104 && var46 < 104 && var5 >= 0 && var8 >= 0 && var5 < 104 && var8 < 104 && var48 != 65535) {
                                        var14 = var14 * 128 + 64;
                                        var46 = var46 * 128 + 64;
                                        var5 = var5 * 128 + 64;
                                        var8 = 64 + var8 * 128;
                                        class143 var49 = new class143(var48, class201.field1651, var14, var46, Client.method2342(var14, var46, class201.field1651) - var9, Client.field4078 + var3, var4 + Client.field4078, var6, var10, var40, var7, var38);
                                        var49.method658(var5, var8, Client.method2342(var5, var8, class201.field1651) - var38, var3 + Client.field4078);
                                        Client.field3902.method126(var49);
                                    }

                                } else if (class378.field2732 == var0) {
                                    var3 = var2.method287();
                                    var4 = var2.method281();
                                    var5 = (var4 >> 4 & 7) + class51.field557;
                                    var6 = (var4 & 7) + class518.field4181;
                                    byte var33 = var2.method284();
                                    var8 = var2.method295();
                                    var9 = var2.method281();
                                    var10 = var2.method289();
                                    var11 = var2.method275();
                                    var40 = var2.method320() * 4;
                                    var13 = var2.method281();
                                    var14 = var2.method281() * 4;
                                    var46 = var2.method309();
                                    var38 = var11 + var5;
                                    var7 = var33 + var6;
                                    if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var38 >= 0 && var7 >= 0 && var38 < 104 && var7 < 104 && var3 != 65535) {
                                        var5 = 64 + var5 * 128;
                                        var6 = 64 + var6 * 128;
                                        var38 = 64 + var38 * 128;
                                        var7 = 64 + var7 * 128;
                                        class143 var47 = new class143(var3, class201.field1651, var5, var6, Client.method2342(var5, var6, class201.field1651) - var14, Client.field4078 + var46, var10 + Client.field4078, var9, var13, var8, var40);
                                        var47.method658(var38, var7, Client.method2342(var38, var7, class201.field1651) - var40, var46 + Client.field4078);
                                        Client.field3902.method126(var47);
                                    }

                                } else if (var0 == class378.field2735) {
                                    var3 = var2.method260();
                                    var4 = (var3 >> 4 & 7) + class51.field557;
                                    var5 = (var3 & 7) + class518.field4181;
                                    var6 = var2.method282();
                                    var7 = var2.method287();
                                    if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                                        var34 = Client.field3915[class201.field1651][var4][var5];
                                        if (null != var34) {
                                            for (var36 = (class272) var34.method122(); var36 != null; var36 = (class272) var34.method124()) {
                                                if ((var7 & 32767) == var36.field1992) {
                                                    var36.method1217(var6);
                                                    break;
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
    }

    boolean method619() {
        return (class373.field2685.method1533() & this.field1210) != 0;
    }

    boolean method620() {
        return (class373.field2675.method1533() & this.field1210) != 0;
    }

    boolean method621() {
        return (class373.field2660.method1533() & this.field1210) != 0;
    }

    boolean method629() {
        return (class373.field2669.method1533() & this.field1210) != 0;
    }

    boolean method627() {
        return (class373.field2673.method1533() & this.field1210) != 0;
    }

    boolean method623() {
        return (class373.field2688.method1533() & this.field1210) != 0;
    }

    boolean method626() {
        return (class373.field2684.method1533() & this.field1210) != 0;
    }

    boolean method624() {
        return (class373.field2689.method1533() & this.field1210) != 0;
    }

    boolean method628() {
        return (class373.field2667.method1533() & this.field1210) != 0;
    }

    boolean method625() {
        return (class373.field2686.method1533() & this.field1210) != 0;
    }
}
