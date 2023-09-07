public class class201 extends class70 {
    public static int field1652;
    static int field1651;
    static int field1653;
    class247 field1650;
    class379 field1649;

    class201(class379 var1) {
        this.field1650 = new class247();
        this.field1649 = var1;
    }

    void method967(int var1, int var2, int var3, int var4) {
        class58 var6 = null;
        int var7 = 0;

        for (class58 var8 = (class58) this.field1650.method1106(); var8 != null; var8 = (class58) this.field1650.method1102()) {
            ++var7;
            if (var8.field606 == var1) {
                var8.method173(var1, var2, var3, var4);
                return;
            }

            if (var8.field606 <= var1) {
                var6 = var8;
            }
        }

        if (null == var6) {
            if (var7 < 4) {
                this.field1650.method1109(new class58(var1, var2, var3, var4));
            }

        } else {
            class247.method1107(new class58(var1, var2, var3, var4), var6);
            if (var7 >= 4) {
                this.field1650.method1106().method221();
            }

        }
    }

    class58 method968(int var1) {
        class58 var3 = (class58) this.field1650.method1106();
        if (null != var3 && var3.field606 <= var1) {
            for (class58 var4 = (class58) this.field1650.method1102(); null != var4 && var4.field606 <= var1; var4 = (class58) this.field1650.method1102()) {
                var3.method221();
                var3 = var4;
            }

            if (var3.field606 + var3.field604 + this.field1649.field2748 > var1) {
                return var3;
            } else {
                var3.method221();
                return null;
            }
        } else {
            return null;
        }
    }

    boolean method969() {
        return this.field1650.method1104();
    }
}
