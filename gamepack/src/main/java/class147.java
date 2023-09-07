import java.util.*;
import java.util.Map.Entry;

public class class147 {
    static class250 field1295;

    static {
        field1295 = new class250(37748736, 256);
    }

    final HashMap<class529, class413> field1294;
    class248 field1296;
    int field1291;
    int field1297;
    int field1298;
    int field1300;
    HashMap field1299;
    LinkedList<class123> field1293;
    List field1292;

    class147(int var1, int var2, int var3, HashMap<class529, class413> var4) {
        this.field1300 = var1;
        this.field1291 = var2;
        this.field1293 = new LinkedList<class123>();
        this.field1292 = new LinkedList();
        this.field1299 = new HashMap();
        this.field1297 = var3 | -16777216;
        this.field1294 = var4;
    }

    static class331 method707(int var0, int var1, int var2) {
        class250 var4 = field1295;
        long var5 = (long) var2 << 16 | (long) var0 << 8 | var1;
        return (class331) var4.method1117(var5);
    }

    public static void method706() {
        field1295.method1121(5);
    }

    void method699(int var1, int var2, int var3) {
        class331 var5 = method707(this.field1300, this.field1291, this.field1298);
        if (var5 != null) {
            if (var3 == this.field1298 * 64) {
                var5.method1543(var1, var2);
            } else {
                var5.method1559(var1, var2, var3, var3);
            }

        }
    }

    void method701(class248 var1, List<class405> var2) {
        this.field1299.clear();
        this.field1296 = var1;
        this.method700(var2);
    }

    void method672(HashSet<class123> var1, List<class405> var2) {
        this.field1299.clear();
        Iterator<class123> var4 = var1.iterator();

        while (var4.hasNext()) {
            class123 var5 = var4.next();
            if (var5.method1239() == this.field1300 && var5.method1240() == this.field1291) {
                this.field1293.add(var5);
            }
        }

        this.method700(var2);
    }

    void method673(int var1, int var2, int var3, int var4, class275 var5) {
        for (int var7 = var1; var7 < var1 + var3; ++var7) {
            label65:
            for (int var8 = var2; var8 < var4 + var2; ++var8) {
                for (int var9 = 0; var9 < var5.field2010; ++var9) {
                    class455[] var10 = var5.field2017[var9][var7][var8];
                    if (var10 != null && var10.length != 0) {
                        class455[] var11 = var10;

                        for (int var12 = 0; var12 < var11.length; ++var12) {
                            class304 var14;
                            boolean var15;
                            label56:
                            {
                                class455 var13 = var11[var12];
                                var14 = class192.method892(var13.field3138, (byte) -78);
                                if (var14.field2216 != null) {
                                    int[] var16 = var14.field2216;

                                    for (int var17 = 0; var17 < var16.length; ++var17) {
                                        int var18 = var16[var17];
                                        class304 var19 = class192.method892(var18, (byte) -65);
                                        if (var19.field2209 != -1) {
                                            var15 = true;
                                            break label56;
                                        }
                                    }
                                } else if (var14.field2209 != -1) {
                                    var15 = true;
                                    break label56;
                                }

                                var15 = false;
                            }

                            if (var15) {
                                this.method697(var14, var9, var7, var8, var5);
                                continue label65;
                            }
                        }
                    }
                }
            }
        }

    }

    void method697(class304 var1, int var2, int var3, int var4, class275 var5) {
        class258 var7 = new class258(var2, var3 + this.field1300 * 64, var4 + this.field1291 * 64);
        class258 var8 = null;
        if (this.field1296 != null) {
            var8 = new class258(this.field1296.field2009 + var2, this.field1296.field2014 * 64 + var3, var4 + this.field1296.field2012 * 64);
        } else {
            class123 var9 = (class123) var5;
            var8 = new class258(var9.field2009 + var2, var3 + var9.field2014 * 64 + var9.method560() * 8, var4 + var9.field2012 * 64 + var9.method561() * 8);
        }

        class192 var10;
        Object var11;
        if (null != var1.field2216) {
            var11 = new class25(var8, var7, var1.field2182, this);
        } else {
            var10 = class192.method893(var1.field2209);
            var11 = new class405(var8, var7, var10.field1562, this.method690(var10));
        }

        var10 = class192.method893(((class369) var11).method1743());
        if (var10.field1564) {
            this.field1299.put(new class258(0, var3, var4), var11);
        }

    }

