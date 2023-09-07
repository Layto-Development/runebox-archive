public class class352 implements Runnable {
    static class539 field2545;
    volatile class398[] field2546;

    class352() {
        this.field2546 = new class398[2];
    }

    static final void method1648(int var0, int var1, boolean var2) {
        if (Client.field4020[var0] != null) {
            if (var1 >= 0 && var1 < Client.field4020[var0].method1388()) {
                class404 var4 = Client.field4020[var0].field2263.get(var1);
                class46 var5 = class46.method134(class488.field3585, Client.field3840.field2238);
                var5.field541.method249(4 + class78.method323(var4.field2862.method1706()));
                var5.field541.method249(var0);
                var5.field541.method290(var1);
                var5.field541.method251(var2);
                var5.field541.method252(var4.field2862.method1706());
                Client.field3840.method1359(var5);
            }
        }
    }

    @Override
    public void run() {
        try {
            for (int var1 = 0; var1 < 2; ++var1) {
                class398 var2 = this.field2546[var1];
                if (var2 != null) {
                    var2.method1833();
                }
            }
        } catch (Exception var3) {
            class157.method728(null, var3);
        }

    }
}
