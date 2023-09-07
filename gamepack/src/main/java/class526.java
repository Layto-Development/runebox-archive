import java.util.Comparator;

final class class526 implements Comparator {
    int method2519(class142 var1, class142 var2) {
        return var1.method657().compareTo(var2.method657());
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method2519((class142) var1, (class142) var2);
    }

    @Override
    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
