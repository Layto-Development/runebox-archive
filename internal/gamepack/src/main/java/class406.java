import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

public class class406 {
   final int field2816;
   final String field2815;
   final Map field2814;

   class406(HttpURLConnection var1) throws IOException {
      this.field2816 = var1.getResponseCode();
      var1.getResponseMessage();
      this.field2814 = var1.getHeaderFields();
      StringBuilder var2 = new StringBuilder();
      InputStream var3 = this.field2816 >= 300 ? var1.getErrorStream() : var1.getInputStream();
      if (var3 != null) {
         InputStreamReader var4 = new InputStreamReader(var3);
         BufferedReader var5 = new BufferedReader(var4);

         String var6;
         while((var6 = var5.readLine()) != null) {
            var2.append(var6);
         }

         var3.close();
      }

      this.field2815 = var2.toString();
   }

   class406(String var1) {
      this.field2816 = 400;
      this.field2814 = null;
      this.field2815 = "";
   }

   public int method1830() {
      return this.field2816;
   }

   public Map method1831() {
      return this.field2814;
   }

   public String method1832() {
      return this.field2815;
   }

   static int method1833(class435 var0) {
      int var2 = var0.method2036(2);
      int var3;
      if (var2 == 0) {
         var3 = 0;
      } else if (var2 == 1) {
         var3 = var0.method2036(5);
      } else if (var2 == 2) {
         var3 = var0.method2036(8);
      } else {
         var3 = var0.method2036(11);
      }

      return var3;
   }
}
