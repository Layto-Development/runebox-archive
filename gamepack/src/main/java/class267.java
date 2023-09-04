public class class267 extends class124 {
   static class425[] field2301;
   static String field2298;
   class201 field2302 = new class201();
   class272 field2300 = new class272();
   class448 field2299;

   class267(class448 var1) {
      this.field2299 = var1;
   }

   protected class124 method866() {
      class280 var1 = (class280)this.field2302.method1236();
      if (var1 == null) {
         return null;
      } else {
         return (class124)(var1.field2396 != null ? var1.field2396 : this.method867());
      }
   }

   protected class124 method867() {
      class280 var1;
      do {
         var1 = (class280)this.field2302.method1238();
         if (var1 == null) {
            return null;
         }
      } while(null == var1.field2396);

      return var1.field2396;
   }

   protected int method864() {
      return 0;
   }

   protected void method869(int[] var1, int var2, int var3) {
      this.field2300.method869(var1, var2, var3);

      for(class280 var6 = (class280)this.field2302.method1236(); null != var6; var6 = (class280)this.field2302.method1238()) {
         if (!this.field2299.method2206(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.field2407) {
                  this.method1510(var6, var1, var4, var5, var5 + var4);
                  var6.field2407 -= var5;
                  break;
               }

               this.method1510(var6, var1, var4, var6.field2407, var4 + var5);
               var4 += var6.field2407;
               var5 -= var6.field2407;
            } while(!this.field2299.method2197(var6, var1, var4, var5));
         }
      }

   }

   protected void method868(int var1) {
      this.field2300.method868(var1);

      for(class280 var3 = (class280)this.field2302.method1236(); var3 != null; var3 = (class280)this.field2302.method1238()) {
         if (!this.field2299.method2206(var3)) {
            int var2 = var1;

            do {
               if (var2 <= var3.field2407) {
                  this.method1511(var3, var2);
                  var3.field2407 -= var2;
                  break;
               }

               this.method1511(var3, var3.field2407);
               var2 -= var3.field2407;
            } while(!this.field2299.method2197(var3, (int[])null, 0, var2));
         }
      }

   }

   void method1510(class280 var1, int[] var2, int var3, int var4, int var5) {
      if ((this.field2299.field3403[var1.field2398] & 4) != 0 && var1.field2402 < 0) {
         int var7 = this.field2299.field3430[var1.field2398] / class331.field2655;

         while(true) {
            int var8 = (var7 + 1048575 - var1.field2408) / var7;
            if (var8 > var4) {
               var1.field2408 += var7 * var4;
               break;
            }

            var1.field2396.method869(var2, var3, var8);
            var3 += var8;
            var4 -= var8;
            var1.field2408 += var8 * var7 - 1048576;
            int var9 = class331.field2655 / 100;
            int var10 = 262144 / var7;
            if (var10 < var9) {
               var9 = var10;
            }

            class432 var11 = var1.field2396;
            if (this.field2299.field3405[var1.field2398] == 0) {
               var1.field2396 = class432.method2074(var1.field2390, var11.method2084(), var11.method2078(), var11.method2079());
            } else {
               var1.field2396 = class432.method2074(var1.field2390, var11.method2084(), 0, var11.method2079());
               this.field2299.method2193(var1, var1.field2389.field2317[var1.field2393] < 0);
               var1.field2396.method2103(var9, var11.method2078());
            }

            if (var1.field2389.field2317[var1.field2393] < 0) {
               var1.field2396.method2075(-1);
            }

            var11.method2082(var9);
            var11.method869(var2, var3, var5 - var3);
            if (var11.method2086()) {
               this.field2300.method1525(var11);
            }
         }
      }

      var1.field2396.method869(var2, var3, var4);
   }

   void method1511(class280 var1, int var2) {
      if ((this.field2299.field3403[var1.field2398] & 4) != 0 && var1.field2402 < 0) {
         int var4 = this.field2299.field3430[var1.field2398] / class331.field2655;
         int var5 = (var4 + 1048575 - var1.field2408) / var4;
         var1.field2408 = var2 * var4 + var1.field2408 & 1048575;
         if (var5 <= var2) {
            if (this.field2299.field3405[var1.field2398] == 0) {
               var1.field2396 = class432.method2074(var1.field2390, var1.field2396.method2084(), var1.field2396.method2078(), var1.field2396.method2079());
            } else {
               var1.field2396 = class432.method2074(var1.field2390, var1.field2396.method2084(), 0, var1.field2396.method2079());
               this.field2299.method2193(var1, var1.field2389.field2317[var1.field2393] < 0);
            }

            if (var1.field2389.field2317[var1.field2393] < 0) {
               var1.field2396.method2075(-1);
            }

            var2 = var1.field2408 / var4;
         }
      }

      var1.field2396.method868(var2);
   }
}
