public abstract class class514 extends class490 {
    boolean field4096;
    boolean field4099;
    boolean field4113;
    boolean field4114;
    boolean field4131;
    byte field4106;
    byte field4112;
    byte field4119;
    byte field4144;
    byte field4154;
    class208 field4157;
    class247 field4125;
    class447[] field4164;
    int field4091;
    int field4092;
    int field4093;
    int field4094;
    int field4095;
    int field4097;
    int field4098;
    int field4100;
    int field4101;
    int field4102;
    int field4104;
    int field4105;
    int field4107;
    int field4108;
    int field4109;
    int field4110;
    int field4111;
    int field4115;
    int field4116;
    int field4117;
    int field4118;
    int field4121;
    int field4126;
    int field4127;
    int field4128;
    int field4129;
    int field4130;
    int field4132;
    int field4133;
    int field4134;
    int field4135;
    int field4136;
    int field4137;
    int field4138;
    int field4139;
    int field4140;
    int field4141;
    int field4142;
    int field4143;
    int field4145;
    int field4146;
    int field4147;
    int field4148;
    int field4149;
    int field4150;
    int field4151;
    int field4152;
    int field4153;
    int field4155;
    int field4156;
    int field4159;
    int field4160;
    int field4161;
    int field4165;
    int field4167;
    int[] field4103;
    int[] field4120;
    int[] field4122;
    int[] field4123;
    int[] field4124;
    int[] field4158;
    int[] field4163;
    int[] field4166;
    String field4162;

    class514() {
        this.field4099 = false;
        this.field4095 = 1;
        this.field4097 = -1;
        this.field4098 = -1;
        this.field4159 = -1;
        this.field4100 = -1;
        this.field4101 = -1;
        this.field4102 = -1;
        this.field4150 = -1;
        this.field4161 = -1;
        this.field4105 = -1;
        this.field4146 = -1;
        this.field4107 = -1;
        this.field4108 = -1;
        this.field4109 = -1;
        this.field4110 = -1;
        this.field4140 = -1;
        this.field4162 = null;
        this.field4114 = false;
        this.field4115 = 100;
        this.field4116 = 0;
        this.field4117 = 0;
        this.field4158 = null;
        this.field4119 = 0;
        this.field4120 = new int[4];
        this.field4103 = new int[4];
        this.field4122 = new int[4];
        this.field4123 = new int[4];
        this.field4124 = new int[4];
        this.field4125 = new class247();
        this.field4126 = -1;
        this.field4096 = false;
        this.field4128 = -1;
        this.field4129 = -1;
        this.field4130 = -1;
        this.field4104 = -1;
        this.field4091 = 0;
        this.field4134 = 0;
        this.field4135 = 0;
        this.field4136 = -1;
        this.field4137 = 0;
        this.field4138 = 0;
        this.field4153 = 0;
        this.field4118 = 0;
        this.field4157 = new class208(4);
        this.field4142 = 0;
        this.field4156 = 0;
        this.field4151 = 200;
        this.field4152 = -1;
        this.field4094 = -1;
        this.field4133 = 0;
        this.field4160 = 32;
        this.field4139 = 0;
        this.field4166 = new int[10];
        this.field4163 = new int[10];
        this.field4164 = new class447[10];
        this.field4165 = 0;
        this.field4155 = 0;
        this.field4167 = -1;
    }

    final void method2502() {
        this.field4139 = 0;
        this.field4155 = 0;
    }

    boolean method2501() {
        return false;
    }

    final void method2507(int var1, int var2, int var3, int var4, int var5, int var6) {
        boolean var8 = true;
        boolean var9 = true;

        int var10;
        for (var10 = 0; var10 < 4; ++var10) {
            if (this.field4122[var10] > var5) {
                var8 = false;
            } else {
                var9 = false;
            }
        }

        var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (var1 >= 0) {
            class401 var13 = class401.method1849(var1);
            var11 = var13.field2842;
            var12 = var13.field2849;
        }

        int var15;
        if (var9) {
            if (var11 == -1) {
                return;
            }

            var10 = 0;
            var15 = 0;
            if (var11 == 0) {
                var15 = this.field4122[0];
            } else if (var11 == 1) {
                var15 = this.field4103[0];
            }

            for (int var14 = 1; var14 < 4; ++var14) {
                if (var11 == 0) {
                    if (this.field4122[var14] < var15) {
                        var10 = var14;
                        var15 = this.field4122[var14];
                    }
                } else if (var11 == 1 && this.field4103[var14] < var15) {
                    var10 = var14;
                    var15 = this.field4103[var14];
                }
            }

            if (var11 == 1 && var15 >= var2) {
                return;
            }
        } else {
            if (var8) {
                this.field4119 = 0;
            }

            for (var15 = 0; var15 < 4; ++var15) {
                byte var16 = this.field4119;
                this.field4119 = (byte) ((this.field4119 + 1) % 4);
                if (this.field4122[var16] <= var5) {
                    var10 = var16;
                    break;
                }
            }
        }

        if (var10 >= 0) {
            this.field4120[var10] = var1;
            this.field4103[var10] = var2;
            this.field4123[var10] = var3;
            this.field4124[var10] = var4;
            this.field4122[var10] = var6 + var5 + var12;
        }
    }

