public class class339 {
    public static final boolean[] field2450;
    public static int[] field2452;
    static class539 field2451;

    static {
        field2450 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
        field2452 = new int[99];
        int var0 = 0;

        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field2452[var1] = var0 / 4;
        }

    }

    class339() throws Throwable {
    }
}
