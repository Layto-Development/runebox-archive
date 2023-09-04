import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class class142 {
   boolean field882 = false;
   boolean field885 = false;
   boolean field890;
   boolean field891;
   double field886 = 0.8;
   int field881 = 127;
   int field883;
   int field887 = -1;
   int field888 = 127;
   int field889 = 127;
   int field892 = 1;
   String field884 = null;
   final Map field893 = new LinkedHashMap();

   class142() {
      this.method506(true);
   }

   class142(class366 var1) {
      if (var1 != null && var1.field2650 != null) {
         int var2 = var1.method1654();
         if (var2 >= 0 && var2 <= 10) {
            if (var1.method1654() == 1) {
               this.field891 = true;
            }

            if (var2 > 1) {
               this.field890 = var1.method1654() == 1;
            }

            if (var2 > 3) {
               this.field892 = var1.method1654();
            }

            if (var2 > 2) {
               int var3 = var1.method1654();

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.method1658();
                  int var6 = var1.method1658();
                  this.field893.put(var5, var6);
               }
            }

            if (var2 > 4) {
               this.field884 = var1.method1713();
            }

            if (var2 > 5) {
               this.field882 = var1.method1661();
            }

            if (var2 > 6) {
               this.field886 = (double)var1.method1654() / 100.0;
               this.field881 = var1.method1654();
               this.field888 = var1.method1654();
               this.field889 = var1.method1654();
            }

            if (var2 > 7) {
               this.field887 = var1.method1654();
            }

            if (var2 > 8) {
               this.field885 = var1.method1654() == 1;
            }

            if (var2 > 9) {
               this.field883 = var1.method1658();
            }
         } else {
            this.method506(true);
         }
      } else {
         this.method506(true);
      }

   }

   void method506(boolean var1) {
   }

   class366 method507() {
      class366 var2 = new class366(417, true);
      var2.method1643(10);
      var2.method1643(this.field891 ? 1 : 0);
      var2.method1643(this.field890 ? 1 : 0);
      var2.method1643(this.field892);
      var2.method1643(this.field893.size());
      Iterator var3 = this.field893.entrySet().iterator();

      while(var3.hasNext()) {
         Map.Entry var4 = (Map.Entry)var3.next();
         var2.method1709((Integer)var4.getKey());
         var2.method1709((Integer)var4.getValue());
      }

      var2.method1646(null != this.field884 ? this.field884 : "");
      var2.method1645(this.field882);
      var2.method1643((int)(this.field886 * 100.0));
      var2.method1643(this.field881);
      var2.method1643(this.field888);
      var2.method1643(this.field889);
      var2.method1643(this.field887);
      var2.method1643(this.field885 ? 1 : 0);
      var2.method1709(this.field883);
      return var2;
   }

   void method508(boolean var1) {
      this.field891 = var1;
      method538();
   }

   boolean method509() {
      return this.field891;
   }

   void method530(boolean var1) {
      this.field882 = var1;
      method538();
   }

   boolean method513() {
      return this.field882;
   }

   void method528(boolean var1) {
      this.field890 = var1;
      method538();
   }

   boolean method529() {
      return this.field890;
   }

   void method511(boolean var1) {
      this.field885 = var1;
      method538();
   }

   void method512() {
      this.method511(!this.field885);
   }

   boolean method519() {
      return this.field885;
   }

   void method514(int var1) {
      this.field883 = var1;
      method538();
   }

   int method515() {
      return this.field883;
   }

   void method533(double var1) {
      this.field886 = var1;
      method538();
   }

   double method531() {
      return this.field886;
   }

   void method516(int var1) {
      this.field881 = var1;
      method538();
   }

   int method510() {
      return this.field881;
   }

   void method517(int var1) {
      this.field888 = var1;
      method538();
   }

   int method518() {
      return this.field888;
   }

   void method537(int var1) {
      this.field889 = var1;
      method538();
   }

   int method536() {
      return this.field889;
   }

   void method520(String var1) {
      this.field884 = var1;
      method538();
   }

   String method521() {
      return this.field884;
   }

   void method534(int var1) {
      this.field887 = var1;
      method538();
   }

   int method522() {
      return this.field887;
   }

   void method523(int var1) {
      this.field892 = var1;
      method538();
   }

   int method524() {
      return this.field892;
   }

   void method525(String var1, int var2) {
      int var4 = this.method527(var1);
      if (this.field893.size() >= 10 && !this.field893.containsKey(var4)) {
         Iterator var5 = this.field893.entrySet().iterator();
         var5.next();
         var5.remove();
      }

      this.field893.put(var4, var2);
      method538();
   }

   boolean method526(String var1) {
      int var3 = this.method527(var1);
      return this.field893.containsKey(var3);
   }

   int method532(String var1) {
      int var3 = this.method527(var1);
      return !this.field893.containsKey(var3) ? 0 : (Integer)this.field893.get(var3);
   }

   int method527(String var1) {
      return class447.method2085(var1.toLowerCase());
   }

   static void method538() {
      class390 var1 = null;

      try {
         var1 = class269.method1220("", class376.field2687.field301, true);
         class366 var2 = class158.field1004.method507();
         var1.method1780(var2.field2650, 0, var2.field2652);
      } catch (Exception var4) {
      }

      try {
         if (var1 != null) {
            var1.method1784(true);
         }
      } catch (Exception var3) {
      }

   }

   public static int method535(int var0, byte var1) {
      class272 var2 = class130.method483(var0);
      if (var2 == null) {
         if (var1 == -1) {
            throw new IllegalStateException();
         } else {
            return 2;
         }
      } else {
         byte var10000;
         if (var2.method1280()) {
            if (var1 == -1) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = 1;
         }

         return var10000;
      }
   }
}
