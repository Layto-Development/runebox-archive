public class class204 {
    class539[] field1666;
    int field1657;
    int field1659;
    int field1660;
    int field1665;
    int field1671;
    int field1672;
    int[] field1658;
    int[] field1661;
    int[] field1662;
    int[] field1663;
    int[] field1664;
    int[] field1667;
    int[] field1668;
    int[] field1669;
    int[] field1670;

    class204(class539[] var1) {
        this.field1658 = new int[256];
        this.field1659 = 0;
        this.field1665 = 0;
        this.field1660 = 0;
        this.field1657 = 0;
        this.field1671 = 0;
        this.field1672 = 0;
        this.field1666 = var1;
        this.method973();
    }

    void method973() {
        this.field1661 = new int[256];

        int var2;
        for (var2 = 0; var2 < 64; ++var2) {
            this.field1661[var2] = var2 * 262144;
        }

        for (var2 = 0; var2 < 64; ++var2) {
            this.field1661[var2 + 64] = var2 * 1024 + 16711680;
        }

        for (var2 = 0; var2 < 64; ++var2) {
            this.field1661[var2 + 128] = 16776960 + var2 * 4;
        }

        for (var2 = 0; var2 < 64; ++var2) {
            this.field1661[var2 + 192] = 16777215;
        }

        this.field1662 = new int[256];

        for (var2 = 0; var2 < 64; ++var2) {
            this.field1662[var2] = var2 * 1024;
        }

        for (var2 = 0; var2 < 64; ++var2) {
            this.field1662[var2 + 64] = 65280 + var2 * 4;
        }

        for (var2 = 0; var2 < 64; ++var2) {
            this.field1662[var2 + 128] = var2 * 262144 + 65535;
        }

        for (var2 = 0; var2 < 64; ++var2) {
            this.field1662[var2 + 192] = 16777215;
        }

        this.field1663 = new int[256];

        for (var2 = 0; var2 < 64; ++var2) {
            this.field1663[var2] = var2 * 4;
        }

        for (var2 = 0; var2 < 64; ++var2) {
            this.field1663[var2 + 64] = var2 * 262144 + 255;
        }

        for (var2 = 0; var2 < 64; ++var2) {
            this.field1663[var2 + 128] = var2 * 1024 + 16711935;
        }

        for (var2 = 0; var2 < 64; ++var2) {
            this.field1663[var2 + 192] = 16777215;
        }

        this.field1670 = new int[256];
        this.field1657 = 0;
        this.field1668 = new int[32768];
        this.field1669 = new int[32768];
        this.method980(null);
        this.field1664 = new int[32768];
        this.field1667 = new int[32768];
    }

    void method974() {
        this.field1661 = null;
        this.field1662 = null;
        this.field1663 = null;
        this.field1670 = null;
        this.field1668 = null;
        this.field1669 = null;
        this.field1664 = null;
        this.field1667 = null;
        this.field1657 = 0;
        this.field1671 = 0;
    }

    void method981(int var1, int var2) {
        if (this.field1664 == null) {
            this.method973();
        }

        if (this.field1672 == 0) {
            this.field1672 = var2;
        }

        int var4 = var2 - this.field1672;
        if (var4 >= 256) {
            var4 = 0;
        }

        this.field1672 = var2;
        if (var4 > 0) {
            this.method975(var4);
        }

        this.method977(var1);
    }

    final void method975(int var1) {
        this.field1657 += var1 * 128;
        int var3;
        if (this.field1657 > this.field1668.length) {
            this.field1657 -= this.field1668.length;
            var3 = (int) (Math.random() * 12.0D);
            this.method980(this.field1666[var3]);
        }

        var3 = 0;
        int var4 = var1 * 128;
        int var5 = (256 - var1) * 128;

        for (int var6 = 0; var6 < var5; ++var6) {
            int var7 = this.field1664[var4 + var3] - this.field1668[this.field1657 + var3 & this.field1668.length - 1] * var1 / 6;
            if (var7 < 0) {
                var7 = 0;
            }

            this.field1664[var3++] = var7;
        }

        boolean var16 = true;
        boolean var17 = true;

        int var8;
        for (var8 = 256 - var1; var8 < 256; ++var8) {
            int var9 = var8 * 128;

            for (int var10 = 0; var10 < 128; ++var10) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    this.field1664[var10 + var9] = 255;
                } else {
                    this.field1664[var10 + var9] = 0;
                }
            }
        }

        if (this.field1665 > 0) {
            this.field1665 -= var1 * 4;
        }

        if (this.field1660 > 0) {
            this.field1660 -= var1 * 4;
        }

        if (this.field1665 == 0 && this.field1660 == 0) {
            var8 = (int) (Math.random() * (double) (2000 / var1));
            if (var8 == 0) {
                this.field1665 = 1024;
            }

            if (var8 == 1) {
                this.field1660 = 1024;
            }
        }

        for (var8 = 0; var8 < 256 - var1; ++var8) {
            this.field1658[var8] = this.field1658[var1 + var8];
        }

        for (var8 = 256 - var1; var8 < 256; ++var8) {
            this.field1658[var8] = (int) (Math.sin((double) this.field1659 / 14.0D) * 16.0D + Math.sin((double) this.field1659 / 15.0D) * 14.0D + Math.sin((double) this.field1659 / 16.0D) * 12.0D);
            ++this.field1659;
        }

        this.field1671 += var1;
        var8 = ((Client.field4078 & 1) + var1) / 2;
        if (var8 > 0) {
            boolean var18 = true;
            boolean var19 = true;
            boolean var20 = true;

            int var12;
            int var13;
            int var14;
            for (var12 = 0; var12 < this.field1671 * 100; ++var12) {
                var13 = (int) (Math.random() * (double) 124) + 2;
                var14 = (int) (Math.random() * (double) 128) + 128;
                this.field1664[(var14 << 7) + var13] = 192;
            }

            this.field1671 = 0;

            int var15;
            for (var12 = 0; var12 < 256; ++var12) {
                var13 = 0;
                var14 = var12 * 128;

                for (var15 = -var8; var15 < 128; ++var15) {
                    if (var8 + var15 < 128) {
                        var13 += this.field1664[var8 + var15 + var14];
                    }

                    if (var15 - (var8 + 1) >= 0) {
                        var13 -= this.field1664[var14 + var15 - (var8 + 1)];
                    }

                    if (var15 >= 0) {
                        this.field1667[var15 + var14] = var13 / (var8 * 2 + 1);
                    }
                }
            }

            for (var12 = 0; var12 < 128; ++var12) {
                var13 = 0;

                for (var14 = -var8; var14 < 256; ++var14) {
                    var15 = var14 * 128;
                    if (var8 + var14 < 256) {
                        var13 += this.field1667[var15 + var12 + var8 * 128];
                    }

                    if (var14 - (var8 + 1) >= 0) {
                        var13 -= this.field1667[var12 + var15 - (var8 + 1) * 128];
                    }

                    if (var14 >= 0) {
                        this.field1664[var12 + var15] = var13 / (var8 * 2 + 1);
                    }
                }
            }
        }

    }

    final int method976(int var1, int var2, int var3) {
        int var5 = 256 - var3;
        return (var3 * (var2 & 65280) + var5 * (var1 & 65280) & 16711680) + (var3 * (var2 & 16711935) + (var1 & 16711935) * var5 & -16711936) >> 8;
    }

    final void method977(int var1) {
        int var3 = this.field1670.length;
        if (this.field1665 > 0) {
            this.method978(this.field1665, this.field1662);
        } else if (this.field1660 > 0) {
            this.method978(this.field1660, this.field1663);
        } else {
            System.arraycopy(this.field1661, 0, this.field1670, 0, var3);
        }

        this.method979(var1);
    }

    final void method978(int var1, int[] var2) {
        int var4 = this.field1670.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            if (var1 > 768) {
                this.field1670[var5] = this.method976(this.field1661[var5], var2[var5], 1024 - var1);
            } else if (var1 > 256) {
                this.field1670[var5] = var2[var5];
            } else {
                this.field1670[var5] = this.method976(var2[var5], this.field1661[var5], 256 - var1);
            }
        }

    }

    final void method979(int var1) {
        int var3 = 0;

        for (int var4 = 1; var4 < 255; ++var4) {
            int var5 = (256 - var4) * this.field1658[var4] / 256;
            int var6 = var5 + var1;
            int var7 = 0;
            int var8 = 128;
            if (var6 < 0) {
                var7 = -var6;
                var6 = 0;
            }

            if (var6 + 128 >= class295.field2141.field4263) {
                var8 = class295.field2141.field4263 - var6;
            }

            int var9 = var6 + (var4 + 8) * class295.field2141.field4263;
            var3 += var7;

            for (int var10 = var7; var10 < var8; ++var10) {
                int var11 = this.field1664[var3++];
                int var12 = var9 % class415.field2903;
                if (var11 != 0 && var12 >= class415.field2908 && var12 < class415.field2902) {
                    int var13 = var11;
                    int var14 = 256 - var11;
                    var11 = this.field1670[var11];
                    int var15 = class295.field2141.field4264[var9];
                    class295.field2141.field4264[var9++] = -16777216 | (var14 * (var15 & 16711935) + var13 * (var11 & 16711935) & -16711936) + ((var15 & 65280) * var14 + (var11 & 65280) * var13 & 16711680) >> 8;
                } else {
                    ++var9;
                }
            }

            var3 += 128 - var8;
        }

    }

    final void method980(class539 var1) {
        int var3;
        for (var3 = 0; var3 < this.field1668.length; ++var3) {
            this.field1668[var3] = 0;
        }

        int var4;
        for (var3 = 0; var3 < 5000; ++var3) {
            var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1668[var4] = (int) (Math.random() * 256.0D);
        }

        int var5;
        int var6;
        for (var3 = 0; var3 < 20; ++var3) {
            for (var4 = 1; var4 < 255; ++var4) {
                for (var5 = 1; var5 < 127; ++var5) {
                    var6 = (var4 << 7) + var5;
                    this.field1669[var6] = (this.field1668[var6 + 1] + this.field1668[var6 - 1] + this.field1668[var6 - 128] + this.field1668[var6 + 128]) / 4;
                }
            }

            int[] var9 = this.field1668;
            this.field1668 = this.field1669;
            this.field1669 = var9;
        }

        if (var1 != null) {
            var3 = 0;

            for (var4 = 0; var4 < var1.field4286; ++var4) {
                for (var5 = 0; var5 < var1.field4285; ++var5) {
                    if (var1.field4287[var3++] != 0) {
                        var6 = var5 + 16 + var1.field4283;
                        int var7 = var4 + 16 + var1.field4288;
                        int var8 = var6 + (var7 << 7);
                        this.field1668[var8] = 0;
                    }
                }
            }
        }

    }
}
