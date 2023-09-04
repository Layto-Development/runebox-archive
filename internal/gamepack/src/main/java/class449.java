public class class449 extends class306 {
   static class245 field3548 = new class245(64);
   static class509 field3549;
   static int[] field3552;
   public int[][] field3550;
   public Object[][] field3551;

   class449() {
   }

   void method2095(class366 var1) {
      while(true) {
         int var3 = var1.method1654();
         if (var3 == 0) {
            return;
         }

         this.method2096(var1, var3);
      }
   }

   void method2096(class366 var1, int var2) {
      if (var2 == 1) {
         int var4 = var1.method1654();
         if (this.field3550 == null) {
            this.field3550 = new int[var4][];
         }

         for(int var5 = var1.method1654(); var5 != 255; var5 = var1.method1654()) {
            int var6 = var5 & 127;
            boolean var7 = 0 != (var5 & 128);
            int[] var8 = new int[var1.method1654()];

            for(int var9 = 0; var9 < var8.length; ++var9) {
               var8[var9] = var1.method1701();
            }

            this.field3550[var6] = var8;
            if (var7) {
               if (null == this.field3551) {
                  this.field3551 = new Object[this.field3550.length][];
               }

               this.field3551[var6] = class211.method1091(var1, var8);
            }
         }
      }

   }

   void method2097() {
   }

   public static class449 method2098(int var0) {
      class449 var2 = (class449)field3548.method1183((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = field3549.method2422(39, var0);
         var2 = new class449();
         if (var3 != null) {
            var2.method2095(new class366(var3));
         }

         var2.method2097();
         field3548.method1182(var2, (long)var0);
         return var2;
      }
   }

   public static void method2099() {
      field3548.method1180();
   }
}
