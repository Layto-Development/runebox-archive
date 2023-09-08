import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TimeZone;

@class71
public final class class407 {

	static final HashMap field3182;

	static {
		field3182 = new HashMap();
		TimeZone var0;
		synchronized (field3182) {
			TimeZone var2 = (TimeZone) field3182.get("Europe/London");
			if (null == var2) {
				var2 = TimeZone.getTimeZone("Europe/London");
				field3182.put("Europe/London", var2);
			}
			var0 = var2;
		}
		Calendar.getInstance(var0);
	}

	class407() throws Throwable {
	}

	public static void method2074(int var0, byte var1) {
		if (!class388.field3090.isEmpty()) {
			Iterator var2 = class388.field3090.iterator();
			while (var2.hasNext()) {
				class490 var3 = (class490) var2.next();
				if (null != var3) {
					var3.field3952 = var0;
				}
			}
			class490 var4 = (class490) class388.field3090.get(0);
			if (var4 != null && var4.field3956 != null && var4.field3956.method274() && !var4.field3961) {
				var4.field3956.method242(var0);
				var4.field3949 = (float) var0;
			}
		}
	}
}
