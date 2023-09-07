public class class405 extends class369 {
    static boolean field2869;
    final class341 field2868;
    final int field2865;
    final int field2866;
    final int field2867;

    class405(class258 var1, class258 var2, int var3, class341 var4) {
        super(var1, var2);
        this.field2865 = var3;
        this.field2868 = var4;
        class192 var5 = class192.method893(this.method1743());
        class331 var6 = var5.method889(false);
        if (null != var6) {
            this.field2867 = var6.field2423;
            this.field2866 = var6.field2419;
        } else {
            this.field2867 = 0;
            this.field2866 = 0;
        }

    }

    @Override
    public int method1743() {
        return this.field2865;
    }

    @Override
    class341 method1748() {
        return this.field2868;
    }

    @Override
    int method1749() {
        return this.field2867;
    }

    @Override
    int method1744() {
        return this.field2866;
    }
}
