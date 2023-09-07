public class class192 extends class510 {
    public static class192[] field1555;
    public static class289 field1557;
    public static class68 field1567;
    public static int field1556;
    static class372 field1578;
    static int field1577;

    static {
        field1557 = new class289(256);
    }

    public final int field1562;
    public boolean field1564;
    public boolean field1565;
    public class375 field1574;
    public class39 field1579;
    public int field1559;
    public int field1563;
    public int field1568;
    public int field1576;
    public String field1558;
    public String field1561;
    public String[] field1566;
    byte[] field1575;
    int field1554;
    int field1560;
    int field1569;
    int field1570;
    int field1572;
    int[] field1571;
    int[] field1573;

    public class192(int var1) {
        this.field1559 = -1;
        this.field1560 = -1;
        this.field1563 = 0;
        this.field1564 = true;
        this.field1565 = false;
        this.field1566 = new String[5];
        this.field1554 = Integer.MAX_VALUE;
        this.field1570 = Integer.MAX_VALUE;
        this.field1569 = Integer.MIN_VALUE;
        this.field1572 = Integer.MIN_VALUE;
        this.field1579 = class39.field504;
        this.field1574 = class375.field2719;
        this.field1576 = -1;
        this.field1562 = var1;
    }

    public static class192 method893(int var0) {
        return var0 >= 0 && var0 < field1555.length && field1555[var0] != null ? field1555[var0] : new class192(var0);
    }

    public static class304 method892(int var0, byte var1) {
        class304 var2 = (class304) class304.field2177.method1307(var0);
        if (null != var2) {
            return var2;
        } else {
            byte[] var3 = class304.field2178.method188(6, var0);
            var2 = new class304();
            var2.field2182 = var0;
            if (var3 != null) {
                var2.method1349(new class78(var3));
            }

            var2.method1339();
            if (var2.field2214) {
                var2.field2192 = 0;
                var2.field2193 = false;
            }

            class304.field2177.method1306(var2, var0);
            return var2;
        }
    }

    public void method886(class78 var1) {
        while (true) {
            int var3 = var1.method260();
            if (var3 == 0) {
                return;
            }

            this.method887(var1, var3);
        }
    }

    void method887(class78 var1, int var2) {
        if (var2 == 1) {
            this.field1559 = var1.method308();
        } else if (var2 == 2) {
            this.field1560 = var1.method308();
        } else if (var2 == 3) {
            this.field1561 = var1.method268();
        } else if (var2 == 4) {
            this.field1568 = var1.method316();
        } else if (var2 == 5) {
            var1.method316();
        } else if (var2 == 6) {
            this.field1563 = var1.method260();
        } else {
            int var4;
            if (var2 == 7) {
                var4 = var1.method260();
                if ((var4 & 1) == 0) {
                    this.field1564 = false;
                }

                if ((var4 & 2) == 2) {
                    this.field1565 = true;
                }
            } else if (var2 == 8) {
                var1.method260();
            } else if (var2 >= 10 && var2 <= 14) {
                this.field1566[var2 - 10] = var1.method268();
            } else if (var2 == 15) {
                var4 = var1.method260();
                this.field1573 = new int[var4 * 2];

                int var5;
                for (var5 = 0; var5 < var4 * 2; ++var5) {
                    this.field1573[var5] = var1.method262();
                }

                var1.method264();
                var5 = var1.method260();
                this.field1571 = new int[var5];

                int var6;
                for (var6 = 0; var6 < this.field1571.length; ++var6) {
                    this.field1571[var6] = var1.method264();
                }

                this.field1575 = new byte[var4];

                for (var6 = 0; var6 < var4; ++var6) {
                    this.field1575[var6] = var1.method261();
                }
            } else if (var2 != 16) {
                if (var2 == 17) {
                    this.field1558 = var1.method268();
                } else if (var2 == 18) {
                    var1.method308();
                } else if (var2 == 19) {
                    this.field1576 = var1.method309();
                } else if (var2 == 21) {
                    var1.method264();
                } else if (var2 == 22) {
                    var1.method264();
                } else if (var2 == 23) {
                    var1.method260();
                    var1.method260();
                    var1.method260();
                } else if (var2 == 24) {
                    var1.method262();
                    var1.method262();
                } else if (var2 == 25) {
                    var1.method308();
                } else if (var2 == 28) {
                    var1.method260();
                } else if (var2 == 29) {
                    this.field1579 = (class39) class27.method80(class39.method106(), var1.method260());
                } else if (var2 == 30) {
                    this.field1574 = (class375) class27.method80(class375.method1763(), var1.method260());
                }
            }
        }

    }

    public void method888() {
        if (null != this.field1573) {
            for (int var2 = 0; var2 < this.field1573.length; var2 += 2) {
                if (this.field1573[var2] < this.field1554) {
                    this.field1554 = this.field1573[var2];
                } else if (this.field1573[var2] > this.field1569) {
                    this.field1569 = this.field1573[var2];
                }

                if (this.field1573[var2 + 1] < this.field1570) {
                    this.field1570 = this.field1573[var2 + 1];
                } else if (this.field1573[var2 + 1] > this.field1572) {
                    this.field1572 = this.field1573[var2 + 1];
                }
            }
        }

    }

    public class331 method889(boolean var1) {
        int var3 = this.field1559;
        return this.method890(var3);
    }

    class331 method890(int var1) {
        if (var1 < 0) {
            return null;
        } else {
            class331 var3 = (class331) field1557.method1307(var1);
            if (var3 != null) {
                return var3;
            } else {
                var3 = class122.method539(field1567, var1, 0);
                if (null != var3) {
                    field1557.method1306(var3, var1);
                }

                return var3;
            }
        }
    }

    public int method891() {
        return this.field1562;
    }
}
