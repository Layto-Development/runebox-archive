public class class86 extends class510 {
    public static class289 field739;
    public static class68 field738;
    static int[] field736;

    static {
        field739 = new class289(64);
    }

    class208 field737;

    class86() {
    }

    public static class86 method344(int var0) {
        class86 var2 = (class86) field739.method1307(var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = field738.method188(34, var0);
            var2 = new class86();
            if (var3 != null) {
                var2.method340(new class78(var3));
            }

            var2.method339();
            field739.method1306(var2, var0);
            return var2;
        }
    }

    void method339() {
    }

    void method340(class78 var1) {
        while (true) {
            int var3 = var1.method260();
            if (var3 == 0) {
                return;
            }

            this.method343(var1, var3);
        }
    }

    void method343(class78 var1, int var2) {
        if (var2 == 249) {
            this.field737 = class381.method1774(var1, this.field737);
        }

    }

    public int method341(int var1, int var2) {
        return class381.method1773(this.field737, var1, var2);
    }

    public String method342(int var1, String var2) {
        class208 var5 = this.field737;
        String var4;
        if (var5 == null) {
            var4 = var2;
        } else {
            class371 var6 = (class371) var5.method990(var1);
            if (null == var6) {
                var4 = var2;
            } else {
                var4 = (String) var6.field2646;
            }
        }

        return var4;
    }
}
