public class class397 extends class510 {
    public static class289 field2796;
    public static int field2795;
    static class68 field2797;
    static class68 field2798;
    static int field2799;

    static {
        field2796 = new class289(64);
    }

    public int field2794;

    class397() {
        this.field2794 = 0;
    }

    public static void method1820(class68 var0) {
        field2797 = var0;
        field2795 = field2797.method214(16);
    }

    void method1819(class78 var1) {
        while (true) {
            int var3 = var1.method260();
            if (var3 == 0) {
                return;
            }

            this.method1818(var1, var3);
        }
    }

    void method1818(class78 var1, int var2) {
        if (var2 == 5) {
            this.field2794 = var1.method309();
        }

    }
}
