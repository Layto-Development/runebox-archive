import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

public class class98 {
   static int field1320;
   final DecimalFormat field1317 = new DecimalFormat();
   final Map field1318 = new HashMap();
   final Map field1319 = new HashMap();

   public class98() {
      this.field1317.setMaximumFractionDigits(2);
   }

   public void method733(HttpsURLConnection var1) {
      Iterator var3 = this.field1318.entrySet().iterator();

      while(var3.hasNext()) {
         Map.Entry var4 = (Map.Entry)var3.next();
         var1.setRequestProperty((String)var4.getKey(), (String)var4.getValue());
      }

   }

   public Map method734() {
      return this.field1318;
   }

   public void method735(String var1, String var2) {
      if (var1 != null && !var1.isEmpty()) {
         this.field1318.put(var1, var2 != null ? var2 : "");
      }

   }

   public void method744(String var1) {
      if (null != var1 && !var1.isEmpty()) {
         this.field1318.remove(var1);
      }

   }

   void method740(class284 var1, String var2) {
      String var4 = String.format("%s %s", var1.method1597(), var2);
      this.method735("Authorization", var4);
   }

   public void method736(String var1) {
      this.method740(class284.field2441, var1);
   }

   public void method745(String var1) {
      this.method740(class284.field2442, var1);
   }

   public void method739(class509 var1) {
      this.field1318.put("Content-Type", var1.method2462());
   }

   public void method737() {
      this.field1318.remove("Content-Type");
   }

   public void method738(class509 var1) {
      this.method742(var1, 1.0F);
   }

   void method742(class509 var1, float var2) {
      this.field1319.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
      this.method741();
   }

   void method741() {
      this.field1318.remove("Accept");
      if (!this.field1319.isEmpty()) {
         this.field1318.put("Accept", this.method743());
      }

   }

   String method743() {
      ArrayList var2 = new ArrayList(this.field1319.entrySet());
      Collections.sort(var2, new class202(this));
      StringBuilder var3 = new StringBuilder();
      Iterator var4 = var2.iterator();

      while(var4.hasNext()) {
         Map.Entry var5 = (Map.Entry)var4.next();
         if (var3.length() > 0) {
            var3.append(",");
         }

         var3.append(((class509)var5.getKey()).method2462());
         float var6 = (Float)var5.getValue();
         if (var6 < 1.0F) {
            String var7 = this.field1317.format((double)var6);
            var3.append(";q=").append(var7);
         }
      }

      return var3.toString();
   }
}
