public class class28 implements class465 {
    int field151;
    int field152;
    int field153;
    int field154;
    int field155;
    int field156;
    int field157;
    int field158;
    int field159;
    int field160;

    class28() {
    }

    @Override
    public void method2131(class387 var1) {
        if (var1.field2771 > this.field155) {
            var1.field2771 = this.field155;
        }

        if (var1.field2765 < this.field155) {
            var1.field2765 = this.field155;
        }

        if (var1.field2773 > this.field156) {
            var1.field2773 = this.field156;
        }

        if (var1.field2767 < this.field156) {
            var1.field2767 = this.field156;
        }

    }

    @Override
    public boolean method2126(int var1, int var2, int var3) {
        if (var1 >= this.field158 && var1 < this.field158 + this.field151) {
            return var2 >= (this.field153 << 3) + (this.field160 << 6) && var2 <= (this.field160 << 6) + (this.field153 << 3) + 7 && var3 >= (this.field154 << 6) + (this.field157 << 3) && var3 <= (this.field154 << 6) + (this.field157 << 3) + 7;
        } else {
            return false;
        }
    }

    @Override
    public boolean method2127(int var1, int var2) {
        return var1 >= (this.field155 << 6) + (this.field152 << 3) && var1 <= (this.field152 << 3) + (this.field155 << 6) + 7 && var2 >= (this.field156 << 6) + (this.field159 << 3) && var2 <= (this.field159 << 3) + (this.field156 << 6) + 7;
    }

    @Override
    public int[] method2129(int var1, int var2, int var3) {
        if (!this.method2126(var1, var2, var3)) {
            return null;
        } else {
            int[] var5 = new int[]{var2 + (this.field155 * 64 - this.field160 * 64) + (this.field152 * 8 - this.field153 * 8), this.field159 * 8 - this.field157 * 8 + this.field156 * 64 - this.field154 * 64 + var3};
            return var5;
        }
    }

    @Override
    public class258 method2130(int var1, int var2) {
        if (!this.method2127(var1, var2)) {
            return null;
        } else {
            int var4 = this.field160 * 64 - this.field155 * 64 + var1 + (this.field153 * 8 - this.field152 * 8);
            int var5 = this.field157 * 8 - this.field159 * 8 + var2 + (this.field154 * 64 - this.field156 * 64);
            return new class258(this.field158, var4, var5);
        }
    }

    @Override
    public void method2128(class78 var1) {
        this.field158 = var1.method260();
        this.field151 = var1.method260();
        this.field160 = var1.method309();
        this.field153 = var1.method260();
        this.field154 = var1.method309();
        this.field157 = var1.method260();
        this.field155 = var1.method309();
        this.field152 = var1.method260();
        this.field156 = var1.method309();
        this.field159 = var1.method260();
        this.method85();
    }

    void method85() {
    }
}
