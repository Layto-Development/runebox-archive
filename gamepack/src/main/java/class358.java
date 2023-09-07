public class class358 implements Comparable {
    String field2574;
    String field2575;

    public class358(String var1) {
        this.field2575 = var1;
        class194 var4 = class194.field1604;
        String var3;
        if (null == var1) {
            var3 = null;
        } else {
            label66:
            {
                int var5 = 0;

                int var6;
                for (var6 = var1.length(); var5 < var6 && class483.method2232(var1.charAt(var5)); ++var5) {
                }

                while (var6 > var5 && class483.method2232(var1.charAt(var6 - 1))) {
                    --var6;
                }

                int var7 = var6 - var5;
                if (var7 >= 1) {
                    byte var9;
                    if (var4 == null) {
                        var9 = 12;
                    } else {
                        if (var4.field1597 == 0) {
                            var9 = 20;
                        } else {
                            var9 = 12;
                        }
                    }

                    if (var7 <= var9) {
                        StringBuilder var8 = new StringBuilder(var7);

                        for (int var12 = var5; var12 < var6; ++var12) {
                            char var10 = var1.charAt(var12);
                            if (class483.method2230(var10)) {
                                char var11 = class483.method2229(var10);
                                if (var11 != 0) {
                                    var8.append(var11);
                                }
                            }
                        }

                        if (var8.length() == 0) {
                            var3 = null;
                        } else {
                            var3 = var8.toString();
                        }
                        break label66;
                    }
                }

                var3 = null;
            }
        }

        this.field2574 = var3;
    }

    public class358(String var1, class194 var2) {
        this.field2575 = var1;
        String var4;
        if (null == var1) {
            var4 = null;
        } else {
            label66:
            {
                int var5 = 0;

                int var6;
                for (var6 = var1.length(); var5 < var6 && class483.method2232(var1.charAt(var5)); ++var5) {
                }

                while (var6 > var5 && class483.method2232(var1.charAt(var6 - 1))) {
                    --var6;
                }

                int var7 = var6 - var5;
                if (var7 >= 1) {
                    byte var9;
                    if (null == var2) {
                        var9 = 12;
                    } else {
                        if (var2.field1597 == 0) {
                            var9 = 20;
                        } else {
                            var9 = 12;
                        }
                    }

                    if (var7 <= var9) {
                        StringBuilder var8 = new StringBuilder(var7);

                        for (int var12 = var5; var12 < var6; ++var12) {
                            char var10 = var1.charAt(var12);
                            if (class483.method2230(var10)) {
                                char var11 = class483.method2229(var10);
                                if (var11 != 0) {
                                    var8.append(var11);
                                }
                            }
                        }

                        if (var8.length() == 0) {
                            var4 = null;
                        } else {
                            var4 = var8.toString();
                        }
                        break label66;
                    }
                }

                var4 = null;
            }
        }

        this.field2574 = var4;
    }

    public String method1706() {
        return this.field2575;
    }

    public String method1704() {
        return this.field2574;
    }

    public boolean method1707() {
        return null != this.field2574;
    }

    @Override
    public boolean equals(Object var1) {
        if (var1 instanceof class358) {
            class358 var2 = (class358) var1;
            if (null == this.field2574) {
                return null == var2.field2574;
            } else if (null == var2.field2574) {
                return false;
            } else {
                return this.hashCode() == var2.hashCode() && this.field2574.equals(var2.field2574);
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.field2574 == null ? 0 : this.field2574.hashCode();
    }

    @Override
    public String toString() {
        return this.method1706();
    }

    public int method1705(class358 var1) {
        if (this.field2574 == null) {
            return null == var1.field2574 ? 0 : 1;
        } else {
            return null == var1.field2574 ? -1 : this.field2574.compareTo(var1.field2574);
        }
    }

    @Override
    public int compareTo(Object var1) {
        return this.method1705((class358) var1);
    }
}
