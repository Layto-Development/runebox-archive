import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfInfo(name = "rl")
public class class531 implements class167 {
	@ObfInfo(name = "at", desc = "I", intMultiplier = 608843781)
	public static int field4238;
	@ObfInfo(name = "ae", desc = "Lorg/json/JSONObject;")
	JSONObject field4237;

	@ObfInfo(name = "<init>", desc = "(Lorg/json/JSONObject;)V")
	public class531(JSONObject var1) {
		this.field4237 = var1;
	}

	@ObfInfo(name = "<init>", desc = "(Ljava/lang/String;)V")
	public class531(String var1) throws UnsupportedEncodingException {
		this.method2577(var1);
	}

	@ObfInfo(name = "<init>", desc = "([B)V")
	public class531(byte[] var1) throws UnsupportedEncodingException {
		this.method2579(var1);
	}

	@ObfInfo(name = "au", desc = "(I)Lre;")
	public class329 method949() {
		return class329.field2630;
	}

	@ObfInfo(name = "ai", desc = "([BB)V")
	void method2579(byte[] var1) throws UnsupportedEncodingException {
		String var3 = new String(var1, "UTF-8");
		this.method2577(var3);
	}

	@ObfInfo(name = "az", desc = "(Ljava/lang/String;B)V", opaqueValue = "0")
	void method2577(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.field4237 = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var3 = new JSONArray(var1);
				this.field4237 = new JSONObject();
				this.field4237.put("arrayValues", var3);
			}

		} catch (JSONException var4) {
			throw new UnsupportedEncodingException(var4.getMessage());
		}
	}

	@ObfInfo(name = "ap", desc = "(B)Lorg/json/JSONObject;")
	public JSONObject method2578() {
		return this.field4237;
	}

	@ObfInfo(name = "ae", desc = "(I)[B", opaqueValue = "-1606678601")
	public byte[] method948() throws UnsupportedEncodingException {
		return this.field4237 == null ? new byte[0] : this.field4237.toString().getBytes("UTF-8");
	}
}
