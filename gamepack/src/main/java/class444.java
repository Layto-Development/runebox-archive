public class class444 implements class302 {
    class231[] field3017;
    class43 field3018;
    class68 field3015;
    double field3016;
    int field3013;
    int field3014;
    int field3019;

    public class444(class68 var1, class68 var2, int var3, double var4, int var6) {
        this.field3018 = new class43();
        this.field3014 = 0;
        this.field3016 = 1.0D;
        this.field3019 = 128;
        this.field3015 = var2;
        this.field3013 = var3;
        this.field3014 = this.field3013;
        this.field3016 = var4;
        this.field3019 = var6;
        int[] var7 = var1.method199(0);
        if (var7 != null) {
            int var8 = var7.length;
            this.field3017 = new class231[var1.method214(0)];

            for (int var9 = 0; var9 < var8; ++var9) {
                class78 var10 = new class78(var1.method188(0, var7[var9]));
                this.field3017[var7[var9]] = new class231(var10);
            }
        } else {
            this.field3017 = new class231[0];
        }

    }

    public int method2026() {
        if (this.field3017.length == 0) {
            return 100;
        } else {
            int var2 = 0;
            int var3 = 0;
            class231[] var4 = this.field3017;

            for (int var5 = 0; var5 < var4.length; ++var5) {
                class231 var6 = var4[var5];
                if (var6 != null && var6.field1812 != null) {
                    var2 += var6.field1812.length;
                    int[] var7 = var6.field1812;

                    for (int var8 = 0; var8 < var7.length; ++var8) {
                        int var9 = var7[var8];
                        if (this.field3015.method191(var9)) {
                            ++var3;
                        }
                    }
                }
            }

            if (var2 == 0) {
                return 0;
            } else {
                return var3 * 100 / var2;
            }
        }
    }

    public void method2027(double var1) {
        this.field3016 = var1;
        this.method2029();
    }

    @Override
    public int[] method1335(int var1) {
        class231 var3 = this.field3017[var1];
        if (null != var3) {
            if (var3.field1818 != null) {
                this.field3018.method127(var3);
                var3.field1817 = true;
                return var3.field1818;
            }

            boolean var4 = var3.method1055(this.field3016, this.field3019, this.field3015);
            if (var4) {
                if (this.field3014 == 0) {
                    class231 var5 = (class231) this.field3018.method121();
                    var5.method1053();
                } else {
                    --this.field3014;
                }

                this.field3018.method127(var3);
                var3.field1817 = true;
                return var3.field1818;
            }
        }

        return null;
    }

    @Override
    public int method1332(int var1) {
        return this.field3017[var1] != null ? this.field3017[var1].field1810 : 0;
    }

    @Override
    public boolean method1334(int var1) {
        return this.field3017[var1].field1811;
    }

    @Override
    public boolean method1333(int var1) {
        return this.field3019 == 64;
    }

    public void method2029() {
        for (int var2 = 0; var2 < this.field3017.length; ++var2) {
            if (null != this.field3017[var2]) {
                this.field3017[var2].method1053();
            }
        }

        this.field3018 = new class43();
        this.field3014 = this.field3013;
    }

    public void method2028(int var1) {
        for (int var3 = 0; var3 < this.field3017.length; ++var3) {
            class231 var4 = this.field3017[var3];
            if (null != var4 && var4.field1816 != 0 && var4.field1817) {
                var4.method1054(var1);
                var4.field1817 = false;
            }
        }

    }
}
