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

public class class281 {
   class539 field2413;
   float[] field2415 = new float[4];
   int field2411 = -1;
   String field2412;
   String field2414 = null;
   ArrayList field2409 = new ArrayList();
   ArrayList field2410 = new ArrayList();
   ArrayList field2416 = new ArrayList();
   Map field2417 = new HashMap();
   Map field2418 = new HashMap();

   public boolean method1542(String var1, class69 var2) {
      if (var1 != null && !var1.isEmpty()) {
         if (null == var2) {
            return false;
         } else {
            this.method1549();

            try {
               this.field2412 = var1;
               this.field2413 = var2.method657(new URL(this.field2412));
               this.field2411 = 0;
               return true;
            } catch (MalformedURLException var5) {
               this.method1549();
               this.field2411 = 100;
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public void method1556(class69 var1) {
      switch (this.field2411) {
         case 0:
            this.method1550(var1);
            break;
         case 1:
            this.method1551();
            break;
         default:
            return;
      }

   }

   public int method1543() {
      return this.field2411;
   }

   public int method1544(String var1) {
      return this.field2417.containsKey(var1) ? (Integer)this.field2417.get(var1) : -1;
   }

   public String method1558(String var1) {
      return (String)((String)(this.field2418.containsKey(var1) ? this.field2418.get(var1) : null));
   }

   public ArrayList method1545() {
      return this.field2416;
   }

   public ArrayList method1559() {
      return this.field2409;
   }

   public String method1547() {
      return this.field2414;
   }

   public float[] method1546() {
      return this.field2415;
   }

   public ArrayList method1548() {
      return this.field2410;
   }

   void method1549() {
      this.field2413 = null;
      this.field2414 = null;
      this.field2415[0] = 0.0F;
      this.field2415[1] = 0.0F;
      this.field2415[2] = 1.0F;
      this.field2415[3] = 1.0F;
      this.field2410.clear();
      this.field2416.clear();
      this.field2409.clear();
      this.field2417.clear();
      this.field2418.clear();
   }

   void method1550(class69 var1) {
      if (null != this.field2413 && this.field2413.method2563()) {
         byte[] var3 = this.field2413.method2565();
         if (null == var3) {
            this.method1549();
            this.field2411 = 100;
         } else {
            try {
               this.method1553(new class261(var3), var1);
            } catch (UnsupportedEncodingException var5) {
               this.method1549();
               this.field2411 = 102;
               return;
            }

            this.field2411 = this.field2416.size() > 0 ? 1 : 2;
            this.field2413 = null;
         }
      }
   }

   void method1551() {
      Iterator var2 = this.field2416.iterator();

      class263 var3;
      do {
         if (!var2.hasNext()) {
            var2 = this.field2416.iterator();

            while(var2.hasNext()) {
               var3 = (class263)var2.next();
               if (null != var3.field2289) {
                  byte[] var4 = var3.field2289.method2565();
                  if (var4 != null && var4.length > 0) {
                     this.field2411 = 2;
                     return;
                  }
               }
            }

            this.method1549();
            this.field2411 = 101;
            return;
         }

         var3 = (class263)var2.next();
      } while(null == var3.field2289 || var3.field2289.method2563());

   }

   void method1557(JSONArray var1, class69 var2) throws JSONException {
      if (null != var1) {
         for(int var4 = 0; var4 < var1.length(); ++var4) {
            try {
               JSONObject var5 = var1.getJSONObject(var4);
               class263 var6 = new class263(this);
               var6.field2289 = var2.method657(new URL(var5.getString("src")));
               var6.field2290 = method1561(var5, "placement");
               this.field2416.add(var6);
            } catch (MalformedURLException var7) {
            }
         }

      }
   }

   void method1552(JSONArray var1) throws JSONException {
      if (null != var1) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            JSONObject var4 = var1.getJSONObject(var3);
            class456 var5 = new class456(this);
            var5.field3563 = var4.getString("text");
            String var8 = var4.getString("align_x");
            byte var7;
            if (var8.equals("centre")) {
               var7 = 1;
            } else if (!var8.equals("bottom") && !var8.equals("right")) {
               var7 = 0;
            } else {
               var7 = 2;
            }

            var5.field3560 = var7;
            String var11 = var4.getString("align_y");
            byte var10;
            if (var11.equals("centre")) {
               var10 = 1;
            } else if (!var11.equals("bottom") && !var11.equals("right")) {
               var10 = 0;
            } else {
               var10 = 2;
            }

            var5.field3561 = var10;
            var5.field3558 = var4.getInt("font");
            var5.field3559 = method1561(var4, "placement");
            this.field2409.add(var5);
         }

      }
   }

   void method1555(JSONObject var1) throws JSONException {
      if (null != var1) {
         this.field2415 = method1561(var1, "clickbounds");
         this.field2414 = var1.getString("endpoint");
         String[] var3 = JSONObject.getNames(var1);

         for(int var4 = 0; var4 < var1.length(); ++var4) {
            if (!var3[var4].equals("clickbounds") && !var3[var4].equals("endpoint")) {
               try {
                  int var5 = var1.getInt(var3[var4]);
                  this.field2410.add(new class26(this, var3[var4], var5));
               } catch (Exception var8) {
                  try {
                     String var6 = var1.getString(var3[var4]);
                     if (var6.equals("true")) {
                        this.field2410.add(new class26(this, var3[var4], 1));
                     } else if (var6.equals("false")) {
                        this.field2410.add(new class26(this, var3[var4], 0));
                     } else {
                        this.field2410.add(new class351(this, var3[var4], var6));
                     }
                  } catch (Exception var7) {
                  }
               }
            }
         }

      }
   }

   void method1560(JSONObject var1) throws JSONException {
      String[] var3 = JSONObject.getNames(var1);

      for(int var4 = 0; var4 < var1.length(); ++var4) {
         try {
            int var5 = var1.getInt(var3[var4]);
            this.field2417.put(var3[var4], var5);
         } catch (Exception var8) {
            try {
               String var6 = var1.getString(var3[var4]);
               if (var6.equals("true")) {
                  this.field2417.put(var3[var4], 1);
               } else if (var6.equals("false")) {
                  this.field2417.put(var3[var4], 0);
               } else {
                  this.field2418.put(var3[var4], var6);
               }
            } catch (Exception var7) {
            }
         }
      }

   }

   void method1553(class261 var1, class69 var2) {
      JSONObject var4;
      try {
         var4 = var1.method1504();
         var4 = var4.getJSONObject("message");
      } catch (Exception var10) {
         this.method1549();
         this.field2411 = 102;
         return;
      }

      try {
         this.method1557(var4.getJSONArray("images"), var2);
      } catch (Exception var9) {
         this.field2416.clear();
      }

      try {
         this.method1552(var4.getJSONArray("labels"));
      } catch (Exception var8) {
         this.field2409.clear();
      }

      try {
         this.method1555(var4.getJSONObject("behaviour"));
      } catch (Exception var7) {
         this.field2414 = null;
         this.field2415[0] = 0.0F;
         this.field2415[1] = 0.0F;
         this.field2415[2] = 1.0F;
         this.field2415[3] = 1.0F;
         this.field2410.clear();
      }

      try {
         this.method1560(var4.getJSONObject("meta"));
      } catch (Exception var6) {
         this.field2417.clear();
         this.field2418.clear();
      }

   }

   public boolean method1554(String var1, class69 var2) {
      try {
         this.method1553(new class261(var1.getBytes()), var2);
         this.field2411 = this.field2416.size() > 0 ? 1 : 2;
      } catch (UnsupportedEncodingException var5) {
         this.field2411 = 102;
      }

      return this.field2411 < 100;
   }

   static float[] method1561(JSONObject var0, String var1) throws JSONException {
      float[] var3 = new float[4];

      try {
         JSONArray var4 = var0.getJSONArray(var1);
         var3[0] = (float)var4.optDouble(0, 0.0);
         var3[1] = (float)var4.optDouble(1, 0.0);
         var3[2] = (float)var4.optDouble(2, 1.0);
         var3[3] = (float)var4.optDouble(3, 1.0);
      } catch (JSONException var5) {
         var3[0] = 0.0F;
         var3[1] = 0.0F;
         var3[2] = 1.0F;
         var3[3] = 1.0F;
      }

      return var3;
   }
}
