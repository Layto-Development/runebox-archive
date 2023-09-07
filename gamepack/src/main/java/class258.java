public class class258 {
    static byte[][] field1932;
    public int field1929;
    public int field1930;
    public int field1931;

    public class258(int var1, int var2, int var3) {
        this.field1930 = var1;
        this.field1929 = var2;
        this.field1931 = var3;
    }

    public class258(class258 var1) {
        this.field1930 = var1.field1930;
        this.field1929 = var1.field1929;
        this.field1931 = var1.field1931;
    }

    public class258(int var1) {
        if (var1 == -1) {
            this.field1930 = -1;
        } else {
            this.field1930 = var1 >> 28 & 3;
            this.field1929 = var1 >> 14 & 16383;
            this.field1931 = var1 & 16383;
        }

    }

    public int method1144() {
        int var3 = this.field1930;
        int var4 = this.field1929;
        int var5 = this.field1931;
        int var2 = var3 << 28 | var4 << 14 | var5;
        return var2;
    }

    @Override
    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else {
            return var1 instanceof class258 && this.method1142((class258) var1);
        }
    }

    boolean method1142(class258 var1) {
        if (var1.field1930 != this.field1930) {
            return false;
        } else if (this.field1929 != var1.field1929) {
            return false;
        } else {
            return var1.field1931 == this.field1931;
        }
    }

    @Override
    public int hashCode() {
        return this.method1144();
    }

    @Override
    public String toString() {
        return this.method1143(",");
    }

    String method1143(String var1) {
        return this.field1930 + var1 + (this.field1929 >> 6) + var1 + (this.field1931 >> 6) + var1 + (this.field1929 & 63) + var1 + (this.field1931 & 63);
    }
}
