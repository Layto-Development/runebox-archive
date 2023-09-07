public final class class424 extends class514 {
    static int field2919;
    static int field2926;

    static {
        field2919 = 1;
        field2926 = 1;
    }

    class307 field2924;
    class307 field2925;
    class345 field2920;
    class511 field2922;
    int field2921;
    String field2923;

    class424() {
        this.field2923 = "";
        this.field2921 = 31;
    }

    static void method1963(class26 var0, int var1, int var2) {
        Object[] var4 = var0.field141;
        class443 var5;
        if (class430.method1968(var0.field145)) {
            class29.field162 = (class16) var4[0];
            class192 var6 = class192.method893(class29.field162.field63);
            var5 = class443.method2025(var0.field145, var6.field1562, var6.field1576);
        } else {
            int var7 = (Integer) var4[0];
            var5 = class443.method2022(var7);
        }

        if (var5 != null) {
            class269.method1185(var0, var5, var1, var2);
        }

    }

    void method1946(String var1) {
        this.field2923 = null == var1 ? "" : var1;
    }

    void method1947(int var1) {
        this.field2921 = var1;
    }

    boolean method1948(int var1) {
        if (var1 >= 0 && var1 <= 4) {
            return (this.field2921 & 1 << var1) != 0;
        } else {
            return true;
        }
    }

    String method1949() {
        if (!this.field2923.isEmpty()) {
            return this.field2923;
        } else {
            class345 var2 = this.field2920;
            if (var2.field2503 != null) {
                var2 = var2.method1625();
                if (null == var2) {
                    var2 = this.field2920;
                }
            }

            return var2.field2475;
        }
    }

    void method1950(int var1, class447 var2) {
        int var4 = super.field4166[0];
        int var5 = super.field4163[0];
        if (var1 == 0) {
            --var4;
            ++var5;
        }

        if (var1 == 1) {
            ++var5;
        }

        if (var1 == 2) {
            ++var4;
            ++var5;
        }

        if (var1 == 3) {
            --var4;
        }

        if (var1 == 4) {
            ++var4;
        }

        if (var1 == 5) {
            --var4;
            --var5;
        }

        if (var1 == 6) {
            --var5;
        }

        if (var1 == 7) {
            ++var4;
            --var5;
        }

        if (super.field4136 != -1 && class124.method575(super.field4136).field1138 == 1) {
            super.field4136 = -1;
        }

        if (super.field4139 < 9) {
            ++super.field4139;
        }

        for (int var6 = super.field4139; var6 > 0; --var6) {
            super.field4166[var6] = super.field4166[var6 - 1];
            super.field4163[var6] = super.field4163[var6 - 1];
            super.field4164[var6] = super.field4164[var6 - 1];
        }

        super.field4166[0] = var4;
        super.field4163[0] = var5;
        super.field4164[0] = var2;
    }

    void method1951(int var1, int var2, boolean var3) {
        if (super.field4136 != -1 && class124.method575(super.field4136).field1138 == 1) {
            super.field4136 = -1;
        }

        if (!var3) {
            int var5 = var1 - super.field4166[0];
            int var6 = var2 - super.field4163[0];
            if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
                if (super.field4139 < 9) {
                    ++super.field4139;
                }

                for (int var7 = super.field4139; var7 > 0; --var7) {
                    super.field4166[var7] = super.field4166[var7 - 1];
                    super.field4163[var7] = super.field4163[var7 - 1];
                    super.field4164[var7] = super.field4164[var7 - 1];
                }

                super.field4166[0] = var1;
                super.field4163[0] = var2;
                super.field4164[0] = class447.field3033;
                return;
            }
        }

        super.field4139 = 0;
        super.field4155 = 0;
        super.field4165 = 0;
        super.field4166[0] = var1;
        super.field4163[0] = var2;
        super.field4121 = super.field4095 * 64 + 128 * super.field4166[0];
        super.field4092 = super.field4163[0] * 128 + super.field4095 * 64;
    }

    @Override
    protected class448 method2238() {
        if (this.field2920 == null) {
            return null;
        } else {
            class124 var2 = super.field4136 != -1 && super.field4153 == 0 ? class124.method575(super.field4136) : null;
            class124 var3 = super.field4104 != -1 && (super.field4097 != super.field4104 || var2 == null) ? class124.method575(super.field4104) : null;
            class448 var4 = null;
            if (this.field2924 != null && this.field2924.field2253) {
                var4 = class180.field1528.field2054.method156(var2, super.field4137, var3, super.field4091);
            } else {
                var4 = this.field2920.method1623(var2, super.field4137, var3, super.field4091, this.field2924);
            }

            if (null == var4) {
                return null;
            } else {
                var4.method2045();
                super.field4151 = var4.field3601;
                int var5 = var4.field3042;
                var4 = this.method2506(var4);
                if (this.field2920.field2476 == 1) {
                    var4.field3043 = true;
                }

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

    @Override
	boolean method2501() {
        return null != this.field2920;
    }

    int[] method1954() {
        return null != this.field2922 ? this.field2922.method2301() : this.field2920.method1628();
    }

    short[] method1961() {
        return this.field2922 != null ? this.field2922.method2302() : this.field2920.method1630();
    }

    void method1964(int var1, int var2, short var3) {
        if (this.field2922 == null) {
            this.field2922 = new class511(this.field2920);
        }

        this.field2922.method2303(var1, var2, var3);
    }

    void method1955(int[] var1, short[] var2) {
        if (null == this.field2922) {
            this.field2922 = new class511(this.field2920);
        }

        this.field2922.method2304(var1, var2);
    }

    void method1956() {
        this.field2922 = null;
    }

    void method1962(class307 var1) {
        this.field2925 = var1;
    }

    class307 method1958() {
        return this.field2925;
    }

    void method1959(class307 var1) {
        this.field2924 = var1;
    }

    void method1957() {
        this.field2925 = null;
    }

    void method1960() {
        this.field2924 = null;
    }
}
