import java.util.Random;

public abstract class class197 extends class415 {
    public static class539[] field1613;
    static int field1614;
    static int field1615;
    static int field1625;
    static int field1626;
    static int field1627;
    static int field1628;
    static int field1629;
    static int field1630;
    static int field1631;
    static String[] field1623;
    static Random field1633;

    static {
        field1614 = -1;
        field1625 = -1;
        field1626 = -1;
        field1627 = -1;
        field1628 = 0;
        field1629 = 0;
        field1630 = 256;
        field1631 = 0;
        field1615 = 0;
        field1633 = new Random();
        field1623 = new String[100];
    }

    public int field1617;
    public int field1621;
    public int field1622;
    byte[] field1624;
    byte[][] field1632;
    int[] field1616;
    int[] field1618;
    int[] field1619;
    int[] field1620;
    int[] field1634;

    class197(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
        this.field1632 = new byte[256][];
        this.field1617 = 0;
        this.field1618 = var2;
        this.field1619 = var3;
        this.field1616 = var4;
        this.field1634 = var5;
        this.method924(var1);
        this.field1632 = var7;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;

        for (int var10 = 0; var10 < 256; ++var10) {
            if (this.field1619[var10] < var8 && this.field1634[var10] != 0) {
                var8 = this.field1619[var10];
            }

            if (this.field1619[var10] + this.field1634[var10] > var9) {
                var9 = this.field1619[var10] + this.field1634[var10];
            }
        }

        this.field1621 = this.field1617 - var8;
        this.field1622 = var9 - this.field1617;
    }

    class197(byte[] var1) {
        this.field1632 = new byte[256][];
        this.field1617 = 0;
        this.method924(var1);
    }

    static int method919(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
        int var7 = var2[var5];
        int var8 = var7 + var4[var5];
        int var9 = var2[var6];
        int var10 = var9 + var4[var6];
        int var11 = var7;
        if (var9 > var7) {
            var11 = var9;
        }

        int var12 = var8;
        if (var10 < var8) {
            var12 = var10;
        }

        int var13 = var3[var5];
        if (var3[var6] < var13) {
            var13 = var3[var6];
        }

        byte[] var14 = var1[var5];
        byte[] var15 = var0[var6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;

        for (int var18 = var11; var18 < var12; ++var18) {
            int var19 = var14[var16++] + var15[var17++];
            if (var19 < var13) {
                var13 = var19;
            }
        }

        return -var13;
    }

    public static String method934(String var0) {
        int var1 = var0.length();
        int var2 = 0;

        for (int var3 = 0; var3 < var1; ++var3) {
            char var4 = var0.charAt(var3);
            if (var4 == '<' || var4 == '>') {
                var2 += 3;
            }
        }

        StringBuilder var6 = new StringBuilder(var1 + var2);

        for (int var7 = 0; var7 < var1; ++var7) {
            char var5 = var0.charAt(var7);
            if (var5 == '<') {
                var6.append("<lt>");
            } else if (var5 == '>') {
                var6.append("<gt>");
            } else {
                var6.append(var5);
            }
        }

        return var6.toString();
    }

    static void method948(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
        int var6 = var1 + var2 * class415.field2903;
        int var7 = class415.field2903 - var3;
        int var8 = 0;
        int var9 = 0;
        int var10;
        if (var2 < class415.field2909) {
            var10 = class415.field2909 - var2;
            var4 -= var10;
            var2 = class415.field2909;
            var9 = var10 * var3;
            var6 += var10 * class415.field2903;
        }

        if (var2 + var4 > class415.field2907) {
            var4 -= var2 + var4 - class415.field2907;
        }

        if (var1 < class415.field2908) {
            var10 = class415.field2908 - var1;
            var3 -= var10;
            var1 = class415.field2908;
            var9 += var10;
            var6 += var10;
            var8 = var10;
            var7 += var10;
        }

        if (var1 + var3 > class415.field2902) {
            var10 = var1 + var3 - class415.field2902;
            var3 -= var10;
            var8 += var10;
            var7 += var10;
        }

        if (var3 > 0 && var4 > 0) {
            method939(class415.field2905, var0, var5, var9, var6, var3, var4, var7, var8);
        }
    }

    static void method939(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        int var9 = -(var5 >> 2);
        var5 = -(var5 & 3);

        for (int var10 = -var6; var10 < 0; ++var10) {
            int var11;
            for (var11 = var9; var11 < 0; ++var11) {
                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }
            }

            for (var11 = var5; var11 < 0; ++var11) {
                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    static void method940(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = var1 + var2 * class415.field2903;
        int var8 = class415.field2903 - var3;
        int var9 = 0;
        int var10 = 0;
        int var11;
        if (var2 < class415.field2909) {
            var11 = class415.field2909 - var2;
            var4 -= var11;
            var2 = class415.field2909;
            var10 = var11 * var3;
            var7 += var11 * class415.field2903;
        }

        if (var2 + var4 > class415.field2907) {
            var4 -= var2 + var4 - class415.field2907;
        }

        if (var1 < class415.field2908) {
            var11 = class415.field2908 - var1;
            var3 -= var11;
            var1 = class415.field2908;
            var10 += var11;
            var7 += var11;
            var9 = var11;
            var8 += var11;
        }

        if (var1 + var3 > class415.field2902) {
            var11 = var1 + var3 - class415.field2902;
            var3 -= var11;
            var9 += var11;
            var8 += var11;
        }

        if (var3 > 0 && var4 > 0) {
            method941(class415.field2905, var0, var5, var10, var7, var3, var4, var8, var9, var6);
        }
    }

    static void method941(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & 65280) * var9 & 16711680) >> 8;
        var9 = 256 - var9;

        for (int var10 = -var6; var10 < 0; ++var10) {
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var1[var3++] != 0) {
                    int var12 = var0[var4];
                    var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & 65280) * var9 & 16711680) >> 8) + var2;
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    abstract void method918(byte[] var1, int var2, int var3, int var4, int var5, int var6);

