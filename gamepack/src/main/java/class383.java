import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class class383 {
   static class22 field3063;
   boolean field3065;
   boolean field3067;
   class380 field3066;
   int field3069;
   final class355 field3070;
   final class98 field3064;
   final HttpsURLConnection field3068;

   public class383(URL var1, class355 var2, boolean var3) throws IOException {
      this(var1, var2, new class98(), var3);
   }

   public class383(URL var1, class355 var2, class98 var3, boolean var4) throws IOException {
      this.field3067 = false;
      this.field3065 = false;
      this.field3069 = 300000;
      if (!var2.method1825()) {
         throw new UnsupportedEncodingException("Unsupported request method used " + var2.method1823());
      } else {
         this.field3068 = (HttpsURLConnection)var1.openConnection();
         if (!var4) {
            this.field3068.setSSLSocketFactory(class538.method2561());
         }

         this.field3070 = var2;
         this.field3064 = null != var3 ? var3 : new class98();
      }
   }

   public class98 method1894() {
      return this.field3064;
   }

   public void method1890(class380 var1) {
      if (!this.field3067) {
         if (var1 == null) {
            this.field3064.method744("Content-Type");
            this.field3066 = null;
         } else {
            this.field3066 = var1;
            if (this.field3066.method1889() != null) {
               this.field3064.method739(this.field3066.method1889());
            } else {
               this.field3064.method737();
            }

         }
      }
   }

   void method1891() throws ProtocolException {
      if (!this.field3067) {
         this.field3068.setRequestMethod(this.field3070.method1823());
         this.field3064.method733(this.field3068);
         if (this.field3070.method1824() && this.field3066 != null) {
            this.field3068.setDoOutput(true);
            ByteArrayOutputStream var2 = new ByteArrayOutputStream();

            try {
               var2.write(this.field3066.method1888());
               var2.writeTo(this.field3068.getOutputStream());
            } catch (IOException var12) {
               var12.printStackTrace();
            } finally {
               try {
                  var2.close();
               } catch (IOException var11) {
                  var11.printStackTrace();
               }

            }
         }

         this.field3068.setConnectTimeout(this.field3069);
         this.field3068.setInstanceFollowRedirects(this.field3065);
         this.field3067 = true;
      }
   }

   boolean method1893() throws IOException {
      if (!this.field3067) {
         this.method1891();
      }

      this.field3068.connect();
      return this.field3068.getResponseCode() == -1;
   }

   class329 method1892() {
      try {
         if (!this.field3067 || this.field3068.getResponseCode() == -1) {
            return new class329("No REST response has been received yet.");
         }
      } catch (IOException var11) {
         this.field3068.disconnect();
         return new class329("Error decoding REST response code: " + var11.getMessage());
      }

      class329 var4;
      try {
         class329 var2 = new class329(this.field3068);
         return var2;
      } catch (IOException var9) {
         var4 = new class329("Error decoding REST response: " + var9.getMessage());
      } finally {
         this.field3068.disconnect();
      }

      return var4;
   }
}
