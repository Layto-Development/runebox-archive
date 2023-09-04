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

public class class505 {
   class208 field4047;
   float[] field4049 = new float[4];
   int field4045 = -1;
   String field4046;
   String field4048 = null;
   ArrayList field4043 = new ArrayList();
   ArrayList field4044 = new ArrayList();
   ArrayList field4050 = new ArrayList();
   Map field4051 = new HashMap();
   Map field4052 = new HashMap();

   public boolean method2399(String var1, class36 var2) {
      if (var1 != null && !var1.isEmpty()) {
         if (null == var2) {
            return false;
         } else {
            this.method2406();

            try {
               this.field4046 = var1;
               this.field4047 = var2.method152(new URL(this.field4046));
               this.field4045 = 0;
               return true;
            } catch (MalformedURLException var5) {
               this.method2406();
               this.field4045 = 100;
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public void method2413(class36 var1) {
      switch (this.field4045) {
         case 0:
            this.method2407(var1);
            break;
         case 1:
            this.method2408();
            break;
         default:
            return;
      }

   }

   public int method2400() {
      return this.field4045;
   }

   public int method2401(String var1) {
      return this.field4051.containsKey(var1) ? (Integer)this.field4051.get(var1) : -1;
   }

   public String method2415(String var1) {
      return (String)((String)(this.field4052.containsKey(var1) ? this.field4052.get(var1) : null));
   }

   public ArrayList method2402() {
      return this.field4050;
   }

   public ArrayList method2416() {
      return this.field4043;
   }

   public String method2404() {
      return this.field4048;
   }

   public float[] method2403() {
      return this.field4049;
   }

   public ArrayList method2405() {
      return this.field4044;
   }

   void method2406() {
      this.field4047 = null;
      this.field4048 = null;
      this.field4049[0] = 0.0F;
      this.field4049[1] = 0.0F;
      this.field4049[2] = 1.0F;
      this.field4049[3] = 1.0F;
      this.field4044.clear();
      this.field4050.clear();
      this.field4043.clear();
      this.field4051.clear();
      this.field4052.clear();
   }

   void method2407(class36 var1) {
      if (null != this.field4047 && this.field4047.method1086()) {
         byte[] var3 = this.field4047.method1088();
         if (null == var3) {
            this.method2406();
            this.field4045 = 100;
         } else {
            try {
               this.method2410(new class180(var3), var1);
            } catch (UnsupportedEncodingException var5) {
               this.method2406();
               this.field4045 = 102;
               return;
            }

            this.field4045 = this.field4050.size() > 0 ? 1 : 2;
            this.field4047 = null;
         }
      }
   }

   void method2408() {
      Iterator var2 = this.field4050.iterator();

      class27 var3;
      do {
         if (!var2.hasNext()) {
            var2 = this.field4050.iterator();

            while(var2.hasNext()) {
               var3 = (class27)var2.next();
               if (null != var3.field264) {
                  byte[] var4 = var3.field264.method1088();
                  if (var4 != null && var4.length > 0) {
                     this.field4045 = 2;
                     return;
                  }
               }
            }

            this.method2406();
            this.field4045 = 101;
            return;
         }

         var3 = (class27)var2.next();
      } while(null == var3.field264 || var3.field264.method1086());

   }

   void method2414(JSONArray var1, class36 var2) throws JSONException {
      if (null != var1) {
         for(int var4 = 0; var4 < var1.length(); ++var4) {
            try {
               JSONObject var5 = var1.getJSONObject(var4);
               class27 var6 = new class27(this);
               var6.field264 = var2.method152(new URL(var5.getString("src")));
               var6.field265 = method2418(var5, "placement");
               this.field4050.add(var6);
            } catch (MalformedURLException var7) {
            }
         }

      }
   }

   void method2409(JSONArray var1) throws JSONException {
      if (null != var1) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            JSONObject var4 = var1.getJSONObject(var3);
            class394 var5 = new class394(this);
            var5.field2762 = var4.getString("text");
            String var8 = var4.getString("align_x");
            byte var7;
            if (var8.equals("centre")) {
               var7 = 1;
            } else if (!var8.equals("bottom") && !var8.equals("right")) {
               var7 = 0;
            } else {
               var7 = 2;
            }

            var5.field2759 = var7;
            String var11 = var4.getString("align_y");
            byte var10;
            if (var11.equals("centre")) {
               var10 = 1;
            } else if (!var11.equals("bottom") && !var11.equals("right")) {
               var10 = 0;
            } else {
               var10 = 2;
            }

            var5.field2760 = var10;
            var5.field2757 = var4.getInt("font");
            var5.field2758 = method2418(var4, "placement");
            this.field4043.add(var5);
         }

      }
   }

   void method2412(JSONObject var1) throws JSONException {
      if (null != var1) {
         this.field4049 = method2418(var1, "clickbounds");
         this.field4048 = var1.getString("endpoint");
         String[] var3 = JSONObject.getNames(var1);

         for(int var4 = 0; var4 < var1.length(); ++var4) {
            if (!var3[var4].equals("clickbounds") && !var3[var4].equals("endpoint")) {
               try {
                  int var5 = var1.getInt(var3[var4]);
                  this.field4044.add(new class267(this, var3[var4], var5));
               } catch (Exception var8) {
                  try {
                     String var6 = var1.getString(var3[var4]);
                     if (var6.equals("true")) {
                        this.field4044.add(new class267(this, var3[var4], 1));
                     } else if (var6.equals("false")) {
                        this.field4044.add(new class267(this, var3[var4], 0));
                     } else {
                        this.field4044.add(new class281(this, var3[var4], var6));
                     }
                  } catch (Exception var7) {
                  }
               }
            }
         }

      }
   }

   void method2417(JSONObject var1) throws JSONException {
      String[] var3 = JSONObject.getNames(var1);

      for(int var4 = 0; var4 < var1.length(); ++var4) {
         try {
            int var5 = var1.getInt(var3[var4]);
            this.field4051.put(var3[var4], var5);
         } catch (Exception var8) {
            try {
               String var6 = var1.getString(var3[var4]);
               if (var6.equals("true")) {
                  this.field4051.put(var3[var4], 1);
               } else if (var6.equals("false")) {
                  this.field4051.put(var3[var4], 0);
               } else {
                  this.field4052.put(var3[var4], var6);
               }
            } catch (Exception var7) {
            }
         }
      }

   }

   void method2410(class180 var1, class36 var2) {
      JSONObject var4;
      try {
         var4 = var1.method963();
         var4 = var4.getJSONObject("message");
      } catch (Exception var10) {
         this.method2406();
         this.field4045 = 102;
         return;
      }

      try {
         this.method2414(var4.getJSONArray("images"), var2);
      } catch (Exception var9) {
         this.field4050.clear();
      }

      try {
         this.method2409(var4.getJSONArray("labels"));
      } catch (Exception var8) {
         this.field4043.clear();
      }

      try {
         this.method2412(var4.getJSONObject("behaviour"));
      } catch (Exception var7) {
         this.field4048 = null;
         this.field4049[0] = 0.0F;
         this.field4049[1] = 0.0F;
         this.field4049[2] = 1.0F;
         this.field4049[3] = 1.0F;
         this.field4044.clear();
      }

      try {
         this.method2417(var4.getJSONObject("meta"));
      } catch (Exception var6) {
         this.field4051.clear();
         this.field4052.clear();
      }

   }

   public boolean method2411(String var1, class36 var2) {
      try {
         this.method2410(new class180(var1.getBytes()), var2);
         this.field4045 = this.field4050.size() > 0 ? 1 : 2;
      } catch (UnsupportedEncodingException var5) {
         this.field4045 = 102;
      }

      return this.field4045 < 100;
   }

   static float[] method2418(JSONObject var0, String var1) throws JSONException {
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
