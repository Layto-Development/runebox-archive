public class class131 {
    class374[] field1156;
    int field1157;
    int field1158;

    class131(class78 var1) {
        this.field1156 = new class374[10];

        for (int var2 = 0; var2 < 10; ++var2) {
            int var3 = var1.method260();
            if (var3 != 0) {
                --var1.field697;
                this.field1156[var2] = new class374();
                this.field1156[var2].method1761(var1);
            }
        }

        this.field1157 = var1.method309();
        this.field1158 = var1.method309();
    }

    public static class131 method590(class68 var0, int var1, int var2) {
        byte[] var3 = var0.method188(var1, var2);
        return var3 == null ? null : new class131(new class78(var3));
    }

    public class433 method588() {
        byte[] var1 = this.method591();
        return new class433(22050, var1, this.field1157 * 22050 / 1000, this.field1158 * 22050 / 1000);
    }

    public final int method589() {
        int var1 = 9999999;

        int var2;
        for (var2 = 0; var2 < 10; ++var2) {
            if (this.field1156[var2] != null && this.field1156[var2].field2708 / 20 < var1) {
                var1 = this.field1156[var2].field2708 / 20;
            }
        }

        if (this.field1157 < this.field1158 && this.field1157 / 20 < var1) {
            var1 = this.field1157 / 20;
        }

        if (var1 != 9999999 && var1 != 0) {
            for (var2 = 0; var2 < 10; ++var2) {
                if (this.field1156[var2] != null) {
                    class374 var10000 = this.field1156[var2];
                    var10000.field2708 -= var1 * 20;
                }
            }

            if (this.field1157 < this.field1158) {
                this.field1157 -= var1 * 20;
                this.field1158 -= var1 * 20;
            }

            return var1;
        } else {
            return 0;
        }
    }

    final byte[] method591() {
        int var1 = 0;

        int var2;
        for (var2 = 0; var2 < 10; ++var2) {
            if (this.field1156[var2] != null && this.field1156[var2].field2700 + this.field1156[var2].field2708 > var1) {
                var1 = this.field1156[var2].field2700 + this.field1156[var2].field2708;
            }
        }

        if (var1 == 0) {
            return new byte[0];
        } else {
            var2 = var1 * 22050 / 1000;
            byte[] var3 = new byte[var2];

            for (int var4 = 0; var4 < 10; ++var4) {
                if (this.field1156[var4] != null) {
                    int var5 = this.field1156[var4].field2700 * 22050 / 1000;
                    int var6 = this.field1156[var4].field2708 * 22050 / 1000;
                    int[] var7 = this.field1156[var4].method1760(var5, this.field1156[var4].field2700);

                    for (int var8 = 0; var8 < var5; ++var8) {
                        int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                        if ((var9 + 128 & -256) != 0) {
                            var9 = var9 >> 31 ^ 127;
                        }

                        var3[var8 + var6] = (byte) var9;
                    }
                }
            }

            return var3;
        }
    }
}
