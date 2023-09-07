public class class432 implements class330 {
    public static final class432 field2937;
    public static final class432 field2942;
    public static final class432 field2943;
    static class331[] field2936;

    static {
        field2942 = new class432(1, 0, Integer.class, new class452());
        field2943 = new class432(0, 1, Long.class, new class380());
        field2937 = new class432(2, 2, String.class, new class386());
    }

    public final class84 field2941;
    public final int field2938;
    public final int field2939;
    public final Class field2940;

    class432(int var1, int var2, Class var3, class84 var4) {
        this.field2938 = var1;
        this.field2939 = var2;
        this.field2940 = var3;
        this.field2941 = var4;
    }

    public static class432[] method1972() {
        return new class432[]{field2942, field2937, field2943};
    }

    public static class432 method1970(Class var0) {
        class432[] var2 = method1972();

        for (int var3 = 0; var3 < var2.length; ++var3) {
            class432 var4 = var2[var3];
            if (var4.field2940 == var0) {
                return var4;
            }
        }

        return null;
    }

    @Override
    public int method1533() {
        return this.field2939;
    }

    public Object method1971(class78 var1) {
        return this.field2941.method336(var1);
    }
}
