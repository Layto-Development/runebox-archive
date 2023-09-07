public class class148 extends class510 {
    static class289 field1301;
    static class68 field1302;

    static {
        field1301 = new class289(64);
    }

    public int field1304;
    int[][] field1303;
    Object[][] field1305;

    class148() {
        this.field1304 = -1;
    }

    public static void method714(class68 var0) {
        field1302 = var0;
    }

    public static class148 method713(int var0) {
        class148 var2 = (class148) field1301.method1307(var0);
        if (null != var2) {
            return var2;
        } else {
            byte[] var3 = field1302.method188(38, var0);
            var2 = new class148();
            if (null != var3) {
                var2.method711(new class78(var3));
            }

            var2.method709();
            field1301.method1306(var2, var0);
            return var2;
        }
    }

    public static void method712() {
        field1301.method1304();
    }

    void method711(class78 var1) {
        while (true) {
            int var3 = var1.method260();
            if (var3 == 0) {
                return;
            }

            this.method708(var1, var3);
        }
    }

    public Object[] method710(int var1) {
        return null == this.field1305 ? null : this.field1305[var1];
    }

    void method708(class78 var1, int var2) {
        if (var2 == 3) {
            int var4 = var1.method260();
            if (null == this.field1305) {
                this.field1305 = new Object[var4][];
                this.field1303 = new int[var4][];
            }

            for (int var5 = var1.method260(); var5 != 255; var5 = var1.method260()) {
                int var6 = var1.method260();
                int[] var7 = new int[var6];

                for (int var8 = 0; var8 < var6; ++var8) {
                    var7[var8] = var1.method307();
                }

                this.field1305[var5] = class497.method2248(var1, var7);
                this.field1303[var5] = var7;
            }
        } else if (var2 == 4) {
            this.field1304 = var1.method276();
        }

    }

    void method709() {
    }
}
