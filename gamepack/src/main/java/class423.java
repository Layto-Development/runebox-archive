public class class423 {
    static class97 field2915;
    public int field2916;
    class247 field2917;
    long field2918;

    public class423(class78 var1) {
        this.field2916 = -1;
        this.field2917 = new class247();
        this.method1944(var1);
    }

    public static class46 method1945(byte var0) {
        return class46.field540 == 0 ? new class46() : class46.field539[--class46.field540];
    }

    void method1944(class78 var1) {
        this.field2918 = var1.method265();
        this.field2916 = var1.method264();

        for (int var3 = var1.method260(); var3 != 0; var3 = var1.method260()) {
            Object var4;
            if (var3 == 3) {
                var4 = new class217(this);
            } else if (var3 == 1) {
                var4 = new class202(this);
            } else if (var3 == 13) {
                var4 = new class101(this);
            } else if (var3 == 4) {
                var4 = new class109(this);
            } else if (var3 == 6) {
                var4 = new class165(this);
            } else if (var3 == 5) {
                var4 = new class18(this);
            } else if (var3 == 2) {
                var4 = new class164(this);
            } else if (var3 == 7) {
                var4 = new class348(this);
            } else if (var3 == 14) {
                var4 = new class53(this);
            } else if (var3 == 8) {
                var4 = new class183(this);
            } else if (var3 == 9) {
                var4 = new class169(this);
            } else if (var3 == 10) {
                var4 = new class502(this);
            } else if (var3 == 11) {
                var4 = new class474(this);
            } else if (var3 == 12) {
                var4 = new class128(this);
            } else {
                if (var3 != 15) {
                    throw new RuntimeException("");
                }

                var4 = new class173(this);
            }

            ((class438) var4).method2006(var1);
            this.field2917.method1100((class70) var4);
        }

    }

    public void method1943(class133 var1) {
        if (var1.field1161 == this.field2918 && this.field2916 == var1.field1178) {
            for (class438 var3 = (class438) this.field2917.method1106(); null != var3; var3 = (class438) this.field2917.method1102()) {
                var3.method2005(var1);
            }

            ++var1.field1178;
        } else {
            throw new RuntimeException("");
        }
    }
}