    abstract void method938(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

    void method924(byte[] var1) {
        this.field1620 = new int[256];
        int var2;
        if (var1.length == 257) {
            for (var2 = 0; var2 < this.field1620.length; ++var2) {
                this.field1620[var2] = var1[var2] & 255;
            }

            this.field1617 = var1[256] & 255;
        } else {
            var2 = 0;

            for (int var3 = 0; var3 < 256; ++var3) {
                this.field1620[var3] = var1[var2++] & 255;
            }

            int[] var10 = new int[256];
            int[] var4 = new int[256];

            int var5;
            for (var5 = 0; var5 < 256; ++var5) {
                var10[var5] = var1[var2++] & 255;
            }

            for (var5 = 0; var5 < 256; ++var5) {
                var4[var5] = var1[var2++] & 255;
            }

            byte[][] var11 = new byte[256][];

            int var8;
            for (int var6 = 0; var6 < 256; ++var6) {
                var11[var6] = new byte[var10[var6]];
                byte var7 = 0;

                for (var8 = 0; var8 < var11[var6].length; ++var8) {
                    var7 += var1[var2++];
                    var11[var6][var8] = var7;
                }
            }

            byte[][] var12 = new byte[256][];

            int var13;
            for (var13 = 0; var13 < 256; ++var13) {
                var12[var13] = new byte[var10[var13]];
                byte var14 = 0;

                for (int var9 = 0; var9 < var12[var13].length; ++var9) {
                    var14 += var1[var2++];
                    var12[var13][var9] = var14;
                }
            }

            this.field1624 = new byte[65536];

            for (var13 = 0; var13 < 256; ++var13) {
                if (var13 != 32 && var13 != 160) {
                    for (var8 = 0; var8 < 256; ++var8) {
                        if (var8 != 32 && var8 != 160) {
                            this.field1624[(var13 << 8) + var8] = (byte) method919(var11, var12, var4, this.field1620, var10, var13, var8);
                        }
                    }
                }
            }

            this.field1617 = var4[32] + var10[32];
        }

    }

    public int method950(char var1) {
        if (var1 == 160) {
            var1 = ' ';
        }

        return this.field1620[class209.method1000(var1) & 255];
    }

    public int method921(String var1) {
        if (var1 == null) {
            return 0;
        } else {
            int var2 = -1;
            int var3 = -1;
            int var4 = 0;

            for (int var5 = 0; var5 < var1.length(); ++var5) {
                char var6 = var1.charAt(var5);
                if (var6 == '<') {
                    var2 = var5;
                } else {
                    if (var6 == '>' && var2 != -1) {
                        String var7 = var1.substring(var2 + 1, var5);
                        var2 = -1;
                        if (var7.equals("lt")) {
                            var6 = '<';
                        } else {
                            if (!var7.equals("gt")) {
                                if (var7.startsWith("img=")) {
                                    try {
                                        int var8 = class95.method368(var7.substring(4));
                                        var4 += field1613[var8].field4284;
                                        var3 = -1;
                                    } catch (Exception var9) {
                                    }
                                }
                                continue;
                            }

                            var6 = '>';
                        }
                    }

                    if (var6 == 160) {
                        var6 = ' ';
                    }

                    if (var2 == -1) {
                        var4 += this.field1620[(char) (class209.method1000(var6) & 255)];
                        if (this.field1624 != null && var3 != -1) {
                            var4 += this.field1624[(var3 << 8) + var6];
                        }

                        var3 = var6;
                    }
                }
            }

            return var4;
        }
    }

    public int method922(String var1, int[] var2, String[] var3) {
        if (var1 == null) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 0;
            StringBuilder var6 = new StringBuilder(100);
            int var7 = -1;
            int var8 = 0;
            byte var9 = 0;
            int var10 = -1;
            char var11 = 0;
            int var12 = 0;
            int var13 = var1.length();

            for (int var14 = 0; var14 < var13; ++var14) {
                char var15 = var1.charAt(var14);
                if (var15 == '<') {
                    var10 = var14;
                } else {
                    if (var15 == '>' && var10 != -1) {
                        String var16 = var1.substring(var10 + 1, var14);
                        var10 = -1;
                        var6.append('<');
                        var6.append(var16);
                        var6.append('>');
                        if (var16.equals("br")) {
                            var3[var12] = var6.substring(var5, var6.length());
                            ++var12;
                            var5 = var6.length();
                            var4 = 0;
                            var7 = -1;
                            var11 = 0;
                        } else if (var16.equals("lt")) {
                            var4 += this.method950('<');
                            if (this.field1624 != null && var11 != -1) {
                                var4 += this.field1624[(var11 << '\b') + 60];
                            }

                            var11 = '<';
                        } else if (var16.equals("gt")) {
                            var4 += this.method950('>');
                            if (this.field1624 != null && var11 != -1) {
                                var4 += this.field1624[(var11 << '\b') + 62];
                            }

                            var11 = '>';
                        } else if (var16.startsWith("img=")) {
                            try {
                                int var17 = class95.method368(var16.substring(4));
                                var4 += field1613[var17].field4284;
                                var11 = 0;
                            } catch (Exception var18) {
                            }
                        }

                        var15 = 0;
                    }

                    if (var10 == -1) {
                        if (var15 != 0) {
                            var6.append(var15);
                            var4 += this.method950(var15);
                            if (this.field1624 != null && var11 != -1) {
                                var4 += this.field1624[(var11 << '\b') + var15];
                            }

                            var11 = var15;
                        }

                        if (var15 == ' ') {
                            var7 = var6.length();
                            var8 = var4;
                            var9 = 1;
                        }

                        if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
                            var3[var12] = var6.substring(var5, var7 - var9);
                            ++var12;
                            var5 = var7;
                            var7 = -1;
                            var4 -= var8;
                            var11 = 0;
                        }

                        if (var15 == '-') {
                            var7 = var6.length();
                            var8 = var4;
                            var9 = 0;
                        }
                    }
                }
            }

            String var19 = var6.toString();
            if (var19.length() > var5) {
                var3[var12++] = var19.substring(var5);
            }

            return var12;
        }
    }

    public int method944(String var1, int var2) {
        int var3 = this.method922(var1, new int[]{var2}, field1623);
        int var4 = 0;

        for (int var5 = 0; var5 < var3; ++var5) {
            int var6 = this.method921(field1623[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }

        return var4;
    }

    public int method923(String var1, int var2) {
        return this.method922(var1, new int[]{var2}, field1623);
    }

    public class8 method925(int var1, int var2, String var3, int var4, int var5) {
        if (var3 != null && var3.length() >= var1 + var2) {
            int var6 = var4 - this.method921(var3) / 2;
            var6 += this.method921(var3.substring(0, var1));
            int var7 = var5 - this.field1621;
            int var8 = this.method921(var3.substring(var1, var1 + var2));
            int var9 = this.field1621 + this.field1622;
            return new class8(var6, var7, var8, var9);
        } else {
            return new class8(var4, var5, 0, 0);
        }
    }

    public void method949(String var1, int var2, int var3, int var4, int var5) {
        if (var1 != null) {
            this.method942(var4, var5);
            this.method937(var1, var2, var3);
        }
    }

    public void method926(String var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 != null) {
            this.method942(var4, 0);
            field1630 = var6;
            this.method937(var1, var2, var3);
        }
    }

    public void method927(String var1, int var2, int var3, int var4, int var5) {
        if (var1 != null) {
            this.method942(var4, -1);
            this.method937(var1, var2 - this.method921(var1), var3);
        }
    }

    public void method928(String var1, int var2, int var3, int var4, int var5) {
        if (var1 != null) {
            this.method942(var4, var5);
            this.method937(var1, var2 - this.method921(var1) / 2, var3);
        }
    }

    public int method920(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        return this.method929(var1, var2, var3, var4, var5, var6, var7, 256, 1, var9, var10);
    }

    public int method929(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        if (var1 == null) {
            return 0;
        } else {
            if (var8 == 255) {
                var8 = 256;
            }

            this.method942(var6, var7);
            field1630 = var8;
            if (var11 == 0) {
                var11 = this.field1617;
            }

            int[] var12 = new int[]{var4};
            if (var5 < this.field1621 + this.field1622 + var11 && var5 < var11 + var11) {
                var12 = null;
            }

            int var13 = this.method922(var1, var12, field1623);
            if (var10 == 3 && var13 == 1) {
                var10 = 1;
            }

            int var14;
            int var15;
            if (var10 == 0) {
                var14 = var3 + this.field1621;
            } else if (var10 == 1) {
                var14 = var3 + this.field1621 + (var5 - this.field1621 - this.field1622 - (var13 - 1) * var11) / 2;
            } else if (var10 == 2) {
                var14 = var3 + var5 - this.field1622 - (var13 - 1) * var11;
            } else {
                var15 = (var5 - this.field1621 - this.field1622 - (var13 - 1) * var11) / (var13 + 1);
                if (var15 < 0) {
                    var15 = 0;
                }

                var14 = var3 + this.field1621 + var15;
                var11 += var15;
            }

            for (var15 = 0; var15 < var13; ++var15) {
                if (var9 == 0) {
                    this.method937(field1623[var15], var2, var14);
                } else if (var9 == 1) {
                    this.method937(field1623[var15], var2 + (var4 - this.method921(field1623[var15])) / 2, var14);
                } else if (var9 == 2) {
                    this.method937(field1623[var15], var2 + var4 - this.method921(field1623[var15]), var14);
                } else if (var15 == var13 - 1) {
                    this.method937(field1623[var15], var2, var14);
                } else {
                    this.method936(field1623[var15], var4);
                    this.method937(field1623[var15], var2, var14);
                    field1631 = 0;
                }

                var14 += var11;
            }

            return var13;
        }
    }

    public class260 method930(class145 var1, int var2, int var3, int var4, int var5, int var6) {
        if (!var1.method665()) {
            this.method942(var4, var5);
            var3 -= this.field1617;

            for (int var7 = 0; var7 < var1.method666(); ++var7) {
                class284 var8 = var1.method668(var7);
                char var9 = var8.field2084;
                if (var9 != '\n') {
                    if (var1.method671(var7)) {
                        var9 = '*';
                    }

                    if (var9 != '\t') {
                        if (var9 == 160) {
                            var9 = ' ';
                        }

                        int var10 = var2 + var8.field2083;
                        int var11 = var3 + var8.field2086;
                        int var12 = this.field1616[var9];
                        int var13 = this.field1634[var9];
                        if (field1627 != -1) {
                            this.method918(this.field1632[var9], var10 + this.field1618[var9] + 1, var11 + this.field1619[var9] + 1, var12, var13, field1627);
                        }

                        this.method918(this.field1632[var9], var10 + this.field1618[var9], var11 + this.field1619[var9], var12, var13, field1629);
                    }
                }
            }
        }

        return var1.method670();
    }

    public void method943(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
        if (var1 != null) {
            this.method942(var4, 0);
            int[] var8 = null;
            if (var7 != null) {
                var8 = this.method933(var7, var1.length());
            }

            int[] var9 = new int[var1.length()];

            for (int var10 = 0; var10 < var1.length(); ++var10) {
                var9[var10] = (int) (Math.sin((double) var10 / 2.0D + (double) var6 / 5.0D) * 5.0D);
            }

            this.method917(var1, var2 - this.method921(var1) / 2, var3, var8, null, var9);
        }
    }

    public void method931(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
        if (var1 != null) {
            this.method942(var4, 0);
            int[] var8 = null;
            if (var7 != null) {
                var8 = this.method933(var7, var1.length());
            }

            int[] var9 = new int[var1.length()];
            int[] var10 = new int[var1.length()];

            for (int var11 = 0; var11 < var1.length(); ++var11) {
                var9[var11] = (int) (Math.sin((double) var11 / 5.0D + (double) var6 / 5.0D) * 5.0D);
                var10[var11] = (int) (Math.sin((double) var11 / 3.0D + (double) var6 / 5.0D) * 5.0D);
            }

            this.method917(var1, var2 - this.method921(var1) / 2, var3, var8, var9, var10);
        }
    }

    public void method945(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
        if (var1 != null) {
            this.method942(var4, 0);
            int[] var9 = null;
            if (var8 != null) {
                var9 = this.method933(var8, var1.length());
            }

            double var10 = 7.0D - (double) var7 / 8.0D;
            if (var10 < 0.0D) {
                var10 = 0.0D;
            }

            int[] var12 = new int[var1.length()];

            for (int var13 = 0; var13 < var1.length(); ++var13) {
                var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) var6) * var10);
            }

            this.method917(var1, var2 - this.method921(var1) / 2, var3, var9, null, var12);
        }
    }

    public void method932(String var1, int var2, int var3, int var4, int var5, int[] var6) {
        if (var1 != null) {
            this.method942(var4, 0);
            int[] var7 = null;
            if (var6 != null) {
                var7 = this.method933(var6, var1.length());
            }

            this.method917(var1, var2 - this.method921(var1) / 2, var3, var7, null, null);
        }
    }

    public void method946(String var1, int var2, int var3, int var4, int var5, int[] var6) {
        if (var1 != null) {
            this.method942(var4, 0);
            int[] var7 = null;
            if (var6 != null) {
                var7 = this.method933(var6, var1.length());
            }

            this.method917(var1, var2, var3, var7, null, null);
        }
    }

    int[] method933(int[] var1, int var2) {
        if (var2 == 0) {
            return null;
        } else {
            int[] var3 = new int[var2];
            float var4 = (float) var1.length / (float) var2;

            for (int var5 = 0; var5 < var2; ++var5) {
                var3[var5] = var1[(int) ((float) var5 * var4)];
            }

            return var3;
        }
    }

    public void method947(String var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 != null) {
            this.method942(16777215, 0);
            field1633.setSeed(var6);
            field1630 = 192 + (field1633.nextInt() & 31);
            int[] var7 = new int[var1.length()];
            int var8 = 0;

            for (int var9 = 0; var9 < var1.length(); ++var9) {
                var7[var9] = var8;
                if ((field1633.nextInt() & 3) == 0) {
                    ++var8;
                }
            }

            this.method917(var1, var2, var3, null, var7, null);
        }
    }

    void method942(int var1, int var2) {
        field1614 = -1;
        field1625 = -1;
        field1626 = var2;
        field1627 = var2;
        field1628 = var1;
        field1629 = var1;
        field1630 = 256;
        field1631 = 0;
        field1615 = 0;
    }

    void method935(String var1) {
        try {
            int var2;
            String var3;
            if (var1.startsWith("col=")) {
                var3 = var1.substring(4);
                var2 = class95.method363(var3, 16, true);
                field1629 = var2;
            } else if (var1.equals("/col")) {
                field1629 = field1628;
            } else if (var1.startsWith("str=")) {
                var3 = var1.substring(4);
                var2 = class95.method363(var3, 16, true);
                field1614 = var2;
            } else if (var1.equals("str")) {
                field1614 = 8388608;
            } else if (var1.equals("/str")) {
                field1614 = -1;
            } else if (var1.startsWith("u=")) {
                var3 = var1.substring(2);
                var2 = class95.method363(var3, 16, true);
                field1625 = var2;
            } else if (var1.equals("u")) {
                field1625 = 0;
            } else if (var1.equals("/u")) {
                field1625 = -1;
            } else if (var1.startsWith("shad=")) {
                var3 = var1.substring(5);
                var2 = class95.method363(var3, 16, true);
                field1627 = var2;
            } else if (var1.equals("shad")) {
                field1627 = 0;
            } else if (var1.equals("/shad")) {
                field1627 = field1626;
            } else if (var1.equals("br")) {
                this.method942(field1628, field1626);
            }
        } catch (Exception var4) {
        }

    }

    void method936(String var1, int var2) {
        int var3 = 0;
        boolean var4 = false;

        for (int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if (var6 == '<') {
                var4 = true;
            } else if (var6 == '>') {
                var4 = false;
            } else if (!var4 && var6 == ' ') {
                ++var3;
            }
        }

        if (var3 > 0) {
            field1631 = (var2 - this.method921(var1) << 8) / var3;
        }

    }

    void method937(String var1, int var2, int var3) {
        var3 -= this.field1617;
        int var4 = -1;
        int var5 = -1;

        for (int var6 = 0; var6 < var1.length(); ++var6) {
            if (var1.charAt(var6) != 0) {
                char var7 = (char) (class209.method1000(var1.charAt(var6)) & 255);
                if (var7 == '<') {
                    var4 = var6;
                } else {
                    int var9;
                    if (var7 == '>' && var4 != -1) {
                        String var8 = var1.substring(var4 + 1, var6);
                        var4 = -1;
                        if (var8.equals("lt")) {
                            var7 = '<';
                        } else {
                            if (!var8.equals("gt")) {
                                if (var8.startsWith("img=")) {
                                    try {
                                        var9 = class95.method368(var8.substring(4));
                                        class539 var13 = field1613[var9];
                                        var13.method2590(var2, var3 + this.field1617 - var13.field4289);
                                        var2 += var13.field4284;
                                        var5 = -1;
                                    } catch (Exception var11) {
                                    }
                                } else {
                                    this.method935(var8);
                                }
                                continue;
                            }

                            var7 = '>';
                        }
                    }

                    if (var7 == 160) {
                        var7 = ' ';
                    }

                    if (var4 == -1) {
                        if (this.field1624 != null && var5 != -1) {
                            var2 += this.field1624[(var5 << 8) + var7];
                        }

                        int var12 = this.field1616[var7];
                        var9 = this.field1634[var7];
                        if (var7 != ' ') {
                            if (field1630 == 256) {
                                if (field1627 != -1) {
                                    method948(this.field1632[var7], var2 + this.field1618[var7] + 1, var3 + this.field1619[var7] + 1, var12, var9, field1627);
                                }

                                this.method918(this.field1632[var7], var2 + this.field1618[var7], var3 + this.field1619[var7], var12, var9, field1629);
                            } else {
                                if (field1627 != -1) {
                                    method940(this.field1632[var7], var2 + this.field1618[var7] + 1, var3 + this.field1619[var7] + 1, var12, var9, field1627, field1630);
                                }

                                this.method938(this.field1632[var7], var2 + this.field1618[var7], var3 + this.field1619[var7], var12, var9, field1629, field1630);
                            }
                        } else if (field1631 > 0) {
                            field1615 += field1631;
                            var2 += field1615 >> 8;
                            field1615 &= 255;
                        }

                        int var10 = this.field1620[var7];
                        if (field1614 != -1) {
                            method1925(var2, var3 + (int) ((double) this.field1617 * 0.7D), var10, field1614);
                        }

                        if (field1625 != -1) {
                            method1925(var2, var3 + this.field1617 + 1, var10, field1625);
                        }

                        var2 += var10;
                        var5 = var7;
                    }
                }
            }
        }

    }

    void method917(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
        var3 -= this.field1617;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;

        for (int var10 = 0; var10 < var1.length(); ++var10) {
            if (var1.charAt(var10) != 0) {
                char var11 = (char) (class209.method1000(var1.charAt(var10)) & 255);
                if (var11 == '<') {
                    var7 = var10;
                } else {
                    int var13;
                    int var14;
                    int var15;
                    if (var11 == '>' && var7 != -1) {
                        String var12 = var1.substring(var7 + 1, var10);
                        var7 = -1;
                        if (var12.equals("lt")) {
                            var11 = '<';
                        } else {
                            if (!var12.equals("gt")) {
                                if (var12.startsWith("img=")) {
                                    try {
                                        if (var5 != null) {
                                            var13 = var5[var9];
                                        } else {
                                            var13 = 0;
                                        }

                                        if (var6 != null) {
                                            var14 = var6[var9];
                                        } else {
                                            var14 = 0;
                                        }

                                        ++var9;
                                        var15 = class95.method368(var12.substring(4));
                                        class539 var20 = field1613[var15];
                                        var20.method2590(var2 + var13, var3 + this.field1617 - var20.field4289 + var14);
                                        var2 += var20.field4284;
                                        var8 = -1;
                                    } catch (Exception var18) {
                                    }
                                } else {
                                    this.method935(var12);
                                }
                                continue;
                            }

                            var11 = '>';
                        }
                    }

                    if (var11 == 160) {
                        var11 = ' ';
                    }

                    if (var7 == -1) {
                        if (this.field1624 != null && var8 != -1) {
                            var2 += this.field1624[(var8 << 8) + var11];
                        }

                        int var19 = this.field1616[var11];
                        var13 = this.field1634[var11];
                        if (var5 != null) {
                            var14 = var5[var9];
                        } else {
                            var14 = 0;
                        }

                        if (var6 != null) {
                            var15 = var6[var9];
                        } else {
                            var15 = 0;
                        }

                        int var16;
                        if (var4 != null) {
                            var16 = var4[var9];
                        } else {
                            var16 = field1629;
                        }

                        ++var9;
                        if (var11 != ' ') {
                            if (field1630 == 256) {
                                if (field1627 != -1) {
                                    method948(this.field1632[var11], var2 + this.field1618[var11] + 1 + var14, var3 + this.field1619[var11] + 1 + var15, var19, var13, field1627);
                                }

                                this.method918(this.field1632[var11], var2 + this.field1618[var11] + var14, var3 + this.field1619[var11] + var15, var19, var13, var16);
                            } else {
                                if (field1627 != -1) {
                                    method940(this.field1632[var11], var2 + this.field1618[var11] + 1 + var14, var3 + this.field1619[var11] + 1 + var15, var19, var13, field1627, field1630);
                                }

                                this.method938(this.field1632[var11], var2 + this.field1618[var11] + var14, var3 + this.field1619[var11] + var15, var19, var13, var16, field1630);
                            }
                        } else if (field1631 > 0) {
                            field1615 += field1631;
                            var2 += field1615 >> 8;
                            field1615 &= 255;
                        }

                        int var17 = this.field1620[var11];
                        if (field1614 != -1) {
                            method1925(var2, var3 + (int) ((double) this.field1617 * 0.7D), var17, field1614);
                        }

                        if (field1625 != -1) {
                            method1925(var2, var3 + this.field1617, var17, field1625);
                        }

                        var2 += var17;
                        var8 = var11;
                    }
                }
            }
        }

    }
}
