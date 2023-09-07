public class class195 implements Runnable {

	public static class449 field1861;

	public static final class449 field1863;

	static boolean field1865;

	static int field1862;

	static Object field1864;

	static {
		field1863 = new class449();
		field1861 = new class449();
		field1862 = 0;
		field1865 = false;
		field1864 = new Object();
	}

	class195() {
	}

	@Override
	public void run() {
		try {
			while (true) {
				class524 var1;
				synchronized (field1863) {
					var1 = (class524) field1863.method2218();
				}
				if (var1 != null) {
					if (var1.field4169 == 0) {
						var1.field4170.method77((int) var1.field785, var1.field4168, var1.field4168.length);
						synchronized (field1863) {
							var1.method318();
						}
					} else if (var1.field4169 == 1) {
						var1.field4168 = var1.field4170.method76((int) var1.field785);
						synchronized (field1863) {
							field1861.method2222(var1);
						}
					}
					synchronized (field1864) {
						if ((field1865 || field1862 <= 1) && field1863.method2221()) {
							field1862 = 0;
							field1864.notifyAll();
							return;
						}
						field1862 = 600;
					}
				} else {
					class39.method171(100L);
					synchronized (field1864) {
						if ((field1865 || field1862 <= 1) && field1863.method2221()) {
							field1862 = 0;
							field1864.notifyAll();
							return;
						}
						--field1862;
					}
				}
			}
		} catch (Exception var13) {
			class156.method917((String) null, var13);
		}
	}

	static void method1202(int var0, class27 var1, class13 var2) {
		class524 var4 = new class524();
		var4.field4169 = 1;
		var4.field785 = (long) var0;
		var4.field4170 = var1;
		var4.field4171 = var2;
		synchronized (field1863) {
			field1863.method2222(var4);
		}
		method1200();
	}

	static void method1200() {
		synchronized (field1864) {
			if (field1862 == 0) {
				class443.field3446 = new Thread(new class195());
				class443.field3446.setDaemon(true);
				class443.field3446.start();
				class443.field3446.setPriority(5);
			}
			field1862 = 600;
			field1865 = false;
		}
	}

	public static void method1201() {
		synchronized (field1864) {
			if (field1862 != 0) {
				field1862 = 1;
				field1865 = true;
				try {
					field1864.wait();
				} catch (InterruptedException var4) {
				}
			}
		}
	}
}
