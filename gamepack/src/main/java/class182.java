import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class class182 {
    static int field1530;

    class182() throws Throwable {
    }

    static class228 method867(int var0) {
        class228 var2 = (class228) class124.field1126.method1307(var0);
        if (var2 != null) {
            return var2;
        } else {
            class68 var4 = class397.field2798;
            class68 var5 = class260.field1938;
            boolean var6 = true;
            byte[] var7 = var4.method196(var0 >> 16 & 65535, var0 & 65535);
            class228 var3;
            if (var7 == null) {
                var6 = false;
                var3 = null;
            } else {
                int var8 = (var7[1] & 255) << 8 | var7[2] & 255;
                byte[] var9 = var5.method196(var8, 0);
                if (var9 == null) {
                    var6 = false;
                }

                if (!var6) {
                    var3 = null;
                } else {
                    if (class228.field1788 == null) {
                        class309.field2256 = Runtime.getRuntime().availableProcessors();
                        class228.field1788 = new ThreadPoolExecutor(0, class309.field2256, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(100 + class309.field2256 * 100), new class333());
                    }

                    try {
                        var3 = new class228(var4, var5, var0, false);
                    } catch (Exception var11) {
                        var3 = null;
                    }
                }
            }

            if (var3 != null) {
                class124.field1126.method1306(var3, var0);
            }

            return var3;
        }
    }
}
