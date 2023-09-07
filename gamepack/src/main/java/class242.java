public class class242 implements class465 {
    int field1848;
    int field1849;
    int field1850;
    int field1851;
    int field1852;
    int field1853;

    class242() {
    }

    @Override
    public void method2131(class387 var1) {
        if (var1.field2771 > this.field1853) {
            var1.field2771 = this.field1853;
        }

        if (var1.field2765 < this.field1853) {
            var1.field2765 = this.field1853;
        }

        if (var1.field2773 > this.field1848) {
            var1.field2773 = this.field1848;
        }

        if (var1.field2767 < this.field1848) {
            var1.field2767 = this.field1848;
        }

    }

    @Override
    public boolean method2126(int var1, int var2, int var3) {
        if (var1 >= this.field1850 && var1 < this.field1850 + this.field1852) {
            return this.field1849 == var2 >> 6 && this.field1851 == var3 >> 6;
        } else {
            return false;
        }
    }

    @Override
    public boolean method2127(int var1, int var2) {
        return var1 >> 6 == this.field1853 && var2 >> 6 == this.field1848;
    }

    @Override
    public int[] method2129(int var1, int var2, int var3) {
        if (!this.method2126(var1, var2, var3)) {
            return null;
        } else {
            int[] var5 = new int[]{this.field1853 * 64 - this.field1849 * 64 + var2, var3 + (this.field1848 * 64 - this.field1851 * 64)};
            return var5;
        }
    }

    @Override
    public class258 method2130(int var1, int var2) {
        if (!this.method2127(var1, var2)) {
            return null;
        } else {
            int var4 = this.field1849 * 64 - this.field1853 * 64 + var1;
            int var5 = this.field1851 * 64 - this.field1848 * 64 + var2;
            return new class258(this.field1850, var4, var5);
        }
    }

    @Override
    public void method2128(class78 var1) {
        this.field1850 = var1.method260();
        this.field1852 = var1.method260();
        this.field1849 = var1.method309();
        this.field1851 = var1.method309();
        this.field1853 = var1.method309();
        this.field1848 = var1.method309();
        this.method1081();
    }

    void method1081() {
    }
}
