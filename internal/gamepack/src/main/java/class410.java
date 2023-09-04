import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

public class class410 {
   static int field2890;
   static Applet field2889 = null;
   static String field2888 = "";

   class410() throws Throwable {
   }

   public static void method1893(Applet var0, String var1) {
      field2889 = var0;
      if (null != var1) {
         field2888 = var1;
      }

   }

   public static void method1894(String var0, boolean var1, boolean var2) {
      if (var1) {
         if (!var2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var5) {
            }
         }

         if (field2888.startsWith("win") && !var2) {
            method1895(var0, 0);
         } else if (field2888.startsWith("mac")) {
            method1896(var0, 1, "openjs");
         } else {
            method1895(var0, 2);
         }
      } else {
         method1895(var0, 3);
      }

   }

   static boolean method1895(String var0, int var1) {
      return method1896(var0, var1, "openjs");
   }

   static boolean method1896(String var0, int var1, String var2) {
      if (var1 == 0) {
         try {
            if (!field2888.startsWith("win")) {
               throw new Exception();
            } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var12 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var5 = 0; var5 < var0.length(); ++var5) {
                  if (var12.indexOf(var0.charAt(var5)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var6) {
            return false;
         }
      } else if (var1 == 1) {
         try {
            Object var11 = class507.method2421(field2889, var2, new Object[]{(new URL(field2889.getCodeBase(), var0)).toString()});
            return var11 != null;
         } catch (Throwable var7) {
            return false;
         }
      } else if (var1 == 2) {
         try {
            field2889.getAppletContext().showDocument(new URL(field2889.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else if (var1 == 3) {
         try {
            Applet var4 = field2889;
            JSObject.getWindow(var4).call("loggedout", (Object[])null);
         } catch (Throwable var10) {
         }

         try {
            field2889.getAppletContext().showDocument(new URL(field2889.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var9) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
