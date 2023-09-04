import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class class180 implements class141 {
   public static int field1453;
   JSONObject field1452;

   public class180(JSONObject var1) {
      this.field1452 = var1;
   }

   public class180(String var1) throws UnsupportedEncodingException {
      this.method962(var1);
   }

   public class180(byte[] var1) throws UnsupportedEncodingException {
      this.method964(var1);
   }

   public class181 method505() {
      return class181.field1454;
   }

   void method964(byte[] var1) throws UnsupportedEncodingException {
      String var3 = new String(var1, "UTF-8");
      this.method962(var3);
   }

   void method962(String var1) throws UnsupportedEncodingException {
      try {
         if (var1.charAt(0) == '{') {
            this.field1452 = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != '[') {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var3 = new JSONArray(var1);
            this.field1452 = new JSONObject();
            this.field1452.put("arrayValues", var3);
         }

      } catch (JSONException var4) {
         throw new UnsupportedEncodingException(var4.getMessage());
      }
   }

   public JSONObject method963() {
      return this.field1452;
   }

   public byte[] method504() throws UnsupportedEncodingException {
      return this.field1452 == null ? new byte[0] : this.field1452.toString().getBytes("UTF-8");
   }
}
