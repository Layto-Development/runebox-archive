public class class508 extends class510 {
    public static boolean field3716;
    public static class289 field3717;
    public static class289 field3719;
    public static class289 field3762;
    public static class68 field3715;
    static int[] field3768;

    static {
        field3717 = new class289(64);
        field3762 = new class289(50);
        field3719 = new class289(200);
    }

    public boolean field3724;
    public boolean field3764;
    public int field3712;
    public int field3713;
    public int field3714;
    public int field3718;
    public int field3722;
    public int field3726;
    public int field3727;
    public int field3728;
    public int field3730;
    public int field3731;
    public int field3732;
    public int field3733;
    public int field3734;
    public int field3735;
    public int field3754;
    public int field3759;
    public int field3760;
    public int field3761;
    public int field3767;
    public String field3736;
    public String[] field3737;
    public String[] field3738;
    public short[] field3723;
    public short[] field3725;
    public short[] field3749;
    public short[] field3755;
    class208 field3763;
    int field3720;
    int field3721;
    int field3729;
    int field3739;
    int field3740;
    int field3741;
    int field3742;
    int field3743;
    int field3744;
    int field3745;
    int field3746;
    int field3747;
    int field3748;
    int field3750;
    int field3751;
    int field3756;
    int field3757;
    int field3758;
    int field3765;
    int field3766;
    int[] field3752;
    int[] field3753;

    class508() {
        this.field3736 = class32.field483;
        this.field3735 = 2000;
        this.field3712 = 0;
        this.field3728 = 0;
        this.field3714 = 0;
        this.field3713 = 0;
        this.field3730 = 0;
        this.field3731 = 0;
        this.field3732 = 1;
        this.field3733 = -1;
        this.field3718 = -1;
        this.field3734 = -1;
        this.field3724 = false;
        this.field3737 = new String[]{null, null, class32.field336, null, null};
        this.field3738 = new String[]{null, null, null, null, class32.field345};
        this.field3739 = -2;
        this.field3766 = -1;
        this.field3741 = -1;
        this.field3742 = 0;
        this.field3743 = -1;
        this.field3744 = -1;
        this.field3745 = 0;
        this.field3765 = -1;
        this.field3747 = -1;
        this.field3746 = -1;
        this.field3750 = -1;
        this.field3729 = -1;
        this.field3751 = -1;
        this.field3754 = -1;
        this.field3727 = -1;
        this.field3756 = 128;
        this.field3757 = 128;
        this.field3758 = 128;
        this.field3759 = 0;
        this.field3760 = 0;
        this.field3761 = 0;
        this.field3722 = 0;
        this.field3764 = false;
        this.field3740 = -1;
        this.field3748 = -1;
        this.field3726 = -1;
        this.field3767 = -1;
    }

    public static class508 method2299(int var0) {
        class508 var2 = (class508) field3717.method1307(var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class209.field1684.method188(10, var0);
            var2 = new class508();
            var2.field3720 = var0;
            if (null != var3) {
                var2.method2283(new class78(var3));
            }

            var2.method2295();
            if (var2.field3727 != -1) {
                var2.method2280(method2299(var2.field3727), method2299(var2.field3754));
            }

            if (var2.field3748 != -1) {
                var2.method2294(method2299(var2.field3748), method2299(var2.field3740));
            }

            if (var2.field3767 != -1) {
                var2.method2282(method2299(var2.field3767), method2299(var2.field3726));
            }

            if (!field3716 && var2.field3724) {
                if (var2.field3727 == -1 && var2.field3748 == -1 && var2.field3767 == -1) {
                    var2.field3736 = var2.field3736 + class32.field402;
                }

                var2.field3764 = false;

                int var4;
                for (var4 = 0; var4 < var2.field3737.length; ++var4) {
                    var2.field3737[var4] = null;
                }

                for (var4 = 0; var4 < var2.field3738.length; ++var4) {
                    if (var4 != 4) {
                        var2.field3738[var4] = null;
                    }
                }

                var2.field3739 = -2;
                var2.field3761 = 0;
                if (null != var2.field3763) {
                    boolean var7 = false;

                    for (class70 var5 = var2.field3763.method992(); var5 != null; var5 = var2.field3763.method993()) {
                        class243 var6 = class243.method1090((int) var5.field658);
                        if (var6.field1855) {
                            var5.method221();
                        } else {
                            var7 = true;
                        }
                    }

                    if (!var7) {
                        var2.field3763 = null;
                    }
                }
            }

            field3717.method1306(var2, var0);
            return var2;
        }
    }

    public static final class331 method2297(int var0, int var1, int var2, int var3, int var4, boolean var5) {
        if (var1 == -1) {
            var4 = 0;
        } else if (var4 == 2 && var1 != 1) {
            var4 = 1;
        }

        long var7 = ((long) var4 << 40) + ((long) var2 << 38) + ((long) var1 << 16) + (long) var0 + ((long) var3 << 42);
        class331 var9;
        if (!var5) {
            var9 = (class331) field3719.method1307(var7);
            if (var9 != null) {
                return var9;
            }
        }

        class508 var10 = method2299(var0);
        if (var1 > 1 && null != var10.field3752) {
            int var11 = -1;

            for (int var12 = 0; var12 < 10; ++var12) {
                if (var1 >= var10.field3753[var12] && var10.field3753[var12] != 0) {
                    var11 = var10.field3752[var12];
                }
            }

            if (var11 != -1) {
                var10 = method2299(var11);
            }
        }

        class448 var23 = var10.method2284(1);
        if (var23 == null) {
            return null;
        } else {
            class331 var24 = null;
            if (var10.field3727 != -1) {
                var24 = method2297(var10.field3754, 10, 1, 0, 0, true);
                if (null == var24) {
                    return null;
                }
            } else if (var10.field3748 != -1) {
                var24 = method2297(var10.field3740, var1, var2, var3, 0, false);
                if (var24 == null) {
                    return null;
                }
            } else if (var10.field3767 != -1) {
                var24 = method2297(var10.field3726, var1, 0, 0, 0, false);
                if (null == var24) {
                    return null;
                }
            }

            int[] var13 = class415.field2905;
            int var14 = class415.field2903;
            int var15 = class415.field2904;
            float[] var16 = class415.field2906;
            int[] var17 = new int[4];
            class415.method1910(var17);
            var9 = new class331(36, 32);
            class334.method1578(var9.field2422, 36, 32, null);
            class415.method1911();
            class334.method1579();
            class334.method1590(16, 16);
            class334.field2431.field2605 = false;
            if (var10.field3767 != -1) {
                var24.method1563(0, 0);
            }

            int var18 = var10.field3735;
            if (var5) {
                var18 = (int) ((double) var18 * 1.5D);
            } else if (var2 == 2) {
                var18 = (int) ((double) var18 * 1.04D);
            }

            int var19 = class334.field2429[var10.field3712] * var18 >> 16;
            int var20 = class334.field2427[var10.field3712] * var18 >> 16;
            var23.method2045();
            var23.method2051(0, var10.field3728, var10.field3714, var10.field3712, var10.field3713, var19 + var23.field3601 / 2 + var10.field3730, var10.field3730 + var20);
            if (var10.field3748 != -1) {
                var24.method1563(0, 0);
            }

            if (var2 >= 1) {
                var9.method1541(1);
            }

            if (var2 >= 2) {
                var9.method1541(16777215);
            }

            if (var3 != 0) {
                var9.method1542(var3);
            }

            class334.method1578(var9.field2422, 36, 32, null);
            if (var10.field3727 != -1) {
                var24.method1563(0, 0);
            }

            if (var4 == 1 || var4 == 2 && var10.field3731 == 1) {
                class413 var21 = class317.field2286;
                String var22;
                if (var1 < 100000) {
                    var22 = "<col=ffff00>" + var1 + "</col>";
                } else if (var1 < 10000000) {
                    var22 = "<col=ffffff>" + var1 / 1000 + class32.field351 + "</col>";
                } else {
                    var22 = "<col=00ff80>" + var1 / 1000000 + class32.field349 + "</col>";
                }

                var21.method949(var22, 0, 9, 16776960, 1);
            }

            if (!var5) {
                field3719.method1306(var9, var7);
            }

            class334.method1578(var13, var14, var15, var16);
            class415.method1930(var17);
            class334.method1579();
            class334.field2431.field2605 = true;
            return var9;
        }
    }

    public static void method2298() {
        field3719.method1304();
    }

    void method2295() {
        if (this.field3731 == 1) {
            this.field3722 = 0;
        }

    }

    void method2283(class78 var1) {
        while (true) {
            int var3 = var1.method260();
            if (var3 == 0) {
                return;
            }

            this.method2279(var1, var3);
        }
    }

    void method2279(class78 var1, int var2) {
        if (var2 == 1) {
            this.field3721 = var1.method309();
        } else if (var2 == 2) {
            this.field3736 = var1.method268();
        } else if (var2 == 4) {
            this.field3735 = var1.method309();
        } else if (var2 == 5) {
            this.field3712 = var1.method309();
        } else if (var2 == 6) {
            this.field3728 = var1.method309();
        } else if (var2 == 7) {
            this.field3713 = var1.method309();
            if (this.field3713 > 32767) {
                this.field3713 -= 65536;
            }
        } else if (var2 == 8) {
            this.field3730 = var1.method309();
            if (this.field3730 > 32767) {
                this.field3730 -= 65536;
            }
        } else if (var2 == 9) {
            var1.method268();
        } else if (var2 == 11) {
            this.field3731 = 1;
        } else if (var2 == 12) {
            this.field3732 = var1.method264();
        } else if (var2 == 13) {
            this.field3733 = var1.method260();
        } else if (var2 == 14) {
            this.field3718 = var1.method260();
        } else if (var2 == 16) {
            this.field3724 = true;
        } else if (var2 == 23) {
            this.field3766 = var1.method309();
            this.field3742 = var1.method260();
        } else if (var2 == 24) {
            this.field3741 = var1.method309();
        } else if (var2 == 25) {
            this.field3743 = var1.method309();
            this.field3745 = var1.method260();
        } else if (var2 == 26) {
            this.field3744 = var1.method309();
        } else if (var2 == 27) {
            this.field3734 = var1.method260();
        } else if (var2 >= 30 && var2 < 35) {
            this.field3737[var2 - 30] = var1.method268();
            if (this.field3737[var2 - 30].equalsIgnoreCase(class32.field425)) {
                this.field3737[var2 - 30] = null;
            }
        } else if (var2 >= 35 && var2 < 40) {
            this.field3738[var2 - 35] = var1.method268();
        } else {
            int var4;
            int var5;
            if (var2 == 40) {
                var4 = var1.method260();
                this.field3755 = new short[var4];
                this.field3723 = new short[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field3755[var5] = (short) var1.method309();
                    this.field3723[var5] = (short) var1.method309();
                }
            } else if (var2 == 41) {
                var4 = var1.method260();
                this.field3749 = new short[var4];
                this.field3725 = new short[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field3749[var5] = (short) var1.method309();
                    this.field3725[var5] = (short) var1.method309();
                }
            } else if (var2 == 42) {
                this.field3739 = var1.method261();
            } else if (var2 == 65) {
                this.field3764 = true;
            } else if (var2 == 75) {
                this.field3722 = var1.method262();
            } else if (var2 == 78) {
                this.field3765 = var1.method309();
            } else if (var2 == 79) {
                this.field3747 = var1.method309();
            } else if (var2 == 90) {
                this.field3746 = var1.method309();
            } else if (var2 == 91) {
                this.field3729 = var1.method309();
            } else if (var2 == 92) {
                this.field3750 = var1.method309();
            } else if (var2 == 93) {
                this.field3751 = var1.method309();
            } else if (var2 == 94) {
                var1.method309();
            } else if (var2 == 95) {
                this.field3714 = var1.method309();
            } else if (var2 == 97) {
                this.field3754 = var1.method309();
            } else if (var2 == 98) {
                this.field3727 = var1.method309();
            } else if (var2 >= 100 && var2 < 110) {
                if (this.field3752 == null) {
                    this.field3752 = new int[10];
                    this.field3753 = new int[10];
                }

                this.field3752[var2 - 100] = var1.method309();
                this.field3753[var2 - 100] = var1.method309();
            } else if (var2 == 110) {
                this.field3756 = var1.method309();
            } else if (var2 == 111) {
                this.field3757 = var1.method309();
            } else if (var2 == 112) {
                this.field3758 = var1.method309();
            } else if (var2 == 113) {
                this.field3759 = var1.method261();
            } else if (var2 == 114) {
                this.field3760 = var1.method261() * 5;
            } else if (var2 == 115) {
                this.field3761 = var1.method260();
            } else if (var2 == 139) {
                this.field3740 = var1.method309();
            } else if (var2 == 140) {
                this.field3748 = var1.method309();
            } else if (var2 == 148) {
                this.field3726 = var1.method309();
            } else if (var2 == 149) {
                this.field3767 = var1.method309();
            } else if (var2 == 249) {
                this.field3763 = class381.method1774(var1, this.field3763);
            }
        }

    }

    void method2280(class508 var1, class508 var2) {
        this.field3721 = var1.field3721;
        this.field3735 = var1.field3735;
        this.field3712 = var1.field3712;
        this.field3728 = var1.field3728;
        this.field3714 = var1.field3714;
        this.field3713 = var1.field3713;
        this.field3730 = var1.field3730;
        this.field3755 = var1.field3755;
        this.field3723 = var1.field3723;
        this.field3749 = var1.field3749;
        this.field3725 = var1.field3725;
        this.field3736 = var2.field3736;
        this.field3724 = var2.field3724;
        this.field3732 = var2.field3732;
        this.field3731 = 1;
    }

    void method2294(class508 var1, class508 var2) {
        this.field3721 = var1.field3721;
        this.field3735 = var1.field3735;
        this.field3712 = var1.field3712;
        this.field3728 = var1.field3728;
        this.field3714 = var1.field3714;
        this.field3713 = var1.field3713;
        this.field3730 = var1.field3730;
        this.field3755 = var2.field3755;
        this.field3723 = var2.field3723;
        this.field3749 = var2.field3749;
        this.field3725 = var2.field3725;
        this.field3736 = var2.field3736;
        this.field3724 = var2.field3724;
        this.field3731 = var2.field3731;
        this.field3733 = var2.field3733;
        this.field3718 = var2.field3718;
        this.field3734 = var2.field3734;
        this.field3766 = var2.field3766;
        this.field3741 = var2.field3741;
        this.field3765 = var2.field3765;
        this.field3743 = var2.field3743;
        this.field3744 = var2.field3744;
        this.field3747 = var2.field3747;
        this.field3746 = var2.field3746;
        this.field3750 = var2.field3750;
        this.field3729 = var2.field3729;
        this.field3751 = var2.field3751;
        this.field3761 = var2.field3761;
        this.field3737 = var2.field3737;
        this.field3722 = var2.field3722;
        this.field3738 = new String[5];
        if (null != var2.field3738) {
			System.arraycopy(var2.field3738, 0, this.field3738, 0, 4);
        }

        this.field3738[4] = class32.field211;
        this.field3732 = 0;
    }

    void method2282(class508 var1, class508 var2) {
        this.field3721 = var1.field3721;
        this.field3735 = var1.field3735;
        this.field3712 = var1.field3712;
        this.field3728 = var1.field3728;
        this.field3714 = var1.field3714;
        this.field3713 = var1.field3713;
        this.field3730 = var1.field3730;
        this.field3755 = var1.field3755;
        this.field3723 = var1.field3723;
        this.field3749 = var1.field3749;
        this.field3725 = var1.field3725;
        this.field3731 = var1.field3731;
        this.field3736 = var2.field3736;
        this.field3732 = 0;
        this.field3724 = false;
        this.field3764 = false;
    }

    public final class175 method2289(int var1) {
        int var4;
        if (null != this.field3752 && var1 > 1) {
            int var3 = -1;

            for (var4 = 0; var4 < 10; ++var4) {
                if (var1 >= this.field3753[var4] && this.field3753[var4] != 0) {
                    var3 = this.field3752[var4];
                }
            }

            if (var3 != -1) {
                return method2299(var3).method2289(1);
            }
        }

        class175 var5 = class175.method850(field3715, this.field3721, 0);
        if (null == var5) {
            return null;
        } else {
            if (this.field3756 != 128 || this.field3757 != 128 || this.field3758 != 128) {
                var5.method841(this.field3756, this.field3757, this.field3758);
            }

            if (this.field3755 != null) {
                for (var4 = 0; var4 < this.field3755.length; ++var4) {
                    var5.method849(this.field3755[var4], this.field3723[var4]);
                }
            }

            if (null != this.field3749) {
                for (var4 = 0; var4 < this.field3749.length; ++var4) {
                    var5.method840(this.field3749[var4], this.field3725[var4]);
                }
            }

            return var5;
        }
    }

    public final class448 method2284(int var1) {
        if (null != this.field3752 && var1 > 1) {
            int var3 = -1;

            for (int var4 = 0; var4 < 10; ++var4) {
                if (var1 >= this.field3753[var4] && this.field3753[var4] != 0) {
                    var3 = this.field3752[var4];
                }
            }

            if (var3 != -1) {
                return method2299(var3).method2284(1);
            }
        }

        class448 var6 = (class448) field3762.method1307(this.field3720);
        if (var6 != null) {
            return var6;
        } else {
            class175 var7 = class175.method850(field3715, this.field3721, 0);
            if (var7 == null) {
                return null;
            } else {
                if (this.field3756 != 128 || this.field3757 != 128 || this.field3758 != 128) {
                    var7.method841(this.field3756, this.field3757, this.field3758);
                }

                int var5;
                if (null != this.field3755) {
                    for (var5 = 0; var5 < this.field3755.length; ++var5) {
                        var7.method849(this.field3755[var5], this.field3723[var5]);
                    }
                }

                if (null != this.field3749) {
                    for (var5 = 0; var5 < this.field3749.length; ++var5) {
                        var7.method840(this.field3749[var5], this.field3725[var5]);
                    }
                }

                var6 = var7.method846(this.field3759 + 64, this.field3760 + 768, -50, -10, -50);
                var6.field3043 = true;
                field3762.method1306(var6, this.field3720);
                return var6;
            }
        }
    }

    public class508 method2285(int var1) {
        if (null != this.field3752 && var1 > 1) {
            int var3 = -1;

            for (int var4 = 0; var4 < 10; ++var4) {
                if (var1 >= this.field3753[var4] && this.field3753[var4] != 0) {
                    var3 = this.field3752[var4];
                }
            }

            if (var3 != -1) {
                return method2299(var3);
            }
        }

        return this;
    }

    public final boolean method2286(int var1) {
        int var3 = this.field3766;
        int var4 = this.field3741;
        int var5 = this.field3765;
        if (var1 == 1) {
            var3 = this.field3743;
            var4 = this.field3744;
            var5 = this.field3747;
        }

        if (var3 == -1) {
            return true;
        } else {
            boolean var6 = field3715.method190(var3, 0);

			if (var4 != -1 && !field3715.method190(var4, 0)) {
                var6 = false;
            }

            if (var5 != -1 && !field3715.method190(var5, 0)) {
                var6 = false;
            }

            return var6;
        }
    }

    public final class175 method2287(int var1) {
        int var3 = this.field3766;
        int var4 = this.field3741;
        int var5 = this.field3765;
        if (var1 == 1) {
            var3 = this.field3743;
            var4 = this.field3744;
            var5 = this.field3747;
        }

        if (var3 == -1) {
            return null;
        } else {
            class175 var6 = class175.method850(field3715, var3, 0);
            if (var4 != -1) {
                class175 var7 = class175.method850(field3715, var4, 0);
                if (var5 != -1) {
                    class175 var8 = class175.method850(field3715, var5, 0);
                    class175[] var9 = new class175[]{var6, var7, var8};
                    var6 = new class175(var9, 3);
                } else {
                    class175[] var11 = new class175[]{var6, var7};
                    var6 = new class175(var11, 2);
                }
            }

            if (var1 == 0 && this.field3742 != 0) {
                var6.method838(0, this.field3742, 0);
            }

            if (var1 == 1 && this.field3745 != 0) {
                var6.method838(0, this.field3745, 0);
            }

            int var10;
            if (this.field3755 != null) {
                for (var10 = 0; var10 < this.field3755.length; ++var10) {
                    var6.method849(this.field3755[var10], this.field3723[var10]);
                }
            }

            if (this.field3749 != null) {
                for (var10 = 0; var10 < this.field3749.length; ++var10) {
                    var6.method840(this.field3749[var10], this.field3725[var10]);
                }
            }

            return var6;
        }
    }

    public final boolean method2288(int var1) {
        int var3 = this.field3746;
        int var4 = this.field3750;
        if (var1 == 1) {
            var3 = this.field3729;
            var4 = this.field3751;
        }

        if (var3 == -1) {
            return true;
        } else {
            boolean var5 = field3715.method190(var3, 0);

			if (var4 != -1 && !field3715.method190(var4, 0)) {
                var5 = false;
            }

            return var5;
        }
    }

    public final class175 method2291(int var1) {
        int var3 = this.field3746;
        int var4 = this.field3750;
        if (var1 == 1) {
            var3 = this.field3729;
            var4 = this.field3751;
        }

        if (var3 == -1) {
            return null;
        } else {
            class175 var5 = class175.method850(field3715, var3, 0);
            if (var4 != -1) {
                class175 var6 = class175.method850(field3715, var4, 0);
                class175[] var7 = new class175[]{var5, var6};
                var5 = new class175(var7, 2);
            }

            int var8;
            if (this.field3755 != null) {
                for (var8 = 0; var8 < this.field3755.length; ++var8) {
                    var5.method849(this.field3755[var8], this.field3723[var8]);
                }
            }

            if (null != this.field3749) {
                for (var8 = 0; var8 < this.field3749.length; ++var8) {
                    var5.method840(this.field3749[var8], this.field3725[var8]);
                }
            }

            return var5;
        }
    }

    public int method2290(int var1, int var2) {
        return class381.method1773(this.field3763, var1, var2);
    }

    public String method2281(int var1, String var2) {
        class208 var5 = this.field3763;
        String var4;
        if (null == var5) {
            var4 = var2;
        } else {
            class371 var6 = (class371) var5.method990(var1);
            if (var6 == null) {
                var4 = var2;
            } else {
                var4 = (String) var6.field2646;
            }
        }

        return var4;
    }

    public int method2292() {
        if (this.field3739 != -1 && null != this.field3738) {
            if (this.field3739 >= 0) {
                return this.field3738[this.field3739] != null ? this.field3739 : -1;
            } else {
                return class32.field345.equalsIgnoreCase(this.field3738[4]) ? 4 : -1;
            }
        } else {
            return -1;
        }
    }

    boolean method2296() {
        return this.field3723 != null;
    }

    boolean method2293() {
        return this.field3725 != null;
    }
}
