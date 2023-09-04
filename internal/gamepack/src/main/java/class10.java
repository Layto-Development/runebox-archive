public class class10 {
   public static int[] field107;
   public static int[] field109;
   static int[] field106 = new int[32];
   static int[] field108;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field106[var1] = var0 - 1;
         var0 += var0;
      }

      field109 = new int[4000];
      field107 = new int[4000];
   }

   class10() throws Throwable {
   }

   public static int method123(int var0) {
      class259 var2 = class259.method1501(var0);
      int var3 = var2.field2276;
      int var4 = var2.field2277;
      int var5 = var2.field2280;
      int var6 = field106[var5 - var4];
      return field107[var3] >> var4 & var6;
   }
}
