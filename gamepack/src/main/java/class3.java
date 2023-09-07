public class class3 {
    int field3;
    int field4;
    int[] field5;
    int[] field6;

    class3() {
        class480 var1 = class442.field2977;
        var1.method2225(16);
        this.field4 = var1.method2226() != 0 ? var1.method2225(4) + 1 : 1;
        if (var1.method2226() != 0) {
            var1.method2225(8);
        }

        var1.method2225(2);
        if (this.field4 > 1) {
            this.field3 = var1.method2225(4);
        }

        this.field5 = new int[this.field4];
        this.field6 = new int[this.field4];

        for (int var2 = 0; var2 < this.field4; ++var2) {
            var1.method2225(8);
            this.field5[var2] = var1.method2225(8);
            this.field6[var2] = var1.method2225(8);
        }

    }
}
