public class class59 {
   static final int[] field470 = new int[2048];
   static final int[] field471 = new int[2048];

   static {
      double var0 = 0.0030679615757712823;

      for(int var2 = 0; var2 < 2048; ++var2) {
         field471[var2] = (int)(65536.0 * Math.sin(var0 * (double)var2));
         field470[var2] = (int)(65536.0 * Math.cos((double)var2 * var0));
      }

   }

   class59() throws Throwable {
   }
}
