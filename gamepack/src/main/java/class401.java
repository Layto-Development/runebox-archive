public class class401 extends class510 {
    public static class68 field2835;
    public static class68 field2837;
    public static class68 field2852;
    static class289 field2838;
    static class289 field2848;
    static class289 field2856;

    static {
        field2856 = new class289(64);
        field2838 = new class289(64);
        field2848 = new class289(20);
    }

    public int field2836;
    public int field2839;
    public int field2841;
    public int field2842;
    public int field2847;
    public int field2849;
    public int field2851;
    public int[] field2853;
    int field2840;
    int field2843;
    int field2844;
    int field2845;
    int field2846;
    int field2854;
    int field2855;
    String field2850;

    class401() {
        this.field2840 = -1;
        this.field2839 = 16777215;
        this.field2849 = 70;
        this.field2843 = -1;
        this.field2844 = -1;
        this.field2845 = -1;
        this.field2846 = -1;
        this.field2847 = 0;
        this.field2841 = 0;
        this.field2836 = -1;
        this.field2850 = "";
        this.field2842 = -1;
        this.field2851 = 0;
        this.field2854 = -1;
        this.field2855 = -1;
    }

    public static class401 method1849(int var0) {
        class401 var2 = (class401) field2856.method1307(var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = field2852.method188(32, var0);
            var2 = new class401();
            if (var3 != null) {
                var2.method1841(new class78(var3));
            }

            field2856.method1306(var2, var0);
            return var2;
        }
    }

    public static void method1850() {
        field2856.method1304();
        field2838.method1304();
        field2848.method1304();
    }

    void method1841(class78 var1) {
        while (true) {
            int var3 = var1.method260();
            if (var3 == 0) {
                return;
            }

            this.method1847(var1, var3, (byte) -17);
        }
    }

    void method1847(class78 var1, int var2, byte var3) {
        if (var2 == 1) {
            this.field2840 = var1.method308();
        } else if (var2 == 2) {
            this.field2839 = var1.method316();
        } else if (var2 == 3) {
            this.field2843 = var1.method308();
        } else if (var2 == 4) {
            this.field2845 = var1.method308();
        } else if (var2 == 5) {
            this.field2844 = var1.method308();
        } else if (var2 == 6) {
            this.field2846 = var1.method308();
        } else if (var2 == 7) {
            this.field2847 = var1.method262();
        } else if (var2 == 8) {
            this.field2850 = var1.method310();
        } else if (var2 == 9) {
            this.field2849 = var1.method309();
        } else if (var2 == 10) {
            this.field2841 = var1.method262();
        } else if (var2 == 11) {
            this.field2836 = 0;
        } else if (var2 == 12) {
            this.field2842 = var1.method260();
        } else if (var2 == 13) {
            this.field2851 = var1.method262();
        } else if (var2 == 14) {
            this.field2836 = var1.method309();
        } else if (var2 == 17 || var2 == 18) {
            this.field2854 = var1.method309();
            if (this.field2854 == 65535) {
                this.field2854 = -1;
            }

            this.field2855 = var1.method309();
            if (this.field2855 == 65535) {
                this.field2855 = -1;
            }

            int var4 = -1;
            if (var2 == 18) {
                var4 = var1.method309();
                if (var4 == 65535) {
                    var4 = -1;
                }
            }

            int var5 = var1.method260();
            this.field2853 = new int[var5 + 2];

            for (int var6 = 0; var6 <= var5; ++var6) {
                this.field2853[var6] = var1.method309();
                if (this.field2853[var6] == 65535) {
                    this.field2853[var6] = -1;
                }
            }

            this.field2853[var5 + 1] = var4;
        }

    }

    public final class401 method1842() {
        int var2 = -1;
        if (this.field2854 != -1) {
            var2 = class10.method20(this.field2854);
        } else if (this.field2855 != -1) {
            var2 = class10.field46[this.field2855];
        }

        int var3;
        if (var2 >= 0 && var2 < this.field2853.length - 1) {
            var3 = this.field2853[var2];
        } else {
            var3 = this.field2853[this.field2853.length - 1];
        }

        return var3 != -1 ? method1849(var3) : null;
    }

    public String method1846(int var1) {
        String var3 = this.field2850;

        while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
                return var3;
            }

            var3 = var3.substring(0, var4) + class95.method364(var1, false) + var3.substring(var4 + 2);
        }
    }

    public class331 method1843() {
        if (this.field2843 < 0) {
            return null;
        } else {
            class331 var2 = (class331) field2838.method1307(this.field2843);
            if (null != var2) {
                return var2;
            } else {
                var2 = class122.method539(field2835, this.field2843, 0);
                if (var2 != null) {
                    field2838.method1306(var2, this.field2843);
                }

                return var2;
            }
        }
    }

    public class331 method1840() {
        if (this.field2844 < 0) {
            return null;
        } else {
            class331 var2 = (class331) field2838.method1307(this.field2844);
            if (var2 != null) {
                return var2;
            } else {
                var2 = class122.method539(field2835, this.field2844, 0);
                if (var2 != null) {
                    field2838.method1306(var2, this.field2844);
                }

                return var2;
            }
        }
    }

    public class331 method1844() {
        if (this.field2845 < 0) {
            return null;
        } else {
            class331 var2 = (class331) field2838.method1307(this.field2845);
            if (null != var2) {
                return var2;
            } else {
                var2 = class122.method539(field2835, this.field2845, 0);
                if (var2 != null) {
                    field2838.method1306(var2, this.field2845);
                }

                return var2;
            }
        }
    }

    public class331 method1845() {
        if (this.field2846 < 0) {
            return null;
        } else {
            class331 var2 = (class331) field2838.method1307(this.field2846);
            if (var2 != null) {
                return var2;
            } else {
                var2 = class122.method539(field2835, this.field2846, 0);
                if (null != var2) {
                    field2838.method1306(var2, this.field2846);
                }

                return var2;
            }
        }
    }

    public class413 method1848() {
        if (this.field2840 == -1) {
            return null;
        } else {
            class413 var2 = (class413) field2848.method1307(this.field2840);
            if (null != var2) {
                return var2;
            } else {
                var2 = class274.method1229(field2835, field2837, this.field2840, 0);
                if (var2 != null) {
                    field2848.method1306(var2, this.field2840);
                }

                return var2;
            }
        }
    }
}
