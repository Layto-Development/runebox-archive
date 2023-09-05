import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ny")
public class class208 implements Runnable {
	@ObfInfo(name = "ae", desc = "Low;")
	public static class113 field1862;
	@ObfInfo(name = "au", desc = "Low;")
	public static final class113 field1864;
	@ObfInfo(name = "at", desc = "Z")
	static boolean field1866;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -721787149)
	static int field1863;
	@ObfInfo(name = "ac", desc = "Ljava/lang/Object;")
	static Object field1865;

	static {
		field1864 = new class113();
		field1862 = new class113();
		field1863 = 0;
		field1866 = false;
		field1865 = new Object();
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class208() {
	}

	@ObfInfo(name = "run", desc = "()V")
	public void run() {
		try {
			while (true) {
				class231 var1;
				synchronized(field1864) {
					var1 = (class231)field1864.method627();
				}

				if (var1 != null) {
					if (var1.field1963 == 0) {
						var1.field1964.method2082((int)var1.field1483, var1.field1962, var1.field1962.length);
						synchronized(field1864) {
							var1.method907();
						}
					} else if (var1.field1963 == 1) {
						var1.field1962 = var1.field1964.method2081((int)var1.field1483);
						synchronized(field1864) {
							field1862.method631(var1);
						}
					}

					synchronized(field1865) {
						if ((field1866 || field1863 <= 1) && field1864.method630()) {
							field1863 = 0;
							field1865.notifyAll();
							return;
						}

						field1863 = 600;
					}
				} else {
					class296.method1638(100L);
					synchronized(field1865) {
						if ((field1866 || field1863 <= 1) && field1864.method630()) {
							field1863 = 0;
							field1865.notifyAll();
							return;
						}

						--field1863;
					}
				}
			}
		} catch (Exception var13) {
			class159.method913((String)null, var13);
		}
	}

	@ObfInfo(name = "au", desc = "(ILru;Lnk;B)V")
	static void method1158(int var0, class387 var1, class505 var2) {
		class231 var4 = new class231();
		var4.field1963 = 1;
		var4.field1483 = (long)var0;
		var4.field1964 = var1;
		var4.field1965 = var2;
		synchronized(field1864) {
			field1864.method631(var4);
		}

		method1156();
	}

	@ObfInfo(name = "ae", desc = "(I)V")
	static void method1156() {
		synchronized(field1865) {
			if (field1863 == 0) {
				class427.field3240 = new Thread(new class208());
				class427.field3240.setDaemon(true);
				class427.field3240.start();
				class427.field3240.setPriority(5);
			}

			field1863 = 600;
			field1866 = false;
		}
	}

	@ObfInfo(name = "ao", desc = "(I)V")
	public static void method1157() {
		synchronized(field1865) {
			if (field1863 != 0) {
				field1863 = 1;
				field1866 = true;

				try {
					field1865.wait();
				} catch (InterruptedException var4) {
				}
			}

		}
	}
}
