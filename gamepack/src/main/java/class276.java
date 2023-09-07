public class class276 extends class510 {
    static class289 field2022;

    static {
        field2022 = new class289(64);
    }

    public int field2021;

    class276() {
        this.field2021 = 0;
    }

    public static void method1246(class68 var0) {
        class179.field1519 = var0;
    }

    public static class276 method1245(int var0) {
        class276 var2 = (class276) field2022.method1307(var0);
        if (null != var2) {
            return var2;
        } else {
            byte[] var3 = class179.field1519.method188(5, var0);
            var2 = new class276();
            if (var3 != null) {
                var2.method1242(new class78(var3));
            }

            field2022.method1306(var2, var0);
            return var2;
        }
    }

    static void method1244() {
        if (Client.field3867) {
            class97 var1 = class97.method421(class4.field22, Client.field3943);
            if (null != var1 && var1.field886 != null) {
                class26 var2 = new class26();
                var2.field138 = var1;
                var2.field141 = var1.field886;
                class269.method1200(var2);
            }

            Client.field3909 = -1;
            Client.field3867 = false;
            Client.method2424(var1);
        }
    }

    void method1242(class78 var1) {
        while (true) {
            int var3 = var1.method260();
            if (var3 == 0) {
                return;
            }

            this.method1243(var1, var3);
        }
    }

    void method1243(class78 var1, int var2) {
        if (var2 == 2) {
            this.field2021 = var1.method309();
        }

    }
}
