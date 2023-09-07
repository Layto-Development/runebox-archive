public class class186 {
    static int[] field1534;

    class186() throws Throwable {
    }

    static final void method872(int var0, int var1) {
        if (var0 < 128) {
            var0 = 128;
        } else if (var0 > 383) {
            var0 = 383;
        }

        if (class214.field1736 < var0) {
            class214.field1736 += class192.field1577 * (var0 - class214.field1736) / 1000 + class533.field4246;
            if (class214.field1736 > var0) {
                class214.field1736 = var0;
            }
        } else if (class214.field1736 > var0) {
            class214.field1736 -= class533.field4246 + (class214.field1736 - var0) * class192.field1577 / 1000;
            if (class214.field1736 < var0) {
                class214.field1736 = var0;
            }
        }

        var1 &= 2047;
        int var3 = var1 - class225.field1779;
        if (var3 > 1024) {
            var3 -= 2048;
        } else if (var3 < -1024) {
            var3 += 2048;
        }

        if (var3 > 0) {
            class225.field1779 += var3 * class192.field1577 / 1000 + class533.field4246;
            class225.field1779 &= 2047;
        } else if (var3 < 0) {
            class225.field1779 -= -var3 * class192.field1577 / 1000 + class533.field4246;
            class225.field1779 &= 2047;
        }

        int var4 = var1 - class225.field1779;
        if (var4 > 1024) {
            var4 -= 2048;
        } else if (var4 < -1024) {
            var4 += 2048;
        }

        if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
            class225.field1779 = var1;
        }

    }
}
