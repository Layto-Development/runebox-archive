public final class class250 {
    class185 field1904;
    class207 field1906;
    class208 field1905;
    int field1903;
    int field1907;

    public class250(int var1) {
        this(var1, var1);
    }

    public class250(int var1, int var2) {
        this.field1906 = new class207();
        this.field1907 = var1;
        this.field1903 = var1;

        int var3;
        for (var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
        }

        this.field1905 = new class208(var3);
    }

    public Object method1117(long var1) {
        class191 var3 = (class191) this.field1905.method990(var1);
        if (var3 == null) {
            return null;
        } else {
            Object var4 = var3.method885();
            if (var4 == null) {
                var3.method221();
                var3.method2300();
                this.field1903 += var3.field1553;
                return null;
            } else {
                if (var3.method884()) {
                    class91 var5 = new class91(var4, var3.field1553);
                    this.field1905.method994(var5, var3.field658);
                    this.field1906.method983(var5);
                    var5.field3771 = 0L;
                    var3.method221();
                    var3.method2300();
                } else {
                    this.field1906.method983(var3);
                    var3.field3771 = 0L;
                }

                return var4;
            }
        }
    }

    void method1123(long var1) {
        class191 var3 = (class191) this.field1905.method990(var1);
        this.method1118(var3);
    }

    void method1118(class191 var1) {
        if (var1 != null) {
            var1.method221();
            var1.method2300();
            this.field1903 += var1.field1553;
        }

    }

    public void method1119(Object var1, long var2) {
        this.method1120(var1, var2, 1);
    }

    public void method1120(Object var1, long var2, int var4) {
        if (var4 > this.field1907) {
            throw new IllegalStateException();
        } else {
            this.method1123(var2);
            this.field1903 -= var4;

            while (this.field1903 < 0) {
                class191 var5 = (class191) this.field1906.method985();
                if (var5 == null) {
                    throw new RuntimeException("");
                }

                if (!var5.method884()) {
                }

                this.method1118(var5);
                if (this.field1904 != null) {
                    this.field1904.method871(var5.method885());
                }
            }

            class91 var6 = new class91(var1, var4);
            this.field1905.method994(var6, var2);
            this.field1906.method983(var6);
            var6.field3771 = 0L;
        }
    }

    public void method1121(int var1) {
        for (class191 var2 = (class191) this.field1906.method986(); var2 != null; var2 = (class191) this.field1906.method988()) {
            if (var2.method884()) {
                if (var2.method885() == null) {
                    var2.method221();
                    var2.method2300();
                    this.field1903 += var2.field1553;
                }
            } else if (++var2.field3771 > (long) 5) {
                class79 var3 = new class79(var2.method885(), var2.field1553);
                this.field1905.method994(var3, var2.field658);
                class207.method984(var3, var2);
                var2.method221();
                var2.method2300();
            }
        }

    }

    public void method1122() {
        this.field1906.method989();
        this.field1905.method991();
        this.field1903 = this.field1907;
    }
}
