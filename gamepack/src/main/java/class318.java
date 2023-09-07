import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TimeZone;

@class50
public final class class318 {
    static final HashMap<String, TimeZone> field2288;

    static {
        field2288 = new HashMap<>();
        TimeZone var0;
        synchronized (field2288) {
            TimeZone var2 = field2288.get("Europe/London");
            if (null == var2) {
                var2 = TimeZone.getTimeZone("Europe/London");
                field2288.put("Europe/London", var2);
            }

            var0 = var2;
        }

        Calendar.getInstance(var0);
    }

    class318() throws Throwable {
    }

    public static void method1397(int var0, byte var1) {
        if (!class141.field1240.isEmpty()) {
            Iterator<class537> var2 = class141.field1240.iterator();

            while (var2.hasNext()) {
                class537 var3 = var2.next();
                if (null != var3) {
                    var3.field4269 = var0;
                }
            }

            class537 var4 = class141.field1240.get(0);
            if (var4 != null && var4.field4273 != null && var4.field4273.method2162() && !var4.field4278) {
                var4.field4273.method2134(var0);
                var4.field4266 = (float) var0;
            }
        }

    }
}
