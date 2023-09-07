public final class class316 extends class70 {
    static int field2270;
    int field2269;
    int field2271;
    int field2272;
    int field2273;
    int field2274;
    int field2275;
    int field2276;
    int field2277;
    int field2278;
    int field2279;
    int field2280;
    int field2281;
    int field2282;
    int field2283;

    class316() {
        this.field2279 = 31;
        this.field2280 = 0;
        this.field2281 = -1;
    }

    public static void method1394(long var0) {
        if (var0 > 0L) {
            if (0L == var0 % 10L) {
                class67.method187(var0 - 1L);
                class67.method187(1L);
            } else {
                class67.method187(var0);
            }

        }
    }

    void method1392(int var1) {
        this.field2279 = var1;
    }

    boolean method1393(int var1) {
        if (var1 >= 0 && var1 <= 4) {
            return (this.field2279 & 1 << var1) != 0;
        } else {
            return true;
        }
    }
}
