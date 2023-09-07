import java.util.Comparator;

final class class310 implements Comparator {
    int method1367(class142 var1, class142 var2) {
        return var1.field1248.field1899 < var2.field1248.field1899 ? -1 : (var1.field1248.field1899 == var2.field1248.field1899 ? 0 : 1);
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method1367((class142) var1, (class142) var2);
    }

    @Override
    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
