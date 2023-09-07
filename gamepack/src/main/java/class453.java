import java.io.IOException;
import java.util.zip.CRC32;

public class class453 {
    public int field3112;
    public int field3135;
    boolean field3124;
    byte field3115;
    class138 field3119;
    class178 field3117;
    class178 field3120;
    class178 field3122;
    class178 field3126;
    class372[] field3131;
    class73 field3121;
    class75 field3136;
    class78 field3113;
    class78 field3116;
    class78 field3127;
    int field3118;
    int field3123;
    int field3125;
    int field3128;
    int field3130;
    int field3132;
    int field3133;
    int field3134;
    CRC32 field3129;
    long field3114;

    public class453() {
        this.field3134 = 0;
        this.field3126 = new class178(4096);
        this.field3125 = 0;
        this.field3117 = new class178(32);
        this.field3118 = 0;
        this.field3119 = new class138();
        this.field3120 = new class178(4096);
        this.field3130 = 0;
        this.field3122 = new class178(4096);
        this.field3123 = 0;
        this.field3113 = new class78(8);
        this.field3128 = 0;
        this.field3129 = new CRC32();
        this.field3131 = new class372[256];
        this.field3132 = -1;
        this.field3133 = 255;
        this.field3115 = 0;
        this.field3112 = 0;
        this.field3135 = 0;
    }

