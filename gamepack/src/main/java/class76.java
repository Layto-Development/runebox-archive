public class class76 {
    byte[][][] field694;
    int field693;

    class76(int var1) {
        this.field693 = var1;
    }

    void method244(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        if (var7 != 0 && this.field693 != 0 && null != this.field694) {
            var8 = this.method238(var8, var7);
            var7 = this.method233(var7);
            class415.method1931(var1, var2, var5, var6, var3, var4, this.field694[var7 - 1][var8], this.field693, true);
        }
    }

    int method238(int var1, int var2) {
        if (var2 == 9) {
            var1 = var1 + 1 & 3;
        }

        if (var2 == 10) {
            var1 = var1 + 3 & 3;
        }

        if (var2 == 11) {
            var1 = var1 + 3 & 3;
        }

        return var1;
    }

    int method233(int var1) {
        if (var1 != 9 && var1 != 10) {
            return var1 == 11 ? 8 : var1;
        } else {
            return 1;
        }
    }

    void method241() {
        if (this.field694 == null) {
            this.field694 = new byte[8][4][];
            this.method234();
            this.method240();
            this.method235();
            this.method242();
            this.method237();
            this.method243();
            this.method239();
            this.method236((byte) -68);
        }
    }

    void method234() {
        byte[] var2 = new byte[this.field693 * this.field693];
        int var3 = 0;

        int var4;
        int var5;
        for (var4 = 0; var4 < this.field693; ++var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var5 <= var4) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field694[0][0] = var2;
        var2 = new byte[this.field693 * this.field693];
        var3 = 0;

        for (var4 = this.field693 - 1; var4 >= 0; --var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var5 <= var4) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field694[0][1] = var2;
        var2 = new byte[this.field693 * this.field693];
        var3 = 0;

        for (var4 = 0; var4 < this.field693; ++var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var5 >= var4) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field694[0][2] = var2;
        var2 = new byte[this.field693 * this.field693];
        var3 = 0;

        for (var4 = this.field693 - 1; var4 >= 0; --var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var5 >= var4) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field694[0][3] = var2;
    }

    void method240() {
        byte[] var2 = new byte[this.field693 * this.field693];
        int var3 = 0;

        int var4;
        int var5;
        for (var4 = this.field693 - 1; var4 >= 0; --var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var5 <= var4 >> 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field694[1][0] = var2;
        var2 = new byte[this.field693 * this.field693];
        var3 = 0;

        for (var4 = 0; var4 < this.field693; ++var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var3 >= 0 && var3 < var2.length) {
                    if (var5 >= var4 << 1) {
                        var2[var3] = -1;
                    }

                    ++var3;
                } else {
                    ++var3;
                }
            }
        }

        this.field694[1][1] = var2;
        var2 = new byte[this.field693 * this.field693];
        var3 = 0;

        for (var4 = 0; var4 < this.field693; ++var4) {
            for (var5 = this.field693 - 1; var5 >= 0; --var5) {
                if (var5 <= var4 >> 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field694[1][2] = var2;
        var2 = new byte[this.field693 * this.field693];
        var3 = 0;

        for (var4 = this.field693 - 1; var4 >= 0; --var4) {
            for (var5 = this.field693 - 1; var5 >= 0; --var5) {
                if (var5 >= var4 << 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field694[1][3] = var2;
    }

    void method235() {
        byte[] var2 = new byte[this.field693 * this.field693];
        int var3 = 0;

        int var4;
        int var5;
        for (var4 = this.field693 - 1; var4 >= 0; --var4) {
            for (var5 = this.field693 - 1; var5 >= 0; --var5) {
                if (var5 <= var4 >> 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field694[2][0] = var2;
        var2 = new byte[this.field693 * this.field693];
        var3 = 0;

        for (var4 = this.field693 - 1; var4 >= 0; --var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var5 >= var4 << 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field694[2][1] = var2;
        var2 = new byte[this.field693 * this.field693];
        var3 = 0;

        for (var4 = 0; var4 < this.field693; ++var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var5 <= var4 >> 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field694[2][2] = var2;
        var2 = new byte[this.field693 * this.field693];
        var3 = 0;

        for (var4 = 0; var4 < this.field693; ++var4) {
            for (var5 = this.field693 - 1; var5 >= 0; --var5) {
                if (var5 >= var4 << 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field694[2][3] = var2;
    }

    void method242() {
        byte[] var2 = new byte[this.field693 * this.field693];
        int var3 = 0;

        int var4;
        int var5;
        for (var4 = this.field693 - 1; var4 >= 0; --var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var5 >= var4 >> 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field694[3][0] = var2;
        var2 = new byte[this.field693 * this.field693];
        var3 = 0;

        for (var4 = 0; var4 < this.field693; ++var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var5 <= var4 << 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field694[3][1] = var2;
        var2 = new byte[this.field693 * this.field693];
        var3 = 0;

        for (var4 = 0; var4 < this.field693; ++var4) {
            for (var5 = this.field693 - 1; var5 >= 0; --var5) {
                if (var5 >= var4 >> 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field694[3][2] = var2;
        var2 = new byte[this.field693 * this.field693];
        var3 = 0;

        for (var4 = this.field693 - 1; var4 >= 0; --var4) {
            for (var5 = this.field693 - 1; var5 >= 0; --var5) {
                if (var5 <= var4 << 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field694[3][3] = var2;
    }

    void method237() {
        byte[] var2 = new byte[this.field693 * this.field693];
        int var3 = 0;

        int var4;
        int var5;
        for (var4 = this.field693 - 1; var4 >= 0; --var4) {
            for (var5 = this.field693 - 1; var5 >= 0; --var5) {
                if (var5 >= var4 >> 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field694[4][0] = var2;
        var2 = new byte[this.field693 * this.field693];
        var3 = 0;

        for (var4 = this.field693 - 1; var4 >= 0; --var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var5 <= var4 << 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field694[4][1] = var2;
        var2 = new byte[this.field693 * this.field693];
        var3 = 0;

        for (var4 = 0; var4 < this.field693; ++var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var5 >= var4 >> 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field694[4][2] = var2;
        var2 = new byte[this.field693 * this.field693];
        var3 = 0;

        for (var4 = 0; var4 < this.field693; ++var4) {
            for (var5 = this.field693 - 1; var5 >= 0; --var5) {
                if (var5 <= var4 << 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field694[4][3] = var2;
    }

    void method243() {
        byte[] var2 = new byte[this.field693 * this.field693];
        boolean var3 = false;
        var2 = new byte[this.field693 * this.field693];
        int var6 = 0;

        int var4;
        int var5;
        for (var4 = 0; var4 < this.field693; ++var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var5 <= this.field693 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field694[5][0] = var2;
        var2 = new byte[this.field693 * this.field693];
        var6 = 0;

        for (var4 = 0; var4 < this.field693; ++var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var4 <= this.field693 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field694[5][1] = var2;
        var2 = new byte[this.field693 * this.field693];
        var6 = 0;

        for (var4 = 0; var4 < this.field693; ++var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var5 >= this.field693 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field694[5][2] = var2;
        var2 = new byte[this.field693 * this.field693];
        var6 = 0;

        for (var4 = 0; var4 < this.field693; ++var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var4 >= this.field693 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field694[5][3] = var2;
    }

    void method239() {
        byte[] var2 = new byte[this.field693 * this.field693];
        boolean var3 = false;
        var2 = new byte[this.field693 * this.field693];
        int var6 = 0;

        int var4;
        int var5;
        for (var4 = 0; var4 < this.field693; ++var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var5 <= var4 - this.field693 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field694[6][0] = var2;
        var2 = new byte[this.field693 * this.field693];
        var6 = 0;

        for (var4 = this.field693 - 1; var4 >= 0; --var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var5 <= var4 - this.field693 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field694[6][1] = var2;
        var2 = new byte[this.field693 * this.field693];
        var6 = 0;

        for (var4 = this.field693 - 1; var4 >= 0; --var4) {
            for (var5 = this.field693 - 1; var5 >= 0; --var5) {
                if (var5 <= var4 - this.field693 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field694[6][2] = var2;
        var2 = new byte[this.field693 * this.field693];
        var6 = 0;

        for (var4 = 0; var4 < this.field693; ++var4) {
            for (var5 = this.field693 - 1; var5 >= 0; --var5) {
                if (var5 <= var4 - this.field693 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field694[6][3] = var2;
    }

    void method236(byte var1) {
        byte[] var2 = new byte[this.field693 * this.field693];
        boolean var3 = false;
        var2 = new byte[this.field693 * this.field693];
        int var6 = 0;

        int var4;
        int var5;
        for (var4 = 0; var4 < this.field693; ++var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var5 >= var4 - this.field693 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field694[7][0] = var2;
        var2 = new byte[this.field693 * this.field693];
        var6 = 0;

        for (var4 = this.field693 - 1; var4 >= 0; --var4) {
            for (var5 = 0; var5 < this.field693; ++var5) {
                if (var5 >= var4 - this.field693 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field694[7][1] = var2;
        var2 = new byte[this.field693 * this.field693];
        var6 = 0;

        for (var4 = this.field693 - 1; var4 >= 0; --var4) {
            for (var5 = this.field693 - 1; var5 >= 0; --var5) {
                if (var5 >= var4 - this.field693 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field694[7][2] = var2;
        var2 = new byte[this.field693 * this.field693];
        var6 = 0;

        for (var4 = 0; var4 < this.field693; ++var4) {
            for (var5 = this.field693 - 1; var5 >= 0; --var5) {
                if (var5 >= var4 - this.field693 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field694[7][3] = var2;
    }
}
