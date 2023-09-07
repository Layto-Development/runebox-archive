public class class476 {
    class434[] field3411;
    int field3410;

    class476() {
        this.field3411 = new class434[100];
    }

    class434 method2184(int var1, String var2, String var3, String var4) {
        class434 var6 = this.field3411[99];

        for (int var7 = this.field3410; var7 > 0; --var7) {
            if (var7 != 100) {
                this.field3411[var7] = this.field3411[var7 - 1];
            }
        }

        if (null == var6) {
            var6 = new class434(var1, var2, var4, var3);
        } else {
            var6.method221();
            var6.method2300();
            var6.method1976(var1, var2, var4, var3);
        }

        this.field3411[0] = var6;
        if (this.field3410 < 100) {
            ++this.field3410;
        }

        return var6;
    }

    class434 method2185(int var1) {
        return var1 >= 0 && var1 < this.field3410 ? this.field3411[var1] : null;
    }

    int method2183() {
        return this.field3410;
    }
}
