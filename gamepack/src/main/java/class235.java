public class class235 extends class459 {
    int field1825;
    int field1826;

    public class235(int var1, int var2, int var3, int var4) {
        super(var3, var4);
        this.field1825 = 0;
        this.field1826 = 0;
        this.field1825 = var1;
        this.field1826 = var2;
    }

    public int method1066() {
        double var2 = this.method2118();
        return (int) Math.round((double) this.field1825 + var2 * (double) (this.field1826 - this.field1825));
    }
}
