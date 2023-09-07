public class class139 {
    static class372 field1226;
    static short[][][] field1225;
    class321[] field1223;
    int field1224;

    class139(class78 var1, int var2) {
        this.field1223 = new class321[var2];
        this.field1224 = var1.method260();

        for (int var3 = 0; var3 < this.field1223.length; ++var3) {
            class321 var4 = new class321(this.field1224, var1, false);
            this.field1223[var3] = var4;
        }

        this.method647();
    }

    void method647() {
        class321[] var2 = this.field1223;

        for (int var3 = 0; var3 < var2.length; ++var3) {
            class321 var4 = var2[var3];
            if (var4.field2317 >= 0) {
                var4.field2327 = this.field1223[var4.field2317];
            }
        }

    }

    public int method642() {
        return this.field1223.length;
    }

    class321 method643(int var1) {
        return var1 >= this.method642() ? null : this.field1223[var1];
    }

    class321[] method644() {
        return this.field1223;
    }

    void method645(class228 var1, int var2) {
        this.method646(var1, var2, null, false);
    }

    void method646(class228 var1, int var2, boolean[] var3, boolean var4) {
        int var6 = var1.method1041();
        int var7 = 0;
        class321[] var8 = this.method644();

        for (int var9 = 0; var9 < var8.length; ++var9) {
            class321 var10 = var8[var9];
            if (null == var3 || var4 == var3[var7]) {
                var1.method1043(var2, var10, var7, var6);
            }

            ++var7;
        }

    }
}
