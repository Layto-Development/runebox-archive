public class class304 extends class510 {
    public static boolean field2224;
    public static class289 field2204;
    public static class68 field2176;
    public static class68 field2178;
    static class175[] field2203;
    static class289 field2177;
    static class289 field2180;
    static class289 field2198;

    static {
        field2224 = false;
        field2177 = new class289(4096);
        field2204 = new class289(500);
        field2180 = new class289(30);
        field2198 = new class289(30);
        field2203 = new class175[4];
    }

    public boolean field2179;
    public boolean field2193;
    public boolean field2201;
    public boolean field2206;
    public boolean field2207;
    public int field2175;
    public int field2182;
    public int field2190;
    public int field2192;
    public int field2196;
    public int field2199;
    public int field2202;
    public int field2208;
    public int field2209;
    public int field2215;
    public int field2219;
    public int field2220;
    public int field2221;
    public int field2222;
    public int[] field2213;
    public int[] field2216;
    public String field2185;
    public String[] field2194;
    boolean field2181;
    boolean field2205;
    boolean field2214;
    class208 field2225;
    int field2174;
    int field2187;
    int field2191;
    int field2195;
    int field2200;
    int field2210;
    int field2211;
    int field2212;
    int field2217;
    int field2218;
    int field2223;
    int[] field2183;
    int[] field2184;
    short[] field2186;
    short[] field2188;
    short[] field2189;
    short[] field2197;

    class304() {
        this.field2185 = class32.field483;
        this.field2190 = 1;
        this.field2175 = 1;
        this.field2192 = 2;
        this.field2193 = true;
        this.field2199 = -1;
        this.field2195 = -1;
        this.field2181 = false;
        this.field2201 = false;
        this.field2202 = -1;
        this.field2196 = 16;
        this.field2200 = 0;
        this.field2174 = 0;
        this.field2194 = new String[5];
        this.field2209 = -1;
        this.field2208 = -1;
        this.field2205 = false;
        this.field2206 = true;
        this.field2191 = 128;
        this.field2187 = 128;
        this.field2223 = 128;
        this.field2210 = 0;
        this.field2211 = 0;
        this.field2212 = 0;
        this.field2179 = false;
        this.field2214 = false;
        this.field2215 = -1;
        this.field2217 = -1;
        this.field2218 = -1;
        this.field2219 = -1;
        this.field2220 = 0;
        this.field2221 = 0;
        this.field2222 = 0;
        this.field2207 = true;
    }

    void method1339() {
        if (this.field2199 == -1) {
            this.field2199 = 0;
            if (this.field2183 != null && (null == this.field2184 || this.field2184[0] == 10)) {
                this.field2199 = 1;
            }

            for (int var2 = 0; var2 < 5; ++var2) {
                if (null != this.field2194[var2]) {
                    this.field2199 = 1;
                    break;
                }
            }
        }

        if (this.field2215 == -1) {
            this.field2215 = this.field2192 != 0 ? 1 : 0;
        }

    }

    void method1349(class78 var1) {
        while (true) {
            int var3 = var1.method260();
            if (var3 == 0) {
                return;
            }

            this.method1340(var1, var3);
        }
    }

    void method1340(class78 var1, int var2) {
        int var4;
        int var5;
        if (var2 == 1) {
            var4 = var1.method260();
            if (var4 > 0) {
                if (null != this.field2183 && !field2224) {
                    var1.field697 += var4 * 3;
                } else {
                    this.field2184 = new int[var4];
                    this.field2183 = new int[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        this.field2183[var5] = var1.method309();
                        this.field2184[var5] = var1.method260();
                    }
                }
            }
        } else if (var2 == 2) {
            this.field2185 = var1.method268();
        } else if (var2 == 5) {
            var4 = var1.method260();
            if (var4 > 0) {
                if (null != this.field2183 && !field2224) {
                    var1.field697 += var4 * 2;
                } else {
                    this.field2184 = null;
                    this.field2183 = new int[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        this.field2183[var5] = var1.method309();
                    }
                }
            }
        } else if (var2 == 14) {
            this.field2190 = var1.method260();
        } else if (var2 == 15) {
            this.field2175 = var1.method260();
        } else if (var2 == 17) {
            this.field2192 = 0;
            this.field2193 = false;
        } else if (var2 == 18) {
            this.field2193 = false;
        } else if (var2 == 19) {
            this.field2199 = var1.method260();
        } else if (var2 == 21) {
            this.field2195 = 0;
        } else if (var2 == 22) {
            this.field2181 = true;
        } else if (var2 == 23) {
            this.field2201 = true;
        } else if (var2 == 24) {
            this.field2202 = var1.method309();
            if (this.field2202 == 65535) {
                this.field2202 = -1;
            }
        } else if (var2 == 27) {
            this.field2192 = 1;
        } else if (var2 == 28) {
            this.field2196 = var1.method260();
        } else if (var2 == 29) {
            this.field2200 = var1.method261();
        } else if (var2 == 39) {
            this.field2174 = var1.method261() * 25;
        } else if (var2 >= 30 && var2 < 35) {
            this.field2194[var2 - 30] = var1.method268();
            if (this.field2194[var2 - 30].equalsIgnoreCase(class32.field425)) {
                this.field2194[var2 - 30] = null;
            }
        } else if (var2 == 40) {
            var4 = var1.method260();
            this.field2186 = new short[var4];
            this.field2197 = new short[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field2186[var5] = (short) var1.method309();
                this.field2197[var5] = (short) var1.method309();
            }
        } else if (var2 == 41) {
            var4 = var1.method260();
            this.field2188 = new short[var4];
            this.field2189 = new short[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field2188[var5] = (short) var1.method309();
                this.field2189[var5] = (short) var1.method309();
            }
        } else if (var2 == 61) {
            var1.method309();
        } else if (var2 == 62) {
            this.field2205 = true;
        } else if (var2 == 64) {
            this.field2206 = false;
        } else if (var2 == 65) {
            this.field2191 = var1.method309();
        } else if (var2 == 66) {
            this.field2187 = var1.method309();
        } else if (var2 == 67) {
            this.field2223 = var1.method309();
        } else if (var2 == 68) {
            this.field2208 = var1.method309();
        } else if (var2 == 69) {
            var1.method260();
        } else if (var2 == 70) {
            this.field2210 = var1.method262();
        } else if (var2 == 71) {
            this.field2211 = var1.method262();
        } else if (var2 == 72) {
            this.field2212 = var1.method262();
        } else if (var2 == 73) {
            this.field2179 = true;
        } else if (var2 == 74) {
            this.field2214 = true;
        } else if (var2 == 75) {
            this.field2215 = var1.method260();
        } else if (var2 != 77 && var2 != 92) {
            if (var2 == 78) {
                this.field2219 = var1.method309();
                this.field2220 = var1.method260();
            } else if (var2 == 79) {
                this.field2221 = var1.method309();
                this.field2222 = var1.method309();
                this.field2220 = var1.method260();
                var4 = var1.method260();
                this.field2213 = new int[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field2213[var5] = var1.method309();
                }
            } else if (var2 == 81) {
                this.field2195 = var1.method260() * 256;
            } else if (var2 == 82) {
                this.field2209 = var1.method309();
            } else if (var2 == 89) {
                this.field2207 = false;
            } else if (var2 == 249) {
                this.field2225 = class381.method1774(var1, this.field2225);
            }
        } else {
            this.field2217 = var1.method309();
            if (this.field2217 == 65535) {
                this.field2217 = -1;
            }

            this.field2218 = var1.method309();
            if (this.field2218 == 65535) {
                this.field2218 = -1;
            }

            var4 = -1;
            if (var2 == 92) {
                var4 = var1.method309();
                if (var4 == 65535) {
                    var4 = -1;
                }
            }

            var5 = var1.method260();
            this.field2216 = new int[var5 + 2];

            for (int var6 = 0; var6 <= var5; ++var6) {
                this.field2216[var6] = var1.method309();
                if (this.field2216[var6] == 65535) {
                    this.field2216[var6] = -1;
                }
            }

            this.field2216[var5 + 1] = var4;
        }

    }

    public final boolean method1341(int var1) {
        if (null != this.field2184) {
            for (int var5 = 0; var5 < this.field2184.length; ++var5) {
                if (this.field2184[var5] == var1) {
                    return field2176.method190(this.field2183[var5] & 65535, 0);
                }
            }

            return true;
        } else if (this.field2183 == null) {
            return true;
        } else if (var1 != 10) {
            return true;
        } else {
            boolean var3 = true;

            for (int var4 = 0; var4 < this.field2183.length; ++var4) {
                var3 &= field2176.method190(this.field2183[var4] & 65535, 0);
            }

            return var3;
        }
    }

    public final boolean method1342() {
        if (this.field2183 == null) {
            return true;
        } else {
            boolean var2 = true;

            for (int var3 = 0; var3 < this.field2183.length; ++var3) {
                var2 &= field2176.method190(this.field2183[var3] & 65535, 0);
            }

            return var2;
        }
    }

    public final class490 method1343(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
        long var8;
        if (null == this.field2184) {
            var8 = var2 + ((long) this.field2182 << 10);
        } else {
            var8 = var2 + ((long) var1 << 3) + ((long) this.field2182 << 10);
        }

        Object var10 = field2180.method1307(var8);
        if (null == var10) {
            class175 var11 = this.method1350(var1, var2);
            if (var11 == null) {
                return null;
            }

            if (!this.field2181) {
                var10 = var11.method846(this.field2200 + 64, this.field2174 + 768, -50, -10, -50);
            } else {
                var11.field1507 = (short) (this.field2200 + 64);
                var11.field1496 = (short) (768 + this.field2174);
                var11.method842();
                var10 = var11;
            }

            field2180.method1306((class510) var10, var8);
        }

        if (this.field2181) {
            var10 = ((class175) var10).method831();
        }

        if (this.field2195 >= 0) {
            if (var10 instanceof class448) {
                var10 = ((class448) var10).method2043(var3, var4, var5, var6, true, this.field2195);
            } else if (var10 instanceof class175) {
                var10 = ((class175) var10).method832(var3, var4, var5, var6, true, this.field2195);
            }
        }

        return (class490) var10;
    }

    public final class448 method1345(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
        long var8;
        if (this.field2184 == null) {
            var8 = var2 + ((long) this.field2182 << 10);
        } else {
            var8 = var2 + ((long) this.field2182 << 10) + ((long) var1 << 3);
        }

        class448 var10 = (class448) field2198.method1307(var8);
        if (null == var10) {
            class175 var11 = this.method1350(var1, var2);
            if (var11 == null) {
                return null;
            }

            var10 = var11.method846(this.field2200 + 64, 768 + this.field2174, -50, -10, -50);
            field2198.method1306(var10, var8);
        }

        if (this.field2195 >= 0) {
            var10 = var10.method2043(var3, var4, var5, var6, true, this.field2195);
        }

        return var10;
    }

    public final class448 method1344(int var1, int var2, int[][] var3, int var4, int var5, int var6, class124 var7, int var8) {
        long var10;
        if (this.field2184 == null) {
            var10 = ((long) this.field2182 << 10) + var2;
        } else {
            var10 = ((long) this.field2182 << 10) + ((long) var1 << 3) + var2;
        }

        class448 var12 = (class448) field2198.method1307(var10);
        if (null == var12) {
            class175 var13 = this.method1350(var1, var2);
            if (var13 == null) {
                return null;
            }

            var12 = var13.method846(this.field2200 + 64, 768 + this.field2174, -50, -10, -50);
            field2198.method1306(var12, var10);
        }

        if (var7 == null && this.field2195 == -1) {
            return var12;
        } else {
            if (var7 != null) {
                var12 = var7.method565(var12, var8, var2);
            } else {
                var12 = var12.method2044(true);
            }

            if (this.field2195 >= 0) {
                var12 = var12.method2043(var3, var4, var5, var6, false, this.field2195);
            }

            return var12;
        }
    }

    final class175 method1350(int var1, int var2) {
        class175 var4 = null;
        boolean var5;
        int var6;
        int var8;
        if (this.field2184 == null) {
            if (var1 != 10) {
                return null;
            }

            if (this.field2183 == null) {
                return null;
            }

            var5 = this.field2205;
            if (var1 == 2 && var2 > 3) {
                var5 = !var5;
            }

            var6 = this.field2183.length;

            for (int var7 = 0; var7 < var6; ++var7) {
                var8 = this.field2183[var7];
                if (var5) {
                    var8 += 65536;
                }

                var4 = (class175) field2204.method1307(var8);
                if (var4 == null) {
                    var4 = class175.method850(field2176, var8 & 65535, 0);
                    if (null == var4) {
                        return null;
                    }

                    if (var5) {
                        var4.method839();
                    }

                    field2204.method1306(var4, var8);
                }

                if (var6 > 1) {
                    field2203[var7] = var4;
                }
            }

            if (var6 > 1) {
                var4 = new class175(field2203, var6);
            }
        } else {
            int var9 = -1;

            for (var6 = 0; var6 < this.field2184.length; ++var6) {
                if (this.field2184[var6] == var1) {
                    var9 = var6;
                    break;
                }
            }

            if (var9 == -1) {
                return null;
            }

            var6 = this.field2183[var9];
            boolean var10 = this.field2205 ^ var2 > 3;
            if (var10) {
                var6 += 65536;
            }

            var4 = (class175) field2204.method1307(var6);
            if (var4 == null) {
                var4 = class175.method850(field2176, var6 & 65535, 0);
                if (null == var4) {
                    return null;
                }

                if (var10) {
                    var4.method839();
                }

                field2204.method1306(var4, var6);
            }
        }

        var5 = this.field2191 != 128 || this.field2187 != 128 || this.field2223 != 128;

        boolean var11;
        var11 = this.field2210 != 0 || this.field2211 != 0 || this.field2212 != 0;

        class175 var12 = new class175(var4, var2 == 0 && !var5 && !var11, this.field2186 == null, null == this.field2188, true);
        if (var1 == 4 && var2 > 3) {
            var12.method837(256);
            var12.method838(45, 0, -45);
        }

        var2 &= 3;
        if (var2 == 1) {
            var12.method834();
        } else if (var2 == 2) {
            var12.method835();
        } else if (var2 == 3) {
            var12.method836();
        }

        if (null != this.field2186) {
            for (var8 = 0; var8 < this.field2186.length; ++var8) {
                var12.method849(this.field2186[var8], this.field2197[var8]);
            }
        }

        if (this.field2188 != null) {
            for (var8 = 0; var8 < this.field2188.length; ++var8) {
                var12.method840(this.field2188[var8], this.field2189[var8]);
            }
        }

        if (var5) {
            var12.method841(this.field2191, this.field2187, this.field2223);
        }

        if (var11) {
            var12.method838(this.field2210, this.field2211, this.field2212);
        }

        return var12;
    }

    public final class304 method1346() {
        int var2 = -1;
        if (this.field2217 != -1) {
            var2 = class10.method20(this.field2217);
        } else if (this.field2218 != -1) {
            var2 = class10.field46[this.field2218];
        }

        int var3;
        if (var2 >= 0 && var2 < this.field2216.length - 1) {
            var3 = this.field2216[var2];
        } else {
            var3 = this.field2216[this.field2216.length - 1];
        }

        return var3 != -1 ? class192.method892(var3, (byte) 25) : null;
    }

    public int method1347(int var1, int var2) {
        return class381.method1773(this.field2225, var1, var2);
    }

    public String method1348(int var1, String var2) {
        class208 var5 = this.field2225;
        String var4;
        if (var5 == null) {
            var4 = var2;
        } else {
            class371 var6 = (class371) var5.method990(var1);
            if (var6 == null) {
                var4 = var2;
            } else {
                var4 = (String) var6.field2646;
            }
        }

        return var4;
    }

    public boolean method1351() {
        if (this.field2216 == null) {
            return this.field2219 != -1 || this.field2213 != null;
        } else {
            for (int var2 = 0; var2 < this.field2216.length; ++var2) {
                if (this.field2216[var2] != -1) {
                    class304 var3 = class192.method892(this.field2216[var2], (byte) -30);
                    if (var3.field2219 != -1 || var3.field2213 != null) {
                        return true;
                    }
                }
            }

            return false;
        }
    }
}
