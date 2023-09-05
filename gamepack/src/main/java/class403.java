import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

@ObfInfo(name = "as")
public class class403 {
	@ObfInfo(name = "au", desc = "I", intMultiplier = 1053019723)
	final int field3127;
	@ObfInfo(name = "ao", desc = "Ljava/lang/String;")
	final String field3126;
	@ObfInfo(name = "ae", desc = "Ljava/util/Map;")
	final Map field3125;

	@ObfInfo(name = "<init>", desc = "(Ljava/net/HttpURLConnection;)V")
	class403(HttpURLConnection var1) throws IOException {
		this.field3127 = var1.getResponseCode();
		var1.getResponseMessage();
		this.field3125 = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.field3127 >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.field3126 = var2.toString();
	}

	@ObfInfo(name = "<init>", desc = "(Ljava/lang/String;)V")
	class403(String var1) {
		this.field3127 = 400;
		this.field3125 = null;
		this.field3126 = "";
	}

	@ObfInfo(name = "au", desc = "(S)I")
	public int method2124() {
		return this.field3127;
	}

	@ObfInfo(name = "ae", desc = "(B)Ljava/util/Map;")
	public Map method2125() {
		return this.field3125;
	}

	@ObfInfo(name = "ao", desc = "(I)Ljava/lang/String;")
	public String method2126() {
		return this.field3126;
	}

	@ObfInfo(name = "ao", desc = "(Lto;B)I", opaqueValue = "71")
	static int method2127(class259 var0) {
		int var2 = var0.method1359(2);
		int var3;
		if (var2 == 0) {
			var3 = 0;
		} else if (var2 == 1) {
			var3 = var0.method1359(5);
		} else if (var2 == 2) {
			var3 = var0.method1359(8);
		} else {
			var3 = var0.method1359(11);
		}

		return var3;
	}
}
