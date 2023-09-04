public class class454 {
   static final int[] field3555 = new int[16384];
   static final int[] field3556 = new int[16384];

   static {
      double var0 = 3.834951969714103E-4;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field3555[var2] = (int)(16384.0 * Math.sin((double)var2 * var0));
         field3556[var2] = (int)(16384.0 * Math.cos(var0 * (double)var2));
      }

   }

   class454() throws Throwable {
   }

   public static int method2244(int var0, int var1) {
      return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133) & 16383;
   }

   public static int method2243(int var0) {
      return field3555[var0 & 16383];
   }

   public static int method2245(int var0) {
      return field3556[var0 & 16383];
   }
}
