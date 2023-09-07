import java.util.ArrayList;

public class class353 {
    boolean field2554;
    class197 field2553;
    int field2548;
    int field2549;
    int field2550;
    int field2551;
    int field2552;
    int field2555;
    int field2556;
    ArrayList<class284> field2547;

    public class353() {
        this.field2550 = Integer.MAX_VALUE;
        this.field2549 = Integer.MAX_VALUE;
        this.field2548 = 0;
        this.field2551 = 0;
        this.field2552 = 0;
        this.field2554 = true;
        this.field2547 = new ArrayList<>();
        this.field2555 = 0;
        this.field2556 = 0;
    }

    public class284 method1667(int var1) {
        return this.field2547.get(var1);
    }

    class284 method1649() {
        return this.field2547.size() == 0 ? null : this.field2547.get(this.field2547.size() - 1);
    }

    public boolean method1686() {
        return this.field2547.size() == 0;
    }

    boolean method1688() {
        return this.field2549 > 1;
    }

    public int method1652() {
        return this.field2547.size();
    }

    public String method1653() {
        if (this.method1686()) {
            return "";
        } else {
            StringBuilder var2 = new StringBuilder(this.method1652());

            for (int var3 = 0; var3 < this.method1652(); ++var3) {
                class284 var4 = this.method1667(var3);
                var2.append(var4.field2084);
            }

            return var2.toString();
        }
    }

    public void method1680(int var1) {
        if (this.field2553 != null && var1 < 2 * this.field2553.field1617) {
            var1 = Integer.MAX_VALUE;
        }

        if (this.field2550 != var1) {
            this.field2550 = var1;
            this.method1687();
        }

    }

    public void method1651(int var1) {
        if (var1 != this.field2549) {
            this.field2549 = var1;
            this.method1687();
        }

    }

    public void method1654(int var1) {
        if (var1 != this.field2556) {
            this.field2556 = var1;
            this.method1687();
        }

    }

    public void method1655(class197 var1) {
        if (var1 != this.field2553) {
            this.field2553 = var1;
            if (null != this.field2553) {
                if (this.field2552 == 0) {
                    this.field2552 = this.field2553.field1617;
                }

                if (!this.method1686()) {
                    this.method1687();
                }
            }
        }

    }

    public void method1684(int var1) {
        if (this.field2555 != var1) {
            this.field2555 = var1;
            this.method1687();
        }

    }

    public boolean method1656(int var1, int var2) {
        if (var1 != this.field2548 || this.field2551 != var2) {
            this.field2548 = var1;
            this.field2551 = var2;
            this.method1687();
        }

        return true;
    }

    public void method1657(int var1) {
        if (var1 != this.field2552) {
            this.field2552 = var1;
            this.method1687();
        }

    }

    public class145 method1658(int var1, int var2) {
        if (var2 == var1) {
            return new class145(this, 0, 0);
        } else if (var1 <= this.field2547.size() && var2 <= this.field2547.size()) {
            return var2 < var1 ? new class145(this, var2, var1) : new class145(this, var1, var2);
        } else {
            return new class145(this, 0, 0);
        }
    }

    public class98 method1683(char var1, int var2, int var3) {
        return this.method1659(Character.toString(var1), var2, var3);
    }

    public class98 method1659(String var1, int var2, int var3) {
        if (var3 == 0) {
            var3 = Integer.MAX_VALUE;
        }

        int var5 = var2;
        if (this.field2547.size() >= var3) {
            this.method1650(var2, var2);
            return new class98(var2, true);
        } else {
            this.field2547.ensureCapacity(this.field2547.size() + var1.length());

            for (int var6 = 0; var6 < var1.length() && this.field2547.size() < var3; ++var6) {
                class284 var7 = new class284();
                var7.field2084 = var1.charAt(var6);
                this.field2547.add(var5, var7);
                ++var5;
            }

            this.method1650(var2, var5);
            if (this.field2549 != 0 && this.method1682() > this.field2549) {
                while (var5 != var2) {
                    --var5;
                    this.method1661(var5);
                    if (this.method1682() <= this.field2549) {
                        break;
                    }
                }

                return new class98(var5, true);
            } else {
                return new class98(var5, false);
            }
        }
    }

    class98 method1681(String var1, int var2) {
        return this.method1659(var1, this.field2547.size(), 0);
    }

    public class98 method1685(String var1) {
        this.method1660();
        return this.method1681(var1, 0);
    }

    void method1660() {
        this.field2547.clear();
    }

    public int method1661(int var1) {
        return this.method1662(var1, var1 + 1);
    }

    public int method1662(int var1, int var2) {
        int var4;
        if (var2 < var1) {
            var4 = var2;
            var2 = var1;
            var1 = var4;
        }

        this.field2547.subList(var1, var2).clear();
        var4 = var1;
        if (this.method1688() && this.field2555 == 1) {
            while (var4 > 0) {
                --var4;
                char var5 = this.field2547.get(var4).field2084;
                if (var5 == ' ' || var5 == '\t') {
                    break;
                }
            }
        }

        this.method1650(var4, var2);
        return var1;
    }

