public class class404 {
    static class372 field2861;
    static class492 field2860;
    public byte field2863;
    public class358 field2862;
    public int field2864;

    class404() {
    }

    static final void method1854(class514 var0) {
        int var3;
        int var4;
        int var5;
        int var7;
        if (var0.field4126 != -1) {
            Object var2 = null;
            var3 = 65536;
            if (var0.field4126 < 65536) {
                var2 = Client.field3835[var0.field4126];
            } else {
                var2 = Client.field3948[var0.field4126 - 65536];
            }

            if (var2 != null) {
                var4 = var0.field4121 - ((class514) var2).field4121;
                var5 = var0.field4092 - ((class514) var2).field4092;
                if (var4 != 0 || var5 != 0) {
                    var7 = (int) (Math.atan2(var4, var5) * 325.94932345220167D) & 2047;
                    var0.field4132 = var7;
                }
            } else if (var0.field4096) {
                var0.field4126 = -1;
                var0.field4096 = false;
            }
        }

        int var8;
        if (var0.field4139 == 0 || var0.field4165 > 0) {
            var8 = -1;
            if (var0.field4129 != -1 && var0.field4130 != -1) {
                var3 = 64 + (var0.field4129 * 128 - class357.field2573 * 128);
                var4 = var0.field4130 * 128 - class5.field28 * 128 + 64;
                var5 = var0.field4121 - var3;
                int var6 = var0.field4092 - var4;
                if (var5 != 0 || var6 != 0) {
                    var7 = (int) (Math.atan2(var5, var6) * 325.94932345220167D) & 2047;
                    var8 = var7;
                }
            } else if (var0.field4128 != -1) {
                var8 = var0.field4128;
            }

            if (var8 != -1) {
                var0.field4132 = var8;
                if (var0.field4131) {
                    var0.field4093 = var0.field4132;
                }
            }

            var0.method2510();
        }

        var8 = var0.field4132 - var0.field4093 & 2047;
        if (var8 != 0) {
            boolean var9 = true;
            boolean var10 = true;
            ++var0.field4133;
            var5 = var8 > 1024 ? -1 : 1;
            var0.field4093 += var0.field4160 * var5;
            boolean var11 = true;
            if (var8 < var0.field4160 || var8 > 2048 - var0.field4160) {
                var0.field4093 = var0.field4132;
                var11 = false;
            }

            if (var0.field4160 > 0 && var0.field4104 == var0.field4097 && (var0.field4133 > 25 || var11)) {
                if (var5 == -1 && var0.field4098 != -1) {
                    var0.field4104 = var0.field4098;
                } else if (var5 == 1 && var0.field4159 != -1) {
                    var0.field4104 = var0.field4159;
                } else {
                    var0.field4104 = var0.field4100;
                }
            }

            var0.field4093 &= 2047;
        } else {
            if (var0.field4096) {
                var0.field4126 = -1;
                var0.field4096 = false;
            }

            var0.field4133 = 0;
        }

    }
}
