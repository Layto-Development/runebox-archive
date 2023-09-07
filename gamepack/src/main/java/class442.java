public class class442 extends class70 {
    static boolean field3002;
    static boolean[] field2984;
    static class221[] field2981;
    static class293[] field2982;
    static class3[] field2983;
    static class480 field2977;
    static class513[] field2980;
    static float[] field2987;
    static float[] field2993;
    static float[] field2995;
    static float[] field2996;
    static float[] field2997;
    static float[] field3001;
    static int field2978;
    static int field2979;
    static int[] field2973;
    static int[] field2985;
    static int[] field2998;

    static {
        field2977 = new class480();
        field3002 = false;
    }

    boolean field2976;
    boolean field2991;
    byte[] field3000;
    byte[][] field2990;
    float[] field2992;
    float[] field2994;
    int field2971;
    int field2972;
    int field2974;
    int field2975;
    int field2986;
    int field2988;
    int field2989;
    int field2999;

    class442(byte[] var1) {
        this.method2012(var1);
    }

    static float method2018(int var0) {
        int var1 = var0 & 2097151;
        int var2 = var0 & Integer.MIN_VALUE;
        int var3 = (var0 & 2145386496) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }

        return (float) ((double) var1 * Math.pow(2.0D, var3 - 788));
    }

    static void method2013(byte[] var0) {
        class480 var1 = field2977;
        var1.method2227(var0, 0);
        field2978 = 1 << var1.method2225(4);
        field2979 = 1 << var1.method2225(4);

        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        for (var2 = 0; var2 < 2; ++var2) {
            var3 = var2 != 0 ? field2979 : field2978;
            var4 = var3 >> 1;
            var5 = var3 >> 2;
            var6 = var3 >> 3;
            float[] var7 = new float[var4];

            for (int var8 = 0; var8 < var5; ++var8) {
                var7[var8 * 2] = (float) Math.cos((double) (var8 * 4) * 3.141592653589793D / (double) var3);
                var7[var8 * 2 + 1] = -((float) Math.sin((double) (var8 * 4) * 3.141592653589793D / (double) var3));
            }

            float[] var20 = new float[var4];

            for (int var9 = 0; var9 < var5; ++var9) {
                var20[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var3 * 2));
                var20[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var3 * 2));
            }

            float[] var21 = new float[var5];

            for (int var10 = 0; var10 < var6; ++var10) {
                var21[var10 * 2] = (float) Math.cos((double) (var10 * 4 + 2) * 3.141592653589793D / (double) var3);
                var21[var10 * 2 + 1] = -((float) Math.sin((double) (var10 * 4 + 2) * 3.141592653589793D / (double) var3));
            }

            int[] var22 = new int[var6];
            int var11 = class82.method327(var6 - 1);

            for (int var12 = 0; var12 < var6; ++var12) {
                int var16 = var12;
                int var17 = var11;

                int var18;
                for (var18 = 0; var17 > 0; --var17) {
                    var18 = var18 << 1 | var16 & 1;
                    var16 >>>= 1;
                }

                var22[var12] = var18;
            }

            if (var2 != 0) {
                field2995 = var7;
                field2996 = var20;
                field2997 = var21;
                field2973 = var22;
            } else {
                field3001 = var7;
                field2993 = var20;
                field2987 = var21;
                field2998 = var22;
            }
        }

        var2 = var1.method2225(8) + 1;
        field2980 = new class513[var2];

        for (var3 = 0; var3 < var2; ++var3) {
            field2980[var3] = new class513();
        }

        var3 = var1.method2225(6) + 1;

        for (var4 = 0; var4 < var3; ++var4) {
            var1.method2225(16);
        }

        var3 = var1.method2225(6) + 1;
        field2981 = new class221[var3];

        for (var4 = 0; var4 < var3; ++var4) {
            field2981[var4] = new class221();
        }

        var4 = var1.method2225(6) + 1;
        field2982 = new class293[var4];

        for (var5 = 0; var5 < var4; ++var5) {
            field2982[var5] = new class293();
        }

        var5 = var1.method2225(6) + 1;
        field2983 = new class3[var5];

        for (var6 = 0; var6 < var5; ++var6) {
            field2983[var6] = new class3();
        }

        var6 = var1.method2225(6) + 1;
        field2984 = new boolean[var6];
        field2985 = new int[var6];

        for (int var19 = 0; var19 < var6; ++var19) {
            field2984[var19] = var1.method2226() != 0;
            var1.method2225(16);
            var1.method2225(16);
            field2985[var19] = var1.method2225(8);
        }

    }

    static boolean method2015(class68 var0) {
        if (!field3002) {
            byte[] var1 = var0.method188(0, 0);
            if (var1 == null) {
                return false;
            }

            method2013(var1);
            field3002 = true;
        }

        return true;
    }

    static class442 method2016(class68 var0, int var1, int var2) {
        if (!method2015(var0)) {
            var0.method190(var1, var2);
            return null;
        } else {
            byte[] var3 = var0.method188(var1, var2);
            return var3 == null ? null : new class442(var3);
        }
    }

    void method2012(byte[] var1) {
        class78 var2 = new class78(var1);
        this.field2999 = var2.method264();
        this.field2972 = var2.method264();
        this.field2974 = var2.method264();
        this.field2975 = var2.method264();
        if (this.field2975 < 0) {
            this.field2975 = ~this.field2975;
            this.field2976 = true;
        }

        int var3 = var2.method264();
        this.field2990 = new byte[var3][];

        for (int var4 = 0; var4 < var3; ++var4) {
            int var5 = 0;

            int var6;
            do {
                var6 = var2.method260();
                var5 += var6;
            } while (var6 >= 255);

            byte[] var7 = new byte[var5];
            var2.method270(var7, 0, var5);
            this.field2990[var4] = var7;
        }

    }

    float[] method2014(int var1) {
        class480 var2 = new class480();
        var2.method2227(this.field2990[var1], 0);
        this.field2994 = new float[field2979];
        var2.method2226();
        int var3 = var2.method2225(class82.method327(field2985.length - 1));
        boolean var4 = field2984[var3];
        int var5 = var4 ? field2979 : field2978;
        boolean var6 = false;
        boolean var7 = false;
        if (var4) {
            var6 = var2.method2226() != 0;
            var7 = var2.method2226() != 0;
        }

        int var8 = var5 >> 1;
        int var9;
        int var10;
        int var11;
        if (var4 && !var6) {
            var9 = (var5 >> 2) - (field2978 >> 2);
            var10 = (var5 >> 2) + (field2978 >> 2);
            var11 = field2978 >> 1;
        } else {
            var9 = 0;
            var10 = var8;
            var11 = var5 >> 1;
        }

        int var12;
        int var13;
        int var14;
        if (var4 && !var7) {
            var12 = var5 - (var5 >> 2) - (field2978 >> 2);
            var13 = var5 - (var5 >> 2) + (field2978 >> 2);
            var14 = field2978 >> 1;
        } else {
            var12 = var8;
            var13 = var5;
            var14 = var5 >> 1;
        }

        class3 var15 = field2983[field2985[var3]];
        int var16 = var15.field3;
        int var17 = var15.field5[var16];
        class303 var18 = field2981[var17].method1029(var2);
        boolean var19 = !var18.method1337();

        int var20;
        for (var20 = 0; var20 < var15.field4; ++var20) {
            class293 var21 = field2982[var15.field6[var20]];
            float[] var22 = this.field2994;
            var21.method1318(var22, var5 >> 1, var19, var2);
        }

        if (var18.method1337()) {
            var16 = var15.field3;
            int var10000 = var15.field5[var16];
            var18.method1336(this.field2994, var5 >> 1);
        }

        int var43;
        int var46;
        if (!var18.method1337()) {
            for (var20 = var5 >> 1; var20 < var5; ++var20) {
                this.field2994[var20] = 0.0F;
            }
        } else {
            var20 = var5 >> 1;
            var43 = var5 >> 2;
            var46 = var5 >> 3;
            float[] var23 = this.field2994;

            int var24;
            for (var24 = 0; var24 < var20; ++var24) {
                var23[var24] *= 0.5F;
            }

            for (var24 = var20; var24 < var5; ++var24) {
                var23[var24] = -var23[var5 - var24 - 1];
            }

            float[] var48 = var4 ? field2995 : field3001;
            float[] var25 = var4 ? field2996 : field2993;
            float[] var26 = var4 ? field2997 : field2987;
            int[] var27 = var4 ? field2973 : field2998;

            int var28;
            float var29;
            float var30;
            float var31;
            float var32;
            for (var28 = 0; var28 < var43; ++var28) {
                var29 = var23[var28 * 4] - var23[var5 - var28 * 4 - 1];
                var30 = var23[var28 * 4 + 2] - var23[var5 - var28 * 4 - 3];
                var31 = var48[var28 * 2];
                var32 = var48[var28 * 2 + 1];
                var23[var5 - var28 * 4 - 1] = var29 * var31 - var30 * var32;
                var23[var5 - var28 * 4 - 3] = var29 * var32 + var30 * var31;
            }

            float var33;
            float var34;
            for (var28 = 0; var28 < var46; ++var28) {
                var29 = var23[var20 + 3 + var28 * 4];
                var30 = var23[var20 + 1 + var28 * 4];
                var31 = var23[var28 * 4 + 3];
                var32 = var23[var28 * 4 + 1];
                var23[var20 + 3 + var28 * 4] = var29 + var31;
                var23[var20 + 1 + var28 * 4] = var30 + var32;
                var33 = var48[var20 - 4 - var28 * 4];
                var34 = var48[var20 - 3 - var28 * 4];
                var23[var28 * 4 + 3] = (var29 - var31) * var33 - (var30 - var32) * var34;
                var23[var28 * 4 + 1] = (var30 - var32) * var33 + (var29 - var31) * var34;
            }

            var28 = class82.method327(var5 - 1);

            int var49;
            int var50;
            int var51;
            int var52;
            for (var49 = 0; var49 < var28 - 3; ++var49) {
                var50 = var5 >> var49 + 2;
                var51 = 8 << var49;

                for (var52 = 0; var52 < 2 << var49; ++var52) {
                    int var53 = var5 - var50 * 2 * var52;
                    int var54 = var5 - var50 * (var52 * 2 + 1);

                    for (int var35 = 0; var35 < var5 >> var49 + 4; ++var35) {
                        int var36 = var35 * 4;
                        float var37 = var23[var53 - 1 - var36];
                        float var38 = var23[var53 - 3 - var36];
                        float var39 = var23[var54 - 1 - var36];
                        float var40 = var23[var54 - 3 - var36];
                        var23[var53 - 1 - var36] = var37 + var39;
                        var23[var53 - 3 - var36] = var38 + var40;
                        float var41 = var48[var35 * var51];
                        float var42 = var48[var35 * var51 + 1];
                        var23[var54 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
                        var23[var54 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
                    }
                }
            }

            for (var49 = 1; var49 < var46 - 1; ++var49) {
                var50 = var27[var49];
                if (var49 < var50) {
                    var51 = var49 * 8;
                    var52 = var50 * 8;
                    var33 = var23[var51 + 1];
                    var23[var51 + 1] = var23[var52 + 1];
                    var23[var52 + 1] = var33;
                    var33 = var23[var51 + 3];
                    var23[var51 + 3] = var23[var52 + 3];
                    var23[var52 + 3] = var33;
                    var33 = var23[var51 + 5];
                    var23[var51 + 5] = var23[var52 + 5];
                    var23[var52 + 5] = var33;
                    var33 = var23[var51 + 7];
                    var23[var51 + 7] = var23[var52 + 7];
                    var23[var52 + 7] = var33;
                }
            }

            for (var49 = 0; var49 < var20; ++var49) {
                var23[var49] = var23[var49 * 2 + 1];
            }

            for (var49 = 0; var49 < var46; ++var49) {
                var23[var5 - 1 - var49 * 2] = var23[var49 * 4];
                var23[var5 - 2 - var49 * 2] = var23[var49 * 4 + 1];
                var23[var5 - var43 - 1 - var49 * 2] = var23[var49 * 4 + 2];
                var23[var5 - var43 - 2 - var49 * 2] = var23[var49 * 4 + 3];
            }

            for (var49 = 0; var49 < var46; ++var49) {
                var30 = var26[var49 * 2];
                var31 = var26[var49 * 2 + 1];
                var32 = var23[var20 + var49 * 2];
                var33 = var23[var20 + var49 * 2 + 1];
                var34 = var23[var5 - 2 - var49 * 2];
                float var55 = var23[var5 - 1 - var49 * 2];
                float var56 = var31 * (var32 - var34) + var30 * (var33 + var55);
                var23[var20 + var49 * 2] = (var32 + var34 + var56) * 0.5F;
                var23[var5 - 2 - var49 * 2] = (var32 + var34 - var56) * 0.5F;
                var56 = var31 * (var33 + var55) - var30 * (var32 - var34);
                var23[var20 + var49 * 2 + 1] = (var33 - var55 + var56) * 0.5F;
                var23[var5 - 1 - var49 * 2] = (-var33 + var55 + var56) * 0.5F;
            }

            for (var49 = 0; var49 < var43; ++var49) {
                var23[var49] = var23[var49 * 2 + var20] * var25[var49 * 2] + var23[var49 * 2 + 1 + var20] * var25[var49 * 2 + 1];
                var23[var20 - 1 - var49] = var23[var49 * 2 + var20] * var25[var49 * 2 + 1] - var23[var49 * 2 + 1 + var20] * var25[var49 * 2];
            }

            for (var49 = 0; var49 < var43; ++var49) {
                var23[var5 - var43 + var49] = -var23[var49];
            }

            for (var49 = 0; var49 < var43; ++var49) {
                var23[var49] = var23[var43 + var49];
            }

            for (var49 = 0; var49 < var43; ++var49) {
                var23[var43 + var49] = -var23[var43 - var49 - 1];
            }

            for (var49 = 0; var49 < var43; ++var49) {
                var23[var20 + var49] = var23[var5 - var49 - 1];
            }

            float[] var57;
            for (var49 = var9; var49 < var10; ++var49) {
                var30 = (float) Math.sin(((double) (var49 - var9) + 0.5D) / (double) var11 * 0.5D * 3.141592653589793D);
                var57 = this.field2994;
                var57[var49] *= (float) Math.sin(1.5707963267948966D * (double) var30 * (double) var30);
            }

            for (var49 = var12; var49 < var13; ++var49) {
                var30 = (float) Math.sin(((double) (var49 - var12) + 0.5D) / (double) var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                var57 = this.field2994;
                var57[var49] *= (float) Math.sin(1.5707963267948966D * (double) var30 * (double) var30);
            }
        }

        float[] var44 = null;
        if (this.field2988 > 0) {
            var43 = this.field2988 + var5 >> 2;
            var44 = new float[var43];
            int var47;
            if (!this.field2991) {
                for (var46 = 0; var46 < this.field2989; ++var46) {
                    var47 = (this.field2988 >> 1) + var46;
                    var44[var46] += this.field2992[var47];
                }
            }

            if (var18.method1337()) {
                for (var46 = var9; var46 < var5 >> 1; ++var46) {
                    var47 = var44.length - (var5 >> 1) + var46;
                    var44[var47] += this.field2994[var46];
                }
            }
        }

        float[] var45 = this.field2992;
        this.field2992 = this.field2994;
        this.field2994 = var45;
        this.field2988 = var5;
        this.field2989 = var13 - (var5 >> 1);
        this.field2991 = !var18.method1337();
        return var44;
    }

    class433 method2017(int[] var1) {
        if (var1 != null && var1[0] <= 0) {
            return null;
        } else {
            if (this.field3000 == null) {
                this.field2988 = 0;
                this.field2992 = new float[field2979];
                this.field3000 = new byte[this.field2972];
                this.field2971 = 0;
                this.field2986 = 0;
            }

            for (; this.field2986 < this.field2990.length; ++this.field2986) {
                if (var1 != null && var1[0] <= 0) {
                    return null;
                }

                float[] var2 = this.method2014(this.field2986);
                if (var2 != null) {
                    int var3 = this.field2971;
                    int var4 = var2.length;
                    if (var4 > this.field2972 - var3) {
                        var4 = this.field2972 - var3;
                    }

                    for (int var5 = 0; var5 < var4; ++var5) {
                        int var6 = (int) (128.0F + var2[var5] * 128.0F);
                        if ((var6 & -256) != 0) {
                            var6 = ~var6 >> 31;
                        }

                        this.field3000[var3++] = (byte) (var6 - 128);
                    }

                    if (var1 != null) {
                        var1[0] -= var3 - this.field2971;
                    }

                    this.field2971 = var3;
                }
            }

            this.field2992 = null;
            byte[] var7 = this.field3000;
            this.field3000 = null;
            return new class433(this.field2999, var7, this.field2974, this.field2975, this.field2976);
        }
    }
}
