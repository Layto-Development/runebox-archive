public class class520 extends class144 {
    double field4192;
    double field4193;
    double field4194;
    double field4195;
    double field4196;
    int field4190;
    int field4191;

    public class520(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        super(var9, var10);
        this.field4190 = 0;
        this.field4191 = 0;
        this.field4192 = 0.0D;
        this.field4193 = 0.0D;
        this.field4194 = 0.0D;
        this.field4196 = 0.0D;
        this.field4195 = 0.0D;
        this.field4190 = var3;
        this.field4191 = var6;
        if ((var7 - var1) * (var5 - var8) == (var4 - var7) * (var8 - var2)) {
            this.field4192 = var4;
            this.field4193 = var5;
        } else {
            double var11 = (double) ((float) (var1 + var7)) / 2.0D;
            double var13 = (double) ((float) (var2 + var8)) / 2.0D;
            double var15 = (double) ((float) (var7 + var4)) / 2.0D;
            double var17 = (double) ((float) (var5 + var8)) / 2.0D;
            double var19 = -1.0D * (double) (var7 - var1) / (double) (var8 - var2);
            double var21 = (double) (var4 - var7) * -1.0D / (double) (var5 - var8);
            this.field4192 = (var19 * var11 - var21 * var15 + var17 - var13) / (var19 - var21);
            this.field4193 = var13 + var19 * (this.field4192 - var11);
            this.field4194 = Math.sqrt(Math.pow(this.field4192 - (double) var1, 2.0D) + Math.pow(this.field4193 - (double) var2, 2.0D));
            this.field4196 = Math.atan2((double) var2 - this.field4193, (double) var1 - this.field4192);
            double var23 = Math.atan2((double) var8 - this.field4193, (double) var7 - this.field4192);
            this.field4195 = Math.atan2((double) var5 - this.field4193, (double) var4 - this.field4192);
            boolean var25 = this.field4196 <= var23 && var23 <= this.field4195 || this.field4195 <= var23 && var23 <= this.field4196;
            if (!var25) {
                this.field4195 += (double) (this.field4196 - this.field4195 > 0.0D ? 2 : -2) * 3.141592653589793D;
            }

        }
    }

    @Override
    public int method661() {
        double var2 = this.method2118();
        double var4 = this.field4196 + (this.field4195 - this.field4196) * var2;
        return (int) Math.round(this.field4192 + this.field4194 * Math.cos(var4));
    }

    @Override
    public int method662() {
        double var2 = this.method2118();
        double var4 = this.field4196 + var2 * (this.field4195 - this.field4196);
        return (int) Math.round(this.field4193 + this.field4194 * Math.sin(var4));
    }

    @Override
    public int method663() {
        double var2 = this.method2118();
        return (int) Math.round((double) this.field4190 + var2 * (double) (this.field4191 - this.field4190));
    }
}
