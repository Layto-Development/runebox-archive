import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TimeZone;

@ObfInfo(name = "lc")
@class103
public final class class354 {
	@ObfInfo(name = "ao", desc = "Ljava/util/HashMap;")
	static final HashMap field2800;

	static {
		field2800 = new HashMap();
		TimeZone var0;
		synchronized(field2800) {
			TimeZone var2 = (TimeZone)field2800.get("Europe/London");
			if (null == var2) {
				var2 = TimeZone.getTimeZone("Europe/London");
				field2800.put("Europe/London", var2);
			}

			var0 = var2;
		}

		Calendar.getInstance(var0);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class354() throws Throwable {
	}

	@ObfInfo(name = "ao", desc = "(IB)V")
	public static void method1937(int var0, byte var1) {
		if (!class303.field2447.isEmpty()) {
			if (var1 <= -1) {
				throw new IllegalStateException();
			}

			Iterator var2 = class303.field2447.iterator();

			while (var2.hasNext()) {
				if (var1 <= -1) {
					throw new IllegalStateException();
				}

				class503 var3 = (class503)var2.next();
				if (null != var3) {
					var3.field4059 = var0;
				}
			}

			class503 var4 = (class503)class303.field2447.get(0);
			if (var4 != null) {
				if (var1 <= -1) {
					throw new IllegalStateException();
				}

				if (var4.field4063 != null) {
					if (var1 <= -1) {
						throw new IllegalStateException();
					}

					if (var4.field4063.method809()) {
						if (var1 <= -1) {
							return;
						}

						if (!var4.field4068) {
							if (var1 <= -1) {
								throw new IllegalStateException();
							}

							var4.field4063.method777(var0);
							var4.field4056 = (float)var0;
						}
					}
				}
			}
		}

	}
}
