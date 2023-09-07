public class class507 extends class144 {
    int field3706;
    int field3707;
    int field3708;
    int field3709;
    int field3710;
    int field3711;

    public class507(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        super(var7, var8);
        this.field3710 = 0;
        this.field3707 = 0;
        this.field3708 = 0;
        this.field3709 = 0;
        this.field3706 = 0;
        this.field3711 = 0;
        this.field3710 = var1;
        this.field3707 = var2;
        this.field3708 = var3;
        this.field3709 = var4;
        this.field3706 = var5;
        this.field3711 = var6;
    }

    @Override
    public int method661() {
        double var2 = this.method2118();
        return (int) Math.round((double) (this.field3709 - this.field3710) * var2 + (double) this.field3710);
    }

    @Override
    public int method662() {
        double var2 = this.method2118();
        return (int) Math.round(var2 * (double) (this.field3706 - this.field3707) + (double) this.field3707);
    }

    @Override
    public int method663() {
        double var2 = this.method2118();
        return (int) Math.round((double) this.field3708 + (double) (this.field3711 - this.field3708) * var2);
    }
}
