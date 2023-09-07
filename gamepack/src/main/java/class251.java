public class class251 extends class156 {
    final boolean field1908;

    public class251(boolean var1) {
        this.field1908 = var1;
    }

    int method1124(class324 var1, class324 var2) {
        if (var1.field2349 == Client.field3775) {
            if (Client.field3775 != var2.field2349) {
                return this.field1908 ? -1 : 1;
            }
        } else if (Client.field3775 == var2.field2349) {
            return this.field1908 ? 1 : -1;
        }

        return this.method727(var1, var2);
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method1124((class324) var1, (class324) var2);
    }
}
