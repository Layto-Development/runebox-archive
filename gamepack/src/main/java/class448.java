import java.util.Arrays;
import java.util.HashMap;

public class class448 extends class490 {
    static final float field3100;
    static boolean field3093;
    static boolean[] field3069;
    static boolean[] field3070;
    static byte[] field3035;
    static byte[] field3099;
    static char[] field3079;
    static char[][] field3080;
    static class448 field3034;
    static class448 field3073;
    static class534 field3036;
    static class534 field3037;
    static class534 field3038;
    static float[] field3077;
    static float[] field3091;
    static int field3090;
    static int field3092;
    static int field3103;
    static int[] field3039;
    static int[] field3061;
    static int[] field3071;
    static int[] field3072;
    static int[] field3074;
    static int[] field3075;
    static int[] field3076;
    static int[] field3081;
    static int[] field3082;
    static int[] field3083;
    static int[] field3085;
    static int[] field3086;
    static int[] field3087;
    static int[] field3088;
    static int[] field3095;
    static int[] field3096;
    static int[] field3097;
    static int[][] field3078;

    static {
        field3073 = new class448();
        field3099 = new byte[1];
        field3034 = new class448();
        field3035 = new byte[1];
        field3036 = new class534();
        field3037 = new class534();
        field3038 = new class534();
        field3069 = new boolean[6500];
        field3070 = new boolean[6500];
        field3071 = new int[6500];
        field3072 = new int[6500];
        field3077 = new float[6500];
        field3074 = new int[6500];
        field3075 = new int[6500];
        field3076 = new int[6500];
        field3082 = new int[6500];
        field3079 = new char[6000];
        field3080 = new char[6000][512];
        field3081 = new int[12];
        field3078 = new int[12][2000];
        field3083 = new int[2000];
        field3039 = new int[2000];
        field3085 = new int[12];
        field3086 = new int[10];
        field3087 = new int[10];
        field3088 = new int[10];
        field3091 = new float[10];
        field3093 = true;
        field3095 = class334.field2429;
        field3096 = class334.field2427;
        field3097 = class334.field2426;
        field3061 = class334.field2428;
        field3100 = class134.method616(50);
    }

    public boolean field3043;
    public byte field3053;
    public byte field3066;
    public byte field3068;
    public byte field3098;
    public byte field3104;
    public int field3042;
    public int field3054;
    public int field3094;
    public short field3105;
    byte[] field3050;
    byte[] field3051;
    byte[] field3101;
    int field3062;
    int field3063;
    int field3064;
    int field3065;
    int field3089;
    int[] field3040;
    int[] field3041;
    int[] field3044;
    int[] field3045;
    int[] field3046;
    int[] field3047;
    int[] field3048;
    int[] field3049;
    int[] field3055;
    int[] field3056;
    int[] field3057;
    int[] field3102;
    int[][] field3058;
    int[][] field3059;
    int[][] field3060;
    int[][] field3084;
    HashMap<Integer, class395> field3067;
    short[] field3052;

    class448() {
        this.field3094 = 0;
        this.field3042 = 0;
        this.field3053 = 0;
        this.field3054 = 0;
        this.field3043 = false;
        this.field3067 = new HashMap<>();
    }

    public class448(class448[] var1, int var2) {
        this.field3094 = 0;
        this.field3042 = 0;
        this.field3053 = 0;
        this.field3054 = 0;
        this.field3043 = false;
        this.field3067 = new HashMap<>();
        this.field3094 = 0;
        this.field3042 = 0;
        this.field3054 = 0;
        this.field3053 = -1;

        int var3;
        for (var3 = 0; var3 < var2; ++var3) {
            class448 var4 = var1[var3];
            if (var4 != null) {
                this.field3094 += var4.field3094;
                this.field3042 += var4.field3042;
                this.field3054 += var4.field3054;
                if (this.field3053 == -1) {
                    this.field3053 = var4.field3053;
                }
            }
        }

        this.method2041(this.field3094, this.field3042, this.field3054);
        this.field3094 = 0;
        this.field3042 = 0;
        this.field3054 = 0;

        for (var3 = 0; var3 < var2; ++var3) {
            this.method2068(var1[var3]);
        }

    }

    public class448(int var1, int var2, int var3, byte var4) {
        this.field3094 = 0;
        this.field3042 = 0;
        this.field3053 = 0;
        this.field3054 = 0;
        this.field3043 = false;
        this.field3067 = new HashMap<Integer, class395>();
        this.method2041(var1, var2, var3);
        this.field3053 = var4;
        this.field3094 = 0;
        this.field3042 = 0;
        this.field3054 = 0;
    }

    void method2041(int var1, int var2, int var3) {
        this.field3040 = new int[var1];
        this.field3041 = new int[var1];
        this.field3045 = new int[var1];
        this.field3057 = new int[var2];
        this.field3044 = new int[var2];
        this.field3102 = new int[var2];
        this.field3046 = new int[var2];
        this.field3047 = new int[var2];
        this.field3048 = new int[var2];
        if (var3 > 0) {
            this.field3055 = new int[var3];
            this.field3056 = new int[var3];
            this.field3049 = new int[var3];
        }

    }

    void method2073(class448 var1) {
        int var2 = this.field3057.length;
        if (this.field3101 == null && (var1.field3101 != null || this.field3053 != var1.field3053)) {
            this.field3101 = new byte[var2];
            Arrays.fill(this.field3101, this.field3053);
        }

        if (this.field3050 == null && var1.field3050 != null) {
            this.field3050 = new byte[var2];
            Arrays.fill(this.field3050, (byte) 0);
        }

        if (this.field3052 == null && var1.field3052 != null) {
            this.field3052 = new short[var2];
            Arrays.fill(this.field3052, (short) -1);
        }

        if (this.field3051 == null && var1.field3051 != null) {
            this.field3051 = new byte[var2];
            Arrays.fill(this.field3051, (byte) -1);
        }

    }

    public void method2068(class448 var1) {
        if (var1 != null) {
            this.method2073(var1);

            int var2;
            for (var2 = 0; var2 < var1.field3042; ++var2) {
                this.field3057[this.field3042] = var1.field3057[var2] + this.field3094;
                this.field3044[this.field3042] = var1.field3044[var2] + this.field3094;
                this.field3102[this.field3042] = var1.field3102[var2] + this.field3094;
                this.field3046[this.field3042] = var1.field3046[var2];
                this.field3047[this.field3042] = var1.field3047[var2];
                this.field3048[this.field3042] = var1.field3048[var2];
                if (this.field3101 != null) {
                    this.field3101[this.field3042] = var1.field3101 != null ? var1.field3101[var2] : var1.field3053;
                }

                if (this.field3050 != null && var1.field3050 != null) {
                    this.field3050[this.field3042] = var1.field3050[var2];
                }

                if (this.field3052 != null) {
                    this.field3052[this.field3042] = var1.field3052 != null ? var1.field3052[var2] : -1;
                }

                if (this.field3051 != null) {
                    if (var1.field3051 != null && var1.field3051[var2] != -1) {
                        this.field3051[this.field3042] = (byte) (var1.field3051[var2] + this.field3054);
                    } else {
                        this.field3051[this.field3042] = -1;
                    }
                }

                ++this.field3042;
            }

            for (var2 = 0; var2 < var1.field3054; ++var2) {
                this.field3055[this.field3054] = var1.field3055[var2] + this.field3094;
                this.field3056[this.field3054] = var1.field3056[var2] + this.field3094;
                this.field3049[this.field3054] = var1.field3049[var2] + this.field3094;
                ++this.field3054;
            }

            for (var2 = 0; var2 < var1.field3094; ++var2) {
                this.field3040[this.field3094] = var1.field3040[var2];
                this.field3041[this.field3094] = var1.field3041[var2];
                this.field3045[this.field3094] = var1.field3045[var2];
                ++this.field3094;
            }

        }
    }

