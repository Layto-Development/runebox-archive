import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class469 {
   public static class509 field3711;
   public static class509 field3712;
   public static class509 field3715;
   public static int field3713 = 0;
   public static int field3720 = 0;
   public static int field3721 = 0;
   public static int field3722 = 0;
   public static ArrayList field3714 = null;
   public static ArrayList field3716 = new ArrayList(3);
   public static ArrayList field3717 = new ArrayList(3);
   public static ArrayList field3718 = new ArrayList();
   public static LinkedList field3723 = new LinkedList();
   public static final List field3719 = new ArrayList();

   class469() throws Throwable {
   }

   public static void method2209(class122 var0) {
      field3719.remove(var0);
   }

   public static void method2206(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (!var0.isEmpty()) {
         field3723.clear();
         field3718.clear();
         method2210(var5);
         class37.method157(var0, var5);
         if (!field3723.isEmpty()) {
            method2212(var1, var2, var3, var4);
            field3718.add(new class432((class450)null));
            field3718.add(new class19((class450)null, field3711, field3712, field3715));
            ArrayList var7 = new ArrayList();
            var7.add(new class287(new class155((class450)null, 0, true, field3713)));
            if (!field3716.isEmpty()) {
               ArrayList var8 = new ArrayList();
               var8.add(new class407(new class452((class450)null, var7), field3722));
               ArrayList var10 = new ArrayList();
               Iterator var11 = field3716.iterator();

               while(var11.hasNext()) {
                  class468 var12 = (class468)var11.next();
                  var10.add(var12);
               }

               var8.add(new class407(new class63(new class99((class450)null, var10), 0, false, field3721), field3720));
               field3718.add(new class452((class450)null, var8));
            } else {
               field3718.add(new class407((class450)null, field3722));
               field3718.add(new class452((class450)null, var7));
            }

         }
      }
   }

   public static void method2207(int var0, int var1, int var2, int var3) {
      if (field3716.size() > 1 && field3716.get(0) != null && ((class468)field3716.get(0)).field3705.method42() && field3716.get(1) != null && ((class468)field3716.get(1)).field3705.method42()) {
         method2212(var0, var1, var2, var3);
         field3718.add(new class320((class450)null));
         ArrayList var5 = new ArrayList();
         var5.add(new class407(new class155((class450)null, 1, false, field3713), field3722));
         var5.add(new class407(new class63((class450)null, 0, false, field3721), field3720));
         field3718.add(new class452((class450)null, var5));
         if (field3717.get(0) != null && field3717.get(1) != null) {
            class468 var6 = (class468)field3717.get(0);
            field3717.set(0, field3716.get(1));
            field3717.set(1, var6);
         }
      }

   }

   public static boolean method2208(int var0) {
      if (field3717.isEmpty()) {
         return false;
      } else {
         class468 var2 = (class468)field3717.get(0);
         return var2 != null && var0 == var2.field3699;
      }
   }

   public static boolean method2211() {
      boolean var1 = false;
      boolean var2 = false;
      if (!field3718.isEmpty()) {
         class450 var3 = (class450)field3718.get(0);
         if (var3 == null) {
            field3718.remove(0);
         } else if (var3.method2101()) {
            if (var3.method2102()) {
               System.out.println("Error in midimanager.service: " + var3.method2100());
               var1 = true;
            } else {
               if (var3.method2103() != null) {
                  field3718.add(1, var3.method2103());
               }

               var2 = var3.method2105();
            }

            field3718.remove(0);
         } else {
            var2 = var3.method2105();
         }
      }

      if (var1) {
         field3718.clear();
         method2213();
      }

      return var2;
   }

   public static void method2212(int var0, int var1, int var2, int var3) {
      field3720 = var0;
      field3721 = var1;
      field3722 = var2;
      field3713 = var3;
   }

   static void method2213() {
      Iterator var1 = field3716.iterator();

      while(true) {
         class468 var2;
         do {
            if (!var1.hasNext()) {
               field3716.clear();
               return;
            }

            var2 = (class468)var1.next();
         } while(null == var2);

         var2.field3705.method47();
         var2.field3705.method45();
         var2.field3705.method10(0);
         var2.field3705.field41 = 0;
         int var3 = var2.field3699;
         int var4 = var2.field3700;
         Iterator var5 = field3719.iterator();

         while(var5.hasNext()) {
            class122 var6 = (class122)var5.next();
            var6.method470(var3, var4);
         }
      }
   }

   static void method2210(boolean var0) {
      if (var0) {
         method2213();
      } else {
         for(int var2 = 0; var2 < field3716.size(); ++var2) {
            class468 var3 = (class468)field3716.get(var2);
            if (var3 == null) {
               field3716.remove(var2);
               --var2;
            } else if (var3.field3707) {
               if (var3.field3705.field41 > 0) {
                  --var3.field3705.field41;
               }

               var3.field3705.method47();
               var3.field3705.method45();
               var3.field3705.method10(0);
               field3716.remove(var2);
               --var2;
            } else {
               var3.field3707 = true;
            }
         }
      }

   }
}
