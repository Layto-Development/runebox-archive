public class class225 extends class156 {
    static int field1779;
    final boolean field1778;

    public class225(boolean var1) {
        this.field1778 = var1;
    }

    int method1036(class324 var1, class324 var2) {
        if (var1.field2349 == Client.field3775 && var2.field2349 == Client.field3775) {
            return this.field1778 ? var1.field2348 - var2.field2348 : var2.field2348 - var1.field2348;
        } else {
            return this.method727(var1, var2);
        }
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method1036((class324) var1, (class324) var2);
    }
}