    public int method1679(int var1, int var2) {
        if (null == this.field2553) {
            return 0;
        } else if (this.method1688() && var1 > this.field2550) {
            return this.field2547.size();
        } else {
            if (!this.field2547.isEmpty()) {
                for (int var4 = 0; var4 < this.field2547.size(); ++var4) {
                    class284 var5 = this.field2547.get(var4);
                    if (var2 <= var5.field2086 + this.method1666()) {
                        if (var2 < var5.field2086) {
                            break;
                        }

                        if (var1 < var5.field2083) {
                            return var4 > 0 ? var4 - 1 : 0;
                        }

                        if (var4 + 1 != this.field2547.size() && this.field2547.get(var4 + 1).field2086 != var5.field2086) {
                            int var6 = this.method1676(this.field2547.get(var4), false);
                            if (var1 < var6 + var5.field2083) {
                                return var4;
                            }

                            if (var2 <= var5.field2086 + this.method1666()) {
                                return var4 + 1;
                            }
                        }
                    }
                }

                class284 var7 = this.field2547.get(this.field2547.size() - 1);
                if (var1 >= var7.field2083 && var1 <= var7.field2083 + this.method1668() && var2 >= var7.field2086 && var2 <= var7.field2086 + this.method1666()) {
                    return this.field2547.size() - 1;
                }
            }

            return this.field2547.size();
        }
    }

    public int method1663(int var1, int var2) {
        if (this.field2553 != null && !this.method1686() && var1 <= this.field2547.size()) {
            byte var4;
            if (var2 > 0) {
                var4 = 1;
            } else {
                var4 = -1;
                var2 = -var2;
            }

            int var5 = 0;
            int var6 = 0;
            if (var1 > 0) {
                class284 var7 = this.field2547.get(var1 - 1);
                var5 = var7.field2083 + this.method1673(var1 - 1);
                var6 = var7.field2086;
            } else if (var4 == -1 && var1 == 0) {
                return 0;
            }

            int var15 = 16777215;
            int var8 = 0;
            int var9 = var1;
            int var10 = 16777215;
            int var11 = var4 == 1 ? this.field2547.size() + 1 : 0;

            for (int var12 = var4 + var1; var11 != var12; var12 += var4) {
                class284 var13 = this.field2547.get(var12 - 1);
                if (var6 != var13.field2086) {
                    ++var8;
                    var6 = var13.field2086;
                    if (var8 > var2) {
                        return var9;
                    }
                }

                if (var2 == var8) {
                    int var14 = Math.abs(var13.field2083 + this.method1673(var12 - 1) - var5);
                    if (var14 >= var10) {
                        return var9;
                    }

                    var9 = var12;
                    var10 = var14;
                }
            }

            if (var4 == 1) {
                return this.field2547.size();
            } else {
                if (var6 != 0) {
                    ++var8;
                }

                return var10 != 16777215 && (var2 != var8 || var5 >= var10) ? var9 : 0;
            }
        } else {
            return 0;
        }
    }

    public int method1664() {
        if (!this.field2547.isEmpty() && this.method1682() == 1) {
            return this.field2547.isEmpty() ? 0 : this.field2547.get(this.field2547.size() - 1).field2083 + this.method1668();
        } else {
            int var2 = -1;
            int var3 = 0;

            for (int var4 = this.field2547.size() - 1; var4 >= 0; --var4) {
                class284 var5 = this.field2547.get(var4);
                if (var2 != var5.field2086) {
                    int var6 = this.method1676(var5, false) + var5.field2083;
                    var3 = Math.max(var6, var3);
                    var2 = var5.field2086;
                }
            }

            return var3;
        }
    }

    public int method1665() {
        return this.method1686() ? 0 : this.field2553.field1617 + this.field2547.get(this.field2547.size() - 1).field2086;
    }

    public int method1666() {
        return this.field2552;
    }

    public int method1682() {
        return this.method1665() / this.field2553.field1617;
    }

    int method1668() {
        return this.method1686() ? 0 : this.method1676(this.field2547.get(this.field2547.size() - 1), false);
    }

    public int method1689() {
        return this.field2550;
    }

    public int method1669() {
        return this.field2549;
    }

    public int method1677() {
        return this.field2555;
    }

    public int method1670() {
        return this.field2556;
    }

    public int method1671(int var1) {
        switch (this.field2548) {
            case 0:
                return 0;
            case 1:
                return var1 / 2;
            case 2:
                return var1;
            default:
                return 0;
        }
    }

    public int method1672(int var1) {
        switch (this.field2551) {
            case 0:
                return 0;
            case 1:
                return var1 / 2;
            case 2:
                return var1;
            default:
                return 0;
        }
    }

