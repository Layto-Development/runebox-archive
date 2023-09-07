public class class249 {
    static class372 field1902;
    public int field1896;
    public int field1897;
    public int field1899;
    public int field1900;
    public int field1901;
    byte field1898;

    public class249() {
    }

    public class249(class78 var1, boolean var2) {
        this.field1898 = var1.method261();
        this.field1897 = var1.method309();
        this.field1901 = var1.method264();
        this.field1899 = var1.method264();
        this.field1900 = var1.method264();
        this.field1896 = var1.method264();
    }

    void method1113(Integer var1) {
    }

    public int method1114() {
        return this.field1898 & 7;
    }

    public int method1115() {
        return (this.field1898 & 8) == 8 ? 1 : 0;
    }

    void method1112(int var1) {
        this.field1898 &= -8;
        this.field1898 = (byte) (this.field1898 | 2);
    }

    void method1116(int var1) {
        this.field1898 &= -9;
        if (var1 == 1) {
            this.field1898 = (byte) (this.field1898 | 8);
        }

    }
}
