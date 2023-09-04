import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class class205 {
   static int field1938;
   static final BigInteger field1939 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
   static final BigInteger field1940 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

   class205() throws Throwable {
   }

   static final int method1253(long var0, String var2) {
      Random var4 = new Random();
      class184 var5 = new class184(128);
      class184 var6 = new class184(128);
      int[] var7 = new int[]{var4.nextInt(), var4.nextInt(), (int)(var0 >> 32), (int)var0};
      var5.method1114(10);

      int var8;
      for(var8 = 0; var8 < 4; ++var8) {
         var5.method1180(var4.nextInt());
      }

      var5.method1180(var7[0]);
      var5.method1180(var7[1]);
      var5.method1151(var0);
      var5.method1151(0L);

      for(var8 = 0; var8 < 4; ++var8) {
         var5.method1180(var4.nextInt());
      }

      var5.method1158(field1939, field1940);
      var6.method1114(10);

      for(var8 = 0; var8 < 3; ++var8) {
         var6.method1180(var4.nextInt());
      }

      var6.method1151(var4.nextLong());
      var6.method1115(var4.nextLong());
      Client.method473(var6);
      var6.method1151(var4.nextLong());
      var6.method1158(field1939, field1940);
      var8 = class184.method1188(var2);
      if (var8 % 8 != 0) {
         var8 += 8 - var8 % 8;
      }

      class184 var9 = new class184(var8);
      var9.method1117(var2);
      var9.field1818 = var8;
      var9.method1142(var7);
      class184 var10 = new class184(var9.field1818 + var6.field1818 + var5.field1818 + 5);
      var10.method1114(2);
      var10.method1114(var5.field1818);
      var10.method1119(var5.field1816, 0, var5.field1818);
      var10.method1114(var6.field1818);
      var10.method1119(var6.field1816, 0, var6.field1818);
      var10.method1155(var9.field1818);
      var10.method1119(var9.field1816, 0, var9.field1818);
      byte[] var12 = var10.field1816;
      String var11 = class303.method1663(var12, 0, var12.length);
      String var13 = var11;

      try {
         URL var14 = new URL(Client.method479("services", false) + "m=accountappeal/login.ws");
         URLConnection var15 = var14.openConnection();
         var15.setDoInput(true);
         var15.setDoOutput(true);
         var15.setConnectTimeout(5000);
         OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
         String var18 = "data2=" + class115.method816(var13) + "&dest=";
         int var20 = "passwordchoice.ws".length();
         StringBuilder var21 = new StringBuilder(var20);

         for(int var22 = 0; var22 < var20; ++var22) {
            char var23 = "passwordchoice.ws".charAt(var22);
            if ((var23 < 'a' || var23 > 'z') && (var23 < 'A' || var23 > 'Z') && (var23 < '0' || var23 > '9') && var23 != '.' && var23 != '-' && var23 != '*' && var23 != '_') {
               if (var23 == ' ') {
                  var21.append('+');
               } else {
                  byte var24 = class162.method996(var23);
                  var21.append('%');
                  int var25 = var24 >> 4 & 15;
                  if (var25 >= 10) {
                     var21.append((char)(var25 + 55));
                  } else {
                     var21.append((char)(var25 + 48));
                  }

                  var25 = var24 & 15;
                  if (var25 >= 10) {
                     var21.append((char)(var25 + 55));
                  } else {
                     var21.append((char)(var25 + 48));
                  }
               }
            } else {
               var21.append(var23);
            }
         }

         String var19 = var21.toString();
         var16.write(var18 + var19);
         var16.flush();
         InputStream var27 = var15.getInputStream();
         var10 = new class184(new byte[1000]);

         do {
            int var28 = var27.read(var10.field1816, var10.field1818, 1000 - var10.field1818);
            if (var28 == -1) {
               var16.close();
               var27.close();
               String var29 = new String(var10.field1816);
               if (var29.startsWith("OFFLINE")) {
                  return 4;
               } else if (var29.startsWith("WRONG")) {
                  return 7;
               } else if (var29.startsWith("RELOAD")) {
                  return 3;
               } else if (var29.startsWith("Not permitted for social network accounts.")) {
                  return 6;
               } else {
                  var10.method1186(var7);

                  while(var10.field1818 > 0 && var10.field1816[var10.field1818 - 1] == 0) {
                     --var10.field1818;
                  }

                  var29 = new String(var10.field1816, 0, var10.field1818);
                  if (method1252(var29)) {
                     class352.method1812(var29, true, false);
                     return 2;
                  } else {
                     return 5;
                  }
               }
            }

            var10.field1818 += var28;
         } while(var10.field1818 < 1000);

         return 5;
      } catch (Throwable var26) {
         var26.printStackTrace();
         return 5;
      }
   }

   static boolean method1252(String var0) {
      if (null == var0) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var3) {
            return false;
         }
      }
   }
}
