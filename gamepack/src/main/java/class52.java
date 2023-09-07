import java.util.Arrays;

public class class52 {
    static final int[] field585;
    public static class289 field586;
    public static short[] field583;
    public static short[][] field590;
    static class342 field587;
    static int field588;

    static {
        field585 = new int[]{class322.field2337.field2336, class322.field2340.field2336, class322.field2334.field2336, class322.field2330.field2336, class322.field2343.field2336, class322.field2332.field2336, class322.field2339.field2336};
        field586 = new class289(260);
        field587 = new class342(16, class121.field1094);
        field588 = 0;
    }

    public int field575;
    public int field578;
    public int field580;
    boolean field582;
    class218[] field584;
    int[] field576;
    int[] field577;
    int[] field589;
    long field579;
    long field581;

    public class52() {
        this.field580 = -1;
        this.field578 = 0;
        this.field582 = false;
    }

    class52(class52 var1) {
        this.field580 = -1;
        this.field578 = 0;
        this.field582 = false;
        int[] var2 = Arrays.copyOf(var1.field576, var1.field576.length);
        int[] var3 = Arrays.copyOf(var1.field589, var1.field589.length);
        class218[] var4 = null != var1.field584 ? Arrays.copyOf(var1.field584, var1.field584.length) : null;
        int[] var5 = Arrays.copyOf(var1.field577, var1.field577.length);
        this.method145(var3, var2, var4, false, var5, var1.field578, var1.field575, var1.field580);
    }

