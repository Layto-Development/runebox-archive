public class class257 extends class156 {
    final boolean field1928;

    public class257(boolean var1) {
        this.field1928 = var1;
    }

    int method1141(class324 var1, class324 var2) {
        if (var1.field2349 != 0 && var2.field2349 != 0) {
            return this.field1928 ? var1.field2348 - var2.field2348 : var2.field2348 - var1.field2348;
        } else {
            return this.method727(var1, var2);
        }
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method1141((class324) var1, (class324) var2);
    }
}
