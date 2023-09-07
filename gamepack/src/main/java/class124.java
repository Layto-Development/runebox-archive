import java.util.HashMap;
import java.util.Map;

public class class124 extends class510 {
    public static class289 field1118;
    public static class289 field1126;
    public static class289 field1127;
    static boolean field1116;

    static {
        field1116 = false;
        field1127 = new class289(64);
        field1118 = new class289(100);
        field1126 = new class289(100);
    }

    public boolean field1131;
    public boolean field1136;
    public int field1117;
    public int field1120;
    public int field1128;
    public int field1129;
    public int field1132;
    public int field1134;
    public int field1137;
    public int field1138;
    public int field1139;
    public int[] field1119;
    public int[] field1124;
    public int[] field1135;
    public Map<Integer, Integer> field1133;
    boolean[] field1121;
    int field1122;
    int field1123;
    int[] field1125;
    int[] field1130;

    class124() {
        this.field1120 = -1;
        this.field1122 = 0;
        this.field1123 = 0;
        this.field1128 = -1;
        this.field1131 = false;
        this.field1132 = 5;
        this.field1129 = -1;
        this.field1134 = -1;
        this.field1117 = 99;
        this.field1136 = false;
        this.field1137 = -1;
        this.field1138 = -1;
        this.field1139 = 2;
    }

    public static void method577(class68 var0, class68 var1, class68 var2) {
        class515.field4169 = var0;
        class397.field2798 = var1;
        class260.field1938 = var2;
    }

    public static class124 method575(int var0) {
        class124 var2 = (class124) field1127.method1307(var0);
        if (null != var2) {
            return var2;
        } else {
            byte[] var3 = class515.field4169.method188(12, var0);
            var2 = new class124();
            if (var3 != null) {
                var2.method563(new class78(var3));
            }

            var2.method573();
            field1127.method1306(var2, var0);
            return var2;
        }
    }

    static class516 method578(int var0) {
        class516 var2 = (class516) field1118.method1307(var0);
        if (var2 != null) {
            return var2;
        } else {
            var2 = class516.method2514(class397.field2798, class260.field1938, var0, false);
            if (var2 != null) {
                field1118.method1306(var2, var0);
            }

            return var2;
        }
    }

    static class228 method576(int var0) {
        return class532.method2554(var0, (byte) 6) != 0 ? null : class182.method867(var0);
    }

    void method563(class78 var1) {
        while (true) {
            int var3 = var1.method260();
            if (var3 == 0) {
                return;
            }

            this.method564(var1, var3);
        }
    }

