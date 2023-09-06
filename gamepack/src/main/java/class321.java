import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

public class class321 {
	static int field2896;
	final DecimalFormat field2893;
	final Map field2894;
	final Map field2895;

	public class321() {
		this.field2894 = new HashMap();
		this.field2895 = new HashMap();
		this.field2893 = new DecimalFormat();
		this.field2893.setMaximumFractionDigits(2);
	}

	public void method1814(HttpsURLConnection var1) {
		Iterator var3 = this.field2894.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			var1.setRequestProperty((String)var4.getKey(), (String)var4.getValue());
		}

	}

	public Map method1815() {
		return this.field2894;
	}

	public void method1816(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.field2894.put(var1, var2 != null ? var2 : "");
		}

	}

	public void method1825(String var1) {
		if (null != var1 && !var1.isEmpty()) {
			this.field2894.remove(var1);
		}

	}

	void method1821(class330 var1, String var2) {
		String var4 = String.format("%s %s", var1.method1843(), var2);
		this.method1816("Authorization", var4);
	}

	public void method1817(String var1) {
		this.method1821(class330.field2911, var1);
	}

	public void method1826(String var1) {
		this.method1821(class330.field2912, var1);
	}

	public void method1820(class272 var1) {
		this.field2894.put("Content-Type", var1.method1588());
	}

	public void method1818() {
		this.field2894.remove("Content-Type");
	}

	public void method1819(class272 var1) {
		this.method1823(var1, 1.0F);
	}

	void method1823(class272 var1, float var2) {
		this.field2895.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		this.method1822();
	}

	void method1822() {
		this.field2894.remove("Accept");
		if (!this.field2895.isEmpty()) {
			this.field2894.put("Accept", this.method1824());
		}

	}

	String method1824() {
		ArrayList var2 = new ArrayList(this.field2895.entrySet());
		Collections.sort(var2, new class340(this));
		StringBuilder var3 = new StringBuilder();
		Iterator var4 = var2.iterator();

		while (var4.hasNext()) {
			Entry var5 = (Entry)var4.next();
			if (var3.length() > 0) {
				var3.append(",");
			}

			var3.append(((class272)var5.getKey()).method1588());
			float var6 = (Float)var5.getValue();
			if (var6 < 1.0F) {
				String var7 = this.field2893.format((double)var6);
				var3.append(";q=").append(var7);
			}
		}

		return var3.toString();
	}
}
