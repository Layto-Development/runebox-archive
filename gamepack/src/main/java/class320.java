public class class320 extends class78 {
    static final int[] field2314;

    static {
        field2314 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
    }

    class299 field2313;
    int field2315;

    public class320(int var1) {
        super(var1);
    }

    public void method1401(int[] var1) {
        this.field2313 = new class299(var1);
    }

    public void method1402(class299 var1) {
        this.field2313 = var1;
    }

    public void method1404(int var1) {
        super.field695[++super.field697 - 1] = (byte) (var1 + this.field2313.method1326());
    }

    public int method1403() {
        return super.field695[++super.field697 - 1] - this.field2313.method1326() & 255;
    }

    public boolean method1405() {
        int var2 = super.field695[super.field697] - this.field2313.method1327() & 255;
        return var2 >= 128;
    }

    public int method1407() {
        int var2 = super.field695[++super.field697 - 1] - this.field2313.method1326() & 255;
        return var2 < 128 ? var2 : (var2 - 128 << 8) + (super.field695[++super.field697 - 1] - this.field2313.method1326() & 255);
    }

    public void method1406(byte[] var1, int var2, int var3) {
        for (int var5 = 0; var5 < var3; ++var5) {
            var1[var5] = (byte) (super.field695[++super.field697 - 1] - this.field2313.method1326());
        }

    }

    public void method1410() {
        this.field2315 = super.field697 * 8;
    }

    public int method1408(int var1) {
        int var3 = this.field2315 >> 3;
        int var4 = 8 - (this.field2315 & 7);
        int var5 = 0;

        for (this.field2315 += var1; var1 > var4; var4 = 8) {
            var5 += (super.field695[var3++] & field2314[var4]) << var1 - var4;
            var1 -= var4;
        }

        if (var4 == var1) {
            var5 += super.field695[var3] & field2314[var4];
        } else {
            var5 += super.field695[var3] >> var4 - var1 & field2314[var1];
        }

        return var5;
    }

    public void method1411() {
        super.field697 = (this.field2315 + 7) / 8;
    }

    public int method1409(int var1) {
        return var1 * 8 - this.field2315;
    }
}
