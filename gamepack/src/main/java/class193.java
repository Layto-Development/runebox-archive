import java.util.*;

public final class class193 {
    final class68 field1588;
    final class68 field1589;
    final HashMap<class529, class413> field1586;
    public int field1595;
    boolean field1584;
    boolean field1593;
    class147[][] field1585;
    class311 field1581;
    class331 field1583;
    class539[] field1587;
    int field1580;
    int field1590;
    int field1591;
    int field1594;
    HashMap<Integer, LinkedList<class369>> field1582;
    HashMap<Integer, class76> field1592;

    public class193(class539[] var1, HashMap<class529, class413> var2, class68 var3, class68 var4) {
        this.field1584 = false;
        this.field1593 = false;
        this.field1592 = new HashMap<Integer, class76>();
        this.field1595 = 0;
        this.field1587 = var1;
        this.field1586 = var2;
        this.field1588 = var3;
        this.field1589 = var4;
    }

    public void method894(class68 var1, String var2, boolean var3) {
        if (!this.field1593) {
            this.field1584 = false;
            this.field1593 = true;
            System.nanoTime();
            int var5 = var1.method213(class263.field1950.field1949);
            int var6 = var1.method205(var5, var2);
            class78 var7 = new class78(var1.method207(class263.field1950.field1949, var2));
            class78 var8 = new class78(var1.method207(class263.field1946.field1949, var2));
            System.nanoTime();
            System.nanoTime();
            this.field1581 = new class311();

            try {
                this.field1581.method1369(var7, var8, var6, var3);
            } catch (IllegalStateException var17) {
                return;
            }

            this.field1581.method1803();
            this.field1581.method1796();
            this.field1581.method1797();
            this.field1591 = this.field1581.method1793() * 64;
            this.field1580 = this.field1581.method1802() * 64;
            this.field1590 = (this.field1581.method1804() - this.field1581.method1793() + 1) * 64;
            this.field1594 = (this.field1581.method1800() - this.field1581.method1802() + 1) * 64;
            int var9 = this.field1581.method1804() - this.field1581.method1793() + 1;
            int var10 = this.field1581.method1800() - this.field1581.method1802() + 1;
            System.nanoTime();
            System.nanoTime();
            class147.field1295.method1122();
            this.field1585 = new class147[var9][var10];
            Iterator<class248> var11 = this.field1581.field2257.iterator();

            while (var11.hasNext()) {
                class248 var12 = var11.next();
                int var13 = var12.field2008;
                int var14 = var12.field2015;
                int var15 = var13 - this.field1581.method1793();
                int var16 = var14 - this.field1581.method1802();
                this.field1585[var15][var16] = new class147(var13, var14, this.field1581.method1791(), this.field1586);
                this.field1585[var15][var16].method701(var12, this.field1581.field2259);
            }

            for (int var18 = 0; var18 < var9; ++var18) {
                for (int var20 = 0; var20 < var10; ++var20) {
                    if (this.field1585[var18][var20] == null) {
                        this.field1585[var18][var20] = new class147(this.field1581.method1793() + var18, this.field1581.method1802() + var20, this.field1581.method1791(), this.field1586);
                        this.field1585[var18][var20].method672(this.field1581.field2258, this.field1581.field2259);
                    }
                }
            }

            System.nanoTime();
            System.nanoTime();
            if (var1.method210(class263.field1945.field1949, var2)) {
                byte[] var19 = var1.method207(class263.field1945.field1949, var2);
                this.field1583 = class458.method2117(var19);
            }

            System.nanoTime();
            var1.method201();
            var1.method203();
            this.field1584 = true;
        }
    }

    public void method902() {
        this.field1582 = null;
    }

    public void method895(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        int[] var10 = class415.field2905;
        int var11 = class415.field2903;
        int var12 = class415.field2904;
        float[] var13 = class415.field2906;
        int[] var14 = new int[4];
        class415.method1910(var14);
        class482 var15 = this.method899(var1, var2, var3, var4);
        float var16 = this.method903(var7 - var5, var3 - var1);
        int var17 = (int) Math.ceil(var16);
        this.field1595 = var17;
        if (!this.field1592.containsKey(var17)) {
            class76 var18 = new class76(var17);
            var18.method241();
            this.field1592.put(var17, var18);
        }

        int var25 = var15.field3473 + var15.field3474 - 1;
        int var19 = var15.field3475 + var15.field3472 - 1;

        int var20;
        int var21;
        for (var20 = var15.field3473; var20 <= var25; ++var20) {
            for (var21 = var15.field3475; var21 <= var19; ++var21) {
                this.field1585[var20][var21].method702(var17, this.field1592.get(var17), this.field1587, this.field1588, this.field1589);
            }
        }

        class334.method1578(var10, var11, var12, var13);
        class415.method1930(var14);
        var20 = (int) (var16 * 64.0F);
        var21 = var1 + this.field1591;
        int var22 = this.field1580 + var2;

        for (int var23 = var15.field3473; var23 < var15.field3474 + var15.field3473; ++var23) {
            for (int var24 = var15.field3475; var24 < var15.field3475 + var15.field3472; ++var24) {
                this.field1585[var23][var24].method699((this.field1585[var23][var24].field1300 * 64 - var21) * var20 / 64 + var5, var8 - (64 + (this.field1585[var23][var24].field1291 * 64 - var22)) * var20 / 64, var20);
            }
        }

    }

