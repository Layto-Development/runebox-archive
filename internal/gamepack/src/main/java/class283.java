import java.util.ArrayList;
import java.util.Iterator;

public class class283 extends class306 {
   static class245 field1955 = new class245(128);
   class524[] field1964;
   int field1959;
   int field1961;
   int field1962;
   int field1963;
   int[] field1956;
   int[] field1957;
   String field1960;
   String[] field1958;

   class283() {
   }

   class524[] method1297(int var1) {
      return new class524[var1];
   }

   static class283 method1300(int var0) {
      class283 var2 = (class283)field1955.method1183((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class517.field4141.method2422(var0, 0);
         if (null == var3) {
            return null;
         } else {
            var2 = method1301(var3);
            field1955.method1182(var2, (long)var0);
            return var2;
         }
      }
   }

   static class283 method1303(int var0, int var1, int var2) {
      int var4 = (var1 << 8) + var0;
      class283 var6 = method1302(var4, var0);
      if (null != var6) {
         return var6;
      } else {
         int var7 = (-3 - var2 << 8) + var0;
         var6 = method1302(var7, var0);
         if (null != var6) {
            return var6;
         } else {
            int var8 = var0 + -512;
            var6 = method1302(var8, var0);
            return null != var6 ? var6 : null;
         }
      }
   }

   static class283 method1302(int var0, int var1) {
      class283 var3 = (class283)field1955.method1183((long)(var0 << 16));
      if (null != var3) {
         return var3;
      } else {
         String var4 = String.valueOf(var0);
         int var5 = class517.field4141.method2447(var4);
         if (var5 == -1) {
            return null;
         } else {
            byte[] var6 = class517.field4141.method2429(var5);
            if (null != var6) {
               if (var6.length <= 1) {
                  return null;
               }

               var3 = method1301(var6);
               if (var3 != null) {
                  field1955.method1182(var3, (long)(var0 << 16));
                  return var3;
               }
            }

            return null;
         }
      }
   }

   public static void method1299(int var0, int var1) {
      class469.method2212(var0, var1, 0, 0);
      class469.field3717.clear();
      class469.field3718.clear();
      if (class469.field3716.isEmpty() || var0 == 0 && var1 == 0) {
         class469.method2213();
      } else {
         class469.field3718.add(new class407((class450)null, class469.field3720));
         class469.field3718.add(new class63((class450)null, 0, false, class469.field3721));
         ArrayList var4 = new ArrayList();
         Iterator var5 = class469.field3716.iterator();

         while(var5.hasNext()) {
            class468 var6 = (class468)var5.next();
            var4.add(var6);
         }

         class469.field3718.add(new class99((class450)null, var4));
      }

   }

   static class283 method1301(byte[] var0) {
      class283 var2 = new class283();
      class366 var3 = new class366(var0);
      var3.field2652 = var3.field2650.length - 2;
      int var4 = var3.method1703();
      int var5 = var3.field2650.length - 2 - var4 - 12;
      var3.field2652 = var5;
      int var6 = var3.method1658();
      var2.field1959 = var3.method1703();
      var2.field1963 = var3.method1703();
      var2.field1961 = var3.method1703();
      var2.field1962 = var3.method1703();
      int var7 = var3.method1654();
      int var8;
      int var9;
      if (var7 > 0) {
         var2.field1964 = var2.method1297(var7);

         for(var8 = 0; var8 < var7; ++var8) {
            var9 = var3.method1703();
            class524 var10 = new class524(var9 > 0 ? class32.method143(var9) : 1);
            var2.field1964[var8] = var10;

            while(var9-- > 0) {
               int var11 = var3.method1658();
               int var12 = var3.method1658();
               var10.method2513(new class323(var12), (long)var11);
            }
         }
      }

      var3.field2652 = 0;
      var2.field1960 = var3.method1713();
      var2.field1956 = new int[var6];
      var2.field1957 = new int[var6];
      var2.field1958 = new String[var6];

      for(var8 = 0; var3.field2652 < var5; var2.field1956[var8++] = var9) {
         var9 = var3.method1703();
         if (var9 == 3) {
            var2.field1958[var8] = var3.method1662();
         } else if (var9 < 100 && var9 != 21 && var9 != 38 && var9 != 39) {
            var2.field1957[var8] = var3.method1658();
         } else {
            var2.field1957[var8] = var3.method1654();
         }
      }

      return var2;
   }

   static final void method1298(int var0) {
      Client.method936();
      switch (var0) {
         case 1:
            class292.method1331();
            break;
         case 2:
            class292.method1316(24);
            class292.method1328(class424.field3231, class424.field3232, class424.field3233);
      }

   }
}
