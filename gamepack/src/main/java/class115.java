import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class class115 extends class510 {
    public static class289 field1059;
    public static class289 field1060;
    public static class68 field1058;
    public static class68 field1071;
    static boolean field1064;

    static {
        field1059 = new class289(64);
        field1060 = new class289(30);
    }

    public int field1063;
    int field1057;
    int field1061;
    int field1062;
    int field1069;
    int field1070;
    int field1072;
    int field1073;
    short[] field1065;
    short[] field1066;
    short[] field1067;
    short[] field1068;

    class115() {
        this.field1063 = -1;
        this.field1057 = 128;
        this.field1069 = 128;
        this.field1070 = 0;
        this.field1062 = 0;
        this.field1072 = 0;
    }

    public static class115 method525(int var0) {
        class115 var2 = (class115) field1059.method1307(var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = field1071.method188(13, var0);
            var2 = new class115();
            var2.field1061 = var0;
            if (var3 != null) {
                var2.method523(new class78(var3));
            }

            field1059.method1306(var2, var0);
            return var2;
        }
    }

    static Date method524() throws ParseException {
        SimpleDateFormat var1 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
        var1.setLenient(false);
        StringBuilder var2 = new StringBuilder();
        String[] var3 = class500.field3673;

        for (int var4 = 0; var4 < var3.length; ++var4) {
            String var5 = var3[var4];
            if (var5 == null) {
                class500.method2256(7);
                class500.method2268("Date not valid.", "Please ensure all characters are populated.", "");
                return null;
            }

            var2.append(var5);
        }

        var2.append("12");
        return var1.parse(var2.toString());
    }

    void method523(class78 var1) {
        while (true) {
            int var3 = var1.method260();
            if (var3 == 0) {
                return;
            }

            this.method520(var1, var3);
        }
    }

    void method520(class78 var1, int var2) {
        if (var2 == 1) {
            this.field1073 = var1.method309();
        } else if (var2 == 2) {
            this.field1063 = var1.method309();
        } else if (var2 == 4) {
            this.field1057 = var1.method309();
        } else if (var2 == 5) {
            this.field1069 = var1.method309();
        } else if (var2 == 6) {
            this.field1070 = var1.method309();
        } else if (var2 == 7) {
            this.field1062 = var1.method260();
        } else if (var2 == 8) {
            this.field1072 = var1.method260();
        } else {
            int var4;
            int var5;
            if (var2 == 40) {
                var4 = var1.method260();
                this.field1068 = new short[var4];
                this.field1065 = new short[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field1068[var5] = (short) var1.method309();
                    this.field1065[var5] = (short) var1.method309();
                }
            } else if (var2 == 41) {
                var4 = var1.method260();
                this.field1066 = new short[var4];
                this.field1067 = new short[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field1066[var5] = (short) var1.method309();
                    this.field1067[var5] = (short) var1.method309();
                }
            }
        }

    }

    public final class448 method521(int var1) {
        class448 var3 = this.method522();
        class448 var4;
        if (this.field1063 != -1 && var1 != -1) {
            var4 = class124.method575(this.field1063).method567(var3, var1);
        } else {
            var4 = var3.method2071(true);
        }

        if (this.field1057 != 128 || this.field1069 != 128) {
            var4.method2058(this.field1057, this.field1069, this.field1057);
        }

        if (this.field1070 != 0) {
            if (this.field1070 == 90) {
                var4.method2055();
            }

            if (this.field1070 == 180) {
                var4.method2055();
                var4.method2055();
            }

            if (this.field1070 == 270) {
                var4.method2055();
                var4.method2055();
                var4.method2055();
            }
        }

        return var4;
    }

    public final class448 method522() {
        class448 var2 = (class448) field1060.method1307(this.field1061);
        if (null == var2) {
            class175 var3 = class175.method850(field1058, this.field1073, 0);
            if (var3 == null) {
                return null;
            }

            int var4;
            if (null != this.field1068) {
                for (var4 = 0; var4 < this.field1068.length; ++var4) {
                    var3.method849(this.field1068[var4], this.field1065[var4]);
                }
            }

            if (this.field1066 != null) {
                for (var4 = 0; var4 < this.field1066.length; ++var4) {
                    var3.method840(this.field1066[var4], this.field1067[var4]);
                }
            }

            var2 = var3.method846(64 + this.field1062, 850 + this.field1072, -30, -50, -30);
            field1060.method1306(var2, this.field1061);
        }

        return var2;
    }
}