    void method564(class78 var1, int var2) {
        int var4;
        int var5;
        if (var2 == 1) {
            var4 = var1.method309();
            this.field1135 = new int[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field1135[var5] = var1.method309();
            }

            this.field1124 = new int[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field1124[var5] = var1.method309();
            }

            for (var5 = 0; var5 < var4; ++var5) {
                this.field1124[var5] += var1.method309() << 16;
            }
        } else if (var2 == 2) {
            this.field1128 = var1.method309();
        } else if (var2 == 3) {
            var4 = var1.method260();
            this.field1130 = new int[var4 + 1];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field1130[var5] = var1.method260();
            }

            this.field1130[var4] = 9999999;
        } else if (var2 == 4) {
            this.field1131 = true;
        } else if (var2 == 5) {
            this.field1132 = var1.method260();
        } else if (var2 == 6) {
            this.field1129 = var1.method309();
        } else if (var2 == 7) {
            this.field1134 = var1.method309();
        } else if (var2 == 8) {
            this.field1117 = var1.method260();
            this.field1136 = true;
        } else if (var2 == 9) {
            this.field1137 = var1.method260();
        } else if (var2 == 10) {
            this.field1138 = var1.method260();
        } else if (var2 == 11) {
            this.field1139 = var1.method260();
        } else if (var2 == 12) {
            var4 = var1.method260();
            this.field1125 = new int[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field1125[var5] = var1.method309();
            }

            for (var5 = 0; var5 < var4; ++var5) {
                this.field1125[var5] += var1.method309() << 16;
            }
        } else if (var2 == 13) {
            var4 = var1.method260();
            this.field1119 = new int[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field1119[var5] = var1.method316();
            }
        } else if (var2 == 14) {
            this.field1120 = var1.method264();
        } else if (var2 == 15) {
            var4 = var1.method309();
            this.field1133 = new HashMap<>();

            for (var5 = 0; var5 < var4; ++var5) {
                int var6 = var1.method309();
                int var7 = var1.method316();
                this.field1133.put(var6, var7);
            }
        } else if (var2 == 16) {
            this.field1122 = var1.method309();
            this.field1123 = var1.method309();
        } else if (var2 == 17) {
            this.field1121 = new boolean[256];

            for (var4 = 0; var4 < this.field1121.length; ++var4) {
                this.field1121[var4] = false;
            }

            var4 = var1.method260();

            for (var5 = 0; var5 < var4; ++var5) {
                this.field1121[var1.method260()] = true;
            }
        }

    }

    void method573() {
        if (this.field1137 == -1) {
            if (this.field1130 == null && null == this.field1121) {
                this.field1137 = 0;
            } else {
                this.field1137 = 2;
            }
        }

        if (this.field1138 == -1) {
            if (null == this.field1130 && this.field1121 == null) {
                this.field1138 = 0;
            } else {
                this.field1138 = 2;
            }
        }

    }

    public class448 method566(class448 var1, int var2) {
        class448 var5;
        if (!this.method574()) {
            var2 = this.field1124[var2];
            class516 var6 = method578(var2 >> 16);
            var2 &= 65535;
            if (var6 == null) {
                return var1.method2044(true);
            } else {
                var5 = var1.method2044(!var6.method2513(var2));
                var5.method2070(var6, var2);
                return var5;
            }
        } else {
            class228 var4 = method576(this.field1120);
            if (null == var4) {
                return var1.method2044(true);
            } else {
                var5 = var1.method2044(!var4.method1042());
                var5.method2049(var4, var2);
                return var5;
            }
        }
    }

    class448 method565(class448 var1, int var2, int var3) {
        class448 var6;
        if (!this.method574()) {
            var2 = this.field1124[var2];
            class516 var7 = method578(var2 >> 16);
            var2 &= 65535;
            if (null == var7) {
                return var1.method2044(true);
            } else {
                var6 = var1.method2044(!var7.method2513(var2));
                var3 &= 3;
                if (var3 == 1) {
                    var6.method2057();
                } else if (var3 == 2) {
                    var6.method2056();
                } else if (var3 == 3) {
                    var6.method2055();
                }

                var6.method2070(var7, var2);
                if (var3 == 1) {
                    var6.method2055();
                } else if (var3 == 2) {
                    var6.method2056();
                } else if (var3 == 3) {
                    var6.method2057();
                }

                return var6;
            }
        } else {
            class228 var5 = method576(this.field1120);
            if (null == var5) {
                return var1.method2044(true);
            } else {
                var6 = var1.method2044(!var5.method1042());
                var3 &= 3;
                if (var3 == 1) {
                    var6.method2057();
                } else if (var3 == 2) {
                    var6.method2056();
                } else if (var3 == 3) {
                    var6.method2055();
                }

                var6.method2049(var5, var2);
                if (var3 == 1) {
                    var6.method2055();
                } else if (var3 == 2) {
                    var6.method2056();
                } else if (var3 == 3) {
                    var6.method2057();
                }

                return var6;
            }
        }
    }

    class448 method567(class448 var1, int var2) {
        class448 var5;
        if (!this.method574()) {
            var2 = this.field1124[var2];
            class516 var6 = method578(var2 >> 16);
            var2 &= 65535;
            if (null == var6) {
                return var1.method2071(true);
            } else {
                var5 = var1.method2071(!var6.method2513(var2));
                var5.method2070(var6, var2);
                return var5;
            }
        } else {
            class228 var4 = method576(this.field1120);
            if (var4 == null) {
                return var1.method2071(true);
            } else {
                var5 = var1.method2071(!var4.method1042());
                var5.method2049(var4, var2);
                return var5;
            }
        }
    }

    public class448 method568(class448 var1, int var2, class124 var3, int var4) {
        if (field1116 && !this.method574() && !var3.method574()) {
            return this.method569(var1, var2, var3, var4);
        } else {
            class448 var6 = var1.method2044(false);
            boolean var7 = false;
            class516 var8 = null;
            class222 var9 = null;
            class228 var10;
            if (this.method574()) {
                var10 = this.method572();
                if (var10 == null) {
                    return var6;
                }

                if (var3.method574() && null == this.field1121) {
                    var6.method2049(var10, var2);
                    return var6;
                }

                var9 = var10.field1785;
                var6.method2052(var9, var10, var2, this.field1121, false, !var3.method574());
            } else {
                var2 = this.field1124[var2];
                var8 = method578(var2 >> 16);
                var2 &= 65535;
                if (null == var8) {
                    return var3.method566(var1, var4);
                }

                if (!var3.method574() && (null == this.field1130 || var4 == -1)) {
                    var6.method2070(var8, var2);
                    return var6;
                }

                if (null == this.field1130 || var4 == -1) {
                    var6.method2070(var8, var2);
                    return var6;
                }

                var7 = var3.method574();
                if (!var7) {
                    var6.method2053(var8, var2, this.field1130, false);
                }
            }

            if (var3.method574()) {
                var10 = var3.method572();
                if (var10 == null) {
                    return var6;
                }

                if (null == var9) {
                    var9 = var10.field1785;
                }

                var6.method2052(var9, var10, var4, this.field1121, true, true);
            } else {
                var4 = var3.field1124[var4];
                class516 var11 = method578(var4 >> 16);
                var4 &= 65535;
                if (var11 == null) {
                    return this.method566(var1, var2);
                }

                var6.method2053(var11, var4, this.field1130, true);
            }

            if (var7 && var8 != null) {
                var6.method2053(var8, var2, this.field1130, false);
            }

            var6.method2048();
            return var6;
        }
    }

    class448 method569(class448 var1, int var2, class124 var3, int var4) {
        var2 = this.field1124[var2];
        class516 var6 = method578(var2 >> 16);
        var2 &= 65535;
        if (null == var6) {
            return var3.method566(var1, var4);
        } else {
            var4 = var3.field1124[var4];
            class516 var7 = method578(var4 >> 16);
            var4 &= 65535;
            class448 var8;
            if (var7 == null) {
                var8 = var1.method2044(!var6.method2513(var2));
                var8.method2070(var6, var2);
                return var8;
            } else {
                var8 = var1.method2044(!var6.method2513(var2) & !var7.method2513(var4));
                var8.method2062(var6, var2, var7, var4, this.field1130);
                return var8;
            }
        }
    }

    public class448 method570(class448 var1, int var2) {
        if (!this.method574()) {
            int var4 = this.field1124[var2];
            class516 var5 = method578(var4 >> 16);
            var4 &= 65535;
            if (null == var5) {
                return var1.method2044(true);
            } else {
                class516 var6 = null;
                int var7 = 0;
                if (this.field1125 != null && var2 < this.field1125.length) {
                    var7 = this.field1125[var2];
                    var6 = method578(var7 >> 16);
                    var7 &= 65535;
                }

                class448 var8;
                if (null != var6 && var7 != 65535) {
                    var8 = var1.method2044(!var5.method2513(var4) & !var6.method2513(var7));
                    var8.method2070(var5, var4);
                    var8.method2070(var6, var7);
                    return var8;
                } else {
                    var8 = var1.method2044(!var5.method2513(var4));
                    var8.method2070(var5, var4);
                    return var8;
                }
            }
        } else {
            return this.method566(var1, var2);
        }
    }

    public boolean method574() {
        return this.field1120 >= 0;
    }

    public int method571() {
        return this.field1123 - this.field1122;
    }

    class228 method572() {
        return this.method574() ? method576(this.field1120) : null;
    }
}
