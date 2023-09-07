public class class123 extends class275 {
    int field1112;
    int field1113;
    int field1114;
    int field1115;

    class123() {
    }

    void method557(class78 var1) {
        int var3 = var1.method260();
        if (class301.field2164.field2165 != var3) {
            throw new IllegalStateException("");
        } else {
            super.field2009 = var1.method260();
            super.field2010 = var1.method260();
            super.field2014 = var1.method309();
            super.field2012 = var1.method309();
            this.field1113 = var1.method260();
            this.field1114 = var1.method260();
            super.field2008 = var1.method309();
            super.field2015 = var1.method309();
            this.field1112 = var1.method260();
            this.field1115 = var1.method260();
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
        if (class288.field2108.field2107 != var3) {
            throw new IllegalStateException("");
        } else {
            int var4 = var1.method260();
            int var5 = var1.method260();
            int var6 = var1.method260();
            int var7 = var1.method260();
            if (super.field2008 == var4 && var5 == super.field2015 && var6 == this.field1112 && this.field1115 == var7) {
                for (int var8 = 0; var8 < 8; ++var8) {
                    for (int var9 = 0; var9 < 8; ++var9) {
                        this.method1238(var8 + this.field1112 * 8, var9 + this.field1115 * 8, var1);
                    }
                }

            } else {
                throw new IllegalStateException("");
            }
        }
    }

    @Override
    public boolean equals(Object var1) {
        if (!(var1 instanceof class123)) {
            return false;
        } else {
            class123 var2 = (class123) var1;
            if (super.field2008 == var2.field2008 && var2.field2015 == super.field2015) {
                return var2.field1112 == this.field1112 && this.field1115 == var2.field1115;
            } else {
                return false;
            }
        }
    }

    @Override
    public int hashCode() {
        return super.field2008 | super.field2015 << 8 | this.field1112 << 16 | this.field1115 << 24;
    }

    int method560() {
        return this.field1113;
    }

    int method561() {
        return this.field1114;
    }

    int method559() {
        return this.field1112;
    }

    int method558() {
        return this.field1115;
    }
}
