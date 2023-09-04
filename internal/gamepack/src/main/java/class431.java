import java.io.DataInputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class class431 {
   public static String field3371;
   static int field3370 = 0;
   static final class524 field3368 = new class524(1024);
   static final class72 field3369 = new class72();
   static final Map field3367 = new HashMap();

   class431() throws Throwable {
   }

   static void method2007(int var0, String var1, String var2) {
      method2014(var0, var1, var2, (String)null);
   }

   static void method2014(int var0, String var1, String var2, String var3) {
      class102 var5 = (class102)field3367.get(var0);
      if (var5 == null) {
         var5 = new class102();
         field3367.put(var0, var5);
      }

      class243 var6 = var5.method380(var0, var1, var2, var3);
      field3368.method2513(var6, (long)var6.field1773);
      field3369.method297(var6);
      Client.field1321 = Client.field1118;
   }

   public static void method2006(String var0, Throwable var1) {
      try {
         String var3 = "";
         if (var1 != null) {
            var3 = class425.method1952(var1);
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
         if (null == class425.field3313) {
            return;
         }

         URL var4 = new URL(class425.field3313.getCodeBase(), "clienterror.ws?cv=" + class425.field3319 + "&cs=" + class425.field3315 + "&u=" + class425.field3312 + "&v1=" + class250.field1802 + "&v2=" + class529.field4180 + "&ct=" + class425.field3316 + "&e=" + var3);
         DataInputStream var5 = new DataInputStream(var4.openStream());
         var5.read();
         var5.close();
      } catch (Exception var6) {
      }

   }

   static class243 method2013(int var0, int var1) {
      class102 var3 = (class102)field3367.get(var0);
      return var3.method381(var1);
   }

   static class243 method2008(int var0) {
      return (class243)field3368.method2509((long)var0);
   }

   static int method2011(int var0) {
      class102 var2 = (class102)field3367.get(var0);
      return null == var2 ? 0 : var2.method379();
   }

   static void method2009() {
      field3367.clear();
      field3368.method2510();
      field3369.method303();
      field3370 = 0;
   }

   static int method2010(int var0) {
      class243 var2 = (class243)field3368.method2509((long)var0);
      if (null == var2) {
         return -1;
      } else {
         return var2.field2068 == field3369.field543 ? -1 : ((class243)var2.field2068).field1773;
      }
   }

   static int method2012(int var0) {
      class243 var2 = (class243)field3368.method2509((long)var0);
      if (null == var2) {
         return -1;
      } else {
         return var2.field2067 == field3369.field543 ? -1 : ((class243)var2.field2067).field1773;
      }
   }
}