    public boolean method2088() {
        long var2 = class206.method982();
        int var4 = (int) (var2 - this.field3114);
        this.field3114 = var2;
        if (var4 > 200) {
            var4 = 200;
        }

        this.field3134 += var4;
        if (this.field3123 == 0 && this.field3118 == 0 && this.field3130 == 0 && this.field3125 == 0) {
            return true;
        } else if (null == this.field3136) {
            return false;
        } else {
            try {
                if (this.field3134 > 30000) {
                    throw new IOException();
                } else {
                    class73 var5;
                    class78 var6;
                    while (this.field3118 < 200 && this.field3125 > 0) {
                        var5 = (class73) this.field3126.method858();
                        var6 = new class78(4);
                        var6.method249(1);
                        var6.method301((int) var5.field658);
                        this.field3136.method230(var6.field695, 0, 4);
                        this.field3117.method860(var5, var5.field658);
                        --this.field3125;
                        ++this.field3118;
                    }

                    while (this.field3123 < 200 && this.field3130 > 0) {
                        var5 = (class73) this.field3119.method640();
                        var6 = new class78(4);
                        var6.method249(0);
                        var6.method301((int) var5.field658);
                        this.field3136.method230(var6.field695, 0, 4);
                        var5.method2300();
                        this.field3122.method860(var5, var5.field658);
                        --this.field3130;
                        ++this.field3123;
                    }

                    for (int var20 = 0; var20 < 100; ++var20) {
                        int var21 = this.field3136.method229();
                        if (var21 < 0) {
                            throw new IOException();
                        }

                        if (var21 == 0) {
                            break;
                        }

                        this.field3134 = 0;
                        byte var7 = 0;
                        if (this.field3121 == null) {
                            var7 = 8;
                        } else if (this.field3128 == 0) {
                            var7 = 1;
                        }

                        int var8;
                        int var9;
                        int var10;
                        byte[] var10000;
                        int var10001;
                        class78 var23;
                        if (var7 > 0) {
                            var8 = var7 - this.field3113.field697;
                            if (var8 > var21) {
                                var8 = var21;
                            }

                            this.field3136.method228(this.field3113.field695, this.field3113.field697, var8);
                            if (this.field3115 != 0) {
                                for (var9 = 0; var9 < var8; ++var9) {
                                    var10000 = this.field3113.field695;
                                    var10001 = var9 + this.field3113.field697;
                                    var10000[var10001] ^= this.field3115;
                                }
                            }

                            var23 = this.field3113;
                            var23.field697 += var8;
                            if (this.field3113.field697 < var7) {
                                break;
                            }

                            if (null == this.field3121) {
                                this.field3113.field697 = 0;
                                var9 = this.field3113.method260();
                                var10 = this.field3113.method309();
                                int var11 = this.field3113.method260();
                                int var12 = this.field3113.method264();
                                long var13 = var10 + ((long) var9 << 16);
                                class73 var15 = (class73) this.field3117.method857(var13);
                                this.field3124 = true;
                                if (null == var15) {
                                    var15 = (class73) this.field3122.method857(var13);
                                    this.field3124 = false;
                                }

                                if (null == var15) {
                                    throw new IOException();
                                }

                                int var16 = var11 == 0 ? 5 : 9;
                                this.field3121 = var15;
                                this.field3127 = new class78(var12 + var16 + this.field3121.field680);
                                this.field3127.method249(var11);
                                this.field3127.method315(var12);
                                this.field3128 = 8;
                                this.field3113.field697 = 0;
                            } else if (this.field3128 == 0) {
                                if (this.field3113.field695[0] == -1) {
                                    this.field3128 = 1;
                                    this.field3113.field697 = 0;
                                } else {
                                    this.field3121 = null;
                                }
                            }
                        } else {
                            var8 = this.field3127.field695.length - this.field3121.field680;
                            var9 = 512 - this.field3128;
                            if (var9 > var8 - this.field3127.field697) {
                                var9 = var8 - this.field3127.field697;
                            }

                            if (var9 > var21) {
                                var9 = var21;
                            }

                            this.field3136.method228(this.field3127.field695, this.field3127.field697, var9);
                            if (this.field3115 != 0) {
                                for (var10 = 0; var10 < var9; ++var10) {
                                    var10000 = this.field3127.field695;
                                    var10001 = var10 + this.field3127.field697;
                                    var10000[var10001] ^= this.field3115;
                                }
                            }

                            var23 = this.field3127;
                            var23.field697 += var9;
                            this.field3128 += var9;
                            if (var8 == this.field3127.field697) {
                                if (16711935L == this.field3121.field658) {
                                    this.field3116 = this.field3127;

                                    for (var10 = 0; var10 < 256; ++var10) {
                                        class372 var22 = this.field3131[var10];
                                        if (var22 != null) {
                                            this.method2086(var22, var10);
                                        }
                                    }
                                } else {
                                    this.field3129.reset();
                                    this.field3129.update(this.field3127.field695, 0, var8);
                                    var10 = (int) this.field3129.getValue();
                                    if (this.field3121.field678 != var10) {
                                        try {
                                            this.field3136.method232();
                                        } catch (Exception var18) {
                                        }

                                        ++this.field3112;
                                        this.field3136 = null;
                                        this.field3115 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        return false;
                                    }

                                    this.field3112 = 0;
                                    this.field3135 = 0;
                                    this.field3121.field679.method1752((int) (this.field3121.field658 & 65535L), this.field3127.field695, 16711680L == (this.field3121.field658 & 16711680L), this.field3124);
                                }

                                this.field3121.method221();
                                if (this.field3124) {
                                    --this.field3118;
                                } else {
                                    --this.field3123;
                                }

                                this.field3128 = 0;
                                this.field3121 = null;
                                this.field3127 = null;
                            } else {
                                if (this.field3128 != 512) {
                                    break;
                                }

                                this.field3128 = 0;
                            }
                        }
                    }

                    return true;
                }
            } catch (IOException var19) {
                try {
                    this.field3136.method232();
                } catch (Exception var17) {
                }

                ++this.field3135;
                this.field3136 = null;
                return false;
            }
        }
    }

    public void method2084(boolean var1) {
        if (null != this.field3136) {
            try {
                class78 var3 = new class78(4);
                var3.method249(var1 ? 2 : 3);
                var3.method301(0);
                this.field3136.method230(var3.field695, 0, 4);
            } catch (IOException var6) {
                try {
                    this.field3136.method232();
                } catch (Exception var5) {
                }

                ++this.field3135;
                this.field3136 = null;
            }

        }
    }