    void method1687() {
        this.method1650(0, this.field2547.size());
    }

    void method1650(int var1, int var2) {
        if (!this.method1686() && null != this.field2553) {
            class260 var4 = this.method1674(var1, var2);
            boolean var5 = (Integer) var4.field1940 == 0 && (Integer) var4.field1939 == this.field2547.size();
            int var6 = (Integer) var4.field1940;
            int var7 = 0;
            int var8 = var5 ? 0 : this.field2547.get((Integer) var4.field1940).field2086;
            int var9 = 0;

            int var10;
            for (var10 = (Integer) var4.field1940; var10 <= (Integer) var4.field1939; ++var10) {
                boolean var11 = var10 >= this.field2547.size();
                class284 var12 = this.field2547.get(!var11 ? var10 : this.field2547.size() - 1);
                int var13 = !var11 ? this.method1676(var12, false) : 0;
                boolean var14 = !var11 && var12.field2084 == '\n';
                boolean var15 = !var11 && this.method1688() && var13 + var7 > this.field2550;
                if (var14 || var15 || var11) {
                    int var16 = var10;
                    int var17 = 0;
                    int var18;
                    int var19;
                    class284 var20;
                    if (var15) {
                        var18 = 0;
                        if (this.field2555 == 1) {
                            for (var19 = var10; var19 > var6; --var19) {
                                var20 = this.field2547.get(var19);
                                var18 += var19 < var16 ? this.method1676(var20, false) : 0;
                                if (var20.field2084 == ' ' || var20.field2084 == '\n') {
                                    var16 = var19;
                                    var7 -= var18;
                                    var17 = var18;
                                    break;
                                }
                            }
                        }
                    }

                    var18 = -this.method1671(var7);

                    for (var19 = var6; var19 < var16; ++var19) {
                        var20 = this.field2547.get(var19);
                        int var21 = this.method1676(var20, false);
                        var20.field2083 = var18;
                        var20.field2086 = var8;
                        var18 += var21;
                    }

                    var6 = var16;
                    var7 = var17;
                    var8 += this.method1666();
                    ++var9;
                }

                var7 += !var11 ? var13 : 0;
            }

            if (this.field2551 != 0 && var5) {
                var10 = var9 * this.method1666();
                int var22 = this.method1672(var10);

                for (int var23 = 0; var23 < this.field2547.size(); ++var23) {
                    class284 var24 = this.field2547.get(var23);
                    var24.field2086 -= var22;
                }
            }

        }
    }

    int method1673(int var1) {
        return var1 < this.field2547.size() ? this.method1676(this.field2547.get(var1), false) : 0;
    }

    int method1676(class284 var1, boolean var2) {
        if (var1.field2084 == '\n') {
            return 0;
        } else if (this.field2556 == 0) {
            int var4 = this.field2553.field1620[var1.field2084];
            if (var4 == 0) {
                return var1.field2084 == '\t' ? this.field2553.field1620[32] * 3 : this.field2553.field1620[32];
            } else {
                return var4;
            }
        } else {
            return this.field2553.field1620[42];
        }
    }

    class260 method1674(int var1, int var2) {
        int var4 = Math.min(var1, var2);
        int var5 = Math.max(var1, var2);
        int var6 = this.field2547.size();
        if (var4 == 0 && var5 == var6) {
            return new class260(0, var6);
        } else {
            int var7 = this.method1675(var4, false);
            int var8 = this.method1678(var5, false);
            int var9;
            switch (this.field2551) {
                case 0:
                    if (this.field2548 == 0) {
                        return new class260(var7, var6);
                    }

                    var9 = this.method1675(var4, true);
                    return new class260(var9, var6);
                case 1:
                    return new class260(0, var6);
                case 2:
                    if (this.field2548 == 2) {
                        return new class260(0, var8);
                    }

                    var9 = this.method1678(var5, true);
                    return new class260(0, var9);
                default:
                    return new class260(0, var6);
            }
        }
    }

    int method1675(int var1, boolean var2) {
        if (var1 < this.field2547.size()) {
            int var4 = this.field2547.get(var1).field2086;

            for (int var5 = var1; var5 > 0; --var5) {
                if (this.field2547.get(var5 - 1).field2086 < var4) {
                    if (!var2) {
                        return var5;
                    }

                    var2 = false;
                    var4 = this.field2547.get(var5 - 1).field2086;
                }
            }
        }

        return 0;
    }

    int method1678(int var1, boolean var2) {
        if (var1 < this.field2547.size()) {
            int var4 = this.field2547.get(var1).field2086;

            for (int var5 = var1; var5 < this.field2547.size() - 1; ++var5) {
                if (this.field2547.get(var5 + 1).field2086 > var4) {
                    if (!var2) {
                        return var5;
                    }

                    var2 = false;
                    var4 = this.field2547.get(var5 + 1).field2086;
                }
            }
        }

        return this.field2547.size();
    }
}
