import java.util.*;

public class class100 {
    static final class24 field946;
    static final class24 field947;
    static final class24 field994;

    static {
        field946 = class24.field125;
        field947 = class24.field131;
        field994 = class24.field124;
    }

    final int[] field995;
    public boolean field943;
    boolean field970;
    boolean field981;
    boolean field986;
    class193 field956;
    class258 field969;
    class331 field993;
    class387 field955;
    class387 field963;
    class387 field972;
    class413 field949;
    class539[] field983;
    class68 field945;
    class68 field951;
    class68 field992;
    class90 field957;
    float field950;
    float field962;
    int field944;
    int field953;
    int field954;
    int field958;
    int field959;
    int field960;
    int field961;
    int field964;
    int field965;
    int field966;
    int field967;
    int field968;
    int field973;
    int field974;
    int field975;
    int field976;
    int field977;
    int field979;
    int field980;
    int field990;
    int field991;
    int field996;
    int field997;
    HashMap<String, class387> field985;
    HashMap<class529, class413> field989;
    HashSet<Integer> field942;
    HashSet<Integer> field952;
    HashSet<Integer> field971;
    HashSet<Integer> field982;
    HashSet<Integer> field984;
    HashSet<class369> field987;
    Iterator<class369> field948;
    List<class369> field988;
    long field978;

    public class100() {
        this.field960 = -1;
        this.field953 = -1;
        this.field964 = -1;
        this.field965 = -1;
        this.field966 = -1;
        this.field967 = -1;
        this.field968 = 3;
        this.field958 = 50;
        this.field970 = false;
        this.field971 = null;
        this.field961 = -1;
        this.field973 = -1;
        this.field974 = -1;
        this.field975 = -1;
        this.field976 = -1;
        this.field977 = -1;
        this.field981 = true;
        this.field982 = new HashSet<Integer>();
        this.field952 = new HashSet<>();
        this.field984 = new HashSet<Integer>();
        this.field942 = new HashSet<>();
        this.field986 = false;
        this.field944 = 0;
        this.field995 = new int[]{1008, 1009, 1010, 1011, 1012};
        this.field987 = new HashSet<>();
        this.field969 = null;
        this.field943 = false;
        this.field991 = -1;
        this.field996 = -1;
        this.field997 = -1;
    }

    public void method431(class68 var1, class68 var2, class68 var3, class413 var4, HashMap<class24, class413> var5, class539[] var6) {
        this.field983 = var6;
        this.field992 = var1;
        this.field951 = var2;
        this.field945 = var3;
        this.field949 = var4;
        this.field989 = new HashMap<>();
        this.field989.put(class529.field4220, var5.get(field946));
        this.field989.put(class529.field4215, var5.get(field947));
        this.field989.put(class529.field4214, var5.get(field994));
        this.field957 = new class90(var1);
        int var8 = this.field992.method213(class263.field1950.field1949);
        int[] var9 = this.field992.method199(var8);
        int var10 = var9 == null ? 0 : var9.length;
        this.field985 = new HashMap<String, class387>(var10);

        for (int var11 = 0; var11 < var10; ++var11) {
            class78 var12 = new class78(this.field992.method188(var8, var9[var11]));
            class387 var13 = new class387();
            var13.method1785(var12, var9[var11]);
            this.field985.put(var13.method1794(), var13);
            if (var13.method1788()) {
                this.field963 = var13;
            }
        }

        this.method444(this.field963);
        this.field955 = null;
    }

    public void method432() {
        class147.method706();
    }

