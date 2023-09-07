import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public abstract class class357 implements Runnable {
    static int field2573;
    final Thread field2572;
    int field2571;
    Queue<class244> field2569;
    volatile boolean field2570;

    class357(int var1) {
        this.field2569 = new LinkedList<class244>();
        this.field2572 = new Thread(this);
        this.field2572.setPriority(1);
        this.field2572.start();
        this.field2571 = var1;
    }

    public static void method1703() {
        class141.field1241.clear();
    }

    abstract void method1697(class244 var1) throws IOException;

    @Override
    public void run() {
        while (!this.field2570) {
            try {
                class244 var1;
                synchronized (this) {
                    var1 = this.field2569.poll();
                    if (var1 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var5) {
                        }
                        continue;
                    }
                }

                this.method1697(var1);
            } catch (Exception var7) {
                class157.method728(null, var7);
            }
        }

    }

    int method1701(URLConnection var1) {
        int var3 = class244.field1863;
        if (var1 != null) {
            try {
                if (var1 instanceof HttpURLConnection) {
                    var3 = ((HttpURLConnection) var1).getResponseCode();
                }
            } catch (IOException var5) {
            }
        }

        return var3;
    }

    void method1702(URLConnection var1) {
        var1.setConnectTimeout(5000);
        var1.setReadTimeout(5000);
        var1.setUseCaches(false);
        var1.setRequestProperty("Connection", "close");
        var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field2571);
    }

    void method1698(URLConnection var1, class244 var2) {
        DataInputStream var4 = null;

        try {
            int var6 = var1.getContentLength();
            var4 = new DataInputStream(var1.getInputStream());
            byte[] var5;
            if (var6 >= 0) {
                var5 = new byte[var6];
                var4.readFully(var5);
            } else {
                var5 = new byte[0];
                byte[] var7 = class63.method183(5000);

                byte[] var9;
                for (int var8 = var4.read(var7, 0, var7.length); var8 > -1; var5 = var9) {
                    var9 = new byte[var5.length + var8];
                    System.arraycopy(var5, 0, var9, 0, var5.length);
                    System.arraycopy(var7, 0, var9, var5.length, var8);
                }

                class63.method185(var7);
            }

            var2.field1865 = var5;
        } catch (IOException var15) {
            var2.field1865 = null;
        } finally {
            var2.field1864 = this.method1701(var1);
        }

        if (var4 != null) {
            try {
                var4.close();
            } catch (IOException var14) {
            }
        }

    }

    public class244 method1699(URL var1) {
        class244 var3 = new class244(var1);
        synchronized (this) {
            this.field2569.add(var3);
            this.notify();
            return var3;
        }
    }

    public void method1700() {
        this.field2570 = true;

        try {
            synchronized (this) {
                this.notify();
            }

            this.field2572.join();
        } catch (InterruptedException var5) {
        }

    }
}
