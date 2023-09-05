import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class class268 extends class475 {
   HashSet field2303;
   HashSet field2304;
   List field2305;

   class268() {
   }

   void method1513(class184 var1, class184 var2, int var3, boolean var4) {
      this.method2292(var1, var3);
      int var6 = var2.method1174();
      this.field2303 = new HashSet(var6);

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         class430 var8 = new class430();

         try {
            var8.method2071(var2);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.field2303.add(var8);
      }

      var7 = var2.method1174();
      this.field2304 = new HashSet(var7);

      for(int var13 = 0; var13 < var7; ++var13) {
         class198 var9 = new class198();

         try {
            var9.method1227(var2);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.field2304.add(var9);
      }

      this.method1512(var2, var4);
   }

   void method1512(class184 var1, boolean var2) {
      this.field2305 = new LinkedList();
      int var4 = var1.method1174();

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var1.method1173();
         class89 var7 = new class89(var1.readInt());
         boolean var8 = var1.readUnsignedByte() == 1;
         if (var2 || !var8) {
            this.field2305.add(new class108((class89)null, var7, var6, (class174)null));
         }
      }

   }

   static void method1515(boolean var0) {
      if (!class191.field1877.method360() && !class191.field1877.method361() && !class191.field1877.method383((byte)116)) {
         class534.field4234 = class27.field444;
         class534.field4232 = class27.field445;
         class534.field4233 = class27.field407;
         class534.method2543(2);
         if (var0) {
            class534.field4236 = "";
         }

         if (null == class534.field4243 || class534.field4243.length() <= 0) {
            if (class4.field36.method2417() != null) {
               class534.field4243 = class4.field36.method2417();
               Client.field630 = true;
            } else {
               Client.field630 = false;
            }
         }

         class534.method2549();
      } else {
         class534.method2543(10);
      }
   }

   static void method1514(boolean var0) {
      byte var2 = 0;
      boolean var3 = class4.field36.method2418() >= Client.field581;
      if (!var3) {
         var2 = 12;
      } else if (class191.field1877.method360() || class191.field1877.method361() || class191.field1877.method383((byte)106)) {
         var2 = 10;
      }

      class534.method2543(var2);
      if (var0) {
         class534.field4243 = "";
         class534.field4236 = "";
         class13.field117 = 0;
         class470.field3619 = "";
      }

      if (null == class534.field4243 || class534.field4243.length() <= 0) {
         if (class4.field36.method2417() != null) {
            class534.field4243 = class4.field36.method2417();
            Client.field630 = true;
         } else {
            Client.field630 = false;
         }
      }

      if (Client.field630 && class534.field4243 != null && class534.field4243.length() > 0) {
         class534.field4241 = 1;
      } else {
         class534.field4241 = 0;
      }

   }
}
