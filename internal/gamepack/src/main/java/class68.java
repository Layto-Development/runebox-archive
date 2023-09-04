public class class68 {
   static class173 field1129;

   class68() throws Throwable {
   }

   public static void method651(class173 var0) {
      field1129 = var0;
   }

   public static int method653(class184 var0, String var1) {
      int var3 = var0.field1818;
      byte[] var4 = class162.method993(var1);
      var0.method1169(var4.length);
      var0.field1818 += field1129.method1024(var4, 0, var4.length, var0.field1816, var0.field1818);
      return var0.field1818 - var3;
   }

   public static String method654(class184 var0) {
      return method652(var0, 32767);
   }

   static String method652(class184 var0, int var1) {
      try {
         int var3 = var0.method1172();
         if (var3 > var1) {
            var3 = var1;
         }

         byte[] var4 = new byte[var3];
         var0.field1818 += field1129.method1025(var0.field1816, var0.field1818, var4, 0, var3);
         String var5 = class162.method995(var4, 0, var3);
         return var5;
      } catch (Exception var6) {
         return "Cabbage";
      }
   }
}
