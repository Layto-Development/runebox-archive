public class class512 {
    static final class512 field4080;
    static final class512 field4081;
    static final class512 field4082;
    static final class512 field4083;

    static {
        field4082 = new class512("LIVE", 0);
        field4080 = new class512("BUILDLIVE", 3);
        field4081 = new class512("RC", 1);
        field4083 = new class512("WIP", 2);
    }

    public final int field4084;
    public final String field4079;

    class512(String var1, int var2) {
        this.field4079 = var1;
        this.field4084 = var2;
    }

    public static class512[] method2496() {
        return new class512[]{field4082, field4081, field4083, field4080};
    }
}
