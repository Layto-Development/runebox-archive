import java.awt.*;

public final class class51 extends class70 {
    static class372 field573;
    static class43 field560;
    static int field557;
    static Font field572;

    static {
        field560 = new class43();
    }

    class304 field570;
    class409 field565;
    class409 field569;
    int field558;
    int field559;
    int field561;
    int field562;
    int field563;
    int field564;
    int field566;
    int field568;
    int field571;
    int field574;
    int[] field567;

    class51() {
    }

    static void method144() {
        for (class51 var1 = (class51) field560.method122(); var1 != null; var1 = (class51) field560.method124()) {
            if (null != var1.field569) {
                class173.field1454.method1720(var1.field569);
                var1.field569 = null;
            }

            if (var1.field565 != null) {
                class173.field1454.method1720(var1.field565);
                var1.field565 = null;
            }
        }

        field560.method118();
    }

    static void method143(int var0, int var1, int var2, class304 var3, int var4) {
        class51 var6 = new class51();
        var6.field558 = var0;
        var6.field559 = var1 * 128;
        var6.field571 = var2 * 128;
        int var7 = var3.field2190;
        int var8 = var3.field2175;
        if (var4 == 1 || var4 == 3) {
            var7 = var3.field2175;
            var8 = var3.field2190;
        }

        var6.field561 = 128 * (var7 + var1);
        var6.field562 = (var2 + var8) * 128;
        var6.field564 = var3.field2219;
        var6.field563 = var3.field2220 * 128;
        var6.field568 = var3.field2221;
        var6.field566 = var3.field2222;
        var6.field567 = var3.field2213;
        if (null != var3.field2216) {
            var6.field570 = var3;
            var6.method141();
        }

        field560.method126(var6);
        if (null != var6.field567) {
            var6.field574 = var6.field568 + (int) (Math.random() * (double) (var6.field566 - var6.field568));
        }

    }

    static void method142(int var0, int var1, int var2, int var3) {
        for (class51 var5 = (class51) field560.method122(); var5 != null; var5 = (class51) field560.method124()) {
            if (var5.field564 != -1 || var5.field567 != null) {
                int var6 = 0;
                if (var1 > var5.field561) {
                    var6 = (var1 - var5.field561);
                } else if (var1 < var5.field559) {
                    var6 = (var5.field559 - var1);
                }

                if (var2 > var5.field562) {
                    var6 += var2 - var5.field562;
                } else if (var2 < var5.field571) {
                    var6 += var5.field571 - var2;
                }

                if (var6 - 64 <= var5.field563 && class290.field2121.method2555() != 0 && var0 == var5.field558) {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }

                    int var7 = (var5.field563 - var6) * class290.field2121.method2555() / var5.field563;
                    if (var5.field569 == null) {
                        if (var5.field564 >= 0) {
                            class131 var8 = class131.method590(class215.field1739, var5.field564, 0);
                            if (var8 != null) {
                                class433 var9 = var8.method588().method1973(class237.field1833);
                                class409 var10 = class409.method1892(var9, 100, var7);
                                var10.method1862(-1);
                                class173.field1454.method1730(var10);
                                var5.field569 = var10;
                            }
                        }
                    } else {
                        var5.field569.method1863(var7);
                    }

                    if (var5.field565 == null) {
                        if (null != var5.field567 && (var5.field574 -= var3) <= 0) {
                            int var12 = (int) (Math.random() * (double) var5.field567.length);
                            class131 var13 = class131.method590(class215.field1739, var5.field567[var12], 0);
                            if (null != var13) {
                                class433 var14 = var13.method588().method1973(class237.field1833);
                                class409 var11 = class409.method1892(var14, 100, var7);
                                var11.method1862(0);
                                class173.field1454.method1730(var11);
                                var5.field565 = var11;
                                var5.field574 = var5.field568 + (int) (Math.random() * (double) (var5.field566 - var5.field568));
                            }
                        }
                    } else {
                        var5.field565.method1863(var7);
                        if (!var5.field565.method222()) {
                            var5.field565 = null;
                        }
                    }
                } else {
                    if (null != var5.field569) {
                        class173.field1454.method1720(var5.field569);
                        var5.field569 = null;
                    }

                    if (var5.field565 != null) {
                        class173.field1454.method1720(var5.field565);
                        var5.field565 = null;
                    }
                }
            }
        }

    }

    void method141() {
        int var2 = this.field564;
        class304 var3 = this.field570.method1346();
        if (var3 != null) {
            this.field564 = var3.field2219;
            this.field563 = var3.field2220 * 128;
            this.field568 = var3.field2221;
            this.field566 = var3.field2222;
            this.field567 = var3.field2213;
        } else {
            this.field564 = -1;
            this.field563 = 0;
            this.field568 = 0;
            this.field566 = 0;
            this.field567 = null;
        }

        if (var2 != this.field564 && this.field569 != null) {
            class173.field1454.method1720(this.field569);
            this.field569 = null;
        }

    }
}
