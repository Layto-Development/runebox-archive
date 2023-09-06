import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TimeZone;

@class490
public final class class58 {
	static final HashMap field617;

	static {
		field617 = new HashMap();
		TimeZone var0;
		synchronized(field617) {
			TimeZone var2 = (TimeZone)field617.get("Europe/London");
			if (null == var2) {
				var2 = TimeZone.getTimeZone("Europe/London");
				field617.put("Europe/London", var2);
			}

			var0 = var2;
		}

		Calendar.getInstance(var0);
	}

	class58() throws Throwable {
	}

	public static void method427(int var0, byte var1) {
		if (!class92.field903.isEmpty()) {
			if (var1 <= -1) {
				throw new IllegalStateException();
			}

			Iterator var2 = class92.field903.iterator();

			while (var2.hasNext()) {
				if (var1 <= -1) {
					throw new IllegalStateException();
				}

				class104 var3 = (class104)var2.next();
				if (null != var3) {
					var3.field1028 = var0;
				}
			}

			class104 var4 = (class104)class92.field903.get(0);
			if (var4 != null) {
				if (var1 <= -1) {
					throw new IllegalStateException();
				}

				if (var4.field1032 != null) {
					if (var1 <= -1) {
						throw new IllegalStateException();
					}

					if (var4.field1032.method163()) {
						if (var1 <= -1) {
							return;
						}

						if (!var4.field1037) {
							if (var1 <= -1) {
								throw new IllegalStateException();
							}

							var4.field1032.method130(var0);
							var4.field1025 = (float)var0;
						}
					}
				}
			}
		}

	}

	static String method426(class60 var0) {
		if (class190.method1044(class447.method2235(var0)) == 0) {
			return null;
		} else {
			return null != var0.field726 && var0.field726.trim().length() != 0 ? var0.field726 : null;
		}
	}
}
