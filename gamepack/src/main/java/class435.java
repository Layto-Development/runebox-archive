import java.util.Iterator;

public class class435 {
    public final class300 field2963;
    public final class55 field2962;
    final class194 field2960;
    int field2961;

    class435(class194 var1) {
        this.field2961 = 0;
        this.field2960 = var1;
        this.field2963 = new class300(var1);
        this.field2962 = new class55(var1);
    }

    static final void method1998(String var0) {
        class157.method729(30, "", var0);
    }

    static final void method2001(String var0) {
        method1998(var0 + class32.field175);
    }

    static final void method2000() {
        method1998(class32.field357);
    }

    static final void method1997(String var0) {
        class46 var2 = class46.method134(class488.field3504, Client.field3840.field2238);
        var2.field541.method249(class78.method323(var0));
        var2.field541.method252(var0);
        Client.field3840.method1359(var2);
    }

    static final void method1996(String var0) {
        method1998(var0 + class32.field356);
    }

    static final void method2002() {
        method1998(class32.field358);
    }

    static final void method1999(String var0, int var1) {
        class46 var3 = class46.method134(class488.field3571, Client.field3840.field2238);
        var3.field541.method249(class78.method323(var0) + 1);
        var3.field541.method249(var1);
        var3.field541.method252(var0);
        Client.field3840.method1359(var3);
    }

    boolean method1982() {
        return this.field2961 == 2;
    }

    final void method1983() {
        this.field2961 = 1;
    }

    final void method1994(class78 var1, int var2) {
        this.field2963.method1331(var1, var2, (byte) -1);
        this.field2961 = 2;

        for (int var4 = 0; var4 < class172.field1443; ++var4) {
            class283 var5 = Client.field3948[class172.field1444[var4]];
            var5.method1283();
        }

        Iterator var7 = class157.field1339.iterator();

        while (var7.hasNext()) {
            class434 var6 = (class434) var7.next();
            var6.method1974();
        }

        if (class527.field4208 != null) {
            class527.field4208.method828();
        }

    }

    final void method1984() {
        for (class81 var2 = (class81) this.field2963.field2160.method178(); var2 != null; var2 = (class81) this.field2963.field2160.method177()) {
            if ((long) var2.field711 < class206.method982() / 1000L - 5L) {
                if (var2.field709 > 0) {
                    class157.method729(5, "", var2.field708 + class32.field334);
                }

                if (var2.field709 == 0) {
                    class157.method729(5, "", var2.field708 + class32.field228);
                }

                var2.method873();
            }
        }

    }

    final void method1985() {
        this.field2961 = 0;
        this.field2963.method48();
        this.field2962.method48();
    }

    final boolean method1986(class358 var1, boolean var2) {
        if (null == var1) {
            return false;
        } else if (var1.equals(class180.field1528.field2070)) {
            return true;
        } else {
            return this.field2963.method1330(var1, false);
        }
    }

    final boolean method1987(class358 var1) {
        if (null == var1) {
            return false;
        } else {
            return this.field2962.method64(var1);
        }
    }

    final void method1988(String var1) {
        if (var1 != null) {
            class358 var3 = new class358(var1, this.field2960);
            if (var3.method1707()) {
                if (this.method1989()) {
                    method1998(class32.field353);
                } else if (class180.field1528.field2070.equals(var3)) {
                    method2000();
                } else if (this.method1986(var3, false)) {
                    method2001(var1);
                } else if (this.method1987(var3)) {
                    method1998(class32.field359 + var1 + class32.field360);
                } else {
                    method1997(var1);
                }
            }
        }
    }

    final boolean method1989() {
        return this.field2963.method49() || this.field2963.method69() >= 200 && Client.field3904 != 1;
    }

    final void method1990(String var1) {
        if (null != var1) {
            class358 var3 = new class358(var1, this.field2960);
            if (var3.method1707()) {
                if (this.method1993()) {
                    method1998(class32.field355);
                } else if (class180.field1528.field2070.equals(var3)) {
                    method2002();
                } else if (this.method1987(var3)) {
                    method1996(var1);
                } else if (this.method1986(var3, false)) {
                    method1998(class32.field173 + var1 + class32.field332);
                } else {
                    class46 var4 = class46.method134(class488.field3552, Client.field3840.field2238);
                    var4.field541.method249(class78.method323(var1));
                    var4.field541.method252(var1);
                    Client.field3840.method1359(var4);
                }
            }
        }
    }

    final boolean method1993() {
        return this.field2962.method49() || this.field2962.method69() >= 100 && Client.field3904 != 1;
    }

    final void method1991(String var1) {
        if (null != var1) {
            class358 var3 = new class358(var1, this.field2960);
            if (var3.method1707()) {
                if (this.field2963.method67(var3)) {
                    Client.method2391();
                    class46 var4 = class46.method134(class488.field3532, Client.field3840.field2238);
                    var4.field541.method249(class78.method323(var1));
                    var4.field541.method252(var1);
                    Client.field3840.method1359(var4);
                }

                for (int var6 = 0; var6 < class172.field1443; ++var6) {
                    class283 var5 = Client.field3948[class172.field1444[var6]];
                    var5.method1283();
                }

                Iterator var7 = class157.field1339.iterator();

                while (var7.hasNext()) {
                    class434 var8 = (class434) var7.next();
                    var8.method1974();
                }

                if (null != class527.field4208) {
                    class527.field4208.method828();
                }

            }
        }
    }

    public final void method1992(String var1, boolean var2) {
        if (null != var1) {
            class358 var4 = new class358(var1, this.field2960);
            if (var4.method1707()) {
                if (this.field2962.method67(var4)) {
                    Client.method2391();
                    if (var2) {
                        class46 var5 = class46.method134(class488.field3554, Client.field3840.field2238);
                        var5.field541.method249(class78.method323(var1));
                        var5.field541.method252(var1);
                        Client.field3840.method1359(var5);
                    }
                }

                Client.method2483();
            }
        }
    }

    final boolean method1995(class358 var1) {
        class467 var3 = (class467) this.field2963.method50(var1);
        return null != var3 && var3.method1436();
    }
}
