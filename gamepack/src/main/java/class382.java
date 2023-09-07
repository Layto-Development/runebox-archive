import java.util.Comparator;

public class class382 implements Comparator {
    static int field2758;
    final boolean field2759;

    public class382(boolean var1) {
        this.field2759 = var1;
    }

    int method1775(class324 var1, class324 var2) {
        return this.field2759 ? var1.field2348 - var2.field2348 : var2.field2348 - var1.field2348;
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method1775((class324) var1, (class324) var2);
    }

    @Override
    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
