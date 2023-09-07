public class class335 extends class156 {
    static class539 field2436;
    final boolean field2435;

    public class335(boolean var1) {
        this.field2435 = var1;
    }

    int method1593(class324 var1, class324 var2) {
        if (var1.field2349 != 0 && var2.field2349 != 0) {
            return this.field2435 ? var1.method1247().method1705(var2.method1247()) : var2.method1247().method1705(var1.method1247());
        } else {
            return this.method727(var1, var2);
        }
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method1593((class324) var1, (class324) var2);
    }
}
