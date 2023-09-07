import java.util.Comparator;

final class class125 implements Comparator {
    int method579(class142 var1, class142 var2) {
        return var1.field1248.field1901 < var2.field1248.field1901 ? -1 : (var1.field1248.field1901 == var2.field1248.field1901 ? 0 : 1);
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method579((class142) var1, (class142) var2);
    }

    @Override
    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
