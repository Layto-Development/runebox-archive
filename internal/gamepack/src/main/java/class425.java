import java.applet.Applet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class class425 extends RuntimeException {
   public static int field3315;
   public static int field3316;
   public static int field3319;
   public static Applet field3313;
   public static String field3312;
   static int[][] field3317;
   String field3314;
   Throwable field3318;

   class425(Throwable var1, String var2) {
      this.field3314 = var2;
      this.field3318 = var1;
   }

   static String method1952(Throwable var0) throws IOException {
      String var2;
      if (var0 instanceof class425) {
         class425 var3 = (class425)var0;
         var2 = var3.field3314 + " | ";
         var0 = var3.field3318;
      } else {
         var2 = "";
      }

      StringWriter var13 = new StringWriter();
      PrintWriter var4 = new PrintWriter(var13);
      var0.printStackTrace(var4);
      var4.close();
      String var5 = var13.toString();
      BufferedReader var6 = new BufferedReader(new StringReader(var5));
      String var7 = var6.readLine();

      while(true) {
         while(true) {
            String var8 = var6.readLine();
            if (var8 == null) {
               var2 = var2 + "| " + var7;
               return var2;
            }

            int var9 = var8.indexOf(40);
            int var10 = var8.indexOf(41, var9 + 1);
            if (var9 >= 0 && var10 >= 0) {
               String var11 = var8.substring(var9 + 1, var10);
               int var12 = var11.indexOf(".java:");
               if (var12 >= 0) {
                  var11 = var11.substring(0, var12) + var11.substring(var12 + 5);
                  var2 = var2 + var11 + ' ';
                  continue;
               }

               var8 = var8.substring(0, var9);
            }

            var8 = var8.trim();
            var8 = var8.substring(var8.lastIndexOf(32) + 1);
            var8 = var8.substring(var8.lastIndexOf(9) + 1);
            var2 = var2 + var8 + ' ';
         }
      }
   }
}
