public class class34 {
   static final int[] field306 = new int[16384];
   static final int[] field307 = new int[16384];

   static {
      double var0 = 3.834951969714103E-4;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field306[var2] = (int)(16384.0 * Math.sin((double)var2 * var0));
         field307[var2] = (int)(16384.0 * Math.cos(var0 * (double)var2));
      }

   }

   class34() throws Throwable {
   }

   public static int method147(int var0, int var1) {
      return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133) & 16383;
   }

   public static int method146(int var0) {
      return field306[var0 & 16383];
   }

   public static int method148(int var0) {
      return field307[var0 & 16383];
   }
}
