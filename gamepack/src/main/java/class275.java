import java.util.LinkedList;

public abstract class class275 {
    boolean field2018;
    boolean field2019;
    byte[][][] field2007;
    byte[][][] field2020;
    class455[][][][] field2017;
    int field2006;
    int field2008;
    int field2009;
    int field2010;
    int field2012;
    int field2014;
    int field2015;
    int field2016;
    short[][][] field2011;
    short[][][] field2013;

    class275() {
        this.field2016 = -1;
        this.field2006 = -1;
        new LinkedList();
        this.field2018 = false;
        this.field2019 = false;
    }

    abstract void method1236(class78 var1);

    boolean method1233() {
        return this.field2018 && this.field2019;
    }

    void method1234(class68 var1) {
        if (!this.method1233()) {
            byte[] var3 = var1.method188(this.field2016, this.field2006);
            if (var3 != null) {
                this.method1236(new class78(var3));
                this.field2018 = true;
                this.field2019 = true;
            }

        }
    }

    void method1235() {
        this.field2013 = null;
        this.field2011 = null;
        this.field2020 = null;
        this.field2007 = null;
        this.field2017 = null;
        this.field2018 = false;
        this.field2019 = false;
    }

    void method1238(int var1, int var2, class78 var3) {
        int var5 = var3.method260();
        if (var5 != 0) {
            if ((var5 & 1) != 0) {
                this.method1237(var1, var2, var3, var5);
            } else {
                this.method1241(var1, var2, var3, var5);
            }

        }
    }

    void method1237(int var1, int var2, class78 var3, int var4) {
        boolean var6 = (var4 & 2) != 0;
        if (var6) {
            this.field2011[0][var1][var2] = (short) var3.method309();
        }

        this.field2013[0][var1][var2] = (short) var3.method309();
    }

    void method1241(int var1, int var2, class78 var3, int var4) {
        int var6 = ((var4 & 24) >> 3) + 1;
        boolean var7 = (var4 & 2) != 0;
        boolean var8 = (var4 & 4) != 0;
        this.field2013[0][var1][var2] = (short) var3.method309();
        int var9;
        int var10;
        int var12;
        if (var7) {
            var9 = var3.method260();

            for (var10 = 0; var10 < var9; ++var10) {
                int var11 = var3.method309();
                if (var11 != 0) {
                    this.field2011[var10][var1][var2] = (short) var11;
                    var12 = var3.method260();
                    this.field2020[var10][var1][var2] = (byte) (var12 >> 2);
                    this.field2007[var10][var1][var2] = (byte) (var12 & 3);
                }
            }
        }

        if (var8) {
            for (var9 = 0; var9 < var6; ++var9) {
                var10 = var3.method260();
                if (var10 != 0) {
                    class455[] var15 = this.field2017[var9][var1][var2] = new class455[var10];

                    for (var12 = 0; var12 < var10; ++var12) {
                        int var13 = var3.method308();
                        int var14 = var3.method260();
                        var15[var12] = new class455(var13, var14 >> 2, var14 & 3);
                    }
                }
            }
        }

    }

    int method1239() {
        return this.field2008;
    }

    int method1240() {
        return this.field2015;
    }
}
