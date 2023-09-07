public class class379 extends class510 {
    public static class289 field2745;
    public static class289 field2746;
    public static class68 field2744;

    static {
        field2745 = new class289(64);
        field2746 = new class289(64);
    }

    public int field2747;
    public int field2748;
    public int field2749;
    public int field2750;
    public int field2751;
    public int field2752;
    public int field2755;
    public int field2756;
    int field2753;
    int field2754;

    public class379() {
        this.field2750 = 255;
        this.field2749 = 255;
        this.field2752 = -1;
        this.field2751 = 1;
        this.field2748 = 70;
        this.field2753 = -1;
        this.field2754 = -1;
        this.field2755 = 30;
        this.field2756 = 0;
    }

    public static void method1771(class68 var0, class68 var1) {
        field2744 = var0;
        class504.field3700 = var1;
    }

    public void method1770(class78 var1) {
        while (true) {
            int var3 = var1.method260();
            if (var3 == 0) {
                return;
            }

            this.method1767(var1, var3);
        }
    }

    void method1767(class78 var1, int var2) {
        if (var2 == 1) {
            var1.method309();
        } else if (var2 == 2) {
            this.field2750 = var1.method260();
        } else if (var2 == 3) {
            this.field2749 = var1.method260();
        } else if (var2 == 4) {
            this.field2752 = 0;
        } else if (var2 == 5) {
            this.field2748 = var1.method309();
        } else if (var2 == 6) {
            var1.method260();
        } else if (var2 == 7) {
            this.field2753 = var1.method308();
        } else if (var2 == 8) {
            this.field2754 = var1.method308();
        } else if (var2 == 11) {
            this.field2752 = var1.method309();
        } else if (var2 == 14) {
            this.field2755 = var1.method260();
        } else if (var2 == 15) {
            this.field2756 = var1.method260();
        }

    }

    public class331 method1768() {
        if (this.field2753 < 0) {
            return null;
        } else {
            class331 var2 = (class331) field2746.method1307(this.field2753);
            if (var2 != null) {
                return var2;
            } else {
                var2 = class122.method539(class504.field3700, this.field2753, 0);
                if (null != var2) {
                    field2746.method1306(var2, this.field2753);
                }

                return var2;
            }
        }
    }

    public class331 method1769() {
        if (this.field2754 < 0) {
            return null;
        } else {
            class331 var2 = (class331) field2746.method1307(this.field2754);
            if (var2 != null) {
                return var2;
            } else {
                var2 = class122.method539(class504.field3700, this.field2754, 0);
                if (null != var2) {
                    field2746.method1306(var2, this.field2754);
                }

                return var2;
            }
        }
    }
}
