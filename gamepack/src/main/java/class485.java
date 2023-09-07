public class class485 {
    static int field3485;

    class485() throws Throwable {
    }

    static void method2234(int var0, int var1) {
        int var3 = class303.field2170.method921(class32.field340);

        int var4;
        int var5;
        for (var4 = 0; var4 < Client.field3924; ++var4) {
            var5 = class303.field2170.method921(Client.method2410(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }

        var3 += 8;
        var4 = Client.field3924 * 15 + 22;
        var5 = var0 - var3 / 2;
        if (var5 + var3 > class223.field1763) {
            var5 = class223.field1763 - var3;
        }

        if (var5 < 0) {
            var5 = 0;
        }

        int var6 = var1;
        if (var1 + var4 > class519.field4188) {
            var6 = class519.field4188 - var4;
        }

        if (var6 < 0) {
            var6 = 0;
        }

        class264.field1952 = var5;
        class255.field1918 = var6;
        class19.field67 = var3;
        class462.field3166 = Client.field3924 * 15 + 22;
    }
}
