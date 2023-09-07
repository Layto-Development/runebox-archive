public class class367 extends class391 {
    class43 field2622;
    class43 field2625;
    int field2623;
    int field2624;

    public class367() {
        this.field2625 = new class43();
        this.field2622 = new class43();
        this.field2624 = 0;
        this.field2623 = -1;
    }

    public final synchronized void method1730(class391 var1) {
        this.field2625.method127(var1);
    }

    public final synchronized void method1720(class391 var1) {
        var1.method221();
    }

    void method1721() {
        if (this.field2624 > 0) {
            for (class171 var1 = (class171) this.field2622.method122(); var1 != null; var1 = (class171) this.field2622.method124()) {
                var1.field1438 -= this.field2624;
            }

            this.field2623 -= this.field2624;
            this.field2624 = 0;
        }

    }

    void method1722(class70 var1, class171 var2) {
        while (var1 != this.field2622.field533 && ((class171) var1).field1438 <= var2.field1438) {
            var1 = var1.field657;
        }

        class43.method119(var2, var1);
        this.field2623 = ((class171) this.field2622.field533.field657).field1438;
    }

    void method1723(class171 var1) {
        var1.method221();
        var1.method812();
        class70 var2 = this.field2622.field533.field657;
        if (var2 == this.field2622.field533) {
            this.field2623 = -1;
        } else {
            this.field2623 = ((class171) var2).field1438;
        }

    }

    @Override
    protected class391 method1811() {
        return (class391) this.field2625.method122();
    }

    @Override
    protected class391 method1812() {
        return (class391) this.field2625.method124();
    }

    @Override
    protected int method1809() {
        return 0;
    }

    @Override
    public final synchronized void method1814(int[] var1, int var2, int var3) {
        do {
            if (this.field2623 < 0) {
                this.method1727(var1, var2, var3);
                return;
            }

            if (this.field2624 + var3 < this.field2623) {
                this.field2624 += var3;
                this.method1727(var1, var2, var3);
                return;
            }

            int var4 = this.field2623 - this.field2624;
            this.method1727(var1, var2, var4);
            var2 += var4;
            var3 -= var4;
            this.field2624 += var4;
            this.method1721();
            class171 var5 = (class171) this.field2622.method122();
            synchronized (var5) {
                int var7 = var5.method813(this);
                if (var7 < 0) {
                    var5.field1438 = 0;
                    this.method1723(var5);
                } else {
                    var5.field1438 = var7;
                    this.method1722(var5.field657, var5);
                }
            }
        } while (var3 != 0);

    }

    void method1727(int[] var1, int var2, int var3) {
        for (class391 var4 = (class391) this.field2625.method122(); var4 != null; var4 = (class391) this.field2625.method124()) {
            var4.method1815(var1, var2, var3);
        }

    }

    @Override
    public final synchronized void method1813(int var1) {
        do {
            if (this.field2623 < 0) {
                this.method1731(var1);
                return;
            }

            if (this.field2624 + var1 < this.field2623) {
                this.field2624 += var1;
                this.method1731(var1);
                return;
            }

            int var2 = this.field2623 - this.field2624;
            this.method1731(var2);
            var1 -= var2;
            this.field2624 += var2;
            this.method1721();
            class171 var3 = (class171) this.field2622.method122();
            synchronized (var3) {
                int var5 = var3.method813(this);
                if (var5 < 0) {
                    var3.field1438 = 0;
                    this.method1723(var3);
                } else {
                    var3.field1438 = var5;
                    this.method1722(var3.field657, var3);
                }
            }
        } while (var1 != 0);

    }

    void method1731(int var1) {
        for (class391 var2 = (class391) this.field2625.method122(); var2 != null; var2 = (class391) this.field2625.method124()) {
            var2.method1813(var1);
        }

    }
}
