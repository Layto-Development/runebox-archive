public class class338 extends class391 {
    static class539[] field2448;
    static String field2445;
    class367 field2447;
    class43 field2449;
    class468 field2446;

    class338(class468 var1) {
        this.field2449 = new class43();
        this.field2447 = new class367();
        this.field2446 = var1;
    }

    @Override
    protected class391 method1811() {
        class213 var1 = (class213) this.field2449.method122();
        if (var1 == null) {
            return null;
        } else {
            return var1.field1718 != null ? var1.field1718 : this.method1812();
        }
    }

    @Override
    protected class391 method1812() {
        class213 var1;
        do {
            var1 = (class213) this.field2449.method124();
            if (var1 == null) {
                return null;
            }
        } while (null == var1.field1718);

        return var1.field1718;
    }

    @Override
    protected int method1809() {
        return 0;
    }

    @Override
    protected void method1814(int[] var1, int var2, int var3) {
        this.field2447.method1814(var1, var2, var3);

        for (class213 var6 = (class213) this.field2449.method122(); null != var6; var6 = (class213) this.field2449.method124()) {
            if (!this.field2446.method2165(var6)) {
                int var4 = var2;
                int var5 = var3;

                do {
                    if (var5 <= var6.field1729) {
                        this.method1603(var6, var1, var4, var5, var5 + var4);
                        var6.field1729 -= var5;
                        break;
                    }

                    this.method1603(var6, var1, var4, var6.field1729, var4 + var5);
                    var4 += var6.field1729;
                    var5 -= var6.field1729;
                } while (!this.field2446.method2156(var6, var1, var4, var5));
            }
        }

    }

    @Override
    protected void method1813(int var1) {
        this.field2447.method1813(var1);

        for (class213 var3 = (class213) this.field2449.method122(); var3 != null; var3 = (class213) this.field2449.method124()) {
            if (!this.field2446.method2165(var3)) {
                int var2 = var1;

                do {
                    if (var2 <= var3.field1729) {
                        this.method1605(var3, var2);
                        var3.field1729 -= var2;
                        break;
                    }

                    this.method1605(var3, var3.field1729);
                    var2 -= var3.field1729;
                } while (!this.field2446.method2156(var3, null, 0, var2));
            }
        }

    }

    void method1603(class213 var1, int[] var2, int var3, int var4, int var5) {
        if ((this.field2446.field3317[var1.field1720] & 4) != 0 && var1.field1724 < 0) {
            int var7 = this.field2446.field3344[var1.field1720] / class398.field2800;

            while (true) {
                int var8 = (var7 + 1048575 - var1.field1730) / var7;
                if (var8 > var4) {
                    var1.field1730 += var7 * var4;
                    break;
                }

                var1.field1718.method1814(var2, var3, var8);
                var3 += var8;
                var4 -= var8;
                var1.field1730 += var8 * var7 - 1048576;
                int var9 = class398.field2800 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }

                class409 var11 = var1.field1718;
                if (this.field2446.field3319[var1.field1720] == 0) {
                    var1.field1718 = class409.method1861(var1.field1712, var11.method1871(), var11.method1865(), var11.method1866());
                } else {
                    var1.field1718 = class409.method1861(var1.field1712, var11.method1871(), 0, var11.method1866());
                    this.field2446.method2152(var1, var1.field1711.field3604[var1.field1715] < 0);
                    var1.field1718.method1890(var9, var11.method1865());
                }

                if (var1.field1711.field3604[var1.field1715] < 0) {
                    var1.field1718.method1862(-1);
                }

                var11.method1869(var9);
                var11.method1814(var2, var3, var5 - var3);
                if (var11.method1873()) {
                    this.field2447.method1730(var11);
                }
            }
        }

        var1.field1718.method1814(var2, var3, var4);
    }

    void method1605(class213 var1, int var2) {
        if ((this.field2446.field3317[var1.field1720] & 4) != 0 && var1.field1724 < 0) {
            int var4 = this.field2446.field3344[var1.field1720] / class398.field2800;
            int var5 = (var4 + 1048575 - var1.field1730) / var4;
            var1.field1730 = var2 * var4 + var1.field1730 & 1048575;
            if (var5 <= var2) {
                if (this.field2446.field3319[var1.field1720] == 0) {
                    var1.field1718 = class409.method1861(var1.field1712, var1.field1718.method1871(), var1.field1718.method1865(), var1.field1718.method1866());
                } else {
                    var1.field1718 = class409.method1861(var1.field1712, var1.field1718.method1871(), 0, var1.field1718.method1866());
                    this.field2446.method2152(var1, var1.field1711.field3604[var1.field1715] < 0);
                }

                if (var1.field1711.field3604[var1.field1715] < 0) {
                    var1.field1718.method1862(-1);
                }

                var2 = var1.field1730 / var4;
            }
        }

        var1.field1718.method1813(var2);
    }
}
