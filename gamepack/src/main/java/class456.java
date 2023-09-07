import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class456 {
    class244 field3144;
    float[] field3146;
    int field3142;
    String field3143;
    String field3145;
    ArrayList field3140;
    ArrayList<class422> field3141;
    ArrayList field3147;
    Map<String, Integer> field3148;
    Map<String, String> field3149;

    public class456() {
        this.field3142 = -1;
        this.field3145 = null;
        this.field3146 = new float[4];
        this.field3141 = new ArrayList<>();
        this.field3147 = new ArrayList();
        this.field3140 = new ArrayList();
        this.field3148 = new HashMap<String, Integer>();
        this.field3149 = new HashMap<>();
    }

    static float[] method2112(JSONObject var0, String var1) throws JSONException {
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

    public boolean method2093(String var1, class357 var2) {
        if (var1 != null && !var1.isEmpty()) {
            if (null == var2) {
                return false;
            } else {
                this.method2100();

                try {
                    this.field3143 = var1;
                    this.field3144 = var2.method1699(new URL(this.field3143));
                    this.field3142 = 0;
                    return true;
                } catch (MalformedURLException var5) {
                    this.method2100();
                    this.field3142 = 100;
                    return false;
                }
            }
        } else {
            return false;
        }
    }

    public void method2107(class357 var1) {
        switch (this.field3142) {
            case 0:
                this.method2101(var1);
                break;
            case 1:
                this.method2102();
                break;
            default:
		}

    }

    public int method2094() {
        return this.field3142;
    }

    public int method2095(String var1) {
        return this.field3148.containsKey(var1) ? this.field3148.get(var1) : -1;
    }

    public String method2109(String var1) {
        return this.field3149.containsKey(var1) ? this.field3149.get(var1) : null;
    }

    public ArrayList method2096() {
        return this.field3147;
    }

    public ArrayList method2110() {
        return this.field3140;
    }

    public String method2098() {
        return this.field3145;
    }

    public float[] method2097() {
        return this.field3146;
    }

    public ArrayList<class422> method2099() {
        return this.field3141;
    }

    void method2100() {
        this.field3144 = null;
        this.field3145 = null;
        this.field3146[0] = 0.0F;
        this.field3146[1] = 0.0F;
        this.field3146[2] = 1.0F;
        this.field3146[3] = 1.0F;
        this.field3141.clear();
        this.field3147.clear();
        this.field3140.clear();
        this.field3148.clear();
        this.field3149.clear();
    }

    void method2101(class357 var1) {
        if (null != this.field3144 && this.field3144.method1091()) {
            byte[] var3 = this.field3144.method1093();
            if (null == var3) {
                this.method2100();
                this.field3142 = 100;
            } else {
                try {
                    this.method2104(new class326(var3), var1);
                } catch (UnsupportedEncodingException var5) {
                    this.method2100();
                    this.field3142 = 102;
                    return;
                }

                this.field3142 = this.field3147.size() > 0 ? 1 : 2;
                this.field3144 = null;
            }
        }
    }

    void method2102() {
        Iterator var2 = this.field3147.iterator();

        class521 var3;
        do {
            if (!var2.hasNext()) {
                var2 = this.field3147.iterator();

                while (var2.hasNext()) {
                    var3 = (class521) var2.next();
                    if (null != var3.field4198) {
                        byte[] var4 = var3.field4198.method1093();
                        if (var4 != null && var4.length > 0) {
                            this.field3142 = 2;
                            return;
                        }
                    }
                }

                this.method2100();
                this.field3142 = 101;
                return;
            }

            var3 = (class521) var2.next();
        } while (null == var3.field4198 || var3.field4198.method1091());

    }

    void method2108(JSONArray var1, class357 var2) throws JSONException {
        if (null != var1) {
            for (int var4 = 0; var4 < var1.length(); ++var4) {
                try {
                    JSONObject var5 = var1.getJSONObject(var4);
                    class521 var6 = new class521(this);
                    var6.field4198 = var2.method1699(new URL(var5.getString("src")));
                    var6.field4199 = method2112(var5, "placement");
                    this.field3147.add(var6);
                } catch (MalformedURLException var7) {
                }
            }

        }
    }

    void method2103(JSONArray var1) throws JSONException {
        if (null != var1) {
            for (int var3 = 0; var3 < var1.length(); ++var3) {
                JSONObject var4 = var1.getJSONObject(var3);
                class519 var5 = new class519(this);
                var5.field4189 = var4.getString("text");
                String var8 = var4.getString("align_x");
                byte var7;
                if (var8.equals("centre")) {
                    var7 = 1;
                } else if (!var8.equals("bottom") && !var8.equals("right")) {
                    var7 = 0;
                } else {
                    var7 = 2;
                }

                var5.field4186 = var7;
                String var11 = var4.getString("align_y");
                byte var10;
                if (var11.equals("centre")) {
                    var10 = 1;
                } else if (!var11.equals("bottom") && !var11.equals("right")) {
                    var10 = 0;
                } else {
                    var10 = 2;
                }

                var5.field4187 = var10;
                var5.field4184 = var4.getInt("font");
                var5.field4185 = method2112(var4, "placement");
                this.field3140.add(var5);
            }

        }
    }

    void method2106(JSONObject var1) throws JSONException {
        if (null != var1) {
            this.field3146 = method2112(var1, "clickbounds");
            this.field3145 = var1.getString("endpoint");
            String[] var3 = JSONObject.getNames(var1);

            for (int var4 = 0; var4 < var1.length(); ++var4) {
                if (!var3[var4].equals("clickbounds") && !var3[var4].equals("endpoint")) {
                    try {
                        int var5 = var1.getInt(var3[var4]);
                        this.field3141.add(new class494(this, var3[var4], var5));
                    } catch (Exception var8) {
                        try {
                            String var6 = var1.getString(var3[var4]);
                            if (var6.equals("true")) {
                                this.field3141.add(new class494(this, var3[var4], 1));
                            } else if (var6.equals("false")) {
                                this.field3141.add(new class494(this, var3[var4], 0));
                            } else {
                                this.field3141.add(new class114(this, var3[var4], var6));
                            }
                        } catch (Exception var7) {
                        }
                    }
                }
            }

        }
    }

    void method2111(JSONObject var1) throws JSONException {
        String[] var3 = JSONObject.getNames(var1);

        for (int var4 = 0; var4 < var1.length(); ++var4) {
            try {
                int var5 = var1.getInt(var3[var4]);
                this.field3148.put(var3[var4], var5);
            } catch (Exception var8) {
                try {
                    String var6 = var1.getString(var3[var4]);
                    if (var6.equals("true")) {
                        this.field3148.put(var3[var4], 1);
                    } else if (var6.equals("false")) {
                        this.field3148.put(var3[var4], 0);
                    } else {
                        this.field3149.put(var3[var4], var6);
                    }
                } catch (Exception var7) {
                }
            }
        }

    }

    void method2104(class326 var1, class357 var2) {
        JSONObject var4;
        try {
            var4 = var1.method1439();
            var4 = var4.getJSONObject("message");
        } catch (Exception var10) {
            this.method2100();
            this.field3142 = 102;
            return;
        }

        try {
            this.method2108(var4.getJSONArray("images"), var2);
        } catch (Exception var9) {
            this.field3147.clear();
        }

        try {
            this.method2103(var4.getJSONArray("labels"));
        } catch (Exception var8) {
            this.field3140.clear();
        }

        try {
            this.method2106(var4.getJSONObject("behaviour"));
        } catch (Exception var7) {
            this.field3145 = null;
            this.field3146[0] = 0.0F;
            this.field3146[1] = 0.0F;
            this.field3146[2] = 1.0F;
            this.field3146[3] = 1.0F;
            this.field3141.clear();
        }

        try {
            this.method2111(var4.getJSONObject("meta"));
        } catch (Exception var6) {
            this.field3148.clear();
            this.field3149.clear();
        }

    }

    public boolean method2105(String var1, class357 var2) {
        try {
            this.method2104(new class326(var1.getBytes()), var2);
            this.field3142 = this.field3147.size() > 0 ? 1 : 2;
        } catch (UnsupportedEncodingException var5) {
            this.field3142 = 102;
        }

        return this.field3142 < 100;
    }
}
