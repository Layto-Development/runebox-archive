public abstract class class369 {
    public final class258 field2637;
    public final class258 field2638;
    int field2639;
    int field2640;

    class369(class258 var1, class258 var2) {
        this.field2638 = var1;
        this.field2637 = var2;
    }

    abstract class341 method1748();

    abstract int method1744();

    abstract int method1749();

    public abstract int method1743();

    boolean method1742(int var1, int var2) {
        if (this.method1746(var1, var2)) {
            return true;
        } else {
            return this.method1747(var1, var2);
        }
    }

    boolean method1745() {
        return this.method1743() >= 0;
    }

    boolean method1746(int var1, int var2) {
        if (!this.method1745()) {
            return false;
        } else {
            class192 var4 = class192.method893(this.method1743());
            int var5 = this.method1749();
            int var6 = this.method1744();
            switch (var4.field1579.field502) {
                case 0:
                    if (var1 <= this.field2639 - var5 || var1 > this.field2639) {
                        return false;
                    }
                    break;
                case 1:
                    if (var1 < this.field2639 || var1 >= var5 + this.field2639) {
                        return false;
                    }
                    break;
                case 2:
                    if (var1 < this.field2639 - var5 / 2 || var1 > var5 / 2 + this.field2639) {
                        return false;
                    }
            }

            switch (var4.field1574.field2718) {
                case 0:
                    if (var2 < this.field2640 - var6 / 2 || var2 > var6 / 2 + this.field2640) {
                        return false;
                    }
                    break;
                case 1:
                    if (var2 > this.field2640 - var6 && var2 <= this.field2640) {
                        break;
                    }

                    return false;
                case 2:
                    if (var2 < this.field2640 || var2 >= this.field2640 + var6) {
                        return false;
                    }
            }

            return true;
        }
    }

    boolean method1747(int var1, int var2) {
        class341 var4 = this.method1748();
        if (null == var4) {
            return false;
        } else if (var1 >= this.field2639 - var4.field2456 / 2 && var1 <= var4.field2456 / 2 + this.field2639) {
            return var2 >= this.field2640 && var2 <= var4.field2454 + this.field2640;
        } else {
            return false;
        }
    }
}
