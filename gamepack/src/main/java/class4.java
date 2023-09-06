import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

public class class4 {
	final int field317;
	final String field316;
	final Map field315;

	class4(HttpURLConnection var1) throws IOException {
		this.field317 = var1.getResponseCode();
		var1.getResponseMessage();
		this.field315 = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.field317 >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.field316 = var2.toString();
	}

	class4(String var1) {
		this.field317 = 400;
		this.field315 = null;
		this.field316 = "";
	}

	public int method45() {
		return this.field317;
	}

	public Map method46() {
		return this.field315;
	}

	public String method47() {
		return this.field316;
	}

	public static void method48(int var0) {
		class184.field1730 = var0;
	}

	public static class115[] method49(class215 var0, String var1, String var2) {
		if (!var0.method1234(var1, var2)) {
			return null;
		} else {
			int var4 = var0.method1237(var1);
			int var5 = var0.method1229(var4, var2);
			return class97.method644(var0, var4, var5);
		}
	}

	static int method51(class347 var0) {
		int var2 = var0.method1903(2);
		int var3;
		if (var2 == 0) {
			var3 = 0;
		} else if (var2 == 1) {
			var3 = var0.method1903(5);
		} else if (var2 == 2) {
			var3 = var0.method1903(8);
		} else {
			var3 = var0.method1903(11);
		}

		return var3;
	}

	static final void method50(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var2 = 0.5F + (float)var0 / 200.0F;
		class177.method1003((double)var2);
	}
}
