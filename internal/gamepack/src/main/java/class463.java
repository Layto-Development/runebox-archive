public class class463 {
   static final int field3593 = (int)(Math.pow(2.0, 4.0) - 1.0);
   static final int field3594 = (int)(Math.pow(2.0, 8.0) - 1.0);

   class463() throws Throwable {
   }

   public static int method2264(int var0) {
      return var0 >>> 12;
   }

   public static int method2265(int var0) {
      return var0 >>> 4 & field3594;
   }

   public static int method2266(int var0) {
      return (var0 & field3593) - 1;
   }

   static Object[] method2263(class184 var0, int[] var1) {
      int var3 = var0.method1172();
      Object[] var4 = new Object[var3 * var1.length];

      for(int var5 = 0; var5 < var3; ++var5) {
         for(int var6 = 0; var6 < var1.length; ++var6) {
            int var7 = var6 + var1.length * var5;
            class247 var8 = class302.method1662(var1[var6]);
            var4[var7] = var8.method1449(var0);
         }
      }

      return var4;
   }
}
