public class class382 {
   static int field2706;
   static int field2707;
   static int[] field2705;

   class382() throws Throwable {
   }

   public static class501[] method1760(class509 var0, int var1, int var2) {
      return !method1762(var0, var1, var2) ? null : method1761();
   }

   public static class296[] method1771(class509 var0, int var1, int var2) {
      return !method1762(var0, var1, var2) ? null : method1770();
   }

   public static class396 method1769(class509 var0, class509 var1, int var2, int var3) {
      return !method1762(var0, var2, var3) ? null : method1767(var1.method2422(var2, var3));
   }

   public static class501[] method1768(class509 var0, String var1, String var2) {
      if (!var0.method2444(var1, var2)) {
         return null;
      } else {
         int var4 = var0.method2447(var1);
         int var5 = var0.method2439(var4, var2);
         return method1760(var0, var4, var5);
      }
   }

   public static class501 method1766(class509 var0, String var1, String var2) {
      if (!var0.method2444(var1, var2)) {
         return null;
      } else {
         int var4 = var0.method2447(var1);
         int var5 = var0.method2439(var4, var2);
         class501 var6;
         if (!method1762(var0, var4, var5)) {
            var6 = null;
         } else {
            var6 = method1772();
         }

         return var6;
      }
   }

   public static class296[] method1759(class509 var0, String var1, String var2) {
      if (!var0.method2444(var1, var2)) {
         return null;
      } else {
         int var4 = var0.method2447(var1);
         int var5 = var0.method2439(var4, var2);
         return method1771(var0, var4, var5);
      }
   }

   static class501[] method1761() {
      class501[] var1 = new class501[field2706];

      for(int var2 = 0; var2 < field2706; ++var2) {
         class501 var3 = var1[var2] = new class501();
         var3.field4004 = field2707;
         var3.field4009 = class33.field305;
         var3.field4003 = field2705[var2];
         var3.field4008 = class2.field2[var2];
         var3.field4005 = class174.field1425[var2];
         var3.field4006 = class536.field4273[var2];
         var3.field4010 = class449.field3552;
         var3.field4007 = class113.field729[var2];
      }

      field2705 = null;
      class2.field2 = null;
      class174.field1425 = null;
      class536.field4273 = null;
      class449.field3552 = null;
      class113.field729 = (byte[][])null;
      return var1;
   }

   public static class501 method1772() {
      class501 var1 = new class501();
      var1.field4004 = field2707;
      var1.field4009 = class33.field305;
      var1.field4003 = field2705[0];
      var1.field4008 = class2.field2[0];
      var1.field4005 = class174.field1425[0];
      var1.field4006 = class536.field4273[0];
      var1.field4010 = class449.field3552;
      var1.field4007 = class113.field729[0];
      field2705 = null;
      class2.field2 = null;
      class174.field1425 = null;
      class536.field4273 = null;
      class449.field3552 = null;
      class113.field729 = (byte[][])null;
      return var1;
   }

   static class296[] method1770() {
      class296[] var1 = new class296[field2706];

      for(int var2 = 0; var2 < field2706; ++var2) {
         class296 var3 = var1[var2] = new class296();
         var3.field2029 = field2707;
         var3.field2030 = class33.field305;
         var3.field2026 = field2705[var2];
         var3.field2027 = class2.field2[var2];
         var3.field2032 = class174.field1425[var2];
         var3.field2028 = class536.field4273[var2];
         int var4 = var3.field2032 * var3.field2028;
         byte[] var5 = class113.field729[var2];
         var3.field2031 = new int[var4];

         for(int var6 = 0; var6 < var4; ++var6) {
            var3.field2031[var6] = class449.field3552[var5[var6] & 255];
         }
      }

      field2705 = null;
      class2.field2 = null;
      class174.field1425 = null;
      class536.field4273 = null;
      class449.field3552 = null;
      class113.field729 = (byte[][])null;
      return var1;
   }

   static class296 method1764() {
      class296 var1 = new class296();
      var1.field2029 = field2707;
      var1.field2030 = class33.field305;
      var1.field2026 = field2705[0];
      var1.field2027 = class2.field2[0];
      var1.field2032 = class174.field1425[0];
      var1.field2028 = class536.field4273[0];
      int var2 = var1.field2028 * var1.field2032;
      byte[] var3 = class113.field729[0];
      var1.field2031 = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var1.field2031[var4] = class449.field3552[var3[var4] & 255];
      }

      field2705 = null;
      class2.field2 = null;
      class174.field1425 = null;
      class536.field4273 = null;
      class449.field3552 = null;
      class113.field729 = (byte[][])null;
      return var1;
   }

   static class396 method1767(byte[] var0) {
      if (null == var0) {
         return null;
      } else {
         class396 var2 = new class396(var0, field2705, class2.field2, class174.field1425, class536.field4273, class449.field3552, class113.field729);
         field2705 = null;
         class2.field2 = null;
         class174.field1425 = null;
         class536.field4273 = null;
         class449.field3552 = null;
         class113.field729 = (byte[][])null;
         return var2;
      }
   }

   static boolean method1762(class509 var0, int var1, int var2) {
      byte[] var4 = var0.method2422(var1, var2);
      if (null == var4) {
         return false;
      } else {
         method1765(var4);
         return true;
      }
   }

   public static boolean method1763(class509 var0, int var1) {
      byte[] var3 = var0.method2429(var1);
      if (null == var3) {
         return false;
      } else {
         method1765(var3);
         return true;
      }
   }

   static void method1765(byte[] var0) {
      class366 var2 = new class366(var0);
      var2.field2652 = var0.length - 2;
      field2706 = var2.method1703();
      field2705 = new int[field2706];
      class2.field2 = new int[field2706];
      class174.field1425 = new int[field2706];
      class536.field4273 = new int[field2706];
      class113.field729 = new byte[field2706][];
      var2.field2652 = var0.length - 7 - field2706 * 8;
      field2707 = var2.method1703();
      class33.field305 = var2.method1703();
      int var3 = (var2.method1654() & 255) + 1;

      int var4;
      for(var4 = 0; var4 < field2706; ++var4) {
         field2705[var4] = var2.method1703();
      }

      for(var4 = 0; var4 < field2706; ++var4) {
         class2.field2[var4] = var2.method1703();
      }

      for(var4 = 0; var4 < field2706; ++var4) {
         class174.field1425[var4] = var2.method1703();
      }

      for(var4 = 0; var4 < field2706; ++var4) {
         class536.field4273[var4] = var2.method1703();
      }

      var2.field2652 = var0.length - 7 - field2706 * 8 - (var3 - 1) * 3;
      class449.field3552 = new int[var3];

      for(var4 = 1; var4 < var3; ++var4) {
         class449.field3552[var4] = var2.method1710();
         if (0 == class449.field3552[var4]) {
            class449.field3552[var4] = 1;
         }
      }

      var2.field2652 = 0;

      for(var4 = 0; var4 < field2706; ++var4) {
         int var5 = class174.field1425[var4];
         int var6 = class536.field4273[var4];
         int var7 = var5 * var6;
         byte[] var8 = new byte[var7];
         class113.field729[var4] = var8;
         int var9 = var2.method1654();
         int var10;
         if (var9 == 0) {
            for(var10 = 0; var10 < var7; ++var10) {
               var8[var10] = var2.method1655();
            }
         } else if (var9 == 1) {
            for(var10 = 0; var10 < var5; ++var10) {
               for(int var11 = 0; var11 < var6; ++var11) {
                  var8[var10 + var5 * var11] = var2.method1655();
               }
            }
         }
      }

   }
}
