import java.util.ArrayList;
import java.util.Iterator;

public class class288 {
    static final class288 field2106;
    static final class288 field2108;
    static long field2109;

    static {
        field2106 = new class288(0);
        field2108 = new class288(1);
    }

    final int field2107;

    class288(int var1) {
        this.field2107 = var1;
    }

    static void method1302(ArrayList<class537> var0, boolean var1) {
        if (!var1) {
            class141.field1241.clear();
        }

        Iterator<class537> var3 = var0.iterator();

        while (var3.hasNext()) {
            class537 var4 = var3.next();
            if (var4.field4267 != -1 && var4.field4268 != -1) {
                if (!var1) {
                    class141.field1241.add(var4);
                }

                class141.field1247.add(var4);
            }
        }

    }

    static void method1303(int var0) {
        Client.field4005 = 0L;
		Client.field4006 = var0 >= 2;

        if (Client.method2423() == 1) {
            class268.field1973.method2188(765, 503);
        } else {
            class268.field1973.method2188(7680, 2160);
        }

        if (Client.field3859 >= 25) {
            Client.method2361();
        }

    }
}
