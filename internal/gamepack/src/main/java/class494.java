import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class class494 extends class456 {
   HashSet field3949;
   HashSet field3950;
   List field3951;

   class494() {
   }

   void method2340(class366 var1, class366 var2, int var3, boolean var4) {
      this.method2117(var1, var3);
      int var6 = var2.method1703();
      this.field3949 = new HashSet(var6);

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         class282 var8 = new class282();

         try {
            var8.method1296(var2);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.field3949.add(var8);
      }

      var7 = var2.method1703();
      this.field3950 = new HashSet(var7);

      for(int var13 = 0; var13 < var7; ++var13) {
         class110 var9 = new class110();

         try {
            var9.method395(var2);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.field3950.add(var9);
      }

      this.method2339(var2, var4);
   }

   void method2339(class366 var1, boolean var2) {
      this.field3951 = new LinkedList();
      int var4 = var1.method1703();

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var1.method1702();
         class113 var7 = new class113(var1.method1658());
         boolean var8 = var1.method1654() == 1;
         if (var2 || !var8) {
            this.field3951.add(new class178((class113)null, var7, var6, (class260)null));
         }
      }

   }

   static void method2342(boolean var0) {
      if (!class530.field4182.method745() && !class530.field4182.method746() && !class530.field4182.method768((byte)116)) {
         class292.field1998 = class424.field3211;
         class292.field1996 = class424.field3212;
         class292.field1997 = class424.field3174;
         class292.method1316(2);
         if (var0) {
            class292.field2000 = "";
         }

         if (null == class292.field2007 || class292.field2007.length() <= 0) {
            if (class158.field1004.method521() != null) {
               class292.field2007 = class158.field1004.method521();
               Client.field1170 = true;
            } else {
               Client.field1170 = false;
            }
         }

         class292.method1322();
      } else {
         class292.method1316(10);
      }
   }

   static void method2341(boolean var0) {
      byte var2 = 0;
      boolean var3 = class158.field1004.method522() >= Client.field1121;
      if (!var3) {
         var2 = 12;
      } else if (class530.field4182.method745() || class530.field4182.method746() || class530.field4182.method768((byte)106)) {
         var2 = 10;
      }

      class292.method1316(var2);
      if (var0) {
         class292.field2007 = "";
         class292.field2000 = "";
         class182.field1457 = 0;
         class95.field666 = "";
      }

      if (null == class292.field2007 || class292.field2007.length() <= 0) {
         if (class158.field1004.method521() != null) {
            class292.field2007 = class158.field1004.method521();
            Client.field1170 = true;
         } else {
            Client.field1170 = false;
         }
      }

      if (Client.field1170 && class292.field2007 != null && class292.field2007.length() > 0) {
         class292.field2005 = 1;
      } else {
         class292.field2005 = 0;
      }

   }
}
