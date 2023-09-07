public class class55 extends class20 {
    final class194 field596;

    public class55(class194 var1) {
        super(400);
        this.field596 = var1;
    }

    @Override
    class278 method66() {
        return new class431();
    }

    @Override
    class278[] method60(int var1) {
        return new class431[var1];
    }

    public void method163(class78 var1, int var2) {
        while (var1.field697 < var2) {
            int var4 = var1.method260();
            if (var4 == 4) {
                class358 var10 = new class358(var1.method268(), this.field596);
                if (!var10.method1707()) {
                    throw new IllegalStateException();
                }

                boolean var11 = false;
                class153.field1320.method1992(var10.method1706(), false);
            } else {
                boolean var5 = (var4 & 1) != 0;
                class358 var6 = new class358(var1.method268(), this.field596);
                class358 var7 = new class358(var1.method268(), this.field596);
                var1.method268();
                if (!var6.method1707()) {
                    throw new IllegalStateException();
                }

                class431 var8 = (class431) this.method51(var6);
                if (var5) {
                    class431 var9 = (class431) this.method51(var7);
                    if (null != var9 && var8 != var9) {
                        if (var8 != null) {
                            this.method52(var9);
                        } else {
                            var8 = var9;
                        }
                    }
                }

                if (null != var8) {
                    this.method55(var8, var6, var7);
                } else if (this.method69() < 400) {
                    int var12 = this.method69();
                    var8 = (class431) this.method53(var6, var7);
                    var8.field2935 = var12;
                }
            }
        }

    }
}
