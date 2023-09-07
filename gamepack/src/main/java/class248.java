public class class248 extends class275 {
    class248() {
    }

    void method1111(class78 var1) {
        int var3 = var1.method260();
        if (var3 != class301.field2163.field2165) {
            throw new IllegalStateException("");
        } else {
            super.field2009 = var1.method260();
            super.field2010 = var1.method260();
            super.field2014 = var1.method309();
            super.field2012 = var1.method309();
            super.field2008 = var1.method309();
            super.field2015 = var1.method309();
            super.field2016 = var1.method308();
            super.field2006 = var1.method308();
        }
    }

    @Override
    void method1236(class78 var1) {
        super.field2010 = Math.min(super.field2010, 4);
        super.field2013 = new short[1][64][64];
        super.field2011 = new short[super.field2010][64][64];
        super.field2020 = new byte[super.field2010][64][64];
        super.field2007 = new byte[super.field2010][64][64];
        super.field2017 = new class455[super.field2010][64][64][];
        int var3 = var1.method260();
        if (class288.field2106.field2107 != var3) {
            throw new IllegalStateException("");
        } else {
            int var4 = var1.method260();
            int var5 = var1.method260();
            if (var4 == super.field2008 && var5 == super.field2015) {
                for (int var6 = 0; var6 < 64; ++var6) {
                    for (int var7 = 0; var7 < 64; ++var7) {
                        this.method1238(var6, var7, var1);
                    }
                }

            } else {
                throw new IllegalStateException("");
            }
        }
    }

    @Override
    public boolean equals(Object var1) {
        if (!(var1 instanceof class248)) {
            return false;
        } else {
            class248 var2 = (class248) var1;
            return super.field2008 == var2.field2008 && super.field2015 == var2.field2015;
        }
    }

    @Override
    public int hashCode() {
        return super.field2008 | super.field2015 << 8;
    }
}
