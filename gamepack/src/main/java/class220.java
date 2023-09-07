import java.util.Comparator;

final class class220 implements Comparator {
    int method1025(class142 var1, class142 var2) {
        return var1.field1252 < var2.field1252 ? -1 : (var2.field1252 == var1.field1252 ? 0 : 1);
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method1025((class142) var1, (class142) var2);
    }

    @Override
    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
