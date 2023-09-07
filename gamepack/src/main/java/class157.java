import java.io.DataInputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class class157 {
    static final class207 field1340;
    static final class208 field1339;
    static final Map<Integer, class476> field1338;
    public static String field1342;
    static int field1341;

    static {
        field1338 = new HashMap<Integer, class476>();
        field1339 = new class208(1024);
        field1340 = new class207();
        field1341 = 0;
    }

    class157() throws Throwable {
    }

    static void method729(int var0, String var1, String var2) {
        method736(var0, var1, var2, null);
    }

    static void method736(int var0, String var1, String var2, String var3) {
        class476 var5 = field1338.get(var0);
        if (var5 == null) {
            var5 = new class476();
            field1338.put(var0, var5);
        }

        class434 var6 = var5.method2184(var0, var1, var2, var3);
        field1339.method994(var6, var6.field2954);
        field1340.method983(var6);
        Client.field3980 = Client.field3777;
    }

    public static void method728(String var0, Throwable var1) {
        try {
            String var3 = "";
            if (var1 != null) {
                var3 = class80.method326(var1);
            }

            if (null != var0) {
                if (var1 != null) {
                    var3 = var3 + " | ";
                }

                var3 = var3 + var0;
            }

            System.out.println("Error: " + var3);
            var3 = var3.replace(':', '.');
            var3 = var3.replace('@', '_');
            var3 = var3.replace('&', '_');
            var3 = var3.replace('#', '_');
            if (null == class80.field701) {
                return;
            }

            URL var4 = new URL(class80.field701.getCodeBase(), "clienterror.ws?cv=" + class80.field707 + "&cs=" + class80.field703 + "&u=" + class80.field700 + "&v1=" + class108.field1040 + "&v2=" + class332.field2424 + "&ct=" + class80.field704 + "&e=" + var3);
            DataInputStream var5 = new DataInputStream(var4.openStream());
            var5.read();
            var5.close();
        } catch (Exception var6) {
        }

    }

    static class434 method735(int var0, int var1) {
        class476 var3 = field1338.get(var0);
        return var3.method2185(var1);
    }

    static class434 method730(int var0) {
        return (class434) field1339.method990(var0);
    }

    static int method733(int var0) {
        class476 var2 = field1338.get(var0);
        return null == var2 ? 0 : var2.method2183();
    }

    static void method731() {
        field1338.clear();
        field1339.method991();
        field1340.method989();
        field1341 = 0;
    }

    static int method732(int var0) {
        class434 var2 = (class434) field1339.method990(var0);
        if (null == var2) {
            return -1;
        } else {
            return var2.field3770 == field1340.field1678 ? -1 : ((class434) var2.field3770).field2954;
        }
    }

    static int method734(int var0) {
        class434 var2 = (class434) field1339.method990(var0);
        if (null == var2) {
            return -1;
        } else {
            return var2.field3769 == field1340.field1678 ? -1 : ((class434) var2.field3769).field2954;
        }
    }
}