    void method675() {
        Iterator var2 = this.field1299.values().iterator();

        while (var2.hasNext()) {
            class369 var3 = (class369) var2.next();
            if (var3 instanceof class25) {
                ((class25) var3).method75();
            }
        }

    }

    void method700(List<class405> var1) {
        Iterator<class405> var3 = var1.iterator();

        while (var3.hasNext()) {
            class405 var4 = var3.next();
            if (class192.method893(var4.field2865).field1564 && var4.field2637.field1929 >> 6 == this.field1300 && this.field1291 == var4.field2637.field1931 >> 6) {
                class405 var5 = new class405(var4.field2637, var4.field2637, var4.field2865, this.method704(var4.field2865));
                this.field1292.add(var5);
            }
        }

    }

    void method676() {
        if (null != this.field1296) {
            this.field1296.method1235();
        } else {
            Iterator<class123> var2 = this.field1293.iterator();

            while (var2.hasNext()) {
                class123 var3 = var2.next();
                var3.method1235();
            }
        }

    }

    boolean method698(class68 var1) {
        this.field1299.clear();
        if (null != this.field1296) {
            this.field1296.method1234(var1);
            if (this.field1296.method1233()) {
                this.method673(0, 0, 64, 64, this.field1296);
                return true;
            } else {
                return false;
            }
        } else {
            boolean var3 = true;

            Iterator<class123> var4;
            class123 var5;
            for (var4 = this.field1293.iterator(); var4.hasNext(); var3 &= var5.method1233()) {
                var5 = var4.next();
                var5.method1234(var1);
            }

            if (var3) {
                var4 = this.field1293.iterator();

                while (var4.hasNext()) {
                    var5 = var4.next();
                    this.method673(var5.method559() * 8, var5.method558() * 8, 8, 8, var5);
                }
            }

            return var3;
        }
    }

    void method702(int var1, class76 var2, class539[] var3, class68 var4, class68 var5) {
        this.field1298 = var1;
        if (this.field1296 != null || !this.field1293.isEmpty()) {
            if (method707(this.field1300, this.field1291, var1) == null) {
                boolean var7 = true;
                var7 = this.method698(var4);
                int var9;
                if (null != this.field1296) {
                    var9 = this.field1296.field2016;
                } else {
                    var9 = this.field1293.getFirst().field2016;
                }

                var7 &= var5.method192(var9);
                if (var7) {
                    byte[] var8 = var5.method195(var9);
                    class393 var10;
                    if (null == var8) {
                        var10 = new class393();
                    } else {
                        var10 = new class393(class458.method2117(var8).field2422);
                    }

                    class331 var12 = new class331(this.field1298 * 64, this.field1298 * 64);
                    var12.method1537();
                    if (this.field1296 != null) {
                        this.method680(var2, var3, var10);
                    } else {
                        this.method681(var2, var3, var10);
                    }

                    int var13 = this.field1300;
                    int var14 = this.field1291;
                    int var15 = this.field1298;
                    class250 var16 = field1295;
                    long var18 = (long) var15 << 16 | (long) var13 << 8 | var14;
                    var16.method1120(var12, var18, 4 * var12.field2422.length);
                    this.method676();
                }
            }
        }
    }

    void method678(int var1, int var2, int var3, HashSet<Integer> var4) {
        if (var4 == null) {
            var4 = new HashSet<>();
        }

        this.method686(var1, var2, var4, var3);
        this.method694(var1, var2, var4, var3);
    }

    void method679(HashSet<Integer> var1, int var2, int var3) {
        Iterator var5 = this.field1299.values().iterator();

        while (var5.hasNext()) {
            class369 var6 = (class369) var5.next();
            if (var6.method1745()) {
                int var7 = var6.method1743();
                if (var1.contains(var7)) {
                    class192 var8 = class192.method893(var7);
                    this.method696(var8, var6.field2639, var6.field2640, var2, var3);
                }
            }
        }

        this.method695(var1, var2, var3);
    }

