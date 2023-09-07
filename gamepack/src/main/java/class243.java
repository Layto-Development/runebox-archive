public class class243 extends class510 {
    static class289 field1857;
    static class68 field1859;
    static int field1860;

    static {
        field1857 = new class289(64);
    }

    public int field1854;
    public String field1858;
    boolean field1855;
    char field1856;

    class243() {
        this.field1855 = true;
    }

    public static void method1089(class68 var0) {
        field1859 = var0;
    }

    public static class243 method1090(int var0) {
        class243 var2 = (class243) field1857.method1307(var0);
        if (null != var2) {
            return var2;
        } else {
            byte[] var3 = field1859.method188(11, var0);
            var2 = new class243();
            if (var3 != null) {
                var2.method1085(new class78(var3));
            }

            var2.method1084();
            field1857.method1306(var2, var0);
            return var2;
        }
    }

    public static void method1088() {
        field1857.method1304();
    }

    void method1084() {
    }

    void method1085(class78 var1) {
        while (true) {
            int var3 = var1.method260();
            if (var3 == 0) {
                return;
            }

            this.method1086(var1, var3);
        }
    }

    void method1086(class78 var1, int var2) {
        if (var2 == 1) {
            this.field1856 = class209.method995(var1.method261());
        } else if (var2 == 2) {
            this.field1854 = var1.method264();
        } else if (var2 == 4) {
            this.field1855 = false;
        } else if (var2 == 5) {
            this.field1858 = var1.method268();
        }

    }

    public boolean method1087() {
        return this.field1856 == 's';
    }
}
