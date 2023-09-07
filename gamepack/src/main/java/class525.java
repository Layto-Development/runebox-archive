public class class525 extends class156 {
    final boolean field4203;

    public class525(boolean var1) {
        this.field4203 = var1;
    }

    int method2518(class324 var1, class324 var2) {
        if (var1.field2349 != var2.field2349) {
            return this.field4203 ? var1.field2349 - var2.field2349 : var2.field2349 - var1.field2349;
        } else {
            return this.method727(var1, var2);
        }
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method2518((class324) var1, (class324) var2);
    }
}
