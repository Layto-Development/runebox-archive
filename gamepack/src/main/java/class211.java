public class class211 {
    static float field1693;
    static float[][] field1689;
    static int field1694;
    static int[][] field1688;

    static {
        field1689 = new float[2][8];
        field1688 = new int[2][8];
    }

    int[] field1691;
    int[] field1692;
    int[][][] field1690;
    int[][][] field1695;

    class211() {
        this.field1691 = new int[2];
        this.field1695 = new int[2][2][4];
        this.field1690 = new int[2][2][4];
        this.field1692 = new int[2];
    }

    static float method1007(float var0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, var0);
        return var1 * 3.1415927F / 11025.0F;
    }

    float method1005(int var1, int var2, float var3) {
        float var4 = (float) this.field1690[var1][0][var2] + var3 * (float) (this.field1690[var1][1][var2] - this.field1690[var1][0][var2]);
        var4 *= 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
    }

    float method1006(int var1, int var2, float var3) {
        float var4 = (float) this.field1695[var1][0][var2] + var3 * (float) (this.field1695[var1][1][var2] - this.field1695[var1][0][var2]);
        var4 *= 1.2207031E-4F;
        return method1007(var4);
    }

    int method1008(int var1, float var2) {
        float var3;
        if (var1 == 0) {
            var3 = (float) this.field1692[0] + (float) (this.field1692[1] - this.field1692[0]) * var2;
            var3 *= 0.0030517578F;
            field1693 = (float) Math.pow(0.1D, var3 / 20.0F);
            field1694 = (int) (field1693 * 65536.0F);
        }

        if (this.field1691[var1] == 0) {
            return 0;
        } else {
            var3 = this.method1005(var1, 0, var2);
            field1689[var1][0] = var3 * -2.0F * (float) Math.cos(this.method1006(var1, 0, var2));
            field1689[var1][1] = var3 * var3;

            float[] var10000;
            int var4;
            for (var4 = 1; var4 < this.field1691[var1]; ++var4) {
                var3 = this.method1005(var1, var4, var2);
                float var5 = var3 * -2.0F * (float) Math.cos(this.method1006(var1, var4, var2));
                float var6 = var3 * var3;
                field1689[var1][var4 * 2 + 1] = field1689[var1][var4 * 2 - 1] * var6;
                field1689[var1][var4 * 2] = field1689[var1][var4 * 2 - 1] * var5 + field1689[var1][var4 * 2 - 2] * var6;

                for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
                    var10000 = field1689[var1];
                    var10000[var7] += field1689[var1][var7 - 1] * var5 + field1689[var1][var7 - 2] * var6;
                }

                var10000 = field1689[var1];
                var10000[1] += field1689[var1][0] * var5 + var6;
                var10000 = field1689[var1];
                var10000[0] += var5;
            }

            if (var1 == 0) {
                for (var4 = 0; var4 < this.field1691[0] * 2; ++var4) {
                    var10000 = field1689[0];
                    var10000[var4] *= field1693;
                }
            }

            for (var4 = 0; var4 < this.field1691[var1] * 2; ++var4) {
                field1688[var1][var4] = (int) (field1689[var1][var4] * 65536.0F);
            }

            return this.field1691[var1] * 2;
        }
    }

    final void method1004(class78 var1, class469 var2) {
        int var3 = var1.method260();
        this.field1691[0] = var3 >> 4;
        this.field1691[1] = var3 & 15;
        if (var3 != 0) {
            this.field1692[0] = var1.method309();
            this.field1692[1] = var1.method309();
            int var4 = var1.method260();

            int var5;
            int var6;
            for (var5 = 0; var5 < 2; ++var5) {
                for (var6 = 0; var6 < this.field1691[var5]; ++var6) {
                    this.field1695[var5][0][var6] = var1.method309();
                    this.field1690[var5][0][var6] = var1.method309();
                }
            }

            for (var5 = 0; var5 < 2; ++var5) {
                for (var6 = 0; var6 < this.field1691[var5]; ++var6) {
                    if ((var4 & 1 << var5 * 4 << var6) != 0) {
                        this.field1695[var5][1][var6] = var1.method309();
                        this.field1690[var5][1][var6] = var1.method309();
                    } else {
                        this.field1695[var5][1][var6] = this.field1695[var5][0][var6];
                        this.field1690[var5][1][var6] = this.field1690[var5][0][var6];
                    }
                }
            }

            if (var4 != 0 || this.field1692[1] != this.field1692[0]) {
                var2.method2170(var1);
            }
        } else {
            int[] var7 = this.field1692;
            this.field1692[1] = 0;
            var7[0] = 0;
        }

    }
}
