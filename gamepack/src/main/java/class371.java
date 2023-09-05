import io.runebox.internal.deobfuscator.includes.ObfInfo;
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

@ObfInfo(name = "gf")
public class class371 {
	@ObfInfo(name = "ad", desc = "Let;")
	class22 field2875;
	@ObfInfo(name = "al", desc = "[F")
	float[] field2877;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 1468015305)
	int field2873;
	@ObfInfo(name = "af", desc = "Ljava/lang/String;")
	String field2874;
	@ObfInfo(name = "aq", desc = "Ljava/lang/String;")
	String field2876;
	@ObfInfo(name = "ab", desc = "Ljava/util/ArrayList;")
	ArrayList field2871;
	@ObfInfo(name = "an", desc = "Ljava/util/ArrayList;")
	ArrayList field2872;
	@ObfInfo(name = "ar", desc = "Ljava/util/ArrayList;")
	ArrayList field2878;
	@ObfInfo(name = "ag", desc = "Ljava/util/Map;")
	Map field2879;
	@ObfInfo(name = "am", desc = "Ljava/util/Map;")
	Map field2880;

	@ObfInfo(name = "<init>", desc = "()V")
	public class371() {
		this.field2873 = -1;
		this.field2876 = null;
		this.field2877 = new float[4];
		this.field2872 = new ArrayList();
		this.field2878 = new ArrayList();
		this.field2871 = new ArrayList();
		this.field2879 = new HashMap();
		this.field2880 = new HashMap();
	}

	@ObfInfo(name = "au", desc = "(Ljava/lang/String;Lev;I)Z", opaqueValue = "1759783500")
	public boolean method2000(String var1, class265 var2) {
		if (var1 != null && !var1.isEmpty()) {
			if (null == var2) {
				return false;
			} else {
				this.method2007();

				try {
					this.field2874 = var1;
					this.field2875 = var2.method1384(new URL(this.field2874));
					this.field2873 = 0;
					return true;
				} catch (MalformedURLException var5) {
					this.method2007();
					this.field2873 = 100;
					return false;
				}
			}
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ae", desc = "(Lev;I)V")
	public void method2014(class265 var1) {
		switch(this.field2873) {
		case 0:
			this.method2008(var1);
			break;
		case 1:
			this.method2009();
			break;
		default:
			return;
		}

	}

	@ObfInfo(name = "ao", desc = "(I)I")
	public int method2001() {
		return this.field2873;
	}

	@ObfInfo(name = "at", desc = "(Ljava/lang/String;I)I", opaqueValue = "-63404292")
	public int method2002(String var1) {
		return this.field2879.containsKey(var1) ? (Integer)this.field2879.get(var1) : -1;
	}

	@ObfInfo(name = "ac", desc = "(Ljava/lang/String;I)Ljava/lang/String;", opaqueValue = "2085247784")
	public String method2016(String var1) {
		return (String)((String)(this.field2880.containsKey(var1) ? this.field2880.get(var1) : null));
	}

	@ObfInfo(name = "ai", desc = "(B)Ljava/util/ArrayList;")
	public ArrayList method2003() {
		return this.field2878;
	}

	@ObfInfo(name = "az", desc = "(B)Ljava/util/ArrayList;")
	public ArrayList method2017() {
		return this.field2871;
	}

	@ObfInfo(name = "ap", desc = "(I)Ljava/lang/String;")
	public String method2005() {
		return this.field2876;
	}

	@ObfInfo(name = "aa", desc = "(I)[F")
	public float[] method2004() {
		return this.field2877;
	}

	@ObfInfo(name = "af", desc = "(B)Ljava/util/ArrayList;")
	public ArrayList method2006() {
		return this.field2872;
	}

	@ObfInfo(name = "ad", desc = "(B)V")
	void method2007() {
		this.field2875 = null;
		this.field2876 = null;
		this.field2877[0] = 0.0F;
		this.field2877[1] = 0.0F;
		this.field2877[2] = 1.0F;
		this.field2877[3] = 1.0F;
		this.field2872.clear();
		this.field2878.clear();
		this.field2871.clear();
		this.field2879.clear();
		this.field2880.clear();
	}

	@ObfInfo(name = "aq", desc = "(Lev;B)V", opaqueValue = "0")
	void method2008(class265 var1) {
		if (null != this.field2875 && this.field2875.method334()) {
			byte[] var3 = this.field2875.method336();
			if (null == var3) {
				this.method2007();
				this.field2873 = 100;
			} else {
				try {
					this.method2011(new class531(var3), var1);
				} catch (UnsupportedEncodingException var5) {
					this.method2007();
					this.field2873 = 102;
					return;
				}

				this.field2873 = this.field2878.size() > 0 ? 1 : 2;
				this.field2875 = null;
			}
		}
	}

	@ObfInfo(name = "al", desc = "(I)V", opaqueValue = "-882963580")
	void method2009() {
		Iterator var2 = this.field2878.iterator();

		class69 var3;
		do {
			if (!var2.hasNext()) {
				var2 = this.field2878.iterator();

				while (var2.hasNext()) {
					var3 = (class69)var2.next();
					if (null != var3.field775) {
						byte[] var4 = var3.field775.method336();
						if (var4 != null && var4.length > 0) {
							this.field2873 = 2;
							return;
						}
					}
				}

				this.method2007();
				this.field2873 = 101;
				return;
			}

			var3 = (class69)var2.next();
		} while(null == var3.field775 || var3.field775.method334());

	}

	@ObfInfo(name = "an", desc = "(Lorg/json/JSONArray;Lev;B)V", opaqueValue = "5")
	void method2015(JSONArray var1, class265 var2) throws JSONException {
		if (null != var1) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				try {
					JSONObject var5 = var1.getJSONObject(var4);
					class69 var6 = new class69(this);
					var6.field775 = var2.method1384(new URL(var5.getString("src")));
					var6.field776 = method2019(var5, "placement");
					this.field2878.add(var6);
				} catch (MalformedURLException var7) {
				}
			}

		}
	}

	@ObfInfo(name = "ar", desc = "(Lorg/json/JSONArray;I)V", opaqueValue = "-698650407")
	void method2010(JSONArray var1) throws JSONException {
		if (null != var1) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				JSONObject var4 = var1.getJSONObject(var3);
				class396 var5 = new class396(this);
				var5.field3102 = var4.getString("text");
				String var8 = var4.getString("align_x");
				byte var7;
				if (var8.equals("centre")) {
					var7 = 1;
				} else if (!var8.equals("bottom") && !var8.equals("right")) {
					var7 = 0;
				} else {
					var7 = 2;
				}

				var5.field3099 = var7;
				String var11 = var4.getString("align_y");
				byte var10;
				if (var11.equals("centre")) {
					var10 = 1;
				} else if (!var11.equals("bottom") && !var11.equals("right")) {
					var10 = 0;
				} else {
					var10 = 2;
				}

				var5.field3100 = var10;
				var5.field3097 = var4.getInt("font");
				var5.field3098 = method2019(var4, "placement");
				this.field2871.add(var5);
			}

		}
	}

	@ObfInfo(name = "ab", desc = "(Lorg/json/JSONObject;I)V", opaqueValue = "1185284639")
	void method2013(JSONObject var1) throws JSONException {
		if (null != var1) {
			this.field2877 = method2019(var1, "clickbounds");
			this.field2876 = var1.getString("endpoint");
			String[] var3 = JSONObject.getNames(var1);

			for (int var4 = 0; var4 < var1.length(); ++var4) {
				if (!var3[var4].equals("clickbounds") && !var3[var4].equals("endpoint")) {
					try {
						int var5 = var1.getInt(var3[var4]);
						this.field2872.add(new class11(this, var3[var4], var5));
					} catch (Exception var8) {
						try {
							String var6 = var1.getString(var3[var4]);
							if (var6.equals("true")) {
								this.field2872.add(new class11(this, var3[var4], 1));
							} else if (var6.equals("false")) {
								this.field2872.add(new class11(this, var3[var4], 0));
							} else {
								this.field2872.add(new class349(this, var3[var4], var6));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfInfo(name = "ag", desc = "(Lorg/json/JSONObject;B)V", opaqueValue = "-1")
	void method2018(JSONObject var1) throws JSONException {
		String[] var3 = JSONObject.getNames(var1);

		for (int var4 = 0; var4 < var1.length(); ++var4) {
			try {
				int var5 = var1.getInt(var3[var4]);
				this.field2879.put(var3[var4], var5);
			} catch (Exception var8) {
				try {
					String var6 = var1.getString(var3[var4]);
					if (var6.equals("true")) {
						this.field2879.put(var3[var4], 1);
					} else if (var6.equals("false")) {
						this.field2879.put(var3[var4], 0);
					} else {
						this.field2880.put(var3[var4], var6);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfInfo(name = "am", desc = "(Lrl;Lev;B)V")
	void method2011(class531 var1, class265 var2) {
		JSONObject var4;
		try {
			var4 = var1.method2578();
			var4 = var4.getJSONObject("message");
		} catch (Exception var10) {
			this.method2007();
			this.field2873 = 102;
			return;
		}

		try {
			this.method2015(var4.getJSONArray("images"), var2);
		} catch (Exception var9) {
			this.field2878.clear();
		}

		try {
			this.method2010(var4.getJSONArray("labels"));
		} catch (Exception var8) {
			this.field2871.clear();
		}

		try {
			this.method2013(var4.getJSONObject("behaviour"));
		} catch (Exception var7) {
			this.field2876 = null;
			this.field2877[0] = 0.0F;
			this.field2877[1] = 0.0F;
			this.field2877[2] = 1.0F;
			this.field2877[3] = 1.0F;
			this.field2872.clear();
		}

		try {
			this.method2018(var4.getJSONObject("meta"));
		} catch (Exception var6) {
			this.field2879.clear();
			this.field2880.clear();
		}

	}

	@ObfInfo(name = "ax", desc = "(Ljava/lang/String;Lev;I)Z", opaqueValue = "-2008047208")
	public boolean method2012(String var1, class265 var2) {
		try {
			this.method2011(new class531(var1.getBytes()), var2);
			this.field2873 = this.field2878.size() > 0 ? 1 : 2;
		} catch (UnsupportedEncodingException var5) {
			this.field2873 = 102;
		}

		return this.field2873 < 100;
	}

	@ObfInfo(name = "ah", desc = "(Lorg/json/JSONObject;Ljava/lang/String;S)[F")
	static float[] method2019(JSONObject var0, String var1) throws JSONException {
		float[] var3 = new float[4];

		try {
			JSONArray var4 = var0.getJSONArray(var1);
			var3[0] = (float)var4.optDouble(0, 0.0D);
			var3[1] = (float)var4.optDouble(1, 0.0D);
			var3[2] = (float)var4.optDouble(2, 1.0D);
			var3[3] = (float)var4.optDouble(3, 1.0D);
		} catch (JSONException var5) {
			var3[0] = 0.0F;
			var3[1] = 0.0F;
			var3[2] = 1.0F;
			var3[3] = 1.0F;
		}

		return var3;
	}
}
