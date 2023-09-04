public class class537 extends class306 {
   static class245 field4278 = new class245(64);
   static class509 field4279;
   int[][] field4280;
   Object[][] field4282;
   public int field4281 = -1;

   class537() {
   }

   void method2577(class366 var1) {
      while(true) {
         int var3 = var1.method1654();
         if (var3 == 0) {
            return;
         }

         this.method2574(var1, var3);
      }
   }

   public Object[] method2576(int var1) {
      return null == this.field4282 ? null : this.field4282[var1];
   }

   void method2574(class366 var1, int var2) {
      if (var2 == 3) {
         int var4 = var1.method1654();
         if (null == this.field4282) {
            this.field4282 = new Object[var4][];
            this.field4280 = new int[var4][];
         }

         for(int var5 = var1.method1654(); var5 != 255; var5 = var1.method1654()) {
            int var6 = var1.method1654();
            int[] var7 = new int[var6];

            for(int var8 = 0; var8 < var6; ++var8) {
               var7[var8] = var1.method1701();
            }

            this.field4282[var5] = class211.method1091(var1, var7);
            this.field4280[var5] = var7;
         }
      } else if (var2 == 4) {
         this.field4281 = var1.method1670();
      }

   }

   void method2575() {
   }

   public static void method2580(class509 var0) {
      field4279 = var0;
   }

   public static class537 method2579(int var0) {
      class537 var2 = (class537)field4278.method1183((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = field4279.method2422(38, var0);
         var2 = new class537();
         if (null != var3) {
            var2.method2577(new class366(var3));
         }

         var2.method2575();
         field4278.method1182(var2, (long)var0);
         return var2;
      }
   }

   public static void method2578() {
      field4278.method1180();
   }
}
