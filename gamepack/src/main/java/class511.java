public class class511 {
    int[] field3772;
    short[] field3773;

    public class511(class345 var1) {
        this.field3772 = new int[8];
        this.field3773 = new short[8];
        int var2 = 0;
        if (var1.method1627()) {
            var2 = var1.method1628().length;
            System.arraycopy(var1.method1628(), 0, this.field3772, 0, var2);
            System.arraycopy(var1.method1630(), 0, this.field3773, 0, var2);
        }

        for (int var3 = var2; var3 < 8; ++var3) {
            this.field3772[var3] = -1;
            this.field3773[var3] = -1;
        }

    }

    public int[] method2301() {
        return this.field3772;
    }

    public short[] method2302() {
        return this.field3773;
    }

    public void method2303(int var1, int var2, short var3) {
        this.field3772[var1] = var2;
        this.field3773[var1] = var3;
    }

    public void method2304(int[] var1, short[] var2) {
        this.field3772 = var1;
        this.field3773 = var2;
    }
}
