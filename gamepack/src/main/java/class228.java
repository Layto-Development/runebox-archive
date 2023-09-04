import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class228 {
   public static class298 field2100;
   public static class298 field2101;
   public static class298 field2104;
   public static int field2102 = 0;
   public static int field2109 = 0;
   public static int field2110 = 0;
   public static int field2111 = 0;
   public static ArrayList field2103 = null;
   public static ArrayList field2105 = new ArrayList(3);
   public static ArrayList field2106 = new ArrayList(3);
   public static ArrayList field2107 = new ArrayList();
   public static LinkedList field2112 = new LinkedList();
   public static final List field2108 = new ArrayList();

   class228() throws Throwable {
   }

   public static void method1380(class285 var0) {
      field2108.remove(var0);
   }

   public static void method1377(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (!var0.isEmpty()) {
         field2112.clear();
         field2107.clear();
         method1381(var5);
         class353.method1815(var0, var5);
         if (!field2112.isEmpty()) {
            method1383(var1, var2, var3, var4);
            field2107.add(new class209((class358)null));
            field2107.add(new class1((class358)null, field2100, field2101, field2104));
            ArrayList var7 = new ArrayList();
            var7.add(new class485(new class320((class358)null, 0, true, field2102)));
            if (!field2105.isEmpty()) {
               ArrayList var8 = new ArrayList();
               var8.add(new class524(new class20((class358)null, var7), field2111));
               ArrayList var10 = new ArrayList();
               Iterator var11 = field2105.iterator();

               while(var11.hasNext()) {
                  class131 var12 = (class131)var11.next();
                  var10.add(var12);
               }

               var8.add(new class524(new class394(new class252((class358)null, var10), 0, false, field2110), field2109));
               field2107.add(new class20((class358)null, var8));
            } else {
               field2107.add(new class524((class358)null, field2111));
               field2107.add(new class20((class358)null, var7));
            }

         }
      }
   }

   public static void method1378(int var0, int var1, int var2, int var3) {
      if (field2105.size() > 1 && field2105.get(0) != null && ((class131)field2105.get(0)).field1551.method2203() && field2105.get(1) != null && ((class131)field2105.get(1)).field1551.method2203()) {
         method1383(var0, var1, var2, var3);
         field2107.add(new class535((class358)null));
         ArrayList var5 = new ArrayList();
         var5.add(new class524(new class320((class358)null, 1, false, field2102), field2111));
         var5.add(new class524(new class394((class358)null, 0, false, field2110), field2109));
         field2107.add(new class20((class358)null, var5));
         if (field2106.get(0) != null && field2106.get(1) != null) {
            class131 var6 = (class131)field2106.get(0);
            field2106.set(0, field2105.get(1));
            field2106.set(1, var6);
         }
      }

   }

   public static boolean method1379(int var0) {
      if (field2106.isEmpty()) {
         return false;
      } else {
         class131 var2 = (class131)field2106.get(0);
         return var2 != null && var0 == var2.field1545;
      }
   }

   public static boolean method1382() {
      boolean var1 = false;
      boolean var2 = false;
      if (!field2107.isEmpty()) {
         class358 var3 = (class358)field2107.get(0);
         if (var3 == null) {
            field2107.remove(0);
         } else if (var3.method1831()) {
            if (var3.method1832()) {
               System.out.println("Error in midimanager.service: " + var3.method1830());
               var1 = true;
            } else {
               if (var3.method1833() != null) {
                  field2107.add(1, var3.method1833());
               }

               var2 = var3.method1835();
            }

            field2107.remove(0);
         } else {
            var2 = var3.method1835();
         }
      }

      if (var1) {
         field2107.clear();
         method1384();
      }

      return var2;
   }

   public static void method1383(int var0, int var1, int var2, int var3) {
      field2109 = var0;
      field2110 = var1;
      field2111 = var2;
      field2102 = var3;
   }

   static void method1384() {
      Iterator var1 = field2105.iterator();

      while(true) {
         class131 var2;
         do {
            if (!var1.hasNext()) {
               field2105.clear();
               return;
            }

            var2 = (class131)var1.next();
         } while(null == var2);

         var2.field1551.method2207();
         var2.field1551.method2205();
         var2.field1551.method2175(0);
         var2.field1551.field3433 = 0;
         int var3 = var2.field1545;
         int var4 = var2.field1546;
         Iterator var5 = field2108.iterator();

         while(var5.hasNext()) {
            class285 var6 = (class285)var5.next();
            var6.method1598(var3, var4);
         }
      }
   }

   static void method1381(boolean var0) {
      if (var0) {
         method1384();
      } else {
         for(int var2 = 0; var2 < field2105.size(); ++var2) {
            class131 var3 = (class131)field2105.get(var2);
            if (var3 == null) {
               field2105.remove(var2);
               --var2;
            } else if (var3.field1553) {
               if (var3.field1551.field3433 > 0) {
                  --var3.field1551.field3433;
               }

               var3.field1551.method2207();
               var3.field1551.method2205();
               var3.field1551.method2175(0);
               field2105.remove(var2);
               --var2;
            } else {
               var3.field1553 = true;
            }
         }
      }

   }
}
