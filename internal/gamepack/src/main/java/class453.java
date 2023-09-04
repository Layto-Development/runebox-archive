public class class453 {
   static class4 field3576;

   class453() throws Throwable {
   }

   public static void method2108(class4 var0) {
      field3576 = var0;
   }

   public static int method2110(class366 var0, String var1) {
      int var3 = var0.field2652;
      byte[] var4 = class459.method2163(var1);
      var0.method1698(var4.length);
      var0.field2652 += field3576.method8(var4, 0, var4.length, var0.field2650, var0.field2652);
      return var0.field2652 - var3;
   }

   public static String method2111(class366 var0) {
      return method2109(var0, 32767);
   }

   static String method2109(class366 var0, int var1) {
      try {
         int var3 = var0.method1701();
         if (var3 > var1) {
            var3 = var1;
         }

         byte[] var4 = new byte[var3];
         var0.field2652 += field3576.method9(var0.field2650, var0.field2652, var4, 0, var3);
         String var5 = class459.method2165(var4, 0, var3);
         return var5;
      } catch (Exception var6) {
         return "Cabbage";
      }
   }
}
