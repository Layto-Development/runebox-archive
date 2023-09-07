public class class172 {
    static byte[] field1450;
    static class133 field1453;
    static class447[] field1441;
    static class78 field1440;
    static class78[] field1451;
    static int field1439;
    static int field1443;
    static int field1445;
    static int field1449;
    static int[] field1442;
    static int[] field1444;
    static int[] field1446;
    static int[] field1447;
    static int[] field1448;
    static int[] field1452;

    static {
        field1450 = new byte[2048];
        field1441 = new class447[2048];
        field1451 = new class78[2048];
        field1443 = 0;
        field1444 = new int[2048];
        field1445 = 0;
        field1452 = new int[2048];
        field1446 = new int[2048];
        field1447 = new int[2048];
        field1448 = new int[2048];
        field1449 = 0;
        field1442 = new int[2048];
        field1440 = new class78(new byte[5000]);
    }

    class172() throws Throwable {
    }

    static final void method816(class320 var0) {
        var0.method1410();
        int var2 = Client.field3903;
        class283 var3 = class180.field1528 = Client.field3948[var2] = new class283();
        var3.field2053 = var2;
        int var4 = var0.method1408(30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 16383;
        int var7 = var4 & 16383;
        var3.field4166[0] = var6 - class357.field2573;
        var3.field4121 = (var3.field4166[0] << 7) + (var3.method1287() << 6);
        var3.field4163[0] = var7 - class5.field28;
        var3.field4092 = (var3.field4163[0] << 7) + (var3.method1287() << 6);
        class201.field1651 = var3.field2074 = var5;
        if (field1451[var2] != null) {
            var3.method1281(field1451[var2]);
        }

        field1443 = 0;
        field1444[++field1443 - 1] = var2;
        field1450[var2] = 0;
        field1445 = 0;

        for (int var8 = 1; var8 < 2048; ++var8) {
            if (var8 != var2) {
                int var9 = var0.method1408(18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 597;
                int var12 = var9 & 597;
                field1446[var8] = var12 + (var10 << 28) + (var11 << 14);
                field1447[var8] = 0;
                field1448[var8] = -1;
                field1452[++field1445 - 1] = var8;
                field1450[var8] = 0;
            }
        }

        var0.method1411();
    }

    static final void method817(class320 var0, int var1) {
        int var3 = var0.field697;
        field1449 = 0;
        int var4 = 0;
        var0.method1410();

        byte[] var10000;
        int var5;
        int var6;
        int var7;
        for (var5 = 0; var5 < field1443; ++var5) {
            var6 = field1444[var5];
            if ((field1450[var6] & 1) == 0) {
                if (var4 > 0) {
                    --var4;
                    var10000 = field1450;
                    var10000[var6] = (byte) (var10000[var6] | 2);
                } else {
                    var7 = var0.method1408(1);
                    if (var7 == 0) {
                        var4 = class69.method220(var0);
                        var10000 = field1450;
                        var10000[var6] = (byte) (var10000[var6] | 2);
                    } else {
                        method819(var0, var6);
                    }
                }
            }
        }

        var0.method1411();
        if (var4 != 0) {
            throw new RuntimeException();
        } else {
            var0.method1410();

            for (var5 = 0; var5 < field1443; ++var5) {
                var6 = field1444[var5];
                if ((field1450[var6] & 1) != 0) {
                    if (var4 > 0) {
                        --var4;
                        var10000 = field1450;
                        var10000[var6] = (byte) (var10000[var6] | 2);
                    } else {
                        var7 = var0.method1408(1);
                        if (var7 == 0) {
                            var4 = class69.method220(var0);
                            var10000 = field1450;
                            var10000[var6] = (byte) (var10000[var6] | 2);
                        } else {
                            method819(var0, var6);
                        }
                    }
                }
            }

            var0.method1411();
            if (var4 != 0) {
                throw new RuntimeException();
            } else {
                var0.method1410();

                for (var5 = 0; var5 < field1445; ++var5) {
                    var6 = field1452[var5];
                    if ((field1450[var6] & 1) != 0) {
                        if (var4 > 0) {
                            --var4;
                            var10000 = field1450;
                            var10000[var6] = (byte) (var10000[var6] | 2);
                        } else {
                            var7 = var0.method1408(1);
                            if (var7 == 0) {
                                var4 = class69.method220(var0);
                                var10000 = field1450;
                                var10000[var6] = (byte) (var10000[var6] | 2);
                            } else if (method818(var0, var6)) {
                                var10000 = field1450;
                                var10000[var6] = (byte) (var10000[var6] | 2);
                            }
                        }
                    }
                }

                var0.method1411();
                if (var4 != 0) {
                    throw new RuntimeException();
                } else {
                    var0.method1410();

                    for (var5 = 0; var5 < field1445; ++var5) {
                        var6 = field1452[var5];
                        if ((field1450[var6] & 1) == 0) {
                            if (var4 > 0) {
                                --var4;
                                var10000 = field1450;
                                var10000[var6] = (byte) (var10000[var6] | 2);
                            } else {
                                var7 = var0.method1408(1);
                                if (var7 == 0) {
                                    var4 = class69.method220(var0);
                                    var10000 = field1450;
                                    var10000[var6] = (byte) (var10000[var6] | 2);
                                } else if (method818(var0, var6)) {
                                    var10000 = field1450;
                                    var10000[var6] = (byte) (var10000[var6] | 2);
                                }
                            }
                        }
                    }

                    var0.method1411();
                    if (var4 != 0) {
                        throw new RuntimeException();
                    } else {
                        field1443 = 0;
                        field1445 = 0;

                        for (var5 = 1; var5 < 2048; ++var5) {
                            var10000 = field1450;
                            var10000[var5] = (byte) (var10000[var5] >> 1);
                            class283 var8 = Client.field3948[var5];
                            if (var8 != null) {
                                field1444[++field1443 - 1] = var5;
                            } else {
                                field1452[++field1445 - 1] = var5;
                            }
                        }

                        method815(var0);
                        if (var1 != var0.field697 - var3) {
                            throw new RuntimeException(var0.field697 - var3 + " " + var1);
                        }
                    }
                }
            }
        }
    }

    static void method819(class320 var0, int var1) {
        boolean var3 = var0.method1408(1) == 1;
        if (var3) {
            field1442[++field1449 - 1] = var1;
        }

        int var4 = var0.method1408(2);
        class283 var5 = Client.field3948[var1];
        if (var4 == 0) {
            if (var3) {
                var5.field2079 = false;
            } else if (Client.field3903 == var1) {
                throw new RuntimeException();
            } else {
                field1446[var1] = (class357.field2573 + var5.field4166[0] >> 13 << 14) + (var5.field2074 << 28) + (class5.field28 + var5.field4163[0] >> 13);
                if (var5.field4128 != -1) {
                    field1447[var1] = var5.field4128;
                } else {
                    field1447[var1] = var5.field4132;
                }

                field1448[var1] = var5.field4126;
                Client.field3948[var1] = null;
                if (var0.method1408(1) != 0) {
                    method818(var0, var1);
                }

            }
        } else {
            int var6;
            int var7;
            int var8;
            if (var4 == 1) {
                var6 = var0.method1408(3);
                var7 = var5.field4166[0];
                var8 = var5.field4163[0];
                if (var6 == 0) {
                    --var7;
                    --var8;
                } else if (var6 == 1) {
                    --var8;
                } else if (var6 == 2) {
                    ++var7;
                    --var8;
                } else if (var6 == 3) {
                    --var7;
                } else if (var6 == 4) {
                    ++var7;
                } else if (var6 == 5) {
                    --var7;
                    ++var8;
                } else if (var6 == 6) {
                    ++var8;
                } else if (var6 == 7) {
                    ++var7;
                    ++var8;
                }

                if (var1 != Client.field3903 || var5.field4121 >= 1536 && var5.field4092 >= 1536 && var5.field4121 < 11776 && var5.field4092 < 11776) {
                    if (var3) {
                        var5.field2079 = true;
                        var5.field2075 = var7;
                        var5.field2081 = var8;
                    } else {
                        var5.field2079 = false;
                        var5.method1295(var7, var8, field1441[var1]);
                    }
                } else {
                    var5.method1291(var7, var8);
                    var5.field2079 = false;
                }

            } else if (var4 == 2) {
                var6 = var0.method1408(4);
                var7 = var5.field4166[0];
                var8 = var5.field4163[0];
                if (var6 == 0) {
                    var7 -= 2;
                    var8 -= 2;
                } else if (var6 == 1) {
                    --var7;
                    var8 -= 2;
                } else if (var6 == 2) {
                    var8 -= 2;
                } else if (var6 == 3) {
                    ++var7;
                    var8 -= 2;
                } else if (var6 == 4) {
                    var7 += 2;
                    var8 -= 2;
                } else if (var6 == 5) {
                    var7 -= 2;
                    --var8;
                } else if (var6 == 6) {
                    var7 += 2;
                    --var8;
                } else if (var6 == 7) {
                    var7 -= 2;
                } else if (var6 == 8) {
                    var7 += 2;
                } else if (var6 == 9) {
                    var7 -= 2;
                    ++var8;
                } else if (var6 == 10) {
                    var7 += 2;
                    ++var8;
                } else if (var6 == 11) {
                    var7 -= 2;
                    var8 += 2;
                } else if (var6 == 12) {
                    --var7;
                    var8 += 2;
                } else if (var6 == 13) {
                    var8 += 2;
                } else if (var6 == 14) {
                    ++var7;
                    var8 += 2;
                } else if (var6 == 15) {
                    var7 += 2;
                    var8 += 2;
                }

                if (Client.field3903 != var1 || var5.field4121 >= 1536 && var5.field4092 >= 1536 && var5.field4121 < 11776 && var5.field4092 < 11776) {
                    if (var3) {
                        var5.field2079 = true;
                        var5.field2075 = var7;
                        var5.field2081 = var8;
                    } else {
                        var5.field2079 = false;
                        var5.method1295(var7, var8, field1441[var1]);
                    }
                } else {
                    var5.method1291(var7, var8);
                    var5.field2079 = false;
                }

            } else {
                var6 = var0.method1408(1);
                int var9;
                int var10;
                int var11;
                int var12;
                if (var6 == 0) {
                    var7 = var0.method1408(12);
                    var8 = var7 >> 10;
                    var9 = var7 >> 5 & 31;
                    if (var9 > 15) {
                        var9 -= 32;
                    }

                    var10 = var7 & 31;
                    if (var10 > 15) {
                        var10 -= 32;
                    }

                    var11 = var5.field4166[0] + var9;
                    var12 = var5.field4163[0] + var10;
                    if (var1 != Client.field3903 || var5.field4121 >= 1536 && var5.field4092 >= 1536 && var5.field4121 < 11776 && var5.field4092 < 11776) {
                        if (var3) {
                            var5.field2079 = true;
                            var5.field2075 = var11;
                            var5.field2081 = var12;
                        } else {
                            var5.field2079 = false;
                            var5.method1295(var11, var12, field1441[var1]);
                        }
                    } else {
                        var5.method1291(var11, var12);
                        var5.field2079 = false;
                    }

                    var5.field2074 = (byte) (var8 + var5.field2074 & 3);
                    if (Client.field3903 == var1) {
                        class201.field1651 = var5.field2074;
                    }

                } else {
                    var7 = var0.method1408(30);
                    var8 = var7 >> 28;
                    var9 = var7 >> 14 & 16383;
                    var10 = var7 & 16383;
                    var11 = (var9 + class357.field2573 + var5.field4166[0] & 16383) - class357.field2573;
                    var12 = (var10 + var5.field4163[0] + class5.field28 & 16383) - class5.field28;
                    if (Client.field3903 != var1 || var5.field4121 >= 1536 && var5.field4092 >= 1536 && var5.field4121 < 11776 && var5.field4092 < 11776) {
                        if (var3) {
                            var5.field2079 = true;
                            var5.field2075 = var11;
                            var5.field2081 = var12;
                        } else {
                            var5.field2079 = false;
                            var5.method1295(var11, var12, field1441[var1]);
                        }
                    } else {
                        var5.method1291(var11, var12);
                        var5.field2079 = false;
                    }

                    var5.field2074 = (byte) (var5.field2074 + var8 & 3);
                    if (Client.field3903 == var1) {
                        class201.field1651 = var5.field2074;
                    }

                }
            }
        }
    }

    static boolean method818(class320 var0, int var1) {
        int var3 = var0.method1408(2);
        int var4;
        int var5;
        int var8;
        int var9;
        int var10;
        int var11;
        if (var3 == 0) {
            if (var0.method1408(1) != 0) {
                method818(var0, var1);
            }

            var4 = var0.method1408(13);
            var5 = var0.method1408(13);
            boolean var12 = var0.method1408(1) == 1;
            if (var12) {
                field1442[++field1449 - 1] = var1;
            }

            if (Client.field3948[var1] != null) {
                throw new RuntimeException();
            } else {
                class283 var13 = Client.field3948[var1] = new class283();
                var13.field2053 = var1;
                if (null != field1451[var1]) {
                    var13.method1281(field1451[var1]);
                }

                var13.field4132 = field1447[var1];
                var13.field4126 = field1448[var1];
                var8 = field1446[var1];
                var9 = var8 >> 28;
                var10 = var8 >> 14 & 255;
                var11 = var8 & 255;
                var13.field4164[0] = field1441[var1];
                var13.field2074 = (byte) var9;
                var13.method1291((var10 << 13) + var4 - class357.field2573, var5 + (var11 << 13) - class5.field28);
                var13.field2079 = false;
                return true;
            }
        } else if (var3 == 1) {
            var4 = var0.method1408(2);
            var5 = field1446[var1];
            field1446[var1] = (((var5 >> 28) + var4 & 3) << 28) + (var5 & 268435455);
            return false;
        } else {
            int var6;
            int var7;
            if (var3 == 2) {
                var4 = var0.method1408(5);
                var5 = var4 >> 3;
                var6 = var4 & 7;
                var7 = field1446[var1];
                var8 = (var7 >> 28) + var5 & 3;
                var9 = var7 >> 14 & 255;
                var10 = var7 & 255;
                if (var6 == 0) {
                    --var9;
                    --var10;
                }

                if (var6 == 1) {
                    --var10;
                }

                if (var6 == 2) {
                    ++var9;
                    --var10;
                }

                if (var6 == 3) {
                    --var9;
                }

                if (var6 == 4) {
                    ++var9;
                }

                if (var6 == 5) {
                    --var9;
                    ++var10;
                }

                if (var6 == 6) {
                    ++var10;
                }

                if (var6 == 7) {
                    ++var9;
                    ++var10;
                }

                field1446[var1] = (var8 << 28) + (var9 << 14) + var10;
                return false;
            } else {
                var4 = var0.method1408(18);
                var5 = var4 >> 16;
                var6 = var4 >> 8 & 255;
                var7 = var4 & 255;
                var8 = field1446[var1];
                var9 = var5 + (var8 >> 28) & 3;
                var10 = (var8 >> 14) + var6 & 255;
                var11 = var8 + var7 & 255;
                field1446[var1] = var11 + (var9 << 28) + (var10 << 14);
                return false;
            }
        }
    }

    static final void method815(class320 var0) {
        for (int var2 = 0; var2 < field1449; ++var2) {
            int var3 = field1442[var2];
            class283 var4 = Client.field3948[var3];
            int var5 = var0.method260();
            if ((var5 & 1) != 0) {
                var5 += var0.method260() << 8;
            }

            if ((var5 & 32768) != 0) {
                var5 += var0.method260() << 16;
            }

            method814(var0, var3, var4, var5);
        }

    }

    static final void method814(class320 var0, int var1, class283 var2, int var3) {
        byte var5 = class447.field3028.field3031;
        int var6;
        if ((var3 & 8) != 0) {
            var6 = var0.method260();
            byte[] var7 = new byte[var6];
            class78 var8 = new class78(var7);
            var0.method314(var7, 0, var6);
            field1451[var1] = var8;
            var2.method1281(var8);
        }

        int var9;
        int var10;
        int var17;
        int var19;
        if ((var3 & 65536) != 0) {
            var6 = var0.method260();

            for (var17 = 0; var17 < var6; ++var17) {
                var19 = var0.method281();
                var9 = var0.method289();
                var10 = var0.method264();
                var2.method2504(var19, var9, var10 >> 16, var10 & 65535);
            }
        }

        if ((var3 & 64) != 0) {
            var2.field4128 = var0.method289();
            if (var2.field4139 == 0) {
                var2.field4132 = var2.field4128;
                var2.method2510();
            }
        }

        if ((var3 & 16) != 0) {
            var2.field4126 = var0.method289();
            var2.field4126 += var0.method281() << 16;
            var6 = 16777215;
            if (var2.field4126 == 16777215) {
                var2.field4126 = -1;
            }
        }

        int var11;
        int var12;
        if ((var3 & 4096) != 0) {
            var6 = var0.method289();
            var17 = var6 >> 8;
            var19 = var17 >= 13 && var17 <= 20 ? var17 - 12 : 0;
            class41 var22 = (class41) class27.method80(class41.method116(), var0.method281());
            boolean var25 = var0.method260() == 1;
            var11 = var0.method320();
            var12 = var0.field697;
            if (null != var2.field2070 && null != var2.field2054) {
                boolean var13 = var22.field509 && class153.field1320.method1987(var2.field2070);

                if (!var13 && Client.field3900 == 0 && !var2.field2073) {
                    field1440.field697 = 0;
                    var0.method314(field1440.field695, 0, var11);
                    field1440.field697 = 0;
                    String var14 = class197.method934(class95.method365(class385.method1782(field1440)));
                    var2.field4162 = var14.trim();
                    var2.field4116 = var6 >> 8;
                    var2.field4117 = var6 & 255;
                    var2.field4115 = 150;
                    byte[] var15 = null;
                    int var16;
                    if (var19 > 0 && var19 <= 8) {
                        var15 = new byte[var19];

                        for (var16 = 0; var16 < var19; ++var16) {
                            var15[var16] = var0.method284();
                        }
                    }

                    var2.field4158 = class450.method2079(var15);
                    var2.field4113 = var25;
                    var2.field4114 = class180.field1528 != var2 && var22.field509 && !Client.field3803.isEmpty() && var14.toLowerCase().indexOf(Client.field3803) == -1;
                    if (var22.field525) {
                        var16 = var25 ? 91 : 1;
                    } else {
                        var16 = var25 ? 90 : 2;
                    }

                    if (var22.field524 != -1) {
                        class157.method729(var16, class471.method2176(var22.field524) + var2.field2070.method1706(), var14);
                    } else {
                        class157.method729(var16, var2.field2070.method1706(), var14);
                    }
                }
            }

            var0.field697 = var19 + var11 + var12;
        }

        int var29;
        if ((var3 & 32) != 0) {
            var6 = var0.method288();
            class41 var20 = (class41) class27.method80(class41.method116(), var0.method320());
            boolean var21 = var0.method320() == 1;
            var9 = var0.method260();
            var10 = var0.field697;
            if (var2.field2070 != null && var2.field2054 != null) {
                boolean var26 = var20.field509 && class153.field1320.method1987(var2.field2070);

                if (!var26 && Client.field3900 == 0 && !var2.field2073) {
                    field1440.field697 = 0;
                    var0.method314(field1440.field695, 0, var9);
                    field1440.field697 = 0;
                    String var28 = class197.method934(class95.method365(class385.method1782(field1440)));
                    var2.field4162 = var28.trim();
                    var2.field4116 = var6 >> 8;
                    var2.field4117 = var6 & 255;
                    var2.field4115 = 150;
                    var2.field4158 = null;
                    var2.field4113 = var21;
                    var2.field4114 = class180.field1528 != var2 && var20.field509 && !Client.field3803.isEmpty() && var28.toLowerCase().indexOf(Client.field3803) == -1;
                    if (var20.field525) {
                        var29 = var21 ? 91 : 1;
                    } else {
                        var29 = var21 ? 90 : 2;
                    }

                    if (var20.field524 != -1) {
                        class157.method729(var29, class471.method2176(var20.field524) + var2.field2070.method1706(), var28);
                    } else {
                        class157.method729(var29, var2.field2070.method1706(), var28);
                    }
                }
            }

            var0.field697 = var9 + var10;
        }

        if ((var3 & 4) != 0) {
            var6 = var0.method260();
            if (var6 > 0) {
                for (var17 = 0; var17 < var6; ++var17) {
                    var9 = -1;
                    var10 = -1;
                    var11 = -1;
                    var19 = var0.method307();
                    if (var19 == 32767) {
                        var19 = var0.method307();
                        var10 = var0.method307();
                        var9 = var0.method307();
                        var11 = var0.method307();
                    } else if (var19 != 32766) {
                        var10 = var0.method307();
                    } else {
                        var19 = -1;
                    }

                    var12 = var0.method307();
                    var2.method2507(var19, var10, var9, var11, Client.field4078, var12);
                }
            }

            var17 = var0.method260();
            if (var17 > 0) {
                for (var19 = 0; var19 < var17; ++var19) {
                    var9 = var0.method307();
                    var10 = var0.method307();
                    if (var10 != 32767) {
                        var11 = var0.method307();
                        var12 = var0.method281();
                        var29 = var10 > 0 ? var0.method260() : var12;
                        var2.method2503(var9, Client.field4078, var10, var11, var12, var29);
                    } else {
                        var2.method2508(var9);
                    }
                }
            }
        }

        if ((var3 & 512) != 0) {
            var2.field4143 = var0.method284();
            var2.field4145 = var0.method275();
            var2.field4141 = var0.method261();
            var2.field4111 = var0.method261();
            var2.field4147 = var0.method288() + Client.field4078;
            var2.field4148 = var0.method288() + Client.field4078;
            var2.field4149 = var0.method289();
            if (var2.field2079) {
                var2.field4143 += var2.field2075;
                var2.field4145 += var2.field2081;
                var2.field4141 += var2.field2075;
                var2.field4111 += var2.field2081;
                var2.field4139 = 0;
            } else {
                var2.field4143 += var2.field4166[0];
                var2.field4145 += var2.field4163[0];
                var2.field4141 += var2.field4166[0];
                var2.field4111 += var2.field4163[0];
                var2.field4139 = 1;
            }

            var2.field4155 = 0;
        }

        if ((var3 & 2048) != 0) {
            class447[] var18 = field1441;
            class447[] var27 = new class447[]{class447.field3028, class447.field3029, class447.field3030, class447.field3033};
            var18[var1] = (class447) class27.method80(var27, var0.method261());
        }

        if ((var3 & 128) != 0) {
            var2.field4162 = var0.method268();
            if (var2.field4162.charAt(0) == '~') {
                var2.field4162 = var2.field4162.substring(1);
                class157.method729(2, var2.field2070.method1706(), var2.field4162);
            } else if (class180.field1528 == var2) {
                class157.method729(2, var2.field2070.method1706(), var2.field4162);
            }

            var2.field4113 = false;
            var2.field4116 = 0;
            var2.field4117 = 0;
            var2.field4115 = 150;
        }

        if ((var3 & 16384) != 0) {
            var2.field4152 = Client.field4078 + var0.method287();
            var2.field4094 = Client.field4078 + var0.method287();
            var2.field4154 = var0.method284();
            var2.field4112 = var0.method283();
            var2.field4106 = var0.method275();
            var2.field4144 = (byte) var0.method320();
        }

        if ((var3 & 8192) != 0) {
            for (var6 = 0; var6 < 3; ++var6) {
                var2.field2057[var6] = var0.method268();
            }
        }

        if ((var3 & 1024) != 0) {
            var5 = var0.method261();
        }

        if ((var3 & 2) != 0) {
            var6 = var0.method309();
            if (var6 == 65535) {
                var6 = -1;
            }

            var17 = var0.method281();
            Client.method2493(var2, var6, var17);
        }

        if (var2.field2079) {
            if (var5 == 127) {
                var2.method1291(var2.field2075, var2.field2081);
            } else {
                class447 var23;
                if (class447.field3028.field3031 != var5) {
                    class447[] var24 = new class447[]{class447.field3028, class447.field3029, class447.field3030, class447.field3033};
                    var23 = (class447) class27.method80(var24, var5);
                } else {
                    var23 = field1441[var1];
                }

                var2.method1295(var2.field2075, var2.field2081, var23);
            }
        }

    }
}
