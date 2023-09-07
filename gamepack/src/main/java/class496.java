import java.awt.*;

public class class496 {
    static class539 field3631;
    static FontMetrics field3630;

    class496() throws Throwable {
    }

    static final void method2247(String var0) {
        if (var0.equalsIgnoreCase("toggleroof")) {
            class290.field2121.method2527(!class290.field2121.method2528());
            if (class290.field2121.method2528()) {
                class157.method729(99, "", "Roofs are now all hidden");
            } else {
                class157.method729(99, "", "Roofs will only be removed selectively");
            }
        }

        if (var0.startsWith("zbuf")) {
            boolean var2 = class95.method368(var0.substring(5).trim()) == 1;
            class268.field1973.method2199(var2);
            class334.method1580(var2);
        }

        if (var0.equalsIgnoreCase("z")) {
            Client.field3839 = !Client.field3839;
        }

        if (var0.equalsIgnoreCase("displayfps")) {
            class290.field2121.method2531();
        }

        if (var0.equalsIgnoreCase("renderself")) {
            Client.field4013 = !Client.field4013;
        }

        if (var0.equalsIgnoreCase("mouseovertext")) {
            Client.field3935 = !Client.field3935;
        }

        if (Client.field3863 >= 2) {
            if (var0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }

            if (var0.equalsIgnoreCase("showcoord")) {
                class466.field3310.field943 = !class466.field3310.field943;
            }

            if (var0.equalsIgnoreCase("fpson")) {
                class290.field2121.method2530(true);
            }

            if (var0.equalsIgnoreCase("fpsoff")) {
                class290.field2121.method2530(false);
            }

            if (var0.equalsIgnoreCase("gc")) {
                System.gc();
            }

            if (var0.equalsIgnoreCase("clientdrop")) {
                Client.method2425();
            }
        }

        class46 var3 = class46.method134(class488.field3580, Client.field3840.field2238);
        var3.field541.method249(var0.length() + 1);
        var3.field541.method252(var0);
        Client.field3840.method1359(var3);
    }
}
