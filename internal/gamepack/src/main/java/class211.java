public class class211 {
   static final int field1611 = (int)(Math.pow(2.0, 4.0) - 1.0);
   static final int field1612 = (int)(Math.pow(2.0, 8.0) - 1.0);

   class211() throws Throwable {
   }

   public static int method1092(int var0) {
      return var0 >>> 12;
   }

   public static int method1093(int var0) {
      return var0 >>> 4 & field1612;
   }

   public static int method1094(int var0) {
      return (var0 & field1611) - 1;
   }

   static Object[] method1091(class366 var0, int[] var1) {
      int var3 = var0.method1701();
      Object[] var4 = new Object[var3 * var1.length];

      for(int var5 = 0; var5 < var3; ++var5) {
         for(int var6 = 0; var6 < var1.length; ++var6) {
            int var7 = var6 + var1.length * var5;
            class377 var8 = class381.method1758(var1[var6]);
            var4[var7] = var8.method1744(var0);
         }
      }

      return var4;
   }
}
