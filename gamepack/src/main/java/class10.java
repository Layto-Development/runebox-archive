public class class10 {
    public static int[] field46;
    public static int[] field48;
    static int[] field45;
    static int[] field47;

    static {
        field45 = new int[32];
        int var0 = 2;

        for (int var1 = 0; var1 < 32; ++var1) {
            field45[var1] = var0 - 1;
            var0 += var0;
        }

        field48 = new int[4000];
        field46 = new int[4000];
    }

    class10() throws Throwable {
    }

    public static int method20(int var0) {
        class180 var2 = class180.method864(var0);
        int var3 = var2.field1523;
        int var4 = var2.field1524;
        int var5 = var2.field1527;
        int var6 = field45[var5 - var4];
        return field46[var3] >> var4 & var6;
    }
}
