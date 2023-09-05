import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfInfo(name = "nq")
public class class19 {
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1953443809)
	static int field376;

	@ObfInfo(name = "<init>", desc = "()V")
	class19() throws Throwable {
	}

	@ObfInfo(name = "am", desc = "(II)Lfv;", opaqueValue = "1826782038")
	static class89 method330(int var0) {
		class89 var2 = (class89)class202.field1841.method294((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			class437 var4 = class29.field470;
			class437 var5 = class165.field1560;
			boolean var6 = true;
			byte[] var7 = var4.method2275(var0 >> 16 & 65535, var0 & 65535);
			class89 var3;
			if (var7 == null) {
				var6 = false;
				var3 = null;
			} else {
				int var8 = (var7[1] & 255) << 8 | var7[2] & 255;
				byte[] var9 = var5.method2275(var8, 0);
				if (var9 == null) {
					var6 = false;
				}

				if (!var6) {
					var3 = null;
				} else {
					if (class89.field893 == null) {
						class536.field4269 = Runtime.getRuntime().availableProcessors();
						class89.field893 = new ThreadPoolExecutor(0, class536.field4269, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100 + class536.field4269 * 100), new class327());
					}

					try {
						var3 = new class89(var4, var5, var0, false);
					} catch (Exception var11) {
						var3 = null;
					}
				}
			}

			if (var3 != null) {
				class202.field1841.method293(var3, (long)var0);
			}

			return var3;
		}
	}
}
