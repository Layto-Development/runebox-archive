public class class180 extends class510 {
    static final int[] field1521;
    public static class289 field1522;
    static class283 field1528;
    static class68 field1526;
    static int field1525;

    static {
        field1522 = new class289(64);
        field1521 = new int[32];
        int var0 = 2;

        for (int var1 = 0; var1 < 32; ++var1) {
            field1521[var1] = var0 - 1;
            var0 += var0;
        }

    }

    public int field1523;
    public int field1524;
    public int field1527;

    class180() {
    }

    public static void method863(class68 var0) {
        field1526 = var0;
    }

    public static class180 method864(int var0) {
        class180 var2 = (class180) field1522.method1307(var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = field1526.method188(14, var0);
            var2 = new class180();
            if (var3 != null) {
                var2.method861(new class78(var3));
            }

            field1522.method1306(var2, var0);
            return var2;
        }
    }

    void method861(class78 var1) {
        while (true) {
            int var3 = var1.method260();
            if (var3 == 0) {
                return;
            }

            this.method862(var1, var3);
        }
    }

    void method862(class78 var1, int var2) {
        if (var2 == 1) {
            this.field1523 = var1.method309();
            this.field1524 = var1.method260();
            this.field1527 = var1.method260();
        }

    }
}
