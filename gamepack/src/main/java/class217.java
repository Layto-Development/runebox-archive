import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class class217 implements class252 {

	public static int field1948;

	JSONObject field1947;

	public class217(JSONObject var1) {
		this.field1947 = var1;
	}

	public class217(String var1) throws UnsupportedEncodingException {
		this.method1297(var1);
	}

	public class217(byte[] var1) throws UnsupportedEncodingException {
		this.method1300(var1);
	}

	@Override
	public class533 method1444() {
		return class533.field4206;
	}

	void method1300(byte[] var1) throws UnsupportedEncodingException {
		String var3 = new String(var1, "UTF-8");
		this.method1297(var3);
	}

	void method1297(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.field1947 = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}
				JSONArray var3 = new JSONArray(var1);
				this.field1947 = new JSONObject();
				this.field1947.put("arrayValues", var3);
			}
		} catch (JSONException var4) {
			throw new UnsupportedEncodingException(var4.getMessage());
		}
	}

	public JSONObject method1298() {
		return this.field1947;
	}

	@Override
	public byte[] method1443() throws UnsupportedEncodingException {
		return this.field1947 == null ? new byte[0] : this.field1947.toString().getBytes("UTF-8");
	}
}
