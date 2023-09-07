import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class class392 {

	static int field3110;

	class392() throws Throwable {
	}

	static class421 method2031(int var0) {
		class421 var2 = (class421) class67.field703.method648((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			class338 var4 = class136.field1491;
			class338 var5 = class59.field640;
			boolean var6 = true;
			byte[] var7 = var4.method1770(var0 >> 16 & 65535, var0 & 65535);
			class421 var3;
			if (var7 == null) {
				var6 = false;
				var3 = null;
			} else {
				int var8 = (var7[1] & 255) << 8 | var7[2] & 255;
				byte[] var9 = var5.method1770(var8, 0);
				if (var9 == null) {
					var6 = false;
				}
				if (!var6) {
					var3 = null;
				} else {
					if (class421.field3248 == null) {
						class307.field2370 = Runtime.getRuntime().availableProcessors();
						class421.field3248 = new ThreadPoolExecutor(0, class307.field2370, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100 + class307.field2370 * 100), new class191());
					}
					try {
						var3 = new class421(var4, var5, var0, false);
					} catch (Exception var11) {
						var3 = null;
					}
				}
			}
			if (var3 != null) {
				class67.field703.method647(var3, (long) var0);
			}
			return var3;
		}
	}
}
