import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

public class class329 {
   final int field2654;
   final String field2653;
   final Map field2652;

   class329(HttpURLConnection var1) throws IOException {
      this.field2654 = var1.getResponseCode();
      var1.getResponseMessage();
      this.field2652 = var1.getHeaderFields();
      StringBuilder var2 = new StringBuilder();
      InputStream var3 = this.field2654 >= 300 ? var1.getErrorStream() : var1.getInputStream();
      if (var3 != null) {
         InputStreamReader var4 = new InputStreamReader(var3);
         BufferedReader var5 = new BufferedReader(var4);

         String var6;
         while((var6 = var5.readLine()) != null) {
            var2.append(var6);
         }

         var3.close();
      }

      this.field2653 = var2.toString();
   }

   class329(String var1) {
      this.field2654 = 400;
      this.field2652 = null;
      this.field2653 = "";
   }

   public int method1727() {
      return this.field2654;
   }

   public Map method1728() {
      return this.field2652;
   }

   public String method1729() {
      return this.field2653;
   }

   static int method1730(class164 var0) {
      int var2 = var0.method1004(2);
      int var3;
      if (var2 == 0) {
         var3 = 0;
      } else if (var2 == 1) {
         var3 = var0.method1004(5);
      } else if (var2 == 2) {
         var3 = var0.method1004(8);
      } else {
         var3 = var0.method1004(11);
      }

      return var3;
   }
}
