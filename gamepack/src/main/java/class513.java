public class class513 {
    float[][] field4089;
    int field4088;
    int field4090;
    int[] field4085;
    int[] field4086;
    int[] field4087;

    class513() {
        class480 var1 = class442.field2977;
        var1.method2225(24);
        this.field4090 = var1.method2225(16);
        this.field4088 = var1.method2225(24);
        this.field4087 = new int[this.field4088];
        boolean var2 = var1.method2226() != 0;
        int var3;
        int var4;
        int var6;
        if (var2) {
            var3 = 0;

            for (var4 = var1.method2225(5) + 1; var3 < this.field4088; ++var4) {
                int var5 = var1.method2225(class82.method327(this.field4088 - var3));

                for (var6 = 0; var6 < var5; ++var6) {
                    this.field4087[var3++] = var4;
                }
            }
        } else {
            boolean var15 = var1.method2226() != 0;

            for (var4 = 0; var4 < this.field4088; ++var4) {
                if (var15 && var1.method2226() == 0) {
                    this.field4087[var4] = 0;
                } else {
                    this.field4087[var4] = var1.method2225(5) + 1;
                }
            }
        }

        this.method2497();
        var3 = var1.method2225(4);
        if (var3 > 0) {
            float var16 = class442.method2018(var1.method2225(32));
            float var17 = class442.method2018(var1.method2225(32));
            var6 = var1.method2225(4) + 1;
            boolean var7 = var1.method2226() != 0;
            int var8;
            if (var3 == 1) {
                var8 = method2500(this.field4088, this.field4090);
            } else {
                var8 = this.field4088 * this.field4090;
            }

            this.field4085 = new int[var8];

            int var9;
            for (var9 = 0; var9 < var8; ++var9) {
                this.field4085[var9] = var1.method2225(var6);
            }

            this.field4089 = new float[this.field4088][this.field4090];
            float var10;
            int var11;
            int var12;
            if (var3 == 1) {
                for (var9 = 0; var9 < this.field4088; ++var9) {
                    var10 = 0.0F;
                    var11 = 1;

                    for (var12 = 0; var12 < this.field4090; ++var12) {
                        int var13 = var9 / var11 % var8;
                        float var14 = (float) this.field4085[var13] * var17 + var16 + var10;
                        this.field4089[var9][var12] = var14;
                        if (var7) {
                            var10 = var14;
                        }

                        var11 *= var8;
                    }
                }
            } else {
                for (var9 = 0; var9 < this.field4088; ++var9) {
                    var10 = 0.0F;
                    var11 = var9 * this.field4090;

                    for (var12 = 0; var12 < this.field4090; ++var12) {
                        float var18 = (float) this.field4085[var11] * var17 + var16 + var10;
                        this.field4089[var9][var12] = var18;
                        if (var7) {
                            var10 = var18;
                        }

                        ++var11;
                    }
                }
            }
        }

    }

    static int method2500(int var0, int var1) {
        int var2;
        for (var2 = (int) Math.pow(var0, 1.0D / (double) var1) + 1; class82.method330(var2, var1) > var0; --var2) {
        }

        return var2;
    }

    void method2497() {
        int[] var1 = new int[this.field4088];
        int[] var2 = new int[33];

        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var10;
        for (var3 = 0; var3 < this.field4088; ++var3) {
            var4 = this.field4087[var3];
            if (var4 != 0) {
                var5 = 1 << 32 - var4;
                var6 = var2[var4];
                var1[var3] = var6;
                int var9;
                if ((var6 & var5) != 0) {
                    var7 = var2[var4 - 1];
                } else {
                    var7 = var6 | var5;

                    for (var8 = var4 - 1; var8 >= 1; --var8) {
                        var9 = var2[var8];
                        if (var9 != var6) {
                            break;
                        }

                        var10 = 1 << 32 - var8;
                        if ((var9 & var10) != 0) {
                            var2[var8] = var2[var8 - 1];
                            break;
                        }

                        var2[var8] = var9 | var10;
                    }
                }

                var2[var4] = var7;

                for (var8 = var4 + 1; var8 <= 32; ++var8) {
                    var9 = var2[var8];
                    if (var9 == var6) {
                        var2[var8] = var7;
                    }
                }
            }
        }

        this.field4086 = new int[8];
        int var11 = 0;

        for (var3 = 0; var3 < this.field4088; ++var3) {
            var4 = this.field4087[var3];
            if (var4 != 0) {
                var5 = var1[var3];
                var6 = 0;

                for (var7 = 0; var7 < var4; ++var7) {
                    var8 = Integer.MIN_VALUE >>> var7;
                    if ((var5 & var8) != 0) {
                        if (this.field4086[var6] == 0) {
                            this.field4086[var6] = var11;
                        }

                        var6 = this.field4086[var6];
                    } else {
                        ++var6;
                    }

                    if (var6 >= this.field4086.length) {
                        int[] var12 = new int[this.field4086.length * 2];

                        for (var10 = 0; var10 < this.field4086.length; ++var10) {
                            var12[var10] = this.field4086[var10];
                        }

                        this.field4086 = var12;
                    }

                    var8 >>>= 1;
                }

                this.field4086[var6] = ~var3;
                if (var6 >= var11) {
                    var11 = var6 + 1;
                }
            }
        }

    }

    int method2499(class480 var1) {
        int var2;
        for (var2 = 0; this.field4086[var2] >= 0; var2 = var1.method2226() != 0 ? this.field4086[var2] : var2 + 1) {
        }

        return ~this.field4086[var2];
    }

    float[] method2498(class480 var1) {
        return this.field4089[this.method2499(var1)];
    }
}
