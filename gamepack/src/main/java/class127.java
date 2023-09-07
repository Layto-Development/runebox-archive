import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class class127 {
    final int field1143;
    final String field1140;
    final ThreadFactory field1142;
    final ThreadPoolExecutor field1141;

    public class127(String var1, int var2, int var3) {
        this.field1140 = var1;
        this.field1143 = var2;
        this.field1142 = new class176(this);
        this.field1141 = this.method580(var3);
    }

    static void method583(int var0, String var1) {
        int var3 = class172.field1443;
        int[] var4 = class172.field1444;
        boolean var5 = false;
        class358 var6 = new class358(var1, class492.field3622);

        for (int var7 = 0; var7 < var3; ++var7) {
            class283 var8 = Client.field3948[var4[var7]];
            if (null != var8 && class180.field1528 != var8 && var8.field2070 != null && var8.field2070.equals(var6)) {
                class46 var9;
                if (var0 == 1) {
                    var9 = class46.method134(class488.field3507, Client.field3840.field2238);
                    var9.field541.method285(var4[var7]);
                    var9.field541.method296(0);
                    Client.field3840.method1359(var9);
                } else if (var0 == 4) {
                    var9 = class46.method134(class488.field3563, Client.field3840.field2238);
                    var9.field541.method312(var4[var7]);
                    var9.field541.method322(0);
                    Client.field3840.method1359(var9);
                } else if (var0 == 6) {
                    var9 = class46.method134(class488.field3545, Client.field3840.field2238);
                    var9.field541.method312(var4[var7]);
                    var9.field541.method296(0);
                    Client.field3840.method1359(var9);
                } else if (var0 == 7) {
                    var9 = class46.method134(class488.field3596, Client.field3840.field2238);
                    var9.field541.method318(var4[var7]);
                    var9.field541.method249(0);
                    Client.field3840.method1359(var9);
                }

                var5 = true;
                break;
            }
        }

        if (!var5) {
            class157.method729(4, "", class32.field317 + var1);
        }

    }

    static final String method584(int var0, int var1) {
        int var3 = var1 - var0;
        if (var3 < -9) {
            return class49.method140(16711680);
        } else if (var3 < -6) {
            return class49.method140(16723968);
        } else if (var3 < -3) {
            return class49.method140(16740352);
        } else if (var3 < 0) {
            return class49.method140(16756736);
        } else if (var3 > 9) {
            return class49.method140(65280);
        } else if (var3 > 6) {
            return class49.method140(4259584);
        } else if (var3 > 3) {
            return class49.method140(8453888);
        } else {
            return var3 > 0 ? class49.method140(12648192) : class49.method140(16776960);
        }
    }

    final ThreadPoolExecutor method580(int var1) {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(this.field1143), this.field1142);
    }

    public class13 method581(class189 var1) {
        if (this.field1141.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field1141.getCorePoolSize() + " Queue capacity " + this.field1143);
            return new class13("Queue full");
        } else {
            class13 var3 = new class13(this.field1141.submit(new class87(this, var1)));
            return var3;
        }
    }

    public final void method582() {
        try {
            this.field1141.shutdown();
        } catch (Exception var3) {
            System.err.println("Error shutting down RestRequestService\r\n" + var3);
        }

    }
}