    void method680(class76 var1, class539[] var2, class393 var3) {
        int var5;
        int var6;
        for (var5 = 0; var5 < 64; ++var5) {
            for (var6 = 0; var6 < 64; ++var6) {
                this.method682(var5, var6, this.field1296, var1, var3);
                this.method683(var5, var6, this.field1296, var1);
            }
        }

        for (var5 = 0; var5 < 64; ++var5) {
            for (var6 = 0; var6 < 64; ++var6) {
                this.method705(var5, var6, this.field1296, var1, var2);
            }
        }

    }

    void method681(class76 var1, class539[] var2, class393 var3) {
        Iterator<class123> var5 = this.field1293.iterator();

        class123 var6;
        int var7;
        int var8;
        while (var5.hasNext()) {
            var6 = var5.next();

            for (var7 = var6.method559() * 8; var7 < var6.method559() * 8 + 8; ++var7) {
                for (var8 = var6.method558() * 8; var8 < var6.method558() * 8 + 8; ++var8) {
                    this.method682(var7, var8, var6, var1, var3);
                    this.method683(var7, var8, var6, var1);
                }
            }
        }

        var5 = this.field1293.iterator();

        while (var5.hasNext()) {
            var6 = var5.next();

            for (var7 = var6.method559() * 8; var7 < var6.method559() * 8 + 8; ++var7) {
                for (var8 = var6.method558() * 8; var8 < var6.method558() * 8 + 8; ++var8) {
                    this.method705(var7, var8, var6, var1, var2);
                }
            }
        }

    }

    void method705(int var1, int var2, class275 var3, class76 var4, class539[] var5) {
        this.method703(var1, var2, var3);
        this.method685(var1, var2, var3, var5);
    }

    void method682(int var1, int var2, class275 var3, class76 var4, class393 var5) {
        int var7 = var3.field2013[0][var1][var2] - 1;
        int var8 = var3.field2011[0][var1][var2] - 1;
        if (var7 == -1 && var8 == -1) {
            class415.method1914(var1 * this.field1298, (63 - var2) * this.field1298, this.field1298, this.field1298, this.field1297);
        }

        int var9 = 16711935;
        int var10;
        if (var8 != -1) {
            int var11 = this.field1297;
            class475 var13 = (class475) class475.field3404.method1307(var8);
            class475 var12;
            if (var13 != null) {
                var12 = var13;
            } else {
                byte[] var14 = class475.field3409.method188(4, var8);
                var13 = new class475();
                if (null != var14) {
                    var13.method2179(new class78(var14), var8);
                }

                var13.method2178();
                class475.field3404.method1306(var13, var8);
                var12 = var13;
            }

            if (null == var12) {
                var10 = var11;
            } else {
                int var15;
                int var16;
                if (var12.field3401 >= 0) {
                    var16 = class419.method1936(var12.field3406, var12.field3405, var12.field3407);
                    var15 = class57.method172(var16, 96);
                    var10 = class334.field2426[var15] | -16777216;
                } else if (var12.field3397 >= 0) {
                    var16 = class57.method172(class334.field2431.field2606.method1332(var12.field3397), 96);
                    var10 = class334.field2426[var16] | -16777216;
                } else if (var12.field3398 == 16711935) {
                    var10 = var11;
                } else {
                    var16 = class419.method1936(var12.field3402, var12.field3403, var12.field3408);
                    var15 = class57.method172(var16, 96);
                    var10 = class334.field2426[var15] | -16777216;
                }
            }

            var9 = var10;
        }

        if (var8 > -1 && var3.field2020[0][var1][var2] == 0) {
            class415.method1914(this.field1298 * var1, this.field1298 * (63 - var2), this.field1298, this.field1298, var9);
        } else {
            var10 = this.method684(var1, var2, var3, var5);
            if (var8 == -1) {
                class415.method1914(var1 * this.field1298, (63 - var2) * this.field1298, this.field1298, this.field1298, var10);
            } else {
                var4.method244(var1 * this.field1298, this.field1298 * (63 - var2), var10, var9, this.field1298, this.field1298, var3.field2020[0][var1][var2], var3.field2007[0][var1][var2]);
            }
        }
    }

