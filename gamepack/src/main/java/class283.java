public final class class283 extends class514 {
    static class372 field2082;
    boolean field2071;
    boolean field2073;
    boolean field2079;
    class358 field2070;
    class448 field2066;
    class52 field2054;
    class540 field2061;
    class540 field2076;
    class540 field2077;
    int field2053;
    int field2055;
    int field2056;
    int field2058;
    int field2059;
    int field2060;
    int field2062;
    int field2063;
    int field2064;
    int field2065;
    int field2067;
    int field2068;
    int field2069;
    int field2072;
    int field2074;
    int field2075;
    int field2078;
    int field2080;
    int field2081;
    String[] field2057;

    class283() {
        this.field2055 = -1;
        this.field2056 = -1;
        this.field2057 = new String[3];

        for (int var1 = 0; var1 < 3; ++var1) {
            this.field2057[var1] = "";
        }

        this.field2059 = 0;
        this.field2067 = 0;
        this.field2062 = 0;
        this.field2072 = 0;
        this.field2071 = false;
        this.field2080 = 0;
        this.field2073 = false;
        this.field2076 = class540.field4293;
        this.field2077 = class540.field4293;
        this.field2061 = class540.field4293;
        this.field2079 = false;
    }

    void method1281(class78 var1) {
        var1.field697 = 0;
        int var3 = var1.method260();
        boolean var4 = true;
        this.field2055 = var1.method261();
        this.field2056 = var1.method261();
        int var5 = -1;
        this.field2080 = 0;
        int[] var6 = new int[12];

        int var8;
        int var9;
        int var10;
        for (int var7 = 0; var7 < 12; ++var7) {
            var8 = var1.method260();
            if (var8 == 0) {
                var6[var7] = 0;
            } else {
                var9 = var1.method260();
                var6[var7] = var9 + (var8 << 8);
                if (var7 == 0 && var6[0] == 65535) {
                    var5 = var1.method309();
                    break;
                }

                if (var6[var7] >= 512) {
                    var10 = class508.method2299(var6[var7] - 512).field3761;
                    if (var10 != 0) {
                        this.field2080 = var10;
                    }
                }
            }
        }

        int[] var28 = null;
        if (Client.field3957 >= 213) {
            var28 = new int[12];

            for (var8 = 0; var8 < 12; ++var8) {
                var9 = var1.method260();
                if (var9 == 0) {
                    var28[var8] = 0;
                } else {
                    var10 = var1.method260();
                    var28[var8] = var10 + (var9 << 8);
                }
            }
        }

        int[] var29 = new int[5];

        for (var9 = 0; var9 < 5; ++var9) {
            var10 = var1.method260();
            if (var10 < 0 || var10 >= class348.field2526[var9].length) {
                var10 = 0;
            }

            var29[var9] = var10;
        }

        super.field4097 = var1.method309();
        if (super.field4097 == 65535) {
            super.field4097 = -1;
        }

        super.field4098 = var1.method309();
        if (super.field4098 == 65535) {
            super.field4098 = -1;
        }

        super.field4159 = super.field4098;
        super.field4100 = var1.method309();
        if (super.field4100 == 65535) {
            super.field4100 = -1;
        }

        super.field4101 = var1.method309();
        if (super.field4101 == 65535) {
            super.field4101 = -1;
        }

        super.field4102 = var1.method309();
        if (super.field4102 == 65535) {
            super.field4102 = -1;
        }

        super.field4150 = var1.method309();
        if (super.field4150 == 65535) {
            super.field4150 = -1;
        }

        super.field4161 = var1.method309();
        if (super.field4161 == 65535) {
            super.field4161 = -1;
        }

        this.field2070 = new class358(var1.method268(), class492.field3622);
        this.method1283();
        this.method1286();
        this.method1296();
        if (this == class180.field1528) {
            class80.field700 = this.field2070.method1706();
        }

        this.field2059 = var1.method260();
        this.field2067 = var1.method309();
        this.field2073 = var1.method260() == 1;
        if (Client.field3800 == 0 && Client.field3863 >= 2) {
            this.field2073 = false;
        }

        class218[] var30 = null;
        boolean var31 = false;
        int var11 = var1.method309();
        var31 = (var11 >> 15 & 1) == 1;
        int var12;
        if (var11 > 0 && var11 != 32768) {
            var30 = new class218[12];

            for (var12 = 0; var12 < 12; ++var12) {
                int var13 = var11 >> 12 - var12 & 1;
                if (var13 == 1) {
                    int var17 = var6[var12] - 512;
                    int var18 = var1.method260();
                    boolean var19 = (var18 & 1) != 0;
                    boolean var20 = (var18 & 2) != 0;
                    class218 var21 = new class218(var17);
                    int var22;
                    int[] var23;
                    boolean var24;
                    int var25;
                    short var26;
                    if (var19) {
                        var22 = var1.method260();
                        var23 = new int[]{var22 & 15, var22 >> 4 & 15};
                        var24 = null != var21.field1745 && var23.length == var21.field1745.length;

                        for (var25 = 0; var25 < 2; ++var25) {
                            if (var23[var25] != 15) {
                                var26 = (short) var1.method309();
                                if (var24) {
                                    var21.field1745[var23[var25]] = var26;
                                }
                            }
                        }
                    }

                    if (var20) {
                        var22 = var1.method260();
                        var23 = new int[]{var22 & 15, var22 >> 4 & 15};
                        var24 = var21.field1746 != null && var21.field1746.length == var23.length;

                        for (var25 = 0; var25 < 2; ++var25) {
                            if (var23[var25] != 15) {
                                var26 = (short) var1.method309();
                                if (var24) {
                                    var21.field1746[var23[var25]] = var26;
                                }
                            }
                        }
                    }

                    var30[var12] = var21;
                }
            }
        }

        for (var12 = 0; var12 < 3; ++var12) {
            this.field2057[var12] = var1.method268();
        }

        int var27 = var1.method260();
        if (this.field2054 == null) {
            this.field2054 = new class52();
        }

        this.field2054.method145(var28, var6, var30, var31, var29, var3, var5, var27);
    }

    boolean method1282() {
        if (class540.field4293 == this.field2076) {
            this.method1284();
        }

        return this.field2076 == class540.field4292;
    }

    void method1283() {
        this.field2076 = class540.field4293;
    }

    void method1284() {
        this.field2076 = class153.field1320.method1995(this.field2070) ? class540.field4292 : class540.field4291;
    }

    boolean method1285() {
        if (class540.field4293 == this.field2077) {
            this.method1289();
        }

        return class540.field4292 == this.field2077;
    }

    void method1286() {
        this.field2077 = class540.field4293;
    }

    void method1289() {
        this.field2077 = null != class527.field4208 && class527.field4208.method64(this.field2070) ? class540.field4292 : class540.field4291;
    }

    void method1288() {
        for (int var2 = 0; var2 < 4; ++var2) {
            if (Client.field4019[var2] != null && Client.field4019[var2].method601(this.field2070.method1706()) != -1 && var2 != 2) {
                this.field2061 = class540.field4292;
                return;
            }
        }

        this.field2061 = class540.field4291;
    }

    void method1296() {
        this.field2061 = class540.field4293;
    }

    boolean method1292() {
        if (this.field2061 == class540.field4293) {
            this.method1288();
        }

        return this.field2061 == class540.field4292;
    }

    int method1287() {
        return null != this.field2054 && this.field2054.field575 != -1 ? class345.method1635(this.field2054.field575).field2476 : 1;
    }

    @Override
    protected class448 method2238() {
        if (null == this.field2054) {
            return null;
        } else {
            class124 var2 = super.field4136 != -1 && super.field4153 == 0 ? class124.method575(super.field4136) : null;
            class124 var3 = super.field4104 != -1 && !this.field2071 && (super.field4097 != super.field4104 || var2 == null) ? class124.method575(super.field4104) : null;
            class448 var4 = this.field2054.method156(var2, super.field4137, var3, super.field4091);
            if (null == var4) {
                return null;
            } else {
                var4.method2045();
                super.field4151 = var4.field3601;
                int var5 = var4.field3042;
                if (!this.field2071) {
                    var4 = this.method2506(var4);
                }

                if (!this.field2071 && this.field2066 != null) {
                    if (Client.field4078 >= this.field2072) {
                        this.field2066 = null;
                    }

                    if (Client.field4078 >= this.field2062 && Client.field4078 < this.field2072) {
                        class448 var6 = this.field2066;
                        var6.method2046(this.field2063 - super.field4121, this.field2064 - this.field2060, this.field2065 - super.field4092);
                        if (super.field4132 == 512) {
                            var6.method2055();
                            var6.method2055();
                            var6.method2055();
                        } else if (super.field4132 == 1024) {
                            var6.method2055();
                            var6.method2055();
                        } else if (super.field4132 == 1536) {
                            var6.method2055();
                        }

                        class448[] var7 = new class448[]{var4, var6};
                        var4 = new class448(var7, 2);
                        if (super.field4132 == 512) {
                            var6.method2055();
                        } else if (super.field4132 == 1024) {
                            var6.method2055();
                            var6.method2055();
                        } else if (super.field4132 == 1536) {
                            var6.method2055();
                            var6.method2055();
                            var6.method2055();
                        }

                        var6.method2046(super.field4121 - this.field2063, this.field2060 - this.field2064, super.field4092 - this.field2065);
                    }
                }

                var4.field3043 = true;
                if (super.field4144 != 0 && Client.field4078 >= super.field4152 && Client.field4078 < super.field4094) {
                    var4.field3098 = super.field4154;
                    var4.field3068 = super.field4112;
                    var4.field3066 = super.field4106;
                    var4.field3104 = super.field4144;
                    var4.field3105 = (short) var5;
                } else {
                    var4.field3104 = 0;
                }

                return var4;
            }
        }
    }

    void method1295(int var1, int var2, class447 var3) {
        if (super.field4136 != -1 && class124.method575(super.field4136).field1138 == 1) {
            super.field4136 = -1;
        }

        this.method2510();
        if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
            if (super.field4166[0] >= 0 && super.field4166[0] < 104 && super.field4163[0] >= 0 && super.field4163[0] < 104) {
                if (class447.field3030 == var3) {
                    class283 var5 = this;
                    class447 var6 = class447.field3030;
                    int var7 = super.field4166[0];
                    int var8 = super.field4163[0];
                    int var9 = this.method1287();
                    if (var7 >= var9 && var7 < 104 - var9 && var8 >= var9 && var8 < 104 - var9 && var1 >= var9 && var1 < 104 - var9 && var2 >= var9 && var2 < 104 - var9) {
                        int var11 = this.method1287();
                        class439 var12 = Client.method2452(var1, var2);
                        class11 var13 = Client.field3850[this.field2074];
                        int[] var14 = Client.field4076;
                        int[] var15 = Client.field4077;
                        int var10 = class216.method1019(var7, var8, var11, var12, var13, true, var14, var15, class216.field1741[0]);
                        int var16 = var10;
                        if (var10 >= 1) {
                            for (int var17 = 0; var17 < var16 - 1; ++var17) {
                                var5.method1294(Client.field4076[var17], Client.field4077[var17], var6);
                            }
                        }
                    }
                }

                this.method1294(var1, var2, var3);
            } else {
                this.method1291(var1, var2);
            }
        } else {
            this.method1291(var1, var2);
        }

    }

    void method1291(int var1, int var2) {
        super.field4139 = 0;
        super.field4155 = 0;
        super.field4165 = 0;
        super.field4166[0] = var1;
        super.field4163[0] = var2;
        int var4 = this.method1287();
        super.field4121 = 128 * super.field4166[0] + var4 * 64;
        super.field4092 = 128 * super.field4163[0] + var4 * 64;
    }

    void method1294(int var1, int var2, class447 var3) {
        if (super.field4139 < 9) {
            ++super.field4139;
        }

        for (int var5 = super.field4139; var5 > 0; --var5) {
            super.field4166[var5] = super.field4166[var5 - 1];
            super.field4163[var5] = super.field4163[var5 - 1];
            super.field4164[var5] = super.field4164[var5 - 1];
        }

        super.field4166[0] = var1;
        super.field4163[0] = var2;
        super.field4164[0] = var3;
    }

    @Override
    boolean method2501() {
        return null != this.field2054;
    }
}
