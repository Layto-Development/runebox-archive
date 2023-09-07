public class class246 extends class418 {
    int field1888;
    int field1889;
    int field1891;
    int field1893;
    long field1890;
    long[] field1892;

    public class246() {
        this.field1892 = new long[10];
        this.field1889 = 256;
        this.field1891 = 1;
        this.field1888 = 0;
        this.field1890 = class206.method982();

        for (int var1 = 0; var1 < 10; ++var1) {
            this.field1892[var1] = this.field1890;
        }

    }

    @Override
    public void method1933() {
        for (int var2 = 0; var2 < 10; ++var2) {
            this.field1892[var2] = 0L;
        }

    }

    @Override
    public int method1934(int var1, int var2) {
        int var4 = this.field1889;
        int var5 = this.field1891;
        this.field1889 = 300;
        this.field1891 = 1;
        this.field1890 = class206.method982();
        if (0L == this.field1892[this.field1893]) {
            this.field1889 = var4;
            this.field1891 = var5;
        } else if (this.field1890 > this.field1892[this.field1893]) {
            this.field1889 = (int) ((long) (var1 * 2560L) / (this.field1890 - this.field1892[this.field1893]));
        }

        if (this.field1889 < 25) {
            this.field1889 = 25;
        }

        if (this.field1889 > 256) {
            this.field1889 = 256;
            this.field1891 = (int) ((long) var1 - (this.field1890 - this.field1892[this.field1893]) / 10L);
        }

        if (this.field1891 > var1) {
            this.field1891 = var1;
        }

        this.field1892[this.field1893] = this.field1890;
        this.field1893 = (1 + this.field1893) % 10;
        int var6;
        if (this.field1891 > 1) {
            for (var6 = 0; var6 < 10; ++var6) {
                if (0L != this.field1892[var6]) {
                    this.field1892[var6] += this.field1891;
                }
            }
        }

        if (this.field1891 < var2) {
            this.field1891 = var2;
        }

        class316.method1394(this.field1891);

        for (var6 = 0; this.field1888 < 256; this.field1888 += this.field1889) {
            ++var6;
        }

        this.field1888 &= 255;
        return var6;
    }
}
