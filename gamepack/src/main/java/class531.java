public class class531 implements Runnable {
    public static final class43 field4228;
    public static class43 field4226;
    static boolean field4230;
    static int field4227;
    static Object field4229;

    static {
        field4228 = new class43();
        field4226 = new class43();
        field4227 = 0;
        field4230 = false;
        field4229 = new Object();
    }

    class531() {
    }

    static void method2524(int var0, class239 var1, class372 var2) {
        class489 var4 = new class489();
        var4.field3598 = 1;
        var4.field658 = var0;
        var4.field3599 = var1;
        var4.field3600 = var2;
        synchronized (field4228) {
            field4228.method126(var4);
        }

        method2522();
    }

    static void method2522() {
        synchronized (field4229) {
            if (field4227 == 0) {
                class169.field1436 = new Thread(new class531());
                class169.field1436.setDaemon(true);
                class169.field1436.start();
                class169.field1436.setPriority(5);
            }

            field4227 = 600;
            field4230 = false;
        }
    }

    public static void method2523() {
        synchronized (field4229) {
            if (field4227 != 0) {
                field4227 = 1;
                field4230 = true;

                try {
                    field4229.wait();
                } catch (InterruptedException var4) {
                }
            }

        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                class489 var1;
                synchronized (field4228) {
                    var1 = (class489) field4228.method122();
                }

                if (var1 != null) {
                    if (var1.field3598 == 0) {
                        var1.field3599.method1070((int) var1.field658, var1.field3597, var1.field3597.length);
                        synchronized (field4228) {
                            var1.method221();
                        }
                    } else if (var1.field3598 == 1) {
                        var1.field3597 = var1.field3599.method1069((int) var1.field658);
                        synchronized (field4228) {
                            field4226.method126(var1);
                        }
                    }

                    synchronized (field4229) {
                        if ((field4230 || field4227 <= 1) && field4228.method125()) {
                            field4227 = 0;
                            field4229.notifyAll();
                            return;
                        }

                        field4227 = 600;
                    }
                } else {
                    class316.method1394(100L);
                    synchronized (field4229) {
                        if ((field4230 || field4227 <= 1) && field4228.method125()) {
                            field4227 = 0;
                            field4229.notifyAll();
                            return;
                        }

                        --field4227;
                    }
                }
            }
        } catch (Exception var13) {
            class157.method728(null, var13);
        }
    }
}
