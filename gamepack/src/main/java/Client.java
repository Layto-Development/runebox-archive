import com.jagex.oldscape.pub.*;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

import java.awt.datatransfer.Clipboard;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.*;
import java.util.concurrent.Future;

public final class Client extends class479 implements class160, OAuthApi, class541 {
    public static final class306 field3840;
    static final class57 field4075;
    static final int[] field3910;
    static final int[] field3960;
    static final String field3911;
    static final String field4027;
    public static boolean field3802;
    public static class97 field3959;
    public static int field3775;
    public static int field3863;
    public static int field3898;
    public static int field3957;
    static boolean field3779;
    static boolean field3786;
    static boolean field3788;
    static boolean field3794;
    static boolean field3815;
    static boolean field3829;
    static boolean field3839;
    static boolean field3842;
    static boolean field3851;
    static boolean field3860;
    static boolean field3867;
    static boolean field3876;
    static boolean field3878;
    static boolean field3888;
    static boolean field3901;
    static boolean field3908;
    static boolean field3922;
    static boolean field3933;
    static boolean field3935;
    static boolean field3964;
    static boolean field3970;
    static boolean field4006;
    static boolean field4010;
    static boolean field4011;
    static boolean field4013;
    static boolean field4036;
    static boolean field4037;
    static boolean field4038;
    static boolean field4039;
    static boolean field4042;
    static boolean field4047;
    static boolean field4064;
    static boolean field4071;
    static boolean[] field3785;
    static boolean[] field3912;
    static boolean[] field3932;
    static boolean[] field3998;
    static boolean[] field3999;
    static boolean[] field4043;
    static byte[] field4058;
    static class11[] field3850;
    static class131[] field3819;
    static class133[] field4019;
    static class144 field4040;
    static class178 field3796;
    static class178 field3994;
    static class199 field3923;
    static class230 field3807;
    static class235 field3831;
    static class235 field3857;
    static class241 field3820;
    static class249[] field4053;
    static class279 field3843;
    static class283[] field3948;
    static class287 field3989;
    static class289 field3861;
    static class289 field3971;
    static class29 field4065;
    static class295 field3804;
    static class295 field3805;
    static class315[] field4020;
    static class331 field3855;
    static class331[] field4033;
    static class342 field4066;
    static class360 field4025;
    static class424[] field3835;
    static class43 field3902;
    static class43 field3916;
    static class43 field3976;
    static class43 field3990;
    static class43 field3992;
    static class43 field4029;
    static class43 field4045;
    static class43[][][] field3915;
    static class45 field3830;
    static class463 field4014;
    static class498 field3920;
    static class52 field4061;
    static class97 field3952;
    static class97 field3963;
    static class97 field3978;
    static class97 field4068;
    static int field3776;
    static int field3777;
    static int field3778;
    static int field3780;
    static int field3781;
    static int field3783;
    static int field3787;
    static int field3789;
    static int field3790;
    static int field3791;
    static int field3792;
    static int field3793;
    static int field3795;
    static int field3797;
    static int field3799;
    static int field3800;
    static int field3806;
    static int field3808;
    static int field3809;
    static int field3810;
    static int field3811;
    static int field3812;
    static int field3813;
    static int field3814;
    static int field3816;
    static int field3827;
    static int field3828;
    static int field3836;
    static int field3841;
    static int field3845;
    static int field3846;
    static int field3847;
    static int field3848;
    static int field3849;
    static int field3853;
    static int field3854;
    static int field3856;
    static int field3858;
    static int field3859;
    static int field3864;
    static int field3865;
    static int field3866;
    static int field3868;
    static int field3869;
    static int field3870;
    static int field3871;
    static int field3872;
    static int field3873;
    static int field3874;
    static int field3875;
    static int field3877;
    static int field3879;
    static int field3880;
    static int field3881;
    static int field3885;
    static int field3889;
    static int field3892;
    static int field3893;
    static int field3894;
    static int field3895;
    static int field3896;
    static int field3900;
    static int field3903;
    static int field3904;
    static int field3906;
    static int field3909;
    static int field3913;
    static int field3914;
    static int field3917;
    static int field3924;
    static int field3931;
    static int field3936;
    static int field3937;
    static int field3938;
    static int field3939;
    static int field3940;
    static int field3942;
    static int field3943;
    static int field3945;
    static int field3946;
    static int field3947;
    static int field3949;
    static int field3950;
    static int field3951;
    static int field3953;
    static int field3954;
    static int field3955;
    static int field3961;
    static int field3962;
    static int field3965;
    static int field3966;
    static int field3967;
    static int field3973;
    static int field3975;
    static int field3977;
    static int field3979;
    static int field3980;
    static int field3981;
    static int field3982;
    static int field3983;
    static int field3984;
    static int field3985;
    static int field3988;
    static int field3991;
    static int field3995;
    static int field3996;
    static int field4004;
    static int field4008;
    static int field4009;
    static int field4012;
    static int field4015;
    static int field4021;
    static int field4022;
    static int field4026;
    static int field4028;
    static int field4030;
    static int field4034;
    static int field4044;
    static int field4046;
    static int field4056;
    static int field4057;
    static int field4060;
    static int field4062;
    static int field4063;
    static int field4069;
    static int field4073;
    static int field4074;
    static int field4078;
    static int[] field3774;
    static int[] field3782;
    static int[] field3801;
    static int[] field3834;
    static int[] field3837;
    static int[] field3882;
    static int[] field3883;
    static int[] field3886;
    static int[] field3887;
    static int[] field3899;
    static int[] field3907;
    static int[] field3919;
    static int[] field3925;
    static int[] field3926;
    static int[] field3928;
    static int[] field3929;
    static int[] field3956;
    static int[] field3968;
    static int[] field3972;
    static int[] field3974;
    static int[] field3986;
    static int[] field3987;
    static int[] field3993;
    static int[] field3997;
    static int[] field4000;
    static int[] field4001;
    static int[] field4002;
    static int[] field4003;
    static int[] field4007;
    static int[] field4016;
    static int[] field4017;
    static int[] field4023;
    static int[] field4024;
    static int[] field4031;
    static int[] field4032;
    static int[] field4035;
    static int[] field4041;
    static int[] field4059;
    static int[] field4067;
    static int[] field4070;
    static int[] field4076;
    static int[] field4077;
    static int[][] field3784;
    static int[][] field3891;
    static int[][][] field3852;
    static String field3803;
    static String field3941;
    static String field3958;
    static String field3969;
    static String[] field3798;
    static String[] field3890;
    static String[] field3930;
    static String[] field4049;
    static ArrayList<class99> field4072;
    static HashMap<class24, class413> field3844;
    static List<Integer> field3944;
    static long field3838;
    static long field3905;
    static long field3918;
    static long field4005;
    static long field4018;
    static long[] field3921;
    static short field3884;
    static short field3934;
    static short field4048;
    static short field4050;
    static short field4051;
    static short field4052;
    static short field4054;
    static short field4055;

    static {
        field3815 = true;
        field3775 = 1;
        field3776 = 0;
        field3800 = 0;
        field3802 = false;
        field3779 = false;
        field3780 = -1;
        field3781 = -1;
        field3793 = -1;
        field4010 = false;
        field3957 = 216;
        field3859 = 0;
        field3786 = false;
        field3788 = true;
        field4078 = 0;
        field3838 = -1L;
        field3791 = -1;
        field3792 = -1;
        field3918 = -1L;
        field3794 = true;
        field3795 = 0;
        field3853 = 0;
        field3797 = 0;
        field3816 = 0;
        field3799 = 0;
        field3942 = 0;
        field3806 = 0;
        field3962 = 0;
        field3995 = 0;
        field3804 = class295.field2138;
        field3805 = class295.field2138;
        field3839 = false;
        field3807 = class230.field1804;
        field3808 = 0;
        field3809 = 0;
        field3955 = 0;
        field3811 = 0;
        field3790 = 0;
        field3841 = 0;
        field3913 = 0;
        field4025 = class360.field2583;
        field3820 = class241.field1842;
        int var2 = "com_jagex_auth_desktop_osrs:public".length();
        byte[] var3 = new byte[var2];

        int var4;
        char var5;
        for (var4 = 0; var4 < var2; ++var4) {
            var5 = "com_jagex_auth_desktop_osrs:public".charAt(var4);
            if (var5 > 127) {
                var3[var4] = 63;
            } else {
                var3[var4] = (byte) var5;
            }
        }

        String var0 = class34.method99(var3, 0, var3.length);
        field4027 = var0;
        var2 = "com_jagex_auth_desktop_runelite:public".length();
        var3 = new byte[var2];

        for (var4 = 0; var4 < var2; ++var4) {
            var5 = "com_jagex_auth_desktop_runelite:public".charAt(var4);
            if (var5 > 127) {
                var3[var4] = 63;
            } else {
                var3[var4] = (byte) var5;
            }
        }

        var0 = class34.method99(var3, 0, var3.length);
        field3911 = var0;
        field3829 = false;
        field3830 = new class45();
        field4058 = null;
        field3835 = new class424[65536];
        field3836 = 0;
        field3774 = new int[65536];
        field3889 = 0;
        field3986 = new int[250];
        field3840 = new class306();
        field3828 = 0;
        field3842 = false;
        field3843 = new class279();
        field3844 = new HashMap<class24, class413>();
        field3845 = 0;
        field3879 = 1;
        field3847 = 0;
        field3848 = 1;
        field3849 = 0;
        field3850 = new class11[4];
        field3851 = false;
        field3852 = new int[4][13][13];
        field3960 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
        field3854 = 0;
        field3856 = 2301979;
        field3967 = 5063219;
        field3858 = 3353893;
        field4046 = 7759444;
        field3860 = false;
        field3979 = 0;
        field3814 = 128;
        field3953 = 0;
        field3864 = 0;
        field3865 = 0;
        field3787 = 0;
        field3931 = 0;
        field3868 = 0;
        field3869 = 50;
        field3870 = 0;
        field3871 = 0;
        field3872 = 0;
        field3873 = 12;
        field3874 = 6;
        field3875 = 0;
        field3876 = false;
        field3877 = 0;
        field3878 = false;
        field3917 = 0;
        field3880 = 0;
        field3812 = 50;
        field3882 = new int[field3812];
        field3883 = new int[field3812];
        field3834 = new int[field3812];
        field4059 = new int[field3812];
        field3886 = new int[field3812];
        field3887 = new int[field3812];
        field3784 = new int[field3812][];
        field4035 = new int[field3812];
        field3890 = new String[field3812];
        field3891 = new int[104][104];
        field3945 = 0;
        field3893 = -1;
        field3894 = -1;
        field3895 = 0;
        field3896 = 0;
        field3954 = 0;
        field4012 = 0;
        field4064 = true;
        field3900 = 0;
        field3901 = true;
        field3948 = new class283[2048];
        field3903 = -1;
        field3904 = 0;
        field3905 = -1L;
        field4013 = true;
        field3778 = 0;
        field4044 = 0;
        field3801 = new int[1000];
        field3910 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
        field3798 = new String[8];
        field3912 = new boolean[8];
        field3956 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
        field3914 = -1;
        field3915 = new class43[4][104][104];
        field3916 = new class43();
        field3902 = new class43();
        field4045 = new class43();
        field3919 = new int[25];
        field4067 = new int[25];
        field4070 = new int[25];
        field3922 = false;
        field3888 = false;
        field3924 = 0;
        field3925 = new int[500];
        field3926 = new int[500];
        field3968 = new int[500];
        field3928 = new int[500];
        field3929 = new int[500];
        field3930 = new String[500];
        field4049 = new String[500];
        field3932 = new boolean[500];
        field3933 = false;
        field3908 = false;
        field3935 = true;
        field3936 = -1;
        field3937 = -1;
        field3938 = 0;
        field3939 = 50;
        field3940 = 0;
        field3941 = null;
        field3867 = false;
        field3943 = -1;
        field3909 = -1;
        field3958 = null;
        field3969 = null;
        field3947 = -1;
        field3796 = new class178(8);
        field3789 = 0;
        field3950 = -1;
        field3951 = 0;
        field3952 = null;
        field3892 = 0;
        field4062 = 0;
        field3863 = 0;
        field3810 = -1;
        field4071 = false;
        field4068 = null;
        field3959 = null;
        field3978 = null;
        field3961 = 0;
        field4034 = 0;
        field3963 = null;
        field3964 = false;
        field3965 = -1;
        field3966 = -1;
        field4011 = false;
        field3813 = -1;
        field3885 = -1;
        field3970 = false;
        field3777 = 1;
        field3972 = new int[32];
        field3973 = 0;
        field3974 = new int[32];
        field3975 = 0;
        field3899 = new int[32];
        field3977 = 0;
        field4041 = new int[32];
        field3906 = 0;
        field3980 = 0;
        field3981 = 0;
        field3982 = 0;
        field3983 = 0;
        field3984 = 0;
        field3985 = 0;
        field3846 = 0;
        field3827 = 0;
        field3988 = 0;
        field3989 = new class287();
        field3990 = new class43();
        field3976 = new class43();
        field3992 = new class43();
        field4029 = new class43();
        field3994 = new class178(512);
        field3946 = 0;
        field3996 = -2;
        field3785 = new boolean[100];
        field3998 = new boolean[100];
        field3999 = new boolean[100];
        field4000 = new int[100];
        field4001 = new int[100];
        field4002 = new int[100];
        field4003 = new int[100];
        field4004 = 0;
        field4005 = 0L;
        field4006 = true;
        field4007 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
        field4008 = 0;
        field4009 = 0;
        field3803 = "";
        field3921 = new long[100];
        field3783 = 0;
        field3923 = new class199();
        field4014 = new class463();
        field4015 = 0;
        field4016 = new int[128];
        field4017 = new int[128];
        field4018 = -1L;
        field4019 = new class133[4];
        field4020 = new class315[4];
        field4021 = -1;
        field4022 = 0;
        field4023 = new int[1000];
        field4024 = new int[1000];
        field4033 = new class331[1000];
        field4026 = 0;
        field3949 = 0;
        field4028 = 0;
        field4047 = false;
        field4030 = 0;
        field4031 = new int[50];
        field4032 = new int[50];
        field3987 = new int[50];
        field3782 = new int[50];
        field3819 = new class131[50];
        field4036 = false;
        field4037 = false;
        field4038 = false;
        field4039 = false;
        field4040 = null;
        field3831 = null;
        field3857 = null;
        field4042 = false;
        field4043 = new boolean[5];
        field3837 = new int[5];
        field3997 = new int[5];
        field3907 = new int[5];
        field3993 = new int[5];
        field4048 = 256;
        field3934 = 205;
        field4050 = 256;
        field4051 = 320;
        field4052 = 1;
        field3884 = 32767;
        field4054 = 1;
        field4055 = 32767;
        field4056 = 0;
        field4057 = 0;
        field3991 = 0;
        field3866 = 0;
        field4060 = 0;
        field4061 = new class52();
        field3881 = -1;
        field4063 = -1;
        field3920 = new class190();
        field4053 = new class249[8];
        field4065 = new class29();
        field4066 = new class342(8, class121.field1094);
        field3971 = new class289(64);
        field3861 = new class289(64);
        field4069 = -1;
        field3898 = -1;
        field3944 = new ArrayList<>();
        field4072 = new ArrayList<class99>(10);
        field4073 = 0;
        field4074 = 0;
        field4075 = new class57();
        field4076 = new int[50];
        field4077 = new int[50];
    }

    boolean field3822;
    class127 field3818;
    class13 field3824;
    class13 field3897;
    class78 field3862;
    class92 field3832;
    OtlTokenRequester field3927;
    RefreshAccessTokenRequester field3825;
    int field3823;
    String field3817;
    Future<OtlTokenResponse> field3821;
    Future<RefreshAccessTokenResponse> field3826;
    long field3833;

    public Client() {
        this.field3822 = false;
        this.field3823 = 0;
        this.field3833 = -1L;
    }

    static class100 method2426() {
        return class466.field3310;
    }

    static void method2341() {
        class323.field2347 = System.getenv("JX_ACCESS_TOKEN");
        class535.field4260 = System.getenv("JX_REFRESH_TOKEN");
        class165.field1428 = System.getenv("JX_SESSION_ID");
        class195.field1612 = System.getenv("JX_CHARACTER_ID");
        class500.method2272(System.getenv("JX_DISPLAY_NAME"));
    }

    public static class199 method2443() {
        return field3923;
    }

    static void method2481() {
        if (class305.field2233.method911()) {
            class305.field2233.method909();
        }

        if (class151.field1306 != null) {
            class151.field1306.field746 = false;
        }

        class151.field1306 = null;
        field3840.method1363();
        if (null != class479.field3426) {
            try {
                class479.field3426.method504();
            } catch (Exception var3) {
            }
        }

        class479.field3426 = null;
        method2373();
        class162.field1419.method203();
        class283.field2082.method203();
        class332.field2425.method203();
        class122.field1098.method203();
        class189.field1542.method203();
        class192.field1578.method203();
        class404.field2861.method203();
        class139.field1226.method203();
        method2360();
        class329.field2414.method737();

        for (int var1 = 0; var1 < 4; ++var1) {
            field3850[var1].method29();
        }

        class466.field3310 = null;
        class443.method2021(0, 0);
        class357.method1703();
        field4047 = false;
        class51.method144();
        if (class392.field2785 != null) {
            class392.field2785.method1824();
        }

        class426.field2930.method2089();
        class531.method2523();
        if (null != class174.field1465) {
            class174.field1465.method1700();
        }

        class6.method10();
        class6.field33 = null;
        class6.field34 = null;
        class224.field1775 = null;
        class163.method795();
        class297.field2148 = null;
        field4072.clear();
        field4074 = 0;
        class426.field2930 = new class453();
        class174.field1465 = new class223(class268.field1973.field3822, 216);

        try {
            class6.method8("oldschool", class458.field3150, class529.field4219.field4079, 0, 22);
        } catch (IOException var2) {
            throw new RuntimeException(var2);
        }

        class297.field2148 = new class239(255, class6.field33, class6.field34, 500000);
        class479.field3426 = new class108();
        class268.field1973.method2201();
        field3807 = class230.field1804;
        method2459(0);
    }

    static void method2360() {
        field3855 = null;
        class169.field1433 = null;
        class153.field1321 = null;
        class494.field3626 = null;
        class432.field2936 = null;
        class99.field941 = null;
        class434.field2959 = null;
        class128.field1146 = null;
        class475.field3399 = null;
        class29.field164 = null;
        class154.field1334 = null;
    }

    static void method2459(int var0) {
        if (field3859 != var0) {
            if (field3859 == 30) {
                field4014.method2123();
            }

            if (field3859 == 0) {
                class268.field1973.method2221();
            }

            if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
                method2457(0);
                field3790 = 0;
                field3841 = 0;
                field3843.method1254(var0);
                if (var0 != 20) {
                    method2374(false);
                }
            }

            if (var0 != 20 && var0 != 40 && null != class75.field692) {
                class75.field692.method232();
                class75.field692 = null;
            }

            if (field3859 == 25) {
                field3849 = 0;
                field3845 = 0;
                field3879 = 1;
                field3847 = 0;
                field3848 = 1;
            }

            if (var0 != 5 && var0 != 10) {
                if (var0 == 20) {
                    int var4 = field3859 == 11 ? 4 : 0;
                    class500.method2270(class202.field1656, class398.field2811, false, var4);
                } else if (var0 == 11) {
                    class500.method2270(class202.field1656, class398.field2811, false, 4);
                } else if (var0 == 50) {
                    class500.method2268("", "Updating date of birth...", "");
                    class500.method2270(class202.field1656, class398.field2811, false, 7);
                } else if (class394.field2787) {
                    class500.field3656 = null;
                    class268.field1974 = null;
                    class500.field3655 = null;
                    class500.field3658 = null;
                    class8.field44 = null;
                    class352.field2545 = null;
                    class179.field1520 = null;
                    class500.field3653 = null;
                    class335.field2436 = null;
                    class112.field1051 = null;
                    class56.field601 = null;
                    class338.field2448 = null;
                    class21.field74 = null;
                    class102.field1001 = null;
                    class360.field2579.method974();
                    class443.method2021(0, 100);
                    class11.method31().method2084(true);
                    class394.field2787 = false;
                }
            } else {
                boolean var2 = class290.field2121.method2541() >= field3780;
                int var3 = var2 ? 0 : 12;
                class500.method2270(class202.field1656, class398.field2811, true, var3);
            }

            field3859 = var0;
        }
    }

    static void method2489(class372 var0, String var1) {
        class99 var3 = new class99(var0, var1);
        field4072.add(var3);
        field4074 += var3.field939;
    }

    static boolean method2368() {
        if (null != field4072 && field4073 < field4072.size()) {
            while (field4073 < field4072.size()) {
                class99 var1 = field4072.get(field4073);
                if (!var1.method430()) {
                    return false;
                }

                ++field4073;
            }

            return true;
        } else {
            return true;
        }
    }

    static int method2359() {
        if (null != field4072 && field4073 < field4072.size()) {
            int var1 = 0;

            for (int var2 = 0; var2 <= field4073; ++var2) {
                var1 += field4072.get(var2).field940;
            }

            return var1 * 10000 / field4074;
        } else {
            return 10000;
        }
    }

    static int method2415(int var0) {
        return var0 * 3 + 600;
    }

    static void method2421() {
        int var30;
        if (field3807 == class230.field1804) {
            class329.field2414 = new class158(4, 104, 104, class122.field1107);

            for (var30 = 0; var30 < 4; ++var30) {
                field3850[var30] = new class11(104, 104);
            }

            class156.field1336 = new class331(512, 512);
            class500.field3662 = class32.field187;
            class500.field3661 = 5;
            field3807 = class230.field1795;
        } else if (class230.field1795 == field3807) {
            class500.field3662 = class32.field188;
            class500.field3661 = 10;
            field3807 = class230.field1803;
        } else if (class230.field1803 == field3807) {
            class295.field2136 = method2395(0, false, true, true, false);
            class65.field631 = method2395(1, false, true, true, false);
            class162.field1419 = method2395(2, true, false, true, false);
            class51.field573 = method2395(3, false, true, true, false);
            class215.field1739 = method2395(4, false, true, true, false);
            class452.field3111 = method2395(5, true, true, true, false);
            class34.field491 = method2395(6, true, true, true, false);
            class434.field2958 = method2395(7, false, true, true, false);
            class398.field2811 = method2395(8, false, true, true, false);
            class164.field1425 = method2395(9, false, true, true, false);
            class202.field1656 = method2395(10, false, true, true, false);
            class403.field2859 = method2395(11, false, true, true, false);
            class249.field1902 = method2395(12, false, true, true, false);
            class283.field2082 = method2395(13, true, false, true, false);
            class332.field2425 = method2395(14, false, true, true, false);
            class122.field1098 = method2395(15, false, true, true, false);
            class189.field1542 = method2395(17, true, true, true, false);
            class192.field1578 = method2395(18, false, true, true, false);
            class404.field2861 = method2395(19, false, true, true, false);
            class139.field1226 = method2395(20, false, true, true, false);
            class390.field2780 = method2395(21, false, true, true, true);
            class500.field3662 = class32.field213;
            class500.field3661 = 20;
            field3807 = class230.field1797;
        } else if (class230.field1797 == field3807) {
            boolean var50 = false;
            var30 = class295.field2136.method1750() * 4 / 100;
            var30 += class65.field631.method1750() * 4 / 100;
            var30 += class162.field1419.method1750() * 2 / 100;
            var30 += class51.field573.method1750() * 2 / 100;
            var30 += class215.field1739.method1750() * 6 / 100;
            var30 += class452.field3111.method1750() * 4 / 100;
            var30 += class34.field491.method1750() * 2 / 100;
            var30 += class434.field2958.method1750() * 55 / 100;
            var30 += class398.field2811.method1750() * 2 / 100;
            var30 += class164.field1425.method1750() * 2 / 100;
            var30 += class202.field1656.method1750() * 2 / 100;
            var30 += class403.field2859.method1750() * 2 / 100;
            var30 += class249.field1902.method1750() * 2 / 100;
            var30 += class283.field2082.method1750() * 2 / 100;
            var30 += class332.field2425.method1750() * 2 / 100;
            var30 += class122.field1098.method1750() * 2 / 100;
            var30 += class404.field2861.method1750() / 100;
            var30 += class192.field1578.method1750() / 100;
            var30 += class139.field1226.method1750() / 100;
            var30 += class390.field2780.method1750() / 100;
            var30 += class189.field1542.method1756() && class189.field1542.method193() ? 1 : 0;
            if (var30 != 100) {
                if (var30 != 0) {
                    class500.field3662 = class32.field190 + var30 + "%";
                }

                class500.field3661 = 30;
            } else {
                method2489(class295.field2136, "Animations");
                method2489(class65.field631, "Skeletons");
                method2489(class215.field1739, "Sound FX");
                method2489(class452.field3111, "Maps");
                method2489(class34.field491, "Music Tracks");
                method2489(class434.field2958, "Models");
                method2489(class398.field2811, "Sprites");
                method2489(class403.field2859, "Music Jingles");
                method2489(class332.field2425, "Music Samples");
                method2489(class122.field1098, "Music Patches");
                method2489(class404.field2861, "World Map");
                method2489(class192.field1578, "World Map Geography");
                method2489(class139.field1226, "World Map Ground");
                class414.field2901 = new class481();
                class414.field2901.method2228(class189.field1542);
                class500.field3662 = class32.field191;
                class500.field3661 = 30;
                field3807 = class230.field1798;
            }
        } else {
            int var3;
            class372 var33;
            class372 var35;
            if (class230.field1798 == field3807) {
                class398.method1838(22050, !field3779, 2);
                ArrayList<class468> var48 = new ArrayList<>(3);
                class392.field2785 = class398.method1837(class479.field3426, 0, 2048);
                class173.field1454 = new class367();
                class367 var32 = new class367();
                var32.method1730(class173.field1454);

                for (var3 = 0; var3 < 3; ++var3) {
                    class468 var39 = new class468();
                    var39.method2154(9, 128);
                    var32.method1730(var39);
                    var48.add(var39);
                }

                class392.field2785.method1821(var32);
                var33 = class122.field1098;
                var35 = class332.field2425;
                class372 var41 = class215.field1739;
                class141.field1235 = var33;
                class141.field1236 = var35;
                class141.field1239 = var41;
                class141.field1238 = var48;
                class237.field1833 = new class107(22050, class398.field2800);
                class500.field3662 = class32.field192;
                class500.field3661 = 35;
                field3807 = class230.field1802;
                class46.field543 = new class129(class398.field2811, class283.field2082);
            } else {
                int var2;
                if (field3807 == class230.field1802) {
                    class24[] var47 = new class24[]{class24.field131, class24.field125, class24.field124, class24.field129, class24.field127, class24.field126};
                    var2 = var47.length;
                    class129 var34 = class46.field543;
                    class24[] var38 = new class24[]{class24.field131, class24.field125, class24.field124, class24.field129, class24.field127, class24.field126};
                    field3844 = var34.method587(var38);
                    if (field3844.size() < var2) {
                        class500.field3662 = class32.field385 + field3844.size() * 100 / var2 + "%";
                        class500.field3661 = 40;
                    } else {
                        class58.field605 = field3844.get(class24.field127);
                        class21.field75 = field3844.get(class24.field126);
                        class303.field2170 = field3844.get(class24.field129);
                        class13.field57 = field3920.method2252();
                        class500.field3662 = class32.field194;
                        class500.field3661 = 40;
                        field3807 = class230.field1800;
                    }
                } else {
                    int var4;
                    class372 var6;
                    class372 var31;
                    if (field3807 == class230.field1800) {
                        var31 = class202.field1656;
                        var33 = class398.field2811;
                        var4 = 0;
                        String[] var37 = class500.field3666;

                        int var40;
                        String var42;
                        for (var40 = 0; var40 < var37.length; ++var40) {
                            var42 = var37[var40];
                            if (var31.method208(var42, "")) {
                                ++var4;
                            }
                        }

                        var37 = class500.field3685;

                        for (var40 = 0; var40 < var37.length; ++var40) {
                            var42 = var37[var40];
                            if (var33.method208(var42, "")) {
                                ++var4;
                            }
                        }

                        var37 = class500.field3688;

                        for (var40 = 0; var40 < var37.length; ++var40) {
                            var42 = var37[var40];
                            if (var33.method213(var42) != -1 && var33.method208(var42, "")) {
                                ++var4;
                            }
                        }

                        var6 = class398.field2811;
                        int var43 = class500.field3666.length + class500.field3685.length;
                        String[] var44 = class500.field3688;

                        for (int var45 = 0; var45 < var44.length; ++var45) {
                            String var49 = var44[var45];
                            if (var6.method213(var49) != -1) {
                                ++var43;
                            }
                        }

                        if (var4 < var43) {
                            class500.field3662 = class32.field195 + var4 * 100 / var43 + "%";
                            class500.field3661 = 50;
                        } else {
                            class500.field3662 = class32.field196;
                            class500.field3661 = 50;
                            method2459(5);
                            field3807 = class230.field1801;
                        }
                    } else if (class230.field1801 == field3807) {
                        if (!class162.field1419.method193()) {
                            class500.field3662 = class32.field197 + class162.field1419.method1758() + "%";
                            class500.field3661 = 60;
                        } else if (!class390.field2780.method193()) {
                            class500.field3662 = class32.field197 + (80 + class249.field1902.method1758() / 6) + "%";
                            class500.field3661 = 60;
                        } else {
                            class475.method2182(class162.field1419);
                            class470.method2175(class162.field1419);
                            class372 var46 = class162.field1419;
                            var31 = class434.field2958;
                            class363.field2592 = var46;
                            class363.field2593 = var31;
                            class363.field2595 = class363.field2592.method214(3);
                            var33 = class162.field1419;
                            var35 = class434.field2958;
                            boolean var36 = field3779;
                            class304.field2178 = var33;
                            class304.field2176 = var35;
                            class304.field2224 = var36;
                            var6 = class162.field1419;
                            class372 var7 = class434.field2958;
                            class345.field2470 = var6;
                            class345.field2471 = var7;
                            class372 var8 = class162.field1419;
                            class86.field738 = var8;
                            class372 var9 = class162.field1419;
                            class372 var10 = class434.field2958;
                            boolean var11 = field3802;
                            class413 var12 = class58.field605;
                            class209.field1684 = var9;
                            class508.field3715 = var10;
                            class508.field3716 = var11;
                            class201.field1652 = class209.field1684.method214(10);
                            class317.field2286 = var12;
                            class124.method577(class162.field1419, class295.field2136, class65.field631);
                            class372 var13 = class162.field1419;
                            class372 var14 = class434.field2958;
                            class115.field1071 = var13;
                            class115.field1058 = var14;
                            class180.method863(class162.field1419);
                            class397.method1820(class162.field1419);
                            class372 var15 = class51.field573;
                            class372 var16 = class434.field2958;
                            class372 var17 = class398.field2811;
                            class372 var18 = class283.field2082;
                            int var19 = 0;
                            if (null != var15) {
                                class107.field1031 = var15;
                                class5.field27 = var16;
                                class492.field3613 = var17;
                                class538.field4282 = var18;
                                var19 = class107.field1031.method200();
                            }

                            class46.field542 = new class97[var19][];
                            class19.field66 = new boolean[var19];
                            class276.method1246(class162.field1419);
                            class372 var51 = class162.field1419;
                            class356.field2567 = var51;
                            class372 var20 = class162.field1419;
                            class102.field1005 = var20;
                            class372 var21 = class162.field1419;
                            class243.method1089(class162.field1419);
                            class89.method345(class162.field1419);
                            class148.method714(class162.field1419);
                            class5.field26 = new class31(class350.field2540, 54, class404.field2860, class162.field1419);
                            class238.field1834 = new class31(class350.field2540, 47, class404.field2860, class162.field1419);
                            class305.field2233 = new class195();
                            class372 var22 = class162.field1419;
                            class372 var23 = class398.field2811;
                            class372 var24 = class283.field2082;
                            class401.field2852 = var22;
                            class401.field2835 = var23;
                            class401.field2837 = var24;
                            class379.method1771(class162.field1419, class398.field2811);
                            class372 var25 = class162.field1419;
                            class372 var26 = class398.field2811;
                            class192.field1567 = var26;
                            if (var25.method193()) {
                                class192.field1556 = var25.method214(35);
                                class192.field1555 = new class192[class192.field1556];

                                for (int var27 = 0; var27 < class192.field1556; ++var27) {
                                    byte[] var28 = var25.method188(35, var27);
                                    class192.field1555[var27] = new class192(var27);
                                    if (var28 != null) {
                                        class192.field1555[var27].method886(new class78(var28));
                                        class192.field1555[var27].method888();
                                    }
                                }
                            }

                            class500.field3662 = class32.field390;
                            class500.field3661 = 60;
                            field3807 = class230.field1794;
                        }
                    } else if (field3807 == class230.field1794) {
                        var30 = 0;
                        if (field3855 == null) {
                            field3855 = class122.method539(class398.field2811, class414.field2901.field3471, 0);
                        } else {
                            ++var30;
                        }

                        if (class169.field1433 == null) {
                            class169.field1433 = class122.method539(class398.field2811, class414.field2901.field3461, 0);
                        } else {
                            ++var30;
                        }

                        if (null == class153.field1321) {
                            class153.field1321 = class274.method1220(class398.field2811, class414.field2901.field3464, 0);
                        } else {
                            ++var30;
                        }

                        if (class494.field3626 == null) {
                            class494.field3626 = class274.method1231(class398.field2811, class414.field2901.field3463, 0);
                        } else {
                            ++var30;
                        }

                        if (null == class432.field2936) {
                            class432.field2936 = class274.method1231(class398.field2811, class414.field2901.field3469, 0);
                        } else {
                            ++var30;
                        }

                        if (class99.field941 == null) {
                            class99.field941 = class274.method1231(class398.field2811, class414.field2901.field3460, 0);
                        } else {
                            ++var30;
                        }

                        if (class434.field2959 == null) {
                            class434.field2959 = class274.method1231(class398.field2811, class414.field2901.field3466, 0);
                        } else {
                            ++var30;
                        }

                        if (null == class128.field1146) {
                            class128.field1146 = class274.method1231(class398.field2811, class414.field2901.field3467, 0);
                        } else {
                            ++var30;
                        }

                        if (null == class475.field3399) {
                            class475.field3399 = class274.method1231(class398.field2811, class414.field2901.field3468, 0);
                        } else {
                            ++var30;
                        }

                        if (class29.field164 == null) {
                            class29.field164 = class274.method1220(class398.field2811, class414.field2901.field3465, 0);
                        } else {
                            ++var30;
                        }

                        if (null == class154.field1334) {
                            class154.field1334 = class274.method1220(class398.field2811, class414.field2901.field3470, 0);
                        } else {
                            ++var30;
                        }

                        if (var30 < 11) {
                            class500.field3662 = class32.field199 + var30 * 100 / 12 + "%";
                            class500.field3661 = 70;
                        } else {
                            class197.field1613 = class154.field1334;
                            class169.field1433.method1538();
                            var2 = (int) (Math.random() * 21.0D) - 10;
                            var3 = (int) (Math.random() * 21.0D) - 10;
                            var4 = (int) (Math.random() * 21.0D) - 10;
                            int var5 = (int) (Math.random() * 41.0D) - 20;
                            class153.field1321[0].method2586(var5 + var2, var3 + var5, var5 + var4);
                            class500.field3662 = class32.field200;
                            class500.field3661 = 70;
                            field3807 = class230.field1808;
                        }
                    } else if (field3807 == class230.field1808) {
                        if (!class164.field1425.method193()) {
                            class500.field3662 = class32.field201 + "0%";
                            class500.field3661 = 90;
                        } else {
                            class214.field1735 = new class444(class164.field1425, class398.field2811, 20, class290.field2121.method2550(), field3779 ? 64 : 128);
                            class334.method1568(class214.field1735);
                            class334.method1569(class290.field2121.method2550());
                            field3807 = class230.field1809;
                        }
                    } else if (class230.field1809 == field3807) {
                        var30 = class214.field1735.method2026();
                        if (var30 < 100) {
                            class500.field3662 = class32.field201 + var30 + "%";
                            class500.field3661 = 90;
                        } else {
                            class500.field3662 = class32.field479;
                            class500.field3661 = 90;
                            field3807 = class230.field1806;
                        }
                    } else if (field3807 == class230.field1806) {
                        class151.field1306 = new class88();
                        class479.field3426.method502(class151.field1306, 10);
                        class500.field3662 = class32.field307;
                        class500.field3661 = 92;
                        field3807 = class230.field1805;
                    } else if (class230.field1805 == field3807) {
                        if (!class202.field1656.method208("huffman", "")) {
                            class500.field3662 = class32.field226 + 0 + "%";
                            class500.field3661 = 94;
                        } else {
                            class262 var29 = new class262(class202.field1656.method207("huffman", ""));
                            class385.method1779(var29);
                            class500.field3662 = class32.field205;
                            class500.field3661 = 94;
                            field3807 = class230.field1799;
                        }
                    } else if (class230.field1799 == field3807) {
                        if (!class51.field573.method193()) {
                            class500.field3662 = class32.field206 + class51.field573.method1758() * 4 / 5 + "%";
                            class500.field3661 = 96;
                        } else if (!class249.field1902.method193()) {
                            class500.field3662 = class32.field206 + (80 + class249.field1902.method1758() / 6) + "%";
                            class500.field3661 = 96;
                        } else if (!class283.field2082.method193()) {
                            class500.field3662 = class32.field206 + (96 + class283.field2082.method1758() / 50) + "%";
                            class500.field3661 = 96;
                        } else {
                            class500.field3662 = class32.field207;
                            class500.field3661 = 98;
                            if (class249.field1902.method210("version.dat", "")) {
                                class78 var1 = new class78(class249.field1902.method207("version.dat", ""));
                                var1.method309();
                            }

                            field3807 = class230.field1807;
                        }
                    } else if (field3807 == class230.field1807) {
                        class500.field3661 = 100;
                        if (class404.field2861.method200() > 0 && !class404.field2861.method209(class263.field1950.field1949)) {
                            class500.field3662 = class32.field208 + class404.field2861.method215(class263.field1950.field1949) / 10 + "%";
                        } else {
                            if (null == class466.field3310) {
                                class466.field3310 = new class100();
                                class466.field3310.method431(class404.field2861, class192.field1578, class139.field1226, class303.field2170, field3844, class153.field1321);
                            }

                            class500.field3662 = class32.field308;
                            field3807 = class230.field1796;
                        }
                    } else {
                        if (class230.field1796 == field3807) {
                            method2459(10);
                        }

                    }
                }
            }
        }
    }

    static class372 method2395(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
        class239 var6 = null;
        if (null != class6.field33) {
            var6 = new class239(var0, class6.field33, class224.field1775[var0], 1000000);
        }

        return new class372(var6, class297.field2148, class426.field2930, var0, var1, var2, true, var4);
    }

    static void method2381() {
        field3840.method1364();
        field3840.field2239.field697 = 0;
        field3840.field2235 = null;
        field3840.field2240 = null;
        field3840.field2246 = null;
        field3840.field2247 = null;
        field3840.field2241 = 0;
        field3840.field2245 = 0;
        field3795 = 0;
        method2437();
        field4028 = 0;
        field4026 = 0;

        int var1;
        for (var1 = 0; var1 < 2048; ++var1) {
            field3948[var1] = null;
        }

        class180.field1528 = null;

        for (var1 = 0; var1 < field3835.length; ++var1) {
            class424 var2 = field3835[var1];
            if (var2 != null) {
                var2.field4126 = -1;
                var2.field4096 = false;
            }
        }

        class163.method801();
        method2459(30);

        for (var1 = 0; var1 < 100; ++var1) {
            field3785[var1] = true;
        }

        method2361();
    }

    static void method2491() {
        field3840.method1363();
        method2373();
        class329.field2414.method737();

        for (int var1 = 0; var1 < 4; ++var1) {
            field3850[var1].method29();
        }

        field4014.method2123();
        System.gc();
        class443.method2021(0, 0);
        class357.method1703();
        field4047 = false;
        class51.method144();
        method2459(10);
    }

    static long method2386() {
        return field3905;
    }

    static void method2373() {
        class475.method2181();
        class470.field3360.method1304();
        class363.method1715();
        class61.method180();
        class345.field2472.method1304();
        class345.field2478.method1304();
        class508.field3717.method1304();
        class508.field3762.method1304();
        class508.field3719.method1304();
        class124.field1127.method1304();
        class124.field1118.method1304();
        class124.field1126.method1304();
        class115.field1059.method1304();
        class115.field1060.method1304();
        class180.field1522.method1304();
        class397.field2796.method1304();
        class5.field26.method93();
        class238.field1834.method93();
        class401.method1850();
        class379.field2745.method1304();
        class379.field2746.method1304();
        class86.field739.method1304();
        class243.method1088();
        class192.field1557.method1304();
        class48.method139();
        class148.method712();
        field3971.method1304();
        field3861.method1304();
        class52.field586.method1304();
        class97.method427();
        ((class444) class334.field2431.field2606).method2029();
        class443.field3003.method1304();
        field4066.method1607();
        class295.field2136.method203();
        class65.field631.method203();
        class51.field573.method203();
        class215.field1739.method203();
        class452.field3111.method203();
        class34.field491.method203();
        class434.field2958.method203();
        class398.field2811.method203();
        class164.field1425.method203();
        class202.field1656.method203();
        class403.field2859.method203();
        class249.field1902.method203();
        class390.field2780.method203();
    }

    static void method2425() {
        if (field3828 > 0) {
            method2491();
        } else {
            field3843.method1258();
            method2459(40);
            class75.field692 = field3840.method1362();
            field3840.method1361();
        }
    }

    static void method2374(boolean var0) {
        if (var0) {
            field4025 = class500.field3675 ? class360.field2577 : class360.field2576;
        } else {
            field4025 = class290.field2121.method2545(class500.field3678) ? class360.field2580 : class360.field2583;
        }

    }

    static void method2453() {
        if (class392.field2785 != null) {
            class392.field2785.method1833();
        }

    }

    static void method2405(class124 var0, int var1, int var2, int var3) {
        if (field4030 < 50 && class290.field2121.method2555() != 0) {
            if (null != var0.field1119 && var1 < var0.field1119.length) {
                method2345(var0.field1119[var1], var2, var3);
            }
        }
    }

    static void method2413(class124 var0, int var1, int var2, int var3) {
        if (field4030 < 50 && class290.field2121.method2555() != 0) {
            if (null != var0.field1133 && var0.field1133.containsKey(var1)) {
                method2345(var0.field1133.get(var1), var2, var3);
            }
        }
    }

    static void method2345(int var0, int var1, int var2) {
        if (var0 != 0) {
            int var4 = var0 >> 8;
            int var5 = var0 >> 4 & 7;
            int var6 = var0 & 15;
            field4031[field4030] = var4;
            field4032[field4030] = var5;
            field3987[field4030] = 0;
            field3819[field4030] = null;
            int var7 = (var1 - 64) / 128;
            int var8 = (var2 - 64) / 128;
            field3782[field4030] = (var7 << 16) + (var8 << 8) + var6;
            ++field4030;
        }
    }

    static void method2346(int var0, int var1, int var2) {
        if (class290.field2121.method2537() != 0 && var1 != 0 && field4030 < 50) {
            field4031[field4030] = var0;
            field4032[field4030] = var1;
            field3987[field4030] = var2;
            field3819[field4030] = null;
            field3782[field4030] = 0;
            ++field4030;
        }

    }

    static void method2449(int var0) {
        if (var0 == -1 && !field4047) {
            class443.method2021(0, 0);
        } else if (var0 != -1 && !class141.method650(var0) && class290.field2121.method2529() != 0) {
            ArrayList<class537> var2 = new ArrayList<class537>();
            var2.add(new class537(class34.field491, var0, 0, class290.field2121.method2529(), false));
            if (field4047) {
                class141.field1241.clear();
                class141.field1241.addAll(var2);
                class141.method654(0, 100, 100, 0);
            } else {
                class141.method648(var2, 0, 100, 100, 0, false);
            }
        }

    }

    static void method2362(int var0, int var1) {
        if (class290.field2121.method2529() != 0 && var0 != -1) {
            ArrayList<class537> var3 = new ArrayList<>();
            var3.add(new class537(class403.field2859, var0, 0, class290.field2121.method2529(), false));
            class141.method648(var3, 0, 0, 0, 0, true);
            field4047 = true;
        }

    }

    static void method2476() {
        if (class405.field2869) {
            for (int var1 = 0; var1 < class172.field1443; ++var1) {
                class283 var2 = field3948[class172.field1444[var1]];
                var2.method1296();
            }

            class405.field2869 = false;
        }

    }

    static void method2408() {
        if (field4021 != class201.field1651) {
            field4021 = class201.field1651;
            method2335(class201.field1651);
        }

    }

    static void method2468(class97 var0, int var1, int var2) {
        if (field4028 == 0 || field4028 == 3) {
            if (!field3888 && (class499.field3645 == 1 || !class218.field1747 && class499.field3645 == 4)) {
                class42 var4 = var0.method391(true);
                if (var4 == null) {
                    return;
                }

                int var5 = class499.field3646 - var1;
                int var6 = class499.field3647 - var2;
                if (var4.method117(var5, var6)) {
                    var5 -= var4.field529 / 2;
                    var6 -= var4.field528 / 2;
                    int var7 = field3953 & 2047;
                    int var8 = class334.field2429[var7];
                    int var9 = class334.field2427[var7];
                    int var10 = var9 * var5 + var8 * var6 >> 11;
                    int var11 = var9 * var6 - var8 * var5 >> 11;
                    int var12 = class180.field1528.field4121 + var10 >> 7;
                    int var13 = class180.field1528.field4092 - var11 >> 7;
                    class46 var14 = class46.method134(class488.field3538, field3840.field2238);
                    var14.field541.method249(18);
                    var14.field541.method285(class357.field2573 + var12);
                    var14.field541.method312(var13 + class5.field28);
                    var14.field541.method296(field3923.method958(82) ? (field3923.method958(81) ? 2 : 1) : 0);
                    var14.field541.method249(var5);
                    var14.field541.method249(var6);
                    var14.field541.method290(field3953);
                    var14.field541.method249(57);
                    var14.field541.method249(0);
                    var14.field541.method249(0);
                    var14.field541.method249(89);
                    var14.field541.method290(class180.field1528.field4121);
                    var14.field541.method290(class180.field1528.field4092);
                    var14.field541.method249(63);
                    field3840.method1359(var14);
                    field4026 = var12;
                    field3949 = var13;
                }
            }

        }
    }

    static void method2433() {
        int[] var1 = class172.field1444;

        int var2;
        for (var2 = 0; var2 < class172.field1443; ++var2) {
            class283 var3 = field3948[var1[var2]];
            if (var3 != null && var3.field4115 > 0) {
                --var3.field4115;
                if (var3.field4115 == 0) {
                    var3.field4162 = null;
                }
            }
        }

        for (var2 = 0; var2 < field3836; ++var2) {
            int var5 = field3774[var2];
            class424 var4 = field3835[var5];
            if (var4 != null && var4.field4115 > 0) {
                --var4.field4115;
                if (var4.field4115 == 0) {
                    var4.field4162 = null;
                }
            }
        }

    }

    static int method2377(int var0) {
        return Math.min(Math.max(var0, 128), 383);
    }

    static int method2336(int var0) {
        return Math.abs(var0 - class225.field1779) > 1024 ? var0 + 2048 * (var0 < class225.field1779 ? 1 : -1) : var0;
    }

    static void method2389(int var0, int var1, int var2) {
        if (class345.field2506 < var0) {
            class345.field2506 += class412.field2900 + class499.field3649 * (var0 - class345.field2506) / 1000;
            if (class345.field2506 > var0) {
                class345.field2506 = var0;
            }
        }

        if (class345.field2506 > var0) {
            class345.field2506 -= class412.field2900 + class499.field3649 * (class345.field2506 - var0) / 1000;
            if (class345.field2506 < var0) {
                class345.field2506 = var0;
            }
        }

        if (class446.field3027 < var1) {
            class446.field3027 += class412.field2900 + (var1 - class446.field3027) * class499.field3649 / 1000;
            if (class446.field3027 > var1) {
                class446.field3027 = var1;
            }
        }

        if (class446.field3027 > var1) {
            class446.field3027 -= (class446.field3027 - var1) * class499.field3649 / 1000 + class412.field2900;
            if (class446.field3027 < var1) {
                class446.field3027 = var1;
            }
        }

        if (class360.field2585 < var2) {
            class360.field2585 += class412.field2900 + (var2 - class360.field2585) * class499.field3649 / 1000;
            if (class360.field2585 > var2) {
                class360.field2585 = var2;
            }
        }

        if (class360.field2585 > var2) {
            class360.field2585 -= (class360.field2585 - var2) * class499.field3649 / 1000 + class412.field2900;
            if (class360.field2585 < var2) {
                class360.field2585 = var2;
            }
        }

    }

    static void method2398() {
        int var1;
        int var2;
        int var3;
        if (!field4037) {
            var1 = 64 + class172.field1439 * 128;
            var2 = class533.field4244 * 128 + 64;
            var3 = method2342(var1, var2, class201.field1651) - class397.field2799;
            method2389(var1, var3, var2);
        } else if (null != field4040) {
            class345.field2506 = field4040.method661();
            class360.field2585 = field4040.method662();
            if (field4039) {
                class446.field3027 = field4040.method663();
            } else {
                class446.field3027 = method2342(class345.field2506, class360.field2585, class201.field1651) - field4040.method663();
            }

            field4040.method2119();
        }

        if (!field4038) {
            var1 = 64 + class316.field2270 * 128;
            var2 = class180.field1525 * 128 + 64;
            var3 = method2342(var1, var2, class201.field1651) - class23.field122;
            int var4 = var1 - class345.field2506;
            int var5 = var3 - class446.field3027;
            int var6 = var2 - class360.field2585;
            int var7 = (int) Math.sqrt(var6 * var6 + var4 * var4);
            int var8 = (int) (Math.atan2(var5, var7) * 325.9490051269531D) & 2047;
            int var9 = (int) (Math.atan2(var4, var6) * -325.9490051269531D) & 2047;
            class186.method872(var8, var9);
        } else {
            if (field3857 != null) {
                class214.field1736 = field3857.method1066();
                class214.field1736 = Math.min(Math.max(class214.field1736, 128), 383);
                field3857.method2119();
            }

            if (field3831 != null) {
                class225.field1779 = field3831.method1066() & 2047;
                field3831.method2119();
            }
        }

    }

    static void method2482() {
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        if (field3868 == 0) {
            var1 = class180.field1528.field4121;
            var2 = class180.field1528.field4092;
            if (class81.field710 - var1 < -500 || class81.field710 - var1 > 500 || class201.field1653 - var2 < -500 || class201.field1653 - var2 > 500) {
                class81.field710 = var1;
                class201.field1653 = var2;
            }

            if (class81.field710 != var1) {
                class81.field710 += (var1 - class81.field710) / 16;
            }

            if (class201.field1653 != var2) {
                class201.field1653 += (var2 - class201.field1653) / 16;
            }

            var3 = class81.field710 >> 7;
            var4 = class201.field1653 >> 7;
            var5 = method2342(class81.field710, class201.field1653, class201.field1651);
            var6 = 0;
            int var7;
            if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
                for (var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
                    for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                        int var9 = class201.field1651;
                        if (var9 < 3 && (class122.field1109[1][var7][var8] & 2) == 2) {
                            ++var9;
                        }

                        int var10 = var5 - class122.field1107[var9][var7][var8];
                        if (var10 > var6) {
                            var6 = var10;
                        }
                    }
                }
            }

            var7 = var6 * 192;
            if (var7 > 98048) {
                var7 = 98048;
            }

            if (var7 < 32768) {
                var7 = 32768;
            }

            if (var7 > field3917) {
                field3917 += (var7 - field3917) / 24;
            } else if (var7 < field3917) {
                field3917 += (var7 - field3917) / 80;
            }

            class518.field4176 = method2342(class180.field1528.field4121, class180.field1528.field4092, class201.field1651) - field3869;
        } else if (field3868 == 1) {
            method2349();
            short var11 = -1;
            if (field3923.method958(33)) {
                var11 = 0;
            } else if (field3923.method958(49)) {
                var11 = 1024;
            }

            if (field3923.method958(48)) {
                if (var11 == 0) {
                    var11 = 1792;
                } else if (var11 == 1024) {
                    var11 = 1280;
                } else {
                    var11 = 1536;
                }
            } else if (field3923.method958(50)) {
                if (var11 == 0) {
                    var11 = 256;
                } else if (var11 == 1024) {
                    var11 = 768;
                } else {
                    var11 = 512;
                }
            }

            byte var12 = 0;
            if (field3923.method958(35)) {
                var12 = -1;
            } else if (field3923.method958(51)) {
                var12 = 1;
            }

            var3 = 0;
            if (var11 >= 0 || var12 != 0) {
                var3 = field3923.method958(81) ? field3874 : field3873;
                var3 *= 16;
                field3871 = var11;
                field3872 = var12;
            }

            if (field3870 < var3) {
                field3870 += var3 / 8;
                if (field3870 > var3) {
                    field3870 = var3;
                }
            } else if (field3870 > var3) {
                field3870 = field3870 * 9 / 10;
            }

            if (field3870 > 0) {
                var4 = field3870 / 16;
                if (field3871 >= 0) {
                    var1 = field3871 - class225.field1779 & 2047;
                    var5 = class334.field2429[var1];
                    var6 = class334.field2427[var1];
                    class81.field710 += var5 * var4 / 65536;
                    class201.field1653 += var6 * var4 / 65536;
                }

                if (field3872 != 0) {
                    class518.field4176 += field3872 * var4;
                    if (class518.field4176 > 0) {
                        class518.field4176 = 0;
                    }
                }
            } else {
                field3871 = -1;
                field3872 = -1;
            }

            if (field3923.method958(13)) {
                method2354();
            }
        }

        if (class499.field3641 == 4 && class218.field1747) {
            var1 = class499.field3634 - field3931;
            field3865 = var1 * 2;
            field3931 = var1 != -1 && var1 != 1 ? (field3931 + class499.field3634) / 2 : class499.field3634;
            var2 = field3787 - class499.field3651;
            field3864 = var2 * 2;
            field3787 = var2 != -1 && var2 != 1 ? (class499.field3651 + field3787) / 2 : class499.field3651;
        } else {
            if (field3923.method958(96)) {
                field3864 += (-24 - field3864) / 2;
            } else if (field3923.method958(97)) {
                field3864 += (24 - field3864) / 2;
            } else {
                field3864 /= 2;
            }

            if (field3923.method958(98)) {
                field3865 += (12 - field3865) / 2;
            } else if (field3923.method958(99)) {
                field3865 += (-12 - field3865) / 2;
            } else {
                field3865 /= 2;
            }

            field3931 = class499.field3634;
            field3787 = class499.field3651;
        }

        field3953 = field3864 / 2 + field3953 & 2047;
        field3814 += field3865 / 2;
        if (field3814 < 128) {
            field3814 = 128;
        }

        if (field3814 > 383) {
            field3814 = 383;
        }

    }

    static void method2454(class514 var0, int var1) {
        if (var0.field4147 >= field4078) {
            method2460(var0);
        } else {
            int var5;
            int var6;
            int var8;
            int var9;
            int var13;
            if (var0.field4148 >= field4078) {
                boolean var3 = field4078 == var0.field4148 || var0.field4136 == -1 || var0.field4153 != 0;
                if (!var3) {
                    class124 var4 = class124.method575(var0.field4136);
                    if (var4 != null && !var4.method574()) {
                        var3 = var0.field4138 + 1 > var4.field1135[var0.field4137];
                    } else {
                        var3 = true;
                    }
                }

                if (var3) {
                    var13 = var0.field4148 - var0.field4147;
                    var5 = field4078 - var0.field4147;
                    var6 = var0.field4095 * 64 + var0.field4143 * 128;
                    int var7 = var0.field4095 * 64 + var0.field4145 * 128;
                    var8 = var0.field4141 * 128 + var0.field4095 * 64;
                    var9 = var0.field4095 * 64 + var0.field4111 * 128;
                    var0.field4121 = ((var13 - var5) * var6 + var5 * var8) / var13;
                    var0.field4092 = (var5 * var9 + var7 * (var13 - var5)) / var13;
                }

                var0.field4165 = 0;
                var0.field4132 = var0.field4149;
                var0.field4093 = var0.field4132;
            } else {
                var0.field4104 = var0.field4097;
                if (var0.field4139 == 0) {
                    var0.field4165 = 0;
                } else {
                    label297:
                    {
                        if (var0.field4136 != -1 && var0.field4153 == 0) {
                            class124 var12 = class124.method575(var0.field4136);
                            if (var0.field4155 > 0 && var12.field1137 == 0) {
                                ++var0.field4165;
                                break label297;
                            }

                            if (var0.field4155 <= 0 && var12.field1138 == 0) {
                                ++var0.field4165;
                                break label297;
                            }
                        }

                        int var14 = var0.field4121;
                        var13 = var0.field4092;
                        var5 = 128 * var0.field4166[var0.field4139 - 1] + var0.field4095 * 64;
                        var6 = var0.field4095 * 64 + 128 * var0.field4163[var0.field4139 - 1];
                        if (var14 < var5) {
                            if (var13 < var6) {
                                var0.field4132 = 1280;
                            } else if (var13 > var6) {
                                var0.field4132 = 1792;
                            } else {
                                var0.field4132 = 1536;
                            }
                        } else if (var14 > var5) {
                            if (var13 < var6) {
                                var0.field4132 = 768;
                            } else if (var13 > var6) {
                                var0.field4132 = 256;
                            } else {
                                var0.field4132 = 512;
                            }
                        } else if (var13 < var6) {
                            var0.field4132 = 1024;
                        } else if (var13 > var6) {
                            var0.field4132 = 0;
                        }

                        class447 var15 = var0.field4164[var0.field4139 - 1];
                        if (var5 - var14 <= 256 && var5 - var14 >= -256 && var6 - var13 <= 256 && var6 - var13 >= -256) {
                            var8 = var0.field4132 - var0.field4093 & 2047;
                            if (var8 > 1024) {
                                var8 -= 2048;
                            }

                            var9 = var0.field4101;
                            if (var8 >= -256 && var8 <= 256) {
                                var9 = var0.field4100;
                            } else if (var8 >= 256 && var8 < 768) {
                                var9 = var0.field4150;
                            } else if (var8 >= -768 && var8 <= -256) {
                                var9 = var0.field4102;
                            }

                            if (var9 == -1) {
                                var9 = var0.field4100;
                            }

                            var0.field4104 = var9;
                            int var10 = 4;
                            boolean var11 = true;
                            if (var0 instanceof class424) {
                                var11 = ((class424) var0).field2920.field2469;
                            }

                            if (var11) {
                                if (var0.field4132 != var0.field4093 && var0.field4126 == -1 && var0.field4160 != 0) {
                                    var10 = 2;
                                }

                                if (var0.field4139 > 2) {
                                    var10 = 6;
                                }

                                if (var0.field4139 > 3) {
                                    var10 = 8;
                                }

                                if (var0.field4165 > 0 && var0.field4139 > 1) {
                                    var10 = 8;
                                    --var0.field4165;
                                }
                            } else {
                                if (var0.field4139 > 1) {
                                    var10 = 6;
                                }

                                if (var0.field4139 > 2) {
                                    var10 = 8;
                                }

                                if (var0.field4165 > 0 && var0.field4139 > 1) {
                                    var10 = 8;
                                    --var0.field4165;
                                }
                            }

                            if (var15 == class447.field3030) {
                                var10 <<= 1;
                            } else if (var15 == class447.field3029) {
                                var10 >>= 1;
                            }

                            if (var10 >= 8) {
                                if (var0.field4104 == var0.field4100 && var0.field4161 != -1) {
                                    var0.field4104 = var0.field4161;
                                } else if (var0.field4101 == var0.field4104 && var0.field4105 != -1) {
                                    var0.field4104 = var0.field4105;
                                } else if (var0.field4104 == var0.field4102 && var0.field4146 != -1) {
                                    var0.field4104 = var0.field4146;
                                } else if (var0.field4150 == var0.field4104 && var0.field4107 != -1) {
                                    var0.field4104 = var0.field4107;
                                }
                            } else if (var10 <= 2) {
                                if (var0.field4104 == var0.field4100 && var0.field4108 != -1) {
                                    var0.field4104 = var0.field4108;
                                } else if (var0.field4104 == var0.field4101 && var0.field4109 != -1) {
                                    var0.field4104 = var0.field4109;
                                } else if (var0.field4102 == var0.field4104 && var0.field4110 != -1) {
                                    var0.field4104 = var0.field4110;
                                } else if (var0.field4150 == var0.field4104 && var0.field4140 != -1) {
                                    var0.field4104 = var0.field4140;
                                }
                            }

                            if (var5 != var14 || var6 != var13) {
                                if (var14 < var5) {
                                    var0.field4121 += var10;
                                    if (var0.field4121 > var5) {
                                        var0.field4121 = var5;
                                    }
                                } else if (var14 > var5) {
                                    var0.field4121 -= var10;
                                    if (var0.field4121 < var5) {
                                        var0.field4121 = var5;
                                    }
                                }

                                if (var13 < var6) {
                                    var0.field4092 += var10;
                                    if (var0.field4092 > var6) {
                                        var0.field4092 = var6;
                                    }
                                } else if (var13 > var6) {
                                    var0.field4092 -= var10;
                                    if (var0.field4092 < var6) {
                                        var0.field4092 = var6;
                                    }
                                }
                            }

                            if (var5 == var0.field4121 && var0.field4092 == var6) {
                                --var0.field4139;
                                if (var0.field4155 > 0) {
                                    --var0.field4155;
                                }
                            }
                        } else {
                            var0.field4121 = var5;
                            var0.field4092 = var6;
                            --var0.field4139;
                            if (var0.field4155 > 0) {
                                --var0.field4155;
                            }
                        }
                    }
                }
            }
        }

        if (var0.field4121 < 128 || var0.field4092 < 128 || var0.field4121 >= 13184 || var0.field4092 >= 13184) {
            var0.field4136 = -1;
            var0.field4147 = 0;
            var0.field4148 = 0;
            var0.method2509();
            var0.field4121 = 128 * var0.field4166[0] + var0.field4095 * 64;
            var0.field4092 = var0.field4163[0] * 128 + var0.field4095 * 64;
            var0.method2502();
        }

        if (var0 == class180.field1528 && (var0.field4121 < 1536 || var0.field4092 < 1536 || var0.field4121 >= 11776 || var0.field4092 >= 11776)) {
            var0.field4136 = -1;
            var0.field4147 = 0;
            var0.field4148 = 0;
            var0.method2509();
            var0.field4121 = 128 * var0.field4166[0] + var0.field4095 * 64;
            var0.field4092 = var0.field4163[0] * 128 + var0.field4095 * 64;
            var0.method2502();
        }

        class404.method1854(var0);
        class113.method517(var0);
    }

    static void method2460(class514 var0) {
        int var2 = Math.max(1, var0.field4147 - field4078);
        int var3 = var0.field4143 * 128 + var0.field4095 * 64;
        int var4 = var0.field4095 * 64 + var0.field4145 * 128;
        var0.field4121 += (var3 - var0.field4121) / var2;
        var0.field4092 += (var4 - var0.field4092) / var2;
        var0.field4165 = 0;
        var0.field4132 = var0.field4149;
    }

    static void method2448() {
        if (null != class466.field3310) {
            class466.field3310.method437(class201.field1651, class357.field2573 + (class180.field1528.field4121 >> 7), class5.field28 + (class180.field1528.field4092 >> 7), false);
            class466.field3310.method453();
        }

    }

    static void method2493(class283 var0, int var1, int var2) {
        if (var1 == var0.field4136 && var1 != -1) {
            int var4 = class124.method575(var1).field1139;
            if (var4 == 1) {
                var0.field4137 = 0;
                var0.field4138 = 0;
                var0.field4153 = var2;
                var0.field4118 = 0;
            }

            if (var4 == 2) {
                var0.field4118 = 0;
            }
        } else if (var1 == -1 || var0.field4136 == -1 || class124.method575(var1).field1132 >= class124.method575(var0.field4136).field1132) {
            var0.field4136 = var1;
            var0.field4137 = 0;
            var0.field4138 = 0;
            var0.field4153 = var2;
            var0.field4118 = 0;
            var0.field4155 = var0.field4139;
        }

    }

    static int method2423() {
        return field4006 ? 2 : 1;
    }

    static void method2361() {
        class46 var1 = class46.method134(class488.field3587, field3840.field2238);
        var1.field541.method249(method2423());
        var1.field541.method290(class223.field1763);
        var1.field541.method290(class519.field4188);
        field3840.method1359(var1);
    }

    static void method2480(String var0, boolean var1) {
        if (field3901) {
            boolean var3 = true;
            boolean var4 = true;
            boolean var5 = true;
            int var6 = class21.field75.method944(var0, 250);
            int var7 = class21.field75.method923(var0, 250) * 13;
            class415.method1914(6, 6, var6 + 4 + 4, var7 + 4 + 4, 0);
            class415.method1917(6, 6, 4 + 4 + var6, 4 + var7 + 4, 16777215);
            class21.field75.method920(var0, 10, 10, var6, var7, 16777215, -1, 1, 1, 0);
            boolean var8 = true;
            boolean var9 = true;
            int var10 = 4 + var6 + 4;
            int var11 = 4 + var7 + 4;

            for (int var12 = 0; var12 < field3946; ++var12) {
                if (field4000[var12] + field4002[var12] > 6 && field4000[var12] < var10 + 6 && field4001[var12] + field4003[var12] > 6 && field4001[var12] < var11 + 6) {
                    field3785[var12] = true;
                }
            }

            if (var1) {
                class295.field2141.method2580(0, 0);
            } else {
                method2334(10, 10, var6, var7);
            }

        }
    }

    static void method2399(int var0, int var1, int var2, int var3) {
        ++field3945;
        if (field4026 == class180.field1528.field4121 >> 7 && field3949 == class180.field1528.field4092 >> 7) {
            field4026 = 0;
        }

        method2430();
        method2372();
        method2439(true);
        method2403();
        method2439(false);

        int var7;
        for (class143 var5 = (class143) field3902.method122(); null != var5; var5 = (class143) field3902.method124()) {
            if (var5.field1254 == class201.field1651 && field4078 <= var5.field1263) {
                if (field4078 >= var5.field1278) {
                    class424 var6;
                    class283 var38;
                    if (!var5.field1255 && var5.field1269 != 0) {
                        if (var5.field1269 > 0) {
                            var6 = field3835[var5.field1269 - 1];
                            if (null != var6 && var6.field4121 >= 0 && var6.field4121 < 13312 && var6.field4092 >= 0 && var6.field4092 < 13312) {
                                var5.field1264 = var6.field4121;
                                var5.field1253 = var6.field4092;
                                var5.method658(var5.field1259, var5.field1260, var5.field1261, field4078);
                            }
                        } else {
                            var7 = -var5.field1269 - 1;
                            if (field3903 == var7) {
                                var38 = class180.field1528;
                            } else {
                                var38 = field3948[var7];
                            }

                            if (var38 != null && var38.field4121 >= 0 && var38.field4121 < 13312 && var38.field4092 >= 0 && var38.field4092 < 13312) {
                                var5.field1264 = var38.field4121;
                                var5.field1253 = var38.field4092;
                                var5.method658(var5.field1259, var5.field1260, var5.field1261, field4078);
                            }
                        }
                    }

                    if (var5.field1267 > 0) {
                        var6 = field3835[var5.field1267 - 1];
                        if (var6 != null && var6.field4121 >= 0 && var6.field4121 < 13312 && var6.field4092 >= 0 && var6.field4092 < 13312) {
                            var5.method658(var6.field4121, var6.field4092, method2342(var6.field4121, var6.field4092, var5.field1254) - var5.field1258, field4078);
                        }
                    }

                    if (var5.field1267 < 0) {
                        var7 = -var5.field1267 - 1;
                        if (var7 == field3903) {
                            var38 = class180.field1528;
                        } else {
                            var38 = field3948[var7];
                        }

                        if (null != var38 && var38.field4121 >= 0 && var38.field4121 < 13312 && var38.field4092 >= 0 && var38.field4092 < 13312) {
                            var5.method658(var38.field4121, var38.field4092, method2342(var38.field4121, var38.field4092, var5.field1254) - var5.field1258, field4078);
                        }
                    }

                    var5.method659(field3854);
                    class329.field2414.method745(class201.field1651, (int) var5.field1277, (int) var5.field1270, (int) var5.field1271, 60, var5, var5.field1257, -1L, false);
                }
            } else {
                var5.method221();
            }
        }

        class169.method811();
        class29.method88(var0, var1, var2, var3, true);
        var0 = field4056;
        var1 = field4057;
        var2 = field3991;
        var3 = field3866;
        class415.method1921(var0, var1, var2 + var0, var1 + var3);
        class334.method1579();
        class415.method1923();
        int var37 = field3814;
        if (field3917 / 256 > var37) {
            var37 = field3917 / 256;
        }

        if (field4043[4] && field3997[4] + 128 > var37) {
            var37 = field3997[4] + 128;
        }

        int var39 = field3953 & 2047;
        var7 = class81.field710;
        int var8 = class518.field4176;
        int var9 = class201.field1653;
        int var10 = method2415(var37);
        int var12 = var3 - 334;
        if (var12 < 0) {
            var12 = 0;
        } else if (var12 > 100) {
            var12 = 100;
        }

        int var13 = field4050 + (field4051 - field4050) * var12 / 100;
        int var11 = var13 * var10 / 256;
        var12 = 2048 - var37 & 2047;
        var13 = 2048 - var39 & 2047;
        int var14 = 0;
        int var15 = 0;
        int var16 = var11;
        int var17;
        int var18;
        int var19;
        if (var12 != 0) {
            var17 = class334.field2429[var12];
            var18 = class334.field2427[var12];
            var19 = 0 - var17 * var11 >> 16;
            var16 = var18 * var11 >> 16;
            var15 = var19;
        }

        if (var13 != 0) {
            var17 = class334.field2429[var13];
            var18 = class334.field2427[var13];
            var19 = var17 * var16 >> 16;
            var16 = var18 * var16 >> 16;
            var14 = var19;
        }

        if (field4036) {
            class24.field130 = var7 - var14;
            class305.field2227 = var8 - var15;
            class33.field486 = var9 - var16;
            class382.field2758 = var37;
            class277.field2027 = var39;
        } else {
            class345.field2506 = var7 - var14;
            class446.field3027 = var8 - var15;
            class360.field2585 = var9 - var16;
            class214.field1736 = var37;
            class225.field1779 = var39;
        }

        if (field3868 == 1 && field3863 >= 2 && field4078 % 50 == 0 && (class180.field1528.field4121 >> 7 != class81.field710 >> 7 || class201.field1653 >> 7 != class180.field1528.field4092 >> 7)) {
            var17 = class180.field1528.field2074;
            var18 = (class81.field710 >> 7) + class357.field2573;
            var19 = class5.field28 + (class201.field1653 >> 7);
            method2375(var18, var19, var17, true);
        }

        int var21;
        if (!field4036) {
            if (class290.field2121.method2528()) {
                var12 = class201.field1651;
            } else {
                label554:
                {
                    var13 = 3;
                    if (class214.field1736 < 310) {
                        label546:
                        {
                            if (field3868 == 1) {
                                var14 = class81.field710 >> 7;
                                var15 = class201.field1653 >> 7;
                            } else {
                                var14 = class180.field1528.field4121 >> 7;
                                var15 = class180.field1528.field4092 >> 7;
                            }

                            var16 = class345.field2506 >> 7;
                            var17 = class360.field2585 >> 7;
                            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                                if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                                    if ((class122.field1109[class201.field1651][var16][var17] & 4) != 0) {
                                        var13 = class201.field1651;
                                    }

                                    if (var14 > var16) {
                                        var18 = var14 - var16;
                                    } else {
                                        var18 = var16 - var14;
                                    }

                                    if (var15 > var17) {
                                        var19 = var15 - var17;
                                    } else {
                                        var19 = var17 - var15;
                                    }

                                    int var20;
                                    if (var18 > var19) {
                                        var20 = var19 * 65536 / var18;
                                        var21 = 32768;

                                        while (true) {
                                            if (var16 == var14) {
                                                break label546;
                                            }

                                            if (var16 < var14) {
                                                ++var16;
                                            } else if (var16 > var14) {
                                                --var16;
                                            }

                                            if ((class122.field1109[class201.field1651][var16][var17] & 4) != 0) {
                                                var13 = class201.field1651;
                                            }

                                            var21 += var20;
                                            if (var21 >= 65536) {
                                                var21 -= 65536;
                                                if (var17 < var15) {
                                                    ++var17;
                                                } else if (var17 > var15) {
                                                    --var17;
                                                }

                                                if ((class122.field1109[class201.field1651][var16][var17] & 4) != 0) {
                                                    var13 = class201.field1651;
                                                }
                                            }
                                        }
                                    } else {
                                        if (var19 > 0) {
                                            var20 = var18 * 65536 / var19;
                                            var21 = 32768;

                                            while (var15 != var17) {
                                                if (var17 < var15) {
                                                    ++var17;
                                                } else if (var17 > var15) {
                                                    --var17;
                                                }

                                                if ((class122.field1109[class201.field1651][var16][var17] & 4) != 0) {
                                                    var13 = class201.field1651;
                                                }

                                                var21 += var20;
                                                if (var21 >= 65536) {
                                                    var21 -= 65536;
                                                    if (var16 < var14) {
                                                        ++var16;
                                                    } else if (var16 > var14) {
                                                        --var16;
                                                    }

                                                    if ((class122.field1109[class201.field1651][var16][var17] & 4) != 0) {
                                                        var13 = class201.field1651;
                                                    }
                                                }
                                            }
                                        }
                                        break label546;
                                    }
                                }

                                var12 = class201.field1651;
                                break label554;
                            }

                            var12 = class201.field1651;
                            break label554;
                        }
                    }

                    if (class180.field1528.field4121 >= 0 && class180.field1528.field4092 >= 0 && class180.field1528.field4121 < 13312 && class180.field1528.field4092 < 13312) {
                        if ((class122.field1109[class201.field1651][class180.field1528.field4121 >> 7][class180.field1528.field4092 >> 7] & 4) != 0) {
                            var13 = class201.field1651;
                        }

                        var12 = var13;
                    } else {
                        var12 = class201.field1651;
                    }
                }
            }

            var11 = var12;
        } else {
            var11 = method2416();
        }

        var12 = class345.field2506;
        var13 = class446.field3027;
        var14 = class360.field2585;
        var15 = class214.field1736;
        var16 = class225.field1779;

        for (var17 = 0; var17 < 5; ++var17) {
            if (field4043[var17]) {
                var18 = (int) (Math.random() * (double) (field3837[var17] * 2 + 1) - (double) field3837[var17] + Math.sin((double) field3907[var17] / 100.0D * (double) field3993[var17]) * (double) field3997[var17]);
                if (var17 == 0) {
                    class345.field2506 += var18;
                }

                if (var17 == 1) {
                    class446.field3027 += var18;
                }

                if (var17 == 2) {
                    class360.field2585 += var18;
                }

                if (var17 == 3) {
                    class225.field1779 = class225.field1779 + var18 & 2047;
                }

                if (var17 == 4) {
                    class214.field1736 += var18;
                    if (class214.field1736 < 128) {
                        class214.field1736 = 128;
                    }

                    if (class214.field1736 > 383) {
                        class214.field1736 = 383;
                    }
                }
            }
        }

        var17 = class499.field3651;
        var18 = class499.field3634;
        if (class499.field3645 != 0) {
            var17 = class499.field3646;
            var18 = class499.field3647;
        }

        if (var17 >= var0 && var17 < var0 + var2 && var18 >= var1 && var18 < var3 + var1) {
            class368.method1736(var17 - var0, var18 - var1);
        } else {
            class368.method1737();
        }

        method2453();
        class415.method1914(var0, var1, var2, var3, 0);
        method2453();
        var19 = class334.method1576();
        class334.method1580(class268.field1973.field3441);
        class334.field2431.field2607 = field4060;
        class329.field2414.method765(class345.field2506, class446.field3027, class360.field2585, class214.field1736, class225.field1779, var11);
        class334.method1580(false);
        if (field3839) {
            class415.method1924();
        }

        class334.field2431.field2607 = var19;
        method2453();
        class329.field2414.method784();
        field3880 = 0;
        boolean var40 = false;
        var21 = -1;
        int var22 = -1;
        int var23 = class172.field1443;
        int[] var24 = class172.field1444;

        int var25;
        for (var25 = 0; var25 < field3836 + var23; ++var25) {
            Object var26;
            if (var25 < var23) {
                var26 = field3948[var24[var25]];
                if (field3914 == var24[var25]) {
                    var40 = true;
                    var21 = var25;
                    continue;
                }

                if (var26 == class180.field1528) {
                    var22 = var25;
                    continue;
                }
            } else {
                var26 = field3835[field3774[var25 - var23]];
            }

            class398.method1835((class514) var26, var25, var0, var1, var2, var3, (byte) -53);
        }

        if (field4013 && var22 != -1) {
            class398.method1835(class180.field1528, var22, var0, var1, var2, var3, (byte) 1);
        }

        if (var40) {
            class398.method1835(field3948[field3914], var21, var0, var1, var2, var3, (byte) 56);
        }

        for (var25 = 0; var25 < field3880; ++var25) {
            int var41 = field3882[var25];
            int var27 = field3883[var25];
            int var28 = field4059[var25];
            int var29 = field3834[var25];
            boolean var30 = true;

            while (var30) {
                var30 = false;

                for (int var31 = 0; var31 < var25; ++var31) {
                    if (var27 + 2 > field3883[var31] - field3834[var31] && var27 - var29 < 2 + field3883[var31] && var41 - var28 < field4059[var31] + field3882[var31] && var41 + var28 > field3882[var31] - field4059[var31] && field3883[var31] - field3834[var31] < var27) {
                        var27 = field3883[var31] - field3834[var31];
                        var30 = true;
                    }
                }
            }

            field3893 = field3882[var25];
            field3894 = field3883[var25] = var27;
            String var42 = field3890[var25];
            if (field3951 == 0) {
                int var32 = 16776960;
                if (field3886[var25] < 6) {
                    var32 = field4007[field3886[var25]];
                }

                if (field3886[var25] == 6) {
                    var32 = field3945 % 20 < 10 ? 16711680 : 16776960;
                }

                if (field3886[var25] == 7) {
                    var32 = field3945 % 20 < 10 ? 255 : '\uffff';
                }

                if (field3886[var25] == 8) {
                    var32 = field3945 % 20 < 10 ? '\ub000' : 8454016;
                }

                int var33;
                if (field3886[var25] == 9) {
                    var33 = 150 - field4035[var25];
                    if (var33 < 50) {
                        var32 = 16711680 + var33 * 1280;
                    } else if (var33 < 100) {
                        var32 = 16776960 - 327680 * (var33 - 50);
                    } else if (var33 < 150) {
                        var32 = 65280 + 5 * (var33 - 100);
                    }
                }

                if (field3886[var25] == 10) {
                    var33 = 150 - field4035[var25];
                    if (var33 < 50) {
                        var32 = var33 * 5 + 16711680;
                    } else if (var33 < 100) {
                        var32 = 16711935 - 327680 * (var33 - 50);
                    } else if (var33 < 150) {
                        var32 = (var33 - 100) * 327680 + 255 - (var33 - 100) * 5;
                    }
                }

                if (field3886[var25] == 11) {
                    var33 = 150 - field4035[var25];
                    if (var33 < 50) {
                        var32 = 16777215 - var33 * 327685;
                    } else if (var33 < 100) {
                        var32 = 65280 + (var33 - 50) * 327685;
                    } else if (var33 < 150) {
                        var32 = 16777215 - 327680 * (var33 - 100);
                    }
                }

                int var34;
                if (field3886[var25] == 12 && field3784[var25] == null) {
                    var33 = var42.length();
                    field3784[var25] = new int[var33];

                    for (var34 = 0; var34 < var33; ++var34) {
                        int var35 = (int) (64.0F * ((float) var34 / (float) var33));
                        int var36 = var35 << 10 | 896 | 64;
                        field3784[var25][var34] = class96.field775[var36];
                    }
                }

                if (field3887[var25] == 0) {
                    class303.field2170.method932(var42, var0 + field3893, field3894 + var1, var32, 0, field3784[var25]);
                }

                if (field3887[var25] == 1) {
                    class303.field2170.method943(var42, field3893 + var0, field3894 + var1, var32, 0, field3945, field3784[var25]);
                }

                if (field3887[var25] == 2) {
                    class303.field2170.method931(var42, field3893 + var0, var1 + field3894, var32, 0, field3945, field3784[var25]);
                }

                if (field3887[var25] == 3) {
                    class303.field2170.method945(var42, var0 + field3893, field3894 + var1, var32, 0, field3945, 150 - field4035[var25], field3784[var25]);
                }

                if (field3887[var25] == 4) {
                    var33 = (150 - field4035[var25]) * (class303.field2170.method921(var42) + 100) / 150;
                    class415.method1927(field3893 + var0 - 50, var1, field3893 + var0 + 50, var1 + var3);
                    class303.field2170.method946(var42, 50 + var0 + field3893 - var33, var1 + field3894, var32, 0, field3784[var25]);
                    class415.method1921(var0, var1, var2 + var0, var1 + var3);
                }

                if (field3887[var25] == 5) {
                    var33 = 150 - field4035[var25];
                    var34 = 0;
                    if (var33 < 25) {
                        var34 = var33 - 25;
                    } else if (var33 > 125) {
                        var34 = var33 - 125;
                    }

                    class415.method1927(var0, field3894 + var1 - class303.field2170.field1617 - 1, var0 + var2, 5 + field3894 + var1);
                    class303.field2170.method932(var42, var0 + field3893, var1 + field3894 + var34, var32, 0, field3784[var25]);
                    class415.method1921(var0, var1, var0 + var2, var3 + var1);
                }
            } else {
                class303.field2170.method928(var42, var0 + field3893, field3894 + var1, 16776960, 0);
            }
        }

        method2365(var0, var1);
        ((class444) class334.field2431.field2606).method2028(field3854);
        method2402(var0, var1, var2, var3);
        class345.field2506 = var12;
        class446.field3027 = var13;
        class360.field2585 = var14;
        class214.field1736 = var15;
        class225.field1779 = var16;
        if (field3788 && class426.field2930.method2091(true, false) == 0) {
            field3788 = false;
        }

        if (field3788) {
            class415.method1914(var0, var1, var2, var3, 0);
            method2480(class32.field184, false);
        }

    }

    static void method2430() {
        if (field4013) {
            class230.method1052(class180.field1528, false);
        }

    }

    static void method2372() {
        if (field3914 >= 0 && null != field3948[field3914]) {
            class230.method1052(field3948[field3914], false);
        }

    }

    static void method2403() {
        int var1 = class172.field1443;
        int[] var2 = class172.field1444;

        for (int var3 = 0; var3 < var1; ++var3) {
            if (var2[var3] != field3914 && field3903 != var2[var3]) {
                class230.method1052(field3948[var2[var3]], true);
            }
        }

    }

    static void method2439(boolean var0) {
        for (int var2 = 0; var2 < field3836; ++var2) {
            class424 var3 = field3835[field3774[var2]];
            if (null != var3 && var3.method2501() && var0 == var3.field2920.field2502 && var3.field2920.method1629()) {
                int var4 = var3.field4121 >> 7;
                int var5 = var3.field4092 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var3.field4095 == 1 && (var3.field4121 & 127) == 64 && (var3.field4092 & 127) == 64) {
                        if (field3891[var4][var5] == field3945) {
                            continue;
                        }

                        field3891[var4][var5] = field3945;
                    }

                    long var6 = class368.method1741(0, 0, 1, !var3.field2920.field2509, field3774[var2]);
                    var3.field4127 = field4078;
                    class329.field2414.method745(class201.field1651, var3.field4121, var3.field4092, method2342(var3.field4095 * 64 - 64 + var3.field4121, var3.field4095 * 64 - 64 + var3.field4092, class201.field1651), var3.field4095 * 64 - 64 + 60, var3, var3.field4093, var6, var3.field4099);
                }
            }
        }

    }

    static int method2416() {
        if (class290.field2121.method2528()) {
            return class201.field1651;
        } else {
            int var1 = method2342(class345.field2506, class360.field2585, class201.field1651);
            return var1 - class446.field3027 < 800 && (class122.field1109[class201.field1651][class345.field2506 >> 7][class360.field2585 >> 7] & 4) != 0 ? class201.field1651 : 3;
        }
    }

    static void method2365(int var0, int var1) {
        if (field3853 == 2) {
            method2369(field3962 + (field3799 - class357.field2573 << 7), field3995 + (field3942 - class5.field28 << 7), field3806 * 2);
            if (field3893 > -1 && field4078 % 20 < 10) {
                class99.field941[0].method1563(field3893 + var0 - 12, var1 + field3894 - 28);
            }

        }
    }

    public static class43 method2351() {
        return field3990;
    }

    static void method2495() {
        for (class347 var1 = (class347) field4029.method122(); var1 != null; var1 = (class347) field4029.method124()) {
            var1.method221();
        }

    }

    static void method2411(class347 var0) {
        if (null != var0 && var0.field2522 != null) {
            if (var0.field2522.field910 >= 0) {
                class97 var2 = class97.method424(var0.field2522.field808);
                if (null == var2 || null == var2.field923 || var2.field923.length == 0 || var0.field2522.field910 >= var2.field923.length || var2.field923[var0.field2522.field910] != var0.field2522) {
                    return;
                }
            }

            if (var0.field2522.field793 == 11 && var0.field2519 == 0) {
                if (var0.field2522.method397(var0.field2520, var0.field2521, 0, 0)) {
                    switch (var0.field2522.method400()) {
                        case 0:
                            class33.method96(var0.field2522.method402(), true, false);
                            break;
                        case 1:
                            int var3 = method2420(var0.field2522);
                            boolean var7 = (var3 >> 22 & 1) != 0;
                            if (var7) {
                                int[] var4 = var0.field2522.method409();
                                if (null != var4) {
                                    class46 var5 = class46.method134(class488.field3514, field3840.field2238);
                                    var5.field541.method297(var4[1]);
                                    var5.field541.method298(var0.field2522.field791);
                                    var5.field541.method318(var0.field2522.field910);
                                    var5.field541.method315(var0.field2522.method401());
                                    var5.field541.method298(var4[2]);
                                    var5.field541.method298(var4[0]);
                                    field3840.method1359(var5);
                                }
                            }
                    }
                }
            } else if (var0.field2522.field793 == 12) {
                class327 var6 = var0.field2522.method419();
                if (null != var6 && var6.method1482()) {
                    switch (var0.field2519) {
                        case 0:
                            field4014.method2124(var0.field2522);
                            var6.method1443(true);
                            var6.method1518(var0.field2520, var0.field2521, field3923.method958(82), field3923.method958(81));
                            break;
                        case 1:
                            var6.method1501(var0.field2520, var0.field2521);
                    }
                }
            }

        }
    }

    static boolean method2379() {
        return (field3778 & 4) != 0;
    }

    static boolean method2387() {
        return (field3778 & 2) != 0;
    }

    static boolean method2435(class283 var0) {
        if (field3778 == 0) {
            return false;
        } else {
            boolean var2;
            if (class180.field1528 == var0) {
                var2 = (field3778 & 8) != 0;
                return var2;
            } else {
                var2 = method2379();
                if (!var2) {
                    boolean var3 = (field3778 & 1) != 0;
                    var2 = var3 && var0.method1282();
                }

                return var2 || method2387() && var0.method1285();
            }
        }
    }

    static void method2402(int var0, int var1, int var2, int var3) {
        field3900 = 0;
        int var5 = (class180.field1528.field4121 >> 7) + class357.field2573;
        int var6 = class5.field28 + (class180.field1528.field4092 >> 7);
        if (var5 >= 3053 && var5 <= 3156 && var6 >= 3056 && var6 <= 3136) {
            field3900 = 1;
        }

        if (var5 >= 3072 && var5 <= 3118 && var6 >= 9492 && var6 <= 9535) {
            field3900 = 1;
        }

        if (field3900 == 1 && var5 >= 3139 && var5 <= 3199 && var6 >= 3008 && var6 <= 3062) {
            field3900 = 0;
        }

    }

    static void method2356(class514 var0, int var1) {
        method2369(var0.field4121, var0.field4092, var1);
    }

    static void method2369(int var0, int var1, int var2) {
        if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
            int var4 = method2342(var0, var1, class201.field1651) - var2;
            var0 -= class345.field2506;
            var4 -= class446.field3027;
            var1 -= class360.field2585;
            int var5 = class334.field2429[class214.field1736];
            int var6 = class334.field2427[class214.field1736];
            int var7 = class334.field2429[class225.field1779];
            int var8 = class334.field2427[class225.field1779];
            int var9 = var0 * var8 + var1 * var7 >> 16;
            var1 = var1 * var8 - var7 * var0 >> 16;
            var0 = var9;
            var9 = var6 * var4 - var5 * var1 >> 16;
            var1 = var1 * var6 + var4 * var5 >> 16;
            if (var1 >= 50) {
                field3893 = var0 * field4060 / var1 + field3991 / 2;
                field3894 = field4060 * var9 / var1 + field3866 / 2;
            } else {
                field3893 = -1;
                field3894 = -1;
            }

        } else {
            field3893 = -1;
            field3894 = -1;
        }
    }

    static int method2342(int var0, int var1, int var2) {
        int var4 = var0 >> 7;
        int var5 = var1 >> 7;
        if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
            int var6 = var2;
            if (var2 < 3 && (class122.field1109[1][var4][var5] & 2) == 2) {
                var6 = var2 + 1;
            }

            int var7 = var0 & 127;
            int var8 = var1 & 127;
            int var9 = class122.field1107[var6][var4 + 1][var5] * var7 + (128 - var7) * class122.field1107[var6][var4][var5] >> 7;
            int var10 = (128 - var7) * class122.field1107[var6][var4][var5 + 1] + class122.field1107[var6][var4 + 1][var5 + 1] * var7 >> 7;
            return var10 * var8 + (128 - var8) * var9 >> 7;
        } else {
            return 0;
        }
    }

    static void method2444(boolean var0, class320 var1) {
        field3851 = var0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        if (!field3851) {
            int var3 = var1.method309();
            var4 = var1.method289();
            var5 = var1.method309();
            class80.field705 = new int[var5][4];

            for (var6 = 0; var6 < var5; ++var6) {
                for (var7 = 0; var7 < 4; ++var7) {
                    class80.field705[var6][var7] = var1.method264();
                }
            }

            class381.field2757 = new int[var5];
            class303.field2171 = new int[var5];
            class218.field1744 = new int[var5];
            class113.field1055 = new byte[var5][];
            class273.field2002 = new byte[var5][];
            var5 = 0;

            for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
                for (var7 = (var4 - 6) / 8; var7 <= (var4 + 6) / 8; ++var7) {
                    var8 = var7 + (var6 << 8);
                    class381.field2757[var5] = var8;
                    class303.field2171[var5] = class452.field3111.method213("m" + var6 + "_" + var7);
                    class218.field1744[var5] = class452.field3111.method213("l" + var6 + "_" + var7);
                    ++var5;
                }
            }

            method2455(var3, var4, true);
        } else {
            boolean var16 = var1.method260() == 1;
            var4 = var1.method309();
            var5 = var1.method309();
            var6 = var1.method309();
            var1.method1410();

            int var9;
            int var10;
            for (var7 = 0; var7 < 4; ++var7) {
                for (var8 = 0; var8 < 13; ++var8) {
                    for (var9 = 0; var9 < 13; ++var9) {
                        var10 = var1.method1408(1);
                        if (var10 == 1) {
                            field3852[var7][var8][var9] = var1.method1408(26);
                        } else {
                            field3852[var7][var8][var9] = -1;
                        }
                    }
                }
            }

            var1.method1411();
            class80.field705 = new int[var6][4];

            for (var7 = 0; var7 < var6; ++var7) {
                for (var8 = 0; var8 < 4; ++var8) {
                    class80.field705[var7][var8] = var1.method264();
                }
            }

            class381.field2757 = new int[var6];
            class303.field2171 = new int[var6];
            class218.field1744 = new int[var6];
            class113.field1055 = new byte[var6][];
            class273.field2002 = new byte[var6][];
            var6 = 0;

            for (var7 = 0; var7 < 4; ++var7) {
                for (var8 = 0; var8 < 13; ++var8) {
                    for (var9 = 0; var9 < 13; ++var9) {
                        var10 = field3852[var7][var8][var9];
                        if (var10 != -1) {
                            int var11 = var10 >> 14 & 1023;
                            int var12 = var10 >> 3 & 2047;
                            int var13 = (var11 / 8 << 8) + var12 / 8;

                            int var14;
                            for (var14 = 0; var14 < var6; ++var14) {
                                if (class381.field2757[var14] == var13) {
                                    var13 = -1;
                                    break;
                                }
                            }

                            if (var13 != -1) {
                                class381.field2757[var6] = var13;
                                var14 = var13 >> 8 & 255;
                                int var15 = var13 & 255;
                                class303.field2171[var6] = class452.field3111.method213("m" + var14 + "_" + var15);
                                class218.field1744[var6] = class452.field3111.method213("l" + var14 + "_" + var15);
                                ++var6;
                            }
                        }
                    }
                }
            }

            method2455(var5, var4, !var16);
        }

    }

    static void method2455(int var0, int var1, boolean var2) {
        if (!var2 || class122.field1097 != var0 || class88.field747 != var1) {
            class122.field1097 = var0;
            class88.field747 = var1;
            method2459(25);
            method2480(class32.field184, true);
            int var4 = class357.field2573;
            int var5 = class5.field28;
            class357.field2573 = (var0 - 6) * 8;
            class5.field28 = (var1 - 6) * 8;
            int var6 = class357.field2573 - var4;
            int var7 = class5.field28 - var5;
            var4 = class357.field2573;
            var5 = class5.field28;

            int var8;
            int var10;
            int[] var10000;
            for (var8 = 0; var8 < 65536; ++var8) {
                class424 var9 = field3835[var8];
                if (var9 != null) {
                    for (var10 = 0; var10 < 10; ++var10) {
                        var10000 = var9.field4166;
                        var10000[var10] -= var6;
                        var10000 = var9.field4163;
                        var10000[var10] -= var7;
                    }

                    var9.field4121 -= var6 * 128;
                    var9.field4092 -= var7 * 128;
                }
            }

            for (var8 = 0; var8 < 2048; ++var8) {
                class283 var20 = field3948[var8];
                if (null != var20) {
                    for (var10 = 0; var10 < 10; ++var10) {
                        var10000 = var20.field4166;
                        var10000[var10] -= var6;
                        var10000 = var20.field4163;
                        var10000[var10] -= var7;
                    }

                    var20.field4121 -= var6 * 128;
                    var20.field4092 -= var7 * 128;
                }
            }

            byte var19 = 0;
            byte var21 = 104;
            byte var22 = 1;
            if (var6 < 0) {
                var19 = 103;
                var21 = -1;
                var22 = -1;
            }

            byte var11 = 0;
            byte var12 = 104;
            byte var13 = 1;
            if (var7 < 0) {
                var11 = 103;
                var12 = -1;
                var13 = -1;
            }

            int var15;
            for (int var14 = var19; var14 != var21; var14 += var22) {
                for (var15 = var11; var15 != var12; var15 += var13) {
                    int var16 = var6 + var14;
                    int var17 = var7 + var15;

                    for (int var18 = 0; var18 < 4; ++var18) {
                        if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                            field3915[var18][var14][var15] = field3915[var18][var16][var17];
                        } else {
                            field3915[var18][var14][var15] = null;
                        }
                    }
                }
            }

            for (class316 var23 = (class316) field3916.method122(); null != var23; var23 = (class316) field3916.method124()) {
                var23.field2276 -= var6;
                var23.field2282 -= var7;
                if (var23.field2276 < 0 || var23.field2282 < 0 || var23.field2276 >= 104 || var23.field2282 >= 104) {
                    var23.method221();
                }
            }

            if (field4026 != 0) {
                field4026 -= var6;
                field3949 -= var7;
            }

            field4030 = 0;
            field4036 = false;
            class345.field2506 -= var6 << 7;
            class360.field2585 -= var7 << 7;
            class81.field710 -= var6 << 7;
            class201.field1653 -= var7 << 7;
            field4021 = -1;
            field4045.method118();
            field3902.method118();

            for (var15 = 0; var15 < 4; ++var15) {
                field3850[var15].method29();
            }

        }
    }

    static void method2384(boolean var0) {
        method2453();
        ++field3840.field2244;
        if (field3840.field2244 >= 50 || var0) {
            field3840.field2244 = 0;
            if (!field3842 && field3840.method1362() != null) {
                class46 var2 = class46.method134(class488.field3537, field3840.field2238);
                field3840.method1359(var2);

                try {
                    field3840.method1358();
                } catch (IOException var4) {
                    field3842 = true;
                }
            }

        }
    }

    static void method2470() {
        method2384(false);
        field3845 = 0;
        boolean var1 = true;

        int var2;
        for (var2 = 0; var2 < class113.field1055.length; ++var2) {
            if (class303.field2171[var2] != -1 && class113.field1055[var2] == null) {
                class113.field1055[var2] = class452.field3111.method188(class303.field2171[var2], 0);
                if (null == class113.field1055[var2]) {
                    var1 = false;
                    ++field3845;
                }
            }

            if (class218.field1744[var2] != -1 && class273.field2002[var2] == null) {
                class273.field2002[var2] = class452.field3111.method189(class218.field1744[var2], 0, class80.field705[var2]);
                if (null == class273.field2002[var2]) {
                    var1 = false;
                    ++field3845;
                }
            }
        }

        if (!var1) {
            field3849 = 1;
        } else {
            field3847 = 0;
            var1 = true;

            int var4;
            int var5;
            for (var2 = 0; var2 < class113.field1055.length; ++var2) {
                byte[] var3 = class273.field2002[var2];
                if (var3 != null) {
                    var4 = (class381.field2757[var2] >> 8) * 64 - class357.field2573;
                    var5 = 64 * (class381.field2757[var2] & 255) - class5.field28;
                    if (field3851) {
                        var4 = 10;
                        var5 = 10;
                    }

                    var1 &= class122.method548(var3, var4, var5);
                }
            }

            if (!var1) {
                field3849 = 2;
            } else {
                if (field3849 != 0) {
                    method2480(class32.field184 + class49.field555 + class49.field549 + 100 + "%" + class49.field551, true);
                }

                method2453();
                class329.field2414.method737();

                for (var2 = 0; var2 < 4; ++var2) {
                    field3850[var2].method29();
                }

                int var16;
                for (var2 = 0; var2 < 4; ++var2) {
                    for (var16 = 0; var16 < 104; ++var16) {
                        for (var4 = 0; var4 < 104; ++var4) {
                            class122.field1109[var2][var16][var4] = 0;
                        }
                    }
                }

                method2453();
                class122.method555();
                var2 = class113.field1055.length;
                class51.method144();
                method2384(true);
                int var18;
                if (!field3851) {
                    byte[] var6;
                    for (var16 = 0; var16 < var2; ++var16) {
                        var4 = 64 * (class381.field2757[var16] >> 8) - class357.field2573;
                        var5 = 64 * (class381.field2757[var16] & 255) - class5.field28;
                        var6 = class113.field1055[var16];
                        if (null != var6) {
                            method2453();
                            class122.method551(var6, var4, var5, class122.field1097 * 8 - 48, class88.field747 * 8 - 48, field3850);
                        }
                    }

                    for (var16 = 0; var16 < var2; ++var16) {
                        var4 = (class381.field2757[var16] >> 8) * 64 - class357.field2573;
                        var5 = (class381.field2757[var16] & 255) * 64 - class5.field28;
                        var6 = class113.field1055[var16];
                        if (null == var6 && class88.field747 < 800) {
                            method2453();
                            class122.method541(var4, var5, 64, 64);
                        }
                    }

                    method2384(true);

                    for (var16 = 0; var16 < var2; ++var16) {
                        byte[] var17 = class273.field2002[var16];
                        if (var17 != null) {
                            var5 = (class381.field2757[var16] >> 8) * 64 - class357.field2573;
                            var18 = (class381.field2757[var16] & 255) * 64 - class5.field28;
                            method2453();
                            class122.method556(var17, var5, var18, class329.field2414, field3850);
                        }
                    }
                }

                int var7;
                int var8;
                int var9;
                if (field3851) {
                    int var10;
                    int var11;
                    int var12;
                    for (var16 = 0; var16 < 4; ++var16) {
                        method2453();

                        for (var4 = 0; var4 < 13; ++var4) {
                            for (var5 = 0; var5 < 13; ++var5) {
                                boolean var19 = false;
                                var7 = field3852[var16][var4][var5];
                                if (var7 != -1) {
                                    var8 = var7 >> 24 & 3;
                                    var9 = var7 >> 1 & 3;
                                    var10 = var7 >> 14 & 1023;
                                    var11 = var7 >> 3 & 2047;
                                    var12 = (var10 / 8 << 8) + var11 / 8;

                                    for (int var13 = 0; var13 < class381.field2757.length; ++var13) {
                                        if (var12 == class381.field2757[var13] && class113.field1055[var13] != null) {
                                            int var14 = 8 * (var10 - var4);
                                            int var15 = 8 * (var11 - var5);
                                            class245.method1095(class113.field1055[var13], var16, var4 * 8, var5 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9, var14, var15, field3850);
                                            var19 = true;
                                            break;
                                        }
                                    }
                                }

                                if (!var19) {
                                    class122.method554(var16, var4 * 8, var5 * 8);
                                }
                            }
                        }
                    }

                    for (var16 = 0; var16 < 13; ++var16) {
                        for (var4 = 0; var4 < 13; ++var4) {
                            var5 = field3852[0][var16][var4];
                            if (var5 == -1) {
                                class122.method541(var16 * 8, var4 * 8, 8, 8);
                            }
                        }
                    }

                    method2384(true);

                    for (var16 = 0; var16 < 4; ++var16) {
                        method2453();

                        for (var4 = 0; var4 < 13; ++var4) {
                            for (var5 = 0; var5 < 13; ++var5) {
                                var18 = field3852[var16][var4][var5];
                                if (var18 != -1) {
                                    var7 = var18 >> 24 & 3;
                                    var8 = var18 >> 1 & 3;
                                    var9 = var18 >> 14 & 1023;
                                    var10 = var18 >> 3 & 2047;
                                    var11 = (var9 / 8 << 8) + var10 / 8;

                                    for (var12 = 0; var12 < class381.field2757.length; ++var12) {
                                        if (var11 == class381.field2757[var12] && class273.field2002[var12] != null) {
                                            class122.method538(class273.field2002[var12], var16, var4 * 8, var5 * 8, var7, (var9 & 7) * 8, 8 * (var10 & 7), var8, class329.field2414, field3850);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                method2384(true);
                method2453();
                class122.method546(class329.field2414, field3850);
                method2384(true);
                var16 = class122.field1099;
                if (var16 > class201.field1651) {
                    var16 = class201.field1651;
                }

                if (var16 < class201.field1651 - 1) {
                    var16 = class201.field1651 - 1;
                }

                if (field3779) {
                    class329.field2414.method738(class122.field1099);
                } else {
                    class329.field2414.method738(0);
                }

                for (var4 = 0; var4 < 104; ++var4) {
                    for (var5 = 0; var5 < 104; ++var5) {
                        method2392(var4, var5);
                    }
                }

                method2453();
                method2407();
                class304.field2204.method1304();
                class46 var20;
                if (class268.field1973.method2213()) {
                    var20 = class46.method134(class488.field3522, field3840.field2238);
                    var20.field541.method315(1057001181);
                    field3840.method1359(var20);
                }

                if (!field3851) {
                    var4 = (class122.field1097 - 6) / 8;
                    var5 = (6 + class122.field1097) / 8;
                    var18 = (class88.field747 - 6) / 8;
                    var7 = (class88.field747 + 6) / 8;

                    for (var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
                        for (var9 = var18 - 1; var9 <= var7 + 1; ++var9) {
                            if (var8 < var4 || var8 > var5 || var9 < var18 || var9 > var7) {
                                class452.field3111.method212("m" + var8 + "_" + var9);
                                class452.field3111.method212("l" + var8 + "_" + var9);
                            }
                        }
                    }
                }

                method2459(30);
                method2453();
                class122.method542();
                var20 = class46.method134(class488.field3543, field3840.field2238);
                field3840.method1359(var20);
                class479.method2223();
            }
        }
    }

    static void method2335(int var0) {
        int[] var2 = class156.field1336.field2422;
        int var3 = var2.length;

        int var4;
        for (var4 = 0; var4 < var3; ++var4) {
            var2[var4] = 0;
        }

        int var5;
        int var6;
        for (var4 = 1; var4 < 103; ++var4) {
            var5 = 2048 * (103 - var4) + 24628;

            for (var6 = 1; var6 < 103; ++var6) {
                if ((class122.field1109[var0][var6][var4] & 24) == 0) {
                    class329.field2414.method760(var2, var5, 512, var0, var6, var4);
                }

                if (var0 < 3 && (class122.field1109[var0 + 1][var6][var4] & 8) != 0) {
                    class329.field2414.method760(var2, var5, 512, var0 + 1, var6, var4);
                }

                var5 += 4;
            }
        }

        var4 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        var5 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        class156.field1336.method1537();

        int var7;
        for (var6 = 1; var6 < 103; ++var6) {
            for (var7 = 1; var7 < 103; ++var7) {
                if ((class122.field1109[var0][var7][var6] & 24) == 0) {
                    method2366(var0, var7, var6, var4, var5);
                }

                if (var0 < 3 && (class122.field1109[var0 + 1][var7][var6] & 8) != 0) {
                    method2366(var0 + 1, var7, var6, var4, var5);
                }
            }
        }

        field4022 = 0;

        for (var6 = 0; var6 < 104; ++var6) {
            for (var7 = 0; var7 < 104; ++var7) {
                long var8 = class329.field2414.method787(class201.field1651, var6, var7);
                if (0L != var8) {
                    int var10 = class368.method1739(var8);
                    int var11 = class192.method892(var10, (byte) 46).field2209;
                    if (var11 >= 0 && class192.method893(var11).field1565) {
                        field4033[field4022] = class192.method893(var11).method889(false);
                        field4023[field4022] = var6;
                        field4024[field4022] = var7;
                        ++field4022;
                    }
                }
            }
        }

        class295.field2141.method2583();
    }

    static void method2366(int var0, int var1, int var2, int var3, int var4) {
        long var6 = class329.field2414.method773(var0, var1, var2);
        int var8;
        int var9;
        int var10;
        int var11;
        int var15;
        int var24;
        if (0L != var6) {
            var8 = class329.field2414.method755(var0, var1, var2, var6);
            var9 = var8 >> 6 & 3;
            var10 = var8 & 31;
            var11 = var3;
            boolean var13 = 0L != var6;
            if (var13) {
                boolean var14 = (int) (var6 >>> 16 & 1L) == 1;
                var13 = !var14;
            }

            if (var13) {
                var11 = var4;
            }

            int[] var23 = class156.field1336.field2422;
            var24 = (103 - var2) * 2048 + 24624 + var1 * 4;
            var15 = class368.method1739(var6);
            class304 var16 = class192.method892(var15, (byte) 8);
            if (var16.field2208 != -1) {
                class539 var17 = class153.field1321[var16.field2208];
                if (null != var17) {
                    int var18 = (var16.field2190 * 4 - var17.field4285) / 2;
                    int var19 = (var16.field2175 * 4 - var17.field4286) / 2;
                    var17.method2590(var18 + var1 * 4 + 48, var19 + 48 + 4 * (104 - var2 - var16.field2175));
                }
            } else {
                if (var10 == 0 || var10 == 2) {
                    if (var9 == 0) {
                        var23[var24] = var11;
                        var23[var24 + 512] = var11;
                        var23[var24 + 1024] = var11;
                        var23[var24 + 1536] = var11;
                    } else if (var9 == 1) {
                        var23[var24] = var11;
                        var23[var24 + 1] = var11;
                        var23[var24 + 2] = var11;
                        var23[var24 + 3] = var11;
                    } else if (var9 == 2) {
                        var23[var24 + 3] = var11;
                        var23[var24 + 3 + 512] = var11;
                        var23[var24 + 3 + 1024] = var11;
                        var23[1536 + var24 + 3] = var11;
                    } else if (var9 == 3) {
                        var23[var24 + 1536] = var11;
                        var23[1 + var24 + 1536] = var11;
                        var23[2 + var24 + 1536] = var11;
                        var23[3 + var24 + 1536] = var11;
                    }
                }

                if (var10 == 3) {
                    if (var9 == 0) {
                        var23[var24] = var11;
                    } else if (var9 == 1) {
                        var23[var24 + 3] = var11;
                    } else if (var9 == 2) {
                        var23[var24 + 3 + 1536] = var11;
                    } else if (var9 == 3) {
                        var23[var24 + 1536] = var11;
                    }
                }

                if (var10 == 2) {
                    if (var9 == 3) {
                        var23[var24] = var11;
                        var23[var24 + 512] = var11;
                        var23[var24 + 1024] = var11;
                        var23[var24 + 1536] = var11;
                    } else if (var9 == 0) {
                        var23[var24] = var11;
                        var23[var24 + 1] = var11;
                        var23[var24 + 2] = var11;
                        var23[var24 + 3] = var11;
                    } else if (var9 == 1) {
                        var23[var24 + 3] = var11;
                        var23[var24 + 3 + 512] = var11;
                        var23[1024 + var24 + 3] = var11;
                        var23[var24 + 3 + 1536] = var11;
                    } else if (var9 == 2) {
                        var23[var24 + 1536] = var11;
                        var23[1 + var24 + 1536] = var11;
                        var23[var24 + 1536 + 2] = var11;
                        var23[3 + var24 + 1536] = var11;
                    }
                }
            }
        }

        var6 = class329.field2414.method754(var0, var1, var2);
        if (var6 != 0L) {
            var8 = class329.field2414.method755(var0, var1, var2, var6);
            var9 = var8 >> 6 & 3;
            var10 = var8 & 31;
            var11 = class368.method1739(var6);
            class304 var12 = class192.method892(var11, (byte) 17);
            if (var12.field2208 != -1) {
                class539 var25 = class153.field1321[var12.field2208];
                if (null != var25) {
                    var24 = (var12.field2190 * 4 - var25.field4285) / 2;
                    var15 = (var12.field2175 * 4 - var25.field4286) / 2;
                    var25.method2590(var24 + 48 + var1 * 4, var15 + 4 * (104 - var2 - var12.field2175) + 48);
                }
            } else if (var10 == 9) {
                int var26 = 15658734;
                boolean var27 = 0L != var6;
                if (var27) {
                    boolean var28 = (int) (var6 >>> 16 & 1L) == 1;
                    var27 = !var28;
                }

                if (var27) {
                    var26 = 15597568;
                }

                int[] var29 = class156.field1336.field2422;
                int var30 = 24624 + var1 * 4 + (103 - var2) * 2048;
                if (var9 != 0 && var9 != 2) {
                    var29[var30] = var26;
                    var29[1 + var30 + 512] = var26;
                    var29[2 + var30 + 1024] = var26;
                    var29[var30 + 1536 + 3] = var26;
                } else {
                    var29[var30 + 1536] = var26;
                    var29[1 + var30 + 1024] = var26;
                    var29[2 + var30 + 512] = var26;
                    var29[var30 + 3] = var26;
                }
            }
        }

        var6 = class329.field2414.method787(var0, var1, var2);
        if (var6 != 0L) {
            var8 = class368.method1739(var6);
            class304 var20 = class192.method892(var8, (byte) 35);
            if (var20.field2208 != -1) {
                class539 var21 = class153.field1321[var20.field2208];
                if (var21 != null) {
                    var11 = (var20.field2190 * 4 - var21.field4285) / 2;
                    int var22 = (var20.field2175 * 4 - var21.field4286) / 2;
                    var21.method2590(var11 + var1 * 4 + 48, 4 * (104 - var2 - var20.field2175) + 48 + var22);
                }
            }
        }

    }

    static void method2371(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        class316 var11 = null;

        for (class316 var12 = (class316) field3916.method122(); var12 != null; var12 = (class316) field3916.method124()) {
            if (var12.field2283 == var0 && var12.field2276 == var1 && var12.field2282 == var2 && var3 == var12.field2269) {
                var11 = var12;
                break;
            }
        }

        if (null == var11) {
            var11 = new class316();
            var11.field2283 = var0;
            var11.field2269 = var3;
            var11.field2276 = var1;
            var11.field2282 = var2;
            var11.field2278 = -1;
            method2385(var11);
            field3916.method126(var11);
        }

        var11.field2275 = var4;
        var11.field2271 = var5;
        var11.field2277 = var6;
        var11.field2280 = var8;
        var11.field2281 = var9;
        var11.method1392(var7);
    }

    static boolean method2488(int var0, int var1, int var2, int var3, int var4) {
        class316 var6 = null;

        for (class316 var7 = (class316) field3916.method122(); var7 != null; var7 = (class316) field3916.method124()) {
            if (var0 == var7.field2283 && var1 == var7.field2276 && var2 == var7.field2282 && var3 == var7.field2269) {
                var6 = var7;
                break;
            }
        }

        if (null != var6) {
            var6.field2278 = var4;
            return true;
        } else {
            return false;
        }
    }

    static void method2407() {
        for (class316 var1 = (class316) field3916.method122(); null != var1; var1 = (class316) field3916.method124()) {
            if (var1.field2281 == -1) {
                var1.field2280 = 0;
                method2385(var1);
            } else {
                var1.method221();
            }
        }

    }

    static void method2385(class316 var0) {
        long var2 = 0L;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (var0.field2269 == 0) {
            var2 = class329.field2414.method773(var0.field2283, var0.field2276, var0.field2282);
        }

        if (var0.field2269 == 1) {
            var2 = class329.field2414.method778(var0.field2283, var0.field2276, var0.field2282);
        }

        if (var0.field2269 == 2) {
            var2 = class329.field2414.method754(var0.field2283, var0.field2276, var0.field2282);
        }

        if (var0.field2269 == 3) {
            var2 = class329.field2414.method787(var0.field2283, var0.field2276, var0.field2282);
        }

        if (var2 != 0L) {
            int var7 = class329.field2414.method755(var0.field2283, var0.field2276, var0.field2282, var2);
            var4 = class368.method1739(var2);
            var5 = var7 & 31;
            var6 = var7 >> 6 & 3;
        }

        var0.field2272 = var4;
        var0.field2274 = var5;
        var0.field2273 = var6;
    }

    static void method2487() {
        for (class316 var1 = (class316) field3916.method122(); var1 != null; var1 = (class316) field3916.method124()) {
            if (var1.field2281 > 0) {
                --var1.field2281;
            }

            boolean var2;
            int var3;
            int var4;
            class304 var5;
            if (var1.field2281 == 0) {
                if (var1.field2272 >= 0) {
                    var3 = var1.field2272;
                    var4 = var1.field2274;
                    var5 = class192.method892(var3, (byte) -69);
                    if (var4 == 11) {
                        var4 = 10;
                    }

                    if (var4 >= 5 && var4 <= 8) {
                        var4 = 4;
                    }

                    var2 = var5.method1341(var4);
                    if (!var2) {
                        continue;
                    }
                }

                method2492(var1.field2283, var1.field2269, var1.field2276, var1.field2282, var1.field2272, var1.field2273, var1.field2274, var1.field2278);
                var1.method221();
            } else {
                if (var1.field2280 > 0) {
                    --var1.field2280;
                }

                if (var1.field2280 == 0 && var1.field2276 >= 1 && var1.field2282 >= 1 && var1.field2276 <= 102 && var1.field2282 <= 102) {
                    if (var1.field2275 >= 0) {
                        var3 = var1.field2275;
                        var4 = var1.field2271;
                        var5 = class192.method892(var3, (byte) -10);
                        if (var4 == 11) {
                            var4 = 10;
                        }

                        if (var4 >= 5 && var4 <= 8) {
                            var4 = 4;
                        }

                        var2 = var5.method1341(var4);
                        if (!var2) {
                            continue;
                        }
                    }

                    method2492(var1.field2283, var1.field2269, var1.field2276, var1.field2282, var1.field2275, var1.field2277, var1.field2271, var1.field2278);
                    var1.field2280 = -1;
                    if (var1.field2275 == var1.field2272 && var1.field2272 == -1) {
                        var1.method221();
                    } else if (var1.field2275 == var1.field2272 && var1.field2277 == var1.field2273 && var1.field2274 == var1.field2271) {
                        var1.method221();
                    }
                }
            }
        }

    }

    static void method2492(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
            if (field3779 && var0 != class201.field1651) {
                return;
            }

            long var9 = 0L;
            boolean var11 = true;
            boolean var12 = false;
            boolean var13 = false;
            if (var1 == 0) {
                var9 = class329.field2414.method773(var0, var2, var3);
            }

            if (var1 == 1) {
                var9 = class329.field2414.method778(var0, var2, var3);
            }

            if (var1 == 2) {
                var9 = class329.field2414.method754(var0, var2, var3);
            }

            if (var1 == 3) {
                var9 = class329.field2414.method787(var0, var2, var3);
            }

            int var14;
            if (var9 != 0L) {
                var14 = class329.field2414.method755(var0, var2, var3, var9);
                int var38 = class368.method1739(var9);
                int var39 = var14 & 31;
                int var40 = var14 >> 6 & 3;
                class304 var15;
                if (var1 == 0) {
                    class329.field2414.method780(var0, var2, var3);
                    var15 = class192.method892(var38, (byte) 10);
                    if (var15.field2192 != 0) {
                        field3850[var0].method26(var2, var3, var39, var40, var15.field2193);
                    }
                }

                if (var1 == 1) {
                    class329.field2414.method748(var0, var2, var3);
                }

                if (var1 == 2) {
                    class329.field2414.method781(var0, var2, var3);
                    var15 = class192.method892(var38, (byte) 26);
                    if (var2 + var15.field2190 > 103 || var3 + var15.field2190 > 103 || var15.field2175 + var2 > 103 || var3 + var15.field2175 > 103) {
                        return;
                    }

                    if (var15.field2192 != 0) {
                        field3850[var0].method30(var2, var3, var15.field2190, var15.field2175, var40, var15.field2193);
                    }
                }

                if (var1 == 3) {
                    class329.field2414.method750(var0, var2, var3);
                    var15 = class192.method892(var38, (byte) 17);
                    if (var15.field2192 == 1) {
                        field3850[var0].method28(var2, var3);
                    }
                }
            }

            if (var4 >= 0) {
                var14 = var0;
                if (var0 < 3 && (class122.field1109[1][var2][var3] & 2) == 2) {
                    var14 = var0 + 1;
                }

                class158 var41 = class329.field2414;
                class11 var16 = field3850[var0];
                class304 var17 = class192.method892(var4, (byte) 76);
                int var18 = var7 >= 0 ? var7 : var17.field2202;
                int var19;
                int var20;
                if (var5 != 1 && var5 != 3) {
                    var19 = var17.field2190;
                    var20 = var17.field2175;
                } else {
                    var19 = var17.field2175;
                    var20 = var17.field2190;
                }

                int var21;
                int var22;
                if (var19 + var2 <= 104) {
                    var21 = (var19 >> 1) + var2;
                    var22 = (var19 + 1 >> 1) + var2;
                } else {
                    var21 = var2;
                    var22 = var2 + 1;
                }

                int var23;
                int var24;
                if (var20 + var3 <= 104) {
                    var23 = (var20 >> 1) + var3;
                    var24 = var3 + (var20 + 1 >> 1);
                } else {
                    var23 = var3;
                    var24 = var3 + 1;
                }

                int[][] var25 = class122.field1107[var14];
                int var26 = var25[var22][var23] + var25[var21][var23] + var25[var21][var24] + var25[var22][var24] >> 2;
                int var27 = (var19 << 6) + (var2 << 7);
                int var28 = (var3 << 7) + (var20 << 6);
                long var29 = class368.method1741(var2, var3, 2, var17.field2199 == 0, var4);
                int var31 = (var5 << 6) + var6;
                if (var17.field2215 == 1) {
                    var31 += 256;
                }

                Object var32;
                if (var6 == 22) {
                    if (var18 == -1 && var17.field2216 == null) {
                        var32 = var17.method1345(22, var5, var25, var27, var26, var28);
                    } else {
                        var32 = new class503(var4, 22, var5, var14, var2, var3, var18, var17.field2207, null);
                    }

                    var41.method742(var0, var2, var3, var26, (class490) var32, var29, var31);
                    if (var17.field2192 == 1) {
                        var16.method25(var2, var3);
                    }
                } else if (var6 != 10 && var6 != 11) {
                    if (var6 >= 12) {
                        if (var18 == -1 && null == var17.field2216) {
                            var32 = var17.method1345(var6, var5, var25, var27, var26, var28);
                        } else {
                            var32 = new class503(var4, var6, var5, var14, var2, var3, var18, var17.field2207, null);
                        }

                        var41.method744(var0, var2, var3, var26, 1, 1, (class490) var32, 0, var29, var31);
                        if (var17.field2192 != 0) {
                            var16.method23(var2, var3, var19, var20, var17.field2193);
                        }
                    } else if (var6 == 0) {
                        if (var18 == -1 && null == var17.field2216) {
                            var32 = var17.method1345(0, var5, var25, var27, var26, var28);
                        } else {
                            var32 = new class503(var4, 0, var5, var14, var2, var3, var18, var17.field2207, null);
                        }

                        var41.method764(var0, var2, var3, var26, (class490) var32, null, class122.field1102[var5], 0, var29, var31);
                        if (var17.field2192 != 0) {
                            var16.method22(var2, var3, 0, var5, var17.field2193);
                        }
                    } else if (var6 == 1) {
                        if (var18 == -1 && var17.field2216 == null) {
                            var32 = var17.method1345(1, var5, var25, var27, var26, var28);
                        } else {
                            var32 = new class503(var4, 1, var5, var14, var2, var3, var18, var17.field2207, null);
                        }

                        var41.method764(var0, var2, var3, var26, (class490) var32, null, class122.field1103[var5], 0, var29, var31);
                        if (var17.field2192 != 0) {
                            var16.method22(var2, var3, 1, var5, var17.field2193);
                        }
                    } else {
                        int var44;
                        if (var6 == 2) {
                            var44 = var5 + 1 & 3;
                            Object var33;
                            Object var34;
                            if (var18 == -1 && var17.field2216 == null) {
                                var33 = var17.method1345(2, var5 + 4, var25, var27, var26, var28);
                                var34 = var17.method1345(2, var44, var25, var27, var26, var28);
                            } else {
                                var33 = new class503(var4, 2, var5 + 4, var14, var2, var3, var18, var17.field2207, null);
                                var34 = new class503(var4, 2, var44, var14, var2, var3, var18, var17.field2207, null);
                            }

                            var41.method764(var0, var2, var3, var26, (class490) var33, (class490) var34, class122.field1102[var5], class122.field1102[var44], var29, var31);
                            if (var17.field2192 != 0) {
                                var16.method22(var2, var3, 2, var5, var17.field2193);
                            }
                        } else if (var6 == 3) {
                            if (var18 == -1 && null == var17.field2216) {
                                var32 = var17.method1345(3, var5, var25, var27, var26, var28);
                            } else {
                                var32 = new class503(var4, 3, var5, var14, var2, var3, var18, var17.field2207, null);
                            }

                            var41.method764(var0, var2, var3, var26, (class490) var32, null, class122.field1103[var5], 0, var29, var31);
                            if (var17.field2192 != 0) {
                                var16.method22(var2, var3, 3, var5, var17.field2193);
                            }
                        } else if (var6 == 9) {
                            if (var18 == -1 && var17.field2216 == null) {
                                var32 = var17.method1345(9, var5, var25, var27, var26, var28);
                            } else {
                                var32 = new class503(var4, var6, var5, var14, var2, var3, var18, var17.field2207, null);
                            }

                            var41.method744(var0, var2, var3, var26, 1, 1, (class490) var32, 0, var29, var31);
                            if (var17.field2192 != 0) {
                                var16.method23(var2, var3, var19, var20, var17.field2193);
                            }
                        } else if (var6 == 4) {
                            if (var18 == -1 && null == var17.field2216) {
                                var32 = var17.method1345(4, var5, var25, var27, var26, var28);
                            } else {
                                var32 = new class503(var4, 4, var5, var14, var2, var3, var18, var17.field2207, null);
                            }

                            var41.method779(var0, var2, var3, var26, (class490) var32, null, class122.field1102[var5], 0, 0, 0, var29, var31);
                        } else {
                            Object var35;
                            long var42;
                            if (var6 == 5) {
                                var44 = 16;
                                var42 = var41.method773(var0, var2, var3);
                                if (var42 != 0L) {
                                    var44 = class192.method892(class368.method1739(var42), (byte) -62).field2196;
                                }

                                if (var18 == -1 && null == var17.field2216) {
                                    var35 = var17.method1345(4, var5, var25, var27, var26, var28);
                                } else {
                                    var35 = new class503(var4, 4, var5, var14, var2, var3, var18, var17.field2207, null);
                                }

                                var41.method779(var0, var2, var3, var26, (class490) var35, null, class122.field1102[var5], 0, class122.field1104[var5] * var44, var44 * class122.field1105[var5], var29, var31);
                            } else if (var6 == 6) {
                                var44 = 8;
                                var42 = var41.method773(var0, var2, var3);
                                if (var42 != 0L) {
                                    var44 = class192.method892(class368.method1739(var42), (byte) -48).field2196 / 2;
                                }

                                if (var18 == -1 && var17.field2216 == null) {
                                    var35 = var17.method1345(4, var5 + 4, var25, var27, var26, var28);
                                } else {
                                    var35 = new class503(var4, 4, var5 + 4, var14, var2, var3, var18, var17.field2207, null);
                                }

                                var41.method779(var0, var2, var3, var26, (class490) var35, null, 256, var5, var44 * class122.field1110[var5], class122.field1108[var5] * var44, var29, var31);
                            } else if (var6 == 7) {
                                int var43 = var5 + 2 & 3;
                                if (var18 == -1 && var17.field2216 == null) {
                                    var32 = var17.method1345(4, var43 + 4, var25, var27, var26, var28);
                                } else {
                                    var32 = new class503(var4, 4, var43 + 4, var14, var2, var3, var18, var17.field2207, null);
                                }

                                var41.method779(var0, var2, var3, var26, (class490) var32, null, 256, var43, 0, 0, var29, var31);
                            } else if (var6 == 8) {
                                var44 = 8;
                                var42 = var41.method773(var0, var2, var3);
                                if (0L != var42) {
                                    var44 = class192.method892(class368.method1739(var42), (byte) -82).field2196 / 2;
                                }

                                int var37 = var5 + 2 & 3;
                                Object var36;
                                if (var18 == -1 && var17.field2216 == null) {
                                    var35 = var17.method1345(4, var5 + 4, var25, var27, var26, var28);
                                    var36 = var17.method1345(4, var37 + 4, var25, var27, var26, var28);
                                } else {
                                    var35 = new class503(var4, 4, var5 + 4, var14, var2, var3, var18, var17.field2207, null);
                                    var36 = new class503(var4, 4, var37 + 4, var14, var2, var3, var18, var17.field2207, null);
                                }

                                var41.method779(var0, var2, var3, var26, (class490) var35, (class490) var36, 256, var5, var44 * class122.field1110[var5], var44 * class122.field1108[var5], var29, var31);
                            }
                        }
                    }
                } else {
                    if (var18 == -1 && null == var17.field2216) {
                        var32 = var17.method1345(10, var5, var25, var27, var26, var28);
                    } else {
                        var32 = new class503(var4, 10, var5, var14, var2, var3, var18, var17.field2207, null);
                    }

                    if (var32 != null) {
                        var41.method744(var0, var2, var3, var26, var19, var20, (class490) var32, var6 == 11 ? 256 : 0, var29, var31);
                    }

                    if (var17.field2192 != 0) {
                        var16.method23(var2, var3, var19, var20, var17.field2193);
                    }
                }
            }
        }

    }

    static void method2392(int var0, int var1) {
        class43 var3 = field3915[class201.field1651][var0][var1];
        if (null == var3) {
            class329.field2414.method751(class201.field1651, var0, var1);
        } else {
            long var4 = -99999999L;
            class272 var6 = null;

            class272 var7;
            for (var7 = (class272) var3.method122(); var7 != null; var7 = (class272) var3.method124()) {
                class508 var8 = class508.method2299(var7.field1992);
                long var9 = var8.field3732;
                if (var8.field3731 == 1) {
                    var9 *= var7.field1993 < Integer.MAX_VALUE ? (long) (var7.field1993 + 1) : (long) var7.field1993;
                }

                if (var9 > var4) {
                    var4 = var9;
                    var6 = var7;
                }
            }

            if (var6 == null) {
                class329.field2414.method751(class201.field1651, var0, var1);
            } else {
                var3.method127(var6);
                class272 var12 = null;
                class272 var13 = null;

                for (var7 = (class272) var3.method122(); var7 != null; var7 = (class272) var3.method124()) {
                    if (var7.field1992 != var6.field1992) {
                        if (var12 == null) {
                            var12 = var7;
                        }

                        if (var7.field1992 != var12.field1992 && null == var13) {
                            var13 = var7;
                        }
                    }
                }

                long var10 = class368.method1741(var0, var1, 3, false, 0);
                class329.field2414.method743(class201.field1651, var0, var1, method2342(var0 * 128 + 64, 64 + var1 * 128, class201.field1651), var6, var10, var12, var13);
            }
        }
    }

    static void method2438(boolean var0, class320 var1) {
        field4044 = 0;
        field3889 = 0;
        var1.method1410();
        int var3 = var1.method1408(8);
        int var4;
        if (var3 < field3836) {
            for (var4 = var3; var4 < field3836; ++var4) {
                field3801[++field4044 - 1] = field3774[var4];
            }
        }

        if (var3 > field3836) {
            throw new RuntimeException("");
        } else {
            field3836 = 0;

            for (var4 = 0; var4 < var3; ++var4) {
                int var5 = field3774[var4];
                class424 var6 = field3835[var5];
                int var7 = var1.method1408(1);
                if (var7 == 0) {
                    field3774[++field3836 - 1] = var5;
                    var6.field4156 = field4078;
                } else {
                    int var8 = var1.method1408(2);
                    if (var8 == 0) {
                        field3774[++field3836 - 1] = var5;
                        var6.field4156 = field4078;
                        field3986[++field3889 - 1] = var5;
                    } else {
                        int var9;
                        int var10;
                        if (var8 == 1) {
                            field3774[++field3836 - 1] = var5;
                            var6.field4156 = field4078;
                            var9 = var1.method1408(3);
                            var6.method1950(var9, class447.field3033);
                            var10 = var1.method1408(1);
                            if (var10 == 1) {
                                field3986[++field3889 - 1] = var5;
                            }
                        } else if (var8 == 2) {
                            field3774[++field3836 - 1] = var5;
                            var6.field4156 = field4078;
                            if (var1.method1408(1) == 1) {
                                var9 = var1.method1408(3);
                                var6.method1950(var9, class447.field3030);
                                var10 = var1.method1408(3);
                                var6.method1950(var10, class447.field3030);
                            } else {
                                var9 = var1.method1408(3);
                                var6.method1950(var9, class447.field3029);
                            }

                            var9 = var1.method1408(1);
                            if (var9 == 1) {
                                field3986[++field3889 - 1] = var5;
                            }
                        } else if (var8 == 3) {
                            field3801[++field4044 - 1] = var5;
                        }
                    }
                }
            }

            method2463(var0, var1);
            method2396(var1);

            for (var3 = 0; var3 < field4044; ++var3) {
                var4 = field3801[var3];
                if (field3835[var4].field4156 != field4078) {
                    field3835[var4].field2920 = null;
                    field3835[var4] = null;
                }
            }

            if (var1.field697 != field3840.field2241) {
                throw new RuntimeException(var1.field697 + class49.field553 + field3840.field2241);
            } else {
                for (var3 = 0; var3 < field3836; ++var3) {
                    if (null == field3835[field3774[var3]]) {
                        throw new RuntimeException(var3 + class49.field553 + field3836);
                    }
                }

            }
        }
    }

    static void method2463(boolean var0, class320 var1) {
        while (true) {
            boolean var3 = true;
            int var4 = 65536;
            if (var1.method1409(field3840.field2241) >= 28) {
                int var5 = var1.method1408(16);
                if (var5 != 65535) {
                    boolean var6 = false;
                    if (null == field3835[var5]) {
                        field3835[var5] = new class424();
                        var6 = true;
                    }

                    class424 var7 = field3835[var5];
                    field3774[++field3836 - 1] = var5;
                    var7.field4156 = field4078;
                    int var9;
                    if (var0) {
                        var9 = var1.method1408(8);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = var1.method1408(5);
                        if (var9 > 15) {
                            var9 -= 32;
                        }
                    }

                    boolean var11 = var1.method1408(1) == 1;
                    if (var11) {
                        var1.method1408(32);
                    }

                    int var8 = var1.method1408(1);
                    int var12 = field3956[var1.method1408(3)];
                    if (var6) {
                        var7.field4132 = var7.field4093 = var12;
                    }

                    var7.field2920 = class345.method1635(var1.method1408(14));
                    int var13 = var1.method1408(1);
                    if (var13 == 1) {
                        field3986[++field3889 - 1] = var5;
                    }

                    int var10;
                    if (var0) {
                        var10 = var1.method1408(8);
                        if (var10 > 127) {
                            var10 -= 256;
                        }
                    } else {
                        var10 = var1.method1408(5);
                        if (var10 > 15) {
                            var10 -= 32;
                        }
                    }

                    method2428(var7);
                    if (var7.field4160 == 0) {
                        var7.field4093 = 0;
                    }

                    var7.method1951(class180.field1528.field4166[0] + var9, class180.field1528.field4163[0] + var10, var8 == 1);
                    continue;
                }
            }

            var1.method1411();
            return;
        }
    }

    static void method2396(class320 var0) {
        for (int var2 = 0; var2 < field3889; ++var2) {
            int var3 = field3986[var2];
            class424 var4 = field3835[var3];
            int var5 = var0.method260();
            int var6;
            if ((var5 & 8) != 0) {
                var6 = var0.method260();
                var5 += var6 << 8;
            }

            if ((var5 & 2048) != 0) {
                var6 = var0.method260();
                var5 += var6 << 16;
            }

            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            if ((var5 & 128) != 0) {
                var6 = var0.method320();
                int var12;
                if (var6 > 0) {
                    for (var7 = 0; var7 < var6; ++var7) {
                        var9 = -1;
                        var10 = -1;
                        var11 = -1;
                        var8 = var0.method307();
                        if (var8 == 32767) {
                            var8 = var0.method307();
                            var10 = var0.method307();
                            var9 = var0.method307();
                            var11 = var0.method307();
                        } else if (var8 != 32766) {
                            var10 = var0.method307();
                        } else {
                            var8 = -1;
                        }

                        var12 = var0.method307();
                        var4.method2507(var8, var10, var9, var11, field4078, var12);
                    }
                }

                var7 = var0.method282();
                if (var7 > 0) {
                    for (var8 = 0; var8 < var7; ++var8) {
                        var9 = var0.method307();
                        var10 = var0.method307();
                        if (var10 != 32767) {
                            var11 = var0.method307();
                            var12 = var0.method320();
                            int var13 = var10 > 0 ? var0.method320() : var12;
                            var4.method2503(var9, field4078, var10, var11, var12, var13);
                        } else {
                            var4.method2508(var9);
                        }
                    }
                }
            }

            int[] var14;
            short[] var15;
            short[] var16;
            long var17;
            boolean var18;
            if ((var5 & 512) != 0) {
                var6 = var0.method260();
                if ((var6 & 1) == 1) {
                    var4.method1957();
                } else {
                    var14 = null;
                    if ((var6 & 2) == 2) {
                        var8 = var0.method281();
                        var14 = new int[var8];

                        for (var9 = 0; var9 < var8; ++var9) {
                            var10 = var0.method289();
                            var10 = var10 == 65535 ? -1 : var10;
                            var14[var9] = var10;
                        }
                    }

                    var15 = null;
                    if ((var6 & 4) == 4) {
                        var9 = 0;
                        if (null != var4.field2920.field2494) {
                            var9 = var4.field2920.field2494.length;
                        }

                        var15 = new short[var9];

                        for (var10 = 0; var10 < var9; ++var10) {
                            var15[var10] = (short) var0.method288();
                        }
                    }

                    var16 = null;
                    if ((var6 & 8) == 8) {
                        var10 = 0;
                        if (null != var4.field2920.field2490) {
                            var10 = var4.field2920.field2490.length;
                        }

                        var16 = new short[var10];

                        for (var11 = 0; var11 < var10; ++var11) {
                            var16[var11] = (short) var0.method288();
                        }
                    }

                    var18 = false;
                    if ((var6 & 16) != 0) {
                        var18 = var0.method282() == 1;
                    }

                    var17 = ++class424.field2926 - 1;
                    var4.method1962(new class307(var17, var14, var15, var16, var18));
                }
            }

            if ((var5 & 32) != 0) {
                var6 = var0.method288();
                var7 = var0.method309();
                var4.field4131 = var0.method320() == 1;
                if (field3957 >= 212) {
                    var4.field4129 = var6;
                    var4.field4130 = var7;
                } else {
                    var8 = var4.field4121 - 64 * (var6 - class357.field2573 - class357.field2573);
                    var9 = var4.field4092 - (var7 - class5.field28 - class5.field28) * 64;
                    if (var8 != 0 || var9 != 0) {
                        var11 = (int) (Math.atan2(var8, var9) * 325.94932345220167D) & 2047;
                        var4.field4128 = var11;
                    }
                }
            }

            if ((var5 & 64) != 0) {
                var6 = var0.method309();
                if (var6 == 65535) {
                    var6 = -1;
                }

                var7 = var0.method282();
                if (var4.field4136 == var6 && var6 != -1) {
                    var8 = class124.method575(var6).field1139;
                    if (var8 == 1) {
                        var4.field4137 = 0;
                        var4.field4138 = 0;
                        var4.field4153 = var7;
                        var4.field4118 = 0;
                    }

                    if (var8 == 2) {
                        var4.field4118 = 0;
                    }
                } else if (var6 == -1 || var4.field4136 == -1 || class124.method575(var6).field1132 >= class124.method575(var4.field4136).field1132) {
                    var4.field4136 = var6;
                    var4.field4137 = 0;
                    var4.field4138 = 0;
                    var4.field4153 = var7;
                    var4.field4118 = 0;
                    var4.field4155 = var4.field4139;
                }
            }

            if ((var5 & 131072) != 0) {
                var6 = var0.method320();

                for (var7 = 0; var7 < var6; ++var7) {
                    var8 = var0.method282();
                    var9 = var0.method289();
                    var10 = var0.method305();
                    var4.method2504(var8, var9, var10 >> 16, var10 & 65535);
                }
            }

            if ((var5 & 4) != 0) {
                var4.field2920 = class345.method1635(var0.method309());
                method2428(var4);
                var4.method1956();
            }

            if ((var5 & 16) != 0) {
                var4.field4126 = var0.method287();
                var4.field4126 += var0.method282() << 16;
                var6 = 16777215;
                if (16777215 == var4.field4126) {
                    var4.field4126 = -1;
                }
            }

            if ((var5 & 4096) != 0) {
                var4.field4143 = var0.method284();
                var4.field4145 = var0.method284();
                var4.field4141 = var0.method283();
                var4.field4111 = var0.method275();
                var4.field4147 = var0.method287() + field4078;
                var4.field4148 = var0.method309() + field4078;
                var4.field4149 = var0.method289();
                var4.field4139 = 1;
                var4.field4155 = 0;
                var4.field4143 += var4.field4166[0];
                var4.field4145 += var4.field4163[0];
                var4.field4141 += var4.field4166[0];
                var4.field4111 += var4.field4163[0];
            }

            if ((var5 & 65536) != 0) {
                var6 = var0.method300();
                var4.field4098 = (var6 & 1) != 0 ? var0.method289() : 1686120851 * var4.field2920.field2480 * -1670226789;
                var4.field4159 = (var6 & 2) != 0 ? var0.method288() : 821598169 * var4.field2920.field2481 * -1405323159;
                var4.field4100 = (var6 & 4) != 0 ? var0.method287() : var4.field2920.field2496;
                var4.field4101 = (var6 & 8) != 0 ? var0.method289() : 129510829 * var4.field2920.field2483 * 1271381541;
                var4.field4102 = (var6 & 16) != 0 ? var0.method288() : -1909691015 * var4.field2920.field2484 * 799501513;
                var4.field4150 = (var6 & 32) != 0 ? var0.method288() : var4.field2920.field2485;
                var4.field4161 = (var6 & 64) != 0 ? var0.method289() : -1380991387 * var4.field2920.field2486 * -725499027;
                var4.field4105 = (var6 & 128) != 0 ? var0.method289() : var4.field2920.field2487;
                var4.field4146 = (var6 & 256) != 0 ? var0.method287() : var4.field2920.field2488;
                var4.field4107 = (var6 & 512) != 0 ? var0.method289() : var4.field2920.field2513;
                var4.field4108 = (var6 & 1024) != 0 ? var0.method287() : var4.field2920.field2482;
                var4.field4109 = (var6 & 2048) != 0 ? var0.method289() : -2089336141 * var4.field2920.field2491 * -1708442501;
                var4.field4110 = (var6 & 4096) != 0 ? var0.method287() : 2098030227 * var4.field2920.field2497 * -1815894117;
                var4.field4140 = (var6 & 8192) != 0 ? var0.method288() : var4.field2920.field2514;
                var4.field4097 = (var6 & 16384) != 0 ? var0.method287() : var4.field2920.field2479;
            }

            if ((var5 & 262144) != 0) {
                var6 = var0.method260();
                var14 = new int[8];
                var15 = new short[8];

                for (var9 = 0; var9 < 8; ++var9) {
                    if ((var6 & 1 << var9) != 0) {
                        var14[var9] = var0.method308();
                        var15[var9] = (short) var0.method272();
                    } else {
                        var14[var9] = -1;
                        var15[var9] = -1;
                    }
                }

                var4.method1955(var14, var15);
            }

            if ((var5 & 32768) != 0) {
                var4.method1946(var0.method268());
            }

            if ((var5 & 2) != 0) {
                var0.method309();
                var0.method264();
            }

            if ((var5 & 1) != 0) {
                var4.field4162 = var0.method268();
                var4.field4115 = 100;
            }

            if ((var5 & 8192) != 0) {
                var4.field4152 = field4078 + var0.method309();
                var4.field4094 = field4078 + var0.method309();
                var4.field4154 = var0.method283();
                var4.field4112 = var0.method283();
                var4.field4106 = var0.method283();
                var4.field4144 = (byte) var0.method260();
            }

            if ((var5 & 256) != 0) {
                var6 = var0.method281();
                if ((var6 & 1) == 1) {
                    var4.method1960();
                } else {
                    var14 = null;
                    if ((var6 & 2) == 2) {
                        var8 = var0.method281();
                        var14 = new int[var8];

                        for (var9 = 0; var9 < var8; ++var9) {
                            var10 = var0.method288();
                            var10 = var10 == 65535 ? -1 : var10;
                            var14[var9] = var10;
                        }
                    }

                    var15 = null;
                    if ((var6 & 4) == 4) {
                        var9 = 0;
                        if (var4.field2920.field2494 != null) {
                            var9 = var4.field2920.field2494.length;
                        }

                        var15 = new short[var9];

                        for (var10 = 0; var10 < var9; ++var10) {
                            var15[var10] = (short) var0.method288();
                        }
                    }

                    var16 = null;
                    if ((var6 & 8) == 8) {
                        var10 = 0;
                        if (var4.field2920.field2490 != null) {
                            var10 = var4.field2920.field2490.length;
                        }

                        var16 = new short[var10];

                        for (var11 = 0; var11 < var10; ++var11) {
                            var16[var11] = (short) var0.method287();
                        }
                    }

                    var18 = false;
                    if ((var6 & 16) != 0) {
                        var18 = var0.method282() == 1;
                    }

                    var17 = ++class424.field2919 - 1;
                    var4.method1959(new class307(var17, var14, var15, var16, var18));
                }
            }

            if ((var5 & 16384) != 0) {
                var4.method1947(var0.method281());
            }

            if ((var5 & 1024) != 0) {
                var4.field4167 = var0.method264();
            }
        }

    }

    static void method2428(class424 var0) {
        var0.field4095 = var0.field2920.field2476;
        var0.field4160 = var0.field2920.field2505;
        var0.field4100 = var0.field2920.field2496;
        var0.field4101 = var0.field2920.field2483;
        var0.field4102 = var0.field2920.field2484;
        var0.field4150 = var0.field2920.field2485;
        var0.field4097 = var0.field2920.field2479;
        var0.field4098 = var0.field2920.field2480;
        var0.field4159 = var0.field2920.field2481;
        var0.field4161 = var0.field2920.field2486;
        var0.field4105 = var0.field2920.field2487;
        var0.field4146 = var0.field2920.field2488;
        var0.field4107 = var0.field2920.field2513;
        var0.field4108 = var0.field2920.field2482;
        var0.field4109 = var0.field2920.field2491;
        var0.field4110 = var0.field2920.field2497;
        var0.field4140 = var0.field2920.field2514;
    }

    static class439 method2452(int var0, int var1) {
        field4075.field2967 = var0;
        field4075.field2966 = var1;
        field4075.field2968 = 1;
        field4075.field2969 = 1;
        return field4075;
    }

    static void method2437() {
        field3924 = 0;
        field3888 = false;
    }

    static void method2464() {
        method2437();
        field3930[0] = class32.field416;
        field4049[0] = "";
        field3968[0] = 1006;
        field3932[0] = false;
        field3924 = 1;
    }

    static boolean method2486() {
        return field3888;
    }

    static void method2334(int var0, int var1, int var2, int var3) {
        for (int var5 = 0; var5 < field3946; ++var5) {
            if (field4002[var5] + field4000[var5] > 10 && field4000[var5] < var2 + 10 && field4003[var5] + field4001[var5] > 10 && field4001[var5] < var3 + 10) {
                field3998[var5] = true;
            }
        }

    }

    static boolean method2358(int var0) {
        if (var0 < 0) {
            return false;
        } else {
            int var2 = field3968[var0];
            if (var2 >= 2000) {
                var2 -= 2000;
            }

            return var2 == 1007;
        }
    }

    static void method2484(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
        if (var2 >= 2000) {
            var2 -= 2000;
        }

        class424 var10;
        class46 var11;
        if (var2 == 9) {
            var10 = field3835[var3];
            if (null != var10) {
                field3895 = var7;
                field3896 = var8;
                field4012 = 2;
                field3954 = 0;
                field4026 = var0;
                field3949 = var1;
                var11 = class46.method134(class488.field3586, field3840.field2238);
                var11.field541.method280(field3923.method958(82) ? 1 : 0);
                var11.field541.method312(var3);
                field3840.method1359(var11);
            }
        }

        if (var2 == 12) {
            var10 = field3835[var3];
            if (var10 != null) {
                field3895 = var7;
                field3896 = var8;
                field4012 = 2;
                field3954 = 0;
                field4026 = var0;
                field3949 = var1;
                var11 = class46.method134(class488.field3556, field3840.field2238);
                var11.field541.method280(field3923.method958(82) ? 1 : 0);
                var11.field541.method290(var3);
                field3840.method1359(var11);
            }
        }

        class283 var13;
        if (var2 == 45) {
            var13 = field3948[var3];
            if (null != var13) {
                field3895 = var7;
                field3896 = var8;
                field4012 = 2;
                field3954 = 0;
                field4026 = var0;
                field3949 = var1;
                var11 = class46.method134(class488.field3548, field3840.field2238);
                var11.field541.method285(var3);
                var11.field541.method249(field3923.method958(82) ? 1 : 0);
                field3840.method1359(var11);
            }
        }

        if (var2 == 47) {
            var13 = field3948[var3];
            if (var13 != null) {
                field3895 = var7;
                field3896 = var8;
                field4012 = 2;
                field3954 = 0;
                field4026 = var0;
                field3949 = var1;
                var11 = class46.method134(class488.field3563, field3840.field2238);
                var11.field541.method312(var3);
                var11.field541.method322(field3923.method958(82) ? 1 : 0);
                field3840.method1359(var11);
            }
        }

        class97 var14;
        if (var2 == 57 || var2 == 1007) {
            var14 = class97.method421(var1, var0);
            if (null != var14) {
                method2353(var3, var1, var0, var4, var6);
            }
        }

        class46 var15;
        if (var2 == 19) {
            field3895 = var7;
            field3896 = var8;
            field4012 = 2;
            field3954 = 0;
            field4026 = var0;
            field3949 = var1;
            var15 = class46.method134(class488.field3547, field3840.field2238);
            var15.field541.method290(var1 + class5.field28);
            var15.field541.method285(class357.field2573 + var0);
            var15.field541.method280(field3923.method958(82) ? 1 : 0);
            var15.field541.method318(var3);
            field3840.method1359(var15);
        }

        if (var2 == 1) {
            field3895 = var7;
            field3896 = var8;
            field4012 = 2;
            field3954 = 0;
            field4026 = var0;
            field3949 = var1;
            var15 = class46.method134(class488.field3515, field3840.field2238);
            var15.field541.method312(class165.field1430);
            var15.field541.method315(class85.field735);
            var15.field541.method290(class387.field2777);
            var15.field541.method285(var3);
            var15.field541.method312(var1 + class5.field28);
            var15.field541.method312(class357.field2573 + var0);
            var15.field541.method249(field3923.method958(82) ? 1 : 0);
            field3840.method1359(var15);
        }

        if (var2 == 13) {
            var10 = field3835[var3];
            if (var10 != null) {
                field3895 = var7;
                field3896 = var8;
                field4012 = 2;
                field3954 = 0;
                field4026 = var0;
                field3949 = var1;
                var11 = class46.method134(class488.field3542, field3840.field2238);
                var11.field541.method296(field3923.method958(82) ? 1 : 0);
                var11.field541.method318(var3);
                field3840.method1359(var11);
            }
        }

        if (var2 == 14) {
            var13 = field3948[var3];
            if (var13 != null) {
                field3895 = var7;
                field3896 = var8;
                field4012 = 2;
                field3954 = 0;
                field4026 = var0;
                field3949 = var1;
                var11 = class46.method134(class488.field3508, field3840.field2238);
                var11.field541.method269(class85.field735);
                var11.field541.method312(class165.field1430);
                var11.field541.method312(class387.field2777);
                var11.field541.method312(var3);
                var11.field541.method249(field3923.method958(82) ? 1 : 0);
                field3840.method1359(var11);
            }
        }

        if (var2 == 1002) {
            field3895 = var7;
            field3896 = var8;
            field4012 = 2;
            field3954 = 0;
            var15 = class46.method134(class488.field3561, field3840.field2238);
            var15.field541.method285(var3);
            field3840.method1359(var15);
        }

        if (var2 == 10) {
            var10 = field3835[var3];
            if (null != var10) {
                field3895 = var7;
                field3896 = var8;
                field4012 = 2;
                field3954 = 0;
                field4026 = var0;
                field3949 = var1;
                var11 = class46.method134(class488.field3550, field3840.field2238);
                var11.field541.method249(field3923.method958(82) ? 1 : 0);
                var11.field541.method318(var3);
                field3840.method1359(var11);
            }
        }

        if (var2 == 1001) {
            field3895 = var7;
            field3896 = var8;
            field4012 = 2;
            field3954 = 0;
            field4026 = var0;
            field3949 = var1;
            var15 = class46.method134(class488.field3533, field3840.field2238);
            var15.field541.method285(class5.field28 + var1);
            var15.field541.method318(class357.field2573 + var0);
            var15.field541.method249(field3923.method958(82) ? 1 : 0);
            var15.field541.method312(var3);
            field3840.method1359(var15);
        }

        if (var2 == 26) {
            method2441();
        }

        if (var2 == 8) {
            var10 = field3835[var3];
            if (null != var10) {
                field3895 = var7;
                field3896 = var8;
                field4012 = 2;
                field3954 = 0;
                field4026 = var0;
                field3949 = var1;
                var11 = class46.method134(class488.field3575, field3840.field2238);
                var11.field541.method296(field3923.method958(82) ? 1 : 0);
                var11.field541.method312(var3);
                var11.field541.method318(field3909);
                var11.field541.method298(class4.field22);
                var11.field541.method285(field3943);
                field3840.method1359(var11);
            }
        }

        if (var2 == 18) {
            field3895 = var7;
            field3896 = var8;
            field4012 = 2;
            field3954 = 0;
            field4026 = var0;
            field3949 = var1;
            var15 = class46.method134(class488.field3525, field3840.field2238);
            var15.field541.method312(var3);
            var15.field541.method285(class357.field2573 + var0);
            var15.field541.method280(field3923.method958(82) ? 1 : 0);
            var15.field541.method290(var1 + class5.field28);
            field3840.method1359(var15);
        }

        if (var2 == 23) {
            if (field3888) {
                class329.field2414.method783();
            } else {
                class329.field2414.method762(class201.field1651, var0, var1, true);
            }
        }

        class46 var12;
        if (var2 == 24) {
            var14 = class97.method424(var1);
            if (var14 != null) {
                boolean var17 = true;
                if (var14.field817 > 0) {
                    var17 = class8.method18(var14);
                }

                if (var17) {
                    var12 = class46.method134(class488.field3512, field3840.field2238);
                    var12.field541.method315(var1);
                    field3840.method1359(var12);
                }
            }
        }

        if (var2 == 11) {
            var10 = field3835[var3];
            if (null != var10) {
                field3895 = var7;
                field3896 = var8;
                field4012 = 2;
                field3954 = 0;
                field4026 = var0;
                field3949 = var1;
                var11 = class46.method134(class488.field3578, field3840.field2238);
                var11.field541.method285(var3);
                var11.field541.method249(field3923.method958(82) ? 1 : 0);
                field3840.method1359(var11);
            }
        }

        if (var2 == 49) {
            var13 = field3948[var3];
            if (null != var13) {
                field3895 = var7;
                field3896 = var8;
                field4012 = 2;
                field3954 = 0;
                field4026 = var0;
                field3949 = var1;
                var11 = class46.method134(class488.field3545, field3840.field2238);
                var11.field541.method312(var3);
                var11.field541.method296(field3923.method958(82) ? 1 : 0);
                field3840.method1359(var11);
            }
        }

        if (var2 == 16) {
            field3895 = var7;
            field3896 = var8;
            field4012 = 2;
            field3954 = 0;
            field4026 = var0;
            field3949 = var1;
            var15 = class46.method134(class488.field3551, field3840.field2238);
            var15.field541.method285(class165.field1430);
            var15.field541.method318(var3);
            var15.field541.method249(field3923.method958(82) ? 1 : 0);
            var15.field541.method312(class387.field2777);
            var15.field541.method318(class357.field2573 + var0);
            var15.field541.method312(class5.field28 + var1);
            var15.field541.method297(class85.field735);
            field3840.method1359(var15);
        }

        if (var2 == 2) {
            field3895 = var7;
            field3896 = var8;
            field4012 = 2;
            field3954 = 0;
            field4026 = var0;
            field3949 = var1;
            var15 = class46.method134(class488.field3559, field3840.field2238);
            var15.field541.method285(var3);
            var15.field541.method312(var0 + class357.field2573);
            var15.field541.method290(class5.field28 + var1);
            var15.field541.method285(field3943);
            var15.field541.method296(field3923.method958(82) ? 1 : 0);
            var15.field541.method285(field3909);
            var15.field541.method269(class4.field22);
            field3840.method1359(var15);
        }

        if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
            class466.field3310.method489(var2, var3, new class258(var0), new class258(var1));
        }

        if (var2 == 6) {
            field3895 = var7;
            field3896 = var8;
            field4012 = 2;
            field3954 = 0;
            field4026 = var0;
            field3949 = var1;
            var15 = class46.method134(class488.field3570, field3840.field2238);
            var15.field541.method249(field3923.method958(82) ? 1 : 0);
            var15.field541.method312(var1 + class5.field28);
            var15.field541.method290(var3);
            var15.field541.method318(class357.field2573 + var0);
            field3840.method1359(var15);
        }

        if (var2 == 21) {
            field3895 = var7;
            field3896 = var8;
            field4012 = 2;
            field3954 = 0;
            field4026 = var0;
            field3949 = var1;
            var15 = class46.method134(class488.field3541, field3840.field2238);
            var15.field541.method249(field3923.method958(82) ? 1 : 0);
            var15.field541.method318(class357.field2573 + var0);
            var15.field541.method312(class5.field28 + var1);
            var15.field541.method318(var3);
            field3840.method1359(var15);
        }

        if (var2 == 30 && field3952 == null) {
            method2490(var1, var0);
            field3952 = class97.method421(var1, var0);
            method2424(field3952);
        }

        if (var2 == 15) {
            var13 = field3948[var3];
            if (var13 != null) {
                field3895 = var7;
                field3896 = var8;
                field4012 = 2;
                field3954 = 0;
                field4026 = var0;
                field3949 = var1;
                var11 = class46.method134(class488.field3555, field3840.field2238);
                var11.field541.method285(field3943);
                var11.field541.method318(field3909);
                var11.field541.method298(class4.field22);
                var11.field541.method318(var3);
                var11.field541.method280(field3923.method958(82) ? 1 : 0);
                field3840.method1359(var11);
            }
        }

        int var16;
        class97 var18;
        if (var2 == 28) {
            var15 = class46.method134(class488.field3512, field3840.field2238);
            var15.field541.method315(var1);
            field3840.method1359(var15);
            var18 = class97.method424(var1);
            if (null != var18 && null != var18.field855 && var18.field855[0][0] == 5) {
                var16 = var18.field855[0][1];
                class10.field46[var16] = 1 - class10.field46[var16];
                method2446(var16);
            }
        }

        if (var2 == 48) {
            var13 = field3948[var3];
            if (null != var13) {
                field3895 = var7;
                field3896 = var8;
                field4012 = 2;
                field3954 = 0;
                field4026 = var0;
                field3949 = var1;
                var11 = class46.method134(class488.field3510, field3840.field2238);
                var11.field541.method312(var3);
                var11.field541.method296(field3923.method958(82) ? 1 : 0);
                field3840.method1359(var11);
            }
        }

        if (var2 == 4) {
            field3895 = var7;
            field3896 = var8;
            field4012 = 2;
            field3954 = 0;
            field4026 = var0;
            field3949 = var1;
            var15 = class46.method134(class488.field3500, field3840.field2238);
            var15.field541.method290(class357.field2573 + var0);
            var15.field541.method290(class5.field28 + var1);
            var15.field541.method318(var3);
            var15.field541.method322(field3923.method958(82) ? 1 : 0);
            field3840.method1359(var15);
        }

        if (var2 == 29) {
            var15 = class46.method134(class488.field3512, field3840.field2238);
            var15.field541.method315(var1);
            field3840.method1359(var15);
            var18 = class97.method424(var1);
            if (null != var18 && var18.field855 != null && var18.field855[0][0] == 5) {
                var16 = var18.field855[0][1];
                if (var18.field914[0] != class10.field46[var16]) {
                    class10.field46[var16] = var18.field914[0];
                    method2446(var16);
                }
            }
        }

        if (var2 == 1003) {
            field3895 = var7;
            field3896 = var8;
            field4012 = 2;
            field3954 = 0;
            var10 = field3835[var3];
            if (null != var10) {
                class345 var19 = var10.field2920;
                if (null != var19.field2503) {
                    var19 = var19.method1625();
                }

                if (null != var19) {
                    var12 = class46.method134(class488.field3562, field3840.field2238);
                    var12.field541.method312(var19.field2474);
                    field3840.method1359(var12);
                }
            }
        }

        if (var2 == 44) {
            var13 = field3948[var3];
            if (null != var13) {
                field3895 = var7;
                field3896 = var8;
                field4012 = 2;
                field3954 = 0;
                field4026 = var0;
                field3949 = var1;
                var11 = class46.method134(class488.field3507, field3840.field2238);
                var11.field541.method285(var3);
                var11.field541.method296(field3923.method958(82) ? 1 : 0);
                field3840.method1359(var11);
            }
        }

        if (var2 == 1004) {
            field3895 = var7;
            field3896 = var8;
            field4012 = 2;
            field3954 = 0;
            var15 = class46.method134(class488.field3540, field3840.field2238);
            var15.field541.method290(class357.field2573 + var0);
            var15.field541.method285(var3);
            var15.field541.method318(class5.field28 + var1);
            field3840.method1359(var15);
        }

        if (var2 == 46) {
            var13 = field3948[var3];
            if (var13 != null) {
                field3895 = var7;
                field3896 = var8;
                field4012 = 2;
                field3954 = 0;
                field4026 = var0;
                field3949 = var1;
                var11 = class46.method134(class488.field3560, field3840.field2238);
                var11.field541.method318(var3);
                var11.field541.method249(field3923.method958(82) ? 1 : 0);
                field3840.method1359(var11);
            }
        }

        if (var2 == 22) {
            field3895 = var7;
            field3896 = var8;
            field4012 = 2;
            field3954 = 0;
            field4026 = var0;
            field3949 = var1;
            var15 = class46.method134(class488.field3568, field3840.field2238);
            var15.field541.method285(var0 + class357.field2573);
            var15.field541.method290(var1 + class5.field28);
            var15.field541.method280(field3923.method958(82) ? 1 : 0);
            var15.field541.method290(var3);
            field3840.method1359(var15);
        }

        if (var2 == 58) {
            var14 = class97.method421(var1, var0);
            if (var14 != null) {
                if (null != var14.field895) {
                    class26 var20 = new class26();
                    var20.field138 = var14;
                    var20.field143 = var3;
                    var20.field147 = var6;
                    var20.field141 = var14.field895;
                    class269.method1200(var20);
                }

                var11 = class46.method134(class488.field3511, field3840.field2238);
                var11.field541.method312(field3909);
                var11.field541.method290(var0);
                var11.field541.method285(field3943);
                var11.field541.method290(var4);
                var11.field541.method298(class4.field22);
                var11.field541.method297(var1);
                field3840.method1359(var11);
            }
        }

        if (var2 == 5) {
            field3895 = var7;
            field3896 = var8;
            field4012 = 2;
            field3954 = 0;
            field4026 = var0;
            field3949 = var1;
            var15 = class46.method134(class488.field3536, field3840.field2238);
            var15.field541.method290(var3);
            var15.field541.method285(class357.field2573 + var0);
            var15.field541.method280(field3923.method958(82) ? 1 : 0);
            var15.field541.method290(class5.field28 + var1);
            field3840.method1359(var15);
        }

        if (var2 == 50) {
            var13 = field3948[var3];
            if (var13 != null) {
                field3895 = var7;
                field3896 = var8;
                field4012 = 2;
                field3954 = 0;
                field4026 = var0;
                field3949 = var1;
                var11 = class46.method134(class488.field3596, field3840.field2238);
                var11.field541.method318(var3);
                var11.field541.method249(field3923.method958(82) ? 1 : 0);
                field3840.method1359(var11);
            }
        }

        if (var2 == 25) {
            var14 = class97.method421(var1, var0);
            if (null != var14) {
                class276.method1244();
                method2458(var1, var0, class383.method1776(method2420(var14)), var4);
                field3940 = 0;
                field3958 = method2450(var14);
                if (null == field3958) {
                    field3958 = class32.field483;
                }

                if (var14.field871) {
                    field3969 = var14.field795 + class49.method140(16777215);
                } else {
                    field3969 = class49.method140(65280) + var14.field899 + class49.method140(16777215);
                }
            }

        } else {
            if (var2 == 17) {
                field3895 = var7;
                field3896 = var8;
                field4012 = 2;
                field3954 = 0;
                field4026 = var0;
                field3949 = var1;
                var15 = class46.method134(class488.field3589, field3840.field2238);
                var15.field541.method318(var0 + class357.field2573);
                var15.field541.method280(field3923.method958(82) ? 1 : 0);
                var15.field541.method312(field3909);
                var15.field541.method285(field3943);
                var15.field541.method298(class4.field22);
                var15.field541.method312(var1 + class5.field28);
                var15.field541.method312(var3);
                field3840.method1359(var15);
            }

            if (var2 == 20) {
                field3895 = var7;
                field3896 = var8;
                field4012 = 2;
                field3954 = 0;
                field4026 = var0;
                field3949 = var1;
                var15 = class46.method134(class488.field3531, field3840.field2238);
                var15.field541.method318(var1 + class5.field28);
                var15.field541.method280(field3923.method958(82) ? 1 : 0);
                var15.field541.method285(var3);
                var15.field541.method318(var0 + class357.field2573);
                field3840.method1359(var15);
            }

            if (var2 == 3) {
                field3895 = var7;
                field3896 = var8;
                field4012 = 2;
                field3954 = 0;
                field4026 = var0;
                field3949 = var1;
                var15 = class46.method134(class488.field3576, field3840.field2238);
                var15.field541.method290(class357.field2573 + var0);
                var15.field541.method318(class5.field28 + var1);
                var15.field541.method249(field3923.method958(82) ? 1 : 0);
                var15.field541.method285(var3);
                field3840.method1359(var15);
            }

            if (var2 == 51) {
                var13 = field3948[var3];
                if (var13 != null) {
                    field3895 = var7;
                    field3896 = var8;
                    field4012 = 2;
                    field3954 = 0;
                    field4026 = var0;
                    field3949 = var1;
                    var11 = class46.method134(class488.field3592, field3840.field2238);
                    var11.field541.method249(field3923.method958(82) ? 1 : 0);
                    var11.field541.method312(var3);
                    field3840.method1359(var11);
                }
            }

            if (var2 == 7) {
                var10 = field3835[var3];
                if (null != var10) {
                    field3895 = var7;
                    field3896 = var8;
                    field4012 = 2;
                    field3954 = 0;
                    field4026 = var0;
                    field3949 = var1;
                    var11 = class46.method134(class488.field3566, field3840.field2238);
                    var11.field541.method318(class387.field2777);
                    var11.field541.method318(class165.field1430);
                    var11.field541.method269(class85.field735);
                    var11.field541.method318(var3);
                    var11.field541.method280(field3923.method958(82) ? 1 : 0);
                    field3840.method1359(var11);
                }
            }

            if (field3940 != 0) {
                field3940 = 0;
                method2424(class97.method424(class85.field735));
            }

            if (field3867) {
                class276.method1244();
            }

        }
    }

    static void method2458(int var0, int var1, int var2, int var3) {
        class97 var5 = class97.method421(var0, var1);
        if (var5 != null && null != var5.field885) {
            class26 var6 = new class26();
            var6.field138 = var5;
            var6.field141 = var5.field885;
            class269.method1200(var6);
        }

        field3909 = var3;
        field3867 = true;
        class4.field22 = var0;
        field3943 = var1;
        class466.field3312 = var2;
        method2424(var5);
    }

    static void method2490(int var0, int var1) {
        class46 var3 = class46.method134(class488.field3553, field3840.field2238);
        var3.field541.method269(var0);
        var3.field541.method318(var1);
        field3840.method1359(var3);
    }

    static void method2353(int var0, int var1, int var2, int var3, String var4) {
        class97 var6 = class97.method421(var1, var2);
        if (null != var6) {
            if (var6.field894 != null) {
                class26 var7 = new class26();
                var7.field138 = var6;
                var7.field143 = var0;
                var7.field147 = var4;
                var7.field141 = var6.field894;
                class269.method1200(var7);
            }

            boolean var12 = true;
            if (var6.field817 > 0) {
                var12 = class8.method18(var6);
            }

            if (var12) {
                int var9 = method2420(var6);
                int var10 = var0 - 1;
                boolean var8 = (var9 >> var10 + 1 & 1) != 0;
                if (var8) {
                    class46 var11;
                    if (var0 == 1) {
                        var11 = class46.method134(class488.field3523, field3840.field2238);
                        var11.field541.method315(var1);
                        var11.field541.method290(var2);
                        var11.field541.method290(var3);
                        field3840.method1359(var11);
                    }

                    if (var0 == 2) {
                        var11 = class46.method134(class488.field3513, field3840.field2238);
                        var11.field541.method315(var1);
                        var11.field541.method290(var2);
                        var11.field541.method290(var3);
                        field3840.method1359(var11);
                    }

                    if (var0 == 3) {
                        var11 = class46.method134(class488.field3565, field3840.field2238);
                        var11.field541.method315(var1);
                        var11.field541.method290(var2);
                        var11.field541.method290(var3);
                        field3840.method1359(var11);
                    }

                    if (var0 == 4) {
                        var11 = class46.method134(class488.field3530, field3840.field2238);
                        var11.field541.method315(var1);
                        var11.field541.method290(var2);
                        var11.field541.method290(var3);
                        field3840.method1359(var11);
                    }

                    if (var0 == 5) {
                        var11 = class46.method134(class488.field3546, field3840.field2238);
                        var11.field541.method315(var1);
                        var11.field541.method290(var2);
                        var11.field541.method290(var3);
                        field3840.method1359(var11);
                    }

                    if (var0 == 6) {
                        var11 = class46.method134(class488.field3502, field3840.field2238);
                        var11.field541.method315(var1);
                        var11.field541.method290(var2);
                        var11.field541.method290(var3);
                        field3840.method1359(var11);
                    }

                    if (var0 == 7) {
                        var11 = class46.method134(class488.field3544, field3840.field2238);
                        var11.field541.method315(var1);
                        var11.field541.method290(var2);
                        var11.field541.method290(var3);
                        field3840.method1359(var11);
                    }

                    if (var0 == 8) {
                        var11 = class46.method134(class488.field3498, field3840.field2238);
                        var11.field541.method315(var1);
                        var11.field541.method290(var2);
                        var11.field541.method290(var3);
                        field3840.method1359(var11);
                    }

                    if (var0 == 9) {
                        var11 = class46.method134(class488.field3573, field3840.field2238);
                        var11.field541.method315(var1);
                        var11.field541.method290(var2);
                        var11.field541.method290(var3);
                        field3840.method1359(var11);
                    }

                    if (var0 == 10) {
                        var11 = class46.method134(class488.field3529, field3840.field2238);
                        var11.field541.method315(var1);
                        var11.field541.method290(var2);
                        var11.field541.method290(var3);
                        field3840.method1359(var11);
                    }

                }
            }
        }
    }

    public static void method2473(String var0, String var1, int var2, int var3, int var4, int var5) {
        method2378(var0, var1, var2, var3, var4, var5, -1, false);
    }

    static void method2378(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
        if (!field3888) {
            if (field3924 < 500) {
                field3930[field3924] = var0;
                field4049[field3924] = var1;
                field3968[field3924] = var2;
                field3928[field3924] = var3;
                field3925[field3924] = var4;
                field3926[field3924] = var5;
                field3929[field3924] = var6;
                field3932[field3924] = var7;
                ++field3924;
            }

        }
    }

    static String method2410(int var0) {
        if (var0 < 0) {
            return "";
        } else {
            return field4049[var0].length() > 0 ? field3930[var0] + class32.field221 + field4049[var0] : field3930[var0];
        }
    }

    static void method2394(int var0, int var1, int var2, int var3) {
        if (field3940 == 0 && !field3867) {
            method2473(class32.field342, "", 23, 0, var0 - var2, var1 - var3);
        }

        long var5 = -1L;
        long var7 = -1L;
        int var9 = 0;

        while (true) {
            int var11 = class368.field2634;
            if (var9 >= var11) {
                if (var5 != -1L) {
                    var9 = (int) (var5 >>> 0 & 127L);
                    var11 = (int) (var5 >>> 7 & 127L);
                    class283 var13 = field3948[field3914];
                    method2429(var13, field3914, var9, var11);
                }

                return;
            }

            long var12 = class368.method1740(var9);
            if (var7 != var12) {
                label306:
                {
                    var7 = var12;
                    int var14 = class368.method1734(var9);
                    int var15 = class368.method1733(var9);
                    int var16 = class368.method1738(class368.field2636[var9]);
                    int var18 = class368.method1739(class368.field2636[var9]);
                    int var19 = var18;
                    int var23;
                    if (var16 == 2 && class329.field2414.method755(class201.field1651, var14, var15, var12) >= 0) {
                        class304 var20 = class192.method892(var18, (byte) -22);
                        if (var20.field2216 != null) {
                            var20 = var20.method1346();
                        }

                        if (var20 == null) {
                            break label306;
                        }

                        class316 var21 = null;

                        for (class316 var22 = (class316) field3916.method122(); null != var22; var22 = (class316) field3916.method124()) {
                            if (class201.field1651 == var22.field2283 && var22.field2276 == var14 && var22.field2282 == var15 && var22.field2275 == var19) {
                                var21 = var22;
                                break;
                            }
                        }

                        if (field3940 == 1) {
                            method2473(class32.field337, field3941 + " " + class49.field554 + " " + class49.method140(65535) + var20.field2185, 1, var19, var14, var15);
                        } else if (field3867) {
                            if ((class466.field3312 & 4) == 4) {
                                method2473(field3958, field3969 + " " + class49.field554 + " " + class49.method140(65535) + var20.field2185, 2, var19, var14, var15);
                            }
                        } else {
                            String[] var30 = var20.field2194;
                            if (null != var30) {
                                for (var23 = 4; var23 >= 0; --var23) {
                                    if ((var21 == null || var21.method1393(var23)) && null != var30[var23]) {
                                        short var24 = 0;
                                        if (var23 == 0) {
                                            var24 = 3;
                                        }

                                        if (var23 == 1) {
                                            var24 = 4;
                                        }

                                        if (var23 == 2) {
                                            var24 = 5;
                                        }

                                        if (var23 == 3) {
                                            var24 = 6;
                                        }

                                        if (var23 == 4) {
                                            var24 = 1001;
                                        }

                                        method2473(var30[var23], class49.method140(65535) + var20.field2185, var24, var19, var14, var15);
                                    }
                                }
                            }

                            method2473(class32.field338, class49.method140(65535) + var20.field2185, 1002, var20.field2182, var14, var15);
                        }
                    }

                    int var29;
                    class424 var31;
                    int[] var32;
                    class283 var36;
                    if (var16 == 1) {
                        class424 var26 = field3835[var19];
                        if (var26 == null) {
                            break label306;
                        }

                        if (var26.field2920.field2476 == 1 && (var26.field4121 & 127) == 64 && (var26.field4092 & 127) == 64) {
                            for (var29 = 0; var29 < field3836; ++var29) {
                                var31 = field3835[field3774[var29]];
                                if (null != var31 && var26 != var31 && var31.field2920.field2476 == 1 && var26.field4121 == var31.field4121 && var31.field4092 == var26.field4092) {
                                    method2442(var31, field3774[var29], var14, var15);
                                }
                            }

                            var29 = class172.field1443;
                            var32 = class172.field1444;

                            for (var23 = 0; var23 < var29; ++var23) {
                                var36 = field3948[var32[var23]];
                                if (var36 != null && var26.field4121 == var36.field4121 && var36.field4092 == var26.field4092) {
                                    method2429(var36, var32[var23], var14, var15);
                                }
                            }
                        }

                        method2442(var26, var19, var14, var15);
                    }

                    if (var16 == 0) {
                        class283 var27 = field3948[var19];
                        if (var27 == null) {
                            break label306;
                        }

                        if ((var27.field4121 & 127) == 64 && (var27.field4092 & 127) == 64) {
                            for (var29 = 0; var29 < field3836; ++var29) {
                                var31 = field3835[field3774[var29]];
                                if (null != var31 && var31.field2920.field2476 == 1 && var31.field4121 == var27.field4121 && var31.field4092 == var27.field4092) {
                                    method2442(var31, field3774[var29], var14, var15);
                                }
                            }

                            var29 = class172.field1443;
                            var32 = class172.field1444;

                            for (var23 = 0; var23 < var29; ++var23) {
                                var36 = field3948[var32[var23]];
                                if (var36 != null && var27 != var36 && var27.field4121 == var36.field4121 && var36.field4092 == var27.field4092) {
                                    method2429(var36, var32[var23], var14, var15);
                                }
                            }
                        }

                        if (field3914 != var19) {
                            method2429(var27, var19, var14, var15);
                        } else {
                            var5 = var12;
                        }
                    }

                    if (var16 == 3) {
                        class43 var28 = field3915[class201.field1651][var14][var15];
                        if (null != var28) {
                            for (class272 var33 = (class272) var28.method123(); null != var33; var33 = (class272) var28.method128()) {
                                class508 var34 = class508.method2299(var33.field1992);
                                if (field3940 == 1) {
                                    method2473(class32.field337, field3941 + " " + class49.field554 + " " + class49.method140(16748608) + var34.field3736, 16, var33.field1992, var14, var15);
                                } else if (field3867) {
                                    if ((class466.field3312 & 1) == 1) {
                                        method2473(field3958, field3969 + " " + class49.field554 + " " + class49.method140(16748608) + var34.field3736, 17, var33.field1992, var14, var15);
                                    }
                                } else {
                                    String[] var35 = var34.field3737;

                                    for (int var37 = 4; var37 >= 0; --var37) {
                                        if (var33.method1216(var37)) {
                                            if (var35 != null && var35[var37] != null) {
                                                byte var25 = 0;
                                                if (var37 == 0) {
                                                    var25 = 18;
                                                }

                                                if (var37 == 1) {
                                                    var25 = 19;
                                                }

                                                if (var37 == 2) {
                                                    var25 = 20;
                                                }

                                                if (var37 == 3) {
                                                    var25 = 21;
                                                }

                                                if (var37 == 4) {
                                                    var25 = 22;
                                                }

                                                method2473(var35[var37], class49.method140(16748608) + var34.field3736, var25, var33.field1992, var14, var15);
                                            } else if (var37 == 2) {
                                                method2473(class32.field336, class49.method140(16748608) + var34.field3736, 20, var33.field1992, var14, var15);
                                            }
                                        }
                                    }

                                    method2473(class32.field338, class49.method140(16748608) + var34.field3736, 1004, var33.field1992, var14, var15);
                                }
                            }
                        }
                    }
                }
            }

            ++var9;
        }
    }

    static void method2442(class424 var0, int var1, int var2, int var3) {
        class345 var5 = var0.field2920;
        if (field3924 < 400) {
            if (null != var5.field2503) {
                var5 = var5.method1625();
            }

            if (var5 != null) {
                if (var5.field2509) {
                    if (!var5.field2511 || var1 == field3810) {
                        String var6 = var0.method1949();
                        int var7;
                        if (var5.field2499 != 0 && var0.field4167 != 0) {
                            var7 = var0.field4167 != -1 ? var0.field4167 : var5.field2499;
                            var6 = var6 + class127.method584(var7, class180.field1528.field2059) + " " + class49.field549 + class32.field183 + var7 + class49.field551;
                        }

                        if (var5.field2511 && field3933) {
                            method2473(class32.field338, class49.method140(16776960) + var6, 1003, var1, var2, var3);
                        }

                        if (field3940 == 1) {
                            method2473(class32.field337, field3941 + " " + class49.field554 + " " + class49.method140(16776960) + var6, 7, var1, var2, var3);
                        } else if (field3867) {
                            if ((class466.field3312 & 2) == 2) {
                                method2473(field3958, field3969 + " " + class49.field554 + " " + class49.method140(16776960) + var6, 8, var1, var2, var3);
                            }
                        } else {
                            var7 = var5.field2511 && field3933 ? 2000 : 0;
                            String[] var8 = var5.field2473;
                            int var9;
                            int var10;
                            if (var8 != null) {
                                for (var9 = 4; var9 >= 0; --var9) {
                                    if (var0.method1948(var9) && null != var8[var9] && !var8[var9].equalsIgnoreCase(class32.field339)) {
                                        var10 = 0;
                                        if (var9 == 0) {
                                            var10 = var7 + 9;
                                        }

                                        if (var9 == 1) {
                                            var10 = var7 + 10;
                                        }

                                        if (var9 == 2) {
                                            var10 = var7 + 11;
                                        }

                                        if (var9 == 3) {
                                            var10 = var7 + 12;
                                        }

                                        if (var9 == 4) {
                                            var10 = var7 + 13;
                                        }

                                        method2473(var8[var9], class49.method140(16776960) + var6, var10, var1, var2, var3);
                                    }
                                }
                            }

                            if (null != var8) {
                                for (var9 = 4; var9 >= 0; --var9) {
                                    if (var0.method1948(var9) && null != var8[var9] && var8[var9].equalsIgnoreCase(class32.field339)) {
                                        short var11 = 0;
                                        if (class295.field2138 != field3805) {
                                            if (class295.field2137 == field3805 || field3805 == class295.field2142 && var5.field2499 > class180.field1528.field2059) {
                                                var11 = 2000;
                                            }

                                            var10 = 0;
                                            if (var9 == 0) {
                                                var10 = var11 + 9;
                                            }

                                            if (var9 == 1) {
                                                var10 = var11 + 10;
                                            }

                                            if (var9 == 2) {
                                                var10 = var11 + 11;
                                            }

                                            if (var9 == 3) {
                                                var10 = var11 + 12;
                                            }

                                            if (var9 == 4) {
                                                var10 = var11 + 13;
                                            }

                                            method2473(var8[var9], class49.method140(16776960) + var6, var10, var1, var2, var3);
                                        }
                                    }
                                }
                            }

                            if (!var5.field2511 || !field3933) {
                                method2473(class32.field338, class49.method140(16776960) + var6, 1003, var1, var2, var3);
                            }
                        }

                    }
                }
            }
        }
    }

    static void method2429(class283 var0, int var1, int var2, int var3) {
        if (class180.field1528 != var0) {
            if (field3924 < 400) {
                String var5;
                if (var0.field2067 == 0) {
                    var5 = var0.field2057[0] + var0.field2070 + var0.field2057[1] + class127.method584(var0.field2059, class180.field1528.field2059) + " " + class49.field549 + class32.field183 + var0.field2059 + class49.field551 + var0.field2057[2];
                } else {
                    var5 = var0.field2057[0] + var0.field2070 + var0.field2057[1] + " " + class49.field549 + class32.field347 + var0.field2067 + class49.field551 + var0.field2057[2];
                }

                int var6;
                if (field3940 == 1) {
                    method2473(class32.field337, field3941 + " " + class49.field554 + " " + class49.method140(16777215) + var5, 14, var1, var2, var3);
                } else if (field3867) {
                    if ((class466.field3312 & 8) == 8) {
                        method2473(field3958, field3969 + " " + class49.field554 + " " + class49.method140(16777215) + var5, 15, var1, var2, var3);
                    }
                } else {
                    for (var6 = 7; var6 >= 0; --var6) {
                        if (null != field3798[var6]) {
                            short var7 = 0;
                            if (field3798[var6].equalsIgnoreCase(class32.field339)) {
                                if (class295.field2138 == field3804) {
                                    continue;
                                }

                                if (class295.field2137 == field3804 || field3804 == class295.field2142 && var0.field2059 > class180.field1528.field2059) {
                                    var7 = 2000;
                                }

                                if (class180.field1528.field2080 != 0 && var0.field2080 != 0) {
                                    if (class180.field1528.field2080 == var0.field2080) {
                                        var7 = 2000;
                                    } else {
                                        var7 = 0;
                                    }
                                } else if (field3804 == class295.field2139 && var0.method1292()) {
                                    var7 = 2000;
                                }
                            } else if (field3912[var6]) {
                                var7 = 2000;
                            }

                            boolean var8 = false;
                            int var9 = var7 + field3910[var6];
                            method2473(field3798[var6], class49.method140(16777215) + var5, var9, var1, var2, var3);
                        }
                    }
                }

                for (var6 = 0; var6 < field3924; ++var6) {
                    if (field3968[var6] == 23) {
                        field4049[var6] = class49.method140(16777215) + var5;
                        break;
                    }
                }

            }
        }
    }

    static void method2350(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        if (class97.method428(var0)) {
            class173.field1456 = null;
            method2393(class46.field542[var0], -1, var1, var2, var3, var4, var5, var6, var7);
            if (null != class173.field1456) {
                method2393(class173.field1456, -1412584499, var1, var2, var3, var4, class528.field4213, class505.field3703, var7);
                class173.field1456 = null;
            }

        } else {
            if (var7 != -1) {
                field3785[var7] = true;
            } else {
                for (int var9 = 0; var9 < 100; ++var9) {
                    field3785[var9] = true;
                }
            }

        }
    }

    static void method2393(class97[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        class415.method1921(var2, var3, var4, var5);
        class334.method1579();

        for (int var10 = 0; var10 < var0.length; ++var10) {
            class97 var11 = var0[var10];
            if (null != var11 && (var11.field808 == var1 || var1 == -1412584499 && field3959 == var11)) {
                int var12;
                if (var8 == -1) {
                    field4000[field3946] = var11.field792 + var6;
                    field4001[field3946] = var7 + var11.field805;
                    field4002[field3946] = var11.field806;
                    field4003[field3946] = var11.field783;
                    var12 = ++field3946 - 1;
                } else {
                    var12 = var8;
                }

                var11.field930 = var12;
                var11.field931 = field4078;
                if (!var11.field871 || !method2397(var11)) {
                    if (var11.field817 > 0) {
                        method2417(var11);
                    }

                    int var13 = var11.field792 + var6;
                    int var14 = var11.field805 + var7;
                    int var15 = var11.field812;
                    int var16;
                    int var17;
                    if (var11 == field3959) {
                        if (var1 != -1412584499 && !var11.field872) {
                            class173.field1456 = var0;
                            class528.field4213 = var6;
                            class505.field3703 = var7;
                            continue;
                        }

                        if (field3970 && field3964) {
                            var16 = class499.field3651;
                            var17 = class499.field3634;
                            var16 -= field3961;
                            var17 -= field4034;
                            if (var16 < field3965) {
                                var16 = field3965;
                            }

                            if (var16 + var11.field806 > field3965 + field3978.field806) {
                                var16 = field3978.field806 + field3965 - var11.field806;
                            }

                            if (var17 < field3966) {
                                var17 = field3966;
                            }

                            if (var17 + var11.field783 > field3966 + field3978.field783) {
                                var17 = field3966 + field3978.field783 - var11.field783;
                            }

                            var13 = var16;
                            var14 = var17;
                        }

                        if (!var11.field872) {
                            var15 = 128;
                        }
                    }

                    int var18;
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field793 == 9) {
                        var20 = var13;
                        var21 = var14;
                        var22 = var11.field806 + var13;
                        var23 = var14 + var11.field783;
                        if (var22 < var13) {
                            var20 = var22;
                            var22 = var13;
                        }

                        if (var23 < var14) {
                            var21 = var23;
                            var23 = var14;
                        }

                        ++var22;
                        ++var23;
                        var16 = var20 > var2 ? var20 : var2;
                        var17 = var21 > var3 ? var21 : var3;
                        var18 = var22 < var4 ? var22 : var4;
                        var19 = var23 < var5 ? var23 : var5;
                    } else {
                        var20 = var13 + var11.field806;
                        var21 = var14 + var11.field783;
                        var16 = var13 > var2 ? var13 : var2;
                        var17 = var14 > var3 ? var14 : var3;
                        var18 = var20 < var4 ? var20 : var4;
                        var19 = var21 < var5 ? var21 : var5;
                    }

                    if (!var11.field871 || var16 < var18 && var17 < var19) {
                        if (var11.field817 != 0) {
                            if (var11.field817 == 1336) {
                                if (class290.field2121.method2538()) {
                                    var14 += 15;
                                    class21.field75.method927("Fps:" + class479.field3431, var13 + var11.field806, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var45 = Runtime.getRuntime();
                                    var21 = (int) ((var45.totalMemory() - var45.freeMemory()) / 1024L);
                                    var22 = 16776960;
                                    if (var21 > 327680 && !field3779) {
                                        var22 = 16711680;
                                    }

                                    class21.field75.method927("Mem:" + var21 + "k", var11.field806 + var13, var14, var22, -1);
                                    var14 += 15;
                                }
                                continue;
                            }

                            if (var11.field817 == 1337) {
                                field3936 = var13;
                                field3937 = var14;
                                method2399(var13, var14, var11.field806, var11.field783);
                                field3785[var11.field930] = true;
                                class415.method1921(var2, var3, var4, var5);
                                continue;
                            }

                            if (var11.field817 == 1338) {
                                method2343(var11, var13, var14, var12);
                                class415.method1921(var2, var3, var4, var5);
                                continue;
                            }

                            if (var11.field817 == 1339) {
                                method2337(var11, var13, var14, var12);
                                class415.method1921(var2, var3, var4, var5);
                                continue;
                            }

                            if (var11.field817 == 1400) {
                                class466.field3310.method488(var13, var14, var11.field806, var11.field783, field4078);
                            }

                            if (var11.field817 == 1401) {
                                class466.field3310.method478(var13, var14, var11.field806, var11.field783);
                            }

                            if (var11.field817 == 1402) {
                                class360.field2579.method981(var13, field4078);
                            }
                        }

                        if (var11.field793 == 0) {
                            if (!var11.field871 && method2397(var11) && class423.field2915 != var11) {
                                continue;
                            }

                            if (!var11.field871) {
                                if (var11.field824 > var11.field813 - var11.field783) {
                                    var11.field824 = var11.field813 - var11.field783;
                                }

                                if (var11.field824 < 0) {
                                    var11.field824 = 0;
                                }
                            }

                            method2393(var0, var11.field791, var16, var17, var18, var19, var13 - var11.field810, var14 - var11.field824, var12);
                            if (null != var11.field923) {
                                method2393(var11.field923, var11.field791, var16, var17, var18, var19, var13 - var11.field810, var14 - var11.field824, var12);
                            }

                            class522 var29 = (class522) field3796.method857(var11.field791);
                            if (null != var29) {
                                method2350(var29.field4202, var16, var17, var18, var19, var13, var14, var12);
                            }

                            class415.method1921(var2, var3, var4, var5);
                            class334.method1579();
                        } else if (var11.field793 == 11) {
                            if (method2397(var11) && var11 != class423.field2915) {
                                continue;
                            }

                            if (var11.field923 != null) {
                                method2393(var11.field923, var11.field791, var16, var17, var18, var19, var13 - var11.field810, var14 - var11.field824, var12);
                            }

                            class415.method1921(var2, var3, var4, var5);
                            class334.method1579();
                        }

                        if (field4006 || field3999[var12] || field4004 > 1) {
                            if (var11.field793 == 0 && !var11.field871 && var11.field813 > var11.field783) {
                                method2409(var13 + var11.field806, var14, var11.field824, var11.field783, var11.field813);
                            }

                            if (var11.field793 != 1) {
                                if (var11.field793 == 3) {
                                    if (method2347(var11)) {
                                        var20 = var11.field815;
                                        if (var11 == class423.field2915 && var11.field861 != 0) {
                                            var20 = var11.field861;
                                        }
                                    } else {
                                        var20 = var11.field814;
                                        if (class423.field2915 == var11 && var11.field818 != 0) {
                                            var20 = var11.field818;
                                        }
                                    }

                                    if (var11.field853) {
                                        switch (var11.field819.field765) {
                                            case 1:
                                                class415.method1915(var13, var14, var11.field806, var11.field783, var11.field814, var11.field815);
                                                break;
                                            case 2:
                                                class415.method1928(var13, var14, var11.field806, var11.field783, var11.field814, var11.field815, 255 - (var11.field812 & 255), 255 - (var11.field821 & 255));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class415.method1914(var13, var14, var11.field806, var11.field783, var20);
                                                } else {
                                                    class415.method1913(var13, var14, var11.field806, var11.field783, var20, 256 - (var15 & 255));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class415.method1917(var13, var14, var11.field806, var11.field783, var20);
                                    } else {
                                        class415.method1918(var13, var14, var11.field806, var11.field783, var20, 256 - (var15 & 255));
                                    }
                                } else if (var11.field793 == 4) {
                                    class413 var37 = var11.method389();
                                    if (var37 == null) {
                                        if (class97.field790) {
                                            method2424(var11);
                                        }
                                    } else {
                                        String var44 = var11.field851;
                                        if (method2347(var11)) {
                                            var21 = var11.field815;
                                            if (var11 == class423.field2915 && var11.field861 != 0) {
                                                var21 = var11.field861;
                                            }

                                            if (var11.field779.length() > 0) {
                                                var44 = var11.field779;
                                            }
                                        } else {
                                            var21 = var11.field814;
                                            if (class423.field2915 == var11 && var11.field818 != 0) {
                                                var21 = var11.field818;
                                            }
                                        }

                                        if (var11.field871 && var11.field919 != -1) {
                                            class508 var46 = class508.method2299(var11.field919);
                                            var44 = var46.field3736;
                                            if (null == var44) {
                                                var44 = class32.field483;
                                            }

                                            if ((var46.field3731 == 1 || var11.field920 != 1) && var11.field920 != -1) {
                                                var44 = class49.method140(16748608) + var44 + class49.field556 + " " + 'x' + method2440(var11.field920);
                                            }
                                        }

                                        if (field3952 == var11) {
                                            var44 = class32.field445;
                                            var21 = var11.field814;
                                        }

                                        if (!var11.field871) {
                                            var44 = method2447(var44, var11);
                                        }

                                        var37.method929(var44, var13, var14, var11.field806, var11.field783, var21, var11.field781 ? 0 : -1, class96.method380(var11.field812), var11.field854, var11.field912, var11.field887);
                                    }
                                } else {
                                    int var25;
                                    int var26;
                                    int var41;
                                    if (var11.field793 == 5) {
                                        class331 var35;
                                        if (!var11.field871) {
                                            var35 = var11.method410(method2347(var11), class174.field1465);
                                            if (null != var35) {
                                                var35.method1563(var13, var14);
                                            } else if (class97.field790) {
                                                method2424(var11);
                                            }
                                        } else {
                                            if (var11.field919 != -1) {
                                                var35 = class508.method2297(var11.field919, var11.field920, var11.field829, var11.field830, var11.field850, false);
                                            } else {
                                                var35 = var11.method410(false, class174.field1465);
                                            }

                                            if (var35 == null) {
                                                if (class97.field790) {
                                                    method2424(var11);
                                                }
                                            } else {
                                                var21 = var35.field2420;
                                                var22 = var35.field2421;
                                                if (!var11.field828) {
                                                    var23 = var11.field806 * 4096 / var21;
                                                    if (var11.field827 != 0) {
                                                        var35.method1557(var11.field806 / 2 + var13, var11.field783 / 2 + var14, var11.field827, var23);
                                                    } else if (var15 != 0) {
                                                        var35.method1551(var13, var14, var11.field806, var11.field783, 256 - (var15 & 255));
                                                    } else if (var11.field806 == var21 && var22 == var11.field783) {
                                                        var35.method1563(var13, var14);
                                                    } else {
                                                        var35.method1565(var13, var14, var11.field806, var11.field783);
                                                    }
                                                } else {
                                                    class415.method1927(var13, var14, var11.field806 + var13, var14 + var11.field783);
                                                    var23 = (var11.field806 + (var21 - 1)) / var21;
                                                    var41 = (var22 - 1 + var11.field783) / var22;

                                                    for (var25 = 0; var25 < var23; ++var25) {
                                                        for (var26 = 0; var26 < var41; ++var26) {
                                                            if (var11.field827 != 0) {
                                                                var35.method1557(var21 * var25 + var13 + var21 / 2, var14 + var22 * var26 + var22 / 2, var11.field827, 4096);
                                                            } else if (var15 != 0) {
                                                                var35.method1561(var21 * var25 + var13, var14 + var22 * var26, 256 - (var15 & 255));
                                                            } else {
                                                                var35.method1563(var21 * var25 + var13, var14 + var22 * var26);
                                                            }
                                                        }
                                                    }

                                                    class415.method1921(var2, var3, var4, var5);
                                                }
                                            }
                                        }
                                    } else {
                                        int var27;
                                        if (var11.field793 == 6) {
                                            boolean var33 = method2347(var11);
                                            if (var33) {
                                                var21 = var11.field911;
                                            } else {
                                                var21 = var11.field837;
                                            }

                                            class448 var36 = null;
                                            var23 = 0;
                                            if (var11.field919 != -1) {
                                                class508 var38 = class508.method2299(var11.field919);
                                                if (null != var38) {
                                                    var38 = var38.method2285(var11.field920);
                                                    var36 = var38.method2284(1);
                                                    if (null != var36) {
                                                        var36.method2045();
                                                        var23 = var36.field3601 / 2;
                                                    } else {
                                                        method2424(var11);
                                                    }
                                                }
                                            } else if (var11.field833 == 5) {
                                                if (var11.field834 == 0) {
                                                    var36 = field4061.method156(null, -1, null, -1);
                                                } else {
                                                    var36 = class180.field1528.method2238();
                                                }
                                            } else if (var11.field833 == 7) {
                                                var36 = var11.field847.method156(null, -1, class124.method575(class180.field1528.field4097), class180.field1528.field4091);
                                            } else {
                                                class345 var39 = null;
                                                class307 var40 = null;
                                                if (var11.field833 == 6) {
                                                    var26 = var11.field834;
                                                    if (var26 >= 0 && var26 < field3835.length) {
                                                        class424 var43 = field3835[var26];
                                                        if (null != var43) {
                                                            var39 = var43.field2920;
                                                            var40 = var43.method1958();
                                                        }
                                                    }
                                                }

                                                class124 var42 = null;
                                                var27 = -1;
                                                if (var21 != -1) {
                                                    var42 = class124.method575(var21);
                                                    var27 = var11.field921;
                                                }

                                                var36 = var11.method390(var42, var27, var33, class180.field1528.field2054, var39, var40);
                                                if (var36 == null && class97.field790) {
                                                    method2424(var11);
                                                }
                                            }

                                            class334.method1590(var11.field806 / 2 + var13, var11.field783 / 2 + var14);
                                            var41 = var11.field844 * class334.field2429[var11.field841] >> 16;
                                            var25 = class334.field2427[var11.field841] * var11.field844 >> 16;
                                            if (null != var36) {
                                                if (!var11.field871) {
                                                    var36.method2051(0, var11.field859, 0, var11.field841, 0, var41, var25);
                                                } else {
                                                    var36.method2045();
                                                    if (var11.field864) {
                                                        var36.method2059(0, var11.field859, var11.field906, var11.field841, var11.field839, var11.field913 + var41 + var23, var11.field913 + var25, var11.field844);
                                                    } else {
                                                        var36.method2051(0, var11.field859, var11.field906, var11.field841, var11.field839, var11.field913 + var41 + var23, var25 + var11.field913);
                                                    }
                                                }
                                            }

                                            class334.method1581();
                                        } else {
                                            class413 var31;
                                            if (var11.field793 == 8 && class390.field2779 == var11 && field3939 == field3938) {
                                                var20 = 0;
                                                var21 = 0;
                                                var31 = class21.field75;
                                                String var34 = var11.field851;

                                                String var24;
                                                for (var34 = method2447(var34, var11); var34.length() > 0; var21 += var31.field1617 + 1) {
                                                    var25 = var34.indexOf(class49.field555);
                                                    if (var25 != -1) {
                                                        var24 = var34.substring(0, var25);
                                                        var34 = var34.substring(var25 + 4);
                                                    } else {
                                                        var24 = var34;
                                                        var34 = "";
                                                    }

                                                    var26 = var31.method921(var24);
                                                    if (var26 > var20) {
                                                        var20 = var26;
                                                    }
                                                }

                                                var20 += 6;
                                                var21 += 7;
                                                var25 = var13 + var11.field806 - 5 - var20;
                                                var26 = var14 + var11.field783 + 5;
                                                if (var25 < var13 + 5) {
                                                    var25 = var13 + 5;
                                                }

                                                if (var20 + var25 > var4) {
                                                    var25 = var4 - var20;
                                                }

                                                if (var21 + var26 > var5) {
                                                    var26 = var5 - var21;
                                                }

                                                class415.method1914(var25, var26, var20, var21, 16777120);
                                                class415.method1917(var25, var26, var20, var21, 0);
                                                var34 = var11.field851;
                                                var27 = var26 + var31.field1617 + 2;

                                                for (var34 = method2447(var34, var11); var34.length() > 0; var27 += var31.field1617 + 1) {
                                                    int var28 = var34.indexOf(class49.field555);
                                                    if (var28 != -1) {
                                                        var24 = var34.substring(0, var28);
                                                        var34 = var34.substring(var28 + 4);
                                                    } else {
                                                        var24 = var34;
                                                        var34 = "";
                                                    }

                                                    var31.method949(var24, var25 + 3, var27, 0, -1);
                                                }
                                            }

                                            if (var11.field793 == 9) {
                                                if (var11.field823) {
                                                    var20 = var13;
                                                    var21 = var11.field783 + var14;
                                                    var22 = var11.field806 + var13;
                                                    var23 = var14;
                                                } else {
                                                    var20 = var13;
                                                    var21 = var14;
                                                    var22 = var13 + var11.field806;
                                                    var23 = var11.field783 + var14;
                                                }

                                                if (var11.field822 == 1) {
                                                    class415.method1916(var20, var21, var22, var23, var11.field814);
                                                } else {
                                                    method2471(var20, var21, var22, var23, var11.field814, var11.field822);
                                                }
                                            } else if (var11.field793 == 12) {
                                                class327 var30 = var11.method419();
                                                class346 var32 = var11.method405();
                                                if (null != var30 && null != var32 && var30.method1485()) {
                                                    var31 = var11.method389();
                                                    if (var31 != null) {
                                                        field3989.method1299(var13, var14, var11.field806, var11.field783, var30.method1486(), var30.method1511(), var30.method1483(), var30.method1484(), var30.method1504());
                                                        var23 = var11.field781 ? var11.field830 : -1;
                                                        if (!var30.method1481() && var30.method1505().method1686()) {
                                                            field3989.method1300(var32.field2518, var23, var32.field2516, var32.field2517);
                                                            field3989.method1301(var30.method1479(), var31, (byte) -101);
                                                        } else {
                                                            field3989.method1300(var11.field814, var23, var32.field2516, var32.field2517);
                                                            field3989.method1301(var30.method1505(), var31, (byte) -117);
                                                        }

                                                        class415.method1921(var2, var3, var4, var5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    static void method2471(int var0, int var1, int var2, int var3, int var4, int var5) {
        int var7 = var2 - var0;
        int var8 = var3 - var1;
        int var9 = var7 >= 0 ? var7 : -var7;
        int var10 = var8 >= 0 ? var8 : -var8;
        int var11 = var9;
        if (var9 < var10) {
            var11 = var10;
        }

        if (var11 != 0) {
            int var12 = (var7 << 16) / var11;
            int var13 = (var8 << 16) / var11;
            if (var13 <= var12) {
                var12 = -var12;
            } else {
                var13 = -var13;
            }

            int var14 = var5 * var13 >> 17;
            int var15 = 1 + var13 * var5 >> 17;
            int var16 = var5 * var12 >> 17;
            int var17 = var12 * var5 + 1 >> 17;
            var0 -= class415.field2908;
            var1 -= class415.field2909;
            int var18 = var0 + var14;
            int var19 = var0 - var15;
            int var20 = var7 + var0 - var15;
            int var21 = var14 + var0 + var7;
            int var22 = var1 + var16;
            int var23 = var1 - var17;
            int var24 = var1 + var8 - var17;
            int var25 = var16 + var8 + var1;
            class334.method1582(var18, var19, var20);
            class334.method1592(var22, var23, var24, var18, var19, var20, 0.0F, 0.0F, 0.0F, var4);
            class334.method1582(var18, var20, var21);
            class334.method1592(var22, var24, var25, var18, var20, var21, 0.0F, 0.0F, 0.0F, var4);
        }
    }

    static String method2447(String var0, class97 var1) {
        if (var0.indexOf("%") != -1) {
            for (int var3 = 1; var3 <= 5; ++var3) {
                while (true) {
                    int var4 = var0.indexOf("%" + var3);
                    if (var4 == -1) {
                        break;
                    }

                    var0 = var0.substring(0, var4) + class521.method2516(method2383(var1, var3 - 1)) + var0.substring(var4 + 2);
                }
            }
        }

        return var0;
    }

    static String method2440(int var0) {
        String var2 = Integer.toString(var0);

        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + class49.field553 + var2.substring(var3);
        }

        if (var2.length() > 9) {
            return " " + class49.method140(65408) + var2.substring(0, var2.length() - 8) + class32.field242 + " " + class49.field549 + var2 + class49.field551 + class49.field556;
        } else {
            return var2.length() > 6 ? " " + class49.method140(16777215) + var2.substring(0, var2.length() - 4) + class32.field350 + " " + class49.field549 + var2 + class49.field551 + class49.field556 : " " + class49.method140(16776960) + var2 + class49.field556;
        }
    }

    static void method2363(class97[] var0, class97 var1, boolean var2) {
        int var4 = var1.field878 != 0 ? var1.field878 : var1.field806;
        int var5 = var1.field813 != 0 ? var1.field813 : var1.field783;
        method2344(var0, var1.field791, var4, var5, var2);
        if (null != var1.field923) {
            method2344(var1.field923, var1.field791, var4, var5, var2);
        }

        class522 var6 = (class522) field3796.method857(var1.field791);
        if (var6 != null) {
            int var7 = var6.field4202;
            if (class97.method428(var7)) {
                method2344(class46.field542[var7], -1, var4, var5, var2);
            }
        }

        if (var1.field817 == 1337) {
        }

    }

    static void method2344(class97[] var0, int var1, int var2, int var3, boolean var4) {
        for (int var6 = 0; var6 < var0.length; ++var6) {
            class97 var7 = var0[var6];
            if (null != var7 && var7.field808 == var1) {
                method2469(var7, var2, var3, var4);
                method2434(var7, var2, var3);
                if (var7.field810 > var7.field878 - var7.field806) {
                    var7.field810 = var7.field878 - var7.field806;
                }

                if (var7.field810 < 0) {
                    var7.field810 = 0;
                }

                if (var7.field824 > var7.field813 - var7.field783) {
                    var7.field824 = var7.field813 - var7.field783;
                }

                if (var7.field824 < 0) {
                    var7.field824 = 0;
                }

                if (var7.field793 == 0) {
                    method2363(var0, var7, var4);
                }
            }
        }

    }

    static void method2469(class97 var0, int var1, int var2, boolean var3) {
        int var5 = var0.field806;
        int var6 = var0.field783;
        if (var0.field798 == 0) {
            var0.field806 = var0.field802;
        } else if (var0.field798 == 1) {
            var0.field806 = var1 - var0.field802;
        } else if (var0.field798 == 2) {
            var0.field806 = var1 * var0.field802 >> 14;
        }

        if (var0.field799 == 0) {
            var0.field783 = var0.field803;
        } else if (var0.field799 == 1) {
            var0.field783 = var2 - var0.field803;
        } else if (var0.field799 == 2) {
            var0.field783 = var2 * var0.field803 >> 14;
        }

        if (var0.field798 == 4) {
            var0.field806 = var0.field907 * var0.field783 / var0.field807;
        }

        if (var0.field799 == 4) {
            var0.field783 = var0.field806 * var0.field807 / var0.field907;
        }

        if (var0.field817 == 1337) {
            field4068 = var0;
        }

        if (var0.field793 == 12) {
            var0.method419().method1447(var0.field806, var0.field783);
        }

        if (var3 && var0.field785 != null && (var5 != var0.field806 || var6 != var0.field783)) {
            class26 var7 = new class26();
            var7.field138 = var0;
            var7.field141 = var0.field785;
            field3990.method126(var7);
        }

    }

    static void method2434(class97 var0, int var1, int var2) {
        if (var0.field796 == 0) {
            var0.field792 = var0.field800;
        } else if (var0.field796 == 1) {
            var0.field792 = (var1 - var0.field806) / 2 + var0.field800;
        } else if (var0.field796 == 2) {
            var0.field792 = var1 - var0.field806 - var0.field800;
        } else if (var0.field796 == 3) {
            var0.field792 = var0.field800 * var1 >> 14;
        } else if (var0.field796 == 4) {
            var0.field792 = (var1 * var0.field800 >> 14) + (var1 - var0.field806) / 2;
        } else {
            var0.field792 = var1 - var0.field806 - (var1 * var0.field800 >> 14);
        }

        if (var0.field797 == 0) {
            var0.field805 = var0.field801;
        } else if (var0.field797 == 1) {
            var0.field805 = var0.field801 + (var2 - var0.field783) / 2;
        } else if (var0.field797 == 2) {
            var0.field805 = var2 - var0.field783 - var0.field801;
        } else if (var0.field797 == 3) {
            var0.field805 = var0.field801 * var2 >> 14;
        } else if (var0.field797 == 4) {
            var0.field805 = (var0.field801 * var2 >> 14) + (var2 - var0.field783) / 2;
        } else {
            var0.field805 = var2 - var0.field783 - (var2 * var0.field801 >> 14);
        }

    }

    static void method2478(class97 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        if (field3860) {
            field3979 = 32;
        } else {
            field3979 = 0;
        }

        field3860 = false;
        int var8;
        if (class499.field3641 == 1 || !class218.field1747 && class499.field3641 == 4) {
            if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
                var0.field824 -= 4;
                method2424(var0);
            } else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 + var3 - 16 && var6 < var2 + var3) {
                var0.field824 += 4;
                method2424(var0);
            } else if (var5 >= var1 - field3979 && var5 < field3979 + var1 + 16 && var6 >= var2 + 16 && var6 < var2 + var3 - 16) {
                var8 = var3 * (var3 - 32) / var4;
                if (var8 < 8) {
                    var8 = 8;
                }

                int var9 = var6 - var2 - 16 - var8 / 2;
                int var10 = var3 - 32 - var8;
                var0.field824 = var9 * (var4 - var3) / var10;
                method2424(var0);
                field3860 = true;
            }
        }

        if (field3988 != 0) {
            var8 = var0.field806;
            if (var5 >= var1 - var8 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
                var0.field824 += field3988 * 45;
                method2424(var0);
            }
        }

    }

    static void method2409(int var0, int var1, int var2, int var3, int var4) {
        class29.field164[0].method2590(var0, var1);
        class29.field164[1].method2590(var0, var1 + var3 - 16);
        class415.method1914(var0, var1 + 16, 16, var3 - 32, field3856);
        int var6 = (var3 - 32) * var3 / var4;
        if (var6 < 8) {
            var6 = 8;
        }

        int var7 = var2 * (var3 - 32 - var6) / (var4 - var3);
        class415.method1914(var0, var1 + 16 + var7, 16, var6, field3967);
        class415.method1920(var0, var7 + var1 + 16, var6, field4046);
        class415.method1920(var0 + 1, var1 + 16 + var7, var6, field4046);
        class415.method1925(var0, var1 + 16 + var7, 16, field4046);
        class415.method1925(var0, var1 + 17 + var7, 16, field4046);
        class415.method1920(var0 + 15, var1 + 16 + var7, var6, field3858);
        class415.method1920(var0 + 14, var7 + var1 + 17, var6 - 1, field3858);
        class415.method1925(var0, var6 + var1 + 15 + var7, 16, field3858);
        class415.method1925(var0 + 1, var7 + var1 + 14 + var6, 15, field3858);
    }

    static boolean method2347(class97 var0) {
        if (null == var0.field926) {
            return false;
        } else {
            for (int var2 = 0; var2 < var0.field926.length; ++var2) {
                int var3 = method2383(var0, var2);
                int var4 = var0.field914[var2];
                if (var0.field926[var2] == 2) {
                    if (var3 >= var4) {
                        return false;
                    }
                } else if (var0.field926[var2] == 3) {
                    if (var3 <= var4) {
                        return false;
                    }
                } else if (var0.field926[var2] == 4) {
                    if (var4 == var3) {
                        return false;
                    }
                } else if (var3 != var4) {
                    return false;
                }
            }

            return true;
        }
    }

    static int method2383(class97 var0, int var1) {
        if (var0.field855 != null && var1 < var0.field855.length) {
            try {
                int[] var3 = var0.field855[var1];
                int var4 = 0;
                int var5 = 0;
                byte var6 = 0;

                while (true) {
                    int var7 = var3[var5++];
                    int var8 = 0;
                    byte var9 = 0;
                    if (var7 == 0) {
                        return var4;
                    }

                    if (var7 == 1) {
                        var8 = field3919[var3[var5++]];
                    }

                    if (var7 == 2) {
                        var8 = field4067[var3[var5++]];
                    }

                    if (var7 == 3) {
                        var8 = field4070[var3[var5++]];
                    }

                    int var10;
                    class97 var11;
                    int var12;
                    int var13;
                    if (var7 == 4) {
                        var10 = var3[var5++] << 16;
                        var10 += var3[var5++];
                        var11 = class97.method424(var10);
                        var12 = var3[var5++];
                        if (var12 != -1 && (!class508.method2299(var12).field3724 || field3802)) {
                            for (var13 = 0; var13 < var11.field917.length; ++var13) {
                                if (var11.field917[var13] == var12 + 1) {
                                    var8 += var11.field918[var13];
                                }
                            }
                        }
                    }

                    if (var7 == 5) {
                        var8 = class10.field46[var3[var5++]];
                    }

                    if (var7 == 6) {
                        var8 = class339.field2452[field4067[var3[var5++]] - 1];
                    }

                    if (var7 == 7) {
                        var8 = class10.field46[var3[var5++]] * 100 / 46875;
                    }

                    if (var7 == 8) {
                        var8 = class180.field1528.field2059;
                    }

                    if (var7 == 9) {
                        for (var10 = 0; var10 < 25; ++var10) {
                            if (class339.field2450[var10]) {
                                var8 += field4067[var10];
                            }
                        }
                    }

                    if (var7 == 10) {
                        var10 = var3[var5++] << 16;
                        var10 += var3[var5++];
                        var11 = class97.method424(var10);
                        var12 = var3[var5++];
                        if (var12 != -1 && (!class508.method2299(var12).field3724 || field3802)) {
                            for (var13 = 0; var13 < var11.field917.length; ++var13) {
                                if (var11.field917[var13] == var12 + 1) {
                                    var8 = 999999999;
                                    break;
                                }
                            }
                        }
                    }

                    if (var7 == 11) {
                        var8 = field3892;
                    }

                    if (var7 == 12) {
                        var8 = field4062;
                    }

                    if (var7 == 13) {
                        var10 = class10.field46[var3[var5++]];
                        int var15 = var3[var5++];
                        var8 = (var10 & 1 << var15) != 0 ? 1 : 0;
                    }

                    if (var7 == 14) {
                        var10 = var3[var5++];
                        var8 = class10.method20(var10);
                    }

                    if (var7 == 15) {
                        var9 = 1;
                    }

                    if (var7 == 16) {
                        var9 = 2;
                    }

                    if (var7 == 17) {
                        var9 = 3;
                    }

                    if (var7 == 18) {
                        var8 = class357.field2573 + (class180.field1528.field4121 >> 7);
                    }

                    if (var7 == 19) {
                        var8 = class5.field28 + (class180.field1528.field4092 >> 7);
                    }

                    if (var7 == 20) {
                        var8 = var3[var5++];
                    }

                    if (var9 == 0) {
                        if (var6 == 0) {
                            var4 += var8;
                        }

                        if (var6 == 1) {
                            var4 -= var8;
                        }

                        if (var6 == 2 && var8 != 0) {
                            var4 /= var8;
                        }

                        if (var6 == 3) {
                            var4 *= var8;
                        }

                        var6 = 0;
                    } else {
                        var6 = var9;
                    }
                }
            } catch (Exception var14) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    static void method2401(class97 var0) {
        String var2;
        int var3;
        int var4;
        if (var0.field794 == 1) {
            var2 = var0.field842;
            var3 = var0.field791;
            var4 = var0.field919;
            method2378(var2, "", 24, 0, 0, var3, var4, false);
        }

        int var5;
        String var12;
        if (var0.field794 == 2 && !field3867) {
            var2 = method2450(var0);
            if (var2 != null) {
                var12 = class49.method140(65280) + var0.field899;
                var4 = var0.field791;
                var5 = var0.field919;
                method2378(var2, var12, 25, 0, -1, var4, var5, false);
            }
        }

        if (var0.field794 == 3) {
            method2473(class32.field418, "", 26, 0, 0, var0.field791);
        }

        if (var0.field794 == 4) {
            method2473(var0.field842, "", 28, 0, 0, var0.field791);
        }

        if (var0.field794 == 5) {
            method2473(var0.field842, "", 29, 0, 0, var0.field791);
        }

        if (var0.field794 == 6 && field3952 == null) {
            method2473(var0.field842, "", 30, 0, -1, var0.field791);
        }

        if (var0.field871) {
            int var6;
            int var7;
            int var8;
            String var13;
            String var15;
            if (field3867) {
                var3 = method2420(var0);
                boolean var10 = (var3 >> 21 & 1) != 0;
                if (var10 && (class466.field3312 & 32) == 32) {
                    var13 = field3958;
                    var15 = field3969 + " " + class49.field554 + " " + var0.field795;
                    var6 = var0.field910;
                    var7 = var0.field791;
                    var8 = var0.field919;
                    method2378(var13, var15, 58, 0, var6, var7, var8, false);
                }
            } else {
                for (int var11 = 9; var11 >= 5; --var11) {
                    var5 = method2420(var0);
                    boolean var14 = (var5 >> var11 + 1 & 1) != 0;
                    if (!var14 && null == var0.field894) {
                        var12 = null;
                    } else if (null != var0.field869 && var0.field869.length > var11 && null != var0.field869[var11] && var0.field869[var11].trim().length() != 0) {
                        var12 = var0.field869[var11];
                    } else {
                        var12 = null;
                    }

                    if (null != var12) {
                        var15 = var0.field795;
                        var6 = var11 + 1;
                        var7 = var0.field910;
                        var8 = var0.field791;
                        int var9 = var0.field919;
                        method2378(var12, var15, 1007, var6, var7, var8, var9, false);
                    }
                }

                var2 = method2450(var0);
                if (var2 != null) {
                    var12 = var0.field795;
                    var4 = var0.field910;
                    var5 = var0.field791;
                    var6 = var0.field919;
                    method2378(var2, var12, 25, 0, var4, var5, var6, false);
                }

                for (var3 = 4; var3 >= 0; --var3) {
                    var6 = method2420(var0);
                    boolean var17 = (var6 >> var3 + 1 & 1) != 0;
                    if (!var17 && var0.field894 == null) {
                        var13 = null;
                    } else if (null != var0.field869 && var0.field869.length > var3 && null != var0.field869[var3] && var0.field869[var3].trim().length() != 0) {
                        var13 = var0.field869[var3];
                    } else {
                        var13 = null;
                    }

                    if (var13 != null) {
                        method2378(var13, var0.field795, 57, var3 + 1, var0.field910, var0.field791, var0.field919, var0.field935);
                    }
                }

                var4 = method2420(var0);
                boolean var16 = (var4 & 1) != 0;
                if (var16) {
                    method2473(class32.field179, "", 30, 0, var0.field910, var0.field791);
                }
            }
        }

    }

    static void method2338(boolean var0) {
        field3908 = var0;
    }

    static boolean method2352() {
        return field3908;
    }

    static void method2364(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        if (class97.method428(var0)) {
            class535.method2579(class46.field542[var0], -1, var1, var2, var3, var4, var5, var6);
        }
    }

    static boolean method2477(int var0) {
        for (int var2 = 0; var2 < field4015; ++var2) {
            if (field4017[var2] == var0) {
                return true;
            }
        }

        return false;
    }

    static void method2474(int var0, int var1) {
        if (class97.method428(var0)) {
            method2431(class46.field542[var0], var1);
        }
    }

    static void method2431(class97[] var0, int var1) {
        for (int var3 = 0; var3 < var0.length; ++var3) {
            class97 var4 = var0[var3];
            if (var4 != null) {
                if (var4.field793 == 0) {
                    if (var4.field923 != null) {
                        method2431(var4.field923, var1);
                    }

                    class522 var5 = (class522) field3796.method857(var4.field791);
                    if (var5 != null) {
                        method2474(var5.field4202, var1);
                    }
                }

                class26 var6;
                if (var1 == 0 && null != var4.field838) {
                    var6 = new class26();
                    var6.field138 = var4;
                    var6.field141 = var4.field838;
                    class269.method1200(var6);
                }

                if (var1 == 1 && var4.field870 != null) {
                    if (var4.field910 >= 0) {
                        class97 var7 = class97.method424(var4.field791);
                        if (var7 == null || var7.field923 == null || var4.field910 >= var7.field923.length || var7.field923[var4.field910] != var4) {
                            continue;
                        }
                    }

                    var6 = new class26();
                    var6.field138 = var4;
                    var6.field141 = var4.field870;
                    class269.method1200(var6);
                }
            }
        }

    }

    static void method2427(class97 var0, int var1, int var2) {
        if (null == field3959 && !field3888) {
            if (null != var0 && method2432(var0) != null) {
                field3959 = var0;
                field3978 = method2432(var0);
                field3961 = var1;
                field4034 = var2;
                class493.field3624 = 0;
                field3970 = false;
                int var4 = field3924 - 1;
                if (var4 != -1) {
                    class535.field4259 = new class161();
                    class535.field4259.field1412 = field3925[var4];
                    class535.field4259.field1415 = field3926[var4];
                    class535.field4259.field1413 = field3968[var4];
                    class535.field4259.field1414 = field3928[var4];
                    class535.field4259.field1411 = field3929[var4];
                    class535.field4259.field1416 = field3930[var4];
                    class535.field4259.field1417 = field4049[var4];
                }

            }
        }
    }

    static void method2331(int var0, int var1) {
        class161 var3 = class535.field4259;
        if (null != var3) {
            method2484(var3.field1412, var3.field1415, var3.field1413, var3.field1414, var3.field1411, var3.field1416, var3.field1417, var0, var1);
        }

        class535.field4259 = null;
    }

    public static void method2424(class97 var0) {
        if (null != var0 && field3996 == var0.field931) {
            field3785[var0.field930] = true;
        }

    }

    static void method2390() {
        for (class522 var1 = (class522) field3796.method858(); var1 != null; var1 = (class522) field3796.method859()) {
            int var2 = var1.field4202;
            if (class97.method428(var2)) {
                boolean var3 = true;
                class97[] var4 = class46.field542[var2];

                int var5;
                for (var5 = 0; var5 < var4.length; ++var5) {
                    if (null != var4[var5]) {
                        var3 = var4[var5].field871;
                        break;
                    }
                }

                if (!var3) {
                    var5 = (int) var1.field658;
                    class97 var6 = class97.method424(var5);
                    if (var6 != null) {
                        method2424(var6);
                    }
                }
            }
        }

    }

    static class97 method2432(class97 var0) {
        class97 var2 = method2382(var0);
        if (null == var2) {
            var2 = var0.field890;
        }

        return var2;
    }

    static void method2333(int var0) {
        if (class97.method428(var0)) {
            class97[] var2 = class46.field542[var0];

            for (int var3 = 0; var3 < var2.length; ++var3) {
                class97 var4 = var2[var3];
                if (null != var4) {
                    var4.field921 = 0;
                    var4.field922 = 0;
                }
            }

        }
    }

    static void method2456(int var0) {
        if (class97.method428(var0)) {
            method2404(class46.field542[var0], -1);
        }
    }

    static void method2404(class97[] var0, int var1) {
        for (int var3 = 0; var3 < var0.length; ++var3) {
            class97 var4 = var0[var3];
            if (null != var4 && var1 == var4.field808 && (!var4.field871 || !method2397(var4))) {
                int var6;
                if (var4.field793 == 0) {
                    if (!var4.field871 && method2397(var4) && class423.field2915 != var4) {
                        continue;
                    }

                    method2404(var0, var4.field791);
                    if (var4.field923 != null) {
                        method2404(var4.field923, var4.field791);
                    }

                    class522 var5 = (class522) field3796.method857(var4.field791);
                    if (null != var5) {
                        var6 = var5.field4202;
                        if (class97.method428(var6)) {
                            method2404(class46.field542[var6], -1);
                        }
                    }
                }

                if (var4.field793 == 6) {
                    if (var4.field837 != -1 || var4.field911 != -1) {
                        boolean var9 = method2347(var4);
                        if (var9) {
                            var6 = var4.field911;
                        } else {
                            var6 = var4.field837;
                        }

                        if (var6 != -1) {
                            class124 var7 = class124.method575(var6);
                            if (!var7.method574()) {
                                for (var4.field922 += field3854; var4.field922 > var7.field1135[var4.field921]; method2424(var4)) {
                                    var4.field922 -= var7.field1135[var4.field921];
                                    ++var4.field921;
                                    if (var4.field921 >= var7.field1124.length) {
                                        var4.field921 -= var7.field1128;
                                        if (var4.field921 < 0 || var4.field921 >= var7.field1124.length) {
                                            var4.field921 = 0;
                                        }
                                    }
                                }
                            } else {
                                var4.field921 += field3854;
                                int var8 = var7.method571();
                                if (var4.field921 >= var8) {
                                    var4.field921 -= var7.field1128;
                                    if (var4.field921 < 0 || var4.field921 >= var8) {
                                        var4.field921 = 0;
                                    }
                                }

                                method2424(var4);
                            }
                        }
                    }

                    if (var4.field882 != 0 && !var4.field871) {
                        int var10 = var4.field882 >> 16;
                        var6 = var4.field882 << 16 >> 16;
                        var10 *= field3854;
                        var6 *= field3854;
                        var4.field841 = var4.field841 + var10 & 2047;
                        var4.field859 = var6 + var4.field859 & 2047;
                        method2424(var4);
                    }
                }
            }
        }

    }

    static void method2340(int var0) {
        var0 = Math.max(Math.min(var0, 100), 0);
        var0 = 100 - var0;
        float var2 = 0.5F + (float) var0 / 200.0F;
        method2370(var2);
    }

    static int method2465() {
        float var1 = 200.0F * ((float) class290.field2121.method2550() - 0.5F);
        return 100 - Math.round(var1);
    }

    static void method2370(double var0) {
        class334.method1569(var0);
        ((class444) class334.field2431.field2606).method2027(var0);
        class508.method2298();
        class290.field2121.method2552(var0);
    }

    static void method2445(int var0) {
        var0 = Math.min(Math.max(var0, 0), 255);
        if (var0 != class290.field2121.method2529()) {
            label35:
            {
                if (class290.field2121.method2529() == 0) {
                    boolean var2 = !class141.field1241.isEmpty();
                    if (var2) {
                        class372 var3 = class34.field491;
                        if (!class141.field1241.isEmpty()) {
                            ArrayList<class537> var4 = new ArrayList<class537>();
                            Iterator<class537> var5 = class141.field1241.iterator();

                            while (var5.hasNext()) {
                                class537 var6 = var5.next();
                                var6.field4274 = false;
                                var6.field4272 = false;
                                var6.field4278 = false;
                                var6.field4275 = false;
                                var6.field4270 = var3;
                                var6.field4269 = var0;
                                var6.field4266 = 0.0F;
                                var4.add(var6);
                            }

                            class141.method648(var4, class141.field1244, class141.field1245, class141.field1246, class141.field1237, false);
                        }

                        field4047 = false;
                        break label35;
                    }
                }

                if (var0 == 0) {
                    class443.method2021(0, 0);
                    field4047 = false;
                } else {
                    class318.method1397(var0, (byte) 57);
                }
            }

            class290.field2121.method2535(var0);
        }

    }

    static void method2475(int var0) {
        var0 = Math.min(Math.max(var0, 0), 127);
        class290.field2121.method2536(var0);
    }

    static void method2339(int var0) {
        var0 = Math.min(Math.max(var0, 0), 127);
        class290.field2121.method2556(var0);
    }

    static void method2446(int var0) {
        method2390();

        for (class51 var2 = (class51) class51.field560.method122(); var2 != null; var2 = (class51) class51.field560.method124()) {
            if (var2.field570 != null) {
                var2.method141();
            }
        }

        int var4 = class57.method171(var0).field2794;
        if (var4 != 0) {
            int var3 = class10.field46[var0];
            if (var4 == 1) {
                if (var3 == 1) {
                    class334.method1569(0.9D);
                    ((class444) class334.field2431.field2606).method2027(0.9D);
                    class508.method2298();
                    class290.field2121.method2552(0.9D);
                }

                if (var3 == 2) {
                    class334.method1569(0.8D);
                    ((class444) class334.field2431.field2606).method2027(0.8D);
                    class508.method2298();
                    class290.field2121.method2552(0.8D);
                }

                if (var3 == 3) {
                    method2370(0.7D);
                }

                if (var3 == 4) {
                    method2370(0.6D);
                }
            }

            if (var4 == 3) {
                if (var3 == 0) {
                    method2445(255);
                }

                if (var3 == 1) {
                    method2445(192);
                }

                if (var3 == 2) {
                    method2445(128);
                }

                if (var3 == 3) {
                    method2445(64);
                }

                if (var3 == 4) {
                    method2445(0);
                }
            }

            if (var4 == 4) {
                if (var3 == 0) {
                    method2475(127);
                }

                if (var3 == 1) {
                    method2475(96);
                }

                if (var3 == 2) {
                    method2475(64);
                }

                if (var3 == 3) {
                    method2475(32);
                }

                if (var3 == 4) {
                    method2475(0);
                }
            }

            if (var4 == 5) {
                field3922 = var3 == 1;
            }

            if (var4 == 6) {
                field3951 = var3;
            }

            if (var4 == 9) {
            }

            if (var4 == 10) {
                if (var3 == 0) {
                    method2339(127);
                }

                if (var3 == 1) {
                    method2339(96);
                }

                if (var3 == 2) {
                    method2339(64);
                }

                if (var3 == 3) {
                    method2339(32);
                }

                if (var3 == 4) {
                    method2339(0);
                }
            }

            if (var4 == 17) {
                field3810 = var3 & 65535;
            }

            if (var4 == 18) {
                field3804 = (class295) class27.method80(class295.method1320(), var3);
                if (field3804 == null) {
                    field3804 = class295.field2142;
                }
            }

            if (var4 == 19) {
                if (var3 == -1) {
                    field3914 = -1;
                } else {
                    field3914 = var3 & 2047;
                }
            }

            if (var4 == 22) {
                field3805 = (class295) class27.method80(class295.method1320(), var3);
                if (null == field3805) {
                    field3805 = class295.field2142;
                }
            }

        }
    }

    static void method2417(class97 var0) {
        int var2 = var0.field817;
        if (var2 == 324) {
            if (field3881 == -1) {
                field3881 = var0.field877;
                field4063 = var0.field825;
            }

            if (field4061.field578 == 1) {
                var0.field877 = field3881;
            } else {
                var0.field877 = field4063;
            }

        } else if (var2 == 325) {
            if (field3881 == -1) {
                field3881 = var0.field877;
                field4063 = var0.field825;
            }

            if (field4061.field578 == 1) {
                var0.field877 = field4063;
            } else {
                var0.field877 = field3881;
            }

        } else if (var2 == 327) {
            var0.field841 = 150;
            var0.field859 = (int) (Math.sin((double) field4078 / 40.0D) * 256.0D) & 2047;
            var0.field833 = 5;
            var0.field834 = 0;
        } else if (var2 == 328) {
            var0.field841 = 150;
            var0.field859 = (int) (Math.sin((double) field4078 / 40.0D) * 256.0D) & 2047;
            var0.field833 = 5;
            var0.field834 = 1;
        }
    }

    static void method2441() {
        class46 var1 = class46.method134(class488.field3505, field3840.field2238);
        field3840.method1359(var1);
        class269.field1983 = true;

        for (class522 var2 = (class522) field3796.method858(); var2 != null; var2 = (class522) field3796.method859()) {
            if (var2.field4200 == 0 || var2.field4200 == 3) {
                method2376(var2, true);
            }
        }

        if (field3952 != null) {
            method2424(field3952);
            field3952 = null;
        }

        class269.field1983 = false;
    }

    static class522 method2461(int var0, int var1, int var2) {
        class522 var4 = new class522();
        var4.field4202 = var1;
        var4.field4200 = var2;
        field3796.method860(var4, var0);
        method2333(var1);
        class97 var5 = class97.method424(var0);
        method2424(var5);
        if (null != field3952) {
            method2424(field3952);
            field3952 = null;
        }

        method2363(class46.field542[var0 >> 16], var5, false);
        class269.method1193(var1);
        if (field3947 != -1) {
            method2474(field3947, 1);
        }

        return var4;
    }

    static void method2376(class522 var0, boolean var1) {
        int var3 = var0.field4202;
        int var4 = (int) var0.field658;
        var0.method221();
        if (var1) {
            class97.method426(var3);
        }

        method2462(var3);
        class97 var5 = class97.method424(var4);
        if (var5 != null) {
            method2424(var5);
        }

        if (field3947 != -1) {
            method2474(field3947, 1);
        }

    }

    static void method2343(class97 var0, int var1, int var2, int var3) {
        method2453();
        class42 var5 = var0.method391(false);
        if (var5 != null) {
            class415.method1921(var1, var2, var1 + var5.field529, var2 + var5.field528);
            if (field4028 != 2 && field4028 != 5) {
                int var6 = field3953 & 2047;
                int var7 = class180.field1528.field4121 / 32 + 48;
                int var8 = 464 - class180.field1528.field4092 / 32;
                class156.field1336.method1556(var1, var2, var5.field529, var5.field528, var7, var8, var6, 256, var5.field531, var5.field530);

                int var9;
                int var10;
                int var11;
                for (var9 = 0; var9 < field4022; ++var9) {
                    var10 = field4023[var9] * 4 + 2 - class180.field1528.field4121 / 32;
                    var11 = 2 + 4 * field4024[var9] - class180.field1528.field4092 / 32;
                    method2422(var1, var2, var10, var11, field4033[var9], var5);
                }

                int var12;
                int var13;
                for (var9 = 0; var9 < 104; ++var9) {
                    for (var10 = 0; var10 < 104; ++var10) {
                        class43 var17 = field3915[class201.field1651][var9][var10];
                        if (var17 != null) {
                            var12 = 2 + var9 * 4 - class180.field1528.field4121 / 32;
                            var13 = 2 + var10 * 4 - class180.field1528.field4092 / 32;
                            method2422(var1, var2, var12, var13, class475.field3399[0], var5);
                        }
                    }
                }

                for (var9 = 0; var9 < field3836; ++var9) {
                    class424 var15 = field3835[field3774[var9]];
                    if (var15 != null && var15.method2501()) {
                        class345 var18 = var15.field2920;
                        if (null != var18 && null != var18.field2503) {
                            var18 = var18.method1625();
                        }

                        if (null != var18 && var18.field2498 && var18.field2509) {
                            var12 = var15.field4121 / 32 - class180.field1528.field4121 / 32;
                            var13 = var15.field4092 / 32 - class180.field1528.field4092 / 32;
                            method2422(var1, var2, var12, var13, class475.field3399[1], var5);
                        }
                    }
                }

                var9 = class172.field1443;
                int[] var16 = class172.field1444;

                for (var11 = 0; var11 < var9; ++var11) {
                    class283 var19 = field3948[var16[var11]];
                    if (var19 != null && var19.method2501() && !var19.field2073 && var19 != class180.field1528) {
                        var13 = var19.field4121 / 32 - class180.field1528.field4121 / 32;
                        int var14 = var19.field4092 / 32 - class180.field1528.field4092 / 32;
                        if (var19.method1282()) {
                            method2422(var1, var2, var13, var14, class475.field3399[3], var5);
                        } else if (class180.field1528.field2080 != 0 && var19.field2080 != 0 && var19.field2080 == class180.field1528.field2080) {
                            method2422(var1, var2, var13, var14, class475.field3399[4], var5);
                        } else if (var19.method1285()) {
                            method2422(var1, var2, var13, var14, class475.field3399[5], var5);
                        } else if (var19.method1292()) {
                            method2422(var1, var2, var13, var14, class475.field3399[6], var5);
                        } else {
                            method2422(var1, var2, var13, var14, class475.field3399[2], var5);
                        }
                    }
                }

                if (field3853 != 0 && field4078 % 20 < 10) {
                    if (field3853 == 1 && field3797 >= 0 && field3797 < field3835.length) {
                        class424 var20 = field3835[field3797];
                        if (null != var20) {
                            var12 = var20.field4121 / 32 - class180.field1528.field4121 / 32;
                            var13 = var20.field4092 / 32 - class180.field1528.field4092 / 32;
                            method2479(var1, var2, var12, var13, class434.field2959[1], var5);
                        }
                    }

                    if (field3853 == 2) {
                        var11 = field3799 * 4 - class357.field2573 * 4 + 2 - class180.field1528.field4121 / 32;
                        var12 = 2 + (field3942 * 4 - class5.field28 * 4) - class180.field1528.field4092 / 32;
                        method2479(var1, var2, var11, var12, class434.field2959[1], var5);
                    }

                    if (field3853 == 10 && field3816 >= 0 && field3816 < field3948.length) {
                        class283 var21 = field3948[field3816];
                        if (null != var21) {
                            var12 = var21.field4121 / 32 - class180.field1528.field4121 / 32;
                            var13 = var21.field4092 / 32 - class180.field1528.field4092 / 32;
                            method2479(var1, var2, var12, var13, class434.field2959[1], var5);
                        }
                    }
                }

                if (field4026 != 0) {
                    var11 = field4026 * 4 + 2 - class180.field1528.field4121 / 32;
                    var12 = field3949 * 4 + 2 - class180.field1528.field4092 / 32;
                    method2422(var1, var2, var11, var12, class434.field2959[0], var5);
                }

                if (!class180.field1528.field2073) {
                    class415.method1914(var1 + var5.field529 / 2 - 1, var2 + var5.field528 / 2 - 1, 3, 3, 16777215);
                }
            } else {
                class415.method1922(var1, var2, 0, var5.field531, var5.field530);
            }

            field3998[var3] = true;
        }
    }

    static void method2337(class97 var0, int var1, int var2, int var3) {
        class42 var5 = var0.method391(false);
        if (var5 != null) {
            if (field4028 < 3) {
                field3855.method1556(var1, var2, var5.field529, var5.field528, 25, 25, field3953, 256, var5.field531, var5.field530);
            } else {
                class415.method1922(var1, var2, 0, var5.field531, var5.field530);
            }

        }
    }

    static void method2479(int var0, int var1, int var2, int var3, class331 var4, class42 var5) {
        int var7 = var2 * var2 + var3 * var3;
        if (var7 > 4225 && var7 < 90000) {
            int var8 = field3953 & 2047;
            int var9 = class334.field2429[var8];
            int var10 = class334.field2427[var8];
            int var11 = var9 * var3 + var2 * var10 >> 16;
            int var12 = var10 * var3 - var2 * var9 >> 16;
            double var13 = Math.atan2(var11, var12);
            int var15 = var5.field529 / 2 - 25;
            int var16 = (int) (Math.sin(var13) * (double) var15);
            int var17 = (int) (Math.cos(var13) * (double) var15);
            boolean var18 = true;
            class169.field1433.method1534(var16 + (var5.field529 / 2 + var0 - 10), var1 + var5.field528 / 2 - 10 - var17 - 10, 20, 20, 15, 15, var13, 256);
        } else {
            method2422(var0, var1, var2, var3, var4, var5);
        }

    }

    static void method2422(int var0, int var1, int var2, int var3, class331 var4, class42 var5) {
        if (null != var4) {
            int var7 = field3953 & 2047;
            int var8 = var2 * var2 + var3 * var3;
            if (var8 <= 6400) {
                int var9 = class334.field2429[var7];
                int var10 = class334.field2427[var7];
                int var11 = var2 * var10 + var9 * var3 >> 16;
                int var12 = var3 * var10 - var9 * var2 >> 16;
                if (var8 > 2500) {
                    var4.method1555(var5.field529 / 2 + var11 - var4.field2420 / 2, var5.field528 / 2 - var12 - var4.field2421 / 2, var0, var1, var5.field529, var5.field528, var5.field531, var5.field530);
                } else {
                    var4.method1563(var0 + var5.field529 / 2 + var11 - var4.field2420 / 2, var5.field528 / 2 + var1 - var12 - var4.field2421 / 2);
                }

            }
        }
    }

    static void method2483() {
        Iterator var1 = class157.field1339.iterator();

        while (var1.hasNext()) {
            class434 var2 = (class434) var1.next();
            var2.method1978();
        }

        if (null != class527.field4208) {
            class527.field4208.method823((byte) -1);
        }

    }

    static void method2391() {
        field3981 = field3777;
    }

    static void method2400(String var0) {
        if (class527.field4208 != null) {
            class46 var2 = class46.method134(class488.field3584, field3840.field2238);
            var2.field541.method249(class78.method323(var0));
            var2.field541.method252(var0);
            field3840.method1359(var2);
        }
    }

    static void method2388(String var0) {
        if (!var0.equals("")) {
            class46 var2 = class46.method134(class488.field3564, field3840.field2238);
            var2.field541.method249(class78.method323(var0));
            var2.field541.method252(var0);
            field3840.method1359(var2);
        }
    }

    static void method2367() {
        class46 var1 = class46.method134(class488.field3564, field3840.field2238);
        var1.field541.method249(0);
        field3840.method1359(var1);
    }

    static void method2380(int var0, int var1) {
        class315 var3 = var0 >= 0 ? field4020[var0] : class375.field2724;
        if (var3 != null && var1 >= 0 && var1 < var3.method1388()) {
            class404 var4 = var3.field2263.get(var1);
            if (var4.field2863 == -1) {
                String var5 = var4.field2862.method1706();
                class46 var6 = class46.method134(class488.field3526, field3840.field2238);
                var6.field541.method249(3 + class78.method323(var5));
                var6.field541.method249(var0);
                var6.field541.method290(var1);
                var6.field541.method252(var5);
                field3840.method1359(var6);
            }
        }
    }

    static void method2472(int var0, int var1) {
        if (field4020[var0] != null) {
            if (var1 >= 0 && var1 < field4020[var0].method1388()) {
                class404 var3 = field4020[var0].field2263.get(var1);
                if (var3.field2863 == -1) {
                    class46 var4 = class46.method134(class488.field3517, field3840.field2238);
                    var4.field541.method249(3 + class78.method323(var3.field2862.method1706()));
                    var4.field541.method249(var0);
                    var4.field541.method290(var1);
                    var4.field541.method252(var3.field2862.method1706());
                    field3840.method1359(var4);
                }
            }
        }
    }

    static void method2462(int var0) {
        for (class170 var2 = (class170) field3994.method858(); null != var2; var2 = (class170) field3994.method859()) {
            if ((var2.field658 >> 48 & 65535L) == (long) var0) {
                var2.method221();
            }
        }

    }

    static int method2420(class97 var0) {
        class170 var2 = (class170) field3994.method857((long) var0.field910 + ((long) var0.field791 << 32));
        return var2 != null ? var2.field1437 : var0.field862;
    }

    static class97 method2382(class97 var0) {
        int var2 = class383.method1778(method2420(var0));
        if (var2 == 0) {
            return null;
        } else {
            for (int var3 = 0; var3 < var2; ++var3) {
                var0 = class97.method424(var0.field808);
                if (var0 == null) {
                    return null;
                }
            }

            return var0;
        }
    }

    static boolean method2397(class97 var0) {
        return var0.field809;
    }

    static String method2450(class97 var0) {
        if (class383.method1776(method2420(var0)) == 0) {
            return null;
        } else {
            return null != var0.field873 && var0.field873.trim().length() != 0 ? var0.field873 : null;
        }
    }

    static String method2418(String var0, boolean var1) {
        String var3 = var1 ? "https://" : "http://";
        if (field3800 == 1) {
            var0 = var0 + "-wtrc";
        } else if (field3800 == 2) {
            var0 = var0 + "-wtqa";
        } else if (field3800 == 3) {
            var0 = var0 + "-wtwip";
        } else if (field3800 == 5) {
            var0 = var0 + "-wti";
        } else if (field3800 == 4) {
            var0 = "local";
        }

        String var4 = "";
        if (null != class338.field2445) {
            var4 = "/p=" + class338.field2445;
        }

        String var5 = "runescape.com";
        return var3 + var0 + "." + var5 + "/l=" + class404.field2860 + "/a=" + class350.field2539 + var4 + "/";
    }

    static void method2355(String var0) {
        class338.field2445 = var0;

        try {
            String var2 = class268.field1973.getParameter(Integer.toString(18));
            String var3 = class268.field1973.getParameter(Integer.toString(13));
            String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
            String var6;
            if (var0.length() == 0) {
                var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var4 + "; Expires=";
                long var7 = class206.method982() + 94608000000L;
                class336.field2438.setTime(new Date(var7));
                int var9 = class336.field2438.get(7);
                int var10 = class336.field2438.get(5);
                int var11 = class336.field2438.get(2);
                int var12 = class336.field2438.get(1);
                int var13 = class336.field2438.get(11);
                int var14 = class336.field2438.get(12);
                int var15 = class336.field2438.get(13);
                var6 = class336.field2437[var9 - 1] + ", " + var10 / 10 + var10 % 10 + "-" + class336.field2439[0][var11] + "-" + var12 + " " + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + ":" + var15 / 10 + var15 % 10 + " GMT";
                var4 = var5 + var6 + "; Max-Age=" + 94608000L;
            }

            Client var17 = class268.field1973;
            var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var17).eval(var6);
        } catch (Throwable var16) {
        }

    }

    static void method2414(String var0, boolean var1) {
        var0 = var0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;

        for (int var5 = 0; var5 < class201.field1652; ++var5) {
            class508 var6 = class508.method2299(var5);
            if ((!var1 || var6.field3764) && var6.field3727 == -1 && var6.field3736.toLowerCase().indexOf(var0) != -1) {
                if (var4 >= 250) {
                    class215.field1740 = -1;
                    class30.field169 = null;
                    return;
                }

                if (var4 >= var3.length) {
                    short[] var7 = new short[2 * var3.length];

					System.arraycopy(var3, 0, var7, 0, var4);

                    var3 = var7;
                }

                var3[var4++] = (short) var5;
            }
        }

        class30.field169 = var3;
        class27.field150 = 0;
        class215.field1740 = var4;
        String[] var9 = new String[class215.field1740];

        for (int var10 = 0; var10 < class215.field1740; ++var10) {
            var9[var10] = class508.method2299(var3[var10]).field3736;
        }

        short[] var11 = class30.field169;
        class240.method1072(var9, var11, 0, var9.length - 1);
    }

    static void method2348(class78 var0, int var1) {
        byte[] var3 = var0.field695;
        if (field4058 == null) {
            field4058 = new byte[24];
        }

        class292.method1315(var3, var1, field4058, 0, 24);
        class6.method5(var0, var1);
    }

    static void method2412(class78 var0) {
        if (field4058 != null) {
            var0.method254(field4058, 0, field4058.length);
        } else {
            byte[] var3 = new byte[24];

            try {
                class6.field32.method1152(0L);
                class6.field32.method1153(var3);

                int var4;
                for (var4 = 0; var4 < 24 && var3[var4] == 0; ++var4) {
                }

                if (var4 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; ++var5) {
                    var3[var5] = -1;
                }
            }

            var0.method254(var3, 0, var3.length);
        }
    }

    public static void method2375(int var0, int var1, int var2, boolean var3) {
        class46 var5 = class46.method134(class488.field3524, field3840.field2238);
        var5.field541.method322(var2);
        var5.field541.method290(var1);
        var5.field541.method298(var3 ? field3875 : 0);
        var5.field541.method312(var0);
        field3840.method1359(var5);
    }

    static void method2451(int var0) {
        field3868 = var0;
    }

    static void method2354() {
        field3840.method1359(class46.method134(class488.field3572, field3840.field2238));
        field3868 = 0;
    }

    static void method2436() {
        if (field3868 == 1) {
            field3876 = true;
        }

    }

    static void method2349() {
        if (field3876 && null != class180.field1528) {
            int var1 = class180.field1528.field4166[0];
            int var2 = class180.field1528.field4163[0];
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return;
            }

            class81.field710 = class180.field1528.field4121;
            int var3 = method2342(class180.field1528.field4121, class180.field1528.field4092, class201.field1651) - field3869;
            if (var3 < class518.field4176) {
                class518.field4176 = var3;
            }

            class201.field1653 = class180.field1528.field4092;
            field3876 = false;
        }

    }

    static String method2419(String var0) {
        class41[] var2 = class41.method116();

        for (int var3 = 0; var3 < var2.length; ++var3) {
            class41 var4 = var2[var3];
            if (var4.field524 != -1 && var0.startsWith(class471.method2176(var4.field524))) {
                var0 = var0.substring(6 + Integer.toString(var4.field524).length());
                break;
            }
        }

        return var0;
    }

    static void method2332() {
        class290.field2121.method2553(field3780);
    }

    static void method2457(int var0) {
        if (var0 != field3811) {
            field3811 = var0;
        }
    }

    static void method2357(boolean var0) {
        field3922 = var0;
    }

    static class436 method2466(int var0) {
        class436 var2 = (class436) field3971.method1307(var0);
        if (null == var2) {
            var2 = new class436(class390.field2780, class497.method2249(var0), class497.method2250(var0));
            field3971.method1306(var2, var0);
        }

        return var2;
    }

    static class436 method2485(int var0) {
        class436 var2 = (class436) field3861.method1307(var0);
        if (null == var2) {
            var2 = new class436(class390.field2780, var0);
        }

        return var2;
    }

    public static Clipboard method2467() {
        return class268.field1973.method2192();
    }

    static void method2494(int var0) {
        class124 var2 = class124.method575(var0);
        if (var2.method574()) {
            if (class532.method2554(var2.field1120, (byte) 94) == 2) {
                field3944.add(var2.field1120);
            }

        }
    }

    static void method2406() {
        for (int var1 = 0; var1 < field3944.size(); ++var1) {
            if (class532.method2554(field3944.get(var1), (byte) -51) != 2) {
                field3944.remove(var1);
                --var1;
            }
        }

    }

    @Override
    protected void method2212() {
    }

    @Override
    public void init() {
        if (this.method2215()) {
            for (int var1 = 0; var1 <= 28; ++var1) {
                String var2 = this.getParameter(Integer.toString(var1));
                if (null != var2) {
                    switch (var1) {
                        case 3:
							field3802 = var2.equalsIgnoreCase(class49.field550);
                            break;
                        case 4:
                            if (field3781 == -1) {
                                field3781 = Integer.parseInt(var2);
                            }
                            break;
                        case 5:
                            field3776 = Integer.parseInt(var2);
                            break;
                        case 6:
                            class404.field2860 = class492.method2241(Integer.parseInt(var2));
                            break;
                        case 7:
                            int var4 = Integer.parseInt(var2);
                            class512[] var5 = class512.method2496();
                            int var6 = 0;

                            class512 var12;
                            while (true) {
                                if (var6 >= var5.length) {
                                    var12 = null;
                                    break;
                                }

                                class512 var7 = var5[var6];
                                if (var4 == var7.field4084) {
                                    var12 = var7;
                                    break;
                                }

                                ++var6;
                            }

                            class529.field4219 = var12;
                            break;
                        case 8:
                            if (var2.equalsIgnoreCase(class49.field550)) {
                            }
                            break;
                        case 9:
                            class338.field2445 = var2;
                            break;
                        case 10:
                            class120[] var11 = new class120[]{class120.field1086, class120.field1093, class120.field1087, class120.field1092, class120.field1088, class120.field1090};
                            class350.field2540 = (class120) class27.method80(var11, Integer.parseInt(var2));
                            if (class120.field1090 == class350.field2540) {
                                class492.field3622 = class194.field1604;
                            } else {
                                class492.field3622 = class194.field1606;
                            }
                            break;
                        case 11:
                            class373.field2692 = var2;
                            break;
                        case 12:
                            field3775 = Integer.parseInt(var2);
                        case 13:
                        case 16:
                        case 18:
                        case 19:
                        case 20:
                        case 22:
                        case 23:
                        case 24:
                        default:
                            break;
                        case 14:
                            class350.field2539 = Integer.parseInt(var2);
                            break;
                        case 15:
                            field3800 = Integer.parseInt(var2);
                            break;
                        case 17:
                            class365.field2618 = var2;
                            break;
                        case 21:
                            field3780 = Integer.parseInt(var2);
                            break;
                        case 25:
                            int var3 = var2.indexOf(".");
                            if (var3 == -1) {
                                field3957 = Integer.parseInt(var2);
                            } else {
                                field3957 = Integer.parseInt(var2.substring(0, var3));
                                Integer.parseInt(var2.substring(var3 + 1));
                            }
                    }
                }
            }

            class158.field1375 = false;
            field3779 = false;
            class111.field1050 = this.getCodeBase().getHost();
            class426.field2930 = new class453();
            String var9 = class529.field4219.field4079;
            byte var10 = 0;
            if ((field3776 & class373.field2675.method1533()) != 0) {
                class458.field3150 = "beta";
            }

            try {
                class6.method8("oldschool", class458.field3150, var9, var10, 22);
            } catch (Exception var8) {
                class157.method728(null, var8);
            }

            class268.field1973 = this;
            class80.field704 = field3781;
            method2341();
            if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
                this.field3822 = true;
            }

            if (field3793 == -1) {
                if (!this.method2305() && !this.method2324((byte) 106)) {
                    field3793 = 0;
                } else {
                    field3793 = 5;
                }
            }

            this.method2207(765, 503, 216, 1);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        class141.method651(this);
        super.finalize();
    }

    boolean method2328() {
        return this.field3823 == 1;
    }

    @Override
    public void setClient(int var1) {
        this.field3823 = var1;
    }

    @Override
    public void setOtlTokenRequester(OtlTokenRequester var1) {
        if (null != var1) {
            this.field3927 = var1;
            class500.method2256(10);
        }
    }

    @Override
    public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
        if (var1 != null) {
            this.field3825 = var1;
        }
    }

    @Override
    public boolean isOnLoginScreen() {
        return field3859 == 10;
    }

    @Override
    public long getAccountHash() {
        return this.field3833;
    }

    boolean method2305() {
        return null != class323.field2347 && !class323.field2347.trim().isEmpty() && class535.field4260 != null && !class535.field4260.trim().isEmpty();
    }

    boolean method2324(byte var1) {
        return null != class165.field1428 && !class165.field1428.trim().isEmpty() && class195.field1612 != null && !class195.field1612.trim().isEmpty();
    }

    boolean method2306() {
        return null != this.field3927;
    }

    void method2326(String var1) throws IOException {
        HashMap<String, String> var3 = new HashMap<String, String>();
        var3.put("grant_type", "refresh_token");
        var3.put("scope", "gamesso.token.create");
        var3.put("refresh_token", var1);
        URL var4 = new URL(class373.field2692 + "shield/oauth/token" + (new class355(var3)).method1690());
        class255 var5 = new class255();
        if (this.method2328()) {
            var5.method1131(field3911);
        } else {
            var5.method1131(field4027);
        }

        var5.method1130("Host", (new URL(class373.field2692)).getHost());
        var5.method1133(class495.field3627);
        class535 var6 = class535.field4253;
        RefreshAccessTokenRequester var7 = this.field3825;
        if (null != var7) {
            this.field3826 = var7.request(var6.method2576(), var4, var5.method1129(), "");
        } else {
            class189 var8 = new class189(var4, var6, var5, this.field3822);
            this.field3824 = this.field3818.method581(var8);
        }
    }

    void method2307(String var1) throws IOException {
        URL var3 = new URL(class373.field2692 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class255 var4 = new class255();
        var4.method1140(var1);
        class535 var5 = class535.field4252;
        OtlTokenRequester var6 = this.field3927;
        if (null != var6) {
            this.field3821 = var6.request(var5.method2576(), var3, var4.method1129(), "");
        } else {
            class189 var7 = new class189(var3, var5, var4, this.field3822);
            this.field3897 = this.field3818.method581(var7);
        }
    }

    void method2323(String var1, String var2) throws IOException, JSONException {
        URL var4 = new URL(class373.field2692 + "game-session/v1/tokens");
        class189 var5 = new class189(var4, class535.field4253, this.field3822);
        var5.method879().method1140(var1);
        var5.method879().method1133(class495.field3627);
        JSONObject var6 = new JSONObject();
        var6.put("accountId", var2);
        var5.method875(new class326(var6));
        this.field3897 = this.field3818.method581(var5);
    }

    @Override
    protected void method2218() {
        class63.method184(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
        class459.field3156 = field3800 == 0 ? 43594 : field3775 + 40000;
        class214.field1737 = field3800 == 0 ? 443 : field3775 + 50000;
        class155.field1335 = class459.field3156;
        class244.field1866 = class237.field1829;
        class348.field2526 = class237.field1832;
        class52.field583 = class237.field1830;
        class52.field590 = class237.field1831;
        class174.field1465 = new class223(this.field3822, 216);
        this.method2193();
        this.method2195();
        class264.field1953 = this.method2222();
        this.method2220(field4014, 0);
        this.method2220(field3923, 1);
        class297.field2148 = new class239(255, class6.field33, class6.field34, 500000);
        class119 var3 = null;
        class532 var4 = new class532();

        try {
            var3 = class6.method7("", class350.field2540.field1091, false);
            byte[] var5 = new byte[(int) var3.method532()];

            int var7;
            for (int var6 = 0; var6 < var5.length; var6 += var7) {
                var7 = var3.method533(var5, var6, var5.length - var6);
                if (var7 == -1) {
                    throw new IOException();
                }
            }

            var4 = new class532(new class78(var5));
        } catch (Exception var9) {
        }

        try {
            if (null != var3) {
                var3.method534();
            }
        } catch (Exception var8) {
        }

        class290.field2121 = var4;
        this.method2190();
        class33.method95(this, class13.field55);
        class288.method1303(class290.field2121.method2543());
        class153.field1320 = new class435(class492.field3622);
        this.field3818 = new class127("tokenRequest", 1, 1);
        if (!class141.field1243.contains(this)) {
            class141.field1243.add(this);
        }

        class216.field1741 = new class445[1];
        class159 var10 = class159.field1402;
        class216.field1741[0] = new class445(var10.field1404, var10.field1409);
    }

    @Override
    protected void method2219() {
        ++field4078;
        this.method2308();

        while (true) {
            class489 var2;
            synchronized (class531.field4228) {
                var2 = (class489) class531.field4226.method120();
            }

            if (null == var2) {
                boolean var8 = class141.method653();
                if (var8 && field4047 && null != class392.field2785) {
                    class392.field2785.method1832();
                }

                method2453();
                field3923.method953();
                this.method2194();
                synchronized (class499.field3648) {
                    class499.field3641 = class499.field3637;
                    class499.field3651 = class499.field3638;
                    class499.field3634 = class499.field3639;
                    class499.field3642 = class499.field3640;
                    class499.field3645 = class499.field3643;
                    class499.field3646 = class499.field3652;
                    class499.field3647 = class499.field3650;
                    class499.field3635 = class499.field3644;
                    class499.field3643 = 0;
                }

                if (null != class264.field1953) {
                    int var3 = class264.field1953.method1937();
                    field3988 = var3;
                }

                if (field3859 == 0) {
                    method2421();
                    class479.method2223();
                } else if (field3859 == 5) {
                    class500.method2269(this, class58.field605, class21.field75);
                    method2421();
                    class479.method2223();
                } else if (field3859 != 10 && field3859 != 11) {
                    if (field3859 == 20) {
                        class500.method2269(this, class58.field605, class21.field75);
                        this.method2309();
                    } else if (field3859 == 50) {
                        class500.method2269(this, class58.field605, class21.field75);
                        this.method2309();
                    } else if (field3859 == 25) {
                        method2470();
                    }
                } else {
                    class500.method2269(this, class58.field605, class21.field75);
                }

                if (field3859 == 30) {
                    this.method2325();
                } else if (field3859 == 40 || field3859 == 45) {
                    this.method2309();
                }

                return;
            }

            var2.field3600.method1759(var2.field3599, (int) var2.field658, var2.field3597, false);
        }
    }

    @Override
    protected void method2208(boolean var1) {
        if ((field3859 == 10 || field3859 == 20 || field3859 == 30) && 0L != field4005 && class206.method982() > field4005) {
            class288.method1303(method2423());
        }

        int var3;
        if (var1) {
            for (var3 = 0; var3 < 100; ++var3) {
                field3785[var3] = true;
            }
        }

        if (field3859 == 0) {
            this.method2205(class500.field3661, class500.field3662, var1);
        } else if (field3859 == 5) {
            class402.method1851(class303.field2170, class58.field605, class21.field75);
        } else if (field3859 != 10 && field3859 != 11) {
            if (field3859 == 20) {
                class402.method1851(class303.field2170, class58.field605, class21.field75);
            } else if (field3859 == 50) {
                class402.method1851(class303.field2170, class58.field605, class21.field75);
            } else if (field3859 == 25) {
                if (field3849 == 1) {
                    if (field3845 > field3879) {
                        field3879 = field3845;
                    }

                    var3 = (field3879 * 50 - field3845 * 50) / field3879;
                    method2480(class32.field184 + class49.field555 + class49.field549 + var3 + "%" + class49.field551, false);
                } else if (field3849 == 2) {
                    if (field3847 > field3848) {
                        field3848 = field3847;
                    }

                    var3 = 50 + (field3848 * 50 - field3847 * 50) / field3848;
                    method2480(class32.field184 + class49.field555 + class49.field549 + var3 + "%" + class49.field551, false);
                } else {
                    method2480(class32.field184, false);
                }
            } else if (field3859 == 30) {
                this.method2311();
            } else if (field3859 == 40) {
                method2480(class32.field185 + class49.field555 + class32.field186, false);
            } else if (field3859 == 45) {
                method2480(class32.field445, false);
            }
        } else {
            class402.method1851(class303.field2170, class58.field605, class21.field75);
        }

        if (field3859 == 30 && field4004 == 0 && !var1 && !field4006) {
            for (var3 = 0; var3 < field3946; ++var3) {
                if (field3998[var3]) {
                    class295.field2141.method2581(field4000[var3], field4001[var3], field4002[var3], field4003[var3]);
                    field3998[var3] = false;
                }
            }
        } else if (field3859 > 0) {
            class295.field2141.method2580(0, 0);

            for (var3 = 0; var3 < field3946; ++var3) {
                field3998[var3] = false;
            }
        }

    }

    @Override
    protected void method2189() {
        if (class305.field2233.method911()) {
            class305.field2233.method909();
        }

        if (class151.field1306 != null) {
            class151.field1306.field746 = false;
        }

        class151.field1306 = null;
        field3840.method1363();
        if (class499.field3648 != null) {
            synchronized (class499.field3648) {
                class499.field3648 = null;
            }
        }

        class264.field1953 = null;
        if (class392.field2785 != null) {
            class392.field2785.method1824();
        }

        class426.field2930.method2089();
        class531.method2523();
        if (class174.field1465 != null) {
            class174.field1465.method1700();
            class174.field1465 = null;
        }

        class6.method10();
        this.field3818.method582();
    }

    void method2308() {
        if (field3859 != 1000) {
            boolean var2 = class426.field2930.method2088();
            if (!var2) {
                this.method2322();
            }

        }
    }

    void method2322() {
        if (class426.field2930.field3112 >= 4) {
            this.method2209("js5crc");
            method2459(1000);
        } else {
            if (class426.field2930.field3135 >= 4) {
                if (field3859 <= 5) {
                    this.method2209("js5io");
                    method2459(1000);
                    return;
                }

                field3809 = 3000;
                class426.field2930.field3135 = 3;
            }

            if (--field3809 + 1 <= 0) {
                try {
                    if (field3808 == 0) {
                        class151.field1311 = class479.field3426.method501(class111.field1050, class155.field1335);
                        ++field3808;
                    }

                    if (field3808 == 1) {
                        if (class151.field1311.field3157 == 2) {
                            this.method2321(-1);
                            return;
                        }

                        if (class151.field1311.field3157 == 1) {
                            ++field3808;
                        }
                    }

                    if (field3808 == 2) {
                        Socket var3 = (Socket) class151.field1311.field3158;
                        class530 var2 = new class530(var3, 40000, 5000);
                        class303.field2168 = var2;
                        class78 var4 = new class78(5);
                        var4.method249(15);
                        var4.method315(216);
                        class303.field2168.method230(var4.field695, 0, 5);
                        ++field3808;
                        class288.field2109 = class206.method982();
                    }

                    if (field3808 == 3) {
                        if (class303.field2168.method229() > 0) {
                            int var6 = class303.field2168.method231();
                            if (var6 != 0) {
                                this.method2321(var6);
                                return;
                            }

                            ++field3808;
                        } else if (class206.method982() - class288.field2109 > 30000L) {
                            this.method2321(-2);
                            return;
                        }
                    }

                    if (field3808 == 4) {
                        class426.field2930.method2083(class303.field2168, field3859 > 20);
                        class151.field1311 = null;
                        class303.field2168 = null;
                        field3808 = 0;
                        field3955 = 0;
                    }
                } catch (IOException var5) {
                    this.method2321(-3);
                }

            }
        }
    }

    void method2321(int var1) {
        class151.field1311 = null;
        class303.field2168 = null;
        field3808 = 0;
        if (class155.field1335 == class459.field3156) {
            class155.field1335 = class214.field1737;
        } else {
            class155.field1335 = class459.field3156;
        }

        ++field3955;
        if (field3955 < 2 || var1 != 7 && var1 != 9) {
            if (field3955 >= 2 && var1 == 6) {
                this.method2209("js5connect_outofdate");
                method2459(1000);
            } else if (field3955 >= 4) {
                if (field3859 <= 5) {
                    this.method2209("js5connect");
                    method2459(1000);
                } else {
                    field3809 = 3000;
                }
            }
        } else if (field3859 <= 5) {
            this.method2209("js5connect_full");
            method2459(1000);
        } else {
            field3809 = 3000;
        }

    }

    void method2309() {
        Object var2 = field3840.method1362();
        class320 var3 = field3840.field2239;

        try {
            if (field3811 == 0) {
                if (null == class83.field723 && (field3830.method129() || field3790 > 250)) {
                    class83.field723 = field3830.method130();
                    field3830.method131();
                    field3830 = null;
                }

                if (null != class83.field723) {
                    if (var2 != null) {
                        ((class75) var2).method232();
                        var2 = null;
                    }

                    class102.field1006 = null;
                    field3842 = false;
                    field3790 = 0;
                    if (field3820.method1076()) {
                        if (this.method2305()) {
                            try {
                                this.method2326(class535.field4260);
                                method2457(21);
                            } catch (Throwable var21) {
                                class157.method728(null, var21);
                                class414.method1903(65);
                                return;
                            }
                        } else {
                            if (!this.method2324((byte) 6)) {
                                class414.method1903(65);
                                return;
                            }

                            try {
                                this.method2323(class165.field1428, class195.field1612);
                                method2457(20);
                            } catch (Exception var20) {
                                class157.method728(null, var20);
                                class414.method1903(65);
                                return;
                            }
                        }
                    } else {
                        method2457(1);
                    }
                }
            }

            class69 var23;
            if (field3811 == 21) {
                if (null != this.field3826) {
                    if (!this.field3826.isDone()) {
                        return;
                    }

                    if (this.field3826.isCancelled()) {
                        class414.method1903(65);
                        this.field3826 = null;
                        return;
                    }

                    try {
                        RefreshAccessTokenResponse var4 = this.field3826.get();
                        if (!var4.isSuccess()) {
                            class414.method1903(65);
                            this.field3826 = null;
                            return;
                        }

                        class323.field2347 = var4.getAccessToken();
                        class535.field4260 = var4.getRefreshToken();
                        this.field3826 = null;
                    } catch (Exception var19) {
                        class157.method728(null, var19);
                        class414.method1903(65);
                        this.field3826 = null;
                        return;
                    }
                } else {
                    if (null == this.field3824) {
                        class414.method1903(65);
                        return;
                    }

                    if (!this.field3824.method34()) {
                        return;
                    }

                    if (this.field3824.method35()) {
                        class157.method728(this.field3824.method37(), null);
                        class414.method1903(65);
                        this.field3824 = null;
                        return;
                    }

                    var23 = this.field3824.method36();
                    if (var23.method217() != 200) {
                        class414.method1903(65);
                        this.field3824 = null;
                        return;
                    }

                    field3790 = 0;
                    class326 var5 = new class326(var23.method219());

                    try {
                        class323.field2347 = var5.method1439().getString("access_token");
                        class535.field4260 = var5.method1439().getString("refresh_token");
                    } catch (Exception var18) {
                        class157.method728("Error parsing tokens", var18);
                        class414.method1903(65);
                        this.field3824 = null;
                        return;
                    }
                }

                this.method2307(class323.field2347);
                method2457(20);
            }

            if (field3811 == 20) {
                if (this.field3821 != null) {
                    if (!this.field3821.isDone()) {
                        return;
                    }

                    if (this.field3821.isCancelled()) {
                        class414.method1903(65);
                        this.field3821 = null;
                        return;
                    }

                    try {
                        OtlTokenResponse var24 = this.field3821.get();
                        if (!var24.isSuccess()) {
                            class414.method1903(65);
                            this.field3821 = null;
                            return;
                        }

                        this.field3817 = var24.getToken();
                        this.field3821 = null;
                    } catch (Exception var17) {
                        class157.method728(null, var17);
                        class414.method1903(65);
                        this.field3821 = null;
                        return;
                    }
                } else {
                    if (this.field3897 == null) {
                        class414.method1903(65);
                        return;
                    }

                    if (!this.field3897.method34()) {
                        return;
                    }

                    if (this.field3897.method35()) {
                        class157.method728(this.field3897.method37(), null);
                        class414.method1903(65);
                        this.field3897 = null;
                        return;
                    }

                    var23 = this.field3897.method36();
                    if (var23.method217() != 200) {
                        class157.method728("Response code: " + var23.method217() + "Response body: " + var23.method219(), null);
                        class414.method1903(65);
                        this.field3897 = null;
                        return;
                    }

                    List<String> var26 = var23.method218().get("Content-Type");
                    if (var26 != null && var26.contains(class495.field3627.method2246())) {
                        try {
                            JSONObject var6 = new JSONObject(var23.method219());
                            this.field3817 = var6.getString("token");
                        } catch (JSONException var16) {
                            class157.method728(null, var16);
                            class414.method1903(65);
                            this.field3897 = null;
                            return;
                        }
                    } else {
                        this.field3817 = var23.method219();
                    }

                    this.field3897 = null;
                }

                field3790 = 0;
                method2457(1);
            }

            if (field3811 == 1) {
                if (class102.field1006 == null) {
                    class102.field1006 = class479.field3426.method501(class111.field1050, class155.field1335);
                }

                if (class102.field1006.field3157 == 2) {
                    throw new IOException();
                }

                if (class102.field1006.field3157 == 1) {
                    Socket var27 = (Socket) class102.field1006.field3158;
                    class530 var25 = new class530(var27, 40000, 5000);
                    var2 = var25;
                    field3840.method1360(var25);
                    class102.field1006 = null;
                    method2457(2);
                }
            }

            class46 var29;
            if (field3811 == 2) {
                field3840.method1364();
                var29 = class423.method1945((byte) -1);
                var29.field536 = null;
                var29.field537 = 0;
                var29.field541 = new class320(5000);
                var29.field541.method249(class152.field1319.field1317);
                field3840.method1359(var29);
                field3840.method1358();
                var3.field697 = 0;
                method2457(3);
            }

            int var28;
            if (field3811 == 3) {
                if (class392.field2785 != null) {
                    class392.field2785.method1823();
                }

                if (((class75) var2).method227(1)) {
                    var28 = ((class75) var2).method231();
                    if (null != class392.field2785) {
                        class392.field2785.method1823();
                    }

                    if (var28 != 0) {
                        class414.method1903(var28);
                        return;
                    }

                    var3.field697 = 0;
                    method2457(4);
                }
            }

            if (field3811 == 4) {
                if (var3.field697 < 8) {
                    var28 = ((class75) var2).method229();
                    if (var28 > 8 - var3.field697) {
                        var28 = 8 - var3.field697;
                    }

                    if (var28 > 0) {
                        ((class75) var2).method228(var3.field695, var3.field697, var28);
                        var3.field697 += var28;
                    }
                }

                if (var3.field697 == 8) {
                    var3.field697 = 0;
                    class518.field4182 = var3.method265();
                    method2457(5);
                }
            }

            if (field3811 == 5) {
                field3840.field2239.field697 = 0;
                field3840.method1364();
                class320 var34 = new class320(500);
                int[] var30 = new int[]{class83.field723.nextInt(), class83.field723.nextInt(), class83.field723.nextInt(), class83.field723.nextInt()};
                var34.field697 = 0;
                var34.method249(1);
                var34.method315(var30[0]);
                var34.method315(var30[1]);
                var34.method315(var30[2]);
                var34.method315(var30[3]);
                var34.method286(class518.field4182);
                if (field3859 == 40) {
                    var34.method315(class307.field2254[0]);
                    var34.method315(class307.field2254[1]);
                    var34.method315(class307.field2254[2]);
                    var34.method315(class307.field2254[3]);
                } else {
                    if (field3859 == 50) {
                        var34.method249(class360.field2578.method1533());
                        var34.method315(class343.field2464);
                    } else {
                        var34.method249(field4025.method1533());
                        switch (field4025.field2581) {
                            case 0:
                                var34.method315(class290.field2121.method2551(class500.field3678));
                            case 1:
                            default:
                                break;
                            case 2:
                            case 4:
                                var34.method301(class386.field2764);
                                ++var34.field697;
                                break;
                            case 3:
                                var34.field697 += 4;
                        }
                    }

                    if (field3820.method1076()) {
                        var34.method249(class241.field1841.method1533());
                        var34.method252(this.field3817);
                    } else {
                        var34.method249(class241.field1842.method1533());
                        var34.method252(class500.field3671);
                    }
                }

                var34.method293(class112.field1052, class112.field1053);
                class307.field2254 = var30;
                class46 var7 = class423.method1945((byte) -1);
                var7.field536 = null;
                var7.field537 = 0;
                var7.field541 = new class320(5000);
                var7.field541.field697 = 0;
                if (field3859 == 40) {
                    var7.field541.method249(class152.field1314.field1317);
                } else {
                    var7.field541.method249(class152.field1313.field1317);
                }

                var7.field541.method290(0);
                int var8 = var7.field541.field697;
                var7.field541.method315(216);
                var7.field541.method315(1);
                var7.field541.method249(field3781);
                var7.field541.method249(field3793);
                boolean var9 = false;
                var7.field541.method249(0);
                var7.field541.method254(var34.field695, 0, var34.field697);
                int var10 = var7.field541.field697;
                var7.field541.method252(class500.field3678);
                var7.field541.method249((field4006 ? 1 : 0) << 1 | (field3779 ? 1 : 0));
                var7.field541.method290(class223.field1763);
                var7.field541.method290(class519.field4188);
                method2412(var7.field541);
                var7.field541.method252(class338.field2445);
                var7.field541.method315(class350.field2539);
                if (field3957 > 213) {
                    var7.field541.method249(0);
                }

                class78 var11 = new class78(class13.field57.method618());
                class13.field57.method617(var11);
                var7.field541.method254(var11.field695, 0, var11.field695.length);
                var7.field541.method249(field3781);
                var7.field541.method315(0);
                var7.field541.method269(class452.field3111.field649);
                var7.field541.method269(class122.field1098.field649);
                var7.field541.method269(class332.field2425.field649);
                var7.field541.method269(class164.field1425.field649);
                var7.field541.method269(class403.field2859.field649);
                var7.field541.method298(class51.field573.field649);
                var7.field541.method315(class139.field1226.field649);
                var7.field541.method297(class215.field1739.field649);
                var7.field541.method315(class295.field2136.field649);
                var7.field541.method269(class189.field1542.field649);
                var7.field541.method269(0);
                var7.field541.method298(class404.field2861.field649);
                var7.field541.method269(class283.field2082.field649);
                var7.field541.method297(class202.field1656.field649);
                var7.field541.method269(class162.field1419.field649);
                var7.field541.method298(class65.field631.field649);
                var7.field541.method297(class34.field491.field649);
                var7.field541.method315(class192.field1578.field649);
                var7.field541.method297(class434.field2958.field649);
                var7.field541.method298(class398.field2811.field649);
                var7.field541.method315(class249.field1902.field649);
                var7.field541.method303(var30, var10, var7.field541.field697);
                var7.field541.method257(var7.field541.field697 - var8);
                field3840.method1359(var7);
                field3840.method1358();
                field3840.field2238 = new class299(var30);
                int[] var12 = new int[4];

                for (int var13 = 0; var13 < 4; ++var13) {
                    var12[var13] = var30[var13] + 50;
                }

                var3.method1401(var12);
                method2457(6);
            }

            int var32;
            if (field3811 == 6 && ((class75) var2).method229() > 0) {
                var28 = ((class75) var2).method231();
                if (var28 == 61) {
                    var32 = ((class75) var2).method229();
                    class4.field21 = var32 == 1 && ((class75) var2).method231() == 1;
                    method2457(5);
                }

                if (var28 == 21 && field3859 == 20) {
                    method2457(12);
                } else if (var28 == 2) {
                    method2457(14);
                } else if (var28 == 15 && field3859 == 40) {
                    field3840.field2241 = -1;
                    method2457(19);
                } else if (var28 == 64) {
                    method2457(10);
                } else if (var28 == 23 && field3841 < 1) {
                    ++field3841;
                    method2457(0);
                } else if (var28 == 29) {
                    method2457(17);
                } else {
                    if (var28 != 69) {
                        class414.method1903(var28);
                        return;
                    }

                    method2457(7);
                }
            }

            if (field3811 == 7 && ((class75) var2).method229() >= 2) {
                ((class75) var2).method228(var3.field695, 0, 2);
                var3.field697 = 0;
                class264.field1951 = var3.method309();
                method2457(8);
            }

            if (field3811 == 8 && ((class75) var2).method229() >= class264.field1951) {
                var3.field697 = 0;
                ((class75) var2).method228(var3.field695, var3.field697, class264.field1951);
                class297 var38 = class297.method1324()[var3.method260()];

                try {
					if (var38.field2149 == 0) {
						class417 var35 = new class417();
						this.field3832 = new class92(var3, var35);
						method2457(9);
					} else {
						throw new IllegalArgumentException();
					}
                } catch (Exception var15) {
                    class414.method1903(22);
                    return;
                }
            }

            if (field3811 == 9 && this.field3832.method360()) {
                this.field3862 = this.field3832.method359();
                this.field3832.method357();
                this.field3832 = null;
                if (this.field3862 == null) {
                    class414.method1903(22);
                    return;
                }

                field3840.method1364();
                var29 = class423.method1945((byte) -1);
                var29.field536 = null;
                var29.field537 = 0;
                var29.field541 = new class320(5000);
                var29.field541.method249(class152.field1315.field1317);
                var29.field541.method290(this.field3862.field697);
                var29.field541.method255(this.field3862);
                field3840.method1359(var29);
                field3840.method1358();
                this.field3862 = null;
                method2457(6);
            }

            if (field3811 == 10 && ((class75) var2).method229() > 0) {
                class305.field2226 = ((class75) var2).method231();
                method2457(11);
            }

            if (field3811 == 11 && ((class75) var2).method229() >= class305.field2226) {
                ((class75) var2).method228(var3.field695, 0, class305.field2226);
                var3.field697 = 0;
                method2457(6);
            }

            if (field3811 == 12 && ((class75) var2).method229() > 0) {
                field3913 = (((class75) var2).method231() + 3) * 60;
                method2457(13);
            }

            if (field3811 == 13) {
                field3790 = 0;
                class500.method2268(class32.field216, class32.field217, field3913 / 60 + class32.field396);
                if (--field3913 <= 0) {
                    method2457(0);
                }

            } else {
                if (field3811 == 14 && ((class75) var2).method229() >= 1) {
                    class145.field1285 = ((class75) var2).method231();
                    method2457(15);
                }

                if (field3811 == 15 && ((class75) var2).method229() >= class145.field1285) {
                    boolean var40 = ((class75) var2).method231() == 1;
                    ((class75) var2).method228(var3.field695, 0, 4);
                    var3.field697 = 0;
                    boolean var39 = false;
                    if (var40) {
                        var32 = var3.method1403() << 24;
                        var32 |= var3.method1403() << 16;
                        var32 |= var3.method1403() << 8;
                        var32 |= var3.method1403();
                        class290.field2121.method2544(class500.field3678, var32);
                    }

                    if (field3829) {
                        class290.field2121.method2539(class500.field3678);
                    } else {
                        class290.field2121.method2539(null);
                    }

                    class532.method2557();
                    field3863 = ((class75) var2).method231();
                    field4071 = ((class75) var2).method231() == 1;
                    field3903 = ((class75) var2).method231();
                    field3903 <<= 8;
                    field3903 += ((class75) var2).method231();
                    field3904 = ((class75) var2).method231();
                    ((class75) var2).method228(var3.field695, 0, 8);
                    var3.field697 = 0;
                    this.field3833 = var3.method265();
                    ((class75) var2).method228(var3.field695, 0, 8);
                    var3.field697 = 0;
                    field3905 = var3.method265();
                    if (field3957 >= 214) {
                        ((class75) var2).method228(var3.field695, 0, 8);
                        var3.field697 = 0;
                        var3.method265();
                    }

                    ((class75) var2).method228(var3.field695, 0, 1);
                    var3.field697 = 0;
                    class464[] var31 = class464.method2125();
                    int var37 = var3.method1407();
                    if (var37 < 0 || var37 >= var31.length) {
                        throw new IOException(var37 + " " + var3.field697);
                    }

                    field3840.field2235 = var31[var37];
                    field3840.field2241 = field3840.field2235.field3309;
                    ((class75) var2).method228(var3.field695, 0, 2);
                    var3.field697 = 0;
                    field3840.field2241 = var3.method309();

                    try {
                        Client var41 = class268.field1973;
                        JSObject.getWindow(var41).call("zap", (Object[]) null);
                    } catch (Throwable var14) {
                    }

                    method2457(16);
                }

                if (field3811 != 16) {
                    if (field3811 == 17 && ((class75) var2).method229() >= 2) {
                        var3.field697 = 0;
                        ((class75) var2).method228(var3.field695, 0, 2);
                        var3.field697 = 0;
                        class485.field3485 = var3.method309();
                        method2457(18);
                    }

                    if (field3811 == 18 && ((class75) var2).method229() >= class485.field3485) {
                        var3.field697 = 0;
                        ((class75) var2).method228(var3.field695, 0, class485.field3485);
                        var3.field697 = 0;
                        String var45 = var3.method268();
                        String var43 = var3.method268();
                        String var36 = var3.method268();
                        class500.method2268(var45, var43, var36);
                        method2459(10);
                        if (field3820.method1076()) {
                            class500.method2256(9);
                        }
                    }

                    if (field3811 == 19) {
                        if (field3840.field2241 == -1) {
                            if (((class75) var2).method229() < 2) {
                                return;
                            }

                            ((class75) var2).method228(var3.field695, 0, 2);
                            var3.field697 = 0;
                            field3840.field2241 = var3.method309();
                        }

                        if (((class75) var2).method229() >= field3840.field2241) {
                            ((class75) var2).method228(var3.field695, 0, field3840.field2241);
                            var3.field697 = 0;
                            var28 = field3840.field2241;
                            field3843.method1252();
                            method2381();
                            class172.method816(var3);
                            if (var3.field697 != var28) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        ++field3790;
                        if (field3790 > 2000) {
                            if (field3841 < 1) {
                                if (class459.field3156 == class155.field1335) {
                                    class155.field1335 = class214.field1737;
                                } else {
                                    class155.field1335 = class459.field3156;
                                }

                                ++field3841;
                                method2457(0);
                            } else {
                                class414.method1903(-3);
                            }
                        }
                    }
                } else {
                    if (((class75) var2).method229() >= field3840.field2241) {
                        var3.field697 = 0;
                        ((class75) var2).method228(var3.field695, 0, field3840.field2241);
                        field3843.method1255();
                        field3838 = -1L;
                        class151.field1306.field742 = 0;
                        class370.field2643 = true;
                        field3794 = true;
                        field4018 = -1L;
                        class15.method41();
                        field3840.method1364();
                        field3840.field2239.field697 = 0;
                        field3840.field2235 = null;
                        field3840.field2240 = null;
                        field3840.field2246 = null;
                        field3840.field2247 = null;
                        field3840.field2241 = 0;
                        field3840.field2245 = 0;
                        field3795 = 0;
                        field3828 = 0;
                        field3853 = 0;
                        method2437();
                        class499.method2254(0);
                        class157.method731();
                        field3940 = 0;
                        field3867 = false;
                        field4030 = 0;
                        field3953 = 0;
                        field3868 = 0;
                        class62.field617 = null;
                        field4028 = 0;
                        field4021 = -1;
                        field4026 = 0;
                        field3949 = 0;
                        field3804 = class295.field2138;
                        field3805 = class295.field2138;
                        field3836 = 0;
                        class172.field1443 = 0;

                        for (var28 = 0; var28 < 2048; ++var28) {
                            class172.field1451[var28] = null;
                            class172.field1441[var28] = class447.field3033;
                        }

                        for (var28 = 0; var28 < 2048; ++var28) {
                            field3948[var28] = null;
                        }

                        for (var28 = 0; var28 < 65536; ++var28) {
                            field3835[var28] = null;
                        }

                        field3914 = -1;
                        field3902.method118();
                        field4045.method118();

                        for (var28 = 0; var28 < 4; ++var28) {
                            for (var32 = 0; var32 < 104; ++var32) {
                                for (int var33 = 0; var33 < 104; ++var33) {
                                    field3915[var28][var32][var33] = null;
                                }
                            }
                        }

                        field3916 = new class43();
                        class153.field1320.method1985();

                        for (var28 = 0; var28 < class397.field2795; ++var28) {
                            class397 var42 = class57.method171(var28);
                            if (null != var42) {
                                class10.field48[var28] = 0;
                                class10.field46[var28] = 0;
                            }
                        }

                        class305.field2233.method915();
                        field3810 = -1;
                        if (field3947 != -1) {
                            class97.method426(field3947);
                        }

                        for (class522 var44 = (class522) field3796.method858(); null != var44; var44 = (class522) field3796.method859()) {
                            method2376(var44, true);
                        }

                        field3947 = -1;
                        field3796 = new class178(8);
                        field3952 = null;
                        method2437();
                        field4061.method154(null, null, new int[]{0, 0, 0, 0, 0}, 0, -1);

                        for (var28 = 0; var28 < 8; ++var28) {
                            field3798[var28] = null;
                            field3912[var28] = false;
                        }

                        class163.method801();
                        field3788 = true;

                        for (var28 = 0; var28 < 100; ++var28) {
                            field3785[var28] = true;
                        }

                        method2361();
                        class527.field4208 = null;
                        class172.field1453 = null;
                        Arrays.fill(field4019, null);
                        class375.field2724 = null;
                        Arrays.fill(field4020, null);

                        for (var28 = 0; var28 < 8; ++var28) {
                            field4053[var28] = new class249();
                        }

                        class252.field1914 = null;
                        field3786 = false;
                        class172.method816(var3);
                        class122.field1097 = -1;
                        method2444(false, var3);
                        field3840.field2235 = null;
                    }

                }
            }
        } catch (IOException var22) {
            if (field3841 < 1) {
                if (class459.field3156 == class155.field1335) {
                    class155.field1335 = class214.field1737;
                } else {
                    class155.field1335 = class459.field3156;
                }

                ++field3841;
                method2457(0);
            } else {
                class414.method1903(-2);
            }
        }
    }

    void method2325() {
        if (field3795 > 1) {
            --field3795;
        }

        if (field3828 > 0) {
            --field3828;
        }

        if (field3842) {
            field3842 = false;
            method2425();
        } else {
            if (!field3888) {
                method2464();
            }

            int var2;
            for (var2 = 0; var2 < 100 && this.method2313(field3840); ++var2) {
            }

            if (field3859 == 30) {
                while (true) {
                    class527 var3 = (class527) class15.field60.method1106();
                    boolean var17;
					var17 = null != var3;

                    int var4;
                    class46 var18;
                    if (!var17) {
                        class46 var19;
                        int var20;
                        if (field3843.field2036) {
                            var19 = class46.method134(class488.field3509, field3840.field2238);
                            var19.field541.method249(0);
                            var20 = var19.field541.field697;
                            field3843.method1257(var19.field541);
                            var19.field541.method258(var19.field541.field697 - var20);
                            field3840.method1359(var19);
                            field3843.method1256();
                        }

                        int var5;
                        int var6;
                        synchronized (class151.field1306.field741) {
                            if (!field3815) {
                                class151.field1306.field742 = 0;
                            } else if (class499.field3645 != 0 || class151.field1306.field742 >= 40) {
                                var18 = null;
                                var4 = 0;
                                var5 = 0;
                                var6 = 0;
                                int var7 = 0;

                                int var8;
                                for (var8 = 0; var8 < class151.field1306.field742 && (null == var18 || var18.field541.field697 - var4 < 246); ++var8) {
                                    var5 = var8;
                                    int var9 = class151.field1306.field744[var8];
                                    if (var9 < -1) {
                                        var9 = -1;
                                    } else if (var9 > 65534) {
                                        var9 = 65534;
                                    }

                                    int var10 = class151.field1306.field743[var8];
                                    if (var10 < -1) {
                                        var10 = -1;
                                    } else if (var10 > 65534) {
                                        var10 = 65534;
                                    }

                                    if (var10 != field3791 || field3792 != var9) {
                                        if (null == var18) {
                                            var18 = class46.method134(class488.field3569, field3840.field2238);
                                            var18.field541.method249(0);
                                            var4 = var18.field541.field697;
                                            class320 var10000 = var18.field541;
                                            var10000.field697 += 2;
                                            var6 = 0;
                                            var7 = 0;
                                        }

                                        int var11;
                                        int var12;
                                        int var13;
                                        if (field3918 != -1L) {
                                            var11 = var10 - field3791;
                                            var12 = var9 - field3792;
                                            var13 = (int) ((class151.field1306.field745[var8] - field3918) / 20L);
                                            var6 = (int) ((long) var6 + (class151.field1306.field745[var8] - field3918) % 20L);
                                        } else {
                                            var11 = var10;
                                            var12 = var9;
                                            var13 = Integer.MAX_VALUE;
                                        }

                                        field3791 = var10;
                                        field3792 = var9;
                                        if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                            var11 += 32;
                                            var12 += 32;
                                            var18.field541.method290((var13 << 12) + (var11 << 6) + var12);
                                        } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                                            var11 += 128;
                                            var12 += 128;
                                            var18.field541.method249(var13 + 128);
                                            var18.field541.method290(var12 + (var11 << 8));
                                        } else if (var13 < 32) {
                                            var18.field541.method249(var13 + 192);
                                            if (var10 != -1 && var9 != -1) {
                                                var18.field541.method315(var10 | var9 << 16);
                                            } else {
                                                var18.field541.method315(Integer.MIN_VALUE);
                                            }
                                        } else {
                                            var18.field541.method290(57344 + (var13 & 8191));
                                            if (var10 != -1 && var9 != -1) {
                                                var18.field541.method315(var10 | var9 << 16);
                                            } else {
                                                var18.field541.method315(Integer.MIN_VALUE);
                                            }
                                        }

                                        ++var7;
                                        field3918 = class151.field1306.field745[var8];
                                    }
                                }

                                if (null != var18) {
                                    var18.field541.method258(var18.field541.field697 - var4);
                                    var8 = var18.field541.field697;
                                    var18.field541.field697 = var4;
                                    var18.field541.method249(var6 / var7);
                                    var18.field541.method249(var6 % var7);
                                    var18.field541.field697 = var8;
                                    field3840.method1359(var18);
                                }

                                if (var5 >= class151.field1306.field742) {
                                    class151.field1306.field742 = 0;
                                } else {
                                    class88 var41 = class151.field1306;
                                    var41.field742 -= var5;
                                    System.arraycopy(class151.field1306.field743, var5, class151.field1306.field743, 0, class151.field1306.field742);
                                    System.arraycopy(class151.field1306.field744, var5, class151.field1306.field744, 0, class151.field1306.field742);
                                    System.arraycopy(class151.field1306.field745, var5, class151.field1306.field745, 0, class151.field1306.field742);
                                }
                            }
                        }

                        class46 var31;
                        if (class499.field3645 == 1 || !class218.field1747 && class499.field3645 == 4 || class499.field3645 == 2) {
                            long var21 = class499.field3635 - field3838;
                            if (var21 > 32767L) {
                                var21 = 32767L;
                            }

                            field3838 = class499.field3635;
                            var4 = class499.field3647;
                            if (var4 < 0) {
                                var4 = 0;
                            } else if (var4 > class519.field4188) {
                                var4 = class519.field4188;
                            }

                            var5 = class499.field3646;
                            if (var5 < 0) {
                                var5 = 0;
                            } else if (var5 > class223.field1763) {
                                var5 = class223.field1763;
                            }

                            var6 = (int) var21;
                            var31 = class46.method134(class488.field3535, field3840.field2238);
                            var31.field541.method290((class499.field3645 == 2 ? 1 : 0) + (var6 << 1));
                            var31.field541.method290(var5);
                            var31.field541.method290(var4);
                            field3840.method1359(var31);
                        }

                        if (field3988 != 0) {
                            var19 = class46.method134(class488.field3583, field3840.field2238);
                            var19.field541.method290(field3988);
                            field3840.method1359(var19);
                        }

                        if (field3923.field1638 > 0) {
                            var19 = class46.method134(class488.field3497, field3840.field2238);
                            var19.field541.method290(0);
                            var20 = var19.field541.field697;
                            long var22 = class206.method982();

                            for (var6 = 0; var6 < field3923.field1638; ++var6) {
                                long var34 = var22 - field4018;
                                if (var34 > 16777215L) {
                                    var34 = 16777215L;
                                }

                                field4018 = var22;
                                var19.field541.method322(field3923.field1637[var6]);
                                var19.field541.method292((int) var34);
                            }

                            var19.field541.method257(var19.field541.field697 - var20);
                            field3840.method1359(var19);
                        }

                        if (field3877 > 0) {
                            --field3877;
                        }

                        if (field3923.method958(96) || field3923.method958(97) || field3923.method958(98) || field3923.method958(99)) {
                            field3878 = true;
                        }

                        if (field3878 && field3877 <= 0) {
                            field3877 = 20;
                            field3878 = false;
                            var19 = class46.method134(class488.field3520, field3840.field2238);
                            var19.field541.method290(field3953);
                            var19.field541.method285(field3814);
                            field3840.method1359(var19);
                        }

                        if (class370.field2643 && !field3794) {
                            field3794 = true;
                            var19 = class46.method134(class488.field3549, field3840.field2238);
                            var19.field541.method249(1);
                            field3840.method1359(var19);
                        }

                        if (!class370.field2643 && field3794) {
                            field3794 = false;
                            var19 = class46.method134(class488.field3549, field3840.field2238);
                            var19.field541.method249(0);
                            field3840.method1359(var19);
                        }

                        if (class466.field3310 != null) {
                            class466.field3310.method432();
                        }

                        if (class115.field1064) {
                            if (null != class527.field4208) {
                                class527.field4208.method70();
                            }

                            for (var2 = 0; var2 < class172.field1443; ++var2) {
                                class283 var23 = field3948[class172.field1444[var2]];
                                var23.method1286();
                            }

                            class115.field1064 = false;
                        }

                        method2476();
                        method2408();
                        if (field3859 != 30) {
                            return;
                        }

                        method2487();
                        class466.method2132();
                        ++field3840.field2245;
                        if (field3840.field2245 > 750) {
                            method2425();
                            return;
                        }

                        var2 = class172.field1443;
                        int[] var24 = class172.field1444;

                        for (var4 = 0; var4 < var2; ++var4) {
                            class283 var25 = field3948[var24[var4]];
                            if (null != var25) {
                                method2454(var25, 1);
                            }
                        }

                        for (var2 = 0; var2 < field3836; ++var2) {
                            var20 = field3774[var2];
                            class424 var26 = field3835[var20];
                            if (null != var26) {
                                method2454(var26, var26.field2920.field2476);
                            }
                        }

                        method2433();
                        ++field3854;
                        if (field4012 != 0) {
                            field3954 += 20;
                            if (field3954 >= 400) {
                                field4012 = 0;
                            }
                        }

                        class97 var32 = class423.field2915;
                        class97 var27 = class390.field2779;
                        class423.field2915 = null;
                        class390.field2779 = null;
                        field3963 = null;
                        field4011 = false;
                        field3964 = false;
                        field4015 = 0;

                        while (field3923.method959() && field4015 < 128) {
                            if (field3863 >= 2 && field3923.method958(82) && field3923.field1648 == 66) {
                                StringBuilder var28 = new StringBuilder();

                                class434 var38;
                                for (Iterator var33 = class157.field1339.iterator(); var33.hasNext(); var28.append(var38.field2957).append('\n')) {
                                    var38 = (class434) var33.next();
                                    if (null != var38.field2952 && !var38.field2952.isEmpty()) {
                                        var28.append(var38.field2952).append(':');
                                    }
                                }

                                String var29 = var28.toString();
                                class268.field1973.method2191(var29);
                            } else if (field3868 != 1 || field3923.field1635 <= 0) {
                                field4017[field4015] = field3923.field1648;
                                field4016[field4015] = field3923.field1635;
                                ++field4015;
                            }
                        }

                        boolean var30 = field3863 >= 2;
                        if (var30 && field3923.method958(82) && field3923.method958(81) && field3988 != 0) {
                            var5 = class180.field1528.field2074 - field3988;
                            if (var5 < 0) {
                                var5 = 0;
                            } else if (var5 > 3) {
                                var5 = 3;
                            }

                            if (var5 != class180.field1528.field2074) {
                                method2375(class357.field2573 + class180.field1528.field4166[0], class5.field28 + class180.field1528.field4163[0], var5, false);
                            }

                            field3988 = 0;
                        }

                        if (class499.field3645 == 1) {
                            field4014.method2123();
                        }

                        if (field3947 != -1) {
                            method2364(field3947, 0, 0, class223.field1763, class519.field4188, 0, 0);
                        }

                        ++field3777;

                        while (true) {
                            class97 var35;
                            class26 var36;
                            class97 var39;
                            do {
                                var36 = (class26) field3976.method120();
                                if (var36 == null) {
                                    while (true) {
                                        do {
                                            var36 = (class26) field3992.method120();
                                            if (null == var36) {
                                                while (true) {
                                                    do {
                                                        var36 = (class26) field3990.method120();
                                                        if (null == var36) {
                                                            while (true) {
                                                                class347 var40 = (class347) field4029.method120();
                                                                if (var40 == null) {
                                                                    this.method2314();
                                                                    method2448();
                                                                    if (field3959 != null) {
                                                                        this.method2319();
                                                                    }

                                                                    if (class158.method763()) {
                                                                        var5 = class158.field1372;
                                                                        var6 = class158.field1373;
                                                                        var31 = class46.method134(class488.field3503, field3840.field2238);
                                                                        var31.field541.method249(5);
                                                                        var31.field541.method285(var5 + class357.field2573);
                                                                        var31.field541.method312(class5.field28 + var6);
                                                                        var31.field541.method296(field3923.method958(82) ? (field3923.method958(81) ? 2 : 1) : 0);
                                                                        field3840.method1359(var31);
                                                                        class158.method786();
                                                                        field3895 = class499.field3646;
                                                                        field3896 = class499.field3647;
                                                                        field4012 = 1;
                                                                        field3954 = 0;
                                                                        field4026 = var5;
                                                                        field3949 = var6;
                                                                    }

                                                                    if (var32 != class423.field2915) {
                                                                        if (null != var32) {
                                                                            method2424(var32);
                                                                        }

                                                                        if (class423.field2915 != null) {
                                                                            method2424(class423.field2915);
                                                                        }
                                                                    }

                                                                    if (class390.field2779 != var27 && field3938 == field3939) {
                                                                        if (null != var27) {
                                                                            method2424(var27);
                                                                        }

                                                                        if (null != class390.field2779) {
                                                                            method2424(class390.field2779);
                                                                        }
                                                                    }

                                                                    if (null != class390.field2779) {
                                                                        if (field3938 < field3939) {
                                                                            ++field3938;
                                                                            if (field3938 == field3939) {
                                                                                method2424(class390.field2779);
                                                                            }
                                                                        }
                                                                    } else if (field3938 > 0) {
                                                                        --field3938;
                                                                    }

                                                                    method2482();
                                                                    if (field4042) {
                                                                        method2389(class24.field130, class305.field2227, class33.field486);
                                                                        class186.method872(class382.field2758, class277.field2027);
                                                                        if (class345.field2506 == class24.field130 && class446.field3027 == class305.field2227 && class360.field2585 == class33.field486 && class214.field1736 == class382.field2758 && class225.field1779 == class277.field2027) {
                                                                            field4042 = false;
                                                                            field4036 = false;
                                                                            field4037 = false;
                                                                            field4038 = false;
                                                                            class316.field2270 = 0;
                                                                            class180.field1525 = 0;
                                                                            class23.field122 = 0;
                                                                            class533.field4246 = 0;
                                                                            class192.field1577 = 0;
                                                                            class499.field3649 = 0;
                                                                            class412.field2900 = 0;
                                                                            class172.field1439 = 0;
                                                                            class533.field4244 = 0;
                                                                            class397.field2799 = 0;
                                                                            field4040 = null;
                                                                            field3857 = null;
                                                                            field3831 = null;
                                                                        }
                                                                    } else if (field4036) {
                                                                        method2398();
                                                                    }

                                                                    for (var5 = 0; var5 < 5; ++var5) {
                                                                        int var10002 = field3993[var5]++;
                                                                    }

                                                                    class305.field2233.method910();
                                                                    var5 = class499.method2255();
                                                                    var6 = class479.field3454.method1354();
                                                                    class46 var37;
                                                                    if (var5 > 15000 && var6 > 15000) {
                                                                        field3828 = 250;
                                                                        class499.method2254(14500);
                                                                        var37 = class46.method134(class488.field3521, field3840.field2238);
                                                                        field3840.method1359(var37);
                                                                    }

                                                                    class153.field1320.method1984();
                                                                    method2406();
                                                                    ++field3840.field2244;
                                                                    if (field3840.field2244 > 50) {
                                                                        var37 = class46.method134(class488.field3537, field3840.field2238);
                                                                        field3840.method1359(var37);
                                                                    }

                                                                    try {
                                                                        field3840.method1358();
                                                                    } catch (IOException var15) {
                                                                        method2425();
                                                                    }

                                                                    return;
                                                                }

                                                                method2411(var40);
                                                            }
                                                        }

                                                        var35 = var36.field138;
                                                        if (var35.field910 < 0) {
                                                            break;
                                                        }

                                                        var39 = class97.method424(var35.field808);
                                                    } while (null == var39 || var39.field923 == null || var35.field910 >= var39.field923.length || var35 != var39.field923[var35.field910]);

                                                    class269.method1200(var36);
                                                }
                                            }

                                            var35 = var36.field138;
                                            if (var35.field910 < 0) {
                                                break;
                                            }

                                            var39 = class97.method424(var35.field808);
                                        } while (null == var39 || var39.field923 == null || var35.field910 >= var39.field923.length || var35 != var39.field923[var35.field910]);

                                        class269.method1200(var36);
                                    }
                                }

                                var35 = var36.field138;
                                if (var35.field910 < 0) {
                                    break;
                                }

                                var39 = class97.method424(var35.field808);
                            } while (null == var39 || null == var39.field923 || var35.field910 >= var39.field923.length || var35 != var39.field923[var35.field910]);

                            class269.method1200(var36);
                        }
                    }

                    var18 = class46.method134(class488.field3501, field3840.field2238);
                    var18.field541.method249(0);
                    var4 = var18.field541.field697;
                    class15.method40(var18.field541);
                    var18.field541.method258(var18.field541.field697 - var4);
                    field3840.method1359(var18);
                }
            }
        }
    }

    @Override
    public void method2591(int var1, int var2) {
        if (null != field3840 && null != field3840.field2238) {
            if (var1 > -1 && class290.field2121.method2529() > 0 && !field4047) {
                class46 var4 = class46.method134(class488.field3590, field3840.field2238);
                var4.field541.method315(var1);
                field3840.method1359(var4);
            }

        }
    }

    @Override
    protected void method2197() {
        field4005 = class206.method982() + 500L;
        this.method2310();
        if (field3947 != -1) {
            this.method2317(true);
        }

    }

    void method2310() {
        int var2 = class223.field1763;
        int var3 = class519.field4188;
        if (super.field3439 < var2) {
            var2 = super.field3439;
        }

        if (super.field3445 < var3) {
            var3 = super.field3445;
        }

        if (class290.field2121 != null) {
            try {
                class271.method1215(class268.field1973, "resize", new Object[]{method2423()});
            } catch (Throwable var5) {
            }
        }

    }

    void method2311() {
        if (field3947 != -1) {
            method2456(field3947);
        }

        int var2;
        for (var2 = 0; var2 < field3946; ++var2) {
            if (field3785[var2]) {
                field3998[var2] = true;
            }

            field3999[var2] = field3785[var2];
            field3785[var2] = false;
        }

        field3996 = field4078;
        field3936 = -1;
        field3937 = -1;
        if (field3947 != -1) {
            field3946 = 0;
            method2350(field3947, 0, 0, class223.field1763, class519.field4188, 0, 0, -1);
        }

        class415.method1908();
        if (field4064) {
            if (field4012 == 1) {
                class128.field1146[field3954 / 100].method1563(field3895 - 8, field3896 - 8);
            }

            if (field4012 == 2) {
                class128.field1146[4 + field3954 / 100].method1563(field3895 - 8, field3896 - 8);
            }
        }

        int var3;
        int var4;
        if (!field3888) {
            if (field3936 != -1) {
                var2 = field3936;
                var3 = field3937;
                if ((field3924 >= 2 || field3940 != 0 || field3867) && field3935) {
                    var4 = field3924 - 1;
                    String var6;
                    if (field3940 == 1 && field3924 < 2) {
                        var6 = class32.field337 + class32.field221 + field3941 + " " + class49.field554;
                    } else if (field3867 && field3924 < 2) {
                        var6 = field3958 + class32.field221 + field3969 + " " + class49.field554;
                    } else {
                        var6 = method2410(var4);
                    }

                    if (field3924 > 2) {
                        var6 = var6 + class49.method140(16777215) + " " + '/' + " " + (field3924 - 2) + class32.field204;
                    }

                    class303.field2170.method947(var6, var2 + 4, var3 + 15, 16777215, 0, field4078 / 1000);
                }
            }
        } else {
            var2 = class264.field1952;
            var3 = class255.field1918;
            var4 = class19.field67;
            int var5 = class462.field3166;
            int var14 = 6116423;
            class415.method1914(var2, var3, var4, var5, 6116423);
            class415.method1914(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class415.method1917(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            class303.field2170.method949(class32.field340, var2 + 3, var3 + 14, 6116423, -1);
            int var7 = class499.field3651;
            int var8 = class499.field3634;

            int var9;
            int var10;
            int var11;
            for (var9 = 0; var9 < field3924; ++var9) {
                var10 = 15 * (field3924 - 1 - var9) + var3 + 31;
                var11 = 16777215;
                if (var7 > var2 && var7 < var4 + var2 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }

                class303.field2170.method949(method2410(var9), var2 + 3, var10, var11, 0);
            }

            var9 = class264.field1952;
            var10 = class255.field1918;
            var11 = class19.field67;
            int var12 = class462.field3166;

            for (int var13 = 0; var13 < field3946; ++var13) {
                if (field4000[var13] + field4002[var13] > var9 && field4000[var13] < var9 + var11 && field4001[var13] + field4003[var13] > var10 && field4001[var13] < var10 + var12) {
                    field3998[var13] = true;
                }
            }
        }

        if (field4004 == 3) {
            for (var2 = 0; var2 < field3946; ++var2) {
                if (field3999[var2]) {
                    class415.method1913(field4000[var2], field4001[var2], field4002[var2], field4003[var2], 16711935, 128);
                } else if (field3998[var2]) {
                    class415.method1913(field4000[var2], field4001[var2], field4002[var2], field4003[var2], 16711680, 128);
                }
            }
        }

        class51.method142(class201.field1651, class180.field1528.field4121, class180.field1528.field4092, field3854);
        field3854 = 0;
    }

    boolean method2329(class306 var1, int var2) {
        if (var1.field2241 == 0) {
            class527.field4208 = null;
        } else {
            if (null == class527.field4208) {
                class527.field4208 = new class174(class492.field3622, class268.field1973);
            }

            class527.field4208.method826(var1.field2239, var2);
        }

        field3982 = field3777;
        class115.field1064 = true;
        var1.field2235 = null;
        return true;
    }

    boolean method2312(class306 var1) {
        if (class527.field4208 != null) {
            class527.field4208.method827(var1.field2239, (byte) -59);
        }

        field3982 = field3777;
        class115.field1064 = true;
        var1.field2235 = null;
        return true;
    }

    boolean method2313(class306 var1) {
        class75 var3 = var1.method1362();
        class320 var4 = var1.field2239;
        if (null == var3) {
            return false;
        } else {
            String var6;
            int var7;
            try {
                int var26;
                if (null == var1.field2235) {
                    if (var1.field2242) {
                        if (!var3.method227(1)) {
                            return false;
                        }

                        var3.method228(var1.field2239.field695, 0, 1);
                        var1.field2245 = 0;
                        var1.field2242 = false;
                    }

                    var4.field697 = 0;
                    if (var4.method1405()) {
                        if (!var3.method227(1)) {
                            return false;
                        }

                        var3.method228(var1.field2239.field695, 1, 1);
                        var1.field2245 = 0;
                    }

                    var1.field2242 = true;
                    class464[] var5 = class464.method2125();
                    var26 = var4.method1407();
                    if (var26 < 0 || var26 >= var5.length) {
                        throw new IOException(var26 + " " + var4.field697);
                    }

                    var1.field2235 = var5[var26];
                    var1.field2241 = var1.field2235.field3309;
                }

                if (var1.field2241 == -1) {
                    if (!var3.method227(1)) {
                        return false;
                    }

                    var1.method1362().method228(var4.field695, 0, 1);
                    var1.field2241 = var4.field695[0] & 255;
                }

                if (var1.field2241 == -2) {
                    if (!var3.method227(2)) {
                        return false;
                    }

                    var1.method1362().method228(var4.field695, 0, 2);
                    var4.field697 = 0;
                    var1.field2241 = var4.method309();
                }

                if (!var3.method227(var1.field2241)) {
                    return false;
                }

                var4.field697 = 0;
                var3.method228(var4.field695, 0, var1.field2241);
                var1.field2245 = 0;
                field3843.method1253();
                var1.field2247 = var1.field2246;
                var1.field2246 = var1.field2240;
                var1.field2240 = var1.field2235;
                if (class464.field3246 == var1.field2235) {
                    class410.field2896 = class427.method1965(var4.method260());
                    var1.field2235 = null;
                    return true;
                }

                int var8;
                int var9;
                int var10;
                int var11;
                int var14;
                int var16;
                int var24;
                int var37;
                int var47;
                if (class464.field3269 == var1.field2235) {
                    var7 = var4.method317();
                    var24 = var7 >> 16;
                    var26 = var7 >> 8 & 255;
                    var8 = var24 + (var7 >> 4 & 7);
                    var9 = (var7 & 7) + var26;
                    var10 = var4.method282();
                    var11 = var10 >> 2;
                    var37 = var10 & 3;
                    var47 = field3960[var11];
                    var14 = var4.method309();
                    if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
                        if (var47 == 0) {
                            class256 var82 = class329.field2414.method752(class201.field1651, var8, var9);
                            if (null != var82) {
                                var16 = class368.method1739(var82.field1925);
                                if (var11 == 2) {
                                    var82.field1926 = new class503(var16, 2, var37 + 4, class201.field1651, var8, var9, var14, false, var82.field1926);
                                    var82.field1924 = new class503(var16, 2, var37 + 1 & 3, class201.field1651, var8, var9, var14, false, var82.field1924);
                                } else {
                                    var82.field1926 = new class503(var16, var11, var37, class201.field1651, var8, var9, var14, false, var82.field1926);
                                }
                            }
                        } else if (var47 == 1) {
                            class224 var81 = class329.field2414.method753(class201.field1651, var8, var9);
                            if (null != var81) {
                                var16 = class368.method1739(var81.field1776);
                                if (var11 != 4 && var11 != 5) {
                                    if (var11 == 6) {
                                        var81.field1773 = new class503(var16, 4, var37 + 4, class201.field1651, var8, var9, var14, false, var81.field1773);
                                    } else if (var11 == 7) {
                                        var81.field1773 = new class503(var16, 4, (var37 + 2 & 3) + 4, class201.field1651, var8, var9, var14, false, var81.field1773);
                                    } else if (var11 == 8) {
                                        var81.field1773 = new class503(var16, 4, var37 + 4, class201.field1651, var8, var9, var14, false, var81.field1773);
                                        var81.field1774 = new class503(var16, 4, 4 + (var37 + 2 & 3), class201.field1651, var8, var9, var14, false, var81.field1774);
                                    }
                                } else {
                                    var81.field1773 = new class503(var16, 4, var37, class201.field1651, var8, var9, var14, false, var81.field1773);
                                }
                            }
                        } else if (var47 == 2) {
                            class325 var78 = class329.field2414.method790(class201.field1651, var8, var9);
                            if (var11 == 11) {
                                var11 = 10;
                            }

                            if (null != var78) {
                                var78.field2358 = new class503(class368.method1739(var78.field2363), var11, var37, class201.field1651, var8, var9, var14, false, var78.field2358);
                            }
                        } else if (var47 == 3) {
                            class294 var80 = class329.field2414.method777(class201.field1651, var8, var9);
                            if (null != var80) {
                                var80.field2132 = new class503(class368.method1739(var80.field2131), 22, var37, class201.field1651, var8, var9, var14, false, var80.field2132);
                            }
                        }
                    }

                    var1.field2235 = null;
                    return true;
                }

                class97 var86;
                if (var1.field2235 == class464.field3243) {
                    var24 = var4.method264();
                    var86 = class97.method424(var24);
                    var86.field833 = 3;
                    var86.field834 = class180.field1528.field2054.method152();
                    method2424(var86);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3305) {
                    field4042 = false;
                    field4036 = false;
                    field4037 = false;
                    field4038 = false;
                    class316.field2270 = 0;
                    class180.field1525 = 0;
                    class23.field122 = 0;
                    field4039 = false;
                    class533.field4246 = 0;
                    class192.field1577 = 0;
                    class499.field3649 = 0;
                    class412.field2900 = 0;
                    class172.field1439 = 0;
                    class533.field4244 = 0;
                    class397.field2799 = 0;
                    field4040 = null;
                    field3857 = null;
                    field3831 = null;

                    for (var24 = 0; var24 < 5; ++var24) {
                        field4043[var24] = false;
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3237 == var1.field2235) {
                    class360.field2584 = null;
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3270) {
                    var24 = var4.method264();
                    var26 = var4.method264();
                    var7 = class479.method2224();
                    class46 var84 = class46.method134(class488.field3579, field3840.field2238);
                    var84.field541.method249(class479.field3431);
                    var84.field541.method269(var24);
                    var84.field541.method298(var26);
                    var84.field541.method280(var7);
                    field3840.method1359(var84);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3206) {
                    method2390();
                    field4062 = var4.method262();
                    field3827 = field3777;
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3256 == var1.field2235) {
                    class137.method622(class378.field2733);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3192) {
                    var24 = var4.method287();
                    class163.method796(var24);
                    field3974[++field3975 - 1 & 31] = var24 & 32767;
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3298) {
                    class137.method622(class378.field2737);
                    var1.field2235 = null;
                    return true;
                }

                boolean var12;
                byte var23;
                long var33;
                long var42;
                long var50;
                String var54;
                int var75;
                if (class464.field3286 == var1.field2235) {
                    var23 = var4.method261();
                    var50 = var4.method309();
                    var33 = var4.method316();
                    var42 = (var50 << 32) + var33;
                    var12 = false;
                    class315 var73 = var23 >= 0 ? field4020[var23] : class375.field2724;
                    if (null == var73) {
                        var12 = true;
                    } else {
                        for (var14 = 0; var14 < 100; ++var14) {
                            if (field3921[var14] == var42) {
                                var12 = true;
                                break;
                            }
                        }
                    }

                    if (!var12) {
                        field3921[field3783] = var42;
                        field3783 = (1 + field3783) % 100;
                        var54 = class385.method1782(var4);
                        var75 = var23 >= 0 ? 43 : 46;
                        class157.method736(var75, "", var54, var73.field2266);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3216) {
                    class172.method817(var4, var1.field2241);
                    class77.method245();
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3229 == var1.field2235) {
                    field4036 = true;
                    field4042 = false;
                    field4038 = true;
                    class316.field2270 = var4.method260();
                    class180.field1525 = var4.method260();
                    class23.field122 = var4.method309();
                    var24 = var4.method309();
                    var26 = var4.method260();
                    var7 = 64 + class316.field2270 * 128;
                    var8 = 64 + class180.field1525 * 128;
                    var9 = method2342(var7, var8, class201.field1651) - class23.field122;
                    var10 = var7 - class345.field2506;
                    var11 = var9 - class446.field3027;
                    var37 = var8 - class360.field2585;
                    double var71 = Math.sqrt(var37 * var37 + var10 * var10);
                    var75 = method2377((int) (Math.atan2(var11, var71) * 325.9490051269531D) & 2047);
                    var16 = method2336((int) (Math.atan2(var10, var37) * -325.9490051269531D) & 2047);
                    field3857 = new class235(class214.field1736, var75, var24, var26);
                    field3831 = new class235(class225.field1779, var16, var24, var26);
                    var1.field2235 = null;
                    return true;
                }

                long var53;
                class522 var79;
                if (var1.field2235 == class464.field3278) {
                    var24 = var1.field2241 + var4.field697;
                    var26 = var4.method309();
                    if (var26 == 65535) {
                        var26 = -1;
                    }

                    var7 = var4.method309();
                    if (field3947 != var26) {
                        field3947 = var26;
                        this.method2317(false);
                        method2333(field3947);
                        class269.method1193(field3947);

                        for (var8 = 0; var8 < 100; ++var8) {
                            field3785[var8] = true;
                        }
                    }

                    class522 var70;
                    for (; var7-- > 0; var70.field4201 = true) {
                        var8 = var4.method264();
                        var9 = var4.method309();
                        var10 = var4.method260();
                        var70 = (class522) field3796.method857(var8);
                        if (null != var70 && var9 != var70.field4202) {
                            method2376(var70, true);
                            var70 = null;
                        }

                        if (var70 == null) {
                            var70 = method2461(var8, var9, var10);
                        }
                    }

                    for (var79 = (class522) field3796.method858(); var79 != null; var79 = (class522) field3796.method859()) {
                        if (var79.field4201) {
                            var79.field4201 = false;
                        } else {
                            method2376(var79, true);
                        }
                    }

                    field3994 = new class178(512);

                    while (var4.field697 < var24) {
                        var8 = var4.method264();
                        var9 = var4.method309();
                        var10 = var4.method309();
                        var11 = var4.method264();

                        for (var37 = var9; var37 <= var10; ++var37) {
                            var53 = ((long) var8 << 32) + (long) var37;
                            field3994.method860(new class170(var11), var53);
                        }
                    }

                    var1.field2235 = null;
                    return true;
                }

                class97 var66;
                if (var1.field2235 == class464.field3295) {
                    var24 = var4.method264();
                    var26 = var4.method305();
                    class522 var89 = (class522) field3796.method857(var26);
                    var79 = (class522) field3796.method857(var24);
                    if (null != var79) {
                        method2376(var79, var89 == null || var79.field4202 != var89.field4202);
                    }

                    if (null != var89) {
                        var89.method221();
                        field3796.method860(var89, var24);
                    }

                    var66 = class97.method424(var26);
                    if (var66 != null) {
                        method2424(var66);
                    }

                    var66 = class97.method424(var24);
                    if (var66 != null) {
                        method2424(var66);
                        method2363(class46.field542[var66.field791 >>> 16], var66, true);
                    }

                    if (field3947 != -1) {
                        method2474(field3947, 1);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3250) {
                    class486.method2236();
                    var23 = var4.method261();
                    if (var1.field2241 == 1) {
                        if (var23 >= 0) {
                            field4019[var23] = null;
                        } else {
                            class172.field1453 = null;
                        }

                        var1.field2235 = null;
                        return true;
                    }

                    if (var23 >= 0) {
                        field4019[var23] = new class133(var4);
                    } else {
                        class172.field1453 = new class133(var4);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3263) {
                    var24 = var4.method264();
                    class522 var91 = (class522) field3796.method857(var24);
                    if (null != var91) {
                        method2376(var91, true);
                    }

                    if (null != field3952) {
                        method2424(field3952);
                        field3952 = null;
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3285) {
                    var10 = var4.method309();
                    var7 = var4.method317();
                    var24 = var7 >> 16;
                    var26 = var7 >> 8 & 255;
                    var8 = var24 + (var7 >> 4 & 7);
                    var9 = var26 + (var7 & 7);
                    var11 = var4.method281();
                    var37 = var4.method288();
                    if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                        var8 = 64 + var8 * 128;
                        var9 = var9 * 128 + 64;
                        class83 var62 = new class83(var10, class201.field1651, var8, var9, method2342(var8, var9, class201.field1651) - var11, var37, field4078);
                        field4045.method126(var62);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3282 == var1.field2235) {
                    field3984 = field3777;
                    var23 = var4.method261();
                    if (var1.field2241 == 1) {
                        if (var23 >= 0) {
                            field4020[var23] = null;
                        } else {
                            class375.field2724 = null;
                        }

                        var1.field2235 = null;
                        return true;
                    }

                    if (var23 >= 0) {
                        field4020[var23] = new class315(var4);
                    } else {
                        class375.field2724 = new class315(var4);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3197) {
                    class137.method622(class378.field2742);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3293) {
                    class137.method622(class378.field2743);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3301) {
                    var24 = var4.method287();
                    var26 = var4.method282();
                    if (var24 == 65535) {
                        var24 = -1;
                    }

                    method2493(class180.field1528, var24, var26);
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3306 == var1.field2235) {
                    method2444(true, var1.field2239);
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3226 == var1.field2235) {
                    if (field3947 != -1) {
                        method2474(field3947, 0);
                    }

                    var1.field2235 = null;
                    return true;
                }

                class97 var35;
                if (var1.field2235 == class464.field3218) {
                    var24 = var4.method300();
                    var26 = var4.method289();
                    var7 = var4.method288();
                    var35 = class97.method424(var24);
                    var35.field882 = (var26 << 16) + var7;
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3275 == var1.field2235) {
                    field4028 = var4.method260();
                    var1.field2235 = null;
                    return true;
                }

                int var17;
                String var68;
                if (class464.field3287 == var1.field2235) {
                    var23 = var4.method261();
                    var6 = var4.method268();
                    long var87 = var4.method309();
                    long var72 = var4.method316();
                    class41 var63 = (class41) class27.method80(class41.method116(), var4.method260());
                    long var51 = (var87 << 32) + var72;
                    boolean var57 = false;
                    class315 var76 = null;
                    var76 = var23 >= 0 ? field4020[var23] : class375.field2724;
                    if (null == var76) {
                        var57 = true;
                    } else {
                        var16 = 0;

                        while (true) {
                            if (var16 >= 100) {
                                if (var63.field509 && class153.field1320.method1987(new class358(var6, class492.field3622))) {
                                    var57 = true;
                                }
                                break;
                            }

                            if (field3921[var16] == var51) {
                                var57 = true;
                                break;
                            }

                            ++var16;
                        }
                    }

                    if (!var57) {
                        field3921[field3783] = var51;
                        field3783 = (1 + field3783) % 100;
                        var68 = class197.method934(class385.method1782(var4));
                        var17 = var23 >= 0 ? 41 : 44;
                        if (var63.field524 != -1) {
                            class157.method736(var17, class471.method2176(var63.field524) + var6, var68, var76.field2266);
                        } else {
                            class157.method736(var17, var6, var68, var76.field2266);
                        }
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3268 == var1.field2235) {
                    var4.field697 += 28;
                    if (var4.method279()) {
                        method2348(var4, var4.field697 - 28);
                    }

                    var1.field2235 = null;
                    return true;
                }

                String var29;
                if (class464.field3281 == var1.field2235) {
                    var29 = var4.method268();
                    var26 = var4.method281();
                    var7 = var4.method282();
                    if (var7 >= 1 && var7 <= 8) {
                        if (var29.equalsIgnoreCase(class32.field483)) {
                            var29 = null;
                        }

                        field3798[var7 - 1] = var29;
                        field3912[var7 - 1] = var26 == 0;
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3234) {
                    var24 = var4.method309();
                    if (var24 == 65535) {
                        var24 = -1;
                    }

                    method2449(var24);
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3266 == var1.field2235) {
                    var24 = var4.method289();
                    if (var24 == 65535) {
                        var24 = -1;
                    }

                    var26 = var4.method313();
                    method2362(var24, var26);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3189) {
                    method2491();
                    var1.field2235 = null;
                    return false;
                }

                if (var1.field2235 == class464.field3280) {
                    var24 = var4.method299();
                    var26 = var4.method282();
                    var7 = var4.method289();
                    var79 = (class522) field3796.method857(var24);
                    if (var79 != null) {
                        method2376(var79, var7 != var79.field4202);
                    }

                    method2461(var24, var7, var26);
                    var1.field2235 = null;
                    return true;
                }

                class97 var30;
                boolean var58;
                if (class464.field3258 == var1.field2235) {
                    var58 = var4.method320() == 1;
                    var26 = var4.method264();
                    var30 = class97.method424(var26);
                    if (var58 != var30.field809) {
                        var30.field809 = var58;
                        method2424(var30);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3190) {
                    var24 = var4.method289();
                    var26 = var4.method309();
                    var7 = var4.method300();
                    var8 = var4.method309();
                    var66 = class97.method424(var7);
                    if (var8 != var66.field841 || var66.field859 != var24 || var26 != var66.field844) {
                        var66.field841 = var8;
                        var66.field859 = var24;
                        var66.field844 = var26;
                        method2424(var66);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3191 == var1.field2235) {
                    var24 = var4.method288();
                    var26 = var4.method299();
                    var30 = class97.method424(var26);
                    if (var30.field833 != 1 || var30.field834 != var24) {
                        var30.field833 = 1;
                        var30.field834 = var24;
                        method2424(var30);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3186) {
                    class137.method622(class378.field2739);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3231) {
                    var9 = var4.method288();
                    var7 = var4.method287();
                    var8 = var4.method287();
                    var24 = var4.method289();
                    var26 = var4.method289();
                    if (var24 == 65535) {
                        var24 = -1;
                    }

                    ArrayList<Integer> var69 = new ArrayList<Integer>();
                    var69.add(var24);
                    class165.method807(var69, var26, var7, var8, var9);
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3207 == var1.field2235) {
                    class137.method622(class378.field2732);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3205) {
                    class153.field1320.method1983();
                    field3981 = field3777;
                    var1.field2235 = null;
                    return true;
                }

                String var55;
                if (var1.field2235 == class464.field3236) {
                    byte[] var92 = new byte[var1.field2241];
                    var4.method1406(var92, 0, var92.length);
                    class78 var88 = new class78(var92);
                    var55 = var88.method268();
                    class33.method96(var55, true, false);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3265) {
                    class137 var90 = new class137();
                    var90.field1217 = var4.method268();
                    var90.field1214 = var4.method309();
                    var26 = var4.method264();
                    var90.field1210 = var26;
                    if (var90.method620()) {
                        var90.field1221 = "beta";
                    }

                    method2459(45);
                    var3.method232();
                    var3 = null;
                    class4.method3(var90);
                    var1.field2235 = null;
                    return false;
                }

                if (var1.field2235 == class464.field3251) {
                    field3795 = var4.method288() * 30;
                    field3827 = field3777;
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3193 == var1.field2235) {
                    var24 = var4.method309();
                    if (var24 == 65535) {
                        var24 = -1;
                    }

                    field3947 = var24;
                    this.method2317(false);
                    method2333(var24);
                    class269.method1193(field3947);

                    for (var26 = 0; var26 < 100; ++var26) {
                        field3785[var26] = true;
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3292 == var1.field2235) {
                    field4036 = true;
                    field4042 = false;
                    field4037 = true;
                    class172.field1439 = var4.method260();
                    class533.field4244 = var4.method260();
                    var24 = var4.method309();
                    var26 = var4.method309();
                    field4039 = var4.method267();
                    var7 = var4.method260();
                    var8 = class172.field1439 * 128 + 64;
                    var9 = 64 + class533.field4244 * 128;
                    boolean var59 = false;
                    boolean var56 = false;
                    if (field4039) {
                        var10 = class446.field3027;
                        var11 = method2342(var8, var9, class201.field1651) - var24;
                    } else {
                        var10 = method2342(class345.field2506, class360.field2585, class201.field1651) - class446.field3027;
                        var11 = var24;
                    }

                    field4040 = new class507(class345.field2506, class360.field2585, var10, var8, var9, var11, var26, var7);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3252) {
                    method2444(false, var1.field2239);
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3291 == var1.field2235) {
                    var24 = var4.method305();
                    var86 = class97.method424(var24);

                    for (var7 = 0; var7 < var86.field917.length; ++var7) {
                        var86.field917[var7] = -1;
                        var86.field917[var7] = 0;
                    }

                    method2424(var86);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3259) {
                    var24 = var4.method287();
                    var26 = var4.method305();
                    var30 = class97.method424(var26);
                    if (var30 != null && var30.field793 == 0) {
                        if (var24 > var30.field813 - var30.field783) {
                            var24 = var30.field813 - var30.field783;
                        }

                        if (var24 < 0) {
                            var24 = 0;
                        }

                        if (var30.field824 != var24) {
                            var30.field824 = var24;
                            method2424(var30);
                        }
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3279) {
                    field4009 = var4.method260();
                    field4008 = var4.method281();
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3273 == var1.field2235) {
                    field4036 = true;
                    field4042 = false;
                    field4038 = false;
                    class316.field2270 = var4.method260();
                    class180.field1525 = var4.method260();
                    class23.field122 = var4.method309();
                    class533.field4246 = var4.method260();
                    class192.field1577 = var4.method260();
                    if (class192.field1577 >= 100) {
                        var24 = 64 + class316.field2270 * 128;
                        var26 = 64 + class180.field1525 * 128;
                        var7 = method2342(var24, var26, class201.field1651) - class23.field122;
                        var8 = var24 - class345.field2506;
                        var9 = var7 - class446.field3027;
                        var10 = var26 - class360.field2585;
                        var11 = (int) Math.sqrt(var10 * var10 + var8 * var8);
                        class214.field1736 = (int) (Math.atan2(var9, var11) * 325.9490051269531D) & 2047;
                        class225.field1779 = (int) (Math.atan2(var8, var10) * -325.9490051269531D) & 2047;
                        if (class214.field1736 < 128) {
                            class214.field1736 = 128;
                        }

                        if (class214.field1736 > 383) {
                            class214.field1736 = 383;
                        }
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3235) {
                    return this.method2329(var1, 1);
                }

                if (var1.field2235 == class464.field3244) {
                    field3853 = var4.method260();
                    if (field3853 == 1) {
                        field3797 = var4.method309();
                    }

                    if (field3853 >= 2 && field3853 <= 6) {
                        if (field3853 == 2) {
                            field3962 = 64;
                            field3995 = 64;
                        }

                        if (field3853 == 3) {
                            field3962 = 0;
                            field3995 = 64;
                        }

                        if (field3853 == 4) {
                            field3962 = 128;
                            field3995 = 64;
                        }

                        if (field3853 == 5) {
                            field3962 = 64;
                            field3995 = 0;
                        }

                        if (field3853 == 6) {
                            field3962 = 64;
                            field3995 = 128;
                        }

                        field3853 = 2;
                        field3799 = var4.method309();
                        field3942 = var4.method309();
                        field3806 = var4.method260();
                    }

                    if (field3853 == 10) {
                        field3816 = var4.method309();
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3202) {
                    class486.method2236();
                    var23 = var4.method261();
                    class423 var85 = new class423(var4);
                    class133 var83;
                    if (var23 >= 0) {
                        var83 = field4019[var23];
                    } else {
                        var83 = class172.field1453;
                    }

                    if (null == var83) {
                        this.method2320(var23);
                        var1.field2235 = null;
                        return true;
                    }

                    if (var85.field2916 > var83.field1178) {
                        this.method2320(var23);
                        var1.field2235 = null;
                        return true;
                    }

                    if (var85.field2916 < var83.field1178) {
                        var1.field2235 = null;
                        return true;
                    }

                    var85.method1943(var83);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3297) {
                    class137.method622(class378.field2738);
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3221 == var1.field2235) {
                    var24 = var4.method263();
                    var26 = var4.method264();
                    var7 = var4.method262();
                    var35 = class97.method424(var26);
                    if (var35.field800 != var7 || var35.field801 != var24 || var35.field796 != 0 || var35.field797 != 0) {
                        var35.field800 = var7;
                        var35.field801 = var24;
                        var35.field796 = 0;
                        var35.field797 = 0;
                        method2424(var35);
                        this.method2318(var35);
                        if (var35.field793 == 0) {
                            method2363(class46.field542[var26 >> 16], var35, false);
                        }
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3296 == var1.field2235) {
                    var24 = var4.method300();
                    var26 = var4.method299();
                    var30 = class97.method424(var26);
                    class97.method420(var30, var24);
                    method2424(var30);
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3262 == var1.field2235) {
                    var24 = var4.method309();
                    var26 = var4.method305();
                    var30 = class97.method424(var26);
                    if (var30.field833 != 6 || var24 != var30.field834) {
                        var30.field833 = 6;
                        var30.field834 = var24;
                        method2424(var30);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3188 == var1.field2235) {
                    byte var52 = var4.method275();
                    var75 = var4.method320() * 4;
                    byte var49 = var4.method275();
                    var47 = var4.method288();
                    var37 = var4.method306();
                    var17 = var4.method287();
                    var14 = var4.method281() * 4;
                    var16 = var4.method289();
                    var7 = var4.method317();
                    var24 = var7 >> 16;
                    var26 = var7 >> 8 & 255;
                    var8 = var24 + (var7 >> 4 & 7);
                    var9 = var26 + (var7 & 7);
                    int var19 = var4.method260();
                    int var18 = var4.method282();
                    var10 = var52 + var8;
                    var11 = var49 + var9;
                    if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var47 != 65535) {
                        var8 = var8 * 128 + 64;
                        var9 = 64 + var9 * 128;
                        var10 = var10 * 128 + 64;
                        var11 = 64 + var11 * 128;
                        class143 var20 = new class143(var47, class201.field1651, var8, var9, method2342(var8, var9, class201.field1651) - var14, var16 + field4078, field4078 + var17, var18, var19, var37, var75);
                        var20.method658(var10, var11, method2342(var10, var11, class201.field1651) - var75, var16 + field4078);
                        field3902.method126(var20);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3271) {
                    class360.field2584 = new class12(class238.field1834);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3242) {
                    class51.field557 = var4.method320();
                    class518.field4181 = var4.method282();
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3304 == var1.field2235) {
                    for (var24 = 0; var24 < field3948.length; ++var24) {
                        if (field3948[var24] != null) {
                            field3948[var24].field4136 = -1;
                        }
                    }

                    for (var24 = 0; var24 < field3835.length; ++var24) {
                        if (field3835[var24] != null) {
                            field3835[var24].field4136 = -1;
                        }
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3230) {
                    method2438(false, var4);
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3223 == var1.field2235) {
                    class15.method38(var4, var1.field2241);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3198) {
                    method2438(true, var4);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3224) {
                    var24 = var4.method281();
                    var26 = var4.method281();
                    var7 = var4.method305();
                    var35 = class97.method424(var7);
                    class97.method423(var35, var26, var24);
                    method2424(var35);
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3240 == var1.field2235) {
                    var26 = var4.method309();
                    var24 = var4.method287();
                    class443.method2021(var24, var26);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3289) {
                    var58 = var4.method267();
                    if (var58) {
                        if (null == class62.field617) {
                            class62.field617 = new class349();
                        }
                    } else {
                        class62.field617 = null;
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3260) {
                    field4036 = true;
                    field4042 = false;
                    field4038 = true;
                    var24 = method2336(var4.method262() & 2027);
                    var26 = method2377(var4.method262() & 2027);
                    var7 = var4.method309();
                    var8 = var4.method260();
                    field3857 = new class235(class214.field1736, var26, var7, var8);
                    field3831 = new class235(class225.field1779, var24, var7, var8);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3222) {
                    return this.method2312(var1);
                }

                if (class464.field3201 == var1.field2235) {
                    class137.method622(class378.field2734);
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3211 == var1.field2235) {
                    var24 = var4.method299();
                    var26 = var4.method309();
                    if (var26 == 65535) {
                        var26 = -1;
                    }

                    var7 = var4.method300();
                    var8 = var4.method289();
                    if (var8 == 65535) {
                        var8 = -1;
                    }

                    for (var9 = var8; var9 <= var26; ++var9) {
                        var42 = ((long) var7 << 32) + (long) var9;
                        class70 var48 = field3994.method857(var42);
                        if (var48 != null) {
                            var48.method221();
                        }

                        field3994.method860(new class170(var24), var42);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3227 == var1.field2235) {
                    var8 = var4.method288();
                    var26 = var4.method289();
                    if (var26 == 65535) {
                        var26 = -1;
                    }

                    var9 = var4.method289();
                    var7 = var4.method287();
                    var10 = var4.method287();
                    var24 = var4.method288();
                    if (var24 == 65535) {
                        var24 = -1;
                    }

                    ArrayList<Integer> var43 = new ArrayList<>();
                    var43.add(var24);
                    var43.add(var26);
                    class165.method807(var43, var7, var8, var9, var10);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3232) {
                    method2390();
                    var24 = var4.method282();
                    var26 = var4.method281();
                    var7 = var4.method305();
                    field4070[var26] = var7;
                    field3919[var26] = var24;
                    field4067[var26] = 1;

                    for (var8 = 0; var8 < 98; ++var8) {
                        if (var7 >= class339.field2452[var8]) {
                            field4067[var26] = var8 + 2;
                        }
                    }

                    field3899[++field3977 - 1 & 31] = var26;
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3294) {
                    var24 = var4.method309();
                    var26 = var4.method260();
                    var7 = var4.method309();
                    method2346(var24, var26, var7);
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3248 == var1.field2235) {
                    var24 = var4.method260();
                    var26 = var4.method300();
                    var30 = class97.method424(var26);
                    class97.method425(var30, class180.field1528.field2054.field578, var24);
                    method2424(var30);
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3217 == var1.field2235) {
                    var24 = var4.method300();
                    var26 = var4.method309();
                    var30 = class97.method424(var24);
                    if (var30.field833 != 2 || var30.field834 != var26) {
                        var30.field833 = 2;
                        var30.field834 = var26;
                        method2424(var30);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3187) {
                    var24 = var4.method260();
                    class443.method2020(var24);
                    var1.field2235 = null;
                    return false;
                }

                if (var1.field2235 == class464.field3203) {
                    method2390();
                    field3892 = var4.method309();
                    field3827 = field3777;
                    var1.field2235 = null;
                    return true;
                }

                boolean var60;
                if (var1.field2235 == class464.field3299) {
                    var24 = var4.method300();
                    var60 = var4.method260() == 1;
                    var30 = class97.method424(var24);
                    class54.method161(var30, class180.field1528.field2054, var60);
                    method2424(var30);
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3228 == var1.field2235) {
                    var23 = var4.method283();
                    var26 = var4.method288();
                    class10.field48[var26] = var23;
                    if (class10.field46[var26] != var23) {
                        class10.field46[var26] = var23;
                    }

                    method2446(var26);
                    field3972[++field3973 - 1 & 31] = var26;
                    var1.field2235 = null;
                    return true;
                }

                boolean var13;
                if (class464.field3209 == var1.field2235) {
                    var29 = var4.method268();
                    var50 = var4.method309();
                    var33 = var4.method316();
                    class41 var44 = (class41) class27.method80(class41.method116(), var4.method260());
                    long var40 = (var50 << 32) + var33;
                    var13 = false;

                    for (var14 = 0; var14 < 100; ++var14) {
                        if (var40 == field3921[var14]) {
                            var13 = true;
                            break;
                        }
                    }

                    if (class153.field1320.method1987(new class358(var29, class492.field3622))) {
                        var13 = true;
                    }

                    if (!var13 && field3900 == 0) {
                        field3921[field3783] = var40;
                        field3783 = (field3783 + 1) % 100;
                        var54 = class197.method934(class95.method365(class385.method1782(var4)));
                        byte var64;
                        if (var44.field525) {
                            var64 = 7;
                        } else {
                            var64 = 3;
                        }

                        if (var44.field524 != -1) {
                            class157.method729(var64, class471.method2176(var44.field524) + var29, var54);
                        } else {
                            class157.method729(var64, var29, var54);
                        }
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3233 == var1.field2235) {
                    if (null == class360.field2584) {
                        class360.field2584 = new class12(class238.field1834);
                    }

                    class2 var77 = class238.field1834.method101(var4);
                    class360.field2584.field54.method715(var77.field2, var77.field1);
                    field4041[++field3906 - 1 & 31] = var77.field2;
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3247) {
                    var1.field2235 = null;
                    return true;
                }

                class424 var41;
                if (var1.field2235 == class464.field3212) {
                    short var74 = (short) var4.method263();
                    var26 = var4.method260();
                    var7 = var4.method309();
                    var8 = var4.method299();
                    var41 = field3835[var7];
                    if (null != var41) {
                        var41.method1964(var26, var8, var74);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3225 == var1.field2235) {
                    var24 = var4.method264();
                    if (field3875 != var24) {
                        field3875 = var24;
                        method2436();
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3257 == var1.field2235) {
                    for (var24 = 0; var24 < class397.field2795; ++var24) {
                        class397 var67 = class57.method171(var24);
                        if (var67 != null) {
                            class10.field48[var24] = 0;
                            class10.field46[var24] = 0;
                        }
                    }

                    method2390();
                    field3973 += 32;
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3276) {
                    var29 = var4.method268();
                    Object[] var61 = new Object[var29.length() + 1];

                    for (var7 = var29.length() - 1; var7 >= 0; --var7) {
                        if (var29.charAt(var7) == 's') {
                            var61[var7 + 1] = var4.method268();
                        } else {
                            var61[var7 + 1] = Integer.valueOf(var4.method264());
                        }
                    }

                    var61[0] = Integer.valueOf(var4.method264());
                    class26 var65 = new class26();
                    var65.field141 = var61;
                    class269.method1200(var65);
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3264 == var1.field2235) {
                    var29 = var4.method268();
                    var6 = class197.method934(class95.method365(class385.method1782(var4)));
                    class157.method729(6, var29, var6);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3185) {
                    class153.field1320.field2962.method163(var4, var1.field2241);
                    method2483();
                    field3981 = field3777;
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3208) {
                    var24 = var4.method307();
                    var60 = var4.method260() == 1;
                    var55 = "";
                    boolean var39 = false;
                    if (var60) {
                        var55 = var4.method268();
                        if (class153.field1320.method1987(new class358(var55, class492.field3622))) {
                            var39 = true;
                        }
                    }

                    String var45 = var4.method268();
                    if (!var39) {
                        class157.method729(var24, var55, var45);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3267) {
                    var58 = var4.method260() == 1;
                    if (var58) {
                        class245.field1887 = class206.method982() - var4.method265();
                        class252.field1914 = new class188(var4, true);
                    } else {
                        class252.field1914 = null;
                    }

                    field3846 = field3777;
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3245 == var1.field2235) {
                    var24 = var4.method288();
                    var41 = field3835[var24];
                    var8 = var4.method281();
                    var7 = var4.method288();
                    var26 = var4.method299();
                    if (var41 != null) {
                        var41.method2504(var8, var7, var26 >> 16, var26 & 65535);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3249) {
                    var24 = var4.method287();
                    if (var24 == 65535) {
                        var24 = -1;
                    }

                    var26 = var4.method264();
                    var7 = var4.method300();
                    var35 = class97.method424(var26);
                    class508 var36;
                    if (!var35.field871) {
                        if (var24 == -1) {
                            var35.field833 = 0;
                            var1.field2235 = null;
                            return true;
                        }

                        var36 = class508.method2299(var24).method2285(var7);
                        var35.field833 = 4;
                        var35.field834 = var24;
                        var35.field841 = var36.field3712;
                        var35.field859 = var36.field3728;
                        var35.field844 = var36.field3735 * 100 / var7;
                        method2424(var35);
                    } else {
                        var35.field919 = var24;
                        var35.field920 = var7;
                        var36 = class508.method2299(var24).method2285(var7);
                        var35.field841 = var36.field3712;
                        var35.field859 = var36.field3728;
                        var35.field906 = var36.field3714;
                        var35.field839 = var36.field3713;
                        var35.field913 = var36.field3730;
                        var35.field844 = var36.field3735;
                        if (var36.field3731 == 1) {
                            var35.field850 = 1;
                        } else {
                            var35.field850 = 2;
                        }

                        if (var35.field845 > 0) {
                            var35.field844 = var35.field844 * 32 / var35.field845;
                        } else if (var35.field802 > 0) {
                            var35.field844 = var35.field844 * 32 / var35.field802;
                        }

                        method2424(var35);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3220 == var1.field2235) {
                    var26 = var4.method289();
                    var7 = var4.method281();
                    var24 = var4.method287();
                    if (var26 == 65535) {
                        var26 = -1;
                    }

                    class424 var34 = field3835[var24];
                    if (null != var34) {
                        if (var34.field4136 == var26 && var26 != -1) {
                            var9 = class124.method575(var26).field1139;
                            if (var9 == 1) {
                                var34.field4137 = 0;
                                var34.field4138 = 0;
                                var34.field4153 = var7;
                                var34.field4118 = 0;
                            } else if (var9 == 2) {
                                var34.field4118 = 0;
                            }
                        } else if (var26 == -1 || var34.field4136 == -1 || class124.method575(var26).field1132 >= class124.method575(var34.field4136).field1132) {
                            var34.field4136 = var26;
                            var34.field4137 = 0;
                            var34.field4138 = 0;
                            var34.field4153 = var7;
                            var34.field4118 = 0;
                            var34.field4155 = var34.field4139;
                        }
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3199) {
                    var29 = var4.method268();
                    var50 = var4.method265();
                    var33 = var4.method309();
                    var42 = var4.method316();
                    class41 var46 = (class41) class27.method80(class41.method116(), var4.method260());
                    var53 = var42 + (var33 << 32);
                    boolean var15 = false;

                    for (var16 = 0; var16 < 100; ++var16) {
                        if (field3921[var16] == var53) {
                            var15 = true;
                            break;
                        }
                    }

                    if (var46.field509 && class153.field1320.method1987(new class358(var29, class492.field3622))) {
                        var15 = true;
                    }

                    if (!var15 && field3900 == 0) {
                        field3921[field3783] = var53;
                        field3783 = (1 + field3783) % 100;
                        var68 = class197.method934(class95.method365(class385.method1782(var4)));
                        if (var46.field524 != -1) {
                            class157.method736(9, class471.method2176(var46.field524) + var29, var68, class403.method1852(var50));
                        } else {
                            class157.method736(9, var29, var68, class403.method1852(var50));
                        }
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3254 == var1.field2235) {
                    var24 = var4.method260();
                    method2451(var24);
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3215 == var1.field2235) {
                    var24 = var4.method260();
                    var26 = var4.method260();
                    var7 = var4.method260();
                    var8 = var4.method260();
                    field4043[var24] = true;
                    field3837[var24] = var26;
                    field3997[var24] = var7;
                    field3907[var24] = var8;
                    field3993[var24] = 0;
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3238 == var1.field2235) {
                    var24 = var4.method264();
                    var26 = var4.method309();
                    if (var24 < -70000) {
                        var26 += 32768;
                    }

                    if (var24 >= 0) {
                        var30 = class97.method424(var24);
                    } else {
                        var30 = null;
                    }

                    for (; var4.field697 < var1.field2241; class163.method802(var26, var8, var9 - 1, var10)) {
                        var8 = var4.method307();
                        var9 = var4.method309();
                        var10 = 0;
                        if (var9 != 0) {
                            var10 = var4.method260();
                            if (var10 == 255) {
                                var10 = var4.method264();
                            }
                        }

                        if (var30 != null && var8 >= 0 && var8 < var30.field917.length) {
                            var30.field917[var8] = var9;
                            var30.field918[var8] = var10;
                        }
                    }

                    if (null != var30) {
                        method2424(var30);
                    }

                    method2390();
                    field3974[++field3975 - 1 & 31] = var26 & 32767;
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3194 == var1.field2235) {
                    field4036 = true;
                    field4042 = false;
                    field4038 = true;
                    var24 = var4.method262();
                    var26 = var4.method262();
                    var7 = method2377(class214.field1736 + var26 & 2027);
                    var8 = class225.field1779 + var24;
                    var9 = var4.method309();
                    var10 = var4.method260();
                    field3857 = new class235(class214.field1736, var7, var9, var10);
                    field3831 = new class235(class225.field1779, var8, var9, var10);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3300) {
                    var8 = var4.method281();
                    var7 = var4.method299();
                    var26 = var4.method309();
                    var24 = var4.method287();
                    class283 var31;
                    if (var24 == field3903) {
                        var31 = class180.field1528;
                    } else {
                        var31 = field3948[var24];
                    }

                    if (null != var31) {
                        var31.method2504(var8, var26, var7 >> 16, var7 & 65535);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3272) {
                    for (var24 = 0; var24 < class10.field46.length; ++var24) {
                        if (class10.field46[var24] != class10.field48[var24]) {
                            class10.field46[var24] = class10.field48[var24];
                            method2446(var24);
                            field3972[++field3973 - 1 & 31] = var24;
                        }
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3204 == var1.field2235) {
                    method2355(var4.method268());
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3284) {
                    var24 = var4.method300();
                    var26 = var4.method291();
                    var30 = class97.method424(var24);
                    if (var26 != var30.field837 || var26 == -1) {
                        var30.field837 = var26;
                        var30.field921 = 0;
                        var30.field922 = 0;
                        method2424(var30);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3253) {
                    class51.field557 = var4.method260();
                    class518.field4181 = var4.method282();

                    while (var4.field697 < var1.field2241) {
                        var24 = var4.method260();
                        class378 var32 = class378.method1766()[var24];
                        class137.method622(var32);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3239) {
                    var24 = var4.method288();
                    var26 = var4.method289();
                    var8 = var4.method289();
                    var7 = var4.method287();
                    class141.method649(var24, var26, var7, var8);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3255) {
                    field4036 = true;
                    field4042 = false;
                    field4037 = true;
                    class172.field1439 = var4.method260();
                    class533.field4244 = var4.method260();
                    var24 = var4.method309();
                    var26 = var4.method260() * 128 + 64;
                    var7 = var4.method260() * 128 + 64;
                    var8 = var4.method309();
                    field4039 = var4.method267();
                    var9 = var4.method260();
                    var10 = class172.field1439 * 128 + 64;
                    var11 = class533.field4244 * 128 + 64;
                    var12 = false;
                    var13 = false;
                    if (field4039) {
                        var37 = class446.field3027;
                        var47 = method2342(var10, var11, class201.field1651) - var24;
                    } else {
                        var37 = method2342(class345.field2506, class360.field2585, class201.field1651) - class446.field3027;
                        var47 = var24;
                    }

                    field4040 = new class520(class345.field2506, class360.field2585, var37, var10, var11, var47, var26, var7, var8, var9);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3195) {
                    class153.field1320.method1994(var4, var1.field2241);
                    field3981 = field3777;
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3261 == var1.field2235) {
                    field4036 = true;
                    field4042 = false;
                    field4037 = false;
                    class172.field1439 = var4.method260();
                    class533.field4244 = var4.method260();
                    class397.field2799 = var4.method309();
                    class412.field2900 = var4.method260();
                    class499.field3649 = var4.method260();
                    if (class499.field3649 >= 100) {
                        class345.field2506 = 64 + class172.field1439 * 128;
                        class360.field2585 = class533.field4244 * 128 + 64;
                        class446.field3027 = method2342(class345.field2506, class360.field2585, class201.field1651) - class397.field2799;
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3277) {
                    var24 = var4.method300();
                    var26 = var4.method288();
                    var7 = var26 >> 10 & 31;
                    var8 = var26 >> 5 & 31;
                    var9 = var26 & 31;
                    var10 = (var7 << 19) + (var8 << 11) + (var9 << 3);
                    class97 var38 = class97.method424(var24);
                    if (var38.field814 != var10) {
                        var38.field814 = var10;
                        method2424(var38);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3241) {
                    var29 = var4.method268();
                    var26 = var4.method305();
                    var30 = class97.method424(var26);
                    if (!var29.equals(var30.field851)) {
                        var30.field851 = var29;
                        method2424(var30);
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3290 == var1.field2235) {
                    var24 = var4.method264();
                    var26 = var4.method309();
                    if (var24 < -70000) {
                        var26 += 32768;
                    }

                    if (var24 >= 0) {
                        var30 = class97.method424(var24);
                    } else {
                        var30 = null;
                    }

                    if (null != var30) {
                        for (var8 = 0; var8 < var30.field917.length; ++var8) {
                            var30.field917[var8] = 0;
                            var30.field918[var8] = 0;
                        }
                    }

                    class163.method797(var26);
                    var8 = var4.method309();

                    for (var9 = 0; var9 < var8; ++var9) {
                        var10 = var4.method309();
                        var11 = var4.method282();
                        if (var11 == 255) {
                            var11 = var4.method305();
                        }

                        if (null != var30 && var9 < var30.field917.length) {
                            var30.field917[var9] = var10;
                            var30.field918[var9] = var11;
                        }

                        class163.method802(var26, var9, var10 - 1, var11);
                    }

                    if (var30 != null) {
                        method2424(var30);
                    }

                    method2390();
                    field3974[++field3975 - 1 & 31] = var26 & 32767;
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3210) {
                    var24 = var4.method287();
                    var26 = var4.method305();
                    class10.field48[var24] = var26;
                    if (var26 != class10.field46[var24]) {
                        class10.field46[var24] = var26;
                    }

                    method2446(var24);
                    field3972[++field3973 - 1 & 31] = var24;
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3214) {
                    class137.method622(class378.field2735);
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3302 == var1.field2235) {
                    class137.method622(class378.field2741);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3274) {
                    class137.method622(class378.field2740);
                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3283) {
                    var24 = var4.method260();
                    if (var4.method260() == 0) {
                        field4053[var24] = new class249();
                        var4.field697 += 18;
                    } else {
                        --var4.field697;
                        field4053[var24] = new class249(var4, false);
                    }

                    field3985 = field3777;
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3200 == var1.field2235 && field4036) {
                    field4042 = true;
                    field4038 = false;
                    field4037 = false;

                    for (var24 = 0; var24 < 5; ++var24) {
                        field4043[var24] = false;
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3196) {
                    class51.field557 = var4.method320();
                    class518.field4181 = var4.method282();

                    for (var24 = class51.field557; var24 < class51.field557 + 8; ++var24) {
                        for (var26 = class518.field4181; var26 < class518.field4181 + 8; ++var26) {
                            if (field3915[class201.field1651][var24][var26] != null) {
                                field3915[class201.field1651][var24][var26] = null;
                                method2392(var24, var26);
                            }
                        }
                    }

                    for (class316 var25 = (class316) field3916.method122(); var25 != null; var25 = (class316) field3916.method124()) {
                        if (var25.field2276 >= class51.field557 && var25.field2276 < class51.field557 + 8 && var25.field2282 >= class518.field4181 && var25.field2282 < 8 + class518.field4181 && class201.field1651 == var25.field2283) {
                            var25.field2281 = 0;
                        }
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3219 == var1.field2235) {
                    return this.method2329(var1, 2);
                }

                if (var1.field2235 == class464.field3288) {
                    field4026 = var4.method260();
                    if (field4026 == 255) {
                        field4026 = 0;
                    }

                    field3949 = var4.method260();
                    if (field3949 == 255) {
                        field3949 = 0;
                    }

                    var1.field2235 = null;
                    return true;
                }

                if (var1.field2235 == class464.field3213) {
                    field3984 = field3777;
                    var23 = var4.method261();
                    class54 var27 = new class54(var4);
                    class315 var28;
                    if (var23 >= 0) {
                        var28 = field4020[var23];
                    } else {
                        var28 = class375.field2724;
                    }

                    if (var28 == null) {
                        this.method2327(var23);
                        var1.field2235 = null;
                        return true;
                    }

                    if (var27.field594 > var28.field2268) {
                        this.method2327(var23);
                        var1.field2235 = null;
                        return true;
                    }

                    if (var27.field594 < var28.field2268) {
                        var1.field2235 = null;
                        return true;
                    }

                    var27.method160(var28);
                    var1.field2235 = null;
                    return true;
                }

                if (class464.field3307 == var1.field2235) {
                    class137.method622(class378.field2736);
                    var1.field2235 = null;
                    return true;
                }

                class157.method728((var1.field2235 != null ? -908169793 * var1.field2235.field3308 * 1400406591 : -1) + class49.field553 + (var1.field2246 != null ? var1.field2246.field3308 : -1) + class49.field553 + (null != var1.field2247 ? var1.field2247.field3308 : -1) + class49.field553 + var1.field2241, null);
                method2491();
            } catch (IOException var21) {
                method2425();
            } catch (Exception var22) {
                var6 = (null != var1.field2235 ? var1.field2235.field3308 : -1) + class49.field553 + (var1.field2246 != null ? var1.field2246.field3308 : -1) + class49.field553 + (null != var1.field2247 ? -908169793 * var1.field2247.field3308 * 1400406591 : -1) + class49.field553 + var1.field2241 + class49.field553 + (class357.field2573 + class180.field1528.field4166[0]) + class49.field553 + (class5.field28 + class180.field1528.field4163[0]) + class49.field553;

                for (var7 = 0; var7 < var1.field2241 && var7 < 50; ++var7) {
                    var6 = var6 + var4.field695[var7] + class49.field553;
                }

                class157.method728(var6, var22);
                method2491();
            }

            return true;
        }
    }

    void method2314() {
        boolean var2 = false;

        int var3;
        int var6;
        while (!var2) {
            var2 = true;

            for (var3 = 0; var3 < field3924 - 1; ++var3) {
                if (field3968[var3] < 1000 && field3968[var3 + 1] > 1000) {
                    String var4 = field4049[var3];
                    field4049[var3] = field4049[var3 + 1];
                    field4049[var3 + 1] = var4;
                    String var5 = field3930[var3];
                    field3930[var3] = field3930[var3 + 1];
                    field3930[var3 + 1] = var5;
                    var6 = field3968[var3];
                    field3968[var3] = field3968[var3 + 1];
                    field3968[var3 + 1] = var6;
                    var6 = field3925[var3];
                    field3925[var3] = field3925[var3 + 1];
                    field3925[var3 + 1] = var6;
                    var6 = field3926[var3];
                    field3926[var3] = field3926[var3 + 1];
                    field3926[var3 + 1] = var6;
                    var6 = field3928[var3];
                    field3928[var3] = field3928[var3 + 1];
                    field3928[var3 + 1] = var6;
                    var6 = field3929[var3];
                    field3929[var3] = field3929[var3 + 1];
                    field3929[var3 + 1] = var6;
                    boolean var7 = field3932[var3];
                    field3932[var3] = field3932[var3 + 1];
                    field3932[var3 + 1] = var7;
                    var2 = false;
                }
            }
        }

        if (null == field3959) {
            int var16 = class499.field3645;
            int var8;
            int var9;
            int var18;
            int var19;
            if (field3888) {
                int var17;
                if (var16 != 1 && (class218.field1747 || var16 != 4)) {
                    var3 = class499.field3651;
                    var17 = class499.field3634;
                    if (var3 < class264.field1952 - 10 || var3 > class264.field1952 + class19.field67 + 10 || var17 < class255.field1918 - 10 || var17 > class255.field1918 + class462.field3166 + 10) {
                        field3888 = false;
                        var18 = class264.field1952;
                        var6 = class255.field1918;
                        var19 = class19.field67;
                        var8 = class462.field3166;

                        for (var9 = 0; var9 < field3946; ++var9) {
                            if (field4002[var9] + field4000[var9] > var18 && field4000[var9] < var18 + var19 && field4001[var9] + field4003[var9] > var6 && field4001[var9] < var6 + var8) {
                                field3785[var9] = true;
                            }
                        }
                    }
                }

                if (var16 == 1 || !class218.field1747 && var16 == 4) {
                    var3 = class264.field1952;
                    var17 = class255.field1918;
                    var18 = class19.field67;
                    var6 = class499.field3646;
                    var19 = class499.field3647;
                    var8 = -1;

                    int var10;
                    for (var9 = 0; var9 < field3924; ++var9) {
                        var10 = var17 + 31 + (field3924 - 1 - var9) * 15;
                        if (var6 > var3 && var6 < var18 + var3 && var19 > var10 - 13 && var19 < var10 + 3) {
                            var8 = var9;
                        }
                    }

                    int var11;
                    int var12;
                    int var13;
                    if (var8 != -1 && var8 >= 0) {
                        var9 = field3925[var8];
                        var10 = field3926[var8];
                        var11 = field3968[var8];
                        var12 = field3928[var8];
                        var13 = field3929[var8];
                        String var14 = field3930[var8];
                        String var15 = field4049[var8];
                        method2484(var9, var10, var11, var12, var13, var14, var15, class499.field3646, class499.field3647);
                    }

                    field3888 = false;
                    var9 = class264.field1952;
                    var10 = class255.field1918;
                    var11 = class19.field67;
                    var12 = class462.field3166;

                    for (var13 = 0; var13 < field3946; ++var13) {
                        if (field4002[var13] + field4000[var13] > var9 && field4000[var13] < var9 + var11 && field4003[var13] + field4001[var13] > var10 && field4001[var13] < var10 + var12) {
                            field3785[var13] = true;
                        }
                    }
                }
            } else {
                var3 = field3924 - 1;
                if ((var16 == 1 || !class218.field1747 && var16 == 4) && this.method2315((byte) -84)) {
                    var16 = 2;
                }

                if ((var16 == 1 || !class218.field1747 && var16 == 4) && field3924 > 0 && var3 >= 0) {
                    var18 = field3925[var3];
                    var6 = field3926[var3];
                    var19 = field3968[var3];
                    var8 = field3928[var3];
                    var9 = field3929[var3];
                    String var20 = field3930[var3];
                    String var21 = field4049[var3];
                    method2484(var18, var6, var19, var8, var9, var20, var21, class499.field3646, class499.field3647);
                }

                if (var16 == 2 && field3924 > 0) {
                    this.method2316(class499.field3646, class499.field3647);
                }
            }

        }
    }

    boolean method2315(byte var1) {
        int var2 = field3924 - 1;
        return (field3922 && field3924 > 2 || method2358(var2)) && !field3932[var2];
    }

    void method2316(int var1, int var2) {
        class485.method2234(var1, var2);
        var1 -= field4056;
        var2 -= field4057;
        class329.field2414.method762(class201.field1651, var1, var2, false);
        field3888 = true;
    }

    void method2317(boolean var1) {
        int var3 = field3947;
        int var4 = class223.field1763;
        int var5 = class519.field4188;
        if (class97.method428(var3)) {
            method2344(class46.field542[var3], -1, var4, var5, var1);
        }

    }

    void method2318(class97 var1) {
        class97 var3 = var1.field808 == -1 ? null : class97.method424(var1.field808);
        int var4;
        int var5;
        if (var3 == null) {
            var4 = class223.field1763;
            var5 = class519.field4188;
        } else {
            var4 = var3.field806;
            var5 = var3.field783;
        }

        method2469(var1, var4, var5, false);
        method2434(var1, var4, var5);
    }

    void method2319() {
        method2424(field3959);
        ++class493.field3624;
        int var2;
        int var3;
        if (field4011 && field3964) {
            var2 = class499.field3651;
            var3 = class499.field3634;
            var2 -= field3961;
            var3 -= field4034;
            if (var2 < field3965) {
                var2 = field3965;
            }

            if (var2 + field3959.field806 > field3978.field806 + field3965) {
                var2 = field3978.field806 + field3965 - field3959.field806;
            }

            if (var3 < field3966) {
                var3 = field3966;
            }

            if (field3959.field783 + var3 > field3966 + field3978.field783) {
                var3 = field3966 + field3978.field783 - field3959.field783;
            }

            int var10 = var2 - field3813;
            int var5 = var3 - field3885;
            int var6 = field3959.field804;
            if (class493.field3624 > field3959.field846 && (var10 > var6 || var10 < -var6 || var5 > var6 || var5 < -var6)) {
                field3970 = true;
            }

            int var7 = field3978.field810 + (var2 - field3965);
            int var8 = field3978.field824 + (var3 - field3966);
            class26 var9;
            if (null != field3959.field883 && field3970) {
                var9 = new class26();
                var9.field138 = field3959;
                var9.field139 = var7;
                var9.field142 = var8;
                var9.field141 = field3959.field883;
                class269.method1200(var9);
            }

            if (class499.field3641 == 0) {
                if (field3970) {
                    if (null != field3959.field884) {
                        var9 = new class26();
                        var9.field138 = field3959;
                        var9.field139 = var7;
                        var9.field142 = var8;
                        var9.field144 = field3963;
                        var9.field141 = field3959.field884;
                        class269.method1200(var9);
                    }

                    if (null != field3963 && method2382(field3959) != null) {
                        class46 var11 = class46.method134(class488.field3527, field3840.field2238);
                        var11.field541.method297(field3959.field791);
                        var11.field541.method269(field3963.field791);
                        var11.field541.method290(field3959.field910);
                        var11.field541.method290(field3963.field919);
                        var11.field541.method312(field3963.field910);
                        var11.field541.method312(field3959.field919);
                        field3840.method1359(var11);
                    }
                } else if (this.method2315((byte) -32)) {
                    this.method2316(field3813 + field3961, field3885 + field4034);
                } else if (field3924 > 0) {
                    method2331(field3961 + field3813, field4034 + field3885);
                }

                field3959 = null;
            }

        } else {
            if (class493.field3624 > 1) {
                if (!field3970 && field3924 > 0) {
                    var2 = field3961 + field3813;
                    var3 = field4034 + field3885;
                    class161 var4 = class535.field4259;
                    if (var4 != null) {
                        method2484(var4.field1412, var4.field1415, var4.field1413, var4.field1414, var4.field1411, var4.field1416, var4.field1417, var2, var3);
                    }

                    class535.field4259 = null;
                }

                field3959 = null;
            }

        }
    }

    @Override
    public class358 method794() {
        return null != class180.field1528 ? class180.field1528.field2070 : null;
    }

    void method2327(int var1) {
        if (field3957 >= 216) {
            class46 var3 = class46.method134(class488.field3593, field3840.field2238);
            var3.field541.method249(var1);
            field3840.method1359(var3);
        }

    }

    void method2320(int var1) {
        if (field3957 >= 216) {
            class46 var3 = class46.method134(class488.field3594, field3840.field2238);
            var3.field541.method249(var1);
            field3840.method1359(var3);
        }

    }
}
