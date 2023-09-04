import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

public class class233 {
   static int field1719;
   final DecimalFormat field1716 = new DecimalFormat();
   final Map field1717 = new HashMap();
   final Map field1718 = new HashMap();

   public class233() {
      this.field1716.setMaximumFractionDigits(2);
   }

   public void method1128(HttpsURLConnection var1) {
      Iterator var3 = this.field1717.entrySet().iterator();

      while(var3.hasNext()) {
         Map.Entry var4 = (Map.Entry)var3.next();
         var1.setRequestProperty((String)var4.getKey(), (String)var4.getValue());
      }

   }

   public Map method1129() {
      return this.field1717;
   }

   public void method1130(String var1, String var2) {
      if (var1 != null && !var1.isEmpty()) {
         this.field1717.put(var1, var2 != null ? var2 : "");
      }

   }

   public void method1139(String var1) {
      if (null != var1 && !var1.isEmpty()) {
         this.field1717.remove(var1);
      }

   }

   void method1135(class255 var1, String var2) {
      String var4 = String.format("%s %s", var1.method1198(), var2);
      this.method1130("Authorization", var4);
   }

   public void method1131(String var1) {
      this.method1135(class255.field1841, var1);
   }

   public void method1140(String var1) {
      this.method1135(class255.field1842, var1);
   }

   public void method1134(class181 var1) {
      this.field1717.put("Content-Type", var1.method965());
   }

   public void method1132() {
      this.field1717.remove("Content-Type");
   }

   public void method1133(class181 var1) {
      this.method1137(var1, 1.0F);
   }

   void method1137(class181 var1, float var2) {
      this.field1718.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
      this.method1136();
   }

   void method1136() {
      this.field1717.remove("Accept");
      if (!this.field1718.isEmpty()) {
         this.field1717.put("Accept", this.method1138());
      }

   }

   String method1138() {
      ArrayList var2 = new ArrayList(this.field1718.entrySet());
      Collections.sort(var2, new class33(this));
      StringBuilder var3 = new StringBuilder();
      Iterator var4 = var2.iterator();

      while(var4.hasNext()) {
         Map.Entry var5 = (Map.Entry)var4.next();
         if (var3.length() > 0) {
            var3.append(",");
         }

         var3.append(((class181)var5.getKey()).method965());
         float var6 = (Float)var5.getValue();
         if (var6 < 1.0F) {
            String var7 = this.field1716.format((double)var6);
            var3.append(";q=").append(var7);
         }
      }

      return var3.toString();
   }
}