    void method683(int var1, int var2, class275 var3, class76 var4) {
        for (int var6 = 1; var6 < var3.field2010; ++var6) {
            int var7 = var3.field2011[var6][var1][var2] - 1;
            if (var7 > -1) {
                int var9 = this.field1297;
                class475 var11 = (class475) class475.field3404.method1307(var7);
                class475 var10;
                if (var11 != null) {
                    var10 = var11;
                } else {
                    byte[] var12 = class475.field3409.method188(4, var7);
                    var11 = new class475();
                    if (var12 != null) {
                        var11.method2179(new class78(var12), var7);
                    }

                    var11.method2178();
                    class475.field3404.method1306(var11, var7);
                    var10 = var11;
                }

                int var8;
                if (var10 == null) {
                    var8 = var9;
                } else {
                    int var13;
                    int var14;
                    if (var10.field3401 >= 0) {
                        var14 = class419.method1936(var10.field3406, var10.field3405, var10.field3407);
                        var13 = class57.method172(var14, 96);
                        var8 = class334.field2426[var13] | -16777216;
                    } else if (var10.field3397 >= 0) {
                        var14 = class57.method172(class334.field2431.field2606.method1332(var10.field3397), 96);
                        var8 = class334.field2426[var14] | -16777216;
                    } else if (var10.field3398 == 16711935) {
                        var8 = var9;
                    } else {
                        var14 = class419.method1936(var10.field3402, var10.field3403, var10.field3408);
                        var13 = class57.method172(var14, 96);
                        var8 = class334.field2426[var13] | -16777216;
                    }
                }

                if (var3.field2020[var6][var1][var2] == 0) {
                    class415.method1914(var1 * this.field1298, this.field1298 * (63 - var2), this.field1298, this.field1298, var8);
                } else {
                    var4.method244(this.field1298 * var1, this.field1298 * (63 - var2), 0, var8, this.field1298, this.field1298, var3.field2020[var6][var1][var2], var3.field2007[var6][var1][var2]);
                }
            }
        }

    }

    int method684(int var1, int var2, class275 var3, class393 var4) {
        return var3.field2013[0][var1][var2] == 0 ? this.field1297 : var4.method1817(var1, var2);
    }

    void method685(int var1, int var2, class275 var3, class539[] var4) {
        for (int var6 = 0; var6 < var3.field2010; ++var6) {
            class455[] var7 = var3.field2017[var6][var1][var2];
            if (null != var7 && var7.length != 0) {
                class455[] var8 = var7;

                for (int var9 = 0; var9 < var8.length; ++var9) {
                    class455 var10 = var8[var9];
                    if (!class319.method1400(var10.field3137)) {
                        int var12 = var10.field3137;
                        boolean var11 = class319.field2311.field2297 == var12;
                        if (!var11) {
                            continue;
                        }
                    }

                    class304 var13 = class192.method892(var10.field3138, (byte) -44);
                    if (var13.field2208 != -1) {
                        if (var13.field2208 != 46 && var13.field2208 != 52) {
                            var4[var13.field2208].method2589(this.field1298 * var1, (63 - var2) * this.field1298, this.field1298 * 2, this.field1298 * 2);
                        } else {
                            var4[var13.field2208].method2589(var1 * this.field1298, (63 - var2) * this.field1298, this.field1298 * 2 + 1, 1 + this.field1298 * 2);
                        }
                    }
                }
            }
        }

    }