    final void method2503(int var1, int var2, int var3, int var4, int var5, int var6) {
        class379 var9 = (class379) class379.field2745.method1307(var1);
        class379 var8;
        if (null != var9) {
            var8 = var9;
        } else {
            byte[] var10 = class379.field2744.method188(33, var1);
            var9 = new class379();
            var9.field2747 = var1;
            if (null != var10) {
                var9.method1770(new class78(var10));
            }

            class379.field2745.method1306(var9, var1);
            var8 = var9;
        }

        var9 = var8;
        class201 var15 = null;
        class201 var11 = null;
        int var12 = var8.field2749;
        int var13 = 0;

        class201 var14;
        for (var14 = (class201) this.field4125.method1106(); null != var14; var14 = (class201) this.field4125.method1102()) {
            ++var13;
            if (var9.field2747 == var14.field1649.field2747) {
                var14.method967(var2 + var4, var5, var6, var3);
                return;
            }

            if (var14.field1649.field2750 <= var9.field2750) {
                var15 = var14;
            }

            if (var14.field1649.field2749 > var12) {
                var11 = var14;
                var12 = var14.field1649.field2749;
            }
        }

        if (var11 != null || var13 < 4) {
            var14 = new class201(var9);
            if (var15 == null) {
                this.field4125.method1109(var14);
            } else {
                class247.method1107(var14, var15);
            }

            var14.method967(var2 + var4, var5, var6, var3);
            if (var13 >= 4) {
                var11.method221();
            }

        }
    }

    final void method2508(int var1) {
        class379 var4 = (class379) class379.field2745.method1307(var1);
        class379 var3;
        if (null != var4) {
            var3 = var4;
        } else {
            byte[] var5 = class379.field2744.method188(33, var1);
            var4 = new class379();
            var4.field2747 = var1;
            if (null != var5) {
                var4.method1770(new class78(var5));
            }

            class379.field2745.method1306(var4, var1);
            var3 = var4;
        }

        var4 = var3;

        for (class201 var6 = (class201) this.field4125.method1106(); var6 != null; var6 = (class201) this.field4125.method1102()) {
            if (var6.field1649 == var4) {
                var6.method221();
                return;
            }
        }

    }

    void method2504(int var1, int var2, int var3, int var4) {
        int var6 = var4 + Client.field4078;
        class146 var7 = (class146) this.field4157.method990(var1);
        if (null != var7) {
            var7.method221();
            --this.field4142;
        }

        if (var2 != 65535 && var2 != -1) {
            byte var8 = 0;
            if (var4 > 0) {
                var8 = -1;
            }

            this.field4157.method994(new class146(var2, var3, var6, var8), var1);
            ++this.field4142;
        }
    }

    class208 method2505() {
        return this.field4157;
    }

    void method2509() {
        class285 var2 = new class285(this.field4157);

        for (class146 var3 = (class146) var2.method1298(); null != var3; var3 = (class146) var2.next()) {
            var3.method221();
        }

        this.field4142 = 0;
    }

    class448 method2506(class448 var1) {
        if (this.field4142 == 0) {
            return var1;
        } else {
            class285 var3 = new class285(this.field4157);
            int var4 = var1.field3094;
            int var5 = var1.field3042;
            int var6 = var1.field3054;
            byte var7 = var1.field3053;

            for (class146 var8 = (class146) var3.method1298(); var8 != null; var8 = (class146) var3.next()) {
                if (var8.field1287 != -1) {
                    class448 var9 = class115.method525(var8.field1290).method522();
                    if (null != var9) {
                        var4 += var9.field3094;
                        var5 += var9.field3042;
                        var6 += var9.field3054;
                    }
                }
            }

            class448 var11 = new class448(var4, var5, var6, var7);
            var11.method2068(var1);

            for (class146 var12 = (class146) var3.method1298(); var12 != null; var12 = (class146) var3.next()) {
                if (var12.field1287 != -1) {
                    class448 var10 = class115.method525(var12.field1290).method521(var12.field1287);
                    if (var10 != null) {
                        var10.method2046(0, -var12.field1288, 0);
                        var11.method2068(var10);
                    }
                }
            }

            return var11;
        }
    }

    void method2510() {
        this.field4131 = false;
        this.field4128 = -1;
        this.field4129 = -1;
        this.field4130 = -1;
    }
}
