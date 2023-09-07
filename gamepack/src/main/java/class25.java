public class class25 extends class369 {
    final class147 field134;
    final int field133;
    class341 field135;
    int field132;
    int field136;
    int field137;

    class25(class258 var1, class258 var2, int var3, class147 var4) {
        super(var1, var2);
        this.field133 = var3;
        this.field134 = var4;
        this.method75();
    }

    void method75() {
        this.field132 = class192.method892(this.field133, (byte) -56).method1346().field2209;
        this.field135 = this.field134.method690(class192.method893(this.field132));
        class192 var2 = class192.method893(this.method1743());
        class331 var3 = var2.method889(false);
        if (null != var3) {
            this.field136 = var3.field2423;
            this.field137 = var3.field2419;
        } else {
            this.field136 = 0;
            this.field137 = 0;
        }

    }

    @Override
    public int method1743() {
        return this.field132;
    }

    @Override
    class341 method1748() {
        return this.field135;
    }

    @Override
    int method1749() {
        return this.field136;
    }

    @Override
    int method1744() {
        return this.field137;
    }
}
