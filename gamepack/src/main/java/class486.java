public class class486 implements class465 {
    int field3486;
    int field3487;
    int field3488;
    int field3489;
    int field3490;
    int field3491;
    int field3492;
    int field3493;
    int field3494;
    int field3495;

    class486() {
    }

    static final void method2236() {
        Client.field3983 = Client.field3777;
        class405.field2869 = true;
    }

    @Override
    public void method2131(class387 var1) {
        if (var1.field2771 > this.field3493) {
            var1.field2771 = this.field3493;
        }

        if (var1.field2765 < this.field3494) {
            var1.field2765 = this.field3494;
        }

        if (var1.field2773 > this.field3487) {
            var1.field2773 = this.field3487;
        }

        if (var1.field2767 < this.field3486) {
            var1.field2767 = this.field3486;
        }

    }

    @Override
    public boolean method2126(int var1, int var2, int var3) {
        if (var1 >= this.field3492 && var1 < this.field3492 + this.field3495) {
            return var2 >> 6 >= this.field3488 && var2 >> 6 <= this.field3490 && var3 >> 6 >= this.field3489 && var3 >> 6 <= this.field3491;
        } else {
            return false;
        }
    }

    @Override
    public boolean method2127(int var1, int var2) {
        return var1 >> 6 >= this.field3493 && var1 >> 6 <= this.field3494 && var2 >> 6 >= this.field3487 && var2 >> 6 <= this.field3486;
    }

    @Override
    public int[] method2129(int var1, int var2, int var3) {
        if (!this.method2126(var1, var2, var3)) {
            return null;
        } else {
            int[] var5 = new int[]{this.field3493 * 64 - this.field3488 * 64 + var2, this.field3487 * 64 - this.field3489 * 64 + var3};
            return var5;
        }
    }

    @Override
    public class258 method2130(int var1, int var2) {
        if (!this.method2127(var1, var2)) {
            return null;
        } else {
            int var4 = var1 + (this.field3488 * 64 - this.field3493 * 64);
            int var5 = var2 + (this.field3489 * 64 - this.field3487 * 64);
            return new class258(this.field3492, var4, var5);
        }
    }

    @Override
    public void method2128(class78 var1) {
        this.field3492 = var1.method260();
        this.field3495 = var1.method260();
        this.field3488 = var1.method309();
        this.field3489 = var1.method309();
        this.field3490 = var1.method309();
        this.field3491 = var1.method309();
        this.field3493 = var1.method309();
        this.field3487 = var1.method309();
        this.field3494 = var1.method309();
        this.field3486 = var1.method309();
        this.method2235();
    }

    void method2235() {
    }
}
