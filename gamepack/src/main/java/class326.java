import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class class326 implements class501 {
    public static int field2367;
    JSONObject field2366;

    public class326(JSONObject var1) {
        this.field2366 = var1;
    }

    public class326(String var1) throws UnsupportedEncodingException {
        this.method1438(var1);
    }

    public class326(byte[] var1) throws UnsupportedEncodingException {
        this.method1441(var1);
    }

    @Override
    public class495 method2274() {
        return class495.field3627;
    }

    void method1441(byte[] var1) throws UnsupportedEncodingException {
        String var3 = new String(var1, StandardCharsets.UTF_8);
        this.method1438(var3);
    }

    void method1438(String var1) throws UnsupportedEncodingException {
        try {
            if (var1.charAt(0) == '{') {
                this.field2366 = new JSONObject(var1);
            } else {
                if (var1.charAt(0) != '[') {
                    throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
                }

                JSONArray var3 = new JSONArray(var1);
                this.field2366 = new JSONObject();
                this.field2366.put("arrayValues", var3);
            }

        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    public JSONObject method1439() {
        return this.field2366;
    }

    @Override
    public byte[] method2273() throws UnsupportedEncodingException {
        return this.field2366 == null ? new byte[0] : this.field2366.toString().getBytes(StandardCharsets.UTF_8);
    }
}
