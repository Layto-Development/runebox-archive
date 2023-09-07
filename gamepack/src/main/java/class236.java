public class class236 {
    static final int[] field1827;
    static final int[] field1828;

    static {
        field1828 = new int[2048];
        field1827 = new int[2048];
        double var0 = 0.0030679615757712823D;

        for (int var2 = 0; var2 < 2048; ++var2) {
            field1828[var2] = (int) (65536.0D * Math.sin(var0 * (double) var2));
            field1827[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }

    }

    class236() throws Throwable {
    }
}
