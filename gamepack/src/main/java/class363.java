public class class363 extends class510 {
    public static class68 field2592;
    public static class68 field2593;
    public static int field2595;
    static class289 field2601;

    static {
        field2601 = new class289(64);
    }

    public boolean field2602;
    public int field2596;
    int[] field2597;
    int[] field2603;
    short[] field2594;
    short[] field2598;
    short[] field2599;
    short[] field2600;

    class363() {
        this.field2596 = -1;
        this.field2603 = new int[]{-1, -1, -1, -1, -1};
        this.field2602 = false;
    }

    public static class363 method1716(int var0) {
        class363 var2 = (class363) field2601.method1307(var0);
        if (null != var2) {
            return var2;
        } else {
            byte[] var3 = field2592.method188(3, var0);
            var2 = new class363();
            if (var3 != null) {
                var2.method1712(new class78(var3));
            }

            field2601.method1306(var2, var0);
            return var2;
        }
    }

    public static void method1715() {
        field2601.method1304();
    }

    void method1712(class78 var1) {
        while (true) {
            int var3 = var1.method260();
            if (var3 == 0) {
                return;
            }

            this.method1711(var1, var3);
        }
    }

    void method1711(class78 var1, int var2) {
        if (var2 == 1) {
            this.field2596 = var1.method260();
        } else {
            int var4;
            int var5;
            if (var2 == 2) {
                var4 = var1.method260();
                this.field2597 = new int[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field2597[var5] = var1.method309();
                }
            } else if (var2 == 3) {
                this.field2602 = true;
            } else if (var2 == 40) {
                var4 = var1.method260();
                this.field2598 = new short[var4];
                this.field2599 = new short[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field2598[var5] = (short) var1.method309();
                    this.field2599[var5] = (short) var1.method309();
                }
            } else if (var2 == 41) {
                var4 = var1.method260();
                this.field2600 = new short[var4];
                this.field2594 = new short[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field2600[var5] = (short) var1.method309();
                    this.field2594[var5] = (short) var1.method309();
                }
            } else if (var2 >= 60 && var2 < 70) {
                this.field2603[var2 - 60] = var1.method309();
            }
        }

    }

    public boolean method1709() {
        if (null == this.field2597) {
            return true;
        } else {
            boolean var2 = true;

            for (int var3 = 0; var3 < this.field2597.length; ++var3) {
                if (!field2593.method190(this.field2597[var3], 0)) {
                    var2 = false;
                }
            }

            return var2;
        }
    }

    public class175 method1710() {
        if (this.field2597 == null) {
            return null;
        } else {
            class175[] var2 = new class175[this.field2597.length];

            for (int var3 = 0; var3 < this.field2597.length; ++var3) {
                var2[var3] = class175.method850(field2593, this.field2597[var3], 0);
            }

            class175 var5;
            if (var2.length == 1) {
                var5 = var2[0];
            } else {
                var5 = new class175(var2, var2.length);
            }

            int var4;
            if (null != this.field2598) {
                for (var4 = 0; var4 < this.field2598.length; ++var4) {
                    var5.method849(this.field2598[var4], this.field2599[var4]);
                }
            }

            if (this.field2600 != null) {
                for (var4 = 0; var4 < this.field2600.length; ++var4) {
                    var5.method840(this.field2600[var4], this.field2594[var4]);
                }
            }

            return var5;
        }
    }

    public boolean method1714() {
        boolean var2 = true;

        for (int var3 = 0; var3 < 5; ++var3) {
            if (this.field2603[var3] != -1 && !field2593.method190(this.field2603[var3], 0)) {
                var2 = false;
            }
        }

        return var2;
    }

    public class175 method1713() {
        class175[] var2 = new class175[5];
        int var3 = 0;

        for (int var4 = 0; var4 < 5; ++var4) {
            if (this.field2603[var4] != -1) {
                var2[var3++] = class175.method850(field2593, this.field2603[var4], 0);
            }
        }

        class175 var6 = new class175(var2, var3);
        int var5;
        if (this.field2598 != null) {
            for (var5 = 0; var5 < this.field2598.length; ++var5) {
                var6.method849(this.field2598[var5], this.field2599[var5]);
            }
        }

        if (null != this.field2600) {
            for (var5 = 0; var5 < this.field2600.length; ++var5) {
                var6.method840(this.field2600[var5], this.field2594[var5]);
            }
        }

        return var6;
    }
}
