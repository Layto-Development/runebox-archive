public class class300 extends class20 {
    final class194 field2161;
    public class60 field2160;
    int field2162;

    public class300(class194 var1) {
        super(400);
        this.field2162 = 1;
        this.field2160 = new class60();
        this.field2161 = var1;
    }

    @Override
    class278 method66() {
        return new class467();
    }

    @Override
    class278[] method60(int var1) {
        return new class467[var1];
    }

    public boolean method1330(class358 var1, boolean var2) {
        class467 var4 = (class467) this.method50(var1);
        return null != var4;
    }

    public void method1331(class78 var1, int var2, byte var3) {
        while (true) {
            if (var1.field697 < var2) {
                boolean var4 = var1.method260() == 1;
                class358 var5 = new class358(var1.method268(), this.field2161);
                class358 var6 = new class358(var1.method268(), this.field2161);
                int var7 = var1.method309();
                int var8 = var1.method260();
                int var9 = var1.method260();
                boolean var10 = (var9 & 2) != 0;
                boolean var11 = (var9 & 1) != 0;
                if (var7 > 0) {
                    var1.method268();
                    var1.method260();
                    var1.method264();
                }

                var1.method268();
                if (var5 != null && var5.method1707()) {
                    class467 var12 = (class467) this.method51(var5);
                    if (var4) {
                        class467 var13 = (class467) this.method51(var6);
                        if (var13 != null && var13 != var12) {
                            if (var12 != null) {
                                this.method52(var13);
                            } else {
                                var12 = var13;
                            }
                        }
                    }

                    if (null != var12) {
                        this.method55(var12, var5, var6);
                        if (var12.field2349 != var7) {
                            boolean var15 = true;

                            for (class81 var14 = (class81) this.field2160.method178(); null != var14; var14 = (class81) this.field2160.method177()) {
                                if (var14.field708.equals(var5)) {
                                    if (var7 != 0 && var14.field709 == 0) {
                                        var14.method873();
                                        var15 = false;
                                    } else if (var7 == 0 && var14.field709 != 0) {
                                        var14.method873();
                                        var15 = false;
                                    }
                                }
                            }

                            if (var15) {
                                this.field2160.method176(new class81(var5, var7));
                            }
                        }
                    } else {
                        if (this.method69() >= 400) {
                            continue;
                        }

                        var12 = (class467) this.method53(var5, var6);
                    }

                    if (var7 != var12.field2349) {
                        var12.field2348 = ++this.field2162 - 1;
                        if (var12.field2349 == -1 && var7 == 0) {
                            var12.field2348 = -(var12.field2348 * -1297576351) * -585067103;
                        }

                        var12.field2349 = var7;
                    }

                    var12.field2350 = var8;
                    var12.field3315 = var10;
                    var12.field3316 = var11;
                    continue;
                }

                throw new IllegalStateException();
            }

            this.method70();
            return;
        }
    }
}
