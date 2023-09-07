public class class381 {
    static int[] field2757;

    class381() throws Throwable {
    }

    static final class208 method1774(class78 var0, class208 var1) {
        int var3 = var0.method260();
        int var4;
        if (null == var1) {
            var4 = class82.method332(var3);
            var1 = new class208(var4);
        }

        for (var4 = 0; var4 < var3; ++var4) {
            boolean var5 = var0.method260() == 1;
            int var6 = var0.method316();
            Object var7;
            if (var5) {
                var7 = new class371(var0.method268());
            } else {
                var7 = new class170(var0.method264());
            }

            var1.method994((class70) var7, var6);
        }

        return var1;
    }

    static int method1773(class208 var0, int var1, int var2) {
        if (null == var0) {
            return var2;
        } else {
            class170 var4 = (class170) var0.method990(var1);
            return var4 == null ? var2 : var4.field1437;
        }
    }
}
