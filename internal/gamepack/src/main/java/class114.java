import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class class114 extends class36 {
   public static int field730;
   static int field732;
   final boolean field731;

   public class114(boolean var1, int var2) {
      super(var2);
      this.field731 = var1;
   }

   void method150(class208 var1) throws IOException {
      URLConnection var3 = null;
      boolean var10 = false;

      label124: {
         HttpURLConnection var13;
         label125: {
            try {
               var10 = true;
               String var4 = var1.field1600.getProtocol();
               if (var4.equals("http")) {
                  var3 = this.method404(var1);
               } else {
                  if (!var4.equals("https")) {
                     var1.field1603 = class208.field1602;
                     var10 = false;
                     break label124;
                  }

                  var3 = this.method405(var1);
               }

               this.method151(var3, var1);
               var10 = false;
               break label125;
            } catch (IOException var11) {
               var1.field1603 = class208.field1602;
               var10 = false;
            } finally {
               if (var10) {
                  if (null != var3 && var3 instanceof HttpURLConnection) {
                     HttpURLConnection var7 = (HttpURLConnection)var3;
                     var7.disconnect();
                  }

               }
            }

            if (null != var3 && var3 instanceof HttpURLConnection) {
               var13 = (HttpURLConnection)var3;
               var13.disconnect();
            }

            return;
         }

         if (null != var3 && var3 instanceof HttpURLConnection) {
            var13 = (HttpURLConnection)var3;
            var13.disconnect();
         }

         return;
      }

      if (null != var3 && var3 instanceof HttpURLConnection) {
         HttpURLConnection var5 = (HttpURLConnection)var3;
         var5.disconnect();
      }

   }

   URLConnection method404(class208 var1) throws IOException {
      URLConnection var3 = var1.field1600.openConnection();
      this.method155(var3);
      return var3;
   }

   URLConnection method405(class208 var1) throws IOException {
      HttpsURLConnection var3 = (HttpsURLConnection)var1.field1600.openConnection();
      if (!this.field731) {
         var3.setSSLSocketFactory(class395.method1789());
      }

      this.method155(var3);
      return var3;
   }
}