    public void method896(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet<Integer> var9, HashSet<Integer> var10, int var11, int var12, boolean var13) {
        class482 var15 = this.method899(var1, var2, var3, var4);
        float var16 = this.method903(var7 - var5, var3 - var1);
        int var17 = (int) (var16 * 64.0F);
        int var18 = var1 + this.field1591;
        int var19 = this.field1580 + var2;

        int var20;
        int var21;
        for (var20 = var15.field3473; var20 < var15.field3473 + var15.field3474; ++var20) {
            for (var21 = var15.field3475; var21 < var15.field3475 + var15.field3472; ++var21) {
                if (var13) {
                    this.field1585[var20][var21].method675();
                }

                this.field1585[var20][var21].method678(var17 * (this.field1585[var20][var21].field1300 * 64 - var18) / 64 + var5, var8 - (this.field1585[var20][var21].field1291 * 64 - var19 + 64) * var17 / 64, var17, var9);
            }
        }

        if (var10 != null && var11 > 0) {
            for (var20 = var15.field3473; var20 < var15.field3474 + var15.field3473; ++var20) {
                for (var21 = var15.field3475; var21 < var15.field3472 + var15.field3475; ++var21) {
                    this.field1585[var20][var21].method679(var10, var11, var12);
                }
            }
        }

    }

    public void method897(int var1, int var2, int var3, int var4, HashSet<Integer> var5, int var6, int var7) {
        if (this.field1583 != null) {
            this.field1583.method1565(var1, var2, var3, var4);
            if (var6 > 0 && var6 % var7 < var7 / 2) {
                if (null == this.field1582) {
                    this.method904();
                }

                Iterator<Integer> var9 = var5.iterator();

                while (true) {
                    List<class369> var11;
                    do {
                        if (!var9.hasNext()) {
                            return;
                        }

                        int var10 = var9.next();
                        var11 = this.field1582.get(var10);
                    } while (var11 == null);

                    Iterator<class369> var12 = var11.iterator();

                    while (var12.hasNext()) {
                        class369 var13 = var12.next();
                        int var14 = var3 * (var13.field2637.field1929 - this.field1591) / this.field1590;
                        int var15 = var4 - var4 * (var13.field2637.field1931 - this.field1580) / this.field1594;
                        class415.method1912(var14 + var1, var15 + var2, 2, 16776960, 256);
                    }
                }
            }
        }
    }

    public List<class369> method898(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        LinkedList<class369> var12 = new LinkedList<>();
        if (!this.field1584) {
            return var12;
        } else {
            class482 var13 = this.method899(var1, var2, var3, var4);
            float var14 = this.method903(var7, var3 - var1);
            int var15 = (int) (var14 * 64.0F);
            int var16 = var1 + this.field1591;
            int var17 = var2 + this.field1580;

            for (int var18 = var13.field3473; var18 < var13.field3473 + var13.field3474; ++var18) {
                for (int var19 = var13.field3475; var19 < var13.field3475 + var13.field3472; ++var19) {
                    List<class369> var20 = this.field1585[var18][var19].method691(var5 + (this.field1585[var18][var19].field1300 * 64 - var16) * var15 / 64, var8 + var6 - var15 * (this.field1585[var18][var19].field1291 * 64 - var17 + 64) / 64, var15, var9, var10);
                    if (!var20.isEmpty()) {
                        var12.addAll(var20);
                    }
                }
            }

            return var12;
        }
    }

    class482 method899(int var1, int var2, int var3, int var4) {
        class482 var6 = new class482(this);
        int var7 = this.field1591 + var1;
        int var8 = var2 + this.field1580;
        int var9 = this.field1591 + var3;
        int var10 = var4 + this.field1580;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        int var14 = var10 / 64;
        var6.field3474 = var13 - var11 + 1;
        var6.field3472 = var14 - var12 + 1;
        var6.field3473 = var11 - this.field1581.method1793();
        var6.field3475 = var12 - this.field1581.method1802();
        if (var6.field3473 < 0) {
            var6.field3474 += var6.field3473;
            var6.field3473 = 0;
        }

        if (var6.field3473 > this.field1585.length - var6.field3474) {
            var6.field3474 = this.field1585.length - var6.field3473;
        }

        if (var6.field3475 < 0) {
            var6.field3472 += var6.field3475;
            var6.field3475 = 0;
        }

        if (var6.field3475 > this.field1585[0].length - var6.field3472) {
            var6.field3472 = this.field1585[0].length - var6.field3475;
        }

        var6.field3474 = Math.min(var6.field3474, this.field1585.length);
        var6.field3472 = Math.min(var6.field3472, this.field1585[0].length);
        return var6;
    }

    public boolean method900() {
        return this.field1584;
    }

    public HashMap<Integer, LinkedList<class369>> method901() {
        this.method904();
        return this.field1582;
    }

    void method904() {
        if (this.field1582 == null) {
            this.field1582 = new HashMap<>();
        }

        this.field1582.clear();

        for (int var2 = 0; var2 < this.field1585.length; ++var2) {
            for (int var3 = 0; var3 < this.field1585[var2].length; ++var3) {
                List var4 = this.field1585[var2][var3].method692();
                Iterator var5 = var4.iterator();

                while (var5.hasNext()) {
                    class369 var6 = (class369) var5.next();
                    if (var6.method1745()) {
                        int var7 = var6.method1743();
                        if (!this.field1582.containsKey(var7)) {
                            LinkedList<class369> var8 = new LinkedList<>();
                            var8.add(var6);
                            this.field1582.put(var7, var8);
                        } else {
                            List<class369> var9 = this.field1582.get(var7);
                            var9.add(var6);
                        }
                    }
                }
            }
        }

    }

    float method903(int var1, int var2) {
        float var4 = (float) var1 / (float) var2;
        if (var4 > 8.0F) {
            return 8.0F;
        } else if (var4 < 1.0F) {
            return 1.0F;
        } else {
            int var5 = Math.round(var4);
            return Math.abs((float) var5 - var4) < 0.05F ? (float) var5 : var4;
        }
    }
}
