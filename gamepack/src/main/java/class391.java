public abstract class class391 extends class70 {
    class261 field2784;
    class391 field2781;
    int field2782;
    volatile boolean field2783;

    protected class391() {
        this.field2783 = true;
    }

    protected abstract class391 method1811();

    protected abstract class391 method1812();

    protected abstract int method1809();

    protected abstract void method1813(int var1);

    protected abstract void method1814(int[] var1, int var2, int var3);

    int method1810() {
        return 255;
    }

    final void method1815(int[] var1, int var2, int var3) {
        if (this.field2783) {
            this.method1814(var1, var2, var3);
        } else {
            this.method1813(var3);
        }

    }
}
