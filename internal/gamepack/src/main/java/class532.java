public class class532 extends class70 {
   static class313 field4212 = new class313(32);
   static class501 field4213;
   int[] field4210 = new int[]{0};
   int[] field4211 = new int[]{-1};

   class532() {
   }

   static int method2522(int var0, int var1) {
      class532 var3 = (class532)field4212.method1431((long)var0);
      if (null == var3) {
         return -1;
      } else {
         return var1 >= 0 && var1 < var3.field4211.length ? var3.field4211[var1] : -1;
      }
   }

   static int method2521(int var0, int var1) {
      class532 var3 = (class532)field4212.method1431((long)var0);
      if (null == var3) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var3.field4210.length ? var3.field4210[var1] : 0;
      }
   }

   static int method2523(int var0, int var1) {
      class532 var3 = (class532)field4212.method1431((long)var0);
      if (null == var3) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var4 = 0;

         for(int var5 = 0; var5 < var3.field4210.length; ++var5) {
            if (var1 == var3.field4211[var5]) {
               var4 += var3.field4210[var5];
            }
         }

         return var4;
      }
   }

   static void method2525(int var0, int var1, int var2, int var3) {
      class532 var5 = (class532)field4212.method1431((long)var0);
      if (var5 == null) {
         var5 = new class532();
         field4212.method1434(var5, (long)var0);
      }

      if (var5.field4211.length <= var1) {
         int[] var6 = new int[var1 + 1];
         int[] var7 = new int[var1 + 1];

         int var8;
         for(var8 = 0; var8 < var5.field4211.length; ++var8) {
            var6[var8] = var5.field4211[var8];
            var7[var8] = var5.field4210[var8];
         }

         for(var8 = var5.field4211.length; var8 < var1; ++var8) {
            var6[var8] = -1;
            var7[var8] = 0;
         }

         var5.field4211 = var6;
         var5.field4210 = var7;
      }

      var5.field4211[var1] = var2;
      var5.field4210[var1] = var3;
   }

   public static void method2518() {
      class348.field2567.clear();
   }

   static void method2520(int var0) {
      class532 var2 = (class532)field4212.method1431((long)var0);
      if (var2 != null) {
         for(int var3 = 0; var3 < var2.field4211.length; ++var3) {
            var2.field4211[var3] = -1;
            var2.field4210[var3] = 0;
         }

      }
   }

   static void method2519(int var0) {
      class532 var2 = (class532)field4212.method1431((long)var0);
      if (null != var2) {
         var2.method295();
      }
   }

   static void method2524() {
      field4212 = new class313(32);
   }
}