    public void method2083(class75 var1, boolean var2) {
        if (null != this.field3136) {
            try {
                this.field3136.method232();
            } catch (Exception var8) {
            }

            this.field3136 = null;
        }

        this.field3136 = var1;
        this.method2084(var2);
        this.field3113.field697 = 0;
        this.field3121 = null;
        this.field3127 = null;
        this.field3128 = 0;

        while (true) {
            class73 var4 = (class73) this.field3117.method858();
            if (null == var4) {
                while (true) {
                    var4 = (class73) this.field3122.method858();
                    if (var4 == null) {
                        if (this.field3115 != 0) {
                            try {
                                class78 var9 = new class78(4);
                                var9.method249(4);
                                var9.method249(this.field3115);
                                var9.method290(0);
                                this.field3136.method230(var9.field695, 0, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field3136.method232();
                                } catch (Exception var6) {
                                }

                                ++this.field3135;
                                this.field3136 = null;
                            }
                        }

                        this.field3134 = 0;
                        this.field3114 = class206.method982();
                        return;
                    }

                    this.field3119.method639(var4);
                    this.field3120.method860(var4, var4.field658);
                    ++this.field3130;
                    --this.field3123;
                }
            }

            this.field3126.method860(var4, var4.field658);
            ++this.field3125;
            --this.field3118;
        }
    }

    void method2085(class372 var1, int var2) {
        if (var1.field2647) {
            if (var2 <= this.field3132) {
                throw new RuntimeException("");
            }

            if (var2 < this.field3133) {
                this.field3133 = var2;
            }
        } else {
            if (var2 >= this.field3133) {
                throw new RuntimeException("");
            }

            if (var2 > this.field3132) {
                this.field3132 = var2;
            }
        }

        if (null != this.field3116) {
            this.method2086(var1, var2);
        } else {
            this.method2087(null, 255, 255, 0, (byte) 0, true);
            this.field3131[var2] = var1;
        }
    }

    void method2086(class372 var1, int var2) {
        this.field3116.field697 = 5 + var2 * 8;
        if (this.field3116.field697 >= this.field3116.field695.length) {
            if (var1.field2647) {
                var1.method1755();
            } else {
                throw new RuntimeException("");
            }
        } else {
            int var4 = this.field3116.method264();
            int var5 = this.field3116.method264();
            var1.method1751(var4, var5, (byte) 18);
        }
    }

    void method2087(class372 var1, int var2, int var3, int var4, byte var5, boolean var6) {
        long var8 = ((long) var2 << 16) + var3;
        class73 var10 = (class73) this.field3126.method857(var8);
        if (var10 == null) {
            var10 = (class73) this.field3117.method857(var8);
            if (null == var10) {
                var10 = (class73) this.field3120.method857(var8);
                if (var10 != null) {
                    if (var6) {
                        var10.method2300();
                        this.field3126.method860(var10, var8);
                        --this.field3130;
                        ++this.field3125;
                    }

                } else {
                    if (!var6) {
                        var10 = (class73) this.field3122.method857(var8);
                        if (null != var10) {
                            return;
                        }
                    }

                    var10 = new class73();
                    var10.field679 = var1;
                    var10.field678 = var4;
                    var10.field680 = var5;
                    if (var6) {
                        this.field3126.method860(var10, var8);
                        ++this.field3125;
                    } else {
                        this.field3119.method641(var10);
                        this.field3120.method860(var10, var8);
                        ++this.field3130;
                    }

                }
            }
        }
    }

    void method2090(int var1, int var2) {
        long var4 = var2 + ((long) var1 << 16);
        class73 var6 = (class73) this.field3120.method857(var4);
        if (var6 != null) {
            this.field3119.method639(var6);
        }
    }

    int method2092(int var1, int var2) {
        long var4 = var2 + ((long) var1 << 16);
        return this.field3121 != null && var4 == this.field3121.field658 ? 1 + this.field3127.field697 * 99 / (this.field3127.field695.length - this.field3121.field680) : 0;
    }

    public int method2091(boolean var1, boolean var2) {
        boolean var4 = false;
        int var5 = this.field3118 + this.field3125;
        return var5;
    }

    public void method2089() {
        if (this.field3136 != null) {
            this.field3136.method232();
        }

    }
}
