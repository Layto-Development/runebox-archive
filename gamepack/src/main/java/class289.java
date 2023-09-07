public final class class289 {
    class207 field2111;
    class208 field2113;
    class510 field2114;
    int field2110;
    int field2112;

    public class289(int var1) {
        this.field2114 = new class510();
        this.field2111 = new class207();
        this.field2110 = var1;
        this.field2112 = var1;

        int var2;
        for (var2 = 1; var2 + var2 < var1; var2 += var2) {
        }

        this.field2113 = new class208(var2);
    }

    public class510 method1307(long var1) {
        class510 var3 = (class510) this.field2113.method990(var1);
        if (var3 != null) {
            this.field2111.method983(var3);
        }

        return var3;
    }

    public void method1305(long var1) {
        class510 var3 = (class510) this.field2113.method990(var1);
        if (var3 != null) {
            var3.method221();
            var3.method2300();
            ++this.field2112;
        }

    }

    public void method1306(class510 var1, long var2) {
        if (this.field2112 == 0) {
            class510 var4 = this.field2111.method985();
            var4.method221();
            var4.method2300();
            if (var4 == this.field2114) {
                var4 = this.field2111.method985();
                var4.method221();
                var4.method2300();
            }
        } else {
            --this.field2112;
        }

        this.field2113.method994(var1, var2);
        this.field2111.method983(var1);
    }

    public void method1304() {
        this.field2111.method989();
        this.field2113.method991();
        this.field2114 = new class510();
        this.field2112 = this.field2110;
    }
}
