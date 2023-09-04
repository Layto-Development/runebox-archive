public class class532 {
   static final int[] field4174 = new int[2048];
   static final int[] field4175 = new int[2048];

   static {
      double var0 = 0.0030679615757712823;

      for(int var2 = 0; var2 < 2048; ++var2) {
         field4175[var2] = (int)(65536.0 * Math.sin(var0 * (double)var2));
         field4174[var2] = (int)(65536.0 * Math.cos((double)var2 * var0));
      }

   }

   class532() throws Throwable {
   }
}
