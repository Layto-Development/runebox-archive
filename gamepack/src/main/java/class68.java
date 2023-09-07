public abstract class class68 {
    static class116 field653;
    static int field652;

    static {
        field653 = new class116();
        field652 = 0;
    }

    public int field649;
    boolean field637;
    boolean field650;
    class421 field639;
    class421[] field648;
    int field643;
    int[] field640;
    int[] field641;
    int[] field642;
    int[] field646;
    int[] field651;
    int[][] field638;
    int[][] field644;
    Object[] field645;
    Object[][] field647;

    class68(boolean var1, boolean var2) {
        this.field650 = var1;
        this.field637 = var2;
    }

    static final byte[] method216(byte[] var0) {
        class78 var2 = new class78(var0);
        int var3 = var2.method260();
        int var4 = var2.method264();
        if (var4 >= 0 && (field652 == 0 || var4 <= field652)) {
            if (var3 == 0) {
                byte[] var7 = new byte[var4];
                var2.method270(var7, 0, var4);
                return var7;
            } else {
                int var5 = var2.method264();
                if (var5 < 0 || field652 != 0 && var5 > field652) {
                    throw new RuntimeException();
                } else {
                    byte[] var6 = new byte[var5];
                    if (var3 == 1) {
                        class40.method112(var6, var5, var0, var4, 9);
                    } else {
                        field653.method526(var2, var6);
                    }

                    return var6;
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    void method211(byte[] var1) {
        int var4 = var1.length;
        int var6 = -1;

        int var7;
        for (var7 = 0; var7 < var4; ++var7) {
            var6 = var6 >>> 8 ^ class78.field696[(var6 ^ var1[var7]) & 255];
        }

        var6 = ~var6;
        this.field649 = var6;
        class78 var5 = new class78(method216(var1));
        var6 = var5.method260();
        if (var6 >= 5 && var6 <= 7) {
            if (var6 >= 6) {
                var5.method264();
            }

            var7 = var5.method260();
            if (var6 >= 7) {
                this.field643 = var5.method274();
            } else {
                this.field643 = var5.method309();
            }

            int var8 = 0;
            int var9 = -1;
            this.field651 = new int[this.field643];
            int var10;
            if (var6 >= 7) {
                for (var10 = 0; var10 < this.field643; ++var10) {
                    this.field651[var10] = var8 += var5.method274();
                    if (this.field651[var10] > var9) {
                        var9 = this.field651[var10];
                    }
                }
            } else {
                for (var10 = 0; var10 < this.field643; ++var10) {
                    this.field651[var10] = var8 += var5.method309();
                    if (this.field651[var10] > var9) {
                        var9 = this.field651[var10];
                    }
                }
            }

            this.field640 = new int[var9 + 1];
            this.field641 = new int[var9 + 1];
            this.field642 = new int[var9 + 1];
            this.field638 = new int[var9 + 1][];
            this.field645 = new Object[var9 + 1];
            this.field647 = new Object[var9 + 1][];
            if (var7 != 0) {
                this.field646 = new int[var9 + 1];

                for (var10 = 0; var10 < this.field643; ++var10) {
                    this.field646[this.field651[var10]] = var5.method264();
                }

                this.field639 = new class421(this.field646);
            }

            for (var10 = 0; var10 < this.field643; ++var10) {
                this.field640[this.field651[var10]] = var5.method264();
            }

            for (var10 = 0; var10 < this.field643; ++var10) {
                this.field641[this.field651[var10]] = var5.method264();
            }

            for (var10 = 0; var10 < this.field643; ++var10) {
                this.field642[this.field651[var10]] = var5.method309();
            }

            int var11;
            int var12;
            int var13;
            int var14;
            int var15;
            if (var6 >= 7) {
                for (var10 = 0; var10 < this.field643; ++var10) {
                    var11 = this.field651[var10];
                    var12 = this.field642[var11];
                    var8 = 0;
                    var13 = -1;
                    this.field638[var11] = new int[var12];

                    for (var14 = 0; var14 < var12; ++var14) {
                        var15 = this.field638[var11][var14] = var8 += var5.method274();
                        if (var15 > var13) {
                            var13 = var15;
                        }
                    }

                    this.field647[var11] = new Object[var13 + 1];
                }
            } else {
                for (var10 = 0; var10 < this.field643; ++var10) {
                    var11 = this.field651[var10];
                    var12 = this.field642[var11];
                    var8 = 0;
                    var13 = -1;
                    this.field638[var11] = new int[var12];

                    for (var14 = 0; var14 < var12; ++var14) {
                        var15 = this.field638[var11][var14] = var8 += var5.method309();
                        if (var15 > var13) {
                            var13 = var15;
                        }
                    }

                    this.field647[var11] = new Object[var13 + 1];
                }
            }

            if (var7 != 0) {
                this.field644 = new int[var9 + 1][];
                this.field648 = new class421[var9 + 1];

                for (var10 = 0; var10 < this.field643; ++var10) {
                    var11 = this.field651[var10];
                    var12 = this.field642[var11];
                    this.field644[var11] = new int[this.field647[var11].length];

                    for (var13 = 0; var13 < var12; ++var13) {
                        this.field644[var11][this.field638[var11][var13]] = var5.method264();
                    }

                    this.field648[var11] = new class421(this.field644[var11]);
                }
            }

        } else {
            throw new RuntimeException("");
        }
    }

    void method206(int var1) {
    }

    public byte[] method188(int var1, int var2) {
        return this.method189(var1, var2, null);
    }

    public byte[] method189(int var1, int var2, int[] var3) {
        if (var1 >= 0 && var1 < this.field647.length && null != this.field647[var1] && var2 >= 0 && var2 < this.field647[var1].length) {
            if (null == this.field647[var1][var2]) {
                boolean var5 = this.method204(var1, var3);
                if (!var5) {
                    this.method198(var1);
                    var5 = this.method204(var1, var3);
                    if (!var5) {
                        return null;
                    }
                }
            }

            byte[] var6 = class441.method2011(this.field647[var1][var2], false);
            if (this.field637) {
                this.field647[var1][var2] = null;
            }

            return var6;
        } else {
            return null;
        }
    }

    public boolean method190(int var1, int var2) {
        if (var1 >= 0 && var1 < this.field647.length && this.field647[var1] != null && var2 >= 0 && var2 < this.field647[var1].length) {
            if (this.field647[var1][var2] != null) {
                return true;
            } else if (null != this.field645[var1]) {
                return true;
            } else {
                this.method198(var1);
                return null != this.field645[var1];
            }
        } else {
            return false;
        }
    }

    public boolean method191(int var1) {
        if (this.field647.length == 1) {
            return this.method190(0, var1);
        } else if (this.field647[var1].length == 1) {
            return this.method190(var1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    public boolean method192(int var1) {
        if (this.field645[var1] != null) {
            return true;
        } else {
            this.method198(var1);
            return null != this.field645[var1];
        }
    }

    public boolean method193() {
        boolean var2 = true;

        for (int var3 = 0; var3 < this.field651.length; ++var3) {
            int var4 = this.field651[var3];
            if (this.field645[var4] == null) {
                this.method198(var4);
                if (this.field645[var4] == null) {
                    var2 = false;
                }
            }
        }

        return var2;
    }

    int method194(int var1) {
        return null != this.field645[var1] ? 100 : 0;
    }

    public byte[] method195(int var1) {
        if (this.field647.length == 1) {
            return this.method188(0, var1);
        } else if (this.field647[var1].length == 1) {
            return this.method188(var1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    public byte[] method196(int var1, int var2) {
        if (var1 >= 0 && var1 < this.field647.length && this.field647[var1] != null && var2 >= 0 && var2 < this.field647[var1].length) {
            if (null == this.field647[var1][var2]) {
                boolean var4 = this.method204(var1, null);
                if (!var4) {
                    this.method198(var1);
                    var4 = this.method204(var1, null);
                    if (!var4) {
                        return null;
                    }
                }
            }

            byte[] var5 = class441.method2011(this.field647[var1][var2], false);
            return var5;
        } else {
            return null;
        }
    }

    public byte[] method197(int var1) {
        if (this.field647.length == 1) {
            return this.method196(0, var1);
        } else if (this.field647[var1].length == 1) {
            return this.method196(var1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    void method198(int var1) {
    }

    public int[] method199(int var1) {
        return var1 >= 0 && var1 < this.field638.length ? this.field638[var1] : null;
    }

    public int method214(int var1) {
        return null != this.field647 && var1 < this.field647.length && this.field647[var1] != null ? this.field647[var1].length : 0;
    }

    public int method200() {
        return this.field647.length;
    }

    public void method201() {
        for (int var2 = 0; var2 < this.field645.length; ++var2) {
            this.field645[var2] = null;
        }

    }

    public void method202(int var1) {
        for (int var3 = 0; var3 < this.field647[var1].length; ++var3) {
            this.field647[var1][var3] = null;
        }

    }

    public void method203() {
        for (int var2 = 0; var2 < this.field647.length; ++var2) {
            if (this.field647[var2] != null) {
                for (int var3 = 0; var3 < this.field647[var2].length; ++var3) {
                    this.field647[var2][var3] = null;
                }
            }
        }

    }

    boolean method204(int var1, int[] var2) {
        if (this.field645[var1] == null) {
            return false;
        } else {
            int var4 = this.field642[var1];
            int[] var5 = this.field638[var1];
            Object[] var6 = this.field647[var1];
            boolean var7 = true;

            for (int var8 = 0; var8 < var4; ++var8) {
                if (null == var6[var5[var8]]) {
                    var7 = false;
                    break;
                }
            }

            if (var7) {
                return true;
            } else {
                byte[] var22;
                if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) {
                    var22 = class441.method2011(this.field645[var1], false);
                } else {
                    var22 = class441.method2011(this.field645[var1], true);
                    class78 var9 = new class78(var22);
                    var9.method311(var2, 5, var9.field695.length);
                }

                byte[] var23 = method216(var22);
                if (this.field650) {
                    this.field645[var1] = null;
                }

                int var11;
                if (var4 > 1) {
                    int var10 = var23.length;
                    --var10;
                    var11 = var23[var10] & 255;
                    var10 -= var11 * var4 * 4;
                    class78 var12 = new class78(var23);
                    int[] var13 = new int[var4];
                    var12.field697 = var10;

                    int var15;
                    int var16;
                    for (int var14 = 0; var14 < var11; ++var14) {
                        var15 = 0;

                        for (var16 = 0; var16 < var4; ++var16) {
                            var15 += var12.method264();
                            var13[var16] += var15;
                        }
                    }

                    byte[][] var26 = new byte[var4][];

                    for (var15 = 0; var15 < var4; ++var15) {
                        var26[var15] = new byte[var13[var15]];
                        var13[var15] = 0;
                    }

                    var12.field697 = var10;
                    var15 = 0;

                    int var18;
                    for (var16 = 0; var16 < var11; ++var16) {
                        int var17 = 0;

                        for (var18 = 0; var18 < var4; ++var18) {
                            var17 += var12.method264();
                            System.arraycopy(var23, var15, var26[var18], var13[var18], var17);
                            var13[var18] += var17;
                            var15 += var17;
                        }
                    }

                    for (var16 = 0; var16 < var4; ++var16) {
                        if (!this.field637) {
                            var18 = var5[var16];
                            byte[] var20 = var26[var16];
                            Object var19;
                            if (var20 == null) {
                                var19 = null;
                            } else if (var20.length > 136) {
                                class181 var21 = new class181();
                                var21.method2009(var20);
                                var19 = var21;
                            } else {
                                var19 = var20;
                            }

                            var6[var18] = var19;
                        } else {
                            var6[var5[var16]] = var26[var16];
                        }
                    }
                } else if (!this.field637) {
                    var11 = var5[0];
                    Object var24;
                    if (var23 == null) {
                        var24 = null;
                    } else if (var23.length > 136) {
                        class181 var25 = new class181();
                        var25.method2009(var23);
                        var24 = var25;
                    } else {
                        var24 = var23;
                    }

                    var6[var11] = var24;
                } else {
                    var6[var5[0]] = var23;
                }

                return true;
            }
        }
    }

    public int method213(String var1) {
        var1 = var1.toLowerCase();
        return this.field639.method1938(class95.method371(var1));
    }

    public int method205(int var1, String var2) {
        var2 = var2.toLowerCase();
        return this.field648[var1].method1938(class95.method371(var2));
    }

    public boolean method210(String var1, String var2) {
        var1 = var1.toLowerCase();
        var2 = var2.toLowerCase();
        int var4 = this.field639.method1938(class95.method371(var1));
        if (var4 < 0) {
            return false;
        } else {
            int var5 = this.field648[var4].method1938(class95.method371(var2));
            return var5 >= 0;
        }
    }

    public byte[] method207(String var1, String var2) {
        var1 = var1.toLowerCase();
        var2 = var2.toLowerCase();
        int var4 = this.field639.method1938(class95.method371(var1));
        int var5 = this.field648[var4].method1938(class95.method371(var2));
        return this.method188(var4, var5);
    }

    public boolean method208(String var1, String var2) {
        var1 = var1.toLowerCase();
        var2 = var2.toLowerCase();
        int var4 = this.field639.method1938(class95.method371(var1));
        int var5 = this.field648[var4].method1938(class95.method371(var2));
        return this.method190(var4, var5);
    }

    public boolean method209(String var1) {
        var1 = var1.toLowerCase();
        int var3 = this.field639.method1938(class95.method371(var1));
        return this.method192(var3);
    }

    public void method212(String var1) {
        var1 = var1.toLowerCase();
        int var3 = this.field639.method1938(class95.method371(var1));
        if (var3 >= 0) {
            this.method206(var3);
        }
    }

    public int method215(String var1) {
        var1 = var1.toLowerCase();
        int var3 = this.field639.method1938(class95.method371(var1));
        return this.method194(var3);
    }
}
