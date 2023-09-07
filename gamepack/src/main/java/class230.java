public class class230 {
    static final class230 field1794;
    static final class230 field1795;
    static final class230 field1796;
    static final class230 field1797;
    static final class230 field1798;
    static final class230 field1799;
    static final class230 field1800;
    static final class230 field1801;
    static final class230 field1802;
    static final class230 field1803;
    static final class230 field1804;
    static final class230 field1805;
    static final class230 field1806;
    static final class230 field1807;
    static final class230 field1808;
    static final class230 field1809;

    static {
        field1804 = new class230();
        field1795 = new class230();
        field1803 = new class230();
        field1797 = new class230();
        field1798 = new class230();
        field1802 = new class230();
        field1800 = new class230();
        field1801 = new class230();
        field1794 = new class230();
        field1808 = new class230();
        field1809 = new class230();
        field1806 = new class230();
        field1805 = new class230();
        field1799 = new class230();
        field1807 = new class230();
        field1796 = new class230();
    }

    class230() {
    }

    static void method1052(class283 var0, boolean var1) {
        if (null != var0 && var0.method2501() && !var0.field2073) {
            var0.field2071 = (Client.field3779 && class172.field1443 > 50 || class172.field1443 > 200) && var1 && var0.field4097 == var0.field4104;

            int var3 = var0.field4121 >> 7;
            int var4 = var0.field4092 >> 7;
            if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                long var5 = class368.method1741(0, 0, 0, false, var0.field2053);
                if (null != var0.field2066 && Client.field4078 >= var0.field2062 && Client.field4078 < var0.field2072) {
                    var0.field2071 = false;
                    var0.field2060 = Client.method2342(var0.field4121, var0.field4092, class201.field1651);
                    var0.field4127 = Client.field4078;
                    class329.field2414.method746(class201.field1651, var0.field4121, var0.field4092, var0.field2060, 60, var0, var0.field4093, var5, var0.field2078, var0.field2068, var0.field2069, var0.field2058);
                } else {
                    if ((var0.field4121 & 127) == 64 && (var0.field4092 & 127) == 64) {
                        if (Client.field3945 == Client.field3891[var3][var4]) {
                            return;
                        }

                        Client.field3891[var3][var4] = Client.field3945;
                    }

                    var0.field2060 = Client.method2342(var0.field4121, var0.field4092, class201.field1651);
                    var0.field4127 = Client.field4078;
                    class329.field2414.method745(class201.field1651, var0.field4121, var0.field4092, var0.field2060, 60, var0, var0.field4093, var5, var0.field4099);
                }
            }
        }

    }
}
