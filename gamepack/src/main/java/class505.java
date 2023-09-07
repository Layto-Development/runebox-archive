import java.net.MalformedURLException;
import java.net.URL;

public class class505 {
    static int field3703;
    class244 field3702;
    class331 field3701;

    class505(String var1, class357 var2) {
        try {
            this.field3702 = var2.method1699(new URL(var1));
        } catch (MalformedURLException var4) {
            this.field3702 = null;
        }

    }

    class505(class244 var1) {
        this.field3702 = var1;
    }

    class331 method2277() {
        if (null == this.field3701 && this.field3702 != null && this.field3702.method1091()) {
            if (this.field3702.method1093() != null) {
                this.field3701 = class458.method2117(this.field3702.method1093());
            }

            this.field3702 = null;
        }

        return this.field3701;
    }
}
