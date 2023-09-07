import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class class213 {

	class64 field1932;

	float[] field1934;

	int field1930;

	String field1931;

	String field1933;

	ArrayList field1928;

	ArrayList field1929;

	ArrayList field1935;

	Map field1936;

	Map field1937;

	public class213() {
		this.field1930 = -1;
		this.field1933 = null;
		this.field1934 = new float[4];
		this.field1929 = new ArrayList();
		this.field1935 = new ArrayList();
		this.field1928 = new ArrayList();
		this.field1936 = new HashMap();
		this.field1937 = new HashMap();
	}

	public boolean method1267(String var1, class346 var2) {
		if (var1 != null && !var1.isEmpty()) {
			if (null == var2) {
				return false;
			} else {
				this.method1274();
				try {
					this.field1931 = var1;
					this.field1932 = var2.method1806(new URL(this.field1931));
					this.field1930 = 0;
					return true;
				} catch (MalformedURLException var5) {
					this.method1274();
					this.field1930 = 100;
					return false;
				}
			}
		} else {
			return false;
		}
	}

	public void method1281(class346 var1) {
		switch(this.field1930) {
			case 0:
				this.method1275(var1);
				break;
			case 1:
				this.method1276();
				break;
			default:
				return;
		}
	}

	public int method1268() {
		return this.field1930;
	}

	public int method1269(String var1) {
		return this.field1936.containsKey(var1) ? (Integer) this.field1936.get(var1) : -1;
	}

	public String method1283(String var1) {
		return (String) (String) (this.field1937.containsKey(var1) ? this.field1937.get(var1) : null);
	}

	public ArrayList method1270() {
		return this.field1935;
	}

	public ArrayList method1284() {
		return this.field1928;
	}

	public String method1272() {
		return this.field1933;
	}

	public float[] method1271() {
		return this.field1934;
	}

	public ArrayList method1273() {
		return this.field1929;
	}

	void method1274() {
		this.field1932 = null;
		this.field1933 = null;
		this.field1934[0] = 0.0F;
		this.field1934[1] = 0.0F;
		this.field1934[2] = 1.0F;
		this.field1934[3] = 1.0F;
		this.field1929.clear();
		this.field1935.clear();
		this.field1928.clear();
		this.field1936.clear();
		this.field1937.clear();
	}

	void method1275(class346 var1) {
		if (null != this.field1932 && this.field1932.method283()) {
			byte[] var3 = this.field1932.method285();
			if (null == var3) {
				this.method1274();
				this.field1930 = 100;
			} else {
				try {
					this.method1278(new class217(var3), var1);
				} catch (UnsupportedEncodingException var5) {
					this.method1274();
					this.field1930 = 102;
					return;
				}
				this.field1930 = this.field1935.size() > 0 ? 1 : 2;
				this.field1932 = null;
			}
		}
	}

	void method1276() {
		Iterator var2 = this.field1935.iterator();
		class253 var3;
		do {
			if (!var2.hasNext()) {
				var2 = this.field1935.iterator();
				while (var2.hasNext()) {
					var3 = (class253) var2.next();
					if (null != var3.field2126) {
						byte[] var4 = var3.field2126.method285();
						if (var4 != null && var4.length > 0) {
							this.field1930 = 2;
							return;
						}
					}
				}
				this.method1274();
				this.field1930 = 101;
				return;
			}
			var3 = (class253) var2.next();
		} while (null == var3.field2126 || var3.field2126.method283());
	}

	void method1282(JSONArray var1, class346 var2) throws JSONException {
		if (null != var1) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				try {
					JSONObject var5 = var1.getJSONObject(var4);
					class253 var6 = new class253(this);
					var6.field2126 = var2.method1806(new URL(var5.getString("src")));
					var6.field2127 = method1286(var5, "placement");
					this.field1935.add(var6);
				} catch (MalformedURLException var7) {
				}
			}
		}
	}

	void method1277(JSONArray var1) throws JSONException {
		if (null != var1) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				JSONObject var4 = var1.getJSONObject(var3);
				class271 var5 = new class271(this);
				var5.field2227 = var4.getString("text");
				String var8 = var4.getString("align_x");
				byte var7;
				if (var8.equals("centre")) {
					var7 = 1;
				} else if (!var8.equals("bottom") && !var8.equals("right")) {
					var7 = 0;
				} else {
					var7 = 2;
				}
				var5.field2224 = var7;
				String var11 = var4.getString("align_y");
				byte var10;
				if (var11.equals("centre")) {
					var10 = 1;
				} else if (!var11.equals("bottom") && !var11.equals("right")) {
					var10 = 0;
				} else {
					var10 = 2;
				}
				var5.field2225 = var10;
				var5.field2222 = var4.getInt("font");
				var5.field2223 = method1286(var4, "placement");
				this.field1928.add(var5);
			}
		}
	}

	void method1280(JSONObject var1) throws JSONException {
		if (null != var1) {
			this.field1934 = method1286(var1, "clickbounds");
			this.field1933 = var1.getString("endpoint");
			String[] var3 = JSONObject.getNames(var1);
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				if (!var3[var4].equals("clickbounds") && !var3[var4].equals("endpoint")) {
					try {
						int var5 = var1.getInt(var3[var4]);
						this.field1929.add(new class536(this, var3[var4], var5));
					} catch (Exception var8) {
						try {
							String var6 = var1.getString(var3[var4]);
							if (var6.equals("true")) {
								this.field1929.add(new class536(this, var3[var4], 1));
							} else if (var6.equals("false")) {
								this.field1929.add(new class536(this, var3[var4], 0));
							} else {
								this.field1929.add(new class146(this, var3[var4], var6));
							}
						} catch (Exception var7) {
						}
					}
				}
			}
		}
	}

	void method1285(JSONObject var1) throws JSONException {
		String[] var3 = JSONObject.getNames(var1);
		for (int var4 = 0; var4 < var1.length(); ++var4) {
			try {
				int var5 = var1.getInt(var3[var4]);
				this.field1936.put(var3[var4], var5);
			} catch (Exception var8) {
				try {
					String var6 = var1.getString(var3[var4]);
					if (var6.equals("true")) {
						this.field1936.put(var3[var4], 1);
					} else if (var6.equals("false")) {
						this.field1936.put(var3[var4], 0);
					} else {
						this.field1937.put(var3[var4], var6);
					}
				} catch (Exception var7) {
				}
			}
		}
	}

	void method1278(class217 var1, class346 var2) {
		JSONObject var4;
		try {
			var4 = var1.method1298();
			var4 = var4.getJSONObject("message");
		} catch (Exception var10) {
			this.method1274();
			this.field1930 = 102;
			return;
		}
		try {
			this.method1282(var4.getJSONArray("images"), var2);
		} catch (Exception var9) {
			this.field1935.clear();
		}
		try {
			this.method1277(var4.getJSONArray("labels"));
		} catch (Exception var8) {
			this.field1928.clear();
		}
		try {
			this.method1280(var4.getJSONObject("behaviour"));
		} catch (Exception var7) {
			this.field1933 = null;
			this.field1934[0] = 0.0F;
			this.field1934[1] = 0.0F;
			this.field1934[2] = 1.0F;
			this.field1934[3] = 1.0F;
			this.field1929.clear();
		}
		try {
			this.method1285(var4.getJSONObject("meta"));
		} catch (Exception var6) {
			this.field1936.clear();
			this.field1937.clear();
		}
	}

	public boolean method1279(String var1, class346 var2) {
		try {
			this.method1278(new class217(var1.getBytes()), var2);
			this.field1930 = this.field1935.size() > 0 ? 1 : 2;
		} catch (UnsupportedEncodingException var5) {
			this.field1930 = 102;
		}
		return this.field1930 < 100;
	}

	static float[] method1286(JSONObject var0, String var1) throws JSONException {
		float[] var3 = new float[4];
		try {
			JSONArray var4 = var0.getJSONArray(var1);
			var3[0] = (float) var4.optDouble(0, 0.0D);
			var3[1] = (float) var4.optDouble(1, 0.0D);
			var3[2] = (float) var4.optDouble(2, 1.0D);
			var3[3] = (float) var4.optDouble(3, 1.0D);
		} catch (JSONException var5) {
			var3[0] = 0.0F;
			var3[1] = 0.0F;
			var3[2] = 1.0F;
			var3[3] = 1.0F;
		}
		return var3;
	}
}
