import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

public class class324 {

	static int field2525;

	final DecimalFormat field2522;

	final Map field2523;

	final Map field2524;

	public class324() {
		this.field2523 = new HashMap();
		this.field2524 = new HashMap();
		this.field2522 = new DecimalFormat();
		this.field2522.setMaximumFractionDigits(2);
	}

	public void method1712(HttpsURLConnection var1) {
		Iterator var3 = this.field2523.entrySet().iterator();
		while (var3.hasNext()) {
			Entry var4 = (Entry) var3.next();
			var1.setRequestProperty((String) var4.getKey(), (String) var4.getValue());
		}
	}

	public Map method1713() {
		return this.field2523;
	}

	public void method1714(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.field2523.put(var1, var2 != null ? var2 : "");
		}
	}

	public void method1723(String var1) {
		if (null != var1 && !var1.isEmpty()) {
			this.field2523.remove(var1);
		}
	}

	void method1719(class451 var1, String var2) {
		String var4 = String.format("%s %s", var1.method2228(), var2);
		this.method1714("Authorization", var4);
	}

	public void method1715(String var1) {
		this.method1719(class451.field3470, var1);
	}

	public void method1724(String var1) {
		this.method1719(class451.field3471, var1);
	}

	public void method1718(class533 var1) {
		this.field2523.put("Content-Type", var1.method2579());
	}

	public void method1716() {
		this.field2523.remove("Content-Type");
	}

	public void method1717(class533 var1) {
		this.method1721(var1, 1.0F);
	}

	void method1721(class533 var1, float var2) {
		this.field2524.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		this.method1720();
	}

	void method1720() {
		this.field2523.remove("Accept");
		if (!this.field2524.isEmpty()) {
			this.field2523.put("Accept", this.method1722());
		}
	}

	String method1722() {
		ArrayList var2 = new ArrayList(this.field2524.entrySet());
		Collections.sort(var2, new class203(this));
		StringBuilder var3 = new StringBuilder();
		Iterator var4 = var2.iterator();
		while (var4.hasNext()) {
			Entry var5 = (Entry) var4.next();
			if (var3.length() > 0) {
				var3.append(",");
			}
			var3.append(((class533) var5.getKey()).method2579());
			float var6 = (Float) var5.getValue();
			if (var6 < 1.0F) {
				String var7 = this.field2522.format((double) var6);
				var3.append(";q=").append(var7);
			}
		}
		return var3.toString();
	}
}
