final class class402 implements class1 {
    // $FF: synthetic field
    final class97 val$cc;

    class402(class97 var1) {
        this.val$cc = var1;
    }

    static void method1851(class413 var0, class413 var1, class413 var2) {
        class500.field3654 = (class223.field1763 - 765) / 2;
        class500.field3660 = class500.field3654 + 202;
        class317.field2287 = class500.field3660 + 180;
        boolean var4;
        boolean var5;
        int var10;
        boolean var16;
        int var18;
        int var25;
        int var26;
        int var28;
        int var31;
        int var32;
        int var33;
        int var36;
        if (class500.field3679) {
            if (class112.field1051 == null) {
                class112.field1051 = class274.method1219(class398.field2811, "sl_back", "");
            }

            if (null == class56.field601) {
                class56.field601 = class274.method1228(class398.field2811, "sl_flags", "");
            }

            if (null == class338.field2448) {
                class338.field2448 = class274.method1228(class398.field2811, "sl_arrows", "");
            }

            if (class21.field74 == null) {
                class21.field74 = class274.method1228(class398.field2811, "sl_stars", "");
            }

            if (class496.field3631 == null) {
                class496.field3631 = class274.method1226(class398.field2811, "leftarrow", "");
            }

            if (null == class222.field1762) {
                class222.field1762 = class274.method1226(class398.field2811, "rightarrow", "");
            }

            class415.method1914(class500.field3654, 23, 765, 480, 0);
            class415.method1915(class500.field3654, 0, 125, 23, 12425273, 9135624);
            class415.method1915(class500.field3654 + 125, 0, 640, 23, 5197647, 2697513);
            var0.method928(class32.field470, 62 + class500.field3654, 15, 0, -1);
            if (null != class21.field74) {
                class21.field74[1].method2590(140 + class500.field3654, 1);
                var1.method949(class32.field198, 152 + class500.field3654, 10, 16777215, -1);
                class21.field74[0].method2590(class500.field3654 + 140, 12);
                var1.method949(class32.field256, class500.field3654 + 152, 21, 16777215, -1);
            }

            if (class338.field2448 != null) {
                var25 = class500.field3654 + 280;
                if (class137.field1213[0] == 0 && class137.field1212[0] == 0) {
                    class338.field2448[2].method2590(var25, 4);
                } else {
                    class338.field2448[0].method2590(var25, 4);
                }

                if (class137.field1213[0] == 0 && class137.field1212[0] == 1) {
                    class338.field2448[3].method2590(var25 + 15, 4);
                } else {
                    class338.field2448[1].method2590(var25 + 15, 4);
                }

                var0.method949(class32.field473, var25 + 32, 17, 16777215, -1);
                var26 = class500.field3654 + 390;
                if (class137.field1213[0] == 1 && class137.field1212[0] == 0) {
                    class338.field2448[2].method2590(var26, 4);
                } else {
                    class338.field2448[0].method2590(var26, 4);
                }

                if (class137.field1213[0] == 1 && class137.field1212[0] == 1) {
                    class338.field2448[3].method2590(var26 + 15, 4);
                } else {
                    class338.field2448[1].method2590(var26 + 15, 4);
                }

                var0.method949(class32.field474, var26 + 32, 17, 16777215, -1);
                var33 = 500 + class500.field3654;
                if (class137.field1213[0] == 2 && class137.field1212[0] == 0) {
                    class338.field2448[2].method2590(var33, 4);
                } else {
                    class338.field2448[0].method2590(var33, 4);
                }

                if (class137.field1213[0] == 2 && class137.field1212[0] == 1) {
                    class338.field2448[3].method2590(var33 + 15, 4);
                } else {
                    class338.field2448[1].method2590(var33 + 15, 4);
                }

                var0.method949(class32.field475, var33 + 32, 17, 16777215, -1);
                var28 = 610 + class500.field3654;
                if (class137.field1213[0] == 3 && class137.field1212[0] == 0) {
                    class338.field2448[2].method2590(var28, 4);
                } else {
                    class338.field2448[0].method2590(var28, 4);
                }

                if (class137.field1213[0] == 3 && class137.field1212[0] == 1) {
                    class338.field2448[3].method2590(var28 + 15, 4);
                } else {
                    class338.field2448[1].method2590(var28 + 15, 4);
                }

                var0.method949(class32.field476, var28 + 32, 17, 16777215, -1);
            }

            class415.method1914(708 + class500.field3654, 4, 50, 16, 0);
            var1.method928(class32.field416, 25 + 708 + class500.field3654, 16, 16777215, -1);
            class500.field3680 = -1;
            if (class112.field1051 != null) {
                var4 = true;
                var5 = true;
                var33 = 7;
                var28 = 24;

                do {
                    var31 = var28;
                    var32 = var33;
                    if (var28 * (var33 - 1) >= class137.field1215) {
                        --var33;
                    }

                    if ((var28 - 1) * var33 >= class137.field1215) {
                        --var28;
                    }

                    if (var33 * (var28 - 1) >= class137.field1215) {
                        --var28;
                    }
                } while (var31 != var28 || var32 != var33);

                var31 = (765 - 88 * var33) / (var33 + 1);
                if (var31 > 5) {
                    var31 = 5;
                }

                var32 = (480 - 19 * var28) / (var28 + 1);
                if (var32 > 5) {
                    var32 = 5;
                }

                var10 = (765 - var33 * 88 - (var33 - 1) * var31) / 2;
                int var37 = (480 - var28 * 19 - (var28 - 1) * var32) / 2;
                var36 = (class137.field1215 + var28 - 1) / var28;
                class500.field3686 = var36 - var33;
                if (class496.field3631 != null && class500.field3681 > 0) {
                    class496.field3631.method2590(8, class519.field4188 / 2 - class496.field3631.field4286 / 2);
                }

                if (null != class222.field1762 && class500.field3681 < class500.field3686) {
                    class222.field1762.method2590(class223.field1763 - class222.field1762.field4285 - 8, class519.field4188 / 2 - class222.field1762.field4286 / 2);
                }

                int var38 = var37 + 23;
                int var14 = class500.field3654 + var10;
                int var40 = 0;
                var16 = false;
                int var41 = class500.field3681;

                for (var18 = var28 * var41; var18 < class137.field1215 && var41 - class500.field3681 < var33; ++var18) {
                    class137 var42 = class521.field4197[var18];
                    boolean var20 = true;
                    String var21 = Integer.toString(var42.field1216);
                    if (var42.field1216 == -1) {
                        var21 = class32.field477;
                        var20 = false;
                    } else if (var42.field1216 > 1980) {
                        var21 = class32.field372;
                        var20 = false;
                    }

                    class71 var22 = null;
                    int var23 = 0;
                    if (var42.method626()) {
                        var22 = var42.method619() ? class71.field666 : class71.field676;
                    } else if (var42.method620()) {
                        var22 = var42.method619() ? class71.field675 : class71.field668;
                    } else if (var42.method623()) {
                        var23 = 16711680;
                        var22 = var42.method619() ? class71.field665 : class71.field660;
                    } else if (var42.method624()) {
                        var22 = var42.method619() ? class71.field664 : class71.field669;
                    } else if (var42.method629()) {
                        var22 = var42.method619() ? class71.field663 : class71.field667;
                    } else if (var42.method628()) {
                        var22 = var42.method619() ? class71.field671 : class71.field670;
                    } else if (var42.method625()) {
                        var22 = var42.method619() ? class71.field673 : class71.field672;
                    }

                    if (var22 == null || var22.field674 >= class112.field1051.length) {
                        var22 = var42.method619() ? class71.field661 : class71.field662;
                    }

                    if (class499.field3651 >= var14 && class499.field3634 >= var38 && class499.field3651 < var14 + 88 && class499.field3634 < var38 + 19 && var20) {
                        class500.field3680 = var18;
                        class112.field1051[var22.field674].method1547(var14, var38, 128, 16777215);
                        var16 = true;
                    } else {
                        class112.field1051[var22.field674].method1543(var14, var38);
                    }

                    if (class56.field601 != null) {
                        class56.field601[(var42.method619() ? 8 : 0) + var42.field1219].method2590(var14 + 29, var38);
                    }

                    var0.method928(Integer.toString(var42.field1214), var14 + 15, 5 + var38 + 9, var23, -1);
                    var1.method928(var21, var14 + 60, 5 + 9 + var38, 268435455, -1);
                    var38 += 19 + var32;
                    ++var40;
                    if (var40 >= var28) {
                        var38 = var37 + 23;
                        var14 += 88 + var31;
                        var40 = 0;
                        ++var41;
                    }
                }

                if (var16) {
                    var18 = var1.method921(class521.field4197[class500.field3680].field1218) + 6;
                    int var43 = var1.field1617 + 8;
                    int var44 = class499.field3634 + 25;
                    if (var43 + var44 > 480) {
                        var44 = class499.field3634 - 25 - var43;
                    }

                    class415.method1914(class499.field3651 - var18 / 2, var44, var18, var43, 16777120);
                    class415.method1917(class499.field3651 - var18 / 2, var44, var18, var43, 0);
                    var1.method928(class521.field4197[class500.field3680].field1218, class499.field3651, var44 + var1.field1617 + 4, 0, -1);
                }
            }

        } else {
            class500.field3658.method1543(class500.field3654, 0);
            class8.field44.method1543(class500.field3654 + 382, 0);
            class352.field2545.method2590(382 + class500.field3654 - class352.field2545.field4285 / 2, 18);
            if (Client.field3859 == 0 || Client.field3859 == 5) {
                var4 = true;
                var0.method928(class32.field363, class500.field3660 + 180, 225, 16777215, -1);
                var5 = true;
                class415.method1917(180 + class500.field3660 - 152, 233, 304, 34, 9179409);
                class415.method1917(180 + class500.field3660 - 151, 234, 302, 32, 0);
                class415.method1914(180 + class500.field3660 - 150, 235, class500.field3661 * 3, 30, 9179409);
                class415.method1914(180 + class500.field3660 - 150 + class500.field3661 * 3, 235, 300 - class500.field3661 * 3, 30, 0);
                var0.method928(class500.field3662, 180 + class500.field3660, 256, 16777215, -1);
            }

            String var6;
            String var7;
            String var8;
            String var9;
            short var24;
            if (Client.field3859 == 20) {
                class500.field3656.method2590(180 + class500.field3660 - class500.field3656.field4285 / 2, 271 - class500.field3656.field4286 / 2);
                var24 = 201;
                var0.method928(class500.field3669, 180 + class500.field3660, 201, 16776960, 0);
                var25 = var24 + 15;
                var0.method928(class500.field3667, 180 + class500.field3660, 216, 16776960, 0);
                var25 += 15;
                var0.method928(class500.field3668, 180 + class500.field3660, 231, 16776960, 0);
                var25 += 15;
                var25 += 7;
                if (class500.field3665 != 4 && class500.field3665 != 10) {
                    var0.method949(class32.field409, 180 + class500.field3660 - 110, 253, 16777215, 0);
                    var5 = true;

                    for (var6 = class500.method2263(); var0.method921(var6) > 200; var6 = var6.substring(0, var6.length() - 1)) {
                    }

                    var0.method949(class197.method934(var6), class500.field3660 + 180 - 70, 253, 16777215, 0);
                    var25 += 15;
                    var8 = class500.field3671;
                    var7 = class95.method376('*', var8.length());

                    for (var9 = var7; var0.method921(var9) > 200; var9 = var9.substring(1)) {
                    }

                    var0.method949(class32.field410 + var9, 180 + class500.field3660 - 108, 268, 16777215, 0);
                    var25 += 15;
                }
            }

            boolean var27;
            boolean var29;
            if (Client.field3859 == 10 || Client.field3859 == 11 || Client.field3859 == 50) {
                class500.field3656.method2590(class500.field3660, 171);
                if (class500.field3665 == 0) {
                    var24 = 251;
                    var0.method928(class32.field454, 180 + class500.field3660, 251, 16776960, 0);
                    var25 = var24 + 30;
                    var26 = class500.field3660 + 180 - 80;
                    var27 = true;
                    class268.field1974.method2590(var26 - 73, 271);
                    var0.method920(class32.field413, var26 - 73, 271, 144, 40, 16777215, 0, 1, 1, 0);
                    var26 = 80 + class500.field3660 + 180;
                    class268.field1974.method2590(var26 - 73, 271);
                    var0.method920(class32.field414, var26 - 73, 271, 144, 40, 16777215, 0, 1, 1, 0);
                } else if (class500.field3665 == 1) {
                    var0.method928(class500.field3687, class500.field3660 + 180, 201, 16776960, 0);
                    var24 = 236;
                    var0.method928(class500.field3669, 180 + class500.field3660, 236, 16777215, 0);
                    var25 = var24 + 15;
                    var0.method928(class500.field3667, 180 + class500.field3660, 251, 16777215, 0);
                    var25 += 15;
                    var0.method928(class500.field3668, class500.field3660 + 180, 266, 16777215, 0);
                    var25 += 15;
                    var26 = class500.field3660 + 180 - 80;
                    var27 = true;
                    class268.field1974.method2590(var26 - 73, 301);
                    var0.method928(class32.field179, var26, 326, 16777215, 0);
                    var26 = 80 + 180 + class500.field3660;
                    class268.field1974.method2590(var26 - 73, 301);
                    var0.method928(class32.field416, var26, 326, 16777215, 0);
                } else {
                    class539 var11;
                    boolean var13;
                    if (class500.field3665 == 2) {
                        var24 = 201;
                        var0.method928(class500.field3669, class317.field2287, 201, 16776960, 0);
                        var25 = var24 + 15;
                        var0.method928(class500.field3667, class317.field2287, 216, 16776960, 0);
                        var25 += 15;
                        var0.method928(class500.field3668, class317.field2287, 231, 16776960, 0);
                        var25 += 15;
                        var25 += 7;
                        var0.method949(class32.field409, class317.field2287 - 110, 253, 16777215, 0);
                        var5 = true;

                        for (var6 = class500.method2263(); var0.method921(var6) > 200; var6 = var6.substring(1)) {
                        }

                        var0.method949(class197.method934(var6) + (class500.field3676 == 0 & Client.field4078 % 40 < 20 ? class49.method140(16776960) + class49.field552 : ""), class317.field2287 - 70, 253, 16777215, 0);
                        var25 += 15;
                        var8 = class500.field3671;
                        var7 = class95.method376('*', var8.length());

                        for (var9 = var7; var0.method921(var9) > 200; var9 = var9.substring(1)) {
                        }

                        var0.method949(class32.field410 + var9 + (class500.field3676 == 1 & Client.field4078 % 40 < 20 ? class49.method140(16776960) + class49.field552 : ""), class317.field2287 - 108, 268, 16777215, 0);
                        var25 += 15;
                        var24 = 277;
                        var10 = -117 + class317.field2287;
                        boolean var12 = Client.field3829;
                        var13 = class500.field3659;
                        var11 = var12 ? (var13 ? class375.field2723 : class335.field2436) : (var13 ? class339.field2451 : class500.field3653);
                        var11.method2590(var10, 277);
                        var10 += var11.field4285 + 5;
                        var1.method949(class32.field417, var10, 290, 16776960, 0);
                        var10 = 24 + class317.field2287;
                        var16 = class290.field2121.method2532();
                        boolean var17 = class500.field3682;
                        class539 var15 = var16 ? (var17 ? class375.field2723 : class335.field2436) : (var17 ? class339.field2451 : class500.field3653);
                        var15.method2590(var10, 277);
                        var10 += var15.field4285 + 5;
                        var1.method949(class32.field371, var10, 290, 16776960, 0);
                        var25 = var24 + 15;
                        var18 = class317.field2287 - 80;
                        boolean var19 = true;
                        class268.field1974.method2590(var18 - 73, 301);
                        var0.method928(class32.field370, var18, 326, 16777215, 0);
                        var18 = 80 + class317.field2287;
                        class268.field1974.method2590(var18 - 73, 301);
                        var0.method928(class32.field416, var18, 326, 16777215, 0);
                        var4 = true;
                        if (class500.field3664 == 2) {
                            class270.field1991 = class32.field430;
                        } else {
                            class270.field1991 = class32.field381;
                        }

                        class259.field1933 = new class8(class317.field2287, 357, var1.method921(class270.field1991), 11);
                        class399.field2821 = new class8(class317.field2287, 357, var1.method921(class32.field429), 11);
                        var1.method928(class270.field1991, class317.field2287, 357, 16777215, 0);
                    } else if (class500.field3665 == 3) {
                        var24 = 201;
                        var0.method928(class32.field424, 180 + class500.field3660, 201, 16776960, 0);
                        var25 = var24 + 20;
                        var1.method928(class32.field236, class500.field3660 + 180, 221, 16776960, 0);
                        var25 += 20;
                        var1.method928(class32.field421, 180 + class500.field3660, 241, 16776960, 0);
                        var25 += 15;
                        var26 = class500.field3660 + 180;
                        var27 = true;
                        class268.field1974.method2590(var26 - 73, 256);
                        var2.method928(class32.field422, var26, 281, 16777215, 0);
                        var26 = class500.field3660 + 180;
                        var27 = true;
                        class268.field1974.method2590(var26 - 73, 306);
                        var2.method928(class32.field423, var26, 331, 16777215, 0);
                    } else if (class500.field3665 == 4) {
                        var0.method928(class32.field399, 180 + class500.field3660, 201, 16776960, 0);
                        var24 = 236;
                        var0.method928(class500.field3669, 180 + class500.field3660, 236, 16777215, 0);
                        var25 = var24 + 15;
                        var0.method928(class500.field3667, 180 + class500.field3660, 251, 16777215, 0);
                        var25 += 15;
                        var0.method928(class500.field3668, class500.field3660 + 180, 266, 16777215, 0);
                        var25 += 15;
                        var6 = class32.field411;
                        var8 = class349.field2533;
                        var7 = class95.method376('*', var8.length());
                        var0.method949(var6 + var7 + (Client.field4078 % 40 < 20 ? class49.method140(16776960) + class49.field552 : ""), class500.field3660 + 180 - 108, 281, 16777215, 0);
                        var25 -= 8;
                        var0.method949(class32.field182, class500.field3660 + 180 - 9, 273, 16776960, 0);
                        var25 += 15;
                        var0.method949(class32.field299, 180 + class500.field3660 - 9, 288, 16776960, 0);
                        var32 = class500.field3660 + 180 - 9 + var0.method921(class32.field299) + 15;
                        var10 = 288 - var0.field1617;
                        if (class500.field3675) {
                            var11 = class335.field2436;
                        } else {
                            var11 = class500.field3653;
                        }

                        var11.method2590(var32, var10);
                        var25 += 15;
                        var36 = class500.field3660 + 180 - 80;
                        var13 = true;
                        class268.field1974.method2590(var36 - 73, 301);
                        var0.method928(class32.field179, var36, 326, 16777215, 0);
                        var36 = 80 + 180 + class500.field3660;
                        class268.field1974.method2590(var36 - 73, 301);
                        var0.method928(class32.field416, var36, 326, 16777215, 0);
                        var1.method928(class32.field381, class500.field3660 + 180, 357, 16777215, 0);
                    } else if (class500.field3665 == 5) {
                        var0.method928(class32.field373, 180 + class500.field3660, 201, 16776960, 0);
                        var24 = 221;
                        var2.method928(class500.field3669, class500.field3660 + 180, 221, 16776960, 0);
                        var25 = var24 + 15;
                        var2.method928(class500.field3667, class500.field3660 + 180, 236, 16776960, 0);
                        var25 += 15;
                        var2.method928(class500.field3668, 180 + class500.field3660, 251, 16776960, 0);
                        var25 += 15;
                        var25 += 14;
                        var0.method949(class32.field295, class500.field3660 + 180 - 145, 280, 16777215, 0);
                        var5 = true;

                        for (var6 = class500.method2263(); var0.method921(var6) > 174; var6 = var6.substring(1)) {
                        }

                        var0.method949(class197.method934(var6) + (Client.field4078 % 40 < 20 ? class49.method140(16776960) + class49.field552 : ""), 180 + class500.field3660 - 34, 280, 16777215, 0);
                        var25 += 15;
                        var28 = 180 + class500.field3660 - 80;
                        boolean var30 = true;
                        class268.field1974.method2590(var28 - 73, 301);
                        var0.method928(class32.field426, var28, 326, 16777215, 0);
                        var28 = 80 + 180 + class500.field3660;
                        class268.field1974.method2590(var28 - 73, 301);
                        var0.method928(class32.field466, var28, 326, 16777215, 0);
                        var30 = true;
                        var1.method928(class32.field429, class317.field2287, 356, 268435455, 0);
                    } else if (class500.field3665 == 6) {
                        var24 = 201;
                        var0.method928(class500.field3669, 180 + class500.field3660, 201, 16776960, 0);
                        var25 = var24 + 15;
                        var0.method928(class500.field3667, class500.field3660 + 180, 216, 16776960, 0);
                        var25 += 15;
                        var0.method928(class500.field3668, 180 + class500.field3660, 231, 16776960, 0);
                        var25 += 15;
                        var26 = 180 + class500.field3660;
                        var27 = true;
                        class268.field1974.method2590(var26 - 73, 301);
                        var0.method928(class32.field466, var26, 326, 16777215, 0);
                    } else if (class500.field3665 == 7) {
                        if (class4.field21 && !Client.field4010) {
                            var24 = 201;
                            var0.method928(class500.field3669, class317.field2287, 201, 16776960, 0);
                            var25 = var24 + 15;
                            var0.method928(class500.field3667, class317.field2287, 216, 16776960, 0);
                            var25 += 15;
                            var0.method928(class500.field3668, class317.field2287, 231, 16776960, 0);
                            var26 = class317.field2287 - 150;
                            var25 += 10;

                            for (var33 = 0; var33 < 8; ++var33) {
                                class268.field1974.method2589(var26, 241, 30, 40);
                                var29 = class500.field3670 == var33 & Client.field4078 % 40 < 20;
                                var0.method949((class500.field3673[var33] == null ? "" : class500.field3673[var33]) + (var29 ? class49.method140(16776960) + class49.field552 : ""), var26 + 10, 268, 16777215, 0);
                                if (var33 != 1 && var33 != 3) {
                                    var26 += 35;
                                } else {
                                    var26 += 50;
                                    var0.method949(class197.method934("/"), var26 - 13, 268, 16777215, 0);
                                }
                            }

                            var33 = class317.field2287 - 80;
                            var29 = true;
                            class268.field1974.method2590(var33 - 73, 301);
                            var0.method928("Submit", var33, 326, 16777215, 0);
                            var33 = class317.field2287 + 80;
                            class268.field1974.method2590(var33 - 73, 301);
                            var0.method928(class32.field416, var33, 326, 16777215, 0);
                        } else {
                            var24 = 216;
                            var0.method928(class32.field451, 180 + class500.field3660, 216, 16776960, 0);
                            var25 = var24 + 15;
                            var2.method928(class32.field456, class500.field3660 + 180, 231, 16776960, 0);
                            var25 += 15;
                            var2.method928(class32.field457, class500.field3660 + 180, 246, 16776960, 0);
                            var25 += 15;
                            var26 = class500.field3660 + 180 - 80;
                            var27 = true;
                            class268.field1974.method2590(var26 - 73, 301);
                            var0.method928(class32.field458, var26, 326, 16777215, 0);
                            var26 = 180 + class500.field3660 + 80;
                            class268.field1974.method2590(var26 - 73, 301);
                            var0.method928(class32.field466, var26, 326, 16777215, 0);
                        }
                    } else if (class500.field3665 == 8) {
                        var24 = 216;
                        var0.method928(class32.field312, 180 + class500.field3660, 216, 16776960, 0);
                        var25 = var24 + 15;
                        var2.method928(class32.field354, 180 + class500.field3660, 231, 16776960, 0);
                        var25 += 15;
                        var2.method928(class32.field323, class500.field3660 + 180, 246, 16776960, 0);
                        var25 += 15;
                        var26 = 180 + class500.field3660 - 80;
                        var27 = true;
                        class268.field1974.method2590(var26 - 73, 301);
                        var0.method928(class32.field427, var26, 326, 16777215, 0);
                        var26 = 80 + class500.field3660 + 180;
                        class268.field1974.method2590(var26 - 73, 301);
                        var0.method928(class32.field466, var26, 326, 16777215, 0);
                    } else if (class500.field3665 == 9) {
                        var24 = 221;
                        var0.method928(class500.field3669, class500.field3660 + 180, 221, 16776960, 0);
                        var25 = var24 + 25;
                        var0.method928(class500.field3667, 180 + class500.field3660, 246, 16776960, 0);
                        var25 += 25;
                        var0.method928(class500.field3668, 180 + class500.field3660, 271, 16776960, 0);
                        var26 = 180 + class500.field3660;
                        var27 = true;
                        class268.field1974.method2590(var26 - 73, 291);
                        var0.method928(class32.field422, var26, 316, 16777215, 0);
                    } else {
                        short var35;
                        if (class500.field3665 == 10) {
                            var25 = class500.field3660 + 180;
                            var35 = 209;
                            var0.method928(class32.field454, class500.field3660 + 180, 209, 16776960, 0);
                            var26 = var35 + 20;
                            class500.field3657.method2590(var25 - 109, 229);
                            if (class500.field3672.isEmpty()) {
                                class163.field1424.method2590(var25 - 48, 247);
                            } else {
                                class163.field1424.method2590(var25 - 48, 234);
                                var0.method928(class500.field3672, var25, 282, 16776960, 0);
                            }
                        } else if (class500.field3665 == 12) {
                            var25 = class317.field2287;
                            var35 = 216;
                            var2.method928(class32.field462, var25, 216, 16777215, 0);
                            var26 = var35 + 17;
                            var2.method928(class32.field463, var25, 233, 16777215, 0);
                            var26 += 17;
                            var2.method928(class32.field464, var25, 250, 16777215, 0);
                            var26 += 17;
                            var2.method928(class32.field465, var25, 267, 16777215, 0);
                            var25 = class317.field2287 - 80;
                            var5 = true;
                            class268.field1974.method2590(var25 - 73, 291);
                            var0.method928(class32.field284, var25, 316, 16777215, 0);
                            var25 = class317.field2287 + 80;
                            class268.field1974.method2590(var25 - 73, 291);
                            var0.method928(class32.field469, var25, 316, 16777215, 0);
                        } else if (class500.field3665 == 13) {
                            var24 = 231;
                            var2.method928(class32.field229, 180 + class500.field3660, 231, 16777215, 0);
                            var25 = var24 + 20;
                            var2.method928(class32.field467, 180 + class500.field3660, 251, 16777215, 0);
                            var26 = class500.field3660 + 180;
                            var4 = true;
                            class268.field1974.method2590(var26 - 73, 291);
                            var0.method928(class32.field466, var26, 316, 16777215, 0);
                        } else if (class500.field3665 == 14) {
                            var24 = 201;
                            String var39 = "";
                            var6 = "";
                            var7 = "";
                            switch (class500.field3663) {
                                case 0:
                                    var39 = class32.field278;
                                    var6 = class32.field218;
                                    var7 = class32.field230;
                                    break;
                                case 1:
                                    var39 = class32.field267;
                                    var6 = class32.field268;
                                    var7 = class32.field269;
                                    break;
                                case 2:
                                    var39 = class32.field263;
                                    var6 = class32.field271;
                                    var7 = class32.field305;
                                    break;
                                default:
                                    class311.method1371(false);
                            }

                            var0.method928(var39, 180 + class500.field3660, 201, 16776960, 0);
                            var25 = var24 + 20;
                            var0.method928(var6, class500.field3660 + 180, 221, 16776960, 0);
                            var25 += 20;
                            var0.method928(var7, 180 + class500.field3660, 241, 16776960, 0);
                            var31 = class500.field3660 + 180;
                            boolean var34 = true;
                            class268.field1974.method2590(var31 - 73, 256);
                            if (class500.field3663 == 1) {
                                var0.method928(class32.field212, var31, 281, 16777215, 0);
                            } else {
                                var0.method928(class32.field289, var31, 281, 16777215, 0);
                            }

                            var31 = class500.field3660 + 180;
                            var34 = true;
                            class268.field1974.method2590(var31 - 73, 306);
                            var0.method928(class32.field466, var31, 331, 16777215, 0);
                        } else if (class500.field3665 == 24) {
                            var24 = 221;
                            var0.method928(class500.field3669, class500.field3660 + 180, 221, 16777215, 0);
                            var25 = var24 + 15;
                            var0.method928(class500.field3667, 180 + class500.field3660, 236, 16777215, 0);
                            var25 += 15;
                            var0.method928(class500.field3668, class500.field3660 + 180, 251, 16777215, 0);
                            var25 += 15;
                            var26 = class500.field3660 + 180;
                            var27 = true;
                            class268.field1974.method2590(var26 - 73, 281);
                            var0.method928(class32.field177, var26, 306, 16777215, 0);
                        } else if (class500.field3665 == 32) {
                            var24 = 216;
                            var0.method928(class32.field451, 180 + class500.field3660, 216, 16776960, 0);
                            var25 = var24 + 15;
                            var2.method928(class32.field456, 180 + class500.field3660, 231, 16776960, 0);
                            var25 += 15;
                            var2.method928(class32.field457, 180 + class500.field3660, 246, 16776960, 0);
                            var25 += 15;
                            var26 = class500.field3660 + 180 - 80;
                            var27 = true;
                            class268.field1974.method2590(var26 - 73, 301);
                            var0.method928(class32.field458, var26, 326, 16777215, 0);
                            var26 = 180 + class500.field3660 + 80;
                            class268.field1974.method2590(var26 - 73, 301);
                            var0.method928(class32.field466, var26, 326, 16777215, 0);
                        } else if (class500.field3665 == 33) {
                            var24 = 201;
                            var0.method928(class500.field3669, 180 + class500.field3660, 201, 16776960, 0);
                            var25 = var24 + 20;
                            var1.method928(class500.field3667, class500.field3660 + 180, 221, 16776960, 0);
                            var25 += 20;
                            var1.method928(class500.field3668, class500.field3660 + 180, 241, 16776960, 0);
                            var25 += 15;
                            var26 = class500.field3660 + 180;
                            var27 = true;
                            class268.field1974.method2590(var26 - 73, 256);
                            var2.method928(class32.field481, var26, 281, 16777215, 0);
                            var26 = class500.field3660 + 180;
                            var27 = true;
                            class268.field1974.method2590(var26 - 73, 306);
                            var2.method928(class32.field466, var26, 331, 16777215, 0);
                        }
                    }
                }
            }

            if (Client.field3859 >= 10) {
                int[] var45 = new int[4];
                class415.method1910(var45);
                class415.method1921(class500.field3654, 0, 765 + class500.field3654, class519.field4188);
                class360.field2579.method981(class500.field3654 - 22, Client.field4078);
                class360.field2579.method981(22 + 765 + class500.field3654 - 128, Client.field4078);
                class415.method1930(var45);
            }

            class179.field1520[class290.field2121.method2548() ? 1 : 0].method2590(765 + class500.field3654 - 40, 463);
            if (Client.field3859 > 5 && class492.field3618 == class404.field2860) {
                if (class102.field1001 != null) {
                    var25 = class500.field3654 + 5;
                    var5 = true;
                    var27 = true;
                    var29 = true;
                    class102.field1001.method2590(var25, 463);
                    var0.method928(class32.field352 + " " + Client.field3775, 50 + var25, 478, 16777215, 0);
                    if (null != class529.field4221) {
                        var1.method928(class32.field322, 50 + var25, 492, 16777215, 0);
                    } else {
                        var1.method928(class32.field480, 50 + var25, 492, 16777215, 0);
                    }
                } else {
                    class102.field1001 = class274.method1226(class398.field2811, "sl_button", "");
                }
            }

        }
    }

    @Override
    public void method1() {
        if (null != this.val$cc && this.val$cc.method406().field1960 != null) {
            class26 var2 = new class26();
            var2.method77(this.val$cc);
            var2.method78(this.val$cc.method406().field1960);
            Client.method2351().method126(var2);
        }

    }
}
