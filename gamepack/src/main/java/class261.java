import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class class261 implements class380 {
   public static int field2286;
   JSONObject field2285;

   public class261(JSONObject var1) {
      this.field2285 = var1;
   }

   public class261(String var1) throws UnsupportedEncodingException {
      this.method1503(var1);
   }

   public class261(byte[] var1) throws UnsupportedEncodingException {
      this.method1506(var1);
   }

   public class509 method1889() {
      return class509.field3973;
   }

   void method1506(byte[] var1) throws UnsupportedEncodingException {
      String var3 = new String(var1, "UTF-8");
      this.method1503(var3);
   }

   void method1503(String var1) throws UnsupportedEncodingException {
      try {
         if (var1.charAt(0) == '{') {
            this.field2285 = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != '[') {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var3 = new JSONArray(var1);
            this.field2285 = new JSONObject();
            this.field2285.put("arrayValues", var3);
         }

      } catch (JSONException var4) {
         throw new UnsupportedEncodingException(var4.getMessage());
      }
   }

   public JSONObject method1504() {
      return this.field2285;
   }

   public byte[] method1888() throws UnsupportedEncodingException {
      return this.field2285 == null ? new byte[0] : this.field2285.toString().getBytes("UTF-8");
   }
}
