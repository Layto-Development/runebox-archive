public class class492 extends class306 {
   static int field3936;
   class533[] field3937;

   class492(class509 var1, class509 var2, int var3, boolean var4) {
      class429 var5 = new class429();
      int var6 = var1.method2448(var3);
      this.field3937 = new class533[var6];
      int[] var7 = var1.method2433(var3);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         byte[] var9 = var1.method2422(var3, var7[var8]);
         class344 var10 = null;
         int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

         for(class344 var12 = (class344)var5.method1991(); null != var12; var12 = (class344)var5.method1993()) {
            if (var12.field2558 == var11) {
               var10 = var12;
               break;
            }
         }

         if (var10 == null) {
            byte[] var13;
            if (var4) {
               var13 = var2.method2430(0, var11);
            } else {
               var13 = var2.method2430(var11, 0);
            }

            var10 = new class344(var11, var13);
            var5.method1995(var10);
         }

         this.field3937[var7[var8]] = new class533(var9, var10);
      }

   }

   public boolean method2329(int var1) {
      return this.field3937[var1].field4224;
   }

   public static class492 method2330(class509 var0, class509 var1, int var2, boolean var3) {
      boolean var5 = true;
      int[] var6 = var0.method2433(var2);

      for(int var7 = 0; var7 < var6.length; ++var7) {
         byte[] var8 = var0.method2430(var2, var6[var7]);
         if (null == var8) {
            var5 = false;
         } else {
            int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
            byte[] var10;
            if (var3) {
               var10 = var1.method2430(0, var9);
            } else {
               var10 = var1.method2430(var9, 0);
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
            return new class492(var0, var1, var2, var3);
         } catch (Exception var11) {
            return null;
         }
      }
   }

   public static void method2328(int var0, int var1) {
      class266 var3 = class266.method1215(var0);
      int var4 = var3.field1869;
      int var5 = var3.field1870;
      int var6 = var3.field1873;
      int var7 = class486.field3906[var6 - var5];
      if (var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      class486.field3907[var4] = class486.field3907[var4] & ~var7 | var1 << var5 & var7;
   }
}
