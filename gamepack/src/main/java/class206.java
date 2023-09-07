public final class class206 {
    static long field1676;

    class206() throws Throwable {
    }

    public static synchronized long method982() {
        long var1 = System.currentTimeMillis();
        if (var1 < field1676) {
            class466.field3311 += field1676 - var1;
        }

        field1676 = var1;
        return var1 + class466.field3311;
    }
}
