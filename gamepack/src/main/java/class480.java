public class class480 {
    byte[] field3458;
    int field3457;
    int field3459;

    class480() {
        this.field3458 = null;
        this.field3457 = 0;
        this.field3459 = 0;
    }

    int method2225(int var1) {
        int var3 = 0;

        int var4;
        int var5;
        for (var4 = 0; var1 >= 8 - this.field3459; var1 -= var5) {
            var5 = 8 - this.field3459;
            int var6 = (1 << var5) - 1;
            var3 += (this.field3458[this.field3457] >> this.field3459 & var6) << var4;
            this.field3459 = 0;
            ++this.field3457;
            var4 += var5;
        }

        if (var1 > 0) {
            var5 = (1 << var1) - 1;
            var3 += (this.field3458[this.field3457] >> this.field3459 & var5) << var4;
            this.field3459 += var1;
        }

        return var3;
    }

    int method2226() {
        int var2 = this.field3458[this.field3457] >> this.field3459 & 1;
        ++this.field3459;
        this.field3457 += this.field3459 >> 3;
        this.field3459 &= 7;
        return var2;
    }

    void method2227(byte[] var1, int var2) {
        this.field3458 = var1;
        this.field3457 = 0;
        this.field3459 = 0;
    }
}
