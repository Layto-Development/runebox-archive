public class class113 extends class156 {
    static byte[][] field1055;
    final boolean field1054;

    public class113(boolean var1) {
        this.field1054 = var1;
    }

    static final void method517(class514 var0) {
        var0.field4099 = false;
        if (var0.field4104 != -1) {
            class124 var2 = class124.method575(var0.field4104);
            if (null != var2) {
                if (!var2.method574() && null != var2.field1124) {
                    ++var0.field4134;
                    if (var0.field4091 < var2.field1124.length && var0.field4134 > var2.field1135[var0.field4091]) {
                        var0.field4134 = 1;
                        ++var0.field4091;
                        Client.method2405(var2, var0.field4091, var0.field4121, var0.field4092);
                    }

                    if (var0.field4091 >= var2.field1124.length) {
                        if (var2.field1128 > 0) {
                            var0.field4091 -= var2.field1128;
                            if (var2.field1136) {
                                ++var0.field4135;
                            }

                            if (var0.field4091 < 0 || var0.field4091 >= var2.field1124.length || var2.field1136 && var0.field4135 >= var2.field1117) {
                                var0.field4134 = 0;
                                var0.field4091 = 0;
                                var0.field4135 = 0;
                            }
                        } else {
                            var0.field4134 = 0;
                            var0.field4091 = 0;
                        }

                        Client.method2405(var2, var0.field4091, var0.field4121, var0.field4092);
                    }
                } else if (var2.method574()) {
                    ++var0.field4091;
                    int var3 = var2.method571();
                    if (var0.field4091 < var3) {
                        Client.method2413(var2, var0.field4091, var0.field4121, var0.field4092);
                    } else {
                        if (var2.field1128 > 0) {
                            var0.field4091 -= var2.field1128;
                            if (var2.field1136) {
                                ++var0.field4135;
                            }

                            if (var0.field4091 < 0 || var0.field4091 >= var3 || var2.field1136 && var0.field4135 >= var2.field1117) {
                                var0.field4091 = 0;
                                var0.field4134 = 0;
                                var0.field4135 = 0;
                            }
                        } else {
                            var0.field4134 = 0;
                            var0.field4091 = 0;
                        }

                        Client.method2413(var2, var0.field4091, var0.field4121, var0.field4092);
                    }
                } else {
                    var0.field4104 = -1;
                }
            } else {
                var0.field4104 = -1;
            }
        }

        class285 var7 = new class285(var0.method2505());

        int var4;
        for (class146 var8 = (class146) var7.method1298(); null != var8; var8 = (class146) var7.next()) {
            if (var8.field1290 != -1 && Client.field4078 >= var8.field1289) {
                var4 = class115.method525(var8.field1290).field1063;
                if (var4 == -1) {
                    var8.method221();
                    --var0.field4142;
                } else {
                    var8.field1287 = Math.max(var8.field1287, 0);
                    class124 var5 = class124.method575(var4);
                    if (null != var5.field1124 && !var5.method574()) {
                        ++var8.field1286;
                        if (var8.field1287 < var5.field1124.length && var8.field1286 > var5.field1135[var8.field1287]) {
                            var8.field1286 = 1;
                            ++var8.field1287;
                            Client.method2405(var5, var8.field1287, var0.field4121, var0.field4092);
                        }

                        if (var8.field1287 >= var5.field1124.length) {
                            var8.method221();
                            --var0.field4142;
                        }
                    } else if (var5.method574()) {
                        ++var8.field1287;
                        int var6 = var5.method571();
                        if (var8.field1287 < var6) {
                            Client.method2413(var5, var8.field1287, var0.field4121, var0.field4092);
                        } else {
                            var8.method221();
                            --var0.field4142;
                        }
                    } else {
                        var8.method221();
                        --var0.field4142;
                    }
                }
            }
        }

        class124 var9;
        if (var0.field4136 != -1 && var0.field4153 <= 1) {
            var9 = class124.method575(var0.field4136);
            if (var9.field1137 == 1 && var0.field4155 > 0 && var0.field4147 <= Client.field4078 && var0.field4148 < Client.field4078) {
                var0.field4153 = 1;
                return;
            }
        }

        if (var0.field4136 != -1 && var0.field4153 == 0) {
            var9 = class124.method575(var0.field4136);
            if (var9 != null) {
                if (!var9.method574() && var9.field1124 != null) {
                    ++var0.field4138;
                    if (var0.field4137 < var9.field1124.length && var0.field4138 > var9.field1135[var0.field4137]) {
                        var0.field4138 = 1;
                        ++var0.field4137;
                        Client.method2405(var9, var0.field4137, var0.field4121, var0.field4092);
                    }

                    if (var0.field4137 >= var9.field1124.length) {
                        var0.field4137 -= var9.field1128;
                        ++var0.field4118;
                        if (var0.field4118 >= var9.field1117) {
                            var0.field4136 = -1;
                        } else if (var0.field4137 >= 0 && var0.field4137 < var9.field1124.length) {
                            Client.method2405(var9, var0.field4137, var0.field4121, var0.field4092);
                        } else {
                            var0.field4136 = -1;
                        }
                    }

                    var0.field4099 = var9.field1131;
                } else if (var9.method574()) {
                    ++var0.field4137;
                    var4 = var9.method571();
                    if (var0.field4137 < var4) {
                        Client.method2413(var9, var0.field4137, var0.field4121, var0.field4092);
                    } else {
                        var0.field4137 -= var9.field1128;
                        ++var0.field4118;
                        if (var0.field4118 >= var9.field1117) {
                            var0.field4136 = -1;
                        } else if (var0.field4137 >= 0 && var0.field4137 < var4) {
                            Client.method2413(var9, var0.field4137, var0.field4121, var0.field4092);
                        } else {
                            var0.field4136 = -1;
                        }
                    }
                } else {
                    var0.field4136 = -1;
                }
            } else {
                var0.field4136 = -1;
            }
        }

        if (var0.field4153 > 0) {
            --var0.field4153;
        }

    }

    int method516(class324 var1, class324 var2) {
        if (var1.field2349 != 0) {
            if (var2.field2349 == 0) {
                return this.field1054 ? -1 : 1;
            }
        } else if (var2.field2349 != 0) {
            return this.field1054 ? 1 : -1;
        }

        return this.method727(var1, var2);
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method516((class324) var1, (class324) var2);
    }
}
