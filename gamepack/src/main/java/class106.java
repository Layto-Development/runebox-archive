import java.util.Comparator;

public class class106 implements Comparator {
    final boolean field1030;

    public class106(boolean var1) {
        this.field1030 = var1;
    }

    int method497(class278 var1, class278 var2) {
        return this.field1030 ? var1.method1251(var2) : var2.method1251(var1);
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method497((class278) var1, (class278) var2);
    }

    @Override
    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