    public void method480(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
        if (this.field957.method353()) {
            this.method435();
            this.method436();
            if (var3) {
                int var9 = (int) Math.ceil((float) var6 / this.field962);
                int var10 = (int) Math.ceil((float) var7 / this.field962);
                List<class369> var11 = this.field956.method898(this.field979 - var9 / 2 - 1, this.field959 - var10 / 2 - 1, var9 / 2 + this.field979 + 1, this.field959 + var10 / 2 + 1, var4, var5, var6, var7, var1, var2);
                HashSet<class369> var12 = new HashSet<>();

                Iterator<class369> var13;
                class369 var14;
                class26 var15;
                class16 var16;
                for (var13 = var11.iterator(); var13.hasNext(); class269.method1200(var15)) {
                    var14 = var13.next();
                    var12.add(var14);
                    var15 = new class26();
                    var16 = new class16(var14.method1743(), var14.field2638, var14.field2637);
                    var15.method78(new Object[]{var16, var1, var2});
                    if (this.field987.contains(var14)) {
                        var15.method76(17);
                    } else {
                        var15.method76(15);
                    }
                }

                var13 = this.field987.iterator();

                while (var13.hasNext()) {
                    var14 = var13.next();
                    if (!var12.contains(var14)) {
                        var15 = new class26();
                        var16 = new class16(var14.method1743(), var14.field2638, var14.field2637);
                        var15.method78(new Object[]{var16, var1, var2});
                        var15.method76(16);
                        class269.method1200(var15);
                    }
                }

                this.field987 = var12;
            }
        }
    }

    public void method434(int var1, int var2, boolean var3, boolean var4) {
        long var6;
        label33:
        {
            var6 = class206.method982();
            this.method487(var1, var2, var4, var6);
            if (!this.method479() && (var4 || var3)) {
                boolean var8 = Client.field3959 != null;
                if (!var8) {
                    if (var4) {
                        this.field976 = var1;
                        this.field977 = var2;
                        this.field974 = this.field979;
                        this.field975 = this.field959;
                    }

                    if (this.field974 != -1) {
                        int var9 = var1 - this.field976;
                        int var10 = var2 - this.field977;
                        this.method447(this.field974 - (int) ((float) var9 / this.field950), this.field975 + (int) ((float) var10 / this.field950), false);
                    }
                    break label33;
                }
            }

            this.method483();
        }

        if (var4) {
            this.field978 = var6;
            this.field990 = var1;
            this.field954 = var2;
        }

    }

    void method487(int var1, int var2, boolean var3, long var4) {
        if (this.field972 != null) {
            int var6 = (int) ((float) this.field979 + ((float) (var1 - this.field966) - (float) this.method460() * this.field962 / 2.0F) / this.field962);
            int var7 = (int) ((float) this.field959 - ((float) (var2 - this.field967) - (float) this.method461() * this.field962 / 2.0F) / this.field962);
            this.field969 = this.field972.method1787(var6 + this.field972.method1793() * 64, var7 + this.field972.method1802() * 64);
            if (null != this.field969 && var3) {
                class199 var8 = Client.method2443();
                boolean var9 = Client.field3863 >= 2;
                if (var9 && var8.method958(82) && var8.method958(81)) {
                    Client.method2375(this.field969.field1929, this.field969.field1931, this.field969.field1930, false);
                } else {
                    boolean var10 = true;
                    if (this.field981) {
                        int var11 = var1 - this.field990;
                        int var12 = var2 - this.field954;
                        if (var4 - this.field978 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
                            var10 = false;
                        }
                    }

                    if (var10) {
                        class46 var13 = class46.method134(class488.field3574, Client.field3840.field2238);
                        var13.field541.method315(this.field969.method1144());
                        Client.field3840.method1359(var13);
                        this.field978 = 0L;
                    }
                }
            }
        } else {
            this.field969 = null;
        }

    }

    void method435() {
        if (null != class62.field617) {
            this.field962 = this.field950;
        } else {
            if (this.field962 < this.field950) {
                this.field962 = Math.min(this.field950, this.field962 / 30.0F + this.field962);
            }

            if (this.field962 > this.field950) {
                this.field962 = Math.max(this.field950, this.field962 - this.field962 / 30.0F);
            }

        }
    }

    void method436() {
        if (this.method479()) {
            int var2 = this.field960 - this.field979;
            int var3 = this.field953 - this.field959;
            if (var2 != 0) {
                var2 /= Math.min(8, Math.abs(var2));
            }

            if (var3 != 0) {
                var3 /= Math.min(8, Math.abs(var3));
            }

            this.method447(this.field979 + var2, var3 + this.field959, true);
            if (this.field960 == this.field979 && this.field953 == this.field959) {
                this.field960 = -1;
                this.field953 = -1;
            }

        }
    }

