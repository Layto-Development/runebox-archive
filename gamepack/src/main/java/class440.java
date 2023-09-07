public class class440 extends class156 {
    final boolean field2970;

    public class440(boolean var1) {
        this.field2970 = var1;
    }

    int method2008(class324 var1, class324 var2) {
        if (var2.field2350 != var1.field2350) {
            return this.field2970 ? var1.field2350 - var2.field2350 : var2.field2350 - var1.field2350;
        } else {
            return this.method727(var1, var2);
        }
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method2008((class324) var1, (class324) var2);
    }
}
