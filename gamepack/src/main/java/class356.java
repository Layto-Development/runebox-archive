public class class356 extends class510 {
    public static class68 field2567;
    static class289 field2564;

    static {
        field2564 = new class289(64);
    }

    public char field2561;
    public char field2562;
    public int field2560;
    public int field2565;
    public int[] field2559;
    public int[] field2568;
    public String field2563;
    public String[] field2566;

    class356() {
        this.field2563 = class32.field483;
        this.field2565 = 0;
    }

    public static class356 method1696(int var0) {
        class356 var2 = (class356) field2564.method1307(var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = field2567.method188(8, var0);
            var2 = new class356();
            if (null != var3) {
                var2.method1694(new class78(var3));
            }

            field2564.method1306(var2, var0);
            return var2;
        }
    }

    void method1694(class78 var1) {
        while (true) {
            int var3 = var1.method260();
            if (var3 == 0) {
                return;
            }

            this.method1695(var1, var3);
        }
    }

    void method1695(class78 var1, int var2) {
        if (var2 == 1) {
            this.field2561 = (char) var1.method260();
        } else if (var2 == 2) {
            this.field2562 = (char) var1.method260();
        } else if (var2 == 3) {
            this.field2563 = var1.method268();
        } else if (var2 == 4) {
            this.field2560 = var1.method264();
        } else {
            int var4;
            if (var2 == 5) {
                this.field2565 = var1.method309();
                this.field2559 = new int[this.field2565];
                this.field2566 = new String[this.field2565];

                for (var4 = 0; var4 < this.field2565; ++var4) {
                    this.field2559[var4] = var1.method264();
                    this.field2566[var4] = var1.method268();
                }
            } else if (var2 == 6) {
                this.field2565 = var1.method309();
                this.field2559 = new int[this.field2565];
                this.field2568 = new int[this.field2565];

                for (var4 = 0; var4 < this.field2565; ++var4) {
                    this.field2559[var4] = var1.method264();
                    this.field2568[var4] = var1.method264();
                }
            }
        }

    }

    public int method1693() {
        return this.field2565;
    }
}
