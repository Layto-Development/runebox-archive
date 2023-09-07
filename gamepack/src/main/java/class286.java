import java.net.MalformedURLException;
import java.net.URL;

public class class286 {

	static int field2301;

	class64 field2300;

	class84 field2299;

	class286(String var1, class346 var2) {
		try {
			this.field2300 = var2.method1806(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field2300 = null;
		}
	}

	class286(class64 var1) {
		this.field2300 = var1;
	}

	class84 method1557() {
		if (null == this.field2299 && this.field2300 != null && this.field2300.method283()) {
			if (this.field2300.method285() != null) {
				this.field2299 = class512.method2461(this.field2300.method285());
			}
			this.field2300 = null;
		}
		return this.field2299;
	}
}
