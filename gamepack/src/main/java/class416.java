import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

public class class416 {

	final int field3228;

	final String field3227;

	final Map field3226;

	class416(HttpURLConnection var1) throws IOException {
		this.field3228 = var1.getResponseCode();
		var1.getResponseMessage();
		this.field3226 = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.field3228 >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);
			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}
			var3.close();
		}
		this.field3227 = var2.toString();
	}

	class416(String var1) {
		this.field3228 = 400;
		this.field3226 = null;
		this.field3227 = "";
	}

	public int method2090() {
		return this.field3228;
	}

	public Map method2091() {
		return this.field3226;
	}

	public String method2092() {
		return this.field3227;
	}

	static int method2093(class515 var0) {
		int var2 = var0.method2488(2);
		int var3;
		if (var2 == 0) {
			var3 = 0;
		} else if (var2 == 1) {
			var3 = var0.method2488(5);
		} else if (var2 == 2) {
			var3 = var0.method2488(8);
		} else {
			var3 = var0.method2488(11);
		}
		return var3;
	}
}
