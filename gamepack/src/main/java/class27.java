import java.util.HashMap;

public class class27 {
    static int field150;

    static {
        new HashMap();
    }

    class27() throws Throwable {
    }

    public static class330 method80(class330[] var0, int var1) {
        class330[] var3 = var0;

        for (int var4 = 0; var4 < var3.length; ++var4) {
            class330 var5 = var3[var4];
            if (var1 == var5.method1533()) {
                return var5;
            }
        }

        return null;
    }

    static int method79(int var0, class443 var1, boolean var2, byte var3) {
        if (var0 == 3300) {
            class269.field1988[++class56.field597 - 1] = Client.field4078;
            return 1;
        } else {
            int var4;
            int var5;
            if (var0 == 3301) {
                class56.field597 -= 2;
                var4 = class269.field1988[class56.field597];
                var5 = class269.field1988[class56.field597 + 1];
                class269.field1988[++class56.field597 - 1] = class163.method799(var4, var5);
                return 1;
            } else if (var0 == 3302) {
                class56.field597 -= 2;
                var4 = class269.field1988[class56.field597];
                var5 = class269.field1988[1 + class56.field597];
                class269.field1988[++class56.field597 - 1] = class163.method798(var4, var5);
                return 1;
            } else if (var0 == 3303) {
                class56.field597 -= 2;
                var4 = class269.field1988[class56.field597];
                var5 = class269.field1988[class56.field597 + 1];
                class269.field1988[++class56.field597 - 1] = class163.method800(var4, var5);
                return 1;
            } else if (var0 == 3304) {
                var4 = class269.field1988[--class56.field597];
                class269.field1988[++class56.field597 - 1] = class276.method1245(var4).field2021;
                return 1;
            } else if (var0 == 3305) {
                var4 = class269.field1988[--class56.field597];
                class269.field1988[++class56.field597 - 1] = Client.field3919[var4];
                return 1;
            } else if (var0 == 3306) {
                var4 = class269.field1988[--class56.field597];
                class269.field1988[++class56.field597 - 1] = Client.field4067[var4];
                return 1;
            } else if (var0 == 3307) {
                var4 = class269.field1988[--class56.field597];
                class269.field1988[++class56.field597 - 1] = Client.field4070[var4];
                return 1;
            } else {
                int var6;
                if (var0 == 3308) {
                    var4 = class201.field1651;
                    var5 = class357.field2573 + (class180.field1528.field4121 >> 7);
                    var6 = (class180.field1528.field4092 >> 7) + class5.field28;
                    class269.field1988[++class56.field597 - 1] = var6 + (var4 << 28) + (var5 << 14);
                    return 1;
                } else if (var0 == 3309) {
                    var4 = class269.field1988[--class56.field597];
                    class269.field1988[++class56.field597 - 1] = var4 >> 14 & 16383;
                    return 1;
                } else if (var0 == 3310) {
                    var4 = class269.field1988[--class56.field597];
                    class269.field1988[++class56.field597 - 1] = var4 >> 28;
                    return 1;
                } else if (var0 == 3311) {
                    var4 = class269.field1988[--class56.field597];
                    class269.field1988[++class56.field597 - 1] = var4 & 16383;
                    return 1;
                } else if (var0 == 3312) {
                    class269.field1988[++class56.field597 - 1] = Client.field3802 ? 1 : 0;
                    return 1;
                } else if (var0 == 3313) {
                    class56.field597 -= 2;
                    var4 = class269.field1988[class56.field597] + 32768;
                    var5 = class269.field1988[class56.field597 + 1];
                    class269.field1988[++class56.field597 - 1] = class163.method799(var4, var5);
                    return 1;
                } else if (var0 == 3314) {
                    class56.field597 -= 2;
                    var4 = class269.field1988[class56.field597] + 32768;
                    var5 = class269.field1988[1 + class56.field597];
                    class269.field1988[++class56.field597 - 1] = class163.method798(var4, var5);
                    return 1;
                } else if (var0 == 3315) {
                    class56.field597 -= 2;
                    var4 = class269.field1988[class56.field597] + 32768;
                    var5 = class269.field1988[1 + class56.field597];
                    class269.field1988[++class56.field597 - 1] = class163.method800(var4, var5);
                    return 1;
                } else if (var0 == 3316) {
                    if (Client.field3863 >= 2) {
                        class269.field1988[++class56.field597 - 1] = Client.field3863;
                    } else {
                        class269.field1988[++class56.field597 - 1] = 0;
                    }

                    return 1;
                } else if (var0 == 3317) {
                    class269.field1988[++class56.field597 - 1] = Client.field3795;
                    return 1;
                } else if (var0 == 3318) {
                    class269.field1988[++class56.field597 - 1] = Client.field3775;
                    return 1;
                } else if (var0 == 3321) {
                    class269.field1988[++class56.field597 - 1] = Client.field3892 / 100;
                    return 1;
                } else if (var0 == 3322) {
                    class269.field1988[++class56.field597 - 1] = Client.field4062;
                    return 1;
                } else if (var0 == 3323) {
                    if (Client.field4071) {
                        class269.field1988[++class56.field597 - 1] = 1;
                    } else {
                        class269.field1988[++class56.field597 - 1] = 0;
                    }

                    return 1;
                } else if (var0 == 3324) {
                    class269.field1988[++class56.field597 - 1] = Client.field3776;
                    return 1;
                } else if (var0 == 3325) {
                    class56.field597 -= 4;
                    var4 = class269.field1988[class56.field597];
                    var5 = class269.field1988[class56.field597 + 1];
                    var6 = class269.field1988[2 + class56.field597];
                    int var7 = class269.field1988[3 + class56.field597];
                    var4 += var5 << 14;
                    var4 += var6 << 28;
                    var4 += var7;
                    class269.field1988[++class56.field597 - 1] = var4;
                    return 1;
                } else if (var0 == 3326) {
                    class269.field1988[++class56.field597 - 1] = Client.field3791;
                    return 1;
                } else if (var0 == 3327) {
                    class269.field1988[++class56.field597 - 1] = Client.field3792;
                    return 1;
                } else if (var0 == 3331) {
                    class269.field1988[++class56.field597 - 1] = Client.field3892;
                    return 1;
                } else {
                    return 2;
                }
            }
        }
    }
}
