public class class11 {
    public int[][] field53;
    int field49;
    int field50;
    int field51;
    int field52;

    public class11(int var1, int var2) {
        this.field50 = 0;
        this.field51 = 0;
        this.field52 = var1;
        this.field49 = var2;
        this.field53 = new int[this.field52][this.field49];
        this.method29();
    }

    static class453 method31() {
        return class426.field2930;
    }

    public void method29() {
        for (int var2 = 0; var2 < this.field52; ++var2) {
            for (int var3 = 0; var3 < this.field49; ++var3) {
                if (var2 != 0 && var3 != 0 && var2 < this.field52 - 5 && var3 < this.field49 - 5) {
                    this.field53[var2][var3] = 16777216;
                } else {
                    this.field53[var2][var3] = 16777215;
                }
            }
        }

    }

    public void method22(int var1, int var2, int var3, int var4, boolean var5) {
        var1 -= this.field50;
        var2 -= this.field51;
        if (var3 == 0) {
            if (var4 == 0) {
                this.method21(var1, var2, 128);
                this.method21(var1 - 1, var2, 8);
            }

            if (var4 == 1) {
                this.method21(var1, var2, 2);
                this.method21(var1, var2 + 1, 32);
            }

            if (var4 == 2) {
                this.method21(var1, var2, 8);
                this.method21(var1 + 1, var2, 128);
            }

            if (var4 == 3) {
                this.method21(var1, var2, 32);
                this.method21(var1, var2 - 1, 2);
            }
        }

        if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
                this.method21(var1, var2, 1);
                this.method21(var1 - 1, var2 + 1, 16);
            }

            if (var4 == 1) {
                this.method21(var1, var2, 4);
                this.method21(var1 + 1, var2 + 1, 64);
            }

            if (var4 == 2) {
                this.method21(var1, var2, 16);
                this.method21(var1 + 1, var2 - 1, 1);
            }

