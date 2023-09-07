public class class467 extends class324 {
    boolean field3315;
    boolean field3316;

    class467() {
    }

    int method2133(class467 var1) {
        if (super.field2349 == Client.field3775 && var1.field2349 != Client.field3775) {
            return -1;
        } else if (var1.field2349 == Client.field3775 && Client.field3775 != super.field2349) {
            return 1;
        } else if (super.field2349 != 0 && var1.field2349 == 0) {
            return -1;
        } else if (var1.field2349 != 0 && super.field2349 == 0) {
            return 1;
        } else if (this.field3315 && !var1.field3315) {
            return -1;
        } else if (!this.field3315 && var1.field3315) {
            return 1;
        } else if (this.field3316 && !var1.field3316) {
            return -1;
        } else if (!this.field3316 && var1.field3316) {
            return 1;
        } else {
            return super.field2349 != 0 ? super.field2348 - var1.field2348 : var1.field2348 - super.field2348;
        }
    }

    @Override
    public int method1251(class278 var1) {
        return this.method2133((class467) var1);
    }

    @Override
    public int compareTo(Object var1) {
        return this.method2133((class467) var1);
    }
}
