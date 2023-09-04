import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class class133 {
   static class534 field837;
   boolean field839;
   boolean field841;
   class141 field840;
   int field843;
   final class233 field838;
   final class299 field844;
   final HttpsURLConnection field842;

   public class133(URL var1, class299 var2, boolean var3) throws IOException {
      this(var1, var2, new class233(), var3);
   }

   public class133(URL var1, class299 var2, class233 var3, boolean var4) throws IOException {
      this.field841 = false;
      this.field839 = false;
      this.field843 = 300000;
      if (!var2.method1377()) {
         throw new UnsupportedEncodingException("Unsupported request method used " + var2.method1375());
      } else {
         this.field842 = (HttpsURLConnection)var1.openConnection();
         if (!var4) {
            this.field842.setSSLSocketFactory(class395.method1789());
         }

         this.field844 = var2;
         this.field838 = null != var3 ? var3 : new class233();
      }
   }

   public class233 method489() {
      return this.field838;
   }

   public void method485(class141 var1) {
      if (!this.field841) {
         if (var1 == null) {
            this.field838.method1139("Content-Type");
            this.field840 = null;
         } else {
            this.field840 = var1;
            if (this.field840.method505() != null) {
               this.field838.method1134(this.field840.method505());
            } else {
               this.field838.method1132();
            }

         }
      }
   }

   void method486() throws ProtocolException {
      if (!this.field841) {
         this.field842.setRequestMethod(this.field844.method1375());
         this.field838.method1128(this.field842);
         if (this.field844.method1376() && this.field840 != null) {
            this.field842.setDoOutput(true);
            ByteArrayOutputStream var2 = new ByteArrayOutputStream();

            try {
               var2.write(this.field840.method504());
               var2.writeTo(this.field842.getOutputStream());
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

         this.field842.setConnectTimeout(this.field843);
         this.field842.setInstanceFollowRedirects(this.field839);
         this.field841 = true;
      }
   }

   boolean method488() throws IOException {
      if (!this.field841) {
         this.method486();
      }

      this.field842.connect();
      return this.field842.getResponseCode() == -1;
   }

   class406 method487() {
      try {
         if (!this.field841 || this.field842.getResponseCode() == -1) {
            return new class406("No REST response has been received yet.");
         }
      } catch (IOException var11) {
         this.field842.disconnect();
         return new class406("Error decoding REST response code: " + var11.getMessage());
      }

      class406 var4;
      try {
         class406 var2 = new class406(this.field842);
         return var2;
      } catch (IOException var9) {
         var4 = new class406("Error decoding REST response: " + var9.getMessage());
      } finally {
         this.field842.disconnect();
      }

      return var4;
   }
}
