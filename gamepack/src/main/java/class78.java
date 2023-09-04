public class class78 extends class55 {
   static class425 field1243;
   static class79 field1242 = new class79(32);
   int[] field1240 = new int[]{0};
   int[] field1241 = new int[]{-1};

   class78() {
   }

   static int method704(int var0, int var1) {
      class78 var3 = (class78)field1242.method709((long)var0);
      if (null == var3) {
         return -1;
      } else {
         return var1 >= 0 && var1 < var3.field1241.length ? var3.field1241[var1] : -1;
      }
   }

   static int method703(int var0, int var1) {
      class78 var3 = (class78)field1242.method709((long)var0);
      if (null == var3) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var3.field1240.length ? var3.field1240[var1] : 0;
      }
   }

   static int method705(int var0, int var1) {
      class78 var3 = (class78)field1242.method709((long)var0);
      if (null == var3) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var4 = 0;

         for(int var5 = 0; var5 < var3.field1240.length; ++var5) {
            if (var1 == var3.field1241[var5]) {
               var4 += var3.field1240[var5];
            }
         }

         return var4;
      }
   }

   static void method707(int var0, int var1, int var2, int var3) {
      class78 var5 = (class78)field1242.method709((long)var0);
      if (var5 == null) {
         var5 = new class78();
         field1242.method712(var5, (long)var0);
      }

      if (var5.field1241.length <= var1) {
         int[] var6 = new int[var1 + 1];
         int[] var7 = new int[var1 + 1];

         int var8;
         for(var8 = 0; var8 < var5.field1241.length; ++var8) {
            var6[var8] = var5.field1241[var8];
            var7[var8] = var5.field1240[var8];
         }

         for(var8 = var5.field1241.length; var8 < var1; ++var8) {
            var6[var8] = -1;
            var7[var8] = 0;
         }

         var5.field1241 = var6;
         var5.field1240 = var7;
      }

      var5.field1241[var1] = var2;
      var5.field1240[var1] = var3;
   }

   public static void method700() {
      class293.field2472.clear();
   }

   static void method702(int var0) {
      class78 var2 = (class78)field1242.method709((long)var0);
      if (var2 != null) {
         for(int var3 = 0; var3 < var2.field1241.length; ++var3) {
            var2.field1241[var3] = -1;
            var2.field1240[var3] = 0;
         }

      }
   }

   static void method701(int var0) {
      class78 var2 = (class78)field1242.method709((long)var0);
      if (null != var2) {
         var2.method605();
      }
   }

   static void method706() {
      field1242 = new class79(32);
   }
}
