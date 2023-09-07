import java.util.Collection;
import java.util.Iterator;

public class class247 implements Iterable, Collection {
    class70 field1894;
    class70 field1895;

    public class247() {
        this.field1894 = new class70();
        this.field1894.field657 = this.field1894;
        this.field1894.field659 = this.field1894;
    }

    public static void method1107(class70 var0, class70 var1) {
        if (var0.field659 != null) {
            var0.method221();
        }

        var0.field659 = var1;
        var0.field657 = var1.field657;
        var0.field659.field657 = var0;
        var0.field657.field659 = var0;
    }

    public void method1099() {
        while (this.field1894.field657 != this.field1894) {
            this.field1894.field657.method221();
        }

    }

    public void method1100(class70 var1) {
        if (var1.field659 != null) {
            var1.method221();
        }

        var1.field659 = this.field1894.field659;
        var1.field657 = this.field1894;
        var1.field659.field657 = var1;
        var1.field657.field659 = var1;
    }

    public void method1109(class70 var1) {
        if (var1.field659 != null) {
            var1.method221();
        }

        var1.field659 = this.field1894;
        var1.field657 = this.field1894.field657;
        var1.field659.field657 = var1;
        var1.field657.field659 = var1;
    }

    public class70 method1106() {
        return this.method1101(null);
    }

    class70 method1101(class70 var1) {
        class70 var2;
        if (var1 == null) {
            var2 = this.field1894.field657;
        } else {
            var2 = var1;
        }

        if (var2 == this.field1894) {
            this.field1895 = null;
            return null;
        } else {
            this.field1895 = var2.field657;
            return var2;
        }
    }

    public class70 method1102() {
        class70 var1 = this.field1895;
        if (var1 == this.field1894) {
            this.field1895 = null;
            return null;
        } else {
            this.field1895 = var1.field657;
            return var1;
        }
    }

    int method1108() {
        int var1 = 0;

        for (class70 var2 = this.field1894.field657; var2 != this.field1894; var2 = var2.field657) {
            ++var1;
        }

        return var1;
    }

    public boolean method1104() {
        return this.field1894.field657 == this.field1894;
    }

    class70[] method1103() {
        class70[] var1 = new class70[this.method1108()];
        int var2 = 0;

        for (class70 var3 = this.field1894.field657; var3 != this.field1894; var3 = var3.field657) {
            var1[var2++] = var3;
        }

        return var1;
    }

    @Override
    public Iterator iterator() {
        return new class451(this);
    }

    @Override
    public int size() {
        return this.method1108();
    }

    @Override
    public boolean isEmpty() {
        return this.method1104();
    }

    @Override
    public boolean contains(Object var1) {
        throw new RuntimeException();
    }

    @Override
    public Object[] toArray() {
        return this.method1103();
    }

    @Override
    public Object[] toArray(Object[] var1) {
        int var2 = 0;

        for (class70 var3 = this.field1894.field657; var3 != this.field1894; var3 = var3.field657) {
            var1[var2++] = var3;
        }

        return var1;
    }

    boolean method1105(class70 var1) {
        this.method1100(var1);
        return true;
    }

    @Override
    public boolean remove(Object var1) {
        throw new RuntimeException();
    }

    @Override
    public boolean containsAll(Collection var1) {
        throw new RuntimeException();
    }

    @Override
    public boolean addAll(Collection var1) {
        throw new RuntimeException();
    }

    @Override
    public boolean removeAll(Collection var1) {
        throw new RuntimeException();
    }

    @Override
    public boolean retainAll(Collection var1) {
        throw new RuntimeException();
    }

    @Override
    public void clear() {
        this.method1099();
    }

    @Override
    public boolean add(Object var1) {
        return this.method1105((class70) var1);
    }

    @Override
    public boolean equals(Object var1) {
        return super.equals(var1);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
