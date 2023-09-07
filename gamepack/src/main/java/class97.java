import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class class97 extends class70 {
    public static boolean field790;
    static class289 field780;
    static class289 field786;
    static class289 field787;
    static class289 field897;
    static class342 field788;
    static class342 field900;

    static {
        field897 = new class289(200);
        field786 = new class289(50);
        field787 = new class289(20);
        field780 = new class289(8);
        field788 = new class342(10, class121.field1094);
        field900 = new class342(10, class121.field1094);
        field790 = false;
    }

    public boolean field781;
    public boolean field809;
    public boolean field811;
    public boolean field823;
    public boolean field828;
    public boolean field831;
    public boolean field832;
    public boolean field849;
    public boolean field853;
    public boolean field863;
    public boolean field864;
    public boolean field871;
    public boolean field872;
    public boolean field874;
    public boolean field925;
    public boolean field933;
    public boolean field934;
    public boolean field935;
    public byte[][] field840;
    public byte[][] field936;
    public class52 field847;
    public class93 field819;
    public class97 field890;
    public class97[] field923;
    public int field783;
    public int field791;
    public int field792;
    public int field793;
    public int field794;
    public int field796;
    public int field797;
    public int field798;
    public int field799;
    public int field800;
    public int field801;
    public int field802;
    public int field803;
    public int field804;
    public int field805;
    public int field806;
    public int field807;
    public int field808;
    public int field810;
    public int field812;
    public int field813;
    public int field814;
    public int field815;
    public int field817;
    public int field818;
    public int field821;
    public int field822;
    public int field824;
    public int field825;
    public int field827;
    public int field829;
    public int field830;
    public int field833;
    public int field834;
    public int field837;
    public int field839;
    public int field841;
    public int field844;
    public int field845;
    public int field846;
    public int field850;
    public int field854;
    public int field859;
    public int field860;
    public int field861;
    public int field862;
    public int field877;
    public int field878;
    public int field882;
    public int field887;
    public int field896;
    public int field906;
    public int field907;
    public int field910;
    public int field911;
    public int field912;
    public int field913;
    public int field915;
    public int field919;
    public int field920;
    public int field921;
    public int field922;
    public int field927;
    public int field928;
    public int field929;
    public int field930;
    public int field931;
    public int[] field820;
    public int[] field866;
    public int[] field867;
    public int[] field888;
    public int[] field892;
    public int[] field914;
    public int[] field917;
    public int[] field918;
    public int[] field926;
    public int[] field932;
    public int[][] field855;
    public Object[] field782;
    public Object[] field784;
    public Object[] field785;
    public Object[] field789;
    public Object[] field816;
    public Object[] field838;
    public Object[] field843;
    public Object[] field848;
    public Object[] field852;
    public Object[] field856;
    public Object[] field858;
    public Object[] field865;
    public Object[] field870;
    public Object[] field875;
    public Object[] field876;
    public Object[] field879;
    public Object[] field880;
    public Object[] field881;
    public Object[] field883;
    public Object[] field884;
    public Object[] field885;
    public Object[] field886;
    public Object[] field889;
    public Object[] field891;
    public Object[] field894;
    public Object[] field895;
    public Object[] field898;
    public Object[] field902;
    public Object[] field903;
    public Object[] field904;
    public Object[] field905;
    public Object[] field908;
    public Object[] field909;
    public Object[] field924;
    public String field779;
    public String field795;
    public String field826;
    public String field842;
    public String field851;
    public String field873;
    public String field899;
    public String[] field869;
    class265 field868;
    class456 field857;
    int field835;
    int field836;
    int field901;
    HashMap<String, Integer> field893;
    HashMap<Integer, Integer> field916;

    public class97() {
        this.field871 = false;
        this.field791 = -1;
        this.field910 = -1;
        this.field794 = 0;
        this.field817 = 0;
        this.field796 = 0;
        this.field797 = 0;
        this.field798 = 0;
        this.field799 = 0;
        this.field800 = 0;
        this.field801 = 0;
        this.field802 = 0;
        this.field803 = 0;
        this.field792 = 0;
        this.field805 = 0;
        this.field806 = 0;
        this.field783 = 0;
        this.field907 = 1;
        this.field807 = 1;
        this.field808 = -1;
        this.field809 = false;
        this.field810 = 0;
        this.field824 = 0;
        this.field878 = 0;
        this.field813 = 0;
        this.field814 = 0;
        this.field815 = 0;
        this.field818 = 0;
        this.field861 = 0;
        this.field853 = false;
        this.field819 = class93.field768;
        this.field812 = 0;
        this.field821 = 0;
        this.field822 = 1;
        this.field823 = false;
        this.field877 = -1;
        this.field825 = -1;
        this.field827 = 0;
        this.field828 = false;
        this.field829 = 0;
        this.field830 = 0;
        this.field833 = 1;
        this.field834 = -1;
        this.field835 = 1;
        this.field836 = -1;
        this.field837 = -1;
        this.field911 = -1;
        this.field839 = 0;
        this.field913 = 0;
        this.field841 = 0;
        this.field859 = 0;
        this.field906 = 0;
        this.field844 = 100;
        this.field845 = 0;
        this.field882 = 0;
        this.field864 = false;
        this.field849 = false;
        this.field850 = 2;
        this.field896 = -1;
        this.field851 = "";
        this.field779 = "";
        this.field887 = 0;
        this.field854 = 0;
        this.field912 = 0;
        this.field781 = false;
        this.field901 = -1;
        this.field862 = 0;
        this.field863 = false;
        this.field795 = "";
        this.field890 = null;
        this.field804 = 0;
        this.field846 = 0;
        this.field872 = false;
        this.field873 = "";
        this.field874 = false;
        this.field915 = -1;
        this.field899 = "";
        this.field842 = class32.field177;
        this.field919 = -1;
        this.field920 = 0;
        this.field921 = 0;
        this.field922 = 0;
        this.field811 = false;
        this.field925 = false;
        this.field860 = -1;
        this.field927 = 0;
        this.field928 = 0;
        this.field929 = 0;
        this.field930 = -1;
        this.field931 = -1;
        this.field933 = false;
        this.field934 = false;
        this.field935 = false;
    }

    public static class97 method424(int var0) {
        int var2 = var0 >> 16;
        int var3 = var0 & 65535;
        if (null == class46.field542[var2] || class46.field542[var2][var3] == null) {
            boolean var4 = method428(var2);
            if (!var4) {
                return null;
            }
        }

        return class46.field542[var2][var3];
    }

    public static class97 method421(int var0, int var1) {
        class97 var3 = method424(var0);
        if (var1 == -1) {
            return var3;
        } else {
            return var3 != null && var3.field923 != null && var1 < var3.field923.length ? var3.field923[var1] : null;
        }
    }

    public static boolean method428(int var0) {
        if (class19.field66[var0]) {
            return true;
        } else if (!class107.field1031.method192(var0)) {
            return false;
        } else {
            int var2 = class107.field1031.method214(var0);
            if (var2 == 0) {
                class19.field66[var0] = true;
                return true;
            } else {
                if (null == class46.field542[var0]) {
                    class46.field542[var0] = new class97[var2];
                }

                for (int var3 = 0; var3 < var2; ++var3) {
                    if (null == class46.field542[var0][var3]) {
                        byte[] var4 = class107.field1031.method188(var0, var3);
                        if (null != var4) {
                            class46.field542[var0][var3] = new class97();
                            class46.field542[var0][var3].field791 = var3 + (var0 << 16);
                            if (var4[0] == -1) {
                                class46.field542[var0][var3].method384(new class78(var4));
                            } else {
                                class46.field542[var0][var3].method383(new class78(var4));
                            }
                        }
                    }
                }

                class19.field66[var0] = true;
                return true;
            }
        }
    }

    public static void method426(int var0) {
        if (var0 != -1) {
            if (class19.field66[var0]) {
                class107.field1031.method202(var0);
                if (null != class46.field542[var0]) {
                    for (int var2 = 0; var2 < class46.field542[var0].length; ++var2) {
                        if (null != class46.field542[var0][var2]) {
                            class46.field542[var0][var2] = null;
                        }
                    }

                    class46.field542[var0] = null;
                    class19.field66[var0] = false;
                }
            }
        }
    }

    public static void method427() {
        field897.method1304();
        field786.method1304();
        field787.method1304();
        field780.method1304();
    }

    public static void method425(class97 var0, int var1, int var2) {
        class52 var4 = var0.field847;
        boolean var5 = var4.field578 != var2;
        var4.field578 = var2;
        if (var5) {
            int var6;
            int var7;
            if (var4.field578 == var1) {
                for (var6 = 0; var6 < class52.field585.length; ++var6) {
                    var7 = class52.field585[var6];
                    if (var4.field576[var7] > 0 && var4.field576[var7] < 512) {
                        var4.field576[var7] = var4.field589[var7];
                    }
                }
            } else {
                if (var4.field576[0] < 512 || method422(var4)) {
                    var4.field576[class322.field2340.field2336] = 1;
                }

                for (var6 = 0; var6 < 7; ++var6) {
                    var7 = class52.field585[var6];
                    if (var4.field576[var7] > 0 && var4.field576[var7] < 512) {
                        int[] var8 = var4.field576;

                        for (int var9 = 0; var9 < class363.field2595; ++var9) {
                            class363 var10 = class363.method1716(var9);
                            if (null != var10 && !var10.field2602 && var6 + (var2 == 1 ? 7 : 0) == var10.field2596) {
                                var8[class52.field585[var6]] = var9 + 256;
                                break;
                            }
                        }
                    }
                }
            }
        }

        var4.method153();
    }

    static boolean method422(class52 var0) {
        if (var0.field576[0] < 512) {
            return false;
        } else {
            class508 var2 = class508.method2299(var0.field576[0] - 512);
            return class322.field2340.field2336 != var2.field3718 && var2.field3734 != class322.field2340.field2336;
        }
    }

    public static void method423(class97 var0, int var1, int var2) {
        var0.field847.field577[var1] = var2;
        var0.field847.method153();
    }

    public static void method420(class97 var0, int var1) {
        class508 var3 = class508.method2299(var1);
        var0.field847.field576[var3.field3733] = var1 + 512;
        if (var3.field3718 != -1) {
            var0.field847.field576[var3.field3718] = 0;
        }

        if (var3.field3734 != -1) {
            var0.field847.field576[var3.field3734] = 0;
        }

        var0.field847.method153();
    }

    void method383(class78 var1) {
        this.field871 = false;
        this.field793 = var1.method260();
        this.field794 = var1.method260();
        this.field817 = var1.method309();
        this.field800 = var1.method262();
        this.field801 = var1.method262();
        this.field802 = var1.method309();
        this.field803 = var1.method309();
        this.field812 = var1.method260();
        this.field808 = var1.method309();
        if (this.field808 == 65535) {
            this.field808 = -1;
        } else {
            this.field808 += this.field791 & -65536;
        }

        this.field915 = var1.method309();
        if (this.field915 == 65535) {
            this.field915 = -1;
        }

        int var3 = var1.method260();
        int var4;
        if (var3 > 0) {
            this.field926 = new int[var3];
            this.field914 = new int[var3];

            for (var4 = 0; var4 < var3; ++var4) {
                this.field926[var4] = var1.method260();
                this.field914[var4] = var1.method309();
            }
        }

        var4 = var1.method260();
        int var5;
        if (var4 > 0) {
            this.field855 = new int[var4][];

            for (var5 = 0; var5 < var4; ++var5) {
                int var6 = var1.method309();
                this.field855[var5] = new int[var6];

                for (int var7 = 0; var7 < var6; ++var7) {
                    this.field855[var5][var7] = var1.method309();
                    if (this.field855[var5][var7] == 65535) {
                        this.field855[var5][var7] = -1;
                    }
                }
            }
        }

        if (this.field793 == 0) {
            this.field813 = var1.method309();
            this.field809 = var1.method260() == 1;
        }

        if (this.field793 == 1) {
            var1.method309();
            var1.method260();
        }

        if (this.field793 == 3) {
            this.field853 = var1.method260() == 1;
        }

        if (this.field793 == 4 || this.field793 == 1) {
            this.field854 = var1.method260();
            this.field912 = var1.method260();
            this.field887 = var1.method260();
            this.field896 = var1.method309();
            if (this.field896 == 65535) {
                this.field896 = -1;
            }

            this.field781 = var1.method260() == 1;
        }

        if (this.field793 == 4) {
            this.field851 = var1.method268();
            this.field779 = var1.method268();
        }

        if (this.field793 == 1 || this.field793 == 3 || this.field793 == 4) {
            this.field814 = var1.method264();
        }

        if (this.field793 == 3 || this.field793 == 4) {
            this.field815 = var1.method264();
            this.field818 = var1.method264();
            this.field861 = var1.method264();
        }

        if (this.field793 == 5) {
            this.field877 = var1.method264();
            this.field825 = var1.method264();
        }

        if (this.field793 == 6) {
            this.field833 = 1;
            this.field834 = var1.method309();
            if (this.field834 == 65535) {
                this.field834 = -1;
            }

            this.field835 = 1;
            this.field836 = var1.method309();
            if (this.field836 == 65535) {
                this.field836 = -1;
            }

            this.field837 = var1.method309();
            if (this.field837 == 65535) {
                this.field837 = -1;
            }

            this.field911 = var1.method309();
            if (this.field911 == 65535) {
                this.field911 = -1;
            }

            this.field844 = var1.method309();
            this.field841 = var1.method309();
            this.field859 = var1.method309();
        }

        if (this.field793 == 8) {
            this.field851 = var1.method268();
        }

        if (this.field794 == 2) {
            this.field873 = var1.method268();
            this.field899 = var1.method268();
            var5 = var1.method309() & 63;
            this.field862 |= var5 << 11;
        }

        if (this.field794 == 1 || this.field794 == 4 || this.field794 == 5 || this.field794 == 6) {
            this.field842 = var1.method268();
            if (this.field842.length() == 0) {
                if (this.field794 == 1) {
                    this.field842 = class32.field177;
                }

                if (this.field794 == 4) {
                    this.field842 = class32.field455;
                }

                if (this.field794 == 5) {
                    this.field842 = class32.field455;
                }

                if (this.field794 == 6) {
                    this.field842 = class32.field179;
                }
            }
        }

        if (this.field794 == 1 || this.field794 == 4 || this.field794 == 5) {
            this.field862 |= 4194304;
        }

        if (this.field794 == 6) {
            this.field862 |= 1;
        }

    }

    void method384(class78 var1) {
        var1.method260();
        this.field871 = true;
        this.field793 = var1.method260();
        this.field817 = var1.method309();
        this.field800 = var1.method262();
        this.field801 = var1.method262();
        this.field802 = var1.method309();
        if (this.field793 == 9) {
            this.field803 = var1.method262();
        } else {
            this.field803 = var1.method309();
        }

        this.field798 = var1.method261();
        this.field799 = var1.method261();
        this.field796 = var1.method261();
        this.field797 = var1.method261();
        this.field808 = var1.method309();
        if (this.field808 == 65535) {
            this.field808 = -1;
        } else {
            this.field808 += this.field791 & -65536;
        }

        this.field809 = var1.method260() == 1;
        if (this.field793 == 0) {
            this.field878 = var1.method309();
            this.field813 = var1.method309();
            this.field933 = var1.method260() == 1;
        }

        if (this.field793 == 5) {
            this.field877 = var1.method264();
            this.field827 = var1.method309();
            this.field828 = var1.method260() == 1;
            this.field812 = var1.method260();
            this.field829 = var1.method260();
            this.field830 = var1.method264();
            this.field831 = var1.method260() == 1;
            this.field832 = var1.method260() == 1;
        }

        if (this.field793 == 6) {
            this.field833 = 1;
            this.field834 = var1.method309();
            if (this.field834 == 65535) {
                this.field834 = -1;
            }

            this.field839 = var1.method262();
            this.field913 = var1.method262();
            this.field841 = var1.method309();
            this.field859 = var1.method309();
            this.field906 = var1.method309();
            this.field844 = var1.method309();
            this.field837 = var1.method309();
            if (this.field837 == 65535) {
                this.field837 = -1;
            }

            this.field864 = var1.method260() == 1;
            var1.method309();
            if (this.field798 != 0) {
                this.field845 = var1.method309();
            }

            if (this.field799 != 0) {
                var1.method309();
            }
        }

        if (this.field793 == 4) {
            this.field896 = var1.method309();
            if (this.field896 == 65535) {
                this.field896 = -1;
            }

            this.field851 = var1.method268();
            this.field887 = var1.method260();
            this.field854 = var1.method260();
            this.field912 = var1.method260();
            this.field781 = var1.method260() == 1;
            this.field814 = var1.method264();
        }

        if (this.field793 == 3) {
            this.field814 = var1.method264();
            this.field853 = var1.method260() == 1;
            this.field812 = var1.method260();
        }

        if (this.field793 == 9) {
            this.field822 = var1.method260();
            this.field814 = var1.method264();
            this.field823 = var1.method260() == 1;
        }

        this.field862 = var1.method316();
        this.field795 = var1.method268();
        int var3 = var1.method260();
        if (var3 > 0) {
            this.field869 = new String[var3];

            for (int var4 = 0; var4 < var3; ++var4) {
                this.field869[var4] = var1.method268();
            }
        }

        this.field804 = var1.method260();
        this.field846 = var1.method260();
        this.field872 = var1.method260() == 1;
        this.field873 = var1.method268();
        this.field875 = this.method385(var1);
        this.field880 = this.method385(var1);
        this.field852 = this.method385(var1);
        this.field886 = this.method385(var1);
        this.field885 = this.method385(var1);
        this.field858 = this.method385(var1);
        this.field889 = this.method385(var1);
        this.field891 = this.method385(var1);
        this.field784 = this.method385(var1);
        this.field894 = this.method385(var1);
        this.field881 = this.method385(var1);
        this.field843 = this.method385(var1);
        this.field789 = this.method385(var1);
        this.field876 = this.method385(var1);
        this.field879 = this.method385(var1);
        this.field883 = this.method385(var1);
        this.field884 = this.method385(var1);
        this.field816 = this.method385(var1);
        this.field888 = this.method386(var1);
        this.field820 = this.method386(var1);
        this.field892 = this.method386(var1);
    }

    Object[] method385(class78 var1) {
        int var3 = var1.method260();
        if (var3 == 0) {
            return null;
        } else {
            Object[] var4 = new Object[var3];

            for (int var5 = 0; var5 < var3; ++var5) {
                int var6 = var1.method260();
                if (var6 == 0) {
                    var4[var5] = Integer.valueOf(var1.method264());
                } else if (var6 == 1) {
                    var4[var5] = var1.method268();
                }
            }

            this.field874 = true;
            return var4;
        }
    }

    int[] method386(class78 var1) {
        int var3 = var1.method260();
        if (var3 == 0) {
            return null;
        } else {
            int[] var4 = new int[var3];

            for (int var5 = 0; var5 < var3; ++var5) {
                var4[var5] = var1.method264();
            }

            return var4;
        }
    }

    public class331 method410(boolean var1, class357 var2) {
        field790 = false;
        if (null != this.field826) {
            class331 var4 = this.method387(var2);
            if (var4 != null) {
                return var4;
            }
        }

        int var8;
        if (var1) {
            var8 = this.field825;
        } else {
            var8 = this.field877;
        }

        if (var8 == -1) {
            return null;
        } else {
            long var5 = ((long) this.field830 << 40) + ((this.field831 ? 1L : 0L) << 38) + ((long) this.field829 << 36) + (long) var8 + ((this.field832 ? 1L : 0L) << 39);
            class331 var7 = (class331) field897.method1307(var5);
            if (var7 != null) {
                return var7;
            } else {
                var7 = class122.method539(class492.field3613, var8, 0);
                if (var7 == null) {
                    field790 = true;
                    return null;
                } else {
                    this.method412(var7);
                    field897.method1306(var7, var5);
                    return var7;
                }
            }
        }
    }

    class331 method387(class357 var1) {
        if (!this.method388()) {
            return this.method411(var1);
        } else {
            String var3 = this.field826 + (this.field831 ? 1 : 0) + (this.field832 ? 1 : 0) + this.field829 + this.field830;
            class331 var4 = (class331) field900.method1609(var3, (byte) 2);
            if (var4 == null) {
                class331 var5 = this.method411(var1);
                if (var5 != null) {
                    var4 = var5.method1536();
                    this.method412(var4);
                    field900.method1610(var3, var4);
                }
            }

            return var4;
        }
    }

    class331 method411(class357 var1) {
        if (null != this.field826 && var1 != null) {
            class505 var3 = (class505) field788.method1609(this.field826, (byte) 24);
            if (var3 == null) {
                var3 = new class505(this.field826, var1);
                field788.method1610(this.field826, var3);
            }

            return var3.method2277();
        } else {
            return null;
        }
    }

    boolean method388() {
        return this.field831 || this.field832 || this.field829 != 0 || this.field830 != 0;
    }

    void method412(class331 var1) {
        if (this.field831) {
            var1.method1564();
        }

        if (this.field832) {
            var1.method1540();
        }

        if (this.field829 > 0) {
            var1.method1539(this.field829);
        }

        if (this.field829 >= 1) {
            var1.method1541(1);
        }

        if (this.field829 >= 2) {
            var1.method1541(16777215);
        }

        if (this.field830 != 0) {
            var1.method1542(this.field830);
        }

    }

    public class413 method389() {
        field790 = false;
        if (this.field896 == -1) {
            return null;
        } else {
            class413 var2 = (class413) field787.method1307(this.field896);
            if (null != var2) {
                return var2;
            } else {
                var2 = class274.method1229(class492.field3613, class538.field4282, this.field896, 0);
                if (var2 != null) {
                    field787.method1306(var2, this.field896);
                } else {
                    field790 = true;
                }

                return var2;
            }
        }
    }

    public class448 method390(class124 var1, int var2, boolean var3, class52 var4, class345 var5, class307 var6) {
        field790 = false;
        int var8;
        int var9;
        if (var3) {
            var8 = this.field835;
            var9 = this.field836;
        } else {
            var8 = this.field833;
            var9 = this.field834;
        }

        if (var8 == 6) {
            if (null == var5) {
                return null;
            }

            var9 = var5.field2474;
        }

        if (var8 == 0) {
            return null;
        } else if (var8 == 1 && var9 == -1) {
            return null;
        } else {
            if (null != var6 && var6.field2253 && var8 == 6) {
                var8 = 3;
            }

            long var10 = var9 + ((long) var8 << 16);
            if (null != var6) {
                var10 |= var6.field2251 << 20;
            }

            class448 var12 = (class448) field786.method1307(var10);
            if (var12 == null) {
                class175 var13 = null;
                int var14 = 64;
                int var15 = 768;
                switch (var8) {
                    case 1:
                        var13 = class175.method850(class5.field27, var9, 0);
                        break;
                    case 2:
                        var13 = class345.method1635(var9).method1624(null);
                        break;
                    case 3:
                        var13 = null != var4 ? var4.method151() : null;
                        break;
                    case 4:
                        class508 var16 = class508.method2299(var9);
                        var13 = var16.method2289(10);
                        var14 = 64 + var16.field3759;
                        var15 = 768 + var16.field3760;
                    case 5:
                    default:
                        break;
                    case 6:
                        var13 = class345.method1635(var9).method1624(var6);
                }

                if (var13 == null) {
                    field790 = true;
                    return null;
                }

                var12 = var13.method846(var14, var15, -50, -10, -50);
                field786.method1306(var12, var10);
            }

            if (null != var1) {
                var12 = var1.method570(var12, var2);
            }

            return var12;
        }
    }

    public class42 method391(boolean var1) {
        if (this.field825 == -1) {
            var1 = false;
        }

        int var3 = var1 ? this.field825 : this.field877;
        if (var3 == -1) {
            return null;
        } else {
            long var4 = ((long) this.field830 << 40) + ((long) this.field829 << 36) + (long) var3 + ((this.field831 ? 1L : 0L) << 38) + ((this.field832 ? 1L : 0L) << 39);
            class42 var6 = (class42) field780.method1307(var4);
            if (null != var6) {
                return var6;
            } else {
                class331 var7 = this.method410(var1, null);
                if (var7 == null) {
                    return null;
                } else {
                    class331 var8 = var7.method1552();
                    int[] var9 = new int[var8.field2419];
                    int[] var10 = new int[var8.field2419];

                    for (int var11 = 0; var11 < var8.field2419; ++var11) {
                        int var12 = 0;
                        int var13 = var8.field2423;

                        int var14;
                        for (var14 = 0; var14 < var8.field2423; ++var14) {
                            if (var8.field2422[var11 * var8.field2423 + var14] == 0) {
                                var12 = var14;
                                break;
                            }
                        }

                        for (var14 = var8.field2423 - 1; var14 >= var12; --var14) {
                            if (var8.field2422[var8.field2423 * var11 + var14] == 0) {
                                var13 = var14 + 1;
                                break;
                            }
                        }

                        var9[var11] = var12;
                        var10[var11] = var13 - var12;
                    }

                    var6 = new class42(var8.field2423, var8.field2419, var10, var9, var3);
                    field780.method1306(var6, var4);
                    return var6;
                }
            }
        }
    }

    public void method392(int var1, String var2) {
        if (this.field869 == null || this.field869.length <= var1) {
            String[] var4 = new String[var1 + 1];
            if (this.field869 != null) {
                System.arraycopy(this.field869, 0, var4, 0, this.field869.length);
            }

            this.field869 = var4;
        }

        this.field869[var1] = var2;
    }

    public boolean method393() {
        return !this.field871 || this.field793 == 0 || this.field793 == 11 || this.field874 || this.field817 == 1338 || this.field793 == 12;
    }

    public boolean method394() {
        return this.field793 == 11 || this.field793 == 12;
    }

    public void method417(String var1, class357 var2, long var3) {
        if (this.field793 == 11 && var3 != -1L) {
            var1 = var1.replaceAll("%userid%", Long.toString(var3));
            this.field857 = new class456();
            if (!this.field857.method2093(var1, var2)) {
                this.field857 = null;
            } else {
                if (null == this.field916 || this.field893 == null) {
                    this.method418();
                }

            }
        }
    }

    public void method415(String var1, class357 var2) {
        if (this.field793 == 11 && null != var1) {
            this.field857 = new class456();
            this.field857.method2105(var1, var2);
        }
    }

    void method418() {
        this.field916 = new HashMap<>();
        this.field893 = new HashMap<>();
    }

    public void method413(int var1, int var2) {
        if (this.field793 == 11) {
            if (this.field916 == null) {
                this.method418();
            }

            this.field916.put(var1, var2);
        }
    }

    public void method396(String var1, int var2) {
        if (this.field793 == 11) {
            if (this.field893 == null) {
                this.method418();
            }

            this.field893.put(var1, var2);
        }
    }

    public boolean method397(int var1, int var2, int var3, int var4) {
        if (this.field793 == 11 && null != this.field857 && this.method416()) {
            var1 -= 0;
            var2 -= 0;
            int var6 = (int) (this.field857.method2097()[0] * (float) this.field806);
            int var7 = (int) (this.field857.method2097()[1] * (float) this.field783);
            int var8 = var6 + (int) (this.field857.method2097()[2] * (float) this.field806);
            int var9 = var7 + (int) (this.field857.method2097()[3] * (float) this.field783);
            return var1 >= var6 && var2 >= var7 && var1 < var8 && var2 < var9;
        } else {
            return false;
        }
    }

    public boolean method416() {
        return this.field901 == 2;
    }

    public int method398(String var1) {
        return this.field793 == 11 && this.field857 != null && this.method416() ? this.field857.method2095(var1) : -1;
    }

    public String method399(String var1) {
        return this.field793 == 11 && null != this.field857 && this.method416() ? this.field857.method2109(var1) : null;
    }

    public int method400() {
        return this.field893 != null && this.field893.size() > 0 ? 1 : 0;
    }

    public int method401() {
        if (this.field793 == 11 && null != this.field857 && null != this.field893 && !this.field893.isEmpty()) {
            String var2 = this.field857.method2098();
            return var2 != null && this.field893.containsKey(this.field857.method2098()) ? this.field893.get(var2) : -1;
        } else {
            return -1;
        }
    }

    public String method402() {
        if (this.field793 == 11 && null != this.field857) {
            String var2 = this.field857.method2098();
            Iterator<class422> var3 = this.field857.method2099().iterator();

            while (var3.hasNext()) {
                class422 var4 = var3.next();
                String var5 = String.format("%%%S%%", var4.method1939());
                if (var4.method1942() == 0) {
                    var2.replaceAll(var5, Integer.toString(var4.method1941()));
                } else {
                    var2.replaceAll(var5, var4.method1940());
                }
            }

            return var2;
        } else {
            return null;
        }
    }

    public int[] method409() {
        if (this.field793 == 11 && this.field857 != null) {
            int[] var2 = new int[3];
            int var3 = 0;
            Iterator<class422> var4 = this.field857.method2099().iterator();

            while (var4.hasNext()) {
                class422 var5 = var4.next();
                if (!var5.method1939().equals("user_id")) {
                    if (var5.method1942() != 0) {
                        return null;
                    }

                    var2[var3++] = var5.method1941();
                    if (var3 > 3) {
                        return null;
                    }
                }
            }

            return var2;
        } else {
            return null;
        }
    }

    public boolean method414(class357 var1) {
        if (this.field793 == 11 && this.field857 != null) {
            this.field857.method2107(var1);
            if (this.field857.method2094() != this.field901) {
                this.field901 = this.field857.method2094();
                if (this.field901 >= 100) {
                    return true;
                }

                if (this.field901 == 2) {
                    this.method403();
                    return true;
                }
            }

            return false;
        } else {
            return false;
        }
    }

    void method403() {
        this.field933 = true;
        ArrayList var2 = this.field857.method2096();
        ArrayList var3 = this.field857.method2110();
        int var4 = var2.size() + var3.size();
        this.field923 = new class97[var4];
        int var5 = 0;

        Iterator var6;
        float[] var10;
        class97 var11;
        for (var6 = var2.iterator(); var6.hasNext(); this.field923[var5++] = var11) {
            class521 var7 = (class521) var6.next();
            var10 = var7.field4199;
            var11 = new class97();
            var11.field793 = 5;
            var11.field808 = this.field791;
            var11.field910 = var5;
            var11.field871 = true;
            var11.field796 = 0;
            var11.field797 = 0;
            var11.field798 = 0;
            var11.field799 = 0;
            var11.field800 = (int) (var10[0] * (float) this.field806);
            var11.field801 = (int) (var10[1] * (float) this.field783);
            var11.field802 = (int) (var10[2] * (float) this.field806);
            var11.field803 = (int) ((float) this.field783 * var10[3]);
            var11.field826 = var7.field4198.method1092();
            class505 var12 = new class505(var7.field4198);
            field788.method1610(var11.field826, var12);
        }

        for (var6 = var3.iterator(); var6.hasNext(); this.field923[var5++] = var11) {
            class519 var13 = (class519) var6.next();
            var10 = var13.field4185;
            var11 = new class97();
            var11.field793 = 4;
            var11.field808 = this.field791;
            var11.field910 = var5;
            var11.field871 = true;
            var11.field796 = 0;
            var11.field797 = 0;
            var11.field798 = 0;
            var11.field799 = 0;
            var11.field800 = (int) (var10[0] * (float) this.field806);
            var11.field801 = (int) (var10[1] * (float) this.field783);
            var11.field802 = (int) ((float) this.field806 * var10[2]);
            var11.field803 = (int) (var10[3] * (float) this.field783);
            var11.field851 = var13.field4189;
            var11.field896 = this.field916.get(var13.field4184);
            var11.field854 = var13.field4186;
            var11.field912 = var13.field4187;
        }

    }

    public void method404() {
        this.field868 = new class265();

        for (int var2 = 1; var2 <= 12; ++var2) {
            this.field868.field1961.method1428(var2, 0);
        }

        for (char var3 = 0; var3 < ' '; ++var3) {
            this.field868.field1961.method1431(var3, 0);
        }

        this.field868.field1961.method1431('\u0080', 0);
        this.field868.field1961.method1428(82, 2);
        this.field868.field1961.method1428(81, 2);
        this.field868.field1961.method1428(86, 2);
    }

    public class327 method419() {
        return null != this.field868 ? this.field868.field1958 : null;
    }

    public class346 method405() {
        return null != this.field868 ? this.field868.field1956 : null;
    }

    public class323 method395() {
        return null != this.field868 ? this.field868.field1961 : null;
    }

    public class265 method406() {
        return this.field868;
    }

    boolean method407(class327 var1) {
        boolean var3 = false;
        if (this.field851 != null && !this.field851.isEmpty()) {
            var3 = var1.method1512(class95.method369(this.field851));
            this.field851 = "";
        }

        if (null != this.field779 && !this.field779.isEmpty()) {
            var3 |= var1.method1445(class95.method369(this.field779));
            this.field779 = "";
        }

        return var3;
    }

    public boolean method408() {
        class327 var2 = this.method419();
        if (var2 == null) {
            return false;
        } else {
            boolean var3 = false;
            if (!var2.method1485() && this.field896 != -1) {
                int var4 = var2.method1486();
                int var5 = var2.method1511();
                int var6 = var2.method1484();
                int var7 = var2.method1483();
                class413 var8 = this.method389();
                if (var8 != null) {
                    var3 = var2.method1446(var8);
                    var3 |= this.method407(var2);
                    var3 |= var2.method1451(var4, var5);
                    var3 |= var2.method1462(var6, var7);
                }
            } else if (var2.method1485()) {
                var3 = this.method407(var2);
            }

            var2.method1442();
            return var3;
        }
    }
}
