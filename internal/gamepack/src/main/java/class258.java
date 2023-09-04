import java.util.Iterator;

public class class258 {
   int field2271 = 0;
   final class246 field2270;
   public final class215 field2273;
   public final class397 field2272;

   class258(class246 var1) {
      this.field2270 = var1;
      this.field2273 = new class215(var1);
      this.field2272 = new class397(var1);
   }

   boolean method1477() {
      return this.field2271 == 2;
   }

   final void method1478() {
      this.field2271 = 1;
   }

   final void method1489(class184 var1, int var2) {
      this.field2273.method1312(var1, var2, (byte)-1);
      this.field2271 = 2;

      for(int var4 = 0; var4 < class190.field1866; ++var4) {
         class522 var5 = Client.field749[class190.field1867[var4]];
         var5.method2478();
      }

      Iterator var7 = class194.field1888.iterator();

      while(var7.hasNext()) {
         class461 var6 = (class461)var7.next();
         var6.method2253();
      }

      if (class59.field1089 != null) {
         class59.field1089.method234();
      }

   }

   final void method1479() {
      for(class105 var2 = (class105)this.field2273.field2015.method1614(); var2 != null; var2 = (class105)this.field2273.field2015.method1613()) {
         if ((long)var2.field1419 < class80.method713() / 1000L - 5L) {
            if (var2.field1417 > 0) {
               class194.method1209(5, "", var2.field1416 + class27.field395);
            }

            if (var2.field1417 == 0) {
               class194.method1209(5, "", var2.field1416 + class27.field289);
            }

            var2.method824();
         }
      }

   }

   final void method1480() {
      this.field2271 = 0;
      this.field2273.method2037();
      this.field2272.method2037();
   }

   final boolean method1481(class251 var1, boolean var2) {
      if (null == var1) {
         return false;
      } else if (var1.equals(class259.field2281.field4112)) {
         return true;
      } else {
         return this.field2273.method1311(var1, var2);
      }
   }

   final boolean method1482(class251 var1) {
      if (null == var1) {
         return false;
      } else {
         return this.field2272.method2053(var1);
      }
   }

   final void method1483(String var1) {
      if (var1 != null) {
         class251 var3 = new class251(var1, this.field2270);
         if (var3.method1459()) {
            if (this.method1484()) {
               method1493(class27.field414);
            } else if (class259.field2281.field4112.equals(var3)) {
               method1495();
            } else if (this.method1481(var3, false)) {
               method1496(var1);
            } else if (this.method1482(var3)) {
               method1493(class27.field420 + var1 + class27.field421);
            } else {
               method1492(var1);
            }
         }
      }
   }

   final boolean method1484() {
      return this.field2273.method2038() || this.field2273.method2058() >= 200 && Client.field705 != 1;
   }

   final void method1485(String var1) {
      if (null != var1) {
         class251 var3 = new class251(var1, this.field2270);
         if (var3.method1459()) {
            if (this.method1488()) {
               method1493(class27.field416);
            } else if (class259.field2281.field4112.equals(var3)) {
               method1497();
            } else if (this.method1482(var3)) {
               method1491(var1);
            } else if (this.method1481(var3, false)) {
               method1493(class27.field234 + var1 + class27.field393);
            } else {
               class335 var4 = class335.method1773(class46.field986, Client.field641.field2758);
               var4.field2686.method1114(class184.method1188(var1));
               var4.field2686.method1117(var1);
               Client.field641.method1797(var4);
            }
         }
      }
   }

   final boolean method1488() {
      return this.field2272.method2038() || this.field2272.method2058() >= 100 && Client.field705 != 1;
   }

   final void method1486(String var1) {
      if (null != var1) {
         class251 var3 = new class251(var1, this.field2270);
         if (var3.method1459()) {
            if (this.field2273.method2056(var3)) {
               Client.method452();
               class335 var4 = class335.method1773(class46.field966, Client.field641.field2758);
               var4.field2686.method1114(class184.method1188(var1));
               var4.field2686.method1117(var1);
               Client.field641.method1797(var4);
            }

            for(int var6 = 0; var6 < class190.field1866; ++var6) {
               class522 var5 = Client.field749[class190.field1867[var6]];
               var5.method2478();
            }

            Iterator var7 = class194.field1888.iterator();

            while(var7.hasNext()) {
               class461 var8 = (class461)var7.next();
               var8.method2253();
            }

            if (null != class59.field1089) {
               class59.field1089.method234();
            }

         }
      }
   }

   public final void method1487(String var1, boolean var2) {
      if (null != var1) {
         class251 var4 = new class251(var1, this.field2270);
         if (var4.method1459()) {
            if (this.field2272.method2056(var4)) {
               Client.method452();
               if (var2) {
                  class335 var5 = class335.method1773(class46.field988, Client.field641.field2758);
                  var5.field2686.method1114(class184.method1188(var1));
                  var5.field2686.method1117(var1);
                  Client.field641.method1797(var5);
               }
            }

            Client.method544();
         }
      }
   }

   final boolean method1490(class251 var1) {
      class446 var3 = (class446)this.field2273.method2039(var1);
      return null != var3 && var3.method1985();
   }

   static final void method1493(String var0) {
      class194.method1209(30, "", var0);
   }

   static final void method1496(String var0) {
      method1493(var0 + class27.field236);
   }

   static final void method1495() {
      method1493(class27.field418);
   }

   static final void method1492(String var0) {
      class335 var2 = class335.method1773(class46.field938, Client.field641.field2758);
      var2.field2686.method1114(class184.method1188(var0));
      var2.field2686.method1117(var0);
      Client.field641.method1797(var2);
   }

   static final void method1491(String var0) {
      method1493(var0 + class27.field417);
   }

   static final void method1497() {
      method1493(class27.field419);
   }

   static final void method1494(String var0, int var1) {
      class335 var3 = class335.method1773(class46.field1005, Client.field641.field2758);
      var3.field2686.method1114(class184.method1188(var0) + 1);
      var3.field2686.method1114(var1);
      var3.field2686.method1117(var0);
      Client.field641.method1797(var3);
   }
}
