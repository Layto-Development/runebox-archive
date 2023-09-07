public class class61 extends class156 {
    final boolean field614;

    public class61(boolean var1) {
        this.field614 = var1;
    }

    public static void method180() {
        class304.field2177.method1304();
        class304.field2204.method1304();
        class304.field2180.method1304();
        class304.field2198.method1304();
    }

    int method179(class324 var1, class324 var2) {
        if (Client.field3775 == var1.field2349 && var2.field2349 == Client.field3775) {
            return this.field614 ? var1.method1247().method1705(var2.method1247()) : var2.method1247().method1705(var1.method1247());
        } else {
            return this.method727(var1, var2);
        }
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method179((class324) var1, (class324) var2);
    }
}
