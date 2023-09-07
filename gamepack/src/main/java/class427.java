public class class427 {
    public static final class427 field2933;
    static final class427 field2931;
    static final class427 field2934;

    static {
        field2934 = new class427(0);
        field2933 = new class427(1);
        field2931 = new class427(2);
    }

    public final int field2932;

    class427(int var1) {
        this.field2932 = var1;
    }

    static class427[] method1966() {
        return new class427[]{field2934, field2931, field2933};
    }

    public static class427 method1965(int var0) {
        class427[] var2 = method1966();

        for (int var3 = 0; var3 < var2.length; ++var3) {
            class427 var4 = var2[var3];
            if (var4.field2932 == var0) {
                return var4;
            }
        }

        return null;
    }
}
