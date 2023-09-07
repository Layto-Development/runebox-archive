public class class231 extends class70 {
    static int[] field1820;
    boolean field1811;
    boolean field1817;
    int field1810;
    int field1816;
    int field1819;
    int[] field1812;
    int[] field1813;
    int[] field1814;
    int[] field1815;
    int[] field1818;

    class231(class78 var1) {
        this.field1817 = false;
        this.field1810 = var1.method309();
        this.field1811 = var1.method260() == 1;
        int var2 = var1.method260();
        if (var2 >= 1 && var2 > 4) {
        }

        this.field1812 = new int[var2];

        int var3;
        for (var3 = 0; var3 < var2; ++var3) {
            this.field1812[var3] = var1.method309();
        }

        if (var2 > 1) {
            this.field1813 = new int[var2 - 1];

            for (var3 = 0; var3 < var2 - 1; ++var3) {
                this.field1813[var3] = var1.method260();
            }
        }

        if (var2 > 1) {
            this.field1814 = new int[var2 - 1];

            for (var3 = 0; var3 < var2 - 1; ++var3) {
                this.field1814[var3] = var1.method260();
            }
        }

        this.field1815 = new int[var2];

        for (var3 = 0; var3 < var2; ++var3) {
            this.field1815[var3] = var1.method264();
        }

        this.field1816 = var1.method260();
        this.field1819 = var1.method260();
        this.field1818 = null;
    }

    boolean method1055(double var1, int var3, class68 var4) {
        int var5;
        for (var5 = 0; var5 < this.field1812.length; ++var5) {
            if (var4.method197(this.field1812[var5]) == null) {
                return false;
            }
        }

        var5 = var3 * var3;
        this.field1818 = new int[var5];

        for (int var6 = 0; var6 < this.field1812.length; ++var6) {
            int var8 = this.field1812[var6];
            class539 var7;
            if (!class274.method1223(var4, var8)) {
                var7 = null;
            } else {
                var7 = class274.method1232();
            }

            var7.method2585();
            byte[] var10 = var7.field4287;
            int[] var11 = var7.field4290;
            int var12 = this.field1815[var6];
            if ((var12 & -16777216) == 16777216) {
            }

            if ((var12 & -16777216) == 33554432) {
            }

            int var13;
            int var14;
            int var15;
            int var16;
            if ((var12 & -16777216) == 50331648) {
                var13 = var12 & 16711935;
                var14 = var12 >> 8 & 255;

                for (var15 = 0; var15 < var11.length; ++var15) {
                    var16 = var11[var15];
                    if ((var16 & 65535) == var16 >> 8) {
                        var16 &= 255;
                        var11[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & 65280;
                    }
                }
            }

            for (var13 = 0; var13 < var11.length; ++var13) {
                var11[var13] = class334.method1586(var11[var13], var1);
            }

            if (var6 == 0) {
                var13 = 0;
            } else {
                var13 = this.field1813[var6 - 1];
            }

            if (var13 == 0) {
                if (var7.field4285 == var3) {
                    for (var14 = 0; var14 < var5; ++var14) {
                        this.field1818[var14] = var11[var10[var14] & 255];
                    }
                } else if (var7.field4285 == 64 && var3 == 128) {
                    var14 = 0;

                    for (var15 = 0; var15 < var3; ++var15) {
                        for (var16 = 0; var16 < var3; ++var16) {
                            this.field1818[var14++] = var11[var10[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
                        }
                    }
                } else {
                    if (var7.field4285 != 128 || var3 != 64) {
                        throw new RuntimeException();
                    }

                    var14 = 0;

                    for (var15 = 0; var15 < var3; ++var15) {
                        for (var16 = 0; var16 < var3; ++var16) {
                            this.field1818[var14++] = var11[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
                        }
                    }
                }
            }

            if (var13 == 1) {
            }

            if (var13 == 2) {
            }

            if (var13 == 3) {
            }
        }

        return true;
    }

    void method1053() {
        this.field1818 = null;
    }

    void method1054(int var1) {
        if (this.field1818 != null) {
            short var2;
            int var3;
            int var4;
            int var5;
            int var6;
            int var7;
            int[] var10;
            if (this.field1816 == 1 || this.field1816 == 3) {
                if (field1820 == null || field1820.length < this.field1818.length) {
                    field1820 = new int[this.field1818.length];
                }

                if (this.field1818.length == 4096) {
                    var2 = 64;
                } else {
                    var2 = 128;
                }

                var3 = this.field1818.length;
                var4 = var2 * var1 * this.field1819;
                var5 = var3 - 1;
                if (this.field1816 == 1) {
                    var4 = -var4;
                }

                for (var6 = 0; var6 < var3; ++var6) {
                    var7 = var6 + var4 & var5;
                    field1820[var6] = this.field1818[var7];
                }

                var10 = this.field1818;
                this.field1818 = field1820;
                field1820 = var10;
            }

            if (this.field1816 == 2 || this.field1816 == 4) {
                if (field1820 == null || field1820.length < this.field1818.length) {
                    field1820 = new int[this.field1818.length];
                }

                if (this.field1818.length == 4096) {
                    var2 = 64;
                } else {
                    var2 = 128;
                }

                var3 = this.field1818.length;
                var4 = var1 * this.field1819;
                var5 = var2 - 1;
                if (this.field1816 == 2) {
                    var4 = -var4;
                }

                for (var6 = 0; var6 < var3; var6 += var2) {
                    for (var7 = 0; var7 < var2; ++var7) {
                        int var8 = var6 + var7;
                        int var9 = var6 + (var7 + var4 & var5);
                        field1820[var8] = this.field1818[var9];
                    }
                }

                var10 = this.field1818;
                this.field1818 = field1820;
                field1820 = var10;
            }

        }
    }
}
