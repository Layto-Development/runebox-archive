public class class210 {
    static final int[] field1686;
    static final int[] field1687;

    static {
        field1686 = new int[16384];
        field1687 = new int[16384];
        double var0 = 3.834951969714103E-4D;

        for (int var2 = 0; var2 < 16384; ++var2) {
            field1686[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field1687[var2] = (int) (16384.0D * Math.cos(var0 * (double) var2));
        }

    }

    class210() throws Throwable {
    }

    public static int method1002(int var0, int var1) {
        return (int) Math.round(Math.atan2(var0, var1) * 2607.5945876176133D) & 16383;
    }

    public static int method1001(int var0) {
        return field1686[var0 & 16383];
    }

    public static int method1003(int var0) {
        return field1687[var0 & 16383];
    }
}