            if (var4 == 3) {
                this.method21(var1, var2, 64);
                this.method21(var1 - 1, var2 - 1, 4);
            }
        }

        if (var3 == 2) {
            if (var4 == 0) {
                this.method21(var1, var2, 130);
                this.method21(var1 - 1, var2, 8);
                this.method21(var1, var2 + 1, 32);
            }

            if (var4 == 1) {
                this.method21(var1, var2, 10);
                this.method21(var1, var2 + 1, 32);
                this.method21(var1 + 1, var2, 128);
            }

            if (var4 == 2) {
                this.method21(var1, var2, 40);
                this.method21(var1 + 1, var2, 128);
                this.method21(var1, var2 - 1, 2);
            }

            if (var4 == 3) {
                this.method21(var1, var2, 160);
                this.method21(var1, var2 - 1, 2);
                this.method21(var1 - 1, var2, 8);
            }
        }

        if (var5) {
            if (var3 == 0) {
                if (var4 == 0) {
                    this.method21(var1, var2, 65536);
                    this.method21(var1 - 1, var2, 4096);
                }

                if (var4 == 1) {
                    this.method21(var1, var2, 1024);
                    this.method21(var1, var2 + 1, 16384);
                }

                if (var4 == 2) {
                    this.method21(var1, var2, 4096);
                    this.method21(var1 + 1, var2, 65536);
                }

                if (var4 == 3) {
                    this.method21(var1, var2, 16384);
                    this.method21(var1, var2 - 1, 1024);
                }
            }

            if (var3 == 1 || var3 == 3) {
                if (var4 == 0) {
                    this.method21(var1, var2, 512);
                    this.method21(var1 - 1, var2 + 1, 8192);
                }

                if (var4 == 1) {
                    this.method21(var1, var2, 2048);
                    this.method21(var1 + 1, var2 + 1, 32768);
                }

                if (var4 == 2) {
                    this.method21(var1, var2, 8192);
                    this.method21(var1 + 1, var2 - 1, 512);
                }

                if (var4 == 3) {
                    this.method21(var1, var2, 32768);
                    this.method21(var1 - 1, var2 - 1, 2048);
                }
            }

            if (var3 == 2) {
                if (var4 == 0) {
                    this.method21(var1, var2, 66560);
                    this.method21(var1 - 1, var2, 4096);
                    this.method21(var1, var2 + 1, 16384);
                }

                if (var4 == 1) {
                    this.method21(var1, var2, 5120);
                    this.method21(var1, var2 + 1, 16384);
                    this.method21(var1 + 1, var2, 65536);
                }

                if (var4 == 2) {
                    this.method21(var1, var2, 20480);
                    this.method21(var1 + 1, var2, 65536);
                    this.method21(var1, var2 - 1, 1024);
                }

                if (var4 == 3) {
                    this.method21(var1, var2, 81920);
                    this.method21(var1, var2 - 1, 1024);
                    this.method21(var1 - 1, var2, 4096);
                }
            }
        }

    }

    public void method23(int var1, int var2, int var3, int var4, boolean var5) {
        int var7 = 256;
        if (var5) {
            var7 = 131328;
        }

        var1 -= this.field50;
        var2 -= this.field51;

        for (int var8 = var1; var8 < var1 + var3; ++var8) {
            if (var8 >= 0 && var8 < this.field52) {
                for (int var9 = var2; var9 < var2 + var4; ++var9) {
                    if (var9 >= 0 && var9 < this.field49) {
                        this.method21(var8, var9, var7);
                    }
                }
            }
        }

    }

    public void method24(int var1, int var2) {
        var1 -= this.field50;
        var2 -= this.field51;
        int[] var10000 = this.field53[var1];
        var10000[var2] |= 2097152;
    }

    public void method25(int var1, int var2) {
        var1 -= this.field50;
        var2 -= this.field51;
        int[] var10000 = this.field53[var1];
        var10000[var2] |= 262144;
    }

    void method21(int var1, int var2, int var3) {
        int[] var10000 = this.field53[var1];
        var10000[var2] |= var3;
    }

    public void method26(int var1, int var2, int var3, int var4, boolean var5) {
        var1 -= this.field50;
        var2 -= this.field51;
        if (var3 == 0) {
            if (var4 == 0) {
                this.method27(var1, var2, 128);
                this.method27(var1 - 1, var2, 8);
            }

            if (var4 == 1) {
                this.method27(var1, var2, 2);
                this.method27(var1, var2 + 1, 32);
            }

            if (var4 == 2) {
                this.method27(var1, var2, 8);
                this.method27(var1 + 1, var2, 128);
            }

            if (var4 == 3) {
                this.method27(var1, var2, 32);
                this.method27(var1, var2 - 1, 2);
            }
        }

        if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
                this.method27(var1, var2, 1);
                this.method27(var1 - 1, var2 + 1, 16);
            }

            if (var4 == 1) {
                this.method27(var1, var2, 4);
                this.method27(var1 + 1, var2 + 1, 64);
            }

            if (var4 == 2) {
                this.method27(var1, var2, 16);
                this.method27(var1 + 1, var2 - 1, 1);
            }

            if (var4 == 3) {
                this.method27(var1, var2, 64);
                this.method27(var1 - 1, var2 - 1, 4);
            }
        }

        if (var3 == 2) {
            if (var4 == 0) {
                this.method27(var1, var2, 130);
                this.method27(var1 - 1, var2, 8);
                this.method27(var1, var2 + 1, 32);
            }

            if (var4 == 1) {
                this.method27(var1, var2, 10);
                this.method27(var1, var2 + 1, 32);
                this.method27(var1 + 1, var2, 128);
            }

            if (var4 == 2) {
                this.method27(var1, var2, 40);
                this.method27(var1 + 1, var2, 128);
                this.method27(var1, var2 - 1, 2);
            }

            if (var4 == 3) {
                this.method27(var1, var2, 160);
                this.method27(var1, var2 - 1, 2);
                this.method27(var1 - 1, var2, 8);
            }
        }

        if (var5) {
            if (var3 == 0) {
                if (var4 == 0) {
                    this.method27(var1, var2, 65536);
                    this.method27(var1 - 1, var2, 4096);
                }

                if (var4 == 1) {
                    this.method27(var1, var2, 1024);
                    this.method27(var1, var2 + 1, 16384);
                }

                if (var4 == 2) {
                    this.method27(var1, var2, 4096);
                    this.method27(var1 + 1, var2, 65536);
                }

                if (var4 == 3) {
                    this.method27(var1, var2, 16384);
                    this.method27(var1, var2 - 1, 1024);
                }
            }

            if (var3 == 1 || var3 == 3) {
                if (var4 == 0) {
                    this.method27(var1, var2, 512);
                    this.method27(var1 - 1, var2 + 1, 8192);
                }

                if (var4 == 1) {
                    this.method27(var1, var2, 2048);
                    this.method27(var1 + 1, var2 + 1, 32768);
                }

                if (var4 == 2) {
                    this.method27(var1, var2, 8192);
                    this.method27(var1 + 1, var2 - 1, 512);
                }

                if (var4 == 3) {
                    this.method27(var1, var2, 32768);
                    this.method27(var1 - 1, var2 - 1, 2048);
                }
            }

            if (var3 == 2) {
                if (var4 == 0) {
                    this.method27(var1, var2, 66560);
                    this.method27(var1 - 1, var2, 4096);
                    this.method27(var1, var2 + 1, 16384);
                }

                if (var4 == 1) {
                    this.method27(var1, var2, 5120);
                    this.method27(var1, var2 + 1, 16384);
                    this.method27(var1 + 1, var2, 65536);
                }

                if (var4 == 2) {
                    this.method27(var1, var2, 20480);
                    this.method27(var1 + 1, var2, 65536);
                    this.method27(var1, var2 - 1, 1024);
                }

                if (var4 == 3) {
                    this.method27(var1, var2, 81920);
                    this.method27(var1, var2 - 1, 1024);
                    this.method27(var1 - 1, var2, 4096);
                }
            }
        }

    }

    public void method30(int var1, int var2, int var3, int var4, int var5, boolean var6) {
        int var8 = 256;
        if (var6) {
            var8 = 131328;
        }

        var1 -= this.field50;
        var2 -= this.field51;
        int var9;
        if (var5 == 1 || var5 == 3) {
            var9 = var3;
            var3 = var4;
            var4 = var9;
        }

        for (var9 = var1; var9 < var1 + var3; ++var9) {
            if (var9 >= 0 && var9 < this.field52) {
                for (int var10 = var2; var10 < var2 + var4; ++var10) {
                    if (var10 >= 0 && var10 < this.field49) {
                        this.method27(var9, var10, var8);
                    }
                }
            }
        }

    }

    void method27(int var1, int var2, int var3) {
        int[] var10000 = this.field53[var1];
        var10000[var2] &= ~var3;
    }

    public void method28(int var1, int var2) {
        var1 -= this.field50;
        var2 -= this.field51;
        int[] var10000 = this.field53[var1];
        var10000[var2] &= -262145;
    }
}
