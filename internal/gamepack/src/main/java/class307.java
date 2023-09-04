import java.awt.Font;

public final class class307 extends class70 {
   static class429 field2073 = new class429();
   static class534 field2086;
   static int field2070;
   static Font field2085;
   class271 field2078;
   class271 field2082;
   class458 field2083;
   int field2071;
   int field2072;
   int field2074;
   int field2075;
   int field2076;
   int field2077;
   int field2079;
   int field2081;
   int field2084;
   int field2087;
   int[] field2080;

   class307() {
   }

   void method1407() {
      int var2 = this.field2077;
      class458 var3 = this.field2083.method2155();
      if (var3 != null) {
         this.field2077 = var3.field3639;
         this.field2076 = var3.field3640 * 128;
         this.field2081 = var3.field3641;
         this.field2079 = var3.field3642;
         this.field2080 = var3.field3633;
      } else {
         this.field2077 = -1;
         this.field2076 = 0;
         this.field2081 = 0;
         this.field2079 = 0;
         this.field2080 = null;
      }

      if (var2 != this.field2077 && this.field2082 != null) {
         class262.field1860.method576(this.field2082);
         this.field2082 = null;
      }

   }

   static void method1410() {
      for(class307 var1 = (class307)field2073.method1991(); var1 != null; var1 = (class307)field2073.method1993()) {
         if (null != var1.field2082) {
            class262.field1860.method576(var1.field2082);
            var1.field2082 = null;
         }

         if (var1.field2078 != null) {
            class262.field1860.method576(var1.field2078);
            var1.field2078 = null;
         }
      }

      field2073.method1987();
   }

   static void method1409(int var0, int var1, int var2, class458 var3, int var4) {
      class307 var6 = new class307();
      var6.field2071 = var0;
      var6.field2072 = var1 * 128;
      var6.field2084 = var2 * 128;
      int var7 = var3.field3610;
      int var8 = var3.field3595;
      if (var4 == 1 || var4 == 3) {
         var7 = var3.field3595;
         var8 = var3.field3610;
      }

      var6.field2074 = 128 * (var7 + var1);
      var6.field2075 = (var2 + var8) * 128;
      var6.field2077 = var3.field3639;
      var6.field2076 = var3.field3640 * 128;
      var6.field2081 = var3.field3641;
      var6.field2079 = var3.field3642;
      var6.field2080 = var3.field3633;
      if (null != var3.field3636) {
         var6.field2083 = var3;
         var6.method1407();
      }

      field2073.method1995(var6);
      if (null != var6.field2080) {
         var6.field2087 = var6.field2081 + (int)(Math.random() * (double)(var6.field2079 - var6.field2081));
      }

   }

   static void method1408(int var0, int var1, int var2, int var3) {
      for(class307 var5 = (class307)field2073.method1991(); var5 != null; var5 = (class307)field2073.method1993()) {
         if (var5.field2077 != -1 || var5.field2080 != null) {
            int var6 = 0;
            if (var1 > var5.field2074) {
               var6 += var1 - var5.field2074;
            } else if (var1 < var5.field2072) {
               var6 += var5.field2072 - var1;
            }

            if (var2 > var5.field2075) {
               var6 += var2 - var5.field2075;
            } else if (var2 < var5.field2084) {
               var6 += var5.field2084 - var2;
            }

            if (var6 - 64 <= var5.field2076 && class158.field1004.method536() != 0 && var0 == var5.field2071) {
               var6 -= 64;
               if (var6 < 0) {
                  var6 = 0;
               }

               int var7 = (var5.field2076 - var6) * class158.field1004.method536() / var5.field2076;
               if (var5.field2082 == null) {
                  if (var5.field2077 >= 0) {
                     class314 var8 = class314.method1437(class150.field960, var5.field2077, 0);
                     if (var8 != null) {
                        class404 var9 = var8.method1435().method1829(class193.field1516);
                        class271 var10 = class271.method1266(var9, 100, var7);
                        var10.method1232(-1);
                        class262.field1860.method586(var10);
                        var5.field2082 = var10;
                     }
                  }
               } else {
                  var5.field2082.method1233(var7);
               }

               if (var5.field2078 == null) {
                  if (null != var5.field2080 && (var5.field2087 -= var3) <= 0) {
                     int var12 = (int)(Math.random() * (double)var5.field2080.length);
                     class314 var13 = class314.method1437(class150.field960, var5.field2080[var12], 0);
                     if (null != var13) {
                        class404 var14 = var13.method1435().method1829(class193.field1516);
                        class271 var11 = class271.method1266(var14, 100, var7);
                        var11.method1232(0);
                        class262.field1860.method586(var11);
                        var5.field2078 = var11;
                        var5.field2087 = var5.field2081 + (int)(Math.random() * (double)(var5.field2079 - var5.field2081));
                     }
                  }
               } else {
                  var5.field2078.method1233(var7);
                  if (!var5.field2078.method296()) {
                     var5.field2078 = null;
                  }
               }
            } else {
               if (null != var5.field2082) {
                  class262.field1860.method576(var5.field2082);
                  var5.field2082 = null;
               }

               if (var5.field2078 != null) {
                  class262.field1860.method576(var5.field2078);
                  var5.field2078 = null;
               }
            }
         }
      }

   }
}
