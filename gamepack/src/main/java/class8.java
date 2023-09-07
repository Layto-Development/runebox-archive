public class class8 {
    static class331 field44;
    public int field40;
    public int field41;
    public int field42;
    public int field43;

    public class8(int var1, int var2) {
        this(0, 0, var1, var2);
    }

    public class8(int var1, int var2, int var3, int var4) {
        this.method11(var1, var2);
        this.method12(var3, var4);
    }

    static final boolean method18(class97 var0) {
        int var2 = var0.field817;
        if (var2 == 205) {
            Client.field3828 = 250;
            return true;
        } else {
            int var3;
            int var4;
            if (var2 >= 300 && var2 <= 313) {
                var3 = (var2 - 300) / 2;
                var4 = var2 & 1;
                Client.field4061.method147(var3, var4 == 1);
            }

            if (var2 >= 314 && var2 <= 323) {
                var3 = (var2 - 314) / 2;
                var4 = var2 & 1;
                Client.field4061.method148(var3, var4 == 1);
            }

            if (var2 == 324) {
                Client.field4061.method155(0);
            }

            if (var2 == 325) {
                Client.field4061.method155(1);
            }

            if (var2 == 326) {
                class46 var5 = class46.method134(class488.field3558, Client.field3840.field2238);
                Client.field4061.method149(var5.field541);
                Client.field3840.method1359(var5);
                return true;
            } else {
                return false;
            }
        }
    }

    public void method11(int var1, int var2) {
        this.field43 = var1;
        this.field41 = var2;
    }

    public void method12(int var1, int var2) {
        this.field42 = var1;
        this.field40 = var2;
    }

    public boolean method13(int var1, int var2, byte var3) {
        return var1 >= this.field43 && var1 < this.field42 + this.field43 && var2 >= this.field41 && var2 < this.field41 + this.field40;
    }

    @Override
    public String toString() {
        return null;
    }

    public void method14(class8 var1, class8 var2) {
        this.method15(var1, var2);
        this.method16(var1, var2);
    }

    void method15(class8 var1, class8 var2) {
        var2.field43 = this.field43;
        var2.field42 = this.field42;
        if (this.field43 < var1.field43) {
            var2.field42 = (var2.field42 * 2133643001 - (var1.field43 * 2133643001 - this.field43 * 2133643001)) * -2074045623;
            var2.field43 = var1.field43;
        }

        if (var2.method17() > var1.method17()) {
            var2.field42 -= var2.method17() - var1.method17();
        }

        if (var2.field42 < 0) {
            var2.field42 = 0;
        }

    }

    void method16(class8 var1, class8 var2) {
        var2.field41 = this.field41;
        var2.field40 = this.field40;
        if (this.field41 < var1.field41) {
            var2.field40 = (var2.field40 * -584535177 - (var1.field41 * -584535177 - this.field41 * -584535177)) * 377886279;
            var2.field41 = var1.field41;
        }

        if (var2.method19() > var1.method19()) {
            var2.field40 -= var2.method19() - var1.method19();
        }

        if (var2.field40 < 0) {
            var2.field40 = 0;
        }

    }

    int method17() {
        return this.field42 + this.field43;
    }

    int method19() {
        return this.field41 + this.field40;
    }
}
