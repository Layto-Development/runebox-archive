public class class469 {
    int field3348;
    int field3351;
    int field3352;
    int field3353;
    int field3354;
    int field3355;
    int field3356;
    int field3357;
    int field3358;
    int[] field3349;
    int[] field3350;

    class469() {
        this.field3353 = 2;
        this.field3349 = new int[2];
        this.field3350 = new int[2];
        this.field3349[0] = 0;
        this.field3349[1] = 65535;
        this.field3350[0] = 0;
        this.field3350[1] = 65535;
    }

    final void method2169(class78 var1) {
        this.field3352 = var1.method260();
        this.field3351 = var1.method264();
        this.field3348 = var1.method264();
        this.method2170(var1);
    }

    final void method2170(class78 var1) {
        this.field3353 = var1.method260();
        this.field3349 = new int[this.field3353];
        this.field3350 = new int[this.field3353];

        for (int var2 = 0; var2 < this.field3353; ++var2) {
            this.field3349[var2] = var1.method309();
            this.field3350[var2] = var1.method309();
        }

    }

    final void method2168() {
        this.field3355 = 0;
        this.field3357 = 0;
        this.field3356 = 0;
        this.field3354 = 0;
        this.field3358 = 0;
    }

    final int method2167(int var1) {
        if (this.field3358 >= this.field3355) {
            this.field3354 = this.field3350[this.field3357++] << 15;
            if (this.field3357 >= this.field3353) {
                this.field3357 = this.field3353 - 1;
            }

            this.field3355 = (int) ((double) this.field3349[this.field3357] / 65536.0D * (double) var1);
            if (this.field3355 > this.field3358) {
                this.field3356 = ((this.field3350[this.field3357] << 15) - this.field3354) / (this.field3355 - this.field3358);
            }
        }

        this.field3354 += this.field3356;
        ++this.field3358;
        return this.field3354 - this.field3356 >> 15;
    }
}