    final void method447(int var1, int var2, boolean var3) {
        this.field979 = var1;
        this.field959 = var2;
        class206.method982();
        if (var3) {
            this.method483();
        }

    }

    final void method483() {
        this.field977 = -1;
        this.field976 = -1;
        this.field975 = -1;
        this.field974 = -1;
    }

    boolean method479() {
        return this.field960 != -1 && this.field953 != -1;
    }

    public class387 method439(int var1, int var2, int var3) {
        Iterator<class387> var5 = this.field985.values().iterator();

        class387 var6;
        do {
            if (!var5.hasNext()) {
                return null;
            }

            var6 = var5.next();
        } while (!var6.method1786(var1, var2, var3));

        return var6;
    }

    public void method437(int var1, int var2, int var3, boolean var4) {
        class387 var6 = this.method439(var1, var2, var3);
        if (null == var6) {
            if (!var4) {
                return;
            }

            var6 = this.field963;
        }

        boolean var7 = false;
        if (this.field955 != var6 || var4) {
            this.field955 = var6;
            this.method444(var6);
            var7 = true;
        }

        if (var7 || var4) {
            this.method484(var1, var2, var3);
        }

    }

    public void method441(int var1) {
        class387 var3 = this.method476(var1);
        if (var3 != null) {
            this.method444(var3);
        }

    }

    public int method442() {
        return null == this.field972 ? -1 : this.field972.method1795();
    }

    public class387 method443() {
        return this.field972;
    }

    void method444(class387 var1) {
        if (this.field972 == null || this.field972 != var1) {
            this.method445(var1);
            this.method484(-1, -1, -1);
        }
    }

    void method445(class387 var1) {
        this.field972 = var1;
        this.field956 = new class193(this.field983, this.field989, this.field951, this.field945);
        this.field957.method351(this.field972 == null ? null : this.field972.method1794());
    }

    public void method446(class387 var1, class258 var2, class258 var3, boolean var4) {
        if (null != var1) {
            if (null == this.field972 || var1 != this.field972) {
                this.method445(var1);
            }

            if (!var4 && this.field972.method1786(var2.field1930, var2.field1929, var2.field1931)) {
                this.method484(var2.field1930, var2.field1929, var2.field1931);
            } else {
                this.method484(var3.field1930, var3.field1929, var3.field1931);
            }

        }
    }

    void method484(int var1, int var2, int var3) {
        if (null != this.field972) {
            int[] var5 = this.field972.method1799(var1, var2, var3);
            if (null == var5) {
                var5 = this.field972.method1799(this.field972.method1796(), this.field972.method1803(), this.field972.method1797());
            }

            this.method447(var5[0] - this.field972.method1793() * 64, var5[1] - this.field972.method1802() * 64, true);
            this.field960 = -1;
            this.field953 = -1;
            this.field962 = this.method451(this.field972.method1792());
            this.field950 = this.field962;
            this.field988 = null;
            this.field948 = null;
            this.field956.method902();
        }
    }

    public void method488(int var1, int var2, int var3, int var4, int var5) {
        int[] var7 = new int[4];
        class415.method1910(var7);
        class415.method1921(var1, var2, var3 + var1, var4 + var2);
        class415.method1914(var1, var2, var3, var4, -16777216);
        int var8 = this.field957.method354();
        if (var8 < 100) {
            this.method459(var1, var2, var3, var4, var8);
        } else {
            if (!this.field956.method900()) {
                this.field956.method894(this.field992, this.field972.method1794(), Client.field3802);
                if (!this.field956.method900()) {
                    return;
                }
            }

            if (this.field971 != null) {
                ++this.field973;
                if (this.field973 % this.field958 == 0) {
                    this.field973 = 0;
                    ++this.field961;
                }

                if (this.field961 >= this.field968 && !this.field970) {
                    this.field971 = null;
                }
            }

            int var9 = (int) Math.ceil((float) var3 / this.field962);
            int var10 = (int) Math.ceil((float) var4 / this.field962);
            this.field956.method895(this.field979 - var9 / 2, this.field959 - var10 / 2, this.field979 + var9 / 2, this.field959 + var10 / 2, var1, var2, var3 + var1, var2 + var4);
            boolean var11;
            if (!this.field986) {
                var11 = false;
                if (var5 - this.field944 > 100) {
                    this.field944 = var5;
                    var11 = true;
                }

                this.field956.method896(this.field979 - var9 / 2, this.field959 - var10 / 2, this.field979 + var9 / 2, var10 / 2 + this.field959, var1, var2, var3 + var1, var4 + var2, this.field942, this.field971, this.field973, this.field958, var11);
            }

            this.method449(var1, var2, var3, var4, var9, var10);
            var11 = Client.field3863 >= 2;
            if (var11 && this.field943 && null != this.field969) {
                this.field949.method949("Coord: " + this.field969, class415.field2908 + 10, class415.field2909 + 20, 16776960, -1);
            }

            this.field964 = var9;
            this.field965 = var10;
            this.field966 = var1;
            this.field967 = var2;
            class415.method1930(var7);
        }
    }

