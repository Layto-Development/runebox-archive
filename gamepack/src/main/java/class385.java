public class class385 {
    static class262 field2763;

    class385() throws Throwable {
    }

    public static void method1779(class262 var0) {
        field2763 = var0;
    }

    public static int method1781(class78 var0, String var1) {
        int var3 = var0.field697;
        byte[] var4 = class209.method997(var1);
        var0.method304(var4.length);
        var0.field697 += field2763.method1149(var4, 0, var4.length, var0.field695, var0.field697);
        return var0.field697 - var3;
    }

    public static String method1782(class78 var0) {
        return method1780(var0, 32767);
    }

    static String method1780(class78 var0, int var1) {
        try {
            int var3 = var0.method307();
            if (var3 > 32767) {
                var3 = 32767;
            }

            byte[] var4 = new byte[var3];
            var0.field697 += field2763.method1150(var0.field695, var0.field697, var4, 0, var3);
            String var5 = class209.method999(var4, 0, var3);
            return var5;
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
