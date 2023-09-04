import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class class426 extends class69 {
   public static int field3228;
   static int field3230;
   final boolean field3229;

   public class426(boolean var1, int var2) {
      super(var2);
      this.field3229 = var1;
   }

   void method655(class539 var1) throws IOException {
      URLConnection var3 = null;
      boolean var10 = false;

      label124: {
         HttpURLConnection var13;
         label125: {
            try {
               var10 = true;
               String var4 = var1.field4259.getProtocol();
               if (var4.equals("http")) {
                  var3 = this.method2001(var1);
               } else {
                  if (!var4.equals("https")) {
                     var1.field4262 = class539.field4261;
                     var10 = false;
                     break label124;
                  }

                  var3 = this.method2002(var1);
               }

               this.method656(var3, var1);
               var10 = false;
               break label125;
            } catch (IOException var11) {
               var1.field4262 = class539.field4261;
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

   URLConnection method2001(class539 var1) throws IOException {
      URLConnection var3 = var1.field4259.openConnection();
      this.method660(var3);
      return var3;
   }

   URLConnection method2002(class539 var1) throws IOException {
      HttpsURLConnection var3 = (HttpsURLConnection)var1.field4259.openConnection();
      if (!this.field3229) {
         var3.setSSLSocketFactory(class538.method2561());
      }

      this.method660(var3);
      return var3;
   }
}
