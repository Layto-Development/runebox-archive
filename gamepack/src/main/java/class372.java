import java.util.zip.CRC32;

public class class372 extends class68 {
    static CRC32 field2654;

    static {
        field2654 = new CRC32();
    }

    boolean field2647;
    boolean field2651;
    class239 field2649;
    class239 field2657;
    class453 field2658;
    int field2648;
    int field2650;
    int field2655;
    int field2656;
    volatile boolean[] field2652;
    volatile int field2653;

    public class372(class239 var1, class239 var2, class453 var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8) {
        super(var5, var6);
        this.field2653 = 0;
        this.field2651 = false;
        this.field2656 = -1;
        this.field2647 = false;
        this.field2649 = var1;
        this.field2657 = var2;
        this.field2650 = var4;
        this.field2651 = var7;
        this.field2647 = var8;
        this.field2658 = var3;
        this.field2658.method2085(this, this.field2650);
    }

    public boolean method1756() {
        return this.field2653 == 1;
    }

    public int method1750() {
        if (this.field2653 == 1 || this.field2647 && this.field2653 == 2) {
            return 100;
        } else if (super.field645 != null) {
            return 99;
        } else {
            int var2 = this.field2658.method2092(255, this.field2650);
            if (var2 >= 100) {
                var2 = 99;
            }

            return var2;
        }
    }

    @Override
    void method206(int var1) {
        this.field2658.method2090(this.field2650, var1);
    }

    @Override
    void method198(int var1) {
        if (null != this.field2649 && null != this.field2652 && this.field2652[var1]) {
            class239 var3 = this.field2649;
            byte[] var5 = null;
            synchronized (class531.field4228) {
                for (class489 var7 = (class489) class531.field4228.method122(); null != var7; var7 = (class489) class531.field4228.method124()) {
                    if ((long) var1 == var7.field658 && var7.field3599 == var3 && var7.field3598 == 0) {
                        var5 = var7.field3597;
                        break;
                    }
                }
            }

            if (var5 != null) {
                this.method1759(var3, var1, var5, true);
            } else {
                byte[] var6 = var3.method1069(var1);
                this.method1759(var3, var1, var6, true);
            }
        } else {
            this.field2658.method2087(this, this.field2650, var1, super.field640[var1], (byte) 2, true);
        }

    }

    void method1755() {
        this.field2653 = 2;
        super.field651 = new int[0];
        super.field640 = new int[0];
        super.field641 = new int[0];
        super.field642 = new int[0];
        super.field638 = new int[0][];
        super.field645 = new Object[0];
        super.field647 = new Object[0][];
    }

    void method1751(int var1, int var2, byte var3) {
        this.field2648 = var1;
        this.field2655 = var2;
        if (this.field2657 != null) {
            int var4 = this.field2650;
            class239 var5 = this.field2657;
            byte[] var7 = null;
            synchronized (class531.field4228) {
                for (class489 var9 = (class489) class531.field4228.method122(); null != var9; var9 = (class489) class531.field4228.method124()) {
                    if (var9.field658 == (long) var4 && var5 == var9.field3599 && var9.field3598 == 0) {
                        var7 = var9.field3597;
                        break;
                    }
                }
            }

            if (null != var7) {
                this.method1759(var5, var4, var7, true);
            } else {
                byte[] var8 = var5.method1069(var4);
                this.method1759(var5, var4, var8, true);
            }
        } else {
            this.field2658.method2087(this, 255, this.field2650, this.field2648, (byte) 0, true);
        }

    }

    void method1752(int var1, byte[] var2, boolean var3, boolean var4) {
        if (var3) {
            if (this.field2653 == 1) {
                throw new RuntimeException();
            }

            if (null != this.field2657) {
                int var6 = this.field2650;
                class239 var7 = this.field2657;
                class489 var8 = new class489();
                var8.field3598 = 0;
                var8.field658 = var6;
                var8.field3597 = var2;
                var8.field3599 = var7;
                synchronized (class531.field4228) {
                    class531.field4228.method126(var8);
                }

                class531.method2522();
            }

            this.method211(var2);
            this.method1757();
        } else {
            var2[var2.length - 2] = (byte) (super.field641[var1] >> 8);
            var2[var2.length - 1] = (byte) super.field641[var1];
            if (null != this.field2649) {
                class239 var14 = this.field2649;
                class489 var16 = new class489();
                var16.field3598 = 0;
                var16.field658 = var1;
                var16.field3597 = var2;
                var16.field3599 = var14;
                synchronized (class531.field4228) {
                    class531.field4228.method126(var16);
                }

                class531.method2522();
                this.field2652[var1] = true;
            }

            if (var4) {
                Object[] var15 = super.field645;
                Object var17;
                if (var2 == null) {
                    var17 = null;
                } else if (var2.length > 136) {
                    class181 var9 = new class181();
                    var9.method2009(var2);
                    var17 = var9;
                } else {
                    var17 = var2;
                }

                var15[var1] = var17;
            }
        }

    }

