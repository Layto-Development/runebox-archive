import java.util.Comparator;

final class class429 implements Comparator {
    int method1967(class142 var1, class142 var2) {
        return var1.field1250 < var2.field1250 ? -1 : (var1.field1250 == var2.field1250 ? 0 : 1);
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method1967((class142) var1, (class142) var2);
    }

    @Override
    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