    void method703(int var1, int var2, class275 var3) {
        for (int var5 = 0; var5 < var3.field2010; ++var5) {
            class455[] var6 = var3.field2017[var5][var1][var2];
            if (var6 != null && var6.length != 0) {
                class455[] var7 = var6;

                for (int var8 = 0; var8 < var7.length; ++var8) {
                    class455 var9 = var7[var8];
                    if (class319.method1399(var9.field3137)) {
                        class304 var10 = class192.method892(var9.field3138, (byte) -62);
                        int var11 = var10.field2199 != 0 ? -3407872 : -3355444;
                        if (class319.field2294.field2297 == var9.field3137) {
                            this.method693(var1, var2, var9.field3139, var11);
                        }

                        if (var9.field3137 == class319.field2291.field2297) {
                            this.method693(var1, var2, var9.field3139, -3355444);
                            this.method693(var1, var2, var9.field3139 + 1, var11);
                        }

                        if (var9.field3137 == class319.field2292.field2297) {
                            if (var9.field3139 == 0) {
                                class415.method1925(var1 * this.field1298, this.field1298 * (63 - var2), 1, var11);
                            }

                            if (var9.field3139 == 1) {
                                class415.method1925(var1 * this.field1298 + this.field1298 - 1, this.field1298 * (63 - var2), 1, var11);
                            }

                            if (var9.field3139 == 2) {
                                class415.method1925(this.field1298 * var1 + this.field1298 - 1, (63 - var2) * this.field1298 + this.field1298 - 1, 1, var11);
                            }

                            if (var9.field3139 == 3) {
                                class415.method1925(var1 * this.field1298, this.field1298 + this.field1298 * (63 - var2) - 1, 1, var11);
                            }
                        }

                        if (var9.field3137 == class319.field2310.field2297) {
                            int var12 = var9.field3139 % 2;
                            int var13;
                            if (var12 == 0) {
                                for (var13 = 0; var13 < this.field1298; ++var13) {
                                    class415.method1925(var13 + var1 * this.field1298, (64 - var2) * this.field1298 - 1 - var13, 1, var11);
                                }
                            } else {
                                for (var13 = 0; var13 < this.field1298; ++var13) {
                                    class415.method1925(var13 + var1 * this.field1298, this.field1298 * (63 - var2) + var13, 1, var11);
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    void method686(int var1, int var2, HashSet<Integer> var3, int var4) {
        float var6 = (float) var4 / 64.0F;
        float var7 = var6 / 2.0F;
        Iterator var8 = this.field1299.entrySet().iterator();

        while (var8.hasNext()) {
            Entry var9 = (Entry) var8.next();
            class258 var10 = (class258) var9.getKey();
            int var11 = (int) ((float) var1 + var6 * (float) var10.field1929 - var7);
            int var12 = (int) ((float) (var4 + var2) - var6 * (float) var10.field1931 - var7);
            class369 var13 = (class369) var9.getValue();
            if (var13 != null && var13.method1745()) {
                var13.field2639 = var11;
                var13.field2640 = var12;
                class192 var14 = class192.method893(var13.method1743());
                if (!var3.contains(var14.method891())) {
                    this.method674(var13, var11, var12, var6);
                }
            }
        }

    }

    void method695(HashSet<Integer> var1, int var2, int var3) {
        Iterator var5 = this.field1292.iterator();

        while (var5.hasNext()) {
            class369 var6 = (class369) var5.next();
            if (var6.method1745()) {
                class192 var7 = class192.method893(var6.method1743());
                if (var7 != null && var1.contains(var7.method891())) {
                    this.method696(var7, var6.field2639, var6.field2640, var2, var3);
                }
            }
        }

    }

    void method696(class192 var1, int var2, int var3, int var4, int var5) {
        class331 var7 = var1.method889(false);
        if (null != var7) {
            var7.method1563(var2 - var7.field2423 / 2, var3 - var7.field2419 / 2);
            if (var4 % var5 < var5 / 2) {
                class415.method1912(var2, var3, 15, 16776960, 128);
                class415.method1912(var2, var3, 7, 16777215, 256);
            }

        }
    }

    void method674(class369 var1, int var2, int var3, float var4) {
        class192 var6 = class192.method893(var1.method1743());
        this.method687(var6, var2, var3);
        this.method688(var1, var6, var2, var3, var4);
    }

    void method687(class192 var1, int var2, int var3) {
        class331 var5 = var1.method889(false);
        if (null != var5) {
            int var6 = this.method677(var5, var1.field1579);
            int var7 = this.method689(var5, var1.field1574);
            var5.method1563(var2 + var6, var3 + var7);
        }

    }

    void method688(class369 var1, class192 var2, int var3, int var4, float var5) {
        class341 var7 = var1.method1748();
        if (null != var7) {
            if (var7.field2455.method2521(var5)) {
                class413 var8 = this.field1294.get(var7.field2455);
                var8.method920(var7.field2453, var3 - var7.field2456 / 2, var4, var7.field2456, var7.field2454, -16777216 | var2.field1568, 0, 1, 0, var8.field1617 / 2);
            }
        }
    }

    void method694(int var1, int var2, HashSet<Integer> var3, int var4) {
        float var6 = (float) var4 / 64.0F;
        Iterator var7 = this.field1292.iterator();

        while (var7.hasNext()) {
            class369 var8 = (class369) var7.next();
            if (var8.method1745()) {
                int var9 = var8.field2637.field1929 % 64;
                int var10 = var8.field2637.field1931 % 64;
                var8.field2639 = (int) ((float) var1 + var6 * (float) var9);
                var8.field2640 = (int) (var6 * (float) (63 - var10) + (float) var2);
                if (!var3.contains(var8.method1743())) {
                    this.method674(var8, var8.field2639, var8.field2640, var6);
                }
            }
        }

    }

    int method677(class331 var1, class39 var2) {
        switch (var2.field502) {
            case 0:
                return 0;
            case 2:
                return -var1.field2423 / 2;
            default:
                return -var1.field2423;
        }
    }

    int method689(class331 var1, class375 var2) {
        switch (var2.field2718) {
            case 0:
                return -var1.field2419 / 2;
            case 1:
                return 0;
            default:
                return -var1.field2419;
        }
    }

    class341 method704(int var1) {
        class192 var3 = class192.method893(var1);
        return this.method690(var3);
    }

    class341 method690(class192 var1) {
        if (null != var1.field1561 && null != this.field1294 && this.field1294.get(class529.field4220) != null) {
            int var4 = var1.field1563;
            class529[] var5 = new class529[]{class529.field4220, class529.field4215, class529.field4214};
            class529[] var6 = var5;
            int var7 = 0;

            class529 var3;
            while (true) {
                if (var7 >= var6.length) {
                    var3 = null;
                    break;
                }

                class529 var8 = var6[var7];
                if (var4 == var8.field4217) {
                    var3 = var8;
                    break;
                }

                ++var7;
            }

            if (null == var3) {
                return null;
            } else {
                class413 var15 = this.field1294.get(var3);
                if (null == var15) {
                    return null;
                } else {
                    var7 = var15.method923(var1.field1561, 1000000);
                    String[] var16 = new String[var7];
                    var15.method922(var1.field1561, null, var16);
                    int var9 = var15.field1617 * var16.length / 2;
                    int var10 = 0;
                    String[] var11 = var16;

                    for (int var12 = 0; var12 < var11.length; ++var12) {
                        String var13 = var11[var12];
                        int var14 = var15.method921(var13);
                        if (var14 > var10) {
                            var10 = var14;
                        }
                    }

                    return new class341(var1.field1561, var10, var9, var3);
                }
            }
        } else {
            return null;
        }
    }

    List<class369> method691(int var1, int var2, int var3, int var4, int var5) {
        LinkedList<class369> var7 = new LinkedList<>();
        if (var4 >= var1 && var5 >= var2) {
            if (var4 < var3 + var1 && var5 < var2 + var3) {
                Iterator var8 = this.field1299.values().iterator();

                class369 var9;
                while (var8.hasNext()) {
                    var9 = (class369) var8.next();
                    if (var9.method1745() && var9.method1742(var4, var5)) {
                        var7.add(var9);
                    }
                }

                var8 = this.field1292.iterator();

                while (var8.hasNext()) {
                    var9 = (class369) var8.next();
                    if (var9.method1745() && var9.method1742(var4, var5)) {
                        var7.add(var9);
                    }
                }

                return var7;
            } else {
                return var7;
            }
        } else {
            return var7;
        }
    }

    List method692() {
        LinkedList var2 = new LinkedList();
        var2.addAll(this.field1292);
        var2.addAll(this.field1299.values());
        return var2;
    }

    void method693(int var1, int var2, int var3, int var4) {
        var3 %= 4;
        if (var3 == 0) {
            class415.method1920(this.field1298 * var1, this.field1298 * (63 - var2), this.field1298, var4);
        }

        if (var3 == 1) {
            class415.method1925(this.field1298 * var1, (63 - var2) * this.field1298, this.field1298, var4);
        }

        if (var3 == 2) {
            class415.method1920(this.field1298 + var1 * this.field1298 - 1, this.field1298 * (63 - var2), this.field1298, var4);
        }

        if (var3 == 3) {
            class415.method1925(this.field1298 * var1, (63 - var2) * this.field1298 + this.field1298 - 1, this.field1298, var4);
        }

    }
}
