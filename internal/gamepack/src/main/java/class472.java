public class class472 {
   public static int[] field3745 = new int[99];
   public static final boolean[] field3743 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
   static class501 field3744;

   static {
      int var0 = 0;

      for(int var1 = 0; var1 < 99; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0 * Math.pow(2.0, (double)var2 / 7.0));
         var0 += var3;
         field3745[var1] = var0 / 4;
      }

   }

   class472() throws Throwable {
   }
}
