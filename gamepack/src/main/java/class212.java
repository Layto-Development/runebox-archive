public class class212 implements class465 {
    int field1696;
    int field1697;
    int field1698;
    int field1699;
    int field1700;
    int field1701;
    int field1702;
    int field1703;
    int field1704;
    int field1705;
    int field1706;
    int field1707;
    int field1708;
    int field1709;

    class212() {
    }

    @Override
    public void method2131(class387 var1) {
        if (var1.field2771 > this.field1700) {
            var1.field2771 = this.field1700;
        }

        if (var1.field2765 < this.field1700) {
            var1.field2765 = this.field1700;
        }

        if (var1.field2773 > this.field1708) {
            var1.field2773 = this.field1708;
        }

        if (var1.field2767 < this.field1708) {
            var1.field2767 = this.field1708;
        }

    }

    @Override
    public boolean method2126(int var1, int var2, int var3) {
        if (var1 >= this.field1696 && var1 < this.field1698 + this.field1696) {
            return var2 >= (this.field1702 << 6) + (this.field1697 << 3) && var2 <= (this.field1704 << 3) + (this.field1702 << 6) + 7 && var3 >= (this.field1703 << 3) + (this.field1706 << 6) && var3 <= (this.field1706 << 6) + (this.field1705 << 3) + 7;
        } else {
            return false;
        }
    }

    @Override
    public boolean method2127(int var1, int var2) {
        return var1 >= (this.field1701 << 3) + (this.field1700 << 6) && var1 <= 7 + (this.field1700 << 6) + (this.field1699 << 3) && var2 >= (this.field1707 << 3) + (this.field1708 << 6) && var2 <= (this.field1708 << 6) + (this.field1709 << 3) + 7;
    }

    @Override
    public int[] method2129(int var1, int var2, int var3) {
        if (!this.method2126(var1, var2, var3)) {
            return null;
        } else {
            int[] var5 = new int[]{this.field1701 * 8 - this.field1697 * 8 + this.field1700 * 64 - this.field1702 * 64 + var2, var3 + (this.field1708 * 64 - this.field1706 * 64) + (this.field1707 * 8 - this.field1703 * 8)};
            return var5;
        }
    }

    @Override
    public class258 method2130(int var1, int var2) {
        if (!this.method2127(var1, var2)) {
            return null;
        } else {
            int var4 = this.field1702 * 64 - this.field1700 * 64 + var1 + (this.field1697 * 8 - this.field1701 * 8);
            int var5 = this.field1706 * 64 - this.field1708 * 64 + var2 + (this.field1703 * 8 - this.field1707 * 8);
            return new class258(this.field1696, var4, var5);
        }
    }

    @Override
    public void method2128(class78 var1) {
        this.field1696 = var1.method260();
        this.field1698 = var1.method260();
        this.field1702 = var1.method309();
        this.field1697 = var1.method260();
        this.field1704 = var1.method260();
        this.field1706 = var1.method309();
        this.field1703 = var1.method260();
        this.field1705 = var1.method260();
        this.field1700 = var1.method309();
        this.field1701 = var1.method260();
        this.field1699 = var1.method260();
        this.field1708 = var1.method309();
        this.field1707 = var1.method260();
        this.field1709 = var1.method260();
        this.method1014();
    }

    void method1014() {
    }
}
