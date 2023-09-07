public final class class272 extends class490 {
    int field1992;
    int field1993;
    int field1994;

    class272() {
        this.field1994 = 31;
    }

    void method1217(int var1) {
        this.field1994 = var1;
    }

    boolean method1216(int var1) {
        if (var1 >= 0 && var1 <= 4) {
            return (this.field1994 & 1 << var1) != 0;
        } else {
            return true;
        }
    }

    @Override
    protected class448 method2238() {
        return class508.method2299(this.field1992).method2284(this.field1993);
    }
}
