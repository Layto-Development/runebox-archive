import java.net.URL;

public class class244 {
    public static short[] field1866;
    static int field1862;
    static int field1863;

    static {
        field1862 = -1;
        field1863 = -2;
    }

    final URL field1861;
    volatile byte[] field1865;
    volatile int field1864;

    class244(URL var1) {
        this.field1864 = field1862;
        this.field1861 = var1;
    }

    public boolean method1091() {
        return field1862 != this.field1864;
    }

    public byte[] method1093() {
        return this.field1865;
    }

    public String method1092() {
        return this.field1861.toString();
    }
}
