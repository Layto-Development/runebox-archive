import java.util.ArrayList;
import java.util.Iterator;

public class class106 extends class151 {
   static class364 field1420 = new class364(128);
   class197[] field1429;
   int field1424;
   int field1426;
   int field1427;
   int field1428;
   int[] field1421;
   int[] field1422;
   String field1425;
   String[] field1423;

   class106() {
   }

   class197[] method790(int var1) {
      return new class197[var1];
   }

   static class106 method793(int var0) {
      class106 var2 = (class106)field1420.method1851((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class177.field1799.method1629(var0, 0);
         if (null == var3) {
            return null;
         } else {
            var2 = method794(var3);
            field1420.method1850(var2, (long)var0);
            return var2;
         }
      }
   }

   static class106 method796(int var0, int var1, int var2) {
      int var4 = (var1 << 8) + var0;
      class106 var6 = method795(var4, var0);
      if (null != var6) {
         return var6;
      } else {
         int var7 = (-3 - var2 << 8) + var0;
         var6 = method795(var7, var0);
         if (null != var6) {
            return var6;
         } else {
            int var8 = var0 + -512;
            var6 = method795(var8, var0);
            return null != var6 ? var6 : null;
         }
      }
   }

   static class106 method795(int var0, int var1) {
      class106 var3 = (class106)field1420.method1851((long)(var0 << 16));
      if (null != var3) {
         return var3;
      } else {
         String var4 = String.valueOf(var0);
         int var5 = class177.field1799.method1654(var4);
         if (var5 == -1) {
            return null;
         } else {
            byte[] var6 = class177.field1799.method1636(var5);
            if (null != var6) {
               if (var6.length <= 1) {
                  return null;
               }

               var3 = method794(var6);
               if (var3 != null) {
                  field1420.method1850(var3, (long)(var0 << 16));
                  return var3;
               }
            }

            return null;
         }
      }
   }

   public static void method792(int var0, int var1) {
      class228.method1383(var0, var1, 0, 0);
      class228.field2106.clear();
      class228.field2107.clear();
      if (class228.field2105.isEmpty() || var0 == 0 && var1 == 0) {
         class228.method1384();
      } else {
         class228.field2107.add(new class524((class358)null, class228.field2109));
         class228.field2107.add(new class394((class358)null, 0, false, class228.field2110));
         ArrayList var4 = new ArrayList();
         Iterator var5 = class228.field2105.iterator();

         while(var5.hasNext()) {
            class131 var6 = (class131)var5.next();
            var4.add(var6);
         }

         class228.field2107.add(new class252((class358)null, var4));
      }

   }

   static class106 method794(byte[] var0) {
      class106 var2 = new class106();
      class184 var3 = new class184(var0);
      var3.field1818 = var3.field1816.length - 2;
      int var4 = var3.method1174();
      int var5 = var3.field1816.length - 2 - var4 - 12;
      var3.field1818 = var5;
      int var6 = var3.method1129();
      var2.field1424 = var3.method1174();
      var2.field1428 = var3.method1174();
      var2.field1426 = var3.method1174();
      var2.field1427 = var3.method1174();
      int var7 = var3.method1125();
      int var8;
      int var9;
      if (var7 > 0) {
         var2.field1429 = var2.method790(var7);

         for(var8 = 0; var8 < var7; ++var8) {
            var9 = var3.method1174();
            class197 var10 = new class197(var9 > 0 ? class349.method1808(var9) : 1);
            var2.field1429[var8] = var10;

            while(var9-- > 0) {
               int var11 = var3.method1129();
               int var12 = var3.method1129();
               var10.method1226(new class118(var12), (long)var11);
            }
         }
      }

      var3.field1818 = 0;
      var2.field1425 = var3.method1184();
      var2.field1421 = new int[var6];
      var2.field1422 = new int[var6];
      var2.field1423 = new String[var6];

      for(var8 = 0; var3.field1818 < var5; var2.field1421[var8++] = var9) {
         var9 = var3.method1174();
         if (var9 == 3) {
            var2.field1423[var8] = var3.method1133();
         } else if (var9 < 100 && var9 != 21 && var9 != 38 && var9 != 39) {
            var2.field1422[var8] = var3.method1129();
         } else {
            var2.field1422[var8] = var3.method1125();
         }
      }

      return var2;
   }

   static final void method791(int var0) {
      Client.method552();
      switch (var0) {
         case 1:
            class534.method2558();
            break;
         case 2:
            class534.method2543(24);
            class534.method2555(class27.field464, class27.field465, class27.field466);
      }

   }
}
