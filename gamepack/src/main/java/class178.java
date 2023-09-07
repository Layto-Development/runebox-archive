public final class class178 {
    class70 field1516;
    class70 field1517;
    class70[] field1515;
    int field1514;
    int field1518;

    public class178(int var1) {
        this.field1514 = 0;
        this.field1518 = var1;
        this.field1515 = new class70[var1];

        for (int var2 = 0; var2 < var1; ++var2) {
            class70 var3 = this.field1515[var2] = new class70();
            var3.field657 = var3;
            var3.field659 = var3;
        }

    }

    public class70 method857(long var1) {
        class70 var3 = this.field1515[(int) (var1 & (long) (this.field1518 - 1))];

        for (this.field1516 = var3.field657; this.field1516 != var3; this.field1516 = this.field1516.field657) {
            if (this.field1516.field658 == var1) {
                class70 var4 = this.field1516;
                this.field1516 = this.field1516.field657;
                return var4;
            }
        }

        this.field1516 = null;
        return null;
    }

    public int method856() {
        int var1 = 0;

        for (int var2 = 0; var2 < this.field1518; ++var2) {
            class70 var3 = this.field1515[var2];

            for (class70 var4 = var3.field657; var4 != var3; var4 = var4.field657) {
                ++var1;
            }
        }

        return var1;
    }

    public void method860(class70 var1, long var2) {
        if (var1.field659 != null) {
            var1.method221();
        }

        class70 var4 = this.field1515[(int) (var2 & (long) (this.field1518 - 1))];
        var1.field659 = var4.field659;
        var1.field657 = var4;
        var1.field659.field657 = var1;
        var1.field657.field659 = var1;
        var1.field658 = var2;
    }

    public class70 method858() {
        this.field1514 = 0;
        return this.method859();
    }

    public class70 method859() {
        class70 var1;
        if (this.field1514 > 0 && this.field1517 != this.field1515[this.field1514 - 1]) {
            var1 = this.field1517;
            this.field1517 = var1.field657;
            return var1;
        } else {
            do {
                if (this.field1514 >= this.field1518) {
                    return null;
                }

                var1 = this.field1515[this.field1514++].field657;
            } while (var1 == this.field1515[this.field1514 - 1]);

            this.field1517 = var1.field657;
            return var1;
        }
    }
}
