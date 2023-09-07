public class class48 extends class510 {
    static class289 field544;
    static class68 field545;
    static int[] field548;

    static {
        field544 = new class289(64);
    }

    public int[][] field546;
    public Object[][] field547;

    class48() {
    }

    public static class48 method138(int var0) {
        class48 var2 = (class48) field544.method1307(var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = field545.method188(39, var0);
            var2 = new class48();
            if (var3 != null) {
                var2.method135(new class78(var3));
            }

            var2.method137();
            field544.method1306(var2, var0);
            return var2;
        }
    }

    public static void method139() {
        field544.method1304();
    }

    void method135(class78 var1) {
        while (true) {
            int var3 = var1.method260();
            if (var3 == 0) {
                return;
            }

            this.method136(var1, var3);
        }
    }

    void method136(class78 var1, int var2) {
        if (var2 == 1) {
            int var4 = var1.method260();
            if (this.field546 == null) {
                this.field546 = new int[var4][];
            }

            for (int var5 = var1.method260(); var5 != 255; var5 = var1.method260()) {
                int var6 = var5 & 127;
                boolean var7 = (var5 & 128) != 0;
                int[] var8 = new int[var1.method260()];

                for (int var9 = 0; var9 < var8.length; ++var9) {
                    var8[var9] = var1.method307();
                }

                this.field546[var6] = var8;
                if (var7) {
                    if (null == this.field547) {
                        this.field547 = new Object[this.field546.length][];
                    }

                    this.field547[var6] = class497.method2248(var1, var8);
                }
            }
        }

    }

    void method137() {
    }
}