    public void method145(int[] var1, int[] var2, class218[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
        this.field584 = var3;
        this.field582 = var4;
        this.field580 = var8;
        this.method154(var1, var2, var5, var6, var7);
    }

    public void method154(int[] var1, int[] var2, int[] var3, int var4, int var5) {
        if (var1 == null) {
            var1 = this.method146(var4, (byte) 67);
        }

        if (null == var2) {
            var2 = this.method146(var4, (byte) 13);
        }

        this.field589 = var1;
        this.field576 = var2;
        this.field577 = var3;
        this.field578 = var4;
        this.field575 = var5;
        this.method150();
    }

    int[] method146(int var1, byte var2) {
        int[] var3 = new int[12];

        for (int var4 = 0; var4 < 7; ++var4) {
            for (int var5 = 0; var5 < class363.field2595; ++var5) {
                class363 var6 = class363.method1716(var5);
                if (null != var6 && !var6.field2602 && var4 + (var1 == 1 ? 7 : 0) == var6.field2596) {
                    var3[field585[var4]] = var5 + 256;
                    break;
                }
            }
        }

        return var3;
    }

    public void method147(int var1, boolean var2) {
        int var4 = this.field576[field585[var1]];
        if (var4 != 0) {
            var4 -= 256;

            class363 var5;
            do {
                if (!var2) {
                    --var4;
                    if (var4 < 0) {
                        var4 = class363.field2595 - 1;
                    }
                } else {
                    ++var4;
                    if (var4 >= class363.field2595) {
                        var4 = 0;
                    }
                }

                var5 = class363.method1716(var4);
            } while (null == var5 || var5.field2602 || (this.field578 == 1 ? 7 : 0) + var1 != var5.field2596);

            this.field576[field585[var1]] = var4 + 256;
            this.method150();
        }
    }

    public void method148(int var1, boolean var2) {
        int var4 = this.field577[var1];
        boolean var5;
        if (!var2) {
            do {
                --var4;
                if (var4 < 0) {
                    var4 = class348.field2526[var1].length - 1;
                }

				var5 = var1 != 4 || var4 < 8;
            } while (!var5);
        } else {
            do {
                ++var4;
                if (var4 >= class348.field2526[var1].length) {
                    var4 = 0;
                }

				var5 = var1 != 4 || var4 < 8;
            } while (!var5);
        }

        this.field577[var1] = var4;
        this.method150();
    }

    public void method155(int var1) {
        if (var1 != this.field578) {
            this.method154(null, null, this.field577, var1, -1);
        }
    }

    public void method149(class78 var1) {
        var1.method249(this.field578);

        int var3;
        for (var3 = 0; var3 < 7; ++var3) {
            int var4 = this.field576[field585[var3]];
            if (var4 == 0) {
                var1.method249(-1);
            } else {
                var1.method249(var4 - 256);
            }
        }

        for (var3 = 0; var3 < 5; ++var3) {
            var1.method249(this.field577[var3]);
        }

    }

    void method150() {
        long var2 = this.field579;
        int var4 = this.field576[5];
        int var5 = this.field576[9];
        this.field576[5] = var5;
        this.field576[9] = var4;
        this.field579 = 0L;

        int var6;
        for (var6 = 0; var6 < 12; ++var6) {
            this.field579 <<= 4;
            if (this.field576[var6] >= 256) {
                this.field579 += this.field576[var6] - 256;
            }
        }

        if (this.field576[0] >= 256) {
            this.field579 += this.field576[0] - 256 >> 4;
        }

        if (this.field576[1] >= 256) {
            this.field579 += this.field576[1] - 256 >> 8;
        }

        for (var6 = 0; var6 < 5; ++var6) {
            this.field579 <<= 3;
            this.field579 += this.field577[var6];
        }

        this.field579 <<= 1;
        this.field579 += this.field578;
        this.field576[5] = var4;
        this.field576[9] = var5;
        if (var2 != 0L && var2 != this.field579 || this.field582) {
            field586.method1305(var2);
        }

    }

    public class448 method156(class124 var1, int var2, class124 var3, int var4) {
        if (this.field575 != -1) {
            return class345.method1635(this.field575).method1623(var1, var2, var3, var4, null);
        } else {
            long var6 = this.field579;
            int[] var8 = this.field576;
            if (var1 != null && (var1.field1129 >= 0 || var1.field1134 >= 0)) {
                var8 = new int[12];

				System.arraycopy(this.field576, 0, var8, 0, 12);

                if (var1.field1129 >= 0) {
                    var6 += var1.field1129 - this.field576[5] << 40;
                    var8[5] = var1.field1129;
                }

                if (var1.field1134 >= 0) {
                    var6 += var1.field1134 - this.field576[3] << 48;
                    var8[3] = var1.field1134;
                }
            }

            class448 var19 = (class448) field586.method1307(var6);
            if (var19 == null) {
                boolean var10 = false;

                int var12;
                for (int var11 = 0; var11 < 12; ++var11) {
                    var12 = var8[var11];
                    if (var12 >= 256 && var12 < 512 && !class363.method1716(var12 - 256).method1709()) {
                        var10 = true;
                    }

                    if (var12 >= 512 && !class508.method2299(var12 - 512).method2286(this.field578)) {
                        var10 = true;
                    }
                }

                if (var10) {
                    if (-1L != this.field581) {
                        var19 = (class448) field586.method1307(this.field581);
                    }

                    if (var19 == null) {
                        return null;
                    }
                }

                if (null == var19) {
                    class175[] var21 = new class175[12];
                    var12 = 0;

                    int var14;
                    for (int var13 = 0; var13 < 12; ++var13) {
                        var14 = var8[var13];
                        if (var14 >= 256 && var14 < 512) {
                            class175 var15 = class363.method1716(var14 - 256).method1710();
                            if (null != var15) {
                                var21[var12++] = var15;
                            }
                        }

                        if (var14 >= 512) {
                            class508 var23 = class508.method2299(var14 - 512);
                            class175 var16 = var23.method2287(this.field578);
                            if (null != var16) {
                                if (null != this.field584) {
                                    class218 var17 = this.field584[var13];
                                    if (null != var17) {
                                        int var18;
                                        if (var17.field1745 != null && var23.field3755 != null && var23.field3723.length == var17.field1745.length) {
                                            for (var18 = 0; var18 < var23.field3755.length; ++var18) {
                                                var16.method849(var23.field3723[var18], var17.field1745[var18]);
                                            }
                                        }

                                        if (null != var17.field1746 && null != var23.field3749 && var17.field1746.length == var23.field3725.length) {
                                            for (var18 = 0; var18 < var23.field3749.length; ++var18) {
                                                var16.method840(var23.field3725[var18], var17.field1746[var18]);
                                            }
                                        }
                                    }
                                }

                                var21[var12++] = var16;
                            }
                        }
                    }

                    class175 var22 = new class175(var21, var12);

                    for (var14 = 0; var14 < 5; ++var14) {
                        if (this.field577[var14] < class348.field2526[var14].length) {
                            var22.method849(class244.field1866[var14], class348.field2526[var14][this.field577[var14]]);
                        }

                        if (this.field577[var14] < field590[var14].length) {
                            var22.method849(field583[var14], field590[var14][this.field577[var14]]);
                        }
                    }

                    var19 = var22.method846(64, 850, -30, -50, -30);
                    field586.method1306(var19, var6);
                    this.field581 = var6;
                }
            }

            class448 var20;
            if (null == var1 && null == var3) {
                var20 = var19.method2044(true);
            } else if (null != var1 && null != var3) {
                var20 = var1.method568(var19, var2, var3, var4);
            } else if (null != var1) {
                var20 = var1.method566(var19, var2);
            } else {
                var20 = var3.method566(var19, var4);
            }

            return var20;
        }
    }

    class175 method151() {
        if (this.field575 != -1) {
            return class345.method1635(this.field575).method1624(null);
        } else {
            boolean var2 = false;

            int var4;
            for (int var3 = 0; var3 < 12; ++var3) {
                var4 = this.field576[var3];
                if (var4 >= 256 && var4 < 512 && !class363.method1716(var4 - 256).method1714()) {
                    var2 = true;
                }

                if (var4 >= 512 && !class508.method2299(var4 - 512).method2288(this.field578)) {
                    var2 = true;
                }
            }

            if (var2) {
                return null;
            } else {
                class175[] var8 = new class175[12];
                var4 = 0;

                int var6;
                for (int var5 = 0; var5 < 12; ++var5) {
                    var6 = this.field576[var5];
                    class175 var7;
                    if (var6 >= 256 && var6 < 512) {
                        var7 = class363.method1716(var6 - 256).method1713();
                        if (var7 != null) {
                            var8[var4++] = var7;
                        }
                    }

                    if (var6 >= 512) {
                        var7 = class508.method2299(var6 - 512).method2291(this.field578);
                        if (var7 != null) {
                            var8[var4++] = var7;
                        }
                    }
                }

                class175 var9 = new class175(var8, var4);

                for (var6 = 0; var6 < 5; ++var6) {
                    if (this.field577[var6] < class348.field2526[var6].length) {
                        var9.method849(class244.field1866[var6], class348.field2526[var6][this.field577[var6]]);
                    }

                    if (this.field577[var6] < field590[var6].length) {
                        var9.method849(field583[var6], field590[var6][this.field577[var6]]);
                    }
                }

                return var9;
            }
        }
    }

    public int method152() {
        long var2 = this.field579;
        if (this.field575 != -1) {
            var2 = -65536L | (long) this.field575;
        }

        Integer var4 = (Integer) field587.method1609(var2, (byte) -31);
        if (null == var4) {
            var4 = ++field588 - 1;
            field587.method1610(var2, var4);
            field588 %= 65535;
        }

        return var4;
    }

    void method153() {
        this.method154(this.field589, this.field576, this.field577, this.field578, this.field575);
    }
}
