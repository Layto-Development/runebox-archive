public final class class539 extends class415 {
    public byte[] field4287;
    public int field4283;
    public int field4284;
    public int field4285;
    public int field4286;
    public int field4288;
    public int field4289;
    public int[] field4290;

    class539() {
    }

    static void method2587(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        int var9 = -(var5 >> 2);
        var5 = -(var5 & 3);

        for (int var10 = -var6; var10 < 0; ++var10) {
            int var11;
            byte var12;
            for (var11 = var9; var11 < 0; ++var11) {
                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }

                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }

                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }

                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }
            }

            for (var11 = var5; var11 < 0; ++var11) {
                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    static void method2588(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        int var12 = var3;

        for (int var13 = -var8; var13 < 0; ++var13) {
            int var14 = (var4 >> 16) * var11;

            for (int var15 = -var7; var15 < 0; ++var15) {
                byte var16 = var1[(var3 >> 16) + var14];
                if (var16 != 0) {
                    var0[var5++] = var2[var16 & 255];
                } else {
                    ++var5;
                }

                var3 += var9;
            }

            var4 += var10;
            var3 = var12;
            var5 += var6;
        }

    }

    public void method2585() {
        if (this.field4285 != this.field4284 || this.field4286 != this.field4289) {
            byte[] var1 = new byte[this.field4284 * this.field4289];
            int var2 = 0;

            for (int var3 = 0; var3 < this.field4286; ++var3) {
                for (int var4 = 0; var4 < this.field4285; ++var4) {
                    var1[var4 + this.field4283 + (var3 + this.field4288) * this.field4284] = this.field4287[var2++];
                }
            }

            this.field4287 = var1;
            this.field4285 = this.field4284;
            this.field4286 = this.field4289;
            this.field4283 = 0;
            this.field4288 = 0;
        }
    }

    public void method2586(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.field4290.length; ++var4) {
            int var5 = this.field4290[var4] >> 16 & 255;
            var5 += var1;
            if (var5 < 0) {
                var5 = 0;
            } else if (var5 > 255) {
                var5 = 255;
            }

            int var6 = this.field4290[var4] >> 8 & 255;
            var6 += var2;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }

            int var7 = this.field4290[var4] & 255;
            var7 += var3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }

            this.field4290[var4] = (var5 << 16) + (var6 << 8) + var7;
        }

    }

    public void method2590(int var1, int var2) {
        var1 += this.field4283;
        var2 += this.field4288;
        int var3 = var1 + var2 * class415.field2903;
        int var4 = 0;
        int var5 = this.field4286;
        int var6 = this.field4285;
        int var7 = class415.field2903 - var6;
        int var8 = 0;
        int var9;
        if (var2 < class415.field2909) {
            var9 = class415.field2909 - var2;
            var5 -= var9;
            var2 = class415.field2909;
            var4 = var9 * var6;
            var3 += var9 * class415.field2903;
        }

        if (var2 + var5 > class415.field2907) {
            var5 -= var2 + var5 - class415.field2907;
        }

        if (var1 < class415.field2908) {
            var9 = class415.field2908 - var1;
            var6 -= var9;
            var1 = class415.field2908;
            var4 += var9;
            var3 += var9;
            var8 = var9;
            var7 += var9;
        }

        if (var1 + var6 > class415.field2902) {
            var9 = var1 + var6 - class415.field2902;
            var6 -= var9;
            var8 += var9;
            var7 += var9;
        }

        if (var6 > 0 && var5 > 0) {
            method2587(class415.field2905, this.field4287, this.field4290, var4, var3, var6, var5, var7, var8);
        }
    }

    public void method2589(int var1, int var2, int var3, int var4) {
        int var5 = this.field4285;
        int var6 = this.field4286;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field4284;
        int var10 = this.field4289;
        int var11 = (var9 << 16) / var3;
        int var12 = (var10 << 16) / var4;
        int var13;
        if (this.field4283 > 0) {
            var13 = ((this.field4283 << 16) + var11 - 1) / var11;
            var1 += var13;
            var7 = (var13 * var11 - (this.field4283 << 16));
        }

        if (this.field4288 > 0) {
            var13 = ((this.field4288 << 16) + var12 - 1) / var12;
            var2 += var13;
            var8 = (var13 * var12 - (this.field4288 << 16));
        }

        if (var5 < var9) {
            var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }

        if (var6 < var10) {
            var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }

        var13 = var1 + var2 * class415.field2903;
        int var14 = class415.field2903 - var3;
        if (var2 + var4 > class415.field2907) {
            var4 -= var2 + var4 - class415.field2907;
        }

        int var15;
        if (var2 < class415.field2909) {
            var15 = class415.field2909 - var2;
            var4 -= var15;
            var13 += var15 * class415.field2903;
            var8 += var12 * var15;
        }

        if (var1 + var3 > class415.field2902) {
            var15 = var1 + var3 - class415.field2902;
            var3 -= var15;
            var14 += var15;
        }

        if (var1 < class415.field2908) {
            var15 = class415.field2908 - var1;
            var3 -= var15;
            var13 += var15;
            var7 += var11 * var15;
            var14 += var15;
        }

        method2588(class415.field2905, this.field4287, this.field4290, var7, var8, var13, var14, var3, var4, var11, var12, var5);
    }
}
