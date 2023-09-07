public class class497 {
    static final int field3632;
    static final int field3633;

    static {
        field3632 = (int) (Math.pow(2.0D, 4.0D) - 1.0D);
        field3633 = (int) (Math.pow(2.0D, 8.0D) - 1.0D);
    }

    class497() throws Throwable {
    }

    public static int method2249(int var0) {
        return var0 >>> 12;
    }

    public static int method2250(int var0) {
        return var0 >>> 4 & field3633;
    }

    public static int method2251(int var0) {
        return (var0 & field3632) - 1;
    }

    static Object[] method2248(class78 var0, int[] var1) {
        int var3 = var0.method307();
        Object[] var4 = new Object[var3 * var1.length];

        for (int var5 = 0; var5 < var3; ++var5) {
            for (int var6 = 0; var6 < var1.length; ++var6) {
                int var7 = var6 + var1.length * var5;
                class432 var8 = class406.method1856(var1[var6]);
                var4[var7] = var8.method1971(var0);
            }
        }

        return var4;
    }
}
