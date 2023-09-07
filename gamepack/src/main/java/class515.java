import java.util.Comparator;

public class class515 implements Comparator {
    static class68 field4169;
    final boolean field4168;

    public class515(boolean var1) {
        this.field4168 = var1;
    }

    int method2511(class278 var1, class278 var2) {
        return this.field4168 ? var1.method1247().method1705(var2.method1247()) : var2.method1247().method1705(var1.method1247());
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method2511((class278) var1, (class278) var2);
    }

    @Override
    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
