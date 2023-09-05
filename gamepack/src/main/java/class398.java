public class class398 {
   static int field3104;
   static int field3105;
   static int[] field3103;

   class398() throws Throwable {
   }

   public static class425[] method1920(class298 var0, int var1, int var2) {
      return !method1922(var0, var1, var2) ? null : method1921();
   }

   public static class427[] method1931(class298 var0, int var1, int var2) {
      return !method1922(var0, var1, var2) ? null : method1930();
   }

   public static class460 method1929(class298 var0, class298 var1, int var2, int var3) {
      return !method1922(var0, var2, var3) ? null : method1927(var1.method1629(var2, var3));
   }

   public static class425[] method1928(class298 var0, String var1, String var2) {
      if (!var0.method1651(var1, var2)) {
         return null;
      } else {
         int var4 = var0.method1654(var1);
         int var5 = var0.method1646(var4, var2);
         return method1920(var0, var4, var5);
      }
   }

   public static class425 method1926(class298 var0, String var1, String var2) {
      if (!var0.method1651(var1, var2)) {
         return null;
      } else {
         int var4 = var0.method1654(var1);
         int var5 = var0.method1646(var4, var2);
         class425 var6;
         if (!method1922(var0, var4, var5)) {
            var6 = null;
         } else {
            var6 = method1932();
         }

         return var6;
      }
   }

   public static class427[] method1919(class298 var0, String var1, String var2) {
      if (!var0.method1651(var1, var2)) {
         return null;
      } else {
         int var4 = var0.method1654(var1);
         int var5 = var0.method1646(var4, var2);
         return method1931(var0, var4, var5);
      }
   }

   static class425[] method1921() {
      class425[] var1 = new class425[field3104];

      for(int var2 = 0; var2 < field3104; ++var2) {
         class425 var3 = var1[var2] = new class425();
         var3.field3221 = field3105;
         var3.field3226 = class202.field1936;
         var3.field3220 = field3103[var2];
         var3.field3225 = class465.field3601[var2];
         var3.field3222 = class103.field1343[var2];
         var3.field3223 = class288.field2445[var2];
         var3.field3227 = class150.field1622;
         var3.field3224 = class89.field1276[var2];
      }

      field3103 = null;
      class465.field3601 = null;
      class103.field1343 = null;
      class288.field2445 = null;
      class150.field1622 = null;
      class89.field1276 = (byte[][])null;
      return var1;
   }

   public static class425 method1932() {
      class425 var1 = new class425();
      var1.field3221 = field3105;
      var1.field3226 = class202.field1936;
      var1.field3220 = field3103[0];
      var1.field3225 = class465.field3601[0];
      var1.field3222 = class103.field1343[0];
      var1.field3223 = class288.field2445[0];
      var1.field3227 = class150.field1622;
      var1.field3224 = class89.field1276[0];
      field3103 = null;
      class465.field3601 = null;
      class103.field1343 = null;
      class288.field2445 = null;
      class150.field1622 = null;
      class89.field1276 = (byte[][])null;
      return var1;
   }

   static class427[] method1930() {
      class427[] var1 = new class427[field3104];

      for(int var2 = 0; var2 < field3104; ++var2) {
         class427 var3 = var1[var2] = new class427();
         var3.field3234 = field3105;
         var3.field3235 = class202.field1936;
         var3.field3231 = field3103[var2];
         var3.field3232 = class465.field3601[var2];
         var3.field3237 = class103.field1343[var2];
         var3.field3233 = class288.field2445[var2];
         int var4 = var3.field3237 * var3.field3233;
         byte[] var5 = class89.field1276[var2];
         var3.field3236 = new int[var4];

         for(int var6 = 0; var6 < var4; ++var6) {
            var3.field3236[var6] = class150.field1622[var5[var6] & 255];
         }
      }

      field3103 = null;
      class465.field3601 = null;
      class103.field1343 = null;
      class288.field2445 = null;
      class150.field1622 = null;
      class89.field1276 = (byte[][])null;
      return var1;
   }

   static class427 method1924() {
      class427 var1 = new class427();
      var1.field3234 = field3105;
      var1.field3235 = class202.field1936;
      var1.field3231 = field3103[0];
      var1.field3232 = class465.field3601[0];
      var1.field3237 = class103.field1343[0];
      var1.field3233 = class288.field2445[0];
      int var2 = var1.field3233 * var1.field3237;
      byte[] var3 = class89.field1276[0];
      var1.field3236 = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var1.field3236[var4] = class150.field1622[var3[var4] & 255];
      }

      field3103 = null;
      class465.field3601 = null;
      class103.field1343 = null;
      class288.field2445 = null;
      class150.field1622 = null;
      class89.field1276 = (byte[][])null;
      return var1;
   }

   static class460 method1927(byte[] var0) {
      if (null == var0) {
         return null;
      } else {
         class460 var2 = new class460(var0, field3103, class465.field3601, class103.field1343, class288.field2445, class150.field1622, class89.field1276);
         field3103 = null;
         class465.field3601 = null;
         class103.field1343 = null;
         class288.field2445 = null;
         class150.field1622 = null;
         class89.field1276 = (byte[][])null;
         return var2;
      }
   }

   static boolean method1922(class298 var0, int var1, int var2) {
      byte[] var4 = var0.method1629(var1, var2);
      if (null == var4) {
         return false;
      } else {
         method1925(var4);
         return true;
      }
   }

   public static boolean method1923(class298 var0, int var1) {
      byte[] var3 = var0.method1636(var1);
      if (null == var3) {
         return false;
      } else {
         method1925(var3);
         return true;
      }
   }

   static void method1925(byte[] var0) {
      class184 var2 = new class184(var0);
      var2.field1818 = var0.length - 2;
      field3104 = var2.method1174();
      field3103 = new int[field3104];
      class465.field3601 = new int[field3104];
      class103.field1343 = new int[field3104];
      class288.field2445 = new int[field3104];
      class89.field1276 = new byte[field3104][];
      var2.field1818 = var0.length - 7 - field3104 * 8;
      field3105 = var2.method1174();
      class202.field1936 = var2.method1174();
      int var3 = (var2.readUnsignedByte() & 255) + 1;

      int var4;
      for(var4 = 0; var4 < field3104; ++var4) {
         field3103[var4] = var2.method1174();
      }

      for(var4 = 0; var4 < field3104; ++var4) {
         class465.field3601[var4] = var2.method1174();
      }

      for(var4 = 0; var4 < field3104; ++var4) {
         class103.field1343[var4] = var2.method1174();
      }

      for(var4 = 0; var4 < field3104; ++var4) {
         class288.field2445[var4] = var2.method1174();
      }

      var2.field1818 = var0.length - 7 - field3104 * 8 - (var3 - 1) * 3;
      class150.field1622 = new int[var3];

      for(var4 = 1; var4 < var3; ++var4) {
         class150.field1622[var4] = var2.method1181();
         if (class150.field1622[var4] == 0) {
            class150.field1622[var4] = 1;
         }
      }

      var2.field1818 = 0;

      for(var4 = 0; var4 < field3104; ++var4) {
         int var5 = class103.field1343[var4];
         int var6 = class288.field2445[var4];
         int var7 = var5 * var6;
         byte[] var8 = new byte[var7];
         class89.field1276[var4] = var8;
         int var9 = var2.readUnsignedByte();
         int var10;
         if (var9 == 0) {
            for(var10 = 0; var10 < var7; ++var10) {
               var8[var10] = var2.method1126();
            }
         } else if (var9 == 1) {
            for(var10 = 0; var10 < var5; ++var10) {
               for(int var11 = 0; var11 < var6; ++var11) {
                  var8[var10 + var5 * var11] = var2.method1126();
               }
            }
         }
      }

   }
}
