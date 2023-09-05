import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class class497 {
   boolean field3928 = false;
   boolean field3931 = false;
   boolean field3936;
   boolean field3937;
   double field3932 = 0.8;
   int field3927 = 127;
   int field3929;
   int field3933 = -1;
   int field3934 = 127;
   int field3935 = 127;
   int field3938 = 1;
   String field3930 = null;
   final Map field3939 = new LinkedHashMap();

   class497() {
      this.method2402(true);
   }

   class497(class184 var1) {
      if (var1 != null && var1.field1816 != null) {
         int var2 = var1.method1125();
         if (var2 >= 0 && var2 <= 10) {
            if (var1.method1125() == 1) {
               this.field3937 = true;
            }

            if (var2 > 1) {
               this.field3936 = var1.method1125() == 1;
            }

            if (var2 > 3) {
               this.field3938 = var1.method1125();
            }

            if (var2 > 2) {
               int var3 = var1.method1125();

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.method1129();
                  int var6 = var1.method1129();
                  this.field3939.put(var5, var6);
               }
            }

            if (var2 > 4) {
               this.field3930 = var1.method1184();
            }

            if (var2 > 5) {
               this.field3928 = var1.method1132();
            }

            if (var2 > 6) {
               this.field3932 = (double)var1.method1125() / 100.0;
               this.field3927 = var1.method1125();
               this.field3934 = var1.method1125();
               this.field3935 = var1.method1125();
            }

            if (var2 > 7) {
               this.field3933 = var1.method1125();
            }

            if (var2 > 8) {
               this.field3931 = var1.method1125() == 1;
            }

            if (var2 > 9) {
               this.field3929 = var1.method1129();
            }
         } else {
            this.method2402(true);
         }
      } else {
         this.method2402(true);
      }

   }

   void method2402(boolean var1) {
   }

   class184 method2403() {
      class184 var2 = new class184(417, true);
      var2.method1114(10);
      var2.method1114(this.field3937 ? 1 : 0);
      var2.method1114(this.field3936 ? 1 : 0);
      var2.method1114(this.field3938);
      var2.method1114(this.field3939.size());
      Iterator var3 = this.field3939.entrySet().iterator();

      while(var3.hasNext()) {
         Map.Entry var4 = (Map.Entry)var3.next();
         var2.writeInt((Integer)var4.getKey());
         var2.writeInt((Integer)var4.getValue());
      }

      var2.method1117(null != this.field3930 ? this.field3930 : "");
      var2.method1116(this.field3928);
      var2.method1114((int)(this.field3932 * 100.0));
      var2.method1114(this.field3927);
      var2.method1114(this.field3934);
      var2.method1114(this.field3935);
      var2.method1114(this.field3933);
      var2.method1114(this.field3931 ? 1 : 0);
      var2.writeInt(this.field3929);
      return var2;
   }

   void method2404(boolean var1) {
      this.field3937 = var1;
      method2434();
   }

   boolean method2405() {
      return this.field3937;
   }

   void method2426(boolean var1) {
      this.field3928 = var1;
      method2434();
   }

   boolean method2409() {
      return this.field3928;
   }

   void method2424(boolean var1) {
      this.field3936 = var1;
      method2434();
   }

   boolean method2425() {
      return this.field3936;
   }

   void method2407(boolean var1) {
      this.field3931 = var1;
      method2434();
   }

   void method2408() {
      this.method2407(!this.field3931);
   }

   boolean method2415() {
      return this.field3931;
   }

   void method2410(int var1) {
      this.field3929 = var1;
      method2434();
   }

   int method2411() {
      return this.field3929;
   }

   void method2429(double var1) {
      this.field3932 = var1;
      method2434();
   }

   double method2427() {
      return this.field3932;
   }

   void method2412(int var1) {
      this.field3927 = var1;
      method2434();
   }

   int method2406() {
      return this.field3927;
   }

   void method2413(int var1) {
      this.field3934 = var1;
      method2434();
   }

   int method2414() {
      return this.field3934;
   }

   void method2433(int var1) {
      this.field3935 = var1;
      method2434();
   }

   int method2432() {
      return this.field3935;
   }

   void method2416(String var1) {
      this.field3930 = var1;
      method2434();
   }

   String method2417() {
      return this.field3930;
   }

   void method2430(int var1) {
      this.field3933 = var1;
      method2434();
   }

   int method2418() {
      return this.field3933;
   }

   void method2419(int var1) {
      this.field3938 = var1;
      method2434();
   }

   int method2420() {
      return this.field3938;
   }

   void method2421(String var1, int var2) {
      int var4 = this.method2423(var1);
      if (this.field3939.size() >= 10 && !this.field3939.containsKey(var4)) {
         Iterator var5 = this.field3939.entrySet().iterator();
         var5.next();
         var5.remove();
      }

      this.field3939.put(var4, var2);
      method2434();
   }

   boolean method2422(String var1) {
      int var3 = this.method2423(var1);
      return this.field3939.containsKey(var3);
   }

   int method2428(String var1) {
      int var3 = this.method2423(var1);
      return !this.field3939.containsKey(var3) ? 0 : (Integer)this.field3939.get(var3);
   }

   int method2423(String var1) {
      return class330.method1738(var1.toLowerCase());
   }

   static void method2434() {
      class472 var1 = null;

      try {
         var1 = class237.method1426("", class521.field4093.field3356, true);
         class184 var2 = class4.field36.method2403();
         var1.method2281(var2.field1816, 0, var2.field1818);
      } catch (Exception var4) {
      }

      try {
         if (var1 != null) {
            var1.method2285(true);
         }
      } catch (Exception var3) {
      }

   }

   public static int method2431(int var0, byte var1) {
      class495 var2 = class217.method1313(var0);
      if (var2 == null) {
         if (var1 == -1) {
            throw new IllegalStateException();
         } else {
            return 2;
         }
      } else {
         byte var10000;
         if (var2.method2399()) {
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