    public class448 method2043(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
        this.method2045();
        int var7 = var2 - this.field3064;
        int var8 = var2 + this.field3064;
        int var9 = var4 - this.field3064;
        int var10 = var4 + this.field3064;
        if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
            var7 >>= 7;
            var8 = var8 + 127 >> 7;
            var9 >>= 7;
            var10 = var10 + 127 >> 7;
            if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
                return this;
            } else {
                class448 var11;
                if (var5) {
                    var11 = new class448();
                    var11.field3094 = this.field3094;
                    var11.field3042 = this.field3042;
                    var11.field3054 = this.field3054;
                    var11.field3040 = this.field3040;
                    var11.field3045 = this.field3045;
                    var11.field3057 = this.field3057;
                    var11.field3044 = this.field3044;
                    var11.field3102 = this.field3102;
                    var11.field3046 = this.field3046;
                    var11.field3047 = this.field3047;
                    var11.field3048 = this.field3048;
                    var11.field3101 = this.field3101;
                    var11.field3050 = this.field3050;
                    var11.field3051 = this.field3051;
                    var11.field3052 = this.field3052;
                    var11.field3053 = this.field3053;
                    var11.field3055 = this.field3055;
                    var11.field3056 = this.field3056;
                    var11.field3049 = this.field3049;
                    var11.field3058 = this.field3058;
                    var11.field3059 = this.field3059;
                    var11.field3043 = this.field3043;
                    var11.field3041 = new int[var11.field3094];
                } else {
                    var11 = this;
                }

                int var12;
                int var13;
                int var14;
                int var15;
                int var16;
                int var17;
                int var18;
                int var19;
                int var20;
                int var21;
                if (var6 == 0) {
                    for (var12 = 0; var12 < var11.field3094; ++var12) {
                        var13 = this.field3040[var12] + var2;
                        var14 = this.field3045[var12] + var4;
                        var15 = var13 & 127;
                        var16 = var14 & 127;
                        var17 = var13 >> 7;
                        var18 = var14 >> 7;
                        var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                        var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                        var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                        var11.field3041[var12] = this.field3041[var12] + var21 - var3;
                    }
                } else {
                    for (var12 = 0; var12 < var11.field3094; ++var12) {
                        var13 = (-this.field3041[var12] << 16) / super.field3601;
                        if (var13 < var6) {
                            var14 = this.field3040[var12] + var2;
                            var15 = this.field3045[var12] + var4;
                            var16 = var14 & 127;
                            var17 = var15 & 127;
                            var18 = var14 >> 7;
                            var19 = var15 >> 7;
                            var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                            var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                            int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                            var11.field3041[var12] = this.field3041[var12] + (var22 - var3) * (var6 - var13) / var6;
                        }
                    }
                }

                var11.method2048();
                return var11;
            }
        } else {
            return this;
        }
    }

    public class448 method2044(boolean var1) {
        if (!var1 && field3099.length < this.field3042) {
            field3099 = new byte[this.field3042 + 100];
        }

        return this.method2067(var1, field3073, field3099);
    }

    public class448 method2071(boolean var1) {
        if (!var1 && field3035.length < this.field3042) {
            field3035 = new byte[this.field3042 + 100];
        }

        return this.method2067(var1, field3034, field3035);
    }

    class448 method2067(boolean var1, class448 var2, byte[] var3) {
        var2.field3094 = this.field3094;
        var2.field3042 = this.field3042;
        var2.field3054 = this.field3054;
        if (var2.field3040 == null || var2.field3040.length < this.field3094) {
            var2.field3040 = new int[this.field3094 + 100];
            var2.field3041 = new int[this.field3094 + 100];
            var2.field3045 = new int[this.field3094 + 100];
        }

        int var4;
        for (var4 = 0; var4 < this.field3094; ++var4) {
            var2.field3040[var4] = this.field3040[var4];
            var2.field3041[var4] = this.field3041[var4];
            var2.field3045[var4] = this.field3045[var4];
        }

        if (var1) {
            var2.field3050 = this.field3050;
        } else {
            var2.field3050 = var3;
            if (this.field3050 == null) {
                for (var4 = 0; var4 < this.field3042; ++var4) {
                    var2.field3050[var4] = 0;
                }
            } else {
                for (var4 = 0; var4 < this.field3042; ++var4) {
                    var2.field3050[var4] = this.field3050[var4];
                }
            }
        }

        var2.field3057 = this.field3057;
        var2.field3044 = this.field3044;
        var2.field3102 = this.field3102;
        var2.field3046 = this.field3046;
        var2.field3047 = this.field3047;
        var2.field3048 = this.field3048;
        var2.field3101 = this.field3101;
        var2.field3051 = this.field3051;
        var2.field3052 = this.field3052;
        var2.field3053 = this.field3053;
        var2.field3055 = this.field3055;
        var2.field3056 = this.field3056;
        var2.field3049 = this.field3049;
        var2.field3058 = this.field3058;
        var2.field3059 = this.field3059;
        var2.field3060 = this.field3060;
        var2.field3084 = this.field3084;
        var2.field3043 = this.field3043;
        var2.method2048();
        var2.field3104 = 0;
        return var2;
    }

    void method2075(int var1) {
        if (!this.field3067.containsKey(var1)) {
            int var2 = 0;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = field3096[var1];
            int var9 = field3095[var1];

            for (int var10 = 0; var10 < this.field3094; ++var10) {
                int var12 = this.field3040[var10];
                int var13 = this.field3045[var10];
                int var11 = var12 * var8 + var13 * var9 >> 16;
                int var15 = this.field3041[var10];
                int var17 = this.field3040[var10];
                int var18 = this.field3045[var10];
                int var16 = var18 * var8 - var9 * var17 >> 16;
                if (var11 < var2) {
                    var2 = var11;
                }

                if (var11 > var5) {
                    var5 = var11;
                }

                if (var15 < var3) {
                    var3 = var15;
                }

                if (var15 > var6) {
                    var6 = var15;
                }

                if (var16 < var4) {
                    var4 = var16;
                }

                if (var16 > var7) {
                    var7 = var16;
                }
            }

            class395 var20 = new class395((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
            boolean var21 = true;
            if (var20.field2790 < 32) {
                var20.field2790 = 32;
            }

            if (var20.field2792 < 32) {
                var20.field2792 = 32;
            }

            if (this.field3043) {
                boolean var22 = true;
                var20.field2790 += 8;
                var20.field2792 += 8;
            }

            this.field3067.put(var1, var20);
        }
    }

    public void method2045() {
        if (this.field3062 != 1) {
            this.field3062 = 1;
            super.field3601 = 0;
            this.field3063 = 0;
            this.field3064 = 0;

            for (int var1 = 0; var1 < this.field3094; ++var1) {
                int var2 = this.field3040[var1];
                int var3 = this.field3041[var1];
                int var4 = this.field3045[var1];
                if (-var3 > super.field3601) {
                    super.field3601 = -var3;
                }

                if (var3 > this.field3063) {
                    this.field3063 = var3;
                }

                int var5 = var2 * var2 + var4 * var4;
                if (var5 > this.field3064) {
                    this.field3064 = var5;
                }
            }

            this.field3064 = (int) (Math.sqrt(this.field3064) + 0.99D);
            this.field3089 = (int) (Math.sqrt(this.field3064 * this.field3064 + super.field3601 * super.field3601) + 0.99D);
            this.field3065 = this.field3089 + (int) (Math.sqrt(this.field3064 * this.field3064 + this.field3063 * this.field3063) + 0.99D);
        }
    }

    void method2074() {
        if (this.field3062 != 2) {
            this.field3062 = 2;
            this.field3064 = 0;

            for (int var1 = 0; var1 < this.field3094; ++var1) {
                int var2 = this.field3040[var1];
                int var3 = this.field3041[var1];
                int var4 = this.field3045[var1];
                int var5 = var2 * var2 + var4 * var4 + var3 * var3;
                if (var5 > this.field3064) {
                    this.field3064 = var5;
                }
            }

            this.field3064 = (int) (Math.sqrt(this.field3064) + 0.99D);
            this.field3089 = this.field3064;
            this.field3065 = this.field3064 + this.field3064;
        }
    }

    public int method2047() {
        this.method2045();
        return this.field3064;
    }

    public void method2048() {
        this.field3062 = 0;
        this.field3067.clear();
    }

    public void method2070(class516 var1, int var2) {
        if (this.field3058 != null) {
            if (var2 != -1) {
                class74 var3 = var1.field4171[var2];
                class222 var4 = var3.field682;
                field3090 = 0;
                field3103 = 0;
                field3092 = 0;

                for (int var5 = 0; var5 < var3.field685; ++var5) {
                    int var6 = var3.field684[var5];
                    this.method2054(var4.field1759[var6], var4.field1760[var6], var3.field688[var5], var3.field689[var5], var3.field690[var5]);
                }

                this.method2048();
            }
        }
    }

    public void method2049(class228 var1, int var2) {
        class222 var3 = var1.field1785;
        class139 var4 = var3.method1031();
        if (var4 != null) {
            var3.method1031().method645(var1, var2);
            this.method2076(var3.method1031(), var1.method1041());
        }

        if (var1.method1042()) {
            this.method2050(var1, var2);
        }

        this.method2048();
    }

    void method2050(class228 var1, int var2) {
        class222 var3 = var1.field1785;

        for (int var4 = 0; var4 < var3.field1758; ++var4) {
            int var5 = var3.field1759[var4];
            if (var5 == 5 && var1.field1790 != null && var1.field1790[var4] != null && var1.field1790[var4][0] != null && this.field3059 != null && this.field3050 != null) {
                class329 var6 = var1.field1790[var4][0];
                int[] var7 = var3.field1760[var4];
                int var8 = var7.length;

                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = var7[var9];
                    if (var10 < this.field3059.length) {
                        int[] var11 = this.field3059[var10];

                        for (int var12 = 0; var12 < var11.length; ++var12) {
                            int var13 = var11[var12];
                            int var14 = (int) ((float) (this.field3050[var13] & 255) + var6.method1527(var2) * 255.0F);
                            if (var14 < 0) {
                                var14 = 0;
                            } else if (var14 > 255) {
                                var14 = 255;
                            }

                            this.field3050[var13] = (byte) var14;
                        }
                    }
                }
            }
        }

    }

    void method2076(class139 var1, int var2) {
        this.method2069(var1, var2);
    }

    public void method2062(class516 var1, int var2, class516 var3, int var4, int[] var5) {
        if (var2 != -1) {
            if (var5 != null && var4 != -1) {
                class74 var6 = var1.field4171[var2];
                class74 var7 = var3.field4171[var4];
                class222 var8 = var6.field682;
                field3090 = 0;
                field3103 = 0;
                field3092 = 0;
                byte var9 = 0;
                int var13 = var9 + 1;
                int var10 = var5[0];

                int var11;
                int var12;
                for (var11 = 0; var11 < var6.field685; ++var11) {
                    for (var12 = var6.field684[var11]; var12 > var10; var10 = var5[var13++]) {
                    }

                    if (var12 != var10 || var8.field1759[var12] == 0) {
                        this.method2054(var8.field1759[var12], var8.field1760[var12], var6.field688[var11], var6.field689[var11], var6.field690[var11]);
                    }
                }

                field3090 = 0;
                field3103 = 0;
                field3092 = 0;
                var9 = 0;
                var13 = var9 + 1;
                var10 = var5[0];

                for (var11 = 0; var11 < var7.field685; ++var11) {
                    for (var12 = var7.field684[var11]; var12 > var10; var10 = var5[var13++]) {
                    }

                    if (var12 == var10 || var8.field1759[var12] == 0) {
                        this.method2054(var8.field1759[var12], var8.field1760[var12], var7.field688[var11], var7.field689[var11], var7.field690[var11]);
                    }
                }

                this.method2048();
            } else {
                this.method2070(var1, var2);
            }
        }
    }

    public void method2052(class222 var1, class228 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
        class139 var7 = var1.method1031();
        if (var7 != null) {
            var7.method646(var2, var3, var4, var5);
            if (var6) {
                this.method2076(var7, var2.method1041());
            }
        }

        if (!var5 && var2.method1042()) {
            this.method2050(var2, var3);
        }

    }

    public void method2053(class516 var1, int var2, int[] var3, boolean var4) {
        if (var3 == null) {
            this.method2070(var1, var2);
        } else {
            class74 var5 = var1.field4171[var2];
            class222 var6 = var5.field682;
            byte var7 = 0;
            int var11 = var7 + 1;
            int var8 = var3[0];
            field3090 = 0;
            field3103 = 0;
            field3092 = 0;

            for (int var9 = 0; var9 < var5.field685; ++var9) {
                int var10;
                for (var10 = var5.field684[var9]; var10 > var8; var8 = var3[var11++]) {
                }

                if (var4) {
                    if (var10 == var8 || var6.field1759[var10] == 0) {
                        this.method2054(var6.field1759[var10], var6.field1760[var10], var5.field688[var9], var5.field689[var9], var5.field690[var9]);
                    }
                } else if (var10 != var8 || var6.field1759[var10] == 0) {
                    this.method2054(var6.field1759[var10], var6.field1760[var10], var5.field688[var9], var5.field689[var9], var5.field690[var9]);
                }
            }

        }
    }

    void method2054(int var1, int[] var2, int var3, int var4, int var5) {
        int var6 = var2.length;
        int var7;
        int var8;
        int var11;
        int var12;
        if (var1 == 0) {
            var7 = 0;
            field3090 = 0;
            field3103 = 0;
            field3092 = 0;

            for (var8 = 0; var8 < var6; ++var8) {
                int var18 = var2[var8];
                if (var18 < this.field3058.length) {
                    int[] var19 = this.field3058[var18];

                    for (var11 = 0; var11 < var19.length; ++var11) {
                        var12 = var19[var11];
                        field3090 += this.field3040[var12];
                        field3103 += this.field3041[var12];
                        field3092 += this.field3045[var12];
                        ++var7;
                    }
                }
            }

            if (var7 > 0) {
                field3090 = field3090 / var7 + var3;
                field3103 = field3103 / var7 + var4;
                field3092 = field3092 / var7 + var5;
            } else {
                field3090 = var3;
                field3103 = var4;
                field3092 = var5;
            }

        } else {
            int[] var9;
            int var10;
            int[] var10000;
            if (var1 == 1) {
                for (var7 = 0; var7 < var6; ++var7) {
                    var8 = var2[var7];
                    if (var8 < this.field3058.length) {
                        var9 = this.field3058[var8];

                        for (var10 = 0; var10 < var9.length; ++var10) {
                            var11 = var9[var10];
                            var10000 = this.field3040;
                            var10000[var11] += var3;
                            var10000 = this.field3041;
                            var10000[var11] += var4;
                            var10000 = this.field3045;
                            var10000[var11] += var5;
                        }
                    }
                }

            } else if (var1 == 2) {
                for (var7 = 0; var7 < var6; ++var7) {
                    var8 = var2[var7];
                    if (var8 < this.field3058.length) {
                        var9 = this.field3058[var8];

                        for (var10 = 0; var10 < var9.length; ++var10) {
                            var11 = var9[var10];
                            var10000 = this.field3040;
                            var10000[var11] -= field3090;
                            var10000 = this.field3041;
                            var10000[var11] -= field3103;
                            var10000 = this.field3045;
                            var10000[var11] -= field3092;
                            var12 = (var3 & 255) * 8;
                            int var13 = (var4 & 255) * 8;
                            int var14 = (var5 & 255) * 8;
                            int var15;
                            int var16;
                            int var17;
                            if (var14 != 0) {
                                var15 = field3095[var14];
                                var16 = field3096[var14];
                                var17 = this.field3041[var11] * var15 + this.field3040[var11] * var16 >> 16;
                                this.field3041[var11] = this.field3041[var11] * var16 - this.field3040[var11] * var15 >> 16;
                                this.field3040[var11] = var17;
                            }

                            if (var12 != 0) {
                                var15 = field3095[var12];
                                var16 = field3096[var12];
                                var17 = this.field3041[var11] * var16 - this.field3045[var11] * var15 >> 16;
                                this.field3045[var11] = this.field3041[var11] * var15 + this.field3045[var11] * var16 >> 16;
                                this.field3041[var11] = var17;
                            }

                            if (var13 != 0) {
                                var15 = field3095[var13];
                                var16 = field3096[var13];
                                var17 = this.field3045[var11] * var15 + this.field3040[var11] * var16 >> 16;
                                this.field3045[var11] = this.field3045[var11] * var16 - this.field3040[var11] * var15 >> 16;
                                this.field3040[var11] = var17;
                            }

                            var10000 = this.field3040;
                            var10000[var11] += field3090;
                            var10000 = this.field3041;
                            var10000[var11] += field3103;
                            var10000 = this.field3045;
                            var10000[var11] += field3092;
                        }
                    }
                }

            } else if (var1 == 3) {
                for (var7 = 0; var7 < var6; ++var7) {
                    var8 = var2[var7];
                    if (var8 < this.field3058.length) {
                        var9 = this.field3058[var8];

                        for (var10 = 0; var10 < var9.length; ++var10) {
                            var11 = var9[var10];
                            var10000 = this.field3040;
                            var10000[var11] -= field3090;
                            var10000 = this.field3041;
                            var10000[var11] -= field3103;
                            var10000 = this.field3045;
                            var10000[var11] -= field3092;
                            this.field3040[var11] = this.field3040[var11] * var3 / 128;
                            this.field3041[var11] = this.field3041[var11] * var4 / 128;
                            this.field3045[var11] = this.field3045[var11] * var5 / 128;
                            var10000 = this.field3040;
                            var10000[var11] += field3090;
                            var10000 = this.field3041;
                            var10000[var11] += field3103;
                            var10000 = this.field3045;
                            var10000[var11] += field3092;
                        }
                    }
                }

            } else if (var1 == 5) {
                if (this.field3059 != null && this.field3050 != null) {
                    for (var7 = 0; var7 < var6; ++var7) {
                        var8 = var2[var7];
                        if (var8 < this.field3059.length) {
                            var9 = this.field3059[var8];

                            for (var10 = 0; var10 < var9.length; ++var10) {
                                var11 = var9[var10];
                                var12 = (this.field3050[var11] & 255) + var3 * 8;
                                if (var12 < 0) {
                                    var12 = 0;
                                } else if (var12 > 255) {
                                    var12 = 255;
                                }

                                this.field3050[var11] = (byte) var12;
                            }
                        }
                    }
                }

            }
        }
    }

    public void method2055() {
        for (int var1 = 0; var1 < this.field3094; ++var1) {
            int var2 = this.field3040[var1];
            this.field3040[var1] = this.field3045[var1];
            this.field3045[var1] = -var2;
        }

        this.method2048();
    }

    public void method2056() {
        for (int var1 = 0; var1 < this.field3094; ++var1) {
            this.field3040[var1] = -this.field3040[var1];
            this.field3045[var1] = -this.field3045[var1];
        }

        this.method2048();
    }

    public void method2057() {
        for (int var1 = 0; var1 < this.field3094; ++var1) {
            int var2 = this.field3045[var1];
            this.field3045[var1] = this.field3040[var1];
            this.field3040[var1] = -var2;
        }

        this.method2048();
    }

    public void method2066(int var1) {
        int var2 = field3095[var1];
        int var3 = field3096[var1];

        for (int var4 = 0; var4 < this.field3094; ++var4) {
            int var5 = this.field3041[var4] * var3 - this.field3045[var4] * var2 >> 16;
            this.field3045[var4] = this.field3041[var4] * var2 + this.field3045[var4] * var3 >> 16;
            this.field3041[var4] = var5;
        }

        this.method2048();
    }

    public void method2046(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.field3094; ++var4) {
            int[] var10000 = this.field3040;
            var10000[var4] += var1;
            var10000 = this.field3041;
            var10000[var4] += var2;
            var10000 = this.field3045;
            var10000[var4] += var3;
        }

        this.method2048();
    }

    public void method2058(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.field3094; ++var4) {
            this.field3040[var4] = this.field3040[var4] * var1 / 128;
            this.field3041[var4] = this.field3041[var4] * var2 / 128;
            this.field3045[var4] = this.field3045[var4] * var3 / 128;
        }

        this.method2048();
    }

    public final void method2051(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        if (this.field3062 != 2 && this.field3062 != 1) {
            this.method2074();
        }

        int var8 = class334.method1571();
        int var9 = class334.method1572();
        int var10 = field3095[0];
        int var11 = field3096[0];
        int var12 = field3095[var2];
        int var13 = field3096[var2];
        int var14 = field3095[var3];
        int var15 = field3096[var3];
        int var16 = field3095[var4];
        int var17 = field3096[var4];
        int var18 = var6 * var16 + var7 * var17 >> 16;

        for (int var19 = 0; var19 < this.field3094; ++var19) {
            int var20 = this.field3040[var19];
            int var21 = this.field3041[var19];
            int var22 = this.field3045[var19];
            int var23;
            if (var3 != 0) {
                var23 = var21 * var14 + var20 * var15 >> 16;
                var21 = var21 * var15 - var20 * var14 >> 16;
                var20 = var23;
            }

            if (var2 != 0) {
                var23 = var22 * var12 + var20 * var13 >> 16;
                var22 = var22 * var13 - var20 * var12 >> 16;
                var20 = var23;
            }

            var20 += var5;
            var21 += var6;
            var22 += var7;
            var23 = var21 * var17 - var22 * var16 >> 16;
            var22 = var21 * var16 + var22 * var17 >> 16;
            field3074[var19] = var22 - var18;
            field3071[var19] = var8 + var20 * class334.method1576() / var22;
            field3072[var19] = var9 + var23 * class334.method1576() / var22;
            field3077[var19] = class134.method616(var22);
            if (this.field3054 > 0) {
                field3075[var19] = var20;
                field3076[var19] = var23;
                field3082[var19] = var22;
            }
        }

        try {
            this.method2061(false, false, false, 0L);
        } catch (Exception var24) {
        }

    }

    public final void method2059(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        if (this.field3062 != 2 && this.field3062 != 1) {
            this.method2074();
        }

        int var9 = class334.method1571();
        int var10 = class334.method1572();
        int var11 = field3095[0];
        int var12 = field3096[0];
        int var13 = field3095[var2];
        int var14 = field3096[var2];
        int var15 = field3095[var3];
        int var16 = field3096[var3];
        int var17 = field3095[var4];
        int var18 = field3096[var4];
        int var19 = var6 * var17 + var7 * var18 >> 16;

        for (int var20 = 0; var20 < this.field3094; ++var20) {
            int var21 = this.field3040[var20];
            int var22 = this.field3041[var20];
            int var23 = this.field3045[var20];
            int var24;
            if (var3 != 0) {
                var24 = var22 * var15 + var21 * var16 >> 16;
                var22 = var22 * var16 - var21 * var15 >> 16;
                var21 = var24;
            }

            if (var2 != 0) {
                var24 = var23 * var13 + var21 * var14 >> 16;
                var23 = var23 * var14 - var21 * var13 >> 16;
                var21 = var24;
            }

            var21 += var5;
            var22 += var6;
            var23 += var7;
            var24 = var22 * var18 - var23 * var17 >> 16;
            var23 = var22 * var17 + var23 * var18 >> 16;
            field3074[var20] = var23 - var19;
            field3071[var20] = var9 + var21 * class334.method1576() / var8;
            field3072[var20] = var10 + var24 * class334.method1576() / var8;
            field3077[var20] = class134.method616(var8);
            if (this.field3054 > 0) {
                field3075[var20] = var21;
                field3076[var20] = var24;
                field3082[var20] = var23;
            }
        }

        try {
            this.method2061(false, false, false, 0L);
        } catch (Exception var25) {
        }

    }

    @Override
    void method2237(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
        if (this.field3062 != 1) {
            this.method2045();
        }

        this.method2075(var1);
        int var11 = var8 * var5 - var6 * var4 >> 16;
        int var12 = var7 * var2 + var11 * var3 >> 16;
        int var13 = this.field3064 * var3 >> 16;
        int var14 = var12 + var13;
        if (var14 > 50 && var12 < 3500) {
            int var15 = var8 * var4 + var6 * var5 >> 16;
            int var16 = (var15 - this.field3064) * class334.method1576();
            if (var16 / var14 < class334.method1570()) {
                int var17 = (var15 + this.field3064) * class334.method1576();
                if (var17 / var14 > class334.method1573()) {
                    int var18 = var7 * var3 - var11 * var2 >> 16;
                    int var19 = this.field3064 * var2 >> 16;
                    int var20 = var19 + (this.field3063 * var3 >> 16);
                    int var21 = (var18 + var20) * class334.method1576();
                    if (var21 / var14 > class334.method1575()) {
                        int var22 = var19 + (super.field3601 * var3 >> 16);
                        int var23 = (var18 - var22) * class334.method1576();
                        if (var23 / var14 < class334.method1574()) {
                            int var24 = var13 + (super.field3601 * var2 >> 16);
                            boolean var25 = false;
                            boolean var26 = var12 - var24 <= 50;

							boolean var27 = var26 || this.field3054 > 0;
                            int var28 = class368.field2627;
                            int var30 = class368.field2630;
                            boolean var32 = class368.method1735();
                            boolean var34 = 0L != var9;
                            boolean var35;
                            if (var34) {
                                var35 = (int) (var9 >>> 16 & 1L) == 1;
                                var34 = !var35;
                            }

                            var35 = false;
                            int var38;
                            int var40;
                            int var41;
                            int var42;
                            int var43;
                            int var44;
                            int var51;
                            int var52;
                            if (var34 && var32) {
                                boolean var36 = false;
                                if (field3093) {
                                    boolean var37;
                                    if (!class368.method1735()) {
                                        var37 = false;
                                    } else {
                                        class368.method1732();
                                        class395 var39 = this.field3067.get(var1);
                                        var40 = var6 + var39.field2793;
                                        var41 = var39.field2788 + var7;
                                        var42 = var39.field2789 + var8;
                                        var43 = var39.field2790;
                                        var44 = var39.field2791;
                                        int var45 = var39.field2792;
                                        int var46 = class368.field2626 - var40;
                                        int var47 = class368.field2635 - var41;
                                        int var48 = class368.field2632 - var42;
                                        if (Math.abs(var46) > var43 + class368.field2633) {
                                            var37 = false;
                                        } else if (Math.abs(var47) > class92.field763 + var44) {
                                            var37 = false;
                                        } else if (Math.abs(var48) > var45 + class458.field3151) {
                                            var37 = false;
                                        } else if (Math.abs(class368.field2628 * var48 - var47 * class516.field4170) > class458.field3151 * var44 + var45 * class92.field763) {
                                            var37 = false;
                                        } else if (Math.abs(var46 * class516.field4170 - var48 * class376.field2725) > var43 * class458.field3151 + var45 * class368.field2633) {
                                            var37 = false;
                                        } else var37 = Math.abs(var47 * class376.field2725 - var46 * class368.field2628) <= class92.field763 * var43 + var44 * class368.field2633;
                                    }

                                    var36 = var37;
                                } else {
                                    var52 = var12 - var13;
                                    if (var52 <= 50) {
                                        var52 = 50;
                                    }

                                    if (var15 > 0) {
                                        var16 /= var14;
                                        var17 /= var52;
                                    } else {
                                        var17 /= var14;
                                        var16 /= var52;
                                    }

                                    if (var18 > 0) {
                                        var23 /= var14;
                                        var21 /= var52;
                                    } else {
                                        var21 /= var14;
                                        var23 /= var52;
                                    }

                                    var38 = var28 - class334.method1571();
                                    var51 = var30 - class334.method1572();
                                    if (var38 > var16 && var38 < var17 && var51 > var23 && var51 < var21) {
                                        var36 = true;
                                    }
                                }

                                if (var36) {
                                    if (this.field3043) {
                                        class368.field2636[++class368.field2634 - 1] = var9;
                                    } else {
                                        var35 = true;
                                    }
                                }
                            }

                            int var50 = class334.method1571();
                            var52 = class334.method1572();
                            var38 = 0;
                            var51 = 0;
                            if (var1 != 0) {
                                var38 = field3095[var1];
                                var51 = field3096[var1];
                            }

                            for (var40 = 0; var40 < this.field3094; ++var40) {
                                var41 = this.field3040[var40];
                                var42 = this.field3041[var40];
                                var43 = this.field3045[var40];
                                if (var1 != 0) {
                                    var44 = var43 * var38 + var41 * var51 >> 16;
                                    var43 = var43 * var51 - var41 * var38 >> 16;
                                    var41 = var44;
                                }

                                var41 += var6;
                                var42 += var7;
                                var43 += var8;
                                var44 = var43 * var4 + var41 * var5 >> 16;
                                var43 = var43 * var5 - var41 * var4 >> 16;
                                var41 = var44;
                                var44 = var42 * var3 - var43 * var2 >> 16;
                                var43 = var42 * var2 + var43 * var3 >> 16;
                                field3074[var40] = var43 - var12;
                                if (var43 >= 50) {
                                    field3071[var40] = var50 + var41 * class334.method1576() / var43;
                                    field3072[var40] = var52 + var44 * class334.method1576() / var43;
                                    field3077[var40] = class134.method616(var43);
                                } else {
                                    field3071[var40] = -5000;
                                    var25 = true;
                                }

                                if (var27) {
                                    field3075[var40] = var41;
                                    field3076[var40] = var44;
                                    field3082[var40] = var43;
                                }
                            }

                            try {
                                this.method2061(var25, var35, this.field3043, var9);
                            } catch (Exception var49) {
                            }

                        }
                    }
                }
            }
        }
    }

    final void method2061(boolean var1, boolean var2, boolean var3, long var4) {
        if (this.field3065 < 6000) {
            int var6;
            for (var6 = 0; var6 < this.field3065; ++var6) {
                field3079[var6] = 0;
            }

            var6 = var3 ? 20 : 5;

            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            int var15;
            int var16;
            int var18;
            for (char var7 = 0; var7 < this.field3042; ++var7) {
                if (this.field3048[var7] != -2) {
                    var8 = this.field3057[var7];
                    var9 = this.field3044[var7];
                    var10 = this.field3102[var7];
                    var11 = field3071[var8];
                    var12 = field3071[var9];
                    var13 = field3071[var10];
                    int var17;
                    int var33;
                    if (var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
                        var33 = field3075[var8];
                        var15 = field3075[var9];
                        var16 = field3075[var10];
                        var17 = field3076[var8];
                        var18 = field3076[var9];
                        int var19 = field3076[var10];
                        int var20 = field3082[var8];
                        int var21 = field3082[var9];
                        int var22 = field3082[var10];
                        var33 -= var15;
                        var16 -= var15;
                        var17 -= var18;
                        var19 -= var18;
                        var20 -= var21;
                        var22 -= var21;
                        int var23 = var17 * var22 - var20 * var19;
                        int var24 = var20 * var16 - var33 * var22;
                        int var25 = var33 * var19 - var17 * var16;
                        if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                            field3070[var7] = true;
                            int var26 = (field3074[var8] + field3074[var9] + field3074[var10]) / 3 + this.field3089;
                            field3080[var26][field3079[var26]++] = var7;
                        }
                    } else {
                        if (var2) {
                            var15 = field3072[var8];
                            var16 = field3072[var9];
                            var17 = field3072[var10];
                            var18 = class368.field2630 + var6;
                            boolean var14;
                            if (var18 < var15 && var18 < var16 && var18 < var17) {
                                var14 = false;
                            } else {
                                var18 = class368.field2630 - var6;
                                if (var18 > var15 && var18 > var16 && var18 > var17) {
                                    var14 = false;
                                } else {
                                    var18 = var6 + class368.field2627;
                                    if (var18 < var11 && var18 < var12 && var18 < var13) {
                                        var14 = false;
                                    } else {
                                        var18 = class368.field2627 - var6;
										var14 = var18 <= var11 || var18 <= var12 || var18 <= var13;
                                    }
                                }
                            }

                            if (var14) {
                                class368.field2636[++class368.field2634 - 1] = var4;
                                var2 = false;
                            }
                        }

                        if ((var11 - var12) * (field3072[var10] - field3072[var9]) - (field3072[var8] - field3072[var9]) * (var13 - var12) > 0) {
                            field3070[var7] = false;
                            var33 = class334.method1577();
							field3069[var7] = var11 < 0 || var12 < 0 || var13 < 0 || var11 > var33 || var12 > var33 || var13 > var33;

                            var15 = (field3074[var8] + field3074[var9] + field3074[var10]) / 3 + this.field3089;
                            field3080[var15][field3079[var15]++] = var7;
                        }
                    }
                }
            }

            int var27;
            char var28;
            char[] var29;
            if (this.field3101 == null) {
                for (var27 = this.field3065 - 1; var27 >= 0; --var27) {
                    var28 = field3079[var27];
                    if (var28 > 0) {
                        var29 = field3080[var27];

                        for (var10 = 0; var10 < var28; ++var10) {
                            this.method2042(var29[var10]);
                        }
                    }
                }

            } else {
                for (var27 = 0; var27 < 12; ++var27) {
                    field3081[var27] = 0;
                    field3085[var27] = 0;
                }

                for (var27 = this.field3065 - 1; var27 >= 0; --var27) {
                    var28 = field3079[var27];
                    if (var28 > 0) {
                        var29 = field3080[var27];

                        for (var10 = 0; var10 < var28; ++var10) {
                            char var30 = var29[var10];
                            byte var31 = this.field3101[var30];
                            var13 = field3081[var31]++;
                            field3078[var31][var13] = var30;
                            if (var31 < 10) {
                                int[] var36 = field3085;
                                var36[var31] += var27;
                            } else if (var31 == 10) {
                                field3083[var13] = var27;
                            } else {
                                field3039[var13] = var27;
                            }
                        }
                    }
                }

                var27 = 0;
                if (field3081[1] > 0 || field3081[2] > 0) {
                    var27 = (field3085[1] + field3085[2]) / (field3081[1] + field3081[2]);
                }

                var8 = 0;
                if (field3081[3] > 0 || field3081[4] > 0) {
                    var8 = (field3085[3] + field3085[4]) / (field3081[3] + field3081[4]);
                }

                var9 = 0;
                if (field3081[6] > 0 || field3081[8] > 0) {
                    var9 = (field3085[6] + field3085[8]) / (field3081[6] + field3081[8]);
                }

                var11 = 0;
                var12 = field3081[10];
                int[] var32 = field3078[10];
                int[] var34 = field3083;
                if (0 == var12) {
                    var11 = 0;
                    var12 = field3081[11];
                    var32 = field3078[11];
                    var34 = field3039;
                }

                if (0 < var12) {
                    var10 = var34[0];
                } else {
                    var10 = -1000;
                }

                for (var15 = 0; var15 < 10; ++var15) {
                    while (var15 == 0 && var10 > var27) {
                        this.method2042(var32[var11++]);
                        if (var11 == var12 && var32 != field3078[11]) {
                            var11 = 0;
                            var12 = field3081[11];
                            var32 = field3078[11];
                            var34 = field3039;
                        }

                        if (var11 < var12) {
                            var10 = var34[var11];
                        } else {
                            var10 = -1000;
                        }
                    }

                    while (var15 == 3 && var10 > var8) {
                        this.method2042(var32[var11++]);
                        if (var11 == var12 && var32 != field3078[11]) {
                            var11 = 0;
                            var12 = field3081[11];
                            var32 = field3078[11];
                            var34 = field3039;
                        }

                        if (var11 < var12) {
                            var10 = var34[var11];
                        } else {
                            var10 = -1000;
                        }
                    }

                    while (var15 == 5 && var10 > var9) {
                        this.method2042(var32[var11++]);
                        if (var11 == var12 && var32 != field3078[11]) {
                            var11 = 0;
                            var12 = field3081[11];
                            var32 = field3078[11];
                            var34 = field3039;
                        }

                        if (var11 < var12) {
                            var10 = var34[var11];
                        } else {
                            var10 = -1000;
                        }
                    }

                    var16 = field3081[var15];
                    int[] var35 = field3078[var15];

                    for (var18 = 0; var18 < var16; ++var18) {
                        this.method2042(var35[var18]);
                    }
                }

                while (var10 != -1000) {
                    this.method2042(var32[var11++]);
                    if (var11 == var12 && var32 != field3078[11]) {
                        var11 = 0;
                        var32 = field3078[11];
                        var12 = field3081[11];
                        var34 = field3039;
                    }

                    if (var11 < var12) {
                        var10 = var34[var11];
                    } else {
                        var10 = -1000;
                    }
                }

            }
        }
    }

    final void method2042(int var1) {
        if (field3070[var1]) {
            this.method2064(var1);
        } else {
            int var2 = this.field3057[var1];
            int var3 = this.field3044[var1];
            int var4 = this.field3102[var1];
            class334.field2431.field2608 = field3069[var1];
            if (this.field3050 == null) {
                class334.field2431.field2611 = 0;
            } else {
                class334.field2431.field2611 = (this.field3050[var1] == -1 ? 253 : this.field3050[var1]) & 255;
            }

            this.method2072(var1, field3072[var2], field3072[var3], field3072[var4], field3071[var2], field3071[var3], field3071[var4], field3077[var2], field3077[var3], field3077[var4], this.field3046[var1], this.field3047[var1], this.field3048[var1]);
        }
    }

    boolean method2063(int var1) {
        return this.field3104 > 0 && var1 < this.field3105;
    }

    final void method2072(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
        if (this.field3052 != null && this.field3052[var1] != -1) {
            int var15;
            int var16;
            int var18;
            if (this.field3051 != null && this.field3051[var1] != -1) {
                int var17 = this.field3051[var1] & 255;
                var18 = this.field3055[var17];
                var15 = this.field3056[var17];
                var16 = this.field3049[var17];
            } else {
                var18 = this.field3057[var1];
                var15 = this.field3044[var1];
                var16 = this.field3102[var1];
            }

            if (this.field3048[var1] == -1) {
                class334.method1583(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field3075[var18], field3075[var15], field3075[var16], field3076[var18], field3076[var15], field3076[var16], field3082[var18], field3082[var15], field3082[var16], this.field3052[var1]);
            } else {
                class334.method1583(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field3075[var18], field3075[var15], field3075[var16], field3076[var18], field3076[var15], field3076[var16], field3082[var18], field3082[var15], field3082[var16], this.field3052[var1]);
            }
        } else {
            boolean var14 = this.method2063(var1);
            if (this.field3048[var1] == -1 && var14) {
                class334.method1591(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3097[this.field3046[var1]], this.field3098, this.field3068, this.field3066, this.field3104);
            } else if (this.field3048[var1] == -1) {
                class334.method1592(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3097[this.field3046[var1]]);
            } else if (var14) {
                class334.method1589(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.field3098, this.field3068, this.field3066, this.field3104);
            } else {
                class334.method1585(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
            }
        }

    }

    final void method2064(int var1) {
        int var2 = class334.method1571();
        int var3 = class334.method1572();
        int var4 = 0;
        int var5 = this.field3057[var1];
        int var6 = this.field3044[var1];
        int var7 = this.field3102[var1];
        int var8 = field3082[var5];
        int var9 = field3082[var6];
        int var10 = field3082[var7];
        if (this.field3050 == null) {
            class334.field2431.field2611 = 0;
        } else {
            class334.field2431.field2611 = this.field3050[var1] & 255;
        }

        int var11;
        int var12;
        int var13;
        int var14;
        if (var8 >= 50) {
            field3086[0] = field3071[var5];
            field3087[0] = field3072[var5];
            field3091[0] = field3077[var7];
            ++var4;
            field3088[0] = this.field3046[var1];
        } else {
            var11 = field3075[var5];
            var12 = field3076[var5];
            var13 = this.field3046[var1];
            if (var10 >= 50) {
                var14 = (50 - var8) * field3061[var10 - var8];
                field3086[0] = var2 + (var11 + ((field3075[var7] - var11) * var14 >> 16)) * class334.method1576() / 50;
                field3087[0] = var3 + (var12 + ((field3076[var7] - var12) * var14 >> 16)) * class334.method1576() / 50;
                field3091[0] = field3100;
                ++var4;
                field3088[0] = var13 + ((this.field3048[var1] - var13) * var14 >> 16);
            }

            if (var9 >= 50) {
                var14 = (50 - var8) * field3061[var9 - var8];
                field3086[var4] = var2 + (var11 + ((field3075[var6] - var11) * var14 >> 16)) * class334.method1576() / 50;
                field3087[var4] = var3 + (var12 + ((field3076[var6] - var12) * var14 >> 16)) * class334.method1576() / 50;
                field3091[var4] = field3100;
                field3088[var4++] = var13 + ((this.field3047[var1] - var13) * var14 >> 16);
            }
        }

        if (var9 >= 50) {
            field3086[var4] = field3071[var6];
            field3087[var4] = field3072[var6];
            field3091[var4] = field3077[var7];
            field3088[var4++] = this.field3047[var1];
        } else {
            var11 = field3075[var6];
            var12 = field3076[var6];
            var13 = this.field3047[var1];
            if (var8 >= 50) {
                var14 = (50 - var9) * field3061[var8 - var9];
                field3086[var4] = var2 + (var11 + ((field3075[var5] - var11) * var14 >> 16)) * class334.method1576() / 50;
                field3087[var4] = var3 + (var12 + ((field3076[var5] - var12) * var14 >> 16)) * class334.method1576() / 50;
                field3091[var4] = field3100;
                field3088[var4++] = var13 + ((this.field3046[var1] - var13) * var14 >> 16);
            }

            if (var10 >= 50) {
                var14 = (50 - var9) * field3061[var10 - var9];
                field3086[var4] = var2 + (var11 + ((field3075[var7] - var11) * var14 >> 16)) * class334.method1576() / 50;
                field3087[var4] = var3 + (var12 + ((field3076[var7] - var12) * var14 >> 16)) * class334.method1576() / 50;
                field3088[var4++] = var13 + ((this.field3048[var1] - var13) * var14 >> 16);
            }
        }

        if (var10 >= 50) {
            field3086[var4] = field3071[var7];
            field3087[var4] = field3072[var7];
            field3091[var4] = field3077[var7];
            field3088[var4++] = this.field3048[var1];
        } else {
            var11 = field3075[var7];
            var12 = field3076[var7];
            var13 = this.field3048[var1];
            if (var9 >= 50) {
                var14 = (50 - var10) * field3061[var9 - var10];
                field3086[var4] = var2 + (var11 + ((field3075[var6] - var11) * var14 >> 16)) * class334.method1576() / 50;
                field3087[var4] = var3 + (var12 + ((field3076[var6] - var12) * var14 >> 16)) * class334.method1576() / 50;
                field3091[var4] = field3100;
                field3088[var4++] = var13 + ((this.field3047[var1] - var13) * var14 >> 16);
            }

            if (var8 >= 50) {
                var14 = (50 - var10) * field3061[var8 - var10];
                field3086[var4] = var2 + (var11 + ((field3075[var5] - var11) * var14 >> 16)) * class334.method1576() / 50;
                field3087[var4] = var3 + (var12 + ((field3076[var5] - var12) * var14 >> 16)) * class334.method1576() / 50;
                field3091[var4] = field3100;
                field3088[var4++] = var13 + ((this.field3046[var1] - var13) * var14 >> 16);
            }
        }

        var11 = field3086[0];
        var12 = field3086[1];
        var13 = field3086[2];
        var14 = field3087[0];
        int var15 = field3087[1];
        int var16 = field3087[2];
        float var17 = field3091[0];
        float var18 = field3091[1];
        float var19 = field3091[2];
        class334.field2431.field2608 = false;
        int var20 = class334.method1577();
        if (var4 == 3) {
            if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
                class334.field2431.field2608 = true;
            }

            this.method2072(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field3088[0], field3088[1], field3088[2]);
        }

        if (var4 == 4) {
            if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field3086[3] < 0 || field3086[3] > var20) {
                class334.field2431.field2608 = true;
            }

            int var22;
            if (this.field3052 != null && this.field3052[var1] != -1) {
                int var23;
                int var25;
                if (this.field3051 != null && this.field3051[var1] != -1) {
                    int var24 = this.field3051[var1] & 255;
                    var25 = this.field3055[var24];
                    var22 = this.field3056[var24];
                    var23 = this.field3049[var24];
                } else {
                    var25 = var5;
                    var22 = var6;
                    var23 = var7;
                }

                short var26 = this.field3052[var1];
                if (this.field3048[var1] == -1) {
                    class334.method1583(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.field3046[var1], this.field3046[var1], this.field3046[var1], field3075[var25], field3075[var22], field3075[var23], field3076[var25], field3076[var22], field3076[var23], field3082[var25], field3082[var22], field3082[var23], var26);
                    class334.method1583(var14, var16, field3087[3], var11, var13, field3086[3], var17, var19, field3091[3], this.field3046[var1], this.field3046[var1], this.field3046[var1], field3075[var25], field3075[var22], field3075[var23], field3076[var25], field3076[var22], field3076[var23], field3082[var25], field3082[var22], field3082[var23], var26);
                } else {
                    class334.method1583(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3088[0], field3088[1], field3088[2], field3075[var25], field3075[var22], field3075[var23], field3076[var25], field3076[var22], field3076[var23], field3082[var25], field3082[var22], field3082[var23], var26);
                    class334.method1583(var14, var16, field3087[3], var11, var13, field3086[3], var17, var19, field3091[3], field3088[0], field3088[2], field3088[3], field3075[var25], field3075[var22], field3075[var23], field3076[var25], field3076[var22], field3076[var23], field3082[var25], field3082[var22], field3082[var23], var26);
                }
            } else {
                boolean var21 = this.method2063(var1);
                if (this.field3048[var1] == -1 && var21) {
                    var22 = field3097[this.field3046[var1]];
                    class334.method1591(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.field3098, this.field3068, this.field3066, this.field3104);
                    class334.method1591(var14, var16, field3087[3], var11, var13, field3086[3], var17, var19, field3091[3], var22, this.field3098, this.field3068, this.field3066, this.field3104);
                } else if (this.field3048[var1] == -1) {
                    var22 = field3097[this.field3046[var1]];
                    class334.method1592(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
                    class334.method1592(var14, var16, field3087[3], var11, var13, field3086[3], var17, var19, field3091[3], var22);
                } else if (var21) {
                    class334.method1589(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3088[0], field3088[1], field3088[2], this.field3098, this.field3066, this.field3068, this.field3104);
                    class334.method1589(var14, var16, field3087[3], var11, var13, field3086[3], 0.0F, 0.0F, 0.0F, field3088[0], field3088[2], field3088[3], this.field3098, this.field3066, this.field3068, this.field3104);
                } else {
                    class334.method1585(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3088[0], field3088[1], field3088[2]);
                    class334.method1585(var14, var16, field3087[3], var11, var13, field3086[3], var17, var19, field3091[3], field3088[0], field3088[2], field3088[3]);
                }
            }
        }

    }

    void method2065(int var1, class534 var2) {
        float var3 = (float) this.field3040[var1];
        float var4 = (float) (-this.field3041[var1]);
        float var5 = (float) (-this.field3045[var1]);
        float var6 = 1.0F;
        this.field3040[var1] = (int) (var2.field4249[0] * var3 + var2.field4249[4] * var4 + var2.field4249[8] * var5 + var2.field4249[12] * var6);
        this.field3041[var1] = -((int) (var2.field4249[1] * var3 + var2.field4249[5] * var4 + var2.field4249[9] * var5 + var2.field4249[13] * var6));
        this.field3045[var1] = -((int) (var2.field4249[2] * var3 + var2.field4249[6] * var4 + var2.field4249[10] * var5 + var2.field4249[14] * var6));
    }

    void method2069(class139 var1, int var2) {
        if (this.field3060 != null) {
            for (int var3 = 0; var3 < this.field3094; ++var3) {
                int[] var4 = this.field3060[var3];
                if (var4 != null && var4.length != 0) {
                    int[] var5 = this.field3084[var3];
                    field3036.method2563();

                    for (int var6 = 0; var6 < var4.length; ++var6) {
                        int var7 = var4[var6];
                        class321 var8 = var1.method643(var7);
                        if (var8 != null) {
                            field3037.method2564((float) var5[var6] / 255.0F);
                            field3038.method2569(var8.method1413(var2));
                            field3038.method2572(field3037);
                            field3036.method2566(field3038);
                        }
                    }

                    this.method2065(var3, field3036);
                }
            }

        }
    }
}
