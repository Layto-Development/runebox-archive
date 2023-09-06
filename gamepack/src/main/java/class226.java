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

public class class226 {
	class349 field2051;
	float[] field2053;
	int field2049;
	String field2050;
	String field2052;
	ArrayList field2047;
	ArrayList field2048;
	ArrayList field2054;
	Map field2055;
	Map field2056;

	public class226() {
		this.field2049 = -1;
		this.field2052 = null;
		this.field2053 = new float[4];
		this.field2048 = new ArrayList();
		this.field2054 = new ArrayList();
		this.field2047 = new ArrayList();
		this.field2055 = new HashMap();
		this.field2056 = new HashMap();
	}

	public boolean method1267(String var1, class296 var2) {
		if (var1 != null && !var1.isEmpty()) {
			if (null == var2) {
				return false;
			} else {
				this.method1274();

				try {
					this.field2050 = var1;
					this.field2051 = var2.method1684(new URL(this.field2050));
					this.field2049 = 0;
					return true;
				} catch (MalformedURLException var5) {
					this.method1274();
					this.field2049 = 100;
					return false;
				}
			}
		} else {
			return false;
		}
	}

	public void method1281(class296 var1) {
		switch(this.field2049) {
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
		return this.field2049;
	}

	public int method1269(String var1) {
		return this.field2055.containsKey(var1) ? (Integer)this.field2055.get(var1) : -1;
	}

	public String method1283(String var1) {
		return (String)((String)(this.field2056.containsKey(var1) ? this.field2056.get(var1) : null));
	}

	public ArrayList method1270() {
		return this.field2054;
	}

	public ArrayList method1284() {
		return this.field2047;
	}

	public String method1272() {
		return this.field2052;
	}

	public float[] method1271() {
		return this.field2053;
	}

	public ArrayList method1273() {
		return this.field2048;
	}

	void method1274() {
		this.field2051 = null;
		this.field2052 = null;
		this.field2053[0] = 0.0F;
		this.field2053[1] = 0.0F;
		this.field2053[2] = 1.0F;
		this.field2053[3] = 1.0F;
		this.field2048.clear();
		this.field2054.clear();
		this.field2047.clear();
		this.field2055.clear();
		this.field2056.clear();
	}

	void method1275(class296 var1) {
		if (null != this.field2051 && this.field2051.method1916()) {
			byte[] var3 = this.field2051.method1918();
			if (null == var3) {
				this.method1274();
				this.field2049 = 100;
			} else {
				try {
					this.method1278(new class514(var3), var1);
				} catch (UnsupportedEncodingException var5) {
					this.method1274();
					this.field2049 = 102;
					return;
				}

				this.field2049 = this.field2054.size() > 0 ? 1 : 2;
				this.field2051 = null;
			}
		}
	}

	void method1276() {
		Iterator var2 = this.field2054.iterator();

		class225 var3;
		do {
			if (!var2.hasNext()) {
				var2 = this.field2054.iterator();

				while (var2.hasNext()) {
					var3 = (class225)var2.next();
					if (null != var3.field2045) {
						byte[] var4 = var3.field2045.method1918();
						if (var4 != null && var4.length > 0) {
							this.field2049 = 2;
							return;
						}
					}
				}

				this.method1274();
				this.field2049 = 101;
				return;
			}

			var3 = (class225)var2.next();
		} while(null == var3.field2045 || var3.field2045.method1916());

	}

	void method1282(JSONArray var1, class296 var2) throws JSONException {
		if (null != var1) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				try {
					JSONObject var5 = var1.getJSONObject(var4);
					class225 var6 = new class225(this);
					var6.field2045 = var2.method1684(new URL(var5.getString("src")));
					var6.field2046 = class51.method384(var5, "placement");
					this.field2054.add(var6);
				} catch (MalformedURLException var7) {
				}
			}

		}
	}

	void method1277(JSONArray var1) throws JSONException {
		if (null != var1) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				JSONObject var4 = var1.getJSONObject(var3);
				class5 var5 = new class5(this);
				var5.field323 = var4.getString("text");
				String var8 = var4.getString("align_x");
				byte var7;
				if (var8.equals("centre")) {
					var7 = 1;
				} else if (!var8.equals("bottom") && !var8.equals("right")) {
					var7 = 0;
				} else {
					var7 = 2;
				}

				var5.field320 = var7;
				String var11 = var4.getString("align_y");
				byte var10;
				if (var11.equals("centre")) {
					var10 = 1;
				} else if (!var11.equals("bottom") && !var11.equals("right")) {
					var10 = 0;
				} else {
					var10 = 2;
				}

				var5.field321 = var10;
				var5.field318 = var4.getInt("font");
				var5.field319 = class51.method384(var4, "placement");
				this.field2047.add(var5);
			}

		}
	}

	void method1280(JSONObject var1) throws JSONException {
		if (null != var1) {
			this.field2053 = class51.method384(var1, "clickbounds");
			this.field2052 = var1.getString("endpoint");
			String[] var3 = JSONObject.getNames(var1);

			for (int var4 = 0; var4 < var1.length(); ++var4) {
				if (!var3[var4].equals("clickbounds") && !var3[var4].equals("endpoint")) {
					try {
						int var5 = var1.getInt(var3[var4]);
						this.field2048.add(new class189(this, var3[var4], var5));
					} catch (Exception var8) {
						try {
							String var6 = var1.getString(var3[var4]);
							if (var6.equals("true")) {
								this.field2048.add(new class189(this, var3[var4], 1));
							} else if (var6.equals("false")) {
								this.field2048.add(new class189(this, var3[var4], 0));
							} else {
								this.field2048.add(new class206(this, var3[var4], var6));
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
				this.field2055.put(var3[var4], var5);
			} catch (Exception var8) {
				try {
					String var6 = var1.getString(var3[var4]);
					if (var6.equals("true")) {
						this.field2055.put(var3[var4], 1);
					} else if (var6.equals("false")) {
						this.field2055.put(var3[var4], 0);
					} else {
						this.field2056.put(var3[var4], var6);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	void method1278(class514 var1, class296 var2) {
		JSONObject var4;
		try {
			var4 = var1.method2442();
			var4 = var4.getJSONObject("message");
		} catch (Exception var10) {
			this.method1274();
			this.field2049 = 102;
			return;
		}

		try {
			this.method1282(var4.getJSONArray("images"), var2);
		} catch (Exception var9) {
			this.field2054.clear();
		}

		try {
			this.method1277(var4.getJSONArray("labels"));
		} catch (Exception var8) {
			this.field2047.clear();
		}

		try {
			this.method1280(var4.getJSONObject("behaviour"));
		} catch (Exception var7) {
			this.field2052 = null;
			this.field2053[0] = 0.0F;
			this.field2053[1] = 0.0F;
			this.field2053[2] = 1.0F;
			this.field2053[3] = 1.0F;
			this.field2048.clear();
		}

		try {
			this.method1285(var4.getJSONObject("meta"));
		} catch (Exception var6) {
			this.field2055.clear();
			this.field2056.clear();
		}

	}

	public boolean method1279(String var1, class296 var2) {
		try {
			this.method1278(new class514(var1.getBytes()), var2);
			this.field2049 = this.field2054.size() > 0 ? 1 : 2;
		} catch (UnsupportedEncodingException var5) {
			this.field2049 = 102;
		}

		return this.field2049 < 100;
	}

	static int method1286(int var0, class167 var1, boolean var2) {
		return 2;
	}
}
