import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class class505 {
	static int field4176;

	class505() throws Throwable {
	}

	static void method2431() {
		class307 var1 = null;

		try {
			var1 = class475.method2301("", class498.field4148.field3982, true);
			class42 var2 = class176.field1701.method2485();
			var1.method1735(var2.field525, 0, var2.field527);
		} catch (Exception var4) {
		}

		try {
			if (var1 != null) {
				var1.method1739(true);
			}
		} catch (Exception var3) {
		}

	}

	static class429 method2430(int var0) {
		class429 var2 = (class429)class393.field3298.method1890((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			class215 var4 = class243.field2218;
			class215 var5 = class180.field1710;
			boolean var6 = true;
			byte[] var7 = var4.method1220(var0 >> 16 & 65535, var0 & 65535);
			class429 var3;
			if (var7 == null) {
				var6 = false;
				var3 = null;
			} else {
				int var8 = (var7[1] & 255) << 8 | var7[2] & 255;
				byte[] var9 = var5.method1220(var8, 0);
				if (var9 == null) {
					var6 = false;
				}

				if (!var6) {
					var3 = null;
				} else {
					if (class429.field3530 == null) {
						class201.field1864 = Runtime.getRuntime().availableProcessors();
						class429.field3530 = new ThreadPoolExecutor(0, class201.field1864, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100 + class201.field1864 * 100), new class437());
					}

					try {
						var3 = new class429(var4, var5, var0, false);
					} catch (Exception var11) {
						var3 = null;
					}
				}
			}

			if (var3 != null) {
				class393.field3298.method1889(var3, (long)var0);
			}

			return var3;
		}
	}
}
