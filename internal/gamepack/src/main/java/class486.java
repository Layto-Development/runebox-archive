public class class486 {
   public static int[] field3907;
   public static int[] field3909;
   static int[] field3906 = new int[32];
   static int[] field3908;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field3906[var1] = var0 - 1;
         var0 += var0;
      }

      field3909 = new int[4000];
      field3907 = new int[4000];
   }

   class486() throws Throwable {
   }

   public static int method2324(int var0) {
      class266 var2 = class266.method1215(var0);
      int var3 = var2.field1869;
      int var4 = var2.field1870;
      int var5 = var2.field1873;
      int var6 = field3906[var5 - var4];
      return field3907[var3] >> var4 & var6;
   }
}
