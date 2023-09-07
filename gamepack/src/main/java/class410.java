public class class410 implements class330 {
    static final class410 field2889;
    static final class410 field2890;
    static final class410 field2891;
    static final class410 field2892;
    static final class410 field2895;
    static class427 field2896;
    static int[] field2894;

    static {
        field2889 = new class410(0, 0);
        field2892 = new class410(1, 1);
        field2890 = new class410(2, 2);
        field2891 = new class410(3, 3);
        field2895 = new class410(4, 4);
    }

    final int field2888;
    final int field2893;

    class410(int var1, int var2) {
        this.field2888 = var1;
        this.field2893 = var2;
    }

    static class410[] method1901() {
        return new class410[]{field2889, field2892, field2890, field2891, field2895};
    }

    static class410 method1900(int var0) {
        class410 var2 = (class410) class27.method80(method1901(), var0);
        if (var2 == null) {
            var2 = field2889;
        }

        return var2;
    }

    static final void method1899(int var0, int var1, int var2, int var3, int var4, int var5, class158 var6, class11 var7) {
        if (!Client.field3779 || (class122.field1109[0][var1][var2] & 2) != 0 || (class122.field1109[var0][var1][var2] & 16) == 0) {
            if (var0 < class122.field1099) {
                class122.field1099 = var0;
            }

            class304 var9 = class192.method892(var3, (byte) -23);
            int var10;
            int var11;
            if (var4 != 1 && var4 != 3) {
                var10 = var9.field2190;
                var11 = var9.field2175;
            } else {
                var10 = var9.field2175;
                var11 = var9.field2190;
            }

            int var12;
            int var13;
            if (var1 + var10 <= 104) {
                var12 = var1 + (var10 >> 1);
                var13 = (var10 + 1 >> 1) + var1;
            } else {
                var12 = var1;
                var13 = var1 + 1;
            }

            int var14;
            int var15;
            if (var2 + var11 <= 104) {
                var14 = var2 + (var11 >> 1);
                var15 = (var11 + 1 >> 1) + var2;
            } else {
                var14 = var2;
                var15 = var2 + 1;
            }

            int[][] var16 = class122.field1107[var0];
            int var17 = var16[var12][var15] + var16[var12][var14] + var16[var13][var14] + var16[var13][var15] >> 2;
            int var18 = (var1 << 7) + (var10 << 6);
            int var19 = (var11 << 6) + (var2 << 7);
            long var20 = class368.method1741(var1, var2, 2, var9.field2199 == 0, var3);
            int var22 = var5 + (var4 << 6);
            if (var9.field2215 == 1) {
                var22 += 256;
            }

            if (var9.method1351()) {
                class51.method143(var0, var1, var2, var9, var4);
            }

            Object var23;
            if (var5 == 22) {
                if (!Client.field3779 || var9.field2199 != 0 || var9.field2192 == 1 || var9.field2179) {
                    if (var9.field2202 == -1 && var9.field2216 == null) {
                        var23 = var9.method1343(22, var4, var16, var18, var17, var19);
                    } else {
                        var23 = new class503(var3, 22, var4, var0, var1, var2, var9.field2202, var9.field2207, null);
                    }

                    var6.method742(var0, var1, var2, var17, (class490) var23, var20, var22);
                    if (var9.field2192 == 1 && null != var7) {
                        var7.method25(var1, var2);
                    }

                }
            } else {
                int var24;
                if (var5 != 10 && var5 != 11) {
                    int[] var10000;
                    if (var5 >= 12) {
                        if (var9.field2202 == -1 && null == var9.field2216) {
                            var23 = var9.method1343(var5, var4, var16, var18, var17, var19);
                        } else {
                            var23 = new class503(var3, var5, var4, var0, var1, var2, var9.field2202, var9.field2207, null);
                        }

                        var6.method744(var0, var1, var2, var17, 1, 1, (class490) var23, 0, var20, var22);
                        if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                            var10000 = class530.field4225[var0][var1];
                            var10000[var2] |= 2340;
                        }

                        if (var9.field2192 != 0 && null != var7) {
                            var7.method23(var1, var2, var10, var11, var9.field2193);
                        }

                    } else if (var5 == 0) {
                        if (var9.field2202 == -1 && var9.field2216 == null) {
                            var23 = var9.method1343(0, var4, var16, var18, var17, var19);
                        } else {
                            var23 = new class503(var3, 0, var4, var0, var1, var2, var9.field2202, var9.field2207, null);
                        }

                        var6.method764(var0, var1, var2, var17, (class490) var23, null, class122.field1102[var4], 0, var20, var22);
                        if (var4 == 0) {
                            if (var9.field2206) {
                                class447.field3032[var0][var1][var2] = 50;
                                class447.field3032[var0][var1][var2 + 1] = 50;
                            }

                            if (var9.field2201) {
                                var10000 = class530.field4225[var0][var1];
                                var10000[var2] |= 585;
                            }
                        } else if (var4 == 1) {
                            if (var9.field2206) {
                                class447.field3032[var0][var1][var2 + 1] = 50;
                                class447.field3032[var0][var1 + 1][var2 + 1] = 50;
                            }

                            if (var9.field2201) {
                                var10000 = class530.field4225[var0][var1];
                                var10000[var2 + 1] |= 1170;
                            }
                        } else if (var4 == 2) {
                            if (var9.field2206) {
                                class447.field3032[var0][var1 + 1][var2] = 50;
                                class447.field3032[var0][var1 + 1][var2 + 1] = 50;
                            }

                            if (var9.field2201) {
                                var10000 = class530.field4225[var0][var1 + 1];
                                var10000[var2] |= 585;
                            }
                        } else if (var4 == 3) {
                            if (var9.field2206) {
                                class447.field3032[var0][var1][var2] = 50;
                                class447.field3032[var0][var1 + 1][var2] = 50;
                            }

                            if (var9.field2201) {
                                var10000 = class530.field4225[var0][var1];
                                var10000[var2] |= 1170;
                            }
                        }

                        if (var9.field2192 != 0 && var7 != null) {
                            var7.method22(var1, var2, 0, var4, var9.field2193);
                        }

                        if (var9.field2196 != 16) {
                            var6.method747(var0, var1, var2, var9.field2196);
                        }

                    } else if (var5 == 1) {
                        if (var9.field2202 == -1 && null == var9.field2216) {
                            var23 = var9.method1343(1, var4, var16, var18, var17, var19);
                        } else {
                            var23 = new class503(var3, 1, var4, var0, var1, var2, var9.field2202, var9.field2207, null);
                        }

                        var6.method764(var0, var1, var2, var17, (class490) var23, null, class122.field1103[var4], 0, var20, var22);
                        if (var9.field2206) {
                            if (var4 == 0) {
                                class447.field3032[var0][var1][var2 + 1] = 50;
                            } else if (var4 == 1) {
                                class447.field3032[var0][var1 + 1][var2 + 1] = 50;
                            } else if (var4 == 2) {
                                class447.field3032[var0][var1 + 1][var2] = 50;
                            } else if (var4 == 3) {
                                class447.field3032[var0][var1][var2] = 50;
                            }
                        }

                        if (var9.field2192 != 0 && var7 != null) {
                            var7.method22(var1, var2, 1, var4, var9.field2193);
                        }

                    } else {
                        int var29;
                        if (var5 == 2) {
                            var29 = var4 + 1 & 3;
                            Object var31;
                            Object var32;
                            if (var9.field2202 == -1 && var9.field2216 == null) {
                                var32 = var9.method1343(2, var4 + 4, var16, var18, var17, var19);
                                var31 = var9.method1343(2, var29, var16, var18, var17, var19);
                            } else {
                                var32 = new class503(var3, 2, var4 + 4, var0, var1, var2, var9.field2202, var9.field2207, null);
                                var31 = new class503(var3, 2, var29, var0, var1, var2, var9.field2202, var9.field2207, null);
                            }

                            var6.method764(var0, var1, var2, var17, (class490) var32, (class490) var31, class122.field1102[var4], class122.field1102[var29], var20, var22);
                            if (var9.field2201) {
                                if (var4 == 0) {
                                    var10000 = class530.field4225[var0][var1];
                                    var10000[var2] |= 585;
                                    var10000 = class530.field4225[var0][var1];
                                    var10000[var2 + 1] |= 1170;
                                } else if (var4 == 1) {
                                    var10000 = class530.field4225[var0][var1];
                                    var10000[var2 + 1] |= 1170;
                                    var10000 = class530.field4225[var0][var1 + 1];
                                    var10000[var2] |= 585;
                                } else if (var4 == 2) {
                                    var10000 = class530.field4225[var0][var1 + 1];
                                    var10000[var2] |= 585;
                                    var10000 = class530.field4225[var0][var1];
                                    var10000[var2] |= 1170;
                                } else if (var4 == 3) {
                                    var10000 = class530.field4225[var0][var1];
                                    var10000[var2] |= 1170;
                                    var10000 = class530.field4225[var0][var1];
                                    var10000[var2] |= 585;
                                }
                            }

                            if (var9.field2192 != 0 && var7 != null) {
                                var7.method22(var1, var2, 2, var4, var9.field2193);
                            }

                            if (var9.field2196 != 16) {
                                var6.method747(var0, var1, var2, var9.field2196);
                            }

                        } else if (var5 == 3) {
                            if (var9.field2202 == -1 && null == var9.field2216) {
                                var23 = var9.method1343(3, var4, var16, var18, var17, var19);
                            } else {
                                var23 = new class503(var3, 3, var4, var0, var1, var2, var9.field2202, var9.field2207, null);
                            }

                            var6.method764(var0, var1, var2, var17, (class490) var23, null, class122.field1103[var4], 0, var20, var22);
                            if (var9.field2206) {
                                if (var4 == 0) {
                                    class447.field3032[var0][var1][var2 + 1] = 50;
                                } else if (var4 == 1) {
                                    class447.field3032[var0][var1 + 1][var2 + 1] = 50;
                                } else if (var4 == 2) {
                                    class447.field3032[var0][var1 + 1][var2] = 50;
                                } else if (var4 == 3) {
                                    class447.field3032[var0][var1][var2] = 50;
                                }
                            }

                            if (var9.field2192 != 0 && null != var7) {
                                var7.method22(var1, var2, 3, var4, var9.field2193);
                            }

                        } else if (var5 == 9) {
                            if (var9.field2202 == -1 && null == var9.field2216) {
                                var23 = var9.method1343(9, var4, var16, var18, var17, var19);
                            } else {
                                var23 = new class503(var3, var5, var4, var0, var1, var2, var9.field2202, var9.field2207, null);
                            }

                            var6.method744(var0, var1, var2, var17, 1, 1, (class490) var23, 0, var20, var22);
                            if (var9.field2192 != 0 && var7 != null) {
                                var7.method23(var1, var2, var10, var11, var9.field2193);
                            }

                            if (var9.field2196 != 16) {
                                var6.method747(var0, var1, var2, var9.field2196);
                            }

                        } else if (var5 == 4) {
                            if (var9.field2202 == -1 && null == var9.field2216) {
                                var23 = var9.method1343(4, var4, var16, var18, var17, var19);
                            } else {
                                var23 = new class503(var3, 4, var4, var0, var1, var2, var9.field2202, var9.field2207, null);
                            }

                            var6.method779(var0, var1, var2, var17, (class490) var23, null, class122.field1102[var4], 0, 0, 0, var20, var22);
                        } else {
                            long var30;
                            Object var33;
                            if (var5 == 5) {
                                var29 = 16;
                                var30 = var6.method773(var0, var1, var2);
                                if (var30 != 0L) {
                                    var29 = class192.method892(class368.method1739(var30), (byte) 104).field2196;
                                }

                                if (var9.field2202 == -1 && null == var9.field2216) {
                                    var33 = var9.method1343(4, var4, var16, var18, var17, var19);
                                } else {
                                    var33 = new class503(var3, 4, var4, var0, var1, var2, var9.field2202, var9.field2207, null);
                                }

                                var6.method779(var0, var1, var2, var17, (class490) var33, null, class122.field1102[var4], 0, class122.field1104[var4] * var29, class122.field1105[var4] * var29, var20, var22);
                            } else if (var5 == 6) {
                                var29 = 8;
                                var30 = var6.method773(var0, var1, var2);
                                if (var30 != 0L) {
                                    var29 = class192.method892(class368.method1739(var30), (byte) -6).field2196 / 2;
                                }

                                if (var9.field2202 == -1 && var9.field2216 == null) {
                                    var33 = var9.method1343(4, var4 + 4, var16, var18, var17, var19);
                                } else {
                                    var33 = new class503(var3, 4, var4 + 4, var0, var1, var2, var9.field2202, var9.field2207, null);
                                }

                                var6.method779(var0, var1, var2, var17, (class490) var33, null, 256, var4, var29 * class122.field1110[var4], var29 * class122.field1108[var4], var20, var22);
                            } else if (var5 == 7) {
                                var24 = var4 + 2 & 3;
                                if (var9.field2202 == -1 && null == var9.field2216) {
                                    var23 = var9.method1343(4, var24 + 4, var16, var18, var17, var19);
                                } else {
                                    var23 = new class503(var3, 4, var24 + 4, var0, var1, var2, var9.field2202, var9.field2207, null);
                                }

                                var6.method779(var0, var1, var2, var17, (class490) var23, null, 256, var24, 0, 0, var20, var22);
                            } else if (var5 == 8) {
                                var29 = 8;
                                var30 = var6.method773(var0, var1, var2);
                                if (0L != var30) {
                                    var29 = class192.method892(class368.method1739(var30), (byte) -21).field2196 / 2;
                                }

                                int var28 = var4 + 2 & 3;
                                Object var27;
                                if (var9.field2202 == -1 && var9.field2216 == null) {
                                    var33 = var9.method1343(4, var4 + 4, var16, var18, var17, var19);
                                    var27 = var9.method1343(4, var28 + 4, var16, var18, var17, var19);
                                } else {
                                    var33 = new class503(var3, 4, var4 + 4, var0, var1, var2, var9.field2202, var9.field2207, null);
                                    var27 = new class503(var3, 4, var28 + 4, var0, var1, var2, var9.field2202, var9.field2207, null);
                                }

                                var6.method779(var0, var1, var2, var17, (class490) var33, (class490) var27, 256, var4, var29 * class122.field1110[var4], class122.field1108[var4] * var29, var20, var22);
                            }
                        }
                    }
                } else {
                    if (var9.field2202 == -1 && var9.field2216 == null) {
                        var23 = var9.method1343(10, var4, var16, var18, var17, var19);
                    } else {
                        var23 = new class503(var3, 10, var4, var0, var1, var2, var9.field2202, var9.field2207, null);
                    }

                    if (null != var23 && var6.method744(var0, var1, var2, var17, var10, var11, (class490) var23, var5 == 11 ? 256 : 0, var20, var22) && var9.field2206) {
                        var24 = 15;
                        if (var23 instanceof class448) {
                            var24 = ((class448) var23).method2047() / 4;
                            if (var24 > 30) {
                                var24 = 30;
                            }
                        }

                        for (int var25 = 0; var25 <= var10; ++var25) {
                            for (int var26 = 0; var26 <= var11; ++var26) {
                                if (var24 > class447.field3032[var0][var1 + var25][var26 + var2]) {
                                    class447.field3032[var0][var1 + var25][var2 + var26] = (byte) var24;
                                }
                            }
                        }
                    }

                    if (var9.field2192 != 0 && var7 != null) {
                        var7.method23(var1, var2, var10, var11, var9.field2193);
                    }

                }
            }
        }
    }

    @Override
    public int method1533() {
        return this.field2893;
    }
}
