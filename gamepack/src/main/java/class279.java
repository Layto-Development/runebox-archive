public class class279 {
    public boolean field2036;
    int field2035;
    int field2037;
    int field2038;
    int field2039;
    long field2031;
    long field2032;
    long field2033;
    long field2034;
    long field2040;

    public class279() {
        this.field2032 = -1L;
        this.field2031 = -1L;
        this.field2036 = false;
        this.field2033 = 0L;
        this.field2034 = 0L;
        this.field2040 = 0L;
        this.field2035 = 0;
        this.field2037 = 0;
        this.field2038 = 0;
        this.field2039 = 0;
    }

    static void method1259(class78 var0, long var1) {
        var1 /= 10L;
        if (var1 < 0L) {
            var1 = 0L;
        } else if (var1 > 65535L) {
            var1 = 65535L;
        }

        var0.method290((int) var1);
    }

    public void method1253() {
        this.field2032 = class206.method982();
    }

    public void method1258() {
        if (-1L != this.field2032) {
            this.field2034 = class206.method982() - this.field2032;
            this.field2032 = -1L;
        }

    }

    public void method1254(int var1) {
        this.field2031 = class206.method982();
        this.field2035 = var1;
    }

    public void method1255() {
        if (-1L != this.field2031) {
            this.field2033 = class206.method982() - this.field2031;
            this.field2031 = -1L;
        }

        ++this.field2038;
        this.field2036 = true;
    }

    public void method1256() {
        this.field2036 = false;
        this.field2037 = 0;
    }

    public void method1252() {
        this.method1255();
    }

    public void method1257(class78 var1) {
        method1259(var1, this.field2034);
        method1259(var1, this.field2033);
        method1259(var1, this.field2040);
        var1.method290(this.field2035);
        var1.method290(this.field2037);
        var1.method290(this.field2038);
        var1.method290(this.field2039);
    }
}
