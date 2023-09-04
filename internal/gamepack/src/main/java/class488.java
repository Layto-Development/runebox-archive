public class class488 extends class151 {
   static int field3852;
   class447[] field3853;

   class488(class298 var1, class298 var2, int var3, boolean var4) {
      class201 var5 = new class201();
      int var6 = var1.method1655(var3);
      this.field3853 = new class447[var6];
      int[] var7 = var1.method1640(var3);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         byte[] var9 = var1.method1629(var3, var7[var8]);
         class370 var10 = null;
         int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

         for(class370 var12 = (class370)var5.method1236(); null != var12; var12 = (class370)var5.method1238()) {
            if (var12.field2896 == var11) {
               var10 = var12;
               break;
            }
         }

         if (var10 == null) {
            byte[] var13;
            if (var4) {
               var13 = var2.method1637(0, var11);
            } else {
               var13 = var2.method1637(var11, 0);
            }

            var10 = new class370(var11, var13);
            var5.method1240(var10);
         }

         this.field3853[var7[var8]] = new class447(var9, var10);
      }

   }

   public boolean method2381(int var1) {
      return this.field3853[var1].field3402;
   }

   public static class488 method2382(class298 var0, class298 var1, int var2, boolean var3) {
      boolean var5 = true;
      int[] var6 = var0.method1640(var2);

      for(int var7 = 0; var7 < var6.length; ++var7) {
         byte[] var8 = var0.method1637(var2, var6[var7]);
         if (null == var8) {
            var5 = false;
         } else {
            int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
            byte[] var10;
            if (var3) {
               var10 = var1.method1637(0, var9);
            } else {
               var10 = var1.method1637(var9, 0);
            }

            if (null == var10) {
               var5 = false;
            }
         }
      }

      if (!var5) {
         return null;
      } else {
         try {
            return new class488(var0, var1, var2, var3);
         } catch (Exception var11) {
            return null;
         }
      }
   }

   public static void method2380(int var0, int var1) {
      class259 var3 = class259.method1501(var0);
      int var4 = var3.field2276;
      int var5 = var3.field2277;
      int var6 = var3.field2280;
      int var7 = class10.field106[var6 - var5];
      if (var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      class10.field107[var4] = class10.field107[var4] & ~var7 | var1 << var5 & var7;
   }
}
