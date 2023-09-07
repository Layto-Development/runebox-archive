public class class56 {
    static class539[] field601;
    static int field597;
    class178 field599;
    class68 field598;
    class68 field600;

    public class56(class68 var1, class68 var2) {
        new class178(256);
        this.field599 = new class178(256);
        this.field600 = var1;
        this.field598 = var2;
    }

    class433 method165(int var1, int var2, int[] var3) {
        long var5 = this.method169(var1, var2, false);
        class389 var7 = (class389) this.field599.method857(var5);
        if (null != var7) {
            return var7.method1807();
        } else if (var3 != null && var3[0] <= 0) {
            return null;
        } else {
            class131 var8 = class131.method590(this.field600, var1, var2);
            if (null == var8) {
                return null;
            } else {
                class433 var9 = var8.method588();
                this.field599.method860(new class389(var9), var5);
                if (var3 != null) {
                    var3[0] -= var9.field2945.length;
                }

                return var9;
            }
        }
    }

    class389 method164(int var1, int var2) {
        long var4 = this.method169(var1, var2, true);
        class389 var6 = (class389) this.field599.method857(var4);
        if (var6 != null) {
            return var6;
        } else {
            class442 var7 = class442.method2016(this.field598, var1, var2);
            if (var7 == null) {
                return new class389();
            } else {
                class389 var8 = new class389(var7);
                this.field599.method860(var8, var4);
                return var8;
            }
        }
    }

    class433 method166(int var1, int[] var2) {
        if (this.field600.method200() == 1) {
            return this.method165(0, var1, var2);
        } else if (this.field600.method214(var1) == 1) {
            return this.method165(var1, 0, var2);
        } else {
            throw new RuntimeException();
        }
    }

    public class389 method167(int var1) {
        if (this.field598.method200() == 1) {
            return this.method164(0, var1);
        } else if (this.field598.method214(var1) == 1) {
            return this.method164(var1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    public class433 method168(int var1) {
        return this.method166(var1, null);
    }

    long method169(int var1, int var2, boolean var3) {
        int var5 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
        var5 |= var1 << 16;
        return var3 ? (long) var5 ^ 4294967296L : (long) var5;
    }
}
