import java.io.DataInputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class class194 {
   public static String field1891;
   static int field1890 = 0;
   static final class197 field1888 = new class197(1024);
   static final class361 field1889 = new class361();
   static final Map field1887 = new HashMap();

   class194() throws Throwable {
   }

   static void method1209(int var0, String var1, String var2) {
      method1216(var0, var1, var2, (String)null);
   }

   static void method1216(int var0, String var1, String var2, String var3) {
      class195 var5 = (class195)field1887.get(var0);
      if (var5 == null) {
         var5 = new class195();
         field1887.put(var0, var5);
      }

      class461 var6 = var5.method1218(var0, var1, var2, var3);
      field1888.method1226(var6, (long)var6.field3585);
      field1889.method1839(var6);
      Client.field781 = Client.field578;
   }

   public static void method1208(String var0, Throwable var1) {
      try {
         String var3 = "";
         if (var1 != null) {
            var3 = class340.method1786(var1);
         }

         if (null != var0) {
            if (var1 != null) {
               var3 = var3 + " | ";
            }

            var3 = var3 + var0;
         }

         System.out.println("Error: " + var3);
         var3 = var3.replace(':', '.');
         var3 = var3.replace('@', '_');
         var3 = var3.replace('&', '_');
         var3 = var3.replace('#', '_');
         if (null == class340.field2721) {
            return;
         }

         URL var4 = new URL(class340.field2721.getCodeBase(), "clienterror.ws?cv=" + class340.field2727 + "&cs=" + class340.field2723 + "&u=" + class340.field2720 + "&v1=" + class93.field1298 + "&v2=" + class523.field4125 + "&ct=" + class340.field2724 + "&e=" + var3);
         DataInputStream var5 = new DataInputStream(var4.openStream());
         var5.read();
         var5.close();
      } catch (Exception var6) {
      }

   }

   static class461 method1215(int var0, int var1) {
      class195 var3 = (class195)field1887.get(var0);
      return var3.method1219(var1);
   }

   static class461 method1210(int var0) {
      return (class461)field1888.method1222((long)var0);
   }

   static int method1213(int var0) {
      class195 var2 = (class195)field1887.get(var0);
      return null == var2 ? 0 : var2.method1217();
   }

   static void method1211() {
      field1887.clear();
      field1888.method1223();
      field1889.method1845();
      field1890 = 0;
   }

   static int method1212(int var0) {
      class461 var2 = (class461)field1888.method1222((long)var0);
      if (null == var2) {
         return -1;
      } else {
         return var2.field1624 == field1889.field2827 ? -1 : ((class461)var2.field1624).field3585;
      }
   }

   static int method1214(int var0) {
      class461 var2 = (class461)field1888.method1222((long)var0);
      if (null == var2) {
         return -1;
      } else {
         return var2.field1623 == field1889.field2827 ? -1 : ((class461)var2.field1623).field3585;
      }
   }
}
