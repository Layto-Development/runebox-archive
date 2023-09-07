import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class class108 implements Runnable {
    public static String field1040;
    boolean field1039;
    class461 field1036;
    class461 field1037;
    Thread field1038;

    public class108() {
        this.field1036 = null;
        this.field1037 = null;
        this.field1039 = false;
        field1040 = "Unknown";
        class332.field2424 = "1.6";

        try {
            field1040 = System.getProperty("java.vendor");
            class332.field2424 = System.getProperty("java.version");
        } catch (Exception var2) {
        }

        this.field1039 = false;
        this.field1038 = new Thread(this);
        this.field1038.setPriority(10);
        this.field1038.setDaemon(true);
        this.field1038.start();
    }

    public final void method504() {
        synchronized (this) {
            this.field1039 = true;
            this.notifyAll();
        }

        try {
            this.field1038.join();
        } catch (InterruptedException var4) {
        }

    }

    @Override
    public final void run() {
        while (true) {
            class461 var1;
            synchronized (this) {
                while (true) {
                    if (this.field1039) {
                        return;
                    }

                    if (this.field1036 != null) {
                        var1 = this.field1036;
                        this.field1036 = this.field1036.field3160;
                        if (null == this.field1036) {
                            this.field1037 = null;
                        }
                        break;
                    }

                    try {
                        this.wait();
                    } catch (InterruptedException var7) {
                    }
                }
            }

            try {
                int var2 = var1.field3159;
                if (var2 == 1) {
                    var1.field3158 = new Socket(InetAddress.getByName((String) var1.field3161), var1.field3162);
                } else if (var2 == 2) {
                    Thread var3 = new Thread((Runnable) var1.field3161);
                    var3.setDaemon(true);
                    var3.start();
                    var3.setPriority(var1.field3162);
                    var1.field3158 = var3;
                } else if (var2 == 4) {
                    var1.field3158 = new DataInputStream(((URL) var1.field3161).openStream());
                }

                var1.field3157 = 1;
            } catch (ThreadDeath var5) {
                throw var5;
            } catch (Throwable var6) {
                var1.field3157 = 2;
            }
        }
    }

    final class461 method503(int var1, int var2, int var3, Object var4) {
        class461 var6 = new class461();
        var6.field3159 = var1;
        var6.field3162 = var2;
        var6.field3161 = var4;
        synchronized (this) {
            if (null != this.field1037) {
                this.field1037.field3160 = var6;
                this.field1037 = var6;
            } else {
                this.field1037 = this.field1036 = var6;
            }

            this.notify();
            return var6;
        }
    }

    public final class461 method501(String var1, int var2) {
        return this.method503(1, var2, 0, var1);
    }

    public final class461 method502(Runnable var1, int var2) {
        return this.method503(2, var2, 0, var1);
    }
}
