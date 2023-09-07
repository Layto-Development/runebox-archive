public class class174 extends class20 {
    static class357 field1465;
    final class160 field1464;
    final class194 field1459;
    public byte field1462;
    public int field1463;
    public String field1458;
    public String field1461;
    int field1460;

    public class174(class194 var1, class160 var2) {
        super(500);
        this.field1458 = null;
        this.field1461 = null;
        this.field1460 = 1;
        this.field1459 = var1;
        this.field1464 = var2;
    }

    @Override
    class278 method66() {
        return new class281();
    }

    @Override
    class278[] method60(int var1) {
        return new class281[var1];
    }

    final void method824(String var1) {
        this.field1458 = class403.method1853(var1);
    }

    final void method825(String var1) {
        this.field1461 = class403.method1853(var1);
    }

    public final void method826(class78 var1, int var2) {
        this.method825(var1.method268());
        long var4 = var1.method265();
        long var7 = var4;
        String var6;
        int var9;
        if (var4 > 0L && var4 < 6582952005840035281L) {
            if (var4 % 37L == 0L) {
                var6 = null;
            } else {
                var9 = 0;

                for (long var10 = var4; 0L != var10; var10 /= 37L) {
                    ++var9;
                }

                StringBuilder var12 = new StringBuilder(var9);

                while (var7 != 0L) {
                    long var13 = var7;
                    var7 /= 37L;
                    var12.append(class403.field2857[(int) (var13 - var7 * 37L)]);
                }

                var6 = var12.reverse().toString();
            }
        } else {
            var6 = null;
        }

        this.method824(var6);
        this.field1462 = var1.method261();
        short var15;
        if (var2 == 1) {
            var9 = var1.method260();
            var15 = 255;
        } else {
            if (var2 != 2) {
                throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
            }

            var9 = var1.method272();
            var15 = -1;
        }

        if (var15 != var9) {
            int var11 = var9;
            this.method48();

            for (int var16 = 0; var16 < var11; ++var16) {
                class281 var17 = (class281) this.method63(new class358(var1.method268(), this.field1459));
                int var14 = var1.method309();
                var17.method1434(var14, ++this.field1460 - 1);
                var17.field2350 = var1.method261();
                var1.method268();
                this.method829(var17);
            }

        }
    }

    public final void method827(class78 var1, byte var2) {
        class358 var3 = new class358(var1.method268(), this.field1459);
        int var4 = var1.method309();
        byte var5 = var1.method261();
        boolean var6 = var5 == -128;

        class281 var7;
        if (var6) {
            if (this.method69() == 0) {
                return;
            }

            var7 = (class281) this.method51(var3);
            if (var7 != null && var7.method1435() == var4) {
                this.method52(var7);
            }
        } else {
            var1.method268();
            var7 = (class281) this.method51(var3);
            if (null == var7) {
                if (this.method69() > super.field70) {
                    return;
                }

                var7 = (class281) this.method63(var3);
            }

            var7.method1434(var4, ++this.field1460 - 1);
            var7.field2350 = var5;
            this.method829(var7);
        }

    }

    public final void method828() {
        for (int var2 = 0; var2 < this.method69(); ++var2) {
            ((class281) this.method56(var2)).method1275();
        }

    }

    public final void method823(byte var1) {
        for (int var2 = 0; var2 < this.method69(); ++var2) {
            ((class281) this.method56(var2)).method1280();
        }

    }

    final void method829(class281 var1) {
        if (var1.method1247().equals(this.field1464.method794())) {
            this.field1463 = var1.field2350;
        }

    }
}