    public void method1759(class239 var1, int var2, byte[] var3, boolean var4) {
        int var6;
        if (var1 == this.field2657) {
            if (this.field2653 == 1) {
                throw new RuntimeException();
            } else if (null == var3) {
                this.field2658.method2087(this, 255, this.field2650, this.field2648, (byte) 0, true);
            } else {
                field2654.reset();
                field2654.update(var3, 0, var3.length);
                var6 = (int) field2654.getValue();
                if (var6 != this.field2648) {
                    this.field2658.method2087(this, 255, this.field2650, this.field2648, (byte) 0, true);
                } else {
                    class78 var12 = new class78(class68.method216(var3));
                    int var13 = var12.method260();
                    if (var13 != 5 && var13 != 6) {
                        throw new RuntimeException(var13 + "," + this.field2650 + "," + var2);
                    } else {
                        int var9 = 0;
                        if (var13 >= 6) {
                            var9 = var12.method264();
                        }

                        if (this.field2655 != var9) {
                            this.field2658.method2087(this, 255, this.field2650, this.field2648, (byte) 0, true);
                        } else {
                            this.method211(var3);
                            this.method1757();
                        }
                    }
                }
            }
        } else {
            if (!var4 && this.field2656 == var2) {
                this.field2653 = 1;
            }

            if (null != var3 && var3.length > 2) {
                field2654.reset();
                field2654.update(var3, 0, var3.length - 2);
                var6 = (int) field2654.getValue();
                int var7 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
                if (var6 == super.field640[var2] && super.field641[var2] == var7) {
                    this.field2652[var2] = true;
                    if (var4) {
                        Object[] var8 = super.field645;
                        Object var10;
                        if (var3 == null) {
                            var10 = null;
                        } else if (var3.length > 136) {
                            class181 var11 = new class181();
                            var11.method2009(var3);
                            var10 = var11;
                        } else {
                            var10 = var3;
                        }

                        var8[var2] = var10;
                    }

                } else {
                    this.field2652[var2] = false;
                    if (this.field2651 || var4) {
                        this.field2658.method2087(this, this.field2650, var2, super.field640[var2], (byte) 2, var4);
                    }

                }
            } else {
                this.field2652[var2] = false;
                if (this.field2651 || var4) {
                    this.field2658.method2087(this, this.field2650, var2, super.field640[var2], (byte) 2, var4);
                }

            }
        }
    }

    void method1757() {
        this.field2652 = new boolean[super.field645.length];

        int var2;
        for (var2 = 0; var2 < this.field2652.length; ++var2) {
            this.field2652[var2] = false;
        }

        if (null == this.field2649) {
            this.field2653 = 1;
        } else {
            this.field2656 = -1;

            for (var2 = 0; var2 < this.field2652.length; ++var2) {
                if (super.field642[var2] > 0) {
                    class531.method2524(var2, this.field2649, this);
                    this.field2656 = var2;
                }
            }

            if (this.field2656 == -1) {
                this.field2653 = 1;
            }

        }
    }

    @Override
    int method194(int var1) {
        if (null != super.field645[var1]) {
            return 100;
        } else {
            return this.field2652[var1] ? 100 : this.field2658.method2092(this.field2650, var1);
        }
    }

    public boolean method1753(int var1) {
        return this.field2652[var1];
    }

    public boolean method1754(int var1) {
        return this.method199(var1) != null;
    }

    public int method1758() {
        int var2 = 0;
        int var3 = 0;

        int var4;
        for (var4 = 0; var4 < super.field645.length; ++var4) {
            if (super.field642[var4] > 0) {
                var2 += 100;
                var3 += this.method194(var4);
            }
        }

        if (var2 == 0) {
            return 100;
        } else {
            var4 = var3 * 100 / var2;
            return var4;
        }
    }
}
