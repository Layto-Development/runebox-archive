public abstract class class308 {
   class308() {
   }

   public abstract int method1672(int var1, int var2);

   public abstract void method1671();

   public static double[] method1673(double var0, double var2, int var4) {
      int var6 = var4 * 2 + 1;
      double[] var7 = new double[var6];
      int var8 = -var4;

      for(int var9 = 0; var8 <= var4; ++var9) {
         double var16 = ((double)var8 - var0) / var2;
         double var14 = Math.exp(-var16 * var16 / 2.0) / Math.sqrt(6.283185307179586);
         double var12 = var14 / var2;
         var7[var9] = var12;
         ++var8;
      }

      return var7;
   }
}
