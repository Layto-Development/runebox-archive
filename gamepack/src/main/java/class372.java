import java.awt.Font;

public final class class372 extends class55 {
   static class201 field2907 = new class201();
   static class22 field2920;
   static int field2904;
   static Font field2919;
   class432 field2912;
   class432 field2916;
   class449 field2917;
   int field2905;
   int field2906;
   int field2908;
   int field2909;
   int field2910;
   int field2911;
   int field2913;
   int field2915;
   int field2918;
   int field2921;
   int[] field2914;

   class372() {
   }

   void method1866() {
      int var2 = this.field2911;
      class449 var3 = this.field2917.method2215();
      if (var3 != null) {
         this.field2911 = var3.field3479;
         this.field2910 = var3.field3480 * 128;
         this.field2915 = var3.field3481;
         this.field2913 = var3.field3482;
         this.field2914 = var3.field3473;
      } else {
         this.field2911 = -1;
         this.field2910 = 0;
         this.field2915 = 0;
         this.field2913 = 0;
         this.field2914 = null;
      }

      if (var2 != this.field2911 && this.field2916 != null) {
         class514.field3985.method1520(this.field2916);
         this.field2916 = null;
      }

   }

   static void method1869() {
      for(class372 var1 = (class372)field2907.method1236(); var1 != null; var1 = (class372)field2907.method1238()) {
         if (null != var1.field2916) {
            class514.field3985.method1520(var1.field2916);
            var1.field2916 = null;
         }

         if (var1.field2912 != null) {
            class514.field3985.method1520(var1.field2912);
            var1.field2912 = null;
         }
      }

      field2907.method1232();
   }

   static void method1868(int var0, int var1, int var2, class449 var3, int var4) {
      class372 var6 = new class372();
      var6.field2905 = var0;
      var6.field2906 = var1 * 128;
      var6.field2918 = var2 * 128;
      int var7 = var3.field3450;
      int var8 = var3.field3435;
      if (var4 == 1 || var4 == 3) {
         var7 = var3.field3435;
         var8 = var3.field3450;
      }

      var6.field2908 = 128 * (var7 + var1);
      var6.field2909 = (var2 + var8) * 128;
      var6.field2911 = var3.field3479;
      var6.field2910 = var3.field3480 * 128;
      var6.field2915 = var3.field3481;
      var6.field2913 = var3.field3482;
      var6.field2914 = var3.field3473;
      if (null != var3.field3476) {
         var6.field2917 = var3;
         var6.method1866();
      }

      field2907.method1240(var6);
      if (null != var6.field2914) {
         var6.field2921 = var6.field2915 + (int)(Math.random() * (double)(var6.field2913 - var6.field2915));
      }

   }

   static void method1867(int var0, int var1, int var2, int var3) {
      for(class372 var5 = (class372)field2907.method1236(); var5 != null; var5 = (class372)field2907.method1238()) {
         if (var5.field2911 != -1 || var5.field2914 != null) {
            int var6 = 0;
            if (var1 > var5.field2908) {
               var6 += var1 - var5.field2908;
            } else if (var1 < var5.field2906) {
               var6 += var5.field2906 - var1;
            }

            if (var2 > var5.field2909) {
               var6 += var2 - var5.field2909;
            } else if (var2 < var5.field2918) {
               var6 += var5.field2918 - var2;
            }

            if (var6 - 64 <= var5.field2910 && class4.field36.method2432() != 0 && var0 == var5.field2905) {
               var6 -= 64;
               if (var6 < 0) {
                  var6 = 0;
               }

               int var7 = (var5.field2910 - var6) * class4.field36.method2432() / var5.field2910;
               if (var5.field2916 == null) {
                  if (var5.field2911 >= 0) {
                     class404 var8 = class404.method1975(class57.field1081, var5.field2911, 0);
                     if (var8 != null) {
                        class408 var9 = var8.method1973().method1981(class519.field4079);
                        class432 var10 = class432.method2105(var9, 100, var7);
                        var10.method2075(-1);
                        class514.field3985.method1525(var10);
                        var5.field2916 = var10;
                     }
                  }
               } else {
                  var5.field2916.method2076(var7);
               }

               if (var5.field2912 == null) {
                  if (null != var5.field2914 && (var5.field2921 -= var3) <= 0) {
                     int var12 = (int)(Math.random() * (double)var5.field2914.length);
                     class404 var13 = class404.method1975(class57.field1081, var5.field2914[var12], 0);
                     if (null != var13) {
                        class408 var14 = var13.method1973().method1981(class519.field4079);
                        class432 var11 = class432.method2105(var14, 100, var7);
                        var11.method2075(0);
                        class514.field3985.method1525(var11);
                        var5.field2912 = var11;
                        var5.field2921 = var5.field2915 + (int)(Math.random() * (double)(var5.field2913 - var5.field2915));
                     }
                  }
               } else {
                  var5.field2912.method2076(var7);
                  if (!var5.field2912.method606()) {
                     var5.field2912 = null;
                  }
               }
            } else {
               if (null != var5.field2916) {
                  class514.field3985.method1520(var5.field2916);
                  var5.field2916 = null;
               }

               if (var5.field2912 != null) {
                  class514.field3985.method1520(var5.field2912);
                  var5.field2912 = null;
               }
            }
         }
      }

   }
}
