import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class class514 implements class305 {
	public static int field4192;
	JSONObject field4191;

	public class514(JSONObject var1) {
		this.field4191 = var1;
	}

	public class514(String var1) throws UnsupportedEncodingException {
		this.method2441(var1);
	}

	public class514(byte[] var1) throws UnsupportedEncodingException {
		this.method2443(var1);
	}

	public class272 method1732() {
		return class272.field2445;
	}

	void method2443(byte[] var1) throws UnsupportedEncodingException {
		String var3 = new String(var1, "UTF-8");
		this.method2441(var3);
	}

	void method2441(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.field4191 = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var3 = new JSONArray(var1);
				this.field4191 = new JSONObject();
				this.field4191.put("arrayValues", var3);
			}

		} catch (JSONException var4) {
			throw new UnsupportedEncodingException(var4.getMessage());
		}
	}

	public JSONObject method2442() {
		return this.field4191;
	}

	public byte[] method1731() throws UnsupportedEncodingException {
		return this.field4191 == null ? new byte[0] : this.field4191.toString().getBytes("UTF-8");
	}
}
