public class class57 extends class439 {
    class57() {
    }

    static int method172(int var0, int var1) {
        if (var0 == -2) {
            return 12345678;
        } else if (var0 == -1) {
            boolean var2 = true;
            return 31;
        } else {
            var1 = (var0 & 127) * 96 / 128;
            if (var1 < 2) {
                var1 = 2;
            } else if (var1 > 126) {
                var1 = 126;
            }

            return var1 + (var0 & 65408);
        }
    }

    public static class397 method171(int var0) {
        class397 var2 = (class397) class397.field2796.method1307(var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class397.field2797.method188(16, var0);
            var2 = new class397();
            if (null != var3) {
                var2.method1819(new class78(var3));
            }

            class397.field2796.method1306(var2, var0);
            return var2;
        }
    }

    @Override
    protected boolean method2007(int var1, int var2, int var3, class11 var4) {
        return super.field2967 == var2 && var3 == super.field2966;
    }
}