    boolean method485(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (null == this.field993) {
            return true;
        } else if (var1 == this.field993.field2423 && this.field993.field2419 == var2) {
            if (this.field980 != this.field956.field1595) {
                return true;
            } else if (Client.field3898 != this.field997) {
                return true;
            } else if (var3 <= 0 && var4 <= 0) {
                return var1 + var3 < var5 || var4 + var2 < var6;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    void method449(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (null != class62.field617) {
            int var8 = 512 / (this.field956.field1595 * 2);
            int var9 = var3 + 512;
            int var10 = var4 + 512;
            float var11 = 1.0F;
            var9 = (int) ((float) var9 / var11);
            var10 = (int) ((float) var10 / var11);
            int var12 = this.method458() - var5 / 2 - var8;
            int var13 = this.method481() - var6 / 2 - var8;
            int var14 = var1 - this.field956.field1595 * (var12 + var8 - this.field991);
            int var15 = var2 - (var8 - (var13 - this.field996)) * this.field956.field1595;
            if (this.method485(var9, var10, var14, var15, var3, var4)) {
                if (this.field993 != null && var9 == this.field993.field2423 && var10 == this.field993.field2419) {
                    Arrays.fill(this.field993.field2422, 0);
                } else {
                    this.field993 = new class331(var9, var10);
                }

                this.field991 = this.method458() - var5 / 2 - var8;
                this.field996 = this.method481() - var6 / 2 - var8;
                this.field980 = this.field956.field1595;
                class62.field617.method1641(this.field991, this.field996, this.field993, (float) this.field980 / var11);
                this.field997 = Client.field3898;
                var14 = var1 - this.field956.field1595 * (var8 + var12 - this.field991);
                var15 = var2 - this.field956.field1595 * (var8 - (var13 - this.field996));
            }

            class415.method1913(var1, var2, var3, var4, 0, 128);
            if (var11 == 1.0F) {
                this.field993.method1567(var14, var15, 192);
            } else {
                this.field993.method1553(var14, var15, (int) ((float) var9 * var11), (int) (var11 * (float) var10), 192);
            }
        }

    }

    public void method478(int var1, int var2, int var3, int var4) {
        if (this.field957.method353()) {
            if (!this.field956.method900()) {
                this.field956.method894(this.field992, this.field972.method1794(), Client.field3802);
                if (!this.field956.method900()) {
                    return;
                }
            }

            this.field956.method897(var1, var2, var3, var4, this.field971, this.field973, this.field958);
        }
    }

    public void method450(int var1) {
        this.field950 = this.method451(var1);
    }

    void method459(int var1, int var2, int var3, int var4, int var5) {
        boolean var7 = true;
        int var8 = var3 / 2 + var1;
        int var9 = var2 + var4 / 2 - 18 - 20;
        class415.method1914(var1, var2, var3, var4, -16777216);
        class415.method1917(var8 - 152, var9, 304, 34, -65536);
        class415.method1914(var8 - 150, var9 + 2, var5 * 3, 30, -65536);
        this.field949.method928(class32.field322, var8, 20 + var9, -1, -1);
    }

    float method451(int var1) {
        if (var1 == 25) {
            return 1.0F;
        } else if (var1 == 37) {
            return 1.5F;
        } else if (var1 == 50) {
            return 2.0F;
        } else if (var1 == 75) {
            return 3.0F;
        } else {
            return var1 == 100 ? 4.0F : 8.0F;
        }
    }

    public int method452() {
        if ((double) this.field950 == 1.0D) {
            return 25;
        } else if (1.5D == (double) this.field950) {
            return 37;
        } else if ((double) this.field950 == 2.0D) {
            return 50;
        } else if (3.0D == (double) this.field950) {
            return 75;
        } else {
            return 4.0D == (double) this.field950 ? 100 : 200;
        }
    }

    public void method453() {
        this.field957.method352();
    }

    public boolean method482() {
        return this.field957.method353();
    }

    public class387 method476(int var1) {
        Iterator<class387> var3 = this.field985.values().iterator();

        class387 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }

            var4 = var3.next();
        } while (var4.method1795() != var1);

        return var4;
    }

    public void method454(int var1, int var2) {
        if (this.field972 != null && this.field972.method1789(var1, var2)) {
            this.field960 = var1 - this.field972.method1793() * 64;
            this.field953 = var2 - this.field972.method1802() * 64;
        }
    }

    public void method455(int var1, int var2) {
        if (this.field972 != null) {
            this.method447(var1 - this.field972.method1793() * 64, var2 - this.field972.method1802() * 64, true);
            this.field960 = -1;
            this.field953 = -1;
        }
    }

    public void method456(int var1, int var2, int var3) {
        if (this.field972 != null) {
            int[] var5 = this.field972.method1799(var1, var2, var3);
            if (null != var5) {
                this.method454(var5[0], var5[1]);
            }

        }
    }

    public void method457(int var1, int var2, int var3) {
        if (null != this.field972) {
            int[] var5 = this.field972.method1799(var1, var2, var3);
            if (null != var5) {
                this.method455(var5[0], var5[1]);
            }

        }
    }

    public int method458() {
        return null == this.field972 ? -1 : this.field979 + this.field972.method1793() * 64;
    }

    public int method481() {
        return this.field972 == null ? -1 : this.field959 + this.field972.method1802() * 64;
    }

    public class258 method438() {
        return null == this.field972 ? null : this.field972.method1787(this.method458(), this.method481());
    }

    public int method460() {
        return this.field964;
    }

    public int method461() {
        return this.field965;
    }

    public void method462(int var1) {
        if (var1 >= 1) {
            this.field968 = var1;
        }

    }

    public void method463() {
        this.field968 = 3;
    }

    public void method464(int var1) {
        if (var1 >= 1) {
            this.field958 = var1;
        }

    }

    public void method465() {
        this.field958 = 50;
    }

    public void method466(boolean var1) {
        this.field970 = var1;
    }

    public void method448(int var1) {
        this.field971 = new HashSet<Integer>();
        this.field971.add(var1);
        this.field961 = 0;
        this.field973 = 0;
    }

    public void method467(int var1) {
        this.field971 = new HashSet<Integer>();
        this.field961 = 0;
        this.field973 = 0;

        for (int var3 = 0; var3 < class192.field1556; ++var3) {
            if (class192.method893(var3) != null && class192.method893(var3).field1576 == var1) {
                this.field971.add(class192.method893(var3).field1562);
            }
        }

    }

    public void method468() {
        this.field971 = null;
    }

    public void method469(boolean var1) {
        this.field986 = !var1;
    }

    public void method477(int var1, boolean var2) {
        if (!var2) {
            this.field982.add(var1);
        } else {
            this.field982.remove(var1);
        }

        this.method472();
    }

    public void method440(int var1, boolean var2) {
        if (!var2) {
            this.field952.add(var1);
        } else {
            this.field952.remove(var1);
        }

        for (int var4 = 0; var4 < class192.field1556; ++var4) {
            if (class192.method893(var4) != null && class192.method893(var4).field1576 == var1) {
                int var5 = class192.method893(var4).field1562;
                if (!var2) {
                    this.field984.add(var5);
                } else {
                    this.field984.remove(var5);
                }
            }
        }

        this.method472();
    }

    public boolean method470() {
        return !this.field986;
    }

    public boolean method486(int var1) {
        return !this.field982.contains(var1);
    }

    public boolean method471(int var1) {
        return !this.field952.contains(var1);
    }

    void method472() {
        this.field942.clear();
        this.field942.addAll(this.field982);
        this.field942.addAll(this.field984);
    }

    public void method473(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (this.field957.method353()) {
            int var8 = (int) Math.ceil((float) var3 / this.field962);
            int var9 = (int) Math.ceil((float) var4 / this.field962);
            List<class369> var10 = this.field956.method898(this.field979 - var8 / 2 - 1, this.field959 - var9 / 2 - 1, var8 / 2 + this.field979 + 1, 1 + this.field959 + var9 / 2, var1, var2, var3, var4, var5, var6);
            if (!var10.isEmpty()) {
                Iterator<class369> var11 = var10.iterator();

                boolean var14;
                do {
                    if (!var11.hasNext()) {
                        return;
                    }

                    class369 var12 = var11.next();
                    class192 var13 = class192.method893(var12.method1743());
                    var14 = false;

                    for (int var15 = this.field995.length - 1; var15 >= 0; --var15) {
                        if (null != var13.field1566[var15]) {
                            Client.method2473(var13.field1566[var15], var13.field1558, this.field995[var15], var12.method1743(), var12.field2638.method1144(), var12.field2637.method1144());
                            var14 = true;
                        }
                    }
                } while (!var14);

            }
        }
    }

    public class258 method474(int var1, class258 var2) {
        if (!this.field957.method353()) {
            return null;
        } else if (!this.field956.method900()) {
            return null;
        } else if (!this.field972.method1789(var2.field1929, var2.field1931)) {
            return null;
        } else {
            HashMap<Integer, LinkedList<class369>> var4 = this.field956.method901();
            List<class369> var5 = var4.get(var1);
            if (null != var5 && !var5.isEmpty()) {
                class369 var6 = null;
                int var7 = -1;
                Iterator<class369> var8 = var5.iterator();

                while (true) {
                    class369 var9;
                    int var12;
                    do {
                        if (!var8.hasNext()) {
                            return var6.field2637;
                        }

                        var9 = var8.next();
                        int var10 = var9.field2637.field1929 - var2.field1929;
                        int var11 = var9.field2637.field1931 - var2.field1931;
                        var12 = var10 * var10 + var11 * var11;
                        if (var12 == 0) {
                            return var9.field2637;
                        }
                    } while (var12 >= var7 && null != var6);

                    var6 = var9;
                    var7 = var12;
                }
            } else {
                return null;
            }
        }
    }

    public void method489(int var1, int var2, class258 var3, class258 var4) {
        class26 var6 = new class26();
        class16 var7 = new class16(var2, var3, var4);
        var6.method78(new Object[]{var7});
        switch (var1) {
            case 1008:
                var6.method76(10);
                break;
            case 1009:
                var6.method76(11);
                break;
            case 1010:
                var6.method76(12);
                break;
            case 1011:
                var6.method76(13);
                break;
            case 1012:
                var6.method76(14);
        }

        class269.method1200(var6);
    }

    public class369 method433() {
        if (!this.field957.method353()) {
            return null;
        } else if (!this.field956.method900()) {
            return null;
        } else {
            HashMap<Integer, LinkedList<class369>> var2 = this.field956.method901();
            this.field988 = new LinkedList<>();
            Iterator<LinkedList<class369>> var3 = var2.values().iterator();

            while (var3.hasNext()) {
                List<class369> var4 = var3.next();
                this.field988.addAll(var4);
            }

            this.field948 = this.field988.iterator();
            return this.method475();
        }
    }

    public class369 method475() {
        if (null == this.field948) {
            return null;
        } else {
            class369 var2;
            do {
                if (!this.field948.hasNext()) {
                    return null;
                }

                var2 = this.field948.next();
            } while (var2.method1743() == -1);

            return var2;
        }
    }
}
